package oluni.official.ded.flyFeedHeall.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class Heal implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String @NotNull [] args) {
        if (commandSender instanceof Player) {
            if (commandSender.hasPermission("heal.heal")) {
                Player player = ((Player) commandSender).getPlayer();
                player.sendMessage(ChatColor.AQUA + "Ви полікували себе!");
                // Це можна зробити й через атрибути, але я вирішив так.
                player.setHealth(player.getMaxHealth());
            } else {
                commandSender.sendMessage(ChatColor.RED + "Ви не маєте права на цю дію!");
            }
        }
        return false;
    }
}
