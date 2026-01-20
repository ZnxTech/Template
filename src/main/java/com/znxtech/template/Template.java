package com.znxtech.template;

import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;

import javax.annotation.Nonnull;

public class Template extends JavaPlugin {

    private static Template INSTANCE;

    public Template(@Nonnull JavaPluginInit init) {
        super(init);
        INSTANCE = this;
    }

    @Override
    public void setup() {

    }

    public static Template getInstance() {
        return INSTANCE;
    }
}
