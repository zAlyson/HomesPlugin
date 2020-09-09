package me.alysonsantos.homes.model;

import lombok.Builder;
import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.Location;

@Builder
@Getter
public class Position {

    private String world;

    private double x, y, z;

    public final Location toLocation() {
        return new Location(
                Bukkit.getWorld(world),
                x,
                y,
                z
        );
    }
}
