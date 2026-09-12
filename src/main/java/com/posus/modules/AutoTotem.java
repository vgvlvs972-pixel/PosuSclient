package com.posus.modules;

import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.systems.modules.ModuleCategory;

public class AutoTotem extends Module {
    public AutoTotem() {
        super(new ModuleCategory("PosuSclient"), "AutoTotem", "Automatically holds totem of undying");
    }

    @Override
    public void onActivate() {
        // Auto totem logic here
    }

    @Override
    public void onDeactivate() {
        // Cleanup
    }
}