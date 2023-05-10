import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hz")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("ItemComposition_modelArchive")
	public static AbstractArchive ItemComposition_modelArchive;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	@Export("ItemComposition_cached")
	static EvictingDualNodeHashTable ItemComposition_cached;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	@Export("ItemComposition_cachedModels")
	static EvictingDualNodeHashTable ItemComposition_cachedModels;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	@Export("ItemComposition_cachedSprites")
	static EvictingDualNodeHashTable ItemComposition_cachedSprites;
	@ObfuscatedName("sq")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	@Export("guestClanSettings")
	static ClanSettings guestClanSettings;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -264956633
	)
	@Export("id")
	int id;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 2000117511
	)
	@Export("model")
	int model;
	@ObfuscatedName("ah")
	@Export("name")
	public String name;
	@ObfuscatedName("av")
	@Export("recolorFrom")
	public short[] recolorFrom;
	@ObfuscatedName("ar")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("am")
	@Export("retextureFrom")
	public short[] retextureFrom;
	@ObfuscatedName("as")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1014971553
	)
	@Export("zoom2d")
	public int zoom2d;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 415331477
	)
	@Export("xan2d")
	public int xan2d;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -2044433177
	)
	@Export("yan2d")
	public int yan2d;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 450595207
	)
	@Export("zan2d")
	public int zan2d;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 151912273
	)
	@Export("offsetX2d")
	public int offsetX2d;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -271411709
	)
	@Export("offsetY2d")
	public int offsetY2d;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 1552863327
	)
	@Export("isStackable")
	public int isStackable;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -1706039181
	)
	@Export("price")
	public int price;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1935812527
	)
	@Export("maleModel")
	public int maleModel;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -1719338253
	)
	@Export("maleModel1")
	public int maleModel1;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 723093341
	)
	@Export("maleModel2")
	public int maleModel2;
	@ObfuscatedName("bz")
	@Export("isMembersOnly")
	public boolean isMembersOnly;
	@ObfuscatedName("bm")
	@Export("groundActions")
	public String[] groundActions;
	@ObfuscatedName("bd")
	@Export("inventoryActions")
	public String[] inventoryActions;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -377028789
	)
	@Export("shiftClickIndex")
	int shiftClickIndex;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 1259737505
	)
	@Export("femaleModel")
	int femaleModel;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -1975240801
	)
	@Export("femaleModel1")
	int femaleModel1;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 1328855603
	)
	@Export("femaleOffset")
	int femaleOffset;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -1355512081
	)
	@Export("maleHeadModel")
	int maleHeadModel;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -1937321521
	)
	@Export("maleHeadModel2")
	int maleHeadModel2;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -846717499
	)
	int field2243;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1550321451
	)
	@Export("femaleModel2")
	int femaleModel2;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1169668803
	)
	@Export("femaleHeadModel")
	int femaleHeadModel;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 2144570273
	)
	@Export("femaleHeadModel2")
	int femaleHeadModel2;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 1570928533
	)
	int field2242;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -560329405
	)
	int field2208;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1869912693
	)
	int field2249;
	@ObfuscatedName("bh")
	@Export("countobj")
	int[] countobj;
	@ObfuscatedName("bw")
	@Export("countco")
	int[] countco;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 1399852547
	)
	@Export("note")
	public int note;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -1375068187
	)
	@Export("noteTemplate")
	public int noteTemplate;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 614283261
	)
	@Export("resizeX")
	int resizeX;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 1552043943
	)
	@Export("resizeY")
	int resizeY;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -302979231
	)
	@Export("resizeZ")
	int resizeZ;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 2093614773
	)
	public int field2257;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 1794294545
	)
	public int field2258;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = -919846075
	)
	@Export("team")
	public int team;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -1162544887
	)
	public int field2251;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "Lro;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("cf")
	@Export("isTradable")
	public boolean isTradable;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = -1273418661
	)
	@Export("unnotedId")
	int unnotedId;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -1276549997
	)
	@Export("notedId")
	int notedId;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -172219939
	)
	@Export("placeholder")
	public int placeholder;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 119859889
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
		this.field2243 = 0; // L: 62
		this.femaleModel2 = -1; // L: 63
		this.femaleHeadModel = -1; // L: 64
		this.femaleHeadModel2 = -1; // L: 65
		this.field2242 = -1; // L: 66
		this.field2208 = -1; // L: 67
		this.field2249 = -1; // L: 68
		this.note = -1; // L: 71
		this.noteTemplate = -1; // L: 72
		this.resizeX = 128; // L: 73
		this.resizeY = 128; // L: 74
		this.resizeZ = 128; // L: 75
		this.field2257 = 0; // L: 76
		this.field2258 = 0; // L: 77
		this.team = 0; // L: 78
		this.field2251 = 0; // L: 79
		this.isTradable = false; // L: 81
		this.unnotedId = -1; // L: 82
		this.notedId = -1; // L: 83
		this.placeholder = -1; // L: 84
		this.placeholderTemplate = -1; // L: 85
	} // L: 87

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2125749046"
	)
	@Export("post")
	void post() {
		if (this.isStackable == 1) { // L: 128
			this.field2251 = 0;
		}

	} // L: 129

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lsg;B)V",
		garbageValue = "-17"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 133
			if (var2 == 0) { // L: 134
				return; // L: 137
			}

			this.decodeNext(var1, var2); // L: 135
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lsg;IB)V",
		garbageValue = "-19"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 140
			this.model = var1.readUnsignedShort();
		} else if (var2 == 2) { // L: 141
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 142
			this.zoom2d = var1.readUnsignedShort();
		} else if (var2 == 5) { // L: 143
			this.xan2d = var1.readUnsignedShort();
		} else if (var2 == 6) { // L: 144
			this.yan2d = var1.readUnsignedShort();
		} else if (var2 == 7) { // L: 145
			this.offsetX2d = var1.readUnsignedShort(); // L: 146
			if (this.offsetX2d > 32767) { // L: 147
				this.offsetX2d -= 65536;
			}
		} else if (var2 == 8) { // L: 149
			this.offsetY2d = var1.readUnsignedShort(); // L: 150
			if (this.offsetY2d > 32767) { // L: 151
				this.offsetY2d -= 65536;
			}
		} else if (var2 == 9) { // L: 153
			var1.readStringCp1252NullTerminated(); // L: 154
		} else if (var2 == 11) { // L: 156
			this.isStackable = 1;
		} else if (var2 == 12) { // L: 157
			this.price = var1.readInt();
		} else if (var2 == 13) { // L: 158
			this.maleModel = var1.readUnsignedByte();
		} else if (var2 == 14) { // L: 159
			this.maleModel1 = var1.readUnsignedByte();
		} else if (var2 == 16) { // L: 160
			this.isMembersOnly = true;
		} else if (var2 == 23) { // L: 161
			this.femaleModel = var1.readUnsignedShort(); // L: 162
			this.femaleOffset = var1.readUnsignedByte(); // L: 163
		} else if (var2 == 24) { // L: 165
			this.femaleModel1 = var1.readUnsignedShort();
		} else if (var2 == 25) { // L: 166
			this.maleHeadModel = var1.readUnsignedShort(); // L: 167
			this.field2243 = var1.readUnsignedByte(); // L: 168
		} else if (var2 == 26) { // L: 170
			this.maleHeadModel2 = var1.readUnsignedShort();
		} else if (var2 == 27) { // L: 171
			this.maleModel2 = var1.readUnsignedByte();
		} else if (var2 >= 30 && var2 < 35) { // L: 172
			this.groundActions[var2 - 30] = var1.readStringCp1252NullTerminated(); // L: 173
			if (this.groundActions[var2 - 30].equalsIgnoreCase("Hidden")) { // L: 174
				this.groundActions[var2 - 30] = null;
			}
		} else if (var2 >= 35 && var2 < 40) { // L: 176
			this.inventoryActions[var2 - 35] = var1.readStringCp1252NullTerminated();
		} else {
			int var3;
			int var4;
			if (var2 == 40) { // L: 177
				var3 = var1.readUnsignedByte(); // L: 178
				this.recolorFrom = new short[var3]; // L: 179
				this.recolorTo = new short[var3]; // L: 180

				for (var4 = 0; var4 < var3; ++var4) { // L: 181
					this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 182
					this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 183
				}
			} else if (var2 == 41) { // L: 186
				var3 = var1.readUnsignedByte(); // L: 187
				this.retextureFrom = new short[var3]; // L: 188
				this.retextureTo = new short[var3]; // L: 189

				for (var4 = 0; var4 < var3; ++var4) { // L: 190
					this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 191
					this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 192
				}
			} else if (var2 == 42) { // L: 195
				this.shiftClickIndex = var1.readByte(); // L: 196
			} else if (var2 == 65) { // L: 198
				this.isTradable = true;
			} else if (var2 == 75) { // L: 199
				this.field2251 = var1.readShort();
			} else if (var2 == 78) { // L: 200
				this.femaleModel2 = var1.readUnsignedShort();
			} else if (var2 == 79) { // L: 201
				this.femaleHeadModel = var1.readUnsignedShort();
			} else if (var2 == 90) { // L: 202
				this.femaleHeadModel2 = var1.readUnsignedShort();
			} else if (var2 == 91) {
				this.field2208 = var1.readUnsignedShort(); // L: 203
			} else if (var2 == 92) { // L: 204
				this.field2242 = var1.readUnsignedShort();
			} else if (var2 == 93) { // L: 205
				this.field2249 = var1.readUnsignedShort();
			} else if (var2 == 94) { // L: 206
				var1.readUnsignedShort(); // L: 207
			} else if (var2 == 95) { // L: 209
				this.zan2d = var1.readUnsignedShort();
			} else if (var2 == 97) { // L: 210
				this.note = var1.readUnsignedShort();
			} else if (var2 == 98) { // L: 211
				this.noteTemplate = var1.readUnsignedShort();
			} else if (var2 >= 100 && var2 < 110) { // L: 212
				if (this.countobj == null) { // L: 213
					this.countobj = new int[10]; // L: 214
					this.countco = new int[10]; // L: 215
				}

				this.countobj[var2 - 100] = var1.readUnsignedShort(); // L: 217
				this.countco[var2 - 100] = var1.readUnsignedShort(); // L: 218
			} else if (var2 == 110) { // L: 220
				this.resizeX = var1.readUnsignedShort();
			} else if (var2 == 111) { // L: 221
				this.resizeY = var1.readUnsignedShort();
			} else if (var2 == 112) { // L: 222
				this.resizeZ = var1.readUnsignedShort();
			} else if (var2 == 113) { // L: 223
				this.field2257 = var1.readByte();
			} else if (var2 == 114) { // L: 224
				this.field2258 = var1.readByte() * 5;
			} else if (var2 == 115) { // L: 225
				this.team = var1.readUnsignedByte();
			} else if (var2 == 139) { // L: 226
				this.unnotedId = var1.readUnsignedShort();
			} else if (var2 == 140) { // L: 227
				this.notedId = var1.readUnsignedShort();
			} else if (var2 == 148) { // L: 228
				this.placeholder = var1.readUnsignedShort();
			} else if (var2 == 149) { // L: 229
				this.placeholderTemplate = var1.readUnsignedShort();
			} else if (var2 == 249) { // L: 230
				this.params = ChatChannel.readStringIntParameters(var1, this.params);
			}
		}

	} // L: 232

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lhz;Lhz;I)V",
		garbageValue = "-1546193991"
	)
	@Export("genCert")
	void genCert(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model; // L: 235
		this.zoom2d = var1.zoom2d; // L: 236
		this.xan2d = var1.xan2d; // L: 237
		this.yan2d = var1.yan2d; // L: 238
		this.zan2d = var1.zan2d; // L: 239
		this.offsetX2d = var1.offsetX2d; // L: 240
		this.offsetY2d = var1.offsetY2d; // L: 241
		this.recolorFrom = var1.recolorFrom; // L: 242
		this.recolorTo = var1.recolorTo; // L: 243
		this.retextureFrom = var1.retextureFrom; // L: 244
		this.retextureTo = var1.retextureTo; // L: 245
		this.name = var2.name; // L: 246
		this.isMembersOnly = var2.isMembersOnly; // L: 247
		this.price = var2.price; // L: 248
		this.isStackable = 1; // L: 249
	} // L: 250

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lhz;Lhz;I)V",
		garbageValue = "797932055"
	)
	@Export("genBought")
	void genBought(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model; // L: 253
		this.zoom2d = var1.zoom2d; // L: 254
		this.xan2d = var1.xan2d; // L: 255
		this.yan2d = var1.yan2d; // L: 256
		this.zan2d = var1.zan2d; // L: 257
		this.offsetX2d = var1.offsetX2d; // L: 258
		this.offsetY2d = var1.offsetY2d; // L: 259
		this.recolorFrom = var2.recolorFrom; // L: 260
		this.recolorTo = var2.recolorTo; // L: 261
		this.retextureFrom = var2.retextureFrom; // L: 262
		this.retextureTo = var2.retextureTo; // L: 263
		this.name = var2.name; // L: 264
		this.isMembersOnly = var2.isMembersOnly; // L: 265
		this.isStackable = var2.isStackable; // L: 266
		this.maleModel = var2.maleModel; // L: 267
		this.maleModel1 = var2.maleModel1; // L: 268
		this.maleModel2 = var2.maleModel2; // L: 269
		this.femaleModel = var2.femaleModel; // L: 270
		this.femaleModel1 = var2.femaleModel1; // L: 271
		this.femaleModel2 = var2.femaleModel2; // L: 272
		this.maleHeadModel = var2.maleHeadModel; // L: 273
		this.maleHeadModel2 = var2.maleHeadModel2; // L: 274
		this.femaleHeadModel = var2.femaleHeadModel; // L: 275
		this.femaleHeadModel2 = var2.femaleHeadModel2; // L: 276
		this.field2242 = var2.field2242; // L: 277
		this.field2208 = var2.field2208; // L: 278
		this.field2249 = var2.field2249; // L: 279
		this.team = var2.team; // L: 280
		this.groundActions = var2.groundActions; // L: 281
		this.field2251 = var2.field2251; // L: 282
		this.inventoryActions = new String[5]; // L: 283
		if (var2.inventoryActions != null) {
			for (int var3 = 0; var3 < 4; ++var3) { // L: 284
				this.inventoryActions[var3] = var2.inventoryActions[var3];
			}
		}

		this.inventoryActions[4] = "Discard"; // L: 285
		this.price = 0; // L: 286
	} // L: 287

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lhz;Lhz;I)V",
		garbageValue = "-670361185"
	)
	@Export("genPlaceholder")
	void genPlaceholder(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model; // L: 290
		this.zoom2d = var1.zoom2d; // L: 291
		this.xan2d = var1.xan2d; // L: 292
		this.yan2d = var1.yan2d; // L: 293
		this.zan2d = var1.zan2d; // L: 294
		this.offsetX2d = var1.offsetX2d; // L: 295
		this.offsetY2d = var1.offsetY2d; // L: 296
		this.recolorFrom = var1.recolorFrom; // L: 297
		this.recolorTo = var1.recolorTo; // L: 298
		this.retextureFrom = var1.retextureFrom; // L: 299
		this.retextureTo = var1.retextureTo; // L: 300
		this.isStackable = var1.isStackable; // L: 301
		this.name = var2.name; // L: 302
		this.price = 0; // L: 303
		this.isMembersOnly = false; // L: 304
		this.isTradable = false; // L: 305
	} // L: 306

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Liz;",
		garbageValue = "-305031719"
	)
	@Export("getModelData")
	public final ModelData getModelData(int var1) {
		int var3;
		if (this.countobj != null && var1 > 1) { // L: 309
			int var2 = -1; // L: 310

			for (var3 = 0; var3 < 10; ++var3) { // L: 311
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) { // L: 312
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) { // L: 314
				return HealthBarUpdate.ItemComposition_get(var2).getModelData(1);
			}
		}

		ModelData var4 = ModelData.ModelData_get(ItemComposition_modelArchive, this.model, 0); // L: 316
		if (var4 == null) { // L: 317
			return null;
		} else {
			if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) { // L: 318
				var4.resize(this.resizeX, this.resizeY, this.resizeZ);
			}

			if (this.recolorFrom != null) { // L: 319
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) { // L: 320
					var4.recolor(this.recolorFrom[var3], this.recolorTo[var3]); // L: 321
				}
			}

			if (this.retextureFrom != null) { // L: 324
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) { // L: 325
					var4.retexture(this.retextureFrom[var3], this.retextureTo[var3]); // L: 326
				}
			}

			return var4; // L: 329
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lit;",
		garbageValue = "-891415962"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		if (this.countobj != null && var1 > 1) { // L: 333
			int var2 = -1; // L: 334

			for (int var3 = 0; var3 < 10; ++var3) { // L: 335
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) { // L: 336
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) { // L: 338
				return HealthBarUpdate.ItemComposition_get(var2).getModel(1);
			}
		}

		Model var5 = (Model)ItemComposition_cachedModels.get((long)this.id); // L: 340
		if (var5 != null) { // L: 341
			return var5;
		} else {
			ModelData var6 = ModelData.ModelData_get(ItemComposition_modelArchive, this.model, 0); // L: 342
			if (var6 == null) { // L: 343
				return null;
			} else {
				if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) { // L: 344
					var6.resize(this.resizeX, this.resizeY, this.resizeZ);
				}

				int var4;
				if (this.recolorFrom != null) { // L: 345
					for (var4 = 0; var4 < this.recolorFrom.length; ++var4) { // L: 346
						var6.recolor(this.recolorFrom[var4], this.recolorTo[var4]); // L: 347
					}
				}

				if (this.retextureFrom != null) { // L: 350
					for (var4 = 0; var4 < this.retextureFrom.length; ++var4) { // L: 351
						var6.retexture(this.retextureFrom[var4], this.retextureTo[var4]); // L: 352
					}
				}

				var5 = var6.toModel(this.field2257 + 64, this.field2258 + 768, -50, -10, -50); // L: 355
				var5.isSingleTile = true; // L: 356
				ItemComposition_cachedModels.put(var5, (long)this.id); // L: 357
				return var5; // L: 358
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)Lhz;",
		garbageValue = "-1245507934"
	)
	@Export("getCountObj")
	public ItemComposition getCountObj(int var1) {
		if (this.countobj != null && var1 > 1) { // L: 362
			int var2 = -1; // L: 363

			for (int var3 = 0; var3 < 10; ++var3) { // L: 364
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) { // L: 365
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) { // L: 367
				return HealthBarUpdate.ItemComposition_get(var2);
			}
		}

		return this; // L: 369
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1487793992"
	)
	public final boolean method4039(int var1) {
		int var2 = this.femaleModel; // L: 448
		int var3 = this.femaleModel1; // L: 449
		int var4 = this.femaleModel2; // L: 450
		if (var1 == 1) { // L: 451
			var2 = this.maleHeadModel; // L: 452
			var3 = this.maleHeadModel2; // L: 453
			var4 = this.femaleHeadModel; // L: 454
		}

		if (var2 == -1) { // L: 456
			return true;
		} else {
			boolean var5 = true; // L: 457
			if (!ItemComposition_modelArchive.tryLoadFile(var2, 0)) { // L: 458
				var5 = false;
			}

			if (var3 != -1 && !ItemComposition_modelArchive.tryLoadFile(var3, 0)) { // L: 459
				var5 = false;
			}

			if (var4 != -1 && !ItemComposition_modelArchive.tryLoadFile(var4, 0)) { // L: 460
				var5 = false;
			}

			return var5; // L: 461
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Liz;",
		garbageValue = "1938506301"
	)
	public final ModelData method4052(int var1) {
		int var2 = this.femaleModel; // L: 465
		int var3 = this.femaleModel1; // L: 466
		int var4 = this.femaleModel2; // L: 467
		if (var1 == 1) { // L: 468
			var2 = this.maleHeadModel; // L: 469
			var3 = this.maleHeadModel2; // L: 470
			var4 = this.femaleHeadModel; // L: 471
		}

		if (var2 == -1) { // L: 473
			return null;
		} else {
			ModelData var5 = ModelData.ModelData_get(ItemComposition_modelArchive, var2, 0); // L: 474
			if (var3 != -1) { // L: 475
				ModelData var6 = ModelData.ModelData_get(ItemComposition_modelArchive, var3, 0); // L: 476
				if (var4 != -1) { // L: 477
					ModelData var7 = ModelData.ModelData_get(ItemComposition_modelArchive, var4, 0); // L: 478
					ModelData[] var8 = new ModelData[]{var5, var6, var7}; // L: 479
					var5 = new ModelData(var8, 3); // L: 480
				} else {
					ModelData[] var10 = new ModelData[]{var5, var6}; // L: 483
					var5 = new ModelData(var10, 2); // L: 484
				}
			}

			if (var1 == 0 && this.femaleOffset != 0) { // L: 487
				var5.changeOffset(0, this.femaleOffset, 0);
			}

			if (var1 == 1 && this.field2243 != 0) { // L: 488
				var5.changeOffset(0, this.field2243, 0);
			}

			int var9;
			if (this.recolorFrom != null) { // L: 489
				for (var9 = 0; var9 < this.recolorFrom.length; ++var9) { // L: 490
					var5.recolor(this.recolorFrom[var9], this.recolorTo[var9]); // L: 491
				}
			}

			if (this.retextureFrom != null) { // L: 494
				for (var9 = 0; var9 < this.retextureFrom.length; ++var9) { // L: 495
					var5.retexture(this.retextureFrom[var9], this.retextureTo[var9]); // L: 496
				}
			}

			return var5; // L: 499
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1902431331"
	)
	public final boolean method4041(int var1) {
		int var2 = this.femaleHeadModel2; // L: 503
		int var3 = this.field2242; // L: 504
		if (var1 == 1) { // L: 505
			var2 = this.field2208; // L: 506
			var3 = this.field2249; // L: 507
		}

		if (var2 == -1) { // L: 509
			return true;
		} else {
			boolean var4 = true; // L: 510
			if (!ItemComposition_modelArchive.tryLoadFile(var2, 0)) { // L: 511
				var4 = false;
			}

			if (var3 != -1 && !ItemComposition_modelArchive.tryLoadFile(var3, 0)) { // L: 512
				var4 = false;
			}

			return var4; // L: 513
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Liz;",
		garbageValue = "-1738550121"
	)
	public final ModelData method4042(int var1) {
		int var2 = this.femaleHeadModel2; // L: 517
		int var3 = this.field2242; // L: 518
		if (var1 == 1) { // L: 519
			var2 = this.field2208; // L: 520
			var3 = this.field2249; // L: 521
		}

		if (var2 == -1) { // L: 523
			return null;
		} else {
			ModelData var4 = ModelData.ModelData_get(ItemComposition_modelArchive, var2, 0); // L: 524
			if (var3 != -1) { // L: 525
				ModelData var5 = ModelData.ModelData_get(ItemComposition_modelArchive, var3, 0); // L: 526
				ModelData[] var6 = new ModelData[]{var4, var5}; // L: 527
				var4 = new ModelData(var6, 2); // L: 528
			}

			int var7;
			if (this.recolorFrom != null) { // L: 530
				for (var7 = 0; var7 < this.recolorFrom.length; ++var7) { // L: 531
					var4.recolor(this.recolorFrom[var7], this.recolorTo[var7]); // L: 532
				}
			}

			if (this.retextureFrom != null) { // L: 535
				for (var7 = 0; var7 < this.retextureFrom.length; ++var7) { // L: 536
					var4.retexture(this.retextureFrom[var7], this.retextureTo[var7]); // L: 537
				}
			}

			return var4; // L: 540
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "119"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		IterableNodeHashTable var4 = this.params; // L: 545
		int var3;
		if (var4 == null) { // L: 547
			var3 = var2; // L: 548
		} else {
			IntegerNode var5 = (IntegerNode)var4.get((long)var1); // L: 551
			if (var5 == null) { // L: 552
				var3 = var2; // L: 553
			} else {
				var3 = var5.integer; // L: 556
			}
		}

		return var3; // L: 558
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)Ljava/lang/String;",
		garbageValue = "0"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return EnumComposition.method3750(this.params, var1, var2); // L: 562
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "42"
	)
	@Export("getShiftClickIndex")
	public int getShiftClickIndex() {
		if (this.shiftClickIndex != -1 && this.inventoryActions != null) { // L: 566
			if (this.shiftClickIndex >= 0) { // L: 567
				return this.inventoryActions[this.shiftClickIndex] != null ? this.shiftClickIndex : -1;
			} else {
				return "Drop".equalsIgnoreCase(this.inventoryActions[4]) ? 4 : -1; // L: 568
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "467"
	)
	boolean method4030() {
		return this.recolorTo != null; // L: 582
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1913004166"
	)
	boolean method4046() {
		return this.retextureTo != null; // L: 586
	}
}
