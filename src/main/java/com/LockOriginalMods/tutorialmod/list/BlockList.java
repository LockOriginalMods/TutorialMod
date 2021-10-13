package com.LockOriginalMods.tutorialmod.list;


import com.LockOriginalMods.tutorialmod.objects.blocks.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import javax.tools.Tool;

import static com.LockOriginalMods.tutorialmod.TutorialMod.MOD_ID;


public class BlockList {


    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);

    public static final DeferredRegister<Block> NO_ITEM_BLOCK = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);

    public static final RegistryObject<Block> NEZERITE_BUSH = NO_ITEM_BLOCK.register("nezerite_crop", () -> new NezeriteCropBlock(Block.Properties.of(Material.PLANT).noCollission().randomTicks().sound(SoundType.CROP)));

}
