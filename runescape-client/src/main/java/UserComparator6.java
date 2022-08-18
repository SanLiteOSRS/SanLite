import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dr")
@Implements("UserComparator6")
public class UserComparator6 extends AbstractUserComparator {
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -318993653
	)
	@Export("musicTrackFileId")
	public static int musicTrackFileId;
	@ObfuscatedName("o")
	@Export("reversed")
	final boolean reversed;

	public UserComparator6(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lnh;Lnh;I)I",
		garbageValue = "-126609268"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) { // L: 14
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername()); // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	static void method2701(int var0) {
		if (var0 != Login.loginIndex) { // L: 2011
			Login.loginIndex = var0; // L: 2012
		}
	} // L: 2013

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-2"
	)
	@Export("getGcDuration")
	protected static int getGcDuration() {
		int var0 = 0; // L: 593
		if (class340.garbageCollector == null || !class340.garbageCollector.isValid()) { // L: 594
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator(); // L: 596

				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next(); // L: 597
					if (var2.isValid()) { // L: 599
						class340.garbageCollector = var2; // L: 600
						GameEngine.garbageCollectorLastCheckTimeMs = -1L; // L: 601
						GameEngine.garbageCollectorLastCollectionTime = -1L; // L: 602
					}
				}
			} catch (Throwable var11) { // L: 607
			}
		}

		if (class340.garbageCollector != null) { // L: 609
			long var9 = class131.method2916(); // L: 610
			long var3 = class340.garbageCollector.getCollectionTime(); // L: 611
			if (GameEngine.garbageCollectorLastCollectionTime != -1L) { // L: 612
				long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime; // L: 613
				long var7 = var9 - GameEngine.garbageCollectorLastCheckTimeMs; // L: 614
				if (var7 != 0L) { // L: 615
					var0 = (int)(var5 * 100L / var7);
				}
			}

			GameEngine.garbageCollectorLastCollectionTime = var3; // L: 617
			GameEngine.garbageCollectorLastCheckTimeMs = var9; // L: 618
		}

		return var0; // L: 620
	}
}
