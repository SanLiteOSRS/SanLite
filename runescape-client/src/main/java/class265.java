import java.awt.FontMetrics;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jg")
public class class265 {
	@ObfuscatedName("ah")
	@Export("loginScreenFontMetrics")
	static FontMetrics loginScreenFontMetrics;

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "2064916669"
	)
	static final void method4984(int var0, int var1, boolean var2) {
		if (!var2 || var0 != class12.field111 || RouteStrategy.field1919 != var1) {
			class12.field111 = var0;
			RouteStrategy.field1919 = var1;
			Projectile.updateGameState(25);
			class143.drawLoadingMessage("Loading - please wait.", true);
			int var3 = class15.baseX * 64;
			int var4 = WorldMapSprite.baseY * 64;
			class15.baseX = (var0 - 6) * 8;
			WorldMapSprite.baseY = (var1 - 6) * 8;
			int var5 = class15.baseX * 64 - var3;
			int var6 = WorldMapSprite.baseY * 64 - var4;
			var3 = class15.baseX * 64;
			var4 = WorldMapSprite.baseY * 64;

			int var7;
			int var9;
			int[] var10000;
			for (var7 = 0; var7 < 32768; ++var7) {
				NPC var19 = Client.npcs[var7];
				if (var19 != null) {
					for (var9 = 0; var9 < 10; ++var9) {
						var10000 = var19.pathX;
						var10000[var9] -= var5;
						var10000 = var19.pathY;
						var10000[var9] -= var6;
					}

					var19.x -= var5 * 128;
					var19.y -= var6 * 128;
				}
			}

			for (var7 = 0; var7 < 2048; ++var7) {
				Player var22 = Client.players[var7];
				if (var22 != null) {
					for (var9 = 0; var9 < 10; ++var9) {
						var10000 = var22.pathX;
						var10000[var9] -= var5;
						var10000 = var22.pathY;
						var10000[var9] -= var6;
					}

					var22.x -= var5 * 128;
					var22.y -= var6 * 128;
				}
			}

			byte var20 = 0;
			byte var8 = 104;
			byte var21 = 1;
			if (var5 < 0) {
				var20 = 103;
				var8 = -1;
				var21 = -1;
			}

			byte var10 = 0;
			byte var11 = 104;
			byte var12 = 1;
			if (var6 < 0) {
				var10 = 103;
				var11 = -1;
				var12 = -1;
			}

			int var14;
			for (int var13 = var20; var8 != var13; var13 += var21) {
				for (var14 = var10; var11 != var14; var14 += var12) {
					int var15 = var5 + var13;
					int var16 = var14 + var6;

					for (int var17 = 0; var17 < 4; ++var17) {
						if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
							Client.groundItems[var17][var13][var14] = Client.groundItems[var17][var15][var16];
						} else {
							Client.groundItems[var17][var13][var14] = null;
						}
					}
				}
			}

			for (PendingSpawn var18 = (PendingSpawn)Client.pendingSpawns.last(); var18 != null; var18 = (PendingSpawn)Client.pendingSpawns.previous()) {
				var18.x -= var5;
				var18.y -= var6;
				if (var18.x < 0 || var18.y < 0 || var18.x >= 104 || var18.y >= 104) {
					var18.remove();
				}
			}

			if (Client.destinationX != 0) {
				Client.destinationX -= var5;
				Client.destinationY -= var6;
			}

			Client.soundEffectCount = 0;
			Client.isCameraLocked = false;
			ObjectSound.cameraX -= var5 << 7;
			Canvas.cameraZ -= var6 << 7;
			FriendSystem.oculusOrbFocalPointX -= var5 << 7;
			VarbitComposition.oculusOrbFocalPointY -= var6 << 7;
			Client.field853 = -1;
			Client.graphicsObjects.clear();
			Client.projectiles.clear();

			for (var14 = 0; var14 < 4; ++var14) {
				Client.collisionMaps[var14].clear();
			}

		}
	}
}
