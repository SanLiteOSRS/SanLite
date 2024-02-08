import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ab")
public class class20 {
	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "[Lut;"
	)
	static IndexedSprite[] field104;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1098722027
	)
	final int field107;
	@ObfuscatedName("ap")
	final Map field105;
	@ObfuscatedName("af")
	final String field102;

	class20(String var1) {
		this.field107 = 400; // L: 35
		this.field105 = null; // L: 36
		this.field102 = ""; // L: 37
	} // L: 38

	class20(HttpURLConnection var1) throws IOException {
		this.field107 = var1.getResponseCode(); // L: 17
		var1.getResponseMessage(); // L: 18
		this.field105 = var1.getHeaderFields(); // L: 19
		StringBuilder var2 = new StringBuilder(); // L: 20
		InputStream var3 = this.field107 >= 300 ? var1.getErrorStream() : var1.getInputStream(); // L: 21
		if (var3 != null) { // L: 22
			InputStreamReader var4 = new InputStreamReader(var3); // L: 23
			BufferedReader var5 = new BufferedReader(var4); // L: 24

			String var6;
			while ((var6 = var5.readLine()) != null) { // L: 26
				var2.append(var6); // L: 27
			}

			var3.close(); // L: 29
		}

		this.field102 = var2.toString(); // L: 31
	} // L: 32

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-788361864"
	)
	public int method302() {
		return this.field107; // L: 41
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Map;",
		garbageValue = "133946093"
	)
	public Map method300() {
		return this.field105; // L: 45
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-957913249"
	)
	public String method304() {
		return this.field102; // L: 49
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IZIZB)V",
		garbageValue = "93"
	)
	@Export("sortWorldList")
	static void sortWorldList(int var0, boolean var1, int var2, boolean var3) {
		if (World.World_worlds != null) { // L: 172
			class171.doWorldSorting(0, World.World_worlds.length - 1, var0, var1, var2, var3); // L: 173
		}

	} // L: 175

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1973400038"
	)
	static final int method312() {
		return ViewportMouse.ViewportMouse_x; // L: 102
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "-170541193"
	)
	static int method303(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) { // L: 4469
			UserComparator6.Interpreter_intStackSize -= 2; // L: 4470
			Client.field772 = (short)class330.method6301(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]); // L: 4471
			if (Client.field772 <= 0) { // L: 4472
				Client.field772 = 256;
			}

			Client.field773 = (short)class330.method6301(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]); // L: 4473
			if (Client.field773 <= 0) { // L: 4474
				Client.field773 = 256;
			}

			return 1; // L: 4475
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) { // L: 4477
			UserComparator6.Interpreter_intStackSize -= 2; // L: 4478
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 4479
			if (Client.zoomHeight <= 0) { // L: 4480
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 4481
			if (Client.zoomWidth <= 0) { // L: 4482
				Client.zoomWidth = 320;
			}

			return 1; // L: 4483
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) { // L: 4485
			UserComparator6.Interpreter_intStackSize -= 4; // L: 4486
			Client.field776 = (short)Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 4487
			if (Client.field776 <= 0) { // L: 4488
				Client.field776 = 1;
			}

			Client.field596 = (short)Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 4489
			if (Client.field596 <= 0) { // L: 4490
				Client.field596 = 32767;
			} else if (Client.field596 < Client.field776) { // L: 4491
				Client.field596 = Client.field776;
			}

			Client.field778 = (short)Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 2]; // L: 4492
			if (Client.field778 <= 0) { // L: 4493
				Client.field778 = 1;
			}

			Client.field779 = (short)Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 3]; // L: 4494
			if (Client.field779 <= 0) { // L: 4495
				Client.field779 = 32767;
			} else if (Client.field779 < Client.field778) { // L: 4496
				Client.field779 = Client.field778;
			}

			return 1; // L: 4497
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) { // L: 4499
			if (Client.viewportWidget != null) { // L: 4500
				VarbitComposition.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false); // L: 4501
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.viewportWidth; // L: 4502
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.viewportHeight; // L: 4503
			} else {
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1; // L: 4506
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1; // L: 4507
			}

			return 1; // L: 4509
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) { // L: 4511
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.zoomHeight; // L: 4512
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.zoomWidth; // L: 4513
			return 1; // L: 4514
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) { // L: 4516
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class25.method386(Client.field772); // L: 4517
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class25.method386(Client.field773); // L: 4518
			return 1; // L: 4519
		} else if (var0 == 6220) { // L: 4521
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 4522
			return 1; // L: 4523
		} else if (var0 == 6221) { // L: 4525
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 4526
			return 1; // L: 4527
		} else if (var0 == 6222) { // L: 4529
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class524.canvasWidth; // L: 4530
			return 1; // L: 4531
		} else if (var0 == 6223) { // L: 4533
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = GameEngine.canvasHeight; // L: 4534
			return 1; // L: 4535
		} else {
			return 2; // L: 4537
		}
	}
}
