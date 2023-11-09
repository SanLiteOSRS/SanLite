import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("im")
@Implements("Renderable")
public abstract class Renderable extends DualNode {
	@ObfuscatedName("iz")
	@ObfuscatedGetter(
		intValue = -2085766701
	)
	static int field2619;
	@ObfuscatedName("ef")
	@ObfuscatedGetter(
		intValue = -274617861
	)
	@Export("height")
	public int height;

	protected Renderable() {
		this.height = 1000; // L: 6
	} // L: 8

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Ljd;",
		garbageValue = "-1953039490"
	)
	@Export("getModel")
	protected Model getModel() {
		return null; // L: 19
	}

	@ObfuscatedName("dy")
	@Export("draw")
	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		Model var11 = this.getModel(); // L: 11
		if (var11 != null) { // L: 12
			this.height = var11.height; // L: 13
			var11.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9); // L: 14
		}

	} // L: 16

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "-453533201"
	)
	static int method4715(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) { // L: 4305
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class237.getWindowedMode(); // L: 4306
			return 1; // L: 4307
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) { // L: 4309
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4310
				if (var3 == 1 || var3 == 2) { // L: 4311
					HealthBar.setWindowedMode(var3);
				}

				return 1; // L: 4312
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) { // L: 4314
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class10.clientPreferences.method2456(); // L: 4315
				return 1; // L: 4316
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) { // L: 4318
				if (var0 == 5310) { // L: 4325
					--Interpreter.Interpreter_intStackSize; // L: 4326
					return 1; // L: 4327
				} else {
					return 2; // L: 4329
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4319
				if (var3 == 1 || var3 == 2) { // L: 4320
					class10.clientPreferences.method2440(var3); // L: 4321
				}

				return 1; // L: 4323
			}
		}
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "28"
	)
	@Export("getTileHeight")
	static final int getTileHeight(int var0, int var1, int var2) {
		int var3 = var0 >> 7; // L: 5811
		int var4 = var1 >> 7; // L: 5812
		if (var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) { // L: 5813
			int var5 = var2; // L: 5814
			if (var2 < 3 && (Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) { // L: 5815
				var5 = var2 + 1;
			}

			int var6 = var0 & 127; // L: 5816
			int var7 = var1 & 127; // L: 5817
			int var8 = (128 - var6) * Tiles.Tiles_heights[var5][var3][var4] + Tiles.Tiles_heights[var5][var3 + 1][var4] * var6 >> 7; // L: 5818
			int var9 = var6 * Tiles.Tiles_heights[var5][var3 + 1][var4 + 1] + Tiles.Tiles_heights[var5][var3][var4 + 1] * (128 - var6) >> 7; // L: 5819
			return var8 * (128 - var7) + var7 * var9 >> 7; // L: 5820
		} else {
			return 0;
		}
	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "-1611481157"
	)
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (Client.loadInterface(var0)) { // L: 10547
			class134.field1575 = null; // L: 10554
			TaskHandler.drawInterface(class16.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7); // L: 10555
			if (class134.field1575 != null) { // L: 10556
				TaskHandler.drawInterface(class134.field1575, -1412584499, var1, var2, var3, var4, class74.field911, class171.field1825, var7); // L: 10557
				class134.field1575 = null; // L: 10558
			}

		} else {
			if (var7 != -1) { // L: 10548
				Client.field723[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) { // L: 10550
					Client.field723[var8] = true;
				}
			}

		}
	} // L: 10552 10560
}
