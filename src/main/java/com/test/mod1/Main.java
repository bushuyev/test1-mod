package com.test.mod1;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created with IntelliJ IDEA.
 * User: Yevgen Bushuyev
 * Date: 01.05.17.
 */
@Mod(modid = "mod1", name = "Test Mod", version = "1.0", useMetadata = true)
public class Main {


  public Main() {
    MinecraftForge.EVENT_BUS.register (new Events ());
  }

  @Mod.EventHandler
  public void postInit(FMLPreInitializationEvent event) {

  }


}
