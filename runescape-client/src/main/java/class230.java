import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ic")
public class class230 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	static final class230 field2450;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	static final class230 field2446;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	static final class230 field2447;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	static final class230 field2448;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	static final class230 field2449;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	static final class230 field2445;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	static final class230 field2451;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[Lic;"
	)
	static final class230[] field2455;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1495969513
	)
	final int field2452;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -2113963923
	)
	final int field2453;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1237540519
	)
	final int field2454;

	static {
		field2450 = new class230(0, 8, 8); // L: 8
		field2446 = new class230(6, 16, 16); // L: 9
		field2447 = new class230(3, 32, 32); // L: 10
		field2448 = new class230(1, 48, 48); // L: 11
		field2449 = new class230(2, 64, 64); // L: 12
		field2445 = new class230(4, 96, 96); // L: 13
		field2451 = new class230(5, 128, 128); // L: 14
		field2455 = DirectByteArrayCopier.method6962(); // L: 18
		Arrays.sort(field2455, new class235()); // L: 21
	} // L: 22

	class230(int var1, int var2, int var3) {
		this.field2452 = var1; // L: 29
		this.field2453 = var2; // L: 30
		this.field2454 = var3; // L: 31
	} // L: 32

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "140463448"
	)
	int method4505() {
		return this.field2454 * this.field2453; // L: 35
	}
}
