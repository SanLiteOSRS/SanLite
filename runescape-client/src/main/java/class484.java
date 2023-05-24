import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sc")
public class class484 {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 265217111
	)
	static final int field4973;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -858518957
	)
	static final int field4974;

	static {
		field4973 = (int)(Math.pow(2.0D, 4.0D) - 1.0D); // L: 10
		field4974 = (int)(Math.pow(2.0D, 8.0D) - 1.0D); // L: 11
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lnm;III)Ltq;",
		garbageValue = "-1572989467"
	)
	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2); // L: 91
		boolean var3;
		if (var4 == null) { // L: 92
			var3 = false; // L: 93
		} else {
			class485.SpriteBuffer_decode(var4); // L: 96
			var3 = true; // L: 97
		}

		return !var3 ? null : class179.method3633(); // L: 99 100
	}
}
