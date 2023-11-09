import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dj")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("ue")
	@ObfuscatedGetter(
		intValue = 2125531776
	)
	static int field1233;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 968748489
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1602340347
	)
	@Export("health")
	int health;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 582432987
	)
	@Export("health2")
	int health2;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 801480233
	)
	@Export("cycleOffset")
	int cycleOffset;

	HealthBarUpdate(int var1, int var2, int var3, int var4) {
		this.cycle = var1; // L: 12
		this.health = var2; // L: 13
		this.health2 = var3; // L: 14
		this.cycleOffset = var4; // L: 15
	} // L: 16

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "33"
	)
	@Export("set")
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1; // L: 19
		this.health = var2; // L: 20
		this.health2 = var3; // L: 21
		this.cycleOffset = var4; // L: 22
	} // L: 23

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2067901217"
	)
	static void method2400(int var0, int var1) {
		if (class10.clientPreferences.method2488() != 0 && var0 != -1) { // L: 3785
			class368.method6892(ViewportMouse.field2770, var0, 0, class10.clientPreferences.method2488(), false); // L: 3786
			Client.playingJingle = true; // L: 3787
		}

	} // L: 3789

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(Ldh;ZI)V",
		garbageValue = "-1885589665"
	)
	@Export("addPlayerToScene")
	static void addPlayerToScene(Player var0, boolean var1) {
		if (var0 != null && var0.isVisible() && !var0.isHidden) { // L: 5073
			var0.isUnanimated = false; // L: 5074
			if ((Client.isLowDetail && Players.Players_count > 50 || Players.Players_count > 200) && var1 && var0.idleSequence == var0.movementSequence) { // L: 5075 5076
				var0.isUnanimated = true;
			}

			int var2 = var0.x >> 7; // L: 5078
			int var3 = var0.y >> 7; // L: 5079
			if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) { // L: 5080
				long var4 = class394.calculateTag(0, 0, 0, false, var0.index); // L: 5081
				if (var0.model0 != null && Client.cycle >= var0.animationCycleStart && Client.cycle < var0.animationCycleEnd) { // L: 5082
					var0.isUnanimated = false; // L: 5083
					var0.tileHeight = Renderable.getTileHeight(var0.x, var0.y, Clock.Client_plane); // L: 5084
					var0.playerCycle = Client.cycle; // L: 5085
					class36.scene.addNullableObject(Clock.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.minX, var0.minY, var0.maxX, var0.maxY); // L: 5086
				} else {
					if ((var0.x & 127) == 64 && (var0.y & 127) == 64) { // L: 5089
						if (Client.tileLastDrawnActor[var2][var3] == Client.viewportDrawCount) { // L: 5090
							return;
						}

						Client.tileLastDrawnActor[var2][var3] = Client.viewportDrawCount; // L: 5091
					}

					var0.tileHeight = Renderable.getTileHeight(var0.x, var0.y, Clock.Client_plane); // L: 5093
					var0.playerCycle = Client.cycle; // L: 5094
					class36.scene.drawEntity(Clock.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.isWalking); // L: 5095
				}
			}
		}

	} // L: 5099

	@ObfuscatedName("ms")
	@ObfuscatedSignature(
		descriptor = "(Lmb;IIIB)V",
		garbageValue = "-55"
	)
	@Export("drawCompass")
	static final void drawCompass(Widget var0, int var1, int var2, int var3) {
		SpriteMask var4 = var0.getSpriteMask(false); // L: 12502
		if (var4 != null) { // L: 12503
			if (Client.minimapState < 3) { // L: 12504
				class304.compass.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var4.xStarts, var4.xWidths);
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 12505
			}

		}
	} // L: 12506
}
