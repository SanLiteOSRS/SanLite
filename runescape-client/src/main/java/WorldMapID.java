import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kf")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	static final WorldMapID field3043;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	static final WorldMapID field3044;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -2072119163
	)
	@Export("value")
	final int value;

	static {
		field3043 = new WorldMapID(0); // L: 4
		field3044 = new WorldMapID(1); // L: 5
	}

	WorldMapID(int var1) {
		this.value = var1; // L: 9
	} // L: 10

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)[Lio;",
		garbageValue = "-681739410"
	)
	static class214[] method5495() {
		return new class214[]{class214.field2381, class214.field2385, class214.field2379, class214.field2380, class214.field2386, class214.field2384, class214.field2382};
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/CharSequence;III)Ljava/lang/String;",
		garbageValue = "2076822771"
	)
	public static String method5496(CharSequence[] var0, int var1, int var2) {
		if (var2 == 0) { // L: 17
			return "";
		} else if (var2 == 1) { // L: 18
			CharSequence var10 = var0[var1]; // L: 19
			return var10 == null ? "null" : var10.toString(); // L: 20 21
		} else {
			int var3 = var2 + var1; // L: 23
			int var4 = 0; // L: 24

			for (int var5 = var1; var5 < var3; ++var5) {
				CharSequence var9 = var0[var5];
				if (var9 == null) {
					var4 += 4;
				} else {
					var4 += var9.length();
				}
			}

			StringBuilder var8 = new StringBuilder(var4);

			for (int var6 = var1; var6 < var3; ++var6) {
				CharSequence var7 = var0[var6]; // L: 32
				if (var7 == null) { // L: 33
					var8.append("null");
				} else {
					var8.append(var7); // L: 34
				}
			}

			return var8.toString(); // L: 36
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Lhu;",
		garbageValue = "1432274466"
	)
	@Export("getEnum")
	public static EnumComposition getEnum(int var0) {
		EnumComposition var1 = (EnumComposition)EnumComposition.EnumDefinition_cached.get((long)var0); // L: 25
		if (var1 != null) { // L: 26
			return var1;
		} else {
			byte[] var2 = EnumComposition.EnumDefinition_archive.takeFile(8, var0); // L: 27
			var1 = new EnumComposition(); // L: 28
			if (var2 != null) { // L: 29
				var1.decode(new Buffer(var2));
			}

			EnumComposition.EnumDefinition_cached.put(var1, (long)var0); // L: 30
			return var1; // L: 31
		}
	}

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(ZLto;I)V",
		garbageValue = "1816945767"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0; // L: 5726
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		if (!Client.isInInstance) { // L: 5727
			int var2 = var1.readUnsignedShort(); // L: 5728
			var3 = var1.method9102(); // L: 5729
			var4 = var1.readUnsignedShort(); // L: 5730
			RunException.xteaKeys = new int[var4][4]; // L: 5731

			for (var5 = 0; var5 < var4; ++var5) { // L: 5732
				for (var6 = 0; var6 < 4; ++var6) { // L: 5733
					RunException.xteaKeys[var5][var6] = var1.readInt(); // L: 5734
				}
			}

			class191.regions = new int[var4]; // L: 5737
			class59.regionMapArchiveIds = new int[var4]; // L: 5738
			class183.regionLandArchiveIds = new int[var4]; // L: 5739
			UserComparator5.regionLandArchives = new byte[var4][]; // L: 5740
			class197.regionMapArchives = new byte[var4][]; // L: 5741
			var4 = 0; // L: 5742

			for (var5 = (var2 - 6) / 8; var5 <= (var2 + 6) / 8; ++var5) { // L: 5743
				for (var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) { // L: 5744
					var7 = var6 + (var5 << 8); // L: 5745
					class191.regions[var4] = var7; // L: 5746
					class59.regionMapArchiveIds[var4] = class499.archive6.getGroupId("m" + var5 + "_" + var6); // L: 5747
					class183.regionLandArchiveIds[var4] = class499.archive6.getGroupId("l" + var5 + "_" + var6); // L: 5748
					++var4; // L: 5749
				}
			}

			class316.method6003(var2, var3, true); // L: 5752
		} else {
			boolean var15 = var1.readUnsignedByte() == 1; // L: 5755
			var3 = var1.readUnsignedShort(); // L: 5756
			var4 = var1.readUnsignedShort(); // L: 5757
			var5 = var1.readUnsignedShort(); // L: 5758
			var1.importIndex(); // L: 5759

			int var8;
			int var9;
			for (var6 = 0; var6 < 4; ++var6) { // L: 5760
				for (var7 = 0; var7 < 13; ++var7) { // L: 5761
					for (var8 = 0; var8 < 13; ++var8) { // L: 5762
						var9 = var1.readBits(1); // L: 5763
						if (var9 == 1) {
							Client.field603[var6][var7][var8] = var1.readBits(26); // L: 5764
						} else {
							Client.field603[var6][var7][var8] = -1; // L: 5765
						}
					}
				}
			}

			var1.exportIndex(); // L: 5769
			RunException.xteaKeys = new int[var5][4]; // L: 5770

			for (var6 = 0; var6 < var5; ++var6) { // L: 5771
				for (var7 = 0; var7 < 4; ++var7) { // L: 5772
					RunException.xteaKeys[var6][var7] = var1.readInt(); // L: 5773
				}
			}

			class191.regions = new int[var5]; // L: 5776
			class59.regionMapArchiveIds = new int[var5]; // L: 5777
			class183.regionLandArchiveIds = new int[var5]; // L: 5778
			UserComparator5.regionLandArchives = new byte[var5][]; // L: 5779
			class197.regionMapArchives = new byte[var5][]; // L: 5780
			var5 = 0; // L: 5781

			for (var6 = 0; var6 < 4; ++var6) { // L: 5782
				for (var7 = 0; var7 < 13; ++var7) { // L: 5783
					for (var8 = 0; var8 < 13; ++var8) { // L: 5784
						var9 = Client.field603[var6][var7][var8]; // L: 5785
						if (var9 != -1) { // L: 5786
							int var10 = var9 >> 14 & 1023; // L: 5787
							int var11 = var9 >> 3 & 2047; // L: 5788
							int var12 = (var10 / 8 << 8) + var11 / 8; // L: 5789

							int var13;
							for (var13 = 0; var13 < var5; ++var13) { // L: 5790
								if (class191.regions[var13] == var12) {
									var12 = -1; // L: 5791
									break; // L: 5792
								}
							}

							if (var12 != -1) { // L: 5794
								class191.regions[var5] = var12; // L: 5795
								var13 = var12 >> 8 & 255; // L: 5796
								int var14 = var12 & 255; // L: 5797
								class59.regionMapArchiveIds[var5] = class499.archive6.getGroupId("m" + var13 + "_" + var14); // L: 5798
								class183.regionLandArchiveIds[var5] = class499.archive6.getGroupId("l" + var13 + "_" + var14); // L: 5799
								++var5; // L: 5800
							}
						}
					}
				}
			}

			class316.method6003(var4, var3, !var15); // L: 5806
		}

	} // L: 5808
}
