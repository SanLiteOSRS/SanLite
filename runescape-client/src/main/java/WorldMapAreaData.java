import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("lj")
@Implements("WorldMapAreaData")
public class WorldMapAreaData extends WorldMapArea {
	@ObfuscatedName("ay")
	HashSet field3100;
	@ObfuscatedName("as")
	HashSet field3098;
	@ObfuscatedName("aj")
	@Export("iconList")
	List iconList;

	WorldMapAreaData() {
	} // L: 14

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(Lul;Lul;IZZI)V",
		garbageValue = "-940833039"
	)
	void method5746(Buffer var1, Buffer var2, int var3, boolean var4, boolean var5) {
		this.method5266(var1, var3, var5); // L: 17
		int var6 = var2.readUnsignedShort(); // L: 18
		this.field3100 = new HashSet(var6); // L: 19

		int var7;
		for (var7 = 0; var7 < var6; ++var7) { // L: 20
			WorldMapData_0 var8 = new WorldMapData_0(); // L: 21

			try {
				var8.init(var2); // L: 23
			} catch (IllegalStateException var13) { // L: 25
				continue; // L: 26
			}

			this.field3100.add(var8); // L: 28
		}

		var7 = var2.readUnsignedShort(); // L: 30
		this.field3098 = new HashSet(var7); // L: 31

		for (int var11 = 0; var11 < var7; ++var11) { // L: 32
			WorldMapData_1 var9 = new WorldMapData_1(); // L: 33

			try {
				var9.init(var2); // L: 35
			} catch (IllegalStateException var12) { // L: 37
				continue; // L: 38
			}

			this.field3098.add(var9); // L: 40
		}

		this.initIconsList(var2, var4); // L: 42
	} // L: 43

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(Lul;ZB)V",
		garbageValue = "0"
	)
	@Export("initIconsList")
	void initIconsList(Buffer var1, boolean var2) {
		this.iconList = new LinkedList(); // L: 46
		int var3 = var1.readUnsignedShort(); // L: 47

		for (int var4 = 0; var4 < var3; ++var4) { // L: 48
			int var5 = var1.method9223(); // L: 49
			Coord var6 = new Coord(var1.readInt()); // L: 50
			boolean var7 = var1.readUnsignedByte() == 1; // L: 51
			if (var2 || !var7) { // L: 52
				this.iconList.add(new WorldMapIcon_0((Coord)null, var6, var5, (WorldMapLabel)null)); // L: 53
			}
		}

	} // L: 56

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZI)I",
		garbageValue = "1112250156"
	)
	static int method5744(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) { // L: 4434
			Interpreter.Interpreter_intStackSize -= 2; // L: 4435
			Client.field791 = (short)class274.method5561(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]); // L: 4436
			if (Client.field791 <= 0) { // L: 4437
				Client.field791 = 256;
			}

			Client.field792 = (short)class274.method5561(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 4438
			if (Client.field792 <= 0) { // L: 4439
				Client.field792 = 256;
			}

			return 1; // L: 4440
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) { // L: 4442
			Interpreter.Interpreter_intStackSize -= 2; // L: 4443
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4444
			if (Client.zoomHeight <= 0) { // L: 4445
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4446
			if (Client.zoomWidth <= 0) { // L: 4447
				Client.zoomWidth = 320;
			}

			return 1; // L: 4448
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) { // L: 4450
			Interpreter.Interpreter_intStackSize -= 4; // L: 4451
			Client.field795 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4452
			if (Client.field795 <= 0) { // L: 4453
				Client.field795 = 1;
			}

			Client.field662 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4454
			if (Client.field662 <= 0) { // L: 4455
				Client.field662 = 32767;
			} else if (Client.field662 < Client.field795) { // L: 4456
				Client.field662 = Client.field795;
			}

			Client.field594 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 4457
			if (Client.field594 <= 0) { // L: 4458
				Client.field594 = 1;
			}

			Client.field798 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 4459
			if (Client.field798 <= 0) { // L: 4460
				Client.field798 = 32767;
			} else if (Client.field798 < Client.field594) { // L: 4461
				Client.field798 = Client.field594;
			}

			return 1; // L: 4462
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) { // L: 4464
			if (Client.viewportWidget != null) { // L: 4465
				class53.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false); // L: 4466
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.viewportWidth; // L: 4467
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.viewportHeight; // L: 4468
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4471
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4472
			}

			return 1; // L: 4474
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) { // L: 4476
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.zoomHeight; // L: 4477
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.zoomWidth; // L: 4478
			return 1; // L: 4479
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) { // L: 4481
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class398.method7349(Client.field791); // L: 4482
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class398.method7349(Client.field792); // L: 4483
			return 1; // L: 4484
		} else if (var0 == 6220) { // L: 4486
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4487
			return 1; // L: 4488
		} else if (var0 == 6221) { // L: 4490
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4491
			return 1; // L: 4492
		} else if (var0 == 6222) { // L: 4494
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class340.canvasWidth; // L: 4495
			return 1; // L: 4496
		} else if (var0 == 6223) { // L: 4498
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class491.canvasHeight; // L: 4499
			return 1; // L: 4500
		} else {
			return 2; // L: 4502
		}
	}
}
