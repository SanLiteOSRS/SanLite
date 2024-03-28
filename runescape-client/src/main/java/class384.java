import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oo")
public class class384 {
	@ObfuscatedName("ax")
	static int[] field4473;

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Loc;III)Lvl;",
		garbageValue = "1824523317"
	)
	static IndexedSprite method7113(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2); // L: 40
		boolean var3;
		if (var4 == null) { // L: 41
			var3 = false; // L: 42
		} else {
			class483.SpriteBuffer_decode(var4); // L: 45
			var3 = true; // L: 46
		}

		return !var3 ? null : class208.method3917(); // L: 48 49
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-814469755"
	)
	@Export("isDigit")
	public static boolean isDigit(char var0) {
		return var0 >= '0' && var0 <= '9'; // L: 153
	}
}
