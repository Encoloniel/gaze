package com.encoloniel.gaze;



import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;

import org.bukkit.plugin.java.JavaPlugin;
import com.encoloniel.gaze.commands.fool.Fool;
import com.encoloniel.gaze.commands.gaze.Gazemain;
import com.encoloniel.gaze.commands.gm.Gamemode;
import com.encoloniel.gaze.commands.help.Help;
import com.encoloniel.gaze.commands.hf.HealFeed;


public class Gaze_alpha extends JavaPlugin {

public void onEnable() {
	getConfig().options().copyDefaults(true);
	saveConfig();
	
	Bukkit.getServer().getLogger().info(ChatColor.GREEN + "Gaze ENABLED");
	Bukkit.getServer().getLogger().info(ChatColor.GREEN + "You are using release 0.4 version [STABLE]");
	
	//ALL SERVER PLUGIN EXECUTION ub0.1.1.04
	
	 getCommand("gmc").setExecutor((CommandExecutor)new Gamemode());
     getCommand("gms").setExecutor((CommandExecutor)new Gamemode());
     getCommand("gmsp").setExecutor((CommandExecutor)new Gamemode());
     getCommand("gma").setExecutor((CommandExecutor)new Gamemode());
     
	 getCommand("heal").setExecutor((CommandExecutor)new HealFeed());
     getCommand("feed").setExecutor((CommandExecutor)new HealFeed());
     
     getCommand("fakejoin").setExecutor((CommandExecutor)new Fool());
     getCommand("fakeleave").setExecutor((CommandExecutor)new Fool());
     
     getCommand("help").setExecutor((CommandExecutor)new Help(this));
     
     getCommand("gaze").setExecutor((CommandExecutor)new Gazemain(this));

     
	
}

public void onDisable() {
	Bukkit.getServer().getLogger().info(ChatColor.RED + "Gaze DISABLED");
}




}