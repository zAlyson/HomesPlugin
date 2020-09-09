package me.alysonsantos.homes.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Map;

@AllArgsConstructor
@Getter
public class User {

    private final String name;

    private Map<String, Home> homes;

    public final Home getHomeByName(String homeName) {
        return homes.get(homeName);
    }
}
