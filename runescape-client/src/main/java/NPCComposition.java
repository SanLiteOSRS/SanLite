import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hk")
@Implements("NPCComposition")
public class NPCComposition extends DualNode {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("NpcDefinition_cached")
	public static EvictingDualNodeHashTable NpcDefinition_cached;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	public static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 2114128667
	)
	@Export("id")
	public int id;
	@ObfuscatedName("ab")
	@Export("name")
	public String name;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1152725665
	)
	@Export("size")
	public int size;
	@ObfuscatedName("ad")
	@Export("models")
	int[] models;
	@ObfuscatedName("al")
	int[] field2109;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -2133671945
	)
	@Export("idleSequence")
	public int idleSequence;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1451260513
	)
	@Export("turnLeftSequence")
	public int turnLeftSequence;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -765841053
	)
	@Export("turnRightSequence")
	public int turnRightSequence;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1314204327
	)
	@Export("walkSequence")
	public int walkSequence;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -480607591
	)
	@Export("walkBackSequence")
	public int walkBackSequence;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -559690763
	)
	@Export("walkLeftSequence")
	public int walkLeftSequence;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1082802681
	)
	@Export("walkRightSequence")
	public int walkRightSequence;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 66866733
	)
	public int field2117;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 757679103
	)
	public int field2105;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -881297567
	)
	public int field2119;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1895679495
	)
	public int field2111;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -2126142001
	)
	public int field2121;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 430126441
	)
	public int field2122;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1118043759
	)
	public int field2123;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -696029733
	)
	public int field2124;
	@ObfuscatedName("ak")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("bp")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("bz")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("bc")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("bf")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("be")
	@Export("drawMapDot")
	public boolean drawMapDot;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -917072141
	)
	@Export("combatLevel")
	public int combatLevel;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 1049106863
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 1466311325
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("bx")
	@Export("isVisible")
	public boolean isVisible;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1120914791
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 57820681
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -828178871
	)
	@Export("rotation")
	public int rotation;
	@ObfuscatedName("bj")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 1201406899
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -1292070679
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("bb")
	@Export("isInteractable")
	public boolean isInteractable;
	@ObfuscatedName("by")
	@Export("isClickable")
	public boolean isClickable;
	@ObfuscatedName("bk")
	public boolean field2134;
	@ObfuscatedName("bt")
	@Export("isFollower")
	public boolean isFollower;
	@ObfuscatedName("bq")
	int[] field2107;
	@ObfuscatedName("bi")
	short[] field2146;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lto;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		NpcDefinition_cached = new EvictingDualNodeHashTable(64); // L: 19
		HitSplatDefinition_cachedFonts = new EvictingDualNodeHashTable(50); // L: 20
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
		this.field2117 = -1; // L: 33
		this.field2105 = -1; // L: 34
		this.field2119 = -1; // L: 35
		this.field2111 = -1; // L: 36
		this.field2121 = -1; // L: 37
		this.field2122 = -1; // L: 38
		this.field2123 = -1; // L: 39
		this.field2124 = -1; // L: 40
		this.actions = new String[5]; // L: 45
		this.drawMapDot = true; // L: 46
		this.combatLevel = -1; // L: 47
		this.widthScale = 128; // L: 48
		this.heightScale = 128; // L: 49
		this.isVisible = false; // L: 50
		this.ambient = 0; // L: 51
		this.contrast = 0; // L: 52
		this.rotation = 32; // L: 53
		this.transformVarbit = -1; // L: 55
		this.transformVarp = -1; // L: 56
		this.isInteractable = true; // L: 57
		this.isClickable = true; // L: 58
		this.field2134 = false; // L: 59
		this.isFollower = false; // L: 60
		this.field2107 = null; // L: 61
		this.field2146 = null; // L: 62
	} // L: 65

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "701718067"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 79

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)V",
		garbageValue = "1708679572"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 83
			if (var2 == 0) { // L: 84
				return; // L: 87
			}

			this.decodeNext(var1, var2); // L: 85
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lur;II)V",
		garbageValue = "-522079210"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) { // L: 90
			var3 = var1.readUnsignedByte(); // L: 91
			this.models = new int[var3]; // L: 92

			for (var4 = 0; var4 < var3; ++var4) { // L: 93
				this.models[var4] = var1.readUnsignedShort();
			}
		} else if (var2 == 2) { // L: 95
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 12) { // L: 96
			this.size = var1.readUnsignedByte();
		} else if (var2 == 13) { // L: 97
			this.idleSequence = var1.readUnsignedShort();
		} else if (var2 == 14) { // L: 98
			this.walkSequence = var1.readUnsignedShort();
		} else if (var2 == 15) { // L: 99
			this.turnLeftSequence = var1.readUnsignedShort();
		} else if (var2 == 16) { // L: 100
			this.turnRightSequence = var1.readUnsignedShort();
		} else if (var2 == 17) { // L: 101
			this.walkSequence = var1.readUnsignedShort(); // L: 102
			this.walkBackSequence = var1.readUnsignedShort(); // L: 103
			this.walkLeftSequence = var1.readUnsignedShort(); // L: 104
			this.walkRightSequence = var1.readUnsignedShort(); // L: 105
		} else if (var2 == 18) { // L: 107
			var1.readUnsignedShort(); // L: 108
		} else if (var2 >= 30 && var2 < 35) { // L: 110
			this.actions[var2 - 30] = var1.readStringCp1252NullTerminated(); // L: 111
			if (this.actions[var2 - 30].equalsIgnoreCase("Hidden")) { // L: 112
				this.actions[var2 - 30] = null;
			}
		} else if (var2 == 40) { // L: 114
			var3 = var1.readUnsignedByte(); // L: 115
			this.recolorFrom = new short[var3]; // L: 116
			this.recolorTo = new short[var3]; // L: 117

			for (var4 = 0; var4 < var3; ++var4) { // L: 118
				this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 119
				this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 120
			}
		} else if (var2 == 41) { // L: 123
			var3 = var1.readUnsignedByte(); // L: 124
			this.retextureFrom = new short[var3]; // L: 125
			this.retextureTo = new short[var3]; // L: 126

			for (var4 = 0; var4 < var3; ++var4) { // L: 127
				this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 128
				this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 129
			}
		} else if (var2 == 60) { // L: 132
			var3 = var1.readUnsignedByte(); // L: 133
			this.field2109 = new int[var3]; // L: 134

			for (var4 = 0; var4 < var3; ++var4) { // L: 135
				this.field2109[var4] = var1.readUnsignedShort();
			}
		} else if (var2 == 93) { // L: 137
			this.drawMapDot = false;
		} else if (var2 == 95) { // L: 138
			this.combatLevel = var1.readUnsignedShort();
		} else if (var2 == 97) { // L: 139
			this.widthScale = var1.readUnsignedShort();
		} else if (var2 == 98) { // L: 140
			this.heightScale = var1.readUnsignedShort();
		} else if (var2 == 99) { // L: 141
			this.isVisible = true;
		} else if (var2 == 100) { // L: 142
			this.ambient = var1.readByte();
		} else if (var2 == 101) { // L: 143
			this.contrast = var1.readByte() * 5;
		} else {
			int var5;
			if (var2 == 102) { // L: 144
				var3 = var1.readUnsignedByte(); // L: 145
				var4 = 0; // L: 146

				for (var5 = var3; var5 != 0; var5 >>= 1) { // L: 147 148 150
					++var4; // L: 149
				}

				this.field2107 = new int[var4]; // L: 152
				this.field2146 = new short[var4]; // L: 153

				for (int var6 = 0; var6 < var4; ++var6) { // L: 154
					if ((var3 & 1 << var6) == 0) { // L: 155
						this.field2107[var6] = -1; // L: 156
						this.field2146[var6] = -1; // L: 157
					} else {
						this.field2107[var6] = var1.method9436(); // L: 160
						this.field2146[var6] = (short)var1.method9282(); // L: 161
					}
				}
			} else if (var2 == 103) { // L: 165
				this.rotation = var1.readUnsignedShort();
			} else if (var2 != 106 && var2 != 118) { // L: 166
				if (var2 == 107) { // L: 184
					this.isInteractable = false;
				} else if (var2 == 109) { // L: 185
					this.isClickable = false;
				} else if (var2 == 114) { // L: 186
					this.field2117 = var1.readUnsignedShort();
				} else if (var2 == 115) { // L: 187
					this.field2117 = var1.readUnsignedShort(); // L: 188
					this.field2105 = var1.readUnsignedShort(); // L: 189
					this.field2119 = var1.readUnsignedShort(); // L: 190
					this.field2111 = var1.readUnsignedShort(); // L: 191
				} else if (var2 == 116) { // L: 193
					this.field2121 = var1.readUnsignedShort();
				} else if (var2 == 117) { // L: 194
					this.field2121 = var1.readUnsignedShort(); // L: 195
					this.field2122 = var1.readUnsignedShort(); // L: 196
					this.field2123 = var1.readUnsignedShort(); // L: 197
					this.field2124 = var1.readUnsignedShort(); // L: 198
				} else if (var2 == 122) { // L: 200
					this.field2134 = true;
				} else if (var2 == 123) { // L: 201
					this.isFollower = true;
				} else if (var2 == 249) { // L: 202
					this.params = SecureRandomFuture.readStringIntParameters(var1, this.params);
				}
			} else {
				this.transformVarbit = var1.readUnsignedShort(); // L: 167
				if (this.transformVarbit == 65535) { // L: 168
					this.transformVarbit = -1;
				}

				this.transformVarp = var1.readUnsignedShort(); // L: 169
				if (this.transformVarp == 65535) { // L: 170
					this.transformVarp = -1;
				}

				var3 = -1; // L: 171
				if (var2 == 118) { // L: 172
					var3 = var1.readUnsignedShort(); // L: 173
					if (var3 == 65535) { // L: 174
						var3 = -1;
					}
				}

				var4 = var1.readUnsignedByte(); // L: 176
				this.transforms = new int[var4 + 2]; // L: 177

				for (var5 = 0; var5 <= var4; ++var5) { // L: 178
					this.transforms[var5] = var1.readUnsignedShort(); // L: 179
					if (this.transforms[var5] == 65535) { // L: 180
						this.transforms[var5] = -1;
					}
				}

				this.transforms[var4 + 1] = var3; // L: 182
			}
		}

	} // L: 204

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lig;ILig;ILhg;I)Ljn;",
		garbageValue = "1883741450"
	)
	public final Model method3866(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4, class206 var5) {
		if (this.transforms != null) { // L: 207
			NPCComposition var10 = this.transform(); // L: 208
			return var10 == null ? null : var10.method3866(var1, var2, var3, var4, var5); // L: 209 210 212
		} else {
			long var6 = (long)this.id; // L: 214
			if (var5 != null) { // L: 215
				var6 |= var5.field2101 << 16; // L: 216
			}

			Model var8 = (Model)HitSplatDefinition_cachedFonts.get(var6); // L: 218
			if (var8 == null) { // L: 219
				ModelData var9 = this.method3865(this.models, var5); // L: 220
				if (var9 == null) { // L: 221
					return null; // L: 222
				}

				var8 = var9.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30); // L: 224
				HitSplatDefinition_cachedFonts.put(var8, var6); // L: 225
			}

			Model var11;
			if (var1 != null && var3 != null) {
				var11 = var1.applyTransformations(var8, var2, var3, var4); // L: 228
			} else if (var1 != null) { // L: 229
				var11 = var1.transformActorModel(var8, var2);
			} else if (var3 != null) { // L: 230
				var11 = var3.transformActorModel(var8, var4);
			} else {
				var11 = var8.toSharedSequenceModel(true); // L: 231
			}

			if (this.widthScale != 128 || this.heightScale != 128) { // L: 232
				var11.scale(this.widthScale, this.heightScale, this.widthScale);
			}

			return var11; // L: 233
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lhg;I)Ljj;",
		garbageValue = "-1471968864"
	)
	public final ModelData method3864(class206 var1) {
		if (this.transforms != null) { // L: 237
			NPCComposition var2 = this.transform(); // L: 238
			return var2 == null ? null : var2.method3864(var1); // L: 239 240 242
		} else {
			return this.method3865(this.field2109, var1); // L: 244
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([ILhg;B)Ljj;",
		garbageValue = "-90"
	)
	ModelData method3865(int[] var1, class206 var2) {
		int[] var3 = var1; // L: 248
		if (var2 != null && var2.field2093 != null) { // L: 249
			var3 = var2.field2093; // L: 250
		}

		if (var3 == null) { // L: 252
			return null; // L: 253
		} else {
			boolean var4 = false; // L: 255

			for (int var5 = 0; var5 < var3.length; ++var5) { // L: 256
				if (var3[var5] != -1 && !Decimator.field395.tryLoadFile(var3[var5], 0)) { // L: 257
					var4 = true; // L: 258
				}
			}

			if (var4) { // L: 261
				return null; // L: 262
			} else {
				ModelData[] var9 = new ModelData[var3.length]; // L: 264

				for (int var6 = 0; var6 < var3.length; ++var6) { // L: 265
					var9[var6] = ModelData.ModelData_get(Decimator.field395, var3[var6], 0); // L: 266
				}

				ModelData var10;
				if (var9.length == 1) { // L: 269
					var10 = var9[0]; // L: 270
					if (var10 == null) { // L: 271
						var10 = new ModelData(var9, var9.length); // L: 272
					}
				} else {
					var10 = new ModelData(var9, var9.length); // L: 276
				}

				short[] var7;
				int var8;
				if (this.recolorFrom != null) { // L: 278
					var7 = this.recolorTo; // L: 279
					if (var2 != null && var2.field2092 != null) { // L: 280
						var7 = var2.field2092; // L: 281
					}

					for (var8 = 0; var8 < this.recolorFrom.length; ++var8) { // L: 283
						var10.recolor(this.recolorFrom[var8], var7[var8]); // L: 284
					}
				}

				if (this.retextureFrom != null) { // L: 287
					var7 = this.retextureTo; // L: 288
					if (var2 != null && var2.field2098 != null) { // L: 289
						var7 = var2.field2098; // L: 290
					}

					for (var8 = 0; var8 < this.retextureFrom.length; ++var8) { // L: 292
						var10.retexture(this.retextureFrom[var8], var7[var8]); // L: 293
					}
				}

				return var10; // L: 296
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lhk;",
		garbageValue = "-1693142084"
	)
	@Export("transform")
	public final NPCComposition transform() {
		int var1 = -1; // L: 300
		if (this.transformVarbit != -1) { // L: 301
			var1 = SpotAnimationDefinition.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 302
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 304
			var2 = this.transforms[var1]; // L: 305
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? UserComparator10.getNpcDefinition(var2) : null; // L: 306 307
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-553260736"
	)
	public final int method3867() {
		if (this.transforms != null) { // L: 311
			NPCComposition var1 = this.transform(); // L: 312
			if (var1 != null) { // L: 313
				return var1.id; // L: 314
			}
		}

		return -1; // L: 317
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "30"
	)
	@Export("transformIsVisible")
	public boolean transformIsVisible() {
		if (this.transforms == null) { // L: 321
			return true;
		} else {
			int var1 = -1; // L: 322
			if (this.transformVarbit != -1) { // L: 323
				var1 = SpotAnimationDefinition.getVarbit(this.transformVarbit);
			} else if (this.transformVarp != -1) { // L: 324
				var1 = Varps.Varps_main[this.transformVarp];
			}

			if (var1 >= 0 && var1 < this.transforms.length) { // L: 325
				return this.transforms[var1] != -1; // L: 326
			} else {
				return this.transforms[this.transforms.length - 1] != -1;
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "-9709"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return class220.method4074(this.params, var1, var2); // L: 330
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1401164265"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class27.method400(this.params, var1, var2); // L: 334
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "7"
	)
	public boolean method3871() {
		return this.field2107 != null && this.field2146 != null; // L: 338
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "-20"
	)
	public int[] method3872() {
		return this.field2107; // L: 342
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1991102401"
	)
	public int method3877(int var1) {
		return this.field2107 != null && var1 < this.field2107.length ? this.field2107[var1] : -1; // L: 346 347 349
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "-658649455"
	)
	public short[] method3874() {
		return this.field2146; // L: 353
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)S",
		garbageValue = "-1579620841"
	)
	public short method3890(int var1) {
		return this.field2146 != null && var1 < this.field2146.length ? this.field2146[var1] : -1; // L: 357 358 360
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1682223487"
	)
	static void method3903() {
		int var0 = Players.Players_count; // L: 5025
		int[] var1 = Players.Players_indices; // L: 5026

		for (int var2 = 0; var2 < var0; ++var2) { // L: 5027
			if (var1[var2] != Client.combatTargetPlayerIndex && var1[var2] != Client.localPlayerIndex) { // L: 5028
				class167.addPlayerToScene(Client.players[var1[var2]], true); // L: 5029
			}
		}

	} // L: 5031
}
