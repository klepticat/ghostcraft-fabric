package org.klepticat.ghostcraft;

import dev.emi.trinkets.api.TrinketItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.klepticat.ghostcraft.item.*;

import static org.klepticat.ghostcraft.GhostCraft.LOGGER;
import static org.klepticat.ghostcraft.GhostCraft.MOD_ID;

public class AllItems {
    // WEAPONS
    static class AssassinItems {
        public static void initialize() {};

        public static final Item ASSASSINS_NUNCHUCKS = register("assassins_nunchucks", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item BLOSSOM_SWORD = register("blossom_sword", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item BONE_CHILL_BLADE = register("bone_chill_blade", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item BURNING_KNIFE = register("burning_knife", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item CANDLEKEEPERS_DIRK = register("candlekeepers_dirk", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item CHILDS_COMPANION = register("childs_companion", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item CLAW_GRIPPERS = register("claw_grippers", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item COGWORK_BONESAW = register("cogwork_bonesaw", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item CORRUPTED = register("corrupted", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item CRESTED_LIFE_TAKER = register("crested_life_taker", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item CYBERLIFE = register("cyberlife", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item DAMNED_BLADE = register("damned_blade", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item DEVILS_MAKER = register("devils_maker", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item DREAM_RIPPER = register("dream_ripper", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item DRUMSTICK = register("drumstick", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item ELTORVURIA_BLADE = register("eltorvuria_blade", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item ELVURS_SPITE = register("elvurs_spite", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item EMERALD_CLAYMORE = register("emerald_claymore", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item FERRYMANS_BARGAIN = register("ferrymans_bargain", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item FOSSILIZED_KNIFE = register("fossilized_knife", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item FROSTMOURN_CLAYMORE = register("frostmourn_claymore", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item GARDEN_HOE = register("garden_hoe", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item GEOMANCERS_ARCHAEOLOGY_MITT = register("geomancers_archaeology_mitt", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item GOLDEN_PICK = register("golden_pick", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item GRIPPERS = register("grippers", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item HOOK = register("hook", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item ICE_PICK = register("ice_pick", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item IGNITED_KNIFE = register("ignited_knife", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item INFECTED_HEROS_BLADE = register("infected_heros_blade", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item IRONHOLM_BLADE = register("ironholm_blade", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item JACKS_CRESCENT = register("jacks_crescent", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item MAGENTA_MAYHEM = register("magenta_mayhem", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item MEEPER = register("meeper", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item MONTY = register("monty", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item PERCOLATION = register("percolation", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item PERMAFROST_BLADE = register("permafrost_blade", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item POKIN_STICK = register("pokin_stick", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item PRIDES_DANCE = register("prides_dance", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item PUZZLING_KNIFE = register("puzzling_knife", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item RAKKU_KUNAI = register("rakku_kunai", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item RELIC_BLADE = register("relic_blade", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item ROOKIE_KNIFE = register("rookie_knife", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item RUBY_CRESTED_SHORTSWORD = register("ruby_crested_shortsword", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item RUINED_BLADE = register("ruined_blade", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item SAXOPHONE = register("saxophone", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item SENTRY_GRASP = register("sentry_grasp", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item SERAPHIM_SWORD = register("seraphim_sword", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item SERPENTINE_SLICER = register("serpentine_slicer", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item SHADEKIN_RAPIER = register("shadekin_rapier", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item SILS_CLAW = register("sils_claw", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item SIMPLE_KATANA = register("simple_katana", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item SIPHON = register("siphon", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item SOUL_STEALER = register("soul_stealer", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item TEMPEST_TORRENT = register("tempest_torrent", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item THIEFS_KNIFE = register("thiefs_knife", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item TIORVAS_EMPATHY = register("tiorvas_empathy", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item UNDERDARK_UNDERTAKER = register("underdark_undertaker", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item UNDYING_LIGHT = register("undying_light", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item VENOM_FANG = register("venom_fang", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item VOODOO_VENGEANCE = register("voodoo_vengeance", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item WILD_WANDERERS_CLAW = register("wild_wanderers_claw", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item WOLVERINE_GRIPPERS = register("wolverine_grippers", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item WOODEN_GAUNTLET = register("wooden_gauntlet", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
    }

    static class MageItems {
        public static void initialize() {};

        public static final Item FUNKY_STICK = register("funky_stick", new MagicWeaponItem(
                MagicType.POTENT,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        1,
                        -1.6f
                ))
        ));
        public static final Item you_cant_see_this = register("you_cant_see_this", new MagicWeaponItem(
                MagicType.DIRE,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        6,
                        -2.0f
                ))
        ));
    }

    static class ShamanItems {
        public static void initialize() {};

        public static final Item ATL = register("atl", new RelikItem(new Item.Settings()));
        public static final Item JACKS_POST = register("jacks_post", new RelikItem(new Item.Settings()));
    }

    static class WarriorItems {
        public static void initialize() {};

        public static final Item BANANA = register("banana", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(AllDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item BARDS_REQUIME = register("bards_requime", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(AllDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item BLAZING_SPEAR = register("blazing_spear", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(AllDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
        ));
        public static final Item BLOSSOM_SPEAR = register("blossom_spear", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        4,
                        -2.0f
                )).component(AllDataComponents.GC_RARITY, ExtendedRarity.UNIQUE)
        ));
        public static final Item BONE_CHILL_SCYTHE = register("bone_chill_scythe", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        4,
                        -2.0f
                )).component(AllDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item CANDLEKEEPERS_WARHAMMER = register("candlekeepers_warhammer", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(AllDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item COGWORK_SPEAR = register("cogwork_spear", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(AllDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
        ));
        public static final Item CREST_OF_CONQUEST = register("crest_of_conquest", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(AllDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item CRYSTAL_SPEAR = register("crystal_spear", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(AllDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item DEATHS_RESPITE = register("deaths_respite", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        4,
                        -2.0f
                )).component(AllDataComponents.GC_RARITY, ExtendedRarity.UNIQUE)
        ));
        public static final Item DEVILS_CONQUEST = register("devils_conquest", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(AllDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item DOUBLE_EDGE = register("double_edge", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(AllDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item EMERALD_SPEAR = register("emerald_spear", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(AllDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item ERROR = register("error", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(AllDataComponents.GC_RARITY, ExtendedRarity.LEGENDARY)
        ));
        public static final Item ELVURS_MIGHT = register("elvurs_might", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(AllDataComponents.GC_RARITY, ExtendedRarity.LEGENDARY)
        ));
        public static final Item FELDIRS_FORK = register("feldirs_fork", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(AllDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item FELDIRS_JAVELIN = register("feldirs_javelin", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(AllDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item FELDIRS_TRIDENT = register("feldirs_trident", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(AllDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item FJORD_AXE = register("fjord_axe", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(AllDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item FORKED_SPEAR = register("forked_spear", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(AllDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
        ));
        public static final Item FOSSILIZED_SPEAR = register("fossilized_spear", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(AllDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item FROSTMOURN_SPEAR = register("frostmourn_spear", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(AllDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item FYNYKS_HAMMER = register("fynyks_hammer", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        10,
                        -3.0f
                )).component(AllDataComponents.GC_RARITY, ExtendedRarity.LEGENDARY)
        ));
        public static final Item GLORY_OF_VALOR = register("glory_of_valor", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(AllDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item GOLDEN_SPEAR = register("golden_spear", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(AllDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item IGNITED_SPEAR = register("ignited_spear", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(AllDataComponents.GC_RARITY, ExtendedRarity.COMMON)
        ));
        public static final Item ILLUMINATOR = register("illuminator", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        4,
                        -2.0f
                )).component(AllDataComponents.GC_RARITY, ExtendedRarity.UNIQUE)
        ));
        public static final Item JOLT_SPEAR = register("jolt_spear", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(AllDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item JACKS_BANE = register("jacks_bane", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        4,
                        -2.0f
                )).component(AllDataComponents.GC_RARITY, ExtendedRarity.UNIQUE)
        ));
        public static final Item LIMINS_LANCE = register("limins_lance", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(AllDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
        ));
        public static final Item MAKESHIFT_AXE = register("makeshift_axe", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(AllDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
        ));
        public static final Item GEOMANCERS_MALLET_OF_SHATTERING = register("geomancers_mallet_of_shattering", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(AllDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item MALLET_OF_THE_VALE = register("mallet_of_the_vale", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(AllDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item OLD_RAKE = register("old_rake", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(AllDataComponents.GC_RARITY, ExtendedRarity.COMMON)
        ));
        public static final Item PADDLE_OF_TIDES = register("paddle_of_tides", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(AllDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
        ));
        public static final Item PERMAFROST_SPEAR = register("permafrost_spear", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(AllDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item PHARAOHS_SPEAR = register("pharaohs_spear", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(AllDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item RAKKU_HEART_RIPPER = register("rakku_heart_ripper", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(AllDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item RUBY_CRESTED_GREATBLADE = register("ruby_crested_greatblade", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(AllDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item SERAPHIM_SPEAR = register("seraphim_spear", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        4,
                        -2.0f
                )).component(AllDataComponents.GC_RARITY, ExtendedRarity.UNIQUE)
        ));
        public static final Item SHADEKIN_SPEAR = register("shadekin_spear", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(AllDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item SILS_REVENGE = register("sils_revenge", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        8,
                        -2.0f
                )).component(AllDataComponents.GC_RARITY, ExtendedRarity.LEGENDARY)
        ));
        public static final Item SIMPLE_GLAIVE = register("simple_glaive", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(AllDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
        ));
        public static final Item SIMPLE_HAMMER = register("simple_hammer", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(AllDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
        ));
        public static final Item SIMPLE_SCYTHE = register("simple_scythe", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(AllDataComponents.GC_RARITY, ExtendedRarity.UNCOMMON)
        ));
        public static final Item SIMPLE_SPEAR = register("simple_spear", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(AllDataComponents.GC_RARITY, ExtendedRarity.COMMON)
        ));
        public static final Item SKEWER = register("skewer", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(AllDataComponents.GC_RARITY, ExtendedRarity.COMMON)
        ));
        public static final Item SOUL_TAKER = register("soul_taker", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(AllDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item SOULDIERS_HALBERD = register("souldiers_halberd", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(AllDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item TEMPEST_GLAIVE = register("tempest_glaive", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(AllDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item TIMES_END = register("times_end", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(AllDataComponents.GC_RARITY, ExtendedRarity.EPIC)
        ));
        public static final Item TIORVAS_EMBRACE = register("tiorvas_embrace", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(AllDataComponents.GC_RARITY, ExtendedRarity.LEGENDARY)
        ));
        public static final Item TRIDENT_OF_TROUBLES = register("trident_of_troubles", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(AllDataComponents.GC_RARITY, ExtendedRarity.RARE)
        ));
        public static final Item TRUSTED_STEED = register("trusted_steed", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(AllDataComponents.GC_RARITY, ExtendedRarity.COMMON)
        ));
        public static final Item ZEPHYRS_GALE = register("zephyrs_gale", new MeleeWeaponItem(
                ToolMaterials.WOOD,
                new Item.Settings().attributeModifiers(MeleeWeaponItem.createAttributeModifiers(
                        ToolMaterials.WOOD,
                        3,
                        -2.4f
                )).component(AllDataComponents.GC_RARITY, ExtendedRarity.RARE   )
        ));
    }



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
    public static final Item CENTURION_HAND_FAN_HAT = register("centurion_hand_fan", new TrinketItem(new Item.Settings()));
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
    public static final Item OBSERVER_HAT = register("observer", new TrinketItem(new Item.Settings()));
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

    public static final Item REFLECTING_NECKLACE = register("reflecting_necklace", new AttributeTrinketItem(new Item.Settings(), StatusEffects.RESISTANCE, 2));


    // CHARGES
    public static final Item DIRE_CHARGE = register("dire_charge", new Item(new Item.Settings()));
    public static final Item ETHEREAL_CHARGE = register("ethereal_charge", new Item(new Item.Settings()));
    public static final Item MAGIC_CHARGE = register("magic_charge", new Item(new Item.Settings()));
    public static final Item POTENT_CHARGE = register("potent_charge", new Item(new Item.Settings()));

    public static void initialize() {
        AssassinItems.initialize();
        MageItems.initialize();
        ShamanItems.initialize();
        WarriorItems.initialize();

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK)
                .register((itemGroup) -> {
                    itemGroup.addAfter(Items.PUMPKIN_PIE, AllItems.CHOCOLATE);
                });
    }

    public static Item register(String id, Item item) {
        Identifier modItemID = Identifier.of(MOD_ID, id);

        LOGGER.info("[GHOSTCRAFT] Registering {}...", id);

        return Registry.register(Registries.ITEM, modItemID, item);
    }
}
