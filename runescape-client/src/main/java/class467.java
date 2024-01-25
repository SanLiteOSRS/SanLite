import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rg")
public class class467 {
	@ObfuscatedName("am")
	float field4822;
	@ObfuscatedName("ap")
	float field4813;
	@ObfuscatedName("af")
	float field4816;
	@ObfuscatedName("aj")
	float field4821;
	@ObfuscatedName("aq")
	float field4815;
	@ObfuscatedName("ar")
	float field4817;
	@ObfuscatedName("ag")
	float field4818;
	@ObfuscatedName("ao")
	float field4819;
	@ObfuscatedName("ae")
	float field4820;
	@ObfuscatedName("aa")
	float field4812;
	@ObfuscatedName("au")
	float field4814;
	@ObfuscatedName("an")
	float field4823;

	static {
		new class467();
	} // L: 6

	class467() {
		this.method8614(); // L: 22
	} // L: 23

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1780261737"
	)
	void method8614() {
		this.field4823 = 0.0F; // L: 26
		this.field4814 = 0.0F; // L: 27
		this.field4812 = 0.0F; // L: 28
		this.field4819 = 0.0F; // L: 29
		this.field4818 = 0.0F; // L: 30
		this.field4817 = 0.0F; // L: 31
		this.field4821 = 0.0F; // L: 32
		this.field4816 = 0.0F; // L: 33
		this.field4813 = 0.0F; // L: 34
		this.field4820 = 1.0F; // L: 35
		this.field4815 = 1.0F; // L: 36
		this.field4822 = 1.0F; // L: 37
	} // L: 38

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "1687317289"
	)
	void method8615(float var1) {
		float var2 = (float)Math.cos((double)var1); // L: 41
		float var3 = (float)Math.sin((double)var1); // L: 42
		float var4 = this.field4813; // L: 43
		float var5 = this.field4815; // L: 44
		float var6 = this.field4819; // L: 45
		float var7 = this.field4814; // L: 46
		this.field4813 = var2 * var4 - this.field4816 * var3; // L: 47
		this.field4816 = var2 * this.field4816 + var3 * var4; // L: 48
		this.field4815 = var2 * var5 - this.field4817 * var3; // L: 49
		this.field4817 = var5 * var3 + this.field4817 * var2; // L: 50
		this.field4819 = var6 * var2 - var3 * this.field4820; // L: 51
		this.field4820 = var2 * this.field4820 + var3 * var6; // L: 52
		this.field4814 = var7 * var2 - this.field4823 * var3; // L: 53
		this.field4823 = var3 * var7 + var2 * this.field4823; // L: 54
	} // L: 55

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-1230248122"
	)
	void method8627(float var1) {
		float var2 = (float)Math.cos((double)var1); // L: 58
		float var3 = (float)Math.sin((double)var1); // L: 59
		float var4 = this.field4822; // L: 60
		float var5 = this.field4821; // L: 61
		float var6 = this.field4818; // L: 62
		float var7 = this.field4812; // L: 63
		this.field4822 = var4 * var2 + this.field4816 * var3; // L: 64
		this.field4816 = var2 * this.field4816 - var3 * var4; // L: 65
		this.field4821 = var5 * var2 + var3 * this.field4817; // L: 66
		this.field4817 = this.field4817 * var2 - var5 * var3; // L: 67
		this.field4818 = this.field4820 * var3 + var6 * var2; // L: 68
		this.field4820 = this.field4820 * var2 - var6 * var3; // L: 69
		this.field4812 = var2 * var7 + var3 * this.field4823; // L: 70
		this.field4823 = this.field4823 * var2 - var7 * var3; // L: 71
	} // L: 72

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "87"
	)
	void method8619(float var1) {
		float var2 = (float)Math.cos((double)var1); // L: 75
		float var3 = (float)Math.sin((double)var1); // L: 76
		float var4 = this.field4822; // L: 77
		float var5 = this.field4821; // L: 78
		float var6 = this.field4818; // L: 79
		float var7 = this.field4812; // L: 80
		this.field4822 = var2 * var4 - var3 * this.field4813; // L: 81
		this.field4813 = var4 * var3 + this.field4813 * var2; // L: 82
		this.field4821 = var5 * var2 - this.field4815 * var3; // L: 83
		this.field4815 = this.field4815 * var2 + var5 * var3; // L: 84
		this.field4818 = var6 * var2 - var3 * this.field4819; // L: 85
		this.field4819 = this.field4819 * var2 + var6 * var3; // L: 86
		this.field4812 = var7 * var2 - this.field4814 * var3; // L: 87
		this.field4814 = this.field4814 * var2 + var7 * var3; // L: 88
	} // L: 89

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "118251049"
	)
	void method8618(float var1, float var2, float var3) {
		this.field4812 += var1; // L: 92
		this.field4814 += var2; // L: 93
		this.field4823 += var3; // L: 94
	} // L: 95

	public String toString() {
		return this.field4822 + "," + this.field4821 + "," + this.field4818 + "," + this.field4812 + "\n" + this.field4813 + "," + this.field4815 + "," + this.field4819 + "," + this.field4814 + "\n" + this.field4816 + "," + this.field4817 + "," + this.field4820 + "," + this.field4823; // L: 99
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1253007278"
	)
	static final void method8636(String var0) {
		StringBuilder var10000 = new StringBuilder();
		Object var10001 = null; // L: 164
		var10000 = var10000.append("Please remove ").append(var0);
		var10001 = null;
		String var1 = var10000.append(" from your friend list first").toString();
		GrandExchangeEvents.addGameMessage(30, "", var1); // L: 166
	} // L: 168

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(ZLuo;B)V",
		garbageValue = "22"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0; // L: 5788
		int var2;
		int var4;
		int var5;
		int var6;
		int var7;
		if (!Client.isInInstance) { // L: 5789
			var1.method9431(); // L: 5793
			int var3 = var1.method9398(); // L: 5794
			var2 = var1.method9430(); // L: 5795
			var4 = var1.readUnsignedShort(); // L: 5796
			class166.xteaKeys = new int[var4][4]; // L: 5797

			for (var5 = 0; var5 < var4; ++var5) { // L: 5798
				for (var6 = 0; var6 < 4; ++var6) { // L: 5799
					class166.xteaKeys[var5][var6] = var1.readInt(); // L: 5800
				}
			}

			class33.regions = new int[var4]; // L: 5803
			WorldMapData_0.regionMapArchiveIds = new int[var4]; // L: 5804
			class364.regionLandArchiveIds = new int[var4]; // L: 5805
			class319.regionLandArchives = new byte[var4][]; // L: 5806
			class341.regionMapArchives = new byte[var4][]; // L: 5807
			var4 = 0; // L: 5808

			for (var5 = (var2 - 6) / 8; var5 <= (var2 + 6) / 8; ++var5) { // L: 5809
				for (var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) { // L: 5810
					var7 = var6 + (var5 << 8); // L: 5811
					class33.regions[var4] = var7; // L: 5812
					WorldMapData_0.regionMapArchiveIds[var4] = class30.archive9.getGroupId("m" + var5 + "_" + var6); // L: 5813
					class364.regionLandArchiveIds[var4] = class30.archive9.getGroupId("l" + var5 + "_" + var6); // L: 5814
					++var4; // L: 5815
				}
			}

			class59.method1170(var2, var3, true); // L: 5818
		} else {
			var2 = var1.method9538(); // L: 5821
			boolean var15 = var1.method9420() == 1; // L: 5822
			var4 = var1.method9430(); // L: 5823
			var5 = var1.readUnsignedShort(); // L: 5824
			var1.importIndex(); // L: 5825

			int var8;
			int var9;
			for (var6 = 0; var6 < 4; ++var6) { // L: 5826
				for (var7 = 0; var7 < 13; ++var7) { // L: 5827
					for (var8 = 0; var8 < 13; ++var8) { // L: 5828
						var9 = var1.readBits(1); // L: 5829
						if (var9 == 1) {
							Client.instanceChunkTemplates[var6][var7][var8] = var1.readBits(26); // L: 5830
						} else {
							Client.instanceChunkTemplates[var6][var7][var8] = -1; // L: 5831
						}
					}
				}
			}

			var1.exportIndex(); // L: 5835
			class166.xteaKeys = new int[var5][4]; // L: 5836

			for (var6 = 0; var6 < var5; ++var6) { // L: 5837
				for (var7 = 0; var7 < 4; ++var7) { // L: 5838
					class166.xteaKeys[var6][var7] = var1.readInt(); // L: 5839
				}
			}

			class33.regions = new int[var5]; // L: 5842
			WorldMapData_0.regionMapArchiveIds = new int[var5]; // L: 5843
			class364.regionLandArchiveIds = new int[var5]; // L: 5844
			class319.regionLandArchives = new byte[var5][]; // L: 5845
			class341.regionMapArchives = new byte[var5][]; // L: 5846
			var5 = 0; // L: 5847

			for (var6 = 0; var6 < 4; ++var6) { // L: 5848
				for (var7 = 0; var7 < 13; ++var7) { // L: 5849
					for (var8 = 0; var8 < 13; ++var8) { // L: 5850
						var9 = Client.instanceChunkTemplates[var6][var7][var8]; // L: 5851
						if (var9 != -1) { // L: 5852
							int var10 = var9 >> 14 & 1023; // L: 5853
							int var11 = var9 >> 3 & 2047; // L: 5854
							int var12 = (var10 / 8 << 8) + var11 / 8; // L: 5855

							int var13;
							for (var13 = 0; var13 < var5; ++var13) { // L: 5856
								if (class33.regions[var13] == var12) {
									var12 = -1; // L: 5857
									break; // L: 5858
								}
							}

							if (var12 != -1) { // L: 5860
								class33.regions[var5] = var12; // L: 5861
								var13 = var12 >> 8 & 255; // L: 5862
								int var14 = var12 & 255; // L: 5863
								WorldMapData_0.regionMapArchiveIds[var5] = class30.archive9.getGroupId("m" + var13 + "_" + var14); // L: 5864
								class364.regionLandArchiveIds[var5] = class30.archive9.getGroupId("l" + var13 + "_" + var14); // L: 5865
								++var5; // L: 5866
							}
						}
					}
				}
			}

			class59.method1170(var2, var4, !var15); // L: 5872
		}

	} // L: 5874
}
