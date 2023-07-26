import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("su")
@Implements("DesktopPlatformInfoProvider")
public class DesktopPlatformInfoProvider implements class476 {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 934001659
	)
	int field4823;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -350512903
	)
	int field4820;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1643880639
	)
	int field4822;

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lsy;",
		garbageValue = "1568411855"
	)
	@Export("get")
	public PlatformInfo get() {
		byte var1;
		if (CollisionMap.field2347.startsWith("win")) { // L: 16
			var1 = 1;
		} else if (CollisionMap.field2347.startsWith("mac")) { // L: 17
			var1 = 2;
		} else if (CollisionMap.field2347.startsWith("linux")) { // L: 18
			var1 = 3;
		} else {
			var1 = 4; // L: 19
		}

		String var2;
		try {
			var2 = System.getProperty("os.arch").toLowerCase(); // L: 23
		} catch (Exception var31) { // L: 25
			var2 = ""; // L: 26
		}

		String var3;
		try {
			var3 = System.getProperty("os.version").toLowerCase(); // L: 29
		} catch (Exception var30) { // L: 31
			var3 = ""; // L: 32
		}

		String var4 = "Unknown"; // L: 34
		String var5 = "1.1"; // L: 35

		try {
			var4 = System.getProperty("java.vendor"); // L: 37
			var5 = System.getProperty("java.version"); // L: 38
		} catch (Exception var29) { // L: 40
		}

		boolean var28;
		if (!var2.startsWith("amd64") && !var2.startsWith("x86_64")) { // L: 42
			var28 = false; // L: 43
		} else {
			var28 = true;
		}

		byte var7 = 0; // L: 44
		if (var1 == 1) { // L: 45
			if (var3.indexOf("4.0") != -1) { // L: 46
				var7 = 1;
			} else if (var3.indexOf("4.1") != -1) { // L: 47
				var7 = 2;
			} else if (var3.indexOf("4.9") != -1) { // L: 48
				var7 = 3;
			} else if (var3.indexOf("5.0") != -1) { // L: 49
				var7 = 4;
			} else if (var3.indexOf("5.1") != -1) { // L: 50
				var7 = 5;
			} else if (var3.indexOf("5.2") != -1) { // L: 51
				var7 = 8;
			} else if (var3.indexOf("6.0") != -1) { // L: 52
				var7 = 6;
			} else if (var3.indexOf("6.1") != -1) { // L: 53
				var7 = 7;
			} else if (var3.indexOf("6.2") != -1) { // L: 54
				var7 = 9;
			} else if (var3.indexOf("6.3") != -1) { // L: 55
				var7 = 10;
			} else if (var3.indexOf("10.0") != -1) { // L: 56
				var7 = 11;
			}
		} else if (var1 == 2) { // L: 58
			if (var3.indexOf("10.4") != -1) { // L: 59
				var7 = 20;
			} else if (var3.indexOf("10.5") != -1) { // L: 60
				var7 = 21;
			} else if (var3.indexOf("10.6") != -1) { // L: 61
				var7 = 22;
			} else if (var3.indexOf("10.7") != -1) { // L: 62
				var7 = 23;
			} else if (var3.indexOf("10.8") != -1) { // L: 63
				var7 = 24;
			} else if (var3.indexOf("10.9") != -1) { // L: 64
				var7 = 25;
			} else if (var3.indexOf("10.10") != -1) { // L: 65
				var7 = 26;
			} else if (var3.indexOf("10.11") != -1) {
				var7 = 27; // L: 66
			} else if (var3.indexOf("10.12") != -1) { // L: 67
				var7 = 28;
			} else if (var3.indexOf("10.13") != -1) { // L: 68
				var7 = 29;
			}
		}

		byte var8;
		if (var4.toLowerCase().indexOf("sun") != -1) { // L: 71
			var8 = 1;
		} else if (var4.toLowerCase().indexOf("microsoft") != -1) { // L: 72
			var8 = 2;
		} else if (var4.toLowerCase().indexOf("apple") != -1) { // L: 73
			var8 = 3;
		} else if (var4.toLowerCase().indexOf("oracle") != -1) { // L: 74
			var8 = 5;
		} else {
			var8 = 4; // L: 75
		}

		this.method8451(var5); // L: 76
		boolean var9 = false; // L: 77
		int var10 = (int)(Runtime.getRuntime().maxMemory() / 1048576L) + 1; // L: 78
		int var11;
		if (this.field4823 > 3) { // L: 81
			var11 = Runtime.getRuntime().availableProcessors();
		} else {
			var11 = 0; // L: 82
		}

		byte var12 = 0; // L: 83
		String var13 = ""; // L: 84
		String var14 = ""; // L: 85
		String var15 = ""; // L: 86
		String var16 = ""; // L: 87
		String var17 = ""; // L: 88
		String var18 = ""; // L: 89
		boolean var19 = false; // L: 90
		boolean var20 = false; // L: 91
		boolean var21 = false; // L: 92
		boolean var22 = false; // L: 93
		int[] var23 = new int[3]; // L: 94
		boolean var24 = false; // L: 95
		String var25 = ""; // L: 96
		String var26 = ""; // L: 97
		boolean var27 = false; // L: 98
		return new PlatformInfo(var1, var28, var7, var8, this.field4823, this.field4820, this.field4822, false, var10, var11, var12, 0, var13, var14, var15, var16, 0, 0, 0, 0, var17, var18, var23, 0, "", ""); // L: 99
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-738858129"
	)
	void method8451(String var1) {
		if (var1.startsWith("1.")) { // L: 103
			this.method8459(var1); // L: 104
		} else {
			this.method8453(var1); // L: 107
		}

	} // L: 109

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "234184738"
	)
	void method8459(String var1) {
		String[] var2 = var1.split("\\."); // L: 112

		try {
			this.field4823 = Integer.parseInt(var2[1]);
			var2 = var2[2].split("_");
			this.field4820 = Integer.parseInt(var2[0]); // L: 116
			this.field4822 = Integer.parseInt(var2[1]); // L: 117
		} catch (Exception var4) { // L: 119
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "21471391"
	)
	void method8453(String var1) {
		String[] var2 = var1.split("\\."); // L: 123

		try {
			this.field4823 = Integer.parseInt(var2[0]);
			this.field4820 = Integer.parseInt(var2[1]);
			this.field4822 = Integer.parseInt(var2[2]); // L: 127
		} catch (Exception var4) {
		}

	} // L: 130

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lnd;Ljava/lang/String;Ljava/lang/String;I)[Luu;",
		garbageValue = "-578185470"
	)
	public static IndexedSprite[] method8449(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) { // L: 113
			return null;
		} else {
			int var3 = var0.getGroupId(var1); // L: 114
			int var4 = var0.getFileId(var3, var2); // L: 115
			byte[] var7 = var0.takeFile(var3, var4); // L: 120
			boolean var6;
			if (var7 == null) { // L: 121
				var6 = false; // L: 122
			} else {
				VarbitComposition.SpriteBuffer_decode(var7); // L: 125
				var6 = true; // L: 126
			}

			IndexedSprite[] var5;
			if (!var6) { // L: 128
				var5 = null; // L: 129
			} else {
				IndexedSprite[] var8 = new IndexedSprite[class528.SpriteBuffer_spriteCount]; // L: 134

				for (int var9 = 0; var9 < class528.SpriteBuffer_spriteCount; ++var9) { // L: 135
					IndexedSprite var10 = var8[var9] = new IndexedSprite(); // L: 136
					var10.width = class528.SpriteBuffer_spriteWidth; // L: 137
					var10.height = class528.SpriteBuffer_spriteHeight; // L: 138
					var10.xOffset = class492.SpriteBuffer_xOffsets[var9]; // L: 139
					var10.yOffset = class134.SpriteBuffer_yOffsets[var9]; // L: 140
					var10.subWidth = class172.SpriteBuffer_spriteWidths[var9]; // L: 141
					var10.subHeight = class528.SpriteBuffer_spriteHeights[var9]; // L: 142
					var10.palette = class528.SpriteBuffer_spritePalette; // L: 143
					var10.pixels = ArchiveDiskAction.SpriteBuffer_pixels[var9]; // L: 144
				}

				class506.method8985(); // L: 146
				var5 = var8; // L: 149
			}

			return var5; // L: 151
		}
	}
}
