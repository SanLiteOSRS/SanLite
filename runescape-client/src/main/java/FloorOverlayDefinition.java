import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gq")
@Implements("FloorOverlayDefinition")
public class FloorOverlayDefinition extends DualNode {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	@Export("FloorOverlayDefinition_archive")
	public static AbstractArchive FloorOverlayDefinition_archive;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	@Export("FloorOverlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorOverlayDefinition_cached;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1174010993
	)
	@Export("primaryRgb")
	public int primaryRgb;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1474349185
	)
	@Export("texture")
	public int texture;
	@ObfuscatedName("h")
	@Export("hideUnderlay")
	public boolean hideUnderlay;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1385166991
	)
	@Export("secondaryRgb")
	public int secondaryRgb;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -646835729
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -2135346039
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1306332663
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -714227545
	)
	@Export("secondaryHue")
	public int secondaryHue;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 490012585
	)
	@Export("secondarySaturation")
	public int secondarySaturation;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 2141765349
	)
	@Export("secondaryLightness")
	public int secondaryLightness;

	static {
		FloorOverlayDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	public FloorOverlayDefinition() {
		this.primaryRgb = 0; // L: 12
		this.texture = -1;
		this.hideUnderlay = true; // L: 14
		this.secondaryRgb = -1; // L: 15
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1609785955"
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqr;IB)V",
		garbageValue = "2"
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

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lqr;III)V",
		garbageValue = "-48419062"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) { // L: 46
			this.primaryRgb = var1.readMedium();
		} else if (var2 == 2) { // L: 47
			this.texture = var1.readUnsignedByte();
		} else if (var2 == 5) { // L: 48
			this.hideUnderlay = false;
		} else if (var2 == 7) { // L: 49
			this.secondaryRgb = var1.readMedium();
		} else if (var2 == 8) { // L: 50
		}

	} // L: 52

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "22"
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

		double var10 = var2; // L: 61
		if (var4 > var2) { // L: 62
			var10 = var4;
		}

		if (var6 > var10) { // L: 63
			var10 = var6;
		}

		double var12 = 0.0D; // L: 64
		double var14 = 0.0D; // L: 65
		double var16 = (var10 + var8) / 2.0D; // L: 66
		if (var10 != var8) { // L: 67
			if (var16 < 0.5D) { // L: 68
				var14 = (var10 - var8) / (var10 + var8);
			}

			if (var16 >= 0.5D) { // L: 69
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var10 == var2) { // L: 70
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var10 == var4) { // L: 71
				var12 = 2.0D + (var6 - var2) / (var10 - var8);
			} else if (var10 == var6) {
				var12 = (var2 - var4) / (var10 - var8) + 4.0D; // L: 72
			}
		}

		var12 /= 6.0D; // L: 74
		this.hue = (int)(var12 * 256.0D); // L: 75
		this.saturation = (int)(var14 * 256.0D); // L: 76
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

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1977955677"
	)
	public static int method3863(int var0, int var1) {
		return (var0 << 8) + var1; // L: 13
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(CLmo;B)I",
		garbageValue = "-67"
	)
	@Export("lowercaseChar")
	static int lowercaseChar(char var0, Language var1) {
		int var2 = var0 << 4; // L: 143
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) { // L: 144
			var0 = Character.toLowerCase(var0); // L: 145
			var2 = (var0 << 4) + 1; // L: 146
		}

		if (var0 == 241 && var1 == Language.Language_ES) { // L: 148
			var2 = 1762;
		}

		return var2; // L: 149
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lqr;II)V",
		garbageValue = "-1106441508"
	)
	public static void method3864(Buffer var0, int var1) {
		if (JagexCache.JagexCache_randomDat != null) { // L: 211
			try {
				JagexCache.JagexCache_randomDat.seek(0L); // L: 213
				JagexCache.JagexCache_randomDat.write(var0.array, var1, 24); // L: 214
			} catch (Exception var3) { // L: 216
			}
		}

	} // L: 218
}
