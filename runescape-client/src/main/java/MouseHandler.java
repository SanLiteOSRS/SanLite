import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bc")
@Implements("MouseHandler")
public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("MouseHandler_instance")
	public static MouseHandler MouseHandler_instance;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1241556291
	)
	@Export("MouseHandler_idleCycles")
	public static volatile int MouseHandler_idleCycles;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1009175581
	)
	@Export("MouseHandler_currentButtonVolatile")
	static volatile int MouseHandler_currentButtonVolatile;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 616173565
	)
	@Export("MouseHandler_xVolatile")
	static volatile int MouseHandler_xVolatile;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1364639539
	)
	@Export("MouseHandler_yVolatile")
	static volatile int MouseHandler_yVolatile;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		longValue = -3998240456014261811L
	)
	@Export("MouseHandler_lastMovedVolatile")
	static volatile long MouseHandler_lastMovedVolatile;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1232863589
	)
	@Export("MouseHandler_currentButton")
	public static int MouseHandler_currentButton;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 262655381
	)
	@Export("MouseHandler_x")
	public static int MouseHandler_x;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1563162299
	)
	@Export("MouseHandler_y")
	public static int MouseHandler_y;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		longValue = 8531755066699663123L
	)
	@Export("MouseHandler_millis")
	public static long MouseHandler_millis;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1429280745
	)
	@Export("MouseHandler_lastButtonVolatile")
	static volatile int MouseHandler_lastButtonVolatile;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 763335877
	)
	@Export("MouseHandler_lastPressedXVolatile")
	static volatile int MouseHandler_lastPressedXVolatile;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1707693647
	)
	@Export("MouseHandler_lastPressedYVolatile")
	static volatile int MouseHandler_lastPressedYVolatile;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		longValue = -1551923122111327315L
	)
	@Export("MouseHandler_lastPressedTimeMillisVolatile")
	static volatile long MouseHandler_lastPressedTimeMillisVolatile;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1090072285
	)
	@Export("MouseHandler_lastButton")
	public static int MouseHandler_lastButton;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1193115631
	)
	@Export("MouseHandler_lastPressedX")
	public static int MouseHandler_lastPressedX;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 174236443
	)
	@Export("MouseHandler_lastPressedY")
	public static int MouseHandler_lastPressedY;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = 1015431049649184245L
	)
	@Export("MouseHandler_lastPressedTimeMillis")
	public static long MouseHandler_lastPressedTimeMillis;

	static {
		MouseHandler_instance = new MouseHandler(); // L: 15
		MouseHandler_idleCycles = 0; // L: 16
		MouseHandler_currentButtonVolatile = 0; // L: 17
		MouseHandler_xVolatile = -1; // L: 18
		MouseHandler_yVolatile = -1; // L: 19
		MouseHandler_lastMovedVolatile = -1L; // L: 20
		MouseHandler_currentButton = 0; // L: 21
		MouseHandler_x = 0; // L: 22
		MouseHandler_y = 0; // L: 23
		MouseHandler_millis = 0L; // L: 24
		MouseHandler_lastButtonVolatile = 0; // L: 25
		MouseHandler_lastPressedXVolatile = 0; // L: 26
		MouseHandler_lastPressedYVolatile = 0; // L: 27
		MouseHandler_lastPressedTimeMillisVolatile = 0L; // L: 28
		MouseHandler_lastButton = 0; // L: 29
		MouseHandler_lastPressedX = 0; // L: 30
		MouseHandler_lastPressedY = 0; // L: 31
		MouseHandler_lastPressedTimeMillis = 0L; // L: 32
	}

	MouseHandler() {
	} // L: 34

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;B)I",
		garbageValue = "32"
	)
	@Export("getButton")
	final int getButton(MouseEvent var1) {
		int var2 = var1.getButton(); // L: 62
		if (!var1.isAltDown() && var2 != 2) { // L: 63
			return !var1.isMetaDown() && var2 != 3 ? 1 : 2; // L: 64 65
		} else {
			return 4;
		}
	}

	public final synchronized void mouseMoved(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 110
			MouseHandler_idleCycles = 0; // L: 111
			MouseHandler_xVolatile = var1.getX(); // L: 112
			MouseHandler_yVolatile = var1.getY(); // L: 113
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 114
		}

	} // L: 116

	public final synchronized void mousePressed(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 69
			MouseHandler_idleCycles = 0; // L: 70
			MouseHandler_lastPressedXVolatile = var1.getX(); // L: 71
			MouseHandler_lastPressedYVolatile = var1.getY(); // L: 72
			MouseHandler_lastPressedTimeMillisVolatile = UserComparator9.method2973(); // L: 73
			MouseHandler_lastButtonVolatile = this.getButton(var1); // L: 74
			if (MouseHandler_lastButtonVolatile != 0) { // L: 75
				MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
			}
		}

		if (var1.isPopupTrigger()) { // L: 77
			var1.consume();
		}

	} // L: 78

	public final synchronized void mouseReleased(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 81
			MouseHandler_idleCycles = 0; // L: 82
			MouseHandler_currentButtonVolatile = 0; // L: 83
		}

		if (var1.isPopupTrigger()) { // L: 85
			var1.consume();
		}

	} // L: 86

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) { // L: 89
			var1.consume();
		}

	} // L: 90

	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1); // L: 93
	} // L: 94

	public final synchronized void mouseExited(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 97
			MouseHandler_idleCycles = 0; // L: 98
			MouseHandler_xVolatile = -1; // L: 99
			MouseHandler_yVolatile = -1; // L: 100
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 101
		}

	} // L: 103

	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1); // L: 106
	} // L: 107

	public final synchronized void focusLost(FocusEvent var1) {
		if (MouseHandler_instance != null) { // L: 121
			MouseHandler_currentButtonVolatile = 0;
		}

	} // L: 122

	public final void focusGained(FocusEvent var1) {
	} // L: 118

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "-1527847870"
	)
	static int method721(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 1045
			var0 -= 1000; // L: 1046
			var3 = class380.field4414.method6348(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]); // L: 1047
		} else {
			var3 = var2 ? class31.scriptDotWidget : class185.field1932; // L: 1049
		}

		FaceNormal.invalidateWidget(var3); // L: 1050
		int var4;
		int var5;
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) { // L: 1051
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) { // L: 1071
				var3.modelType = 2; // L: 1072
				var3.modelId = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 1073
				return 1; // L: 1074
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) { // L: 1076
				var3.modelType = 3; // L: 1077
				var3.modelId = class25.localPlayer.appearance.getChatHeadId(); // L: 1078
				return 1; // L: 1079
			} else if (var0 == 1207) { // L: 1081
				boolean var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 1082
				NPC.method2717(var3, class25.localPlayer.appearance, var7); // L: 1083
				return 1; // L: 1084
			} else if (var0 == 1208) { // L: 1086
				var4 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 1087
				if (var3.field3759 == null) { // L: 1088
					throw new RuntimeException(""); // L: 1089
				} else {
					PendingSpawn.method2448(var3, var4); // L: 1091
					return 1; // L: 1092
				}
			} else if (var0 == 1209) { // L: 1094
				UserComparator6.Interpreter_intStackSize -= 2; // L: 1095
				var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 1096
				var5 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 1097
				if (var3.field3759 == null) { // L: 1098
					throw new RuntimeException(""); // L: 1099
				} else {
					class128.method3070(var3, var4, var5); // L: 1101
					return 1; // L: 1102
				}
			} else if (var0 == 1210) { // L: 1104
				var4 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 1105
				if (var3.field3759 == null) { // L: 1106
					throw new RuntimeException(""); // L: 1107
				} else {
					MidiPcmStream.method6132(var3, class25.localPlayer.appearance.field3640, var4); // L: 1109
					return 1; // L: 1110
				}
			} else {
				return 2; // L: 1112
			}
		} else {
			UserComparator6.Interpreter_intStackSize -= 2; // L: 1052
			var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 1053
			var5 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 1054
			var3.itemId = var4; // L: 1055
			var3.itemQuantity = var5; // L: 1056
			ItemComposition var6 = class341.ItemComposition_get(var4); // L: 1057
			var3.modelAngleX = var6.xan2d; // L: 1058
			var3.modelAngleY = var6.yan2d; // L: 1059
			var3.modelAngleZ = var6.zan2d; // L: 1060
			var3.modelOffsetX = var6.offsetX2d; // L: 1061
			var3.modelOffsetY = var6.offsetY2d; // L: 1062
			var3.modelZoom = var6.zoom2d; // L: 1063
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) { // L: 1064
				var3.itemQuantityMode = 0;
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | var6.isStackable == 1) { // L: 1065
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2; // L: 1066
			}

			if (var3.field3785 > 0) { // L: 1067
				var3.modelZoom = var3.modelZoom * 32 / var3.field3785;
			} else if (var3.rawWidth > 0) { // L: 1068
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1; // L: 1069
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "240657955"
	)
	static boolean method706(char var0) {
		return "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var0) != -1; // L: 1199
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-609311651"
	)
	public static void method720() {
		NPCComposition.NpcDefinition_cached.clear(); // L: 359
		NPCComposition.HitSplatDefinition_cachedFonts.clear(); // L: 360
	} // L: 361

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "70"
	)
	static final int method719(int var0, int var1) {
		if (var0 == -1) { // L: 1021
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 1022
			if (var1 < 2) { // L: 1023
				var1 = 2;
			} else if (var1 > 126) { // L: 1024
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 1025
		}
	}

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1098166292"
	)
	static void method716() {
		Client.packetWriter.clearBuffer(); // L: 2738
		Client.packetWriter.packetBuffer.offset = 0; // L: 2739
		Client.packetWriter.serverPacket = null; // L: 2740
		Client.packetWriter.field1402 = null; // L: 2741
		Client.packetWriter.field1411 = null; // L: 2742
		Client.packetWriter.field1407 = null; // L: 2743
		Client.packetWriter.serverPacketLength = 0; // L: 2744
		Client.packetWriter.field1399 = 0; // L: 2745
		Client.rebootTimer = 0; // L: 2746
		class16.method219(); // L: 2747
		Client.minimapState = 0; // L: 2748
		Client.destinationX = 0; // L: 2749

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) { // L: 2750
			Client.players[var0] = null;
		}

		class25.localPlayer = null; // L: 2751

		for (var0 = 0; var0 < Client.npcs.length; ++var0) { // L: 2752
			NPC var1 = Client.npcs[var0]; // L: 2753
			if (var1 != null) { // L: 2754
				var1.targetIndex = -1; // L: 2755
				var1.false0 = false; // L: 2756
			}
		}

		class10.method89(); // L: 2759
		class131.method3087(30); // L: 2760

		for (var0 = 0; var0 < 100; ++var0) { // L: 2761
			Client.field720[var0] = true;
		}

		Calendar.method6881(); // L: 2762
	} // L: 2763
}
