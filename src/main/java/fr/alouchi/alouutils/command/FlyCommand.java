package fr.alouchi.alouutils.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)) {
            sender.sendMessage("Seul les joueurs peuvent executer cette commande");
            return false;
        }

        Player player = (Player) sender;

        if(label.equalsIgnoreCase("fly")) {
            /*if(player.) {
                player.setFlying(false);
            } else  {
                player.setFlying(true);
            }*/
        }
        return false;
    }
}