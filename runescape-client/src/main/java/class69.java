import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bv")
public class class69 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Ljc;"
	)
	@Export("reflectionChecks")
	public static IterableNodeDeque reflectionChecks;
	@ObfuscatedName("g")
	@Export("Widget_loadedInterfaces")
	public static boolean[] Widget_loadedInterfaces;
	@ObfuscatedName("hz")
	@ObfuscatedGetter(
		intValue = -1660652965
	)
	@Export("cameraYaw")
	static int cameraYaw;

	static {
		reflectionChecks = new IterableNodeDeque();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(ILjava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-2099962248"
	)
	@Export("addGameMessage")
	static void addGameMessage(int var0, String var1, String var2) {
		Projectile.addChatMessage(var0, var1, var2, (String)null);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-798312209"
	)
	static void method1166() {
		class9.field69 = null;
		Tiles.field1092 = null;
		Tiles.field1091 = null;
		class362.field4079 = null;
		MidiPcmStream.field2489 = null;
		SecureRandomCallable.field1106 = null;
		WorldMapLabelSize.field1570 = null;
		Tiles.Tiles_hue = null;
		Tiles.Tiles_saturation = null;
		Tiles.Tiles_lightness = null;
		GrandExchangeOfferOwnWorldComparator.Tiles_hueMultiplier = null;
		class375.field4136 = null;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "-75599229"
	)
	public static int method1168(CharSequence var0) {
		boolean var2 = false;
		boolean var3 = false;
		int var4 = 0;
		int var5 = var0.length();

		for (int var6 = 0; var6 < var5; ++var6) {
			char var7 = var0.charAt(var6);
			if (var6 == 0) {
				if (var7 == '-') {
					var2 = true;
					continue;
				}

				if (var7 == '+') {
					continue;
				}
			}

			int var9;
			if (var7 >= '0' && var7 <= '9') {
				var9 = var7 - '0';
			} else if (var7 >= 'A' && var7 <= 'Z') {
				var9 = var7 - '7';
			} else {
				if (var7 < 'a' || var7 > 'z') {
					throw new NumberFormatException();
				}

				var9 = var7 - 'W';
			}

			if (var9 >= 10) {
				throw new NumberFormatException();
			}

			if (var2) {
				var9 = -var9;
			}

			int var8 = var9 + var4 * 10;
			if (var4 != var8 / 10) {
				throw new NumberFormatException();
			}

			var4 = var8;
			var3 = true;
		}

		if (!var3) {
			throw new NumberFormatException();
		} else {
			return var4;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(II)Z",
		garbageValue = "-582278156"
	)
	public static boolean method1165(int var0) {
		return (var0 >> 29 & 1) != 0;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(CB)Z",
		garbageValue = "-30"
	)
	@Export("isCharAlphabetic")
	public static boolean isCharAlphabetic(char var0) {
		return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(ILcc;ZI)I",
		garbageValue = "1950994133"
	)
	static int method1169(int var0, Script var1, boolean var2) {
		Widget var3 = class139.getWidget(Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETX) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETY) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.width;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.height;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		signature = "(II)Ljava/lang/String;",
		garbageValue = "-1186664585"
	)
	static String method1164(int var0) {
		if (var0 < 0) {
			return "";
		} else {
			return Client.menuTargets[var0].length() > 0 ? Client.menuActions[var0] + " " + Client.menuTargets[var0] : Client.menuActions[var0];
		}
	}
}
