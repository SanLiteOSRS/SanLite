import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lv")
@Implements("NetCache")
public class NetCache {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	@Export("NetCache_socket")
	public static AbstractSocket NetCache_socket;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -38046757
	)
	@Export("NetCache_loadTime")
	public static int NetCache_loadTime;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		longValue = -7487830085444458825L
	)
	public static long field4218;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	@Export("NetCache_pendingPriorityWrites")
	public static NodeHashTable NetCache_pendingPriorityWrites;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -912683751
	)
	@Export("NetCache_pendingPriorityWritesCount")
	public static int NetCache_pendingPriorityWritesCount;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	@Export("NetCache_pendingPriorityResponses")
	public static NodeHashTable NetCache_pendingPriorityResponses;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1360562841
	)
	@Export("NetCache_pendingPriorityResponsesCount")
	public static int NetCache_pendingPriorityResponsesCount;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("NetCache_pendingWritesQueue")
	public static DualNodeDeque NetCache_pendingWritesQueue;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	@Export("NetCache_pendingWrites")
	public static NodeHashTable NetCache_pendingWrites;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 767219283
	)
	@Export("NetCache_pendingWritesCount")
	public static int NetCache_pendingWritesCount;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	@Export("NetCache_pendingResponses")
	public static NodeHashTable NetCache_pendingResponses;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -273303851
	)
	@Export("NetCache_pendingResponsesCount")
	public static int NetCache_pendingResponsesCount;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	@Export("NetCache_responseHeaderBuffer")
	public static Buffer NetCache_responseHeaderBuffer;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1267001511
	)
	public static int field4216;
	@ObfuscatedName("l")
	@Export("NetCache_crc")
	static CRC32 NetCache_crc;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "[Lln;"
	)
	@Export("NetCache_archives")
	static Archive[] NetCache_archives;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 608271417
	)
	static int field4236;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1995959275
	)
	static int field4217;
	@ObfuscatedName("y")
	public static byte field4232;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -436432309
	)
	@Export("NetCache_crcMismatches")
	public static int NetCache_crcMismatches;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1247182669
	)
	@Export("NetCache_ioExceptions")
	public static int NetCache_ioExceptions;

	static {
		NetCache_loadTime = 0; // L: 13
		NetCache_pendingPriorityWrites = new NodeHashTable(4096); // L: 15
		NetCache_pendingPriorityWritesCount = 0;
		NetCache_pendingPriorityResponses = new NodeHashTable(32); // L: 17
		NetCache_pendingPriorityResponsesCount = 0; // L: 18
		NetCache_pendingWritesQueue = new DualNodeDeque(); // L: 19
		NetCache_pendingWrites = new NodeHashTable(4096); // L: 20
		NetCache_pendingWritesCount = 0; // L: 21
		NetCache_pendingResponses = new NodeHashTable(4096); // L: 22
		NetCache_pendingResponsesCount = 0; // L: 23
		NetCache_responseHeaderBuffer = new Buffer(8); // L: 26
		field4216 = 0; // L: 28
		NetCache_crc = new CRC32(); // L: 30
		NetCache_archives = new Archive[256]; // L: 32
		field4236 = -1; // L: 33
		field4217 = 255; // L: 34
		field4232 = 0; // L: 35
		NetCache_crcMismatches = 0; // L: 36
		NetCache_ioExceptions = 0; // L: 37
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lf;B)Lx;",
		garbageValue = "-35"
	)
	public static class3 method6566(class6 var0) {
		switch(var0.field16) { // L: 9
		case 0:
			return new class0(); // L: 16
		default:
			throw new IllegalArgumentException(); // L: 12
		}
	}
}
