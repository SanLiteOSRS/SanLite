import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.math.BigInteger;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("co")
public class class80 {
	@ObfuscatedName("b")
	static final BigInteger field965;
	@ObfuscatedName("e")
	static final BigInteger field964;

	static {
		field965 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
		field964 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "1"
	)
	@Export("getGcDuration")
	protected static int getGcDuration() {
		int var0 = 0;
		if (class21.garbageCollector == null || !class21.garbageCollector.isValid()) {
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next();
					if (var2.isValid()) {
						class21.garbageCollector = var2;
						GameEngine.garbageCollectorLastCheckTimeMs = -1L;
						GameEngine.garbageCollectorLastCollectionTime = -1L;
					}
				}
			} catch (Throwable var11) {
			}
		}

		if (class21.garbageCollector != null) {
			long var9 = ObjectSound.currentTimeMillis();
			long var3 = class21.garbageCollector.getCollectionTime();
			if (-1L != GameEngine.garbageCollectorLastCollectionTime) {
				long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime;
				long var7 = var9 - GameEngine.garbageCollectorLastCheckTimeMs;
				if (var7 != 0L) {
					var0 = (int)(var5 * 100L / var7);
				}
			}

			GameEngine.garbageCollectorLastCollectionTime = var3;
			GameEngine.garbageCollectorLastCheckTimeMs = var9;
		}

		return var0;
	}
}
