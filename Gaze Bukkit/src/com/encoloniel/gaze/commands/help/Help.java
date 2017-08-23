package com.encoloniel.gaze.commands.help;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;


import com.encoloniel.gaze.Gaze_alpha;

public class Help implements CommandExecutor {
	public static Gaze_alpha plugin;
	
	//ub1.1.06
	public Help(Gaze_alpha instance) {
		plugin = instance;
	}



	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String [] args) {
		if (cmd.getName().equalsIgnoreCase("help") ) { 

			sender.sendMessage(plugin.getConfig().getString("helpmessage"));
			return true;
		}
		return true;
	}
	

}
