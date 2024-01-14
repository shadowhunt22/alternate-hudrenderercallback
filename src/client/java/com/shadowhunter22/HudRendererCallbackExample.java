/*
 * Copyright (c) 2024 ShadowHunter22
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.shadowhunter22;

import com.shadowhunter22.api.client.renderer.v1.AlternateHudRendererCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.util.Identifier;

public class HudRendererCallbackExample implements AlternateHudRendererCallback {
    private final MinecraftClient client = MinecraftClient.getInstance();

    private final Identifier EXAMPLE_TEXTURE = new Identifier("textures/gui/icons.png");

    @Override
    public void onHudRender(DrawContext drawContext, float tickDelta) {
        if (!client.player.isCreative() || client.player.isSpectator()) {
            renderStaminaIndicator(drawContext);
        }
    }

    private void renderStaminaIndicator(DrawContext drawContext) {
        int x = drawContext.getScaledWindowWidth() / 2;
        int y = drawContext.getScaledWindowHeight();

        for (int i = 0; i < 10; ++i) {
            drawContext.drawTexture(EXAMPLE_TEXTURE, x - (i * 8 - 82), y - 50, 34, 9, 9, 9);
        }
    }
}