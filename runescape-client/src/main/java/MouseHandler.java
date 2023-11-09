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

@ObfuscatedName("ba")
@Implements("MouseHandler")
public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lba;"
	)
	@Export("KeyHandler_instance")
	public static MouseHandler KeyHandler_instance;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1987262087
	)
	@Export("MouseHandler_idleCycles")
	public static volatile int MouseHandler_idleCycles;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1385846391
	)
	@Export("MouseHandler_currentButtonVolatile")
	public static volatile int MouseHandler_currentButtonVolatile;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1511190679
	)
	@Export("MouseHandler_xVolatile")
	public static volatile int MouseHandler_xVolatile;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1489239099
	)
	@Export("MouseHandler_yVolatile")
	public static volatile int MouseHandler_yVolatile;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		longValue = -5981974476361673339L
	)
	@Export("MouseHandler_lastMovedVolatile")
	public static volatile long MouseHandler_lastMovedVolatile;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1610660239
	)
	@Export("MouseHandler_currentButton")
	public static int MouseHandler_currentButton;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1669207625
	)
	@Export("MouseHandler_x")
	public static int MouseHandler_x;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1454192657
	)
	@Export("MouseHandler_y")
	public static int MouseHandler_y;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		longValue = 3732620679591487245L
	)
	@Export("MouseHandler_millis")
	public static long MouseHandler_millis;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 803125775
	)
	@Export("MouseHandler_lastButtonVolatile")
	public static volatile int MouseHandler_lastButtonVolatile;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -881246975
	)
	@Export("MouseHandler_lastPressedXVolatile")
	public static volatile int MouseHandler_lastPressedXVolatile;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1882873589
	)
	@Export("MouseHandler_lastPressedYVolatile")
	public static volatile int MouseHandler_lastPressedYVolatile;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		longValue = -3087638509118740407L
	)
	@Export("MouseHandler_lastPressedTimeMillisVolatile")
	public static volatile long MouseHandler_lastPressedTimeMillisVolatile;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1984618151
	)
	@Export("MouseHandler_lastButton")
	public static int MouseHandler_lastButton;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1263219177
	)
	@Export("MouseHandler_lastPressedX")
	public static int MouseHandler_lastPressedX;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 449055161
	)
	@Export("MouseHandler_lastPressedY")
	public static int MouseHandler_lastPressedY;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		longValue = 5420353047671154647L
	)
	@Export("MouseHandler_lastPressedTimeMillis")
	public static long MouseHandler_lastPressedTimeMillis;

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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;I)I",
		garbageValue = "-1524282401"
	)
	@Export("getButton")
	final int getButton(MouseEvent var1) {
		int var2 = var1.getButton(); // L: 54
		if (!var1.isAltDown() && var2 != 2) { // L: 55
			return !var1.isMetaDown() && var2 != 3 ? 1 : 2; // L: 56 57
		} else {
			return 4;
		}
	}

	public final synchronized void mouseMoved(MouseEvent var1) {
		if (KeyHandler_instance != null) { // L: 102
			MouseHandler_idleCycles = 0; // L: 103
			MouseHandler_xVolatile = var1.getX(); // L: 104
			MouseHandler_yVolatile = var1.getY(); // L: 105
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 106
		}

	} // L: 108

	public final synchronized void focusLost(FocusEvent var1) {
		if (KeyHandler_instance != null) { // L: 113
			MouseHandler_currentButtonVolatile = 0;
		}

	} // L: 114

	public final synchronized void mousePressed(MouseEvent var1) {
		if (KeyHandler_instance != null) { // L: 61
			MouseHandler_idleCycles = 0; // L: 62
			MouseHandler_lastPressedXVolatile = var1.getX(); // L: 63
			MouseHandler_lastPressedYVolatile = var1.getY(); // L: 64
			MouseHandler_lastPressedTimeMillisVolatile = WorldMapSection2.method4844(); // L: 65
			MouseHandler_lastButtonVolatile = this.getButton(var1); // L: 66
			if (MouseHandler_lastButtonVolatile != 0) { // L: 67
				MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
			}
		}

		if (var1.isPopupTrigger()) { // L: 69
			var1.consume();
		}

	} // L: 70

	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1); // L: 85
	} // L: 86

	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1); // L: 98
	} // L: 99

	public final void focusGained(FocusEvent var1) {
	} // L: 110

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) { // L: 81
			var1.consume();
		}

	} // L: 82

	public final synchronized void mouseReleased(MouseEvent var1) {
		if (KeyHandler_instance != null) { // L: 73
			MouseHandler_idleCycles = 0; // L: 74
			MouseHandler_currentButtonVolatile = 0; // L: 75
		}

		if (var1.isPopupTrigger()) { // L: 77
			var1.consume();
		}

	} // L: 78

	public final synchronized void mouseExited(MouseEvent var1) {
		if (KeyHandler_instance != null) { // L: 89
			MouseHandler_idleCycles = 0; // L: 90
			MouseHandler_xVolatile = -1; // L: 91
			MouseHandler_yVolatile = -1; // L: 92
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 93
		}

	} // L: 95
}
