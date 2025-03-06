package dvillager.breeding;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityBreedEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class DisableVillagerBreeding extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        getLogger().info("DisableVillagerBreeding has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("DisableVillagerBreeding has been disabled!");
    }

    @EventHandler
    public void onVillagerBreed(EntityBreedEvent event) {
        if (event.getEntityType() == EntityType.VILLAGER) {
            event.setCancelled(true);
        }
    }
}
