import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ic")
public class class228 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	static final class228 field2402;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	static final class228 field2400;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	static final class228 field2409;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	static final class228 field2399;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	static final class228 field2403;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	static final class228 field2404;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	static final class228 field2405;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[Lic;"
	)
	static final class228[] field2408;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1200422575
	)
	final int field2406;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1062470321
	)
	final int field2407;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 328884775
	)
	final int field2401;

	static {
		field2402 = new class228(5, 8, 8); // L: 8
		field2400 = new class228(0, 16, 16); // L: 9
		field2409 = new class228(1, 32, 32); // L: 10
		field2399 = new class228(6, 48, 48); // L: 11
		field2403 = new class228(4, 64, 64); // L: 12
		field2404 = new class228(2, 96, 96); // L: 13
		field2405 = new class228(3, 128, 128); // L: 14
		class228[] var0 = new class228[]{field2400, field2409, field2404, field2405, field2403, field2402, field2399}; // L: 23
		field2408 = var0; // L: 25
		Arrays.sort(field2408, new class233()); // L: 29
	} // L: 30

	class228(int var1, int var2, int var3) {
		this.field2406 = var1; // L: 33
		this.field2407 = var2; // L: 34
		this.field2401 = var3; // L: 35
	} // L: 36

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "14"
	)
	int method4336() {
		return this.field2401 * this.field2407; // L: 39
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1760324394"
	)
	public static int method4335(int var0) {
		long var2 = ViewportMouse.ViewportMouse_entityTags[var0]; // L: 74
		int var1 = (int)(var2 >>> 7 & 127L); // L: 76
		return var1; // L: 78
	}
}
