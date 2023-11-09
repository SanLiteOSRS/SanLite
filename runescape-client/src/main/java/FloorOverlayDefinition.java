import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gs")
@Implements("FloorOverlayDefinition")
public class FloorOverlayDefinition extends DualNode {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("FloorOverlayDefinition_archive")
	public static AbstractArchive FloorOverlayDefinition_archive;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	@Export("FloorOverlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorOverlayDefinition_cached;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1309786773
	)
	@Export("primaryRgb")
	public int primaryRgb;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -673899207
	)
	@Export("texture")
	public int texture;
	@ObfuscatedName("c")
	@Export("hideUnderlay")
	public boolean hideUnderlay;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 854090491
	)
	@Export("secondaryRgb")
	public int secondaryRgb;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1666995081
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 987371197
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1587823397
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1905676505
	)
	@Export("secondaryHue")
	public int secondaryHue;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1540815289
	)
	@Export("secondarySaturation")
	public int secondarySaturation;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 262785679
	)
	@Export("secondaryLightness")
	public int secondaryLightness;

	static {
		FloorOverlayDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	public FloorOverlayDefinition() {
		this.primaryRgb = 0; // L: 12
		this.texture = -1; // L: 13
		this.hideUnderlay = true; // L: 14
		this.secondaryRgb = -1; // L: 15
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1947171747"
	)
	@Export("postDecode")
	public void postDecode() {
		if (this.secondaryRgb != -1) { // L: 28
			this.setHsl(this.secondaryRgb); // L: 29
			this.secondaryHue = this.hue; // L: 30
			this.secondarySaturation = this.saturation; // L: 31
			this.secondaryLightness = this.lightness; // L: 32
		}

		this.setHsl(this.primaryRgb); // L: 34
	} // L: 35

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqw;II)V",
		garbageValue = "1881228717"
	)
	@Export("decode")
	public void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte(); // L: 39
			if (var3 == 0) { // L: 40
				return; // L: 43
			}

			this.decodeNext(var1, var3, var2); // L: 41
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lqw;III)V",
		garbageValue = "352713725"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) { // L: 46
			this.primaryRgb = var1.readMedium();
		} else if (var2 == 2) {
			this.texture = var1.readUnsignedByte(); // L: 47
		} else if (var2 == 5) { // L: 48
			this.hideUnderlay = false;
		} else if (var2 == 7) {
			this.secondaryRgb = var1.readMedium(); // L: 49
		} else if (var2 == 8) { // L: 50
		}

	} // L: 52

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2132569463"
	)
	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = (double)(var1 >> 16 & 255) / 256.0D; // L: 55
		double var4 = (double)(var1 >> 8 & 255) / 256.0D; // L: 56
		double var6 = (double)(var1 & 255) / 256.0D; // L: 57
		double var8 = var2; // L: 58
		if (var4 < var2) { // L: 59
			var8 = var4;
		}

		if (var6 < var8) { // L: 60
			var8 = var6;
		}

		double var10 = var2;
		if (var4 > var2) {
			var10 = var4;
		}

		if (var6 > var10) {
			var10 = var6;
		}

		double var12 = 0.0D;
		double var14 = 0.0D;
		double var16 = (var10 + var8) / 2.0D;
		if (var10 != var8) {
			if (var16 < 0.5D) { // L: 68
				var14 = (var10 - var8) / (var8 + var10);
			}

			if (var16 >= 0.5D) { // L: 69
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var10 == var2) { // L: 70
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) { // L: 71
				var12 = 2.0D + (var6 - var2) / (var10 - var8);
			} else if (var6 == var10) { // L: 72
				var12 = 4.0D + (var2 - var4) / (var10 - var8);
			}
		}

		var12 /= 6.0D; // L: 74
		this.hue = (int)(256.0D * var12); // L: 75
		this.saturation = (int)(256.0D * var14); // L: 76
		this.lightness = (int)(256.0D * var16); // L: 77
		if (this.saturation < 0) { // L: 78
			this.saturation = 0;
		} else if (this.saturation > 255) { // L: 79
			this.saturation = 255;
		}

		if (this.lightness < 0) { // L: 80
			this.lightness = 0;
		} else if (this.lightness > 255) { // L: 81
			this.lightness = 255;
		}

	} // L: 82

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "17439"
	)
	public static int method3800(int var0) {
		--var0; // L: 61
		var0 |= var0 >>> 1; // L: 62
		var0 |= var0 >>> 2; // L: 63
		var0 |= var0 >>> 4; // L: 64
		var0 |= var0 >>> 8; // L: 65
		var0 |= var0 >>> 16; // L: 66
		return var0 + 1; // L: 67
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1775354023"
	)
	static void method3799() {
		if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 272
			Login.currentLoginField = 1; // L: 273
		} else {
			Login.currentLoginField = 0; // L: 276
		}

	} // L: 278
}
