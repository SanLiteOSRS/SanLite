import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gx")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("HealthBarDefinition_archive")
	public static AbstractArchive HealthBarDefinition_archive;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	public static AbstractArchive field1907;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("NpcDefinition_cachedModels")
	static EvictingDualNodeHashTable NpcDefinition_cachedModels;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("HealthBarDefinition_cachedSprites")
	static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites;
	@ObfuscatedName("cl")
	static String field1922;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1015482233
	)
	public int field1918;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 756684733
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -996817695
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1625059327
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -511346999
	)
	public int field1916;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1037048411
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1008869491
	)
	@Export("frontSpriteID")
	int frontSpriteID;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1548634487
	)
	@Export("backSpriteID")
	int backSpriteID;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -975761697
	)
	@Export("width")
	public int width;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1963578483
	)
	@Export("widthPadding")
	public int widthPadding;

	static {
		NpcDefinition_cachedModels = new EvictingDualNodeHashTable(64); // L: 14
		HealthBarDefinition_cachedSprites = new EvictingDualNodeHashTable(64); // L: 15
	}

	HealthBarDefinition() {
		this.int1 = 255; // L: 19
		this.int2 = 255; // L: 20
		this.int3 = -1; // L: 21
		this.field1916 = 1; // L: 22
		this.int5 = 70; // L: 23
		this.frontSpriteID = -1; // L: 24
		this.backSpriteID = -1; // L: 25
		this.width = 30; // L: 26
		this.widthPadding = 0; // L: 27
	} // L: 29

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "-63873767"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 46
			if (var2 == 0) { // L: 47
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Luq;II)V",
		garbageValue = "2094699463"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			var1.readUnsignedShort(); // L: 54
		} else if (var2 == 2) { // L: 56
			this.int1 = var1.readUnsignedByte();
		} else if (var2 == 3) {
			this.int2 = var1.readUnsignedByte();
		} else if (var2 == 4) { // L: 58
			this.int3 = 0;
		} else if (var2 == 5) {
			this.int5 = var1.readUnsignedShort();
		} else if (var2 == 6) { // L: 60
			var1.readUnsignedByte(); // L: 61
		} else if (var2 == 7) {
			this.frontSpriteID = var1.method9693();
		} else if (var2 == 8) { // L: 64
			this.backSpriteID = var1.method9693();
		} else if (var2 == 11) {
			this.int3 = var1.readUnsignedShort(); // L: 65
		} else if (var2 == 14) { // L: 66
			this.width = var1.readUnsignedByte();
		} else if (var2 == 15) {
			this.widthPadding = var1.readUnsignedByte();
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Lvd;",
		garbageValue = "-50741515"
	)
	@Export("getFrontSprite")
	public SpritePixels getFrontSprite() {
		if (this.frontSpriteID < 0) { // L: 72
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.frontSpriteID);
			if (var1 != null) {
				return var1; // L: 74
			} else {
				var1 = FileSystem.SpriteBuffer_getSprite(field1907, this.frontSpriteID, 0); // L: 75
				if (var1 != null) { // L: 76
					HealthBarDefinition_cachedSprites.put(var1, (long)this.frontSpriteID);
				}

				return var1; // L: 78
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Lvd;",
		garbageValue = "-885015404"
	)
	public SpritePixels method3642() {
		if (this.backSpriteID < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.backSpriteID);
			if (var1 != null) {
				return var1;
			} else {
				var1 = FileSystem.SpriteBuffer_getSprite(field1907, this.backSpriteID, 0); // L: 85
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.backSpriteID); // L: 86
				}

				return var1; // L: 88
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Lte;I)Ljava/lang/String;",
		garbageValue = "-1625455498"
	)
	public static String method3645(CharSequence var0, LoginType var1) {
		if (var0 == null) { // L: 48
			return null;
		} else {
			int var2 = 0; // L: 49

			int var3;
			boolean var4;
			char var5;
			for (var3 = var0.length(); var2 < var3; ++var2) { // L: 50 53 63
				var5 = var0.charAt(var2); // L: 55
				var4 = var5 == 160 || var5 == ' ' || var5 == '_' || var5 == '-'; // L: 57
				if (!var4) { // L: 59
					break;
				}
			}

			while (var3 > var2) { // L: 67
				var5 = var0.charAt(var3 - 1); // L: 69
				var4 = var5 == 160 || var5 == ' ' || var5 == '_' || var5 == '-'; // L: 71
				if (!var4) { // L: 73
					break;
				}

				--var3; // L: 77
			}

			int var11 = var3 - var2; // L: 79
			if (var11 >= 1 && var11 <= class75.method2120(var1)) { // L: 80
				StringBuilder var10 = new StringBuilder(var11); // L: 81

				for (int var6 = var2; var6 < var3; ++var6) { // L: 82
					char var7 = var0.charAt(var6); // L: 83
					if (ObjectSound.method1947(var7)) { // L: 84
						char var8;
						switch(var7) { // L: 87
						case ' ':
						case '-':
						case '_':
						case ' ':
							var8 = '_'; // L: 159
							break; // L: 160
						case '#':
						case '[':
						case ']':
							var8 = var7; // L: 111
							break; // L: 112
						case 'À':
						case 'Á':
						case 'Â':
						case 'Ã':
						case 'Ä':
						case 'à':
						case 'á':
						case 'â':
						case 'ã':
						case 'ä':
							var8 = 'a'; // L: 153
							break; // L: 154
						case 'Ç':
						case 'ç':
							var8 = 'c'; // L: 167
							break;
						case 'È':
						case 'É':
						case 'Ê':
						case 'Ë':
						case 'è':
						case 'é':
						case 'ê':
						case 'ë':
							var8 = 'e'; // L: 121
							break; // L: 122
						case 'Í':
						case 'Î':
						case 'Ï':
						case 'í':
						case 'î':
						case 'ï':
							var8 = 'i'; // L: 141
							break; // L: 142
						case 'Ñ':
						case 'ñ':
							var8 = 'n'; // L: 106
							break; // L: 107
						case 'Ò':
						case 'Ó':
						case 'Ô':
						case 'Õ':
						case 'Ö':
						case 'ò':
						case 'ó':
						case 'ô':
						case 'õ':
						case 'ö':
							var8 = 'o'; // L: 133
							break; // L: 134
						case 'Ù':
						case 'Ú':
						case 'Û':
						case 'Ü':
						case 'ù':
						case 'ú':
						case 'û':
						case 'ü':
							var8 = 'u'; // L: 96
							break;
						case 'ß':
							var8 = 'b'; // L: 99
							break; // L: 100
						case 'ÿ':
						case 'Ÿ':
							var8 = 'y'; // L: 163
							break; // L: 164
						default:
							var8 = Character.toLowerCase(var7); // L: 102
						}

						if (var8 != 0) { // L: 172
							var10.append(var8); // L: 173
						}
					}
				}

				if (var10.length() == 0) { // L: 175
					return null;
				} else {
					return var10.toString(); // L: 176
				}
			} else {
				return null;
			}
		}
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(Llq;I)V",
		garbageValue = "-694290164"
	)
	static final void method3657(class311 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer; // L: 8186
		int var2;
		int var4;
		int var5;
		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		int var14;
		if (class311.field3285 == var0) { // L: 8187
			var2 = var1.method9636(); // L: 8188
			byte var3 = var1.readByte(); // L: 8189
			var4 = var1.method9703(); // L: 8190
			var5 = var1.readUnsignedShort(); // L: 8191
			byte var6 = var1.method9509(); // L: 8192
			var7 = var1.method9579(); // L: 8193
			var8 = var7 >> 2; // L: 8194
			var9 = var7 & 3; // L: 8195
			var10 = Client.field602[var8]; // L: 8196
			var11 = var1.method9506(); // L: 8197
			var12 = (var11 >> 4 & 7) + JagexCache.field2329; // L: 8198
			var13 = (var11 & 7) + class4.field3; // L: 8199
			var14 = var1.method9703(); // L: 8200
			byte var15 = var1.method9510(); // L: 8201
			byte var16 = var1.method9510(); // L: 8202
			Player var17;
			if (var5 == Client.localPlayerIndex) { // L: 8204
				var17 = VarpDefinition.localPlayer;
			} else {
				var17 = Client.players[var5]; // L: 8205
			}

			if (var17 != null) { // L: 8206
				int var18 = Client.field831 == -1 ? class473.Client_plane : Client.field831; // L: 8207
				class388.method7327(var18, var12, var13, var8, var9, var10, var2, var4, var14, var16, var6, var3, var15, var17); // L: 8208
			}
		}

		int var20;
		int var21;
		if (class311.field3275 == var0) { // L: 8211
			var2 = var1.method9506(); // L: 8212
			var20 = (var2 >> 4 & 7) + JagexCache.field2329; // L: 8213
			var4 = (var2 & 7) + class4.field3; // L: 8214
			var5 = var1.method9506(); // L: 8215
			var21 = var1.method9703(); // L: 8216
			if (var20 >= 0 && var4 >= 0 && var20 < 104 && var4 < 104) { // L: 8217
				var7 = Client.field831 == -1 ? class473.Client_plane : Client.field831; // L: 8218
				ApproximateRouteStrategy.method1185(var7, var20, var4, var21, var5); // L: 8219
			}

		} else if (class311.field3280 == var0) { // L: 8223
			var2 = var1.readUnsignedByte(); // L: 8224
			var20 = (var2 >> 4 & 7) + JagexCache.field2329; // L: 8225
			var4 = (var2 & 7) + class4.field3; // L: 8226
			var5 = var1.readUnsignedShort(); // L: 8227
			var21 = var1.readUnsignedByte(); // L: 8228
			var7 = var1.method9506(); // L: 8229
			var8 = var7 >> 4 & 15; // L: 8230
			var9 = var7 & 7; // L: 8231
			if (var20 >= 0 && var4 >= 0 && var20 < 104 && var4 < 104) { // L: 8232
				var10 = var8 + 1; // L: 8233
				if (VarpDefinition.localPlayer.pathX[0] >= var20 - var10 && VarpDefinition.localPlayer.pathX[0] <= var20 + var10 && VarpDefinition.localPlayer.pathY[0] >= var4 - var10 && VarpDefinition.localPlayer.pathY[0] <= var10 + var4 && class30.clientPreferences.method2572() != 0 && var9 > 0 && Client.soundEffectCount < 50) { // L: 8234 8235
					Client.soundEffectIds[Client.soundEffectCount] = var5; // L: 8236
					Client.queuedSoundEffectLoops[Client.soundEffectCount] = var9; // L: 8237
					Client.queuedSoundEffectDelays[Client.soundEffectCount] = var21; // L: 8238
					Client.soundEffects[Client.soundEffectCount] = null; // L: 8239
					Client.soundLocations[Client.soundEffectCount] = var8 + (var4 << 8) + (var20 << 16); // L: 8240
					Client.field554[Client.soundEffectCount] = 0; // L: 8241
					++Client.soundEffectCount; // L: 8242
				}
			}

		} else if (class311.field3277 == var0) { // L: 8248
			var2 = var1.readUnsignedByte(); // L: 8249
			var20 = var1.method9492(); // L: 8250
			var4 = var1.readUnsignedByte(); // L: 8251
			var5 = var1.readUnsignedByte(); // L: 8252
			var21 = var1.method9579(); // L: 8253
			var7 = (var21 >> 4 & 7) + JagexCache.field2329; // L: 8254
			var8 = (var21 & 7) + class4.field3; // L: 8255
			var9 = var1.method9579() & 31; // L: 8256
			if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) { // L: 8257
				var10 = var9 + 1; // L: 8258
				if (VarpDefinition.localPlayer.pathX[0] >= var7 - var10 && VarpDefinition.localPlayer.pathX[0] <= var7 + var10 && VarpDefinition.localPlayer.pathY[0] >= var8 - var10 && VarpDefinition.localPlayer.pathY[0] <= var10 + var8 && class30.clientPreferences.method2572() != 0 && var4 > 0 && Client.soundEffectCount < 50) { // L: 8259 8260
					Client.soundEffectIds[Client.soundEffectCount] = var20; // L: 8261
					Client.soundEffects[Client.soundEffectCount] = null; // L: 8262
					Client.soundLocations[Client.soundEffectCount] = var9 + (var8 << 8) + (var7 << 16); // L: 8263
					Client.queuedSoundEffectLoops[Client.soundEffectCount] = var4; // L: 8264
					Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2; // L: 8265
					Client.field554[Client.soundEffectCount] = var5; // L: 8266
					++Client.soundEffectCount; // L: 8267
				}
			}

		} else if (class311.field3279 == var0) { // L: 8273
			var2 = var1.method9585(); // L: 8274
			var20 = var1.method9605(); // L: 8275
			var4 = (var20 >> 4 & 7) + JagexCache.field2329; // L: 8276
			var5 = (var20 & 7) + class4.field3; // L: 8277
			var21 = var1.method9530(); // L: 8278
			var7 = var1.method9636(); // L: 8279
			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) { // L: 8280
				var8 = Client.field831 == -1 ? class473.Client_plane : Client.field831; // L: 8281
				GraphicsObject.method2114(var8, var4, var5, var7, var21, var2); // L: 8282
			}

		} else if (class311.field3278 == var0) { // L: 8286
			var2 = var1.method9605(); // L: 8287
			var20 = var2 >> 2; // L: 8288
			var4 = var2 & 3; // L: 8289
			var5 = Client.field602[var20]; // L: 8290
			var21 = var1.method9605(); // L: 8291
			var7 = (var21 >> 4 & 7) + JagexCache.field2329; // L: 8292
			var8 = (var21 & 7) + class4.field3; // L: 8293
			if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) { // L: 8294
				var9 = Client.field831 == -1 ? class473.Client_plane : Client.field831; // L: 8295
				class91.method2381(var9, var7, var8, var5, -1, var20, var4, 31, 0, -1); // L: 8296
			}

		} else if (class311.field3276 == var0) { // L: 8300
			var2 = var1.method9506(); // L: 8301
			var20 = var1.readUnsignedShort(); // L: 8302
			var4 = var1.method9506(); // L: 8303
			var5 = (var4 >> 4 & 7) + JagexCache.field2329; // L: 8304
			var21 = (var4 & 7) + class4.field3; // L: 8305
			var7 = var1.readUnsignedShort(); // L: 8306
			if (var5 >= 0 && var21 >= 0 && var5 < 104 && var21 < 104) { // L: 8307
				var5 = var5 * 128 + 64; // L: 8308
				var21 = var21 * 128 + 64; // L: 8309
				var8 = Client.field831 == -1 ? class473.Client_plane : Client.field831; // L: 8310
				GraphicsObject var19 = new GraphicsObject(var7, var8, var5, var21, class272.getTileHeight(var5, var21, var8) - var2, var20, Client.cycle); // L: 8311
				Client.graphicsObjects.addFirst(var19); // L: 8312
			}

		} else if (class311.field3282 == var0) { // L: 8316
			var2 = var1.method9579(); // L: 8317
			var20 = (var2 >> 4 & 7) + JagexCache.field2329; // L: 8318
			var4 = (var2 & 7) + class4.field3; // L: 8319
			var5 = var1.method9636(); // L: 8320
			var21 = var1.method9492(); // L: 8321
			var7 = var1.method9605(); // L: 8322
			var8 = var1.method9524(); // L: 8323
			var9 = var1.readUnsignedByte() * 4; // L: 8324
			byte var23 = var1.readByte(); // L: 8325
			var11 = var1.method9524(); // L: 8326
			var12 = var1.readUnsignedByte() * 4; // L: 8327
			byte var25 = var1.method9509(); // L: 8328
			var14 = var1.method9636(); // L: 8329
			int var26 = var1.method9492(); // L: 8330
			var13 = var25 + var20; // L: 8331
			var10 = var23 + var4; // L: 8332
			if (var20 >= 0 && var4 >= 0 && var20 < 104 && var4 < 104 && var13 >= 0 && var10 >= 0 && var13 < 104 && var10 < 104 && var26 != 65535) { // L: 8333
				int var27 = Client.field831 == -1 ? class473.Client_plane : Client.field831; // L: 8334
				SoundCache.method832(var27, var20, var4, var13, var10, var11, var26, var9, var12, var14, var21, var7, var5, var8); // L: 8335
			}

		} else if (class311.field3287 == var0) { // L: 8339
			var2 = var1.method9579(); // L: 8340
			var20 = (var2 >> 4 & 7) + JagexCache.field2329; // L: 8341
			var4 = (var2 & 7) + class4.field3; // L: 8342
			var5 = var1.readUnsignedShort(); // L: 8343
			var21 = var1.readInt(); // L: 8344
			if (var20 >= 0 && var4 >= 0 && var20 < 104 && var4 < 104) { // L: 8345
				var7 = Client.field831 == -1 ? class473.Client_plane : Client.field831; // L: 8346
				class360.method6993(var7, var20, var4, var5, var21); // L: 8347
			}

		} else if (class311.field3286 == var0) { // L: 8351
			var2 = var1.method9579(); // L: 8352
			var20 = var1.method9636(); // L: 8353
			var4 = var1.method9506(); // L: 8354
			var5 = var4 >> 2; // L: 8355
			var21 = var4 & 3; // L: 8356
			var7 = Client.field602[var5]; // L: 8357
			var8 = var1.method9579(); // L: 8358
			var9 = (var8 >> 4 & 7) + JagexCache.field2329; // L: 8359
			var10 = (var8 & 7) + class4.field3; // L: 8360
			if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104) { // L: 8361
				var11 = Client.field831 == -1 ? class473.Client_plane : Client.field831; // L: 8362
				class91.method2381(var11, var9, var10, var7, var20, var5, var21, var2, 0, -1); // L: 8363
			}

		} else if (class311.field3281 == var0) { // L: 8367
			var2 = var1.method9605(); // L: 8368
			var20 = var1.method9636(); // L: 8369
			var4 = var1.method9579(); // L: 8370
			var5 = (var4 >> 4 & 7) + JagexCache.field2329; // L: 8371
			var21 = (var4 & 7) + class4.field3; // L: 8372
			var7 = var1.method9605(); // L: 8373
			var8 = var1.readUnsignedShort(); // L: 8374
			boolean var22 = var1.method9579() == 1; // L: 8375
			var10 = var1.readUnsignedShort(); // L: 8376
			var11 = var1.readInt(); // L: 8377
			if (var5 >= 0 && var21 >= 0 && var5 < 104 && var21 < 104) { // L: 8378
				var12 = Client.field831 == -1 ? class473.Client_plane : Client.field831; // L: 8379
				class151.method3280(var12, var5, var21, var8, var11, var2, var10, var20, var7, var22); // L: 8380
			}

		} else if (class311.field3284 == var0) { // L: 8384
			var2 = var1.method9703(); // L: 8385
			var20 = var1.readUnsignedByte(); // L: 8386
			var4 = var20 >> 2; // L: 8387
			var5 = var20 & 3; // L: 8388
			var21 = Client.field602[var4]; // L: 8389
			var7 = var1.method9579(); // L: 8390
			var8 = (var7 >> 4 & 7) + JagexCache.field2329; // L: 8391
			var9 = (var7 & 7) + class4.field3; // L: 8392
			if (var8 >= 0 && var9 >= 0 && var8 < 103 && var9 < 103) { // L: 8393
				var10 = Client.field831 == -1 ? class473.Client_plane : Client.field831; // L: 8394
				boolean var24 = class170.method3523(var10, var8, var9, var4, var5, var21, var2); // L: 8395
				if (var24) { // L: 8396
					return; // L: 8397
				}

				Fonts.method9105(var10, var8, var9, var21, var2); // L: 8399
			}

		}
	} // L: 8221 8246 8271 8284 8298 8314 8337 8349 8365 8382 8401 8403
}
