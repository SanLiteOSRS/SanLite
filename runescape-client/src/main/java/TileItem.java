import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("el")
@Implements("TileItem")
public final class TileItem extends Renderable {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1587968895
	)
	@Export("id")
	int id;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1767030957
	)
	@Export("quantity")
	int quantity;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1704232705
	)
	int field1335;

	TileItem() {
		this.field1335 = 31; // L: 11
	} // L: 13

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "46"
	)
	void method2750(int var1) {
		this.field1335 = var1; // L: 16
	} // L: 17

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lko;",
		garbageValue = "-714420560"
	)
	@Export("getModel")
	protected final Model getModel() {
		return class341.ItemComposition_get(this.id).getModel(this.quantity); // L: 27
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "1"
	)
	boolean method2751(int var1) {
		if (var1 >= 0 && var1 <= 4) { // L: 20
			return (this.field1335 & 1 << var1) != 0; // L: 21
		} else {
			return true; // L: 23
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1453512088"
	)
	static int method2762() {
		return KeyHandler.KeyHandler_keyCodes.length; // L: 103
	}

	@ObfuscatedName("aa")
	static final void method2757(long var0) {
		ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var0; // L: 94
	} // L: 95

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-117"
	)
	static void method2764() {
		if (class25.localPlayer.x >> 7 == Client.destinationX && class25.localPlayer.y >> 7 == Client.destinationY) { // L: 4957
			Client.destinationX = 0; // L: 4958
		}

	} // L: 4960

	@ObfuscatedName("oz")
	@ObfuscatedSignature(
		descriptor = "(IIIILuc;Lmq;B)V",
		garbageValue = "20"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		if (var4 != null) { // L: 12436
			int var6 = Client.camAngleY & 2047; // L: 12437
			int var7 = var3 * var3 + var2 * var2; // L: 12438
			if (var7 <= 6400) { // L: 12439
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 12440
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 12441
				int var10 = var9 * var2 + var3 * var8 >> 16; // L: 12442
				int var11 = var3 * var9 - var8 * var2 >> 16; // L: 12443
				if (var7 > 2500) {
					var4.method9911(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths); // L: 12444
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2); // L: 12445
				}

			}
		}
	} // L: 12446
}
