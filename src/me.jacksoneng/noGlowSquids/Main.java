package me.jacksoneng.noGlowSquids;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
    Server server = Bukkit.getServer();

    @Override
    public void onEnable()
    {
        server.getPluginManager().registerEvents(new AntiGlowSquid(), this);
        server.getConsoleSender().sendMessage("NoGlowSquids enabled");
    }

    @Override
    public void onDisable()
    {
        server.getConsoleSender().sendMessage("NoGlowSquids disabled");
    }
}
