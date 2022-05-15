package net.chukkthedukk.heelermod.item;

import net.chukkthedukk.heelermod.HeelerMod;
import net.chukkthedukk.heelermod.entity.ModEntities;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item HEELER_SPAWN_EGG = registerItem("heeler_spawn_egg",
            new SpawnEggItem(ModEntities.HEELER,0x948e8d, 0x3b3635,
                    new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(HeelerMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        HeelerMod.LOGGER.info("Registering Mod Items for " + HeelerMod.MOD_ID);
    }
}

