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

@ObfuscatedName("bf")
@Implements("MouseHandler")
public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lbf;"
	)
	@Export("MouseHandler_instance")
	public static MouseHandler MouseHandler_instance;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 915863853
	)
	@Export("MouseHandler_idleCycles")
	static volatile int MouseHandler_idleCycles;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -516344517
	)
	@Export("MouseHandler_currentButtonVolatile")
	public static volatile int MouseHandler_currentButtonVolatile;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1431180941
	)
	@Export("MouseHandler_xVolatile")
	public static volatile int MouseHandler_xVolatile;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1639177563
	)
	@Export("MouseHandler_yVolatile")
	public static volatile int MouseHandler_yVolatile;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		longValue = 245110053620769011L
	)
	@Export("MouseHandler_lastMovedVolatile")
	public static volatile long MouseHandler_lastMovedVolatile;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -2109837207
	)
	@Export("MouseHandler_currentButton")
	public static int MouseHandler_currentButton;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 72258787
	)
	@Export("MouseHandler_x")
	public static int MouseHandler_x;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1675983005
	)
	@Export("MouseHandler_y")
	public static int MouseHandler_y;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		longValue = -6694168432919730217L
	)
	@Export("MouseHandler_millis")
	public static long MouseHandler_millis;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1494561027
	)
	@Export("MouseHandler_lastButtonVolatile")
	public static volatile int MouseHandler_lastButtonVolatile;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1385110719
	)
	@Export("MouseHandler_lastPressedXVolatile")
	public static volatile int MouseHandler_lastPressedXVolatile;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1067270293
	)
	@Export("MouseHandler_lastPressedYVolatile")
	public static volatile int MouseHandler_lastPressedYVolatile;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		longValue = -4128736015997000351L
	)
	@Export("MouseHandler_lastPressedTimeMillisVolatile")
	public static volatile long MouseHandler_lastPressedTimeMillisVolatile;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1466521579
	)
	@Export("MouseHandler_lastButton")
	public static int MouseHandler_lastButton;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -163059513
	)
	@Export("MouseHandler_lastPressedX")
	public static int MouseHandler_lastPressedX;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1953612693
	)
	@Export("MouseHandler_lastPressedY")
	public static int MouseHandler_lastPressedY;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		longValue = 4296976941923200635L
	)
	@Export("MouseHandler_lastPressedTimeMillis")
	public static long MouseHandler_lastPressedTimeMillis;
	@ObfuscatedName("uf")
	@ObfuscatedGetter(
		intValue = 1970459575
	)
	static int field252;

	static {
		MouseHandler_instance = new MouseHandler(); // L: 15
		MouseHandler_idleCycles = 0; // L: 16
		MouseHandler_currentButtonVolatile = 0; // L: 17
		MouseHandler_xVolatile = -1; // L: 18
		MouseHandler_yVolatile = -1;
		MouseHandler_lastMovedVolatile = -1L;
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
		descriptor = "(Ljava/awt/event/MouseEvent;I)I",
		garbageValue = "-343088867"
	)
	@Export("getButton")
	final int getButton(MouseEvent var1) {
		int var2 = var1.getButton(); // L: 45
		if (!var1.isAltDown() && var2 != 2) { // L: 46
			return !var1.isMetaDown() && var2 != 3 ? 1 : 2; // L: 47 48
		} else {
			return 4;
		}
	}

	public final synchronized void mouseMoved(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 93
			MouseHandler_idleCycles = 0; // L: 94
			MouseHandler_xVolatile = var1.getX(); // L: 95
			MouseHandler_yVolatile = var1.getY(); // L: 96
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 97
		}

	} // L: 99

	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1); // L: 89
	} // L: 90

	public final synchronized void mousePressed(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 52
			MouseHandler_idleCycles = 0; // L: 53
			MouseHandler_lastPressedXVolatile = var1.getX(); // L: 54
			MouseHandler_lastPressedYVolatile = var1.getY(); // L: 55
			MouseHandler_lastPressedTimeMillisVolatile = GameEngine.method661(); // L: 56
			MouseHandler_lastButtonVolatile = this.getButton(var1); // L: 57
			if (MouseHandler_lastButtonVolatile != 0) { // L: 58
				MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
			}
		}

		if (var1.isPopupTrigger()) { // L: 60
			var1.consume();
		}

	} // L: 61

	public final synchronized void mouseReleased(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 64
			MouseHandler_idleCycles = 0; // L: 65
			MouseHandler_currentButtonVolatile = 0; // L: 66
		}

		if (var1.isPopupTrigger()) { // L: 68
			var1.consume();
		}

	} // L: 69

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) { // L: 72
			var1.consume();
		}

	} // L: 73

	public final synchronized void mouseExited(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 80
			MouseHandler_idleCycles = 0; // L: 81
			MouseHandler_xVolatile = -1; // L: 82
			MouseHandler_yVolatile = -1; // L: 83
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 84
		}

	} // L: 86

	public final synchronized void focusLost(FocusEvent var1) {
		if (MouseHandler_instance != null) { // L: 104
			MouseHandler_currentButtonVolatile = 0;
		}

	} // L: 105

	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1); // L: 76
	} // L: 77

	public final void focusGained(FocusEvent var1) {
	} // L: 101

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-463307133"
	)
	@Export("addGameMessage")
	static void addGameMessage(int var0, String var1, String var2) {
		class416.addChatMessage(var0, var1, var2, (String)null); // L: 19
	} // L: 20

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "412937353"
	)
	static final void method698(String var0) {
		PacketBufferNode var1 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3114, Client.packetWriter.isaacCipher); // L: 131
		var1.packetBuffer.writeByte(AbstractSocket.stringCp1252NullTerminatedByteSize(var0)); // L: 132
		var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 133
		Client.packetWriter.addNode(var1); // L: 134
	} // L: 135

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1361034764"
	)
	static void method665(int var0, int var1, int var2) {
		if (var0 != 0) { // L: 3566
			int var3 = var0 >> 8; // L: 3567
			int var4 = var0 >> 4 & 7; // L: 3568
			int var5 = var0 & 15; // L: 3569
			Client.soundEffectIds[Client.soundEffectCount] = var3; // L: 3570
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var4; // L: 3571
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0; // L: 3572
			Client.soundEffects[Client.soundEffectCount] = null; // L: 3573
			int var6 = (var1 - 64) / 128; // L: 3574
			int var7 = (var2 - 64) / 128; // L: 3575
			Client.soundLocations[Client.soundEffectCount] = var5 + (var7 << 8) + (var6 << 16); // L: 3576
			++Client.soundEffectCount; // L: 3577
		}
	} // L: 3578
}
