import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("az")
@Implements("KeyHandler")
public final class KeyHandler implements KeyListener, FocusListener {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Laz;"
	)
	@Export("KeyHandler_instance")
	public static KeyHandler KeyHandler_instance;
	@ObfuscatedName("cn")
	@Export("KeyHandler_pressedKeys")
	public static boolean[] KeyHandler_pressedKeys;
	@ObfuscatedName("co")
	public static int[] field287;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = -961604687
	)
	public static int field296;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -1243891281
	)
	public static int field288;
	@ObfuscatedName("cc")
	static char[] field286;
	@ObfuscatedName("cu")
	static int[] field289;
	@ObfuscatedName("cz")
	public static int[] field274;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -402048791
	)
	public static int field292;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 924382931
	)
	public static int field293;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -1003990119
	)
	public static int field294;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 300307947
	)
	public static int field295;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 1384960375
	)
	@Export("KeyHandler_idleCycles")
	public static volatile int KeyHandler_idleCycles;
	@ObfuscatedName("ca")
	@Export("KeyHandler_keyCodes")
	static int[] KeyHandler_keyCodes;

	static {
		KeyHandler_instance = new KeyHandler();
		KeyHandler_pressedKeys = new boolean[112];
		field287 = new int[128];
		field296 = 0;
		field288 = 0;
		field286 = new char[128];
		field289 = new int[128];
		field274 = new int[128];
		field292 = 0;
		field293 = 0;
		field294 = 0;
		field295 = 0;
		KeyHandler_idleCycles = 0;
		KeyHandler_keyCodes = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
	}

	KeyHandler() {
	}

	public final synchronized void keyPressed(KeyEvent var1) {
		if (KeyHandler_instance != null) {
			int var2 = var1.getKeyCode();
			if (var2 >= 0 && var2 < KeyHandler_keyCodes.length) {
				var2 = KeyHandler_keyCodes[var2];
				if ((var2 & 128) != 0) {
					var2 = -1;
				}
			} else {
				var2 = -1;
			}

			if (field288 >= 0 && var2 >= 0) {
				field287[field288] = var2;
				field288 = field288 + 1 & 127;
				if (field288 == field296) {
					field288 = -1;
				}
			}

			int var3;
			if (var2 >= 0) {
				var3 = field294 + 1 & 127;
				if (var3 != field293) {
					field289[field294] = var2;
					field286[field294] = 0;
					field294 = var3;
				}
			}

			var3 = var1.getModifiers();
			if ((var3 & 10) != 0 || var2 == 85 || var2 == 10) {
				var1.consume();
			}
		}

	}

	public final synchronized void keyReleased(KeyEvent var1) {
		if (KeyHandler_instance != null) {
			int var2 = var1.getKeyCode();
			if (var2 >= 0 && var2 < KeyHandler_keyCodes.length) {
				var2 = KeyHandler_keyCodes[var2] & -129;
			} else {
				var2 = -1;
			}

			if (field288 >= 0 && var2 >= 0) {
				field287[field288] = ~var2;
				field288 = field288 + 1 & 127;
				if (field296 == field288) {
					field288 = -1;
				}
			}
		}

		var1.consume();
	}

	public final synchronized void focusLost(FocusEvent var1) {
		if (KeyHandler_instance != null) {
			field288 = -1;
		}

	}

	public final void keyTyped(KeyEvent var1) {
		if (KeyHandler_instance != null) {
			char var2 = var1.getKeyChar();
			if (var2 != 0 && var2 != '\uffff' && Timer.method5614(var2)) {
				int var3 = field294 + 1 & 127;
				if (var3 != field293) {
					field289[field294] = -1;
					field286[field294] = var2;
					field294 = var3;
				}
			}
		}

		var1.consume();
	}

	public final void focusGained(FocusEvent var1) {
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1154026076"
	)
	public static void method378() {
		HealthBarDefinition.field1606.clear();
		HealthBarDefinition.WorldMapElement_cachedSprites.clear();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "946272501"
	)
	static int method364(int var0, Script var1, boolean var2) {
		if (var0 >= 7200 && var0 < 7204) {
			class44.Interpreter_intStackSize -= 5;
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else if (var0 == 7204) {
			class44.Interpreter_intStackSize -= 6;
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else if (var0 >= 7205 && var0 < 7209) {
			Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else if (var0 == 7209) {
			class44.Interpreter_intStackSize -= 2;
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else if (var0 >= 7210 && var0 < 7214) {
			--class44.Interpreter_intStackSize;
			return 1;
		} else if (var0 == 7214) {
			class44.Interpreter_intStackSize -= 2;
			return 1;
		} else {
			return 2;
		}
	}
}
