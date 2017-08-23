package com.encoloniel.gaze.commands.hf;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HealFeed implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String [] args) {
		
		
		//Heal Command
		if (cmd.getName().equalsIgnoreCase("heal") && sender.hasPermission("gaze.heal")) {
										if (args.length == 0) {
											if (sender instanceof Player) {
												Player player = (Player) sender;
																		player.setHealth(20);
																		player.sendMessage("You have been healed 20 half-hearts");
																		return true;
											}else {
												sender.sendMessage(ChatColor.RED + "You cannot run this from console");
											}
										}

										if (args.length > 0) {
										Player target = (Bukkit.getServer().getPlayer(args[0]));
										if (target == null) {
																		sender.sendMessage(ChatColor.RED + "Player is not on server");
																		return true;
										}
										target.setHealth(20);
										target.sendMessage("You have been healed 20 half-hearts");
										sender.sendMessage("You have healed "+target.getName() +" 20 half-hearts");
										return true;
										}
		}

		//Feed Command
		if (cmd.getName().equalsIgnoreCase("feed") && sender.hasPermission("gaze.feed")) {
										if (args.length == 0) {
											if (sender instanceof Player) {
												Player player = (Player) sender;
																		player.setFoodLevel(20);
																		player.sendMessage("You have been fed 20 hunger levels");
																		return true;
											}else {
												sender.sendMessage(ChatColor.RED + "You cannot run this from console");
											}
										}
										if (args.length > 0) {

										Player target = (Bukkit.getServer().getPlayer(args[0]));
										if (target == null) {
																		sender.sendMessage(ChatColor.RED + "Player is not on server");
																		return true;
										}
										target.setFoodLevel(20);
										target.sendMessage("You have been fed 20 hunger levels");
										sender.sendMessage("You have fed " + target.getName() + " 20 hunger levels");
										return true;
										}
		}
		return true;
	}

}
