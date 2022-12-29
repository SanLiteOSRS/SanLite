import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fe")
@Implements("VarcInt")
public class VarcInt extends DualNode {
	@ObfuscatedName("sk")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	@Export("guestClanChannel")
	static ClanChannel guestClanChannel;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	@Export("VarcInt_archive")
	public static AbstractArchive VarcInt_archive;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("VarcInt_cached")
	static EvictingDualNodeHashTable VarcInt_cached;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	static ClanChannel field1956;
	@ObfuscatedName("mh")
	@ObfuscatedGetter(
		intValue = -1028390641
	)
	@Export("menuX")
	static int menuX;
	@ObfuscatedName("v")
	@Export("persist")
	public boolean persist;

	static {
		VarcInt_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	VarcInt() {
		this.persist = false; // L: 12
	} // L: 14

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lqy;I)V",
		garbageValue = "-1121101967"
	)
	void method3573(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 28
			if (var2 == 0) { // L: 29
				return; // L: 32
			}

			this.method3574(var1, var2); // L: 30
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lqy;II)V",
		garbageValue = "511684289"
	)
	void method3574(Buffer var1, int var2) {
		if (var2 == 2) { // L: 35
			this.persist = true; // L: 36
		}

	} // L: 39

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;",
		garbageValue = "2144931745"
	)
	public static File method3572(String var0, String var1, int var2) {
		String var3 = var2 == 0 ? "" : "" + var2; // L: 40
		JagexCache.JagexCache_locationFile = new File(UserComparator3.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var3 + ".dat"); // L: 41
		String var4 = null; // L: 42
		String var5 = null; // L: 43
		boolean var6 = false; // L: 44
		File var22;
		if (JagexCache.JagexCache_locationFile.exists()) { // L: 45
			try {
				AccessFile var7 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L); // L: 48

				Buffer var8;
				int var9;
				for (var8 = new Buffer((int)var7.length()); var8.offset < var8.array.length; var8.offset += var9) { // L: 49 50 53
					var9 = var7.read(var8.array, var8.offset, var8.array.length - var8.offset); // L: 51
					if (var9 == -1) { // L: 52
						throw new IOException();
					}
				}

				var8.offset = 0; // L: 55
				var9 = var8.readUnsignedByte(); // L: 56
				if (var9 < 1 || var9 > 3) {
					throw new IOException("" + var9); // L: 57
				}

				int var10 = 0; // L: 58
				if (var9 > 1) { // L: 59
					var10 = var8.readUnsignedByte();
				}

				if (var9 <= 2) { // L: 60
					var4 = var8.readStringCp1252NullCircumfixed(); // L: 61
					if (var10 == 1) { // L: 62
						var5 = var8.readStringCp1252NullCircumfixed();
					}
				} else {
					var4 = var8.readCESU8(); // L: 65
					if (var10 == 1) { // L: 66
						var5 = var8.readCESU8();
					}
				}

				var7.close(); // L: 68
			} catch (IOException var20) { // L: 70
				var20.printStackTrace(); // L: 71
			}

			if (var4 != null) { // L: 73
				var22 = new File(var4); // L: 74
				if (!var22.exists()) { // L: 75
					var4 = null; // L: 76
				}
			}

			if (var4 != null) { // L: 79
				var22 = new File(var4, "test.dat"); // L: 80
				if (!WorldMapLabelSize.method4858(var22, true)) { // L: 81
					var4 = null; // L: 82
				}
			}
		}

		if (var4 == null && var2 == 0) { // L: 86
			label124:
			for (int var15 = 0; var15 < class89.cacheSubPaths.length; ++var15) { // L: 87
				for (int var16 = 0; var16 < class121.cacheParentPaths.length; ++var16) { // L: 88
					File var17 = new File(class121.cacheParentPaths[var16] + class89.cacheSubPaths[var15] + File.separatorChar + var0 + File.separatorChar); // L: 89
					if (var17.exists() && WorldMapLabelSize.method4858(new File(var17, "test.dat"), true)) { // L: 90 91
						var4 = var17.toString(); // L: 92
						var6 = true; // L: 93
						break label124; // L: 94
					}
				}
			}
		}

		if (var4 == null) { // L: 100
			var4 = UserComparator3.userHomeDirectory + File.separatorChar + "jagexcache" + var3 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar; // L: 101
			var6 = true; // L: 102
		}

		if (var5 != null) { // L: 104
			File var21 = new File(var5); // L: 105
			var22 = new File(var4); // L: 106

			try {
				File[] var23 = var21.listFiles(); // L: 108
				File[] var18 = var23; // L: 110

				for (int var11 = 0; var11 < var18.length; ++var11) { // L: 111
					File var12 = var18[var11]; // L: 112
					File var13 = new File(var22, var12.getName()); // L: 114
					boolean var14 = var12.renameTo(var13); // L: 115
					if (!var14) { // L: 116
						throw new IOException();
					}
				}
			} catch (Exception var19) { // L: 121
				var19.printStackTrace(); // L: 122
			}

			var6 = true; // L: 124
		}

		if (var6) { // L: 126
			UserComparator7.method2828(new File(var4), (File)null);
		}

		return new File(var4); // L: 127
	}
}
