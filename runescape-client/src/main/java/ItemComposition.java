import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("id")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("ItemComposition_archive")
	public static AbstractArchive ItemComposition_archive;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 610943889
	)
	@Export("ItemComposition_fileCount")
	public static int ItemComposition_fileCount;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("ItemComposition_cached")
	public static EvictingDualNodeHashTable ItemComposition_cached;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("ItemComposition_cachedModels")
	public static EvictingDualNodeHashTable ItemComposition_cachedModels;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("ItemComposition_cachedSprites")
	public static EvictingDualNodeHashTable ItemComposition_cachedSprites;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 89446857
	)
	@Export("id")
	int id;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -331366277
	)
	@Export("model")
	int model;
	@ObfuscatedName("aj")
	@Export("name")
	public String name;
	@ObfuscatedName("au")
	public String field2334;
	@ObfuscatedName("ay")
	@Export("recolorFrom")
	public short[] recolorFrom;
	@ObfuscatedName("ap")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("av")
	@Export("retextureFrom")
	public short[] retextureFrom;
	@ObfuscatedName("aa")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1102837677
	)
	@Export("zoom2d")
	public int zoom2d;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 503649653
	)
	@Export("xan2d")
	public int xan2d;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1943737471
	)
	@Export("yan2d")
	public int yan2d;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -661785609
	)
	@Export("zan2d")
	public int zan2d;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1979973685
	)
	@Export("offsetX2d")
	public int offsetX2d;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1395029919
	)
	@Export("offsetY2d")
	public int offsetY2d;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -718484241
	)
	@Export("isStackable")
	public int isStackable;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -1025691377
	)
	@Export("price")
	public int price;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -2019263849
	)
	@Export("maleModel")
	public int maleModel;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -898322847
	)
	@Export("maleModel1")
	public int maleModel1;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -2128979135
	)
	public int field2326;
	@ObfuscatedName("bx")
	@Export("isMembersOnly")
	public boolean isMembersOnly;
	@ObfuscatedName("bl")
	@Export("groundActions")
	public String[] groundActions;
	@ObfuscatedName("bh")
	@Export("inventoryActions")
	public String[] inventoryActions;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -835128691
	)
	@Export("shiftClickIndex")
	int shiftClickIndex;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 1528055805
	)
	@Export("femaleModel1")
	int femaleModel1;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 1128123567
	)
	int field2332;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -1577591191
	)
	int field2333;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -1194586729
	)
	int field2299;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1057903281
	)
	int field2346;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -1790553163
	)
	int field2307;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 898507413
	)
	int field2311;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -1686684813
	)
	int field2338;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 397634165
	)
	int field2339;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -1925379179
	)
	int field2320;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1012196935
	)
	int field2308;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -237416595
	)
	int field2342;
	@ObfuscatedName("bg")
	@Export("countobj")
	int[] countobj;
	@ObfuscatedName("cb")
	@Export("countco")
	int[] countco;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -959673499
	)
	@Export("note")
	public int note;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 185590851
	)
	@Export("noteTemplate")
	public int noteTemplate;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 912600711
	)
	@Export("resizeX")
	int resizeX;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -1131354191
	)
	@Export("resizeY")
	int resizeY;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 1535121285
	)
	@Export("resizeZ")
	int resizeZ;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 1608007329
	)
	public int field2350;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -451149597
	)
	public int field2337;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -77241073
	)
	public int field2352;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 201086427
	)
	public int field2325;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "Lto;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("cc")
	@Export("isTradable")
	public boolean isTradable;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -535511093
	)
	@Export("unnotedId")
	int unnotedId;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 2100018853
	)
	@Export("notedId")
	int notedId;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -1456235845
	)
	@Export("placeholder")
	public int placeholder;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = -220858723
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
		this.field2334 = "null"; // L: 35
		this.zoom2d = 2000; // L: 40
		this.xan2d = 0; // L: 41
		this.yan2d = 0; // L: 42
		this.zan2d = 0; // L: 43
		this.offsetX2d = 0; // L: 44
		this.offsetY2d = 0; // L: 45
		this.isStackable = 0; // L: 48
		this.price = 1; // L: 49
		this.maleModel = -1; // L: 50
		this.maleModel1 = -1; // L: 51
		this.field2326 = -1; // L: 52
		this.isMembersOnly = false; // L: 53
		this.groundActions = new String[]{null, null, "Take", null, null}; // L: 54
		this.inventoryActions = new String[]{null, null, null, null, "Drop"}; // L: 55
		this.shiftClickIndex = -2; // L: 57
		this.femaleModel1 = -1; // L: 58
		this.field2332 = -1; // L: 59
		this.field2333 = 0; // L: 60
		this.field2299 = -1; // L: 61
		this.field2346 = -1; // L: 62
		this.field2307 = 0; // L: 63
		this.field2311 = -1; // L: 64
		this.field2338 = -1; // L: 65
		this.field2339 = -1; // L: 66
		this.field2320 = -1; // L: 67
		this.field2308 = -1; // L: 68
		this.field2342 = -1; // L: 69
		this.note = -1; // L: 72
		this.noteTemplate = -1; // L: 73
		this.resizeX = 128; // L: 74
		this.resizeY = 128; // L: 75
		this.resizeZ = 128; // L: 76
		this.field2350 = 0; // L: 77
		this.field2337 = 0; // L: 78
		this.field2352 = 0; // L: 79
		this.field2325 = 0; // L: 80
		this.isTradable = false; // L: 82
		this.unnotedId = -1; // L: 83
		this.notedId = -1; // L: 84
		this.placeholder = -1; // L: 85
		this.placeholderTemplate = -1; // L: 86
	} // L: 88

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "6686"
	)
	@Export("post")
	void post() {
		if (this.isStackable == 1) { // L: 132
			this.field2325 = 0;
		}

	} // L: 133

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lur;B)V",
		garbageValue = "35"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 137
			if (var2 == 0) { // L: 138
				return; // L: 141
			}

			this.method4134(var1, var2); // L: 139
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lur;IB)V",
		garbageValue = "1"
	)
	void method4134(Buffer var1, int var2) {
		if (var2 == 1) { // L: 144
			this.model = var1.readUnsignedShort();
		} else if (var2 == 2) { // L: 145
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 3) { // L: 146
			this.field2334 = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 147
			this.zoom2d = var1.readUnsignedShort();
		} else if (var2 == 5) { // L: 148
			this.xan2d = var1.readUnsignedShort();
		} else if (var2 == 6) { // L: 149
			this.yan2d = var1.readUnsignedShort();
		} else if (var2 == 7) { // L: 150
			this.offsetX2d = var1.readUnsignedShort(); // L: 151
			if (this.offsetX2d > 32767) { // L: 152
				this.offsetX2d -= 65536;
			}
		} else if (var2 == 8) { // L: 154
			this.offsetY2d = var1.readUnsignedShort(); // L: 155
			if (this.offsetY2d > 32767) { // L: 156
				this.offsetY2d -= 65536;
			}
		} else if (var2 == 9) { // L: 158
			var1.readStringCp1252NullTerminated(); // L: 159
		} else if (var2 == 11) { // L: 161
			this.isStackable = 1;
		} else if (var2 == 12) { // L: 162
			this.price = var1.readInt();
		} else if (var2 == 13) { // L: 163
			this.maleModel = var1.readUnsignedByte();
		} else if (var2 == 14) { // L: 164
			this.maleModel1 = var1.readUnsignedByte();
		} else if (var2 == 16) { // L: 165
			this.isMembersOnly = true;
		} else if (var2 == 23) { // L: 166
			this.femaleModel1 = var1.readUnsignedShort(); // L: 167
			this.field2333 = var1.readUnsignedByte(); // L: 168
		} else if (var2 == 24) { // L: 170
			this.field2332 = var1.readUnsignedShort();
		} else if (var2 == 25) { // L: 171
			this.field2299 = var1.readUnsignedShort(); // L: 172
			this.field2307 = var1.readUnsignedByte(); // L: 173
		} else if (var2 == 26) { // L: 175
			this.field2346 = var1.readUnsignedShort();
		} else if (var2 == 27) { // L: 176
			this.field2326 = var1.readUnsignedByte();
		} else if (var2 >= 30 && var2 < 35) { // L: 177
			this.groundActions[var2 - 30] = var1.readStringCp1252NullTerminated(); // L: 178
			if (this.groundActions[var2 - 30].equalsIgnoreCase("Hidden")) { // L: 179
				this.groundActions[var2 - 30] = null;
			}
		} else if (var2 >= 35 && var2 < 40) { // L: 181
			this.inventoryActions[var2 - 35] = var1.readStringCp1252NullTerminated();
		} else {
			int var3;
			int var4;
			if (var2 == 40) { // L: 182
				var3 = var1.readUnsignedByte(); // L: 183
				this.recolorFrom = new short[var3]; // L: 184
				this.recolorTo = new short[var3]; // L: 185

				for (var4 = 0; var4 < var3; ++var4) { // L: 186
					this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 187
					this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 188
				}
			} else if (var2 == 41) { // L: 191
				var3 = var1.readUnsignedByte(); // L: 192
				this.retextureFrom = new short[var3]; // L: 193
				this.retextureTo = new short[var3]; // L: 194

				for (var4 = 0; var4 < var3; ++var4) { // L: 195
					this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 196
					this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 197
				}
			} else if (var2 == 42) { // L: 200
				this.shiftClickIndex = var1.readByte(); // L: 201
			} else if (var2 == 65) { // L: 203
				this.isTradable = true; // L: 204
			} else if (var2 == 75) { // L: 206
				this.field2325 = var1.readShort();
			} else if (var2 == 78) { // L: 207
				this.field2311 = var1.readUnsignedShort();
			} else if (var2 == 79) { // L: 208
				this.field2338 = var1.readUnsignedShort();
			} else if (var2 == 90) {
				this.field2339 = var1.readUnsignedShort(); // L: 209
			} else if (var2 == 91) { // L: 210
				this.field2308 = var1.readUnsignedShort();
			} else if (var2 == 92) { // L: 211
				this.field2320 = var1.readUnsignedShort();
			} else if (var2 == 93) { // L: 212
				this.field2342 = var1.readUnsignedShort();
			} else if (var2 == 94) { // L: 213
				var1.readUnsignedShort(); // L: 214
			} else if (var2 == 95) { // L: 216
				this.zan2d = var1.readUnsignedShort();
			} else if (var2 == 97) { // L: 217
				this.note = var1.readUnsignedShort();
			} else if (var2 == 98) { // L: 218
				this.noteTemplate = var1.readUnsignedShort();
			} else if (var2 >= 100 && var2 < 110) { // L: 219
				if (this.countobj == null) { // L: 220
					this.countobj = new int[10]; // L: 221
					this.countco = new int[10]; // L: 222
				}

				this.countobj[var2 - 100] = var1.readUnsignedShort(); // L: 224
				this.countco[var2 - 100] = var1.readUnsignedShort(); // L: 225
			} else if (var2 == 110) { // L: 227
				this.resizeX = var1.readUnsignedShort();
			} else if (var2 == 111) { // L: 228
				this.resizeY = var1.readUnsignedShort();
			} else if (var2 == 112) { // L: 229
				this.resizeZ = var1.readUnsignedShort();
			} else if (var2 == 113) { // L: 230
				this.field2350 = var1.readByte();
			} else if (var2 == 114) { // L: 231
				this.field2337 = var1.readByte() * 5;
			} else if (var2 == 115) { // L: 232
				this.field2352 = var1.readUnsignedByte();
			} else if (var2 == 139) { // L: 233
				this.unnotedId = var1.readUnsignedShort();
			} else if (var2 == 140) { // L: 234
				this.notedId = var1.readUnsignedShort();
			} else if (var2 == 148) { // L: 235
				this.placeholder = var1.readUnsignedShort();
			} else if (var2 == 149) { // L: 236
				this.placeholderTemplate = var1.readUnsignedShort();
			} else if (var2 == 249) { // L: 237
				this.params = SecureRandomFuture.readStringIntParameters(var1, this.params);
			}
		}

	} // L: 239

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lid;Lid;I)V",
		garbageValue = "215888205"
	)
	@Export("genCert")
	void genCert(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model; // L: 242
		this.zoom2d = var1.zoom2d; // L: 243
		this.xan2d = var1.xan2d; // L: 244
		this.yan2d = var1.yan2d; // L: 245
		this.zan2d = var1.zan2d; // L: 246
		this.offsetX2d = var1.offsetX2d; // L: 247
		this.offsetY2d = var1.offsetY2d; // L: 248
		this.recolorFrom = var1.recolorFrom; // L: 249
		this.recolorTo = var1.recolorTo; // L: 250
		this.retextureFrom = var1.retextureFrom; // L: 251
		this.retextureTo = var1.retextureTo; // L: 252
		this.name = var2.name; // L: 253
		this.field2334 = "Swap this note at any bank for the equivalent item"; // L: 254
		this.isMembersOnly = var2.isMembersOnly; // L: 255
		this.price = var2.price; // L: 256
		this.isStackable = 1; // L: 257
	} // L: 258

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lid;Lid;I)V",
		garbageValue = "881834881"
	)
	@Export("genBought")
	void genBought(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model; // L: 261
		this.zoom2d = var1.zoom2d; // L: 262
		this.xan2d = var1.xan2d; // L: 263
		this.yan2d = var1.yan2d; // L: 264
		this.zan2d = var1.zan2d; // L: 265
		this.offsetX2d = var1.offsetX2d; // L: 266
		this.offsetY2d = var1.offsetY2d; // L: 267
		this.recolorFrom = var2.recolorFrom; // L: 268
		this.recolorTo = var2.recolorTo; // L: 269
		this.retextureFrom = var2.retextureFrom; // L: 270
		this.retextureTo = var2.retextureTo; // L: 271
		this.name = var2.name; // L: 272
		this.field2334 = var2.field2334; // L: 273
		this.isMembersOnly = var2.isMembersOnly; // L: 274
		this.isStackable = var2.isStackable; // L: 275
		this.maleModel = var2.maleModel; // L: 276
		this.maleModel1 = var2.maleModel1; // L: 277
		this.field2326 = var2.field2326; // L: 278
		this.femaleModel1 = var2.femaleModel1; // L: 279
		this.field2332 = var2.field2332; // L: 280
		this.field2311 = var2.field2311; // L: 281
		this.field2299 = var2.field2299; // L: 282
		this.field2346 = var2.field2346; // L: 283
		this.field2338 = var2.field2338; // L: 284
		this.field2339 = var2.field2339; // L: 285
		this.field2320 = var2.field2320; // L: 286
		this.field2308 = var2.field2308; // L: 287
		this.field2342 = var2.field2342; // L: 288
		this.field2352 = var2.field2352; // L: 289
		this.groundActions = var2.groundActions; // L: 290
		this.field2325 = var2.field2325; // L: 291
		this.inventoryActions = new String[5]; // L: 292
		if (var2.inventoryActions != null) { // L: 293
			for (int var3 = 0; var3 < 4; ++var3) {
				this.inventoryActions[var3] = var2.inventoryActions[var3];
			}
		}

		this.inventoryActions[4] = "Discard"; // L: 294
		this.price = 0; // L: 295
	} // L: 296

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lid;Lid;S)V",
		garbageValue = "16384"
	)
	@Export("genPlaceholder")
	void genPlaceholder(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model; // L: 299
		this.zoom2d = var1.zoom2d; // L: 300
		this.xan2d = var1.xan2d; // L: 301
		this.yan2d = var1.yan2d; // L: 302
		this.zan2d = var1.zan2d; // L: 303
		this.offsetX2d = var1.offsetX2d; // L: 304
		this.offsetY2d = var1.offsetY2d; // L: 305
		this.recolorFrom = var1.recolorFrom; // L: 306
		this.recolorTo = var1.recolorTo; // L: 307
		this.retextureFrom = var1.retextureFrom; // L: 308
		this.retextureTo = var1.retextureTo; // L: 309
		this.isStackable = var1.isStackable; // L: 310
		this.name = var2.name; // L: 311
		this.field2334 = var2.field2334; // L: 312
		this.price = 0; // L: 313
		this.isMembersOnly = false; // L: 314
		this.isTradable = false; // L: 315
	} // L: 316

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljj;",
		garbageValue = "100"
	)
	@Export("getModelData")
	public final ModelData getModelData(int var1) {
		int var3;
		if (this.countobj != null && var1 > 1) { // L: 319
			int var2 = -1; // L: 320

			for (var3 = 0; var3 < 10; ++var3) { // L: 321
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) { // L: 322
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) { // L: 324
				return class10.ItemComposition_get(var2).getModelData(1);
			}
		}

		ModelData var4 = ModelData.ModelData_get(WorldMapSectionType.ItemComposition_modelArchive, this.model, 0); // L: 326
		if (var4 == null) { // L: 327
			return null;
		} else {
			if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) { // L: 328
				var4.resize(this.resizeX, this.resizeY, this.resizeZ);
			}

			if (this.recolorFrom != null) { // L: 329
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) { // L: 330
					var4.recolor(this.recolorFrom[var3], this.recolorTo[var3]); // L: 331
				}
			}

			if (this.retextureFrom != null) { // L: 334
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) { // L: 335
					var4.retexture(this.retextureFrom[var3], this.retextureTo[var3]); // L: 336
				}
			}

			return var4; // L: 339
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljn;",
		garbageValue = "47"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		if (this.countobj != null && var1 > 1) { // L: 343
			int var2 = -1; // L: 344

			for (int var3 = 0; var3 < 10; ++var3) { // L: 345
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) { // L: 346
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) { // L: 348
				return class10.ItemComposition_get(var2).getModel(1);
			}
		}

		Model var5 = (Model)ItemComposition_cachedModels.get((long)this.id); // L: 350
		if (var5 != null) { // L: 351
			return var5;
		} else {
			ModelData var6 = ModelData.ModelData_get(WorldMapSectionType.ItemComposition_modelArchive, this.model, 0); // L: 352
			if (var6 == null) { // L: 353
				return null;
			} else {
				if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) { // L: 354
					var6.resize(this.resizeX, this.resizeY, this.resizeZ);
				}

				int var4;
				if (this.recolorFrom != null) { // L: 355
					for (var4 = 0; var4 < this.recolorFrom.length; ++var4) { // L: 356
						var6.recolor(this.recolorFrom[var4], this.recolorTo[var4]); // L: 357
					}
				}

				if (this.retextureFrom != null) { // L: 360
					for (var4 = 0; var4 < this.retextureFrom.length; ++var4) { // L: 361
						var6.retexture(this.retextureFrom[var4], this.retextureTo[var4]); // L: 362
					}
				}

				var5 = var6.toModel(this.field2350 + 64, this.field2337 + 768, -50, -10, -50); // L: 365
				var5.isSingleTile = true; // L: 366
				ItemComposition_cachedModels.put(var5, (long)this.id); // L: 367
				return var5; // L: 368
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Lid;",
		garbageValue = "967095729"
	)
	@Export("getCountObj")
	public ItemComposition getCountObj(int var1) {
		if (this.countobj != null && var1 > 1) { // L: 372
			int var2 = -1; // L: 373

			for (int var3 = 0; var3 < 10; ++var3) { // L: 374
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) {
					var2 = this.countobj[var3]; // L: 375
				}
			}

			if (var2 != -1) { // L: 377
				return class10.ItemComposition_get(var2);
			}
		}

		return this; // L: 379
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "851849474"
	)
	public final boolean method4141(int var1) {
		int var2 = this.femaleModel1; // L: 465
		int var3 = this.field2332; // L: 466
		int var4 = this.field2311; // L: 467
		if (var1 == 1) { // L: 468
			var2 = this.field2299; // L: 469
			var3 = this.field2346; // L: 470
			var4 = this.field2338; // L: 471
		}

		if (var2 == -1) { // L: 473
			return true;
		} else {
			boolean var5 = true; // L: 474
			if (!WorldMapSectionType.ItemComposition_modelArchive.tryLoadFile(var2, 0)) { // L: 475
				var5 = false;
			}

			if (var3 != -1 && !WorldMapSectionType.ItemComposition_modelArchive.tryLoadFile(var3, 0)) { // L: 476
				var5 = false;
			}

			if (var4 != -1 && !WorldMapSectionType.ItemComposition_modelArchive.tryLoadFile(var4, 0)) { // L: 477
				var5 = false;
			}

			return var5; // L: 478
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Ljj;",
		garbageValue = "1536981242"
	)
	public final ModelData method4142(int var1) {
		int var2 = this.femaleModel1; // L: 482
		int var3 = this.field2332; // L: 483
		int var4 = this.field2311; // L: 484
		if (var1 == 1) { // L: 485
			var2 = this.field2299; // L: 486
			var3 = this.field2346; // L: 487
			var4 = this.field2338; // L: 488
		}

		if (var2 == -1) { // L: 490
			return null;
		} else {
			ModelData var5 = ModelData.ModelData_get(WorldMapSectionType.ItemComposition_modelArchive, var2, 0); // L: 491
			if (var3 != -1) { // L: 492
				ModelData var6 = ModelData.ModelData_get(WorldMapSectionType.ItemComposition_modelArchive, var3, 0); // L: 493
				if (var4 != -1) { // L: 494
					ModelData var7 = ModelData.ModelData_get(WorldMapSectionType.ItemComposition_modelArchive, var4, 0); // L: 495
					ModelData[] var8 = new ModelData[]{var5, var6, var7}; // L: 496
					var5 = new ModelData(var8, 3); // L: 497
				} else {
					ModelData[] var10 = new ModelData[]{var5, var6}; // L: 500
					var5 = new ModelData(var10, 2); // L: 501
				}
			}

			if (var1 == 0 && this.field2333 != 0) { // L: 504
				var5.changeOffset(0, this.field2333, 0);
			}

			if (var1 == 1 && this.field2307 != 0) { // L: 505
				var5.changeOffset(0, this.field2307, 0);
			}

			int var9;
			if (this.recolorFrom != null) { // L: 506
				for (var9 = 0; var9 < this.recolorFrom.length; ++var9) { // L: 507
					var5.recolor(this.recolorFrom[var9], this.recolorTo[var9]); // L: 508
				}
			}

			if (this.retextureFrom != null) { // L: 511
				for (var9 = 0; var9 < this.retextureFrom.length; ++var9) { // L: 512
					var5.retexture(this.retextureFrom[var9], this.retextureTo[var9]); // L: 513
				}
			}

			return var5; // L: 516
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "815400903"
	)
	public final boolean method4143(int var1) {
		int var2 = this.field2339; // L: 520
		int var3 = this.field2320; // L: 521
		if (var1 == 1) { // L: 522
			var2 = this.field2308; // L: 523
			var3 = this.field2342; // L: 524
		}

		if (var2 == -1) { // L: 526
			return true;
		} else {
			boolean var4 = true; // L: 527
			if (!WorldMapSectionType.ItemComposition_modelArchive.tryLoadFile(var2, 0)) { // L: 528
				var4 = false;
			}

			if (var3 != -1 && !WorldMapSectionType.ItemComposition_modelArchive.tryLoadFile(var3, 0)) { // L: 529
				var4 = false;
			}

			return var4; // L: 530
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljj;",
		garbageValue = "-79"
	)
	public final ModelData method4162(int var1) {
		int var2 = this.field2339; // L: 534
		int var3 = this.field2320; // L: 535
		if (var1 == 1) { // L: 536
			var2 = this.field2308; // L: 537
			var3 = this.field2342; // L: 538
		}

		if (var2 == -1) { // L: 540
			return null;
		} else {
			ModelData var4 = ModelData.ModelData_get(WorldMapSectionType.ItemComposition_modelArchive, var2, 0); // L: 541
			if (var3 != -1) { // L: 542
				ModelData var5 = ModelData.ModelData_get(WorldMapSectionType.ItemComposition_modelArchive, var3, 0); // L: 543
				ModelData[] var6 = new ModelData[]{var4, var5}; // L: 544
				var4 = new ModelData(var6, 2); // L: 545
			}

			int var7;
			if (this.recolorFrom != null) { // L: 547
				for (var7 = 0; var7 < this.recolorFrom.length; ++var7) { // L: 548
					var4.recolor(this.recolorFrom[var7], this.recolorTo[var7]); // L: 549
				}
			}

			if (this.retextureFrom != null) { // L: 552
				for (var7 = 0; var7 < this.retextureFrom.length; ++var7) { // L: 553
					var4.retexture(this.retextureFrom[var7], this.retextureTo[var7]); // L: 554
				}
			}

			return var4; // L: 557
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "2030562724"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return class220.method4074(this.params, var1, var2); // L: 561
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1342151957"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class27.method400(this.params, var1, var2); // L: 565
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("getShiftClickIndex")
	public int getShiftClickIndex() {
		if (this.shiftClickIndex != -1 && this.inventoryActions != null) { // L: 569
			if (this.shiftClickIndex >= 0) { // L: 570
				return this.inventoryActions[this.shiftClickIndex] != null ? this.shiftClickIndex : -1;
			} else {
				return "Drop".equalsIgnoreCase(this.inventoryActions[4]) ? 4 : -1; // L: 571
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1925456075"
	)
	boolean method4200() {
		return this.recolorTo != null; // L: 586
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1592503972"
	)
	boolean method4149() {
		return this.retextureTo != null; // L: 590
	}

	@ObfuscatedName("me")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1432293746"
	)
	static void method4204(int var0) {
		Message.tempMenuAction = new MenuAction(); // L: 12227
		Message.tempMenuAction.param0 = Client.menuArguments1[var0]; // L: 12228
		Message.tempMenuAction.param1 = Client.menuArguments2[var0]; // L: 12229
		Message.tempMenuAction.opcode = Client.menuOpcodes[var0]; // L: 12230
		Message.tempMenuAction.identifier = Client.menuIdentifiers[var0]; // L: 12231
		Message.tempMenuAction.field916 = Client.field602[var0]; // L: 12232
		Message.tempMenuAction.field913 = Client.menuActions[var0]; // L: 12233
		Message.tempMenuAction.field918 = Client.menuTargets[var0]; // L: 12234
	} // L: 12235
}
