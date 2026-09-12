package com.posus.modules;

import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.systems.modules.ModuleCategory;

public class AirHop extends Module {
    public AirHop() {
        super(new ModuleCategory("PosuSclient"), "AirHop", "Jump higher in the air");
    }

    @Override
    public void onActivate() {
        // Air hop logic here
    }

    @Override
    public void onDeactivate() {
        // Cleanup
    }
}