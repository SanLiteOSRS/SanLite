import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ka")
@Implements("WorldMapData_0")
public class WorldMapData_0 extends AbstractWorldMapData {
	WorldMapData_0() {
	} // L: 6

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)V",
		garbageValue = "-2145094996"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 9
		if (var2 != WorldMapID.field3133.value) { // L: 10
			throw new IllegalStateException(""); // L: 11
		} else {
			super.minPlane = var1.readUnsignedByte(); // L: 13
			super.planes = var1.readUnsignedByte(); // L: 14
			super.regionXLow = var1.readUnsignedShort() * 64; // L: 15
			super.regionYLow = var1.readUnsignedShort() * 64; // L: 16
			super.regionX = var1.readUnsignedShort(); // L: 17
			super.regionY = var1.readUnsignedShort(); // L: 18
			super.groupId = var1.method9436(); // L: 19
			super.fileId = var1.method9436(); // L: 20
		}
	} // L: 21

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lur;B)V",
		garbageValue = "63"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4); // L: 25
		super.floorUnderlayIds = new short[1][64][64]; // L: 26
		super.floorOverlayIds = new short[super.planes][64][64]; // L: 27
		super.field3100 = new byte[super.planes][64][64];
		super.field3101 = new byte[super.planes][64][64];
		super.decorations = new WorldMapDecoration[super.planes][64][64][]; // L: 30
		int var2 = var1.readUnsignedByte();
		if (var2 != class286.field3129.value) {
			throw new IllegalStateException(""); // L: 33
		} else {
			int var3 = var1.readUnsignedByte(); // L: 35
			int var4 = var1.readUnsignedByte(); // L: 36
			if (var3 == super.regionX && var4 == super.regionY) { // L: 37
				for (int var5 = 0; var5 < 64; ++var5) { // L: 40
					for (int var6 = 0; var6 < 64; ++var6) { // L: 41
						this.readTile(var5, var6, var1); // L: 42
					}
				}

			} else {
				throw new IllegalStateException(""); // L: 38
			}
		}
	} // L: 45

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_0)) { // L: 49
			return false; // L: 50
		} else {
			WorldMapData_0 var2 = (WorldMapData_0)var1; // L: 52
			return super.regionX == var2.regionX && var2.regionY == super.regionY; // L: 53
		}
	}

	public int hashCode() {
		return super.regionX | super.regionY << 8; // L: 58
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Lsh;",
		garbageValue = "-5"
	)
	public static class469 method5232() {
		synchronized(class469.field4866) { // L: 28
			if (class277.field3054 == 0) { // L: 29
				return new class469();
			} else {
				class469.field4866[--class277.field3054].method8381(); // L: 31
				return class469.field4866[class277.field3054]; // L: 32
			}
		}
	}

	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "(Lnt;III)V",
		garbageValue = "1804968725"
	)
	@Export("alignWidgetPosition")
	static void alignWidgetPosition(Widget var0, int var1, int var2) {
		if (var0.xAlignment == 0) { // L: 11241
			var0.x = var0.rawX;
		} else if (var0.xAlignment == 1) { // L: 11242
			var0.x = var0.rawX + (var1 - var0.width) / 2;
		} else if (var0.xAlignment == 2) { // L: 11243
			var0.x = var1 - var0.width - var0.rawX;
		} else if (var0.xAlignment == 3) { // L: 11244
			var0.x = var0.rawX * var1 >> 14;
		} else if (var0.xAlignment == 4) { // L: 11245
			var0.x = (var1 - var0.width) / 2 + (var0.rawX * var1 >> 14);
		} else {
			var0.x = var1 - var0.width - (var0.rawX * var1 >> 14); // L: 11246
		}

		if (var0.yAlignment == 0) { // L: 11247
			var0.y = var0.rawY;
		} else if (var0.yAlignment == 1) { // L: 11248
			var0.y = (var2 - var0.height) / 2 + var0.rawY;
		} else if (var0.yAlignment == 2) { // L: 11249
			var0.y = var2 - var0.height - var0.rawY;
		} else if (var0.yAlignment == 3) {
			var0.y = var2 * var0.rawY >> 14; // L: 11250
		} else if (var0.yAlignment == 4) { // L: 11251
			var0.y = (var2 - var0.height) / 2 + (var2 * var0.rawY >> 14);
		} else {
			var0.y = var2 - var0.height - (var2 * var0.rawY >> 14); // L: 11252
		}

	} // L: 11253

	@ObfuscatedName("ml")
	@ObfuscatedSignature(
		descriptor = "(Lnt;B)V",
		garbageValue = "37"
	)
	@Export("invalidateWidget")
	public static void invalidateWidget(Widget var0) {
		if (var0 != null && var0.cycle == Client.field731) { // L: 12248
			Client.field732[var0.rootIndex] = true; // L: 12249
		}

	} // L: 12251

	@ObfuscatedName("on")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)Ljava/lang/String;",
		garbageValue = "126"
	)
	static String method5235(String var0, boolean var1) {
		String var2 = var1 ? "https://" : "http://"; // L: 12834
		if (Client.gameBuild == 1) { // L: 12835
			var0 = var0 + "-wtrc";
		} else if (Client.gameBuild == 2) { // L: 12836
			var0 = var0 + "-wtqa";
		} else if (Client.gameBuild == 3) { // L: 12837
			var0 = var0 + "-wtwip";
		} else if (Client.gameBuild == 5) { // L: 12838
			var0 = var0 + "-wti";
		} else if (Client.gameBuild == 4) { // L: 12839
			var0 = "local";
		}

		String var3 = ""; // L: 12840
		if (ViewportMouse.field2868 != null) { // L: 12841
			var3 = "/p=" + ViewportMouse.field2868;
		}

		String var4 = "runescape.com"; // L: 12842
		return var2 + var0 + "." + var4 + "/l=" + GraphicsObject.clientLanguage + "/a=" + class276.field3045 + var3 + "/"; // L: 12843
	}
}
