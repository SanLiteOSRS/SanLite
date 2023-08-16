import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("hw")
@Implements("NPCComposition")
public class NPCComposition extends DualNode {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("NpcDefinition_archive")
	public static AbstractArchive NpcDefinition_archive;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	public static AbstractArchive field2032;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("NpcDefinition_cached")
	public static EvictingDualNodeHashTable NpcDefinition_cached;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("NpcDefinition_cachedModels")
	public static EvictingDualNodeHashTable NpcDefinition_cachedModels;
	@ObfuscatedName("kk")
	@ObfuscatedGetter(
		intValue = 757716957
	)
	@Export("cameraX")
	static int cameraX;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1243106285
	)
	@Export("id")
	public int id;
	@ObfuscatedName("az")
	@Export("name")
	public String name;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -733591527
	)
	@Export("size")
	public int size;
	@ObfuscatedName("aa")
	@Export("models")
	int[] models;
	@ObfuscatedName("af")
	int[] field2038;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 260766235
	)
	@Export("idleSequence")
	public int idleSequence;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1686120851
	)
	@Export("turnLeftSequence")
	public int turnLeftSequence;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 821598169
	)
	@Export("turnRightSequence")
	public int turnRightSequence;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 934984979
	)
	@Export("walkSequence")
	public int walkSequence;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 129510829
	)
	@Export("walkBackSequence")
	public int walkBackSequence;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1909691015
	)
	@Export("walkLeftSequence")
	public int walkLeftSequence;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1831978023
	)
	@Export("walkRightSequence")
	public int walkRightSequence;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1380991387
	)
	public int field2047;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -797891459
	)
	public int field2048;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1675023925
	)
	public int field2049;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -581873653
	)
	public int field2075;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -448850167
	)
	public int field2043;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -2089336141
	)
	public int field2052;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 2098030227
	)
	public int field2059;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1427405587
	)
	public int field2076;
	@ObfuscatedName("ak")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("bh")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("bj")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("bk")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("bv")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("bt")
	@Export("drawMapDot")
	public boolean drawMapDot;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 989486243
	)
	@Export("combatLevel")
	public int combatLevel;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 1754811063
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -183655351
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("bm")
	@Export("isVisible")
	public boolean isVisible;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 580874625
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1616400531
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1032691767
	)
	@Export("rotation")
	public int rotation;
	@ObfuscatedName("bl")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 715362785
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -541634501
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("bo")
	@Export("isInteractable")
	public boolean isInteractable;
	@ObfuscatedName("bb")
	@Export("isClickable")
	public boolean isClickable;
	@ObfuscatedName("br")
	@Export("isFollower")
	public boolean isFollower;
	@ObfuscatedName("be")
	int[] field2074;
	@ObfuscatedName("bi")
	short[] field2072;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lsf;"
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
		this.field2047 = -1; // L: 33
		this.field2048 = -1; // L: 34
		this.field2049 = -1; // L: 35
		this.field2075 = -1; // L: 36
		this.field2043 = -1; // L: 37
		this.field2052 = -1; // L: 38
		this.field2059 = -1; // L: 39
		this.field2076 = -1; // L: 40
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
		this.isFollower = false; // L: 59
		this.field2074 = null; // L: 60
		this.field2072 = null; // L: 61
	} // L: 64

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1327356589"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 78

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ltm;B)V",
		garbageValue = "61"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 82
			if (var2 == 0) { // L: 83
				return; // L: 86
			}

			this.decodeNext(var1, var2); // L: 84
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltm;II)V",
		garbageValue = "-394380179"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) { // L: 89
			var3 = var1.readUnsignedByte(); // L: 90
			this.models = new int[var3]; // L: 91

			for (var4 = 0; var4 < var3; ++var4) { // L: 92
				this.models[var4] = var1.readUnsignedShort();
			}
		} else if (var2 == 2) { // L: 94
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 12) { // L: 95
			this.size = var1.readUnsignedByte();
		} else if (var2 == 13) { // L: 96
			this.idleSequence = var1.readUnsignedShort();
		} else if (var2 == 14) { // L: 97
			this.walkSequence = var1.readUnsignedShort();
		} else if (var2 == 15) { // L: 98
			this.turnLeftSequence = var1.readUnsignedShort();
		} else if (var2 == 16) { // L: 99
			this.turnRightSequence = var1.readUnsignedShort();
		} else if (var2 == 17) { // L: 100
			this.walkSequence = var1.readUnsignedShort(); // L: 101
			this.walkBackSequence = var1.readUnsignedShort(); // L: 102
			this.walkLeftSequence = var1.readUnsignedShort(); // L: 103
			this.walkRightSequence = var1.readUnsignedShort(); // L: 104
		} else if (var2 == 18) { // L: 106
			var1.readUnsignedShort(); // L: 107
		} else if (var2 >= 30 && var2 < 35) { // L: 109
			this.actions[var2 - 30] = var1.readStringCp1252NullTerminated(); // L: 110
			if (this.actions[var2 - 30].equalsIgnoreCase("Hidden")) { // L: 111
				this.actions[var2 - 30] = null;
			}
		} else if (var2 == 40) { // L: 113
			var3 = var1.readUnsignedByte(); // L: 114
			this.recolorFrom = new short[var3]; // L: 115
			this.recolorTo = new short[var3]; // L: 116

			for (var4 = 0; var4 < var3; ++var4) { // L: 117
				this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 118
				this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 119
			}
		} else if (var2 == 41) { // L: 122
			var3 = var1.readUnsignedByte(); // L: 123
			this.retextureFrom = new short[var3]; // L: 124
			this.retextureTo = new short[var3]; // L: 125

			for (var4 = 0; var4 < var3; ++var4) { // L: 126
				this.retextureFrom[var4] = (short)var1.readUnsignedShort();
				this.retextureTo[var4] = (short)var1.readUnsignedShort();
			}
		} else if (var2 == 60) {
			var3 = var1.readUnsignedByte();
			this.field2038 = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2038[var4] = var1.readUnsignedShort();
			}
		} else if (var2 == 93) {
			this.drawMapDot = false;
		} else if (var2 == 95) { // L: 137
			this.combatLevel = var1.readUnsignedShort();
		} else if (var2 == 97) {
			this.widthScale = var1.readUnsignedShort();
		} else if (var2 == 98) {
			this.heightScale = var1.readUnsignedShort();
		} else if (var2 == 99) {
			this.isVisible = true;
		} else if (var2 == 100) {
			this.ambient = var1.readByte();
		} else if (var2 == 101) {
			this.contrast = var1.readByte() * 5;
		} else {
			int var5;
			if (var2 == 102) {
				var3 = var1.readUnsignedByte();
				var4 = 0;

				for (var5 = var3; var5 != 0; var5 >>= 1) {
					++var4; // L: 148
				}

				this.field2074 = new int[var4];
				this.field2072 = new short[var4];

				for (int var6 = 0; var6 < var4; ++var6) {
					if ((var3 & 1 << var6) == 0) {
						this.field2074[var6] = -1;
						this.field2072[var6] = -1;
					} else {
						this.field2074[var6] = var1.method9198();
						this.field2072[var6] = (short)var1.method9075();
					}
				}
			} else if (var2 == 103) {
				this.rotation = var1.readUnsignedShort();
			} else if (var2 != 106 && var2 != 118) {
				if (var2 == 107) { // L: 183
					this.isInteractable = false;
				} else if (var2 == 109) { // L: 184
					this.isClickable = false;
				} else if (var2 == 111) {
					this.isFollower = true;
				} else if (var2 == 114) {
					this.field2047 = var1.readUnsignedShort();
				} else if (var2 == 115) { // L: 187
					this.field2047 = var1.readUnsignedShort(); // L: 188
					this.field2048 = var1.readUnsignedShort(); // L: 189
					this.field2049 = var1.readUnsignedShort(); // L: 190
					this.field2075 = var1.readUnsignedShort(); // L: 191
				} else if (var2 == 116) {
					this.field2043 = var1.readUnsignedShort();
				} else if (var2 == 117) { // L: 194
					this.field2043 = var1.readUnsignedShort(); // L: 195
					this.field2052 = var1.readUnsignedShort();
					this.field2059 = var1.readUnsignedShort();
					this.field2076 = var1.readUnsignedShort(); // L: 198
				} else if (var2 == 249) {
					this.params = Decimator.readStringIntParameters(var1, this.params);
				}
			} else {
				this.transformVarbit = var1.readUnsignedShort();
				if (this.transformVarbit == 65535) {
					this.transformVarbit = -1;
				}

				this.transformVarp = var1.readUnsignedShort();
				if (this.transformVarp == 65535) {
					this.transformVarp = -1;
				}

				var3 = -1; // L: 170
				if (var2 == 118) {
					var3 = var1.readUnsignedShort();
					if (var3 == 65535) {
						var3 = -1;
					}
				}

				var4 = var1.readUnsignedByte();
				this.transforms = new int[var4 + 2];

				for (var5 = 0; var5 <= var4; ++var5) {
					this.transforms[var5] = var1.readUnsignedShort();
					if (this.transforms[var5] == 65535) {
						this.transforms[var5] = -1;
					}
				}

				this.transforms[var4 + 1] = var3;
			}
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lib;ILib;ILhq;I)Ljr;",
		garbageValue = "209230471"
	)
	public final Model method3691(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4, class194 var5) {
		if (this.transforms != null) {
			NPCComposition var10 = this.transform();
			return var10 == null ? null : var10.method3691(var1, var2, var3, var4, var5); // L: 207 210
		} else {
			long var6 = (long)this.id;
			if (var5 != null) {
				var6 |= var5.field2026 << 16; // L: 214
			}

			Model var8 = (Model)NpcDefinition_cachedModels.get(var6); // L: 216
			if (var8 == null) { // L: 217
				ModelData var9 = this.method3723(this.models, var5); // L: 218
				if (var9 == null) { // L: 219
					return null; // L: 220
				}

				var8 = var9.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30); // L: 222
				NpcDefinition_cachedModels.put(var8, var6); // L: 223
			}

			Model var11;
			if (var1 != null && var3 != null) {
				var11 = var1.applyTransformations(var8, var2, var3, var4); // L: 226
			} else if (var1 != null) { // L: 227
				var11 = var1.transformActorModel(var8, var2);
			} else if (var3 != null) { // L: 228
				var11 = var3.transformActorModel(var8, var4);
			} else {
				var11 = var8.toSharedSequenceModel(true); // L: 229
			}

			if (this.widthScale != 128 || this.heightScale != 128) { // L: 230
				var11.scale(this.widthScale, this.heightScale, this.widthScale);
			}

			return var11; // L: 231
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lhq;I)Lic;",
		garbageValue = "-539413854"
	)
	public final ModelData method3692(class194 var1) {
		if (this.transforms != null) { // L: 235
			NPCComposition var2 = this.transform(); // L: 236
			return var2 == null ? null : var2.method3692(var1); // L: 237 238 240
		} else {
			return this.method3723(this.field2038, var1); // L: 242
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([ILhq;I)Lic;",
		garbageValue = "-1668692143"
	)
	ModelData method3723(int[] var1, class194 var2) {
		int[] var3 = var1; // L: 246
		if (var2 != null && var2.field2024 != null) { // L: 247
			var3 = var2.field2024; // L: 248
		}

		if (var3 == null) { // L: 250
			return null; // L: 251
		} else {
			boolean var4 = false; // L: 253

			for (int var5 = 0; var5 < var3.length; ++var5) { // L: 254
				if (var3[var5] != -1 && !field2032.tryLoadFile(var3[var5], 0)) { // L: 255
					var4 = true; // L: 256
				}
			}

			if (var4) { // L: 259
				return null; // L: 260
			} else {
				ModelData[] var9 = new ModelData[var3.length]; // L: 262

				for (int var6 = 0; var6 < var3.length; ++var6) { // L: 263
					var9[var6] = ModelData.ModelData_get(field2032, var3[var6], 0); // L: 264
				}

				ModelData var10;
				if (var9.length == 1) { // L: 267
					var10 = var9[0]; // L: 268
					if (var10 == null) { // L: 269
						var10 = new ModelData(var9, var9.length); // L: 270
					}
				} else {
					var10 = new ModelData(var9, var9.length); // L: 274
				}

				short[] var7;
				int var8;
				if (this.recolorFrom != null) { // L: 276
					var7 = this.recolorTo; // L: 277
					if (var2 != null && var2.field2025 != null) { // L: 278
						var7 = var2.field2025; // L: 279
					}

					for (var8 = 0; var8 < this.recolorFrom.length; ++var8) { // L: 281
						var10.recolor(this.recolorFrom[var8], var7[var8]); // L: 282
					}
				}

				if (this.retextureFrom != null) { // L: 285
					var7 = this.retextureTo; // L: 286
					if (var2 != null && var2.field2027 != null) { // L: 287
						var7 = var2.field2027; // L: 288
					}

					for (var8 = 0; var8 < this.retextureFrom.length; ++var8) { // L: 290
						var10.retexture(this.retextureFrom[var8], var7[var8]); // L: 291
					}
				}

				return var10; // L: 294
			}
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lhw;",
		garbageValue = "601463714"
	)
	@Export("transform")
	public final NPCComposition transform() {
		int var1 = -1; // L: 298
		if (this.transformVarbit != -1) { // L: 299
			var1 = ClientPreferences.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 300
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 302
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1]; // L: 303
		}

		return var2 != -1 ? class90.getNpcDefinition(var2) : null; // L: 304 305
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1759835926"
	)
	@Export("transformIsVisible")
	public boolean transformIsVisible() {
		if (this.transforms == null) { // L: 309
			return true;
		} else {
			int var1 = -1; // L: 310
			if (this.transformVarbit != -1) { // L: 311
				var1 = ClientPreferences.getVarbit(this.transformVarbit);
			} else if (this.transformVarp != -1) { // L: 312
				var1 = Varps.Varps_main[this.transformVarp];
			}

			if (var1 >= 0 && var1 < this.transforms.length) { // L: 313
				return this.transforms[var1] != -1; // L: 314
			} else {
				return this.transforms[this.transforms.length - 1] != -1;
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "666148564"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		IterableNodeHashTable var4 = this.params; // L: 319
		int var3;
		if (var4 == null) { // L: 321
			var3 = var2; // L: 322
		} else {
			IntegerNode var5 = (IntegerNode)var4.get((long)var1); // L: 325
			if (var5 == null) { // L: 326
				var3 = var2; // L: 327
			} else {
				var3 = var5.integer; // L: 330
			}
		}

		return var3; // L: 332
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;S)Ljava/lang/String;",
		garbageValue = "18686"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		IterableNodeHashTable var4 = this.params; // L: 337
		String var3;
		if (var4 == null) { // L: 339
			var3 = var2; // L: 340
		} else {
			ObjectNode var5 = (ObjectNode)var4.get((long)var1); // L: 343
			if (var5 == null) { // L: 344
				var3 = var2; // L: 345
			} else {
				var3 = (String)var5.obj; // L: 348
			}
		}

		return var3; // L: 350
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1337566276"
	)
	public boolean method3697() {
		return this.field2074 != null && this.field2072 != null; // L: 354
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "44298877"
	)
	public int[] method3698() {
		return this.field2074; // L: 358
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1762616246"
	)
	public int method3695(int var1) {
		return this.field2074 != null && var1 < this.field2074.length ? this.field2074[var1] : -1; // L: 362 363 365
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "1594332022"
	)
	public short[] method3700() {
		return this.field2072; // L: 369
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)S",
		garbageValue = "-67"
	)
	public short method3715(int var1) {
		return this.field2072 != null && var1 < this.field2072.length ? this.field2072[var1] : -1; // L: 373 374 376
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ltm;II)V",
		garbageValue = "1881602206"
	)
	@Export("readReflectionCheck")
	public static void readReflectionCheck(Buffer var0, int var1) {
		ReflectionCheck var2 = new ReflectionCheck(); // L: 127
		var2.size = var0.readUnsignedByte(); // L: 128
		var2.id = var0.readInt(); // L: 129
		var2.operations = new int[var2.size]; // L: 130
		var2.creationErrors = new int[var2.size]; // L: 131
		var2.fields = new Field[var2.size]; // L: 132
		var2.intReplaceValues = new int[var2.size]; // L: 133
		var2.methods = new Method[var2.size]; // L: 134
		var2.arguments = new byte[var2.size][][]; // L: 135

		for (int var3 = 0; var3 < var2.size; ++var3) { // L: 136
			try {
				int var4 = var0.readUnsignedByte(); // L: 138
				String var5;
				String var6;
				int var7;
				if (var4 != 0 && var4 != 1 && var4 != 2) { // L: 139
					if (var4 == 3 || var4 == 4) { // L: 149
						var5 = var0.readStringCp1252NullTerminated(); // L: 150
						var6 = var0.readStringCp1252NullTerminated(); // L: 151
						var7 = var0.readUnsignedByte(); // L: 152
						String[] var8 = new String[var7]; // L: 153

						for (int var9 = 0; var9 < var7; ++var9) { // L: 154
							var8[var9] = var0.readStringCp1252NullTerminated();
						}

						String var20 = var0.readStringCp1252NullTerminated(); // L: 155
						byte[][] var10 = new byte[var7][]; // L: 156
						int var12;
						if (var4 == 3) { // L: 157
							for (int var11 = 0; var11 < var7; ++var11) { // L: 158
								var12 = var0.readInt(); // L: 159
								var10[var11] = new byte[var12]; // L: 160
								var0.readBytes(var10[var11], 0, var12); // L: 161
							}
						}

						var2.operations[var3] = var4; // L: 164
						Class[] var21 = new Class[var7]; // L: 165

						for (var12 = 0; var12 < var7; ++var12) { // L: 166
							var21[var12] = ItemLayer.loadClassFromDescriptor(var8[var12]);
						}

						Class var22 = ItemLayer.loadClassFromDescriptor(var20); // L: 167
						if (ItemLayer.loadClassFromDescriptor(var5).getClassLoader() == null) { // L: 168
							throw new SecurityException();
						}

						Method[] var13 = ItemLayer.loadClassFromDescriptor(var5).getDeclaredMethods(); // L: 169
						Method[] var14 = var13; // L: 171

						for (int var15 = 0; var15 < var14.length; ++var15) { // L: 172
							Method var16 = var14[var15]; // L: 173
							if (Reflection.getMethodName(var16).equals(var6)) { // L: 175
								Class[] var17 = Reflection.getParameterTypes(var16); // L: 176
								if (var17.length == var21.length) { // L: 177
									boolean var18 = true; // L: 178

									for (int var19 = 0; var19 < var21.length; ++var19) { // L: 179
										if (var21[var19] != var17[var19]) { // L: 180
											var18 = false; // L: 181
											break; // L: 182
										}
									}

									if (var18 && var22 == var16.getReturnType()) { // L: 185
										var2.methods[var3] = var16; // L: 186
									}
								}
							}
						}

						var2.arguments[var3] = var10; // L: 193
					}
				} else {
					var5 = var0.readStringCp1252NullTerminated(); // L: 140
					var6 = var0.readStringCp1252NullTerminated(); // L: 141
					var7 = 0; // L: 142
					if (var4 == 1) { // L: 143
						var7 = var0.readInt();
					}

					var2.operations[var3] = var4; // L: 144
					var2.intReplaceValues[var3] = var7; // L: 145
					if (ItemLayer.loadClassFromDescriptor(var5).getClassLoader() == null) { // L: 146
						throw new SecurityException();
					}

					var2.fields[var3] = Reflection.findField(ItemLayer.loadClassFromDescriptor(var5), var6); // L: 147
				}
			} catch (ClassNotFoundException var24) { // L: 196
				var2.creationErrors[var3] = -1; // L: 197
			} catch (SecurityException var25) { // L: 199
				var2.creationErrors[var3] = -2; // L: 200
			} catch (NullPointerException var26) { // L: 202
				var2.creationErrors[var3] = -3; // L: 203
			} catch (Exception var27) { // L: 205
				var2.creationErrors[var3] = -4; // L: 206
			} catch (Throwable var28) { // L: 208
				var2.creationErrors[var3] = -5; // L: 209
			}
		}

		class36.reflectionChecks.addFirst(var2); // L: 212
	} // L: 213
}
