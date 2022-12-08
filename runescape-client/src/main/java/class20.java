import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("c")
public class class20 implements Callable {
	@ObfuscatedName("sr")
	@ObfuscatedSignature(
		descriptor = "Lep;"
	)
	@Export("guestClanSettings")
	static ClanSettings guestClanSettings;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lac;"
	)
	@Export("pcmPlayerProvider")
	public static class51 pcmPlayerProvider;
	@ObfuscatedName("am")
	@Export("fontHelvetica13")
	static java.awt.Font fontHelvetica13;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lj;"
	)
	final class10 field117;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ln;"
	)
	final class14 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ln;Lj;)V"
	)
	class20(class14 var1, class10 var2) {
		this.this$0 = var1; // L: 46
		this.field117 = var2; // L: 47
	} // L: 48

	public Object call() throws Exception {
		try {
			while (this.field117.method88()) { // L: 53
				class12.method157(10L); // L: 54
			}
		} catch (IOException var2) { // L: 57
			return new class21("Error servicing REST query: " + var2.getMessage()); // L: 58
		}

		return this.field117.method89(); // L: 60
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILbm;ZI)I",
		garbageValue = "-779759676"
	)
	static int method292(int var0, Script var1, boolean var2) {
		return 2; // L: 3077
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILbm;ZB)I",
		garbageValue = "114"
	)
	static int method294(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.OC_NAME) { // L: 3826
			var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 3827
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = NPCComposition.ItemComposition_get(var3).name; // L: 3828
			return 1; // L: 3829
		} else {
			ItemComposition var5;
			int var6;
			if (var0 == ScriptOpcodes.OC_OP) { // L: 3831
				class87.Interpreter_intStackSize -= 2; // L: 3832
				var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 3833
				var6 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 3834
				var5 = NPCComposition.ItemComposition_get(var3); // L: 3835
				if (var6 >= 1 && var6 <= 5 && var5.groundActions[var6 - 1] != null) { // L: 3836
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.groundActions[var6 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3837
				}

				return 1; // L: 3838
			} else if (var0 == ScriptOpcodes.OC_IOP) { // L: 3840
				class87.Interpreter_intStackSize -= 2; // L: 3841
				var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 3842
				var6 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 3843
				var5 = NPCComposition.ItemComposition_get(var3); // L: 3844
				if (var6 >= 1 && var6 <= 5 && var5.inventoryActions[var6 - 1] != null) { // L: 3845
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.inventoryActions[var6 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3846
				}

				return 1; // L: 3847
			} else if (var0 == ScriptOpcodes.OC_COST) { // L: 3849
				var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 3850
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = NPCComposition.ItemComposition_get(var3).price; // L: 3851
				return 1; // L: 3852
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) { // L: 3854
				var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 3855
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = NPCComposition.ItemComposition_get(var3).isStackable == 1 ? 1 : 0; // L: 3856
				return 1; // L: 3857
			} else {
				ItemComposition var4;
				if (var0 == ScriptOpcodes.OC_CERT) { // L: 3859
					var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 3860
					var4 = NPCComposition.ItemComposition_get(var3); // L: 3861
					if (var4.noteTemplate == -1 && var4.note >= 0) { // L: 3862
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3; // L: 3863
					}

					return 1; // L: 3864
				} else if (var0 == ScriptOpcodes.OC_UNCERT) { // L: 3866
					var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 3867
					var4 = NPCComposition.ItemComposition_get(var3); // L: 3868
					if (var4.noteTemplate >= 0 && var4.note >= 0) { // L: 3869
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3; // L: 3870
					}

					return 1; // L: 3871
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) { // L: 3873
					var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 3874
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = NPCComposition.ItemComposition_get(var3).isMembersOnly ? 1 : 0; // L: 3875
					return 1; // L: 3876
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) { // L: 3878
					var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 3879
					var4 = NPCComposition.ItemComposition_get(var3); // L: 3880
					if (var4.placeholderTemplate == -1 && var4.placeholder >= 0) { // L: 3881
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3; // L: 3882
					}

					return 1; // L: 3883
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) { // L: 3885
					var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 3886
					var4 = NPCComposition.ItemComposition_get(var3); // L: 3887
					if (var4.placeholderTemplate >= 0 && var4.placeholder >= 0) { // L: 3888
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3; // L: 3889
					}

					return 1; // L: 3890
				} else if (var0 == ScriptOpcodes.OC_FIND) { // L: 3892
					String var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3893
					var6 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 3894
					class298.findItemDefinitions(var7, var6 == 1); // L: 3895
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = ScriptEvent.foundItemIdCount; // L: 3896
					return 1; // L: 3897
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) { // L: 3899
					if (var0 == ScriptOpcodes.OC_FINDRESET) { // L: 3904
						UserComparator6.foundItemIndex = 0; // L: 3905
						return 1; // L: 3906
					} else if (var0 == 4213) { // L: 3908
						var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 3909
						var6 = NPCComposition.ItemComposition_get(var3).getShiftClickIndex(); // L: 3910
						if (var6 == -1) { // L: 3911
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var6; // L: 3912
						} else {
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var6 + 1; // L: 3915
						}

						return 1; // L: 3917
					} else if (var0 == 4214) { // L: 3919
						var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 3920
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = NPCComposition.ItemComposition_get(var3).maleModel; // L: 3921
						return 1; // L: 3922
					} else if (var0 == 4215) { // L: 3924
						var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 3925
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = NPCComposition.ItemComposition_get(var3).maleModel1; // L: 3926
						return 1; // L: 3927
					} else if (var0 == 4216) { // L: 3929
						var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 3930
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = NPCComposition.ItemComposition_get(var3).maleModel2; // L: 3931
						return 1; // L: 3932
					} else if (var0 == 4217) { // L: 3934
						var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 3935
						var4 = NPCComposition.ItemComposition_get(var3); // L: 3936
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var4.field2224; // L: 3937
						return 1; // L: 3938
					} else {
						return 2; // L: 3940
					}
				} else {
					if (class19.foundItemIds != null && UserComparator6.foundItemIndex < ScriptEvent.foundItemIdCount) { // L: 3900
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class19.foundItemIds[++UserComparator6.foundItemIndex - 1] & '\uffff'; // L: 3901
					} else {
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1;
					}

					return 1; // L: 3902
				}
			}
		}
	}

	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "(Lga;IIIS)V",
		garbageValue = "-29230"
	)
	static void method293(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && StructComposition.clientPreferences.method2506() != 0) { // L: 3471
			if (var0.field2283 != null && var0.field2283.containsKey(var1)) { // L: 3472
				int var4 = (Integer)var0.field2283.get(var1); // L: 3473
				if (var4 != 0) { // L: 3477
					int var7 = var4 >> 8; // L: 3478
					int var8 = var4 >> 4 & 7; // L: 3479
					int var9 = var4 & 15; // L: 3480
					Client.soundEffectIds[Client.soundEffectCount] = var7; // L: 3481
					Client.queuedSoundEffectLoops[Client.soundEffectCount] = var8; // L: 3482
					Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0; // L: 3483
					Client.soundEffects[Client.soundEffectCount] = null; // L: 3484
					int var10 = (var2 - 64) / 128; // L: 3485
					int var11 = (var3 - 64) / 128; // L: 3486
					Client.soundLocations[Client.soundEffectCount] = var9 + (var11 << 8) + (var10 << 16); // L: 3487
					++Client.soundEffectCount; // L: 3488
				}

			}
		}
	} // L: 3490
}
