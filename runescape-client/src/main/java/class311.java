import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lq")
public class class311 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class311 field3284;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class311 field3275;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class311 field3276;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class311 field3277;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class311 field3278;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class311 field3279;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class311 field3286;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class311 field3285;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class311 field3282;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class311 field3281;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class311 field3287;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class311 field3280;
	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	static Archive field3274;

	static {
		field3284 = new class311(4); // L: 5
		field3275 = new class311(4); // L: 6
		field3276 = new class311(6); // L: 7
		field3277 = new class311(7); // L: 8
		field3278 = new class311(2); // L: 9
		field3279 = new class311(11); // L: 10
		field3286 = new class311(5); // L: 11
		field3285 = new class311(14); // L: 12
		field3282 = new class311(20); // L: 13
		field3281 = new class311(14); // L: 14
		field3287 = new class311(7); // L: 15
		field3280 = new class311(5); // L: 16
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "4"
	)
	class311(int var1) {
	} // L: 22

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "854314220"
	)
	@Export("decompressBytes")
	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 443
		int var2 = var1.readUnsignedByte(); // L: 444
		int var3 = var1.readInt(); // L: 445
		if (var3 < 0 || AbstractArchive.field4398 != 0 && var3 > AbstractArchive.field4398) { // L: 446
			throw new RuntimeException(); // L: 447
		} else if (var2 == 0) { // L: 449
			byte[] var6 = new byte[var3]; // L: 450
			var1.readBytes(var6, 0, var3); // L: 451
			return var6; // L: 452
		} else {
			int var4 = var1.readInt(); // L: 455
			if (var4 >= 0 && (AbstractArchive.field4398 == 0 || var4 <= AbstractArchive.field4398)) { // L: 456
				byte[] var5 = new byte[var4]; // L: 459
				if (var2 == 1) { // L: 460
					BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
				} else {
					AbstractArchive.gzipDecompressor.decompress(var1, var5); // L: 461
				}

				return var5; // L: 462
			} else {
				throw new RuntimeException(); // L: 457
			}
		}
	}
}
