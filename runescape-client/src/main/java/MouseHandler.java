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

@ObfuscatedName("bo")
@Implements("MouseHandler")
public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lbo;"
	)
	@Export("KeyHandler_instance")
	public static MouseHandler KeyHandler_instance;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 127810343
	)
	@Export("MouseHandler_idleCycles")
	public static volatile int MouseHandler_idleCycles;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1776330505
	)
	@Export("MouseHandler_currentButtonVolatile")
	public static volatile int MouseHandler_currentButtonVolatile;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -244485919
	)
	@Export("MouseHandler_xVolatile")
	public static volatile int MouseHandler_xVolatile;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1356861467
	)
	@Export("MouseHandler_yVolatile")
	public static volatile int MouseHandler_yVolatile;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		longValue = 1981186985506618447L
	)
	@Export("MouseHandler_lastMovedVolatile")
	public static volatile long MouseHandler_lastMovedVolatile;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1755222459
	)
	@Export("MouseHandler_currentButton")
	public static int MouseHandler_currentButton;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -88003869
	)
	@Export("MouseHandler_x")
	public static int MouseHandler_x;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1549057161
	)
	@Export("MouseHandler_y")
	public static int MouseHandler_y;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		longValue = 7039609650084159883L
	)
	@Export("MouseHandler_millis")
	public static long MouseHandler_millis;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -825876399
	)
	@Export("MouseHandler_lastButtonVolatile")
	public static volatile int MouseHandler_lastButtonVolatile;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1902271323
	)
	@Export("MouseHandler_lastPressedXVolatile")
	public static volatile int MouseHandler_lastPressedXVolatile;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1896193233
	)
	@Export("MouseHandler_lastPressedYVolatile")
	public static volatile int MouseHandler_lastPressedYVolatile;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		longValue = 1323004104941016779L
	)
	@Export("MouseHandler_lastPressedTimeMillisVolatile")
	public static volatile long MouseHandler_lastPressedTimeMillisVolatile;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 74684457
	)
	@Export("MouseHandler_lastButton")
	public static int MouseHandler_lastButton;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1926960295
	)
	@Export("MouseHandler_lastPressedX")
	public static int MouseHandler_lastPressedX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -753128845
	)
	@Export("MouseHandler_lastPressedY")
	public static int MouseHandler_lastPressedY;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = -4410833555542005779L
	)
	@Export("MouseHandler_lastPressedTimeMillis")
	public static long MouseHandler_lastPressedTimeMillis;
	@ObfuscatedName("by")
	static String field234;

	static {
		KeyHandler_instance = new MouseHandler(); // L: 15
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;B)I",
		garbageValue = "0"
	)
	@Export("getButton")
	final int getButton(MouseEvent var1) {
		int var2 = var1.getButton(); // L: 47
		if (!var1.isAltDown() && var2 != 2) { // L: 48
			return !var1.isMetaDown() && var2 != 3 ? 1 : 2; // L: 49 50
		} else {
			return 4;
		}
	}

	public final synchronized void mouseMoved(MouseEvent var1) {
		if (KeyHandler_instance != null) { // L: 95
			MouseHandler_idleCycles = 0; // L: 96
			MouseHandler_xVolatile = var1.getX(); // L: 97
			MouseHandler_yVolatile = var1.getY(); // L: 98
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 99
		}

	} // L: 101

	public final synchronized void focusLost(FocusEvent var1) {
		if (KeyHandler_instance != null) { // L: 106
			MouseHandler_currentButtonVolatile = 0;
		}

	} // L: 107

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) { // L: 74
			var1.consume();
		}

	} // L: 75

	public final synchronized void mouseExited(MouseEvent var1) {
		if (KeyHandler_instance != null) { // L: 82
			MouseHandler_idleCycles = 0; // L: 83
			MouseHandler_xVolatile = -1; // L: 84
			MouseHandler_yVolatile = -1; // L: 85
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 86
		}

	} // L: 88

	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1); // L: 91
	} // L: 92

	public final void focusGained(FocusEvent var1) {
	} // L: 103

	public final synchronized void mouseReleased(MouseEvent var1) {
		if (KeyHandler_instance != null) { // L: 66
			MouseHandler_idleCycles = 0; // L: 67
			MouseHandler_currentButtonVolatile = 0; // L: 68
		}

		if (var1.isPopupTrigger()) { // L: 70
			var1.consume();
		}

	} // L: 71

	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1); // L: 78
	} // L: 79

	public final synchronized void mousePressed(MouseEvent var1) {
		if (KeyHandler_instance != null) { // L: 54
			MouseHandler_idleCycles = 0; // L: 55
			MouseHandler_lastPressedXVolatile = var1.getX(); // L: 56
			MouseHandler_lastPressedYVolatile = var1.getY(); // L: 57
			MouseHandler_lastPressedTimeMillisVolatile = class113.method2835(); // L: 58
			MouseHandler_lastButtonVolatile = this.getButton(var1); // L: 59
			if (MouseHandler_lastButtonVolatile != 0) { // L: 60
				MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
			}
		}

		if (var1.isPopupTrigger()) { // L: 62
			var1.consume();
		}

	} // L: 63
}
