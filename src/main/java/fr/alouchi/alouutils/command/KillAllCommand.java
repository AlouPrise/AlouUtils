package fr.alouchi.alouutils.command;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class KillAllCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)) {
            return false;
        }

        Player player = (Player) sender;

        if(label.equalsIgnoreCase("killall")) {
            for (Player all : Bukkit.getOnlinePlayers()) {
                all.setHealth(0);
            }
        }
        return false;
    }
}