import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("am")
public class class18 {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1093766555
	)
	static int field94;
	@ObfuscatedName("bc")
	static String field97;
	@ObfuscatedName("af")
	Future field99;
	@ObfuscatedName("an")
	String field95;

	class18(Future var1) {
		this.field99 = var1; // L: 10
	} // L: 11

	class18(String var1) {
		this.method267(var1); // L: 14
	} // L: 15

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-898122072"
	)
	void method267(String var1) {
		if (var1 == null) { // L: 18
			var1 = "";
		}

		this.field95 = var1; // L: 19
		if (this.field99 != null) { // L: 20
			this.field99.cancel(true); // L: 21
			this.field99 = null; // L: 22
		}

	} // L: 24

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1876642692"
	)
	public final String method268() {
		return this.field95; // L: 27
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "58"
	)
	public boolean method266() {
		return this.field95 != null || this.field99 == null; // L: 31
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2084770197"
	)
	public final boolean method269() {
		return this.method266() ? true : this.field99.isDone(); // L: 35 36
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Laj;",
		garbageValue = "-1834092679"
	)
	public final class20 method270() {
		if (this.method266()) { // L: 40
			return new class20(this.field95);
		} else if (!this.method269()) {
			return null;
		} else {
			try {
				return (class20)this.field99.get();
			} catch (Exception var3) {
				String var2 = "Error retrieving REST request reply";
				System.err.println(var2 + "\r\n" + var3);
				this.method267(var2); // L: 48
				return new class20(var2); // L: 49
			}
		}
	}

	@ObfuscatedName("an")
	public static void method285(double var0) {
		class7.Rasterizer3D_buildPalette(var0, 0, 512);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-254097069"
	)
	static void method283() {
		for (ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var0.obj != null) {
				var0.set();
			}
		}

	} // L: 47

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-440671694"
	)
	public static int method289(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765); // L: 41
		var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459); // L: 42
		var0 = var0 + (var0 >>> 4) & 252645135; // L: 43
		var0 += var0 >>> 8; // L: 44
		var0 += var0 >>> 16; // L: 45
		return var0 & 255; // L: 46
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "777395555"
	)
	static String method287() {
		return class20.clientPreferences.method2450() ? WorldMapDecorationType.method6573(Login.Login_username) : Login.Login_username; // L: 260
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1601417771"
	)
	public static void method271() {
		int var0 = Rasterizer2D.Rasterizer2D_xClipStart; // L: 137
		int var1 = Rasterizer2D.Rasterizer2D_yClipStart; // L: 138
		int var2 = Rasterizer2D.Rasterizer2D_xClipEnd; // L: 139
		int var3 = Rasterizer2D.Rasterizer2D_yClipEnd; // L: 140
		Rasterizer3D.field2514.field2797 = var2 - var0; // L: 142
		Rasterizer3D.field2514.field2796 = var3 - var1; // L: 143
		Tiles.method2221(); // L: 144
		if (Rasterizer3D.field2514.Rasterizer3D_rowOffsets.length < Rasterizer3D.field2514.field2796) { // L: 145
			Rasterizer3D.field2514.Rasterizer3D_rowOffsets = new int[class70.method2044(Rasterizer3D.field2514.field2796)]; // L: 146
		}

		int var4 = var0 + var1 * Rasterizer2D.Rasterizer2D_width; // L: 148

		for (int var5 = 0; var5 < Rasterizer3D.field2514.field2796; ++var5) { // L: 149
			Rasterizer3D.field2514.Rasterizer3D_rowOffsets[var5] = var4; // L: 150
			var4 += Rasterizer2D.Rasterizer2D_width; // L: 151
		}

	} // L: 154

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2013158329"
	)
	public static void method288() {
		Widget.Widget_cachedSprites.clear(); // L: 724
		Widget.Widget_cachedModels.clear(); // L: 725
		Widget.Widget_cachedFonts.clear(); // L: 726
		Widget.Widget_cachedSpriteMasks.clear(); // L: 727
	} // L: 728

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ILch;ZI)I",
		garbageValue = "995876193"
	)
	static int method272(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) { // L: 3381
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3382
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type(); // L: 3383
			return 1; // L: 3384
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) { // L: 3386
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3387
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id; // L: 3388
			return 1; // L: 3389
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) { // L: 3391
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3392
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice; // L: 3393
			return 1; // L: 3394
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) { // L: 3396
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3397
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity; // L: 3398
			return 1; // L: 3399
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) { // L: 3401
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3402
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity; // L: 3403
			return 1; // L: 3404
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) { // L: 3406
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3407
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice; // L: 3408
			return 1; // L: 3409
		} else {
			int var13;
			if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) { // L: 3411
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3412
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3413
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 0 ? 1 : 0; // L: 3414
				return 1; // L: 3415
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) { // L: 3417
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3418
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3419
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 2 ? 1 : 0; // L: 3420
				return 1; // L: 3421
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) { // L: 3423
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3424
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3425
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 5 ? 1 : 0; // L: 3426
				return 1; // L: 3427
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) { // L: 3429
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3430
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3431
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 1 ? 1 : 0; // L: 3432
				return 1; // L: 3433
			} else {
				boolean var12;
				if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) { // L: 3435
					var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3436
					if (class375.grandExchangeEvents != null) { // L: 3437
						class375.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var12); // L: 3438
					}

					return 1; // L: 3440
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) { // L: 3442
					var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3443
					if (class375.grandExchangeEvents != null) { // L: 3444
						class375.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var12); // L: 3445
					}

					return 1; // L: 3447
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) { // L: 3449
					Interpreter.Interpreter_intStackSize -= 2; // L: 3450
					var12 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] == 1; // L: 3451
					boolean var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 3452
					if (class375.grandExchangeEvents != null) { // L: 3453
						Client.GrandExchangeEvents_worldComparator.filterWorlds = var11; // L: 3454
						class375.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var12); // L: 3455
					}

					return 1; // L: 3457
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) { // L: 3459
					var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3460
					if (class375.grandExchangeEvents != null) { // L: 3461
						class375.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var12); // L: 3462
					}

					return 1; // L: 3464
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) { // L: 3466
					var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3467
					if (class375.grandExchangeEvents != null) { // L: 3468
						class375.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var12); // L: 3469
					}

					return 1; // L: 3471
				} else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) { // L: 3473
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class375.grandExchangeEvents == null ? 0 : class375.grandExchangeEvents.events.size(); // L: 3474
					return 1; // L: 3475
				} else {
					GrandExchangeEvent var4;
					if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) { // L: 3477
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3478
						var4 = (GrandExchangeEvent)class375.grandExchangeEvents.events.get(var3); // L: 3479
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.world; // L: 3480
						return 1; // L: 3481
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) { // L: 3483
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3484
						var4 = (GrandExchangeEvent)class375.grandExchangeEvents.events.get(var3); // L: 3485
						Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var4.getOfferName(); // L: 3486
						return 1; // L: 3487
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) { // L: 3489
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3490
						var4 = (GrandExchangeEvent)class375.grandExchangeEvents.events.get(var3); // L: 3491
						Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var4.getPreviousOfferName(); // L: 3492
						return 1; // L: 3493
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) { // L: 3495
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3496
						var4 = (GrandExchangeEvent)class375.grandExchangeEvents.events.get(var3); // L: 3497
						long var5 = class96.method2634() - class323.field3740 - var4.age; // L: 3498
						int var7 = (int)(var5 / 3600000L); // L: 3499
						int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L); // L: 3500
						int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * 60000)) / 1000L); // L: 3501
						String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10; // L: 3502
						Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var10; // L: 3503
						return 1; // L: 3504
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) { // L: 3506
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3507
						var4 = (GrandExchangeEvent)class375.grandExchangeEvents.events.get(var3); // L: 3508
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.totalQuantity; // L: 3509
						return 1; // L: 3510
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) { // L: 3512
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3513
						var4 = (GrandExchangeEvent)class375.grandExchangeEvents.events.get(var3); // L: 3514
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.unitPrice; // L: 3515
						return 1; // L: 3516
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) { // L: 3518
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3519
						var4 = (GrandExchangeEvent)class375.grandExchangeEvents.events.get(var3); // L: 3520
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.id; // L: 3521
						return 1; // L: 3522
					} else {
						return 2; // L: 3524
					}
				}
			}
		}
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "185659219"
	)
	static final int method290(int var0) {
		return Math.min(Math.max(var0, 128), 383); // L: 3685
	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1135729474"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount; // L: 4393
		if (MusicPatchNode.localPlayer.x >> 7 == Client.destinationX && MusicPatchNode.localPlayer.y >> 7 == Client.destinationY) { // L: 4395
			Client.destinationX = 0; // L: 4396
		}

		TileItem.method2676(); // L: 4399
		if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) { // L: 4401
			MouseHandler.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false); // L: 4402
		}

		RouteStrategy.addNpcsToScene(true); // L: 4405
		int var4 = Players.Players_count; // L: 4407
		int[] var5 = Players.Players_indices; // L: 4408

		int var6;
		for (var6 = 0; var6 < var4; ++var6) { // L: 4409
			if (var5[var6] != Client.combatTargetPlayerIndex && var5[var6] != Client.localPlayerIndex) { // L: 4410
				MouseHandler.addPlayerToScene(Client.players[var5[var6]], true); // L: 4411
			}
		}

		RouteStrategy.addNpcsToScene(false); // L: 4414
		class142.method3235(); // L: 4415
		GraphicsDefaults.method8084(); // L: 4416
		class36.setViewportShape(var0, var1, var2, var3, true); // L: 4417
		var0 = Client.viewportOffsetX; // L: 4418
		var1 = Client.viewportOffsetY; // L: 4419
		var2 = Client.viewportWidth; // L: 4420
		var3 = Client.viewportHeight; // L: 4421
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4422
		method271(); // L: 4423
		Rasterizer2D.method9447(); // L: 4424
		var4 = Client.camAngleX; // L: 4425
		if (Client.field588 / 256 > var4) { // L: 4426
			var4 = Client.field588 / 256;
		}

		if (Client.field753[4] && Client.field776[4] + 128 > var4) { // L: 4427
			var4 = Client.field776[4] + 128;
		}

		int var34 = Client.camAngleY & 2047; // L: 4428
		var6 = class33.oculusOrbFocalPointX; // L: 4429
		int var7 = class96.field1296; // L: 4430
		int var8 = class144.oculusOrbFocalPointY; // L: 4431
		int var9 = WorldMapData_0.method5041(var4); // L: 4432
		int var11 = var3 - 334; // L: 4436
		if (var11 < 0) { // L: 4437
			var11 = 0;
		} else if (var11 > 100) { // L: 4438
			var11 = 100;
		}

		int var12 = (Client.zoomWidth - Client.zoomHeight) * var11 / 100 + Client.zoomHeight; // L: 4439
		int var10 = var9 * var12 / 256; // L: 4440
		var11 = 2048 - var4 & 2047; // L: 4443
		var12 = 2048 - var34 & 2047; // L: 4444
		int var13 = 0; // L: 4445
		int var14 = 0; // L: 4446
		int var15 = var10; // L: 4447
		int var16;
		int var17;
		int var18;
		if (var11 != 0) { // L: 4448
			var16 = Rasterizer3D.Rasterizer3D_sine[var11]; // L: 4449
			var17 = Rasterizer3D.Rasterizer3D_cosine[var11]; // L: 4450
			var18 = var17 * var14 - var16 * var10 >> 16; // L: 4451
			var15 = var16 * var14 + var10 * var17 >> 16; // L: 4452
			var14 = var18; // L: 4453
		}

		if (var12 != 0) { // L: 4455
			var16 = Rasterizer3D.Rasterizer3D_sine[var12]; // L: 4456
			var17 = Rasterizer3D.Rasterizer3D_cosine[var12]; // L: 4457
			var18 = var13 * var17 + var16 * var15 >> 16; // L: 4458
			var15 = var15 * var17 - var16 * var13 >> 16; // L: 4459
			var13 = var18; // L: 4460
		}

		if (Client.isCameraLocked) { // L: 4462
			WorldMapRectangle.field3006 = var6 - var13; // L: 4463
			Players.field1344 = var7 - var14; // L: 4464
			KitDefinition.field1957 = var8 - var15; // L: 4465
			ScriptEvent.field1041 = var4; // L: 4466
			class86.field1082 = var34; // L: 4467
		} else {
			class36.cameraX = var6 - var13; // L: 4470
			class174.cameraY = var7 - var14; // L: 4471
			class297.cameraZ = var8 - var15; // L: 4472
			WorldMapSectionType.cameraPitch = var4; // L: 4473
			class125.cameraYaw = var34; // L: 4474
		}

		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (class33.oculusOrbFocalPointX >> 7 != MusicPatchNode.localPlayer.x >> 7 || class144.oculusOrbFocalPointY >> 7 != MusicPatchNode.localPlayer.y >> 7)) { // L: 4476 4477
			var16 = MusicPatchNode.localPlayer.plane; // L: 4478
			var17 = WorldMapData_0.baseX * 64 + (class33.oculusOrbFocalPointX >> 7); // L: 4479
			var18 = GameObject.baseY * 64 + (class144.oculusOrbFocalPointY >> 7); // L: 4480
			PacketBufferNode var19 = class330.getPacketBufferNode(ClientPacket.field3179, Client.packetWriter.isaacCipher); // L: 4483
			var19.packetBuffer.method9043(Client.field576); // L: 4484
			var19.packetBuffer.method9096(var17); // L: 4485
			var19.packetBuffer.method9086(var16); // L: 4486
			var19.packetBuffer.method9257(var18); // L: 4487
			Client.packetWriter.addNode(var19); // L: 4488
		}

		if (!Client.isCameraLocked) { // L: 4494
			var10 = UserComparator3.method2932();
		} else {
			if (class20.clientPreferences.method2513()) { // L: 4498
				var11 = GameEngine.Client_plane; // L: 4499
			} else {
				var12 = class147.getTileHeight(class36.cameraX, class297.cameraZ, GameEngine.Client_plane); // L: 4502
				if (var12 - class174.cameraY < 800 && (Tiles.Tiles_renderFlags[GameEngine.Client_plane][class36.cameraX >> 7][class297.cameraZ >> 7] & 4) != 0) { // L: 4503
					var11 = GameEngine.Client_plane; // L: 4504
				} else {
					var11 = 3; // L: 4507
				}
			}

			var10 = var11; // L: 4509
		}

		var11 = class36.cameraX; // L: 4511
		var12 = class174.cameraY; // L: 4512
		var13 = class297.cameraZ; // L: 4513
		var14 = WorldMapSectionType.cameraPitch; // L: 4514
		var15 = class125.cameraYaw; // L: 4515

		for (var16 = 0; var16 < 5; ++var16) { // L: 4516
			if (Client.field753[var16]) { // L: 4517
				var17 = (int)(Math.random() * (double)(Client.field754[var16] * 2 + 1) - (double)Client.field754[var16] + Math.sin((double)Client.field584[var16] * ((double)Client.field631[var16] / 100.0D)) * (double)Client.field776[var16]); // L: 4518
				if (var16 == 0) { // L: 4519
					class36.cameraX += var17;
				}

				if (var16 == 1) { // L: 4520
					class174.cameraY += var17;
				}

				if (var16 == 2) { // L: 4521
					class297.cameraZ += var17;
				}

				if (var16 == 3) { // L: 4522
					class125.cameraYaw = var17 + class125.cameraYaw & 2047;
				}

				if (var16 == 4) { // L: 4523
					WorldMapSectionType.cameraPitch += var17; // L: 4524
					if (WorldMapSectionType.cameraPitch < 128) { // L: 4525
						WorldMapSectionType.cameraPitch = 128;
					}

					if (WorldMapSectionType.cameraPitch > 383) { // L: 4526
						WorldMapSectionType.cameraPitch = 383;
					}
				}
			}
		}

		var16 = MouseHandler.MouseHandler_x; // L: 4530
		var17 = MouseHandler.MouseHandler_y; // L: 4531
		if (MouseHandler.MouseHandler_lastButton != 0) { // L: 4532
			var16 = MouseHandler.MouseHandler_lastPressedX; // L: 4533
			var17 = MouseHandler.MouseHandler_lastPressedY; // L: 4534
		}

		if (var16 >= var0 && var16 < var0 + var2 && var17 >= var1 && var17 < var3 + var1) { // L: 4536
			var18 = var16 - var0; // L: 4537
			int var35 = var17 - var1; // L: 4538
			ViewportMouse.ViewportMouse_x = var18; // L: 4540
			ViewportMouse.ViewportMouse_y = var35; // L: 4541
			ViewportMouse.ViewportMouse_isInViewport = true; // L: 4542
			ViewportMouse.ViewportMouse_entityCount = 0; // L: 4543
			ViewportMouse.ViewportMouse_false0 = false; // L: 4544
		} else {
			class146.method3265(); // L: 4548
		}

		class323.playPcmPlayers(); // L: 4550
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4551
		class323.playPcmPlayers(); // L: 4552
		var18 = UserComparator7.method2904(); // L: 4553
		class314.method6147(ScriptFrame.client.field215); // L: 4554
		Rasterizer3D.field2514.field2790 = Client.viewportZoom; // L: 4555
		class31.scene.draw(class36.cameraX, class174.cameraY, class297.cameraZ, WorldMapSectionType.cameraPitch, class125.cameraYaw, var10); // L: 4556
		class314.method6147(false); // L: 4557
		if (Client.renderSelf) { // L: 4558
			Rasterizer2D.method9404(); // L: 4559
		}

		Rasterizer3D.field2514.field2790 = var18; // L: 4561
		class323.playPcmPlayers(); // L: 4562
		class31.scene.clearTempGameObjects(); // L: 4563
		Client.field589 = 0; // L: 4565
		boolean var38 = false; // L: 4566
		int var20 = -1; // L: 4567
		int var21 = -1; // L: 4568
		int var22 = Players.Players_count; // L: 4569
		int[] var23 = Players.Players_indices; // L: 4570

		int var24;
		for (var24 = 0; var24 < var22 + Client.npcCount; ++var24) { // L: 4571
			Object var37;
			if (var24 < var22) { // L: 4573
				var37 = Client.players[var23[var24]]; // L: 4574
				if (var23[var24] == Client.combatTargetPlayerIndex) { // L: 4575
					var38 = true; // L: 4576
					var20 = var24; // L: 4577
					continue;
				}

				if (var37 == MusicPatchNode.localPlayer) { // L: 4580
					var21 = var24; // L: 4581
					continue; // L: 4582
				}
			} else {
				var37 = Client.npcs[Client.npcIndices[var24 - var22]]; // L: 4585
			}

			class33.drawActor2d((Actor)var37, var24, var0, var1, var2, var3); // L: 4586
		}

		if (Client.field614 && var21 != -1) { // L: 4588
			class33.drawActor2d(MusicPatchNode.localPlayer, var21, var0, var1, var2, var3); // L: 4589
		}

		if (var38) { // L: 4591
			class33.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var20, var0, var1, var2, var3); // L: 4592
		}

		for (var24 = 0; var24 < Client.field589; ++var24) { // L: 4594
			int var25 = Client.field591[var24]; // L: 4595
			int var26 = Client.field592[var24]; // L: 4596
			int var27 = Client.field607[var24]; // L: 4597
			int var28 = Client.field593[var24]; // L: 4598
			boolean var29 = true; // L: 4599

			while (var29) {
				var29 = false; // L: 4601

				for (int var36 = 0; var36 < var24; ++var36) { // L: 4602
					if (var26 + 2 > Client.field592[var36] - Client.field593[var36] && var26 - var28 < Client.field592[var36] + 2 && var25 - var27 < Client.field607[var36] + Client.field591[var36] && var25 + var27 > Client.field591[var36] - Client.field607[var36] && Client.field592[var36] - Client.field593[var36] < var26) { // L: 4603 4604
						var26 = Client.field592[var36] - Client.field593[var36]; // L: 4605
						var29 = true; // L: 4606
					}
				}
			}

			Client.viewportTempX = Client.field591[var24]; // L: 4611
			Client.viewportTempY = Client.field592[var24] = var26; // L: 4612
			String var30 = Client.field598[var24]; // L: 4613
			if (Client.chatEffects == 0) { // L: 4614
				int var31 = 16776960; // L: 4615
				if (Client.field586[var24] < 6) { // L: 4616
					var31 = Client.field715[Client.field586[var24]];
				}

				if (Client.field586[var24] == 6) { // L: 4617
					var31 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.field586[var24] == 7) { // L: 4618
					var31 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.field586[var24] == 8) { // L: 4619
					var31 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
				}

				int var32;
				if (Client.field586[var24] == 9) { // L: 4620
					var32 = 150 - Client.field566[var24]; // L: 4621
					if (var32 < 50) { // L: 4622
						var31 = var32 * 1280 + 16711680;
					} else if (var32 < 100) { // L: 4623
						var31 = 16776960 - (var32 - 50) * 327680;
					} else if (var32 < 150) { // L: 4624
						var31 = (var32 - 100) * 5 + 65280;
					}
				}

				if (Client.field586[var24] == 10) { // L: 4626
					var32 = 150 - Client.field566[var24]; // L: 4627
					if (var32 < 50) { // L: 4628
						var31 = var32 * 5 + 16711680;
					} else if (var32 < 100) { // L: 4629
						var31 = 16711935 - (var32 - 50) * 327680;
					} else if (var32 < 150) { // L: 4630
						var31 = (var32 - 100) * 327680 + 255 - (var32 - 100) * 5;
					}
				}

				if (Client.field586[var24] == 11) { // L: 4632
					var32 = 150 - Client.field566[var24]; // L: 4633
					if (var32 < 50) { // L: 4634
						var31 = 16777215 - var32 * 327685;
					} else if (var32 < 100) { // L: 4635
						var31 = (var32 - 50) * 327685 + 65280;
					} else if (var32 < 150) { // L: 4636
						var31 = 16777215 - (var32 - 100) * 327680;
					}
				}

				if (Client.field596[var24] == 0) { // L: 4638
					class137.fontBold12.drawCentered(var30, var0 + Client.viewportTempX, Client.viewportTempY + var1, var31, 0);
				}

				if (Client.field596[var24] == 1) { // L: 4639
					class137.fontBold12.drawCenteredWave(var30, var0 + Client.viewportTempX, Client.viewportTempY + var1, var31, 0, Client.viewportDrawCount);
				}

				if (Client.field596[var24] == 2) { // L: 4640
					class137.fontBold12.drawCenteredWave2(var30, var0 + Client.viewportTempX, Client.viewportTempY + var1, var31, 0, Client.viewportDrawCount);
				}

				if (Client.field596[var24] == 3) { // L: 4641
					class137.fontBold12.drawCenteredShake(var30, var0 + Client.viewportTempX, Client.viewportTempY + var1, var31, 0, Client.viewportDrawCount, 150 - Client.field566[var24]);
				}

				if (Client.field596[var24] == 4) { // L: 4642
					var32 = (150 - Client.field566[var24]) * (class137.fontBold12.stringWidth(var30) + 100) / 150; // L: 4643
					Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1); // L: 4644
					class137.fontBold12.draw(var30, var0 + Client.viewportTempX + 50 - var32, Client.viewportTempY + var1, var31, 0); // L: 4645
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4646
				}

				if (Client.field596[var24] == 5) { // L: 4648
					var32 = 150 - Client.field566[var24]; // L: 4649
					int var33 = 0; // L: 4650
					if (var32 < 25) { // L: 4651
						var33 = var32 - 25;
					} else if (var32 > 125) { // L: 4652
						var33 = var32 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - class137.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5); // L: 4653
					class137.fontBold12.drawCentered(var30, var0 + Client.viewportTempX, var33 + Client.viewportTempY + var1, var31, 0); // L: 4654
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4655
				}
			} else {
				class137.fontBold12.drawCentered(var30, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0); // L: 4659
			}
		}

		class317.method6527(var0, var1); // L: 4663
		((TextureProvider)Rasterizer3D.field2514.Rasterizer3D_textureLoader).animate(Client.field564); // L: 4664
		Friend.method7815(); // L: 4666
		class36.cameraX = var11; // L: 4668
		class174.cameraY = var12; // L: 4669
		class297.cameraZ = var13; // L: 4670
		WorldMapSectionType.cameraPitch = var14; // L: 4671
		class125.cameraYaw = var15; // L: 4672
		if (Client.field499 && HorizontalAlignment.method3762(true, false) == 0) { // L: 4673
			Client.field499 = false;
		}

		if (Client.field499) { // L: 4674
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4675
			WorldMapDecoration.drawLoadingMessage("Loading - please wait.", false); // L: 4676
		}

	} // L: 4678

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-308434665"
	)
	@Export("selectSpell")
	static void selectSpell(int var0, int var1, int var2, int var3) {
		Widget var4 = SoundSystem.getWidgetChild(var0, var1); // L: 9464
		if (var4 != null && var4.onTargetEnter != null) { // L: 9465
			ScriptEvent var5 = new ScriptEvent(); // L: 9466
			var5.widget = var4; // L: 9467
			var5.args = var4.onTargetEnter; // L: 9468
			HealthBarUpdate.runScriptEvent(var5); // L: 9469
		}

		Client.selectedSpellItemId = var3; // L: 9471
		Client.isSpellSelected = true; // L: 9472
		class236.selectedSpellWidget = var0; // L: 9473
		Client.selectedSpellChildIndex = var1; // L: 9474
		SecureRandomFuture.selectedSpellFlags = var2; // L: 9475
		class144.invalidateWidget(var4); // L: 9476
	} // L: 9477
}
