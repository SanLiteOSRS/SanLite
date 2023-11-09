import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
@Implements("KitDefinition")
public class KitDefinition extends DualNode {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("KitDefinition_archive")
	static AbstractArchive KitDefinition_archive;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("KitDefinition_modelsArchive")
	static AbstractArchive KitDefinition_modelsArchive;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1273507349
	)
	@Export("KitDefinition_fileCount")
	public static int KitDefinition_fileCount;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("KitDefinition_cached")
	static EvictingDualNodeHashTable KitDefinition_cached;
	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("archive10")
	static Archive archive10;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1346029147
	)
	@Export("bodypartID")
	public int bodypartID;
	@ObfuscatedName("q")
	@Export("models2")
	int[] models2;
	@ObfuscatedName("i")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("k")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("o")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("n")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("d")
	@Export("models")
	int[] models;
	@ObfuscatedName("a")
	@Export("nonSelectable")
	public boolean nonSelectable;

	static {
		KitDefinition_cached = new EvictingDualNodeHashTable(64); // L: 14
	}

	KitDefinition() {
		this.bodypartID = -1; // L: 15
		this.models = new int[]{-1, -1, -1, -1, -1}; // L: 21
		this.nonSelectable = false; // L: 22
	} // L: 24

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "113533312"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 44
			if (var2 == 0) { // L: 45
				return; // L: 48
			}

			this.decodeNext(var1, var2); // L: 46
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lqr;IB)V",
		garbageValue = "4"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 51
			this.bodypartID = var1.readUnsignedByte();
		} else {
			int var3;
			int var4;
			if (var2 == 2) { // L: 52
				var3 = var1.readUnsignedByte(); // L: 53
				this.models2 = new int[var3]; // L: 54

				for (var4 = 0; var4 < var3; ++var4) { // L: 55
					this.models2[var4] = var1.readUnsignedShort();
				}
			} else if (var2 == 3) { // L: 57
				this.nonSelectable = true;
			} else if (var2 == 40) { // L: 58
				var3 = var1.readUnsignedByte(); // L: 59
				this.recolorFrom = new short[var3]; // L: 60
				this.recolorTo = new short[var3]; // L: 61

				for (var4 = 0; var4 < var3; ++var4) { // L: 62
					this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 63
					this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 64
				}
			} else if (var2 == 41) { // L: 67
				var3 = var1.readUnsignedByte(); // L: 68
				this.retextureFrom = new short[var3]; // L: 69
				this.retextureTo = new short[var3]; // L: 70

				for (var4 = 0; var4 < var3; ++var4) { // L: 71
					this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 72
					this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 73
				}
			} else if (var2 >= 60 && var2 < 70) { // L: 76
				this.models[var2 - 60] = var1.readUnsignedShort();
			}
		}

	} // L: 78

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1850904854"
	)
	@Export("ready")
	public boolean ready() {
		if (this.models2 == null) { // L: 81
			return true;
		} else {
			boolean var1 = true; // L: 82

			for (int var2 = 0; var2 < this.models2.length; ++var2) { // L: 83
				if (!KitDefinition_modelsArchive.tryLoadFile(this.models2[var2], 0)) {
					var1 = false;
				}
			}

			return var1; // L: 84
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)Lgp;",
		garbageValue = "86"
	)
	@Export("getModelData")
	public ModelData getModelData() {
		if (this.models2 == null) { // L: 88
			return null;
		} else {
			ModelData[] var1 = new ModelData[this.models2.length]; // L: 89

			for (int var2 = 0; var2 < this.models2.length; ++var2) { // L: 90
				var1[var2] = ModelData.ModelData_get(KitDefinition_modelsArchive, this.models2[var2], 0);
			}

			ModelData var4;
			if (var1.length == 1) { // L: 92
				var4 = var1[0];
			} else {
				var4 = new ModelData(var1, var1.length); // L: 93
			}

			int var3;
			if (this.recolorFrom != null) { // L: 94
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) { // L: 95
					var4.recolor(this.recolorFrom[var3], this.recolorTo[var3]); // L: 96
				}
			}

			if (this.retextureFrom != null) { // L: 99
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) { // L: 100
					var4.retexture(this.retextureFrom[var3], this.retextureTo[var3]); // L: 101
				}
			}

			return var4; // L: 104
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "894950921"
	)
	public boolean method3351() {
		boolean var1 = true; // L: 108

		for (int var2 = 0; var2 < 5; ++var2) { // L: 109
			if (this.models[var2] != -1 && !KitDefinition_modelsArchive.tryLoadFile(this.models[var2], 0)) { // L: 110
				var1 = false;
			}
		}

		return var1; // L: 112
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Lgp;",
		garbageValue = "1970122407"
	)
	@Export("getKitDefinitionModels")
	public ModelData getKitDefinitionModels() {
		ModelData[] var1 = new ModelData[5]; // L: 116
		int var2 = 0; // L: 117

		for (int var3 = 0; var3 < 5; ++var3) { // L: 118
			if (this.models[var3] != -1) { // L: 119
				var1[var2++] = ModelData.ModelData_get(KitDefinition_modelsArchive, this.models[var3], 0);
			}
		}

		ModelData var5 = new ModelData(var1, var2); // L: 121
		int var4;
		if (this.recolorFrom != null) { // L: 122
			for (var4 = 0; var4 < this.recolorFrom.length; ++var4) { // L: 123
				var5.recolor(this.recolorFrom[var4], this.recolorTo[var4]); // L: 124
			}
		}

		if (this.retextureFrom != null) { // L: 127
			for (var4 = 0; var4 < this.retextureFrom.length; ++var4) { // L: 128
				var5.retexture(this.retextureFrom[var4], this.retextureTo[var4]); // L: 129
			}
		}

		return var5; // L: 132
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "170123111"
	)
	static String method3349() {
		return FriendsChatMember.clientPreferences.method2211() ? NPCComposition.method3410(Login.Login_username) : Login.Login_username; // L: 269
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "1955170611"
	)
	static int method3336(int var0, Script var1, boolean var2) {
		if (var0 == 7400) { // L: 4694
			--Nameable.Interpreter_intStackSize; // L: 4695
			--UserComparator8.Interpreter_stringStackSize; // L: 4696
			return 1; // L: 4697
		} else if (var0 == 7401) { // L: 4699
			--Nameable.Interpreter_intStackSize; // L: 4700
			--UserComparator8.Interpreter_stringStackSize; // L: 4701
			return 1; // L: 4702
		} else if (var0 == 7402) { // L: 4704
			Nameable.Interpreter_intStackSize -= 2; // L: 4705
			--UserComparator8.Interpreter_stringStackSize; // L: 4706
			return 1; // L: 4707
		} else if (var0 == 7403) { // L: 4709
			Nameable.Interpreter_intStackSize -= 2; // L: 4710
			--UserComparator8.Interpreter_stringStackSize; // L: 4711
			return 1; // L: 4712
		} else if (var0 == 7404) { // L: 4714
			--Nameable.Interpreter_intStackSize; // L: 4715
			--UserComparator8.Interpreter_stringStackSize; // L: 4716
			return 1; // L: 4717
		} else if (var0 == 7405) { // L: 4719
			Nameable.Interpreter_intStackSize -= 2; // L: 4720
			return 1; // L: 4721
		} else if (var0 == 7406) { // L: 4723
			--Nameable.Interpreter_intStackSize; // L: 4724
			Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = ""; // L: 4725
			return 1; // L: 4726
		} else if (var0 == 7407) { // L: 4728
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 4729
			return 1; // L: 4730
		} else if (var0 == 7408) { // L: 4732
			Nameable.Interpreter_intStackSize -= 2; // L: 4733
			--UserComparator8.Interpreter_stringStackSize; // L: 4734
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 4735
			return 1; // L: 4736
		} else if (var0 == 7409) { // L: 4738
			--Nameable.Interpreter_intStackSize; // L: 4739
			return 1; // L: 4740
		} else if (var0 == 7463) { // L: 4742
			boolean var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1; // L: 4743
			ApproximateRouteStrategy.method1071(var3); // L: 4744
			return 1; // L: 4745
		} else {
			return 2; // L: 4747
		}
	}
}
