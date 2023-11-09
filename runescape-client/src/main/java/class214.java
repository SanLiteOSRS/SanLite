import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("io")
public class class214 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	static final class214 field2382;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	static final class214 field2380;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	public static final class214 field2381;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	static final class214 field2379;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	static final class214 field2386;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	static final class214 field2384;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	static final class214 field2385;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "[Lio;"
	)
	static final class214[] field2387;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 408466643
	)
	final int field2390;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -2057229633
	)
	public final int field2383;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 357508901
	)
	public final int field2388;

	static {
		field2382 = new class214(6, 8, 8); // L: 8
		field2380 = new class214(3, 16, 16); // L: 9
		field2381 = new class214(0, 32, 32); // L: 10
		field2379 = new class214(2, 48, 48); // L: 11
		field2386 = new class214(4, 64, 64); // L: 12
		field2384 = new class214(5, 96, 96); // L: 13
		field2385 = new class214(1, 128, 128); // L: 14
		field2387 = WorldMapID.method5495(); // L: 18
		Arrays.sort(field2387, new class219()); // L: 21
	} // L: 22

	class214(int var1, int var2, int var3) {
		this.field2390 = var1; // L: 29
		this.field2383 = var2; // L: 30
		this.field2388 = var3; // L: 31
	} // L: 32

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-4502"
	)
	int method4178() {
		return this.field2388 * this.field2383; // L: 35
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1568434479"
	)
	public static void method4180() {
		synchronized(ArchiveDiskActionHandler.field4259) { // L: 93
			if (ArchiveDiskActionHandler.field4257 != 0) { // L: 94
				ArchiveDiskActionHandler.field4257 = 1; // L: 95
				ArchiveDiskActionHandler.field4261 = true; // L: 96

				try {
					ArchiveDiskActionHandler.field4259.wait(); // L: 98
				} catch (InterruptedException var3) { // L: 100
				}
			}

		}
	} // L: 103
}
