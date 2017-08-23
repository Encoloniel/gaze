package com.encoloniel.gaze.commands.gaze;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import com.encoloniel.gaze.Gaze_alpha;

public class Gazemain implements CommandExecutor {
public static Gaze_alpha plugin;




private final Gaze_alpha main;

public Gazemain(Gaze_alpha main)
{
this.main = main;
}

@Override
public boolean onCommand(CommandSender p, Command cmd, String commandLabel, String [] args) {
								
								if (cmd.getName().equalsIgnoreCase("gaze") ) {
																if (args.length == 0) {
																								p.sendMessage(ChatColor.GREEN + "This is the Main Gaze command. /gaze [help,permissions,reload]");
																								return true;
																}
																if (args[0].equalsIgnoreCase("permissions") && p.hasPermission("gaze.main.permissions")) {
																								p.sendMessage("§7§l|§e§l==============§7§l| §r§c Permissions  §4§7§l |§e§l==============§7§l|");
																								p.sendMessage("§a * §7[§cgaze§7] §egaze.main");
																								p.sendMessage("§a * §7[§cgmc§7] §egaze.gamemode.creative");
																								p.sendMessage("§a * §7[§cgms§7] §egaze.gamemode.survival");
																								p.sendMessage("§a * §7[§cgmsp§7] §egaze.gamemode.spectator");
																								p.sendMessage("§a * §7[§cgma§7] §egaze.gamemode.adventure");
																								p.sendMessage("§a * §7[§cheal§7] §egaze.heal");
																								p.sendMessage("§a * §7[§cfeed§7] §egaze.feed");
																								p.sendMessage("§a * §7[§cfakejoin§7] §egaze.fool.fakejoin");
																								p.sendMessage("§a * §7[§cfakeleave§7] §egaze.fool.fakeleave");
																								p.sendMessage("§7§l|§e§l===============§7§l| §r§cEnd of perms §4§7§l |§e§l==============§7§l|");
																								return true;
																}
																if (args[0].equalsIgnoreCase("help") && p.hasPermission("gaze.main.help")) {

																								p.sendMessage("§7§l|§e§l==============§7§l| §r§c Help Menu  §4§7§l |§e§l==============§7§l|");
																								p.sendMessage("§a * §7§l[optional] <must type>");
																								p.sendMessage("§a * §7[§cgaze§7] §e/gaze [help|perms|reload]");
																								p.sendMessage("§a * §7[§cgmc§7] §e/gmc [player]");
																								p.sendMessage("§a * §7[§cgms§7] §e/gms [player]");
																								p.sendMessage("§a * §7[§cgmsp§7] §e/gmsp [player]");
																								p.sendMessage("§a * §7[§cgma§7] §e/gma [player]");
																								p.sendMessage("§a * §7[§cheal§7] §e/heal [player]");
																								p.sendMessage("§a * §7[§cfeed§7] §e/feed [player]");
																								p.sendMessage("§a * §7[§cfakejoin§7] §e/fakejoin <username>");
																								p.sendMessage("§a * §7[§cfakeleave§7] §e/fakejoin <username>");
																								p.sendMessage("§7§l|§e§l===============§7§l| §r§cEnd of Menu §4§7§l |§e§l==============§7§l|");
																								return true;
																}
																if (args[0].equalsIgnoreCase("reload") && p.hasPermission("gaze.main.reload")) {
																								main.reloadConfig();
																								p.sendMessage(ChatColor.GREEN + "Reloaded config!");
																								return true;
																}else {
																	p.sendMessage(ChatColor.RED + "There is no "+args[0]+" argument registered with the command /gaze. Do /gaze help for help");
																}
																return true;
								}
								return true;
}
}
