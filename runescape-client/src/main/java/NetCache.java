import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ju")
@Implements("NetCache")
public class NetCache {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("NetCache_socket")
	public static AbstractSocket NetCache_socket;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1338905363
	)
	@Export("NetCache_loadTime")
	static int NetCache_loadTime;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	@Export("NetCache_pendingPriorityWrites")
	static NodeHashTable NetCache_pendingPriorityWrites;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1273441533
	)
	@Export("NetCache_pendingPriorityWritesCount")
	public static int NetCache_pendingPriorityWritesCount;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	@Export("NetCache_pendingPriorityResponses")
	static NodeHashTable NetCache_pendingPriorityResponses;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -550422443
	)
	@Export("NetCache_pendingPriorityResponsesCount")
	public static int NetCache_pendingPriorityResponsesCount;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("NetCache_pendingWritesQueue")
	static DualNodeDeque NetCache_pendingWritesQueue;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	@Export("NetCache_pendingWrites")
	static NodeHashTable NetCache_pendingWrites;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 417611781
	)
	@Export("NetCache_pendingWritesCount")
	public static int NetCache_pendingWritesCount;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	@Export("NetCache_pendingResponses")
	static NodeHashTable NetCache_pendingResponses;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -2053891301
	)
	@Export("NetCache_pendingResponsesCount")
	public static int NetCache_pendingResponsesCount;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	@Export("NetCache_responseHeaderBuffer")
	static Buffer NetCache_responseHeaderBuffer;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	@Export("NetCache_responseArchiveBuffer")
	static Buffer NetCache_responseArchiveBuffer;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1088927211
	)
	static int field3626;
	@ObfuscatedName("u")
	@Export("NetCache_crc")
	static CRC32 NetCache_crc;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "[Lji;"
	)
	@Export("NetCache_archives")
	static Archive[] NetCache_archives;
	@ObfuscatedName("f")
	static byte field3629;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1574278149
	)
	@Export("NetCache_crcMismatches")
	public static int NetCache_crcMismatches;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 101288901
	)
	@Export("NetCache_ioExceptions")
	public static int NetCache_ioExceptions;

	static {
		NetCache_loadTime = 0;
		NetCache_pendingPriorityWrites = new NodeHashTable(4096);
		NetCache_pendingPriorityWritesCount = 0;
		NetCache_pendingPriorityResponses = new NodeHashTable(32);
		NetCache_pendingPriorityResponsesCount = 0;
		NetCache_pendingWritesQueue = new DualNodeDeque();
		NetCache_pendingWrites = new NodeHashTable(4096);
		NetCache_pendingWritesCount = 0;
		NetCache_pendingResponses = new NodeHashTable(4096);
		NetCache_pendingResponsesCount = 0;
		NetCache_responseHeaderBuffer = new Buffer(8);
		field3626 = 0;
		NetCache_crc = new CRC32();
		NetCache_archives = new Archive[256];
		field3629 = 0;
		NetCache_crcMismatches = 0;
		NetCache_ioExceptions = 0;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "8"
	)
	@Export("Messages_getLastChatID")
	static int Messages_getLastChatID(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0);
		if (var1 == null) {
			return -1;
		} else {
			return var1.previousDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.previousDual).count;
		}
	}
}
