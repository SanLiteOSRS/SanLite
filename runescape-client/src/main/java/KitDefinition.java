import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gc")
@Implements("KitDefinition")
public class KitDefinition extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	static AbstractArchive field1905;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1089558421
	)
	public static int field1894;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("KitDefinition_cached")
	static EvictingDualNodeHashTable KitDefinition_cached;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -909118269
	)
	@Export("bodypartID")
	public int bodypartID;
	@ObfuscatedName("as")
	@Export("models2")
	int[] models2;
	@ObfuscatedName("aa")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("az")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("ao")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("au")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("ak")
	@Export("models")
	int[] models;
	@ObfuscatedName("ah")
	@Export("nonSelectable")
	public boolean nonSelectable;

	static {
		KitDefinition_cached = new EvictingDualNodeHashTable(64); // L: 14
	}

	KitDefinition() {
		this.bodypartID = -1; // L: 15
		this.models = new int[]{-1, -1, -1, -1, -1}; // L: 21
		this.nonSelectable = false; // L: 22
	} // L: 26

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "1445854362"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 47
			if (var2 == 0) { // L: 48
				return; // L: 51
			}

			this.decodeNext(var1, var2); // L: 49
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Luq;IB)V",
		garbageValue = "-14"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 54
			this.bodypartID = var1.readUnsignedByte();
		} else {
			int var3;
			int var4;
			if (var2 == 2) { // L: 55
				var3 = var1.readUnsignedByte(); // L: 56
				this.models2 = new int[var3]; // L: 57

				for (var4 = 0; var4 < var3; ++var4) { // L: 58
					this.models2[var4] = var1.readUnsignedShort();
				}
			} else if (var2 == 3) { // L: 60
				this.nonSelectable = true;
			} else if (var2 == 40) { // L: 61
				var3 = var1.readUnsignedByte(); // L: 62
				this.recolorFrom = new short[var3]; // L: 63
				this.recolorTo = new short[var3]; // L: 64

				for (var4 = 0; var4 < var3; ++var4) { // L: 65
					this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 66
					this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 67
				}
			} else if (var2 == 41) { // L: 70
				var3 = var1.readUnsignedByte(); // L: 71
				this.retextureFrom = new short[var3]; // L: 72
				this.retextureTo = new short[var3]; // L: 73

				for (var4 = 0; var4 < var3; ++var4) { // L: 74
					this.retextureFrom[var4] = (short)var1.readUnsignedShort();
					this.retextureTo[var4] = (short)var1.readUnsignedShort();
				}
			} else if (var2 >= 60 && var2 < 70) { // L: 79
				this.models[var2 - 60] = var1.readUnsignedShort();
			}
		}

	} // L: 81

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1441049510"
	)
	@Export("ready")
	public boolean ready() {
		if (this.models2 == null) { // L: 84
			return true;
		} else {
			boolean var1 = true; // L: 85

			for (int var2 = 0; var2 < this.models2.length; ++var2) { // L: 86
				if (!class4.KitDefinition_modelsArchive.tryLoadFile(this.models2[var2], 0)) {
					var1 = false;
				}
			}

			return var1; // L: 87
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)Lkf;",
		garbageValue = "16"
	)
	@Export("getModelData")
	public ModelData getModelData() {
		if (this.models2 == null) { // L: 91
			return null;
		} else {
			ModelData[] var1 = new ModelData[this.models2.length]; // L: 92

			for (int var2 = 0; var2 < this.models2.length; ++var2) { // L: 93
				var1[var2] = ModelData.ModelData_get(class4.KitDefinition_modelsArchive, this.models2[var2], 0);
			}

			ModelData var4;
			if (var1.length == 1) { // L: 95
				var4 = var1[0];
			} else {
				var4 = new ModelData(var1, var1.length); // L: 96
			}

			int var3;
			if (this.recolorFrom != null) { // L: 97
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) { // L: 98
					var4.recolor(this.recolorFrom[var3], this.recolorTo[var3]); // L: 99
				}
			}

			if (this.retextureFrom != null) { // L: 102
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) { // L: 103
					var4.retexture(this.retextureFrom[var3], this.retextureTo[var3]); // L: 104
				}
			}

			return var4; // L: 107
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "104"
	)
	public boolean method3612() {
		boolean var1 = true; // L: 111

		for (int var2 = 0; var2 < 5; ++var2) { // L: 112
			if (this.models[var2] != -1 && !class4.KitDefinition_modelsArchive.tryLoadFile(this.models[var2], 0)) { // L: 113
				var1 = false;
			}
		}

		return var1; // L: 115
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lkf;",
		garbageValue = "65280"
	)
	@Export("getKitDefinitionModels")
	public ModelData getKitDefinitionModels() {
		ModelData[] var1 = new ModelData[5]; // L: 119
		int var2 = 0; // L: 120

		for (int var3 = 0; var3 < 5; ++var3) { // L: 121
			if (this.models[var3] != -1) { // L: 122
				var1[var2++] = ModelData.ModelData_get(class4.KitDefinition_modelsArchive, this.models[var3], 0);
			}
		}

		ModelData var5 = new ModelData(var1, var2); // L: 124
		int var4;
		if (this.recolorFrom != null) { // L: 125
			for (var4 = 0; var4 < this.recolorFrom.length; ++var4) { // L: 126
				var5.recolor(this.recolorFrom[var4], this.recolorTo[var4]); // L: 127
			}
		}

		if (this.retextureFrom != null) { // L: 130
			for (var4 = 0; var4 < this.retextureFrom.length; ++var4) { // L: 131
				var5.retexture(this.retextureFrom[var4], this.retextureTo[var4]); // L: 132
			}
		}

		return var5; // L: 135
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-321737502"
	)
	public static void method3630() {
		class526.DBRowType_cache.clear(); // L: 75
	} // L: 76

	@ObfuscatedName("oy")
	@ObfuscatedSignature(
		descriptor = "(Luq;B)V",
		garbageValue = "101"
	)
	static void method3636(Buffer var0) {
		if (Client.randomDatData != null) { // L: 12875
			var0.writeBytes(Client.randomDatData, 0, Client.randomDatData.length); // L: 12876
		} else {
			byte[] var2 = new byte[24]; // L: 12881

			try {
				JagexCache.JagexCache_randomDat.seek(0L); // L: 12883
				JagexCache.JagexCache_randomDat.readFully(var2); // L: 12884

				int var3;
				for (var3 = 0; var3 < 24 && var2[var3] == 0; ++var3) { // L: 12885 12886 12887
				}

				if (var3 >= 24) { // L: 12889
					throw new IOException();
				}
			} catch (Exception var6) {
				for (int var4 = 0; var4 < 24; ++var4) { // L: 12892
					var2[var4] = -1;
				}
			}

			var0.writeBytes(var2, 0, var2.length); // L: 12897
		}
	} // L: 12877 12898
}
