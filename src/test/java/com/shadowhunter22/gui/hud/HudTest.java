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
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.util.Identifier;

public class HudTest implements AlternateHudRendererCallback {
	private final Identifier TEST_TEXTURE = Identifier.of("alternate-hudrendercallback-test-mod", "textures/gui/hud/fancy_indicator.png");

	@Override
	public void onHudRender(DrawContext context, RenderTickCounter tickCounter) {
		context.drawTexture(RenderLayer::getGuiTextured, TEST_TEXTURE, context.getScaledWindowWidth() / 2 - 5, context.getScaledWindowHeight() / 2 + 25, 0, 0, 22, 22, 22, 22);
		context.drawText(MinecraftClient.getInstance().textRenderer, "My callback", context.getScaledWindowWidth() / 2 - 5, context.getScaledWindowHeight() / 2 + 25, 0, true);
	}
}