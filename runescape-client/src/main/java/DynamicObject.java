import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bh")
@Implements("DynamicObject")
public class DynamicObject extends Renderable {
	@ObfuscatedName("sa")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	@Export("guestClanSettings")
	static ClanSettings guestClanSettings;
	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("archive9")
	static Archive archive9;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1929252097
	)
	@Export("id")
	int id;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -714341755
	)
	@Export("type")
	int type;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1365714821
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -306804147
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 752709151
	)
	@Export("x")
	int x;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 867645
	)
	@Export("y")
	int y;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lge;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -2093698753
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -78660913
	)
	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedSignature(
		descriptor = "(IIIIIIIZLhd;)V"
	)
	DynamicObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Renderable var9) {
		this.id = var1; // L: 20
		this.type = var2; // L: 21
		this.orientation = var3; // L: 22
		this.plane = var4; // L: 23
		this.x = var5; // L: 24
		this.y = var6; // L: 25
		if (var7 != -1) { // L: 26
			this.sequenceDefinition = class85.SequenceDefinition_get(var7); // L: 27
			this.frame = 0; // L: 28
			this.cycleStart = Client.cycle - 1; // L: 29
			if (this.sequenceDefinition.field2308 == 0 && var9 != null && var9 instanceof DynamicObject) { // L: 30
				DynamicObject var10 = (DynamicObject)var9; // L: 31
				if (this.sequenceDefinition == var10.sequenceDefinition) { // L: 32
					this.frame = var10.frame; // L: 33
					this.cycleStart = var10.cycleStart; // L: 34
					return; // L: 35
				}
			}

			if (var8 && this.sequenceDefinition.frameCount != -1) { // L: 38
				if (!this.sequenceDefinition.isCachedModelIdSet()) { // L: 39
					this.frame = (int)(Math.random() * (double)this.sequenceDefinition.frameIds.length); // L: 40
					this.cycleStart -= (int)(Math.random() * (double)this.sequenceDefinition.frameLengths[this.frame]); // L: 41
				} else {
					this.frame = (int)(Math.random() * (double)this.sequenceDefinition.method4055()); // L: 44
				}
			}
		}

	} // L: 48

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Lhs;",
		garbageValue = "922199662"
	)
	@Export("getModel")
	protected final Model getModel() {
		int var2;
		if (this.sequenceDefinition != null) { // L: 51
			int var1 = Client.cycle - this.cycleStart; // L: 52
			if (var1 > 100 && this.sequenceDefinition.frameCount > 0) { // L: 53
				var1 = 100;
			}

			if (this.sequenceDefinition.isCachedModelIdSet()) { // L: 54
				var2 = this.sequenceDefinition.method4055(); // L: 68
				this.frame += var1; // L: 69
				var1 = 0; // L: 70
				if (this.frame >= var2) { // L: 71
					this.frame = var2 - this.sequenceDefinition.frameCount; // L: 72
					if (this.frame < 0 || this.frame > var2) { // L: 73
						this.sequenceDefinition = null;
					}
				}
			} else {
				label78: {
					do {
						do {
							if (var1 <= this.sequenceDefinition.frameLengths[this.frame]) { // L: 55
								break label78;
							}

							var1 -= this.sequenceDefinition.frameLengths[this.frame]; // L: 56
							++this.frame; // L: 57
						} while(this.frame < this.sequenceDefinition.frameIds.length); // L: 58

						this.frame -= this.sequenceDefinition.frameCount; // L: 59
					} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length); // L: 60

					this.sequenceDefinition = null; // L: 61
				}
			}

			this.cycleStart = Client.cycle - var1; // L: 78
		}

		ObjectComposition var12 = class463.getObjectDefinition(this.id); // L: 80
		if (var12.transforms != null) {
			var12 = var12.transform(); // L: 81
		}

		if (var12 == null) { // L: 82
			return null;
		} else {
			int var3;
			if (this.orientation != 1 && this.orientation != 3) { // L: 85
				var2 = var12.sizeX; // L: 90
				var3 = var12.sizeY; // L: 91
			} else {
				var2 = var12.sizeY; // L: 86
				var3 = var12.sizeX; // L: 87
			}

			int var4 = (var2 >> 1) + this.x; // L: 93
			int var5 = (var2 + 1 >> 1) + this.x; // L: 94
			int var6 = (var3 >> 1) + this.y; // L: 95
			int var7 = (var3 + 1 >> 1) + this.y; // L: 96
			int[][] var8 = Tiles.Tiles_heights[this.plane]; // L: 97
			int var9 = var8[var4][var6] + var8[var5][var6] + var8[var4][var7] + var8[var5][var7] >> 2; // L: 98
			int var10 = (this.x << 7) + (var2 << 6); // L: 99
			int var11 = (this.y << 7) + (var3 << 6); // L: 100
			return var12.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.sequenceDefinition, this.frame); // L: 101
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lda;FI)F",
		garbageValue = "1597261635"
	)
	static float method2202(class125 var0, float var1) {
		if (var0 == null) { // L: 172
			return 0.0F; // L: 173
		} else {
			float var2;
			if (var1 == var0.field1520) { // L: 176
				var2 = 0.0F; // L: 177
			} else if (var1 == var0.field1527) { // L: 179
				var2 = 1.0F; // L: 180
			} else {
				var2 = (var1 - var0.field1520) / (var0.field1527 - var0.field1520); // L: 183
			}

			float var3;
			if (var0.field1525) { // L: 186
				var3 = var2; // L: 187
			} else {
				class121.field1477[3] = var0.field1531; // L: 190
				class121.field1477[2] = var0.field1543; // L: 191
				class121.field1477[1] = var0.field1529; // L: 192
				class121.field1477[0] = var0.field1528 - var2; // L: 193
				class121.field1485[0] = 0.0F; // L: 194
				class121.field1485[1] = 0.0F; // L: 195
				class121.field1485[2] = 0.0F; // L: 196
				class121.field1485[3] = 0.0F; // L: 197
				class121.field1485[4] = 0.0F; // L: 198
				int var4 = SpriteMask.method5838(class121.field1477, 3, 0.0F, true, 1.0F, true, class121.field1485); // L: 199
				if (var4 == 1) { // L: 200
					var3 = class121.field1485[0]; // L: 201
				} else {
					var3 = 0.0F; // L: 204
				}
			}

			return var0.field1532 + var3 * (var0.field1537 + (var0.field1535 * var3 + var0.field1534) * var3); // L: 207
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1846374701"
	)
	public static boolean method2208() {
		return class290.musicPlayerStatus != 0 ? true : class290.midiPcmStream.isReady(); // L: 74 75
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZI)I",
		garbageValue = "-338772616"
	)
	static int method2207(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) { // L: 3078
			if (guestClanSettings != null) { // L: 3079
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 1; // L: 3080
				WorldMapArea.field2851 = guestClanSettings; // L: 3081
			} else {
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 3083
			}

			return 1; // L: 3084
		} else {
			int var3;
			if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) { // L: 3086
				var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 3087
				if (Client.currentClanSettings[var3] != null) { // L: 3088
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 1; // L: 3089
					WorldMapArea.field2851 = Client.currentClanSettings[var3]; // L: 3090
				} else {
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 3092
				}

				return 1; // L: 3093
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) { // L: 3095
				Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = WorldMapArea.field2851.name; // L: 3096
				return 1; // L: 3097
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) { // L: 3099
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapArea.field2851.allowGuests ? 1 : 0; // L: 3100
				return 1; // L: 3101
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) { // L: 3103
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapArea.field2851.field1722; // L: 3104
				return 1; // L: 3105
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) { // L: 3107
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapArea.field2851.field1740; // L: 3108
				return 1; // L: 3109
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) { // L: 3111
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapArea.field2851.field1736; // L: 3112
				return 1; // L: 3113
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) { // L: 3115
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapArea.field2851.field1725; // L: 3116
				return 1; // L: 3117
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) { // L: 3119
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapArea.field2851.memberCount; // L: 3120
				return 1; // L: 3121
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) { // L: 3123
				var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 3124
				Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = WorldMapArea.field2851.memberNames[var3]; // L: 3125
				return 1; // L: 3126
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) { // L: 3128
				var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 3129
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapArea.field2851.memberRanks[var3]; // L: 3130
				return 1; // L: 3131
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) { // L: 3133
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapArea.field2851.bannedMemberCount; // L: 3134
				return 1; // L: 3135
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) { // L: 3137
				var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 3138
				Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = WorldMapArea.field2851.bannedMemberNames[var3]; // L: 3139
				return 1; // L: 3140
			} else {
				int var5;
				int var6;
				if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) { // L: 3142
					class302.Interpreter_intStackSize -= 3; // L: 3143
					var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 3144
					var6 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 3145
					var5 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 2]; // L: 3146
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapArea.field2851.method3227(var3, var6, var5); // L: 3147
					return 1; // L: 3148
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) { // L: 3150
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapArea.field2851.currentOwner; // L: 3151
					return 1; // L: 3152
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) { // L: 3154
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapArea.field2851.field1734; // L: 3155
					return 1; // L: 3156
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) { // L: 3158
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapArea.field2851.method3281(Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize]); // L: 3159
					return 1; // L: 3160
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) { // L: 3162
					Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize - 1] = WorldMapArea.field2851.getSortedMembers()[Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize - 1]]; // L: 3163
					return 1; // L: 3164
				} else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) { // L: 3166
					class302.Interpreter_intStackSize -= 2; // L: 3167
					var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 3168
					var6 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 3169
					Player.method2365(var6, var3); // L: 3170
					return 1; // L: 3171
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) { // L: 3173
					var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 3174
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapArea.field2851.field1731[var3]; // L: 3175
					return 1; // L: 3176
				} else {
					if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) { // L: 3178
						class302.Interpreter_intStackSize -= 3; // L: 3179
						var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 3180
						boolean var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1] == 1; // L: 3181
						var5 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 2]; // L: 3182
						UserComparator7.method2927(var5, var3, var4); // L: 3183
					}

					if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) { // L: 3185
						var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 3186
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapArea.field2851.field1732[var3] ? 1 : 0; // L: 3187
						return 1; // L: 3188
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) { // L: 3190
						if (class482.guestClanChannel != null) { // L: 3191
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 1; // L: 3192
							ScriptFrame.field471 = class482.guestClanChannel; // L: 3193
						} else {
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 3195
						}

						return 1; // L: 3196
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) { // L: 3198
						var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 3199
						if (Client.currentClanChannels[var3] != null) { // L: 3200
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 1; // L: 3201
							ScriptFrame.field471 = Client.currentClanChannels[var3]; // L: 3202
							MusicPatch.field3407 = var3; // L: 3203
						} else {
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 3205
						}

						return 1; // L: 3206
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) { // L: 3208
						Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = ScriptFrame.field471.name; // L: 3209
						return 1; // L: 3210
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) { // L: 3212
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = ScriptFrame.field471.field1795; // L: 3213
						return 1; // L: 3214
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) { // L: 3216
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = ScriptFrame.field471.field1794; // L: 3217
						return 1; // L: 3218
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) { // L: 3220
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = ScriptFrame.field471.method3359(); // L: 3221
						return 1; // L: 3222
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) { // L: 3224
						var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 3225
						Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = ((ClanChannelMember)ScriptFrame.field471.members.get(var3)).username.getName(); // L: 3226
						return 1; // L: 3227
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) { // L: 3229
						var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 3230
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = ((ClanChannelMember)ScriptFrame.field471.members.get(var3)).rank; // L: 3231
						return 1; // L: 3232
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) { // L: 3234
						var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 3235
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = ((ClanChannelMember)ScriptFrame.field471.members.get(var3)).world; // L: 3236
						return 1; // L: 3237
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) { // L: 3239
						var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 3240
						AbstractByteArrayCopier.method6400(MusicPatch.field3407, var3); // L: 3241
						return 1; // L: 3242
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) { // L: 3244
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = ScriptFrame.field471.method3357(Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize]); // L: 3245
						return 1; // L: 3246
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) { // L: 3248
						Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize - 1] = ScriptFrame.field471.getSortedMembers()[Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize - 1]]; // L: 3249
						return 1; // L: 3250
					} else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) { // L: 3252
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = class388.field4512 != null ? 1 : 0; // L: 3253
						return 1; // L: 3254
					} else {
						return 2; // L: 3256
					}
				}
			}
		}
	}
}
