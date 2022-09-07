import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lr")
@Implements("NetCache")
public class NetCache {
	@ObfuscatedName("rr")
	@ObfuscatedSignature(
		descriptor = "Lec;"
	)
	@Export("guestClanChannel")
	static ClanChannel guestClanChannel;
	@ObfuscatedName("ti")
	@ObfuscatedGetter(
		intValue = -1653527943
	)
	static int field4039;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1165629591
	)
	@Export("NetCache_loadTime")
	public static int NetCache_loadTime;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	@Export("NetCache_socket")
	public static AbstractSocket NetCache_socket;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		longValue = 6088607561644097199L
	)
	public static long field4017;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	@Export("NetCache_pendingPriorityWrites")
	public static NodeHashTable NetCache_pendingPriorityWrites;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1247985289
	)
	@Export("NetCache_pendingPriorityWritesCount")
	public static int NetCache_pendingPriorityWritesCount;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	@Export("NetCache_pendingPriorityResponses")
	public static NodeHashTable NetCache_pendingPriorityResponses;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1405415599
	)
	@Export("NetCache_pendingPriorityResponsesCount")
	public static int NetCache_pendingPriorityResponsesCount;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("NetCache_pendingWritesQueue")
	public static DualNodeDeque NetCache_pendingWritesQueue;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	@Export("NetCache_pendingWrites")
	public static NodeHashTable NetCache_pendingWrites;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 413706265
	)
	@Export("NetCache_pendingWritesCount")
	public static int NetCache_pendingWritesCount;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	@Export("NetCache_pendingResponses")
	public static NodeHashTable NetCache_pendingResponses;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 222876107
	)
	@Export("NetCache_pendingResponsesCount")
	public static int NetCache_pendingResponsesCount;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lqr;"
	)
	@Export("NetCache_responseHeaderBuffer")
	public static Buffer NetCache_responseHeaderBuffer;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1938797
	)
	public static int field4028;
	@ObfuscatedName("p")
	@Export("NetCache_crc")
	static CRC32 NetCache_crc;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "[Lln;"
	)
	@Export("NetCache_archives")
	static Archive[] NetCache_archives;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1057478507
	)
	static int field4031;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1151493933
	)
	static int field4015;
	@ObfuscatedName("t")
	public static byte field4029;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1534530293
	)
	@Export("NetCache_crcMismatches")
	public static int NetCache_crcMismatches;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -595359391
	)
	@Export("NetCache_ioExceptions")
	public static int NetCache_ioExceptions;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "[Lqe;"
	)
	@Export("worldSelectFlagSprites")
	static IndexedSprite[] worldSelectFlagSprites;

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
		field4028 = 0; // L: 28
		NetCache_crc = new CRC32(); // L: 30
		NetCache_archives = new Archive[256]; // L: 32
		field4031 = -1; // L: 33
		field4015 = 255; // L: 34
		field4029 = 0; // L: 35
		NetCache_crcMismatches = 0; // L: 36
		NetCache_ioExceptions = 0; // L: 37
	}
}
