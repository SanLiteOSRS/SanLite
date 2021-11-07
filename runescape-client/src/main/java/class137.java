import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("em")
public class class137 {
	@ObfuscatedName("b")
	public static short[][] field1519;

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(Ljf;I)V",
		garbageValue = "644093212"
	)
	static final void method2826(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 324) {
			if (Client.field737 == -1) {
				Client.field737 = var0.spriteId2;
				Client.field581 = var0.spriteId;
			}

			if (Client.playerAppearance.isFemale) {
				var0.spriteId2 = Client.field737;
			} else {
				var0.spriteId2 = Client.field581;
			}

		} else if (var1 == 325) {
			if (Client.field737 == -1) {
				Client.field737 = var0.spriteId2;
				Client.field581 = var0.spriteId;
			}

			if (Client.playerAppearance.isFemale) {
				var0.spriteId2 = Client.field581;
			} else {
				var0.spriteId2 = Client.field737;
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
