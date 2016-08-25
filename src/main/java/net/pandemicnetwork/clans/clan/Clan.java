package net.pandemicnetwork.clans.clan;

import org.bukkit.Chunk;
import org.bukkit.OfflinePlayer;

import java.util.List;

/** Copyright (c) Frosty_Panda 2016 */
public class Clan {

  private String name;
  private List<OfflinePlayer> leaders;
  private List<OfflinePlayer> admins;
  private List<OfflinePlayer> members;
  private List<OfflinePlayer> recruits;
  private List<OfflinePlayer> invites;
  private List<Chunk> claimedLand;
  private List<Clan> allies;

  public Clan (String name, List<OfflinePlayer> leaders, List<OfflinePlayer> admins, List<OfflinePlayer> members, List<OfflinePlayer> recruits, List<OfflinePlayer> invites, List<Chunk> claimedLand, List<Clan> allies) {
    this.name = name;
    this.leaders = leaders;
    this.admins = admins;
    this.members = members;
    this.recruits = recruits;
    this.invites = invites;
    this.claimedLand = claimedLand;
    this.allies = allies;
  }

  public String getName () {
    return name;
  }

  public void setName (String name) {
    this.name = name;
  }

  public List<OfflinePlayer> getLeaders () {
    return leaders;
  }

  public void setLeaders (List<OfflinePlayer> leaders) {
    this.leaders = leaders;
  }

  public List<OfflinePlayer> getAdmins () {
    return admins;
  }

  public void setAdmins (List<OfflinePlayer> admins) {
    this.admins = admins;
  }

  public List<OfflinePlayer> getMembers () {
    return members;
  }

  public void setMembers (List<OfflinePlayer> members) {
    this.members = members;
  }

  public List<OfflinePlayer> getRecruits () {
    return recruits;
  }

  public void setRecruits (List<OfflinePlayer> recruits) {
    this.recruits = recruits;
  }

  public List<OfflinePlayer> getInvites () {
    return invites;
  }

  public void setInvites (List<OfflinePlayer> invites) {
    this.invites = invites;
  }

  public List<Chunk> getClaimedLand () {
    return claimedLand;
  }

  public void setClaimedLand (List<Chunk> claimedLand) {
    this.claimedLand = claimedLand;
  }

  public List<Clan> getAllies () {
    return allies;
  }

  public void setAllies (List<Clan> allies) {
    this.allies = allies;
  }
}
