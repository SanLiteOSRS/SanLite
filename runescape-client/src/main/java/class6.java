import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("i")
public enum class6 implements class349 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Li;"
	)
	field16(0, 0);

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("musicTrackArchive")
	public static AbstractArchive musicTrackArchive;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -257202399
	)
	final int field21;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 94731565
	)
	final int field18;

	class6(int var3, int var4) {
		this.field21 = var3; // L: 12
		this.field18 = var4; // L: 13
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "3"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field18; // L: 18
	}

	@ObfuscatedName("f")
	public static double method46(double var0) {
		return Math.exp(var0 * -var0 / 2.0D) / Math.sqrt(6.283185307179586D); // L: 9
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lln;Lln;Lln;S)V",
		garbageValue = "-29086"
	)
	public static void method50(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
		SequenceDefinition.SequenceDefinition_archive = var0; // L: 51
		SequenceDefinition.SequenceDefinition_animationsArchive = var1; // L: 52
		class16.SequenceDefinition_skeletonsArchive = var2; // L: 53
	} // L: 54

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1657202324"
	)
	static int method49(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 14
		if (var2 == null) { // L: 15
			return -1;
		} else {
			return var1 >= 0 && var1 < var2.ids.length ? var2.ids[var1] : -1; // L: 16 17
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-91"
	)
	static final void method52(String var0) {
		Decimator.method1115("Please remove " + var0 + " from your ignore list first"); // L: 124
	} // L: 125

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZI)I",
		garbageValue = "-1977919441"
	)
	static int method45(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.OC_NAME) { // L: 3837
			var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 3838
			Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = TileItem.ItemComposition_get(var3).name; // L: 3839
			return 1; // L: 3840
		} else {
			ItemComposition var5;
			int var6;
			if (var0 == ScriptOpcodes.OC_OP) { // L: 3842
				class302.Interpreter_intStackSize -= 2; // L: 3843
				var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 3844
				var6 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 3845
				var5 = TileItem.ItemComposition_get(var3); // L: 3846
				if (var6 >= 1 && var6 <= 5 && var5.groundActions[var6 - 1] != null) { // L: 3847
					Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var5.groundActions[var6 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = ""; // L: 3848
				}

				return 1; // L: 3849
			} else if (var0 == ScriptOpcodes.OC_IOP) { // L: 3851
				class302.Interpreter_intStackSize -= 2; // L: 3852
				var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 3853
				var6 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 3854
				var5 = TileItem.ItemComposition_get(var3); // L: 3855
				if (var6 >= 1 && var6 <= 5 && var5.inventoryActions[var6 - 1] != null) { // L: 3856
					Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var5.inventoryActions[var6 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = ""; // L: 3857
				}

				return 1; // L: 3858
			} else if (var0 == ScriptOpcodes.OC_COST) { // L: 3860
				var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 3861
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = TileItem.ItemComposition_get(var3).price; // L: 3862
				return 1; // L: 3863
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) { // L: 3865
				var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 3866
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = TileItem.ItemComposition_get(var3).isStackable == 1 ? 1 : 0; // L: 3867
				return 1; // L: 3868
			} else {
				ItemComposition var4;
				if (var0 == ScriptOpcodes.OC_CERT) { // L: 3870
					var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 3871
					var4 = TileItem.ItemComposition_get(var3); // L: 3872
					if (var4.noteTemplate == -1 && var4.note >= 0) { // L: 3873
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3; // L: 3874
					}

					return 1; // L: 3875
				} else if (var0 == ScriptOpcodes.OC_UNCERT) { // L: 3877
					var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 3878
					var4 = TileItem.ItemComposition_get(var3); // L: 3879
					if (var4.noteTemplate >= 0 && var4.note >= 0) { // L: 3880
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3; // L: 3881
					}

					return 1; // L: 3882
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) { // L: 3884
					var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 3885
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = TileItem.ItemComposition_get(var3).isMembersOnly ? 1 : 0; // L: 3886
					return 1; // L: 3887
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) { // L: 3889
					var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 3890
					var4 = TileItem.ItemComposition_get(var3); // L: 3891
					if (var4.placeholderTemplate == -1 && var4.placeholder >= 0) { // L: 3892
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3; // L: 3893
					}

					return 1; // L: 3894
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) { // L: 3896
					var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 3897
					var4 = TileItem.ItemComposition_get(var3); // L: 3898
					if (var4.placeholderTemplate >= 0 && var4.placeholder >= 0) { // L: 3899
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3; // L: 3900
					}

					return 1; // L: 3901
				} else if (var0 == ScriptOpcodes.OC_FIND) { // L: 3903
					String var7 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize]; // L: 3904
					var6 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 3905
					class382.findItemDefinitions(var7, var6 == 1); // L: 3906
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = class378.foundItemIdCount; // L: 3907
					return 1; // L: 3908
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) { // L: 3910
					if (var0 == ScriptOpcodes.OC_FINDRESET) { // L: 3915
						WorldMapLabelSize.foundItemIndex = 0; // L: 3916
						return 1; // L: 3917
					} else if (var0 == 4213) { // L: 3919
						var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 3920
						var6 = TileItem.ItemComposition_get(var3).getShiftClickIndex(); // L: 3921
						if (var6 == -1) { // L: 3922
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var6; // L: 3923
						} else {
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var6 + 1; // L: 3926
						}

						return 1; // L: 3928
					} else if (var0 == 4214) { // L: 3930
						var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 3931
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = TileItem.ItemComposition_get(var3).maleModel; // L: 3932
						return 1; // L: 3933
					} else if (var0 == 4215) { // L: 3935
						var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 3936
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = TileItem.ItemComposition_get(var3).maleModel1; // L: 3937
						return 1; // L: 3938
					} else if (var0 == 4216) { // L: 3940
						var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 3941
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = TileItem.ItemComposition_get(var3).maleModel2; // L: 3942
						return 1; // L: 3943
					} else if (var0 == 4217) { // L: 3945
						var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 3946
						var4 = TileItem.ItemComposition_get(var3); // L: 3947
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var4.field2258; // L: 3948
						return 1; // L: 3949
					} else {
						return 2; // L: 3951
					}
				} else {
					if (VarbitComposition.foundItemIds != null && WorldMapLabelSize.foundItemIndex < class378.foundItemIdCount) { // L: 3911
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = VarbitComposition.foundItemIds[++WorldMapLabelSize.foundItemIndex - 1] & '\uffff'; // L: 3912
					} else {
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1;
					}

					return 1; // L: 3913
				}
			}
		}
	}

	@ObfuscatedName("mx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "-111"
	)
	static String method48(String var0) {
		PlayerType[] var1 = ArchiveLoader.PlayerType_values(); // L: 13346

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 13347
			PlayerType var3 = var1[var2]; // L: 13348
			if (var3.modIcon != -1 && var0.startsWith(ObjectSound.method1919(var3.modIcon))) { // L: 13350 13351
				var0 = var0.substring(6 + Integer.toString(var3.modIcon).length()); // L: 13352
				break;
			}
		}

		return var0; // L: 13359
	}
}
