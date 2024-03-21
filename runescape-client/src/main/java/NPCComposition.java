import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ho")
@Implements("NPCComposition")
public class NPCComposition extends DualNode {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("NpcDefinition_archive")
	public static AbstractArchive NpcDefinition_archive;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	public static AbstractArchive field1964;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("NpcDefinition_cached")
	static EvictingDualNodeHashTable NpcDefinition_cached;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1649526313
	)
	@Export("id")
	public int id;
	@ObfuscatedName("aa")
	@Export("name")
	public String name;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1200322013
	)
	@Export("size")
	public int size;
	@ObfuscatedName("ao")
	@Export("models")
	int[] models;
	@ObfuscatedName("au")
	int[] field1994;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -641444085
	)
	@Export("idleSequence")
	public int idleSequence;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1730976877
	)
	@Export("turnLeftSequence")
	public int turnLeftSequence;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -369839719
	)
	@Export("turnRightSequence")
	public int turnRightSequence;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1810055459
	)
	@Export("walkSequence")
	public int walkSequence;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -964079029
	)
	@Export("walkBackSequence")
	public int walkBackSequence;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1604087399
	)
	@Export("walkLeftSequence")
	public int walkLeftSequence;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -213186797
	)
	@Export("walkRightSequence")
	public int walkRightSequence;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -739363907
	)
	public int field1979;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1035998327
	)
	public int field1980;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1836325165
	)
	public int field1987;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 2060153769
	)
	public int field1982;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1208452197
	)
	public int field1983;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1090622731
	)
	public int field1966;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1033123305
	)
	public int field1984;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -905258827
	)
	public int field1986;
	@ObfuscatedName("ap")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("bu")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("bo")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("bd")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("bi")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("bq")
	@Export("drawMapDot")
	public boolean drawMapDot;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1490701553
	)
	@Export("combatLevel")
	public int combatLevel;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -2079367309
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1633013487
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("bm")
	@Export("isVisible")
	public boolean isVisible;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -299076281
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 335416247
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 358183959
	)
	@Export("rotation")
	public int rotation;
	@ObfuscatedName("bb")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -1059260067
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 208627683
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("bp")
	@Export("isInteractable")
	public boolean isInteractable;
	@ObfuscatedName("bf")
	@Export("isClickable")
	public boolean isClickable;
	@ObfuscatedName("bg")
	public boolean field2005;
	@ObfuscatedName("be")
	@Export("isFollower")
	public boolean isFollower;
	@ObfuscatedName("bc")
	int[] field1999;
	@ObfuscatedName("bz")
	short[] field2008;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lta;"
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
		this.field1979 = -1; // L: 33
		this.field1980 = -1; // L: 34
		this.field1987 = -1; // L: 35
		this.field1982 = -1; // L: 36
		this.field1983 = -1; // L: 37
		this.field1966 = -1; // L: 38
		this.field1984 = -1; // L: 39
		this.field1986 = -1; // L: 40
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
		this.field2005 = false; // L: 59
		this.isFollower = false; // L: 60
		this.field1999 = null; // L: 61
		this.field2008 = null; // L: 62
	} // L: 65

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-132261211"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 79

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Luq;B)V",
		garbageValue = "0"
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Luq;II)V",
		garbageValue = "2079469647"
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
			this.field1994 = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) { // L: 135
				this.field1994[var4] = var1.readUnsignedShort();
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

				this.field1999 = new int[var4]; // L: 152
				this.field2008 = new short[var4]; // L: 153

				for (int var6 = 0; var6 < var4; ++var6) { // L: 154
					if ((var3 & 1 << var6) == 0) { // L: 155
						this.field1999[var6] = -1; // L: 156
						this.field2008[var6] = -1; // L: 157
					} else {
						this.field1999[var6] = var1.method9693(); // L: 160
						this.field2008[var6] = (short)var1.method9490(); // L: 161
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
					this.field1979 = var1.readUnsignedShort();
				} else if (var2 == 115) { // L: 187
					this.field1979 = var1.readUnsignedShort(); // L: 188
					this.field1980 = var1.readUnsignedShort(); // L: 189
					this.field1987 = var1.readUnsignedShort(); // L: 190
					this.field1982 = var1.readUnsignedShort(); // L: 191
				} else if (var2 == 116) { // L: 193
					this.field1983 = var1.readUnsignedShort();
				} else if (var2 == 117) { // L: 194
					this.field1983 = var1.readUnsignedShort(); // L: 195
					this.field1966 = var1.readUnsignedShort(); // L: 196
					this.field1984 = var1.readUnsignedShort(); // L: 197
					this.field1986 = var1.readUnsignedShort(); // L: 198
				} else if (var2 == 122) { // L: 200
					this.field2005 = true;
				} else if (var2 == 123) { // L: 201
					this.isFollower = true;
				} else if (var2 == 249) { // L: 202
					this.params = class324.readStringIntParameters(var1, this.params);
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lhs;ILhs;ILht;I)Lkz;",
		garbageValue = "-1363556981"
	)
	public final Model method3701(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4, class188 var5) {
		if (this.transforms != null) { // L: 207
			NPCComposition var10 = this.transform(); // L: 208
			return var10 == null ? null : var10.method3701(var1, var2, var3, var4, var5); // L: 209 210 212
		} else {
			long var6 = (long)this.id; // L: 214
			if (var5 != null) { // L: 215
				var6 |= var5.field1960 << 16; // L: 216
			}

			Model var8 = (Model)HitSplatDefinition_cachedFonts.get(var6); // L: 218
			if (var8 == null) { // L: 219
				ModelData var9 = this.method3736(this.models, var5); // L: 220
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lht;B)Lkf;",
		garbageValue = "3"
	)
	public final ModelData method3702(class188 var1) {
		if (this.transforms != null) { // L: 237
			NPCComposition var2 = this.transform(); // L: 238
			return var2 == null ? null : var2.method3702(var1); // L: 239 240 242
		} else {
			return this.method3736(this.field1994, var1); // L: 244
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "([ILht;I)Lkf;",
		garbageValue = "1934764414"
	)
	ModelData method3736(int[] var1, class188 var2) {
		int[] var3 = var1; // L: 248
		if (var2 != null && var2.field1958 != null) { // L: 249
			var3 = var2.field1958; // L: 250
		}

		if (var3 == null) { // L: 252
			return null; // L: 253
		} else {
			boolean var4 = false; // L: 255

			for (int var5 = 0; var5 < var3.length; ++var5) { // L: 256
				if (var3[var5] != -1 && !field1964.tryLoadFile(var3[var5], 0)) { // L: 257
					var4 = true; // L: 258
				}
			}

			if (var4) { // L: 261
				return null; // L: 262
			} else {
				ModelData[] var9 = new ModelData[var3.length];

				for (int var6 = 0; var6 < var3.length; ++var6) {
					var9[var6] = ModelData.ModelData_get(field1964, var3[var6], 0); // L: 266
				}

				ModelData var10;
				if (var9.length == 1) {
					var10 = var9[0];
					if (var10 == null) {
						var10 = new ModelData(var9, var9.length);
					}
				} else {
					var10 = new ModelData(var9, var9.length); // L: 276
				}

				short[] var7;
				int var8;
				if (this.recolorFrom != null) {
					var7 = this.recolorTo;
					if (var2 != null && var2.field1957 != null) {
						var7 = var2.field1957;
					}

					for (var8 = 0; var8 < this.recolorFrom.length; ++var8) {
						var10.recolor(this.recolorFrom[var8], var7[var8]);
					}
				}

				if (this.retextureFrom != null) { // L: 287
					var7 = this.retextureTo;
					if (var2 != null && var2.field1959 != null) {
						var7 = var2.field1959; // L: 290
					}

					for (var8 = 0; var8 < this.retextureFrom.length; ++var8) { // L: 292
						var10.retexture(this.retextureFrom[var8], var7[var8]); // L: 293
					}
				}

				return var10; // L: 296
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Lho;",
		garbageValue = "82"
	)
	@Export("transform")
	public final NPCComposition transform() {
		int var1 = -1; // L: 300
		if (this.transformVarbit != -1) { // L: 301
			var1 = class332.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 302
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 304
			var2 = this.transforms[var1]; // L: 305
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? VarcInt.getNpcDefinition(var2) : null; // L: 306 307
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-10620"
	)
	@Export("transformIsVisible")
	public boolean transformIsVisible() {
		if (this.transforms == null) { // L: 311
			return true;
		} else {
			int var1 = -1; // L: 312
			if (this.transformVarbit != -1) { // L: 313
				var1 = class332.getVarbit(this.transformVarbit);
			} else if (this.transformVarp != -1) { // L: 314
				var1 = Varps.Varps_main[this.transformVarp];
			}

			if (var1 >= 0 && var1 < this.transforms.length) { // L: 315
				return this.transforms[var1] != -1; // L: 316
			} else {
				return this.transforms[this.transforms.length - 1] != -1;
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-692597377"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		IterableNodeHashTable var4 = this.params; // L: 321
		int var3;
		if (var4 == null) { // L: 323
			var3 = var2; // L: 324
		} else {
			IntegerNode var5 = (IntegerNode)var4.get((long)var1); // L: 327
			if (var5 == null) { // L: 328
				var3 = var2; // L: 329
			} else {
				var3 = var5.integer; // L: 332
			}
		}

		return var3; // L: 334
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "232488627"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		IterableNodeHashTable var4 = this.params; // L: 339
		String var3;
		if (var4 == null) { // L: 341
			var3 = var2; // L: 342
		} else {
			ObjectNode var5 = (ObjectNode)var4.get((long)var1); // L: 345
			if (var5 == null) { // L: 346
				var3 = var2; // L: 347
			} else {
				var3 = (String)var5.obj; // L: 350
			}
		}

		return var3; // L: 352
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1591783850"
	)
	public boolean method3709() {
		return this.field1999 != null && this.field2008 != null; // L: 361
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-692020245"
	)
	public int[] method3700() {
		return this.field1999; // L: 365
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-466777872"
	)
	public int method3703(int var1) {
		return this.field1999 != null && var1 < this.field1999.length ? this.field1999[var1] : -1; // L: 369 370 372
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "-2092456263"
	)
	public short[] method3743() {
		return this.field2008; // L: 376
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IS)S",
		garbageValue = "256"
	)
	public short method3712(int var1) {
		return this.field2008 != null && var1 < this.field2008.length ? this.field2008[var1] : -1; // L: 380 381 383
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)[Lmj;",
		garbageValue = "-756894589"
	)
	public static ServerPacket[] method3704() {
		return new ServerPacket[]{ServerPacket.field3344, ServerPacket.field3413, ServerPacket.field3298, ServerPacket.field3299, ServerPacket.field3309, ServerPacket.field3360, ServerPacket.field3402, ServerPacket.field3324, ServerPacket.field3304, ServerPacket.field3305, ServerPacket.field3301, ServerPacket.field3332, ServerPacket.field3308, ServerPacket.field3394, ServerPacket.field3310, ServerPacket.field3311, ServerPacket.field3307, ServerPacket.field3313, ServerPacket.field3314, ServerPacket.field3410, ServerPacket.field3322, ServerPacket.field3317, ServerPacket.field3318, ServerPacket.field3319, ServerPacket.field3320, ServerPacket.field3321, ServerPacket.field3377, ServerPacket.field3323, ServerPacket.field3400, ServerPacket.field3407, ServerPacket.field3348, ServerPacket.field3327, ServerPacket.field3392, ServerPacket.field3329, ServerPacket.field3330, ServerPacket.field3331, ServerPacket.field3297, ServerPacket.field3333, ServerPacket.field3334, ServerPacket.field3335, ServerPacket.field3296, ServerPacket.field3337, ServerPacket.field3338, ServerPacket.field3397, ServerPacket.field3340, ServerPacket.field3408, ServerPacket.field3342, ServerPacket.field3343, ServerPacket.field3363, ServerPacket.field3345, ServerPacket.field3418, ServerPacket.field3347, ServerPacket.field3325, ServerPacket.field3349, ServerPacket.field3315, ServerPacket.field3351, ServerPacket.field3352, ServerPacket.field3353, ServerPacket.field3354, ServerPacket.field3386, ServerPacket.field3355, ServerPacket.field3357, ServerPacket.field3358, ServerPacket.field3359, ServerPacket.field3412, ServerPacket.field3361, ServerPacket.field3362, ServerPacket.field3420, ServerPacket.field3364, ServerPacket.field3365, ServerPacket.field3366, ServerPacket.field3303, ServerPacket.field3368, ServerPacket.field3369, ServerPacket.field3370, ServerPacket.field3371, ServerPacket.field3372, ServerPacket.field3373, ServerPacket.field3374, ServerPacket.field3375, ServerPacket.field3376, ServerPacket.field3385, ServerPacket.field3378, ServerPacket.field3356, ServerPacket.field3380, ServerPacket.field3381, ServerPacket.field3382, ServerPacket.field3383, ServerPacket.field3384, ServerPacket.field3421, ServerPacket.field3312, ServerPacket.field3387, ServerPacket.field3388, ServerPacket.field3389, ServerPacket.field3390, ServerPacket.field3326, ServerPacket.field3339, ServerPacket.field3393, ServerPacket.field3391, ServerPacket.field3395, ServerPacket.field3336, ServerPacket.field3405, ServerPacket.field3398, ServerPacket.field3399, ServerPacket.field3306, ServerPacket.field3341, ServerPacket.field3396, ServerPacket.field3403, ServerPacket.field3404, ServerPacket.field3300, ServerPacket.field3406, ServerPacket.field3328, ServerPacket.field3367, ServerPacket.field3409, ServerPacket.field3316, ServerPacket.field3411, ServerPacket.field3401, ServerPacket.field3350, ServerPacket.field3414, ServerPacket.field3415, ServerPacket.field3416, ServerPacket.field3417, ServerPacket.field3302, ServerPacket.field3419, ServerPacket.field3346}; // L: 134
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1209928476"
	)
	static void method3708() {
		try {
			File var0 = new File(class334.userHomeDirectory, "random.dat"); // L: 263
			int var2;
			if (var0.exists()) { // L: 264
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0); // L: 265
			} else {
				label38:
				for (int var1 = 0; var1 < class136.field1621.length; ++var1) { // L: 268
					for (var2 = 0; var2 < class10.field43.length; ++var2) { // L: 269
						File var3 = new File(class10.field43[var2] + class136.field1621[var1] + File.separatorChar + "random.dat"); // L: 270
						if (var3.exists()) { // L: 271
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var3, "rw", 25L), 24, 0); // L: 272
							break label38; // L: 273
						}
					}
				}
			}

			if (JagexCache.JagexCache_randomDat == null) { // L: 278
				RandomAccessFile var4 = new RandomAccessFile(var0, "rw"); // L: 279
				var2 = var4.read(); // L: 280
				var4.seek(0L); // L: 281
				var4.write(var2); // L: 282
				var4.seek(0L); // L: 283
				var4.close(); // L: 284
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0); // L: 285
			}
		} catch (IOException var5) { // L: 288
		}

	} // L: 289
}
