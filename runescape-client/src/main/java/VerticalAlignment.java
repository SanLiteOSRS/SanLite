import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hq")
@Implements("VerticalAlignment")
public enum VerticalAlignment implements class369 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	field2045(2, 0),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	@Export("VerticalAlignment_centered")
	VerticalAlignment_centered(0, 1),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	field2043(1, 2);

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "[Ltj;"
	)
	@Export("modIconSprites")
	static IndexedSprite[] modIconSprites;
	@ObfuscatedName("sw")
	@ObfuscatedSignature(
		descriptor = "Lgv;"
	)
	@Export("guestClanChannel")
	static ClanChannel guestClanChannel;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -2582509
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1907451199
	)
	@Export("id")
	final int id;

	VerticalAlignment(int var3, int var4) {
		this.value = var3; // L: 14
		this.id = var4; // L: 15
	} // L: 16

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-14"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 20
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "724345939"
	)
	static long method3753() {
		try {
			URL var0 = new URL(Widget.method6509("services", false) + "m=accountappeal/login.ws"); // L: 36
			URLConnection var1 = var0.openConnection(); // L: 37
			var1.setRequestProperty("connection", "close"); // L: 38
			var1.setDoInput(true); // L: 39
			var1.setDoOutput(true); // L: 40
			var1.setConnectTimeout(5000); // L: 41
			OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream()); // L: 42
			var2.write("data1=req"); // L: 43
			var2.flush(); // L: 44
			InputStream var3 = var1.getInputStream(); // L: 45
			Buffer var4 = new Buffer(new byte[1000]); // L: 46

			do {
				int var5 = var3.read(var4.array, var4.offset, 1000 - var4.offset); // L: 48
				if (var5 == -1) { // L: 49
					var4.offset = 0; // L: 55
					long var7 = var4.readLong(); // L: 56
					return var7; // L: 57
				}

				var4.offset += var5; // L: 50
			} while(var4.offset < 1000); // L: 51

			return 0L; // L: 52
		} catch (Exception var9) { // L: 59
			return 0L; // L: 60
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "1899018290"
	)
	static int method3754(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) { // L: 4381
			Interpreter.Interpreter_intStackSize -= 2; // L: 4382
			Client.field776 = (short)class389.method7215(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]); // L: 4383
			if (Client.field776 <= 0) { // L: 4384
				Client.field776 = 256;
			}

			Client.field620 = (short)class389.method7215(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 4385
			if (Client.field620 <= 0) { // L: 4386
				Client.field620 = 256;
			}

			return 1; // L: 4387
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) { // L: 4389
			Interpreter.Interpreter_intStackSize -= 2; // L: 4390
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4391
			if (Client.zoomHeight <= 0) { // L: 4392
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4393
			if (Client.zoomWidth <= 0) { // L: 4394
				Client.zoomWidth = 320;
			}

			return 1; // L: 4395
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) { // L: 4397
			Interpreter.Interpreter_intStackSize -= 4; // L: 4398
			Client.field780 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4399
			if (Client.field780 <= 0) { // L: 4400
				Client.field780 = 1;
			}

			Client.field781 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4401
			if (Client.field781 <= 0) { // L: 4402
				Client.field781 = 32767;
			} else if (Client.field781 < Client.field780) { // L: 4403
				Client.field781 = Client.field780;
			}

			Client.field591 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 4404
			if (Client.field591 <= 0) { // L: 4405
				Client.field591 = 1;
			}

			Client.field783 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 4406
			if (Client.field783 <= 0) { // L: 4407
				Client.field783 = 32767;
			} else if (Client.field783 < Client.field591) { // L: 4408
				Client.field783 = Client.field591;
			}

			return 1; // L: 4409
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) { // L: 4411
			if (Client.viewportWidget != null) { // L: 4412
				WorldMapDecorationType.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false); // L: 4413
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.viewportWidth; // L: 4414
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.viewportHeight; // L: 4415
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4418
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4419
			}

			return 1; // L: 4421
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) { // L: 4423
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.zoomHeight; // L: 4424
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.zoomWidth; // L: 4425
			return 1; // L: 4426
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) { // L: 4428
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapRegion.method5289(Client.field776); // L: 4429
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapRegion.method5289(Client.field620); // L: 4430
			return 1; // L: 4431
		} else if (var0 == 6220) { // L: 4433
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4434
			return 1; // L: 4435
		} else if (var0 == 6221) { // L: 4437
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4438
			return 1; // L: 4439
		} else if (var0 == 6222) { // L: 4441
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class448.canvasWidth; // L: 4442
			return 1; // L: 4443
		} else if (var0 == 6223) { // L: 4445
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapID.canvasHeight; // L: 4446
			return 1; // L: 4447
		} else {
			return 2; // L: 4449
		}
	}

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-31"
	)
	static void method3751(int var0) {
		UrlRequester.tempMenuAction = new MenuAction(); // L: 12076
		UrlRequester.tempMenuAction.param0 = Client.menuArguments1[var0]; // L: 12077
		UrlRequester.tempMenuAction.param1 = Client.menuArguments2[var0]; // L: 12078
		UrlRequester.tempMenuAction.opcode = Client.menuOpcodes[var0]; // L: 12079
		UrlRequester.tempMenuAction.identifier = Client.menuIdentifiers[var0]; // L: 12080
		UrlRequester.tempMenuAction.field900 = Client.field655[var0]; // L: 12081
		UrlRequester.tempMenuAction.field901 = Client.menuActions[var0]; // L: 12082
		UrlRequester.tempMenuAction.field897 = Client.menuTargets[var0]; // L: 12083
	} // L: 12084
}
