import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ii")
@Implements("NetCache")
public class NetCache {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lln;"
	)
	@Export("NetCache_socket")
	public static AbstractSocket NetCache_socket;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 570306795
	)
	@Export("NetCache_loadTime")
	static int NetCache_loadTime;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		longValue = -7527120128916335365L
	)
	static long field3195;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "Llc;"
	)
	@Export("NetCache_pendingPriorityWrites")
	static NodeHashTable NetCache_pendingPriorityWrites;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1894418175
	)
	@Export("NetCache_pendingPriorityWritesCount")
	public static int NetCache_pendingPriorityWritesCount;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Llc;"
	)
	@Export("NetCache_pendingPriorityResponses")
	static NodeHashTable NetCache_pendingPriorityResponses;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 994594523
	)
	@Export("NetCache_pendingPriorityResponsesCount")
	public static int NetCache_pendingPriorityResponsesCount;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "Ljl;"
	)
	@Export("NetCache_pendingWritesQueue")
	static DualNodeDeque NetCache_pendingWritesQueue;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "Llc;"
	)
	@Export("NetCache_pendingWrites")
	static NodeHashTable NetCache_pendingWrites;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1420450011
	)
	@Export("NetCache_pendingWritesCount")
	public static int NetCache_pendingWritesCount;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "Llc;"
	)
	@Export("NetCache_pendingResponses")
	static NodeHashTable NetCache_pendingResponses;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1710151389
	)
	@Export("NetCache_pendingResponsesCount")
	public static int NetCache_pendingResponsesCount;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Lkf;"
	)
	@Export("NetCache_responseHeaderBuffer")
	static Buffer NetCache_responseHeaderBuffer;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -657334189
	)
	static int field3205;
	@ObfuscatedName("v")
	@Export("NetCache_crc")
	static CRC32 NetCache_crc;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		signature = "[Liw;"
	)
	@Export("NetCache_archives")
	static Archive[] NetCache_archives;
	@ObfuscatedName("u")
	static byte field3208;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 888421105
	)
	@Export("NetCache_crcMismatches")
	public static int NetCache_crcMismatches;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1735021825
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
		field3205 = 0;
		NetCache_crc = new CRC32();
		NetCache_archives = new Archive[256];
		field3208 = 0;
		NetCache_crcMismatches = 0;
		NetCache_ioExceptions = 0;
	}
}
