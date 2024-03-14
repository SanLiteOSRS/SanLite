import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mt")
public class class321 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	public static AbstractArchive field3480;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	public static AbstractArchive field3475;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	public static AbstractArchive field3477;
	@ObfuscatedName("ai")
	public static ArrayList field3479;
	@ObfuscatedName("ar")
	public static LinkedList field3478;
	@ObfuscatedName("as")
	public static ArrayList field3474;
	@ObfuscatedName("aa")
	static ArrayList field3484;
	@ObfuscatedName("az")
	public static ArrayList field3481;
	@ObfuscatedName("ao")
	public static final List field3482;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 160371303
	)
	static int field3483;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -351242133
	)
	static int field3476;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 540034119
	)
	static int field3485;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 282906921
	)
	static int field3486;

	static {
		field3479 = null; // L: 13
		field3478 = new LinkedList(); // L: 14
		field3474 = new ArrayList(3); // L: 15
		field3484 = new ArrayList(3); // L: 16
		field3481 = new ArrayList(); // L: 17
		field3482 = new ArrayList(); // L: 18
		field3483 = 0; // L: 19
		field3476 = 0; // L: 20
		field3485 = 0;
		field3486 = 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I[BLrl;B)V",
		garbageValue = "0"
	)
	static void method6113(int var0, byte[] var1, ArchiveDisk var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction(); // L: 21
		var3.type = 0; // L: 22
		var3.key = (long)var0; // L: 23
		var3.data = var1; // L: 24
		var3.archiveDisk = var2; // L: 25
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 26
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3); // L: 27
		} // L: 28

		synchronized(ArchiveDiskActionHandler.field4365) { // L: 30
			if (ArchiveDiskActionHandler.field4362 == 0) { // L: 31
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler()); // L: 32
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true); // L: 33
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start(); // L: 34
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5); // L: 35
			}

			ArchiveDiskActionHandler.field4362 = 600; // L: 37
			ArchiveDiskActionHandler.field4363 = false; // L: 38
		}
	} // L: 41

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([BB)[I",
		garbageValue = "-79"
	)
	public static int[] method6147(byte[] var0) {
		if (var0 != null && var0.length != 0 && var0.length <= 8) { // L: 168
			int[] var1 = new int[var0.length]; // L: 171

			for (int var2 = 0; var2 < var0.length; ++var2) { // L: 172
				if (var0[var2] < 0 || var0[var2] > class557.field5359.length) { // L: 173
					return null; // L: 174
				}

				var1[var2] = class557.field5359[var0[var2]]; // L: 176
			}

			return var1; // L: 178
		} else {
			return null; // L: 169
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-28"
	)
	protected static final void method6145() {
		class12.clock.mark(); // L: 474

		int var0;
		for (var0 = 0; var0 < 32; ++var0) { // L: 475
			GameEngine.graphicsTickTimes[var0] = 0L;
		}

		for (var0 = 0; var0 < 32; ++var0) { // L: 476
			GameEngine.clientTickTimes[var0] = 0L;
		}

		class496.gameCyclesToDo = 0; // L: 477
	} // L: 478
}
