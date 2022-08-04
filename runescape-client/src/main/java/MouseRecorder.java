import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cp")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("p")
	static int[][][] field1060;
	@ObfuscatedName("o")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("q")
	@Export("lock")
	Object lock;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -368891301
	)
	@Export("index")
	int index;
	@ObfuscatedName("u")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("c")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("w")
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
		for (; this.isRunning; WorldMapDecoration.method4967(50L)) { // L: 18
			synchronized(this.lock) { // L: 19
				if (this.index < 500) { // L: 20
					this.xs[this.index] = MouseHandler.MouseHandler_x; // L: 21
					this.ys[this.index] = MouseHandler.MouseHandler_y; // L: 22
					this.millis[this.index] = MouseHandler.MouseHandler_millis;
					++this.index;
				}
			}
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfp;",
		garbageValue = "-21"
	)
	@Export("VarpDefinition_get")
	public static VarpDefinition VarpDefinition_get(int var0) {
		VarpDefinition var1 = (VarpDefinition)VarpDefinition.VarpDefinition_cached.get((long)var0); // L: 23
		if (var1 != null) { // L: 24
			return var1;
		} else {
			byte[] var2 = VarpDefinition.VarpDefinition_archive.takeFile(16, var0); // L: 25
			var1 = new VarpDefinition(); // L: 26
			if (var2 != null) { // L: 27
				var1.decode(new Buffer(var2));
			}

			VarpDefinition.VarpDefinition_cached.put(var1, (long)var0); // L: 28
			return var1; // L: 29
		}
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1517499028"
	)
	static void method2170(int var0, int var1) {
		if (class260.clientPreferences.method2335() != 0 && var0 != -1) { // L: 3772
			FriendsChatManager.method6678(WorldMapRegion.field2708, var0, 0, class260.clientPreferences.method2335(), false); // L: 3773
			Client.playingJingle = true; // L: 3774
		}

	} // L: 3776

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1640370499"
	)
	@Export("getWindowedMode")
	static int getWindowedMode() {
		return Client.isResizable ? 2 : 1; // L: 4451
	}
}
