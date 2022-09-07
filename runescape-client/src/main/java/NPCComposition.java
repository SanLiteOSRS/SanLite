import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fj")
@Implements("NPCComposition")
public class NPCComposition extends DualNode {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("NpcDefinition_archive")
	static AbstractArchive NpcDefinition_archive;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("NpcDefinition_modelArchive")
	static AbstractArchive NpcDefinition_modelArchive;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("NpcDefinition_cached")
	static EvictingDualNodeHashTable NpcDefinition_cached;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("NpcDefinition_cachedModels")
	static EvictingDualNodeHashTable NpcDefinition_cachedModels;
	@ObfuscatedName("ps")
	@ObfuscatedGetter(
		intValue = 1707906409
	)
	@Export("widgetDragDuration")
	static int widgetDragDuration;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -350863249
	)
	@Export("id")
	public int id;
	@ObfuscatedName("q")
	@Export("name")
	public String name;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1339905335
	)
	@Export("size")
	public int size;
	@ObfuscatedName("k")
	@Export("models")
	int[] models;
	@ObfuscatedName("o")
	int[] field1916;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 683972011
	)
	@Export("idleSequence")
	public int idleSequence;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1751739551
	)
	@Export("turnLeftSequence")
	public int turnLeftSequence;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1593832419
	)
	@Export("turnRightSequence")
	public int turnRightSequence;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1906728429
	)
	@Export("walkSequence")
	public int walkSequence;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 746107445
	)
	@Export("walkBackSequence")
	public int walkBackSequence;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -5276589
	)
	@Export("walkLeftSequence")
	public int walkLeftSequence;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 386176907
	)
	@Export("walkRightSequence")
	public int walkRightSequence;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 2084863299
	)
	public int field1914;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1996379429
	)
	public int field1919;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1437262857
	)
	public int field1918;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 290637331
	)
	public int field1938;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -159729975
	)
	public int field1920;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -320262815
	)
	public int field1933;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -423611445
	)
	public int field1922;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -880190441
	)
	public int field1923;
	@ObfuscatedName("j")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("g")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("ar")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("aq")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("av")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("aj")
	@Export("drawMapDot")
	public boolean drawMapDot;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -292859821
	)
	@Export("combatLevel")
	public int combatLevel;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 229011133
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1716714027
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("au")
	@Export("isVisible")
	public boolean isVisible;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1984237137
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1046943337
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1283027553
	)
	@Export("headIconPrayer")
	public int headIconPrayer;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 57880073
	)
	@Export("rotation")
	public int rotation;
	@ObfuscatedName("ad")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1171786609
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -586469401
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("ai")
	@Export("isInteractable")
	public boolean isInteractable;
	@ObfuscatedName("ap")
	@Export("isClickable")
	public boolean isClickable;
	@ObfuscatedName("az")
	@Export("isFollower")
	public boolean isFollower;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		NpcDefinition_cached = new EvictingDualNodeHashTable(64); // L: 18
		NpcDefinition_cachedModels = new EvictingDualNodeHashTable(50); // L: 19
	}

	NPCComposition() {
		this.name = "null"; // L: 21
		this.size = 1; // L: 22
		this.idleSequence = -1; // L: 25
		this.turnLeftSequence = -1; // L: 26
		this.turnRightSequence = -1; // L: 27
		this.walkSequence = -1; // L: 28
		this.walkBackSequence = -1; // L: 29
		this.walkLeftSequence = -1; // L: 30
		this.walkRightSequence = -1; // L: 31
		this.field1914 = -1; // L: 32
		this.field1919 = -1; // L: 33
		this.field1918 = -1; // L: 34
		this.field1938 = -1; // L: 35
		this.field1920 = -1; // L: 36
		this.field1933 = -1; // L: 37
		this.field1922 = -1; // L: 38
		this.field1923 = -1; // L: 39
		this.actions = new String[5]; // L: 44
		this.drawMapDot = true; // L: 45
		this.combatLevel = -1; // L: 46
		this.widthScale = 128; // L: 47
		this.heightScale = 128; // L: 48
		this.isVisible = false; // L: 49
		this.ambient = 0; // L: 50
		this.contrast = 0; // L: 51
		this.headIconPrayer = -1; // L: 52
		this.rotation = 32; // L: 53
		this.transformVarbit = -1; // L: 55
		this.transformVarp = -1; // L: 56
		this.isInteractable = true; // L: 57
		this.isClickable = true; // L: 58
		this.isFollower = false; // L: 59
	} // L: 62

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "107"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 81

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "2086235428"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 85
			if (var2 == 0) { // L: 86
				return; // L: 89
			}

			this.decodeNext(var1, var2); // L: 87
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqr;II)V",
		garbageValue = "573110602"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) { // L: 92
			var3 = var1.readUnsignedByte(); // L: 93
			this.models = new int[var3]; // L: 94

			for (var4 = 0; var4 < var3; ++var4) { // L: 95
				this.models[var4] = var1.readUnsignedShort();
			}
		} else if (var2 == 2) { // L: 97
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 12) { // L: 98
			this.size = var1.readUnsignedByte();
		} else if (var2 == 13) { // L: 99
			this.idleSequence = var1.readUnsignedShort();
		} else if (var2 == 14) { // L: 100
			this.walkSequence = var1.readUnsignedShort();
		} else if (var2 == 15) { // L: 101
			this.turnLeftSequence = var1.readUnsignedShort();
		} else if (var2 == 16) { // L: 102
			this.turnRightSequence = var1.readUnsignedShort();
		} else if (var2 == 17) { // L: 103
			this.walkSequence = var1.readUnsignedShort(); // L: 104
			this.walkBackSequence = var1.readUnsignedShort(); // L: 105
			this.walkLeftSequence = var1.readUnsignedShort(); // L: 106
			this.walkRightSequence = var1.readUnsignedShort(); // L: 107
		} else if (var2 == 18) { // L: 109
			var1.readUnsignedShort(); // L: 110
		} else if (var2 >= 30 && var2 < 35) { // L: 112
			this.actions[var2 - 30] = var1.readStringCp1252NullTerminated(); // L: 113
			if (this.actions[var2 - 30].equalsIgnoreCase("Hidden")) { // L: 114
				this.actions[var2 - 30] = null;
			}
		} else if (var2 == 40) { // L: 116
			var3 = var1.readUnsignedByte(); // L: 117
			this.recolorFrom = new short[var3]; // L: 118
			this.recolorTo = new short[var3]; // L: 119

			for (var4 = 0; var4 < var3; ++var4) { // L: 120
				this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 121
				this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 122
			}
		} else if (var2 == 41) { // L: 125
			var3 = var1.readUnsignedByte(); // L: 126
			this.retextureFrom = new short[var3]; // L: 127
			this.retextureTo = new short[var3]; // L: 128

			for (var4 = 0; var4 < var3; ++var4) { // L: 129
				this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 130
				this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 131
			}
		} else if (var2 == 60) { // L: 134
			var3 = var1.readUnsignedByte(); // L: 135
			this.field1916 = new int[var3]; // L: 136

			for (var4 = 0; var4 < var3; ++var4) { // L: 137
				this.field1916[var4] = var1.readUnsignedShort();
			}
		} else if (var2 == 93) { // L: 139
			this.drawMapDot = false;
		} else if (var2 == 95) { // L: 140
			this.combatLevel = var1.readUnsignedShort();
		} else if (var2 == 97) { // L: 141
			this.widthScale = var1.readUnsignedShort();
		} else if (var2 == 98) { // L: 142
			this.heightScale = var1.readUnsignedShort();
		} else if (var2 == 99) { // L: 143
			this.isVisible = true;
		} else if (var2 == 100) { // L: 144
			this.ambient = var1.readByte();
		} else if (var2 == 101) { // L: 145
			this.contrast = var1.readByte();
		} else if (var2 == 102) { // L: 146
			this.headIconPrayer = var1.readUnsignedShort();
		} else if (var2 == 103) { // L: 147
			this.rotation = var1.readUnsignedShort();
		} else if (var2 != 106 && var2 != 118) { // L: 148
			if (var2 == 107) { // L: 166
				this.isInteractable = false;
			} else if (var2 == 109) { // L: 167
				this.isClickable = false;
			} else if (var2 == 111) { // L: 168
				this.isFollower = true;
			} else if (var2 == 114) { // L: 169
				this.field1914 = var1.readUnsignedShort();
			} else if (var2 == 115) { // L: 170
				this.field1914 = var1.readUnsignedShort(); // L: 171
				this.field1919 = var1.readUnsignedShort(); // L: 172
				this.field1918 = var1.readUnsignedShort(); // L: 173
				this.field1938 = var1.readUnsignedShort(); // L: 174
			} else if (var2 == 116) { // L: 176
				this.field1920 = var1.readUnsignedShort();
			} else if (var2 == 117) { // L: 177
				this.field1920 = var1.readUnsignedShort(); // L: 178
				this.field1933 = var1.readUnsignedShort(); // L: 179
				this.field1922 = var1.readUnsignedShort(); // L: 180
				this.field1923 = var1.readUnsignedShort(); // L: 181
			} else if (var2 == 249) { // L: 183
				this.params = World.readStringIntParameters(var1, this.params);
			}
		} else {
			this.transformVarbit = var1.readUnsignedShort(); // L: 149
			if (this.transformVarbit == 65535) { // L: 150
				this.transformVarbit = -1;
			}

			this.transformVarp = var1.readUnsignedShort(); // L: 151
			if (this.transformVarp == 65535) { // L: 152
				this.transformVarp = -1;
			}

			var3 = -1; // L: 153
			if (var2 == 118) { // L: 154
				var3 = var1.readUnsignedShort(); // L: 155
				if (var3 == 65535) { // L: 156
					var3 = -1;
				}
			}

			var4 = var1.readUnsignedByte(); // L: 158
			this.transforms = new int[var4 + 2]; // L: 159

			for (int var5 = 0; var5 <= var4; ++var5) { // L: 160
				this.transforms[var5] = var1.readUnsignedShort(); // L: 161
				if (this.transforms[var5] == 65535) { // L: 162
					this.transforms[var5] = -1;
				}
			}

			this.transforms[var4 + 1] = var3; // L: 164
		}

	} // L: 185

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lgh;ILgh;II)Lhp;",
		garbageValue = "595465680"
	)
	@Export("getModel")
	public final Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.transforms != null) { // L: 188
			NPCComposition var12 = this.transform();
			return var12 == null ? null : var12.getModel(var1, var2, var3, var4); // L: 190 191
		} else {
			Model var5 = (Model)NpcDefinition_cachedModels.get((long)this.id); // L: 193
			if (var5 == null) { // L: 194
				boolean var6 = false; // L: 195

				for (int var7 = 0; var7 < this.models.length; ++var7) { // L: 196
					if (!NpcDefinition_modelArchive.tryLoadFile(this.models[var7], 0)) {
						var6 = true;
					}
				}

				if (var6) { // L: 197
					return null;
				}

				ModelData[] var8 = new ModelData[this.models.length]; // L: 199

				int var9;
				for (var9 = 0; var9 < this.models.length; ++var9) { // L: 200
					var8[var9] = ModelData.ModelData_get(NpcDefinition_modelArchive, this.models[var9], 0);
				}

				ModelData var10;
				if (var8.length == 1) { // L: 201
					var10 = var8[0];
				} else {
					var10 = new ModelData(var8, var8.length); // L: 202
				}

				if (this.recolorFrom != null) { // L: 203
					for (var9 = 0; var9 < this.recolorFrom.length; ++var9) { // L: 204
						var10.recolor(this.recolorFrom[var9], this.recolorTo[var9]); // L: 205
					}
				}

				if (this.retextureFrom != null) { // L: 208
					for (var9 = 0; var9 < this.retextureFrom.length; ++var9) { // L: 209
						var10.retexture(this.retextureFrom[var9], this.retextureTo[var9]); // L: 210
					}
				}

				var5 = var10.toModel(this.ambient + 64, this.contrast * 5 + 850, -30, -50, -30); // L: 213
				NpcDefinition_cachedModels.put(var5, (long)this.id); // L: 214
			}

			Model var11;
			if (var1 != null && var3 != null) { // L: 217
				var11 = var1.applyTransformations(var5, var2, var3, var4);
			} else if (var1 != null) { // L: 218
				var11 = var1.transformActorModel(var5, var2);
			} else if (var3 != null) { // L: 219
				var11 = var3.transformActorModel(var5, var4);
			} else {
				var11 = var5.toSharedSequenceModel(true); // L: 220
			}

			if (this.widthScale != 128 || this.heightScale != 128) { // L: 221
				var11.scale(this.widthScale, this.heightScale, this.widthScale);
			}

			return var11; // L: 222
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Lgp;",
		garbageValue = "1880798345"
	)
	@Export("getModelData")
	public final ModelData getModelData() {
		if (this.transforms != null) { // L: 226
			NPCComposition var7 = this.transform(); // L: 227
			return var7 == null ? null : var7.getModelData(); // L: 228 229
		} else if (this.field1916 == null) { // L: 231
			return null;
		} else {
			boolean var1 = false; // L: 232

			for (int var2 = 0; var2 < this.field1916.length; ++var2) { // L: 233
				if (!NpcDefinition_modelArchive.tryLoadFile(this.field1916[var2], 0)) {
					var1 = true;
				}
			}

			if (var1) { // L: 234
				return null;
			} else {
				ModelData[] var5 = new ModelData[this.field1916.length]; // L: 235

				for (int var3 = 0; var3 < this.field1916.length; ++var3) { // L: 236
					var5[var3] = ModelData.ModelData_get(NpcDefinition_modelArchive, this.field1916[var3], 0);
				}

				ModelData var6;
				if (var5.length == 1) {
					var6 = var5[0]; // L: 238
				} else {
					var6 = new ModelData(var5, var5.length); // L: 239
				}

				int var4;
				if (this.recolorFrom != null) { // L: 240
					for (var4 = 0; var4 < this.recolorFrom.length; ++var4) { // L: 241
						var6.recolor(this.recolorFrom[var4], this.recolorTo[var4]); // L: 242
					}
				}

				if (this.retextureFrom != null) { // L: 245
					for (var4 = 0; var4 < this.retextureFrom.length; ++var4) { // L: 246
						var6.retexture(this.retextureFrom[var4], this.retextureTo[var4]); // L: 247
					}
				}

				return var6; // L: 250
			}
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Lfj;",
		garbageValue = "-1704989289"
	)
	@Export("transform")
	public final NPCComposition transform() {
		int var1 = -1; // L: 254
		if (this.transformVarbit != -1) { // L: 255
			var1 = class133.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 256
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 258
			var2 = this.transforms[var1]; // L: 259
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class119.getNpcDefinition(var2) : null; // L: 260 261
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1169114466"
	)
	@Export("transformIsVisible")
	public boolean transformIsVisible() {
		if (this.transforms == null) { // L: 265
			return true;
		} else {
			int var1 = -1; // L: 266
			if (this.transformVarbit != -1) { // L: 267
				var1 = class133.getVarbit(this.transformVarbit);
			} else if (this.transformVarp != -1) { // L: 268
				var1 = Varps.Varps_main[this.transformVarp];
			}

			if (var1 >= 0 && var1 < this.transforms.length) { // L: 269
				return this.transforms[var1] != -1; // L: 270
			} else {
				return this.transforms[this.transforms.length - 1] != -1;
			}
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "16"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return ScriptFrame.method1035(this.params, var1, var2); // L: 274
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "808814033"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class132.method2837(this.params, var1, var2); // L: 278
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "387124540"
	)
	public static String method3410(CharSequence var0) {
		return WorldMapRegion.method4713('*', var0.length()); // L: 189
	}
}
