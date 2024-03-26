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
import com.shadowhunter22.gui.hud.HudTest;
import net.fabricmc.api.ClientModInitializer;

public class AlternateHudRendererTest implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        AlternateHudRendererCallback.EVENT.register(new HudTest());
    }
}
