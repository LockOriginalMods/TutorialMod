package com.LockOriginalMods.tutorialmod.objects.blocks;

import com.LockOriginalMods.tutorialmod.list.ItemList;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class NezeriteCropBlock extends CropBlock {
    private static final VoxelShape[] SHAPE_BY_AGE = new VoxelShape[] {Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D),Block.box(0.0D, 0.0D, 0.0D, 16.0D, 3.0D, 16.0D), Block.box(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D), Block.box(0.0D, 0.0D, 0.0D, 16.0D, 5.0D, 16.0D), Block.box(0.0D, 0.0D, 0.0D, 16.0D, 6.0D, 16.0D), Block.box(0.0D, 0.0D, 0.0D, 16.0D, 7.0D, 16.0D), Block.box(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D), Block.box(0.0D, 0.0D, 0.0D, 16.0D, 9.0D, 16.0D)};

    public NezeriteCropBlock(BlockBehaviour.Properties p_52247_) {
        super(p_52247_);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ItemList.NEZERITE.get();
    }

    public VoxelShape getShape(BlockState p_51330_, BlockGetter p_51331_, BlockPos p_51332_, CollisionContext p_51333_) {
        return SHAPE_BY_AGE[(Integer)p_51330_.getValue(this.getAgeProperty())];
    }
}
