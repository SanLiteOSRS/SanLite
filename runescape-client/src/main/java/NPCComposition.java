import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hs")
@Implements("NPCComposition")
public class NPCComposition extends DualNode {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	@Export("NpcDefinition_archive")
	static AbstractArchive NpcDefinition_archive;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("NpcDefinition_cached")
	public static EvictingDualNodeHashTable NpcDefinition_cached;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("NpcDefinition_cachedModels")
	public static EvictingDualNodeHashTable NpcDefinition_cachedModels;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -689725643
	)
	@Export("id")
	public int id;
	@ObfuscatedName("av")
	@Export("name")
	public String name;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1398121993
	)
	@Export("size")
	public int size;
	@ObfuscatedName("au")
	@Export("models")
	int[] models;
	@ObfuscatedName("az")
	int[] field2015;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -435959719
	)
	@Export("idleSequence")
	public int idleSequence;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1713985559
	)
	@Export("turnLeftSequence")
	public int turnLeftSequence;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1432743301
	)
	@Export("turnRightSequence")
	public int turnRightSequence;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1033602153
	)
	@Export("walkSequence")
	public int walkSequence;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -288847653
	)
	@Export("walkBackSequence")
	public int walkBackSequence;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 630189333
	)
	@Export("walkLeftSequence")
	public int walkLeftSequence;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 617573653
	)
	@Export("walkRightSequence")
	public int walkRightSequence;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 884533367
	)
	public int field2023;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -403352091
	)
	public int field2024;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 673457579
	)
	public int field2025;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1673765411
	)
	public int field2026;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1107711959
	)
	public int field2028;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -138044255
	)
	public int field2020;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1639805475
	)
	public int field2029;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1453212075
	)
	public int field2030;
	@ObfuscatedName("ax")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("bm")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("bt")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("by")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("bc")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("bw")
	@Export("drawMapDot")
	public boolean drawMapDot;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1927513927
	)
	@Export("combatLevel")
	public int combatLevel;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -855058565
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 418469443
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("bi")
	@Export("isVisible")
	public boolean isVisible;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -311151453
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1155104569
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -490617765
	)
	@Export("rotation")
	public int rotation;
	@ObfuscatedName("bu")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1672543607
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -1649963055
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("bp")
	@Export("isInteractable")
	public boolean isInteractable;
	@ObfuscatedName("br")
	@Export("isClickable")
	public boolean isClickable;
	@ObfuscatedName("bo")
	@Export("isFollower")
	public boolean isFollower;
	@ObfuscatedName("bk")
	int[] field2052;
	@ObfuscatedName("bx")
	short[] field2051;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lsw;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		NpcDefinition_cached = new EvictingDualNodeHashTable(64); // L: 19
		NpcDefinition_cachedModels = new EvictingDualNodeHashTable(50); // L: 20
	}

	NPCComposition() {
		this.name = "null"; // L: 22
		this.size = 1; // L: 23
		this.idleSequence = -1; // L: 26
		this.turnLeftSequence = -1; // L: 27
		this.turnRightSequence = -1; // L: 28
		this.walkSequence = -1; // L: 29
		this.walkBackSequence = -1; // L: 30
		this.walkLeftSequence = -1; // L: 31
		this.walkRightSequence = -1; // L: 32
		this.field2023 = -1; // L: 33
		this.field2024 = -1; // L: 34
		this.field2025 = -1; // L: 35
		this.field2026 = -1; // L: 36
		this.field2028 = -1;
		this.field2020 = -1;
		this.field2029 = -1;
		this.field2030 = -1; // L: 40
		this.actions = new String[5];
		this.drawMapDot = true;
		this.combatLevel = -1; // L: 47
		this.widthScale = 128; // L: 48
		this.heightScale = 128;
		this.isVisible = false;
		this.ambient = 0;
		this.contrast = 0;
		this.rotation = 32; // L: 53
		this.transformVarbit = -1;
		this.transformVarp = -1;
		this.isInteractable = true;
		this.isClickable = true;
		this.isFollower = false; // L: 59
		this.field2052 = null; // L: 60
		this.field2051 = null;
	} // L: 64

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2132180316"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 83

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ltl;B)V",
		garbageValue = "-45"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 87
			if (var2 == 0) { // L: 88
				return; // L: 91
			}

			this.decodeNext(var1, var2); // L: 89
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ltl;II)V",
		garbageValue = "2079593321"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) { // L: 94
			var3 = var1.readUnsignedByte(); // L: 95
			this.models = new int[var3]; // L: 96

			for (var4 = 0; var4 < var3; ++var4) { // L: 97
				this.models[var4] = var1.readUnsignedShort();
			}
		} else if (var2 == 2) { // L: 99
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 12) { // L: 100
			this.size = var1.readUnsignedByte();
		} else if (var2 == 13) { // L: 101
			this.idleSequence = var1.readUnsignedShort();
		} else if (var2 == 14) { // L: 102
			this.walkSequence = var1.readUnsignedShort();
		} else if (var2 == 15) { // L: 103
			this.turnLeftSequence = var1.readUnsignedShort();
		} else if (var2 == 16) { // L: 104
			this.turnRightSequence = var1.readUnsignedShort();
		} else if (var2 == 17) { // L: 105
			this.walkSequence = var1.readUnsignedShort(); // L: 106
			this.walkBackSequence = var1.readUnsignedShort(); // L: 107
			this.walkLeftSequence = var1.readUnsignedShort(); // L: 108
			this.walkRightSequence = var1.readUnsignedShort(); // L: 109
		} else if (var2 == 18) { // L: 111
			var1.readUnsignedShort(); // L: 112
		} else if (var2 >= 30 && var2 < 35) { // L: 114
			this.actions[var2 - 30] = var1.readStringCp1252NullTerminated(); // L: 115
			if (this.actions[var2 - 30].equalsIgnoreCase("Hidden")) { // L: 116
				this.actions[var2 - 30] = null;
			}
		} else if (var2 == 40) { // L: 118
			var3 = var1.readUnsignedByte(); // L: 119
			this.recolorFrom = new short[var3]; // L: 120
			this.recolorTo = new short[var3]; // L: 121

			for (var4 = 0; var4 < var3; ++var4) { // L: 122
				this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 123
				this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 124
			}
		} else if (var2 == 41) { // L: 127
			var3 = var1.readUnsignedByte(); // L: 128
			this.retextureFrom = new short[var3]; // L: 129
			this.retextureTo = new short[var3]; // L: 130

			for (var4 = 0; var4 < var3; ++var4) { // L: 131
				this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 132
				this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 133
			}
		} else if (var2 == 60) { // L: 136
			var3 = var1.readUnsignedByte(); // L: 137
			this.field2015 = new int[var3]; // L: 138

			for (var4 = 0; var4 < var3; ++var4) { // L: 139
				this.field2015[var4] = var1.readUnsignedShort();
			}
		} else if (var2 == 93) { // L: 141
			this.drawMapDot = false;
		} else if (var2 == 95) { // L: 142
			this.combatLevel = var1.readUnsignedShort();
		} else if (var2 == 97) { // L: 143
			this.widthScale = var1.readUnsignedShort();
		} else if (var2 == 98) { // L: 144
			this.heightScale = var1.readUnsignedShort();
		} else if (var2 == 99) { // L: 145
			this.isVisible = true;
		} else if (var2 == 100) { // L: 146
			this.ambient = var1.readByte();
		} else if (var2 == 101) { // L: 147
			this.contrast = var1.readByte() * 5;
		} else {
			int var5;
			if (var2 == 102) { // L: 148
				var3 = var1.readUnsignedByte(); // L: 149
				var4 = 0; // L: 150

				for (var5 = var3; var5 != 0; var5 >>= 1) { // L: 151 152 154
					++var4; // L: 153
				}

				this.field2052 = new int[var4]; // L: 156
				this.field2051 = new short[var4]; // L: 157

				for (int var6 = 0; var6 < var4; ++var6) { // L: 158
					if ((var3 & 1 << var6) == 0) { // L: 159
						this.field2052[var6] = -1; // L: 160
						this.field2051[var6] = -1; // L: 161
					} else {
						this.field2052[var6] = var1.method9077(); // L: 164
						this.field2051[var6] = (short)var1.method9195(); // L: 165
					}
				}
			} else if (var2 == 103) { // L: 169
				this.rotation = var1.readUnsignedShort();
			} else if (var2 != 106 && var2 != 118) { // L: 170
				if (var2 == 107) { // L: 188
					this.isInteractable = false;
				} else if (var2 == 109) { // L: 189
					this.isClickable = false;
				} else if (var2 == 111) { // L: 190
					this.isFollower = true;
				} else if (var2 == 114) { // L: 191
					this.field2023 = var1.readUnsignedShort();
				} else if (var2 == 115) { // L: 192
					this.field2023 = var1.readUnsignedShort(); // L: 193
					this.field2024 = var1.readUnsignedShort(); // L: 194
					this.field2025 = var1.readUnsignedShort(); // L: 195
					this.field2026 = var1.readUnsignedShort(); // L: 196
				} else if (var2 == 116) { // L: 198
					this.field2028 = var1.readUnsignedShort();
				} else if (var2 == 117) { // L: 199
					this.field2028 = var1.readUnsignedShort(); // L: 200
					this.field2020 = var1.readUnsignedShort(); // L: 201
					this.field2029 = var1.readUnsignedShort(); // L: 202
					this.field2030 = var1.readUnsignedShort(); // L: 203
				} else if (var2 == 249) { // L: 205
					this.params = class131.readStringIntParameters(var1, this.params);
				}
			} else {
				this.transformVarbit = var1.readUnsignedShort(); // L: 171
				if (this.transformVarbit == 65535) { // L: 172
					this.transformVarbit = -1;
				}

				this.transformVarp = var1.readUnsignedShort(); // L: 173
				if (this.transformVarp == 65535) { // L: 174
					this.transformVarp = -1;
				}

				var3 = -1; // L: 175
				if (var2 == 118) { // L: 176
					var3 = var1.readUnsignedShort(); // L: 177
					if (var3 == 65535) { // L: 178
						var3 = -1;
					}
				}

				var4 = var1.readUnsignedByte(); // L: 180
				this.transforms = new int[var4 + 2]; // L: 181

				for (var5 = 0; var5 <= var4; ++var5) { // L: 182
					this.transforms[var5] = var1.readUnsignedShort(); // L: 183
					if (this.transforms[var5] == 65535) { // L: 184
						this.transforms[var5] = -1;
					}
				}

				this.transforms[var4 + 1] = var3; // L: 186
			}
		}

	} // L: 207

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lik;ILik;ILhh;I)Ljr;",
		garbageValue = "-1880714701"
	)
	public final Model method3871(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4, class194 var5) {
		if (this.transforms != null) { // L: 210
			NPCComposition var10 = this.transform(); // L: 211
			return var10 == null ? null : var10.method3871(var1, var2, var3, var4, var5); // L: 212 213 215
		} else {
			long var6 = (long)this.id; // L: 217
			if (var5 != null) { // L: 218
				var6 |= var5.field2004 << 16; // L: 219
			}

			Model var8 = (Model)NpcDefinition_cachedModels.get(var6); // L: 221
			if (var8 == null) { // L: 222
				ModelData var9 = this.method3816(this.models, var5); // L: 223
				if (var9 == null) { // L: 224
					return null; // L: 225
				}

				var8 = var9.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30); // L: 227
				NpcDefinition_cachedModels.put(var8, var6); // L: 228
			}

			Model var11;
			if (var1 != null && var3 != null) {
				var11 = var1.applyTransformations(var8, var2, var3, var4); // L: 231
			} else if (var1 != null) { // L: 232
				var11 = var1.transformActorModel(var8, var2);
			} else if (var3 != null) { // L: 233
				var11 = var3.transformActorModel(var8, var4);
			} else {
				var11 = var8.toSharedSequenceModel(true); // L: 234
			}

			if (this.widthScale != 128 || this.heightScale != 128) { // L: 235
				var11.scale(this.widthScale, this.heightScale, this.widthScale);
			}

			return var11; // L: 236
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lhh;B)Lio;",
		garbageValue = "2"
	)
	public final ModelData method3829(class194 var1) {
		if (this.transforms != null) { // L: 240
			NPCComposition var2 = this.transform(); // L: 241
			return var2 == null ? null : var2.method3829(var1); // L: 242 243 245
		} else {
			return this.method3816(this.field2015, var1); // L: 247
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([ILhh;I)Lio;",
		garbageValue = "-1366973077"
	)
	ModelData method3816(int[] var1, class194 var2) {
		int[] var3 = var1; // L: 251
		if (var2 != null && var2.field2001 != null) { // L: 252
			var3 = var2.field2001; // L: 253
		}

		if (var3 == null) { // L: 255
			return null; // L: 256
		} else {
			boolean var4 = false; // L: 258

			for (int var5 = 0; var5 < var3.length; ++var5) { // L: 259
				if (var3[var5] != -1 && !class154.field1710.tryLoadFile(var3[var5], 0)) { // L: 260
					var4 = true; // L: 261
				}
			}

			if (var4) { // L: 264
				return null; // L: 265
			} else {
				ModelData[] var9 = new ModelData[var3.length]; // L: 267

				for (int var6 = 0; var6 < var3.length; ++var6) { // L: 268
					var9[var6] = ModelData.ModelData_get(class154.field1710, var3[var6], 0); // L: 269
				}

				ModelData var10;
				if (var9.length == 1) { // L: 272
					var10 = var9[0]; // L: 273
					if (var10 == null) { // L: 274
						var10 = new ModelData(var9, var9.length); // L: 275
					}
				} else {
					var10 = new ModelData(var9, var9.length); // L: 279
				}

				short[] var7;
				int var8;
				if (this.recolorFrom != null) { // L: 281
					var7 = this.recolorTo; // L: 282
					if (var2 != null && var2.field2003 != null) { // L: 283
						var7 = var2.field2003; // L: 284
					}

					for (var8 = 0; var8 < this.recolorFrom.length; ++var8) { // L: 286
						var10.recolor(this.recolorFrom[var8], var7[var8]); // L: 287
					}
				}

				if (this.retextureFrom != null) { // L: 290
					var7 = this.retextureTo; // L: 291
					if (var2 != null && var2.field2006 != null) { // L: 292
						var7 = var2.field2006; // L: 293
					}

					for (var8 = 0; var8 < this.retextureFrom.length; ++var8) { // L: 295
						var10.retexture(this.retextureFrom[var8], var7[var8]); // L: 296
					}
				}

				return var10; // L: 299
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Lhs;",
		garbageValue = "24"
	)
	@Export("transform")
	public final NPCComposition transform() {
		int var1 = -1; // L: 303
		if (this.transformVarbit != -1) { // L: 304
			var1 = GrandExchangeOfferOwnWorldComparator.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 305
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 307
			var2 = this.transforms[var1]; // L: 308
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class144.getNpcDefinition(var2) : null; // L: 309 310
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1878919322"
	)
	@Export("transformIsVisible")
	public boolean transformIsVisible() {
		if (this.transforms == null) { // L: 314
			return true;
		} else {
			int var1 = -1; // L: 315
			if (this.transformVarbit != -1) { // L: 316
				var1 = GrandExchangeOfferOwnWorldComparator.getVarbit(this.transformVarbit);
			} else if (this.transformVarp != -1) { // L: 317
				var1 = Varps.Varps_main[this.transformVarp];
			}

			if (var1 >= 0 && var1 < this.transforms.length) { // L: 318
				return this.transforms[var1] != -1; // L: 319
			} else {
				return this.transforms[this.transforms.length - 1] != -1;
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "700550778"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return class184.method3664(this.params, var1, var2); // L: 323
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-665278210"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		IterableNodeHashTable var4 = this.params; // L: 328
		String var3;
		if (var4 == null) { // L: 330
			var3 = var2; // L: 331
		} else {
			ObjectNode var5 = (ObjectNode)var4.get((long)var1); // L: 334
			if (var5 == null) { // L: 335
				var3 = var2; // L: 336
			} else {
				var3 = (String)var5.obj; // L: 339
			}
		}

		return var3; // L: 341
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-557511696"
	)
	public boolean method3821() {
		return this.field2052 != null && this.field2051 != null; // L: 345
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1645987298"
	)
	public int[] method3822() {
		return this.field2052; // L: 349
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-588193460"
	)
	public int method3823(int var1) {
		return this.field2052 != null && var1 < this.field2052.length ? this.field2052[var1] : -1; // L: 353 354 356
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "318527484"
	)
	public short[] method3824() {
		return this.field2051; // L: 360
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)S",
		garbageValue = "102"
	)
	public short method3825(int var1) {
		return this.field2051 != null && var1 < this.field2051.length ? this.field2051[var1] : -1; // L: 364 365 367
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIIZI)V",
		garbageValue = "1313688109"
	)
	public static void method3873(ArrayList var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var5 || !class305.field3392.isEmpty() && !var0.isEmpty()) { // L: 37
			class305.field3392.clear(); // L: 38
			class305.field3393.clear(); // L: 39
		}

		if (!var0.isEmpty()) { // L: 41
			HealthBarUpdate.method2457(var0, var5); // L: 44
			if (!class305.field3392.isEmpty()) { // L: 45
				class305.field3401 = var1; // L: 49
				class305.field3400 = var2; // L: 50
				class305.field3403 = var3; // L: 51
				class305.field3402 = var4; // L: 52
				class305.field3393.add(new class399((class406)null)); // L: 54
				class305.field3393.add(new class408((class406)null, class305.field3396, class305.field3404, class305.field3399)); // L: 55
				if (!class305.field3397.isEmpty()) { // L: 56
					ArrayList var6 = new ArrayList(); // L: 57
					var6.add(new class402(new class403(new class405((class406)null, 0, true, class305.field3402)), class305.field3403)); // L: 58
					ArrayList var8 = new ArrayList(); // L: 61
					Iterator var9 = class305.field3397.iterator(); // L: 62

					while (var9.hasNext()) {
						class317 var10 = (class317)var9.next(); // L: 63
						var8.add(var10); // L: 65
					}

					var6.add(new class402(new class404(new class401((class406)null, var8), 0, false, class305.field3400), class305.field3401)); // L: 71
					class305.field3393.add(new class407((class406)null, var6)); // L: 72
				} else {
					class305.field3393.add(new class402((class406)null, class305.field3403)); // L: 75
					class305.field3393.add(new class403((class406)null)); // L: 76
					class305.field3393.add(new class405((class406)null, 0, true, class305.field3402)); // L: 77
				}

			}
		}
	} // L: 42 46 79

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-1748787626"
	)
	static final void method3850(int var0, int var1, boolean var2) {
		if (!var2 || var0 != class396.field4466 || class343.field3847 != var1) { // L: 5878
			class396.field4466 = var0; // L: 5881
			class343.field3847 = var1; // L: 5882
			AttackOption.method2723(25); // L: 5883
			FontName.drawLoadingMessage("Loading - please wait.", true); // L: 5884
			int var3 = class166.baseX * 64; // L: 5885
			int var4 = class9.baseY * 64; // L: 5886
			class166.baseX = (var0 - 6) * 8; // L: 5887
			class9.baseY = (var1 - 6) * 8; // L: 5888
			int var5 = class166.baseX * 64 - var3; // L: 5889
			int var6 = class9.baseY * 64 - var4; // L: 5890
			var3 = class166.baseX * 64; // L: 5891
			var4 = class9.baseY * 64; // L: 5892

			int var7;
			int var9;
			int[] var10000;
			for (var7 = 0; var7 < 65536; ++var7) { // L: 5893
				NPC var19 = Client.npcs[var7]; // L: 5894
				if (var19 != null) { // L: 5895
					for (var9 = 0; var9 < 10; ++var9) { // L: 5896
						var10000 = var19.pathX; // L: 5897
						var10000[var9] -= var5;
						var10000 = var19.pathY; // L: 5898
						var10000[var9] -= var6;
					}

					var19.x -= var5 * 128; // L: 5900
					var19.y -= var6 * 128; // L: 5901
				}
			}

			for (var7 = 0; var7 < 2048; ++var7) { // L: 5904
				Player var22 = Client.players[var7]; // L: 5905
				if (var22 != null) { // L: 5906
					for (var9 = 0; var9 < 10; ++var9) { // L: 5907
						var10000 = var22.pathX; // L: 5908
						var10000[var9] -= var5;
						var10000 = var22.pathY; // L: 5909
						var10000[var9] -= var6;
					}

					var22.x -= var5 * 128; // L: 5911
					var22.y -= var6 * 128; // L: 5912
				}
			}

			byte var20 = 0; // L: 5915
			byte var8 = 104; // L: 5916
			byte var21 = 1; // L: 5917
			if (var5 < 0) { // L: 5918
				var20 = 103; // L: 5919
				var8 = -1; // L: 5920
				var21 = -1; // L: 5921
			}

			byte var10 = 0; // L: 5923
			byte var11 = 104; // L: 5924
			byte var12 = 1; // L: 5925
			if (var6 < 0) { // L: 5926
				var10 = 103; // L: 5927
				var11 = -1; // L: 5928
				var12 = -1; // L: 5929
			}

			int var14;
			for (int var13 = var20; var13 != var8; var13 += var21) { // L: 5931
				for (var14 = var10; var11 != var14; var14 += var12) { // L: 5932
					int var15 = var5 + var13; // L: 5933
					int var16 = var14 + var6; // L: 5934

					for (int var17 = 0; var17 < 4; ++var17) { // L: 5935
						if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) { // L: 5936
							Client.groundItems[var17][var13][var14] = Client.groundItems[var17][var15][var16];
						} else {
							Client.groundItems[var17][var13][var14] = null; // L: 5937
						}
					}
				}
			}

			for (PendingSpawn var18 = (PendingSpawn)Client.pendingSpawns.last(); var18 != null; var18 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 5941 5942 5946
				var18.x -= var5; // L: 5943
				var18.y -= var6; // L: 5944
				if (var18.x < 0 || var18.y < 0 || var18.x >= 104 || var18.y >= 104) { // L: 5945
					var18.remove();
				}
			}

			if (Client.destinationX != 0) { // L: 5948
				Client.destinationX -= var5; // L: 5949
				Client.destinationY -= var6; // L: 5950
			}

			Client.soundEffectCount = 0; // L: 5952
			Client.isCameraLocked = false; // L: 5953
			PacketWriter.cameraX -= var5 << 7; // L: 5954
			World.cameraZ -= var6 << 7; // L: 5955
			class151.oculusOrbFocalPointX -= var5 << 7; // L: 5956
			class154.oculusOrbFocalPointY -= var6 << 7; // L: 5957
			Client.field625 = -1; // L: 5958
			Client.graphicsObjects.clear(); // L: 5959
			Client.projectiles.clear(); // L: 5960

			for (var14 = 0; var14 < 4; ++var14) { // L: 5961
				Client.collisionMaps[var14].clear();
			}

		}
	} // L: 5879 5962
}
