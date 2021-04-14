import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ar")
@Implements("MouseHandler")
public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Lar;"
	)
	@Export("MouseHandler_instance")
	static MouseHandler MouseHandler_instance;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -2009408369
	)
	@Export("MouseHandler_idleCycles")
	public static volatile int MouseHandler_idleCycles;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1655097803
	)
	@Export("MouseHandler_currentButtonVolatile")
	static volatile int MouseHandler_currentButtonVolatile;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1775381995
	)
	@Export("MouseHandler_x")
	public static int MouseHandler_x;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -287499463
	)
	@Export("MouseHandler_xVolatile")
	static volatile int MouseHandler_xVolatile;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1278537481
	)
	@Export("MouseHandler_yVolatile")
	static volatile int MouseHandler_yVolatile;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		longValue = 7684175983304981365L
	)
	@Export("MouseHandler_lastMovedVolatile")
	static volatile long MouseHandler_lastMovedVolatile;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 320986893
	)
	@Export("MouseHandler_currentButton")
	public static int MouseHandler_currentButton;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1997230525
	)
	@Export("MouseHandler_y")
	public static int MouseHandler_y;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		longValue = -23953879977166285L
	)
	@Export("MouseHandler_millis")
	public static long MouseHandler_millis;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -659702837
	)
	@Export("MouseHandler_lastButtonVolatile")
	static volatile int MouseHandler_lastButtonVolatile;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1493673469
	)
	@Export("MouseHandler_lastPressedXVolatile")
	static volatile int MouseHandler_lastPressedXVolatile;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 2049905729
	)
	@Export("MouseHandler_lastPressedYVolatile")
	static volatile int MouseHandler_lastPressedYVolatile;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		longValue = 4257889617743394737L
	)
	@Export("MouseHandler_lastPressedTimeMillisVolatile")
	static volatile long MouseHandler_lastPressedTimeMillisVolatile;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1535018267
	)
	@Export("MouseHandler_lastButton")
	public static int MouseHandler_lastButton;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1275346307
	)
	@Export("MouseHandler_lastPressedX")
	public static int MouseHandler_lastPressedX;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1778744007
	)
	@Export("MouseHandler_lastPressedY")
	public static int MouseHandler_lastPressedY;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		longValue = -2098715734298926973L
	)
	@Export("MouseHandler_lastPressedTimeMillis")
	public static long MouseHandler_lastPressedTimeMillis;
	@ObfuscatedName("dy")
	@Export("mouseCam")
	static boolean mouseCam;
	@ObfuscatedName("go")
	@Export("regionMapArchives")
	static byte[][] regionMapArchives;

	static {
		MouseHandler_instance = new MouseHandler();
		MouseHandler_idleCycles = 0;
		MouseHandler_currentButtonVolatile = 0;
		MouseHandler_xVolatile = -1;
		MouseHandler_yVolatile = -1;
		MouseHandler_lastMovedVolatile = -1L;
		MouseHandler_currentButton = 0;
		MouseHandler_x = 0;
		MouseHandler_y = 0;
		MouseHandler_millis = 0L;
		MouseHandler_lastButtonVolatile = 0;
		MouseHandler_lastPressedXVolatile = 0;
		MouseHandler_lastPressedYVolatile = 0;
		MouseHandler_lastPressedTimeMillisVolatile = 0L;
		MouseHandler_lastButton = 0;
		MouseHandler_lastPressedX = 0;
		MouseHandler_lastPressedY = 0;
		MouseHandler_lastPressedTimeMillis = 0L;
	}

	MouseHandler() {
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(Ljava/awt/event/MouseEvent;I)I",
		garbageValue = "-171580309"
	)
	@Export("getButton")
	final int getButton(MouseEvent var1) {
		int var2 = var1.getButton();
		if (!var1.isAltDown() && var2 != 2) {
			return !var1.isMetaDown() && var2 != 3 ? 1 : 2;
		} else {
			return 4;
		}
	}

	public final synchronized void mouseMoved(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_xVolatile = var1.getX();
			MouseHandler_yVolatile = var1.getY();
			MouseHandler_lastMovedVolatile = var1.getWhen();
		}

	}

	public final synchronized void mousePressed(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_lastPressedXVolatile = var1.getX();
			MouseHandler_lastPressedYVolatile = var1.getY();
			MouseHandler_lastPressedTimeMillisVolatile = ObjectSound.currentTimeMillis();
			MouseHandler_lastButtonVolatile = this.getButton(var1);
			if (MouseHandler_lastButtonVolatile != 0) {
				MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
			}
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final synchronized void mouseReleased(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_currentButtonVolatile = 0;
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	public final void focusGained(FocusEvent var1) {
	}

	public final synchronized void focusLost(FocusEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_currentButtonVolatile = 0;
		}

	}

	public final synchronized void mouseExited(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_xVolatile = -1;
			MouseHandler_yVolatile = -1;
			MouseHandler_lastMovedVolatile = var1.getWhen();
		}

	}

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	@ObfuscatedName("f")
	public static String method724(long var0) {
		Calendar.Calendar_calendar.setTime(new Date(var0));
		int var2 = Calendar.Calendar_calendar.get(7);
		int var3 = Calendar.Calendar_calendar.get(5);
		int var4 = Calendar.Calendar_calendar.get(2);
		int var5 = Calendar.Calendar_calendar.get(1);
		int var6 = Calendar.Calendar_calendar.get(11);
		int var7 = Calendar.Calendar_calendar.get(12);
		int var8 = Calendar.Calendar_calendar.get(13);
		return Calendar.DAYS_OF_THE_WEEK[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + Calendar.MONTH_NAMES_ENGLISH_GERMAN[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lme;ILjava/lang/String;S)Ljava/lang/String;",
		garbageValue = "-709"
	)
	static String method725(IterableNodeHashTable var0, int var1, String var2) {
		if (var0 == null) {
			return var2;
		} else {
			ObjectNode var3 = (ObjectNode)var0.get((long)var1);
			return var3 == null ? var2 : (String)var3.obj;
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(Ljava/io/File;ZB)Z",
		garbageValue = "-76"
	)
	static boolean method723(File var0, boolean var1) {
		try {
			RandomAccessFile var2 = new RandomAccessFile(var0, "rw");
			int var3 = var2.read();
			var2.seek(0L);
			var2.write(var3);
			var2.seek(0L);
			var2.close();
			if (var1) {
				var0.delete();
			}

			return true;
		} catch (Exception var4) {
			return false;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(ILcc;ZI)I",
		garbageValue = "1530869780"
	)
	static int method726(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) {
			int var4;
			if (var0 == 1928) {
				var3 = var2 ? FriendSystem.field905 : class4.field35;
				var4 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
				if (var4 >= 1 && var4 <= 10) {
					class376.widgetDefaultMenuAction(var4, var3.id, var3.childIndex, var3.itemId, "");
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == 2928) {
				class16.Interpreter_intStackSize -= 3;
				int var7 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
				int var5 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 2];
				if (var5 >= 1 && var5 <= 10) {
					class376.widgetDefaultMenuAction(var5, var7, var4, class139.getWidget(var7).itemId, "");
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else {
				return 2;
			}
		} else if (Interpreter.field950 >= 10) {
			throw new RuntimeException();
		} else {
			if (var0 >= 2000) {
				var3 = class139.getWidget(Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]);
			} else {
				var3 = var2 ? FriendSystem.field905 : class4.field35;
			}

			if (var3.onResize == null) {
				return 0;
			} else {
				ScriptEvent var6 = new ScriptEvent();
				var6.widget = var3;
				var6.args = var3.onResize;
				var6.field1154 = Interpreter.field950 + 1;
				Client.scriptEvents.addFirst(var6);
				return 1;
			}
		}
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "127"
	)
	static final void method707() {
		Client.field797 = Client.cycleCntr;
	}
}
