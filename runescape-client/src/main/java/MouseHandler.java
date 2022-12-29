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

@ObfuscatedName("ab")
@Implements("MouseHandler")
public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -467089053
	)
	@Export("MouseHandler_y")
	public static int MouseHandler_y;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lab;"
	)
	@Export("MouseHandler_instance")
	public static MouseHandler MouseHandler_instance;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -666107829
	)
	@Export("MouseHandler_idleCycles")
	public static volatile int MouseHandler_idleCycles;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1780151387
	)
	@Export("MouseHandler_currentButtonVolatile")
	public static volatile int MouseHandler_currentButtonVolatile;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -178516955
	)
	@Export("MouseHandler_xVolatile")
	public static volatile int MouseHandler_xVolatile;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1239267453
	)
	@Export("MouseHandler_yVolatile")
	public static volatile int MouseHandler_yVolatile;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		longValue = 4716901357680916313L
	)
	@Export("MouseHandler_lastMovedVolatile")
	public static volatile long MouseHandler_lastMovedVolatile;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1144336295
	)
	@Export("MouseHandler_currentButton")
	public static int MouseHandler_currentButton;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1055725291
	)
	@Export("MouseHandler_x")
	public static int MouseHandler_x;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		longValue = 1841814800481912317L
	)
	@Export("MouseHandler_millis")
	public static long MouseHandler_millis;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1359580461
	)
	@Export("MouseHandler_lastButtonVolatile")
	public static volatile int MouseHandler_lastButtonVolatile;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1431798489
	)
	@Export("MouseHandler_lastPressedXVolatile")
	public static volatile int MouseHandler_lastPressedXVolatile;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -231426227
	)
	@Export("MouseHandler_lastPressedYVolatile")
	public static volatile int MouseHandler_lastPressedYVolatile;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		longValue = -1319422683492569027L
	)
	@Export("MouseHandler_lastPressedTimeMillisVolatile")
	public static volatile long MouseHandler_lastPressedTimeMillisVolatile;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1573473759
	)
	@Export("MouseHandler_lastButton")
	public static int MouseHandler_lastButton;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1391909665
	)
	@Export("MouseHandler_lastPressedX")
	public static int MouseHandler_lastPressedX;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -255937079
	)
	@Export("MouseHandler_lastPressedY")
	public static int MouseHandler_lastPressedY;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = -3284909752288296989L
	)
	@Export("MouseHandler_lastPressedTimeMillis")
	public static long MouseHandler_lastPressedTimeMillis;
	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "[Lrx;"
	)
	@Export("crossSprites")
	static SpritePixels[] crossSprites;
	@ObfuscatedName("nb")
	@ObfuscatedGetter(
		intValue = -1112640559
	)
	@Export("menuHeight")
	static int menuHeight;
	@ObfuscatedName("pr")
	@ObfuscatedSignature(
		descriptor = "[Lkd;"
	)
	static Widget[] field268;

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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;B)I",
		garbageValue = "116"
	)
	@Export("getButton")
	final int getButton(MouseEvent var1) {
		int var2 = var1.getButton(); // L: 48
		if (!var1.isAltDown() && var2 != 2) { // L: 49
			return !var1.isMetaDown() && var2 != 3 ? 1 : 2; // L: 50 51
		} else {
			return 4;
		}
	}

	public final synchronized void mouseMoved(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 96
			MouseHandler_idleCycles = 0; // L: 97
			MouseHandler_xVolatile = var1.getX(); // L: 98
			MouseHandler_yVolatile = var1.getY(); // L: 99
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 100
		}

	} // L: 102

	public final void focusGained(FocusEvent var1) {
	} // L: 104

	public final synchronized void mouseReleased(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 67
			MouseHandler_idleCycles = 0; // L: 68
			MouseHandler_currentButtonVolatile = 0; // L: 69
		}

		if (var1.isPopupTrigger()) { // L: 71
			var1.consume();
		}

	} // L: 72

	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1); // L: 79
	} // L: 80

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) { // L: 75
			var1.consume();
		}

	} // L: 76

	public final synchronized void mouseExited(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 83
			MouseHandler_idleCycles = 0; // L: 84
			MouseHandler_xVolatile = -1; // L: 85
			MouseHandler_yVolatile = -1; // L: 86
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 87
		}

	} // L: 89

	public final synchronized void focusLost(FocusEvent var1) {
		if (MouseHandler_instance != null) { // L: 107
			MouseHandler_currentButtonVolatile = 0;
		}

	} // L: 108

	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1); // L: 92
	} // L: 93

	public final synchronized void mousePressed(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 55
			MouseHandler_idleCycles = 0; // L: 56
			MouseHandler_lastPressedXVolatile = var1.getX(); // L: 57
			MouseHandler_lastPressedYVolatile = var1.getY(); // L: 58
			MouseHandler_lastPressedTimeMillisVolatile = Message.method1197(); // L: 59
			MouseHandler_lastButtonVolatile = this.getButton(var1); // L: 60
			if (MouseHandler_lastButtonVolatile != 0) { // L: 61
				MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
			}
		}

		if (var1.isPopupTrigger()) { // L: 63
			var1.consume();
		}

	} // L: 64

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)I",
		garbageValue = "-23"
	)
	static final int method700(int var0, int var1, int var2, int var3) {
		int var4 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var2 * 1024 / var3] >> 1; // L: 997
		return ((65536 - var4) * var0 >> 16) + (var4 * var1 >> 16); // L: 998
	}
}
