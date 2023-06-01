import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("na")
@Implements("NetCache")
public class NetCache {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lqt;"
	)
	@Export("NetCache_socket")
	public static AbstractSocket NetCache_socket;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 537450861
	)
	@Export("NetCache_loadTime")
	public static int NetCache_loadTime;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		longValue = -5157292039844800485L
	)
	public static long field4276;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lsq;"
	)
	@Export("NetCache_pendingPriorityWrites")
	public static NodeHashTable NetCache_pendingPriorityWrites;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -2146357747
	)
	@Export("NetCache_pendingPriorityWritesCount")
	public static int NetCache_pendingPriorityWritesCount;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lsq;"
	)
	@Export("NetCache_pendingPriorityResponses")
	public static NodeHashTable NetCache_pendingPriorityResponses;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 105613767
	)
	@Export("NetCache_pendingPriorityResponsesCount")
	public static int NetCache_pendingPriorityResponsesCount;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("NetCache_pendingWritesQueue")
	public static DualNodeDeque NetCache_pendingWritesQueue;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lsq;"
	)
	@Export("NetCache_pendingWrites")
	public static NodeHashTable NetCache_pendingWrites;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -2113323903
	)
	@Export("NetCache_pendingWritesCount")
	public static int NetCache_pendingWritesCount;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lsq;"
	)
	@Export("NetCache_pendingResponses")
	public static NodeHashTable NetCache_pendingResponses;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 786211097
	)
	@Export("NetCache_pendingResponsesCount")
	public static int NetCache_pendingResponsesCount;
	@ObfuscatedName("ae")
	public static boolean field4293;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ltc;"
	)
	@Export("NetCache_responseHeaderBuffer")
	public static Buffer NetCache_responseHeaderBuffer;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -161097115
	)
	public static int field4288;
	@ObfuscatedName("af")
	@Export("NetCache_crc")
	public static CRC32 NetCache_crc;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Lnv;"
	)
	@Export("NetCache_archives")
	public static Archive[] NetCache_archives;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1997406579
	)
	static int field4291;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -956618111
	)
	static int field4279;
	@ObfuscatedName("aa")
	public static byte field4290;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 21602425
	)
	@Export("NetCache_crcMismatches")
	public static int NetCache_crcMismatches;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1338122485
	)
	@Export("NetCache_ioExceptions")
	public static int NetCache_ioExceptions;
	@ObfuscatedName("bs")
	protected static String field4297;
	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "[Ltt;"
	)
	@Export("headIconPrayerSprites")
	static SpritePixels[] headIconPrayerSprites;

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
		field4288 = 0; // L: 28
		NetCache_crc = new CRC32(); // L: 30
		NetCache_archives = new Archive[256]; // L: 32
		field4291 = -1; // L: 33
		field4279 = 255; // L: 34
		field4290 = 0; // L: 35
		NetCache_crcMismatches = 0; // L: 36
		NetCache_ioExceptions = 0; // L: 37
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	static final void method6822() {
		for (int var0 = 0; var0 < Client.npcCount; ++var0) { // L: 4076
			int var1 = Client.npcIndices[var0]; // L: 4077
			NPC var2 = Client.npcs[var1]; // L: 4078
			if (var2 != null) { // L: 4079
				ServerPacket.updateActorSequence(var2, var2.definition.size); // L: 4080
			}
		}

	} // L: 4083
}
