import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bf")
public class class36 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("reflectionChecks")
	static IterableNodeDeque reflectionChecks;
	@ObfuscatedName("nr")
	@ObfuscatedGetter(
		intValue = -1984013837
	)
	@Export("menuX")
	static int menuX;

	static {
		reflectionChecks = new IterableNodeDeque();
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "728919527"
	)
	static int method699(int var0, int var1) {
		if (var0 == -2) { // L: 15
			return 12345678;
		} else if (var0 == -1) { // L: 16
			if (var1 < 0) { // L: 17
				var1 = 0; // L: 18
			} else if (var1 > 127) { // L: 20
				var1 = 127; // L: 21
			}

			var1 = 127 - var1; // L: 23
			return var1; // L: 24
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 26
			if (var1 < 2) { // L: 27
				var1 = 2;
			} else if (var1 > 126) { // L: 28
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 29
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "2080414155"
	)
	static int method696(byte[] var0, int var1, int var2) {
		int var3 = -1; // L: 47

		for (int var4 = var1; var4 < var2; ++var4) { // L: 48
			var3 = var3 >>> 8 ^ Buffer.crc32Table[(var3 ^ var0[var4]) & 255]; // L: 49
		}

		var3 = ~var3; // L: 51
		return var3; // L: 52
	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1338864931"
	)
	static int method693(int var0) {
		return var0 * 3 + 600; // L: 1556
	}

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "476469786"
	)
	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close(); // L: 2917
		class30.method473(); // L: 2918
		class173.scene.clear(); // L: 2919

		for (int var0 = 0; var0 < 4; ++var0) { // L: 2920
			Client.collisionMaps[var0].clear();
		}

		Client.field734.method4226(); // L: 2921
		System.gc(); // L: 2922
		class90.method2339(0, 0); // L: 2923
		WorldMapDecorationType.method6641(); // L: 2924
		Client.playingJingle = false; // L: 2925
		class238.method4845(); // L: 2926
		AttackOption.method2723(10); // L: 2927
	} // L: 2928

	@ObfuscatedName("me")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-580076981"
	)
	static final void method697() {
		Client.field617 = Client.cycleCntr; // L: 12591
		Messages.field1412 = true; // L: 12592
	} // L: 12593
}
