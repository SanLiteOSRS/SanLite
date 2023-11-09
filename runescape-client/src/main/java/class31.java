import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ar")
public class class31 {
	@ObfuscatedName("sh")
	@ObfuscatedSignature(
		descriptor = "Lrs;"
	)
	@Export("sceneMinimapSprite")
	static SpritePixels sceneMinimapSprite;
	@ObfuscatedName("f")
	static Applet field190;
	@ObfuscatedName("w")
	static String field186;

	static {
		field190 = null; // L: 10
		field186 = ""; // L: 11
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(CI)B",
		garbageValue = "754042406"
	)
	@Export("charToByteCp1252")
	public static byte charToByteCp1252(char var0) {
		byte var1;
		if (var0 > 0 && var0 < 128 || var0 >= 160 && var0 <= 255) { // L: 12
			var1 = (byte)var0;
		} else if (var0 == 8364) { // L: 13
			var1 = -128;
		} else if (var0 == 8218) { // L: 14
			var1 = -126;
		} else if (var0 == 402) { // L: 15
			var1 = -125;
		} else if (var0 == 8222) { // L: 16
			var1 = -124;
		} else if (var0 == 8230) { // L: 17
			var1 = -123;
		} else if (var0 == 8224) { // L: 18
			var1 = -122;
		} else if (var0 == 8225) { // L: 19
			var1 = -121;
		} else if (var0 == 710) { // L: 20
			var1 = -120;
		} else if (var0 == 8240) { // L: 21
			var1 = -119;
		} else if (var0 == 352) { // L: 22
			var1 = -118;
		} else if (var0 == 8249) { // L: 23
			var1 = -117;
		} else if (var0 == 338) { // L: 24
			var1 = -116;
		} else if (var0 == 381) { // L: 25
			var1 = -114;
		} else if (var0 == 8216) { // L: 26
			var1 = -111;
		} else if (var0 == 8217) {
			var1 = -110; // L: 27
		} else if (var0 == 8220) { // L: 28
			var1 = -109;
		} else if (var0 == 8221) { // L: 29
			var1 = -108;
		} else if (var0 == 8226) { // L: 30
			var1 = -107;
		} else if (var0 == 8211) { // L: 31
			var1 = -106;
		} else if (var0 == 8212) { // L: 32
			var1 = -105;
		} else if (var0 == 732) { // L: 33
			var1 = -104;
		} else if (var0 == 8482) { // L: 34
			var1 = -103;
		} else if (var0 == 353) { // L: 35
			var1 = -102;
		} else if (var0 == 8250) { // L: 36
			var1 = -101;
		} else if (var0 == 339) { // L: 37
			var1 = -100;
		} else if (var0 == 382) { // L: 38
			var1 = -98;
		} else if (var0 == 376) { // L: 39
			var1 = -97;
		} else {
			var1 = 63; // L: 40
		}

		return var1; // L: 41
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-350025471"
	)
	public static void method460() {
		HealthBarDefinition.HealthBarDefinition_cached.clear(); // L: 94
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear(); // L: 95
	} // L: 96

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1409171773"
	)
	static final void method471(String var0) {
		Decimator.method1115(var0 + " is already on your ignore list"); // L: 174
	} // L: 175

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lan;I)V",
		garbageValue = "2069353782"
	)
	@Export("PcmStream_disable")
	static final void PcmStream_disable(PcmStream var0) {
		var0.active = false; // L: 266
		if (var0.sound != null) { // L: 267
			var0.sound.position = 0;
		}

		for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
			PcmStream_disable(var1); // L: 268
		}

	} // L: 269

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(Lcb;II)V",
		garbageValue = "-19548989"
	)
	static final void method468(Actor var0, int var1) {
		class467.worldToScreen(var0.x, var0.y, var1); // L: 5746
	} // L: 5747

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(IIIILrs;Lkb;B)V",
		garbageValue = "126"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		if (var4 != null) { // L: 13078
			int var6 = Client.camAngleY & 2047; // L: 13079
			int var7 = var3 * var3 + var2 * var2; // L: 13080
			if (var7 <= 6400) { // L: 13081
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 13082
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 13083
				int var10 = var9 * var2 + var3 * var8 >> 16; // L: 13084
				int var11 = var3 * var9 - var8 * var2 >> 16; // L: 13085
				if (var7 > 2500) {
					var4.method9115(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths); // L: 13086
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2); // L: 13087
				}

			}
		}
	} // L: 13088
}
