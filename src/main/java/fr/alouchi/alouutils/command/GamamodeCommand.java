package fr.alouchi.alouutils.command;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GamamodeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)) {
            sender.sendMessage("Seul les joueurs peuvent executer cette commande");
            return false;
        }

        Player player = (Player) sender;
        String argument = args[0];

        if(label.equalsIgnoreCase("gm")) {
            switch (argument) {
                case "0":
                    player.setGameMode(GameMode.SURVIVAL);
                    break;
                case "1":
                    player.setGameMode(GameMode.CREATIVE);
                    break;
                case "2":
                    player.setGameMode(GameMode.ADVENTURE);
                    break;
                case "3":
                    player.setGameMode(GameMode.SPECTATOR);
                    break;
                default:
                    player.sendMessage("Usage : /gm <0|1|2|3>");
                    break;
            }
        }
        return false;
    }
}