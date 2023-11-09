import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hc")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("ItemComposition_cached")
	static EvictingDualNodeHashTable ItemComposition_cached;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("ItemComposition_cachedModels")
	static EvictingDualNodeHashTable ItemComposition_cachedModels;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("ItemComposition_cachedSprites")
	static EvictingDualNodeHashTable ItemComposition_cachedSprites;
	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "Lpc;"
	)
	static Font field2225;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -163190337
	)
	@Export("id")
	int id;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1195319881
	)
	@Export("model")
	int model;
	@ObfuscatedName("au")
	@Export("name")
	public String name;
	@ObfuscatedName("ae")
	@Export("recolorFrom")
	public short[] recolorFrom;
	@ObfuscatedName("ab")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("ad")
	@Export("retextureFrom")
	public short[] retextureFrom;
	@ObfuscatedName("ao")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -69298571
	)
	@Export("zoom2d")
	public int zoom2d;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -2112257917
	)
	@Export("xan2d")
	public int xan2d;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 137011091
	)
	@Export("yan2d")
	public int yan2d;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1966828895
	)
	@Export("zan2d")
	public int zan2d;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1704892459
	)
	@Export("offsetX2d")
	public int offsetX2d;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -882045703
	)
	@Export("offsetY2d")
	public int offsetY2d;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -136732841
	)
	@Export("isStackable")
	public int isStackable;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1350476855
	)
	@Export("price")
	public int price;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 435680099
	)
	@Export("maleModel")
	public int maleModel;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -1493944201
	)
	@Export("maleModel1")
	public int maleModel1;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 2143296567
	)
	@Export("maleModel2")
	public int maleModel2;
	@ObfuscatedName("bv")
	@Export("isMembersOnly")
	public boolean isMembersOnly;
	@ObfuscatedName("bq")
	@Export("groundActions")
	public String[] groundActions;
	@ObfuscatedName("bo")
	@Export("inventoryActions")
	public String[] inventoryActions;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 1689705735
	)
	@Export("shiftClickIndex")
	int shiftClickIndex;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 1378659441
	)
	@Export("femaleModel")
	int femaleModel;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -1876259537
	)
	@Export("femaleModel1")
	int femaleModel1;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -957723421
	)
	@Export("femaleOffset")
	int femaleOffset;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -298134757
	)
	@Export("maleHeadModel")
	int maleHeadModel;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1652189291
	)
	@Export("maleHeadModel2")
	int maleHeadModel2;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 2104455301
	)
	int field2218;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -1826813109
	)
	@Export("femaleModel2")
	int femaleModel2;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1607549661
	)
	@Export("femaleHeadModel")
	int femaleHeadModel;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -262906591
	)
	@Export("femaleHeadModel2")
	int femaleHeadModel2;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 321846629
	)
	int field2222;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 1512074145
	)
	int field2223;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 1292484959
	)
	int field2233;
	@ObfuscatedName("bg")
	@Export("countobj")
	int[] countobj;
	@ObfuscatedName("bj")
	@Export("countco")
	int[] countco;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -386546403
	)
	@Export("note")
	public int note;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 1466156845
	)
	@Export("noteTemplate")
	public int noteTemplate;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 1229760533
	)
	@Export("resizeX")
	int resizeX;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 911517565
	)
	@Export("resizeY")
	int resizeY;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -1030793615
	)
	@Export("resizeZ")
	int resizeZ;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = 1274205593
	)
	public int field2232;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -148170885
	)
	public int field2236;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 2023330695
	)
	@Export("team")
	public int team;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 1138078011
	)
	public int field2240;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Lsa;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("cm")
	@Export("isTradable")
	public boolean isTradable;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -1262060089
	)
	@Export("unnotedId")
	int unnotedId;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -1383997373
	)
	@Export("notedId")
	int notedId;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 1971092783
	)
	@Export("placeholder")
	public int placeholder;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 575355903
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
		this.femaleModel1 = -1; // L: 58
		this.femaleOffset = 0; // L: 59
		this.maleHeadModel = -1; // L: 60
		this.maleHeadModel2 = -1; // L: 61
		this.field2218 = 0; // L: 62
		this.femaleModel2 = -1; // L: 63
		this.femaleHeadModel = -1; // L: 64
		this.femaleHeadModel2 = -1; // L: 65
		this.field2222 = -1; // L: 66
		this.field2223 = -1; // L: 67
		this.field2233 = -1; // L: 68
		this.note = -1; // L: 71
		this.noteTemplate = -1; // L: 72
		this.resizeX = 128; // L: 73
		this.resizeY = 128; // L: 74
		this.resizeZ = 128; // L: 75
		this.field2232 = 0; // L: 76
		this.field2236 = 0; // L: 77
		this.team = 0; // L: 78
		this.field2240 = 0; // L: 79
		this.isTradable = false; // L: 81
		this.unnotedId = -1; // L: 82
		this.notedId = -1; // L: 83
		this.placeholder = -1; // L: 84
		this.placeholderTemplate = -1; // L: 85
	} // L: 87

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "908624790"
	)
	@Export("post")
	void post() {
		if (this.isStackable == 1) { // L: 138
			this.field2240 = 0;
		}

	} // L: 139

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lty;I)V",
		garbageValue = "-591135841"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 143
			if (var2 == 0) { // L: 144
				return; // L: 147
			}

			this.decodeNext(var1, var2); // L: 145
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lty;II)V",
		garbageValue = "-1732783795"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 150
			this.model = var1.readUnsignedShort();
		} else if (var2 == 2) { // L: 151
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 152
			this.zoom2d = var1.readUnsignedShort();
		} else if (var2 == 5) { // L: 153
			this.xan2d = var1.readUnsignedShort();
		} else if (var2 == 6) { // L: 154
			this.yan2d = var1.readUnsignedShort();
		} else if (var2 == 7) { // L: 155
			this.offsetX2d = var1.readUnsignedShort(); // L: 156
			if (this.offsetX2d > 32767) { // L: 157
				this.offsetX2d -= 65536;
			}
		} else if (var2 == 8) { // L: 159
			this.offsetY2d = var1.readUnsignedShort(); // L: 160
			if (this.offsetY2d > 32767) { // L: 161
				this.offsetY2d -= 65536;
			}
		} else if (var2 == 9) { // L: 163
			var1.readStringCp1252NullTerminated(); // L: 164
		} else if (var2 == 11) { // L: 166
			this.isStackable = 1;
		} else if (var2 == 12) { // L: 167
			this.price = var1.readInt();
		} else if (var2 == 13) { // L: 168
			this.maleModel = var1.readUnsignedByte();
		} else if (var2 == 14) { // L: 169
			this.maleModel1 = var1.readUnsignedByte();
		} else if (var2 == 16) { // L: 170
			this.isMembersOnly = true;
		} else if (var2 == 23) { // L: 171
			this.femaleModel = var1.readUnsignedShort(); // L: 172
			this.femaleOffset = var1.readUnsignedByte(); // L: 173
		} else if (var2 == 24) { // L: 175
			this.femaleModel1 = var1.readUnsignedShort();
		} else if (var2 == 25) { // L: 176
			this.maleHeadModel = var1.readUnsignedShort(); // L: 177
			this.field2218 = var1.readUnsignedByte(); // L: 178
		} else if (var2 == 26) { // L: 180
			this.maleHeadModel2 = var1.readUnsignedShort();
		} else if (var2 == 27) { // L: 181
			this.maleModel2 = var1.readUnsignedByte();
		} else if (var2 >= 30 && var2 < 35) { // L: 182
			this.groundActions[var2 - 30] = var1.readStringCp1252NullTerminated(); // L: 183
			if (this.groundActions[var2 - 30].equalsIgnoreCase("Hidden")) { // L: 184
				this.groundActions[var2 - 30] = null;
			}
		} else if (var2 >= 35 && var2 < 40) { // L: 186
			this.inventoryActions[var2 - 35] = var1.readStringCp1252NullTerminated();
		} else {
			int var3;
			int var4;
			if (var2 == 40) { // L: 187
				var3 = var1.readUnsignedByte(); // L: 188
				this.recolorFrom = new short[var3]; // L: 189
				this.recolorTo = new short[var3]; // L: 190

				for (var4 = 0; var4 < var3; ++var4) { // L: 191
					this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 192
					this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 193
				}
			} else if (var2 == 41) { // L: 196
				var3 = var1.readUnsignedByte(); // L: 197
				this.retextureFrom = new short[var3]; // L: 198
				this.retextureTo = new short[var3]; // L: 199

				for (var4 = 0; var4 < var3; ++var4) { // L: 200
					this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 201
					this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 202
				}
			} else if (var2 == 42) { // L: 205
				this.shiftClickIndex = var1.readByte(); // L: 206
			} else if (var2 == 65) { // L: 208
				this.isTradable = true; // L: 209
			} else if (var2 == 75) { // L: 211
				this.field2240 = var1.readShort();
			} else if (var2 == 78) { // L: 212
				this.femaleModel2 = var1.readUnsignedShort();
			} else if (var2 == 79) { // L: 213
				this.femaleHeadModel = var1.readUnsignedShort();
			} else if (var2 == 90) { // L: 214
				this.femaleHeadModel2 = var1.readUnsignedShort();
			} else if (var2 == 91) { // L: 215
				this.field2223 = var1.readUnsignedShort();
			} else if (var2 == 92) { // L: 216
				this.field2222 = var1.readUnsignedShort();
			} else if (var2 == 93) { // L: 217
				this.field2233 = var1.readUnsignedShort();
			} else if (var2 == 94) { // L: 218
				var1.readUnsignedShort(); // L: 219
			} else if (var2 == 95) { // L: 221
				this.zan2d = var1.readUnsignedShort();
			} else if (var2 == 97) { // L: 222
				this.note = var1.readUnsignedShort();
			} else if (var2 == 98) { // L: 223
				this.noteTemplate = var1.readUnsignedShort();
			} else if (var2 >= 100 && var2 < 110) { // L: 224
				if (this.countobj == null) { // L: 225
					this.countobj = new int[10]; // L: 226
					this.countco = new int[10]; // L: 227
				}

				this.countobj[var2 - 100] = var1.readUnsignedShort(); // L: 229
				this.countco[var2 - 100] = var1.readUnsignedShort(); // L: 230
			} else if (var2 == 110) { // L: 232
				this.resizeX = var1.readUnsignedShort();
			} else if (var2 == 111) { // L: 233
				this.resizeY = var1.readUnsignedShort();
			} else if (var2 == 112) { // L: 234
				this.resizeZ = var1.readUnsignedShort();
			} else if (var2 == 113) { // L: 235
				this.field2232 = var1.readByte();
			} else if (var2 == 114) { // L: 236
				this.field2236 = var1.readByte();
			} else if (var2 == 115) { // L: 237
				this.team = var1.readUnsignedByte();
			} else if (var2 == 139) { // L: 238
				this.unnotedId = var1.readUnsignedShort();
			} else if (var2 == 140) { // L: 239
				this.notedId = var1.readUnsignedShort();
			} else if (var2 == 148) { // L: 240
				this.placeholder = var1.readUnsignedShort();
			} else if (var2 == 149) { // L: 241
				this.placeholderTemplate = var1.readUnsignedShort();
			} else if (var2 == 249) { // L: 242
				this.params = class141.readStringIntParameters(var1, this.params);
			}
		}

	} // L: 244

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lhc;Lhc;I)V",
		garbageValue = "-279159278"
	)
	@Export("genCert")
	void genCert(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model; // L: 247
		this.zoom2d = var1.zoom2d; // L: 248
		this.xan2d = var1.xan2d; // L: 249
		this.yan2d = var1.yan2d; // L: 250
		this.zan2d = var1.zan2d; // L: 251
		this.offsetX2d = var1.offsetX2d; // L: 252
		this.offsetY2d = var1.offsetY2d; // L: 253
		this.recolorFrom = var1.recolorFrom; // L: 254
		this.recolorTo = var1.recolorTo; // L: 255
		this.retextureFrom = var1.retextureFrom; // L: 256
		this.retextureTo = var1.retextureTo; // L: 257
		this.name = var2.name; // L: 258
		this.isMembersOnly = var2.isMembersOnly; // L: 259
		this.price = var2.price; // L: 260
		this.isStackable = 1; // L: 261
	} // L: 262

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lhc;Lhc;B)V",
		garbageValue = "74"
	)
	@Export("genBought")
	void genBought(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model; // L: 265
		this.zoom2d = var1.zoom2d; // L: 266
		this.xan2d = var1.xan2d; // L: 267
		this.yan2d = var1.yan2d; // L: 268
		this.zan2d = var1.zan2d; // L: 269
		this.offsetX2d = var1.offsetX2d; // L: 270
		this.offsetY2d = var1.offsetY2d; // L: 271
		this.recolorFrom = var2.recolorFrom; // L: 272
		this.recolorTo = var2.recolorTo; // L: 273
		this.retextureFrom = var2.retextureFrom; // L: 274
		this.retextureTo = var2.retextureTo; // L: 275
		this.name = var2.name; // L: 276
		this.isMembersOnly = var2.isMembersOnly; // L: 277
		this.isStackable = var2.isStackable; // L: 278
		this.maleModel = var2.maleModel; // L: 279
		this.maleModel1 = var2.maleModel1; // L: 280
		this.maleModel2 = var2.maleModel2; // L: 281
		this.femaleModel = var2.femaleModel; // L: 282
		this.femaleModel1 = var2.femaleModel1; // L: 283
		this.femaleModel2 = var2.femaleModel2; // L: 284
		this.maleHeadModel = var2.maleHeadModel; // L: 285
		this.maleHeadModel2 = var2.maleHeadModel2; // L: 286
		this.femaleHeadModel = var2.femaleHeadModel; // L: 287
		this.femaleHeadModel2 = var2.femaleHeadModel2; // L: 288
		this.field2222 = var2.field2222; // L: 289
		this.field2223 = var2.field2223; // L: 290
		this.field2233 = var2.field2233; // L: 291
		this.team = var2.team; // L: 292
		this.groundActions = var2.groundActions; // L: 293
		this.field2240 = var2.field2240; // L: 294
		this.inventoryActions = new String[5]; // L: 295
		if (var2.inventoryActions != null) {
			for (int var3 = 0; var3 < 4; ++var3) { // L: 296
				this.inventoryActions[var3] = var2.inventoryActions[var3];
			}
		}

		this.inventoryActions[4] = "Discard"; // L: 297
		this.price = 0; // L: 298
	} // L: 299

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lhc;Lhc;B)V",
		garbageValue = "37"
	)
	@Export("genPlaceholder")
	void genPlaceholder(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model; // L: 302
		this.zoom2d = var1.zoom2d; // L: 303
		this.xan2d = var1.xan2d; // L: 304
		this.yan2d = var1.yan2d; // L: 305
		this.zan2d = var1.zan2d; // L: 306
		this.offsetX2d = var1.offsetX2d; // L: 307
		this.offsetY2d = var1.offsetY2d; // L: 308
		this.recolorFrom = var1.recolorFrom; // L: 309
		this.recolorTo = var1.recolorTo; // L: 310
		this.retextureFrom = var1.retextureFrom; // L: 311
		this.retextureTo = var1.retextureTo; // L: 312
		this.isStackable = var1.isStackable; // L: 313
		this.name = var2.name; // L: 314
		this.price = 0; // L: 315
		this.isMembersOnly = false; // L: 316
		this.isTradable = false; // L: 317
	} // L: 318

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Lie;",
		garbageValue = "1090571932"
	)
	@Export("getModelData")
	public final ModelData getModelData(int var1) {
		int var3;
		if (this.countobj != null && var1 > 1) { // L: 321
			int var2 = -1; // L: 322

			for (var3 = 0; var3 < 10; ++var3) { // L: 323
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) { // L: 324
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) { // L: 326
				return class125.ItemComposition_get(var2).getModelData(1);
			}
		}

		ModelData var4 = ModelData.ModelData_get(class140.ItemComposition_modelArchive, this.model, 0); // L: 328
		if (var4 == null) { // L: 329
			return null;
		} else {
			if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) { // L: 330
				var4.resize(this.resizeX, this.resizeY, this.resizeZ);
			}

			if (this.recolorFrom != null) { // L: 331
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) { // L: 332
					var4.recolor(this.recolorFrom[var3], this.recolorTo[var3]); // L: 333
				}
			}

			if (this.retextureFrom != null) { // L: 336
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) { // L: 337
					var4.retexture(this.retextureFrom[var3], this.retextureTo[var3]); // L: 338
				}
			}

			return var4; // L: 341
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljo;",
		garbageValue = "1"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		if (this.countobj != null && var1 > 1) { // L: 345
			int var2 = -1; // L: 346

			for (int var3 = 0; var3 < 10; ++var3) { // L: 347
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) { // L: 348
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) { // L: 350
				return class125.ItemComposition_get(var2).getModel(1);
			}
		}

		Model var5 = (Model)ItemComposition_cachedModels.get((long)this.id); // L: 352
		if (var5 != null) { // L: 353
			return var5;
		} else {
			ModelData var6 = ModelData.ModelData_get(class140.ItemComposition_modelArchive, this.model, 0); // L: 354
			if (var6 == null) { // L: 355
				return null;
			} else {
				if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) { // L: 356
					var6.resize(this.resizeX, this.resizeY, this.resizeZ);
				}

				int var4;
				if (this.recolorFrom != null) { // L: 357
					for (var4 = 0; var4 < this.recolorFrom.length; ++var4) { // L: 358
						var6.recolor(this.recolorFrom[var4], this.recolorTo[var4]); // L: 359
					}
				}

				if (this.retextureFrom != null) { // L: 362
					for (var4 = 0; var4 < this.retextureFrom.length; ++var4) { // L: 363
						var6.retexture(this.retextureFrom[var4], this.retextureTo[var4]); // L: 364
					}
				}

				var5 = var6.toModel(this.field2232 + 64, this.field2236 * 5 + 768, -50, -10, -50); // L: 367
				var5.isSingleTile = true; // L: 368
				ItemComposition_cachedModels.put(var5, (long)this.id); // L: 369
				return var5; // L: 370
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhc;",
		garbageValue = "1"
	)
	@Export("getCountObj")
	public ItemComposition getCountObj(int var1) {
		if (this.countobj != null && var1 > 1) { // L: 374
			int var2 = -1; // L: 375

			for (int var3 = 0; var3 < 10; ++var3) { // L: 376
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) {
					var2 = this.countobj[var3]; // L: 377
				}
			}

			if (var2 != -1) { // L: 379
				return class125.ItemComposition_get(var2);
			}
		}

		return this; // L: 381
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "14"
	)
	public final boolean method4040(int var1) {
		int var2 = this.femaleModel; // L: 460
		int var3 = this.femaleModel1; // L: 461
		int var4 = this.femaleModel2; // L: 462
		if (var1 == 1) { // L: 463
			var2 = this.maleHeadModel; // L: 464
			var3 = this.maleHeadModel2; // L: 465
			var4 = this.femaleHeadModel; // L: 466
		}

		if (var2 == -1) { // L: 468
			return true;
		} else {
			boolean var5 = true; // L: 469
			if (!class140.ItemComposition_modelArchive.tryLoadFile(var2, 0)) { // L: 470
				var5 = false;
			}

			if (var3 != -1 && !class140.ItemComposition_modelArchive.tryLoadFile(var3, 0)) { // L: 471
				var5 = false;
			}

			if (var4 != -1 && !class140.ItemComposition_modelArchive.tryLoadFile(var4, 0)) { // L: 472
				var5 = false;
			}

			return var5; // L: 473
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)Lie;",
		garbageValue = "-1706198430"
	)
	public final ModelData method3975(int var1) {
		int var2 = this.femaleModel; // L: 477
		int var3 = this.femaleModel1; // L: 478
		int var4 = this.femaleModel2; // L: 479
		if (var1 == 1) { // L: 480
			var2 = this.maleHeadModel; // L: 481
			var3 = this.maleHeadModel2; // L: 482
			var4 = this.femaleHeadModel; // L: 483
		}

		if (var2 == -1) { // L: 485
			return null;
		} else {
			ModelData var5 = ModelData.ModelData_get(class140.ItemComposition_modelArchive, var2, 0); // L: 486
			if (var3 != -1) { // L: 487
				ModelData var6 = ModelData.ModelData_get(class140.ItemComposition_modelArchive, var3, 0); // L: 488
				if (var4 != -1) { // L: 489
					ModelData var7 = ModelData.ModelData_get(class140.ItemComposition_modelArchive, var4, 0); // L: 490
					ModelData[] var8 = new ModelData[]{var5, var6, var7}; // L: 491
					var5 = new ModelData(var8, 3); // L: 492
				} else {
					ModelData[] var10 = new ModelData[]{var5, var6}; // L: 495
					var5 = new ModelData(var10, 2); // L: 496
				}
			}

			if (var1 == 0 && this.femaleOffset != 0) { // L: 499
				var5.changeOffset(0, this.femaleOffset, 0);
			}

			if (var1 == 1 && this.field2218 != 0) { // L: 500
				var5.changeOffset(0, this.field2218, 0);
			}

			int var9;
			if (this.recolorFrom != null) { // L: 501
				for (var9 = 0; var9 < this.recolorFrom.length; ++var9) { // L: 502
					var5.recolor(this.recolorFrom[var9], this.recolorTo[var9]); // L: 503
				}
			}

			if (this.retextureFrom != null) { // L: 506
				for (var9 = 0; var9 < this.retextureFrom.length; ++var9) { // L: 507
					var5.retexture(this.retextureFrom[var9], this.retextureTo[var9]); // L: 508
				}
			}

			return var5; // L: 511
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1820118028"
	)
	public final boolean method3976(int var1) {
		int var2 = this.femaleHeadModel2; // L: 515
		int var3 = this.field2222; // L: 516
		if (var1 == 1) { // L: 517
			var2 = this.field2223; // L: 518
			var3 = this.field2233; // L: 519
		}

		if (var2 == -1) { // L: 521
			return true;
		} else {
			boolean var4 = true; // L: 522
			if (!class140.ItemComposition_modelArchive.tryLoadFile(var2, 0)) { // L: 523
				var4 = false;
			}

			if (var3 != -1 && !class140.ItemComposition_modelArchive.tryLoadFile(var3, 0)) { // L: 524
				var4 = false;
			}

			return var4; // L: 525
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Lie;",
		garbageValue = "1709950556"
	)
	public final ModelData method4027(int var1) {
		int var2 = this.femaleHeadModel2; // L: 529
		int var3 = this.field2222; // L: 530
		if (var1 == 1) { // L: 531
			var2 = this.field2223; // L: 532
			var3 = this.field2233; // L: 533
		}

		if (var2 == -1) { // L: 535
			return null;
		} else {
			ModelData var4 = ModelData.ModelData_get(class140.ItemComposition_modelArchive, var2, 0); // L: 536
			if (var3 != -1) { // L: 537
				ModelData var5 = ModelData.ModelData_get(class140.ItemComposition_modelArchive, var3, 0); // L: 538
				ModelData[] var6 = new ModelData[]{var4, var5}; // L: 539
				var4 = new ModelData(var6, 2); // L: 540
			}

			int var7;
			if (this.recolorFrom != null) { // L: 542
				for (var7 = 0; var7 < this.recolorFrom.length; ++var7) { // L: 543
					var4.recolor(this.recolorFrom[var7], this.recolorTo[var7]); // L: 544
				}
			}

			if (this.retextureFrom != null) { // L: 547
				for (var7 = 0; var7 < this.retextureFrom.length; ++var7) { // L: 548
					var4.retexture(this.retextureFrom[var7], this.retextureTo[var7]); // L: 549
				}
			}

			return var4; // L: 552
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "655176958"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return FileSystem.method3540(this.params, var1, var2); // L: 556
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1588687604"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		IterableNodeHashTable var4 = this.params; // L: 561
		String var3;
		if (var4 == null) { // L: 563
			var3 = var2; // L: 564
		} else {
			ObjectNode var5 = (ObjectNode)var4.get((long)var1); // L: 567
			if (var5 == null) { // L: 568
				var3 = var2; // L: 569
			} else {
				var3 = (String)var5.obj; // L: 572
			}
		}

		return var3; // L: 574
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "43603249"
	)
	@Export("getShiftClickIndex")
	public int getShiftClickIndex() {
		if (this.shiftClickIndex != -1 && this.inventoryActions != null) { // L: 578
			if (this.shiftClickIndex >= 0) { // L: 579
				return this.inventoryActions[this.shiftClickIndex] != null ? this.shiftClickIndex : -1;
			} else {
				return "Drop".equalsIgnoreCase(this.inventoryActions[4]) ? 4 : -1; // L: 580
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "339"
	)
	boolean method3989() {
		return this.recolorTo != null; // L: 601
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1427886067"
	)
	boolean method3982() {
		return this.retextureTo != null; // L: 605
	}
}
