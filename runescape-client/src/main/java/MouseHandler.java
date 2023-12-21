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

@ObfuscatedName("bp")
@Implements("MouseHandler")
public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lbp;"
	)
	@Export("MouseHandler_instance")
	public static MouseHandler MouseHandler_instance;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1953718231
	)
	@Export("MouseHandler_idleCycles")
	static volatile int MouseHandler_idleCycles;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 2084494689
	)
	@Export("MouseHandler_currentButtonVolatile")
	public static volatile int MouseHandler_currentButtonVolatile;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1039777345
	)
	@Export("MouseHandler_xVolatile")
	public static volatile int MouseHandler_xVolatile;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -2049825775
	)
	@Export("MouseHandler_yVolatile")
	public static volatile int MouseHandler_yVolatile;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		longValue = -1900724714987571041L
	)
	@Export("MouseHandler_lastMovedVolatile")
	public static volatile long MouseHandler_lastMovedVolatile;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -2023273643
	)
	@Export("MouseHandler_currentButton")
	public static int MouseHandler_currentButton;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -948387119
	)
	@Export("MouseHandler_x")
	public static int MouseHandler_x;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -357791911
	)
	@Export("MouseHandler_y")
	public static int MouseHandler_y;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		longValue = 3969876424504661119L
	)
	@Export("MouseHandler_millis")
	public static long MouseHandler_millis;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1660798155
	)
	@Export("MouseHandler_lastButtonVolatile")
	public static volatile int MouseHandler_lastButtonVolatile;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 720496543
	)
	@Export("MouseHandler_lastPressedXVolatile")
	public static volatile int MouseHandler_lastPressedXVolatile;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1036059975
	)
	@Export("MouseHandler_lastPressedYVolatile")
	public static volatile int MouseHandler_lastPressedYVolatile;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = -1184323502833097981L
	)
	@Export("MouseHandler_lastPressedTimeMillisVolatile")
	public static volatile long MouseHandler_lastPressedTimeMillisVolatile;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1454500269
	)
	@Export("MouseHandler_lastButton")
	public static int MouseHandler_lastButton;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1672841831
	)
	@Export("MouseHandler_lastPressedX")
	public static int MouseHandler_lastPressedX;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1663390927
	)
	@Export("MouseHandler_lastPressedY")
	public static int MouseHandler_lastPressedY;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = 5746421217152333253L
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;B)I",
		garbageValue = "115"
	)
	@Export("getButton")
	final int getButton(MouseEvent var1) {
		int var2 = var1.getButton(); // L: 52
		if (!var1.isAltDown() && var2 != 2) { // L: 53
			return !var1.isMetaDown() && var2 != 3 ? 1 : 2; // L: 54 55
		} else {
			return 4;
		}
	}

	public final synchronized void mouseMoved(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 100
			MouseHandler_idleCycles = 0; // L: 101
			MouseHandler_xVolatile = var1.getX(); // L: 102
			MouseHandler_yVolatile = var1.getY(); // L: 103
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 104
		}

	} // L: 106

	public final synchronized void mousePressed(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 59
			MouseHandler_idleCycles = 0; // L: 60
			MouseHandler_lastPressedXVolatile = var1.getX(); // L: 61
			MouseHandler_lastPressedYVolatile = var1.getY(); // L: 62
			MouseHandler_lastPressedTimeMillisVolatile = SpotAnimationDefinition.method3775(); // L: 63
			MouseHandler_lastButtonVolatile = this.getButton(var1); // L: 64
			if (MouseHandler_lastButtonVolatile != 0) { // L: 65
				MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
			}
		}

		if (var1.isPopupTrigger()) { // L: 67
			var1.consume();
		}

	} // L: 68

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1); // L: 96
	} // L: 97

	public final synchronized void mouseReleased(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 71
			MouseHandler_idleCycles = 0; // L: 72
			MouseHandler_currentButtonVolatile = 0; // L: 73
		}

		if (var1.isPopupTrigger()) { // L: 75
			var1.consume();
		}

	}

	public final synchronized void focusLost(FocusEvent var1) {
		if (MouseHandler_instance != null) { // L: 111
			MouseHandler_currentButtonVolatile = 0;
		}

	} // L: 112

	public final void focusGained(FocusEvent var1) {
	} // L: 108

	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1);
	} // L: 84

	public final synchronized void mouseExited(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0; // L: 88
			MouseHandler_xVolatile = -1; // L: 89
			MouseHandler_yVolatile = -1; // L: 90
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 91
		}

	} // L: 93

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-427551211"
	)
	static final void method670(int var0, int var1, int var2, int var3) {
		for (int var4 = var1; var4 <= var3 + var1; ++var4) { // L: 76
			for (int var5 = var0; var5 <= var0 + var2; ++var5) { // L: 77
				if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) { // L: 78
					class93.field1150[0][var5][var4] = 127; // L: 79
					if (var0 == var5 && var5 > 0) { // L: 80
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 - 1][var4];
					}

					if (var0 + var2 == var5 && var5 < 103) { // L: 81
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 + 1][var4];
					}

					if (var4 == var1 && var4 > 0) { // L: 82
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 - 1];
					}

					if (var3 + var1 == var4 && var4 < 103) { // L: 83
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 + 1];
					}
				}
			}
		}

	} // L: 87
}
