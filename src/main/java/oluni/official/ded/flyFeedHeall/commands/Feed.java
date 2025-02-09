package oluni.official.ded.flyFeedHeall.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class Feed implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String @NotNull [] strings) {
        if (commandSender instanceof Player) {
            if (commandSender.hasPermission("feed.feed")) {
                if (((Player) commandSender).getFoodLevel() == 20) {
                    commandSender.sendMessage("Ваш показник їжі вже на самому високому рівні!");
                } else {
                    Player player = ((Player) commandSender).getPlayer();
                    player.sendMessage("Ви більше не почуваєте себе голодним!");
                    player.setFoodLevel(20);
                }
            } else {
                commandSender.sendMessage(ChatColor.RED + "Ви не маєте права на цю дію!");
            }
        }
        return false;
    }
}
