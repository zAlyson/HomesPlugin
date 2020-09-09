package me.alysonsantos.homes.controller;

import me.alysonsantos.homes.cache.UsersCache;

public interface HomesController {

    void process(String user);

    UsersCache getCache();
}
