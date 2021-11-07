import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("f")
@Implements("KeyHandler")
public final class KeyHandler implements KeyListener, FocusListener {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lf;"
	)
	@Export("KeyHandler_instance")
	public static KeyHandler KeyHandler_instance;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -63939899
	)
	@Export("canvasHeight")
	public static int canvasHeight;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "[Loe;"
	)
	@Export("worldSelectStars")
	static IndexedSprite[] worldSelectStars;
	@ObfuscatedName("cl")
	@Export("KeyHandler_pressedKeys")
	public static boolean[] KeyHandler_pressedKeys;
	@ObfuscatedName("cs")
	public static boolean[] field118;
	@ObfuscatedName("ce")
	public static boolean[] field119;
	@ObfuscatedName("cw")
	public static int[] field120;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 1842279411
	)
	public static int field133;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 1242888699
	)
	public static int field122;
	@ObfuscatedName("cc")
	static char[] field112;
	@ObfuscatedName("ch")
	static int[] field124;
	@ObfuscatedName("cz")
	public static int[] field125;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -1596071901
	)
	public static int field110;
	@ObfuscatedName("cf")
	public static int[] field127;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 480310243
	)
	public static int field135;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -1155674015
	)
	public static int field107;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 850126411
	)
	public static int field130;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -253664609
	)
	public static int field131;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = -442212747
	)
	@Export("KeyHandler_idleCycles")
	public static volatile int KeyHandler_idleCycles;
	@ObfuscatedName("df")
	@Export("KeyHandler_keyCodes")
	static int[] KeyHandler_keyCodes;

	static {
		KeyHandler_instance = new KeyHandler();
		KeyHandler_pressedKeys = new boolean[112];
		field118 = new boolean[112];
		field119 = new boolean[112];
		field120 = new int[128];
		field133 = 0;
		field122 = 0;
		field112 = new char[128];
		field124 = new int[128];
		field125 = new int[128];
		field110 = 0;
		field127 = new int[128];
		field135 = 0;
		field107 = 0;
		field130 = 0;
		field131 = 0;
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

			if (field122 >= 0 && var2 >= 0) {
				field120[field122] = var2;
				field122 = field122 + 1 & 127;
				if (field133 == field122) {
					field122 = -1;
				}
			}

			int var3;
			if (var2 >= 0) {
				var3 = field130 + 1 & 127;
				if (var3 != field107) {
					field124[field130] = var2;
					field112[field130] = 0;
					field130 = var3;
				}
			}

			var3 = var1.getModifiers();
			if ((var3 & 10) != 0 || var2 == 85 || var2 == 10) {
				var1.consume();
			}
		}

	}

	public final void keyTyped(KeyEvent var1) {
		if (KeyHandler_instance != null) {
			char var2 = var1.getKeyChar();
			if (var2 != 0 && var2 != '\uffff') {
				boolean var3;
				if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
					var3 = true;
				} else {
					label57: {
						if (var2 != 0) {
							char[] var4 = class316.cp1252AsciiExtension;

							for (int var5 = 0; var5 < var4.length; ++var5) {
								char var6 = var4[var5];
								if (var6 == var2) {
									var3 = true;
									break label57;
								}
							}
						}

						var3 = false;
					}
				}

				if (var3) {
					int var7 = field130 + 1 & 127;
					if (var7 != field107) {
						field124[field130] = -1;
						field112[field130] = var2;
						field130 = var7;
					}
				}
			}
		}

		var1.consume();
	}

	public final synchronized void keyReleased(KeyEvent var1) {
		if (KeyHandler_instance != null) {
			int var2 = var1.getKeyCode();
			if (var2 >= 0 && var2 < KeyHandler_keyCodes.length) {
				var2 = KeyHandler_keyCodes[var2] & -129;
			} else {
				var2 = -1;
			}

			if (field122 >= 0 && var2 >= 0) {
				field120[field122] = ~var2;
				field122 = field122 + 1 & 127;
				if (field133 == field122) {
					field122 = -1;
				}
			}
		}

		var1.consume();
	}

	public final void focusGained(FocusEvent var1) {
	}

	public final synchronized void focusLost(FocusEvent var1) {
		if (KeyHandler_instance != null) {
			field122 = -1;
		}

	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1565672135"
	)
	static final void method324(String var0) {
		StringBuilder var10000 = new StringBuilder();
		Object var10001 = null;
		var10000 = var10000.append("Please remove ").append(var0);
		var10001 = null;
		String var1 = var10000.append(" from your friend list first").toString();
		class397.addGameMessage(30, "", var1);
	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-180723004"
	)
	static void method343() {
		Client.menuOptionsCount = 0;
		Client.isMenuOpen = false;
	}

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "1258527468"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase();
		short[] var2 = new short[16];
		int var3 = 0;

		for (int var4 = 0; var4 < class129.ItemDefinition_fileCount; ++var4) {
			ItemComposition var9 = TaskHandler.ItemDefinition_get(var4);
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) {
				if (var3 >= 250) {
					Skeleton.foundItemIdCount = -1;
					Language.foundItemIds = null;
					return;
				}

				if (var3 >= var2.length) {
					short[] var6 = new short[var2.length * 2];

					for (int var7 = 0; var7 < var3; ++var7) {
						var6[var7] = var2[var7];
					}

					var2 = var6;
				}

				var2[var3++] = (short)var4;
			}
		}

		Language.foundItemIds = var2;
		ClanSettings.foundItemIndex = 0;
		Skeleton.foundItemIdCount = var3;
		String[] var8 = new String[Skeleton.foundItemIdCount];

		for (int var5 = 0; var5 < Skeleton.foundItemIdCount; ++var5) {
			var8[var5] = TaskHandler.ItemDefinition_get(var2[var5]).name;
		}

		class361.method6427(var8, Language.foundItemIds);
	}
}
