package oluni.official.ded.flyFeedHeall.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class Fly implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String @NotNull [] strings) {
        if (commandSender instanceof Player) {
            if (commandSender.hasPermission("fly.fly")) {
                if (((Player) commandSender).isFlying()) {
                    ((Player) commandSender).setAllowFlight(false);
                    ((Player) commandSender).setFlying(false);
                    commandSender.sendMessage("Ви спустилися на землю!");
                } else {
                    ((Player) commandSender).setAllowFlight(true);
                    ((Player) commandSender).setFlying(true);
                    commandSender.sendMessage("Ви піднялися в повітря!");
                }
            } else {
                commandSender.sendMessage(ChatColor.RED + "Ви не маєте права на цю дію!");
            }
        }
        return false;
    }
}
