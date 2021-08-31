package me.jacksondasheng.noGlowSquids;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
    public static Server server = Bukkit.getServer();

    @Override
    public void onEnable()
    {
        server.getConsoleSender().sendMessage("Enabling NoGlowSquids");

        server.getPluginManager().registerEvents(new AntiGlowSquid(), this);
        server.getScheduler().scheduleSyncRepeatingTask(
            getPlugin(getClass()),
            new Runnable() {
                @Override
                public void run() {
                    for(World world : server.getWorlds()) {
                        for(Entity entity : world.getEntities()) {
                            if(entity.getType() == EntityType.GLOW_SQUID) {
                                entity.remove();
                            }
                        }
                    }
                }
            },
            0,
            20
        );
        
        server.getConsoleSender().sendMessage("NoGlowSquids enabled");
    }

    @Override
    public void onDisable()
    {
        server.getConsoleSender().sendMessage("NoGlowSquids disabled");
    }
}
