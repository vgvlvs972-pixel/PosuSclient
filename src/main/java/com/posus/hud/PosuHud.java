package com.posus.hud;

import meteordevelopment.meteorclient.renderer.text.TextRenderer;
import meteordevelopment.meteorclient.systems.hud.HudElement;
import meteordevelopment.meteorclient.systems.hud.HudElementCategory;

public class PosuHud extends HudElement {
    public PosuHud(HudElementCategory category) {
        super(category);
        this.title = "PosuSclient";
    }

    @Override
    public void render(float delta) {
        TextRenderer tr = TextRenderer.get();
        tr.begin();
        tr.render("PosuSclient v1.0.0", 0, 0, 0xFFFFFF);
        tr.end();
    }
}