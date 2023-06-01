import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hj")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("ItemComposition_cached")
	static EvictingDualNodeHashTable ItemComposition_cached;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("ItemComposition_cachedModels")
	static EvictingDualNodeHashTable ItemComposition_cachedModels;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("ItemComposition_cachedSprites")
	public static EvictingDualNodeHashTable ItemComposition_cachedSprites;
	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "[Ltt;"
	)
	@Export("headIconHintSprites")
	static SpritePixels[] headIconHintSprites;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1452427637
	)
	@Export("id")
	int id;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1437467151
	)
	@Export("model")
	int model;
	@ObfuscatedName("as")
	@Export("name")
	public String name;
	@ObfuscatedName("am")
	@Export("recolorFrom")
	public short[] recolorFrom;
	@ObfuscatedName("ao")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("af")
	@Export("retextureFrom")
	public short[] retextureFrom;
	@ObfuscatedName("av")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -375028153
	)
	@Export("zoom2d")
	public int zoom2d;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -2092617053
	)
	@Export("xan2d")
	public int xan2d;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1195067165
	)
	@Export("yan2d")
	public int yan2d;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1963298767
	)
	@Export("zan2d")
	public int zan2d;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1514851063
	)
	@Export("offsetX2d")
	public int offsetX2d;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 605462863
	)
	@Export("offsetY2d")
	public int offsetY2d;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -94522857
	)
	@Export("isStackable")
	public int isStackable;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -1981732159
	)
	@Export("price")
	public int price;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -1711583047
	)
	@Export("maleModel")
	public int maleModel;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -936607561
	)
	@Export("maleModel1")
	public int maleModel1;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -2047410155
	)
	@Export("maleModel2")
	public int maleModel2;
	@ObfuscatedName("bo")
	@Export("isMembersOnly")
	public boolean isMembersOnly;
	@ObfuscatedName("be")
	@Export("groundActions")
	public String[] groundActions;
	@ObfuscatedName("bv")
	@Export("inventoryActions")
	public String[] inventoryActions;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1015536339
	)
	@Export("shiftClickIndex")
	int shiftClickIndex;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 655240693
	)
	@Export("femaleModel")
	int femaleModel;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 986465377
	)
	@Export("femaleModel1")
	int femaleModel1;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 639525677
	)
	@Export("femaleOffset")
	int femaleOffset;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1329743353
	)
	@Export("maleHeadModel")
	int maleHeadModel;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -1922850091
	)
	@Export("maleHeadModel2")
	int maleHeadModel2;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -330433273
	)
	int field2230;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -1295176655
	)
	@Export("femaleModel2")
	int femaleModel2;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -1631532171
	)
	@Export("femaleHeadModel")
	int femaleHeadModel;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 855680933
	)
	@Export("femaleHeadModel2")
	int femaleHeadModel2;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -1182982337
	)
	int field2201;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 1539957709
	)
	int field2232;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 327374839
	)
	int field2236;
	@ObfuscatedName("bj")
	@Export("countobj")
	int[] countobj;
	@ObfuscatedName("br")
	@Export("countco")
	int[] countco;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 1930092421
	)
	@Export("note")
	public int note;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -173081569
	)
	@Export("noteTemplate")
	public int noteTemplate;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 387179005
	)
	@Export("resizeX")
	int resizeX;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 1963388377
	)
	@Export("resizeY")
	int resizeY;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -1518395599
	)
	@Export("resizeZ")
	int resizeZ;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 2031509649
	)
	public int field2209;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -555035695
	)
	public int field2197;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 1568799661
	)
	@Export("team")
	public int team;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 1710235379
	)
	public int field2206;
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "Lsc;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("cs")
	@Export("isTradable")
	public boolean isTradable;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -1317701811
	)
	@Export("unnotedId")
	int unnotedId;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -1620490777
	)
	@Export("notedId")
	int notedId;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -1651920025
	)
	@Export("placeholder")
	public int placeholder;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 860550551
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
		this.field2230 = 0; // L: 62
		this.femaleModel2 = -1; // L: 63
		this.femaleHeadModel = -1; // L: 64
		this.femaleHeadModel2 = -1; // L: 65
		this.field2201 = -1; // L: 66
		this.field2232 = -1; // L: 67
		this.field2236 = -1; // L: 68
		this.note = -1; // L: 71
		this.noteTemplate = -1; // L: 72
		this.resizeX = 128; // L: 73
		this.resizeY = 128; // L: 74
		this.resizeZ = 128; // L: 75
		this.field2209 = 0; // L: 76
		this.field2197 = 0; // L: 77
		this.team = 0; // L: 78
		this.field2206 = 0; // L: 79
		this.isTradable = false; // L: 81
		this.unnotedId = -1; // L: 82
		this.notedId = -1; // L: 83
		this.placeholder = -1; // L: 84
		this.placeholderTemplate = -1; // L: 85
	} // L: 87

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2111422128"
	)
	@Export("post")
	void post() {
		if (this.isStackable == 1) { // L: 128
			this.field2206 = 0;
		}

	} // L: 129

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ltc;I)V",
		garbageValue = "-728911769"
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ltc;II)V",
		garbageValue = "360510927"
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
			this.field2230 = var1.readUnsignedByte(); // L: 168
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
				this.isTradable = true; // L: 199
			} else if (var2 == 75) { // L: 201
				this.field2206 = var1.readShort();
			} else if (var2 == 78) { // L: 202
				this.femaleModel2 = var1.readUnsignedShort();
			} else if (var2 == 79) { // L: 203
				this.femaleHeadModel = var1.readUnsignedShort();
			} else if (var2 == 90) { // L: 204
				this.femaleHeadModel2 = var1.readUnsignedShort();
			} else if (var2 == 91) { // L: 205
				this.field2232 = var1.readUnsignedShort();
			} else if (var2 == 92) {
				this.field2201 = var1.readUnsignedShort(); // L: 206
			} else if (var2 == 93) { // L: 207
				this.field2236 = var1.readUnsignedShort();
			} else if (var2 == 94) { // L: 208
				var1.readUnsignedShort(); // L: 209
			} else if (var2 == 95) { // L: 211
				this.zan2d = var1.readUnsignedShort();
			} else if (var2 == 97) { // L: 212
				this.note = var1.readUnsignedShort();
			} else if (var2 == 98) { // L: 213
				this.noteTemplate = var1.readUnsignedShort();
			} else if (var2 >= 100 && var2 < 110) { // L: 214
				if (this.countobj == null) { // L: 215
					this.countobj = new int[10]; // L: 216
					this.countco = new int[10]; // L: 217
				}

				this.countobj[var2 - 100] = var1.readUnsignedShort(); // L: 219
				this.countco[var2 - 100] = var1.readUnsignedShort(); // L: 220
			} else if (var2 == 110) { // L: 222
				this.resizeX = var1.readUnsignedShort();
			} else if (var2 == 111) { // L: 223
				this.resizeY = var1.readUnsignedShort();
			} else if (var2 == 112) { // L: 224
				this.resizeZ = var1.readUnsignedShort();
			} else if (var2 == 113) { // L: 225
				this.field2209 = var1.readByte();
			} else if (var2 == 114) { // L: 226
				this.field2197 = var1.readByte() * 5;
			} else if (var2 == 115) { // L: 227
				this.team = var1.readUnsignedByte();
			} else if (var2 == 139) { // L: 228
				this.unnotedId = var1.readUnsignedShort();
			} else if (var2 == 140) { // L: 229
				this.notedId = var1.readUnsignedShort();
			} else if (var2 == 148) { // L: 230
				this.placeholder = var1.readUnsignedShort();
			} else if (var2 == 149) { // L: 231
				this.placeholderTemplate = var1.readUnsignedShort();
			} else if (var2 == 249) { // L: 232
				this.params = WorldMapRegion.readStringIntParameters(var1, this.params);
			}
		}

	} // L: 234

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lhj;Lhj;B)V",
		garbageValue = "9"
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lhj;Lhj;I)V",
		garbageValue = "2112159505"
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
		this.field2201 = var2.field2201; // L: 279
		this.field2232 = var2.field2232; // L: 280
		this.field2236 = var2.field2236; // L: 281
		this.team = var2.team; // L: 282
		this.groundActions = var2.groundActions; // L: 283
		this.field2206 = var2.field2206; // L: 284
		this.inventoryActions = new String[5]; // L: 285
		if (var2.inventoryActions != null) {
			for (int var3 = 0; var3 < 4; ++var3) { // L: 286
				this.inventoryActions[var3] = var2.inventoryActions[var3];
			}
		}

		this.inventoryActions[4] = "Discard"; // L: 287
		this.price = 0; // L: 288
	} // L: 289

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lhj;Lhj;I)V",
		garbageValue = "-1238766720"
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Lis;",
		garbageValue = "-449969789"
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
				return class230.ItemComposition_get(var2).getModelData(1);
			}
		}

		ModelData var4 = ModelData.ModelData_get(ScriptFrame.ItemComposition_modelArchive, this.model, 0); // L: 318
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IS)Ljh;",
		garbageValue = "4096"
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
				return class230.ItemComposition_get(var2).getModel(1);
			}
		}

		Model var5 = (Model)ItemComposition_cachedModels.get((long)this.id); // L: 342
		if (var5 != null) { // L: 343
			return var5;
		} else {
			ModelData var6 = ModelData.ModelData_get(ScriptFrame.ItemComposition_modelArchive, this.model, 0); // L: 344
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

				var5 = var6.toModel(this.field2209 + 64, this.field2197 + 768, -50, -10, -50); // L: 357
				var5.isSingleTile = true; // L: 358
				ItemComposition_cachedModels.put(var5, (long)this.id); // L: 359
				return var5; // L: 360
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Lhj;",
		garbageValue = "313462786"
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
				return class230.ItemComposition_get(var2);
			}
		}

		return this; // L: 371
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "6419"
	)
	public final boolean method3961(int var1) {
		int var2 = this.femaleModel; // L: 450
		int var3 = this.femaleModel1; // L: 451
		int var4 = this.femaleModel2; // L: 452
		if (var1 == 1) { // L: 453
			var2 = this.maleHeadModel; // L: 454
			var3 = this.maleHeadModel2; // L: 455
			var4 = this.femaleHeadModel; // L: 456
		}

		if (var2 == -1) { // L: 458
			return true;
		} else {
			boolean var5 = true; // L: 459
			if (!ScriptFrame.ItemComposition_modelArchive.tryLoadFile(var2, 0)) { // L: 460
				var5 = false;
			}

			if (var3 != -1 && !ScriptFrame.ItemComposition_modelArchive.tryLoadFile(var3, 0)) { // L: 461
				var5 = false;
			}

			if (var4 != -1 && !ScriptFrame.ItemComposition_modelArchive.tryLoadFile(var4, 0)) { // L: 462
				var5 = false;
			}

			return var5; // L: 463
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)Lis;",
		garbageValue = "-79"
	)
	public final ModelData method3907(int var1) {
		int var2 = this.femaleModel; // L: 467
		int var3 = this.femaleModel1; // L: 468
		int var4 = this.femaleModel2; // L: 469
		if (var1 == 1) { // L: 470
			var2 = this.maleHeadModel; // L: 471
			var3 = this.maleHeadModel2; // L: 472
			var4 = this.femaleHeadModel; // L: 473
		}

		if (var2 == -1) { // L: 475
			return null;
		} else {
			ModelData var5 = ModelData.ModelData_get(ScriptFrame.ItemComposition_modelArchive, var2, 0); // L: 476
			if (var3 != -1) { // L: 477
				ModelData var6 = ModelData.ModelData_get(ScriptFrame.ItemComposition_modelArchive, var3, 0); // L: 478
				if (var4 != -1) { // L: 479
					ModelData var7 = ModelData.ModelData_get(ScriptFrame.ItemComposition_modelArchive, var4, 0); // L: 480
					ModelData[] var8 = new ModelData[]{var5, var6, var7}; // L: 481
					var5 = new ModelData(var8, 3); // L: 482
				} else {
					ModelData[] var10 = new ModelData[]{var5, var6}; // L: 485
					var5 = new ModelData(var10, 2); // L: 486
				}
			}

			if (var1 == 0 && this.femaleOffset != 0) { // L: 489
				var5.changeOffset(0, this.femaleOffset, 0);
			}

			if (var1 == 1 && this.field2230 != 0) { // L: 490
				var5.changeOffset(0, this.field2230, 0);
			}

			int var9;
			if (this.recolorFrom != null) { // L: 491
				for (var9 = 0; var9 < this.recolorFrom.length; ++var9) { // L: 492
					var5.recolor(this.recolorFrom[var9], this.recolorTo[var9]); // L: 493
				}
			}

			if (this.retextureFrom != null) { // L: 496
				for (var9 = 0; var9 < this.retextureFrom.length; ++var9) { // L: 497
					var5.retexture(this.retextureFrom[var9], this.retextureTo[var9]); // L: 498
				}
			}

			return var5; // L: 501
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "313615062"
	)
	public final boolean method3908(int var1) {
		int var2 = this.femaleHeadModel2; // L: 505
		int var3 = this.field2201; // L: 506
		if (var1 == 1) { // L: 507
			var2 = this.field2232; // L: 508
			var3 = this.field2236; // L: 509
		}

		if (var2 == -1) { // L: 511
			return true;
		} else {
			boolean var4 = true; // L: 512
			if (!ScriptFrame.ItemComposition_modelArchive.tryLoadFile(var2, 0)) { // L: 513
				var4 = false;
			}

			if (var3 != -1 && !ScriptFrame.ItemComposition_modelArchive.tryLoadFile(var3, 0)) { // L: 514
				var4 = false;
			}

			return var4; // L: 515
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IB)Lis;",
		garbageValue = "112"
	)
	public final ModelData method3909(int var1) {
		int var2 = this.femaleHeadModel2; // L: 519
		int var3 = this.field2201; // L: 520
		if (var1 == 1) { // L: 521
			var2 = this.field2232; // L: 522
			var3 = this.field2236; // L: 523
		}

		if (var2 == -1) { // L: 525
			return null;
		} else {
			ModelData var4 = ModelData.ModelData_get(ScriptFrame.ItemComposition_modelArchive, var2, 0); // L: 526
			if (var3 != -1) { // L: 527
				ModelData var5 = ModelData.ModelData_get(ScriptFrame.ItemComposition_modelArchive, var3, 0); // L: 528
				ModelData[] var6 = new ModelData[]{var4, var5}; // L: 529
				var4 = new ModelData(var6, 2); // L: 530
			}

			int var7;
			if (this.recolorFrom != null) { // L: 532
				for (var7 = 0; var7 < this.recolorFrom.length; ++var7) { // L: 533
					var4.recolor(this.recolorFrom[var7], this.recolorTo[var7]); // L: 534
				}
			}

			if (this.retextureFrom != null) { // L: 537
				for (var7 = 0; var7 < this.retextureFrom.length; ++var7) { // L: 538
					var4.retexture(this.retextureFrom[var7], this.retextureTo[var7]); // L: 539
				}
			}

			return var4; // L: 542
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1985403365"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		IterableNodeHashTable var4 = this.params; // L: 547
		int var3;
		if (var4 == null) { // L: 549
			var3 = var2; // L: 550
		} else {
			IntegerNode var5 = (IntegerNode)var4.get((long)var1); // L: 553
			if (var5 == null) { // L: 554
				var3 = var2; // L: 555
			} else {
				var3 = var5.integer; // L: 558
			}
		}

		return var3; // L: 560
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1238591073"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		IterableNodeHashTable var4 = this.params; // L: 565
		String var3;
		if (var4 == null) { // L: 567
			var3 = var2; // L: 568
		} else {
			ObjectNode var5 = (ObjectNode)var4.get((long)var1); // L: 571
			if (var5 == null) { // L: 572
				var3 = var2; // L: 573
			} else {
				var3 = (String)var5.obj; // L: 576
			}
		}

		return var3; // L: 578
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "86"
	)
	@Export("getShiftClickIndex")
	public int getShiftClickIndex() {
		if (this.shiftClickIndex != -1 && this.inventoryActions != null) { // L: 582
			if (this.shiftClickIndex >= 0) { // L: 583
				return this.inventoryActions[this.shiftClickIndex] != null ? this.shiftClickIndex : -1;
			} else {
				return "Drop".equalsIgnoreCase(this.inventoryActions[4]) ? 4 : -1; // L: 584
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2092564248"
	)
	boolean method3955() {
		return this.recolorTo != null; // L: 594
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-91"
	)
	boolean method3971() {
		return this.retextureTo != null; // L: 598
	}
}
