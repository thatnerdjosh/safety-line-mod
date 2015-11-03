package com.test.safetymod.Block;

import com.test.safetymod.EvacPoint;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class EvacBlock extends Block {

    public EvacBlock(Material materialIn) {
        super(materialIn);
    }

    public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state){
        System.out.println(pos);
        EvacPoint points = new EvacPoint(pos.getX(), pos.getY(), pos.getZ());
        System.out.println(points);
    }
}
