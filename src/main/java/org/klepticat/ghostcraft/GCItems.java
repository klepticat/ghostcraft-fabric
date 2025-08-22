package org.klepticat.ghostcraft;

import dev.emi.trinkets.api.TrinketItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.tag.InstrumentTags;
import net.minecraft.util.Identifier;
import org.klepticat.ghostcraft.item.*;
import org.klepticat.ghostcraft.util.types.TotemData;

import java.util.HashSet;

import static org.klepticat.ghostcraft.GhostCraft.LOGGER;
import static org.klepticat.ghostcraft.GhostCraft.MOD_ID;

/**
 * @noinspection unused
 */
public class GCItems {
    // WEAPONS

    //<editor-fold desc="ArcherItems">
    /**
     * @noinspection unused
     */
    static class ArcherItems {
        public static void initialize() {
        }

        public static final Item ASSASSINS_CROSSBOW = register("assassins_crossbow", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNIQUE)));
        public static final Item ATLLANTRIUS_POST = register("atllantrius_post", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)));
        public static final Item AZALEAS_FURY = register("azaleas_fury", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)));
        public static final Item BANANA_BOW = register("banana_bow", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.COMMON)));
        public static final Item BLIZZARD_SHOOTER = register("blizzard_shooter", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)));
        public static final Item BLOSSOM_BOW = register("blossom_bow", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNIQUE)));
        public static final Item BLUNDERBUSS = register("blunderbuss", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.COMMON)));
        public static final Item BOLT_SHOOTER = register("bolt_shooter", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)));
        public static final Item BONE_CHILL_BOW = register("bone_chill_bow", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)));
        public static final Item BOW_OF_FLAMES = register("bow_of_flames", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)));
        public static final Item BOW_OF_GALES = register("bow_of_gales", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)));
        public static final Item BOW_OF_THE_FJORD = register("bow_of_the_fjord", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)));
        public static final Item CANDLEKEEPERS_BOW = register("candlekeepers_bow", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)));
        public static final Item CANDY_BOW = register("candy_bow", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNIQUE)));
        public static final Item CHARMS_REQUIME = register("charms_requime", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)));
        public static final Item CHRONOS_BOW = register("chronos_bow", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)));
        public static final Item CIPHER_BOW = register("cipher_bow", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNIQUE)));
        public static final Item COGWORK_SHARP_SHOOTER = register("cogwork_sharp_shooter", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)));
        public static final Item CROSSBOW_OF_THE_DAMNED = register("crossbow_of_the_damned", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)));
        public static final Item DARK_ECHO = register("dark_echo", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)));
        public static final Item DEATHS_GRASP = register("deaths_grasp", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)));
        public static final Item DEVILS_MARK = register("devils_mark", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)));
        public static final Item ELTORVURIA_BOW = register("eltorvuria_bow", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.LEGENDARY)));
        public static final Item ELVURS_WRATH = register("elvurs_wrath", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.LEGENDARY)));
        public static final Item FEATHERED_BOW = register("feathered_bow", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)));
        public static final Item FERNS_FURY = register("ferns_fury", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)));
        public static final Item FOSSILIZED_BOW = register("fossilized_bow", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)));
        public static final Item FROSTMOURN_BOW = register("frostmourn_bow", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)));
        public static final Item GEOMANCERS_BOW = register("geomancers_bow", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)));
        public static final Item GHASTLY_BOW = register("ghastly_bow", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)));
        public static final Item GOLDEN_BOW = register("golden_bow", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)));
        public static final Item GOLDEN_DRAWSTRING = register("golden_drawstring", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)));
        public static final Item HARP = register("harp", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)));
        public static final Item HEAVY_CROSSBOW = register("heavy_crossbow", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.COMMON)));
        public static final Item HEROS_BOW = register("heros_bow", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)));
        public static final Item ICICLE_SHOOTER = register("icicle_shooter", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)));
        public static final Item IRONHOLM_BOW = register("ironholm_bow", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)));
        public static final Item JACKS_RESPITE = register("jacks_respite", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNIQUE)));
        public static final Item JOLT_SHOOTER = register("jolt_shooter", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)));
        public static final Item LIGHT_CROSSBOW = register("light_crossbow", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.COMMON)));
        public static final Item LIVESTREAM = register("livestream", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNIQUE)));
        public static final Item LONG_BOW = register("long_bow", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.COMMON)));
        public static final Item MALFUNCTIONED_BOW = register("malfunctioned_bow", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)));
        public static final Item MAN_THE_CANON = register("man_the_canon", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)));
        public static final Item NETHERIAN_BOW = register("netherian_bow", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)));
        public static final Item NGHTMARE_BOW = register("nightmare_bow", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)));
        public static final Item PERMAFROST_BOW = register("permafrost_bow", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)));
        public static final Item RAKKU_BOW = register("rakku_bow", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)));
        public static final Item RIFLE = register("rifle", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)));
        public static final Item RUBY_CRESTED_CROSSBOW = register("ruby_crested_crossbow", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)));
        public static final Item SEEKER_BOW = register("seeker_bow", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)));
        public static final Item SENTRY_BOW = register("sentry_bow", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)));
        public static final Item SERAPHIM_BOW = register("seraphim_bow", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNIQUE)));
        public static final Item SHADRAXS_WING = register("shadraxs_wing", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)));
        public static final Item SILS_STARE = register("sils_stare", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.LEGENDARY)));
        public static final Item SIMPLE_BOW = register("simple_bow", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)));
        public static final Item SLINGSHOT = register("slingshot", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.COMMON)));
        public static final Item SNOWFLAKE_SHOOTER = register("snowflake_shooter", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)));
        public static final Item SOUL_SHOT = register("soul_shot", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)));
        public static final Item SPARK_SHOOTER = register("spark_shooter", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)));
        public static final Item TIORVAS_LOVE = register("tiorvas_love", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.LEGENDARY)));
        public static final Item TNT_BLASTER = register("tnt_blaster", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)));
        public static final Item TWEAKED_CROSSBOW = register("tweaked_crossbow", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)));
        public static final Item VALIANT_BOW = register("valiant_bow", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)));
        public static final Item VALOR_BOW = register("valor_bow", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)));
        public static final Item VERDANT_BOW = register("verdant_bow", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)));
        public static final Item VIRUS = register("virus", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.LEGENDARY)));
        public static final Item WAILING_GRIEF = register("wailing_grief", new BowItem(new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.LEGENDARY)));
    }
    //</editor-fold>

    //<editor-fold desc="AssassinItems">
    /**
     * @noinspection unused
     */
    static class AssassinItems {
        public static void initialize() {
        }

        public static final Item ASSASSINS_NUNCHUCKS = register("assassins_nunchucks", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.UNIQUE)
        ));
        public static final Item BLOSSOM_SWORD = register("blossom_sword", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.UNIQUE)
        ));
        public static final Item BONE_CHILL_BLADE = register("bone_chill_blade", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item BURNING_KNIFE = register("burning_knife", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item CANDLEKEEPERS_DIRK = register("candlekeepers_dirk", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item CHILDS_COMPANION = register("childs_companion", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.COMMON)
        ));
        public static final Item CLAW_GRIPPERS = register("claw_grippers", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.COMMON)
        ));
        public static final Item COGWORK_BONESAW = register("cogwork_bonesaw", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
        ));
        public static final Item CORRUPTED = register("corrupted", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.LEGENDARY)
        ));
        public static final Item CRESTED_LIFE_TAKER = register("crested_life_taker", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
        ));
        public static final Item CYBERLIFE = register("cyberlife", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.UNIQUE)
        ));
        public static final Item DAMNED_BLADE = register("damned_blade", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item DEVILS_MAKER = register("devils_maker", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item DREAM_RIPPER = register("dream_ripper", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item DRUMSTICK = register("drumstick", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.COMMON)
        ));
        public static final Item ELTORVURIA_BLADE = register("eltorvuria_blade", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.LEGENDARY)
        ));
        public static final Item ELVURS_SPITE = register("elvurs_spite", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.LEGENDARY)
        ));
        public static final Item EMERALD_CLAYMORE = register("emerald_claymore", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item FERRYMANS_BARGAIN = register("ferrymans_bargain", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item FOSSILIZED_KNIFE = register("fossilized_knife", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item FROSTMOURN_CLAYMORE = register("frostmourn_claymore", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item GARDEN_HOE = register("garden_hoe", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.COMMON)
        ));
        public static final Item GEOMANCERS_ARCHAEOLOGY_MITT = register("geomancers_archaeology_mitt", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item GOLDEN_PICK = register("golden_pick", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item GRIPPERS = register("grippers", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.COMMON)
        ));
        public static final Item HOOK = register("hook", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
        ));
        public static final Item ICE_PICK = register("ice_pick", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item IGNITED_KNIFE = register("ignited_knife", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
        ));
        public static final Item INFECTED_HEROS_BLADE = register("infected_heros_blade", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item IRONHOLM_BLADE = register("ironholm_blade", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item JACKS_CRESCENT = register("jacks_crescent", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.UNIQUE)
        ));
        public static final Item MAGENTA_MAYHEM = register("magenta_mayhem", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item MEEPER = register("meeper", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item MONTY = register("monty", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
        ));
        public static final Item PERCOLATION = register("percolation", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.LEGENDARY)
        ));
        public static final Item PERMAFROST_BLADE = register("permafrost_blade", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item POKIN_STICK = register("pokin_stick", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item PRIDES_DANCE = register("prides_dance", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item PUZZLING_KNIFE = register("puzzling_knife", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item RAKKU_KUNAI = register("rakku_kunai", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item RELIC_BLADE = register("relic_blade", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item ROOKIE_KNIFE = register("rookie_knife", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
        ));
        public static final Item RUBY_CRESTED_SHORTSWORD = register("ruby_crested_shortsword", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item RUINED_BLADE = register("ruined_blade", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item SAXOPHONE = register("saxophone", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item SENTRY_GRASP = register("sentry_grasp", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item SERAPHIM_SWORD = register("seraphim_sword", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.UNIQUE)
        ));
        public static final Item SERPENTINE_SLICER = register("serpentine_slicer", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item SHADEKIN_RAPIER = register("shadekin_rapier", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item SILS_CLAW = register("sils_claw", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.LEGENDARY)
        ));
        public static final Item SIMPLE_KATANA = register("simple_katana", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
        ));
        public static final Item SIPHON = register("siphon", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item SOUL_STEALER = register("soul_stealer", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item TEMPEST_TORRENT = register("tempest_torrent", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item THIEFS_KNIFE = register("thiefs_knife", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.COMMON)
        ));
        public static final Item TIORVAS_EMPATHY = register("tiorvas_empathy", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.LEGENDARY)
        ));
        public static final Item UNDERDARK_UNDERTAKER = register("underdark_undertaker", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.UNIQUE)
        ));
        public static final Item UNDYING_LIGHT = register("undying_light", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item VENOM_FANG = register("venom_fang", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item WILD_WANDERERS_CLAW = register("wild_wanderers_claw", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item WOLVERINE_GRIPPERS = register("wolverine_grippers", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
        ));
        public static final Item WOODEN_GAUNTLET = register("wooden_gauntlet", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
        ));
    }
    //</editor-fold>

    //<editor-fold desc="MageItems">
    /**
     * @noinspection unused
     */
    static class MageItems {
        public static void initialize() {
        }

        public static final Item FOUR_O_FOUR = register("404", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.LEGENDARY)
        ));
        public static final Item ANNO_DOMINI = register("anno_domini", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item APOLLOS_APATHY = register("apollos_apathy", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item ARCANE_FOCUS_WAND = register("arcane_focus_wand", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
        ));
        public static final Item ASSASSINS_QUARTERSTAFF = register("assassins_quarterstaff", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.UNIQUE)
        ));
        public static final Item BLOSSOM_WAND = register("blossom_wand", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.UNIQUE)
        ));
        public static final Item BOISTEROUS_BOLSTER = register("boisterous_bolster", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item BONE_CHILL_STAFF = register("bone_chill_staff", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item BONE_CLAD_WAND = register("bone_clad_wand", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
        ));
        public static final Item BUTTON_MASHER = register(
                "button_masher",
                new MagicWeaponItem(
                        MagicType.MAGIC,
                        new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                                ToolMaterials.WOOD,
                                1,
                                -1.6f
                        )).component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
                )
        );
        public static final Item BUTTON_PRESSER = register(
                "button_presser",
                new MagicWeaponItem(
                        MagicType.MAGIC,
                        new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                                ToolMaterials.WOOD,
                                1,
                                -1.6f
                        )).component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
                )
        );
        public static final Item BUTTON_PUSHER = register(
                "button_pusher",
                new MagicWeaponItem(
                        MagicType.MAGIC,
                        new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                                ToolMaterials.WOOD,
                                1,
                                -1.6f
                        )).component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
                )
        );
        public static final Item CANDLEKEEPERS_CRYPT = register("candlekeepers_crypt", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item CANDLE_KEEPER_STAFF = register("candle_keeper_staff", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item CAPTAINS_STAFF = register("captains_staff", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item COGWORK_STAFF = register("cogwork_staff", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
        ));
        public static final Item DARK_MOON = register("dark_moon", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item DARK_SCEPTER = register("dark_scepter", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item DECRYPTION = register("decryption", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.UNIQUE)
        ));
        public static final Item DEVILS_SUMMONER = register("devils_summoner", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item DREAMERS_WAND = register("dreamers_wand", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item ELECTRIFIED_MANTLE = register("electrified_mantle", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
        ));
        public static final Item ELTORVURIA_STAFF = register("eltorvuria_staff", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.LEGENDARY)
        ));
        public static final Item ELVURS_REVENGE = register("elvurs_revenge", new MagicWeaponItem(
                MagicType.ETHEREAL,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.LEGENDARY)
        ));
        public static final Item ENGUARDE = register("enguarde", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.COMMON)
        ));
        public static final Item FLORAL_CONQUEST = register("floral_conquest", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.COMMON)
        ));
        public static final Item FORESIGHT = register("foresight", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.UNIQUE)
        ));
        public static final Item FROSTMOURN_STAFF = register("frostmourn_staff", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item FOSSILIZED_STAFF = register("fossilized_staff", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item FUNKY_STICK = register("funky_stick", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.COMMON)
        ));
        public static final Item FYNYKS_SCEPTER = register("fynyks_scepter", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item GENERALS_STAFF = register("generals_staff", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item GEOMANCERS_HERO = register("geomancers_hero", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item GLOBE_BONKER = register("globe_bonker", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
        ));
        public static final Item GOLDEN_POKER = register("golden_poker", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item GHOULS_GUARDIAN = register("ghouls_guardian", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item GRACE_OF_LUNALIA = register("grace_of_lunalia", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item IRONHOLM_STAFF = register("ironholm_staff", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item JACK_OF_ALL_TRADES = register("jack_of_all_trades", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.UNIQUE)
        ));
        public static final Item KNIGHTS_STAFF = register("knights_staff", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item KRAKEN_KANE = register("kraken_kane", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item LUNALIAS_BLESSING = register("lunalias_blessing", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item LUNALIAS_FORCE = register("lunalias_force", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item MOONWELLS_GRACE = register("moonwells_grace", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item MOP = register("mop", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.COMMON)
        ));
        public static final Item NATURES_BOON = register("natures_boon", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
        ));
        public static final Item PERMAFROST_STAFF = register("permafrost_staff", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item PINWHEEL = register("pinwheel", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.COMMON)
        ));
        public static final Item POINTY_THING = register("pointy_thing", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item RAKKU_GLAIVE = register("rakku_glaive", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item RUBY_CRESTED_SCEPTER = register("ruby_crested_scepter", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item SANGUINE = register("sanguine", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.LEGENDARY)
        ));
        public static final Item SENTRY_STAFF = register("sentry_staff", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item SERAPHIM_SCEPTER = register("seraphim_scepter", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.UNIQUE)
        ));
        public static final Item SHADEKIN_HORIZON = register("shadekin_horizon", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item SILS_TOOTH = register("sils_tooth", new MagicWeaponItem(
                MagicType.DIRE, 10, 45.0f,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.LEGENDARY)
        ));
        public static final Item SOUL_GUIDER = register("soul_guider", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item SUNFLOWERS_GIFT = register("sunflowers_gift", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.COMMON)
        ));
        public static final Item TIORVAS_GIFT = register("tiorvas_gift", new MagicWeaponItem(
                MagicType.POTENT,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.LEGENDARY)
        ));
        public static final Item TOME_KEEPER = register("tome_keeper", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.UNIQUE)
        ));
        public static final Item TRIBAL_WAND = register("tribal_wand", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item TRICKSTERS_FRIENDS = register("tricksters_friends", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item TUNDRAS_STAND = register("tundras_stand", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item VILLAGERS_CRADLE = register("villagers_cradle", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item WAND_OF_NIGHTMARES = register("wand_of_nightmares", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item WAND_OF_THE_WILDS = register("wand_of_the_wilds", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item WICK_OF_FLAMES = register("wick_of_flames", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
        ));
        public static final Item YOUNG_STAFF = register("young_staff", new MagicWeaponItem(
                MagicType.MAGIC,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
        ));
    }
    //</editor-fold>

    //<editor-fold desc="ShamanItems">
    /**
     * @noinspection unused
     */
    static class ShamanItems {
        public static void initialize() {
        }

        public static final Item ANDRAS_WATCH = register(
                "andras_watch",
                new RelikItem(
                        15.0f,
                        ((short) 600),
                        20,
                        new TotemData.TotemParticle(ParticleTypes.ASH),
                        StatusEffects.WITHER,
                        (byte) 5,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNIQUE)
                )
        );
        public static final Item ARC_OF_THE_TUNDRA = register(
                "arc_of_the_tundra",
                new RelikItem(
                        15.0f,
                        ((short) 600),
                        20,
                        new TotemData.TotemParticle(ParticleTypes.SNOWFLAKE),
                        StatusEffects.WATER_BREATHING,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
                )
        );
        public static final Item ASSASSINS_LANTERN = register(
                "assassins_lantern",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        10,
                        new TotemData.TotemParticle(ParticleTypes.SOUL_FIRE_FLAME),
                        StatusEffects.NIGHT_VISION,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNIQUE)
                )
        );
        public static final Item ATL = register(
                "atl",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        TotemData.TotemParticle.makeDustParticle(0, 1, 0, 1),
                        StatusEffects.SPEED,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.COMMON)
                )
        );
        public static final Item ATLLA = register(
                "atlla",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        TotemData.TotemParticle.makeDustParticle(0, 1, 0, 1),
                        StatusEffects.SPEED,
                        (byte) 2,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
                )
        );
        public static final Item ATLLANT = register(
                "atllant",
                new RelikItem(
                        15.0f,
                        ((short) 600),
                        20,
                        TotemData.TotemParticle.makeDustParticle(0, 1, 0, 1),
                        StatusEffects.SPEED,
                        (byte) 4,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
                )
        );
        public static final Item ATLLANTRIUS = register(
                "atllantrius",
                new RelikItem(
                        20.0f,
                        ((short) 600),
                        20,
                        TotemData.TotemParticle.makeDustParticle(0, 1, 0, 1),
                        StatusEffects.SPEED,
                        (byte) 4,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
                )
        );
        public static final Item BLAZING_TOTEM = register(
                "blazing_totem",
                new RelikItem(
                        20.0f,
                        ((short) 600),
                        20,
                        new TotemData.TotemParticle(ParticleTypes.FLAME),
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
                )
        );
        public static final Item BLIZZARD_TOTEM = register(
                "blizzard_totem",
                new RelikItem(
                        20.0f,
                        ((short) 600),
                        20,
                        new TotemData.TotemParticle(ParticleTypes.SMALL_GUST),
                        StatusEffects.SLOW_FALLING,
                        (byte) 2,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
                )
        );
        public static final Item BLOOD_MOON = register(
                "blood_moon",
                new RelikItem(
                        20.0f,
                        ((short) 600),
                        20,
                        TotemData.TotemParticle.makeDustParticle(1, 0, 0, 1),
                        StatusEffects.STRENGTH,
                        (byte) 2,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.LEGENDARY)
                )
        );
        public static final Item BONE_CHILL_TOTEM = register(
                "bone_chill_totem",
                new RelikItem(
                        15.0f,
                        ((short) 600),
                        20,
                        TotemData.TotemParticle.makeDustParticle(0, 1, 1, 1),
                        StatusEffects.DOLPHINS_GRACE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
                )
        );
        public static final Item BROCCOLI = register(
                "broccoli",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        TotemData.TotemParticle.makeDustParticle(0, 1, 0, 1),
                        StatusEffects.SATURATION,
                        (byte) 3,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.COMMON)
                )
        );
        public static final Item CANDLEKEEPERS_ANCHOR = register(
                "candlekeepers_anchor",
                new RelikItem(
                        15.0f,
                        ((short) 600),
                        20,
                        new TotemData.TotemParticle(ParticleTypes.FLAME),
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
                )
        );
        public static final Item CENTURION_HANDFAN = register(
                "centurion_handfan",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        new TotemData.TotemParticle(ParticleTypes.CHERRY_LEAVES),
                        StatusEffects.JUMP_BOOST,
                        (byte) 1,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
                )
        );
        public static final Item CLOCKWORK_SUMMONER = register(
                "clockwork_summoner",
                new RelikItem(
                        15.0f,
                        ((short) 600),
                        20,
                        new TotemData.TotemParticle(ParticleTypes.ELECTRIC_SPARK),
                        StatusEffects.SPEED,
                        (byte) 3,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
                )
        );
        public static final Item COGWORK_TOTEM = register(
                "cogwork_totem",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        new TotemData.TotemParticle(ParticleTypes.ELECTRIC_SPARK),
                        StatusEffects.SPEED,
                        (byte) 2,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
                )
        );
        public static final Item DEVILS_ANCHOR = register(
                "devils_anchor",
                new RelikItem(
                        15.0f,
                        ((short) 600),
                        20,
                        new TotemData.TotemParticle(ParticleTypes.DRIPPING_LAVA),
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
                )
        );
        public static final Item DOLL_OF_THE_TRICKSTER = register(
                "doll_of_the_trickster",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        new TotemData.TotemParticle(ParticleTypes.SOUL),
                        StatusEffects.REGENERATION,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.COMMON)
                )
        );
        public static final Item DRUM_OF_DUMAH = register(
                "drum_of_dumah",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        new TotemData.TotemParticle(ParticleTypes.NOTE),
                        StatusEffects.GLOWING,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
                )
        );
        public static final Item DUMDUMS_TOTEM = register(
                "dumdums_totem",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        new TotemData.TotemParticle(ParticleTypes.ITEM_SLIME),
                        StatusEffects.OOZING,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
                )
        );
        public static final Item ELTORVURIA_TOTEM = register(
                "eltorvuria_totem",
                new RelikItem(
                        25.0f,
                        ((short) 600),
                        20,
                        new TotemData.TotemParticle(),
                        StatusEffects.RESISTANCE,
                        (byte) 10,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.LEGENDARY)
                )
        );
        public static final Item FALLEN_FALSE_GOD = register(
                "fallen_false_god",
                new RelikItem(
                        20.0f,
                        ((short) 600),
                        20,
                        new TotemData.TotemParticle(ParticleTypes.HEART),
                        StatusEffects.HERO_OF_THE_VILLAGE,
                        (byte) 3,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
                )
        );
        public static final Item FEATHERED_TOTEM = register(
                "feathered_totem",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        new TotemData.TotemParticle(ParticleTypes.SMALL_GUST),
                        StatusEffects.SLOW_FALLING,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
                )
        );
        public static final Item FLEDGED_TOTEM = register(
                "fledged_totem",
                new RelikItem(
                        15.0f,
                        ((short) 600),
                        20,
                        new TotemData.TotemParticle(ParticleTypes.SMALL_GUST),
                        StatusEffects.SLOW_FALLING,
                        (byte) 1,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
                )
        );
        public static final Item FLIGHT_TOTEM = register(
                "flight_totem",
                new RelikItem(
                        20.0f,
                        ((short) 600),
                        20,
                        new TotemData.TotemParticle(ParticleTypes.SMALL_GUST),
                        StatusEffects.SLOW_FALLING,
                        (byte) 2,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
                )
        );
        public static final Item FOSSILIZED_TOTEM = register(
                "fossilized_totem",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        TotemData.TotemParticle.makeDustParticle(1, 1, 1, 1),
                        StatusEffects.HASTE,
                        (byte) 2,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
                )
        );
        public static final Item FROSTMOURN_TOTEM = register(
                "frostmourn_totem",
                new RelikItem(
                        20.0f,
                        ((short) 600),
                        20,
                        new TotemData.TotemParticle(ParticleTypes.SNOWFLAKE),
                        StatusEffects.INVISIBILITY,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
                )
        );
        public static final Item FRYING_PAN = register(
                "frying_pan",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        new TotemData.TotemParticle(ParticleTypes.ENCHANTED_HIT),
                        StatusEffects.SATURATION,
                        (byte) 1,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.COMMON)
                )
        );
        public static final Item FYNYKS_FLAME = register(
                "fynyks_flame",
                new RelikItem(
                        20.0f,
                        ((short) 600),
                        20,
                        new TotemData.TotemParticle(ParticleTypes.FLAME),
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
                )
        );
        public static final Item GEOMANCERS_TOTEM = register(
                "geomancers_totem",
                new RelikItem(
                        20.0f,
                        ((short) 600),
                        20,
                        TotemData.TotemParticle.makeBlockParticle(Identifier.ofVanilla("stone")),
                        StatusEffects.HASTE,
                        (byte) 5,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
                )
        );
        public static final Item GLITCH = register(
                "glitch",
                new RelikItem(
                        20.0f,
                        ((short) 600),
                        20,
                        TotemData.TotemParticle.makeDustParticle(0, 1, 0, 1),
                        StatusEffects.ABSORPTION,
                        (byte) 10,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.LEGENDARY)
                )
        );
        public static final Item GOLD_THORN_TOTEM = register(
                "gold_thorn_totem",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        TotemData.TotemParticle.makeBlockParticle(Identifier.ofVanilla("sand")),
                        StatusEffects.INFESTED,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
                )
        );
        public static final Item GOLDEN_TOTEM = register(
                "golden_totem",
                new RelikItem(
                        15.0f,
                        ((short) 600),
                        20,
                        TotemData.TotemParticle.makeBlockParticle(Identifier.ofVanilla("sand")),
                        StatusEffects.INFESTED,
                        (byte) 1,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
                )
        );
        public static final Item HOLY_CRUCIBLE = register(
                "holy_crucible",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        TotemData.TotemParticle.makeDustParticle(0.66f, 1, 0, 1),
                        StatusEffects.GLOWING,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
                )
        );
        public static final Item HOLY_GRAIL = register(
                "holy_grail",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        new TotemData.TotemParticle(ParticleTypes.HAPPY_VILLAGER),
                        StatusEffects.LUCK,
                        (byte) 2,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
                )
        );
        public static final Item ICICLE_TOTEM = register(
                "icicle_totem",
                new RelikItem(
                        15.0f,
                        ((short) 600),
                        20,
                        new TotemData.TotemParticle(ParticleTypes.SMALL_GUST),
                        StatusEffects.SLOW_FALLING,
                        (byte) 1,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
                )
        );
        public static final Item INTERMEDIATE_TOTEM = register(
                "intermediate_totem",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
                )
        );
        public static final Item IRONHOLM_TOTEM = register(
                "ironholm_totem",
                new RelikItem(
                        15.0f,
                        ((short) 600),
                        20,
                        new TotemData.TotemParticle(ParticleTypes.FLAME),
                        StatusEffects.HASTE,
                        (byte) 10,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
                )
        );
        public static final Item JACKS_POST = register(
                "jacks_post",
                new RelikItem(
                        0.0f,
                        ((short) 600),
                        20,
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNIQUE)
                )
        );
        public static final Item JOLT_TOTEM = register(
                "jolt_totem",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        new TotemData.TotemParticle(ParticleTypes.ELECTRIC_SPARK),
                        StatusEffects.SLOWNESS,
                        (byte) 1,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
                )
        );
        public static final Item MATURED_TOTEM = register(
                "matured_totem",
                new RelikItem(
                        15.0f,
                        ((short) 600),
                        20,
                        new TotemData.TotemParticle(ParticleTypes.ITEM_COBWEB),
                        StatusEffects.SLOW_FALLING,
                        (byte) 1,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
                )
        );
        public static final Item NIGHTS_GUIDE = register(
                "nights_guide",
                new RelikItem(
                        20.0f,
                        ((short) 600),
                        20,
                        new TotemData.TotemParticle(ParticleTypes.ELECTRIC_SPARK),
                        StatusEffects.NIGHT_VISION,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
                )
        );
        public static final Item PUCKS_PANFLUTE = register(
                "pucks_panflute",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        new TotemData.TotemParticle(ParticleTypes.NOTE),
                        StatusEffects.LUCK,
                        (byte) 3,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
                )
        );
        public static final Item PUPPET_OF_THE_TRICKSTER = register(
                "puppet_of_the_trickster",
                new RelikItem(
                        20.0f,
                        ((short) 600),
                        20,
                        new TotemData.TotemParticle(ParticleTypes.SOUL),
                        StatusEffects.WITHER,
                        (byte) 2,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
                )
        );
        public static final Item RUBY_CRESTED_TOTEM = register(
                "ruby_crested_totem",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        TotemData.TotemParticle.makeEffectParticle(1, 1, 1, 1),
                        StatusEffects.INVISIBILITY,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
                )
        );
        public static final Item RUBY_TOTEM = register(
                "ruby_totem",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        new TotemData.TotemParticle(ParticleTypes.FLAME),
                        StatusEffects.JUMP_BOOST,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
                )
        );
        public static final Item RUM_BOTTLE = register(
                "rum_bottle",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        TotemData.TotemParticle.makeEffectParticle(0, 1, 0, 1),
                        StatusEffects.NAUSEA,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
                )
        );
        public static final Item SAKURA_GROVE_WAND = register(
                "sakura_grove_wand",
                new RelikItem(
                        15.0f,
                        ((short) 600),
                        20,
                        new TotemData.TotemParticle(ParticleTypes.CHERRY_LEAVES),
                        StatusEffects.JUMP_BOOST,
                        (byte) 3,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNIQUE)
                )
        );
        public static final Item SENTRY_TOWER = register(
                "sentry_tower",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        new TotemData.TotemParticle(ParticleTypes.WAX_OFF),
                        StatusEffects.STRENGTH,
                        (byte) 4,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
                )
        );
        public static final Item SERAPHIM_TOTEM = register(
                "seraphim_totem",
                new RelikItem(
                        20.0f,
                        ((short) 600),
                        20,
                        new TotemData.TotemParticle(),
                        StatusEffects.JUMP_BOOST,
                        (byte) 10,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNIQUE)
                )
        );
        public static final Item SHADRAXS_PROTECTION = register(
                "shadraxs_protection",
                new RelikItem(
                        20.0f,
                        ((short) 600),
                        20,
                        TotemData.TotemParticle.makeEffectParticle(1, 0, 1, 1),
                        StatusEffects.RESISTANCE,
                        (byte) 2,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
                )
        );
        public static final Item SHIPWRIGHT_TOTEM = register(
                "shipwright_totem",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        new TotemData.TotemParticle(ParticleTypes.BUBBLE),
                        StatusEffects.WATER_BREATHING,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
                )
        );
        public static final Item SIGIL_OF_SEALING = register(
                "sigil_of_sealing",
                new RelikItem(
                        15.0f,
                        ((short) 600),
                        20,
                        new TotemData.TotemParticle(ParticleTypes.ENCHANT),
                        StatusEffects.SLOWNESS,
                        (byte) 10,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
                )
        );
        public static final Item SILS_DARK_MOON = register(
                "sils_dark_moon",
                new RelikItem(
                        20.0f,
                        ((short) 600),
                        20,
                        TotemData.TotemParticle.makeDustParticle(1, 0, 0, 1),
                        StatusEffects.STRENGTH,
                        (byte) 10,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.LEGENDARY)
                )
        );
        public static final Item SILK_WEAVERS_CAGE = register(
                "silk_weavers_cage",
                new RelikItem(
                        15.0f,
                        ((short) 600),
                        20,
                        new TotemData.TotemParticle(ParticleTypes.ITEM_COBWEB),
                        StatusEffects.WEAVING,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
                )
        );
        public static final Item SNOWFLAKE_TOTEM = register(
                "snowflake_totem",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        new TotemData.TotemParticle(ParticleTypes.SMALL_GUST),
                        StatusEffects.SLOW_FALLING,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
                )
        );
        public static final Item SORROWFUL_ANGEL = register(
                "sorrowful_angel",
                new RelikItem(
                        15.0f,
                        ((short) 600),
                        20,
                        new TotemData.TotemParticle(ParticleTypes.ENCHANT),
                        StatusEffects.LEVITATION,
                        (byte) 1,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
                )
        );
        public static final Item SOUL_KEEPERS_CAGE = register(
                "soul_keepers_cage",
                new RelikItem(
                        15.0f,
                        ((short) 600),
                        20,
                        new TotemData.TotemParticle(ParticleTypes.SCULK_SOUL),
                        StatusEffects.ABSORPTION,
                        (byte) 2,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
                )
        );
        public static final Item SPARKING_TOTEM = register(
                "sparking_totem",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        new TotemData.TotemParticle(ParticleTypes.ELECTRIC_SPARK),
                        StatusEffects.SLOWNESS,
                        (byte) 2,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
                )
        );
        public static final Item TIME_REWINDER = register(
                "time_rewinder",
                new RelikItem(
                        20.0f,
                        ((short) 600),
                        20,
                        TotemData.TotemParticle.makeEffectParticle(0, 0, 0, 1),
                        StatusEffects.SLOWNESS,
                        (byte) 10,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
                )
        );
        public static final Item TIORVAS_PASSION = register(
                "tiorvas_passion",
                new RelikItem(
                        20.0f,
                        ((short) 600),
                        20,
                        TotemData.TotemParticle.makeDustParticle(1, 0, 1, 1),
                        StatusEffects.DARKNESS,
                        (byte) 10,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.LEGENDARY)
                )
        );
        public static final Item TORRENT = register(
                "torrent",
                new RelikItem(
                        20.0f,
                        ((short) 600),
                        20,
                        TotemData.TotemParticle.makeDustParticle(0.33f, 0.33f, 1, 1),
                        StatusEffects.REGENERATION,
                        (byte) 3,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNIQUE)
                )
        );
        public static final Item TRIBUNAL_TOTEM = register(
                "tribunal_totem",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        TotemData.TotemParticle.makeDustParticle(1, 1, 1, 1),
                        StatusEffects.SLOW_FALLING,
                        (byte) 2,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
                )
        );
        public static final Item WINGED_RUBY_TOTEM = register(
                "winged_ruby_totem",
                new RelikItem(
                        15.0f,
                        ((short) 600),
                        20,
                        new TotemData.TotemParticle(ParticleTypes.FLAME),
                        StatusEffects.JUMP_BOOST,
                        (byte) 1,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
                )
        );
    }
    //</editor-fold>

    //<editor-fold desc="WarriorItems">
    /**
     * @noinspection unused
     */
    static class WarriorItems {
        public static void initialize() {
        }

        public static final Item BANANA = register("banana", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item BARDS_REQUIME = register("bards_requime", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item BLAZING_SPEAR = register("blazing_spear", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
        ));
        public static final Item BLOSSOM_SPEAR = register("blossom_spear", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        4,
                        -2.0f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.UNIQUE)
        ));
        public static final Item BONE_CHILL_SCYTHE = register("bone_chill_scythe", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        4,
                        -2.0f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item CANDLEKEEPERS_WARHAMMER = register("candlekeepers_warhammer", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item COGWORK_SPEAR = register("cogwork_spear", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
        ));
        public static final Item CREST_OF_CONQUEST = register("crest_of_conquest", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item CRYSTAL_SPEAR = register("crystal_spear", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item DEATHS_RESPITE = register("deaths_respite", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        4,
                        -2.0f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.UNIQUE)
        ));
        public static final Item DEVILS_CONQUEST = register("devils_conquest", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item DOUBLE_EDGE = register("double_edge", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item EARLY_RETIREMENT = register("early_retirement", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item EMERALD_SPEAR = register("emerald_spear", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item ERROR = register("error", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.LEGENDARY)
        ));
        public static final Item ELVURS_MIGHT = register("elvurs_might", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.LEGENDARY)
        ));
        public static final Item FELDIRS_FORK = register("feldirs_fork", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item FELDIRS_JAVELIN = register("feldirs_javelin", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item FELDIRS_TRIDENT = register("feldirs_trident", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item FJORD_AXE = register("fjord_axe", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item FORKED_SPEAR = register("forked_spear", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item FOSSILIZED_SPEAR = register("fossilized_spear", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item FROSTMOURN_SPEAR = register("frostmourn_spear", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item FYNYKS_HAMMER = register("fynyks_hammer", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        10,
                        -3.0f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.LEGENDARY)
        ));
        public static final Item GLORY_OF_VALOR = register("glory_of_valor", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item GOLDEN_SPEAR = register("golden_spear", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item IGNITED_SPEAR = register("ignited_spear", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.COMMON)
        ));
        public static final Item ILLUMINATOR = register("illuminator", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        4,
                        -2.0f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.UNIQUE)
        ));
        public static final Item JOLT_SPEAR = register("jolt_spear", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
        ));
        public static final Item JACKS_BANE = register("jacks_bane", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        4,
                        -2.0f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.UNIQUE)
        ));
        public static final Item LIMINS_LANCE = register("limins_lance", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
        ));
        public static final Item MAKESHIFT_AXE = register("makeshift_axe", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
        ));
        public static final Item GEOMANCERS_MALLET_OF_SHATTERING = register("geomancers_mallet_of_shattering", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item MALLET_OF_THE_VALE = register("mallet_of_the_vale", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item OLD_RAKE = register("old_rake", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.COMMON)
        ));
        public static final Item PADDLE_OF_TIDES = register("paddle_of_tides", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
        ));
        public static final Item PERMAFROST_SPEAR = register("permafrost_spear", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item PHARAOHS_SPEAR = register("pharaohs_spear", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item RAKKU_HEART_RIPPER = register("rakku_heart_ripper", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item RUBY_CRESTED_GREATBLADE = register("ruby_crested_greatblade", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item SERAPHIM_SPEAR = register("seraphim_spear", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        4,
                        -2.0f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.UNIQUE)
        ));
        public static final Item SHADEKIN_SPEAR = register("shadekin_spear", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item SILS_REVENGE = register("sils_revenge", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        8,
                        -2.0f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.LEGENDARY)
        ));
        public static final Item SIMPLE_GLAIVE = register("simple_glaive", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
        ));
        public static final Item SIMPLE_HAMMER = register("simple_hammer", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
        ));
        public static final Item SIMPLE_SCYTHE = register("simple_scythe", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
        ));
        public static final Item SIMPLE_SPEAR = register("simple_spear", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.COMMON)
        ));
        public static final Item SKEWER = register("skewer", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.COMMON)
        ));
        public static final Item SOUL_TAKER = register("soul_taker", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item SOULDIERS_HALBERD = register("souldiers_halberd", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item TEMPEST_GLAIVE = register("tempest_glaive", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item TIMES_END = register("times_end", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item TIORVAS_EMBRACE = register("tiorvas_embrace", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.LEGENDARY)
        ));
        public static final Item TRIDENT_OF_TROUBLES = register("trident_of_troubles", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item TRUSTED_STEED = register("trusted_steed", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.COMMON)
        ));
        public static final Item ZEPHYRS_GALE = register("zephyrs_gale", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
    }
    //</editor-fold>

    //<editor-fold desc="ElytraItems">
    static class ElytraItems {
        public static void initialize() {
        }

        public static final Item BAT_DARK = register("bat_dark", new ExtendedElytraItem(new Item.Settings().maxDamage(432), Identifier.of(MOD_ID, "textures/entity/elytra/bat_dark.png")));
        public static final Item BAT_GREEN = register("bat_green", new ExtendedElytraItem(new Item.Settings().maxDamage(432), Identifier.of(MOD_ID, "textures/entity/elytra/bat_green.png")));
        public static final Item BAT_ORANGE = register("bat_orange", new ExtendedElytraItem(new Item.Settings().maxDamage(432), Identifier.of(MOD_ID, "textures/entity/elytra/bat_orange.png")));
        public static final Item BAT_VIOLET = register("bat_violet", new ExtendedElytraItem(new Item.Settings().maxDamage(432), Identifier.of(MOD_ID, "textures/entity/elytra/bat_violet.png")));
        public static final Item BED = register("bed_wings", new ExtendedElytraItem(new Item.Settings().maxDamage(432), Identifier.of(MOD_ID, "textures/entity/elytra/bed.png")));
        public static final Item BEE = register("bee_wings", new ExtendedElytraItem(new Item.Settings().maxDamage(432), Identifier.of(MOD_ID, "textures/entity/elytra/bee.png")));
        public static final Item BROOM = register("broom", new ExtendedElytraItem(new Item.Settings().maxDamage(432), Identifier.of(MOD_ID, "textures/entity/elytra/broom.png")));
        public static final Item CARDBOARD = register("cardboard_wings", new ExtendedElytraItem(new Item.Settings().maxDamage(432), Identifier.of(MOD_ID, "textures/entity/elytra/cardboard.png")));
        public static final Item CEDRIC_WINGS = register("cedric_wings", new ExtendedElytraItem(new Item.Settings().maxDamage(432), Identifier.of(MOD_ID, "textures/entity/elytra/cedric.png")));
        public static final Item COBWEB_WINGS = register("cobweb_wings", new ExtendedElytraItem(new Item.Settings().maxDamage(432), Identifier.of(MOD_ID, "textures/entity/elytra/cobweb.png")));
        public static final Item DATA_WINGS = register("data_wings", new ExtendedElytraItem(new Item.Settings().maxDamage(432), Identifier.of(MOD_ID, "textures/entity/elytra/data.png")));
        public static final Item DOVE = register("dove_wings", new ExtendedElytraItem(new Item.Settings().maxDamage(432), Identifier.of(MOD_ID, "textures/entity/elytra/dove.png")));
        public static final Item ECLIPSE_BLUE = register("eclipse_blue", new ExtendedElytraItem(new Item.Settings().maxDamage(432), Identifier.of(MOD_ID, "textures/entity/elytra/eclipse_blue.png")));
        public static final Item ECLIPSE_TAN = register("eclipse_tan", new ExtendedElytraItem(new Item.Settings().maxDamage(432), Identifier.of(MOD_ID, "textures/entity/elytra/eclipse_tan.png")));
        public static final Item ELYSIUM = register("elysium", new ExtendedElytraItem(new Item.Settings().maxDamage(432), Identifier.of(MOD_ID, "textures/entity/elytra/elysium.png")));
        public static final Item ENDERDRAGON_WINGS = register("enderdragon_wings", new ExtendedElytraItem(new Item.Settings().maxDamage(432), Identifier.of(MOD_ID, "textures/entity/elytra/enderdragon.png")));
        public static final Item GHOST = register("ghost", new ExtendedElytraItem(new Item.Settings().maxDamage(432), Identifier.of(MOD_ID, "textures/entity/elytra/ghost.png")));
        public static final Item GLASS = register("glass", new ExtendedElytraItem(new Item.Settings().maxDamage(432), Identifier.of(MOD_ID, "textures/entity/elytra/glass.png")));
        public static final Item HAND = register("hand", new ExtendedElytraItem(new Item.Settings().maxDamage(432), Identifier.of(MOD_ID, "textures/entity/elytra/hand.png")));
        public static final Item HANGGLIDER_BLUE = register("hangglider_blue", new ExtendedElytraItem(new Item.Settings().maxDamage(432), Identifier.of(MOD_ID, "textures/entity/elytra/hangglider_blue.png")));
        public static final Item HANGGLIDER_GREEN = register("hangglider_green", new ExtendedElytraItem(new Item.Settings().maxDamage(432), Identifier.of(MOD_ID, "textures/entity/elytra/hangglider_green.png")));
        public static final Item HANGGLIDER_MAGENTA = register("hangglider_magenta", new ExtendedElytraItem(new Item.Settings().maxDamage(432), Identifier.of(MOD_ID, "textures/entity/elytra/hangglider_magenta.png")));
        public static final Item HECTEYE = register("hecteye", new ExtendedElytraItem(new Item.Settings().maxDamage(432), Identifier.of(MOD_ID, "textures/entity/elytra/hecteye.png")));
        public static final Item LIMBY_WINGS = register("limby_wings", new ExtendedElytraItem(new Item.Settings().maxDamage(432), Identifier.of(MOD_ID, "textures/entity/elytra/limby.png")));
        public static final Item PLANE = register("plane", new ExtendedElytraItem(new Item.Settings().maxDamage(432), Identifier.of(MOD_ID, "textures/entity/elytra/plane.png")));
        public static final Item RAINBOW = register("rainbow", new ExtendedElytraItem(new Item.Settings().maxDamage(432), Identifier.of(MOD_ID, "textures/entity/elytra/rainbow.png")));
        public static final Item RAVEN_WINGS = register("raven_wings", new ExtendedElytraItem(new Item.Settings().maxDamage(432), Identifier.of(MOD_ID, "textures/entity/elytra/raven.png")));
        public static final Item RAVNA_WINGS = register("ravna_wings", new ExtendedElytraItem(new Item.Settings().maxDamage(432), Identifier.of(MOD_ID, "textures/entity/elytra/ravna.png")));
        public static final Item SKELYTRA = register("skelytra", new ExtendedElytraItem(new Item.Settings().maxDamage(432), Identifier.of(MOD_ID, "textures/entity/elytra/skelytra.png")));
        public static final Item VAMPIRE = register("vampire", new ExtendedElytraItem(new Item.Settings().maxDamage(432), Identifier.of(MOD_ID, "textures/entity/elytra/vampire.png")));
        public static final Item VEX_WINGS = register("vex_wings", new ExtendedElytraItem(new Item.Settings().maxDamage(432), Identifier.of(MOD_ID, "textures/entity/elytra/vex.png")));
    }
    //</editor-fold>

    public static final Item DARK_CHERRY_SIGN = register("dark_cherry_sign", new SignItem(new Item.Settings(), GCBlocks.DARK_CHERRY_SIGN, GCBlocks.DARK_CHERRY_WALL_SIGN));
    public static final Item DARK_CHERRY_HANGING_SIGN = register("dark_cherry_hanging_sign", new HangingSignItem(GCBlocks.DARK_CHERRY_HANGING_SIGN, GCBlocks.DARK_CHERRY_WALL_HANGING_SIGN, new Item.Settings()));
    public static final Item EBONY_SIGN = register("ebony_sign", new SignItem(new Item.Settings(), GCBlocks.EBONY_SIGN, GCBlocks.EBONY_WALL_SIGN));
    public static final Item EBONY_HANGING_SIGN = register("ebony_hanging_sign", new HangingSignItem(GCBlocks.EBONY_HANGING_SIGN, GCBlocks.EBONY_WALL_HANGING_SIGN, new Item.Settings()));

    public static final Item CHOCOLATE = register("chocolate", new Item(new Item.Settings().food(ModFoodComponents.CHOCOLATE)));

    // ACCESSORIES
    public static final Item ARACHNOPHOBIA_HAT = register("arachnophobia", new TrinketItem(new Item.Settings()));
    public static final Item BEARD_MASK = register("beard", new TrinketItem(new Item.Settings()));
    public static final Item BLACK_MAGE_HAT = register("black_mage", new TrinketItem(new Item.Settings()));
    public static final Item BLACK_RAM_HORNS_HAT = register("black_ram_horns", new TrinketItem(new Item.Settings()));
    public static final Item BLEEDING_HELM_HAT = register("bleeding_helm", new TrinketItem(new Item.Settings()));
    public static final Item BLIZZARD_MAGE_HAT = register("blizzard_mage", new TrinketItem(new Item.Settings()));
    public static final Item CANDLE_KEEPER_HAT = register("candle_keeper", new TrinketItem(new Item.Settings()));
    public static final Item CELESTIAL_BAND_HAT = register("celestial_band", new TrinketItem(new Item.Settings()));
    public static final Item CELESTIAL_HOOD_HAT = register("celestial_hood", new TrinketItem(new Item.Settings()));
    public static final Item CHIEFTAIN_HELM_HAT = register("chieftain_helm", new TrinketItem(new Item.Settings()));
    public static final Item DARK_HOOD_SHORT_HAT = register("dark_hood_short", new TrinketItem(new Item.Settings()));
    public static final Item DEATHS_HAND_HAT = register("deaths_hand", new TrinketItem(new Item.Settings()));
    public static final Item DEER_ANTLERS_HAT = register("deer_antlers", new TrinketItem(new Item.Settings()));
    public static final Item DETECTIVE_HAT = register("detective", new TrinketItem(new Item.Settings()));
    public static final Item DEVILS_COWL_HAT = register("devils_cowl", new TrinketItem(new Item.Settings()));
    public static final Item DEVILS_CROWN_HAT = register("devils_crown", new TrinketItem(new Item.Settings()));
    public static final Item DRAKE_HAT = register("drake", new TrinketItem(new Item.Settings()));
    public static final Item DREAMERS_CREST_HAT = register("dreamers_crest", new TrinketItem(new Item.Settings()));
    public static final Item DRUID_ANTLERS_HAT = register("druid_antlers", new TrinketItem(new Item.Settings()));
    public static final Item DWARVEN_HELM_HAT = register("dwarven_helm", new TrinketItem(new Item.Settings()));
    public static final Item EMERALD_BASTION_HAT = register("emerald_bastion", new TrinketItem(new Item.Settings()));
    public static final Item FANCY_BOI_HAT = register("fancy_boi", new TrinketItem(new Item.Settings()));
    public static final Item FANCY_FEATHER_HAT = register("fancy_feather", new TrinketItem(new Item.Settings()));
    public static final Item FELDIR_HAT = register("feldir", new TrinketItem(new Item.Settings()));
    public static final Item FERN_HAT = register("fern", new TrinketItem(new Item.Settings()));
    public static final Item FIVE_BILLION_LIKES_HAT = register("five_billion_likes", new TrinketItem(new Item.Settings()));
    public static final Item FLAMBOYANT_HAT = register("flamboyant_hat", new TrinketItem(new Item.Settings()));
    public static final Item FOX_CAP_HAT = register("fox_cap", new TrinketItem(new Item.Settings()));
    public static final Item FOX_MASK = register("fox_mask", new TrinketItem(new Item.Settings()));
    public static final Item GLADIATOR_HAT = register("gladiator", new TrinketItem(new Item.Settings()));
    public static final Item HO_HO_HO_HAT = register("ho_ho_ho", new TrinketItem(new Item.Settings()));
    public static final Item ICE_QUEEN_HAT = register("ice_queen", new TrinketItem(new Item.Settings()));
    public static final Item JACK_O_HAT = register("jack_o_hat", new TrinketItem(new Item.Settings()));
    public static final Item JESTER_HAT = register("jester", new TrinketItem(new Item.Settings()));
    public static final Item JINGLE_HAT = register("jingle_hat", new TrinketItem(new Item.Settings()));
    public static final Item KNIGHTS_HELM_HAT = register("knights_helm", new TrinketItem(new Item.Settings()));
    public static final Item KOBOLD_MASK = register("kobold_mask", new TrinketItem(new Item.Settings()));
    public static final Item LENNY_HAT = register("lenny", new TrinketItem(new Item.Settings()));
    public static final Item LIL_SQUIRT_HAT = register("lil_squirt", new TrinketItem(new Item.Settings()));
    public static final Item ORC_CROWN_HAT = register("orc_crown", new TrinketItem(new Item.Settings()));
    public static final Item POWER_TRIP_HAT = register("power_trip", new TrinketItem(new Item.Settings()));
    public static final Item PURPLE_FLORAL_CROWN_HAT = register("purple_floral_crown", new TrinketItem(new Item.Settings()));
    public static final Item SAMURAI_HELM_HAT = register("samurai_helm", new TrinketItem(new Item.Settings()));
    public static final Item SERAPHIM_CROWN_HAT = register("seraphim_crown", new TrinketItem(new Item.Settings()));
    public static final Item SHADOW_STALKER_HAT = register("shadow_stalker", new TrinketItem(new Item.Settings()));
    public static final Item SHADRAX_FINS_HAT = register("shadrax_fins", new TrinketItem(new Item.Settings()));
    public static final Item SNOWSTORM_HOOD_HAT = register("snowstorm_hood", new TrinketItem(new Item.Settings()));
    public static final Item SPORELING_HAT = register("sporeling", new TrinketItem(new Item.Settings()));
    public static final Item VALKYRIE_HELM_HAT = register("valkyrie_helm", new TrinketItem(new Item.Settings()));
    public static final Item WEREWOLF_MASK = register("werewolf_mask", new TrinketItem(new Item.Settings()));

    public static final Item GRAPPLING_HOOK = register("grappling_hook", new GrapplingHookItem(new Item.Settings()));

    // CHARGES
    public static final Item DIRE_CHARGE = register("dire_charge", new Item(new Item.Settings()));
    public static final Item ETHEREAL_CHARGE = register("ethereal_charge", new Item(new Item.Settings()));
    public static final Item MAGIC_CHARGE = register("magic_charge", new Item(new Item.Settings()));
    public static final Item POTENT_CHARGE = register("potent_charge", new Item(new Item.Settings()));

    // PERSONAL ITEMS
    public static final Item CLOSED_ORB = register("closed_orb", new Item(new Item.Settings()));
    public static final Item LIMINAL_LANTERN = register("liminal_lantern", new Item(new Item.Settings()));
    public static final Item GRIM_LANTERN = register("grim_lantern", new Item(new Item.Settings()));

    public static final Item SENTIENT_SPELLBOOK = register("sentient_spellbook", new Item(new Item.Settings()));
    public static final Item CYAN_MACAW_FEATHER = register("cyan_macaw_feather", new Item(new Item.Settings()));

    public static final Item SICKLE = register("sickle", new Item(new Item.Settings()));

    public static final Item LIMBY_FLUTE = register("limby_flute", new GoatHornItem(new Item.Settings().component(DataComponentTypes.INSTRUMENT, Registries.INSTRUMENT.entryOf(Instruments.DREAM_GOAT_HORN)), InstrumentTags.REGULAR_GOAT_HORNS));
    public static final Item VIC_FLUTE = register("vic_flute", new GoatHornItem(new Item.Settings().component(DataComponentTypes.INSTRUMENT, Registries.INSTRUMENT.entryOf(Instruments.SING_GOAT_HORN)), InstrumentTags.REGULAR_GOAT_HORNS));
    public static final Item MEI_FLUTE = register("mei_flute", new GoatHornItem(new Item.Settings().component(DataComponentTypes.INSTRUMENT, Registries.INSTRUMENT.entryOf(GCInstruments.MEI_FLUTE)), InstrumentTags.REGULAR_GOAT_HORNS));

    // PLACEABLES
    public static final Item DEATH_MOTH = register("death_moth", new Item(new Item.Settings()));
    public static final Item SMILER = register("smiler", new Item(new Item.Settings()));
    public static final Item LIMBO = register("limbo", new Item(new Item.Settings()));

    public static HashSet<Item> WANTED_POSTERS_SET = new HashSet<>();

    public static final Item CEDRIC_POSTER = registerWithSet("cedric_poster", new Item(new Item.Settings()), WANTED_POSTERS_SET);
    public static final Item CONVICT_POSTER = registerWithSet("convict_poster", new Item(new Item.Settings()), WANTED_POSTERS_SET);
    public static final Item GRIM_POSTER = registerWithSet("grim_poster", new Item(new Item.Settings()), WANTED_POSTERS_SET);
    public static final Item LANTHUR_POSTER = registerWithSet("lanthur_poster", new Item(new Item.Settings()), WANTED_POSTERS_SET);
    public static final Item LIMBY_POSTER = registerWithSet("limby_poster", new Item(new Item.Settings()), WANTED_POSTERS_SET);
    public static final Item MEI_POSTER = registerWithSet("mei_poster", new Item(new Item.Settings()), WANTED_POSTERS_SET);
    public static final Item RAVNA_POSTER = registerWithSet("ravna_poster", new Item(new Item.Settings()), WANTED_POSTERS_SET);
    public static final Item SILVER_POSTER = registerWithSet("silver_poster", new Item(new Item.Settings()), WANTED_POSTERS_SET);
    public static final Item SPARKLES_POSTER = registerWithSet("sparkles_poster", new Item(new Item.Settings()), WANTED_POSTERS_SET);
    public static final Item VIC_POSTER = registerWithSet("vic_poster", new Item(new Item.Settings()), WANTED_POSTERS_SET);

    // KEYS
    public static final Item BOSS_KEY = register("boss_key", new Item(new Item.Settings()));
    public static final Item BROKEN_KEY = register("broken_key", new Item(new Item.Settings()));
    public static final Item DRACONIC_KEY = register("draconic_key", new Item(new Item.Settings()));
    public static final Item GOLD_KEY = register("gold_key", new Item(new Item.Settings()));
    public static final Item MUTATED_KEY = register("mutated_key", new Item(new Item.Settings()));
    public static final Item RUSTED_KEY = register("rusted_key", new Item(new Item.Settings()));
    public static final Item SILVER_KEY = register("silver_key", new Item(new Item.Settings()));
    public static final Item TAINTED_KEY = register("tainted_key", new Item(new Item.Settings()));
    public static final Item BLACK_KEY = register("black_key", new Item(new Item.Settings()));
    public static final Item BROWN_KEY = register("brown_key", new Item(new Item.Settings()));
    public static final Item RED_KEY = register("red_key", new Item(new Item.Settings()));
    public static final Item ORANGE_KEY = register("orange_key", new Item(new Item.Settings()));
    public static final Item YELLOW_KEY = register("yellow_key", new Item(new Item.Settings()));
    public static final Item LIME_KEY = register("lime_key", new Item(new Item.Settings()));
    public static final Item GREEN_KEY = register("green_key", new Item(new Item.Settings()));
    public static final Item CYAN_KEY = register("cyan_key", new Item(new Item.Settings()));
    public static final Item LIGHT_BLUE_KEY = register("light_blue_key", new Item(new Item.Settings()));
    public static final Item BLUE_KEY = register("blue_key", new Item(new Item.Settings()));
    public static final Item PURPLE_KEY = register("purple_key", new Item(new Item.Settings()));
    public static final Item MAGENTA_KEY = register("magenta_key", new Item(new Item.Settings()));
    public static final Item PINK_KEY = register("pink_key", new Item(new Item.Settings()));

    // MISC
    public static final Item WARP_GEM = register("warp_gem", new Item(new Item.Settings()));
    public static final Item EMBEDDED_GEM = register("embedded_gem", new Item(new Item.Settings()));
    public static final Item COMMUNICATOR = register("communicator", new Item(new Item.Settings()));

    // MOB DROPS
    public static final Item ARTHROPOD_CHUNK = register("arthropod_chunk", new Item(new Item.Settings()));
    public static final Item ARTHROPOD_CHUNK_COOKED = register("arthropod_chunk_cooked", new Item(new Item.Settings()));
    public static final Item COBALT_SCALE = register("cobalt_scale", new Item(new Item.Settings()));
    public static final Item FLESH = register("flesh", new Item(new Item.Settings()));
    public static final Item MUTATION = register("mutation", new Item(new Item.Settings()));
    public static final Item GUMMY_SLIME = register("gummy_slime", new Item(new Item.Settings()));
    public static final Item SPIDER_SILK = register("spider_silk", new Item(new Item.Settings()));
    public static final Item WING = register("wing", new Item(new Item.Settings()));
    public static final Item WITCH_THUMB = register("witch_thumb", new Item(new Item.Settings()));
    public static final Item ZOMBACON = register("zombacon", new Item(new Item.Settings()));
    public static final Item ZOMBIE_LEG = register("zombie_leg", new Item(new Item.Settings()));

    public static final Item FEATHER_FYNYKS = register("feather_fynyks", new Item(new Item.Settings()));
    public static final Item FEATHER_LINI = register("feather_lini", new Item(new Item.Settings()));
    public static final Item FEATHER_PARROT = register("feather_parrot", new Item(new Item.Settings()));

    public static final Item HIDE_BEAR = register("hide_bear", new Item(new Item.Settings()));
    public static final Item HIDE_PANDA = register("hide_panda", new Item(new Item.Settings()));
    public static final Item HIDE_POLAR = register("hide_polar", new Item(new Item.Settings()));
    public static final Item HIDE_CREEPER = register("hide_creeper", new Item(new Item.Settings()));
    public static final Item HIDE_CROCODILE = register("hide_crocodile", new Item(new Item.Settings()));
    public static final Item HIDE_FOX = register("hide_fox", new Item(new Item.Settings()));
    public static final Item HIDE_MONSTER = register("hide_monster", new Item(new Item.Settings()));
    public static final Item HIDE_MOOSHROOM = register("hide_mooshroom", new Item(new Item.Settings()));
    public static final Item HIDE_PHANTOM = register("hide_phantom", new Item(new Item.Settings()));
    public static final Item HIDE_PIG = register("hide_pig", new Item(new Item.Settings()));
    public static final Item HIDE_SNIFFER = register("hide_sniffer", new Item(new Item.Settings()));
    public static final Item HIDE_STRIDER = register("hide_strider", new Item(new Item.Settings()));

    public static final Item TENTACLE_PINK = register("tentacle_pink", new Item(new Item.Settings()));
    public static final Item TENTACLE_SEVERED = register("tentacle_severed", new Item(new Item.Settings()));
    public static final Item TENDRIL_DARK = register("tendril_dark", new Item(new Item.Settings()));
    public static final Item TENDRIL_SCULK = register("tendril_sculk", new Item(new Item.Settings()));

    public static final Item BRAIN = register("brain", new Item(new Item.Settings()));
    public static final Item HEART = register("heart", new Item(new Item.Settings()));
    public static final Item STOMACH = register("stomach", new Item(new Item.Settings()));
    public static final Item EYE = register("eye", new Item(new Item.Settings()));
    public static final Item EYE_INSECTOID = register("eye_insectoid", new Item(new Item.Settings()));
    public static final Item EYE_STRANGE = register("eye_strange", new Item(new Item.Settings()));
    public static final Item EYE_WATCHFUL = register("eye_watchful", new Item(new Item.Settings()));
    public static final Item EYE_WEEPING = register("eye_weeping", new Item(new Item.Settings()));

    public static final Item BONE_BITS = register("bone_bits", new Item(new Item.Settings()));
    public static final Item BONE_CARBON = register("bone_carbon", new Item(new Item.Settings()));
    public static final Item BONE_DOG = register("bone_dog", new Item(new Item.Settings()));
    public static final Item BONE_RIBS = register("bone_ribs", new Item(new Item.Settings()));
    public static final Item BONE_SPINE = register("bone_spine", new Item(new Item.Settings()));

    public static final Item ANIMAL_TEETH = register("animal_teeth", new Item(new Item.Settings()));
    public static final Item TOOTH = register("tooth", new Item(new Item.Settings()));
    public static final Item FANGS_SHARP = register("fangs_sharp", new Item(new Item.Settings()));
    public static final Item FANGS_DULL = register("fangs_dull", new Item(new Item.Settings()));
    public static final Item UNICORN_HORN = register("unicorn_horn", new Item(new Item.Settings()));

    public static final Item SKULL_DENTED = register("skull_dented", new Item(new Item.Settings()));
    public static final Item SKULL_EMPTY = register("skull_empty", new Item(new Item.Settings()));
    public static final Item SKULL_GUYS = register("skull_guys", new Item(new Item.Settings()));
    public static final Item SKULL_JAWLESS = register("skull_jawless", new Item(new Item.Settings()));
    public static final Item SKULL_JIM = register("skull_jim", new Item(new Item.Settings()));
    public static final Item SKULL_LAUGH = register("skull_laugh", new Item(new Item.Settings()));

    // LOOT ITEMS
    public static HashSet<Item> RING_SET = new HashSet<>();
    public static HashSet<Item> BRACELET_SET = new HashSet<>();
    public static HashSet<Item> NECKLACE_SET = new HashSet<>();

    public static final Item BIXBITE_RING = registerWithSet("bixbite_ring", new TrinketItem(new Item.Settings()), RING_SET);
    public static final Item BRASS_RING = registerWithSet("brass_ring", new TrinketItem(new Item.Settings()), RING_SET);
    public static final Item CHALCEDONY_RING = registerWithSet("chalcedony_ring", new TrinketItem(new Item.Settings()), RING_SET);
    public static final Item CITRINE_RING = registerWithSet("citrine_ring", new TrinketItem(new Item.Settings()), RING_SET);
    public static final Item GARNET_RING = registerWithSet("garnet_ring", new TrinketItem(new Item.Settings()), RING_SET);
    public static final Item JASPER_RING = registerWithSet("jasper_ring", new TrinketItem(new Item.Settings()), RING_SET);
    public static final Item PEARL_RING = registerWithSet("pearl_ring", new TrinketItem(new Item.Settings()), RING_SET);
    public static final Item PERIDOT_RING = registerWithSet("peridot_ring", new TrinketItem(new Item.Settings()), RING_SET);
    public static final Item ROSE_RING = registerWithSet("rose_ring", new TrinketItem(new Item.Settings()), RING_SET);
    public static final Item SILVER_RING = registerWithSet("silver_ring", new TrinketItem(new Item.Settings()), RING_SET);
    public static final Item SODALITE_RING = registerWithSet("sodalite_ring", new TrinketItem(new Item.Settings()), RING_SET);
    public static final Item TOPAZ_RING = registerWithSet("topaz_ring", new TrinketItem(new Item.Settings()), RING_SET);
    public static final Item YELLOW_DRAVITE_RING = registerWithSet("yellow_dravite_ring", new TrinketItem(new Item.Settings()), RING_SET);
    public static final Item ZIRCON_RING = registerWithSet("zircon_ring", new TrinketItem(new Item.Settings()), RING_SET);

    public static final Item ENGAGEMENT_RING = registerWithSet("engagement_ring", new TrinketItem(new Item.Settings()), RING_SET);
    public static final Item WEDDING_BAND = registerWithSet("wedding_band", new TrinketItem(new Item.Settings()), RING_SET);

    public static final Item CLAW_NECKLACE = registerWithSet("claw_necklace", new TrinketItem(new Item.Settings()), NECKLACE_SET);
    public static final Item DEW_DROP = registerWithSet("dew_drop", new TrinketItem(new Item.Settings()), NECKLACE_SET);
    public static final Item HOLY_PENDANT = registerWithSet("holy_pendant", new TrinketItem(new Item.Settings()), NECKLACE_SET);
    public static final Item STAR_FRAGMENT = registerWithSet("star_fragment", new TrinketItem(new Item.Settings()), NECKLACE_SET);
    public static final Item STAR_PENDANT = registerWithSet("star_pendant", new TrinketItem(new Item.Settings()), NECKLACE_SET);
    public static final Item SUN_FRAGMENT = registerWithSet("sun_fragment", new TrinketItem(new Item.Settings()), NECKLACE_SET);
    public static final Item TOOTH_NECKLACE = registerWithSet("tooth_necklace", new TrinketItem(new Item.Settings()), NECKLACE_SET);

    public static final Item GORONS_TEAR = registerWithSet("gorons_tear", new TrinketItem(new Item.Settings()), NECKLACE_SET);
    public static final Item MERMAIDS_TEAR = registerWithSet("mermaids_tear", new TrinketItem(new Item.Settings()), NECKLACE_SET);
    public static final Item MOONS_TEAR = registerWithSet("moons_tear", new TrinketItem(new Item.Settings()), NECKLACE_SET);
    public static final Item SUNS_TEAR = registerWithSet("suns_tear", new TrinketItem(new Item.Settings()), NECKLACE_SET);
    public static final Item ZORAS_TEAR = registerWithSet("zoras_tear", new TrinketItem(new Item.Settings()), NECKLACE_SET);

    public static final Item GOLD_BAND = registerWithSet("gold_band", new TrinketItem(new Item.Settings()), BRACELET_SET);
    public static final Item IRON_BAND = registerWithSet("iron_band", new TrinketItem(new Item.Settings()), BRACELET_SET);
    public static final Item LEATHER_BANGLE = registerWithSet("leather_bangle", new TrinketItem(new Item.Settings()), BRACELET_SET);
    public static final Item LEATHER_BRACER = registerWithSet("leather_bracer", new TrinketItem(new Item.Settings()), BRACELET_SET);
    public static final Item MYTHRIL_BANGLE = registerWithSet("mythril_bangle", new TrinketItem(new Item.Settings()), BRACELET_SET);
    public static final Item MYTHRIL_BAND = registerWithSet("mythril_band", new TrinketItem(new Item.Settings()), BRACELET_SET);

    public static final Item EMERALD_BANGLE = registerWithSet("emerald_bangle", new TrinketItem(new Item.Settings()), BRACELET_SET);
    public static final Item EMERALD_BRACER = registerWithSet("emerald_bracer", new TrinketItem(new Item.Settings()), BRACELET_SET);
    public static final Item EMERALD_PENDANT = registerWithSet("emerald_pendant", new TrinketItem(new Item.Settings()), NECKLACE_SET);
    public static final Item EMERALD_RING = registerWithSet("emerald_ring", new TrinketItem(new Item.Settings()), RING_SET);

    public static final Item RUBY_BANGLE = registerWithSet("ruby_bangle", new TrinketItem(new Item.Settings()), BRACELET_SET);
    public static final Item RUBY_BRACER = registerWithSet("ruby_bracer", new TrinketItem(new Item.Settings()), BRACELET_SET);
    public static final Item RUBY_PENDANT = registerWithSet("ruby_pendant", new TrinketItem(new Item.Settings()), NECKLACE_SET);

    public static final Item SAPPHIRE_BANGLE = registerWithSet("sapphire_bangle", new TrinketItem(new Item.Settings()), BRACELET_SET);
    public static final Item SAPPHIRE_BRACER = registerWithSet("sapphire_bracer", new TrinketItem(new Item.Settings()), BRACELET_SET);
    public static final Item SAPPHIRE_PENDANT = registerWithSet("sapphire_pendant", new TrinketItem(new Item.Settings()), NECKLACE_SET);

    public static final Item VERDANT_BRACELET = registerWithSet("verdant_bracelet", new TrinketItem(new Item.Settings()), BRACELET_SET);
    public static final Item VERDANT_BRACER = registerWithSet("verdant_bracer", new TrinketItem(new Item.Settings()), BRACELET_SET);
    public static final Item VERDANT_NECKLACE = registerWithSet("verdant_necklace", new TrinketItem(new Item.Settings()), NECKLACE_SET);
    public static final Item VERDANT_PENDANT = registerWithSet("verdant_pendant", new TrinketItem(new Item.Settings()), NECKLACE_SET);
    public static final Item VERDANT_RING = registerWithSet("verdant_ring", new TrinketItem(new Item.Settings()), RING_SET);
    public static final Item VERDANT_BAND = registerWithSet("verdant_band", new TrinketItem(new Item.Settings()), RING_SET);

    // COINS
    public static final Item COPPER_COIN = register("copper_coin", new Item(new Item.Settings()));
    public static final Item SILVER_COIN = register("silver_coin", new Item(new Item.Settings()));
    public static final Item GOLD_COIN = register("gold_coin", new Item(new Item.Settings()));

    // GIZMOS
    public static final Item CAMERA = register("camera", new Item(new Item.Settings()));
    public static final Item CANISTER_REINFORCED = register("canister_reinforced", new Item(new Item.Settings()));
    public static final Item CAPACITOR = register("capacitor", new Item(new Item.Settings()));
    public static final Item CARD = register("card", new Item(new Item.Settings()));
    public static final Item CERAMIC_FUSE = register("ceramic_fuse", new Item(new Item.Settings()));
    public static final Item CIRCUIT_BOARD = register("circuit_board", new Item(new Item.Settings()));
    public static final Item COIL = register("coil", new Item(new Item.Settings()));
    public static final Item COMPOSITE_PLATING = register("composite_plating", new Item(new Item.Settings()));
    public static final Item DIODE = register("diode", new Item(new Item.Settings()));
    public static final Item ELECTRIC_MOTOR = register("electric_motor", new Item(new Item.Settings()));
    public static final Item ELECTRICAL_CABLES = register("electrical_cables", new Item(new Item.Settings()));
    public static final Item GEAR_BUSHING = register("gear_bushing", new Item(new Item.Settings()));
    public static final Item GEAR_STEEL = register("gear_steel", new Item(new Item.Settings()));
    public static final Item GEAR_BRONZE = register("gear_bronze", new Item(new Item.Settings()));
    public static final Item HEAT_SINK = register("heat_sink", new Item(new Item.Settings()));
    public static final Item INPUT_SELECTOR = register("input_selector", new Item(new Item.Settings()));
    public static final Item INSULATION_CERAMIC = register("insulation_ceramic", new Item(new Item.Settings()));
    public static final Item LAMINATED_COIL = register("laminated_coil", new Item(new Item.Settings()));
    public static final Item LIGHTBULB = register("lightbulb", new Item(new Item.Settings()));
    public static final Item MECHANISM_COMPLEX = register("mechanism_complex", new Item(new Item.Settings()));
    public static final Item MECHANISM_SIMPLE = register("mechanism_simple", new Item(new Item.Settings()));
    public static final Item METAL_BAR = register("metal_bar", new Item(new Item.Settings()));
    public static final Item METAL_SCRAP = register("metal_scrap", new Item(new Item.Settings()));
    public static final Item MOTOR = register("motor", new Item(new Item.Settings()));
    public static final Item OBSIDIAN_STICK = register("obsidian_stick", new Item(new Item.Settings()));
    public static final Item OPERATIONAL_AMPLIFIERS = register("operational_amplifiers", new Item(new Item.Settings()));
    public static final Item PIPE_WATERPROOF = register("pipe_waterproof", new Item(new Item.Settings()));
    public static final Item PISTON_CASING = register("piston_casing", new Item(new Item.Settings()));
    public static final Item PISTON_DISK = register("piston_disk", new Item(new Item.Settings()));
    public static final Item PISTON_PARTS = register("piston_parts", new Item(new Item.Settings()));
    public static final Item PISTON_ROD = register("piston_rod", new Item(new Item.Settings()));
    public static final Item PLATE_BRONZE = register("plate_bronze", new Item(new Item.Settings()));
    public static final Item PLATE_STEEL = register("plate_steel", new Item(new Item.Settings()));
    public static final Item PLATE_TITANIUM = register("plate_titanium", new Item(new Item.Settings()));
    public static final Item RAM_CHIP = register("ram_chip", new Item(new Item.Settings()));
    public static final Item RESISTOR = register("resistor", new Item(new Item.Settings()));
    public static final Item RESONATOR = register("resonator", new Item(new Item.Settings()));
    public static final Item ROUTING_TICKET = register("routing_ticket", new Item(new Item.Settings()));
    public static final Item RUSTED_METAL_SHEET = register("rusted_metal_sheet", new Item(new Item.Settings()));
    public static final Item SAW_IRON = register("saw_iron", new Item(new Item.Settings()));
    public static final Item SCREW = register("screw", new Item(new Item.Settings()));
    public static final Item SKELETON_KEY = register("skeleton_key", new Item(new Item.Settings()));
    public static final Item SMALL_DIODE = register("small_diode", new Item(new Item.Settings()));
    public static final Item SMALL_SCREW = register("small_screw", new Item(new Item.Settings()));
    public static final Item SOLDERING_IRON = register("soldering_iron", new Item(new Item.Settings()));
    public static final Item SSD = register("ssd", new Item(new Item.Settings()));
    public static final Item TITANIUM_HEAT_COIL = register("titanium_heat_coil", new Item(new Item.Settings()));
    public static final Item TOOL_SPIKE_MAUL_STEEL = register("tool_spike_maul_steel", new Item(new Item.Settings()));
    public static final Item TOROID_COIL = register("toroid_coil", new Item(new Item.Settings()));
    public static final Item TRACK_PARTS = register("track_parts", new Item(new Item.Settings()));
    public static final Item TRACK_SPIKE = register("track_spike", new Item(new Item.Settings()));
    public static final Item TRAIN_WHEEL_BIG = register("train_wheel_big", new Item(new Item.Settings()));
    public static final Item TRAIN_WHEEL_SMALL = register("train_wheel_small", new Item(new Item.Settings()));
    public static final Item TRANSFORMER = register("transformer", new Item(new Item.Settings()));
    public static final Item TUBE_NORMAL = register("tube_normal", new Item(new Item.Settings()));
    public static final Item TUBE_ONE_WAY = register("tube_one_way", new Item(new Item.Settings()));
    public static final Item TUBE_VALVE = register("tube_valve", new Item(new Item.Settings()));
    public static final Item VEHICLE_KEY = register("vehicle_key", new Item(new Item.Settings()));
    public static final Item WIRES = register("wires", new Item(new Item.Settings()));
    public static final Item WRENCH = register("wrench", new Item(new Item.Settings()));

    public static void initialize() {
        ArcherItems.initialize();
        AssassinItems.initialize();
        MageItems.initialize();
        ShamanItems.initialize();
        WarriorItems.initialize();
        ElytraItems.initialize();

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK)
                .register((itemGroup) -> itemGroup.addAfter(Items.PUMPKIN_PIE, GCItems.CHOCOLATE));
    }

    public static Item register(String id, Item item) {
        Identifier modItemID = Identifier.of(MOD_ID, id);

        LOGGER.info("[GHOSTCRAFT] Registering {}...", id);

        return Registry.register(Registries.ITEM, modItemID, item);
    }

    public static Item registerWithSet(String id, Item item, HashSet<Item> set) {
        Item registeredItem = register(id, item);

        set.add(registeredItem);

        return registeredItem;
    }
}
