import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jk")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 344453189
	)
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -506951697
	)
	@Export("element")
	int element;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 658588945
	)
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -509647433
	)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Llt;Llt;ILja;)V"
	)
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2); // L: 17
		this.objectDefId = var3; // L: 18
		this.region = var4; // L: 19
		this.init(); // L: 20
	} // L: 21

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "783728307"
	)
	@Export("init")
	void init() {
		this.element = DecorativeObject.getObjectDefinition(this.objectDefId).transform().mapIconId; // L: 24
		this.label = this.region.createMapLabel(class123.WorldMapElement_get(this.element)); // L: 25
		WorldMapElement var1 = class123.WorldMapElement_get(this.getElement()); // L: 26
		SpritePixels var2 = var1.getSpriteBool(false); // L: 27
		if (var2 != null) { // L: 28
			this.subWidth = var2.subWidth; // L: 29
			this.subHeight = var2.subHeight; // L: 30
		} else {
			this.subWidth = 0; // L: 33
			this.subHeight = 0; // L: 34
		}

	} // L: 36

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-81"
	)
	@Export("getElement")
	public int getElement() {
		return this.element; // L: 40
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Ljb;",
		garbageValue = "-166366580"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label; // L: 45
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "638535000"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth; // L: 50
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "36"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight; // L: 55
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(ILcv;ZI)I",
		garbageValue = "-488125464"
	)
	static int method4820(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) { // L: 4351
			Interpreter.Interpreter_intStackSize -= 2; // L: 4352
			Client.field544 = (short)class102.method2664(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]); // L: 4353
			if (Client.field544 <= 0) { // L: 4354
				Client.field544 = 256;
			}

			Client.field744 = (short)class102.method2664(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 4355
			if (Client.field744 <= 0) { // L: 4356
				Client.field744 = 256;
			}

			return 1; // L: 4357
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) { // L: 4359
			Interpreter.Interpreter_intStackSize -= 2; // L: 4360
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4361
			if (Client.zoomHeight <= 0) { // L: 4362
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4363
			if (Client.zoomWidth <= 0) { // L: 4364
				Client.zoomWidth = 320;
			}

			return 1; // L: 4365
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) { // L: 4367
			Interpreter.Interpreter_intStackSize -= 4; // L: 4368
			Client.field747 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4369
			if (Client.field747 <= 0) { // L: 4370
				Client.field747 = 1;
			}

			Client.field748 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4371
			if (Client.field748 <= 0) { // L: 4372
				Client.field748 = 32767;
			} else if (Client.field748 < Client.field747) { // L: 4373
				Client.field748 = Client.field747;
			}

			Client.field749 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 4374
			if (Client.field749 <= 0) { // L: 4375
				Client.field749 = 1;
			}

			Client.field750 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 4376
			if (Client.field750 <= 0) { // L: 4377
				Client.field750 = 32767;
			} else if (Client.field750 < Client.field749) { // L: 4378
				Client.field750 = Client.field749;
			}

			return 1; // L: 4379
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) { // L: 4381
			if (Client.viewportWidget != null) { // L: 4382
				Language.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false); // L: 4383
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.viewportWidth; // L: 4384
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.viewportHeight; // L: 4385
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4388
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4389
			}

			return 1; // L: 4391
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) { // L: 4393
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.zoomHeight; // L: 4394
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.zoomWidth; // L: 4395
			return 1; // L: 4396
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) { // L: 4398
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class87.method2277(Client.field544); // L: 4399
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class87.method2277(Client.field744); // L: 4400
			return 1; // L: 4401
		} else if (var0 == 6220) { // L: 4403
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4404
			return 1; // L: 4405
		} else if (var0 == 6221) { // L: 4407
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4408
			return 1; // L: 4409
		} else if (var0 == 6222) { // L: 4411
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GameEngine.canvasWidth; // L: 4412
			return 1; // L: 4413
		} else if (var0 == 6223) { // L: 4415
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class143.canvasHeight; // L: 4416
			return 1; // L: 4417
		} else {
			return 2; // L: 4419
		}
	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "-61"
	)
	static final void method4802(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0; // L: 10450
		int var7 = var3 - var1; // L: 10451
		int var8 = var6 >= 0 ? var6 : -var6; // L: 10452
		int var9 = var7 >= 0 ? var7 : -var7; // L: 10453
		int var10 = var8; // L: 10454
		if (var8 < var9) { // L: 10455
			var10 = var9;
		}

		if (var10 != 0) { // L: 10456
			int var11 = (var6 << 16) / var10; // L: 10457
			int var12 = (var7 << 16) / var10; // L: 10458
			if (var12 <= var11) { // L: 10459
				var11 = -var11;
			} else {
				var12 = -var12; // L: 10460
			}

			int var13 = var5 * var12 >> 17; // L: 10461
			int var14 = var5 * var12 + 1 >> 17; // L: 10462
			int var15 = var5 * var11 >> 17; // L: 10463
			int var16 = var5 * var11 + 1 >> 17; // L: 10464
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart; // L: 10465
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart; // L: 10466
			int var17 = var0 + var13; // L: 10467
			int var18 = var0 - var14; // L: 10468
			int var19 = var0 + var6 - var14; // L: 10469
			int var20 = var0 + var6 + var13; // L: 10470
			int var21 = var15 + var1; // L: 10471
			int var22 = var1 - var16; // L: 10472
			int var23 = var7 + var1 - var16; // L: 10473
			int var24 = var15 + var7 + var1; // L: 10474
			Rasterizer3D.method4328(var17, var18, var19); // L: 10475
			Rasterizer3D.method4269(var21, var22, var23, var17, var18, var19, var4); // L: 10476
			Rasterizer3D.method4328(var17, var19, var20); // L: 10477
			Rasterizer3D.method4269(var21, var23, var24, var17, var19, var20, var4); // L: 10478
		}
	} // L: 10479
}
