package oluni.official.ded.flyFeedHeall.listen;


import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class EventsTest implements Listener {

    /*
    Це пробник івенту.
     */

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent e) {
        Player player = e.getPlayer();
        Location dl = player.getLastDeathLocation();
        String coords = String.format("%d %d %d", dl.getBlockX(), dl.getBlockY(), dl.getBlockZ());
        player.sendMessage(ChatColor.AQUA + "Ви померли! Координати: " + coords);
    }
}
