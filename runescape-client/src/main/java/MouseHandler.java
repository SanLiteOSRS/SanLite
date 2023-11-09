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

@ObfuscatedName("ak")
@Implements("MouseHandler")
public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lak;"
	)
	@Export("MouseHandler_instance")
	public static MouseHandler MouseHandler_instance;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1827760199
	)
	@Export("MouseHandler_idleCycles")
	public static volatile int MouseHandler_idleCycles;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1623418769
	)
	@Export("MouseHandler_currentButtonVolatile")
	public static volatile int MouseHandler_currentButtonVolatile;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1555382099
	)
	@Export("MouseHandler_xVolatile")
	public static volatile int MouseHandler_xVolatile;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1255212161
	)
	@Export("MouseHandler_x")
	public static int MouseHandler_x;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1215710293
	)
	@Export("MouseHandler_yVolatile")
	public static volatile int MouseHandler_yVolatile;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		longValue = -2272608476376561203L
	)
	@Export("MouseHandler_lastMovedVolatile")
	public static volatile long MouseHandler_lastMovedVolatile;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1275162901
	)
	@Export("MouseHandler_currentButton")
	public static int MouseHandler_currentButton;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 805158709
	)
	@Export("MouseHandler_y")
	public static int MouseHandler_y;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		longValue = -824620349310307761L
	)
	@Export("MouseHandler_millis")
	public static long MouseHandler_millis;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 85924573
	)
	@Export("MouseHandler_lastButtonVolatile")
	public static volatile int MouseHandler_lastButtonVolatile;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1879141787
	)
	@Export("MouseHandler_lastPressedXVolatile")
	public static volatile int MouseHandler_lastPressedXVolatile;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 100819619
	)
	@Export("MouseHandler_lastPressedYVolatile")
	public static volatile int MouseHandler_lastPressedYVolatile;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		longValue = -7343813439361923581L
	)
	@Export("MouseHandler_lastPressedTimeMillisVolatile")
	public static volatile long MouseHandler_lastPressedTimeMillisVolatile;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1259435317
	)
	@Export("MouseHandler_lastButton")
	public static int MouseHandler_lastButton;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1804877833
	)
	@Export("MouseHandler_lastPressedX")
	public static int MouseHandler_lastPressedX;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1565070067
	)
	@Export("MouseHandler_lastPressedY")
	public static int MouseHandler_lastPressedY;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		longValue = -5419030349490224105L
	)
	@Export("MouseHandler_lastPressedTimeMillis")
	public static long MouseHandler_lastPressedTimeMillis;
	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("archive17")
	static Archive archive17;
	@ObfuscatedName("fw")
	@ObfuscatedGetter(
		intValue = -12790683
	)
	static int field231;

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
		descriptor = "(Ljava/awt/event/MouseEvent;S)I",
		garbageValue = "764"
	)
	@Export("getButton")
	final int getButton(MouseEvent var1) {
		int var2 = var1.getButton(); // L: 55
		if (!var1.isAltDown() && var2 != 2) { // L: 56
			return !var1.isMetaDown() && var2 != 3 ? 1 : 2; // L: 57 58
		} else {
			return 4;
		}
	}

	public final synchronized void mouseMoved(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 103
			MouseHandler_idleCycles = 0; // L: 104
			MouseHandler_xVolatile = var1.getX(); // L: 105
			MouseHandler_yVolatile = var1.getY(); // L: 106
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 107
		}

	} // L: 109

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) { // L: 82
			var1.consume();
		}

	} // L: 83

	public final synchronized void mouseExited(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 90
			MouseHandler_idleCycles = 0; // L: 91
			MouseHandler_xVolatile = -1; // L: 92
			MouseHandler_yVolatile = -1; // L: 93
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 94
		}

	} // L: 96

	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1); // L: 99
	} // L: 100

	public final void focusGained(FocusEvent var1) {
	} // L: 111

	public final synchronized void focusLost(FocusEvent var1) {
		if (MouseHandler_instance != null) { // L: 114
			MouseHandler_currentButtonVolatile = 0;
		}

	} // L: 115

	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1); // L: 86
	} // L: 87

	public final synchronized void mousePressed(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 62
			MouseHandler_idleCycles = 0; // L: 63
			MouseHandler_lastPressedXVolatile = var1.getX(); // L: 64
			MouseHandler_lastPressedYVolatile = var1.getY(); // L: 65
			MouseHandler_lastPressedTimeMillisVolatile = class181.method3483(); // L: 66
			MouseHandler_lastButtonVolatile = this.getButton(var1); // L: 67
			if (MouseHandler_lastButtonVolatile != 0) { // L: 68
				MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
			}
		}

		if (var1.isPopupTrigger()) { // L: 70
			var1.consume();
		}

	} // L: 71

	public final synchronized void mouseReleased(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 74
			MouseHandler_idleCycles = 0; // L: 75
			MouseHandler_currentButtonVolatile = 0; // L: 76
		}

		if (var1.isPopupTrigger()) { // L: 78
			var1.consume();
		}

	} // L: 79

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "1220245992"
	)
	static int method569(int var0, Script var1, boolean var2) {
		if (var0 == 6800) { // L: 4529
			Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = ""; // L: 4530
			return 1; // L: 4531
		} else if (var0 != 6801 && var0 != 6802) { // L: 4533
			if (var0 == 6809) { // L: 4537
				int var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 4538
				ObjectComposition var4 = FileSystem.getObjectDefinition(var3); // L: 4539
				Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var4 != null ? var4.name : ""; // L: 4540
				return 1; // L: 4541
			} else if (var0 == 6850) { // L: 4543
				Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = ""; // L: 4544
				return 1; // L: 4545
			} else if (var0 != 6851 && var0 != 6852) { // L: 4547
				if (var0 == 6853) { // L: 4551
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 4552
					return 1; // L: 4553
				} else {
					return 2; // L: 4555
				}
			} else {
				Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = -1; // L: 4548
				return 1; // L: 4549
			}
		} else {
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = -1; // L: 4534
			return 1; // L: 4535
		}
	}

	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-419333573"
	)
	static final void method558() {
		int var0 = Players.Players_count; // L: 3903
		int[] var1 = Players.Players_indices; // L: 3904

		for (int var2 = 0; var2 < var0; ++var2) { // L: 3905
			Player var3 = Client.players[var1[var2]]; // L: 3906
			if (var3 != null) { // L: 3907
				WorldMapSection2.updateActorSequence(var3, 1); // L: 3908
			}
		}

	} // L: 3911
}
