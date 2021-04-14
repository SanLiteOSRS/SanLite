import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dq")
@Implements("Players")
public class Players {
	@ObfuscatedName("ri")
	@ObfuscatedGetter(
		intValue = -579575011
	)
	static int field1363;
	@ObfuscatedName("u")
	static byte[] field1350;
	@ObfuscatedName("p")
	static byte[] field1351;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "[Lnu;"
	)
	static Buffer[] field1352;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1868594255
	)
	@Export("Players_count")
	static int Players_count;
	@ObfuscatedName("k")
	@Export("Players_indices")
	static int[] Players_indices;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1778639293
	)
	@Export("Players_emptyIdxCount")
	static int Players_emptyIdxCount;
	@ObfuscatedName("h")
	@Export("Players_emptyIndices")
	static int[] Players_emptyIndices;
	@ObfuscatedName("n")
	@Export("Players_regions")
	static int[] Players_regions;
	@ObfuscatedName("l")
	@Export("Players_orientations")
	static int[] Players_orientations;
	@ObfuscatedName("m")
	@Export("Players_targetIndices")
	static int[] Players_targetIndices;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1410622735
	)
	@Export("Players_pendingUpdateCount")
	static int Players_pendingUpdateCount;
	@ObfuscatedName("c")
	@Export("Players_pendingUpdateIndices")
	static int[] Players_pendingUpdateIndices;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "Lnu;"
	)
	static Buffer field1362;
	@ObfuscatedName("il")
	@ObfuscatedGetter(
		intValue = 1389932207
	)
	@Export("oculusOrbFocalPointY")
	static int oculusOrbFocalPointY;

	static {
		field1350 = new byte[2048];
		field1351 = new byte[2048];
		field1352 = new Buffer[2048];
		Players_count = 0;
		Players_indices = new int[2048];
		Players_emptyIdxCount = 0;
		Players_emptyIndices = new int[2048];
		Players_regions = new int[2048];
		Players_orientations = new int[2048];
		Players_targetIndices = new int[2048];
		Players_pendingUpdateCount = 0;
		Players_pendingUpdateIndices = new int[2048];
		field1362 = new Buffer(new byte[5000]);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(III)I",
		garbageValue = "-1145960243"
	)
	static int method2285(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 0) {
				var1 = 0;
			} else if (var1 > 127) {
				var1 = 127;
			}

			var1 = 127 - var1;
			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(CI)Z",
		garbageValue = "1829024921"
	)
	public static boolean method2287(char var0) {
		if (var0 >= ' ' && var0 < 127 || var0 > 127 && var0 < 160 || var0 > 160 && var0 <= 255) {
			return true;
		} else {
			if (var0 != 0) {
				char[] var1 = class300.cp1252AsciiExtension;

				for (int var2 = 0; var2 < var1.length; ++var2) {
					char var3 = var1[var2];
					if (var0 == var3) {
						return true;
					}
				}
			}

			return false;
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(I)Ljava/lang/String;",
		garbageValue = "-499281641"
	)
	static String method2283() {
		String var0;
		if (Login.clientPreferences.hideUsername) {
			String var2 = Login.Login_username;
			int var4 = var2.length();
			char[] var5 = new char[var4];

			for (int var6 = 0; var6 < var4; ++var6) {
				var5[var6] = '*';
			}

			String var3 = new String(var5);
			var0 = var3;
		} else {
			var0 = Login.Login_username;
		}

		return var0;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(Lir;Ljava/lang/String;Ljava/lang/String;I)[Low;",
		garbageValue = "-210921559"
	)
	public static IndexedSprite[] method2284(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1);
		int var4 = var0.getFileId(var3, var2);
		return class309.method5603(var0, var3, var4);
	}

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		signature = "(ZLnk;B)V",
		garbageValue = "-121"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		if (!Client.isInInstance) {
			int var2 = var1.method6766();
			var3 = var1.method6617();
			var4 = var1.readUnsignedShort();
			NPC.xteaKeys = new int[var4][4];

			for (var5 = 0; var5 < var4; ++var5) {
				for (var6 = 0; var6 < 4; ++var6) {
					NPC.xteaKeys[var5][var6] = var1.readInt();
				}
			}

			class11.regions = new int[var4];
			WorldMapData_0.regionMapArchiveIds = new int[var4];
			class18.regionLandArchiveIds = new int[var4];
			class15.regionLandArchives = new byte[var4][];
			MouseHandler.regionMapArchives = new byte[var4][];
			boolean var16 = false;
			if ((var2 / 8 == 48 || var2 / 8 == 49) && var3 / 8 == 48) {
				var16 = true;
			}

			if (var2 / 8 == 48 && var3 / 8 == 148) {
				var16 = true;
			}

			var4 = 0;

			for (var6 = (var2 - 6) / 8; var6 <= (var2 + 6) / 8; ++var6) {
				for (var7 = (var3 - 6) / 8; var7 <= (var3 + 6) / 8; ++var7) {
					var8 = var7 + (var6 << 8);
					if (!var16 || var7 != 49 && var7 != 149 && var7 != 147 && var6 != 50 && (var6 != 49 || var7 != 47)) {
						class11.regions[var4] = var8;
						WorldMapData_0.regionMapArchiveIds[var4] = class157.archive5.getGroupId("m" + var6 + "_" + var7);
						class18.regionLandArchiveIds[var4] = class157.archive5.getGroupId("l" + var6 + "_" + var7);
						++var4;
					}
				}
			}

			LoginScreenAnimation.method2185(var2, var3, true);
		} else {
			boolean var15 = var1.method6623() == 1;
			var3 = var1.method6766();
			var4 = var1.method6766();
			var5 = var1.readUnsignedShort();
			var1.importIndex();

			int var9;
			for (var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 13; ++var7) {
					for (var8 = 0; var8 < 13; ++var8) {
						var9 = var1.readBits(1);
						if (var9 == 1) {
							Client.instanceChunkTemplates[var6][var7][var8] = var1.readBits(26);
						} else {
							Client.instanceChunkTemplates[var6][var7][var8] = -1;
						}
					}
				}
			}

			var1.exportIndex();
			NPC.xteaKeys = new int[var5][4];

			for (var6 = 0; var6 < var5; ++var6) {
				for (var7 = 0; var7 < 4; ++var7) {
					NPC.xteaKeys[var6][var7] = var1.readInt();
				}
			}

			class11.regions = new int[var5];
			WorldMapData_0.regionMapArchiveIds = new int[var5];
			class18.regionLandArchiveIds = new int[var5];
			class15.regionLandArchives = new byte[var5][];
			MouseHandler.regionMapArchives = new byte[var5][];
			var5 = 0;

			for (var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 13; ++var7) {
					for (var8 = 0; var8 < 13; ++var8) {
						var9 = Client.instanceChunkTemplates[var6][var7][var8];
						if (var9 != -1) {
							int var10 = var9 >> 14 & 1023;
							int var11 = var9 >> 3 & 2047;
							int var12 = (var10 / 8 << 8) + var11 / 8;

							int var13;
							for (var13 = 0; var13 < var5; ++var13) {
								if (class11.regions[var13] == var12) {
									var12 = -1;
									break;
								}
							}

							if (var12 != -1) {
								class11.regions[var5] = var12;
								var13 = var12 >> 8 & 255;
								int var14 = var12 & 255;
								WorldMapData_0.regionMapArchiveIds[var5] = class157.archive5.getGroupId("m" + var13 + "_" + var14);
								class18.regionLandArchiveIds[var5] = class157.archive5.getGroupId("l" + var13 + "_" + var14);
								++var5;
							}
						}
					}
				}
			}

			LoginScreenAnimation.method2185(var3, var4, !var15);
		}

	}
}
