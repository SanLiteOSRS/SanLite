import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("lm")
public class class321 {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "-33470033"
	)
	static int method6264(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.OC_NAME) { // L: 3830
			var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 3831
			Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = MidiPcmStream.ItemComposition_get(var3).name; // L: 3832
			return 1; // L: 3833
		} else {
			ItemComposition var5;
			int var6;
			if (var0 == ScriptOpcodes.OC_OP) { // L: 3835
				class379.Interpreter_intStackSize -= 2; // L: 3836
				var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 3837
				var6 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 3838
				var5 = MidiPcmStream.ItemComposition_get(var3); // L: 3839
				if (var6 >= 1 && var6 <= 5 && var5.groundActions[var6 - 1] != null) { // L: 3840
					Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var5.groundActions[var6 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = ""; // L: 3841
				}

				return 1; // L: 3842
			} else if (var0 == ScriptOpcodes.OC_IOP) { // L: 3844
				class379.Interpreter_intStackSize -= 2; // L: 3845
				var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 3846
				var6 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 3847
				var5 = MidiPcmStream.ItemComposition_get(var3); // L: 3848
				if (var6 >= 1 && var6 <= 5 && var5.inventoryActions[var6 - 1] != null) { // L: 3849
					Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var5.inventoryActions[var6 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = ""; // L: 3850
				}

				return 1; // L: 3851
			} else if (var0 == ScriptOpcodes.OC_COST) { // L: 3853
				var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 3854
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = MidiPcmStream.ItemComposition_get(var3).price; // L: 3855
				return 1; // L: 3856
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) { // L: 3858
				var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 3859
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = MidiPcmStream.ItemComposition_get(var3).isStackable == 1 ? 1 : 0; // L: 3860
				return 1; // L: 3861
			} else {
				ItemComposition var4;
				if (var0 == ScriptOpcodes.OC_CERT) { // L: 3863
					var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 3864
					var4 = MidiPcmStream.ItemComposition_get(var3); // L: 3865
					if (var4.noteTemplate == -1 && var4.note >= 0) { // L: 3866
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3; // L: 3867
					}

					return 1; // L: 3868
				} else if (var0 == ScriptOpcodes.OC_UNCERT) { // L: 3870
					var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 3871
					var4 = MidiPcmStream.ItemComposition_get(var3); // L: 3872
					if (var4.noteTemplate >= 0 && var4.note >= 0) { // L: 3873
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3; // L: 3874
					}

					return 1; // L: 3875
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) { // L: 3877
					var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 3878
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = MidiPcmStream.ItemComposition_get(var3).isMembersOnly ? 1 : 0; // L: 3879
					return 1; // L: 3880
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) { // L: 3882
					var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 3883
					var4 = MidiPcmStream.ItemComposition_get(var3); // L: 3884
					if (var4.placeholderTemplate == -1 && var4.placeholder >= 0) { // L: 3885
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3; // L: 3886
					}

					return 1; // L: 3887
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) { // L: 3889
					var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 3890
					var4 = MidiPcmStream.ItemComposition_get(var3); // L: 3891
					if (var4.placeholderTemplate >= 0 && var4.placeholder >= 0) { // L: 3892
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3; // L: 3893
					}

					return 1; // L: 3894
				} else if (var0 == ScriptOpcodes.OC_FIND) { // L: 3896
					String var7 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize]; // L: 3897
					var6 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 3898
					class297.findItemDefinitions(var7, var6 == 1); // L: 3899
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = MilliClock.foundItemIdCount; // L: 3900
					return 1; // L: 3901
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) { // L: 3903
					if (var0 == ScriptOpcodes.OC_FINDRESET) { // L: 3908
						FriendLoginUpdate.foundItemIndex = 0; // L: 3909
						return 1; // L: 3910
					} else if (var0 == 4213) { // L: 3912
						var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 3913
						var6 = MidiPcmStream.ItemComposition_get(var3).getShiftClickIndex(); // L: 3914
						if (var6 == -1) { // L: 3915
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var6; // L: 3916
						} else {
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var6 + 1; // L: 3919
						}

						return 1; // L: 3921
					} else if (var0 == 4214) { // L: 3923
						var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 3924
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = MidiPcmStream.ItemComposition_get(var3).maleModel; // L: 3925
						return 1; // L: 3926
					} else if (var0 == 4215) { // L: 3928
						var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 3929
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = MidiPcmStream.ItemComposition_get(var3).maleModel1; // L: 3930
						return 1; // L: 3931
					} else if (var0 == 4216) { // L: 3933
						var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 3934
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = MidiPcmStream.ItemComposition_get(var3).maleModel2; // L: 3935
						return 1; // L: 3936
					} else if (var0 == 4217) { // L: 3938
						var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 3939
						var4 = MidiPcmStream.ItemComposition_get(var3); // L: 3940
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var4.field2182; // L: 3941
						return 1; // L: 3942
					} else {
						return 2; // L: 3944
					}
				} else {
					if (Players.foundItemIds != null && FriendLoginUpdate.foundItemIndex < MilliClock.foundItemIdCount) { // L: 3904
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Players.foundItemIds[++FriendLoginUpdate.foundItemIndex - 1] & '\uffff'; // L: 3905
					} else {
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1;
					}

					return 1; // L: 3906
				}
			}
		}
	}
}
