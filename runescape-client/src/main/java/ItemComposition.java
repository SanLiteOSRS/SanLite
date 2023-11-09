import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gr")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	@Export("ItemComposition_archive")
	static AbstractArchive ItemComposition_archive;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 76789185
	)
	@Export("ItemComposition_fileCount")
	public static int ItemComposition_fileCount;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("ItemComposition_cached")
	public static EvictingDualNodeHashTable ItemComposition_cached;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("ItemComposition_cachedModels")
	public static EvictingDualNodeHashTable ItemComposition_cachedModels;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("ItemComposition_cachedSprites")
	public static EvictingDualNodeHashTable ItemComposition_cachedSprites;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1037666267
	)
	@Export("id")
	public int id;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -79179159
	)
	@Export("model")
	int model;
	@ObfuscatedName("k")
	@Export("name")
	public String name;
	@ObfuscatedName("a")
	@Export("recolorFrom")
	public short[] recolorFrom;
	@ObfuscatedName("s")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("l")
	@Export("retextureFrom")
	public short[] retextureFrom;
	@ObfuscatedName("t")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -2078238987
	)
	@Export("zoom2d")
	public int zoom2d;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -809487997
	)
	@Export("xan2d")
	public int xan2d;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1148033667
	)
	@Export("yan2d")
	public int yan2d;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -897636777
	)
	@Export("zan2d")
	public int zan2d;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1913553153
	)
	@Export("offsetX2d")
	public int offsetX2d;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1827536133
	)
	@Export("offsetY2d")
	public int offsetY2d;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1304719979
	)
	@Export("isStackable")
	public int isStackable;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1868181119
	)
	@Export("price")
	public int price;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -712207729
	)
	@Export("maleModel")
	public int maleModel;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1461262497
	)
	@Export("maleModel1")
	public int maleModel1;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1198196015
	)
	@Export("maleModel2")
	public int maleModel2;
	@ObfuscatedName("au")
	@Export("isMembersOnly")
	public boolean isMembersOnly;
	@ObfuscatedName("ar")
	@Export("groundActions")
	public String[] groundActions;
	@ObfuscatedName("at")
	@Export("inventoryActions")
	public String[] inventoryActions;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -573326147
	)
	@Export("shiftClickIndex")
	int shiftClickIndex;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1310935043
	)
	@Export("femaleModel")
	int femaleModel;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -136305627
	)
	@Export("femaleModel1")
	int femaleModel1;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -840315209
	)
	@Export("femaleOffset")
	int femaleOffset;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -381342235
	)
	@Export("maleHeadModel")
	int maleHeadModel;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -954860879
	)
	@Export("maleHeadModel2")
	int maleHeadModel2;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 482374965
	)
	int field2204;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -428507273
	)
	@Export("femaleModel2")
	int femaleModel2;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 740482477
	)
	@Export("femaleHeadModel")
	int femaleHeadModel;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1566002253
	)
	@Export("femaleHeadModel2")
	int femaleHeadModel2;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1042908255
	)
	int field2243;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1329405317
	)
	int field2244;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1923047899
	)
	int field2245;
	@ObfuscatedName("ap")
	@Export("countobj")
	int[] countobj;
	@ObfuscatedName("aa")
	@Export("countco")
	int[] countco;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -590505645
	)
	@Export("note")
	public int note;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1058213631
	)
	@Export("noteTemplate")
	public int noteTemplate;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 594389235
	)
	@Export("resizeX")
	int resizeX;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 1646343287
	)
	@Export("resizeY")
	int resizeY;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -99918107
	)
	@Export("resizeZ")
	int resizeZ;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -1743952543
	)
	public int field2209;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 298604473
	)
	public int field2222;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -1347495133
	)
	@Export("team")
	public int team;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 64152289
	)
	public int field2224;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("bl")
	@Export("isTradable")
	public boolean isTradable;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -111748635
	)
	@Export("unnotedId")
	int unnotedId;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 15600059
	)
	@Export("notedId")
	int notedId;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 420233559
	)
	@Export("placeholder")
	public int placeholder;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 628149203
	)
	@Export("placeholderTemplate")
	public int placeholderTemplate;

	static {
		ItemComposition_cached = new EvictingDualNodeHashTable(64); // L: 28
		ItemComposition_cachedModels = new EvictingDualNodeHashTable(50); // L: 29
		ItemComposition_cachedSprites = new EvictingDualNodeHashTable(200); // L: 30
	}

	ItemComposition() {
		this.name = "null"; // L: 34
		this.zoom2d = 2000; // L: 39
		this.xan2d = 0; // L: 40
		this.yan2d = 0; // L: 41
		this.zan2d = 0; // L: 42
		this.offsetX2d = 0; // L: 43
		this.offsetY2d = 0; // L: 44
		this.isStackable = 0; // L: 45
		this.price = 1; // L: 46
		this.maleModel = -1; // L: 47
		this.maleModel1 = -1; // L: 48
		this.maleModel2 = -1; // L: 49
		this.isMembersOnly = false; // L: 50
		this.groundActions = new String[]{null, null, "Take", null, null}; // L: 51
		this.inventoryActions = new String[]{null, null, null, null, "Drop"}; // L: 52
		this.shiftClickIndex = -2; // L: 54
		this.femaleModel = -1; // L: 55
		this.femaleModel1 = -1; // L: 56
		this.femaleOffset = 0; // L: 57
		this.maleHeadModel = -1; // L: 58
		this.maleHeadModel2 = -1; // L: 59
		this.field2204 = 0; // L: 60
		this.femaleModel2 = -1; // L: 61
		this.femaleHeadModel = -1; // L: 62
		this.femaleHeadModel2 = -1; // L: 63
		this.field2243 = -1; // L: 64
		this.field2244 = -1; // L: 65
		this.field2245 = -1; // L: 66
		this.note = -1; // L: 69
		this.noteTemplate = -1; // L: 70
		this.resizeX = 128; // L: 71
		this.resizeY = 128; // L: 72
		this.resizeZ = 128; // L: 73
		this.field2209 = 0; // L: 74
		this.field2222 = 0; // L: 75
		this.team = 0; // L: 76
		this.field2224 = 0; // L: 77
		this.isTradable = false; // L: 79
		this.unnotedId = -1; // L: 80
		this.notedId = -1; // L: 81
		this.placeholder = -1; // L: 82
		this.placeholderTemplate = -1; // L: 83
	} // L: 85

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "564451612"
	)
	@Export("post")
	void post() {
		if (this.isStackable == 1) { // L: 134
			this.field2224 = 0;
		}

	} // L: 135

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lqy;I)V",
		garbageValue = "-843301513"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 139
			if (var2 == 0) { // L: 140
				return; // L: 143
			}

			this.decodeNext(var1, var2); // L: 141
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lqy;II)V",
		garbageValue = "-538153010"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 146
			this.model = var1.readUnsignedShort();
		} else if (var2 == 2) { // L: 147
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 148
			this.zoom2d = var1.readUnsignedShort();
		} else if (var2 == 5) { // L: 149
			this.xan2d = var1.readUnsignedShort();
		} else if (var2 == 6) { // L: 150
			this.yan2d = var1.readUnsignedShort();
		} else if (var2 == 7) { // L: 151
			this.offsetX2d = var1.readUnsignedShort(); // L: 152
			if (this.offsetX2d > 32767) { // L: 153
				this.offsetX2d -= 65536;
			}
		} else if (var2 == 8) { // L: 155
			this.offsetY2d = var1.readUnsignedShort(); // L: 156
			if (this.offsetY2d > 32767) { // L: 157
				this.offsetY2d -= 65536;
			}
		} else if (var2 == 9) { // L: 159
			var1.readStringCp1252NullTerminated(); // L: 160
		} else if (var2 == 11) { // L: 162
			this.isStackable = 1;
		} else if (var2 == 12) { // L: 163
			this.price = var1.readInt();
		} else if (var2 == 13) { // L: 164
			this.maleModel = var1.readUnsignedByte();
		} else if (var2 == 14) { // L: 165
			this.maleModel1 = var1.readUnsignedByte();
		} else if (var2 == 16) { // L: 166
			this.isMembersOnly = true;
		} else if (var2 == 23) { // L: 167
			this.femaleModel = var1.readUnsignedShort(); // L: 168
			this.femaleOffset = var1.readUnsignedByte(); // L: 169
		} else if (var2 == 24) { // L: 171
			this.femaleModel1 = var1.readUnsignedShort();
		} else if (var2 == 25) { // L: 172
			this.maleHeadModel = var1.readUnsignedShort(); // L: 173
			this.field2204 = var1.readUnsignedByte(); // L: 174
		} else if (var2 == 26) { // L: 176
			this.maleHeadModel2 = var1.readUnsignedShort();
		} else if (var2 == 27) { // L: 177
			this.maleModel2 = var1.readUnsignedByte();
		} else if (var2 >= 30 && var2 < 35) { // L: 178
			this.groundActions[var2 - 30] = var1.readStringCp1252NullTerminated(); // L: 179
			if (this.groundActions[var2 - 30].equalsIgnoreCase("Hidden")) { // L: 180
				this.groundActions[var2 - 30] = null;
			}
		} else if (var2 >= 35 && var2 < 40) { // L: 182
			this.inventoryActions[var2 - 35] = var1.readStringCp1252NullTerminated();
		} else {
			int var3;
			int var4;
			if (var2 == 40) { // L: 183
				var3 = var1.readUnsignedByte(); // L: 184
				this.recolorFrom = new short[var3]; // L: 185
				this.recolorTo = new short[var3]; // L: 186

				for (var4 = 0; var4 < var3; ++var4) { // L: 187
					this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 188
					this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 189
				}
			} else if (var2 == 41) { // L: 192
				var3 = var1.readUnsignedByte(); // L: 193
				this.retextureFrom = new short[var3]; // L: 194
				this.retextureTo = new short[var3]; // L: 195

				for (var4 = 0; var4 < var3; ++var4) { // L: 196
					this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 197
					this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 198
				}
			} else if (var2 == 42) { // L: 201
				this.shiftClickIndex = var1.readByte(); // L: 202
			} else if (var2 == 65) { // L: 204
				this.isTradable = true;
			} else if (var2 == 75) { // L: 205
				this.field2224 = var1.readShort();
			} else if (var2 == 78) { // L: 206
				this.femaleModel2 = var1.readUnsignedShort();
			} else if (var2 == 79) { // L: 207
				this.femaleHeadModel = var1.readUnsignedShort();
			} else if (var2 == 90) { // L: 208
				this.femaleHeadModel2 = var1.readUnsignedShort();
			} else if (var2 == 91) {
				this.field2244 = var1.readUnsignedShort(); // L: 209
			} else if (var2 == 92) { // L: 210
				this.field2243 = var1.readUnsignedShort();
			} else if (var2 == 93) { // L: 211
				this.field2245 = var1.readUnsignedShort();
			} else if (var2 == 94) { // L: 212
				var1.readUnsignedShort(); // L: 213
			} else if (var2 == 95) { // L: 215
				this.zan2d = var1.readUnsignedShort();
			} else if (var2 == 97) { // L: 216
				this.note = var1.readUnsignedShort();
			} else if (var2 == 98) { // L: 217
				this.noteTemplate = var1.readUnsignedShort();
			} else if (var2 >= 100 && var2 < 110) { // L: 218
				if (this.countobj == null) { // L: 219
					this.countobj = new int[10]; // L: 220
					this.countco = new int[10]; // L: 221
				}

				this.countobj[var2 - 100] = var1.readUnsignedShort(); // L: 223
				this.countco[var2 - 100] = var1.readUnsignedShort(); // L: 224
			} else if (var2 == 110) { // L: 226
				this.resizeX = var1.readUnsignedShort();
			} else if (var2 == 111) { // L: 227
				this.resizeY = var1.readUnsignedShort();
			} else if (var2 == 112) { // L: 228
				this.resizeZ = var1.readUnsignedShort();
			} else if (var2 == 113) { // L: 229
				this.field2209 = var1.readByte();
			} else if (var2 == 114) { // L: 230
				this.field2222 = var1.readByte() * 5;
			} else if (var2 == 115) { // L: 231
				this.team = var1.readUnsignedByte();
			} else if (var2 == 139) { // L: 232
				this.unnotedId = var1.readUnsignedShort();
			} else if (var2 == 140) { // L: 233
				this.notedId = var1.readUnsignedShort();
			} else if (var2 == 148) { // L: 234
				this.placeholder = var1.readUnsignedShort();
			} else if (var2 == 149) { // L: 235
				this.placeholderTemplate = var1.readUnsignedShort();
			} else if (var2 == 249) { // L: 236
				this.params = DynamicObject.readStringIntParameters(var1, this.params);
			}
		}

	} // L: 238

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lgr;Lgr;B)V",
		garbageValue = "4"
	)
	@Export("genCert")
	void genCert(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model; // L: 241
		this.zoom2d = var1.zoom2d; // L: 242
		this.xan2d = var1.xan2d; // L: 243
		this.yan2d = var1.yan2d; // L: 244
		this.zan2d = var1.zan2d; // L: 245
		this.offsetX2d = var1.offsetX2d; // L: 246
		this.offsetY2d = var1.offsetY2d; // L: 247
		this.recolorFrom = var1.recolorFrom; // L: 248
		this.recolorTo = var1.recolorTo; // L: 249
		this.retextureFrom = var1.retextureFrom; // L: 250
		this.retextureTo = var1.retextureTo; // L: 251
		this.name = var2.name; // L: 252
		this.isMembersOnly = var2.isMembersOnly; // L: 253
		this.price = var2.price; // L: 254
		this.isStackable = 1; // L: 255
	} // L: 256

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lgr;Lgr;I)V",
		garbageValue = "-177814985"
	)
	@Export("genBought")
	void genBought(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model; // L: 259
		this.zoom2d = var1.zoom2d; // L: 260
		this.xan2d = var1.xan2d; // L: 261
		this.yan2d = var1.yan2d; // L: 262
		this.zan2d = var1.zan2d; // L: 263
		this.offsetX2d = var1.offsetX2d; // L: 264
		this.offsetY2d = var1.offsetY2d; // L: 265
		this.recolorFrom = var2.recolorFrom; // L: 266
		this.recolorTo = var2.recolorTo; // L: 267
		this.retextureFrom = var2.retextureFrom; // L: 268
		this.retextureTo = var2.retextureTo; // L: 269
		this.name = var2.name; // L: 270
		this.isMembersOnly = var2.isMembersOnly; // L: 271
		this.isStackable = var2.isStackable; // L: 272
		this.maleModel = var2.maleModel; // L: 273
		this.maleModel1 = var2.maleModel1; // L: 274
		this.maleModel2 = var2.maleModel2; // L: 275
		this.femaleModel = var2.femaleModel; // L: 276
		this.femaleModel1 = var2.femaleModel1; // L: 277
		this.femaleModel2 = var2.femaleModel2; // L: 278
		this.maleHeadModel = var2.maleHeadModel; // L: 279
		this.maleHeadModel2 = var2.maleHeadModel2; // L: 280
		this.femaleHeadModel = var2.femaleHeadModel; // L: 281
		this.femaleHeadModel2 = var2.femaleHeadModel2; // L: 282
		this.field2243 = var2.field2243; // L: 283
		this.field2244 = var2.field2244; // L: 284
		this.field2245 = var2.field2245; // L: 285
		this.team = var2.team; // L: 286
		this.groundActions = var2.groundActions; // L: 287
		this.field2224 = var2.field2224; // L: 288
		this.inventoryActions = new String[5]; // L: 289
		if (var2.inventoryActions != null) {
			for (int var3 = 0; var3 < 4; ++var3) { // L: 290
				this.inventoryActions[var3] = var2.inventoryActions[var3];
			}
		}

		this.inventoryActions[4] = "Discard"; // L: 291
		this.price = 0; // L: 292
	} // L: 293

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lgr;Lgr;B)V",
		garbageValue = "39"
	)
	@Export("genPlaceholder")
	void genPlaceholder(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model; // L: 296
		this.zoom2d = var1.zoom2d; // L: 297
		this.xan2d = var1.xan2d; // L: 298
		this.yan2d = var1.yan2d; // L: 299
		this.zan2d = var1.zan2d; // L: 300
		this.offsetX2d = var1.offsetX2d; // L: 301
		this.offsetY2d = var1.offsetY2d; // L: 302
		this.recolorFrom = var1.recolorFrom; // L: 303
		this.recolorTo = var1.recolorTo; // L: 304
		this.retextureFrom = var1.retextureFrom; // L: 305
		this.retextureTo = var1.retextureTo; // L: 306
		this.isStackable = var1.isStackable; // L: 307
		this.name = var2.name; // L: 308
		this.price = 0; // L: 309
		this.isMembersOnly = false; // L: 310
		this.isTradable = false; // L: 311
	} // L: 312

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgi;",
		garbageValue = "41"
	)
	@Export("getModelData")
	public final ModelData getModelData(int var1) {
		int var3;
		if (this.countobj != null && var1 > 1) { // L: 315
			int var2 = -1; // L: 316

			for (var3 = 0; var3 < 10; ++var3) { // L: 317
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) { // L: 318
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) { // L: 320
				return NPCComposition.ItemComposition_get(var2).getModelData(1);
			}
		}

		ModelData var4 = ModelData.ModelData_get(class306.ItemComposition_modelArchive, this.model, 0); // L: 322
		if (var4 == null) { // L: 323
			return null;
		} else {
			if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) { // L: 324
				var4.resize(this.resizeX, this.resizeY, this.resizeZ);
			}

			if (this.recolorFrom != null) { // L: 325
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) { // L: 326
					var4.recolor(this.recolorFrom[var3], this.recolorTo[var3]); // L: 327
				}
			}

			if (this.retextureFrom != null) { // L: 330
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) { // L: 331
					var4.retexture(this.retextureFrom[var3], this.retextureTo[var3]); // L: 332
				}
			}

			return var4; // L: 335
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)Lhh;",
		garbageValue = "-1531762399"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		if (this.countobj != null && var1 > 1) { // L: 339
			int var2 = -1; // L: 340

			for (int var3 = 0; var3 < 10; ++var3) { // L: 341
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) { // L: 342
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) { // L: 344
				return NPCComposition.ItemComposition_get(var2).getModel(1);
			}
		}

		Model var5 = (Model)ItemComposition_cachedModels.get((long)this.id); // L: 346
		if (var5 != null) { // L: 347
			return var5;
		} else {
			ModelData var6 = ModelData.ModelData_get(class306.ItemComposition_modelArchive, this.model, 0); // L: 348
			if (var6 == null) { // L: 349
				return null;
			} else {
				if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) { // L: 350
					var6.resize(this.resizeX, this.resizeY, this.resizeZ);
				}

				int var4;
				if (this.recolorFrom != null) { // L: 351
					for (var4 = 0; var4 < this.recolorFrom.length; ++var4) { // L: 352
						var6.recolor(this.recolorFrom[var4], this.recolorTo[var4]); // L: 353
					}
				}

				if (this.retextureFrom != null) { // L: 356
					for (var4 = 0; var4 < this.retextureFrom.length; ++var4) { // L: 357
						var6.retexture(this.retextureFrom[var4], this.retextureTo[var4]); // L: 358
					}
				}

				var5 = var6.toModel(this.field2209 + 64, this.field2222 + 768, -50, -10, -50); // L: 361
				var5.isSingleTile = true; // L: 362
				ItemComposition_cachedModels.put(var5, (long)this.id); // L: 363
				return var5; // L: 364
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)Lgr;",
		garbageValue = "-542069787"
	)
	@Export("getCountObj")
	public ItemComposition getCountObj(int var1) {
		if (this.countobj != null && var1 > 1) { // L: 368
			int var2 = -1; // L: 369

			for (int var3 = 0; var3 < 10; ++var3) { // L: 370
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) { // L: 371
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) { // L: 373
				return NPCComposition.ItemComposition_get(var2);
			}
		}

		return this; // L: 375
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "187316858"
	)
	public final boolean method3933(int var1) {
		int var2 = this.femaleModel; // L: 453
		int var3 = this.femaleModel1; // L: 454
		int var4 = this.femaleModel2; // L: 455
		if (var1 == 1) { // L: 456
			var2 = this.maleHeadModel; // L: 457
			var3 = this.maleHeadModel2; // L: 458
			var4 = this.femaleHeadModel; // L: 459
		}

		if (var2 == -1) { // L: 461
			return true;
		} else {
			boolean var5 = true; // L: 462
			if (!class306.ItemComposition_modelArchive.tryLoadFile(var2, 0)) { // L: 463
				var5 = false;
			}

			if (var3 != -1 && !class306.ItemComposition_modelArchive.tryLoadFile(var3, 0)) { // L: 464
				var5 = false;
			}

			if (var4 != -1 && !class306.ItemComposition_modelArchive.tryLoadFile(var4, 0)) { // L: 465
				var5 = false;
			}

			return var5; // L: 466
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)Lgi;",
		garbageValue = "-1234528867"
	)
	public final ModelData method3934(int var1) {
		int var2 = this.femaleModel; // L: 470
		int var3 = this.femaleModel1; // L: 471
		int var4 = this.femaleModel2; // L: 472
		if (var1 == 1) { // L: 473
			var2 = this.maleHeadModel; // L: 474
			var3 = this.maleHeadModel2; // L: 475
			var4 = this.femaleHeadModel; // L: 476
		}

		if (var2 == -1) { // L: 478
			return null;
		} else {
			ModelData var5 = ModelData.ModelData_get(class306.ItemComposition_modelArchive, var2, 0); // L: 479
			if (var3 != -1) { // L: 480
				ModelData var6 = ModelData.ModelData_get(class306.ItemComposition_modelArchive, var3, 0); // L: 481
				if (var4 != -1) { // L: 482
					ModelData var7 = ModelData.ModelData_get(class306.ItemComposition_modelArchive, var4, 0); // L: 483
					ModelData[] var8 = new ModelData[]{var5, var6, var7}; // L: 484
					var5 = new ModelData(var8, 3); // L: 485
				} else {
					ModelData[] var10 = new ModelData[]{var5, var6}; // L: 488
					var5 = new ModelData(var10, 2); // L: 489
				}
			}

			if (var1 == 0 && this.femaleOffset != 0) { // L: 492
				var5.changeOffset(0, this.femaleOffset, 0);
			}

			if (var1 == 1 && this.field2204 != 0) { // L: 493
				var5.changeOffset(0, this.field2204, 0);
			}

			int var9;
			if (this.recolorFrom != null) { // L: 494
				for (var9 = 0; var9 < this.recolorFrom.length; ++var9) { // L: 495
					var5.recolor(this.recolorFrom[var9], this.recolorTo[var9]); // L: 496
				}
			}

			if (this.retextureFrom != null) { // L: 499
				for (var9 = 0; var9 < this.retextureFrom.length; ++var9) { // L: 500
					var5.retexture(this.retextureFrom[var9], this.retextureTo[var9]); // L: 501
				}
			}

			return var5; // L: 504
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "9"
	)
	public final boolean method3935(int var1) {
		int var2 = this.femaleHeadModel2; // L: 508
		int var3 = this.field2243; // L: 509
		if (var1 == 1) { // L: 510
			var2 = this.field2244; // L: 511
			var3 = this.field2245; // L: 512
		}

		if (var2 == -1) { // L: 514
			return true;
		} else {
			boolean var4 = true; // L: 515
			if (!class306.ItemComposition_modelArchive.tryLoadFile(var2, 0)) { // L: 516
				var4 = false;
			}

			if (var3 != -1 && !class306.ItemComposition_modelArchive.tryLoadFile(var3, 0)) { // L: 517
				var4 = false;
			}

			return var4; // L: 518
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgi;",
		garbageValue = "9"
	)
	public final ModelData method3936(int var1) {
		int var2 = this.femaleHeadModel2; // L: 522
		int var3 = this.field2243; // L: 523
		if (var1 == 1) { // L: 524
			var2 = this.field2244; // L: 525
			var3 = this.field2245; // L: 526
		}

		if (var2 == -1) { // L: 528
			return null;
		} else {
			ModelData var4 = ModelData.ModelData_get(class306.ItemComposition_modelArchive, var2, 0); // L: 529
			if (var3 != -1) { // L: 530
				ModelData var5 = ModelData.ModelData_get(class306.ItemComposition_modelArchive, var3, 0); // L: 531
				ModelData[] var6 = new ModelData[]{var4, var5}; // L: 532
				var4 = new ModelData(var6, 2); // L: 533
			}

			int var7;
			if (this.recolorFrom != null) { // L: 535
				for (var7 = 0; var7 < this.recolorFrom.length; ++var7) { // L: 536
					var4.recolor(this.recolorFrom[var7], this.recolorTo[var7]); // L: 537
				}
			}

			if (this.retextureFrom != null) { // L: 540
				for (var7 = 0; var7 < this.retextureFrom.length; ++var7) { // L: 541
					var4.retexture(this.retextureFrom[var7], this.retextureTo[var7]); // L: 542
				}
			}

			return var4; // L: 545
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "38849497"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return UserComparator8.method2819(this.params, var1, var2); // L: 549
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1588376559"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		IterableNodeHashTable var4 = this.params; // L: 554
		String var3;
		if (var4 == null) { // L: 556
			var3 = var2; // L: 557
		} else {
			ObjectNode var5 = (ObjectNode)var4.get((long)var1); // L: 560
			if (var5 == null) { // L: 561
				var3 = var2; // L: 562
			} else {
				var3 = (String)var5.obj; // L: 565
			}
		}

		return var3; // L: 567
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("getShiftClickIndex")
	public int getShiftClickIndex() {
		if (this.shiftClickIndex != -1 && this.inventoryActions != null) { // L: 571
			if (this.shiftClickIndex >= 0) { // L: 572
				return this.inventoryActions[this.shiftClickIndex] != null ? this.shiftClickIndex : -1;
			} else {
				return "Drop".equalsIgnoreCase(this.inventoryActions[4]) ? 4 : -1; // L: 573
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "20"
	)
	boolean method3963() {
		return this.recolorTo != null; // L: 588
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1445987628"
	)
	boolean method3941() {
		return this.retextureTo != null; // L: 592
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)I",
		garbageValue = "-25"
	)
	public static int method3994(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) { // L: 17
			int var6 = var3; // L: 18
			var3 = var4; // L: 19
			var4 = var6; // L: 20
		}

		var2 &= 3; // L: 22
		if (var2 == 0) { // L: 23
			return var0;
		} else if (var2 == 1) { // L: 24
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 - (var3 - 1) : 7 - var1 - (var4 - 1); // L: 25 26
		}
	}
}
