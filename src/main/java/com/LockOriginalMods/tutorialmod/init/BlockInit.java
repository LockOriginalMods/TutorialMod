package com.LockOriginalMods.tutorialmod.init;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.LockOriginalMods.tutorialmod.TutorialMod.MOD_ID;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);

    public static final RegistryObject<Block> SLATE_BRICK = BLOCKS.register("slate_brick", () -> new Block(BlockBehaviour.Properties.of(Material.STONE,
    MaterialColor.CLAY)
            .strength(1.5f, 6.0f)
            .sound(SoundType.STONE)));

}
