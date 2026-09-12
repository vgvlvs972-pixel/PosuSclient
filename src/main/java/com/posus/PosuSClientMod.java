package com.posus;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Environment(EnvType.CLIENT)
public class PosuSClientMod implements ClientModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("PosuSclient");

    @Override
    public void onInitializeClient() {
        LOGGER.info("PosuSclient loaded successfully!");
    }
}