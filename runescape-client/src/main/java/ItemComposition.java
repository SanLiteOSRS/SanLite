import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hz")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("ItemComposition_archive")
	public static AbstractArchive ItemComposition_archive;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("ItemComposition_modelArchive")
	public static AbstractArchive ItemComposition_modelArchive;
	@ObfuscatedName("ak")
	@Export("ItemComposition_inMembersWorld")
	public static boolean ItemComposition_inMembersWorld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("ItemComposition_cached")
	public static EvictingDualNodeHashTable ItemComposition_cached;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("ItemComposition_cachedModels")
	public static EvictingDualNodeHashTable ItemComposition_cachedModels;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("ItemComposition_cachedSprites")
	public static EvictingDualNodeHashTable ItemComposition_cachedSprites;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 992655263
	)
	@Export("id")
	int id;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1675946935
	)
	@Export("model")
	int model;
	@ObfuscatedName("ag")
	@Export("name")
	public String name;
	@ObfuscatedName("ar")
	@Export("recolorFrom")
	public short[] recolorFrom;
	@ObfuscatedName("ah")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("az")
	@Export("retextureFrom")
	public short[] retextureFrom;
	@ObfuscatedName("au")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 654329949
	)
	@Export("zoom2d")
	public int zoom2d;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -432058833
	)
	@Export("xan2d")
	public int xan2d;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -486167593
	)
	@Export("yan2d")
	public int yan2d;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1772611151
	)
	@Export("zan2d")
	public int zan2d;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1380388757
	)
	@Export("offsetX2d")
	public int offsetX2d;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 986220787
	)
	@Export("offsetY2d")
	public int offsetY2d;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1270989421
	)
	@Export("isStackable")
	public int isStackable;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 202384003
	)
	@Export("price")
	public int price;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 1824480803
	)
	@Export("maleModel")
	public int maleModel;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -1234131829
	)
	@Export("maleModel1")
	public int maleModel1;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 1581096493
	)
	@Export("maleModel2")
	public int maleModel2;
	@ObfuscatedName("bd")
	@Export("isMembersOnly")
	public boolean isMembersOnly;
	@ObfuscatedName("ba")
	@Export("groundActions")
	public String[] groundActions;
	@ObfuscatedName("bn")
	@Export("inventoryActions")
	public String[] inventoryActions;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -2053704301
	)
	@Export("shiftClickIndex")
	int shiftClickIndex;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 1473315727
	)
	@Export("femaleModel")
	int femaleModel;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 1386202907
	)
	@Export("femaleModel1")
	int femaleModel1;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 193750337
	)
	@Export("femaleOffset")
	int femaleOffset;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 1507075227
	)
	@Export("maleHeadModel")
	int maleHeadModel;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 419475339
	)
	@Export("maleHeadModel2")
	int maleHeadModel2;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 757685603
	)
	int field2232;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 1505326359
	)
	@Export("femaleModel2")
	int femaleModel2;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -94109293
	)
	@Export("femaleHeadModel")
	int femaleHeadModel;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 660540987
	)
	@Export("femaleHeadModel2")
	int femaleHeadModel2;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 1092026611
	)
	int field2236;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 1042104979
	)
	int field2237;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -2030425221
	)
	int field2218;
	@ObfuscatedName("bt")
	@Export("countobj")
	int[] countobj;
	@ObfuscatedName("bl")
	@Export("countco")
	int[] countco;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -1194095735
	)
	@Export("note")
	public int note;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 584887203
	)
	@Export("noteTemplate")
	public int noteTemplate;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -2072449785
	)
	@Export("resizeX")
	int resizeX;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 1129355897
	)
	@Export("resizeY")
	int resizeY;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -1050772413
	)
	@Export("resizeZ")
	int resizeZ;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 1639284903
	)
	public int field2238;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = 346604909
	)
	public int field2239;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 1451496641
	)
	@Export("team")
	public int team;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 689791523
	)
	public int field2249;
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "Lsv;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("cr")
	@Export("isTradable")
	public boolean isTradable;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -792896807
	)
	@Export("unnotedId")
	int unnotedId;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 1934925549
	)
	@Export("notedId")
	int notedId;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 2108470599
	)
	@Export("placeholder")
	public int placeholder;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -1710855267
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
		this.zoom2d = 2000;
		this.xan2d = 0;
		this.yan2d = 0;
		this.zan2d = 0;
		this.offsetX2d = 0;
		this.offsetY2d = 0;
		this.isStackable = 0;
		this.price = 1;
		this.maleModel = -1;
		this.maleModel1 = -1;
		this.maleModel2 = -1;
		this.isMembersOnly = false;
		this.groundActions = new String[]{null, null, "Take", null, null};
		this.inventoryActions = new String[]{null, null, null, null, "Drop"};
		this.shiftClickIndex = -2;
		this.femaleModel = -1; // L: 57
		this.femaleModel1 = -1; // L: 58
		this.femaleOffset = 0;
		this.maleHeadModel = -1;
		this.maleHeadModel2 = -1;
		this.field2232 = 0;
		this.femaleModel2 = -1;
		this.femaleHeadModel = -1;
		this.femaleHeadModel2 = -1;
		this.field2236 = -1;
		this.field2237 = -1;
		this.field2218 = -1; // L: 68
		this.note = -1;
		this.noteTemplate = -1;
		this.resizeX = 128;
		this.resizeY = 128;
		this.resizeZ = 128;
		this.field2238 = 0; // L: 76
		this.field2239 = 0; // L: 77
		this.team = 0;
		this.field2249 = 0;
		this.isTradable = false;
		this.unnotedId = -1;
		this.notedId = -1;
		this.placeholder = -1; // L: 84
		this.placeholderTemplate = -1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1088110524"
	)
	@Export("post")
	void post() {
		if (this.isStackable == 1) { // L: 128
			this.field2249 = 0;
		}

	} // L: 129

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ltz;I)V",
		garbageValue = "-1883529616"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 133
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ltz;II)V",
		garbageValue = "-1157807618"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.model = var1.readUnsignedShort();
		} else if (var2 == 2) {
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) {
			this.zoom2d = var1.readUnsignedShort();
		} else if (var2 == 5) { // L: 143
			this.xan2d = var1.readUnsignedShort();
		} else if (var2 == 6) {
			this.yan2d = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.offsetX2d = var1.readUnsignedShort();
			if (this.offsetX2d > 32767) { // L: 147
				this.offsetX2d -= 65536;
			}
		} else if (var2 == 8) { // L: 149
			this.offsetY2d = var1.readUnsignedShort(); // L: 150
			if (this.offsetY2d > 32767) {
				this.offsetY2d -= 65536;
			}
		} else if (var2 == 9) { // L: 153
			var1.readStringCp1252NullTerminated();
		} else if (var2 == 11) {
			this.isStackable = 1;
		} else if (var2 == 12) {
			this.price = var1.readInt();
		} else if (var2 == 13) {
			this.maleModel = var1.readUnsignedByte();
		} else if (var2 == 14) { // L: 159
			this.maleModel1 = var1.readUnsignedByte();
		} else if (var2 == 16) { // L: 160
			this.isMembersOnly = true;
		} else if (var2 == 23) { // L: 161
			this.femaleModel = var1.readUnsignedShort();
			this.femaleOffset = var1.readUnsignedByte();
		} else if (var2 == 24) {
			this.femaleModel1 = var1.readUnsignedShort();
		} else if (var2 == 25) {
			this.maleHeadModel = var1.readUnsignedShort();
			this.field2232 = var1.readUnsignedByte();
		} else if (var2 == 26) { // L: 170
			this.maleHeadModel2 = var1.readUnsignedShort();
		} else if (var2 == 27) {
			this.maleModel2 = var1.readUnsignedByte();
		} else if (var2 >= 30 && var2 < 35) {
			this.groundActions[var2 - 30] = var1.readStringCp1252NullTerminated();
			if (this.groundActions[var2 - 30].equalsIgnoreCase("Hidden")) { // L: 174
				this.groundActions[var2 - 30] = null;
			}
		} else if (var2 >= 35 && var2 < 40) {
			this.inventoryActions[var2 - 35] = var1.readStringCp1252NullTerminated();
		} else {
			int var3;
			int var4;
			if (var2 == 40) {
				var3 = var1.readUnsignedByte();
				this.recolorFrom = new short[var3];
				this.recolorTo = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 182
					this.recolorTo[var4] = (short)var1.readUnsignedShort();
				}
			} else if (var2 == 41) { // L: 186
				var3 = var1.readUnsignedByte();
				this.retextureFrom = new short[var3]; // L: 188
				this.retextureTo = new short[var3]; // L: 189

				for (var4 = 0; var4 < var3; ++var4) { // L: 190
					this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 191
					this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 192
				}
			} else if (var2 == 42) { // L: 195
				this.shiftClickIndex = var1.readByte();
			} else if (var2 == 65) {
				this.isTradable = true; // L: 199
			} else if (var2 == 75) { // L: 201
				this.field2249 = var1.readShort();
			} else if (var2 == 78) {
				this.femaleModel2 = var1.readUnsignedShort();
			} else if (var2 == 79) {
				this.femaleHeadModel = var1.readUnsignedShort();
			} else if (var2 == 90) {
				this.femaleHeadModel2 = var1.readUnsignedShort();
			} else if (var2 == 91) {
				this.field2237 = var1.readUnsignedShort(); // L: 205
			} else if (var2 == 92) { // L: 206
				this.field2236 = var1.readUnsignedShort();
			} else if (var2 == 93) {
				this.field2218 = var1.readUnsignedShort();
			} else if (var2 == 94) {
				var1.readUnsignedShort();
			} else if (var2 == 95) {
				this.zan2d = var1.readUnsignedShort();
			} else if (var2 == 97) {
				this.note = var1.readUnsignedShort();
			} else if (var2 == 98) { // L: 213
				this.noteTemplate = var1.readUnsignedShort();
			} else if (var2 >= 100 && var2 < 110) { // L: 214
				if (this.countobj == null) { // L: 215
					this.countobj = new int[10]; // L: 216
					this.countco = new int[10];
				}

				this.countobj[var2 - 100] = var1.readUnsignedShort();
				this.countco[var2 - 100] = var1.readUnsignedShort();
			} else if (var2 == 110) {
				this.resizeX = var1.readUnsignedShort();
			} else if (var2 == 111) {
				this.resizeY = var1.readUnsignedShort();
			} else if (var2 == 112) {
				this.resizeZ = var1.readUnsignedShort();
			} else if (var2 == 113) { // L: 225
				this.field2238 = var1.readByte();
			} else if (var2 == 114) { // L: 226
				this.field2239 = var1.readByte() * 5;
			} else if (var2 == 115) {
				this.team = var1.readUnsignedByte();
			} else if (var2 == 139) { // L: 228
				this.unnotedId = var1.readUnsignedShort();
			} else if (var2 == 140) {
				this.notedId = var1.readUnsignedShort();
			} else if (var2 == 148) {
				this.placeholder = var1.readUnsignedShort();
			} else if (var2 == 149) {
				this.placeholderTemplate = var1.readUnsignedShort();
			} else if (var2 == 249) {
				this.params = ReflectionCheck.readStringIntParameters(var1, this.params);
			}
		}

	} // L: 234

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lhz;Lhz;I)V",
		garbageValue = "-1489726495"
	)
	@Export("genCert")
	void genCert(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model; // L: 237
		this.zoom2d = var1.zoom2d; // L: 238
		this.xan2d = var1.xan2d; // L: 239
		this.yan2d = var1.yan2d; // L: 240
		this.zan2d = var1.zan2d; // L: 241
		this.offsetX2d = var1.offsetX2d; // L: 242
		this.offsetY2d = var1.offsetY2d; // L: 243
		this.recolorFrom = var1.recolorFrom; // L: 244
		this.recolorTo = var1.recolorTo; // L: 245
		this.retextureFrom = var1.retextureFrom; // L: 246
		this.retextureTo = var1.retextureTo; // L: 247
		this.name = var2.name; // L: 248
		this.isMembersOnly = var2.isMembersOnly; // L: 249
		this.price = var2.price; // L: 250
		this.isStackable = 1; // L: 251
	} // L: 252

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lhz;Lhz;B)V",
		garbageValue = "-42"
	)
	@Export("genBought")
	void genBought(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model; // L: 255
		this.zoom2d = var1.zoom2d; // L: 256
		this.xan2d = var1.xan2d; // L: 257
		this.yan2d = var1.yan2d; // L: 258
		this.zan2d = var1.zan2d; // L: 259
		this.offsetX2d = var1.offsetX2d; // L: 260
		this.offsetY2d = var1.offsetY2d; // L: 261
		this.recolorFrom = var2.recolorFrom; // L: 262
		this.recolorTo = var2.recolorTo; // L: 263
		this.retextureFrom = var2.retextureFrom; // L: 264
		this.retextureTo = var2.retextureTo; // L: 265
		this.name = var2.name; // L: 266
		this.isMembersOnly = var2.isMembersOnly; // L: 267
		this.isStackable = var2.isStackable; // L: 268
		this.maleModel = var2.maleModel; // L: 269
		this.maleModel1 = var2.maleModel1; // L: 270
		this.maleModel2 = var2.maleModel2; // L: 271
		this.femaleModel = var2.femaleModel; // L: 272
		this.femaleModel1 = var2.femaleModel1; // L: 273
		this.femaleModel2 = var2.femaleModel2; // L: 274
		this.maleHeadModel = var2.maleHeadModel; // L: 275
		this.maleHeadModel2 = var2.maleHeadModel2; // L: 276
		this.femaleHeadModel = var2.femaleHeadModel; // L: 277
		this.femaleHeadModel2 = var2.femaleHeadModel2; // L: 278
		this.field2236 = var2.field2236; // L: 279
		this.field2237 = var2.field2237; // L: 280
		this.field2218 = var2.field2218; // L: 281
		this.team = var2.team; // L: 282
		this.groundActions = var2.groundActions; // L: 283
		this.field2249 = var2.field2249; // L: 284
		this.inventoryActions = new String[5]; // L: 285
		if (var2.inventoryActions != null) {
			for (int var3 = 0; var3 < 4; ++var3) { // L: 286
				this.inventoryActions[var3] = var2.inventoryActions[var3];
			}
		}

		this.inventoryActions[4] = "Discard"; // L: 287
		this.price = 0; // L: 288
	} // L: 289

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lhz;Lhz;B)V",
		garbageValue = "10"
	)
	@Export("genPlaceholder")
	void genPlaceholder(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model; // L: 292
		this.zoom2d = var1.zoom2d; // L: 293
		this.xan2d = var1.xan2d; // L: 294
		this.yan2d = var1.yan2d; // L: 295
		this.zan2d = var1.zan2d; // L: 296
		this.offsetX2d = var1.offsetX2d; // L: 297
		this.offsetY2d = var1.offsetY2d; // L: 298
		this.recolorFrom = var1.recolorFrom; // L: 299
		this.recolorTo = var1.recolorTo; // L: 300
		this.retextureFrom = var1.retextureFrom; // L: 301
		this.retextureTo = var1.retextureTo; // L: 302
		this.isStackable = var1.isStackable; // L: 303
		this.name = var2.name; // L: 304
		this.price = 0; // L: 305
		this.isMembersOnly = false; // L: 306
		this.isTradable = false; // L: 307
	} // L: 308

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Lit;",
		garbageValue = "-1399505255"
	)
	@Export("getModelData")
	public final ModelData getModelData(int var1) {
		int var3;
		if (this.countobj != null && var1 > 1) { // L: 311
			int var2 = -1; // L: 312

			for (var3 = 0; var3 < 10; ++var3) { // L: 313
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) { // L: 314
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) { // L: 316
				return class300.ItemComposition_get(var2).getModelData(1);
			}
		}

		ModelData var4 = ModelData.ModelData_get(ItemComposition_modelArchive, this.model, 0); // L: 318
		if (var4 == null) { // L: 319
			return null;
		} else {
			if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) { // L: 320
				var4.resize(this.resizeX, this.resizeY, this.resizeZ);
			}

			if (this.recolorFrom != null) { // L: 321
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) { // L: 322
					var4.recolor(this.recolorFrom[var3], this.recolorTo[var3]); // L: 323
				}
			}

			if (this.retextureFrom != null) { // L: 326
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) { // L: 327
					var4.retexture(this.retextureFrom[var3], this.retextureTo[var3]); // L: 328
				}
			}

			return var4; // L: 331
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljd;",
		garbageValue = "124"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		if (this.countobj != null && var1 > 1) { // L: 335
			int var2 = -1; // L: 336

			for (int var3 = 0; var3 < 10; ++var3) { // L: 337
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) { // L: 338
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) { // L: 340
				return class300.ItemComposition_get(var2).getModel(1);
			}
		}

		Model var5 = (Model)ItemComposition_cachedModels.get((long)this.id); // L: 342
		if (var5 != null) { // L: 343
			return var5;
		} else {
			ModelData var6 = ModelData.ModelData_get(ItemComposition_modelArchive, this.model, 0); // L: 344
			if (var6 == null) { // L: 345
				return null;
			} else {
				if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) { // L: 346
					var6.resize(this.resizeX, this.resizeY, this.resizeZ);
				}

				int var4;
				if (this.recolorFrom != null) { // L: 347
					for (var4 = 0; var4 < this.recolorFrom.length; ++var4) { // L: 348
						var6.recolor(this.recolorFrom[var4], this.recolorTo[var4]); // L: 349
					}
				}

				if (this.retextureFrom != null) { // L: 352
					for (var4 = 0; var4 < this.retextureFrom.length; ++var4) { // L: 353
						var6.retexture(this.retextureFrom[var4], this.retextureTo[var4]); // L: 354
					}
				}

				var5 = var6.toModel(this.field2238 + 64, this.field2239 + 768, -50, -10, -50); // L: 357
				var5.isSingleTile = true; // L: 358
				ItemComposition_cachedModels.put(var5, (long)this.id); // L: 359
				return var5; // L: 360
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Lhz;",
		garbageValue = "558658619"
	)
	@Export("getCountObj")
	public ItemComposition getCountObj(int var1) {
		if (this.countobj != null && var1 > 1) { // L: 364
			int var2 = -1; // L: 365

			for (int var3 = 0; var3 < 10; ++var3) { // L: 366
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) {
					var2 = this.countobj[var3]; // L: 367
				}
			}

			if (var2 != -1) { // L: 369
				return class300.ItemComposition_get(var2);
			}
		}

		return this; // L: 371
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-502224885"
	)
	public final boolean method3957(int var1) {
		int var2 = this.femaleModel; // L: 457
		int var3 = this.femaleModel1; // L: 458
		int var4 = this.femaleModel2; // L: 459
		if (var1 == 1) { // L: 460
			var2 = this.maleHeadModel; // L: 461
			var3 = this.maleHeadModel2; // L: 462
			var4 = this.femaleHeadModel; // L: 463
		}

		if (var2 == -1) { // L: 465
			return true;
		} else {
			boolean var5 = true; // L: 466
			if (!ItemComposition_modelArchive.tryLoadFile(var2, 0)) { // L: 467
				var5 = false;
			}

			if (var3 != -1 && !ItemComposition_modelArchive.tryLoadFile(var3, 0)) { // L: 468
				var5 = false;
			}

			if (var4 != -1 && !ItemComposition_modelArchive.tryLoadFile(var4, 0)) { // L: 469
				var5 = false;
			}

			return var5; // L: 470
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Lit;",
		garbageValue = "929872247"
	)
	public final ModelData method3986(int var1) {
		int var2 = this.femaleModel; // L: 474
		int var3 = this.femaleModel1; // L: 475
		int var4 = this.femaleModel2; // L: 476
		if (var1 == 1) { // L: 477
			var2 = this.maleHeadModel; // L: 478
			var3 = this.maleHeadModel2; // L: 479
			var4 = this.femaleHeadModel; // L: 480
		}

		if (var2 == -1) { // L: 482
			return null;
		} else {
			ModelData var5 = ModelData.ModelData_get(ItemComposition_modelArchive, var2, 0); // L: 483
			if (var3 != -1) { // L: 484
				ModelData var6 = ModelData.ModelData_get(ItemComposition_modelArchive, var3, 0); // L: 485
				if (var4 != -1) { // L: 486
					ModelData var7 = ModelData.ModelData_get(ItemComposition_modelArchive, var4, 0); // L: 487
					ModelData[] var8 = new ModelData[]{var5, var6, var7}; // L: 488
					var5 = new ModelData(var8, 3); // L: 489
				} else {
					ModelData[] var10 = new ModelData[]{var5, var6}; // L: 492
					var5 = new ModelData(var10, 2); // L: 493
				}
			}

			if (var1 == 0 && this.femaleOffset != 0) { // L: 496
				var5.changeOffset(0, this.femaleOffset, 0);
			}

			if (var1 == 1 && this.field2232 != 0) { // L: 497
				var5.changeOffset(0, this.field2232, 0);
			}

			int var9;
			if (this.recolorFrom != null) { // L: 498
				for (var9 = 0; var9 < this.recolorFrom.length; ++var9) { // L: 499
					var5.recolor(this.recolorFrom[var9], this.recolorTo[var9]); // L: 500
				}
			}

			if (this.retextureFrom != null) { // L: 503
				for (var9 = 0; var9 < this.retextureFrom.length; ++var9) { // L: 504
					var5.retexture(this.retextureFrom[var9], this.retextureTo[var9]); // L: 505
				}
			}

			return var5; // L: 508
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1160105256"
	)
	public final boolean method3959(int var1) {
		int var2 = this.femaleHeadModel2; // L: 512
		int var3 = this.field2236; // L: 513
		if (var1 == 1) { // L: 514
			var2 = this.field2237; // L: 515
			var3 = this.field2218; // L: 516
		}

		if (var2 == -1) { // L: 518
			return true;
		} else {
			boolean var4 = true; // L: 519
			if (!ItemComposition_modelArchive.tryLoadFile(var2, 0)) { // L: 520
				var4 = false;
			}

			if (var3 != -1 && !ItemComposition_modelArchive.tryLoadFile(var3, 0)) { // L: 521
				var4 = false;
			}

			return var4; // L: 522
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Lit;",
		garbageValue = "-1685406318"
	)
	public final ModelData method3960(int var1) {
		int var2 = this.femaleHeadModel2; // L: 526
		int var3 = this.field2236; // L: 527
		if (var1 == 1) { // L: 528
			var2 = this.field2237; // L: 529
			var3 = this.field2218; // L: 530
		}

		if (var2 == -1) { // L: 532
			return null;
		} else {
			ModelData var4 = ModelData.ModelData_get(ItemComposition_modelArchive, var2, 0); // L: 533
			if (var3 != -1) { // L: 534
				ModelData var5 = ModelData.ModelData_get(ItemComposition_modelArchive, var3, 0); // L: 535
				ModelData[] var6 = new ModelData[]{var4, var5}; // L: 536
				var4 = new ModelData(var6, 2); // L: 537
			}

			int var7;
			if (this.recolorFrom != null) { // L: 539
				for (var7 = 0; var7 < this.recolorFrom.length; ++var7) { // L: 540
					var4.recolor(this.recolorFrom[var7], this.recolorTo[var7]); // L: 541
				}
			}

			if (this.retextureFrom != null) { // L: 544
				for (var7 = 0; var7 < this.retextureFrom.length; ++var7) { // L: 545
					var4.retexture(this.retextureFrom[var7], this.retextureTo[var7]); // L: 546
				}
			}

			return var4; // L: 549
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-16"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		IterableNodeHashTable var4 = this.params; // L: 554
		int var3;
		if (var4 == null) { // L: 556
			var3 = var2; // L: 557
		} else {
			IntegerNode var5 = (IntegerNode)var4.get((long)var1); // L: 560
			if (var5 == null) { // L: 561
				var3 = var2; // L: 562
			} else {
				var3 = var5.integer; // L: 565
			}
		}

		return var3; // L: 567
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1157691"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class165.method3374(this.params, var1, var2); // L: 571
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-18695"
	)
	@Export("getShiftClickIndex")
	public int getShiftClickIndex() {
		if (this.shiftClickIndex != -1 && this.inventoryActions != null) { // L: 575
			if (this.shiftClickIndex >= 0) { // L: 576
				return this.inventoryActions[this.shiftClickIndex] != null ? this.shiftClickIndex : -1;
			} else {
				return "Drop".equalsIgnoreCase(this.inventoryActions[4]) ? 4 : -1; // L: 577
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "10"
	)
	boolean method3964() {
		return this.recolorTo != null; // L: 596
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-502325863"
	)
	boolean method4008() {
		return this.retextureTo != null; // L: 600
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIB)V",
		garbageValue = "-16"
	)
	public static void method4004(String var0, String var1, int var2, int var3) throws IOException {
		JagexCache.idxCount = var3;
		class496.cacheGamebuild = var2;

		try {
			class452.operatingSystemName = System.getProperty("os.name");
		} catch (Exception var31) {
			class452.operatingSystemName = "Unknown";
		}

		class127.formattedOperatingSystemName = class452.operatingSystemName.toLowerCase();

		try {
			class148.userHomeDirectory = System.getProperty("user.home");
			if (class148.userHomeDirectory != null) {
				class148.userHomeDirectory = class148.userHomeDirectory + "/";
			}
		} catch (Exception var30) {
		}

		try {
			if (class127.formattedOperatingSystemName.startsWith("win")) {
				if (class148.userHomeDirectory == null) { // L: 56
					class148.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (class148.userHomeDirectory == null) {
				class148.userHomeDirectory = System.getenv("HOME");
			}

			if (class148.userHomeDirectory != null) {
				class148.userHomeDirectory = class148.userHomeDirectory + "/";
			}
		} catch (Exception var29) {
		}

		if (class148.userHomeDirectory == null) {
			class148.userHomeDirectory = "~/";
		}

		StructComposition.cacheParentPaths = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class148.userHomeDirectory, "/tmp/", ""}; // L: 65
		class25.cacheSubPaths = new String[]{".jagex_cache_" + class496.cacheGamebuild, ".file_store_" + class496.cacheGamebuild};
		int var18 = 0;

		File var5;
		label295:
		while (var18 < 4) {
			String var6 = var18 == 0 ? "" : "" + var18; // L: 70
			JagexCache.JagexCache_locationFile = new File(class148.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var6 + ".dat"); // L: 71
			String var7 = null; // L: 72
			String var8 = null; // L: 73
			boolean var9 = false; // L: 74
			Buffer var11;
			File var39;
			if (JagexCache.JagexCache_locationFile.exists()) { // L: 75
				try {
					AccessFile var10 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L); // L: 78

					int var12;
					for (var11 = new Buffer((int)var10.length()); var11.offset < var11.array.length; var11.offset += var12) { // L: 79 80 83
						var12 = var10.read(var11.array, var11.offset, var11.array.length - var11.offset); // L: 81
						if (var12 == -1) { // L: 82
							throw new IOException();
						}
					}

					var11.offset = 0; // L: 85
					var12 = var11.readUnsignedByte(); // L: 86
					if (var12 < 1 || var12 > 3) { // L: 87
						throw new IOException("" + var12);
					}

					int var13 = 0; // L: 88
					if (var12 > 1) { // L: 89
						var13 = var11.readUnsignedByte();
					}

					if (var12 <= 2) { // L: 90
						var7 = var11.readStringCp1252NullCircumfixed(); // L: 91
						if (var13 == 1) { // L: 92
							var8 = var11.readStringCp1252NullCircumfixed();
						}
					} else {
						var7 = var11.readCESU8(); // L: 95
						if (var13 == 1) { // L: 96
							var8 = var11.readCESU8();
						}
					}

					var10.close(); // L: 98
				} catch (IOException var34) { // L: 100
					var34.printStackTrace(); // L: 101
				}

				if (var7 != null) { // L: 103
					var39 = new File(var7); // L: 104
					if (!var39.exists()) { // L: 105
						var7 = null; // L: 106
					}
				}

				if (var7 != null) { // L: 109
					var39 = new File(var7, "test.dat"); // L: 110
					if (!ArchiveLoader.method2217(var39, true)) { // L: 111
						var7 = null; // L: 112
					}
				}
			}

			if (var7 == null && var18 == 0) { // L: 116
				label270:
				for (int var19 = 0; var19 < class25.cacheSubPaths.length; ++var19) { // L: 117
					for (int var20 = 0; var20 < StructComposition.cacheParentPaths.length; ++var20) { // L: 118
						File var21 = new File(StructComposition.cacheParentPaths[var20] + class25.cacheSubPaths[var19] + File.separatorChar + var0 + File.separatorChar); // L: 119
						if (var21.exists() && ArchiveLoader.method2217(new File(var21, "test.dat"), true)) { // L: 120 121
							var7 = var21.toString(); // L: 122
							var9 = true; // L: 123
							break label270; // L: 124
						}
					}
				}
			}

			if (var7 == null) { // L: 130
				var7 = class148.userHomeDirectory + File.separatorChar + "jagexcache" + var6 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar; // L: 131
				var9 = true; // L: 132
			}

			File var38;
			if (var8 != null) { // L: 134
				var38 = new File(var8); // L: 135
				var39 = new File(var7);

				try {
					File[] var41 = var38.listFiles(); // L: 138
					File[] var22 = var41; // L: 140

					for (int var14 = 0; var14 < var22.length; ++var14) { // L: 141
						File var15 = var22[var14]; // L: 142
						File var16 = new File(var39, var15.getName()); // L: 144
						boolean var17 = var15.renameTo(var16); // L: 145
						if (!var17) { // L: 146
							throw new IOException();
						}
					}
				} catch (Exception var33) { // L: 151
					var33.printStackTrace(); // L: 152
				}

				var9 = true; // L: 154
			}

			if (var9) { // L: 156
				var38 = new File(var7); // L: 157
				var11 = null; // L: 158

				try {
					AccessFile var42 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L); // L: 162
					Buffer var43 = new Buffer(500); // L: 163
					var43.writeByte(3); // L: 164
					var43.writeByte(var11 != null ? 1 : 0); // L: 165
					var43.writeCESU8(var38.getPath()); // L: 166
					if (var11 != null) { // L: 167
						var43.writeCESU8("");
					}

					var42.write(var43.array, 0, var43.offset); // L: 168
					var42.close(); // L: 169
				} catch (IOException var28) { // L: 171
					var28.printStackTrace(); // L: 172
				}
			}

			var5 = new File(var7); // L: 176
			class388.cacheDir = var5;
			if (!class388.cacheDir.exists()) { // L: 179
				class388.cacheDir.mkdirs();
			}

			File[] var35 = class388.cacheDir.listFiles();
			if (var35 != null) { // L: 181
				File[] var40 = var35; // L: 183

				for (int var23 = 0; var23 < var40.length; ++var23) { // L: 184
					File var24 = var40[var23]; // L: 185
					if (!ArchiveLoader.method2217(var24, false)) { // L: 187
						++var18; // L: 67
						continue label295;
					}
				}
			}
			break;
		}

		File var4 = class388.cacheDir; // L: 194
		FileSystem.FileSystem_cacheDir = var4; // L: 196
		if (!FileSystem.FileSystem_cacheDir.exists()) { // L: 197
			throw new RuntimeException("");
		} else {
			FileSystem.FileSystem_hasPermissions = true; // L: 198

			try {
				var5 = new File(class148.userHomeDirectory, "random.dat"); // L: 202
				int var26;
				if (var5.exists()) { // L: 203
					JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var5, "rw", 25L), 24, 0); // L: 204
				} else {
					label221:
					for (int var25 = 0; var25 < class25.cacheSubPaths.length; ++var25) { // L: 207
						for (var26 = 0; var26 < StructComposition.cacheParentPaths.length; ++var26) { // L: 208
							File var37 = new File(StructComposition.cacheParentPaths[var26] + class25.cacheSubPaths[var25] + File.separatorChar + "random.dat"); // L: 209
							if (var37.exists()) { // L: 210
								JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var37, "rw", 25L), 24, 0); // L: 211
								break label221; // L: 212
							}
						}
					}
				}

				if (JagexCache.JagexCache_randomDat == null) { // L: 217
					RandomAccessFile var36 = new RandomAccessFile(var5, "rw"); // L: 218
					var26 = var36.read(); // L: 219
					var36.seek(0L); // L: 220
					var36.write(var26); // L: 221
					var36.seek(0L); // L: 222
					var36.close(); // L: 223
					JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var5, "rw", 25L), 24, 0); // L: 224
				}
			} catch (IOException var32) { // L: 227
			}

			JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(UserComparator6.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0); // L: 229
			JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(UserComparator6.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0); // L: 230
			WorldMapSection0.JagexCache_idxFiles = new BufferedFile[JagexCache.idxCount]; // L: 231

			for (int var27 = 0; var27 < JagexCache.idxCount; ++var27) { // L: 232
				WorldMapSection0.JagexCache_idxFiles[var27] = new BufferedFile(new AccessFile(UserComparator6.getFile("main_file_cache.idx" + var27), "rw", 1048576L), 6000, 0); // L: 233
			}

		}
	} // L: 235

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[IIIS)V",
		garbageValue = "17315"
	)
	public static void method4022(String[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) { // L: 39
			int var4 = (var3 + var2) / 2; // L: 40
			int var5 = var2; // L: 41
			String var6 = var0[var4]; // L: 42
			var0[var4] = var0[var3]; // L: 43
			var0[var3] = var6; // L: 44
			int var7 = var1[var4]; // L: 45
			var1[var4] = var1[var3]; // L: 46
			var1[var3] = var7; // L: 47

			for (int var8 = var2; var8 < var3; ++var8) { // L: 48
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) { // L: 49
					String var9 = var0[var8]; // L: 50
					var0[var8] = var0[var5]; // L: 51
					var0[var5] = var9; // L: 52
					int var10 = var1[var8]; // L: 53
					var1[var8] = var1[var5]; // L: 54
					var1[var5++] = var10; // L: 55
				}
			}

			var0[var3] = var0[var5]; // L: 59
			var0[var5] = var6; // L: 60
			var1[var3] = var1[var5]; // L: 61
			var1[var5] = var7; // L: 62
			method4022(var0, var1, var2, var5 - 1); // L: 63
			method4022(var0, var1, var5 + 1, var3); // L: 64
		}

	} // L: 66

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-1406131464"
	)
	static boolean method4020(String var0) {
		if (var0 == null) { // L: 173
			return false;
		} else {
			try {
				new URL(var0);
				return true; // L: 180
			} catch (MalformedURLException var2) { // L: 177
				return false; // L: 178
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "454708286"
	)
	static final void method4018() {
		ParamComposition.method3837("You can't add yourself to your own friend list"); // L: 136
	} // L: 137

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Lmb;II)V",
		garbageValue = "903722802"
	)
	public static void method4019(Widget var0, int var1) {
		ItemComposition var2 = class300.ItemComposition_get(var1); // L: 1081
		var0.field3631.equipment[var2.maleModel] = var1 + 512; // L: 1082
		if (var2.maleModel1 != -1) { // L: 1083
			var0.field3631.equipment[var2.maleModel1] = 0; // L: 1084
		}

		if (var2.maleModel2 != -1) { // L: 1086
			var0.field3631.equipment[var2.maleModel2] = 0; // L: 1087
		}

		var0.field3631.method6021(); // L: 1089
	} // L: 1090

	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "(Lmb;B)Z",
		garbageValue = "20"
	)
	@Export("runCs1")
	static final boolean runCs1(Widget var0) {
		if (var0.cs1Comparisons == null) { // L: 11175
			return false;
		} else {
			for (int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) { // L: 11176
				int var2 = ClanChannelMember.method3137(var0, var1); // L: 11177
				int var3 = var0.cs1ComparisonValues[var1]; // L: 11178
				if (var0.cs1Comparisons[var1] == 2) { // L: 11179
					if (var2 >= var3) { // L: 11180
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 3) { // L: 11182
					if (var2 <= var3) { // L: 11183
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 4) { // L: 11185
					if (var2 == var3) { // L: 11186
						return false;
					}
				} else if (var3 != var2) { // L: 11188
					return false;
				}
			}

			return true; // L: 11190
		}
	}
}
