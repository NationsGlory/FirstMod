package com.example.examplemod.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class BlockiBlock extends Block {

    public BlockiBlock(int par1, Material par2Material) {
        super(par1, par2Material);
        this.setCreativeTab(CreativeTabs.tabBlock);

        // Light between 0 and 1
        this.setLightValue(0.8F);

        // Nb hit to break
        this.setHardness(4);

        this.setResistance(5);
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        blockIcon = iconRegister.registerIcon("examplemod:iBlock");
    }
}
