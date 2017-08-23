package com.encoloniel.gaze.commands.fool;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Fool implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String [] args) {

		if (cmd.getName().equalsIgnoreCase("fakejoin") && sender.hasPermission("gaze.fool.fakejoin")) {
										if (args.length == 0) {
																		sender.sendMessage(ChatColor.RED + "Please specify a name");
																		return true;
										}
										Bukkit.getServer().broadcastMessage(ChatColor.YELLOW + args[0] + " joined the game.");
										return true;
		}
		if (cmd.getName().equalsIgnoreCase("fakeleave") && sender.hasPermission("gaze.fool.fakeleave")) {
			if (args.length == 0) {
											sender.sendMessage(ChatColor.RED + "Please specify a name");
											return true;
			}
			Bukkit.getServer().broadcastMessage(ChatColor.YELLOW + args[0] + " left the game.");
			return true;
}
		return true;
	}



}
