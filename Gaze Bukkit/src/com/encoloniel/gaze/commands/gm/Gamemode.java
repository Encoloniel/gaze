package com.encoloniel.gaze.commands.gm;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class Gamemode implements CommandExecutor {

 @Override
 public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {




  //Survival Mode
  if (cmd.getName().equalsIgnoreCase("gms")) {
   if (sender.hasPermission("gaze.gamemode.survival")) {
    if (args.length == 0) {
     if (sender instanceof Player) {

      Player player = (Player) sender;
      player.setGameMode(GameMode.SURVIVAL);
      player.sendMessage("Your gamemode is updated to Survival Mode.");
      return true;

     } else {
      sender.sendMessage(ChatColor.RED + "You cannot run this from console.");
      sender.sendMessage(ChatColor.RED + "Console cannot change its own gamemode.");
      return true;
     }
	 }
 }

     if (args.length > 0) {
      Player target = (Bukkit.getServer().getPlayer(args[0]));
      if (target == null) {
       sender.sendMessage("§cPlayer is not on server.");
       return true;
      }
      target.setGameMode(GameMode.SURVIVAL);
      sender.sendMessage("Set " + target.getName() + "'s gamemode to Survival Mode.");
      target.sendMessage("Your gamemode is updated to Survival Mode.");
      return true;
     }



    }

   //Creative Mode
   if (cmd.getName().equalsIgnoreCase("gmc")) {
    if (sender.hasPermission("gaze.gamemode.creative")) {

     if (args.length == 0) {
      if (sender instanceof Player) {
       Player player = (Player) sender;
       player.setGameMode(GameMode.CREATIVE);
       player.sendMessage("Your gamemode is updated to Creative Mode.");
       return true;
      } else {
       sender.sendMessage(ChatColor.RED + "You cannot run this from console.");
       sender.sendMessage(ChatColor.RED + "Console cannot change its own gamemode.");
       return true;
      }
     }
     if (args.length > 0) {

      Player target = (Bukkit.getServer().getPlayer(args[0]));
      if (target == null) {
       sender.sendMessage("§cPlayer is not on server");
       return true;
      }
      target.setGameMode(GameMode.CREATIVE);
      sender.sendMessage("Set " + target.getName() + "'s gamemode to Creative Mode.");
      target.sendMessage("Your gamemode is updated to Creative Mode.");
      return true;
     }


    }
   }

   //Adventure Mode
   if (cmd.getName().equalsIgnoreCase("gma")) {
    if (sender.hasPermission("gaze.gamemode.adventure")) {
     if (args.length == 0) {
      if (sender instanceof Player) {
       Player player = (Player) sender;
       player.setGameMode(GameMode.ADVENTURE);
       player.sendMessage("Your gamemode is updated to Adventure Mode.");
       return true;
      } else {
       sender.sendMessage(ChatColor.RED + "You cannot run this from console.");
       sender.sendMessage(ChatColor.RED + "Console cannot change its own gamemode.");
       return true;
      }
     }
     if (args.length > 0) {
      Player target = (Bukkit.getServer().getPlayer(args[0]));
      if (target == null) {
       sender.sendMessage("§cPlayer is not on server.");
       return true;
      }
      target.setGameMode(GameMode.ADVENTURE);
      sender.sendMessage("Set " + target.getName() + "'s gamemode to Adventure Mode.");
      target.sendMessage("Your gamemode is updated to Adventure Mode.");
      return true;
     }


    }
   }

   //Spectator Mode
   if (cmd.getName().equalsIgnoreCase("gmsp")) {
    if (sender.hasPermission("gaze.gamemode.spectator")) {

     if (args.length == 0) {
      if (sender instanceof Player) {
       Player player = (Player) sender;
       player.setGameMode(GameMode.SPECTATOR);
       player.sendMessage("Your gamemode is updated to Spectator Mode/");
       return true;
      } else {
       sender.sendMessage(ChatColor.RED + "You cannot run this from console");
       sender.sendMessage(ChatColor.RED + "Console cannot change its own gamemode");
       return true;
      }
     }
     if (args.length > 0) {
      Player target = (Bukkit.getServer().getPlayer(args[0]));
      if (target == null) {
       sender.sendMessage("§cPlayer is not on server");
       return true;
      }
      target.setGameMode(GameMode.SPECTATOR);
      sender.sendMessage("Set " + target.getName() + "'s gamemode to Spectator Mode");
      target.sendMessage("Your gamemode is updated to Spectator Mode");
      return true;
     }


    }
   }

   return true;
  }
}