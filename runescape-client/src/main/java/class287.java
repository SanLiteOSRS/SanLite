import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ku")
public class class287 {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1183278198"
	)
	@Export("getGcDuration")
	protected static int getGcDuration() {
		int var0 = 0; // L: 611
		if (class14.garbageCollector == null || !class14.garbageCollector.isValid()) { // L: 612
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator(); // L: 614

				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next(); // L: 615
					if (var2.isValid()) { // L: 617
						class14.garbageCollector = var2; // L: 618
						GameEngine.garbageCollectorLastCheckTimeMs = -1L; // L: 619
						GameEngine.garbageCollectorLastCollectionTime = -1L; // L: 620
					}
				}
			} catch (Throwable var11) { // L: 625
			}
		}

		if (class14.garbageCollector != null) { // L: 627
			long var9 = class153.method3317(); // L: 628
			long var3 = class14.garbageCollector.getCollectionTime(); // L: 629
			if (-1L != GameEngine.garbageCollectorLastCollectionTime) { // L: 630
				long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime; // L: 631
				long var7 = var9 - GameEngine.garbageCollectorLastCheckTimeMs; // L: 632
				if (var7 != 0L) { // L: 633
					var0 = (int)(var5 * 100L / var7);
				}
			}

			GameEngine.garbageCollectorLastCollectionTime = var3; // L: 635
			GameEngine.garbageCollectorLastCheckTimeMs = var9; // L: 636
		}

		return var0; // L: 638
	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-133010506"
	)
	static final boolean method5579() {
		return Client.isMenuOpen; // L: 9261
	}
}
