import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fw")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("j")
	@Export("cacheDir")
	public static File cacheDir;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	static GameBuild field2084;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -2029148241
	)
	@Export("objectDefinitionId")
	final int objectDefinitionId;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 968273187
	)
	@Export("decoration")
	final int decoration;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -576802065
	)
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1;
		this.decoration = var2;
		this.rotation = var3;
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1240184930"
	)
	static final void method3710(int var0, int var1, int var2, int var3) {
		Client.overheadTextCount = 0;
		boolean var4 = false;
		int var5 = -1;
		int var6 = -1;
		int var7 = Players.Players_count;
		int[] var8 = Players.Players_indices;

		int var9;
		for (var9 = 0; var9 < var7 + Client.npcCount; ++var9) {
			Object var20;
			if (var9 < var7) {
				var20 = Client.players[var8[var9]];
				if (var8[var9] == Client.combatTargetPlayerIndex) {
					var4 = true;
					var5 = var9;
					continue;
				}

				if (var20 == class262.localPlayer) {
					var6 = var9;
					continue;
				}
			} else {
				var20 = Client.npcs[Client.npcIndices[var9 - var7]];
			}

			UserComparator4.drawActor2d((Actor)var20, var9, var0, var1, var2, var3);
		}

		if (Client.renderSelf && var6 != -1) {
			UserComparator4.drawActor2d(class262.localPlayer, var6, var0, var1, var2, var3);
		}

		if (var4) {
			UserComparator4.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var5, var0, var1, var2, var3);
		}

		for (var9 = 0; var9 < Client.overheadTextCount; ++var9) {
			int var10 = Client.overheadTextXs[var9];
			int var11 = Client.overheadTextYs[var9];
			int var12 = Client.overheadTextXOffsets[var9];
			int var13 = Client.overheadTextAscents[var9];
			boolean var14 = true;

			while (var14) {
				var14 = false;

				for (int var19 = 0; var19 < var9; ++var19) {
					if (var11 + 2 > Client.overheadTextYs[var19] - Client.overheadTextAscents[var19] && var11 - var13 < Client.overheadTextYs[var19] + 2 && var10 - var12 < Client.overheadTextXs[var19] + Client.overheadTextXOffsets[var19] && var12 + var10 > Client.overheadTextXs[var19] - Client.overheadTextXOffsets[var19] && Client.overheadTextYs[var19] - Client.overheadTextAscents[var19] < var11) {
						var11 = Client.overheadTextYs[var19] - Client.overheadTextAscents[var19];
						var14 = true;
					}
				}
			}

			Client.viewportTempX = Client.overheadTextXs[var9];
			Client.viewportTempY = Client.overheadTextYs[var9] = var11;
			String var15 = Client.overheadText[var9];
			if (Client.chatEffects == 0) {
				int var16 = 16776960;
				if (Client.overheadTextColors[var9] < 6) {
					var16 = Client.field725[Client.overheadTextColors[var9]];
				}

				if (Client.overheadTextColors[var9] == 6) {
					var16 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.overheadTextColors[var9] == 7) {
					var16 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.overheadTextColors[var9] == 8) {
					var16 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
				}

				int var17;
				if (Client.overheadTextColors[var9] == 9) {
					var17 = 150 - Client.overheadTextCyclesRemaining[var9];
					if (var17 < 50) {
						var16 = var17 * 1280 + 16711680;
					} else if (var17 < 100) {
						var16 = 16776960 - (var17 - 50) * 327680;
					} else if (var17 < 150) {
						var16 = (var17 - 100) * 5 + 65280;
					}
				}

				if (Client.overheadTextColors[var9] == 10) {
					var17 = 150 - Client.overheadTextCyclesRemaining[var9];
					if (var17 < 50) {
						var16 = var17 * 5 + 16711680;
					} else if (var17 < 100) {
						var16 = 16711935 - (var17 - 50) * 327680;
					} else if (var17 < 150) {
						var16 = (var17 - 100) * 327680 + 255 - (var17 - 100) * 5;
					}
				}

				if (Client.overheadTextColors[var9] == 11) {
					var17 = 150 - Client.overheadTextCyclesRemaining[var9];
					if (var17 < 50) {
						var16 = 16777215 - var17 * 327685;
					} else if (var17 < 100) {
						var16 = (var17 - 50) * 327685 + 65280;
					} else if (var17 < 150) {
						var16 = 16777215 - (var17 - 100) * 327680;
					}
				}

				if (Client.overheadTextEffects[var9] == 0) {
					class309.fontBold12.drawCentered(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0);
				}

				if (Client.overheadTextEffects[var9] == 1) {
					class309.fontBold12.drawCenteredWave(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var9] == 2) {
					class309.fontBold12.drawCenteredWave2(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var9] == 3) {
					class309.fontBold12.drawCenteredShake(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var9]);
				}

				if (Client.overheadTextEffects[var9] == 4) {
					var17 = (150 - Client.overheadTextCyclesRemaining[var9]) * (class309.fontBold12.stringWidth(var15) + 100) / 150;
					Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1);
					class309.fontBold12.draw(var15, var0 + Client.viewportTempX + 50 - var17, Client.viewportTempY + var1, var16, 0);
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
				}

				if (Client.overheadTextEffects[var9] == 5) {
					var17 = 150 - Client.overheadTextCyclesRemaining[var9];
					int var18 = 0;
					if (var17 < 25) {
						var18 = var17 - 25;
					} else if (var17 > 125) {
						var18 = var17 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - class309.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5);
					class309.fontBold12.drawCentered(var15, var0 + Client.viewportTempX, var18 + Client.viewportTempY + var1, var16, 0);
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
				}
			} else {
				class309.fontBold12.drawCentered(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0);
			}
		}

	}
}
