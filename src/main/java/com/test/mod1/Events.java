package com.test.mod1;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created with IntelliJ IDEA.
 * User: Yevgen Bushuyev
 * Date: 01.05.17.
 */
public class Events {

  @SubscribeEvent
  public void registerBlocks(RegistryEvent.Register<Block> event) {
    Block block = new Block(Material.CAKE, MapColor.ICE) {{
      this.setRegistryName("mod1:block1");
    }};

    event.getRegistry().registerAll(block);
    GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));


  }
}
