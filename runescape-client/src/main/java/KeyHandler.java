import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("i")
@Implements("KeyHandler")
public final class KeyHandler implements KeyListener, FocusListener {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Li;"
	)
	@Export("KeyHandler_instance")
	static KeyHandler KeyHandler_instance;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 296755381
	)
	@Export("cacheGamebuild")
	public static int cacheGamebuild;
	@ObfuscatedName("ca")
	@Export("KeyHandler_pressedKeys")
	public static boolean[] KeyHandler_pressedKeys;
	@ObfuscatedName("cq")
	static boolean[] field137;
	@ObfuscatedName("cy")
	static boolean[] field138;
	@ObfuscatedName("cr")
	static int[] field139;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -778276169
	)
	static int field140;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 1985602505
	)
	static int field141;
	@ObfuscatedName("cn")
	static char[] field136;
	@ObfuscatedName("cu")
	static int[] field128;
	@ObfuscatedName("ce")
	public static int[] field146;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = 2097402935
	)
	public static int field131;
	@ObfuscatedName("cx")
	static int[] field135;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 1733509137
	)
	static int field142;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 174422755
	)
	static int field148;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 492211331
	)
	static int field144;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 251949657
	)
	static int field150;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = -1218651113
	)
	@Export("KeyHandler_idleCycles")
	public static volatile int KeyHandler_idleCycles;
	@ObfuscatedName("dc")
	@Export("KeyHandler_keyCodes")
	static int[] KeyHandler_keyCodes;

	static {
		KeyHandler_instance = new KeyHandler(); // L: 14
		KeyHandler_pressedKeys = new boolean[112]; // L: 101
		field137 = new boolean[112]; // L: 102
		field138 = new boolean[112]; // L: 103
		field139 = new int[128]; // L: 106
		field140 = 0; // L: 107
		field141 = 0; // L: 108
		field136 = new char[128]; // L: 109
		field128 = new int[128]; // L: 110
		field146 = new int[128]; // L: 111
		field131 = 0; // L: 112
		field135 = new int[128]; // L: 113
		field142 = 0; // L: 114
		field148 = 0; // L: 115
		field144 = 0; // L: 116
		field150 = 0; // L: 117
		KeyHandler_idleCycles = 0; // L: 118
		KeyHandler_keyCodes = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}; // L: 119
	}

	KeyHandler() {
	} // L: 121

	public final synchronized void keyPressed(KeyEvent var1) {
		if (KeyHandler_instance != null) { // L: 187
			int var2 = var1.getKeyCode(); // L: 188
			if (var2 >= 0 && var2 < KeyHandler_keyCodes.length) { // L: 189
				var2 = KeyHandler_keyCodes[var2]; // L: 190
				if ((var2 & 128) != 0) { // L: 191
					var2 = -1;
				}
			} else {
				var2 = -1; // L: 193
			}

			if (field141 >= 0 && var2 >= 0) { // L: 194
				field139[field141] = var2; // L: 195
				field141 = field141 + 1 & 127; // L: 196
				if (field140 == field141) { // L: 197
					field141 = -1;
				}
			}

			int var3;
			if (var2 >= 0) { // L: 199
				var3 = field144 + 1 & 127; // L: 200
				if (var3 != field148) { // L: 201
					field128[field144] = var2; // L: 202
					field136[field144] = 0; // L: 203
					field144 = var3; // L: 204
				}
			}

			var3 = var1.getModifiers(); // L: 207
			if ((var3 & 10) != 0 || var2 == 85 || var2 == 10) { // L: 208
				var1.consume(); // L: 209
			}
		}

	} // L: 212

	public final synchronized void keyReleased(KeyEvent var1) {
		if (KeyHandler_instance != null) { // L: 215
			int var2 = var1.getKeyCode(); // L: 216
			if (var2 >= 0 && var2 < KeyHandler_keyCodes.length) { // L: 217
				var2 = KeyHandler_keyCodes[var2] & -129;
			} else {
				var2 = -1; // L: 218
			}

			if (field141 >= 0 && var2 >= 0) { // L: 219
				field139[field141] = ~var2; // L: 220
				field141 = field141 + 1 & 127; // L: 221
				if (field141 == field140) { // L: 222
					field141 = -1;
				}
			}
		}

		var1.consume(); // L: 225
	} // L: 226

	public final void keyTyped(KeyEvent var1) {
		if (KeyHandler_instance != null) { // L: 229
			char var2 = var1.getKeyChar(); // L: 230
			if (var2 != 0 && var2 != '\uffff' && class120.method2821(var2)) { // L: 231
				int var3 = field144 + 1 & 127; // L: 232
				if (var3 != field148) { // L: 233
					field128[field144] = -1; // L: 234
					field136[field144] = var2; // L: 235
					field144 = var3; // L: 236
				}
			}
		}

		var1.consume(); // L: 240
	} // L: 241

	public final void focusGained(FocusEvent var1) {
	} // L: 274

	public final synchronized void focusLost(FocusEvent var1) {
		if (KeyHandler_instance != null) { // L: 277
			field141 = -1; // L: 278
		}

	} // L: 280

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1269206482"
	)
	public static void method314(int var0) {
		if (class273.musicPlayerStatus != 0) { // L: 42
			class273.musicTrackVolume = var0;
		} else {
			class273.midiPcmStream.setPcmStreamVolume(var0); // L: 43
		}

	} // L: 44

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "0"
	)
	@Export("isCharPrintable")
	public static boolean isCharPrintable(char var0) {
		if (var0 >= ' ' && var0 <= '~') { // L: 181
			return true;
		} else if (var0 >= 160 && var0 <= 255) {
			return true; // L: 182
		} else {
			return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376; // L: 183
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "92"
	)
	@Export("runWidgetOnLoadListener")
	static void runWidgetOnLoadListener(int var0) {
		if (var0 != -1) { // L: 4982
			if (ReflectionCheck.loadInterface(var0)) { // L: 4983
				Widget[] var1 = Widget.Widget_interfaceComponents[var0]; // L: 4984

				for (int var2 = 0; var2 < var1.length; ++var2) { // L: 4985
					Widget var3 = var1[var2]; // L: 4986
					if (var3.onLoad != null) { // L: 4987
						ScriptEvent var4 = new ScriptEvent(); // L: 4988
						var4.widget = var3; // L: 4989
						var4.args = var3.onLoad; // L: 4990
						class228.runScript(var4, 5000000, 0); // L: 4991
					}
				}

			}
		}
	} // L: 4994

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1743014266"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) { // L: 3834
			class260.clientPreferences.method2311(!class260.clientPreferences.method2312()); // L: 3835
			if (class260.clientPreferences.method2312()) { // L: 3836
				FileSystem.addGameMessage(99, "", "Roofs are now all hidden"); // L: 3837
			} else {
				FileSystem.addGameMessage(99, "", "Roofs will only be removed selectively"); // L: 3840
			}
		}

		if (var0.equalsIgnoreCase("displayfps")) { // L: 3843
			class260.clientPreferences.method2369();
		}

		if (var0.equalsIgnoreCase("renderself")) { // L: 3844
			Client.renderSelf = !Client.renderSelf;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) {
			Client.showMouseOverText = !Client.showMouseOverText; // L: 3845
		}

		if (Client.staffModLevel >= 2) { // L: 3846
			if (var0.equalsIgnoreCase("errortest")) { // L: 3847
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) { // L: 3848
				class344.worldMap.showCoord = !class344.worldMap.showCoord;
			}

			if (var0.equalsIgnoreCase("fpson")) { // L: 3849
				class260.clientPreferences.method2338(true);
			}

			if (var0.equalsIgnoreCase("fpsoff")) { // L: 3850
				class260.clientPreferences.method2338(false);
			}

			if (var0.equalsIgnoreCase("gc")) {
				System.gc(); // L: 3851
			}

			if (var0.equalsIgnoreCase("clientdrop")) { // L: 3852
				UserComparator4.method2654();
			}
		}

		PacketBufferNode var1 = class433.getPacketBufferNode(ClientPacket.field2933, Client.packetWriter.isaacCipher); // L: 3855
		var1.packetBuffer.writeByte(var0.length() + 1); // L: 3856
		var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 3857
		Client.packetWriter.addNode(var1); // L: 3858
	} // L: 3859
}
