import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("au")
public class class19 implements Callable {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		longValue = -2034572934949977087L
	)
	public static long field100;
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "Ltj;"
	)
	static IndexedSprite field97;
	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "Lgu;"
	)
	@Export("js5SocketTask")
	static Task js5SocketTask;
	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "[Ltm;"
	)
	@Export("mapDotSprites")
	static SpritePixels[] mapDotSprites;
	@ObfuscatedName("om")
	@ObfuscatedSignature(
		descriptor = "Lmb;"
	)
	static Widget field99;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lao;"
	)
	final class10 field96;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lac;"
	)
	final class14 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lac;Lao;)V"
	)
	class19(class14 var1, class10 var2) {
		this.this$0 = var1; // L: 46
		this.field96 = var2; // L: 47
	} // L: 48

	public Object call() throws Exception {
		try {
			while (this.field96.method101()) { // L: 53
				GroundObject.method4357(10L); // L: 54
			}
		} catch (IOException var2) { // L: 57
			return new class20("Error servicing REST query: " + var2.getMessage()); // L: 58
		}

		return this.field96.method95(); // L: 60
	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(ZLtl;I)V",
		garbageValue = "-1158341435"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0; // L: 5824
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		if (!Client.isInInstance) { // L: 5825
			int var2 = var1.method9030(); // L: 5826
			var3 = var1.method8952(); // L: 5827
			var4 = var1.readUnsignedShort(); // L: 5828
			SpotAnimationDefinition.xteaKeys = new int[var4][4]; // L: 5829

			for (var5 = 0; var5 < var4; ++var5) { // L: 5830
				for (var6 = 0; var6 < 4; ++var6) { // L: 5831
					SpotAnimationDefinition.xteaKeys[var5][var6] = var1.readInt(); // L: 5832
				}
			}

			SceneTilePaint.regions = new int[var4]; // L: 5835
			WorldMapCacheName.regionMapArchiveIds = new int[var4]; // L: 5836
			class130.regionLandArchiveIds = new int[var4]; // L: 5837
			WorldMapLabelSize.regionLandArchives = new byte[var4][]; // L: 5838
			class74.regionMapArchives = new byte[var4][]; // L: 5839
			var4 = 0; // L: 5840

			for (var5 = (var3 - 6) / 8; var5 <= (var3 + 6) / 8; ++var5) { // L: 5841
				for (var6 = (var2 - 6) / 8; var6 <= (var2 + 6) / 8; ++var6) { // L: 5842
					var7 = var6 + (var5 << 8); // L: 5843
					SceneTilePaint.regions[var4] = var7; // L: 5844
					WorldMapCacheName.regionMapArchiveIds[var4] = class305.archive9.getGroupId("m" + var5 + "_" + var6); // L: 5845
					class130.regionLandArchiveIds[var4] = class305.archive9.getGroupId("l" + var5 + "_" + var6); // L: 5846
					++var4; // L: 5847
				}
			}

			ReflectionCheck.method670(var3, var2, true); // L: 5850
		} else {
			boolean var15 = var1.readUnsignedByte() == 1; // L: 5853
			var3 = var1.method8952(); // L: 5854
			var4 = var1.method9030(); // L: 5855
			var5 = var1.readUnsignedShort(); // L: 5856
			var1.importIndex(); // L: 5857

			int var8;
			int var9;
			for (var6 = 0; var6 < 4; ++var6) { // L: 5858
				for (var7 = 0; var7 < 13; ++var7) { // L: 5859
					for (var8 = 0; var8 < 13; ++var8) { // L: 5860
						var9 = var1.readBits(1); // L: 5861
						if (var9 == 1) {
							Client.instanceChunkTemplates[var6][var7][var8] = var1.readBits(26); // L: 5862
						} else {
							Client.instanceChunkTemplates[var6][var7][var8] = -1; // L: 5863
						}
					}
				}
			}

			var1.exportIndex(); // L: 5867
			SpotAnimationDefinition.xteaKeys = new int[var5][4]; // L: 5868

			for (var6 = 0; var6 < var5; ++var6) { // L: 5869
				for (var7 = 0; var7 < 4; ++var7) { // L: 5870
					SpotAnimationDefinition.xteaKeys[var6][var7] = var1.readInt(); // L: 5871
				}
			}

			SceneTilePaint.regions = new int[var5]; // L: 5874
			WorldMapCacheName.regionMapArchiveIds = new int[var5]; // L: 5875
			class130.regionLandArchiveIds = new int[var5]; // L: 5876
			WorldMapLabelSize.regionLandArchives = new byte[var5][]; // L: 5877
			class74.regionMapArchives = new byte[var5][]; // L: 5878
			var5 = 0; // L: 5879

			for (var6 = 0; var6 < 4; ++var6) { // L: 5880
				for (var7 = 0; var7 < 13; ++var7) { // L: 5881
					for (var8 = 0; var8 < 13; ++var8) { // L: 5882
						var9 = Client.instanceChunkTemplates[var6][var7][var8]; // L: 5883
						if (var9 != -1) { // L: 5884
							int var10 = var9 >> 14 & 1023; // L: 5885
							int var11 = var9 >> 3 & 2047; // L: 5886
							int var12 = (var10 / 8 << 8) + var11 / 8; // L: 5887

							int var13;
							for (var13 = 0; var13 < var5; ++var13) { // L: 5888
								if (SceneTilePaint.regions[var13] == var12) {
									var12 = -1; // L: 5889
									break; // L: 5890
								}
							}

							if (var12 != -1) { // L: 5892
								SceneTilePaint.regions[var5] = var12; // L: 5893
								var13 = var12 >> 8 & 255; // L: 5894
								int var14 = var12 & 255; // L: 5895
								WorldMapCacheName.regionMapArchiveIds[var5] = class305.archive9.getGroupId("m" + var13 + "_" + var14); // L: 5896
								class130.regionLandArchiveIds[var5] = class305.archive9.getGroupId("l" + var13 + "_" + var14); // L: 5897
								++var5; // L: 5898
							}
						}
					}
				}
			}

			ReflectionCheck.method670(var4, var3, !var15); // L: 5904
		}

	} // L: 5906
}
