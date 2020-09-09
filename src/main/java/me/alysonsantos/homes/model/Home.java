package me.alysonsantos.homes.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Home {

    private String name;

    private Position position;

    private boolean isPublic;

    private int visits;

}
