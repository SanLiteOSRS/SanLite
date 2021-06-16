import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kf")
public class class309 {
	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	@Export("fontBold12")
	static Font fontBold12;

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(Liv;I)V",
		garbageValue = "1818635453"
	)
	static final void method5671(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 324) {
			if (Client.field890 == -1) {
				Client.field890 = var0.spriteId2;
				Client.field902 = var0.spriteId;
			}

			if (Client.playerAppearance.isFemale) {
				var0.spriteId2 = Client.field890;
			} else {
				var0.spriteId2 = Client.field902;
			}

		} else if (var1 == 325) {
			if (Client.field890 == -1) {
				Client.field890 = var0.spriteId2;
				Client.field902 = var0.spriteId;
			}

			if (Client.playerAppearance.isFemale) {
				var0.spriteId2 = Client.field902;
			} else {
				var0.spriteId2 = Client.field890;
			}

		} else if (var1 == 327) {
			var0.modelAngleX = 150;
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047;
			var0.modelType = 5;
			var0.modelId = 0;
		} else if (var1 == 328) {
			var0.modelAngleX = 150;
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047;
			var0.modelType = 5;
			var0.modelId = 1;
		}
	}
}
