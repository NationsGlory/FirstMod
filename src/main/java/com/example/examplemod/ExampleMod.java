package com.example.examplemod;

import com.example.examplemod.block.BlockiBlock;
import com.example.examplemod.common.CommonProxy;
import com.example.examplemod.item.ItemiBlockdust;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

@Mod(modid = "examplemod", name = "Example Mod", version = ExampleMod.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class ExampleMod {
    @SidedProxy(clientSide = "com.example.examplemod.client.ClientProxy", serverSide = "com.example.examplemod.common.CommonProxy")

    public static CommonProxy proxy;

    public static final String MODID = "examplemod";
    public static final String VERSION = "1.0";

    // Init blocks
    public static Block iBlock = new BlockiBlock(1500, Material.iron).setUnlocalizedName("iBlock");

    // Init items
    public static Item iBlockdust = new ItemiBlockdust(1501).setUnlocalizedName("iBlockdust");

    // Creative tabs.

   /* public static CreativeTabs TabBalix = new Creat*/
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.registerRenderInformation();
		// some example code
        System.out.println("DIRT BLOCK >> "+Block.dirt.getUnlocalizedName());
    }

    public ExampleMod() {
        GameRegistry.registerBlock(iBlock, "Block de iBalix");

        // Blocks
        LanguageRegistry.addName(iBlock, "Block de iBalix");

        // Items
        LanguageRegistry.addName(iBlockdust, "iBlockdust");

        // Crafts
       /* GameRegistry.addRecipe(new ItemStack(iBlock, 4), new Object [] {
                " X ", " * ", " X ", 'X', Item.stick, '*', iBlockdust
        });*/
    }
}
