import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ee")
@Implements("UserComparator7")
public class UserComparator7 extends AbstractUserComparator {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 307316721
	)
	@Export("gameCyclesToDo")
	static int gameCyclesToDo;
	@ObfuscatedName("ay")
	@Export("reversed")
	final boolean reversed;

	public UserComparator7(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lqc;Lqc;I)I",
		garbageValue = "-1281789530"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) { // L: 14
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2; // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;",
		garbageValue = "-1411307150"
	)
	public static File method2856(String var0, String var1, int var2) {
		String var3 = var2 == 0 ? "" : "" + var2; // L: 40
		JagexCache.JagexCache_locationFile = new File(class133.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var3 + ".dat"); // L: 41
		String var4 = null; // L: 42
		String var5 = null; // L: 43
		boolean var6 = false; // L: 44
		int var11;
		File var26;
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
				if (var9 < 1 || var9 > 3) { // L: 57
					throw new IOException("" + var9);
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
			} catch (IOException var24) { // L: 70
				var24.printStackTrace(); // L: 71
			}

			if (var4 != null) { // L: 73
				var26 = new File(var4); // L: 74
				if (!var26.exists()) { // L: 75
					var4 = null; // L: 76
				}
			}

			if (var4 != null) { // L: 79
				var26 = new File(var4, "test.dat"); // L: 80

				boolean var27;
				try {
					RandomAccessFile var15 = new RandomAccessFile(var26, "rw"); // L: 84
					var11 = var15.read(); // L: 85
					var15.seek(0L); // L: 86
					var15.write(var11); // L: 87
					var15.seek(0L); // L: 88
					var15.close(); // L: 89
					var26.delete(); // L: 90
					var27 = true; // L: 91
				} catch (Exception var22) { // L: 93
					var27 = false; // L: 94
				}

				if (!var27) { // L: 97
					var4 = null; // L: 98
				}
			}
		}

		if (var4 == null && var2 == 0) { // L: 102
			label139:
			for (int var16 = 0; var16 < class501.cacheSubPaths.length; ++var16) { // L: 103
				for (int var17 = 0; var17 < class166.cacheParentPaths.length; ++var17) { // L: 104
					File var18 = new File(class166.cacheParentPaths[var17] + class501.cacheSubPaths[var16] + File.separatorChar + var0 + File.separatorChar); // L: 105
					if (var18.exists()) { // L: 106
						File var19 = new File(var18, "test.dat"); // L: 108

						boolean var28;
						try {
							RandomAccessFile var12 = new RandomAccessFile(var19, "rw"); // L: 111
							int var13 = var12.read(); // L: 112
							var12.seek(0L); // L: 113
							var12.write(var13); // L: 114
							var12.seek(0L); // L: 115
							var12.close(); // L: 116
							var19.delete(); // L: 117
							var28 = true; // L: 118
						} catch (Exception var21) { // L: 120
							var28 = false; // L: 121
						}

						if (var28) { // L: 124
							var4 = var18.toString(); // L: 125
							var6 = true; // L: 126
							break label139; // L: 127
						}
					}
				}
			}
		}

		if (var4 == null) { // L: 133
			var4 = class133.userHomeDirectory + File.separatorChar + "jagexcache" + var3 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar; // L: 134
			var6 = true; // L: 135
		}

		if (var5 != null) { // L: 137
			File var25 = new File(var5); // L: 138
			var26 = new File(var4); // L: 139

			try {
				File[] var31 = var25.listFiles(); // L: 141
				File[] var30 = var31; // L: 143

				for (var11 = 0; var11 < var30.length; ++var11) { // L: 144
					File var29 = var30[var11]; // L: 145
					File var20 = new File(var26, var29.getName()); // L: 147
					boolean var14 = var29.renameTo(var20); // L: 148
					if (!var14) { // L: 149
						throw new IOException();
					}
				}
			} catch (Exception var23) { // L: 154
				var23.printStackTrace(); // L: 155
			}

			var6 = true; // L: 157
		}

		if (var6) { // L: 159
			PacketBufferNode.method5741(new File(var4), (File)null);
		}

		return new File(var4); // L: 160
	}

	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "70"
	)
	static final void method2853(int var0) {
		if (var0 >= 0) { // L: 9057
			int var1 = Client.menuArguments1[var0]; // L: 9058
			int var2 = Client.menuArguments2[var0]; // L: 9059
			int var3 = Client.menuOpcodes[var0]; // L: 9060
			int var4 = Client.menuIdentifiers[var0]; // L: 9061
			int var5 = Client.field632[var0]; // L: 9062
			String var6 = Client.menuActions[var0]; // L: 9063
			String var7 = Client.menuTargets[var0]; // L: 9064
			AbstractUserComparator.method7847(var1, var2, var3, var4, var5, var6, var7, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY); // L: 9065
		}
	} // L: 9066

	@ObfuscatedName("mh")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "483053073"
	)
	static final void method2857(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255); // L: 12002
		if (var0 != WorldMapManager.clientPreferences.method2440()) { // L: 12003
			if (WorldMapManager.clientPreferences.method2440() == 0 && Client.currentTrackGroupId != -1) { // L: 12004
				Archive var1 = class33.archive6; // L: 12005
				int var2 = Client.currentTrackGroupId; // L: 12006
				class304.musicPlayerStatus = 1; // L: 12008
				HealthBar.musicTrackArchive = var1; // L: 12009
				class7.musicTrackGroupId = var2; // L: 12010
				class438.musicTrackFileId = 0; // L: 12011
				class178.musicTrackVolume = var0; // L: 12012
				class404.musicTrackBoolean = false; // L: 12013
				class128.pcmSampleLength = 10000; // L: 12014
				Client.playingJingle = false; // L: 12016
			} else if (var0 == 0) { // L: 12018
				Friend.method7788(); // L: 12019
				Client.playingJingle = false; // L: 12020
			} else {
				class124.method2905(var0); // L: 12022
			}

			WorldMapManager.clientPreferences.method2439(var0); // L: 12023
		}

	} // L: 12025
}
