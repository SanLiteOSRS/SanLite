import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hn")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("ItemComposition_modelArchive")
	public static AbstractArchive ItemComposition_modelArchive;
	@ObfuscatedName("ap")
	@Export("ItemComposition_inMembersWorld")
	public static boolean ItemComposition_inMembersWorld;
	@ObfuscatedName("aa")
	static int[] field2285;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("ItemComposition_cached")
	public static EvictingDualNodeHashTable ItemComposition_cached;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("ItemComposition_cachedModels")
	public static EvictingDualNodeHashTable ItemComposition_cachedModels;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("ItemComposition_cachedSprites")
	public static EvictingDualNodeHashTable ItemComposition_cachedSprites;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -466945669
	)
	@Export("id")
	int id;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1232423355
	)
	@Export("model")
	int model;
	@ObfuscatedName("ab")
	@Export("name")
	public String name;
	@ObfuscatedName("ag")
	@Export("recolorFrom")
	public short[] recolorFrom;
	@ObfuscatedName("am")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("ax")
	@Export("retextureFrom")
	public short[] retextureFrom;
	@ObfuscatedName("ah")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -2008807493
	)
	@Export("zoom2d")
	public int zoom2d;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -432198967
	)
	@Export("xan2d")
	public int xan2d;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -2038395775
	)
	@Export("yan2d")
	public int yan2d;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1047448817
	)
	@Export("zan2d")
	public int zan2d;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1575934065
	)
	@Export("offsetX2d")
	public int offsetX2d;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1708935409
	)
	@Export("offsetY2d")
	public int offsetY2d;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 1877325851
	)
	@Export("isStackable")
	public int isStackable;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 163184539
	)
	@Export("price")
	public int price;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -2141069133
	)
	@Export("maleModel")
	public int maleModel;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 948680211
	)
	@Export("maleModel1")
	public int maleModel1;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -1633837599
	)
	@Export("maleModel2")
	public int maleModel2;
	@ObfuscatedName("bs")
	@Export("isMembersOnly")
	public boolean isMembersOnly;
	@ObfuscatedName("bm")
	@Export("groundActions")
	public String[] groundActions;
	@ObfuscatedName("bf")
	@Export("inventoryActions")
	public String[] inventoryActions;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -947919987
	)
	@Export("shiftClickIndex")
	int shiftClickIndex;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1761099787
	)
	@Export("femaleModel")
	int femaleModel;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1984585761
	)
	@Export("femaleModel1")
	int femaleModel1;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -749447917
	)
	@Export("femaleOffset")
	int femaleOffset;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 1333889291
	)
	@Export("maleHeadModel")
	int maleHeadModel;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 1866767407
	)
	@Export("maleHeadModel2")
	int maleHeadModel2;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -1663316983
	)
	int field2259;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -826562515
	)
	@Export("femaleModel2")
	int femaleModel2;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 1011617377
	)
	@Export("femaleHeadModel")
	int femaleHeadModel;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -767611597
	)
	@Export("femaleHeadModel2")
	int femaleHeadModel2;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -1234296163
	)
	int field2264;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -1615294949
	)
	int field2243;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -1483957833
	)
	int field2265;
	@ObfuscatedName("bc")
	@Export("countobj")
	int[] countobj;
	@ObfuscatedName("bg")
	@Export("countco")
	int[] countco;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 920906667
	)
	@Export("note")
	public int note;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 750294877
	)
	@Export("noteTemplate")
	public int noteTemplate;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -392845295
	)
	@Export("resizeX")
	int resizeX;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -328019397
	)
	@Export("resizeY")
	int resizeY;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 2073940693
	)
	@Export("resizeZ")
	int resizeZ;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -1244013181
	)
	public int field2273;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 100633045
	)
	public int field2274;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -335410257
	)
	@Export("team")
	public int team;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 8073231
	)
	public int field2235;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Lsf;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("cp")
	@Export("isTradable")
	public boolean isTradable;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = 271998743
	)
	@Export("unnotedId")
	int unnotedId;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 488517763
	)
	@Export("notedId")
	int notedId;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = -2082602643
	)
	@Export("placeholder")
	public int placeholder;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 1241535591
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
		this.field2259 = 0; // L: 62
		this.femaleModel2 = -1; // L: 63
		this.femaleHeadModel = -1; // L: 64
		this.femaleHeadModel2 = -1; // L: 65
		this.field2264 = -1; // L: 66
		this.field2243 = -1; // L: 67
		this.field2265 = -1; // L: 68
		this.note = -1; // L: 71
		this.noteTemplate = -1; // L: 72
		this.resizeX = 128; // L: 73
		this.resizeY = 128; // L: 74
		this.resizeZ = 128; // L: 75
		this.field2273 = 0; // L: 76
		this.field2274 = 0; // L: 77
		this.team = 0; // L: 78
		this.field2235 = 0; // L: 79
		this.isTradable = false; // L: 81
		this.unnotedId = -1; // L: 82
		this.notedId = -1; // L: 83
		this.placeholder = -1; // L: 84
		this.placeholderTemplate = -1; // L: 85
	} // L: 87

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "864940411"
	)
	@Export("post")
	void post() {
		if (this.isStackable == 1) { // L: 130
			this.field2235 = 0;
		}

	} // L: 131

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ltm;B)V",
		garbageValue = "3"
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltm;II)V",
		garbageValue = "628173380"
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
			this.field2259 = var1.readUnsignedByte(); // L: 170
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
				this.field2235 = var1.readShort();
			} else if (var2 == 78) { // L: 204
				this.femaleModel2 = var1.readUnsignedShort();
			} else if (var2 == 79) { // L: 205
				this.femaleHeadModel = var1.readUnsignedShort();
			} else if (var2 == 90) { // L: 206
				this.femaleHeadModel2 = var1.readUnsignedShort();
			} else if (var2 == 91) { // L: 207
				this.field2243 = var1.readUnsignedShort();
			} else if (var2 == 92) { // L: 208
				this.field2264 = var1.readUnsignedShort();
			} else if (var2 == 93) { // L: 209
				this.field2265 = var1.readUnsignedShort();
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
			} else if (var2 == 110) {
				this.resizeX = var1.readUnsignedShort();
			} else if (var2 == 111) {
				this.resizeY = var1.readUnsignedShort();
			} else if (var2 == 112) { // L: 226
				this.resizeZ = var1.readUnsignedShort();
			} else if (var2 == 113) { // L: 227
				this.field2273 = var1.readByte();
			} else if (var2 == 114) { // L: 228
				this.field2274 = var1.readByte() * 5;
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
				this.params = Decimator.readStringIntParameters(var1, this.params);
			}
		}

	} // L: 236

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lhn;Lhn;B)V",
		garbageValue = "-46"
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lhn;Lhn;B)V",
		garbageValue = "-88"
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
		this.field2264 = var2.field2264; // L: 281
		this.field2243 = var2.field2243; // L: 282
		this.field2265 = var2.field2265; // L: 283
		this.team = var2.team; // L: 284
		this.groundActions = var2.groundActions; // L: 285
		this.field2235 = var2.field2235; // L: 286
		this.inventoryActions = new String[5]; // L: 287
		if (var2.inventoryActions != null) {
			for (int var3 = 0; var3 < 4; ++var3) { // L: 288
				this.inventoryActions[var3] = var2.inventoryActions[var3];
			}
		}

		this.inventoryActions[4] = "Discard"; // L: 289
		this.price = 0; // L: 290
	} // L: 291

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lhn;Lhn;I)V",
		garbageValue = "-490617872"
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)Lic;",
		garbageValue = "0"
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
				return InvDefinition.ItemComposition_get(var2).getModelData(1);
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

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)Ljr;",
		garbageValue = "220465503"
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
				return InvDefinition.ItemComposition_get(var2).getModel(1);
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

				var5 = var6.toModel(this.field2273 + 64, this.field2274 + 768, -50, -10, -50); // L: 359
				var5.isSingleTile = true; // L: 360
				ItemComposition_cachedModels.put(var5, (long)this.id); // L: 361
				return var5; // L: 362
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Lhn;",
		garbageValue = "-257318968"
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
				return InvDefinition.ItemComposition_get(var2);
			}
		}

		return this; // L: 373
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-106"
	)
	public final boolean method3947(int var1) {
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
			if (!ItemComposition_modelArchive.tryLoadFile(var2, 0)) { // L: 469
				var5 = false;
			}

			if (var3 != -1 && !ItemComposition_modelArchive.tryLoadFile(var3, 0)) { // L: 470
				var5 = false;
			}

			if (var4 != -1 && !ItemComposition_modelArchive.tryLoadFile(var4, 0)) { // L: 471
				var5 = false;
			}

			return var5; // L: 472
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Lic;",
		garbageValue = "768545854"
	)
	public final ModelData method3948(int var1) {
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
			ModelData var5 = ModelData.ModelData_get(ItemComposition_modelArchive, var2, 0); // L: 485
			if (var3 != -1) { // L: 486
				ModelData var6 = ModelData.ModelData_get(ItemComposition_modelArchive, var3, 0); // L: 487
				if (var4 != -1) { // L: 488
					ModelData var7 = ModelData.ModelData_get(ItemComposition_modelArchive, var4, 0); // L: 489
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

			if (var1 == 1 && this.field2259 != 0) { // L: 499
				var5.changeOffset(0, this.field2259, 0);
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-594458202"
	)
	public final boolean method3949(int var1) {
		int var2 = this.femaleHeadModel2; // L: 514
		int var3 = this.field2264; // L: 515
		if (var1 == 1) { // L: 516
			var2 = this.field2243; // L: 517
			var3 = this.field2265; // L: 518
		}

		if (var2 == -1) { // L: 520
			return true;
		} else {
			boolean var4 = true; // L: 521
			if (!ItemComposition_modelArchive.tryLoadFile(var2, 0)) { // L: 522
				var4 = false;
			}

			if (var3 != -1 && !ItemComposition_modelArchive.tryLoadFile(var3, 0)) { // L: 523
				var4 = false;
			}

			return var4; // L: 524
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Lic;",
		garbageValue = "1601057747"
	)
	public final ModelData method3952(int var1) {
		int var2 = this.femaleHeadModel2; // L: 528
		int var3 = this.field2264; // L: 529
		if (var1 == 1) { // L: 530
			var2 = this.field2243; // L: 531
			var3 = this.field2265; // L: 532
		}

		if (var2 == -1) { // L: 534
			return null;
		} else {
			ModelData var4 = ModelData.ModelData_get(ItemComposition_modelArchive, var2, 0); // L: 535
			if (var3 != -1) { // L: 536
				ModelData var5 = ModelData.ModelData_get(ItemComposition_modelArchive, var3, 0); // L: 537
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "6798"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return class14.method163(this.params, var1, var2); // L: 555
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "693488201"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		IterableNodeHashTable var4 = this.params; // L: 560
		String var3;
		if (var4 == null) { // L: 562
			var3 = var2; // L: 563
		} else {
			ObjectNode var5 = (ObjectNode)var4.get((long)var1); // L: 566
			if (var5 == null) { // L: 567
				var3 = var2; // L: 568
			} else {
				var3 = (String)var5.obj; // L: 571
			}
		}

		return var3; // L: 573
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-702688256"
	)
	@Export("getShiftClickIndex")
	public int getShiftClickIndex() {
		if (this.shiftClickIndex != -1 && this.inventoryActions != null) { // L: 577
			if (this.shiftClickIndex >= 0) { // L: 578
				return this.inventoryActions[this.shiftClickIndex] != null ? this.shiftClickIndex : -1;
			} else {
				return "Drop".equalsIgnoreCase(this.inventoryActions[4]) ? 4 : -1; // L: 579
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2125931156"
	)
	boolean method4002() {
		return this.recolorTo != null; // L: 587
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-889947333"
	)
	boolean method3955() {
		return this.retextureTo != null; // L: 591
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1033906298"
	)
	public static int method4006(int var0) {
		if (var0 > 0) { // L: 223
			return 1;
		} else {
			return var0 < 0 ? -1 : 0; // L: 224 225
		}
	}
}
