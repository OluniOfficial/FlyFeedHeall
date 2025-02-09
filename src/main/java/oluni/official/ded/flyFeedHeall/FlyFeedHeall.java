package oluni.official.ded.flyFeedHeall;

import oluni.official.ded.flyFeedHeall.commands.Feed;
import oluni.official.ded.flyFeedHeall.commands.Fly;
import oluni.official.ded.flyFeedHeall.commands.Heal;
import oluni.official.ded.flyFeedHeall.listen.EventsTest;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class FlyFeedHeall extends JavaPlugin {

    @Override
    public void onEnable() {
        /*
        Це простий плагін на флай, хіл і фід.
        Просто перевірка моїх знань.
        09.02.25
        На данний момент, повторюю, оновлюю й набуваю знань у плагінах майнкрафт.
        23 урок. Heart of Spigot API.
        Роблю на початку команд f, щоб не було конфліктів.
         */

        getCommand("jheal").setExecutor(new Heal());
        getCommand("jfeed").setExecutor(new Feed());
        getCommand("jfly").setExecutor(new Fly());

        Bukkit.getPluginManager().registerEvents(new EventsTest(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
