package net.pandemicnetwork.clans.clan;

import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

/** Copyright (c) Frosty_Panda 2016 */
public class ClanManager {

  private static List<Clan> clans = new ArrayList<> ();

  public static List<Clan> getClans () {
    return clans;
  }

  public static Clan getClan(String name){
    for(Clan clan : clans){
	 if(clan.getName ().equals (name)){
	   return clan;
	 }
    }
    return null;
  }

  public static Clan getClan(Player pl){
    for(Clan clan : clans){
	 if(clan.getAdmins ().contains (pl) || clan.getLeaders ().contains (pl) || clan.getMembers ().contains (pl) || clan.getRecruits ().contains (pl)){
	   return clan;
	 }
    }
    return null;
  }
}
