import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ib")
public class class213 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lof;IB)V",
		garbageValue = "-69"
	)
	static void method4205(AbstractArchive var0, int var1) {
		if ((var1 & class529.field5187.rsOrdinal()) != 0) { // L: 333
			Login.logoSprite = class173.SpriteBuffer_getIndexedSpriteByName(var0, "logo_deadman_mode", ""); // L: 334
		} else if ((var1 & class529.field5158.rsOrdinal()) != 0) { // L: 336
			Login.logoSprite = class173.SpriteBuffer_getIndexedSpriteByName(var0, "logo_seasonal_mode", ""); // L: 337
		} else if ((var1 & class529.field5169.rsOrdinal()) != 0) { // L: 339
			Login.logoSprite = class173.SpriteBuffer_getIndexedSpriteByName(var0, "logo_speedrunning", ""); // L: 340
		} else {
			Login.logoSprite = class173.SpriteBuffer_getIndexedSpriteByName(var0, "logo", ""); // L: 343
		}

	} // L: 345
}
