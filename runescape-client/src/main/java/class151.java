import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fr")
public class class151 extends class161 {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 94912453
	)
	int field1679;
	@ObfuscatedName("al")
	byte field1680;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -46389521
	)
	int field1681;
	@ObfuscatedName("ax")
	String field1682;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	final class162 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgf;)V"
	)
	class151(class162 var1) {
		this.this$0 = var1;
		this.field1679 = -1; // L: 103
	} // L: 108

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lul;B)V",
		garbageValue = "0"
	)
	void vmethod3405(Buffer var1) {
		this.field1679 = var1.readUnsignedShort(); // L: 111
		this.field1680 = var1.readByte(); // L: 112
		this.field1681 = var1.readUnsignedShort(); // L: 113
		var1.readLong(); // L: 114
		this.field1682 = var1.readStringCp1252NullTerminated(); // L: 115
	} // L: 116

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgb;B)V",
		garbageValue = "0"
	)
	void vmethod3411(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1679); // L: 119
		var2.rank = this.field1680; // L: 120
		var2.world = this.field1681; // L: 121
		var2.username = new Username(this.field1682); // L: 122
	} // L: 123

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(ZLuy;B)V",
		garbageValue = "43"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0; // L: 5912
		int var2;
		int var4;
		int var5;
		int var6;
		int var7;
		if (!Client.isInInstance) { // L: 5913
			var2 = var1.readUnsignedShort(); // L: 5914
			int var3 = var1.method9184(); // L: 5915
			var4 = var1.readUnsignedShort(); // L: 5916
			class178.xteaKeys = new int[var4][4]; // L: 5917

			for (var5 = 0; var5 < var4; ++var5) { // L: 5918
				for (var6 = 0; var6 < 4; ++var6) { // L: 5919
					class178.xteaKeys[var5][var6] = var1.readInt(); // L: 5920
				}
			}

			class152.regions = new int[var4]; // L: 5923
			HorizontalAlignment.regionMapArchiveIds = new int[var4]; // L: 5924
			WorldMapIcon_0.regionLandArchiveIds = new int[var4]; // L: 5925
			class345.regionLandArchives = new byte[var4][]; // L: 5926
			class201.regionMapArchives = new byte[var4][]; // L: 5927
			var4 = 0; // L: 5928

			for (var5 = (var3 - 6) / 8; var5 <= (var3 + 6) / 8; ++var5) { // L: 5929
				for (var6 = (var2 - 6) / 8; var6 <= (var2 + 6) / 8; ++var6) { // L: 5930
					var7 = var6 + (var5 << 8); // L: 5931
					class152.regions[var4] = var7; // L: 5932
					HorizontalAlignment.regionMapArchiveIds[var4] = class198.archive9.getGroupId("m" + var5 + "_" + var6); // L: 5933
					WorldMapIcon_0.regionLandArchiveIds[var4] = class198.archive9.getGroupId("l" + var5 + "_" + var6); // L: 5934
					++var4; // L: 5935
				}
			}

			MouseRecorder.method2335(var3, var2, true); // L: 5938
		} else {
			var2 = var1.method9183(); // L: 5941
			boolean var15 = var1.method9237() == 1; // L: 5942
			var4 = var1.method9245(); // L: 5943
			var5 = var1.readUnsignedShort(); // L: 5944
			var1.importIndex(); // L: 5945

			int var8;
			int var9;
			for (var6 = 0; var6 < 4; ++var6) { // L: 5946
				for (var7 = 0; var7 < 13; ++var7) { // L: 5947
					for (var8 = 0; var8 < 13; ++var8) { // L: 5948
						var9 = var1.readBits(1); // L: 5949
						if (var9 == 1) {
							Client.instanceChunkTemplates[var6][var7][var8] = var1.readBits(26); // L: 5950
						} else {
							Client.instanceChunkTemplates[var6][var7][var8] = -1; // L: 5951
						}
					}
				}
			}

			var1.exportIndex(); // L: 5955
			class178.xteaKeys = new int[var5][4]; // L: 5956

			for (var6 = 0; var6 < var5; ++var6) { // L: 5957
				for (var7 = 0; var7 < 4; ++var7) { // L: 5958
					class178.xteaKeys[var6][var7] = var1.readInt(); // L: 5959
				}
			}

			class152.regions = new int[var5]; // L: 5962
			HorizontalAlignment.regionMapArchiveIds = new int[var5]; // L: 5963
			WorldMapIcon_0.regionLandArchiveIds = new int[var5]; // L: 5964
			class345.regionLandArchives = new byte[var5][]; // L: 5965
			class201.regionMapArchives = new byte[var5][]; // L: 5966
			var5 = 0; // L: 5967

			for (var6 = 0; var6 < 4; ++var6) { // L: 5968
				for (var7 = 0; var7 < 13; ++var7) { // L: 5969
					for (var8 = 0; var8 < 13; ++var8) { // L: 5970
						var9 = Client.instanceChunkTemplates[var6][var7][var8]; // L: 5971
						if (var9 != -1) { // L: 5972
							int var10 = var9 >> 14 & 1023; // L: 5973
							int var11 = var9 >> 3 & 2047; // L: 5974
							int var12 = (var10 / 8 << 8) + var11 / 8; // L: 5975

							int var13;
							for (var13 = 0; var13 < var5; ++var13) { // L: 5976
								if (class152.regions[var13] == var12) {
									var12 = -1; // L: 5977
									break; // L: 5978
								}
							}

							if (var12 != -1) { // L: 5980
								class152.regions[var5] = var12; // L: 5981
								var13 = var12 >> 8 & 255; // L: 5982
								int var14 = var12 & 255; // L: 5983
								HorizontalAlignment.regionMapArchiveIds[var5] = class198.archive9.getGroupId("m" + var13 + "_" + var14); // L: 5984
								WorldMapIcon_0.regionLandArchiveIds[var5] = class198.archive9.getGroupId("l" + var13 + "_" + var14); // L: 5985
								++var5; // L: 5986
							}
						}
					}
				}
			}

			MouseRecorder.method2335(var4, var2, !var15); // L: 5992
		}

	} // L: 5994
}
