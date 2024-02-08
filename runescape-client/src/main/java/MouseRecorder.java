import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("db")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("oc")
	@ObfuscatedGetter(
		intValue = -170100783
	)
	@Export("menuY")
	static int menuY;
	@ObfuscatedName("am")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("ap")
	@Export("lock")
	Object lock;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 849276385
	)
	@Export("index")
	int index;
	@ObfuscatedName("aj")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("aq")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("ar")
	@Export("millis")
	long[] millis;

	MouseRecorder() {
		this.isRunning = true; // L: 7
		this.lock = new Object(); // L: 8
		this.index = 0; // L: 9
		this.xs = new int[500]; // L: 10
		this.ys = new int[500]; // L: 11
		this.millis = new long[500]; // L: 12
	} // L: 14

	public void run() {
		for (; this.isRunning; BuddyRankComparator.method2992(50L)) { // L: 18 27
			synchronized(this.lock) { // L: 19
				if (this.index < 500) { // L: 20
					this.xs[this.index] = MouseHandler.MouseHandler_x; // L: 21
					this.ys[this.index] = MouseHandler.MouseHandler_y; // L: 22
					this.millis[this.index] = MouseHandler.MouseHandler_millis; // L: 23
					++this.index; // L: 24
				}
			}
		}

	} // L: 29

	@ObfuscatedName("ol")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)Ljava/lang/String;",
		garbageValue = "1726004576"
	)
	static String method2371(String var0, boolean var1) {
		String var2 = var1 ? "https://" : "http://"; // L: 12589
		if (Client.gameBuild == 1) { // L: 12590
			var0 = var0 + "-wtrc";
		} else if (Client.gameBuild == 2) { // L: 12591
			var0 = var0 + "-wtqa";
		} else if (Client.gameBuild == 3) { // L: 12592
			var0 = var0 + "-wtwip";
		} else if (Client.gameBuild == 5) { // L: 12593
			var0 = var0 + "-wti";
		} else if (Client.gameBuild == 4) { // L: 12594
			var0 = "local";
		}

		String var3 = ""; // L: 12595
		if (class426.field4608 != null) { // L: 12596
			var3 = "/p=" + class426.field4608;
		}

		String var4 = "runescape.com"; // L: 12597
		return var2 + var0 + "." + var4 + "/l=" + class92.clientLanguage + "/a=" + WorldMapData_0.field2467 + var3 + "/"; // L: 12598
	}
}
