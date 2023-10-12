import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ni")
@Implements("PlayerComposition")
public class PlayerComposition {
	@ObfuscatedName("ag")
	public static short[] field3615;
	@ObfuscatedName("as")
	@Export("equipmentIndices")
	static final int[] equipmentIndices;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("PlayerComposition_cachedModels")
	public static EvictingDualNodeHashTable PlayerComposition_cachedModels;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	@Export("archive10")
	public static class438 archive10;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1151126615
	)
	public static int field3626;
	@ObfuscatedName("ac")
	int[] field3619;
	@ObfuscatedName("al")
	@Export("equipment")
	int[] equipment;
	@ObfuscatedName("ak")
	@Export("bodyColors")
	int[] bodyColors;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -773310009
	)
	public int field3614;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 539928443
	)
	public int field3611;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 901502003
	)
	@Export("npcTransformId")
	public int npcTransformId;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		longValue = 2461738339330136607L
	)
	@Export("hash")
	long hash;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = -907075381640109889L
	)
	long field3618;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "[Lhy;"
	)
	class185[] field3613;
	@ObfuscatedName("av")
	boolean field3620;

	static {
		equipmentIndices = new int[]{class223.field2347.field2342, class223.field2348.field2342, class223.field2346.field2342, class223.field2354.field2342, class223.field2351.field2342, class223.field2349.field2342, class223.field2352.field2342}; // L: 32
		PlayerComposition_cachedModels = new EvictingDualNodeHashTable(260); // L: 35
		archive10 = new class438(16, class436.field4651); // L: 36
		field3626 = 0; // L: 37
	}

	public PlayerComposition() {
		this.field3614 = -1;
		this.field3611 = 0;
		this.field3620 = false;
	} // L: 39

	@ObfuscatedSignature(
		descriptor = "(Lni;)V"
	)
	PlayerComposition(PlayerComposition var1) {
		this.field3614 = -1; // L: 21
		this.field3611 = 0; // L: 22
		this.field3620 = false; // L: 27
		int[] var2 = Arrays.copyOf(var1.equipment, var1.equipment.length); // L: 42
		int[] var3 = Arrays.copyOf(var1.field3619, var1.field3619.length); // L: 43
		class185[] var4 = (class185[])(var1.field3613 != null ? (class185[])Arrays.copyOf(var1.field3613, var1.field3613.length) : null); // L: 44
		int[] var5 = Arrays.copyOf(var1.bodyColors, var1.bodyColors.length); // L: 45
		this.method6266(var3, var2, var4, false, var5, var1.field3611, var1.npcTransformId, var1.field3614); // L: 46
	} // L: 47

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([I[I[Lhy;Z[IIIII)V",
		garbageValue = "-106574907"
	)
	public void method6266(int[] var1, int[] var2, class185[] var3, boolean var4, int[] var5, int var6, int var7, int var8) {
		this.field3613 = var3; // L: 50
		this.field3620 = var4; // L: 51
		this.field3614 = var8; // L: 52
		this.method6267(var1, var2, var5, var6, var7); // L: 53
	} // L: 54

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([I[I[IIIB)V",
		garbageValue = "108"
	)
	public void method6267(int[] var1, int[] var2, int[] var3, int var4, int var5) {
		if (var1 == null) { // L: 57
			var1 = this.method6268(var4); // L: 58
		}

		if (var2 == null) { // L: 60
			var2 = this.method6268(var4); // L: 61
		}

		this.field3619 = var1; // L: 63
		this.equipment = var2; // L: 64
		this.bodyColors = var3; // L: 65
		this.field3611 = var4; // L: 66
		this.npcTransformId = var5; // L: 67
		this.setHash(); // L: 68
	} // L: 69

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)[I",
		garbageValue = "1"
	)
	int[] method6268(int var1) {
		int[] var2 = new int[12]; // L: 72

		for (int var3 = 0; var3 < 7; ++var3) { // L: 73
			for (int var4 = 0; var4 < class403.field4489; ++var4) { // L: 75
				KitDefinition var5 = class73.KitDefinition_get(var4); // L: 76
				if (var5 != null && !var5.nonSelectable && var3 + (var1 == 1 ? 7 : 0) == var5.bodypartID) { // L: 77
					var2[equipmentIndices[var3]] = var4 + 256; // L: 78
					break; // L: 79
				}
			}
		}

		return var2; // L: 84
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-151201208"
	)
	@Export("changeAppearance")
	public void changeAppearance(int var1, boolean var2) {
		int var3 = this.equipment[equipmentIndices[var1]]; // L: 88
		if (var3 != 0) { // L: 89
			var3 -= 256; // L: 90

			KitDefinition var4;
			do {
				if (!var2) { // L: 92
					--var3; // L: 93
					if (var3 < 0) {
						var3 = class403.field4489 - 1; // L: 94
					}
				} else {
					++var3; // L: 97
					if (var3 >= class403.field4489) { // L: 98
						var3 = 0;
					}
				}

				var4 = class73.KitDefinition_get(var3); // L: 100
			} while(var4 == null || var4.nonSelectable || (this.field3611 == 1 ? 7 : 0) + var1 != var4.bodypartID); // L: 101

			this.equipment[equipmentIndices[var1]] = var3 + 256; // L: 103
			this.setHash(); // L: 104
		}
	} // L: 105

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "1880856093"
	)
	public void method6270(int var1, boolean var2) {
		int var3 = this.bodyColors[var1]; // L: 108
		boolean var4;
		if (!var2) { // L: 109
			do {
				--var3; // L: 111
				if (var3 < 0) { // L: 112
					var3 = class104.field1342[var1].length - 1; // L: 113
				}

				if (var1 == 4 && var3 >= 8) { // L: 117
					var4 = false; // L: 118
				} else {
					var4 = true; // L: 121
				}
			} while(!var4); // L: 123
		} else {
			do {
				++var3; // L: 128
				if (var3 >= class104.field1342[var1].length) { // L: 129
					var3 = 0;
				}

				if (var1 == 4 && var3 >= 8) { // L: 132
					var4 = false; // L: 133
				} else {
					var4 = true; // L: 136
				}
			} while(!var4); // L: 138
		}

		this.bodyColors[var1] = var3; // L: 141
		this.setHash(); // L: 142
	} // L: 143

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-554597133"
	)
	public void method6265(int var1) {
		if (this.field3611 != var1) { // L: 146
			this.method6267((int[])null, (int[])null, this.bodyColors, var1, -1); // L: 147
		}
	} // L: 148

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lul;B)V",
		garbageValue = "28"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(this.field3611); // L: 151

		int var2;
		for (var2 = 0; var2 < 7; ++var2) { // L: 152
			int var3 = this.equipment[equipmentIndices[var2]]; // L: 153
			if (var3 == 0) {
				var1.writeByte(-1); // L: 154
			} else {
				var1.writeByte(var3 - 256); // L: 155
			}
		}

		for (var2 = 0; var2 < 5; ++var2) { // L: 157
			var1.writeByte(this.bodyColors[var2]);
		}

	} // L: 158

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "89"
	)
	@Export("setHash")
	void setHash() {
		long var1 = this.hash; // L: 161
		int var3 = this.equipment[5]; // L: 162
		int var4 = this.equipment[9]; // L: 163
		this.equipment[5] = var4; // L: 164
		this.equipment[9] = var3; // L: 165
		this.hash = 0L; // L: 166

		int var5;
		for (var5 = 0; var5 < 12; ++var5) { // L: 167
			this.hash <<= 4; // L: 168
			if (this.equipment[var5] >= 256) { // L: 169
				this.hash += (long)(this.equipment[var5] - 256);
			}
		}

		if (this.equipment[0] >= 256) { // L: 171
			this.hash += (long)(this.equipment[0] - 256 >> 4);
		}

		if (this.equipment[1] >= 256) { // L: 172
			this.hash += (long)(this.equipment[1] - 256 >> 8);
		}

		for (var5 = 0; var5 < 5; ++var5) { // L: 173
			this.hash <<= 3; // L: 174
			this.hash += (long)this.bodyColors[var5]; // L: 175
		}

		this.hash <<= 1; // L: 177
		this.hash += 539928443L * (long)(this.field3611 * -746905677); // L: 178
		this.equipment[5] = var3; // L: 179
		this.equipment[9] = var4; // L: 180
		if (var1 != 0L && var1 != this.hash || this.field3620) { // L: 181
			PlayerComposition_cachedModels.remove(var1);
		}

	} // L: 182

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lif;ILif;II)Ljn;",
		garbageValue = "745471626"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.npcTransformId != -1) { // L: 185
			return class190.getNpcDefinition(this.npcTransformId).method3783(var1, var2, var3, var4, (class204)null); // L: 186
		} else {
			long var5 = this.hash; // L: 188
			int[] var7 = this.equipment; // L: 189
			if (var1 != null && (var1.shield >= 0 || var1.weapon >= 0)) { // L: 190
				var7 = new int[12]; // L: 191

				for (int var8 = 0; var8 < 12; ++var8) { // L: 192
					var7[var8] = this.equipment[var8];
				}

				if (var1.shield >= 0) { // L: 193
					var5 += (long)(var1.shield - this.equipment[5] << 40); // L: 194
					var7[5] = var1.shield; // L: 195
				}

				if (var1.weapon >= 0) { // L: 197
					var5 += (long)(var1.weapon - this.equipment[3] << 48); // L: 198
					var7[3] = var1.weapon; // L: 199
				}
			}

			Model var18 = (Model)PlayerComposition_cachedModels.get(var5); // L: 202
			if (var18 == null) { // L: 203
				boolean var9 = false; // L: 204

				int var11;
				for (int var10 = 0; var10 < 12; ++var10) { // L: 205
					var11 = var7[var10]; // L: 206
					if (var11 >= 256 && var11 < 512 && !class73.KitDefinition_get(var11 - 256).ready()) { // L: 207 208
						var9 = true;
					}

					if (var11 >= 512 && !class214.ItemComposition_get(var11 - 512).method4059(this.field3611)) { // L: 210 211
						var9 = true;
					}
				}

				if (var9) { // L: 214
					if (this.field3618 != -1L) { // L: 215
						var18 = (Model)PlayerComposition_cachedModels.get(this.field3618);
					}

					if (var18 == null) { // L: 216
						return null;
					}
				}

				if (var18 == null) { // L: 218
					ModelData[] var19 = new ModelData[12]; // L: 219
					var11 = 0; // L: 220

					int var13;
					for (int var12 = 0; var12 < 12; ++var12) { // L: 221
						var13 = var7[var12]; // L: 222
						if (var13 >= 256 && var13 < 512) { // L: 223
							ModelData var14 = class73.KitDefinition_get(var13 - 256).getModelData(); // L: 224
							if (var14 != null) { // L: 225
								var19[var11++] = var14;
							}
						}

						if (var13 >= 512) { // L: 227
							ItemComposition var22 = class214.ItemComposition_get(var13 - 512); // L: 228
							ModelData var15 = var22.method4128(this.field3611); // L: 229
							if (var15 != null) { // L: 230
								if (this.field3613 != null) { // L: 231
									class185 var16 = this.field3613[var12]; // L: 232
									if (var16 != null) { // L: 233
										int var17;
										if (var16.field1894 != null && var22.recolorFrom != null && var22.recolorTo.length == var16.field1894.length) { // L: 234
											for (var17 = 0; var17 < var22.recolorFrom.length; ++var17) { // L: 235
												var15.recolor(var22.recolorTo[var17], var16.field1894[var17]); // L: 236
											}
										}

										if (var16.field1893 != null && var22.retextureFrom != null && var22.retextureTo.length == var16.field1893.length) { // L: 239
											for (var17 = 0; var17 < var22.retextureFrom.length; ++var17) { // L: 240
												var15.retexture(var22.retextureTo[var17], var16.field1893[var17]); // L: 241
											}
										}
									}
								}

								var19[var11++] = var15; // L: 246
							}
						}
					}

					ModelData var20 = new ModelData(var19, var11); // L: 250

					for (var13 = 0; var13 < 5; ++var13) { // L: 251
						if (this.bodyColors[var13] < class104.field1342[var13].length) { // L: 252
							var20.recolor(field3615[var13], class104.field1342[var13][this.bodyColors[var13]]);
						}

						if (this.bodyColors[var13] < class33.field187[var13].length) { // L: 253
							var20.recolor(Coord.field3572[var13], class33.field187[var13][this.bodyColors[var13]]);
						}
					}

					var18 = var20.toModel(64, 850, -30, -50, -30); // L: 255
					PlayerComposition_cachedModels.put(var18, var5); // L: 256
					this.field3618 = var5; // L: 257
				}
			}

			Model var21;
			if (var1 == null && var3 == null) { // L: 261
				var21 = var18.toSharedSequenceModel(true);
			} else if (var1 != null && var3 != null) { // L: 262
				var21 = var1.applyTransformations(var18, var2, var3, var4);
			} else if (var1 != null) { // L: 263
				var21 = var1.transformActorModel(var18, var2);
			} else {
				var21 = var3.transformActorModel(var18, var4); // L: 264
			}

			return var21; // L: 265
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Ljw;",
		garbageValue = "-578216920"
	)
	@Export("getModelData")
	ModelData getModelData() {
		if (this.npcTransformId != -1) { // L: 269
			return class190.getNpcDefinition(this.npcTransformId).method3784((class204)null); // L: 270
		} else {
			boolean var1 = false; // L: 272

			int var3;
			for (int var2 = 0; var2 < 12; ++var2) { // L: 273
				var3 = this.equipment[var2]; // L: 274
				if (var3 >= 256 && var3 < 512 && !class73.KitDefinition_get(var3 - 256).method3687()) { // L: 275 276
					var1 = true;
				}

				if (var3 >= 512 && !class214.ItemComposition_get(var3 - 512).method4061(this.field3611)) { // L: 278 279
					var1 = true;
				}
			}

			if (var1) { // L: 282
				return null;
			} else {
				ModelData[] var7 = new ModelData[12]; // L: 283
				var3 = 0; // L: 284

				int var5;
				for (int var4 = 0; var4 < 12; ++var4) { // L: 285
					var5 = this.equipment[var4]; // L: 286
					ModelData var6;
					if (var5 >= 256 && var5 < 512) { // L: 287
						var6 = class73.KitDefinition_get(var5 - 256).getKitDefinitionModels(); // L: 288
						if (var6 != null) { // L: 289
							var7[var3++] = var6;
						}
					}

					if (var5 >= 512) { // L: 291
						var6 = class214.ItemComposition_get(var5 - 512).method4062(this.field3611); // L: 292
						if (var6 != null) { // L: 293
							var7[var3++] = var6;
						}
					}
				}

				ModelData var8 = new ModelData(var7, var3); // L: 296

				for (var5 = 0; var5 < 5; ++var5) { // L: 297
					if (this.bodyColors[var5] < class104.field1342[var5].length) { // L: 298
						var8.recolor(field3615[var5], class104.field1342[var5][this.bodyColors[var5]]);
					}

					if (this.bodyColors[var5] < class33.field187[var5].length) { // L: 299
						var8.recolor(Coord.field3572[var5], class33.field187[var5][this.bodyColors[var5]]);
					}
				}

				return var8; // L: 301
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1292206549"
	)
	@Export("getChatHeadId")
	public int getChatHeadId() {
		long var1 = this.hash; // L: 305
		if (this.npcTransformId != -1) { // L: 306
			var1 = -65536L | (long)this.npcTransformId; // L: 307
		}

		Integer var3 = (Integer)archive10.method7937(var1); // L: 309
		if (var3 == null) { // L: 310
			var3 = ++field3626 - 1; // L: 311
			archive10.method7928(var1, var3); // L: 312
			field3626 %= 65535; // L: 313
		}

		return var3; // L: 315
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	void method6291() {
		this.method6267(this.field3619, this.equipment, this.bodyColors, this.field3611, this.npcTransformId); // L: 319
	} // L: 320

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)I",
		garbageValue = "20"
	)
	static final int method6301(int var0, int var1, int var2, int var3) {
		return var0 * var2 + var3 * var1 >> 16; // L: 9
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZB)I",
		garbageValue = "63"
	)
	static int method6300(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) { // L: 4358
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class178.getWindowedMode(); // L: 4359
			return 1; // L: 4360
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) { // L: 4362
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4363
				if (var3 == 1 || var3 == 2) { // L: 4364
					NPCComposition.setWindowedMode(var3);
				}

				return 1; // L: 4365
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) { // L: 4367
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class91.clientPreferences.method2525(); // L: 4368
				return 1; // L: 4369
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) { // L: 4371
				if (var0 == 5310) { // L: 4378
					--Interpreter.Interpreter_intStackSize; // L: 4379
					return 1; // L: 4380
				} else {
					return 2; // L: 4382
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4372
				if (var3 == 1 || var3 == 2) { // L: 4373
					class91.clientPreferences.method2524(var3); // L: 4374
				}

				return 1; // L: 4376
			}
		}
	}
}
