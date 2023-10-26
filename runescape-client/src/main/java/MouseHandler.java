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
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lbo;"
	)
	@Export("MouseHandler_instance")
	public static MouseHandler MouseHandler_instance;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1762186043
	)
	@Export("MouseHandler_idleCycles")
	public static volatile int MouseHandler_idleCycles;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 974288765
	)
	@Export("MouseHandler_currentButtonVolatile")
	public static volatile int MouseHandler_currentButtonVolatile;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -2023888693
	)
	@Export("MouseHandler_xVolatile")
	public static volatile int MouseHandler_xVolatile;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1413087209
	)
	@Export("MouseHandler_yVolatile")
	public static volatile int MouseHandler_yVolatile;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		longValue = 7069288389660290253L
	)
	@Export("MouseHandler_lastMovedVolatile")
	public static volatile long MouseHandler_lastMovedVolatile;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1973735425
	)
	@Export("MouseHandler_currentButton")
	public static int MouseHandler_currentButton;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -963425685
	)
	@Export("MouseHandler_x")
	public static int MouseHandler_x;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -167198495
	)
	@Export("MouseHandler_y")
	public static int MouseHandler_y;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		longValue = -2587671476605759975L
	)
	@Export("MouseHandler_millis")
	public static long MouseHandler_millis;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1372666549
	)
	@Export("MouseHandler_lastButtonVolatile")
	public static volatile int MouseHandler_lastButtonVolatile;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 790259843
	)
	@Export("MouseHandler_lastPressedXVolatile")
	public static volatile int MouseHandler_lastPressedXVolatile;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1580409631
	)
	@Export("MouseHandler_lastPressedYVolatile")
	public static volatile int MouseHandler_lastPressedYVolatile;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		longValue = 6492176796614795711L
	)
	@Export("MouseHandler_lastPressedTimeMillisVolatile")
	public static volatile long MouseHandler_lastPressedTimeMillisVolatile;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 12330033
	)
	@Export("MouseHandler_lastButton")
	public static int MouseHandler_lastButton;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 653254225
	)
	@Export("MouseHandler_lastPressedX")
	public static int MouseHandler_lastPressedX;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 94062717
	)
	@Export("MouseHandler_lastPressedY")
	public static int MouseHandler_lastPressedY;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = -1264438020177004003L
	)
	@Export("MouseHandler_lastPressedTimeMillis")
	public static long MouseHandler_lastPressedTimeMillis;
	@ObfuscatedName("gy")
	@Export("worldHost")
	static String worldHost;
	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "Lhi;"
	)
	@Export("socketTask")
	static Task socketTask;
	@ObfuscatedName("ul")
	@ObfuscatedGetter(
		intValue = 2114207744
	)
	static int field224;

	static {
		MouseHandler_instance = new MouseHandler();
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;B)I",
		garbageValue = "29"
	)
	@Export("getButton")
	final int getButton(MouseEvent var1) {
		int var2 = var1.getButton(); // L: 55
		if (!var1.isAltDown() && var2 != 2) { // L: 56
			return !var1.isMetaDown() && var2 != 3 ? 1 : 2;
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

	public final synchronized void mousePressed(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_lastPressedXVolatile = var1.getX();
			MouseHandler_lastPressedYVolatile = var1.getY();
			MouseHandler_lastPressedTimeMillisVolatile = GrandExchangeOfferTotalQuantityComparator.method7049();
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
			MouseHandler_idleCycles = 0; // L: 75
			MouseHandler_currentButtonVolatile = 0;
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) { // L: 82
			var1.consume();
		}

	} // L: 83

	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1); // L: 86
	} // L: 87

	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1); // L: 99
	} // L: 100

	public final void focusGained(FocusEvent var1) {
	} // L: 111

	public final synchronized void mouseExited(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 90
			MouseHandler_idleCycles = 0; // L: 91
			MouseHandler_xVolatile = -1; // L: 92
			MouseHandler_yVolatile = -1; // L: 93
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 94
		}

	} // L: 96

	public final synchronized void focusLost(FocusEvent var1) {
		if (MouseHandler_instance != null) { // L: 114
			MouseHandler_currentButtonVolatile = 0;
		}

	} // L: 115

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1381957040"
	)
	public static void method679() {
		class189.field1913.clear(); // L: 14
	} // L: 15

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-948962256"
	)
	@Export("changeWorldSelectSorting")
	static void changeWorldSelectSorting(int var0, int var1) {
		int[] var2 = new int[4];
		int[] var3 = new int[4]; // L: 65
		var2[0] = var0;
		var3[0] = var1;
		int var4 = 1;

		for (int var5 = 0; var5 < 4; ++var5) {
			if (World.World_sortOption1[var5] != var0) { // L: 70
				var2[var4] = World.World_sortOption1[var5];
				var3[var4] = World.World_sortOption2[var5];
				++var4;
			}
		}

		World.World_sortOption1 = var2; // L: 76
		World.World_sortOption2 = var3;
		class12.sortWorlds(UserComparator3.World_worlds, 0, UserComparator3.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2); // L: 78
	} // L: 79

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)Lds;",
		garbageValue = "332721621"
	)
	static Script method670(int var0, int var1) {
		Script var2 = (Script)Script.Script_cached.get((long)(var0 << 16)); // L: 57
		if (var2 != null) { // L: 58
			return var2; // L: 59
		} else {
			String var3 = String.valueOf(var0); // L: 61
			int var4 = class421.archive12.getGroupId(var3); // L: 62
			if (var4 == -1) { // L: 63
				return null; // L: 64
			} else {
				byte[] var5 = class421.archive12.takeFileFlat(var4); // L: 66
				if (var5 != null) { // L: 67
					if (var5.length <= 1) { // L: 68
						return null; // L: 69
					}

					var2 = class224.newScript(var5); // L: 71
					if (var2 != null) { // L: 72
						Script.Script_cached.put(var2, (long)(var0 << 16)); // L: 73
						return var2; // L: 74
					}
				}

				return null; // L: 77
			}
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "65"
	)
	static void method682(int var0, int var1, int var2, int var3) {
		class319.field3437 = var0; // L: 223
		class319.field3438 = var1; // L: 224
		class319.field3436 = var2; // L: 225
		class319.field3430 = var3; // L: 226
	} // L: 227

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZI)I",
		garbageValue = "671130802"
	)
	static int method652(int var0, Script var1, boolean var2) {
		return 2; // L: 5122
	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1315584412"
	)
	static void method683() {
		Client.packetWriter.clearBuffer(); // L: 2780
		Client.packetWriter.packetBuffer.offset = 0; // L: 2781
		Client.packetWriter.serverPacket = null; // L: 2782
		Client.packetWriter.field1431 = null; // L: 2783
		Client.packetWriter.field1420 = null; // L: 2784
		Client.packetWriter.field1433 = null; // L: 2785
		Client.packetWriter.serverPacketLength = 0; // L: 2786
		Client.packetWriter.field1429 = 0; // L: 2787
		Client.rebootTimer = 0; // L: 2788
		class91.method2347(); // L: 2789
		Client.minimapState = 0; // L: 2790
		Client.destinationX = 0; // L: 2791

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) { // L: 2792
			Client.players[var0] = null;
		}

		TextureProvider.localPlayer = null; // L: 2793

		for (var0 = 0; var0 < Client.npcs.length; ++var0) { // L: 2794
			NPC var1 = Client.npcs[var0]; // L: 2795
			if (var1 != null) { // L: 2796
				var1.targetIndex = -1; // L: 2797
				var1.false0 = false; // L: 2798
			}
		}

		Tile.method4515(); // L: 2801
		DefaultsGroup.method8263(30); // L: 2802

		for (var0 = 0; var0 < 100; ++var0) { // L: 2803
			Client.field739[var0] = true;
		}

		class517.method9051(); // L: 2804
	} // L: 2805
}
