import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
public class class132 implements class123 {
	@ObfuscatedName("ao")
	@Export("musicTrackBoolean")
	public static boolean musicTrackBoolean;

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("getGcDuration")
	protected static int getGcDuration() {
		int var0 = 0; // L: 616
		if (class405.garbageCollector == null || !class405.garbageCollector.isValid()) { // L: 617
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator(); // L: 619

				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next(); // L: 620
					if (var2.isValid()) { // L: 622
						class405.garbageCollector = var2; // L: 623
						GameEngine.garbageCollectorLastCheckTimeMs = -1L; // L: 624
						GameEngine.garbageCollectorLastCollectionTime = -1L; // L: 625
					}
				}
			} catch (Throwable var11) { // L: 630
			}
		}

		if (class405.garbageCollector != null) { // L: 632
			long var9 = WallObject.method5027(); // L: 633
			long var3 = class405.garbageCollector.getCollectionTime(); // L: 634
			if (-1L != GameEngine.garbageCollectorLastCollectionTime) { // L: 635
				long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime; // L: 636
				long var7 = var9 - GameEngine.garbageCollectorLastCheckTimeMs; // L: 637
				if (var7 != 0L) { // L: 638
					var0 = (int)(var5 * 100L / var7);
				}
			}

			GameEngine.garbageCollectorLastCollectionTime = var3; // L: 640
			GameEngine.garbageCollectorLastCheckTimeMs = var9; // L: 641
		}

		return var0; // L: 643
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "578044573"
	)
	static final int method3034() {
		return Client.menuOptionsCount - 1; // L: 10179
	}
}
