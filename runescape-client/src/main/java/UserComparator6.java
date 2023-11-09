import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("es")
@Implements("UserComparator6")
public class UserComparator6 extends AbstractUserComparator {
	@ObfuscatedName("at")
	@Export("reversed")
	final boolean reversed;

	public UserComparator6(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lqg;Lqg;I)I",
		garbageValue = "2036982649"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) { // L: 14
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername()); // L: 15
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/io/File;",
		garbageValue = "38"
	)
	@Export("getFile")
	static File getFile(String var0) {
		if (!FileSystem.FileSystem_hasPermissions) { // L: 16
			throw new RuntimeException("");
		} else {
			File var1 = (File)FileSystem.FileSystem_cacheFiles.get(var0); // L: 17
			if (var1 != null) { // L: 18
				return var1;
			} else {
				File var2 = new File(FileSystem.FileSystem_cacheDir, var0); // L: 19
				RandomAccessFile var3 = null; // L: 20

				try {
					File var4 = new File(var2.getParent()); // L: 22
					if (!var4.exists()) { // L: 23
						throw new RuntimeException("");
					} else {
						var3 = new RandomAccessFile(var2, "rw"); // L: 24
						int var5 = var3.read(); // L: 25
						var3.seek(0L); // L: 26
						var3.write(var5); // L: 27
						var3.seek(0L); // L: 28
						var3.close(); // L: 29
						FileSystem.FileSystem_cacheFiles.put(var0, var2); // L: 30
						return var2; // L: 31
					}
				} catch (Exception var8) {
					try {
						if (var3 != null) { // L: 35
							var3.close(); // L: 36
							var3 = null; // L: 37
						}
					} catch (Exception var7) { // L: 40
					}

					throw new RuntimeException(); // L: 42
				}
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "([BIILiz;[Lic;I)V",
		garbageValue = "-2003499120"
	)
	static final void method2895(byte[] var0, int var1, int var2, Scene var3, CollisionMap[] var4) {
		Buffer var5 = new Buffer(var0); // L: 254
		int var6 = -1; // L: 255

		while (true) {
			int var7 = var5.method9023(); // L: 257
			if (var7 == 0) { // L: 258
				return; // L: 282
			}

			var6 += var7; // L: 259
			int var8 = 0; // L: 260

			while (true) {
				int var9 = var5.readUShortSmart(); // L: 262
				if (var9 == 0) { // L: 263
					break;
				}

				var8 += var9 - 1; // L: 264
				int var10 = var8 & 63; // L: 265
				int var11 = var8 >> 6 & 63; // L: 266
				int var12 = var8 >> 12; // L: 267
				int var13 = var5.readUnsignedByte(); // L: 268
				int var14 = var13 >> 2; // L: 269
				int var15 = var13 & 3; // L: 270
				int var16 = var11 + var1; // L: 271
				int var17 = var10 + var2; // L: 272
				if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) { // L: 273
					int var18 = var12; // L: 274
					if ((Tiles.Tiles_renderFlags[1][var16][var17] & 2) == 2) { // L: 275
						var18 = var12 - 1;
					}

					CollisionMap var19 = null; // L: 276
					if (var18 >= 0) { // L: 277
						var19 = var4[var18];
					}

					SpriteMask.addObjects(var12, var16, var17, var6, var15, var14, var3, var19); // L: 278
				}
			}
		}
	}
}
