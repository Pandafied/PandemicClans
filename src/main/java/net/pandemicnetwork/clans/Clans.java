package net.pandemicnetwork.clans;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

/** Copyright (c) Frosty_Panda 2016 */
public class Clans extends JavaPlugin implements Listener {

  private static Clans instance;

  @Override
  public void onEnable(){
    instance = this;

    getLogger ().info ("Enabled PandemicClans!");
    getLogger ().info ("Loading clans...");

  }

  @Override
  public void onDisable(){

  }

  public static Clans getInstance () {
    return instance;
  }
}
