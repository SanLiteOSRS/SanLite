import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hp")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("ItemComposition_archive")
	public static AbstractArchive ItemComposition_archive;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("ItemComposition_cached")
	public static EvictingDualNodeHashTable ItemComposition_cached;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("ItemComposition_cachedModels")
	public static EvictingDualNodeHashTable ItemComposition_cachedModels;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("ItemComposition_cachedSprites")
	public static EvictingDualNodeHashTable ItemComposition_cachedSprites;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	public static Font field2158;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 396408023
	)
	@Export("id")
	int id;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 67501725
	)
	@Export("model")
	int model;
	@ObfuscatedName("az")
	@Export("name")
	public String name;
	@ObfuscatedName("av")
	@Export("recolorFrom")
	public short[] recolorFrom;
	@ObfuscatedName("ak")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("ay")
	@Export("retextureFrom")
	public short[] retextureFrom;
	@ObfuscatedName("as")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1808513671
	)
	@Export("zoom2d")
	public int zoom2d;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1469955321
	)
	@Export("xan2d")
	public int xan2d;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 2079710603
	)
	@Export("yan2d")
	public int yan2d;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1439528195
	)
	@Export("zan2d")
	public int zan2d;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 15950827
	)
	@Export("offsetX2d")
	public int offsetX2d;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 97893915
	)
	@Export("offsetY2d")
	public int offsetY2d;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 1112129761
	)
	@Export("isStackable")
	public int isStackable;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 505903557
	)
	@Export("price")
	public int price;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 1813143259
	)
	@Export("maleModel")
	public int maleModel;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1201491755
	)
	@Export("maleModel1")
	public int maleModel1;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 1146272737
	)
	@Export("maleModel2")
	public int maleModel2;
	@ObfuscatedName("bn")
	@Export("isMembersOnly")
	public boolean isMembersOnly;
	@ObfuscatedName("by")
	@Export("groundActions")
	public String[] groundActions;
	@ObfuscatedName("bc")
	@Export("inventoryActions")
	public String[] inventoryActions;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 676150055
	)
	@Export("shiftClickIndex")
	int shiftClickIndex;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 293702471
	)
	@Export("femaleModel")
	int femaleModel;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -652913305
	)
	@Export("femaleModel1")
	int femaleModel1;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 846134699
	)
	@Export("femaleOffset")
	int femaleOffset;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -823206307
	)
	@Export("maleHeadModel")
	int maleHeadModel;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -1797620825
	)
	@Export("maleHeadModel2")
	int maleHeadModel2;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 1529917941
	)
	int field2147;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 738183983
	)
	@Export("femaleModel2")
	int femaleModel2;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 272675031
	)
	@Export("femaleHeadModel")
	int femaleHeadModel;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 1157073735
	)
	@Export("femaleHeadModel2")
	int femaleHeadModel2;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 1000892995
	)
	@Export("team")
	int team;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -496297307
	)
	int field2184;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 2022806343
	)
	int field2189;
	@ObfuscatedName("bz")
	@Export("countobj")
	int[] countobj;
	@ObfuscatedName("bo")
	@Export("countco")
	int[] countco;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -198894579
	)
	@Export("note")
	public int note;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -1459112621
	)
	@Export("noteTemplate")
	public int noteTemplate;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 1034970341
	)
	@Export("resizeX")
	int resizeX;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = 1070590053
	)
	@Export("resizeY")
	int resizeY;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 720174449
	)
	@Export("resizeZ")
	int resizeZ;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = 8808505
	)
	public int field2193;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 1523807923
	)
	public int field2194;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 34330985
	)
	public int field2157;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -142629457
	)
	public int field2196;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "Ltb;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("cd")
	@Export("isTradable")
	public boolean isTradable;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 1159465703
	)
	@Export("unnotedId")
	int unnotedId;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 2006987733
	)
	@Export("notedId")
	int notedId;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 1022656111
	)
	@Export("placeholder")
	public int placeholder;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 193378535
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
		this.isStackable = 0; // L: 47
		this.price = 1; // L: 48
		this.maleModel = -1; // L: 49
		this.maleModel1 = -1; // L: 50
		this.maleModel2 = -1; // L: 51
		this.isMembersOnly = false; // L: 52
		this.groundActions = new String[]{null, null, "Take", null, null}; // L: 53
		this.inventoryActions = new String[]{null, null, null, null, "Drop"}; // L: 54
		this.shiftClickIndex = -2; // L: 56
		this.femaleModel = -1; // L: 57
		this.femaleModel1 = -1;
		this.femaleOffset = 0;
		this.maleHeadModel = -1;
		this.maleHeadModel2 = -1;
		this.field2147 = 0;
		this.femaleModel2 = -1;
		this.femaleHeadModel = -1;
		this.femaleHeadModel2 = -1;
		this.team = -1;
		this.field2184 = -1;
		this.field2189 = -1; // L: 68
		this.note = -1;
		this.noteTemplate = -1; // L: 72
		this.resizeX = 128;
		this.resizeY = 128; // L: 74
		this.resizeZ = 128; // L: 75
		this.field2193 = 0; // L: 76
		this.field2194 = 0; // L: 77
		this.field2157 = 0; // L: 78
		this.field2196 = 0; // L: 79
		this.isTradable = false; // L: 81
		this.unnotedId = -1; // L: 82
		this.notedId = -1; // L: 83
		this.placeholder = -1; // L: 84
		this.placeholderTemplate = -1; // L: 85
	} // L: 87

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1706710416"
	)
	@Export("post")
	void post() {
		if (this.isStackable == 1) { // L: 130
			this.field2196 = 0;
		}

	} // L: 131

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "1999549861"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 135
			if (var2 == 0) { // L: 136
				return; // L: 139
			}

			this.decodeNext(var1, var2); // L: 137
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Luk;II)V",
		garbageValue = "-1482516127"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 142
			this.model = var1.readUnsignedShort();
		} else if (var2 == 2) { // L: 143
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 144
			this.zoom2d = var1.readUnsignedShort();
		} else if (var2 == 5) { // L: 145
			this.xan2d = var1.readUnsignedShort();
		} else if (var2 == 6) { // L: 146
			this.yan2d = var1.readUnsignedShort();
		} else if (var2 == 7) { // L: 147
			this.offsetX2d = var1.readUnsignedShort();
			if (this.offsetX2d > 32767) {
				this.offsetX2d -= 65536;
			}
		} else if (var2 == 8) {
			this.offsetY2d = var1.readUnsignedShort();
			if (this.offsetY2d > 32767) {
				this.offsetY2d -= 65536;
			}
		} else if (var2 == 9) {
			var1.readStringCp1252NullTerminated();
		} else if (var2 == 11) {
			this.isStackable = 1;
		} else if (var2 == 12) {
			this.price = var1.readInt();
		} else if (var2 == 13) {
			this.maleModel = var1.readUnsignedByte();
		} else if (var2 == 14) { // L: 161
			this.maleModel1 = var1.readUnsignedByte();
		} else if (var2 == 16) { // L: 162
			this.isMembersOnly = true;
		} else if (var2 == 23) {
			this.femaleModel = var1.readUnsignedShort();
			this.femaleOffset = var1.readUnsignedByte();
		} else if (var2 == 24) {
			this.femaleModel1 = var1.readUnsignedShort();
		} else if (var2 == 25) {
			this.maleHeadModel = var1.readUnsignedShort(); // L: 169
			this.field2147 = var1.readUnsignedByte();
		} else if (var2 == 26) { // L: 172
			this.maleHeadModel2 = var1.readUnsignedShort();
		} else if (var2 == 27) { // L: 173
			this.maleModel2 = var1.readUnsignedByte();
		} else if (var2 >= 30 && var2 < 35) { // L: 174
			this.groundActions[var2 - 30] = var1.readStringCp1252NullTerminated(); // L: 175
			if (this.groundActions[var2 - 30].equalsIgnoreCase("Hidden")) { // L: 176
				this.groundActions[var2 - 30] = null;
			}
		} else if (var2 >= 35 && var2 < 40) { // L: 178
			this.inventoryActions[var2 - 35] = var1.readStringCp1252NullTerminated();
		} else {
			int var3;
			int var4;
			if (var2 == 40) { // L: 179
				var3 = var1.readUnsignedByte(); // L: 180
				this.recolorFrom = new short[var3]; // L: 181
				this.recolorTo = new short[var3]; // L: 182

				for (var4 = 0; var4 < var3; ++var4) { // L: 183
					this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 184
					this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 185
				}
			} else if (var2 == 41) { // L: 188
				var3 = var1.readUnsignedByte(); // L: 189
				this.retextureFrom = new short[var3]; // L: 190
				this.retextureTo = new short[var3]; // L: 191

				for (var4 = 0; var4 < var3; ++var4) { // L: 192
					this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 193
					this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 194
				}
			} else if (var2 == 42) { // L: 197
				this.shiftClickIndex = var1.readByte(); // L: 198
			} else if (var2 == 65) { // L: 200
				this.isTradable = true; // L: 201
			} else if (var2 == 75) { // L: 203
				this.field2196 = var1.readShort();
			} else if (var2 == 78) { // L: 204
				this.femaleModel2 = var1.readUnsignedShort();
			} else if (var2 == 79) { // L: 205
				this.femaleHeadModel = var1.readUnsignedShort();
			} else if (var2 == 90) { // L: 206
				this.femaleHeadModel2 = var1.readUnsignedShort();
			} else if (var2 == 91) {
				this.field2184 = var1.readUnsignedShort(); // L: 207
			} else if (var2 == 92) { // L: 208
				this.team = var1.readUnsignedShort();
			} else if (var2 == 93) { // L: 209
				this.field2189 = var1.readUnsignedShort();
			} else if (var2 == 94) { // L: 210
				var1.readUnsignedShort(); // L: 211
			} else if (var2 == 95) { // L: 213
				this.zan2d = var1.readUnsignedShort();
			} else if (var2 == 97) { // L: 214
				this.note = var1.readUnsignedShort();
			} else if (var2 == 98) { // L: 215
				this.noteTemplate = var1.readUnsignedShort();
			} else if (var2 >= 100 && var2 < 110) { // L: 216
				if (this.countobj == null) { // L: 217
					this.countobj = new int[10]; // L: 218
					this.countco = new int[10]; // L: 219
				}

				this.countobj[var2 - 100] = var1.readUnsignedShort(); // L: 221
				this.countco[var2 - 100] = var1.readUnsignedShort(); // L: 222
			} else if (var2 == 110) { // L: 224
				this.resizeX = var1.readUnsignedShort();
			} else if (var2 == 111) { // L: 225
				this.resizeY = var1.readUnsignedShort();
			} else if (var2 == 112) { // L: 226
				this.resizeZ = var1.readUnsignedShort();
			} else if (var2 == 113) { // L: 227
				this.field2193 = var1.readByte();
			} else if (var2 == 114) { // L: 228
				this.field2194 = var1.readByte();
			} else if (var2 == 115) { // L: 229
				this.field2157 = var1.readUnsignedByte();
			} else if (var2 == 139) { // L: 230
				this.unnotedId = var1.readUnsignedShort();
			} else if (var2 == 140) { // L: 231
				this.notedId = var1.readUnsignedShort();
			} else if (var2 == 148) { // L: 232
				this.placeholder = var1.readUnsignedShort();
			} else if (var2 == 149) { // L: 233
				this.placeholderTemplate = var1.readUnsignedShort();
			} else if (var2 == 249) { // L: 234
				this.params = WorldMapSection2.readStringIntParameters(var1, this.params);
			}
		}

	} // L: 236

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lhp;Lhp;I)V",
		garbageValue = "-1604451846"
	)
	@Export("genCert")
	void genCert(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model; // L: 239
		this.zoom2d = var1.zoom2d; // L: 240
		this.xan2d = var1.xan2d; // L: 241
		this.yan2d = var1.yan2d; // L: 242
		this.zan2d = var1.zan2d; // L: 243
		this.offsetX2d = var1.offsetX2d; // L: 244
		this.offsetY2d = var1.offsetY2d; // L: 245
		this.recolorFrom = var1.recolorFrom; // L: 246
		this.recolorTo = var1.recolorTo; // L: 247
		this.retextureFrom = var1.retextureFrom; // L: 248
		this.retextureTo = var1.retextureTo; // L: 249
		this.name = var2.name; // L: 250
		this.isMembersOnly = var2.isMembersOnly; // L: 251
		this.price = var2.price; // L: 252
		this.isStackable = 1; // L: 253
	} // L: 254

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lhp;Lhp;I)V",
		garbageValue = "346533262"
	)
	@Export("genBought")
	void genBought(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model; // L: 257
		this.zoom2d = var1.zoom2d; // L: 258
		this.xan2d = var1.xan2d; // L: 259
		this.yan2d = var1.yan2d; // L: 260
		this.zan2d = var1.zan2d; // L: 261
		this.offsetX2d = var1.offsetX2d; // L: 262
		this.offsetY2d = var1.offsetY2d; // L: 263
		this.recolorFrom = var2.recolorFrom; // L: 264
		this.recolorTo = var2.recolorTo; // L: 265
		this.retextureFrom = var2.retextureFrom; // L: 266
		this.retextureTo = var2.retextureTo; // L: 267
		this.name = var2.name; // L: 268
		this.isMembersOnly = var2.isMembersOnly; // L: 269
		this.isStackable = var2.isStackable; // L: 270
		this.maleModel = var2.maleModel; // L: 271
		this.maleModel1 = var2.maleModel1; // L: 272
		this.maleModel2 = var2.maleModel2; // L: 273
		this.femaleModel = var2.femaleModel; // L: 274
		this.femaleModel1 = var2.femaleModel1; // L: 275
		this.femaleModel2 = var2.femaleModel2; // L: 276
		this.maleHeadModel = var2.maleHeadModel; // L: 277
		this.maleHeadModel2 = var2.maleHeadModel2; // L: 278
		this.femaleHeadModel = var2.femaleHeadModel; // L: 279
		this.femaleHeadModel2 = var2.femaleHeadModel2; // L: 280
		this.team = var2.team; // L: 281
		this.field2184 = var2.field2184; // L: 282
		this.field2189 = var2.field2189; // L: 283
		this.field2157 = var2.field2157; // L: 284
		this.groundActions = var2.groundActions; // L: 285
		this.field2196 = var2.field2196; // L: 286
		this.inventoryActions = new String[5]; // L: 287
		if (var2.inventoryActions != null) {
			for (int var3 = 0; var3 < 4; ++var3) { // L: 288
				this.inventoryActions[var3] = var2.inventoryActions[var3];
			}
		}

		this.inventoryActions[4] = "Discard"; // L: 289
		this.price = 0; // L: 290
	} // L: 291

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lhp;Lhp;B)V",
		garbageValue = "1"
	)
	@Export("genPlaceholder")
	void genPlaceholder(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model; // L: 294
		this.zoom2d = var1.zoom2d; // L: 295
		this.xan2d = var1.xan2d; // L: 296
		this.yan2d = var1.yan2d; // L: 297
		this.zan2d = var1.zan2d; // L: 298
		this.offsetX2d = var1.offsetX2d; // L: 299
		this.offsetY2d = var1.offsetY2d; // L: 300
		this.recolorFrom = var1.recolorFrom; // L: 301
		this.recolorTo = var1.recolorTo; // L: 302
		this.retextureFrom = var1.retextureFrom; // L: 303
		this.retextureTo = var1.retextureTo; // L: 304
		this.isStackable = var1.isStackable; // L: 305
		this.name = var2.name; // L: 306
		this.price = 0; // L: 307
		this.isMembersOnly = false; // L: 308
		this.isTradable = false; // L: 309
	} // L: 310

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)Lkm;",
		garbageValue = "-36"
	)
	@Export("getModelData")
	public final ModelData getModelData(int var1) {
		int var3;
		if (this.countobj != null && var1 > 1) { // L: 313
			int var2 = -1; // L: 314

			for (var3 = 0; var3 < 10; ++var3) { // L: 315
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) { // L: 316
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) { // L: 318
				return class341.ItemComposition_get(var2).getModelData(1);
			}
		}

		ModelData var4 = ModelData.ModelData_get(class166.ItemComposition_modelArchive, this.model, 0); // L: 320
		if (var4 == null) { // L: 321
			return null;
		} else {
			if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) { // L: 322
				var4.resize(this.resizeX, this.resizeY, this.resizeZ);
			}

			if (this.recolorFrom != null) { // L: 323
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) { // L: 324
					var4.recolor(this.recolorFrom[var3], this.recolorTo[var3]); // L: 325
				}
			}

			if (this.retextureFrom != null) { // L: 328
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) { // L: 329
					var4.retexture(this.retextureFrom[var3], this.retextureTo[var3]); // L: 330
				}
			}

			return var4; // L: 333
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Lko;",
		garbageValue = "-90603822"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		if (this.countobj != null && var1 > 1) { // L: 337
			int var2 = -1; // L: 338

			for (int var3 = 0; var3 < 10; ++var3) { // L: 339
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) { // L: 340
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) { // L: 342
				return class341.ItemComposition_get(var2).getModel(1);
			}
		}

		Model var5 = (Model)ItemComposition_cachedModels.get((long)this.id); // L: 344
		if (var5 != null) { // L: 345
			return var5;
		} else {
			ModelData var6 = ModelData.ModelData_get(class166.ItemComposition_modelArchive, this.model, 0); // L: 346
			if (var6 == null) { // L: 347
				return null;
			} else {
				if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) { // L: 348
					var6.resize(this.resizeX, this.resizeY, this.resizeZ);
				}

				int var4;
				if (this.recolorFrom != null) { // L: 349
					for (var4 = 0; var4 < this.recolorFrom.length; ++var4) { // L: 350
						var6.recolor(this.recolorFrom[var4], this.recolorTo[var4]); // L: 351
					}
				}

				if (this.retextureFrom != null) { // L: 354
					for (var4 = 0; var4 < this.retextureFrom.length; ++var4) { // L: 355
						var6.retexture(this.retextureFrom[var4], this.retextureTo[var4]); // L: 356
					}
				}

				var5 = var6.toModel(this.field2193 + 64, this.field2194 * 5 + 768, -50, -10, -50); // L: 359
				var5.isSingleTile = true; // L: 360
				ItemComposition_cachedModels.put(var5, (long)this.id); // L: 361
				return var5; // L: 362
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)Lhp;",
		garbageValue = "1135514847"
	)
	@Export("getCountObj")
	public ItemComposition getCountObj(int var1) {
		if (this.countobj != null && var1 > 1) { // L: 366
			int var2 = -1; // L: 367

			for (int var3 = 0; var3 < 10; ++var3) { // L: 368
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) {
					var2 = this.countobj[var3]; // L: 369
				}
			}

			if (var2 != -1) { // L: 371
				return class341.ItemComposition_get(var2);
			}
		}

		return this; // L: 373
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-88"
	)
	public final boolean method3994(int var1) {
		int var2 = this.femaleModel; // L: 459
		int var3 = this.femaleModel1; // L: 460
		int var4 = this.femaleModel2; // L: 461
		if (var1 == 1) { // L: 462
			var2 = this.maleHeadModel; // L: 463
			var3 = this.maleHeadModel2; // L: 464
			var4 = this.femaleHeadModel; // L: 465
		}

		if (var2 == -1) { // L: 467
			return true;
		} else {
			boolean var5 = true; // L: 468
			if (!class166.ItemComposition_modelArchive.tryLoadFile(var2, 0)) { // L: 469
				var5 = false;
			}

			if (var3 != -1 && !class166.ItemComposition_modelArchive.tryLoadFile(var3, 0)) { // L: 470
				var5 = false;
			}

			if (var4 != -1 && !class166.ItemComposition_modelArchive.tryLoadFile(var4, 0)) { // L: 471
				var5 = false;
			}

			return var5; // L: 472
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Lkm;",
		garbageValue = "-155780402"
	)
	public final ModelData method3989(int var1) {
		int var2 = this.femaleModel; // L: 476
		int var3 = this.femaleModel1; // L: 477
		int var4 = this.femaleModel2; // L: 478
		if (var1 == 1) { // L: 479
			var2 = this.maleHeadModel; // L: 480
			var3 = this.maleHeadModel2; // L: 481
			var4 = this.femaleHeadModel; // L: 482
		}

		if (var2 == -1) { // L: 484
			return null;
		} else {
			ModelData var5 = ModelData.ModelData_get(class166.ItemComposition_modelArchive, var2, 0); // L: 485
			if (var3 != -1) { // L: 486
				ModelData var6 = ModelData.ModelData_get(class166.ItemComposition_modelArchive, var3, 0); // L: 487
				if (var4 != -1) { // L: 488
					ModelData var7 = ModelData.ModelData_get(class166.ItemComposition_modelArchive, var4, 0); // L: 489
					ModelData[] var8 = new ModelData[]{var5, var6, var7}; // L: 490
					var5 = new ModelData(var8, 3); // L: 491
				} else {
					ModelData[] var10 = new ModelData[]{var5, var6}; // L: 494
					var5 = new ModelData(var10, 2); // L: 495
				}
			}

			if (var1 == 0 && this.femaleOffset != 0) { // L: 498
				var5.changeOffset(0, this.femaleOffset, 0);
			}

			if (var1 == 1 && this.field2147 != 0) { // L: 499
				var5.changeOffset(0, this.field2147, 0);
			}

			int var9;
			if (this.recolorFrom != null) { // L: 500
				for (var9 = 0; var9 < this.recolorFrom.length; ++var9) { // L: 501
					var5.recolor(this.recolorFrom[var9], this.recolorTo[var9]); // L: 502
				}
			}

			if (this.retextureFrom != null) { // L: 505
				for (var9 = 0; var9 < this.retextureFrom.length; ++var9) { // L: 506
					var5.retexture(this.retextureFrom[var9], this.retextureTo[var9]); // L: 507
				}
			}

			return var5; // L: 510
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "12"
	)
	public final boolean method4018(int var1) {
		int var2 = this.femaleHeadModel2; // L: 514
		int var3 = this.team; // L: 515
		if (var1 == 1) { // L: 516
			var2 = this.field2184; // L: 517
			var3 = this.field2189; // L: 518
		}

		if (var2 == -1) { // L: 520
			return true;
		} else {
			boolean var4 = true; // L: 521
			if (!class166.ItemComposition_modelArchive.tryLoadFile(var2, 0)) { // L: 522
				var4 = false;
			}

			if (var3 != -1 && !class166.ItemComposition_modelArchive.tryLoadFile(var3, 0)) { // L: 523
				var4 = false;
			}

			return var4; // L: 524
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)Lkm;",
		garbageValue = "100"
	)
	public final ModelData method3997(int var1) {
		int var2 = this.femaleHeadModel2; // L: 528
		int var3 = this.team; // L: 529
		if (var1 == 1) { // L: 530
			var2 = this.field2184; // L: 531
			var3 = this.field2189; // L: 532
		}

		if (var2 == -1) { // L: 534
			return null;
		} else {
			ModelData var4 = ModelData.ModelData_get(class166.ItemComposition_modelArchive, var2, 0); // L: 535
			if (var3 != -1) { // L: 536
				ModelData var5 = ModelData.ModelData_get(class166.ItemComposition_modelArchive, var3, 0); // L: 537
				ModelData[] var6 = new ModelData[]{var4, var5}; // L: 538
				var4 = new ModelData(var6, 2); // L: 539
			}

			int var7;
			if (this.recolorFrom != null) { // L: 541
				for (var7 = 0; var7 < this.recolorFrom.length; ++var7) { // L: 542
					var4.recolor(this.recolorFrom[var7], this.recolorTo[var7]); // L: 543
				}
			}

			if (this.retextureFrom != null) { // L: 546
				for (var7 = 0; var7 < this.retextureFrom.length; ++var7) { // L: 547
					var4.retexture(this.retextureFrom[var7], this.retextureTo[var7]); // L: 548
				}
			}

			return var4; // L: 551
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-231958194"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		IterableNodeHashTable var4 = this.params; // L: 556
		int var3;
		if (var4 == null) { // L: 558
			var3 = var2; // L: 559
		} else {
			IntegerNode var5 = (IntegerNode)var4.get((long)var1); // L: 562
			if (var5 == null) { // L: 563
				var3 = var2; // L: 564
			} else {
				var3 = var5.integer; // L: 567
			}
		}

		return var3; // L: 569
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "739364563"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		IterableNodeHashTable var4 = this.params; // L: 574
		String var3;
		if (var4 == null) { // L: 576
			var3 = var2; // L: 577
		} else {
			ObjectNode var5 = (ObjectNode)var4.get((long)var1); // L: 580
			if (var5 == null) { // L: 581
				var3 = var2; // L: 582
			} else {
				var3 = (String)var5.obj; // L: 585
			}
		}

		return var3; // L: 587
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "195810862"
	)
	@Export("getShiftClickIndex")
	public int getShiftClickIndex() {
		if (this.shiftClickIndex != -1 && this.inventoryActions != null) { // L: 591
			if (this.shiftClickIndex >= 0) { // L: 592
				return this.inventoryActions[this.shiftClickIndex] != null ? this.shiftClickIndex : -1;
			} else {
				return "Drop".equalsIgnoreCase(this.inventoryActions[4]) ? 4 : -1; // L: 593
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1236262389"
	)
	boolean method4001() {
		return this.recolorTo != null; // L: 597
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1856052962"
	)
	boolean method3990() {
		return this.retextureTo != null; // L: 601
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "([BIII)Ljava/lang/String;",
		garbageValue = "-1996387073"
	)
	public static String method4053(byte[] var0, int var1, int var2) {
		StringBuilder var3 = new StringBuilder(); // L: 58

		for (int var4 = var1; var4 < var2 + var1; var4 += 3) { // L: 59
			int var5 = var0[var4] & 255; // L: 60
			var3.append(class401.field4493[var5 >>> 2]); // L: 61
			if (var4 < var2 - 1) { // L: 62
				int var6 = var0[var4 + 1] & 255; // L: 63
				var3.append(class401.field4493[(var5 & 3) << 4 | var6 >>> 4]); // L: 64
				if (var4 < var2 - 2) { // L: 65
					int var7 = var0[var4 + 2] & 255; // L: 66
					var3.append(class401.field4493[(var6 & 15) << 2 | var7 >>> 6]).append(class401.field4493[var7 & 63]); // L: 67
				} else {
					var3.append(class401.field4493[(var6 & 15) << 2]).append("="); // L: 69
				}
			} else {
				var3.append(class401.field4493[(var5 & 3) << 4]).append("=="); // L: 71
			}
		}

		return var3.toString(); // L: 73
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)[Luc;",
		garbageValue = "437145975"
	)
	static SpritePixels[] method4054() {
		SpritePixels[] var0 = new SpritePixels[class545.SpriteBuffer_spriteCount]; // L: 148

		for (int var1 = 0; var1 < class545.SpriteBuffer_spriteCount; ++var1) { // L: 149
			SpritePixels var2 = var0[var1] = new SpritePixels(); // L: 150
			var2.width = class545.SpriteBuffer_spriteWidth; // L: 151
			var2.height = class545.SpriteBuffer_spriteHeight; // L: 152
			var2.xOffset = class545.SpriteBuffer_xOffsets[var1]; // L: 153
			var2.yOffset = class388.SpriteBuffer_yOffsets[var1]; // L: 154
			var2.subWidth = FriendsList.SpriteBuffer_spriteWidths[var1]; // L: 155
			var2.subHeight = GrandExchangeOfferOwnWorldComparator.SpriteBuffer_spriteHeights[var1]; // L: 156
			int var3 = var2.subHeight * var2.subWidth; // L: 157
			byte[] var4 = class230.SpriteBuffer_pixels[var1]; // L: 158
			var2.pixels = new int[var3]; // L: 159

			for (int var5 = 0; var5 < var3; ++var5) { // L: 160
				var2.pixels[var5] = class113.SpriteBuffer_spritePalette[var4[var5] & 255];
			}
		}

		class545.SpriteBuffer_xOffsets = null; // L: 163
		class388.SpriteBuffer_yOffsets = null; // L: 164
		FriendsList.SpriteBuffer_spriteWidths = null; // L: 165
		GrandExchangeOfferOwnWorldComparator.SpriteBuffer_spriteHeights = null; // L: 166
		class113.SpriteBuffer_spritePalette = null; // L: 167
		class230.SpriteBuffer_pixels = null; // L: 168
		return var0; // L: 170
	}
}
