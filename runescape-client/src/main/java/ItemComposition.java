import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hh")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	@Export("ItemComposition_modelArchive")
	public static AbstractArchive ItemComposition_modelArchive;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("ItemComposition_cached")
	public static EvictingDualNodeHashTable ItemComposition_cached;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("ItemComposition_cachedModels")
	public static EvictingDualNodeHashTable ItemComposition_cachedModels;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("ItemComposition_cachedSprites")
	public static EvictingDualNodeHashTable ItemComposition_cachedSprites;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	@Export("ItemComposition_fontPlain11")
	public static Font ItemComposition_fontPlain11;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1947056821
	)
	@Export("id")
	int id;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 272743929
	)
	@Export("model")
	int model;
	@ObfuscatedName("az")
	@Export("name")
	public String name;
	@ObfuscatedName("ae")
	@Export("recolorFrom")
	public short[] recolorFrom;
	@ObfuscatedName("au")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("ag")
	@Export("retextureFrom")
	public short[] retextureFrom;
	@ObfuscatedName("at")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1952873425
	)
	@Export("zoom2d")
	public int zoom2d;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 546058337
	)
	@Export("xan2d")
	public int xan2d;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1094079037
	)
	@Export("yan2d")
	public int yan2d;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1517957745
	)
	@Export("zan2d")
	public int zan2d;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1994009139
	)
	@Export("offsetX2d")
	public int offsetX2d;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -228623487
	)
	@Export("offsetY2d")
	public int offsetY2d;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 2053436617
	)
	@Export("isStackable")
	public int isStackable;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -820380841
	)
	@Export("price")
	public int price;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 1872439657
	)
	@Export("maleModel")
	public int maleModel;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1449974603
	)
	@Export("maleModel1")
	public int maleModel1;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 1392896979
	)
	@Export("maleModel2")
	public int maleModel2;
	@ObfuscatedName("bh")
	@Export("isMembersOnly")
	public boolean isMembersOnly;
	@ObfuscatedName("bl")
	@Export("groundActions")
	public String[] groundActions;
	@ObfuscatedName("bk")
	@Export("inventoryActions")
	public String[] inventoryActions;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 316293785
	)
	@Export("shiftClickIndex")
	int shiftClickIndex;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -917859193
	)
	@Export("femaleModel")
	int femaleModel;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 1424316281
	)
	@Export("femaleModel1")
	int femaleModel1;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1984593181
	)
	@Export("femaleOffset")
	int femaleOffset;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -156937363
	)
	@Export("maleHeadModel")
	int maleHeadModel;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -773121151
	)
	@Export("maleHeadModel2")
	int maleHeadModel2;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 856445827
	)
	int field2188;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -84535487
	)
	@Export("femaleModel2")
	int femaleModel2;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 1816351317
	)
	@Export("femaleHeadModel")
	int femaleHeadModel;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1878264025
	)
	@Export("femaleHeadModel2")
	int femaleHeadModel2;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 720137437
	)
	int field2214;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 153526149
	)
	int field2215;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 514553379
	)
	int field2216;
	@ObfuscatedName("bj")
	@Export("countobj")
	int[] countobj;
	@ObfuscatedName("bf")
	@Export("countco")
	int[] countco;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 845984327
	)
	@Export("note")
	public int note;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -1739570397
	)
	@Export("noteTemplate")
	public int noteTemplate;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 164085001
	)
	@Export("resizeX")
	int resizeX;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -551231235
	)
	@Export("resizeY")
	int resizeY;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -2068425161
	)
	@Export("resizeZ")
	int resizeZ;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -1870497473
	)
	public int field2224;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -1884848513
	)
	public int field2225;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -1752729645
	)
	@Export("team")
	public int team;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -568214665
	)
	public int field2227;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("cc")
	@Export("isTradable")
	public boolean isTradable;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -2037040173
	)
	@Export("unnotedId")
	int unnotedId;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = -354396277
	)
	@Export("notedId")
	int notedId;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = -802107087
	)
	@Export("placeholder")
	public int placeholder;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -71881067
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
		this.field2188 = 0; // L: 60
		this.femaleModel2 = -1; // L: 61
		this.femaleHeadModel = -1; // L: 62
		this.femaleHeadModel2 = -1; // L: 63
		this.field2214 = -1; // L: 64
		this.field2215 = -1; // L: 65
		this.field2216 = -1; // L: 66
		this.note = -1; // L: 69
		this.noteTemplate = -1; // L: 70
		this.resizeX = 128; // L: 71
		this.resizeY = 128; // L: 72
		this.resizeZ = 128; // L: 73
		this.field2224 = 0; // L: 74
		this.field2225 = 0; // L: 75
		this.team = 0; // L: 76
		this.field2227 = 0; // L: 77
		this.isTradable = false; // L: 79
		this.unnotedId = -1; // L: 80
		this.notedId = -1; // L: 81
		this.placeholder = -1; // L: 82
		this.placeholderTemplate = -1; // L: 83
	} // L: 85

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	@Export("post")
	void post() {
		if (this.isStackable == 1) { // L: 126
			this.field2227 = 0;
		}

	} // L: 127

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lsy;S)V",
		garbageValue = "256"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 131
			if (var2 == 0) { // L: 132
				return; // L: 135
			}

			this.decodeNext(var1, var2); // L: 133
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lsy;II)V",
		garbageValue = "-1883519211"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 138
			this.model = var1.readUnsignedShort();
		} else if (var2 == 2) { // L: 139
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 140
			this.zoom2d = var1.readUnsignedShort();
		} else if (var2 == 5) { // L: 141
			this.xan2d = var1.readUnsignedShort();
		} else if (var2 == 6) { // L: 142
			this.yan2d = var1.readUnsignedShort();
		} else if (var2 == 7) { // L: 143
			this.offsetX2d = var1.readUnsignedShort(); // L: 144
			if (this.offsetX2d > 32767) { // L: 145
				this.offsetX2d -= 65536;
			}
		} else if (var2 == 8) { // L: 147
			this.offsetY2d = var1.readUnsignedShort(); // L: 148
			if (this.offsetY2d > 32767) { // L: 149
				this.offsetY2d -= 65536;
			}
		} else if (var2 == 9) { // L: 151
			var1.readStringCp1252NullTerminated(); // L: 152
		} else if (var2 == 11) { // L: 154
			this.isStackable = 1;
		} else if (var2 == 12) { // L: 155
			this.price = var1.readInt();
		} else if (var2 == 13) { // L: 156
			this.maleModel = var1.readUnsignedByte();
		} else if (var2 == 14) { // L: 157
			this.maleModel1 = var1.readUnsignedByte();
		} else if (var2 == 16) { // L: 158
			this.isMembersOnly = true;
		} else if (var2 == 23) { // L: 159
			this.femaleModel = var1.readUnsignedShort(); // L: 160
			this.femaleOffset = var1.readUnsignedByte(); // L: 161
		} else if (var2 == 24) { // L: 163
			this.femaleModel1 = var1.readUnsignedShort();
		} else if (var2 == 25) { // L: 164
			this.maleHeadModel = var1.readUnsignedShort(); // L: 165
			this.field2188 = var1.readUnsignedByte(); // L: 166
		} else if (var2 == 26) { // L: 168
			this.maleHeadModel2 = var1.readUnsignedShort();
		} else if (var2 == 27) { // L: 169
			this.maleModel2 = var1.readUnsignedByte();
		} else if (var2 >= 30 && var2 < 35) { // L: 170
			this.groundActions[var2 - 30] = var1.readStringCp1252NullTerminated(); // L: 171
			if (this.groundActions[var2 - 30].equalsIgnoreCase("Hidden")) { // L: 172
				this.groundActions[var2 - 30] = null;
			}
		} else if (var2 >= 35 && var2 < 40) { // L: 174
			this.inventoryActions[var2 - 35] = var1.readStringCp1252NullTerminated();
		} else {
			int var3;
			int var4;
			if (var2 == 40) { // L: 175
				var3 = var1.readUnsignedByte(); // L: 176
				this.recolorFrom = new short[var3]; // L: 177
				this.recolorTo = new short[var3]; // L: 178

				for (var4 = 0; var4 < var3; ++var4) { // L: 179
					this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 180
					this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 181
				}
			} else if (var2 == 41) { // L: 184
				var3 = var1.readUnsignedByte(); // L: 185
				this.retextureFrom = new short[var3]; // L: 186
				this.retextureTo = new short[var3]; // L: 187

				for (var4 = 0; var4 < var3; ++var4) { // L: 188
					this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 189
					this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 190
				}
			} else if (var2 == 42) { // L: 193
				this.shiftClickIndex = var1.readByte(); // L: 194
			} else if (var2 == 65) { // L: 196
				this.isTradable = true;
			} else if (var2 == 75) { // L: 197
				this.field2227 = var1.readShort();
			} else if (var2 == 78) { // L: 198
				this.femaleModel2 = var1.readUnsignedShort();
			} else if (var2 == 79) { // L: 199
				this.femaleHeadModel = var1.readUnsignedShort();
			} else if (var2 == 90) { // L: 200
				this.femaleHeadModel2 = var1.readUnsignedShort();
			} else if (var2 == 91) { // L: 201
				this.field2215 = var1.readUnsignedShort();
			} else if (var2 == 92) { // L: 202
				this.field2214 = var1.readUnsignedShort();
			} else if (var2 == 93) { // L: 203
				this.field2216 = var1.readUnsignedShort();
			} else if (var2 == 94) { // L: 204
				var1.readUnsignedShort(); // L: 205
			} else if (var2 == 95) { // L: 207
				this.zan2d = var1.readUnsignedShort();
			} else if (var2 == 97) { // L: 208
				this.note = var1.readUnsignedShort();
			} else if (var2 == 98) { // L: 209
				this.noteTemplate = var1.readUnsignedShort();
			} else if (var2 >= 100 && var2 < 110) { // L: 210
				if (this.countobj == null) { // L: 211
					this.countobj = new int[10]; // L: 212
					this.countco = new int[10]; // L: 213
				}

				this.countobj[var2 - 100] = var1.readUnsignedShort(); // L: 215
				this.countco[var2 - 100] = var1.readUnsignedShort(); // L: 216
			} else if (var2 == 110) { // L: 218
				this.resizeX = var1.readUnsignedShort();
			} else if (var2 == 111) { // L: 219
				this.resizeY = var1.readUnsignedShort();
			} else if (var2 == 112) { // L: 220
				this.resizeZ = var1.readUnsignedShort();
			} else if (var2 == 113) { // L: 221
				this.field2224 = var1.readByte();
			} else if (var2 == 114) { // L: 222
				this.field2225 = var1.readByte() * 5;
			} else if (var2 == 115) { // L: 223
				this.team = var1.readUnsignedByte();
			} else if (var2 == 139) { // L: 224
				this.unnotedId = var1.readUnsignedShort();
			} else if (var2 == 140) { // L: 225
				this.notedId = var1.readUnsignedShort();
			} else if (var2 == 148) { // L: 226
				this.placeholder = var1.readUnsignedShort();
			} else if (var2 == 149) { // L: 227
				this.placeholderTemplate = var1.readUnsignedShort();
			} else if (var2 == 249) { // L: 228
				this.params = class223.readStringIntParameters(var1, this.params);
			}
		}

	} // L: 230

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lhh;Lhh;I)V",
		garbageValue = "2092702539"
	)
	@Export("genCert")
	void genCert(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model; // L: 233
		this.zoom2d = var1.zoom2d; // L: 234
		this.xan2d = var1.xan2d; // L: 235
		this.yan2d = var1.yan2d; // L: 236
		this.zan2d = var1.zan2d; // L: 237
		this.offsetX2d = var1.offsetX2d; // L: 238
		this.offsetY2d = var1.offsetY2d; // L: 239
		this.recolorFrom = var1.recolorFrom; // L: 240
		this.recolorTo = var1.recolorTo; // L: 241
		this.retextureFrom = var1.retextureFrom; // L: 242
		this.retextureTo = var1.retextureTo; // L: 243
		this.name = var2.name; // L: 244
		this.isMembersOnly = var2.isMembersOnly; // L: 245
		this.price = var2.price; // L: 246
		this.isStackable = 1; // L: 247
	} // L: 248

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lhh;Lhh;B)V",
		garbageValue = "1"
	)
	@Export("genBought")
	void genBought(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model; // L: 251
		this.zoom2d = var1.zoom2d; // L: 252
		this.xan2d = var1.xan2d; // L: 253
		this.yan2d = var1.yan2d; // L: 254
		this.zan2d = var1.zan2d; // L: 255
		this.offsetX2d = var1.offsetX2d; // L: 256
		this.offsetY2d = var1.offsetY2d; // L: 257
		this.recolorFrom = var2.recolorFrom; // L: 258
		this.recolorTo = var2.recolorTo; // L: 259
		this.retextureFrom = var2.retextureFrom; // L: 260
		this.retextureTo = var2.retextureTo; // L: 261
		this.name = var2.name; // L: 262
		this.isMembersOnly = var2.isMembersOnly; // L: 263
		this.isStackable = var2.isStackable; // L: 264
		this.maleModel = var2.maleModel; // L: 265
		this.maleModel1 = var2.maleModel1; // L: 266
		this.maleModel2 = var2.maleModel2; // L: 267
		this.femaleModel = var2.femaleModel; // L: 268
		this.femaleModel1 = var2.femaleModel1; // L: 269
		this.femaleModel2 = var2.femaleModel2; // L: 270
		this.maleHeadModel = var2.maleHeadModel; // L: 271
		this.maleHeadModel2 = var2.maleHeadModel2; // L: 272
		this.femaleHeadModel = var2.femaleHeadModel; // L: 273
		this.femaleHeadModel2 = var2.femaleHeadModel2; // L: 274
		this.field2214 = var2.field2214; // L: 275
		this.field2215 = var2.field2215; // L: 276
		this.field2216 = var2.field2216; // L: 277
		this.team = var2.team; // L: 278
		this.groundActions = var2.groundActions; // L: 279
		this.field2227 = var2.field2227; // L: 280
		this.inventoryActions = new String[5]; // L: 281
		if (var2.inventoryActions != null) {
			for (int var3 = 0; var3 < 4; ++var3) { // L: 282
				this.inventoryActions[var3] = var2.inventoryActions[var3];
			}
		}

		this.inventoryActions[4] = "Discard"; // L: 283
		this.price = 0; // L: 284
	} // L: 285

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lhh;Lhh;I)V",
		garbageValue = "791558981"
	)
	@Export("genPlaceholder")
	void genPlaceholder(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model; // L: 288
		this.zoom2d = var1.zoom2d; // L: 289
		this.xan2d = var1.xan2d; // L: 290
		this.yan2d = var1.yan2d; // L: 291
		this.zan2d = var1.zan2d; // L: 292
		this.offsetX2d = var1.offsetX2d; // L: 293
		this.offsetY2d = var1.offsetY2d; // L: 294
		this.recolorFrom = var1.recolorFrom; // L: 295
		this.recolorTo = var1.recolorTo; // L: 296
		this.retextureFrom = var1.retextureFrom; // L: 297
		this.retextureTo = var1.retextureTo; // L: 298
		this.isStackable = var1.isStackable; // L: 299
		this.name = var2.name; // L: 300
		this.price = 0; // L: 301
		this.isMembersOnly = false; // L: 302
		this.isTradable = false; // L: 303
	} // L: 304

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)Liu;",
		garbageValue = "-28"
	)
	@Export("getModelData")
	public final ModelData getModelData(int var1) {
		int var3;
		if (this.countobj != null && var1 > 1) { // L: 307
			int var2 = -1; // L: 308

			for (var3 = 0; var3 < 10; ++var3) { // L: 309
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) { // L: 310
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) { // L: 312
				return ParamComposition.ItemComposition_get(var2).getModelData(1);
			}
		}

		ModelData var4 = ModelData.ModelData_get(ItemComposition_modelArchive, this.model, 0); // L: 314
		if (var4 == null) { // L: 315
			return null;
		} else {
			if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) { // L: 316
				var4.resize(this.resizeX, this.resizeY, this.resizeZ);
			}

			if (this.recolorFrom != null) { // L: 317
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) { // L: 318
					var4.recolor(this.recolorFrom[var3], this.recolorTo[var3]); // L: 319
				}
			}

			if (this.retextureFrom != null) { // L: 322
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) { // L: 323
					var4.retexture(this.retextureFrom[var3], this.retextureTo[var3]); // L: 324
				}
			}

			return var4; // L: 327
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Lix;",
		garbageValue = "-1942163938"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		if (this.countobj != null && var1 > 1) { // L: 331
			int var2 = -1; // L: 332

			for (int var3 = 0; var3 < 10; ++var3) { // L: 333
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) { // L: 334
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) { // L: 336
				return ParamComposition.ItemComposition_get(var2).getModel(1);
			}
		}

		Model var5 = (Model)ItemComposition_cachedModels.get((long)this.id); // L: 338
		if (var5 != null) { // L: 339
			return var5;
		} else {
			ModelData var6 = ModelData.ModelData_get(ItemComposition_modelArchive, this.model, 0); // L: 340
			if (var6 == null) { // L: 341
				return null;
			} else {
				if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) { // L: 342
					var6.resize(this.resizeX, this.resizeY, this.resizeZ);
				}

				int var4;
				if (this.recolorFrom != null) { // L: 343
					for (var4 = 0; var4 < this.recolorFrom.length; ++var4) { // L: 344
						var6.recolor(this.recolorFrom[var4], this.recolorTo[var4]); // L: 345
					}
				}

				if (this.retextureFrom != null) { // L: 348
					for (var4 = 0; var4 < this.retextureFrom.length; ++var4) { // L: 349
						var6.retexture(this.retextureFrom[var4], this.retextureTo[var4]); // L: 350
					}
				}

				var5 = var6.toModel(this.field2224 + 64, this.field2225 + 768, -50, -10, -50); // L: 353
				var5.isSingleTile = true; // L: 354
				ItemComposition_cachedModels.put(var5, (long)this.id); // L: 355
				return var5; // L: 356
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Lhh;",
		garbageValue = "-1484327710"
	)
	@Export("getCountObj")
	public ItemComposition getCountObj(int var1) {
		if (this.countobj != null && var1 > 1) { // L: 360
			int var2 = -1; // L: 361

			for (int var3 = 0; var3 < 10; ++var3) { // L: 362
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) {
					var2 = this.countobj[var3]; // L: 363
				}
			}

			if (var2 != -1) { // L: 365
				return ParamComposition.ItemComposition_get(var2);
			}
		}

		return this; // L: 367
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-55"
	)
	public final boolean method3918(int var1) {
		int var2 = this.femaleModel; // L: 445
		int var3 = this.femaleModel1; // L: 446
		int var4 = this.femaleModel2; // L: 447
		if (var1 == 1) { // L: 448
			var2 = this.maleHeadModel; // L: 449
			var3 = this.maleHeadModel2; // L: 450
			var4 = this.femaleHeadModel; // L: 451
		}

		if (var2 == -1) { // L: 453
			return true;
		} else {
			boolean var5 = true; // L: 454
			if (!ItemComposition_modelArchive.tryLoadFile(var2, 0)) { // L: 455
				var5 = false;
			}

			if (var3 != -1 && !ItemComposition_modelArchive.tryLoadFile(var3, 0)) { // L: 456
				var5 = false;
			}

			if (var4 != -1 && !ItemComposition_modelArchive.tryLoadFile(var4, 0)) { // L: 457
				var5 = false;
			}

			return var5; // L: 458
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Liu;",
		garbageValue = "1560498088"
	)
	public final ModelData method3919(int var1) {
		int var2 = this.femaleModel; // L: 462
		int var3 = this.femaleModel1; // L: 463
		int var4 = this.femaleModel2; // L: 464
		if (var1 == 1) { // L: 465
			var2 = this.maleHeadModel; // L: 466
			var3 = this.maleHeadModel2; // L: 467
			var4 = this.femaleHeadModel; // L: 468
		}

		if (var2 == -1) { // L: 470
			return null;
		} else {
			ModelData var5 = ModelData.ModelData_get(ItemComposition_modelArchive, var2, 0); // L: 471
			if (var3 != -1) { // L: 472
				ModelData var6 = ModelData.ModelData_get(ItemComposition_modelArchive, var3, 0); // L: 473
				if (var4 != -1) { // L: 474
					ModelData var7 = ModelData.ModelData_get(ItemComposition_modelArchive, var4, 0); // L: 475
					ModelData[] var8 = new ModelData[]{var5, var6, var7}; // L: 476
					var5 = new ModelData(var8, 3); // L: 477
				} else {
					ModelData[] var10 = new ModelData[]{var5, var6}; // L: 480
					var5 = new ModelData(var10, 2); // L: 481
				}
			}

			if (var1 == 0 && this.femaleOffset != 0) { // L: 484
				var5.changeOffset(0, this.femaleOffset, 0);
			}

			if (var1 == 1 && this.field2188 != 0) { // L: 485
				var5.changeOffset(0, this.field2188, 0);
			}

			int var9;
			if (this.recolorFrom != null) { // L: 486
				for (var9 = 0; var9 < this.recolorFrom.length; ++var9) { // L: 487
					var5.recolor(this.recolorFrom[var9], this.recolorTo[var9]); // L: 488
				}
			}

			if (this.retextureFrom != null) { // L: 491
				for (var9 = 0; var9 < this.retextureFrom.length; ++var9) { // L: 492
					var5.retexture(this.retextureFrom[var9], this.retextureTo[var9]); // L: 493
				}
			}

			return var5; // L: 496
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1893952947"
	)
	public final boolean method3920(int var1) {
		int var2 = this.femaleHeadModel2; // L: 500
		int var3 = this.field2214; // L: 501
		if (var1 == 1) { // L: 502
			var2 = this.field2215; // L: 503
			var3 = this.field2216; // L: 504
		}

		if (var2 == -1) { // L: 506
			return true;
		} else {
			boolean var4 = true; // L: 507
			if (!ItemComposition_modelArchive.tryLoadFile(var2, 0)) { // L: 508
				var4 = false;
			}

			if (var3 != -1 && !ItemComposition_modelArchive.tryLoadFile(var3, 0)) { // L: 509
				var4 = false;
			}

			return var4; // L: 510
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)Liu;",
		garbageValue = "73"
	)
	public final ModelData method3921(int var1) {
		int var2 = this.femaleHeadModel2; // L: 514
		int var3 = this.field2214; // L: 515
		if (var1 == 1) { // L: 516
			var2 = this.field2215; // L: 517
			var3 = this.field2216; // L: 518
		}

		if (var2 == -1) { // L: 520
			return null;
		} else {
			ModelData var4 = ModelData.ModelData_get(ItemComposition_modelArchive, var2, 0); // L: 521
			if (var3 != -1) { // L: 522
				ModelData var5 = ModelData.ModelData_get(ItemComposition_modelArchive, var3, 0); // L: 523
				ModelData[] var6 = new ModelData[]{var4, var5}; // L: 524
				var4 = new ModelData(var6, 2); // L: 525
			}

			int var7;
			if (this.recolorFrom != null) { // L: 527
				for (var7 = 0; var7 < this.recolorFrom.length; ++var7) { // L: 528
					var4.recolor(this.recolorFrom[var7], this.recolorTo[var7]); // L: 529
				}
			}

			if (this.retextureFrom != null) { // L: 532
				for (var7 = 0; var7 < this.retextureFrom.length; ++var7) { // L: 533
					var4.retexture(this.retextureFrom[var7], this.retextureTo[var7]); // L: 534
				}
			}

			return var4; // L: 537
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "3"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return class139.method3104(this.params, var1, var2); // L: 541
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1083179233"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class428.method7964(this.params, var1, var2); // L: 545
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-94"
	)
	@Export("getShiftClickIndex")
	public int getShiftClickIndex() {
		if (this.shiftClickIndex != -1 && this.inventoryActions != null) { // L: 549
			if (this.shiftClickIndex >= 0) { // L: 550
				return this.inventoryActions[this.shiftClickIndex] != null ? this.shiftClickIndex : -1;
			} else {
				return "Drop".equalsIgnoreCase(this.inventoryActions[4]) ? 4 : -1; // L: 551
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1111077860"
	)
	boolean method3983() {
		return this.recolorTo != null; // L: 559
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	boolean method3926() {
		return this.retextureTo != null; // L: 563
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1310906812"
	)
	public static int method3970(int var0) {
		return var0 != 0 && var0 != 1 ? -1 : 0; // L: 12 13 15
	}

	@ObfuscatedName("no")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "961747259"
	)
	static String method3982(String var0) {
		PlayerType[] var1 = class211.PlayerType_values(); // L: 12212

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 12213
			PlayerType var3 = var1[var2]; // L: 12214
			if (var3.modIcon != -1 && var0.startsWith(class7.method53(var3.modIcon))) { // L: 12216 12217
				var0 = var0.substring(6 + Integer.toString(var3.modIcon).length()); // L: 12218
				break;
			}
		}

		return var0; // L: 12225
	}
}
