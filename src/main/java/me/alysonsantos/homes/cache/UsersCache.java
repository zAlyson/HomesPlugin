package me.alysonsantos.homes.cache;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import lombok.Getter;
import me.alysonsantos.homes.model.User;

@Getter
public class UsersCache {

    private final Cache<String, User> users;

    public UsersCache() {
        users = CacheBuilder.newBuilder().build();
    }

    public final User get(String userName) {
        return users.getIfPresent(userName);
    }

    public void insert(User user) {
        users.put(user.getName(), user);
    }

    public void remove(User user) {
        users.invalidate(user);
    }

}
