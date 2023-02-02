import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kp")
public class class299 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lra;"
	)
	static IndexedSprite field3457;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -88192509
	)
	static int field3458;

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(CI)B",
		garbageValue = "25865183"
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
		} else if (var0 == 8217) { // L: 27
			var1 = -110;
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

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2143498603"
	)
	static final void method5834(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255); // L: 12175
		if (var0 != StructComposition.clientPreferences.method2425()) { // L: 12176
			if (StructComposition.clientPreferences.method2425() == 0 && Client.currentTrackGroupId != -1) { // L: 12177
				KeyHandler.method426(class162.archive6, Client.currentTrackGroupId, 0, var0, false); // L: 12178
				Client.playingJingle = false; // L: 12179
			} else if (var0 == 0) { // L: 12181
				class6.method39(); // L: 12182
				Client.playingJingle = false; // L: 12183
			} else {
				class32.method468(var0); // L: 12185
			}

			StructComposition.clientPreferences.method2414(var0); // L: 12186
		}

	} // L: 12188
}
