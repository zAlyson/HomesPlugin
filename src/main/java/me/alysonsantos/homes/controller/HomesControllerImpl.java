package me.alysonsantos.homes.controller;

import me.alysonsantos.homes.cache.UsersCache;

public class HomesControllerImpl implements HomesController {

    private final UsersCache cache;

    public HomesControllerImpl(UsersCache cache) {
        this.cache = cache;
    }

    @Override
    public void process(String user) {

    }

    @Override
    public UsersCache getCache() {
        return cache;
    }
}
