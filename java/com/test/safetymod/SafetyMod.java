package com.test.safetymod;

import com.test.safetymod.Block.EvacBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = SafetyMod.MODID, version = SafetyMod.VERSION)
public class SafetyMod
{
    public static final String MODID = "Safety Block Mod";
    public static final String VERSION = "1.666";

    public final static Block evacBlock = new EvacBlock(Material.ground)
            .setHardness(0.5F).setStepSound(Block.soundTypeGravel)
            .setUnlocalizedName("evacBlock").setCreativeTab(CreativeTabs.tabBlock);

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
        GameRegistry.registerBlock(evacBlock, "evacBlock");
    }

}

/*
    Breadcrumbs / Waypoints

    Breaking a potion to activate the evacutation
 */