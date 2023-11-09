import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("he")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
	@ObfuscatedName("aw")
	@Export("JagexCache_locationFile")
	static File JagexCache_locationFile;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	@Export("ItemComposition_modelArchive")
	public static AbstractArchive ItemComposition_modelArchive;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("ItemComposition_cached")
	public static EvictingDualNodeHashTable ItemComposition_cached;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("ItemComposition_cachedModels")
	public static EvictingDualNodeHashTable ItemComposition_cachedModels;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("ItemComposition_cachedSprites")
	public static EvictingDualNodeHashTable ItemComposition_cachedSprites;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -527448421
	)
	@Export("id")
	int id;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -372436477
	)
	@Export("model")
	int model;
	@ObfuscatedName("aa")
	@Export("name")
	public String name;
	@ObfuscatedName("ar")
	@Export("recolorFrom")
	public short[] recolorFrom;
	@ObfuscatedName("ad")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("at")
	@Export("retextureFrom")
	public short[] retextureFrom;
	@ObfuscatedName("af")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -52927989
	)
	@Export("zoom2d")
	public int zoom2d;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -2101120729
	)
	@Export("xan2d")
	public int xan2d;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -764401773
	)
	@Export("yan2d")
	public int yan2d;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -642345245
	)
	@Export("zan2d")
	public int zan2d;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1875239743
	)
	@Export("offsetX2d")
	public int offsetX2d;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1913551303
	)
	@Export("offsetY2d")
	public int offsetY2d;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 2020008925
	)
	@Export("isStackable")
	public int isStackable;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1542255941
	)
	@Export("price")
	public int price;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 251412625
	)
	@Export("maleModel")
	public int maleModel;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1045936095
	)
	@Export("maleModel1")
	public int maleModel1;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 1538347141
	)
	@Export("maleModel2")
	public int maleModel2;
	@ObfuscatedName("bb")
	@Export("isMembersOnly")
	public boolean isMembersOnly;
	@ObfuscatedName("bi")
	@Export("groundActions")
	public String[] groundActions;
	@ObfuscatedName("bj")
	@Export("inventoryActions")
	public String[] inventoryActions;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -824959249
	)
	@Export("shiftClickIndex")
	int shiftClickIndex;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -1566985095
	)
	@Export("femaleModel")
	int femaleModel;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 906252373
	)
	@Export("femaleModel1")
	int femaleModel1;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -1703366779
	)
	@Export("femaleOffset")
	int femaleOffset;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 239580955
	)
	@Export("maleHeadModel")
	int maleHeadModel;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 389974659
	)
	@Export("maleHeadModel2")
	int maleHeadModel2;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -1564715551
	)
	int field2237;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -329007977
	)
	@Export("femaleModel2")
	int femaleModel2;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -1046695297
	)
	@Export("femaleHeadModel")
	int femaleHeadModel;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 99315977
	)
	@Export("femaleHeadModel2")
	int femaleHeadModel2;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 899589597
	)
	int field2236;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1897575313
	)
	int field2252;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 1731809141
	)
	int field2243;
	@ObfuscatedName("bs")
	@Export("countobj")
	int[] countobj;
	@ObfuscatedName("bd")
	@Export("countco")
	int[] countco;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -1562748823
	)
	@Export("note")
	public int note;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -1763946569
	)
	@Export("noteTemplate")
	public int noteTemplate;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 113215041
	)
	@Export("resizeX")
	int resizeX;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 546048595
	)
	@Export("resizeY")
	int resizeY;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -2058776183
	)
	@Export("resizeZ")
	int resizeZ;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 1399575693
	)
	public int field2225;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -1063563959
	)
	public int field2240;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 632779781
	)
	@Export("team")
	public int team;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 64847607
	)
	public int field2254;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "Lsw;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("cw")
	@Export("isTradable")
	public boolean isTradable;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -1049301973
	)
	@Export("unnotedId")
	int unnotedId;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = 1334354631
	)
	@Export("notedId")
	int notedId;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 1891574189
	)
	@Export("placeholder")
	public int placeholder;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 598626973
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
		this.field2237 = 0; // L: 62
		this.femaleModel2 = -1; // L: 63
		this.femaleHeadModel = -1; // L: 64
		this.femaleHeadModel2 = -1; // L: 65
		this.field2236 = -1; // L: 66
		this.field2252 = -1; // L: 67
		this.field2243 = -1; // L: 68
		this.note = -1; // L: 71
		this.noteTemplate = -1; // L: 72
		this.resizeX = 128; // L: 73
		this.resizeY = 128; // L: 74
		this.resizeZ = 128; // L: 75
		this.field2225 = 0; // L: 76
		this.field2240 = 0; // L: 77
		this.team = 0; // L: 78
		this.field2254 = 0; // L: 79
		this.isTradable = false; // L: 81
		this.unnotedId = -1; // L: 82
		this.notedId = -1; // L: 83
		this.placeholder = -1; // L: 84
		this.placeholderTemplate = -1; // L: 85
	} // L: 87

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-572662528"
	)
	@Export("post")
	void post() {
		if (this.isStackable == 1) { // L: 130
			this.field2254 = 0;
		}

	} // L: 131

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ltl;I)V",
		garbageValue = "2098424945"
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ltl;II)V",
		garbageValue = "1865372160"
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
			this.offsetX2d = var1.readUnsignedShort(); // L: 148
			if (this.offsetX2d > 32767) { // L: 149
				this.offsetX2d -= 65536;
			}
		} else if (var2 == 8) { // L: 151
			this.offsetY2d = var1.readUnsignedShort(); // L: 152
			if (this.offsetY2d > 32767) { // L: 153
				this.offsetY2d -= 65536;
			}
		} else if (var2 == 9) { // L: 155
			var1.readStringCp1252NullTerminated(); // L: 156
		} else if (var2 == 11) { // L: 158
			this.isStackable = 1;
		} else if (var2 == 12) { // L: 159
			this.price = var1.readInt();
		} else if (var2 == 13) { // L: 160
			this.maleModel = var1.readUnsignedByte();
		} else if (var2 == 14) { // L: 161
			this.maleModel1 = var1.readUnsignedByte();
		} else if (var2 == 16) { // L: 162
			this.isMembersOnly = true;
		} else if (var2 == 23) { // L: 163
			this.femaleModel = var1.readUnsignedShort(); // L: 164
			this.femaleOffset = var1.readUnsignedByte(); // L: 165
		} else if (var2 == 24) { // L: 167
			this.femaleModel1 = var1.readUnsignedShort();
		} else if (var2 == 25) { // L: 168
			this.maleHeadModel = var1.readUnsignedShort(); // L: 169
			this.field2237 = var1.readUnsignedByte(); // L: 170
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
				this.field2254 = var1.readShort();
			} else if (var2 == 78) { // L: 204
				this.femaleModel2 = var1.readUnsignedShort();
			} else if (var2 == 79) { // L: 205
				this.femaleHeadModel = var1.readUnsignedShort();
			} else if (var2 == 90) { // L: 206
				this.femaleHeadModel2 = var1.readUnsignedShort();
			} else if (var2 == 91) { // L: 207
				this.field2252 = var1.readUnsignedShort();
			} else if (var2 == 92) { // L: 208
				this.field2236 = var1.readUnsignedShort();
			} else if (var2 == 93) { // L: 209
				this.field2243 = var1.readUnsignedShort();
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
				this.field2225 = var1.readByte();
			} else if (var2 == 114) { // L: 228
				this.field2240 = var1.readByte() * 5;
			} else if (var2 == 115) { // L: 229
				this.team = var1.readUnsignedByte();
			} else if (var2 == 139) { // L: 230
				this.unnotedId = var1.readUnsignedShort();
			} else if (var2 == 140) { // L: 231
				this.notedId = var1.readUnsignedShort();
			} else if (var2 == 148) { // L: 232
				this.placeholder = var1.readUnsignedShort();
			} else if (var2 == 149) { // L: 233
				this.placeholderTemplate = var1.readUnsignedShort();
			} else if (var2 == 249) { // L: 234
				this.params = class131.readStringIntParameters(var1, this.params);
			}
		}

	} // L: 236

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lhe;Lhe;I)V",
		garbageValue = "1783604112"
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lhe;Lhe;I)V",
		garbageValue = "1625642967"
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
		this.field2236 = var2.field2236; // L: 281
		this.field2252 = var2.field2252; // L: 282
		this.field2243 = var2.field2243; // L: 283
		this.team = var2.team; // L: 284
		this.groundActions = var2.groundActions; // L: 285
		this.field2254 = var2.field2254; // L: 286
		this.inventoryActions = new String[5]; // L: 287
		if (var2.inventoryActions != null) {
			for (int var3 = 0; var3 < 4; ++var3) { // L: 288
				this.inventoryActions[var3] = var2.inventoryActions[var3];
			}
		}

		this.inventoryActions[4] = "Discard"; // L: 289
		this.price = 0; // L: 290
	} // L: 291

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lhe;Lhe;S)V",
		garbageValue = "11778"
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)Lio;",
		garbageValue = "50"
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
				return class141.ItemComposition_get(var2).getModelData(1);
			}
		}

		ModelData var4 = ModelData.ModelData_get(ItemComposition_modelArchive, this.model, 0); // L: 320
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Ljr;",
		garbageValue = "-1329544475"
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
				return class141.ItemComposition_get(var2).getModel(1);
			}
		}

		Model var5 = (Model)ItemComposition_cachedModels.get((long)this.id); // L: 344
		if (var5 != null) { // L: 345
			return var5;
		} else {
			ModelData var6 = ModelData.ModelData_get(ItemComposition_modelArchive, this.model, 0); // L: 346
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

				var5 = var6.toModel(this.field2225 + 64, this.field2240 + 768, -50, -10, -50); // L: 359
				var5.isSingleTile = true; // L: 360
				ItemComposition_cachedModels.put(var5, (long)this.id); // L: 361
				return var5; // L: 362
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Lhe;",
		garbageValue = "-66984862"
	)
	@Export("getCountObj")
	public ItemComposition getCountObj(int var1) {
		if (this.countobj != null && var1 > 1) { // L: 366
			int var2 = -1; // L: 367

			for (int var3 = 0; var3 < 10; ++var3) { // L: 368
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) { // L: 369
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) { // L: 371
				return class141.ItemComposition_get(var2);
			}
		}

		return this; // L: 373
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2067415799"
	)
	public final boolean method4087(int var1) {
		int var2 = this.femaleModel; // L: 452
		int var3 = this.femaleModel1; // L: 453
		int var4 = this.femaleModel2; // L: 454
		if (var1 == 1) { // L: 455
			var2 = this.maleHeadModel; // L: 456
			var3 = this.maleHeadModel2; // L: 457
			var4 = this.femaleHeadModel; // L: 458
		}

		if (var2 == -1) { // L: 460
			return true;
		} else {
			boolean var5 = true; // L: 461
			if (!ItemComposition_modelArchive.tryLoadFile(var2, 0)) { // L: 462
				var5 = false;
			}

			if (var3 != -1 && !ItemComposition_modelArchive.tryLoadFile(var3, 0)) { // L: 463
				var5 = false;
			}

			if (var4 != -1 && !ItemComposition_modelArchive.tryLoadFile(var4, 0)) { // L: 464
				var5 = false;
			}

			return var5; // L: 465
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)Lio;",
		garbageValue = "-59582774"
	)
	public final ModelData method4088(int var1) {
		int var2 = this.femaleModel; // L: 469
		int var3 = this.femaleModel1; // L: 470
		int var4 = this.femaleModel2; // L: 471
		if (var1 == 1) { // L: 472
			var2 = this.maleHeadModel; // L: 473
			var3 = this.maleHeadModel2; // L: 474
			var4 = this.femaleHeadModel; // L: 475
		}

		if (var2 == -1) { // L: 477
			return null;
		} else {
			ModelData var5 = ModelData.ModelData_get(ItemComposition_modelArchive, var2, 0); // L: 478
			if (var3 != -1) { // L: 479
				ModelData var6 = ModelData.ModelData_get(ItemComposition_modelArchive, var3, 0); // L: 480
				if (var4 != -1) { // L: 481
					ModelData var7 = ModelData.ModelData_get(ItemComposition_modelArchive, var4, 0); // L: 482
					ModelData[] var8 = new ModelData[]{var5, var6, var7}; // L: 483
					var5 = new ModelData(var8, 3); // L: 484
				} else {
					ModelData[] var10 = new ModelData[]{var5, var6}; // L: 487
					var5 = new ModelData(var10, 2); // L: 488
				}
			}

			if (var1 == 0 && this.femaleOffset != 0) { // L: 491
				var5.changeOffset(0, this.femaleOffset, 0);
			}

			if (var1 == 1 && this.field2237 != 0) { // L: 492
				var5.changeOffset(0, this.field2237, 0);
			}

			int var9;
			if (this.recolorFrom != null) { // L: 493
				for (var9 = 0; var9 < this.recolorFrom.length; ++var9) { // L: 494
					var5.recolor(this.recolorFrom[var9], this.recolorTo[var9]); // L: 495
				}
			}

			if (this.retextureFrom != null) { // L: 498
				for (var9 = 0; var9 < this.retextureFrom.length; ++var9) { // L: 499
					var5.retexture(this.retextureFrom[var9], this.retextureTo[var9]); // L: 500
				}
			}

			return var5; // L: 503
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1344132618"
	)
	public final boolean method4133(int var1) {
		int var2 = this.femaleHeadModel2; // L: 507
		int var3 = this.field2236; // L: 508
		if (var1 == 1) { // L: 509
			var2 = this.field2252; // L: 510
			var3 = this.field2243; // L: 511
		}

		if (var2 == -1) { // L: 513
			return true;
		} else {
			boolean var4 = true; // L: 514
			if (!ItemComposition_modelArchive.tryLoadFile(var2, 0)) { // L: 515
				var4 = false;
			}

			if (var3 != -1 && !ItemComposition_modelArchive.tryLoadFile(var3, 0)) { // L: 516
				var4 = false;
			}

			return var4; // L: 517
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IB)Lio;",
		garbageValue = "42"
	)
	public final ModelData method4090(int var1) {
		int var2 = this.femaleHeadModel2; // L: 521
		int var3 = this.field2236; // L: 522
		if (var1 == 1) { // L: 523
			var2 = this.field2252; // L: 524
			var3 = this.field2243; // L: 525
		}

		if (var2 == -1) { // L: 527
			return null;
		} else {
			ModelData var4 = ModelData.ModelData_get(ItemComposition_modelArchive, var2, 0); // L: 528
			if (var3 != -1) { // L: 529
				ModelData var5 = ModelData.ModelData_get(ItemComposition_modelArchive, var3, 0); // L: 530
				ModelData[] var6 = new ModelData[]{var4, var5}; // L: 531
				var4 = new ModelData(var6, 2); // L: 532
			}

			int var7;
			if (this.recolorFrom != null) { // L: 534
				for (var7 = 0; var7 < this.recolorFrom.length; ++var7) { // L: 535
					var4.recolor(this.recolorFrom[var7], this.recolorTo[var7]); // L: 536
				}
			}

			if (this.retextureFrom != null) { // L: 539
				for (var7 = 0; var7 < this.retextureFrom.length; ++var7) { // L: 540
					var4.retexture(this.retextureFrom[var7], this.retextureTo[var7]); // L: 541
				}
			}

			return var4; // L: 544
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "984198076"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return class184.method3664(this.params, var1, var2); // L: 548
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1358068950"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		IterableNodeHashTable var4 = this.params; // L: 553
		String var3;
		if (var4 == null) { // L: 555
			var3 = var2; // L: 556
		} else {
			ObjectNode var5 = (ObjectNode)var4.get((long)var1); // L: 559
			if (var5 == null) { // L: 560
				var3 = var2; // L: 561
			} else {
				var3 = (String)var5.obj; // L: 564
			}
		}

		return var3; // L: 566
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2026019126"
	)
	@Export("getShiftClickIndex")
	public int getShiftClickIndex() {
		if (this.shiftClickIndex != -1 && this.inventoryActions != null) { // L: 570
			if (this.shiftClickIndex >= 0) { // L: 571
				return this.inventoryActions[this.shiftClickIndex] != null ? this.shiftClickIndex : -1;
			} else {
				return "Drop".equalsIgnoreCase(this.inventoryActions[4]) ? 4 : -1; // L: 572
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "113"
	)
	boolean method4094() {
		return this.recolorTo != null; // L: 587
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "34"
	)
	boolean method4095() {
		return this.retextureTo != null; // L: 591
	}

	@ObfuscatedName("nu")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-33"
	)
	static void method4140(int var0) {
		Client.oculusOrbState = var0; // L: 12782
	} // L: 12783
}
