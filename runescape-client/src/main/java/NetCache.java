import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nl")
@Implements("NetCache")
public class NetCache {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	@Export("NetCache_socket")
	public static AbstractSocket NetCache_socket;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -942339237
	)
	@Export("NetCache_loadTime")
	public static int NetCache_loadTime;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = -2114584129517998633L
	)
	public static long field4259;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lrc;"
	)
	@Export("NetCache_pendingPriorityWrites")
	public static NodeHashTable NetCache_pendingPriorityWrites;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1171541559
	)
	@Export("NetCache_pendingPriorityWritesCount")
	public static int NetCache_pendingPriorityWritesCount;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lrc;"
	)
	@Export("NetCache_pendingPriorityResponses")
	public static NodeHashTable NetCache_pendingPriorityResponses;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1952694793
	)
	@Export("NetCache_pendingPriorityResponsesCount")
	public static int NetCache_pendingPriorityResponsesCount;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("NetCache_pendingWritesQueue")
	public static DualNodeDeque NetCache_pendingWritesQueue;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lrc;"
	)
	@Export("NetCache_pendingWrites")
	public static NodeHashTable NetCache_pendingWrites;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -32010957
	)
	@Export("NetCache_pendingWritesCount")
	public static int NetCache_pendingWritesCount;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lrc;"
	)
	@Export("NetCache_pendingResponses")
	public static NodeHashTable NetCache_pendingResponses;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1651605431
	)
	@Export("NetCache_pendingResponsesCount")
	public static int NetCache_pendingResponsesCount;
	@ObfuscatedName("ax")
	static boolean field4247;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	@Export("NetCache_responseHeaderBuffer")
	public static Buffer NetCache_responseHeaderBuffer;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	@Export("NetCache_responseArchiveBuffer")
	public static Buffer NetCache_responseArchiveBuffer;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1961769541
	)
	public static int field4253;
	@ObfuscatedName("am")
	@Export("NetCache_crc")
	static CRC32 NetCache_crc;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Lnd;"
	)
	@Export("NetCache_archives")
	static Archive[] NetCache_archives;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1097614811
	)
	static int field4238;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1745465359
	)
	static int field4257;
	@ObfuscatedName("ad")
	public static byte field4255;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1551453085
	)
	@Export("NetCache_crcMismatches")
	public static int NetCache_crcMismatches;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1386597723
	)
	@Export("NetCache_ioExceptions")
	public static int NetCache_ioExceptions;

	static {
		NetCache_loadTime = 0; // L: 13
		NetCache_pendingPriorityWrites = new NodeHashTable(4096); // L: 15
		NetCache_pendingPriorityWritesCount = 0; // L: 16
		NetCache_pendingPriorityResponses = new NodeHashTable(32); // L: 17
		NetCache_pendingPriorityResponsesCount = 0; // L: 18
		NetCache_pendingWritesQueue = new DualNodeDeque(); // L: 19
		NetCache_pendingWrites = new NodeHashTable(4096); // L: 20
		NetCache_pendingWritesCount = 0; // L: 21
		NetCache_pendingResponses = new NodeHashTable(4096); // L: 22
		NetCache_pendingResponsesCount = 0; // L: 23
		NetCache_responseHeaderBuffer = new Buffer(8); // L: 26
		field4253 = 0; // L: 28
		NetCache_crc = new CRC32(); // L: 30
		NetCache_archives = new Archive[256]; // L: 32
		field4238 = -1; // L: 33
		field4257 = 255; // L: 34
		field4255 = 0; // L: 35
		NetCache_crcMismatches = 0; // L: 36
		NetCache_ioExceptions = 0; // L: 37
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1990174320"
	)
	@Export("getGcDuration")
	protected static int getGcDuration() {
		int var0 = 0; // L: 587
		if (class291.garbageCollector == null || !class291.garbageCollector.isValid()) { // L: 588
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator(); // L: 590

				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next(); // L: 591
					if (var2.isValid()) { // L: 593
						class291.garbageCollector = var2; // L: 594
						GameEngine.garbageCollectorLastCheckTimeMs = -1L; // L: 595
						GameEngine.garbageCollectorLastCollectionTime = -1L; // L: 596
					}
				}
			} catch (Throwable var11) { // L: 601
			}
		}

		if (class291.garbageCollector != null) { // L: 603
			long var9 = class96.method2634(); // L: 604
			long var3 = class291.garbageCollector.getCollectionTime(); // L: 605
			if (GameEngine.garbageCollectorLastCollectionTime != -1L) { // L: 606
				long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime; // L: 607
				long var7 = var9 - GameEngine.garbageCollectorLastCheckTimeMs; // L: 608
				if (var7 != 0L) { // L: 609
					var0 = (int)(100L * var5 / var7);
				}
			}

			GameEngine.garbageCollectorLastCollectionTime = var3; // L: 611
			GameEngine.garbageCollectorLastCheckTimeMs = var9; // L: 612
		}

		return var0; // L: 614
	}
}
