package me.alysonsantos.homes;

import lombok.Getter;
import me.alysonsantos.homes.cache.UsersCache;
import me.alysonsantos.homes.controller.HomesControllerImpl;
import me.alysonsantos.homes.controller.HomesController;
import me.lucko.helper.internal.HelperImplementationPlugin;
import me.lucko.helper.plugin.ExtendedJavaPlugin;

@HelperImplementationPlugin
@Getter
public class HomesPlugin extends ExtendedJavaPlugin {

    private final HomesController controller;

    public HomesPlugin() {
        controller = new HomesControllerImpl(
                new UsersCache()
        );
    }

    public static HomesPlugin getInstance() {
        return getPlugin(HomesPlugin.class);
    }

    @Override
    protected void enable() {

    }
}
