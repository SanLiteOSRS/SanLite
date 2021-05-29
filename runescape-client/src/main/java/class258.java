import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iy")
public class class258 {
	@ObfuscatedName("v")
	@Export("base37DecodeLong")
	public static String base37DecodeLong(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) {
			if (var0 % 37L == 0L) {
				return null;
			} else {
				int var2 = 0;

				for (long var3 = var0; 0L != var3; var3 /= 37L) {
					++var2;
				}

				StringBuilder var5;
				char var8;
				for (var5 = new StringBuilder(var2); 0L != var0; var5.append(var8)) {
					long var6 = var0;
					var0 /= 37L;
					var8 = class305.base37Table[(int)(var6 - 37L * var0)];
					if (var8 == '_') {
						int var9 = var5.length() - 1;
						var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
						var8 = 160;
					}
				}

				var5.reverse();
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
				return var5.toString();
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)[Ljn;",
		garbageValue = "1808084531"
	)
	public static class268[] method4835() {
		return new class268[]{class268.field3540, class268.field3537, class268.field3538, class268.field3539};
	}

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(Lio;I)V",
		garbageValue = "1084146758"
	)
	static final void method4836(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 324) {
			if (Client.field908 == -1) {
				Client.field908 = var0.spriteId2;
				Client.field752 = var0.spriteId;
			}

			if (Client.playerAppearance.isFemale) {
				var0.spriteId2 = Client.field908;
			} else {
				var0.spriteId2 = Client.field752;
			}

		} else if (var1 == 325) {
			if (Client.field908 == -1) {
				Client.field908 = var0.spriteId2;
				Client.field752 = var0.spriteId;
			}

			if (Client.playerAppearance.isFemale) {
				var0.spriteId2 = Client.field752;
			} else {
				var0.spriteId2 = Client.field908;
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
