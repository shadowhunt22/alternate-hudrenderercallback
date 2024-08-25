/*
 * Copyright (c) 2016, 2017, 2018, 2019 FabricMC
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

package com.shadowhunter22.api.client.renderer.v1;

import net.minecraft.client.gui.DrawContext;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.minecraft.client.render.RenderTickCounter;

public interface AlternateHudRendererCallback {
    // modifications mode: change HudRendererCallback -> AlternateHudRendererCallback
    Event<AlternateHudRendererCallback> EVENT = EventFactory.createArrayBacked(AlternateHudRendererCallback.class, (listeners) -> (matrixStack, delta) -> {
        for (AlternateHudRendererCallback event : listeners) {
            event.onHudRender(matrixStack, delta);
        }
    });

    /**
     * Called after rendering the whole hud, which is displayed in game, in a world.
     *
     * @param drawContext the {@link DrawContext} instance
     * @param tickDelta Progress for linearly interpolating between the previous and current game state
     */
    void onHudRender(DrawContext drawContext, RenderTickCounter tickDelta);
}
