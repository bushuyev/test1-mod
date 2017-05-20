package com.test.mod1;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * Created with IntelliJ IDEA.
 * User: Yevgen Bushuyev
 * Date: 06.05.17.
 */
class MyBlock extends Block {

  public MyBlock() {
    super(Material.CAKE, MapColor.ICE);
    this.setRegistryName("mod1:block1");
  }

  @Override
  public void onBlockClicked(World worldIn, BlockPos pos, EntityPlayer playerIn) {
    System.out.println("onBlockClicked");
  }



  @Override
  public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
    System.out.println("onEntityWalk "+pos.toString());

    BlockPos p = entityIn.getPosition();
    entityIn.setPosition(p.getX()+2, p.getY()+2, p.getZ());

//    worldIn.setBlockToAir(pos);

//    pos = pos.add(10, 10, 100);

//    worldIn.setBlockState(pos, this.getDefaultState(), 2);


//    worldIn.set


//    worldIn.tick();

//    worldIn.setBlockToAir(pos);
  }


}
