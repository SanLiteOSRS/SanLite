import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("en")
@Implements("BuddyRankComparator")
public class BuddyRankComparator extends AbstractUserComparator {
	@ObfuscatedName("aa")
	static boolean[] field1481;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 460990005
	)
	static int field1480;
	@ObfuscatedName("aq")
	@Export("reversed")
	final boolean reversed;

	public BuddyRankComparator(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lry;Lry;I)I",
		garbageValue = "-2121627067"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.rank != var1.rank) { // L: 14
			return this.reversed ? var1.rank - var2.rank : var2.rank - var1.rank; // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "1302234549"
	)
	static int method2976(int var0, Script var1, boolean var2) {
		return 2; // L: 5141
	}

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(ZLun;B)V",
		garbageValue = "5"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0; // L: 5865
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		if (!Client.isInInstance) { // L: 5866
			var3 = var1.method9492(); // L: 5870
			var1.readShort(); // L: 5871
			int var2 = var1.method9703(); // L: 5872
			var4 = var1.readUnsignedShort(); // L: 5873
			FriendLoginUpdate.field4752 = new int[var4][4]; // L: 5874

			for (var5 = 0; var5 < var4; ++var5) { // L: 5875
				for (var6 = 0; var6 < 4; ++var6) { // L: 5876
					FriendLoginUpdate.field4752[var5][var6] = var1.readInt(); // L: 5877
				}
			}

			class13.field63 = new int[var4]; // L: 5880
			class318.field3461 = new int[var4]; // L: 5881
			class146.field1675 = new int[var4]; // L: 5882
			Player.field1163 = new byte[var4][]; // L: 5883
			HorizontalAlignment.field1952 = new byte[var4][]; // L: 5884
			var4 = 0; // L: 5885

			for (var5 = (var2 - 6) / 8; var5 <= (var2 + 6) / 8; ++var5) { // L: 5886
				for (var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) { // L: 5887
					var7 = var6 + (var5 << 8); // L: 5888
					class13.field63[var4] = var7; // L: 5889
					class318.field3461[var4] = JagexCache.field2336.getGroupId("m" + var5 + "_" + var6); // L: 5890
					class146.field1675[var4] = JagexCache.field2336.getGroupId("l" + var5 + "_" + var6); // L: 5891
					++var4; // L: 5892
				}
			}

			class103.method2750(var2, var3, true); // L: 5895
		} else {
			boolean var15 = var1.method9506() == 1; // L: 5898
			var3 = var1.method9636(); // L: 5899
			var4 = var1.readUnsignedShort(); // L: 5900
			var5 = var1.readUnsignedShort(); // L: 5901
			var1.importIndex(); // L: 5902

			int var8;
			int var9;
			for (var6 = 0; var6 < 4; ++var6) { // L: 5903
				for (var7 = 0; var7 < 13; ++var7) { // L: 5904
					for (var8 = 0; var8 < 13; ++var8) { // L: 5905
						var9 = var1.readBits(1); // L: 5906
						if (var9 == 1) {
							Client.field830[var6][var7][var8] = var1.readBits(26); // L: 5907
						} else {
							Client.field830[var6][var7][var8] = -1; // L: 5908
						}
					}
				}
			}

			var1.exportIndex(); // L: 5912
			FriendLoginUpdate.field4752 = new int[var5][4]; // L: 5913

			for (var6 = 0; var6 < var5; ++var6) { // L: 5914
				for (var7 = 0; var7 < 4; ++var7) { // L: 5915
					FriendLoginUpdate.field4752[var6][var7] = var1.readInt(); // L: 5916
				}
			}

			class13.field63 = new int[var5]; // L: 5919
			class318.field3461 = new int[var5]; // L: 5920
			class146.field1675 = new int[var5]; // L: 5921
			Player.field1163 = new byte[var5][]; // L: 5922
			HorizontalAlignment.field1952 = new byte[var5][]; // L: 5923
			var5 = 0; // L: 5924

			for (var6 = 0; var6 < 4; ++var6) { // L: 5925
				for (var7 = 0; var7 < 13; ++var7) { // L: 5926
					for (var8 = 0; var8 < 13; ++var8) { // L: 5927
						var9 = Client.field830[var6][var7][var8]; // L: 5928
						if (var9 != -1) { // L: 5929
							int var10 = var9 >> 14 & 1023; // L: 5930
							int var11 = var9 >> 3 & 2047; // L: 5931
							int var12 = (var10 / 8 << 8) + var11 / 8; // L: 5932

							int var13;
							for (var13 = 0; var13 < var5; ++var13) { // L: 5933
								if (class13.field63[var13] == var12) {
									var12 = -1; // L: 5934
									break; // L: 5935
								}
							}

							if (var12 != -1) { // L: 5937
								class13.field63[var5] = var12; // L: 5938
								var13 = var12 >> 8 & 255; // L: 5939
								int var14 = var12 & 255; // L: 5940
								class318.field3461[var5] = JagexCache.field2336.getGroupId("m" + var13 + "_" + var14); // L: 5941
								class146.field1675[var5] = JagexCache.field2336.getGroupId("l" + var13 + "_" + var14); // L: 5942
								++var5; // L: 5943
							}
						}
					}
				}
			}

			class103.method2750(var4, var3, !var15); // L: 5949
		}

	} // L: 5951
}
