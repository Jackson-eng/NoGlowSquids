package me.jacksondasheng.noGlowSquids;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class AntiGlowSquid implements Listener
{
    @EventHandler
    public void onCreatureSpawn(CreatureSpawnEvent event)
    {
        if(event.getEntityType() == EntityType.GLOW_SQUID)
        {
            event.setCancelled(true);
        }
    }
}
