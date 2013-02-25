package me.blha303;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class NoNicknames extends JavaPlugin {

	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) { // When anyone uses /nick...
		sender.sendMessage("You can't have a nickname."); // denied.
		return true;
	}
}
