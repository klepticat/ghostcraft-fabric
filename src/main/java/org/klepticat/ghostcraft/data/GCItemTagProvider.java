package org.klepticat.ghostcraft.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

import static org.klepticat.ghostcraft.GCItems.*;

public class GCItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public GCItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture, @Nullable BlockTagProvider blockTagProvider) {
        super(output, completableFuture, blockTagProvider);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        Item[] NECKLACES = NECKLACE_SET.toArray(new Item[0]);
        Item[] RINGS = RING_SET.toArray(new Item[0]);
        Item[] BRACELETS = BRACELET_SET.toArray(new Item[0]);

        getOrCreateTagBuilder(TagKey.of(Registries.ITEM.getKey(), Identifier.of("trinkets", "chest/necklace")))
                .add(NECKLACES);

        getOrCreateTagBuilder(TagKey.of(Registries.ITEM.getKey(), Identifier.of("trinkets", "hand/ring")))
                .add(RINGS);

        getOrCreateTagBuilder(TagKey.of(Registries.ITEM.getKey(), Identifier.of("trinkets", "offhand/ring")))
                .add(RINGS);

        getOrCreateTagBuilder(TagKey.of(Registries.ITEM.getKey(), Identifier.of("trinkets", "hand/glove")))
                .add(BRACELETS);

        getOrCreateTagBuilder(TagKey.of(Registries.ITEM.getKey(), Identifier.of("trinkets", "offhand/glove")))
                .add(BRACELETS);
    }
}
