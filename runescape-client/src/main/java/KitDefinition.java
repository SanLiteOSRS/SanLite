import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fj")
@Implements("KitDefinition")
public class KitDefinition extends DualNode {
	@ObfuscatedName("vy")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	@Export("worldMap")
	static WorldMap worldMap;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	@Export("KitDefinition_archive")
	public static AbstractArchive KitDefinition_archive;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	@Export("KitDefinition_modelsArchive")
	public static AbstractArchive KitDefinition_modelsArchive;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("KitDefinition_cached")
	static EvictingDualNodeHashTable KitDefinition_cached;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 984840871
	)
	@Export("bodypartID")
	public int bodypartID;
	@ObfuscatedName("q")
	@Export("models2")
	int[] models2;
	@ObfuscatedName("f")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("r")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("u")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("b")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("j")
	@Export("models")
	int[] models;
	@ObfuscatedName("g")
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

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lqy;B)V",
		garbageValue = "1"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 40
			if (var2 == 0) { // L: 41
				return; // L: 44
			}

			this.decodeNext(var1, var2); // L: 42
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lqy;IB)V",
		garbageValue = "0"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 47
			this.bodypartID = var1.readUnsignedByte();
		} else {
			int var3;
			int var4;
			if (var2 == 2) { // L: 48
				var3 = var1.readUnsignedByte(); // L: 49
				this.models2 = new int[var3]; // L: 50

				for (var4 = 0; var4 < var3; ++var4) { // L: 51
					this.models2[var4] = var1.readUnsignedShort();
				}
			} else if (var2 == 3) { // L: 53
				this.nonSelectable = true;
			} else if (var2 == 40) { // L: 54
				var3 = var1.readUnsignedByte(); // L: 55
				this.recolorFrom = new short[var3]; // L: 56
				this.recolorTo = new short[var3]; // L: 57

				for (var4 = 0; var4 < var3; ++var4) { // L: 58
					this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 59
					this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 60
				}
			} else if (var2 == 41) { // L: 63
				var3 = var1.readUnsignedByte(); // L: 64
				this.retextureFrom = new short[var3]; // L: 65
				this.retextureTo = new short[var3]; // L: 66

				for (var4 = 0; var4 < var3; ++var4) { // L: 67
					this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 68
					this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 69
				}
			} else if (var2 >= 60 && var2 < 70) { // L: 72
				this.models[var2 - 60] = var1.readUnsignedShort();
			}
		}

	} // L: 74

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1712752741"
	)
	@Export("ready")
	public boolean ready() {
		if (this.models2 == null) { // L: 77
			return true;
		} else {
			boolean var1 = true; // L: 78

			for (int var2 = 0; var2 < this.models2.length; ++var2) { // L: 79
				if (!KitDefinition_modelsArchive.tryLoadFile(this.models2[var2], 0)) {
					var1 = false;
				}
			}

			return var1; // L: 80
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)Lgi;",
		garbageValue = "32"
	)
	@Export("getModelData")
	public ModelData getModelData() {
		if (this.models2 == null) { // L: 84
			return null;
		} else {
			ModelData[] var1 = new ModelData[this.models2.length]; // L: 85

			for (int var2 = 0; var2 < this.models2.length; ++var2) { // L: 86
				var1[var2] = ModelData.ModelData_get(KitDefinition_modelsArchive, this.models2[var2], 0);
			}

			ModelData var4;
			if (var1.length == 1) { // L: 88
				var4 = var1[0];
			} else {
				var4 = new ModelData(var1, var1.length); // L: 89
			}

			int var3;
			if (this.recolorFrom != null) { // L: 90
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) { // L: 91
					var4.recolor(this.recolorFrom[var3], this.recolorTo[var3]); // L: 92
				}
			}

			if (this.retextureFrom != null) { // L: 95
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) { // L: 96
					var4.retexture(this.retextureFrom[var3], this.retextureTo[var3]); // L: 97
				}
			}

			return var4; // L: 100
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "7"
	)
	public boolean method3589() {
		boolean var1 = true; // L: 104

		for (int var2 = 0; var2 < 5; ++var2) { // L: 105
			if (this.models[var2] != -1 && !KitDefinition_modelsArchive.tryLoadFile(this.models[var2], 0)) { // L: 106
				var1 = false;
			}
		}

		return var1; // L: 108
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Lgi;",
		garbageValue = "1769518048"
	)
	@Export("getKitDefinitionModels")
	public ModelData getKitDefinitionModels() {
		ModelData[] var1 = new ModelData[5]; // L: 112
		int var2 = 0; // L: 113

		for (int var3 = 0; var3 < 5; ++var3) { // L: 114
			if (this.models[var3] != -1) { // L: 115
				var1[var2++] = ModelData.ModelData_get(KitDefinition_modelsArchive, this.models[var3], 0);
			}
		}

		ModelData var5 = new ModelData(var1, var2); // L: 117
		int var4;
		if (this.recolorFrom != null) { // L: 118
			for (var4 = 0; var4 < this.recolorFrom.length; ++var4) { // L: 119
				var5.recolor(this.recolorFrom[var4], this.recolorTo[var4]); // L: 120
			}
		}

		if (this.retextureFrom != null) { // L: 123
			for (var4 = 0; var4 < this.retextureFrom.length; ++var4) { // L: 124
				var5.retexture(this.retextureFrom[var4], this.retextureTo[var4]); // L: 125
			}
		}

		return var5; // L: 128
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1365388558"
	)
	@Export("addGameMessage")
	static void addGameMessage(int var0, String var1, String var2) {
		class381.addChatMessage(var0, var1, var2, (String)null); // L: 19
	} // L: 20
}
