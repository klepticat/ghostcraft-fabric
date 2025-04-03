package org.klepticat.ghostcraft.gui.screen;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.texture.TextureManager;
import net.minecraft.client.toast.SystemToast;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import org.joml.Vector2i;
import org.klepticat.ghostcraft.GCRegistries;
import org.klepticat.ghostcraft.GhostCraft;
import org.klepticat.ghostcraft.entity.GCPlayerEntityStickers;
import org.klepticat.ghostcraft.stickers.Sticker;

import java.util.List;
import java.util.Optional;

import static org.klepticat.ghostcraft.GhostCraft.MOD_ID;

public class StickerSelectScreen extends Screen {
    private static final Identifier BACKGROUND = Identifier.of(MOD_ID, "textures/gui/sticker_select.png");
    private static final Identifier SCROLLER_TEXTURE = Identifier.ofVanilla("container/creative_inventory/scroller");
    private static final int BACKGROUND_WIDTH = 195;
    private static final int BACKGROUND_HEIGHT = 132;
    private static final int SCROLLER_WIDTH = 12;
    private static final int SCROLLER_HEIGHT = 15;

    private float scroll;
    private boolean scrolling;

    private int x;
    private int y;

    private final List<Sticker> stickers = GCRegistries.STICKERS.stream().filter(Sticker::isShowInMenu).toList();

    public StickerSelectScreen(Text title) {
        super(title);
    }

    @Override
    protected void init() {
        super.init();

        this.x = (this.width - BACKGROUND_WIDTH) / 2;
        this.y = (this.height - BACKGROUND_HEIGHT) / 2;
    }

    @Override
    public void render(DrawContext drawContext, int mouseX, int mouseY, float delta) {
        super.render(drawContext, mouseX, mouseY, delta);

        Optional<Vector2i> slotCoordsOptional = mouseToSlotCoords(mouseX, mouseY);

        for (int i = 0; i < stickers.size(); i++) {
            drawContext.getMatrices().push();
            drawContext.getMatrices().translate(x + 9, y + 18, 0);
            drawContext.getMatrices().translate(i * 18, 0, 0);
            drawContext.getMatrices().scale(0.03125f, 0.03125f, 1);
            drawContext.drawTexture(stickers.get(i).getTexture(), 0, 0, 0, 0, 512, 512, 512, 512);
            drawContext.getMatrices().pop();
        }

        if (slotCoordsOptional.isPresent() && slotNumberFromCoords(slotCoordsOptional.get()) < stickers.size()) {
            int startX = ((slotCoordsOptional.get().x) * 18) + 9 + this.x;
            int startY = ((slotCoordsOptional.get().y - 1) * 18) + 18 + this.y;
            drawContext.fillGradient(RenderLayer.getGuiOverlay(), startX, startY, startX + 16, startY + 16, -2130706433, -2130706433, -1);
        }

        drawContext.drawText(this.textRenderer, "Sticker Selector Test", 40, 40 - this.textRenderer.fontHeight - 10, 0xFFFFFFFF, true);
    }

    @Override
    public void renderBackground(DrawContext drawContext, int mouseX, int mouseY, float delta) {
        this.renderInGameBackground(drawContext);
        drawBackground(drawContext, mouseX, mouseY, delta);
    }

    public void drawBackground(DrawContext drawContext, int mouseX, int mouseY, float delta) {
        drawContext.drawTexture(BACKGROUND, this.x, this.y, 0, 0, BACKGROUND_WIDTH, BACKGROUND_HEIGHT);
        drawContext.drawGuiTexture(SCROLLER_TEXTURE, this.x + 175, (int) (this.y + 18 + ((106 - SCROLLER_HEIGHT) * this.scroll)), 12, 15);
    }

    public Optional<Vector2i> mouseToSlotCoords(double mouseX, double mouseY) {
        double relativeMouseX = mouseX - this.x;
        double relativeMouseY = mouseY - this.y;

        if (9 < relativeMouseX && relativeMouseX < 170 && 18 < relativeMouseY && relativeMouseY < 125) {
            return Optional.of(new Vector2i((int) Math.floor((relativeMouseX - 9) / 18), (int) Math.floor((relativeMouseY + 1) / 18)));
        } else return Optional.empty();
    }

    public int slotNumberFromCoords(Vector2i slotCoords) {
        return slotCoords.x + (slotCoords.y - 1) * 9;
    }

    @Override
    public boolean mouseClicked(double mouseX, double mouseY, int button) {
        double relativeMouseX = mouseX - this.x;
        double relativeMouseY = mouseY - this.y;

        if (button == 0) {
            if (this.isClickInScrollbar(relativeMouseX, relativeMouseY)) {
                this.scrolling = true;
                return true;
            } else if (mouseToSlotCoords(mouseX, mouseY).isPresent() && slotNumberFromCoords(mouseToSlotCoords(mouseX, mouseY).get()) < stickers.size()) {
                assert this.client != null;
                assert this.client.player != null;
                ((GCPlayerEntityStickers) this.client.player).setSelectedSticker(stickers.get(slotNumberFromCoords(mouseToSlotCoords(mouseX, mouseY).get())));
                this.close();
            }
        }

        return super.mouseClicked(mouseX, mouseY, button);
    }

    @Override
    public boolean mouseDragged(double mouseX, double mouseY, int button, double deltaX, double deltaY) {
        if (this.scrolling) {
            int i = this.y + 18;
            int j = i + 106;
            this.scroll = ((float) mouseY - (float) i - 7.5F) / ((float) (j - i) - 15.0F);
            this.scroll = MathHelper.clamp(this.scroll, 0.0F, 1.0F);
            return true;
        } else {
            return super.mouseDragged(mouseX, mouseY, button, deltaX, deltaY);
        }
    }

    @Override
    public boolean mouseReleased(double mouseX, double mouseY, int button) {
        if (button == 0) {
            this.scrolling = false;
        }

        return super.mouseReleased(mouseX, mouseY, button);
    }

    private boolean isClickInScrollbar(double mouseX, double mouseY) {
        return (175 < mouseX && mouseX < 175 + 12) && (18 < mouseY && mouseY < 18 + 106);
    }

    @Override
    public boolean shouldPause() {
        return false;
    }
}
