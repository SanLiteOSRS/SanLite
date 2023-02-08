import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lv")
@Implements("NetCache")
public class NetCache {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	@Export("NetCache_socket")
	public static AbstractSocket NetCache_socket;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1225337139
	)
	@Export("NetCache_loadTime")
	public static int NetCache_loadTime;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		longValue = -4342758360730342265L
	)
	public static long field4252;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lqg;"
	)
	@Export("NetCache_pendingPriorityWrites")
	public static NodeHashTable NetCache_pendingPriorityWrites;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1605236251
	)
	@Export("NetCache_pendingPriorityWritesCount")
	public static int NetCache_pendingPriorityWritesCount;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lqg;"
	)
	@Export("NetCache_pendingPriorityResponses")
	public static NodeHashTable NetCache_pendingPriorityResponses;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 387570927
	)
	@Export("NetCache_pendingPriorityResponsesCount")
	public static int NetCache_pendingPriorityResponsesCount;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	@Export("NetCache_pendingWritesQueue")
	public static DualNodeDeque NetCache_pendingWritesQueue;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lqg;"
	)
	@Export("NetCache_pendingWrites")
	public static NodeHashTable NetCache_pendingWrites;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1554539859
	)
	@Export("NetCache_pendingWritesCount")
	public static int NetCache_pendingWritesCount;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lqg;"
	)
	@Export("NetCache_pendingResponses")
	public static NodeHashTable NetCache_pendingResponses;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 716176413
	)
	@Export("NetCache_pendingResponsesCount")
	public static int NetCache_pendingResponsesCount;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lrd;"
	)
	@Export("NetCache_responseHeaderBuffer")
	public static Buffer NetCache_responseHeaderBuffer;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1174830923
	)
	public static int field4250;
	@ObfuscatedName("u")
	@Export("NetCache_crc")
	static CRC32 NetCache_crc;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "[Llm;"
	)
	@Export("NetCache_archives")
	static Archive[] NetCache_archives;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -807870043
	)
	static int field4253;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1476697241
	)
	static int field4254;
	@ObfuscatedName("e")
	public static byte field4248;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1060159647
	)
	@Export("NetCache_crcMismatches")
	public static int NetCache_crcMismatches;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1955974775
	)
	@Export("NetCache_ioExceptions")
	public static int NetCache_ioExceptions;
	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	static Archive field4260;
	@ObfuscatedName("fr")
	@Export("worldHost")
	static String worldHost;

	static {
		NetCache_loadTime = 0;
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
		field4250 = 0; // L: 28
		NetCache_crc = new CRC32(); // L: 30
		NetCache_archives = new Archive[256]; // L: 32
		field4253 = -1; // L: 33
		field4254 = 255; // L: 34
		field4248 = 0; // L: 35
		NetCache_crcMismatches = 0; // L: 36
		NetCache_ioExceptions = 0; // L: 37
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)[B",
		garbageValue = "670848294"
	)
	public static byte[] method6642(CharSequence var0) {
		int var1 = var0.length(); // L: 9
		byte[] var2 = new byte[var1]; // L: 10

		for (int var3 = 0; var3 < var1; ++var3) { // L: 11
			char var4 = var0.charAt(var3); // L: 12
			if (var4 > 127) { // L: 13
				var2[var3] = 63;
			} else {
				var2[var3] = (byte)var4; // L: 14
			}
		}

		return var2; // L: 16
	}
}
