package org.example.exampleplugin;

import com.luminary.os.plugin.Plugin;

public class ExamplePlugin extends Plugin {
    @Override
    public void onEnable() {
        System.out.println("Enabling example plugin!");
    }

    @Override
    public void onDisable() {
        System.out.println("Disabling example plugin!");
    }
}