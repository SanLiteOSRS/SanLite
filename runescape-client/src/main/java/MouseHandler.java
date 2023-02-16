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

@ObfuscatedName("ax")
@Implements("MouseHandler")
public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	@Export("MouseHandler_instance")
	public static MouseHandler MouseHandler_instance;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -912265761
	)
	@Export("MouseHandler_idleCycles")
	public static volatile int MouseHandler_idleCycles;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1575282397
	)
	@Export("MouseHandler_currentButtonVolatile")
	static volatile int MouseHandler_currentButtonVolatile;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1059969675
	)
	@Export("MouseHandler_xVolatile")
	static volatile int MouseHandler_xVolatile;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1998720499
	)
	@Export("MouseHandler_yVolatile")
	static volatile int MouseHandler_yVolatile;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		longValue = 8611634018514314459L
	)
	@Export("MouseHandler_lastMovedVolatile")
	static volatile long MouseHandler_lastMovedVolatile;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1498866663
	)
	@Export("MouseHandler_x")
	public static int MouseHandler_x;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -384176359
	)
	@Export("MouseHandler_currentButton")
	public static int MouseHandler_currentButton;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -278205531
	)
	@Export("MouseHandler_y")
	public static int MouseHandler_y;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		longValue = 3571772717098428175L
	)
	@Export("MouseHandler_millis")
	public static long MouseHandler_millis;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1415622569
	)
	@Export("MouseHandler_lastButtonVolatile")
	static volatile int MouseHandler_lastButtonVolatile;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 623256745
	)
	@Export("MouseHandler_lastPressedXVolatile")
	static volatile int MouseHandler_lastPressedXVolatile;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1887239603
	)
	@Export("MouseHandler_lastPressedYVolatile")
	static volatile int MouseHandler_lastPressedYVolatile;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		longValue = 7328677094157922607L
	)
	@Export("MouseHandler_lastPressedTimeMillisVolatile")
	static volatile long MouseHandler_lastPressedTimeMillisVolatile;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 743788703
	)
	@Export("MouseHandler_lastButton")
	public static int MouseHandler_lastButton;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1894371577
	)
	@Export("MouseHandler_lastPressedX")
	public static int MouseHandler_lastPressedX;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 464680597
	)
	@Export("MouseHandler_lastPressedY")
	public static int MouseHandler_lastPressedY;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		longValue = 520159285792776095L
	)
	@Export("MouseHandler_lastPressedTimeMillis")
	public static long MouseHandler_lastPressedTimeMillis;
	@ObfuscatedName("ph")
	@ObfuscatedSignature(
		descriptor = "[Lkz;"
	)
	static Widget[] field262;

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

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;I)I",
		garbageValue = "-1007792141"
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
			MouseHandler_lastPressedTimeMillisVolatile = class153.method3317(); // L: 73
			MouseHandler_lastButtonVolatile = this.getButton(var1); // L: 74
			if (MouseHandler_lastButtonVolatile != 0) { // L: 75
				MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
			}
		}

		if (var1.isPopupTrigger()) { // L: 77
			var1.consume();
		}

	} // L: 78

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) { // L: 89
			var1.consume();
		}

	} // L: 90

	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1); // L: 93
	} // L: 94

	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1); // L: 106
	} // L: 107

	public final synchronized void focusLost(FocusEvent var1) {
		if (MouseHandler_instance != null) { // L: 121
			MouseHandler_currentButtonVolatile = 0;
		}

	} // L: 122

	public final synchronized void mouseExited(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 97
			MouseHandler_idleCycles = 0; // L: 98
			MouseHandler_xVolatile = -1; // L: 99
			MouseHandler_yVolatile = -1; // L: 100
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 101
		}

	} // L: 103

	public final synchronized void mouseReleased(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 81
			MouseHandler_idleCycles = 0; // L: 82
			MouseHandler_currentButtonVolatile = 0; // L: 83
		}

		if (var1.isPopupTrigger()) { // L: 85
			var1.consume();
		}

	} // L: 86

	public final void focusGained(FocusEvent var1) {
	} // L: 118
}
