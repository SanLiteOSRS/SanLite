import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hz")
@Implements("KitDefinition")
public class KitDefinition extends DualNode {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("KitDefinition_archive")
	public static AbstractArchive KitDefinition_archive;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("KitDefinition_modelsArchive")
	public static AbstractArchive KitDefinition_modelsArchive;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 2017127235
	)
	public static int field1980;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("KitDefinition_cached")
	static EvictingDualNodeHashTable KitDefinition_cached;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -194305975
	)
	@Export("bodypartID")
	public int bodypartID;
	@ObfuscatedName("ai")
	@Export("models2")
	int[] models2;
	@ObfuscatedName("az")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("ap")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("aa")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("af")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("ad")
	@Export("models")
	int[] models;
	@ObfuscatedName("aq")
	@Export("nonSelectable")
	public boolean nonSelectable;

	static {
		KitDefinition_cached = new EvictingDualNodeHashTable(64); // L: 14
	}

	KitDefinition() {
		this.bodypartID = -1; // L: 15
		this.models = new int[]{-1, -1, -1, -1, -1}; // L: 21
		this.nonSelectable = false; // L: 22
	} // L: 26

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ltm;B)V",
		garbageValue = "-6"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 40
			if (var2 == 0) { // L: 41
				return; // L: 44
			}

			this.decodeNext(var1, var2); // L: 42
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ltm;II)V",
		garbageValue = "-1997251998"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 47
			this.bodypartID = var1.readUnsignedByte();
		} else {
			int var3;
			int var4;
			if (var2 == 2) { // L: 48
				var3 = var1.readUnsignedByte(); // L: 49
				this.models2 = new int[var3]; // L: 50

				for (var4 = 0; var4 < var3; ++var4) { // L: 51
					this.models2[var4] = var1.readUnsignedShort();
				}
			} else if (var2 == 3) { // L: 53
				this.nonSelectable = true;
			} else if (var2 == 40) { // L: 54
				var3 = var1.readUnsignedByte(); // L: 55
				this.recolorFrom = new short[var3]; // L: 56
				this.recolorTo = new short[var3]; // L: 57

				for (var4 = 0; var4 < var3; ++var4) { // L: 58
					this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 59
					this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 60
				}
			} else if (var2 == 41) { // L: 63
				var3 = var1.readUnsignedByte(); // L: 64
				this.retextureFrom = new short[var3]; // L: 65
				this.retextureTo = new short[var3]; // L: 66

				for (var4 = 0; var4 < var3; ++var4) { // L: 67
					this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 68
					this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 69
				}
			} else if (var2 >= 60 && var2 < 70) { // L: 72
				this.models[var2 - 60] = var1.readUnsignedShort();
			}
		}

	} // L: 74

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1590063702"
	)
	@Export("ready")
	public boolean ready() {
		if (this.models2 == null) { // L: 77
			return true;
		} else {
			boolean var1 = true; // L: 78

			for (int var2 = 0; var2 < this.models2.length; ++var2) { // L: 79
				if (!KitDefinition_modelsArchive.tryLoadFile(this.models2[var2], 0)) {
					var1 = false;
				}
			}

			return var1; // L: 80
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Lic;",
		garbageValue = "-23"
	)
	@Export("getModelData")
	public ModelData getModelData() {
		if (this.models2 == null) { // L: 84
			return null;
		} else {
			ModelData[] var1 = new ModelData[this.models2.length]; // L: 85

			for (int var2 = 0; var2 < this.models2.length; ++var2) { // L: 86
				var1[var2] = ModelData.ModelData_get(KitDefinition_modelsArchive, this.models2[var2], 0);
			}

			ModelData var4;
			if (var1.length == 1) { // L: 88
				var4 = var1[0];
			} else {
				var4 = new ModelData(var1, var1.length); // L: 89
			}

			int var3;
			if (this.recolorFrom != null) { // L: 90
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) { // L: 91
					var4.recolor(this.recolorFrom[var3], this.recolorTo[var3]); // L: 92
				}
			}

			if (this.retextureFrom != null) { // L: 95
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) { // L: 96
					var4.retexture(this.retextureFrom[var3], this.retextureTo[var3]); // L: 97
				}
			}

			return var4; // L: 100
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2117319302"
	)
	public boolean method3637() {
		boolean var1 = true; // L: 104

		for (int var2 = 0; var2 < 5; ++var2) { // L: 105
			if (this.models[var2] != -1 && !KitDefinition_modelsArchive.tryLoadFile(this.models[var2], 0)) { // L: 106
				var1 = false;
			}
		}

		return var1; // L: 108
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lic;",
		garbageValue = "-1595711476"
	)
	@Export("getKitDefinitionModels")
	public ModelData getKitDefinitionModels() {
		ModelData[] var1 = new ModelData[5]; // L: 112
		int var2 = 0; // L: 113

		for (int var3 = 0; var3 < 5; ++var3) { // L: 114
			if (this.models[var3] != -1) { // L: 115
				var1[var2++] = ModelData.ModelData_get(KitDefinition_modelsArchive, this.models[var3], 0);
			}
		}

		ModelData var5 = new ModelData(var1, var2); // L: 117
		int var4;
		if (this.recolorFrom != null) { // L: 118
			for (var4 = 0; var4 < this.recolorFrom.length; ++var4) { // L: 119
				var5.recolor(this.recolorFrom[var4], this.recolorTo[var4]); // L: 120
			}
		}

		if (this.retextureFrom != null) { // L: 123
			for (var4 = 0; var4 < this.retextureFrom.length; ++var4) { // L: 124
				var5.retexture(this.retextureFrom[var4], this.retextureTo[var4]); // L: 125
			}
		}

		return var5; // L: 128
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lto;IB)Z",
		garbageValue = "-108"
	)
	@Export("updateExternalPlayer")
	static boolean updateExternalPlayer(PacketBuffer var0, int var1) {
		int var2 = var0.readBits(2); // L: 369
		int var3;
		int var4;
		int var7;
		int var8;
		int var9;
		int var10;
		if (var2 == 0) { // L: 370
			if (var0.readBits(1) != 0) { // L: 371
				updateExternalPlayer(var0, var1);
			}

			var3 = var0.readBits(13); // L: 372
			var4 = var0.readBits(13); // L: 373
			boolean var12 = var0.readBits(1) == 1; // L: 374
			if (var12) { // L: 375
				Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
			}

			if (Client.players[var1] != null) { // L: 376
				throw new RuntimeException(); // L: 377
			} else {
				Player var11 = Client.players[var1] = new Player(); // L: 379
				var11.index = var1; // L: 380
				if (Players.field1388[var1] != null) { // L: 381
					var11.read(Players.field1388[var1]);
				}

				var11.orientation = Players.Players_orientations[var1]; // L: 382
				var11.targetIndex = Players.Players_targetIndices[var1]; // L: 383
				var7 = Players.Players_regions[var1]; // L: 384
				var8 = var7 >> 28; // L: 385
				var9 = var7 >> 14 & 255; // L: 386
				var10 = var7 & 255; // L: 387
				var11.pathTraversed[0] = Players.field1377[var1]; // L: 388
				var11.plane = (byte)var8; // L: 389
				var11.resetPath((var9 << 13) + var3 - UrlRequester.baseX * 64, (var10 << 13) + var4 - class47.baseY * 64); // L: 390
				var11.field1154 = false; // L: 391
				return true; // L: 392
			}
		} else if (var2 == 1) { // L: 394
			var3 = var0.readBits(2); // L: 395
			var4 = Players.Players_regions[var1]; // L: 396
			Players.Players_regions[var1] = (((var4 >> 28) + var3 & 3) << 28) + (var4 & 268435455); // L: 397
			return false; // L: 398
		} else {
			int var5;
			int var6;
			if (var2 == 2) { // L: 400
				var3 = var0.readBits(5); // L: 401
				var4 = var3 >> 3; // L: 402
				var5 = var3 & 7; // L: 403
				var6 = Players.Players_regions[var1]; // L: 404
				var7 = (var6 >> 28) + var4 & 3; // L: 405
				var8 = var6 >> 14 & 255; // L: 406
				var9 = var6 & 255; // L: 407
				if (var5 == 0) { // L: 408
					--var8; // L: 409
					--var9; // L: 410
				}

				if (var5 == 1) { // L: 412
					--var9;
				}

				if (var5 == 2) { // L: 413
					++var8; // L: 414
					--var9; // L: 415
				}

				if (var5 == 3) { // L: 417
					--var8;
				}

				if (var5 == 4) { // L: 418
					++var8;
				}

				if (var5 == 5) { // L: 419
					--var8; // L: 420
					++var9; // L: 421
				}

				if (var5 == 6) { // L: 423
					++var9;
				}

				if (var5 == 7) { // L: 424
					++var8; // L: 425
					++var9; // L: 426
				}

				Players.Players_regions[var1] = (var8 << 14) + var9 + (var7 << 28); // L: 428
				return false; // L: 429
			} else {
				var3 = var0.readBits(18); // L: 431
				var4 = var3 >> 16; // L: 432
				var5 = var3 >> 8 & 255; // L: 433
				var6 = var3 & 255; // L: 434
				var7 = Players.Players_regions[var1]; // L: 435
				var8 = (var7 >> 28) + var4 & 3; // L: 436
				var9 = var5 + (var7 >> 14) & 255; // L: 437
				var10 = var7 + var6 & 255; // L: 438
				Players.Players_regions[var1] = (var9 << 14) + var10 + (var8 << 28); // L: 439
				return false; // L: 440
			}
		}
	}
}
