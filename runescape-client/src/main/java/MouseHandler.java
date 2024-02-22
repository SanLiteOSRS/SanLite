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

@ObfuscatedName("bw")
@Implements("MouseHandler")
public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lbw;"
	)
	@Export("MouseHandler_instance")
	public static MouseHandler MouseHandler_instance;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -2058488119
	)
	@Export("MouseHandler_idleCycles")
	public static volatile int MouseHandler_idleCycles;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1447194213
	)
	@Export("MouseHandler_currentButtonVolatile")
	public static volatile int MouseHandler_currentButtonVolatile;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 781767059
	)
	@Export("MouseHandler_xVolatile")
	public static volatile int MouseHandler_xVolatile;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -638651017
	)
	@Export("MouseHandler_yVolatile")
	public static volatile int MouseHandler_yVolatile;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		longValue = 1637338918111276645L
	)
	@Export("MouseHandler_lastMovedVolatile")
	public static volatile long MouseHandler_lastMovedVolatile;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 61069071
	)
	@Export("MouseHandler_currentButton")
	public static int MouseHandler_currentButton;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1745816793
	)
	@Export("MouseHandler_x")
	public static int MouseHandler_x;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1780921337
	)
	@Export("MouseHandler_y")
	public static int MouseHandler_y;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = 8022585521766189491L
	)
	@Export("MouseHandler_millis")
	public static long MouseHandler_millis;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -929716517
	)
	@Export("MouseHandler_lastButtonVolatile")
	public static volatile int MouseHandler_lastButtonVolatile;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -971285287
	)
	@Export("MouseHandler_lastPressedXVolatile")
	public static volatile int MouseHandler_lastPressedXVolatile;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 617393535
	)
	@Export("MouseHandler_lastPressedYVolatile")
	public static volatile int MouseHandler_lastPressedYVolatile;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		longValue = 6842378541822712433L
	)
	@Export("MouseHandler_lastPressedTimeMillisVolatile")
	public static volatile long MouseHandler_lastPressedTimeMillisVolatile;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 2083520287
	)
	@Export("MouseHandler_lastButton")
	public static int MouseHandler_lastButton;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 242924413
	)
	@Export("MouseHandler_lastPressedX")
	public static int MouseHandler_lastPressedX;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1283827139
	)
	@Export("MouseHandler_lastPressedY")
	public static int MouseHandler_lastPressedY;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = 979887361754972507L
	)
	@Export("MouseHandler_lastPressedTimeMillis")
	public static long MouseHandler_lastPressedTimeMillis;
	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	static Archive field239;

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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;B)I",
		garbageValue = "-12"
	)
	@Export("getButton")
	final int getButton(MouseEvent var1) {
		int var2 = var1.getButton(); // L: 49
		if (!var1.isAltDown() && var2 != 2) { // L: 50
			return !var1.isMetaDown() && var2 != 3 ? 1 : 2; // L: 51 52
		} else {
			return 4;
		}
	}

	public final synchronized void mouseMoved(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 97
			MouseHandler_idleCycles = 0; // L: 98
			MouseHandler_xVolatile = var1.getX(); // L: 99
			MouseHandler_yVolatile = var1.getY(); // L: 100
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 101
		}

	} // L: 103

	public final synchronized void mousePressed(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 56
			MouseHandler_idleCycles = 0; // L: 57
			MouseHandler_lastPressedXVolatile = var1.getX(); // L: 58
			MouseHandler_lastPressedYVolatile = var1.getY(); // L: 59
			MouseHandler_lastPressedTimeMillisVolatile = SecureRandomCallable.method2320(); // L: 60
			MouseHandler_lastButtonVolatile = this.getButton(var1); // L: 61
			if (MouseHandler_lastButtonVolatile != 0) { // L: 62
				MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
			}
		}

		if (var1.isPopupTrigger()) { // L: 64
			var1.consume();
		}

	} // L: 65

	public final synchronized void mouseReleased(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 68
			MouseHandler_idleCycles = 0; // L: 69
			MouseHandler_currentButtonVolatile = 0; // L: 70
		}

		if (var1.isPopupTrigger()) { // L: 72
			var1.consume();
		}

	} // L: 73

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) { // L: 76
			var1.consume();
		}

	} // L: 77

	public final synchronized void mouseExited(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 84
			MouseHandler_idleCycles = 0; // L: 85
			MouseHandler_xVolatile = -1; // L: 86
			MouseHandler_yVolatile = -1; // L: 87
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 88
		}

	} // L: 90

	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1); // L: 93
	} // L: 94

	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1); // L: 80
	} // L: 81

	public final synchronized void focusLost(FocusEvent var1) {
		if (MouseHandler_instance != null) { // L: 108
			MouseHandler_currentButtonVolatile = 0;
		}

	} // L: 109

	public final void focusGained(FocusEvent var1) {
	} // L: 105

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lof;I)I",
		garbageValue = "-266471782"
	)
	static int method629(AbstractArchive var0) {
		int var1 = Login.field945.length + Login.field949.length; // L: 215
		String[] var2 = Login.field946; // L: 217

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 218
			String var4 = var2[var3]; // L: 219
			if (var0.getGroupId(var4) != -1) { // L: 221
				++var1; // L: 222
			}
		}

		return var1; // L: 227
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lng;IIII)V",
		garbageValue = "2057198044"
	)
	@Export("Widget_setKeyRate")
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field3820 == null) { // L: 1270
			throw new RuntimeException(); // L: 1271
		} else {
			var0.field3820[var1] = var2; // L: 1273
			var0.field3804[var1] = var3; // L: 1274
		}
	} // L: 1275
}
