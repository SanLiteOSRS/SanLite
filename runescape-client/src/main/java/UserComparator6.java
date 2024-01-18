import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eq")
@Implements("UserComparator6")
public class UserComparator6 extends AbstractUserComparator {
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1549455343
	)
	@Export("Interpreter_intStackSize")
	static int Interpreter_intStackSize;
	@ObfuscatedName("am")
	@Export("reversed")
	final boolean reversed;

	public UserComparator6(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lrj;Lrj;B)I",
		garbageValue = "37"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) { // L: 14
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername()); // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "1306902939"
	)
	@Export("decompressBytes")
	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 410
		int var2 = var1.readUnsignedByte(); // L: 411
		int var3 = var1.readInt(); // L: 412
		if (var3 < 0 || AbstractArchive.field4364 != 0 && var3 > AbstractArchive.field4364) { // L: 413
			throw new RuntimeException(); // L: 414
		} else if (var2 == 0) { // L: 416
			byte[] var6 = new byte[var3]; // L: 417
			var1.readBytes(var6, 0, var3); // L: 418
			return var6; // L: 419
		} else {
			int var4 = var1.readInt(); // L: 422
			if (var4 >= 0 && (AbstractArchive.field4364 == 0 || var4 <= AbstractArchive.field4364)) { // L: 423
				byte[] var5 = new byte[var4]; // L: 426
				if (var2 == 1) { // L: 427
					BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
				} else {
					AbstractArchive.gzipDecompressor.decompress(var1, var5); // L: 428
				}

				return var5; // L: 429
			} else {
				throw new RuntimeException(); // L: 424
			}
		}
	}
}
