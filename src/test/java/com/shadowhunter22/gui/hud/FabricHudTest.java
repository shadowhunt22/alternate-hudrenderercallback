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

package com.shadowhunter22.gui.hud;

import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.util.Identifier;

public class FabricHudTest implements HudRenderCallback {
    private final Identifier TEST_TEXTURE = Identifier.of("alternate-hudrendercallback-test-mod", "textures/gui/hud/fancy_indicator.png");

    @Override
    public void onHudRender(DrawContext context, float tickDelta) {
        context.drawTexture(TEST_TEXTURE, context.getScaledWindowWidth() / 2 - 5, context.getScaledWindowHeight() / 2 - 5, 0, 0, 22, 22, 22, 22);

        context.drawText(MinecraftClient.getInstance().textRenderer, "Fabric callback", context.getScaledWindowWidth() / 2 - 5, context.getScaledWindowHeight() / 2 - 5, 0, true);
    }
}