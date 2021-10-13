package com.LockOriginalMods.tutorialmod.list;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.LockOriginalMods.tutorialmod.TutorialMod.CUSTOMFANTASY_GROUP;
import static com.LockOriginalMods.tutorialmod.TutorialMod.MOD_ID;
import static net.minecraft.world.item.CreativeModeTab.TAB_BUILDING_BLOCKS;

public class ItemList {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);

    public static final RegistryObject<Item> NEZERITE = ITEMS.register("nezerite_crop", () -> new BlockItem(BlockList.NEZERITE_BUSH.get(), new Item.Properties().tab(CUSTOMFANTASY_GROUP)));

}
