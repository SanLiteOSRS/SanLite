import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bl")
@Implements("MouseHandler")
public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lbl;"
	)
	@Export("MouseHandler_instance")
	public static MouseHandler MouseHandler_instance;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 292769727
	)
	@Export("MouseHandler_idleCycles")
	static volatile int MouseHandler_idleCycles;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 428067781
	)
	@Export("MouseHandler_currentButtonVolatile")
	public static volatile int MouseHandler_currentButtonVolatile;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 2058794393
	)
	@Export("MouseHandler_xVolatile")
	public static volatile int MouseHandler_xVolatile;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1300422897
	)
	@Export("MouseHandler_yVolatile")
	public static volatile int MouseHandler_yVolatile;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		longValue = 196883195795934339L
	)
	@Export("MouseHandler_lastMovedVolatile")
	public static volatile long MouseHandler_lastMovedVolatile;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 435371743
	)
	@Export("MouseHandler_currentButton")
	public static int MouseHandler_currentButton;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1117338649
	)
	@Export("MouseHandler_x")
	public static int MouseHandler_x;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1799863503
	)
	@Export("MouseHandler_y")
	public static int MouseHandler_y;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		longValue = -5358059264926980641L
	)
	@Export("MouseHandler_millis")
	public static long MouseHandler_millis;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -671972871
	)
	@Export("MouseHandler_lastButtonVolatile")
	public static volatile int MouseHandler_lastButtonVolatile;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 415948899
	)
	@Export("MouseHandler_lastPressedXVolatile")
	public static volatile int MouseHandler_lastPressedXVolatile;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1692727511
	)
	@Export("MouseHandler_lastPressedYVolatile")
	public static volatile int MouseHandler_lastPressedYVolatile;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		longValue = 7646744595458623515L
	)
	@Export("MouseHandler_lastPressedTimeMillisVolatile")
	public static volatile long MouseHandler_lastPressedTimeMillisVolatile;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 587975755
	)
	@Export("MouseHandler_lastButton")
	public static int MouseHandler_lastButton;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -490779059
	)
	@Export("MouseHandler_lastPressedX")
	public static int MouseHandler_lastPressedX;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 859258345
	)
	@Export("MouseHandler_lastPressedY")
	public static int MouseHandler_lastPressedY;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		longValue = -5873384708855953639L
	)
	@Export("MouseHandler_lastPressedTimeMillis")
	public static long MouseHandler_lastPressedTimeMillis;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -958372155
	)
	static int field228;
	@ObfuscatedName("km")
	@ObfuscatedGetter(
		intValue = 393989213
	)
	@Export("cameraY")
	static int cameraY;

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
		garbageValue = "-110"
	)
	@Export("getButton")
	final int getButton(MouseEvent var1) {
		int var2 = var1.getButton(); // L: 66
		if (!var1.isAltDown() && var2 != 2) { // L: 67
			return !var1.isMetaDown() && var2 != 3 ? 1 : 2; // L: 68 69
		} else {
			return 4;
		}
	}

	public final synchronized void mouseMoved(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 114
			MouseHandler_idleCycles = 0; // L: 115
			MouseHandler_xVolatile = var1.getX(); // L: 116
			MouseHandler_yVolatile = var1.getY(); // L: 117
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 118
		}

	} // L: 120

	public final synchronized void mouseExited(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 101
			MouseHandler_idleCycles = 0; // L: 102
			MouseHandler_xVolatile = -1; // L: 103
			MouseHandler_yVolatile = -1; // L: 104
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 105
		}

	} // L: 107

	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1); // L: 110
	} // L: 111

	public final void focusGained(FocusEvent var1) {
	} // L: 122

	public final synchronized void focusLost(FocusEvent var1) {
		if (MouseHandler_instance != null) { // L: 125
			MouseHandler_currentButtonVolatile = 0;
		}

	} // L: 126

	public final synchronized void mousePressed(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 73
			MouseHandler_idleCycles = 0; // L: 74
			MouseHandler_lastPressedXVolatile = var1.getX(); // L: 75
			MouseHandler_lastPressedYVolatile = var1.getY(); // L: 76
			MouseHandler_lastPressedTimeMillisVolatile = VerticalAlignment.method3924(); // L: 77
			MouseHandler_lastButtonVolatile = this.getButton(var1); // L: 78
			if (MouseHandler_lastButtonVolatile != 0) { // L: 79
				MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
			}
		}

		if (var1.isPopupTrigger()) { // L: 81
			var1.consume();
		}

	} // L: 82

	public final synchronized void mouseReleased(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 85
			MouseHandler_idleCycles = 0; // L: 86
			MouseHandler_currentButtonVolatile = 0; // L: 87
		}

		if (var1.isPopupTrigger()) { // L: 89
			var1.consume();
		}

	} // L: 90

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) { // L: 93
			var1.consume();
		}

	} // L: 94

	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1); // L: 97
	} // L: 98

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/Date;",
		garbageValue = "14"
	)
	static Date method655() throws ParseException {
		SimpleDateFormat var0 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH); // L: 1130
		var0.setLenient(false); // L: 1131
		StringBuilder var1 = new StringBuilder(); // L: 1132
		String[] var2 = Login.field931; // L: 1134

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 1135
			String var4 = var2[var3]; // L: 1136
			if (var4 == null) { // L: 1138
				class145.method3156("Date not valid.", "Please ensure all characters are populated.", ""); // L: 1139
				return null; // L: 1140
			}

			var1.append(var4); // L: 1142
		}

		var1.append("12"); // L: 1146
		return var0.parse(var1.toString()); // L: 1147
	}
}
