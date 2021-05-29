import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ms")
public class class339 implements class344 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public final class362 field3921;

	@ObfuscatedSignature(
		descriptor = "(Lmt;)V"
	)
	class339(class363 var1) {
		this.field3921 = var1;
	}

	@ObfuscatedSignature(
		descriptor = "(Lme;)V"
	)
	public class339(class340 var1) {
		this(new class363(var1));
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "423690194"
	)
	public int method6014(int var1) {
		return this.field3921.vmethod6362(var1);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljv;IIB)Z",
		garbageValue = "47"
	)
	static boolean method6015(AbstractArchive var0, int var1, int var2) {
		byte[] var3 = var0.takeFile(var1, var2);
		if (var3 == null) {
			return false;
		} else {
			ItemLayer.SpriteBuffer_decode(var3);
			return true;
		}
	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(ZLnb;I)V",
		garbageValue = "-2130717093"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0;
		int var2;
		int var3;
		int var5;
		int var6;
		int var7;
		int var8;
		if (!Client.isInInstance) {
			var2 = var1.method6605();
			var3 = var1.method6603();
			int var4 = var1.readUnsignedShort();
			WorldMapAreaData.xteaKeys = new int[var4][4];

			for (var5 = 0; var5 < var4; ++var5) {
				for (var6 = 0; var6 < 4; ++var6) {
					WorldMapAreaData.xteaKeys[var5][var6] = var1.readInt();
				}
			}

			PlayerComposition.regions = new int[var4];
			class16.regionMapArchiveIds = new int[var4];
			class24.regionLandArchiveIds = new int[var4];
			class18.regionLandArchives = new byte[var4][];
			class82.regionMapArchives = new byte[var4][];
			boolean var16 = false;
			if ((var3 / 8 == 48 || var3 / 8 == 49) && var2 / 8 == 48) {
				var16 = true;
			}

			if (var3 / 8 == 48 && var2 / 8 == 148) {
				var16 = true;
			}

			var4 = 0;

			for (var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) {
				for (var7 = (var2 - 6) / 8; var7 <= (var2 + 6) / 8; ++var7) {
					var8 = var7 + (var6 << 8);
					if (!var16 || var7 != 49 && var7 != 149 && var7 != 147 && var6 != 50 && (var6 != 49 || var7 != 47)) {
						PlayerComposition.regions[var4] = var8;
						class16.regionMapArchiveIds[var4] = class247.archive7.getGroupId("m" + var6 + "_" + var7);
						class24.regionLandArchiveIds[var4] = class247.archive7.getGroupId("l" + var6 + "_" + var7);
						++var4;
					}
				}
			}

			Canvas.method391(var3, var2, true);
		} else {
			var2 = var1.readUnsignedShort();
			var3 = var1.method6603();
			boolean var15 = var1.method6549() == 1;
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
			WorldMapAreaData.xteaKeys = new int[var5][4];

			for (var6 = 0; var6 < var5; ++var6) {
				for (var7 = 0; var7 < 4; ++var7) {
					WorldMapAreaData.xteaKeys[var6][var7] = var1.readInt();
				}
			}

			PlayerComposition.regions = new int[var5];
			class16.regionMapArchiveIds = new int[var5];
			class24.regionLandArchiveIds = new int[var5];
			class18.regionLandArchives = new byte[var5][];
			class82.regionMapArchives = new byte[var5][];
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
								if (PlayerComposition.regions[var13] == var12) {
									var12 = -1;
									break;
								}
							}

							if (var12 != -1) {
								PlayerComposition.regions[var5] = var12;
								var13 = var12 >> 8 & 255;
								int var14 = var12 & 255;
								class16.regionMapArchiveIds[var5] = class247.archive7.getGroupId("m" + var13 + "_" + var14);
								class24.regionLandArchiveIds[var5] = class247.archive7.getGroupId("l" + var13 + "_" + var14);
								++var5;
							}
						}
					}
				}
			}

			Canvas.method391(var3, var2, !var15);
		}

	}
}
