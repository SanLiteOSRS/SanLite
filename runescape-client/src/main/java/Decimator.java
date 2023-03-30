import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("co")
@Implements("Decimator")
public class Decimator {
	@ObfuscatedName("aq")
	static byte[][][] field405;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1441139311
	)
	@Export("inputRate")
	int inputRate;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1644975557
	)
	@Export("outputRate")
	int outputRate;
	@ObfuscatedName("ao")
	@Export("table")
	int[][] table;

	public Decimator(int var1, int var2) {
		if (var2 != var1) { // L: 14
			int var3 = Client.method1780(var1, var2); // L: 15
			var1 /= var3; // L: 16
			var2 /= var3; // L: 17
			this.inputRate = var1; // L: 18
			this.outputRate = var2; // L: 19
			this.table = new int[var1][14]; // L: 20

			for (int var4 = 0; var4 < var1; ++var4) { // L: 21
				int[] var5 = this.table[var4]; // L: 22
				double var6 = 6.0D + (double)var4 / (double)var1; // L: 23
				int var8 = (int)Math.floor(1.0D + (var6 - 7.0D)); // L: 24
				if (var8 < 0) { // L: 25
					var8 = 0;
				}

				int var9 = (int)Math.ceil(var6 + 7.0D); // L: 26
				if (var9 > 14) { // L: 27
					var9 = 14;
				}

				for (double var10 = (double)var2 / (double)var1; var8 < var9; ++var8) { // L: 28 29
					double var12 = ((double)var8 - var6) * 3.141592653589793D; // L: 30
					double var14 = var10; // L: 31
					if (var12 < -1.0E-4D || var12 > 1.0E-4D) { // L: 32
						var14 = var10 * (Math.sin(var12) / var12);
					}

					var14 *= 0.54D + 0.46D * Math.cos(((double)var8 - var6) * 0.2243994752564138D); // L: 33
					var5[var8] = (int)Math.floor(0.5D + 65536.0D * var14); // L: 34
				}
			}

		}
	} // L: 37

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "581070602"
	)
	@Export("resample")
	byte[] resample(byte[] var1) {
		if (this.table != null) { // L: 40
			int var2 = (int)((long)var1.length * (long)this.outputRate / (long)this.inputRate) + 14; // L: 41
			int[] var3 = new int[var2]; // L: 42
			int var4 = 0; // L: 43
			int var5 = 0; // L: 44

			int var6;
			for (var6 = 0; var6 < var1.length; ++var6) { // L: 45
				byte var7 = var1[var6]; // L: 46
				int[] var8 = this.table[var5]; // L: 47

				int var9;
				for (var9 = 0; var9 < 14; ++var9) {
					var3[var4 + var9] += var8[var9] * var7;
				}

				var5 += this.outputRate; // L: 49
				var9 = var5 / this.inputRate; // L: 50
				var4 += var9; // L: 51
				var5 -= var9 * this.inputRate; // L: 52
			}

			var1 = new byte[var2]; // L: 54

			for (var6 = 0; var6 < var2; ++var6) { // L: 55
				int var10 = var3[var6] + 32768 >> 16; // L: 56
				if (var10 < -128) { // L: 57
					var1[var6] = -128;
				} else if (var10 > 127) { // L: 58
					var1[var6] = 127;
				} else {
					var1[var6] = (byte)var10; // L: 59
				}
			}
		}

		return var1; // L: 62
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1978966471"
	)
	@Export("scaleRate")
	int scaleRate(int var1) {
		if (this.table != null) {
			var1 = (int)((long)this.outputRate * (long)var1 / (long)this.inputRate); // L: 66
		}

		return var1; // L: 67
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "122"
	)
	@Export("scalePosition")
	int scalePosition(int var1) {
		if (this.table != null) { // L: 71
			var1 = (int)((long)this.outputRate * (long)var1 / (long)this.inputRate) + 6;
		}

		return var1; // L: 72
	}

	@ObfuscatedName("al")
	public static boolean method1127(long var0) {
		return var0 != 0L && !ClanSettings.method3197(var0); // L: 48
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "-1641012787"
	)
	@Export("ByteArrayPool_getArray")
	public static synchronized byte[] ByteArrayPool_getArray(int var0) {
		return ByteArrayPool.ByteArrayPool_getArrayBool(var0, false);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([BIIII[Liz;B)V",
		garbageValue = "75"
	)
	static final void method1125(byte[] var0, int var1, int var2, int var3, int var4, CollisionMap[] var5) {
		int var7;
		int var8;
		for (int var6 = 0; var6 < 4; ++var6) { // L: 94
			for (var7 = 0; var7 < 64; ++var7) { // L: 95
				for (var8 = 0; var8 < 64; ++var8) { // L: 96
					if (var7 + var1 > 0 && var7 + var1 < 103 && var8 + var2 > 0 && var8 + var2 < 103) { // L: 97
						int[] var10000 = var5[var6].flags[var7 + var1];
						var10000[var8 + var2] &= -16777217;
					}
				}
			}
		}

		Buffer var12 = new Buffer(var0); // L: 101

		for (var7 = 0; var7 < 4; ++var7) { // L: 102
			for (var8 = 0; var8 < 64; ++var8) { // L: 103
				for (int var9 = 0; var9 < 64; ++var9) { // L: 104
					int var10 = var8 + var1; // L: 105
					int var11 = var9 + var2; // L: 106
					WorldMapScaleHandler.loadTerrain(var12, var7, var10, var11, var3 + var10, var11 + var4, 0); // L: 107
				}
			}
		}

	} // L: 111

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "421048908"
	)
	static int method1114() {
		return Login.loginIndex; // L: 2227
	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-617298505"
	)
	static final void method1120() {
		if (class180.field1875) { // L: 3719
			class174.method3493(); // L: 3720
			class180.field1875 = false; // L: 3721
		}

	} // L: 3723

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIII)V",
		garbageValue = "-2138006752"
	)
	static final void method1124(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		PendingSpawn var10 = null; // L: 7850

		for (PendingSpawn var11 = (PendingSpawn)Client.pendingSpawns.last(); var11 != null; var11 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 7851 7852 7857
			if (var0 == var11.plane && var11.x == var1 && var2 == var11.y && var3 == var11.type) { // L: 7853
				var10 = var11; // L: 7854
				break;
			}
		}

		if (var10 == null) { // L: 7859
			var10 = new PendingSpawn(); // L: 7860
			var10.plane = var0; // L: 7861
			var10.type = var3; // L: 7862
			var10.x = var1; // L: 7863
			var10.y = var2; // L: 7864
			var10.field1133 = -1; // L: 7865
			class27.method383(var10); // L: 7866
			Client.pendingSpawns.addFirst(var10); // L: 7867
		}

		var10.field1135 = var4; // L: 7869
		var10.field1132 = var5; // L: 7870
		var10.field1131 = var6; // L: 7871
		var10.delay = var8; // L: 7872
		var10.hitpoints = var9; // L: 7873
		var10.method2344(var7); // L: 7874
	} // L: 7875
}
