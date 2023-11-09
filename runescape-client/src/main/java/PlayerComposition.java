import java.util.Arrays;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("mm")
@Implements("PlayerComposition")
public class PlayerComposition {
	@ObfuscatedName("ag")
	@Export("equipmentIndices")
	static final int[] equipmentIndices;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("PlayerComposition_cachedModels")
	static EvictingDualNodeHashTable PlayerComposition_cachedModels;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	static class423 field3571;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1054756769
	)
	static int field3570;
	@ObfuscatedName("ai")
	int[] field3573;
	@ObfuscatedName("aj")
	@Export("equipment")
	int[] equipment;
	@ObfuscatedName("ac")
	@Export("bodyColors")
	int[] bodyColors;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -911182701
	)
	public int field3562;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -265537575
	)
	public int field3563;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -527847529
	)
	@Export("npcTransformId")
	public int npcTransformId;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		longValue = -6196952220641480989L
	)
	@Export("hash")
	long hash;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		longValue = -4284637854944121929L
	)
	long field3566;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Lhq;"
	)
	class184[] field3567;
	@ObfuscatedName("az")
	boolean field3568;

	static {
		equipmentIndices = new int[]{class209.field2310.field2316, class209.field2313.field2316, class209.field2311.field2316, class209.field2308.field2316, class209.field2302.field2316, class209.field2303.field2316, class209.field2312.field2316}; // L: 32
		PlayerComposition_cachedModels = new EvictingDualNodeHashTable(260); // L: 35
		field3571 = new class423(16, class421.field4591); // L: 36
		field3570 = 0; // L: 37
	}

	public PlayerComposition() {
		this.field3562 = -1;
		this.field3563 = 0;
		this.field3568 = false;
	} // L: 39

	@ObfuscatedSignature(
		descriptor = "(Lmm;)V"
	)
	PlayerComposition(PlayerComposition var1) {
		this.field3562 = -1; // L: 21
		this.field3563 = 0; // L: 22
		this.field3568 = false; // L: 27
		int[] var2 = Arrays.copyOf(var1.equipment, var1.equipment.length); // L: 42
		int[] var3 = Arrays.copyOf(var1.field3573, var1.field3573.length); // L: 43
		class184[] var4 = (class184[])(var1.field3567 != null ? (class184[])Arrays.copyOf(var1.field3567, var1.field3567.length) : null); // L: 44
		int[] var5 = Arrays.copyOf(var1.bodyColors, var1.bodyColors.length); // L: 45
		this.method6127(var3, var2, var4, false, var5, var1.field3563, var1.npcTransformId, var1.field3562); // L: 46
	} // L: 47

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([I[I[Lhq;Z[IIIII)V",
		garbageValue = "-534734960"
	)
	public void method6127(int[] var1, int[] var2, class184[] var3, boolean var4, int[] var5, int var6, int var7, int var8) {
		this.field3567 = var3; // L: 50
		this.field3568 = var4; // L: 51
		this.field3562 = var8; // L: 52
		this.method6129(var1, var2, var5, var6, var7); // L: 53
	} // L: 54

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([I[I[IIII)V",
		garbageValue = "-1681031997"
	)
	public void method6129(int[] var1, int[] var2, int[] var3, int var4, int var5) {
		if (var1 == null) { // L: 57
			var1 = this.method6130(var4); // L: 58
		}

		if (var2 == null) { // L: 60
			var2 = this.method6130(var4); // L: 61
		}

		this.field3573 = var1; // L: 63
		this.equipment = var2; // L: 64
		this.bodyColors = var3; // L: 65
		this.field3563 = var4; // L: 66
		this.npcTransformId = var5; // L: 67
		this.setHash(); // L: 68
	} // L: 69

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "-5399096"
	)
	int[] method6130(int var1) {
		int[] var2 = new int[12]; // L: 72

		for (int var3 = 0; var3 < 7; ++var3) { // L: 73
			for (int var4 = 0; var4 < KitDefinition.field1951; ++var4) { // L: 75
				KitDefinition var5 = DirectByteArrayCopier.KitDefinition_get(var4); // L: 76
				if (var5 != null && !var5.nonSelectable && var3 + (var1 == 1 ? 7 : 0) == var5.bodypartID) { // L: 77
					var2[equipmentIndices[var3]] = var4 + 256; // L: 78
					break; // L: 79
				}
			}
		}

		return var2; // L: 84
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "13"
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
					if (var3 < 0) { // L: 94
						var3 = KitDefinition.field1951 - 1;
					}
				} else {
					++var3; // L: 97
					if (var3 >= KitDefinition.field1951) { // L: 98
						var3 = 0;
					}
				}

				var4 = DirectByteArrayCopier.KitDefinition_get(var3); // L: 100
			} while(var4 == null || var4.nonSelectable || var1 + (this.field3563 == 1 ? 7 : 0) != var4.bodypartID); // L: 101

			this.equipment[equipmentIndices[var1]] = var3 + 256; // L: 103
			this.setHash(); // L: 104
		}
	} // L: 105

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "-40"
	)
	public void method6128(int var1, boolean var2) {
		int var3 = this.bodyColors[var1]; // L: 108
		if (!var2) { // L: 109
			do {
				--var3; // L: 111
				if (var3 < 0) { // L: 112
					var3 = class339.field3795[var1].length - 1; // L: 113
				}
			} while(!Calendar.method6622(var1, var3)); // L: 115
		} else {
			do {
				++var3; // L: 120
				if (var3 >= class339.field3795[var1].length) { // L: 121
					var3 = 0;
				}
			} while(!Calendar.method6622(var1, var3)); // L: 122
		}

		this.bodyColors[var1] = var3; // L: 125
		this.setHash(); // L: 126
	} // L: 127

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "940246483"
	)
	public void method6158(int var1) {
		if (this.field3563 != var1) { // L: 130
			this.method6129((int[])null, (int[])null, this.bodyColors, var1, -1); // L: 131
		}
	} // L: 132

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ltl;I)V",
		garbageValue = "-2139206404"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(this.field3563); // L: 135

		int var2;
		for (var2 = 0; var2 < 7; ++var2) { // L: 136
			int var3 = this.equipment[equipmentIndices[var2]]; // L: 137
			if (var3 == 0) { // L: 138
				var1.writeByte(-1);
			} else {
				var1.writeByte(var3 - 256); // L: 139
			}
		}

		for (var2 = 0; var2 < 5; ++var2) { // L: 141
			var1.writeByte(this.bodyColors[var2]);
		}

	} // L: 142

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-61"
	)
	@Export("setHash")
	void setHash() {
		long var1 = this.hash; // L: 145
		int var3 = this.equipment[5]; // L: 146
		int var4 = this.equipment[9]; // L: 147
		this.equipment[5] = var4; // L: 148
		this.equipment[9] = var3; // L: 149
		this.hash = 0L; // L: 150

		int var5;
		for (var5 = 0; var5 < 12; ++var5) { // L: 151
			this.hash <<= 4; // L: 152
			if (this.equipment[var5] >= 256) { // L: 153
				this.hash += (long)(this.equipment[var5] - 256);
			}
		}

		if (this.equipment[0] >= 256) { // L: 155
			this.hash += (long)(this.equipment[0] - 256 >> 4);
		}

		if (this.equipment[1] >= 256) { // L: 156
			this.hash += (long)(this.equipment[1] - 256 >> 8);
		}

		for (var5 = 0; var5 < 5; ++var5) { // L: 157
			this.hash <<= 3; // L: 158
			this.hash += (long)this.bodyColors[var5]; // L: 159
		}

		this.hash <<= 1; // L: 161
		this.hash += -265537575L * (long)(this.field3563 * 2079250537); // L: 162
		this.equipment[5] = var3; // L: 163
		this.equipment[9] = var4; // L: 164
		if (var1 != 0L && this.hash != var1 || this.field3568) { // L: 165
			PlayerComposition_cachedModels.remove(var1);
		}

	} // L: 166

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lik;ILik;IB)Ljr;",
		garbageValue = "1"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.npcTransformId != -1) { // L: 169
			return class144.getNpcDefinition(this.npcTransformId).method3871(var1, var2, var3, var4, (class194)null); // L: 170
		} else {
			long var5 = this.hash; // L: 172
			int[] var7 = this.equipment; // L: 173
			if (var1 != null && (var1.shield >= 0 || var1.weapon >= 0)) { // L: 174
				var7 = new int[12]; // L: 175

				for (int var8 = 0; var8 < 12; ++var8) { // L: 176
					var7[var8] = this.equipment[var8];
				}

				if (var1.shield >= 0) { // L: 177
					var5 += (long)(var1.shield - this.equipment[5] << 40); // L: 178
					var7[5] = var1.shield; // L: 179
				}

				if (var1.weapon >= 0) { // L: 181
					var5 += (long)(var1.weapon - this.equipment[3] << 48); // L: 182
					var7[3] = var1.weapon; // L: 183
				}
			}

			Model var18 = (Model)PlayerComposition_cachedModels.get(var5); // L: 186
			if (var18 == null) { // L: 187
				boolean var9 = false; // L: 188

				int var11;
				for (int var10 = 0; var10 < 12; ++var10) { // L: 189
					var11 = var7[var10]; // L: 190
					if (var11 >= 256 && var11 < 512 && !DirectByteArrayCopier.KitDefinition_get(var11 - 256).ready()) { // L: 191 192
						var9 = true;
					}

					if (var11 >= 512 && !class141.ItemComposition_get(var11 - 512).method4087(this.field3563)) { // L: 194 195
						var9 = true;
					}
				}

				if (var9) { // L: 198
					if (this.field3566 != -1L) { // L: 199
						var18 = (Model)PlayerComposition_cachedModels.get(this.field3566);
					}

					if (var18 == null) { // L: 200
						return null;
					}
				}

				if (var18 == null) { // L: 202
					ModelData[] var19 = new ModelData[12]; // L: 203
					var11 = 0; // L: 204

					int var13;
					for (int var12 = 0; var12 < 12; ++var12) { // L: 205
						var13 = var7[var12]; // L: 206
						if (var13 >= 256 && var13 < 512) { // L: 207
							ModelData var14 = DirectByteArrayCopier.KitDefinition_get(var13 - 256).getModelData(); // L: 208
							if (var14 != null) { // L: 209
								var19[var11++] = var14;
							}
						}

						if (var13 >= 512) { // L: 211
							ItemComposition var22 = class141.ItemComposition_get(var13 - 512); // L: 212
							ModelData var15 = var22.method4088(this.field3563); // L: 213
							if (var15 != null) { // L: 214
								if (this.field3567 != null) { // L: 215
									class184 var16 = this.field3567[var12]; // L: 216
									if (var16 != null) { // L: 217
										int var17;
										if (var16.field1906 != null && var22.recolorFrom != null && var22.recolorTo.length == var16.field1906.length) { // L: 218
											for (var17 = 0; var17 < var22.recolorFrom.length; ++var17) { // L: 219
												var15.recolor(var22.recolorTo[var17], var16.field1906[var17]); // L: 220
											}
										}

										if (var16.field1903 != null && var22.retextureFrom != null && var16.field1903.length == var22.retextureTo.length) { // L: 223
											for (var17 = 0; var17 < var22.retextureFrom.length; ++var17) { // L: 224
												var15.retexture(var22.retextureTo[var17], var16.field1903[var17]); // L: 225
											}
										}
									}
								}

								var19[var11++] = var15; // L: 230
							}
						}
					}

					ModelData var20 = new ModelData(var19, var11); // L: 234

					for (var13 = 0; var13 < 5; ++var13) { // L: 235
						if (this.bodyColors[var13] < class339.field3795[var13].length) { // L: 236
							var20.recolor(class105.field1357[var13], class339.field3795[var13][this.bodyColors[var13]]);
						}

						if (this.bodyColors[var13] < class238.field2690[var13].length) {
							var20.recolor(class158.field1755[var13], class238.field2690[var13][this.bodyColors[var13]]); // L: 237
						}
					}

					var18 = var20.toModel(64, 850, -30, -50, -30); // L: 239
					PlayerComposition_cachedModels.put(var18, var5); // L: 240
					this.field3566 = var5; // L: 241
				}
			}

			Model var21;
			if (var1 == null && var3 == null) { // L: 245
				var21 = var18.toSharedSequenceModel(true);
			} else if (var1 != null && var3 != null) { // L: 246
				var21 = var1.applyTransformations(var18, var2, var3, var4);
			} else if (var1 != null) { // L: 247
				var21 = var1.transformActorModel(var18, var2);
			} else {
				var21 = var3.transformActorModel(var18, var4); // L: 248
			}

			return var21; // L: 249
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Lio;",
		garbageValue = "1"
	)
	@Export("getModelData")
	ModelData getModelData() {
		if (this.npcTransformId != -1) { // L: 253
			return class144.getNpcDefinition(this.npcTransformId).method3829((class194)null); // L: 254
		} else {
			boolean var1 = false; // L: 256

			int var3;
			for (int var2 = 0; var2 < 12; ++var2) { // L: 257
				var3 = this.equipment[var2]; // L: 258
				if (var3 >= 256 && var3 < 512 && !DirectByteArrayCopier.KitDefinition_get(var3 - 256).method3734()) { // L: 259 260
					var1 = true;
				}

				if (var3 >= 512 && !class141.ItemComposition_get(var3 - 512).method4133(this.field3563)) { // L: 262 263
					var1 = true;
				}
			}

			if (var1) { // L: 266
				return null;
			} else {
				ModelData[] var7 = new ModelData[12]; // L: 267
				var3 = 0; // L: 268

				int var5;
				for (int var4 = 0; var4 < 12; ++var4) { // L: 269
					var5 = this.equipment[var4]; // L: 270
					ModelData var6;
					if (var5 >= 256 && var5 < 512) { // L: 271
						var6 = DirectByteArrayCopier.KitDefinition_get(var5 - 256).getKitDefinitionModels(); // L: 272
						if (var6 != null) { // L: 273
							var7[var3++] = var6;
						}
					}

					if (var5 >= 512) { // L: 275
						var6 = class141.ItemComposition_get(var5 - 512).method4090(this.field3563); // L: 276
						if (var6 != null) { // L: 277
							var7[var3++] = var6;
						}
					}
				}

				ModelData var8 = new ModelData(var7, var3); // L: 280

				for (var5 = 0; var5 < 5; ++var5) { // L: 281
					if (this.bodyColors[var5] < class339.field3795[var5].length) { // L: 282
						var8.recolor(class105.field1357[var5], class339.field3795[var5][this.bodyColors[var5]]);
					}

					if (this.bodyColors[var5] < class238.field2690[var5].length) { // L: 283
						var8.recolor(class158.field1755[var5], class238.field2690[var5][this.bodyColors[var5]]);
					}
				}

				return var8; // L: 285
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1506507780"
	)
	@Export("getChatHeadId")
	public int getChatHeadId() {
		long var1 = this.hash; // L: 289
		if (this.npcTransformId != -1) { // L: 290
			var1 = -65536L | (long)this.npcTransformId; // L: 291
		}

		Integer var3 = (Integer)field3571.method7818(var1); // L: 293
		if (var3 == null) { // L: 294
			var3 = ++field3570 - 1; // L: 295
			field3571.method7805(var1, var3); // L: 296
			field3570 %= 65535; // L: 297
		}

		return var3; // L: 299
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2051451624"
	)
	void method6137() {
		this.method6129(this.field3573, this.equipment, this.bodyColors, this.field3563, this.npcTransformId); // L: 303
	} // L: 304

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Date;I)Z",
		garbageValue = "-1008767961"
	)
	static boolean method6138(Date var0) {
		Date var1 = class14.method195(); // L: 1082
		return var0.after(var1); // L: 1083
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILdr;ZB)I",
		garbageValue = "-90"
	)
	static int method6159(int var0, Script var1, boolean var2) {
		Widget var3 = Interpreter.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1662
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) { // L: 1663
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1664
			return 1; // L: 1665
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) { // L: 1667
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1668
			return 1; // L: 1669
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) { // L: 1671
			Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var3.text; // L: 1672
			return 1; // L: 1673
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) { // L: 1675
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1676
			return 1; // L: 1677
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) { // L: 1679
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1680
			return 1; // L: 1681
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) { // L: 1683
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1684
			return 1; // L: 1685
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) { // L: 1687
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1688
			return 1; // L: 1689
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) { // L: 1691
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1692
			return 1; // L: 1693
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) { // L: 1695
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1696
			return 1; // L: 1697
		} else if (var0 == ScriptOpcodes.IF_GETTRANS) { // L: 1699
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1700
			return 1; // L: 1701
		} else if (var0 == 2610) { // L: 1703
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1704
			return 1; // L: 1705
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) { // L: 1707
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color; // L: 1708
			return 1; // L: 1709
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) { // L: 1711
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color2; // L: 1712
			return 1; // L: 1713
		} else if (var0 == 2613) { // L: 1715
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1716
			return 1; // L: 1717
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) { // L: 1719
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1720
			return 1; // L: 1721
		} else {
			class324 var4;
			if (var0 == 2617) { // L: 1723
				var4 = var3.method6471(); // L: 1724
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3539 : 0; // L: 1725
			}

			if (var0 == 2618) { // L: 1727
				var4 = var3.method6471(); // L: 1728
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3538 : 0; // L: 1729
				return 1; // L: 1730
			} else {
				class329 var7;
				if (var0 == 2619) { // L: 1732
					var7 = var3.method6470(); // L: 1733
					Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6219().method7416() : ""; // L: 1734
					return 1; // L: 1735
				} else if (var0 == 2620) { // L: 1737
					var4 = var3.method6471(); // L: 1738
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3540 : 0; // L: 1739
					return 1; // L: 1740
				} else if (var0 == 2621) { // L: 1742
					var7 = var3.method6470(); // L: 1743
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6221() : 0; // L: 1744
					return 1; // L: 1745
				} else if (var0 == 2622) { // L: 1747
					var7 = var3.method6470(); // L: 1748
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6246() : 0; // L: 1749
					return 1; // L: 1750
				} else if (var0 == 2623) { // L: 1752
					var7 = var3.method6470(); // L: 1753
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6223() : 0; // L: 1754
					return 1; // L: 1755
				} else if (var0 == 2624) { // L: 1757
					var7 = var3.method6470(); // L: 1758
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null && var7.method6434() ? 1 : 0; // L: 1759
					return 1; // L: 1760
				} else if (var0 != 2625) { // L: 1762
					if (var0 == 2626) { // L: 1767
						var7 = var3.method6470(); // L: 1768
						Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6255().method7580() : ""; // L: 1769
						return 1; // L: 1770
					} else if (var0 == 2627) { // L: 1772
						var7 = var3.method6470(); // L: 1773
						int var5 = var7 != null ? var7.method6263() : 0; // L: 1774
						int var6 = var7 != null ? var7.method6177() : 0; // L: 1775
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.min(var5, var6); // L: 1776
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.max(var5, var6); // L: 1777
						return 1; // L: 1778
					} else if (var0 == 2628) { // L: 1780
						var7 = var3.method6470(); // L: 1781
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6177() : 0; // L: 1782
						return 1; // L: 1783
					} else if (var0 == 2629) { // L: 1785
						var7 = var3.method6470(); // L: 1786
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6225() : 0; // L: 1787
						return 1; // L: 1788
					} else if (var0 == 2630) { // L: 1790
						var7 = var3.method6470(); // L: 1791
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6385() : 0; // L: 1792
						return 1; // L: 1793
					} else if (var0 == 2631) { // L: 1795
						var7 = var3.method6470(); // L: 1796
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6226() : 0; // L: 1797
						return 1; // L: 1798
					} else if (var0 == 2632) { // L: 1800
						var7 = var3.method6470(); // L: 1801
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6227() : 0; // L: 1802
						return 1; // L: 1803
					} else {
						class27 var8;
						if (var0 == 2633) { // L: 1805
							var8 = var3.method6472(); // L: 1806
							Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = var8 != null ? var8.method414(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]) : 0; // L: 1807
							return 1; // L: 1808
						} else if (var0 == 2634) { // L: 1810
							var8 = var3.method6472(); // L: 1811
							Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = var8 != null ? var8.method417((char)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]) : 0; // L: 1812
							return 1; // L: 1813
						} else {
							return 2; // L: 1815
						}
					}
				} else {
					var7 = var3.method6470(); // L: 1763
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null && var7.method6207() ? 1 : 0; // L: 1764
					return 1; // L: 1765
				}
			}
		}
	}
}
