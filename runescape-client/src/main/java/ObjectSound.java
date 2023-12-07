import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ca")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -69802151
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -621731961
	)
	@Export("x")
	int x;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1280498257
	)
	@Export("y")
	int y;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 197368448
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1049389789
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1736475093
	)
	int field824;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 4042297
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lbb;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 2032217193
	)
	int field827;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1837221441
	)
	int field828;
	@ObfuscatedName("av")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1799658609
	)
	int field832;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lbb;"
	)
	@Export("stream2")
	RawPcmStream stream2;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	@Export("obj")
	ObjectComposition obj;

	static {
		objectSounds = new NodeDeque(); // L: 11
	}

	ObjectSound() {
	} // L: 27

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "12079465"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId; // L: 50
		ObjectComposition var2 = this.obj.transform(); // L: 51
		if (var2 != null) { // L: 52
			this.soundEffectId = var2.ambientSoundId; // L: 53
			this.field824 = var2.int7 * 128; // L: 54
			this.field827 = var2.int5; // L: 55
			this.field828 = var2.int6; // L: 56
			this.soundEffectIds = var2.soundEffectIds; // L: 57
		} else {
			this.soundEffectId = -1; // L: 60
			this.field824 = 0; // L: 61
			this.field827 = 0; // L: 62
			this.field828 = 0; // L: 63
			this.soundEffectIds = null; // L: 64
		}

		if (var1 != this.soundEffectId && this.stream1 != null) { // L: 66
			LoginScreenAnimation.pcmStreamMixer.removeSubStream(this.stream1); // L: 67
			this.stream1 = null; // L: 68
		}

	} // L: 70

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-737174701"
	)
	static int method1978(int var0, int var1) {
		for (int var2 = 0; var2 < 8; ++var2) { // L: 1517
			if (var1 <= var0 + 30) { // L: 1518
				return var2; // L: 1519
			}

			var0 += 30; // L: 1521
			var0 += var2 != 1 && var2 != 3 ? 5 : 20; // L: 1522
		}

		return 0; // L: 1524
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZB)I",
		garbageValue = "2"
	)
	static int method1973(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.OC_NAME) { // L: 4033
			var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 4034
			Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = class214.ItemComposition_get(var3).name; // L: 4035
			return 1; // L: 4036
		} else {
			ItemComposition var5;
			int var6;
			if (var0 == ScriptOpcodes.OC_OP) { // L: 4038
				class517.Interpreter_intStackSize -= 2; // L: 4039
				var3 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 4040
				var6 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 4041
				var5 = class214.ItemComposition_get(var3); // L: 4042
				if (var6 >= 1 && var6 <= 5 && var5.groundActions[var6 - 1] != null) { // L: 4043
					Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var5.groundActions[var6 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = ""; // L: 4044
				}

				return 1; // L: 4045
			} else if (var0 == ScriptOpcodes.OC_IOP) { // L: 4047
				class517.Interpreter_intStackSize -= 2; // L: 4048
				var3 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 4049
				var6 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 4050
				var5 = class214.ItemComposition_get(var3); // L: 4051
				if (var6 >= 1 && var6 <= 5 && var5.inventoryActions[var6 - 1] != null) { // L: 4052
					Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var5.inventoryActions[var6 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = ""; // L: 4053
				}

				return 1; // L: 4054
			} else if (var0 == ScriptOpcodes.OC_COST) { // L: 4056
				var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 4057
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = class214.ItemComposition_get(var3).price; // L: 4058
				return 1; // L: 4059
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) { // L: 4061
				var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 4062
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = class214.ItemComposition_get(var3).isStackable == 1 ? 1 : 0; // L: 4063
				return 1; // L: 4064
			} else {
				ItemComposition var4;
				if (var0 == ScriptOpcodes.OC_CERT) { // L: 4066
					var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 4067
					var4 = class214.ItemComposition_get(var3); // L: 4068
					if (var4.noteTemplate == -1 && var4.note >= 0) { // L: 4069
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3; // L: 4070
					}

					return 1; // L: 4071
				} else if (var0 == ScriptOpcodes.OC_UNCERT) { // L: 4073
					var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 4074
					var4 = class214.ItemComposition_get(var3); // L: 4075
					if (var4.noteTemplate >= 0 && var4.note >= 0) { // L: 4076
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3; // L: 4077
					}

					return 1; // L: 4078
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) { // L: 4080
					var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 4081
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = class214.ItemComposition_get(var3).isMembersOnly ? 1 : 0; // L: 4082
					return 1; // L: 4083
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) { // L: 4085
					var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 4086
					var4 = class214.ItemComposition_get(var3); // L: 4087
					if (var4.placeholderTemplate == -1 && var4.placeholder >= 0) { // L: 4088
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3; // L: 4089
					}

					return 1; // L: 4090
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) { // L: 4092
					var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 4093
					var4 = class214.ItemComposition_get(var3); // L: 4094
					if (var4.placeholderTemplate >= 0 && var4.placeholder >= 0) { // L: 4095
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3; // L: 4096
					}

					return 1; // L: 4097
				} else if (var0 == ScriptOpcodes.OC_FIND) { // L: 4099
					String var7 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize]; // L: 4100
					var6 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 4101
					UrlRequest.findItemDefinitions(var7, var6 == 1); // L: 4102
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = BuddyRankComparator.foundItemIdCount; // L: 4103
					return 1; // L: 4104
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) { // L: 4106
					if (var0 == ScriptOpcodes.OC_FINDRESET) { // L: 4111
						ApproximateRouteStrategy.foundItemIndex = 0; // L: 4112
						return 1; // L: 4113
					} else if (var0 == 4213) { // L: 4115
						var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 4116
						var6 = class214.ItemComposition_get(var3).getShiftClickIndex(); // L: 4117
						if (var6 == -1) { // L: 4118
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var6; // L: 4119
						} else {
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var6 + 1; // L: 4122
						}

						return 1; // L: 4124
					} else if (var0 == 4214) { // L: 4126
						var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 4127
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = class214.ItemComposition_get(var3).maleModel; // L: 4128
						return 1; // L: 4129
					} else if (var0 == 4215) { // L: 4131
						var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 4132
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = class214.ItemComposition_get(var3).maleModel1; // L: 4133
						return 1; // L: 4134
					} else if (var0 == 4216) { // L: 4136
						var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 4137
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = class214.ItemComposition_get(var3).maleModel2; // L: 4138
						return 1; // L: 4139
					} else if (var0 == 4217) { // L: 4141
						var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 4142
						var4 = class214.ItemComposition_get(var3); // L: 4143
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var4.field2181; // L: 4144
						return 1; // L: 4145
					} else {
						return 2; // L: 4147
					}
				} else {
					if (MusicPatchNode.foundItemIds != null && ApproximateRouteStrategy.foundItemIndex < BuddyRankComparator.foundItemIdCount) { // L: 4107
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = MusicPatchNode.foundItemIds[++ApproximateRouteStrategy.foundItemIndex - 1] & '\uffff'; // L: 4108
					} else {
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = -1;
					}

					return 1; // L: 4109
				}
			}
		}
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-16844"
	)
	static final void method1980() {
		class72.method2136(); // L: 2903
		class184.FloorUnderlayDefinition_cached.clear(); // L: 2905
		InvDefinition.method3530(); // L: 2907
		KitDefinition.method3631(); // L: 2908
		class517.DBTableType_cache.clear(); // L: 2910
		EnumComposition.EnumDefinition_cached.clear(); // L: 2913
		class138.method3158(); // L: 2915
		class172.method3534(); // L: 2916
		AttackOption.method2751(); // L: 2917
		Client.method1848(); // L: 2918
		class145.method3247(); // L: 2919
		HitSplatDefinition.method3858(); // L: 2920
		InvDefinition.InvDefinition_cached.clear(); // L: 2922
		class267.method5275(); // L: 2924
		WorldMapElement.Ignored_cached.clear(); // L: 2926
		class185.HitSplatDefinition_cachedSprites.clear(); // L: 2929
		InterfaceParent.method2352(); // L: 2931
		ItemComposition.ItemComposition_cached.clear(); // L: 2933
		ItemComposition.ItemComposition_cachedModels.clear(); // L: 2934
		ItemComposition.ItemComposition_cachedSprites.clear(); // L: 2935
		ModeWhere.method7211(); // L: 2937
		SequenceDefinition.SequenceDefinition_cached.clear(); // L: 2939
		SequenceDefinition.SequenceDefinition_cachedFrames.clear(); // L: 2940
		SequenceDefinition.SequenceDefinition_cachedModel.clear(); // L: 2941
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear(); // L: 2944
		SpotAnimationDefinition.field1994.clear(); // L: 2945
		WorldMapElement.method3589(); // L: 2947
		class252.method4944(); // L: 2948
		class399.Widget_cachedModels.method9078(); // L: 2949
		Players.Widget_cachedFonts.method9078(); // L: 2950
		class189.Widget_cachedSpriteMasks.clear(); // L: 2952
		class191.field1979.clear(); // L: 2955
		VarcInt.VarcInt_cached.clear(); // L: 2958
		VarcInt.method3601(); // L: 2960
		class171.field1802.clear(); // L: 2962
		class208.method4152(); // L: 2964
		class197.archive4.clear(); // L: 2966
		LoginPacket.method5936(); // L: 2968
		class195.archive6.clear(); // L: 2970
		Client.Widget_cachedModels.clear(); // L: 2972
		Client.Widget_cachedFonts.clear(); // L: 2973
		RouteStrategy.method4389(); // L: 2974
		HealthBarDefinition.field1877.method6288(); // L: 2975
		((TextureProvider)Rasterizer3D.field2772.Rasterizer3D_textureLoader).clear(); // L: 2976
		Canvas.method329(); // L: 2977
		Client.field779.clearFiles(); // L: 2978
		UserComparator7.field1441.method7027(); // L: 2979
		class145.field1643.method7027(); // L: 2980
		WorldMapDecorationType.field3867.method7027(); // L: 2981
		class47.archive12.method7027(); // L: 2982
		class344.archive2.method7027(); // L: 2983
		class267.field2778.method7027(); // L: 2984
		SoundSystem.field298.method7027(); // L: 2985
		VarbitComposition.archive13.method7027(); // L: 2986
		class313.field3398.method7027(); // L: 2987
		WorldMapAreaData.field2641.method7027(); // L: 2988
		Language.field4412.method7027(); // L: 2989
		PcmPlayer.field281.method7027(); // L: 2990
		WorldMapSection0.field2532.method7027(); // L: 2991
		class514.field5059.method7027(); // L: 2992
		class19.field92.method7027(); // L: 2993
		class7.field25.method7027(); // L: 2994
		GrandExchangeOfferOwnWorldComparator.field481.method7027(); // L: 2995
		Canvas.field114.method7027(); // L: 2996
		StructComposition.field2041.method7027(); // L: 2997
		WorldMapData_0.field2426.method7027(); // L: 2998
		BuddyRankComparator.field1460.method7027(); // L: 2999
		SpotAnimationDefinition.field2007.method7027(); // L: 3000
	} // L: 3001
}
