import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ix")
public class class214 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	static final class214 field2375;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	static final class214 field2364;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	public static final class214 field2366;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	static final class214 field2367;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	static final class214 field2369;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	static final class214 field2368;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	static final class214 field2365;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lix;"
	)
	static final class214[] field2374;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -689156231
	)
	final int field2371;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1056691737
	)
	public final int field2372;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1199798419
	)
	public final int field2373;

	static {
		field2375 = new class214(6, 8, 8); // L: 8
		field2364 = new class214(1, 16, 16); // L: 9
		field2366 = new class214(5, 32, 32); // L: 10
		field2367 = new class214(2, 48, 48); // L: 11
		field2369 = new class214(0, 64, 64); // L: 12
		field2368 = new class214(4, 96, 96); // L: 13
		field2365 = new class214(3, 128, 128); // L: 14
		field2374 = class160.method3393(); // L: 18
		Arrays.sort(field2374, new class219());
	}

	class214(int var1, int var2, int var3) {
		this.field2371 = var1;
		this.field2372 = var2;
		this.field2373 = var3; // L: 31
	} // L: 32

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1683053894"
	)
	int method4335() {
		return this.field2373 * this.field2372; // L: 35
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I[BLrw;B)V",
		garbageValue = "-27"
	)
	static void method4333(int var0, byte[] var1, ArchiveDisk var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction(); // L: 21
		var3.type = 0; // L: 22
		var3.key = (long)var0; // L: 23
		var3.data = var1; // L: 24
		var3.archiveDisk = var2; // L: 25
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 26
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3); // L: 27
		} // L: 28

		class308.method6016(); // L: 29
	} // L: 30
}
