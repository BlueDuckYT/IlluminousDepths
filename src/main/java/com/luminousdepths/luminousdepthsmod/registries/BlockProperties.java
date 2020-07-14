package com.luminousdepths.luminousdepthsmod.registries;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BlockProperties {

    public static final Block.Properties ROCK = Block.Properties.create(Material.ROCK);

    public static final Block.Properties METAL = Block.Properties.create(Material.IRON).hardnessAndResistance(2F, 3F).harvestLevel(2)
            .harvestTool(ToolType.PICKAXE).sound(SoundType.METAL);

    public static final Block.Properties LUMINOUSOBJECT = Block.Properties.create(Material.ROCK).hardnessAndResistance(1F, 1F).harvestLevel(2)
            .harvestTool(ToolType.PICKAXE).lightValue(9);

    public static final Block.Properties SAND = Block.Properties.create(Material.SAND).hardnessAndResistance((float) 0.5, (float) 0.5)
            .sound(SoundType.SAND);
    public static final Block.Properties SANDSTONE = Block.Properties.create(Material.ROCK).hardnessAndResistance(1.0F, 2F).sound(
            SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE);

}
