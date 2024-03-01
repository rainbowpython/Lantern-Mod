package com.example.name.modid.block;

import com.example.name.modid.LanternMod;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;


public class ModBlocks {
    public static final Block RED_LANTERN = registerBlock("red_lantern", new Lantern(FabricBlockSettings.copyOf(Blocks.SOUL_LANTERN).luminance(15)));
    public static final Block YELLOW_LANTERN = registerBlock("yellow_lantern", new Lantern(FabricBlockSettings.copyOf(Blocks.SOUL_LANTERN).luminance(15)));
    public static final Block GREEN_LANTERN = registerBlock("green_lantern", new Lantern(FabricBlockSettings.copyOf(Blocks.SOUL_LANTERN).luminance(15)));
    public static final Block ORANGE_LANTERN = registerBlock("orange_lantern", new Lantern(FabricBlockSettings.copyOf(Blocks.SOUL_LANTERN).luminance(15)));
    public static final Block LIME_LANTERN = registerBlock("lime_lantern", new Lantern(FabricBlockSettings.copyOf(Blocks.SOUL_LANTERN).luminance(15)));
    public static final Block BLUE_LANTERN = registerBlock("blue_lantern", new Lantern(FabricBlockSettings.copyOf(Blocks.SOUL_LANTERN).luminance(15)));
    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(LanternMod.MOD_ID, name), block);
    }
    

    private static Item registerBlockItem(String name, Block block){
        
        return Registry.register(Registries.ITEM, new Identifier(LanternMod.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModBlocks::addItemsToCreativeTab);
    }

    private static void addItemsToCreativeTab(FabricItemGroupEntries entries){
        entries.add(RED_LANTERN);
        entries.add(YELLOW_LANTERN);
        entries.add(GREEN_LANTERN);
        entries.add(ORANGE_LANTERN);
        entries.add(LIME_LANTERN);
        entries.add(BLUE_LANTERN);
    }
}
