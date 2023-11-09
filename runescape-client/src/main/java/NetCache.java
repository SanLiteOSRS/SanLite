import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nx")
@Implements("NetCache")
public class NetCache {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lqz;"
	)
	@Export("NetCache_socket")
	public static AbstractSocket NetCache_socket;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 174086543
	)
	@Export("NetCache_loadTime")
	public static int NetCache_loadTime;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lsh;"
	)
	@Export("NetCache_pendingPriorityWrites")
	public static NodeHashTable NetCache_pendingPriorityWrites;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1300900423
	)
	@Export("NetCache_pendingPriorityWritesCount")
	public static int NetCache_pendingPriorityWritesCount;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lsh;"
	)
	@Export("NetCache_pendingPriorityResponses")
	public static NodeHashTable NetCache_pendingPriorityResponses;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1340654805
	)
	@Export("NetCache_pendingPriorityResponsesCount")
	public static int NetCache_pendingPriorityResponsesCount;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	@Export("NetCache_pendingWritesQueue")
	public static DualNodeDeque NetCache_pendingWritesQueue;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lsh;"
	)
	@Export("NetCache_pendingWrites")
	static NodeHashTable NetCache_pendingWrites;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1292993967
	)
	@Export("NetCache_pendingWritesCount")
	public static int NetCache_pendingWritesCount;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lsh;"
	)
	@Export("NetCache_pendingResponses")
	public static NodeHashTable NetCache_pendingResponses;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -419999939
	)
	@Export("NetCache_pendingResponsesCount")
	public static int NetCache_pendingResponsesCount;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ltz;"
	)
	@Export("NetCache_responseHeaderBuffer")
	public static Buffer NetCache_responseHeaderBuffer;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 313957591
	)
	public static int field4278;
	@ObfuscatedName("az")
	@Export("NetCache_crc")
	public static CRC32 NetCache_crc;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "[Lny;"
	)
	@Export("NetCache_archives")
	public static Archive[] NetCache_archives;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1051503651
	)
	static int field4281;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1873899565
	)
	static int field4267;
	@ObfuscatedName("ay")
	public static byte field4282;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1077767189
	)
	@Export("NetCache_crcMismatches")
	public static int NetCache_crcMismatches;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -135057883
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
		field4278 = 0; // L: 28
		NetCache_crc = new CRC32(); // L: 30
		NetCache_archives = new Archive[256]; // L: 32
		field4281 = -1; // L: 33
		field4267 = 255; // L: 34
		field4282 = 0; // L: 35
		NetCache_crcMismatches = 0; // L: 36
		NetCache_ioExceptions = 0; // L: 37
	}
}
