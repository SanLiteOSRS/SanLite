import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eb")
@Implements("UserComparator5")
public class UserComparator5 extends AbstractUserComparator {
	@ObfuscatedName("ac")
	@Export("reversed")
	final boolean reversed;

	public UserComparator5(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lri;Lri;B)I",
		garbageValue = "29"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0) { // L: 14
			if (var2.world == 0) { // L: 15
				return this.reversed ? -1 : 1;
			}
		} else if (var2.world != 0) {
			return this.reversed ? 1 : -1; // L: 18
		}

		return this.compareUser(var1, var2); // L: 20
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 24
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-128"
	)
	static void method2904() {
		try {
			File var0 = new File(DevicePcmPlayerProvider.userHomeDirectory, "random.dat"); // L: 296
			int var2;
			if (var0.exists()) { // L: 297
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0); // L: 298
			} else {
				label38:
				for (int var1 = 0; var1 < class27.field147.length; ++var1) { // L: 301
					for (var2 = 0; var2 < FriendsList.field4675.length; ++var2) { // L: 302
						File var3 = new File(FriendsList.field4675[var2] + class27.field147[var1] + File.separatorChar + "random.dat"); // L: 303
						if (var3.exists()) { // L: 304
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var3, "rw", 25L), 24, 0); // L: 305
							break label38; // L: 306
						}
					}
				}
			}

			if (JagexCache.JagexCache_randomDat == null) { // L: 311
				RandomAccessFile var4 = new RandomAccessFile(var0, "rw"); // L: 312
				var2 = var4.read(); // L: 313
				var4.seek(0L); // L: 314
				var4.write(var2); // L: 315
				var4.seek(0L); // L: 316
				var4.close(); // L: 317
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0); // L: 318
			}
		} catch (IOException var5) { // L: 321
		}

	} // L: 322

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIIIII[Lih;B)V",
		garbageValue = "-89"
	)
	static final void method2902(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, CollisionMap[] var10) {
		int var12;
		for (int var11 = 0; var11 < 8; ++var11) { // L: 110
			for (var12 = 0; var12 < 8; ++var12) { // L: 111
				if (var11 + var2 > 0 && var11 + var2 < 103 && var3 + var12 > 0 && var3 + var12 < 103) {
					int[] var10000 = var10[var1].flags[var11 + var2];
					var10000[var3 + var12] &= -16777217;
				}
			}
		}

		Buffer var24 = new Buffer(var0);

		for (var12 = 0; var12 < 4; ++var12) {
			for (int var13 = 0; var13 < 64; ++var13) {
				for (int var14 = 0; var14 < 64; ++var14) {
					if (var12 == var4 && var13 >= var5 && var13 < var5 + 8 && var14 >= var6 && var14 < var6 + 8) { // L: 119
						int var17 = var13 & 7;
						int var18 = var14 & 7;
						int var19 = var7 & 3;
						int var16;
						if (var19 == 0) {
							var16 = var17; // L: 128
						} else if (var19 == 1) { // L: 131
							var16 = var18; // L: 132
						} else if (var19 == 2) { // L: 135
							var16 = 7 - var17; // L: 136
						} else {
							var16 = 7 - var18; // L: 139
						}

						int var20 = var16 + var2; // L: 141
						int var21 = var3 + ClanChannelMember.method3165(var13 & 7, var14 & 7, var7); // L: 142
						int var22 = (var13 & 7) + var8 + var2; // L: 143
						int var23 = var3 + (var14 & 7) + var9; // L: 144
						class104.loadTerrain(var24, var1, var20, var21, var22, var23, var7); // L: 145
					} else {
						class104.loadTerrain(var24, 0, -1, -1, 0, 0, 0); // L: 147
					}
				}
			}
		}

	} // L: 151

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIZI)Ljava/lang/String;",
		garbageValue = "-18328048"
	)
	static String method2903(int var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 112
			if (var2 && var0 >= 0) { // L: 113
				int var3 = 2; // L: 114

				for (int var4 = var0 / var1; var4 != 0; ++var3) { // L: 115 116 118
					var4 /= var1; // L: 117
				}

				char[] var5 = new char[var3]; // L: 120
				var5[0] = '+'; // L: 121

				for (int var6 = var3 - 1; var6 > 0; --var6) { // L: 122
					int var7 = var0; // L: 123
					var0 /= var1; // L: 124
					int var8 = var7 - var0 * var1; // L: 125
					if (var8 >= 10) { // L: 126
						var5[var6] = (char)(var8 + 87);
					} else {
						var5[var6] = (char)(var8 + 48); // L: 127
					}
				}

				return new String(var5); // L: 129
			} else {
				return Integer.toString(var0, var1);
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}
}
