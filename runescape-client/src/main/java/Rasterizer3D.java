import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("in")
@Implements("Rasterizer3D")
public class Rasterizer3D {
	@ObfuscatedName("af")
	@Export("Rasterizer3D_colorPalette")
	public static int[] Rasterizer3D_colorPalette;
	@ObfuscatedName("an")
	static int[] field2517;
	@ObfuscatedName("aw")
	static int[] field2513;
	@ObfuscatedName("ac")
	@Export("Rasterizer3D_sine")
	public static int[] Rasterizer3D_sine;
	@ObfuscatedName("au")
	@Export("Rasterizer3D_cosine")
	public static int[] Rasterizer3D_cosine;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public static class236 field2514;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	static class220 field2519;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	static final class220 field2518;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	static final class220 field2512;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -689745739
	)
	static int field2520;

	static {
		Rasterizer3D_colorPalette = new int[65536]; // L: 4
		field2517 = new int[512]; // L: 5
		field2513 = new int[2048]; // L: 6
		Rasterizer3D_sine = new int[2048]; // L: 7
		Rasterizer3D_cosine = new int[2048]; // L: 8

		int var0;
		for (var0 = 1; var0 < 512; ++var0) { // L: 15
			field2517[var0] = 32768 / var0; // L: 16
		}

		for (var0 = 1; var0 < 2048; ++var0) { // L: 18
			field2513[var0] = 65536 / var0; // L: 19
		}

		for (var0 = 0; var0 < 2048; ++var0) { // L: 21
			Rasterizer3D_sine[var0] = (int)(65536.0D * Math.sin(0.0030679615D * (double)var0)); // L: 22
			Rasterizer3D_cosine[var0] = (int)(65536.0D * Math.cos(0.0030679615D * (double)var0)); // L: 23
		}

		field2514 = new class236(); // L: 25
		field2518 = new class235(field2514); // L: 26
		field2512 = new class237(field2514); // L: 27
		field2519 = field2518; // L: 28
	} // L: 29

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;ZB)Lsy;",
		garbageValue = "-55"
	)
	@Export("getPreferencesFile")
	public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
		File var3 = new File(class335.cacheDir, "preferences" + var0 + ".dat"); // L: 183
		if (var3.exists()) { // L: 184
			try {
				AccessFile var10 = new AccessFile(var3, "rw", 10000L); // L: 186
				return var10; // L: 187
			} catch (IOException var9) { // L: 189
			}
		}

		String var4 = ""; // L: 191
		if (JagexCache.cacheGamebuild == 33) { // L: 192
			var4 = "_rc";
		} else if (JagexCache.cacheGamebuild == 34) { // L: 193
			var4 = "_wip";
		}

		File var5 = new File(HorizontalAlignment.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat"); // L: 194
		AccessFile var6;
		if (!var2 && var5.exists()) { // L: 195
			try {
				var6 = new AccessFile(var5, "rw", 10000L); // L: 197
				return var6; // L: 198
			} catch (IOException var8) { // L: 200
			}
		}

		try {
			var6 = new AccessFile(var3, "rw", 10000L); // L: 203
			return var6; // L: 204
		} catch (IOException var7) { // L: 206
			throw new RuntimeException(); // L: 207
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILch;ZI)I",
		garbageValue = "734419623"
	)
	static int method4451(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? SoundSystem.scriptDotWidget : class1.field5; // L: 1564
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) { // L: 1565
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class195.Widget_unpackTargetMask(class25.getWidgetFlags(var3)); // L: 1566
			return 1; // L: 1567
		} else if (var0 != ScriptOpcodes.CC_GETOP) { // L: 1569
			if (var0 == ScriptOpcodes.CC_GETOPBASE) { // L: 1576
				if (var3.dataText == null) { // L: 1577
					Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1578
				}

				return 1; // L: 1579
			} else {
				return 2; // L: 1581
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1570
			--var4; // L: 1571
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1572
				Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1573
			} else {
				Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1574
		}
	}
}
