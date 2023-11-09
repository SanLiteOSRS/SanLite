import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("t")
@Implements("KeyHandler")
public final class KeyHandler implements KeyListener, FocusListener {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lt;"
	)
	@Export("KeyHandler_instance")
	public static KeyHandler KeyHandler_instance;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	static IndexedSprite field127;
	@ObfuscatedName("bj")
	@Export("otp")
	static String otp;
	@ObfuscatedName("cc")
	@Export("KeyHandler_pressedKeys")
	public static boolean[] KeyHandler_pressedKeys;
	@ObfuscatedName("cm")
	static boolean[] field128;
	@ObfuscatedName("cn")
	static boolean[] field126;
	@ObfuscatedName("cp")
	static int[] field130;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 1304611641
	)
	static int field149;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 624097121
	)
	static int field132;
	@ObfuscatedName("cy")
	static char[] field125;
	@ObfuscatedName("cw")
	static int[] field144;
	@ObfuscatedName("cg")
	public static int[] field135;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -693924747
	)
	public static int field136;
	@ObfuscatedName("cz")
	static int[] field137;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = -162929509
	)
	static int field138;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 1364539797
	)
	static int field139;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -256078627
	)
	static int field133;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 631010953
	)
	static int field141;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = -878878681
	)
	@Export("KeyHandler_idleCycles")
	public static volatile int KeyHandler_idleCycles;
	@ObfuscatedName("di")
	@Export("KeyHandler_keyCodes")
	static int[] KeyHandler_keyCodes;

	static {
		KeyHandler_instance = new KeyHandler(); // L: 14
		KeyHandler_pressedKeys = new boolean[112]; // L: 101
		field128 = new boolean[112]; // L: 102
		field126 = new boolean[112]; // L: 103
		field130 = new int[128]; // L: 106
		field149 = 0; // L: 107
		field132 = 0; // L: 108
		field125 = new char[128]; // L: 109
		field144 = new int[128]; // L: 110
		field135 = new int[128]; // L: 111
		field136 = 0; // L: 112
		field137 = new int[128]; // L: 113
		field138 = 0; // L: 114
		field139 = 0; // L: 115
		field133 = 0; // L: 116
		field141 = 0; // L: 117
		KeyHandler_idleCycles = 0; // L: 118
		KeyHandler_keyCodes = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}; // L: 119
	}

	KeyHandler() {
	} // L: 121

	public final void keyTyped(KeyEvent var1) {
		if (KeyHandler_instance != null) { // L: 221
			char var2 = var1.getKeyChar(); // L: 222
			if (var2 != 0 && var2 != '\uffff' && class16.method204(var2)) { // L: 223
				int var3 = field133 + 1 & 127; // L: 224
				if (var3 != field139) { // L: 225
					field144[field133] = -1; // L: 226
					field125[field133] = var2; // L: 227
					field133 = var3; // L: 228
				}
			}
		}

		var1.consume(); // L: 232
	} // L: 233

	public final synchronized void keyReleased(KeyEvent var1) {
		if (KeyHandler_instance != null) { // L: 207
			int var2 = var1.getKeyCode(); // L: 208
			if (var2 >= 0 && var2 < KeyHandler_keyCodes.length) { // L: 209
				var2 = KeyHandler_keyCodes[var2] & -129;
			} else {
				var2 = -1; // L: 210
			}

			if (field132 >= 0 && var2 >= 0) { // L: 211
				field130[field132] = ~var2; // L: 212
				field132 = field132 + 1 & 127; // L: 213
				if (field132 == field149) { // L: 214
					field132 = -1;
				}
			}
		}

		var1.consume(); // L: 217
	} // L: 218

	public final synchronized void focusLost(FocusEvent var1) {
		if (KeyHandler_instance != null) { // L: 269
			field132 = -1; // L: 270
		}

	} // L: 272

	public final synchronized void keyPressed(KeyEvent var1) {
		if (KeyHandler_instance != null) { // L: 179
			int var2 = var1.getKeyCode(); // L: 180
			if (var2 >= 0 && var2 < KeyHandler_keyCodes.length) { // L: 181
				var2 = KeyHandler_keyCodes[var2]; // L: 182
				if ((var2 & 128) != 0) { // L: 183
					var2 = -1;
				}
			} else {
				var2 = -1; // L: 185
			}

			if (field132 >= 0 && var2 >= 0) { // L: 186
				field130[field132] = var2; // L: 187
				field132 = field132 + 1 & 127; // L: 188
				if (field149 == field132) { // L: 189
					field132 = -1;
				}
			}

			int var3;
			if (var2 >= 0) { // L: 191
				var3 = field133 + 1 & 127; // L: 192
				if (var3 != field139) { // L: 193
					field144[field133] = var2; // L: 194
					field125[field133] = 0; // L: 195
					field133 = var3; // L: 196
				}
			}

			var3 = var1.getModifiers(); // L: 199
			if ((var3 & 10) != 0 || var2 == 85 || var2 == 10) { // L: 200
				var1.consume(); // L: 201
			}
		}

	} // L: 204

	public final void focusGained(FocusEvent var1) {
	} // L: 266

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Lfs;",
		garbageValue = "488353523"
	)
	public static FloorUnderlayDefinition method328(int var0) {
		FloorUnderlayDefinition var1 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var0); // L: 25
		if (var1 != null) { // L: 26
			return var1;
		} else {
			byte[] var2 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var0); // L: 27
			var1 = new FloorUnderlayDefinition(); // L: 28
			if (var2 != null) { // L: 29
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode(); // L: 30
			FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var1, (long)var0); // L: 31
			return var1; // L: 32
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lkn;IIII)V",
		garbageValue = "-107406302"
	)
	@Export("Widget_setKeyRate")
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field3439 == null) { // L: 1023
			throw new RuntimeException(); // L: 1024
		} else {
			var0.field3439[var1] = var2; // L: 1026
			var0.field3410[var1] = var3; // L: 1027
		}
	} // L: 1028

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1819714481"
	)
	@Export("setTapToDrop")
	static void setTapToDrop(boolean var0) {
		Client.tapToDrop = var0; // L: 10760
	} // L: 10761
}
