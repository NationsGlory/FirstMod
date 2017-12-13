package com.example.examplemod.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemiBlockdust extends Item{
    public ItemiBlockdust(int par1) {
        super(par1);

        // Set tab misc (items minecraft)
        this.setCreativeTab(CreativeTabs.tabMisc);
    }

    public void registerIcons(IconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon("examplemod:iBlockdust");
    }
}
