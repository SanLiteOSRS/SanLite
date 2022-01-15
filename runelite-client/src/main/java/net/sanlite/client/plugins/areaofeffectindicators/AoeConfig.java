/*
 * Copyright (c) 2022, Siraz <https://github.com/Sirazzz>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.sanlite.client.plugins.areaofeffectindicators;

import com.google.common.collect.ImmutableMap;
import lombok.Getter;
import net.runelite.api.ObjectID;
import net.sanlite.client.plugins.areaofeffectindicators.id.GraphicID;

import java.awt.*;

public class AoeConfig
{
	@Getter
	private final ImmutableMap<Integer, AoeObjectInfo> gameObjects;

	@Getter
	private final ImmutableMap<Integer, AoeObjectInfo> graphicObjects;

	public AoeConfig(AreaOfEffectIndicatorsConfig config)
	{
		gameObjects = new ImmutableMap.Builder<Integer, AoeObjectInfo>()
				// Chambers of Xeric
				.put(ObjectID.SMALL_CRYSTALS, new AoeObjectInfo(AoeObjectType.SINGLE_DAMAGE, 4, config.highlightOlmGroundSpikes(), config.getOlmCrystalGroundSpikesColor()))
				.put(ObjectID.ACID_POOL, new AoeObjectInfo(AoeObjectType.DAMAGE_PER_TICK, 15, config.highlightOlmAcidPools(), config.getOlmAcidPoolsColor()))
				.put(ObjectID.CRYSTAL_BOMB, new AoeObjectInfo(AoeObjectType.SINGLE_DAMAGE, 7, 5, config.highlightOlmCrystalBomb(), config.getOlmCrystalBombColor()))
				// Nex
				.put(ObjectID.SHADOW, new AoeObjectInfo(AoeObjectType.SINGLE_DAMAGE, 6, config.highlightNexShadowAttack(), config.getNexShadowAttackColor()))
				.build();

		graphicObjects = new ImmutableMap.Builder<Integer, AoeObjectInfo>()
				// Chambers of Xeric
				.put(GraphicID.OLM_LIGHTNING, new AoeObjectInfo(AoeObjectType.SINGLE_DAMAGE, -1, config.highlightOlmLightning(), config.getOlmLightningColor()))
				.put(GraphicID.OLM_BLUE_HEAL_POOL, new AoeObjectInfo(AoeObjectType.SINGLE_DAMAGE, 6, config.highlightOlmHealingPools(), config.getOlmHealingPoolsColor()))
				.put(GraphicID.OLM_TELEPORT_WHITE, new AoeObjectInfo(AoeObjectType.SINGLE_DAMAGE, 15, config.highlightOlmTeleportSwap(), config.getOlmTeleportSwapColor()))
				.put(GraphicID.OLM_TELEPORT_GREEN, new AoeObjectInfo(AoeObjectType.SINGLE_DAMAGE, 15, config.highlightOlmTeleportSwap(), config.getOlmTeleportSwapColor()))
				.put(GraphicID.OLM_TELEPORT_YELLOW, new AoeObjectInfo(AoeObjectType.SINGLE_DAMAGE, 15, config.highlightOlmTeleportSwap(), config.getOlmTeleportSwapColor()))
				.put(GraphicID.OLM_TELEPORT_PURPLE, new AoeObjectInfo(AoeObjectType.SINGLE_DAMAGE, 15, config.highlightOlmTeleportSwap(), config.getOlmTeleportSwapColor()))
				.build();
	}

	enum AoeObjectType
	{
		SINGLE_DAMAGE,
		DAMAGE_PER_TICK
	}

	@Getter
	static class AoeObjectInfo
	{
		private final AoeObjectType type;
		private final int tickDuration;
		private final int tileSize;
		private final boolean enabled;
		private final Color color;

		private AoeObjectInfo(AoeObjectType type, int tickDuration, boolean enabled, Color color)
		{
			this.type = type;
			this.tickDuration = tickDuration;
			this.tileSize = 1;
			this.enabled = enabled;
			this.color = color;
		}

		private AoeObjectInfo(AoeObjectType type, int tickDuration, int tileSize, boolean enabled, Color color)
		{
			this.type = type;
			this.tickDuration = tickDuration;
			this.tileSize = tileSize;
			this.enabled = enabled;
			this.color = color;
		}
	}
}
