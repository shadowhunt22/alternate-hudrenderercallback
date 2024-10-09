package com.shadowhunter22;

import com.shadowhunter22.api.client.renderer.v1.AlternateHudRendererCallback;
import com.shadowhunter22.gui.hud.FabricHudTest;
import com.shadowhunter22.gui.hud.HudTest;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;

public class AlternateHudRendererTest implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        AlternateHudRendererCallback.EVENT.register(new HudTest());
        HudRenderCallback.EVENT.register(new FabricHudTest());
    }
}
