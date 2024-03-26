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

import com.shadowhunter22.api.client.renderer.v1.AlternateHudRendererCallback;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.util.Identifier;

public class HudTest implements AlternateHudRendererCallback {
    private final Identifier TEST_TEXTURE = new Identifier("alternate-hudrendercallback-test-mod", "textures/gui/hud/fancy_indicator.png");

    @Override
    public void onHudRender(DrawContext drawContext, float tickDelta) {
        drawContext.drawTexture(TEST_TEXTURE, 15, drawContext.getScaledWindowHeight() / 2 + 65, 0, 0, 22, 22, 22, 22);
        drawContext.drawTexture(TEST_TEXTURE, drawContext.getScaledWindowWidth() - 20, drawContext.getScaledWindowHeight() / 2 + 70, 0, 0, 22, 22, 22, 22);
        drawContext.drawTexture(TEST_TEXTURE, drawContext.getScaledWindowWidth() / 2 - 5, drawContext.getScaledWindowHeight() / 2 - 5, 0, 0, 22, 22, 22, 22);
    }
}