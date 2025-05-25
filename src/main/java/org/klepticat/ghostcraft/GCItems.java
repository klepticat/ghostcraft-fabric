package org.klepticat.ghostcraft;

import dev.emi.trinkets.api.TrinketItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.klepticat.ghostcraft.item.*;

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
        //</editor-fold>
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
                        10.0f,
                        ((short) 600),
                        20,
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNIQUE)
                )
        );
        public static final Item ARC_OF_THE_TUNDRA = register(
                "arc_of_the_tundra",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
                )
        );
        public static final Item ASSASSINS_LANTERN = register(
                "assassins_lantern",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNIQUE)
                )
        );
        public static final Item ATL = register(
                "atl",
                new RelikItem(
                        5.0f,
                        ((short) 600),
                        20,
                        StatusEffects.RESISTANCE,
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
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
                )
        );
        public static final Item ATLLANT = register(
                "atllant",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
                )
        );
        public static final Item ATLLANTRIUS = register(
                "atllantrius",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
                )
        );
        public static final Item BLAZING_TOTEM = register(
                "blazing_totem",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
                )
        );
        public static final Item BLIZZARD_TOTEM = register(
                "blizzard_totem",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
                )
        );
        public static final Item BLOOD_MOON = register(
                "blood_moon",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.LEGENDARY)
                )
        );
        public static final Item BONE_CHILL_TOTEM = register(
                "bone_chill_totem",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        StatusEffects.FIRE_RESISTANCE,
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
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.COMMON)
                )
        );
        public static final Item CANDLEKEEPERS_ANCHOR = register(
                "candlekeepers_anchor",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
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
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
                )
        );
        public static final Item CHOKE_HOLD = register(
                "choke_hold",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
                )
        );
        public static final Item CLOCKWORK_SUMMONER = register(
                "clockwork_summoner",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
                )
        );
        public static final Item COGWORK_TOTEM = register(
                "cogwork_totem",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
                )
        );
        public static final Item DEVILS_ANCHOR = register(
                "devils_anchor",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
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
                        StatusEffects.FIRE_RESISTANCE,
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
                        StatusEffects.FIRE_RESISTANCE,
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
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
                )
        );
        public static final Item ELTORVURIA_TOTEM = register(
                "eltorvuria_totem",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.LEGENDARY)
                )
        );
        public static final Item FALLEN_FALSE_GOD = register(
                "fallen_false_god",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
                )
        );
        public static final Item FEATHERED_TOTEM = register(
                "feathered_totem",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
                )
        );
        public static final Item FLEDGED_TOTEM = register(
                "fledged_totem",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
                )
        );
        public static final Item FLIGHT_TOTEM = register(
                "flight_totem",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
                )
        );
        public static final Item FOSSILIZED_TOTEM = register(
                "fossilized_totem",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
                )
        );
        public static final Item FROSTMOURN_TOTEM = register(
                "frostmourn_totem",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        StatusEffects.FIRE_RESISTANCE,
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
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.COMMON)
                )
        );
        public static final Item FYNYKS_FLAME = register(
                "fynyks_flame",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
                )
        );
        public static final Item GADGET = register(
                "gadget",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
                )
        );
        public static final Item GEOMANCERS_TOTEM = register(
                "geomancers_totem",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
                )
        );
        public static final Item GLITCH = register(
                "glitch",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.LEGENDARY)
                )
        );
        public static final Item GOLD_THORN_TOTEM = register(
                "gold_thorn_totem",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
                )
        );
        public static final Item GOLDEN_TOTEM = register(
                "golden_totem",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
                )
        );
        public static final Item HOLY_CRUCIBLE = register(
                "holy_crucible",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        StatusEffects.FIRE_RESISTANCE,
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
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
                )
        );
        public static final Item ICICLE_TOTEM = register(
                "icicle_totem",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
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
                        10.0f,
                        ((short) 600),
                        20,
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
                )
        );
        public static final Item JACKS_POST = register(
                "jacks_post",
                new RelikItem(
                        10.0f,
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
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
                )
        );
        public static final Item MATURED_TOTEM = register(
                "matured_totem",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
                )
        );
        public static final Item NIGHTS_GUIDE = register(
                "nights_guide",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
                )
        );
        public static final Item PERMAFROST_SIGIL = register(
                "permafrost_sigil",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        StatusEffects.FIRE_RESISTANCE,
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
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
                )
        );
        public static final Item PUPPET_OF_THE_TRICKSTER = register(
                "puppet_of_the_trickster",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
                )
        );
        public static final Item RUBY_CRESTED_TOTEM = register(
                "ruby_crested_totem",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        StatusEffects.FIRE_RESISTANCE,
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
                        StatusEffects.FIRE_RESISTANCE,
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
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
                )
        );
        public static final Item SAKURA_GROVE_WAND = register(
                "sakura_grove_wand",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNIQUE)
                )
        );
        public static final Item SENTRY_TOWER = register(
                "sentry_tower",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
                )
        );
        public static final Item SERAPHIM_TOTEM = register(
                "seraphim_totem",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNIQUE)
                )
        );
        public static final Item SHADRAXS_PROTECTION = register(
                "shadraxs_protection",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
                )
        );
        public static final Item SHIPWRIGHT_TOTEM = register(
                "shipwright_totem",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
                )
        );
        public static final Item SIGIL_OF_SEALING = register(
                "sigil_of_sealing",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
                )
        );
        public static final Item SILS_DARK_MOON = register(
                "sils_dark_moon",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.LEGENDARY)
                )
        );
        public static final Item SILK_WEAVERS_CAGE = register(
                "silk_weavers_cage",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
                )
        );
        public static final Item SIMPLE_TOTEM = register(
                "simple_totem",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        StatusEffects.FIRE_RESISTANCE,
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
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
                )
        );
        public static final Item SORROWFUL_ANGEL = register(
                "sorrowful_angel",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
                )
        );
        public static final Item SOUL_KEEPERS_CAGE = register(
                "soul_keepers_cage",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
                )
        );
        public static final Item SPARKING_TOTEM = register(
                "sparking_totem",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
                )
        );
        public static final Item TIME_REWINDER = register(
                "time_rewinder",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
                )
        );
        public static final Item TIORVAS_PASSION = register(
                "tiorvas_passion",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.LEGENDARY)
                )
        );
        public static final Item TORRENT = register(
                "torrent",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNIQUE)
                )
        );
        public static final Item TRIBUNAL_TOTEM = register(
                "tribunal_totem",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.RARE)
                )
        );
        public static final Item VIGINERE = register(
                "viginere",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.UNIQUE)
                )
        );
        public static final Item VOODOO_VENGEANCE = register(
                "voodoo_vengeance",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
                        new Item.Settings().component(GCDataComponents.GC_RARITY, ExtendedRarity.EPIC)
                )
        );
        public static final Item WINGED_RUBY_TOTEM = register(
                "winged_ruby_totem",
                new RelikItem(
                        10.0f,
                        ((short) 600),
                        20,
                        StatusEffects.FIRE_RESISTANCE,
                        (byte) 0,
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

    public static final Item REFLECTING_NECKLACE = register("reflecting_necklace", new AttributeTrinketItem(new Item.Settings(), StatusEffects.RESISTANCE, 2));


    // CHARGES
    public static final Item DIRE_CHARGE = register("dire_charge", new Item(new Item.Settings()));
    public static final Item ETHEREAL_CHARGE = register("ethereal_charge", new Item(new Item.Settings()));
    public static final Item MAGIC_CHARGE = register("magic_charge", new Item(new Item.Settings()));
    public static final Item POTENT_CHARGE = register("potent_charge", new Item(new Item.Settings()));

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
}
