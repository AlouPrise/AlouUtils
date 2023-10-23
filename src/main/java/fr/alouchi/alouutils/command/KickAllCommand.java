package fr.alouchi.alouutils.command;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class KickAllCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(label.equalsIgnoreCase("kickall")) {
         for (Player all : Bukkit.getOnlinePlayers()) {
             if(!all.hasPermission("kickall.bypass.au")) {
                 all.kickPlayer("KickAll");
             }
         }
        }
        return false;
    }
}