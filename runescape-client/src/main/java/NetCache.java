import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nk")
@Implements("NetCache")
public class NetCache {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	@Export("NetCache_socket")
	public static AbstractSocket NetCache_socket;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1180496763
	)
	@Export("NetCache_loadTime")
	public static int NetCache_loadTime;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = -5798342046050268773L
	)
	public static long field4204;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lrh;"
	)
	@Export("NetCache_pendingPriorityWrites")
	public static NodeHashTable NetCache_pendingPriorityWrites;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 73591553
	)
	@Export("NetCache_pendingPriorityWritesCount")
	public static int NetCache_pendingPriorityWritesCount;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lrh;"
	)
	@Export("NetCache_pendingPriorityResponses")
	public static NodeHashTable NetCache_pendingPriorityResponses;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 569947331
	)
	@Export("NetCache_pendingPriorityResponsesCount")
	public static int NetCache_pendingPriorityResponsesCount;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	@Export("NetCache_pendingWritesQueue")
	public static DualNodeDeque NetCache_pendingWritesQueue;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lrh;"
	)
	@Export("NetCache_pendingWrites")
	public static NodeHashTable NetCache_pendingWrites;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1074039989
	)
	@Export("NetCache_pendingWritesCount")
	public static int NetCache_pendingWritesCount;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lrh;"
	)
	@Export("NetCache_pendingResponses")
	public static NodeHashTable NetCache_pendingResponses;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1997263581
	)
	@Export("NetCache_pendingResponsesCount")
	public static int NetCache_pendingResponsesCount;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lsy;"
	)
	@Export("NetCache_responseHeaderBuffer")
	public static Buffer NetCache_responseHeaderBuffer;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lsy;"
	)
	@Export("NetCache_responseArchiveBuffer")
	public static Buffer NetCache_responseArchiveBuffer;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1060120023
	)
	public static int field4216;
	@ObfuscatedName("ag")
	@Export("NetCache_crc")
	public static CRC32 NetCache_crc;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[Lmx;"
	)
	@Export("NetCache_archives")
	public static Archive[] NetCache_archives;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -886563131
	)
	static int field4219;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 82319179
	)
	static int field4220;
	@ObfuscatedName("aa")
	public static byte field4213;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1034579133
	)
	@Export("NetCache_crcMismatches")
	public static int NetCache_crcMismatches;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -744142975
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
		field4216 = 0; // L: 28
		NetCache_crc = new CRC32(); // L: 30
		NetCache_archives = new Archive[256]; // L: 32
		field4219 = -1; // L: 33
		field4220 = 255; // L: 34
		field4213 = 0; // L: 35
		NetCache_crcMismatches = 0; // L: 36
		NetCache_ioExceptions = 0; // L: 37
	}

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1019053742"
	)
	static final int method6534() {
		float var0 = 200.0F * ((float)WorldMapSectionType.clientPreferences.method2438() - 0.5F); // L: 11629
		return 100 - Math.round(var0); // L: 11630
	}
}
