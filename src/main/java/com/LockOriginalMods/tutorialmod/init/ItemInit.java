package com.LockOriginalMods.tutorialmod.init;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.LockOriginalMods.tutorialmod.TutorialMod.MOD_ID;
import static net.minecraft.world.item.CreativeModeTab.TAB_MATERIALS;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);

    public static final RegistryObject<Item> IRON_DUST = ITEMS.register("iron_dust", () -> new Item(new Item.Properties().tab(TAB_MATERIALS)));

    public static final RegistryObject<Item> SLATE_BRICK = ITEMS.register("slate_brick", () -> new BlockItem(BlockInit.SLATE_BRICK.get(),new Item.Properties().tab(TAB_MATERIALS)));
}
