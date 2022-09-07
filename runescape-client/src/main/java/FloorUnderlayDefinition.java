import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fs")
@Implements("FloorUnderlayDefinition")
public class FloorUnderlayDefinition extends DualNode {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("FloorUnderlayDefinition_archive")
	static AbstractArchive FloorUnderlayDefinition_archive;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("FloorUnderlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorUnderlayDefinition_cached;
	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("archive11")
	static Archive archive11;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1415861081
	)
	@Export("rgb")
	int rgb;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 711472625
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1601741227
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -754627641
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 42167891
	)
	@Export("hueMultiplier")
	public int hueMultiplier;

	static {
		FloorUnderlayDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	FloorUnderlayDefinition() {
		this.rgb = 0; // L: 12
	} // L: 18

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "7"
	)
	@Export("postDecode")
	void postDecode() {
		this.setHsl(this.rgb); // L: 36
	} // L: 37

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lqr;II)V",
		garbageValue = "-2144301665"
	)
	@Export("decode")
	void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte(); // L: 41
			if (var3 == 0) { // L: 42
				return; // L: 45
			}

			this.decodeNext(var1, var3, var2); // L: 43
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqr;IIB)V",
		garbageValue = "6"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) { // L: 48
			this.rgb = var1.readMedium();
		}

	} // L: 50

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1992701527"
	)
	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = (double)(var1 >> 16 & 255) / 256.0D; // L: 53
		double var4 = (double)(var1 >> 8 & 255) / 256.0D; // L: 54
		double var6 = (double)(var1 & 255) / 256.0D; // L: 55
		double var8 = var2; // L: 56
		if (var4 < var2) { // L: 57
			var8 = var4;
		}

		if (var6 < var8) { // L: 58
			var8 = var6;
		}

		double var10 = var2; // L: 59
		if (var4 > var2) { // L: 60
			var10 = var4;
		}

		if (var6 > var10) { // L: 61
			var10 = var6;
		}

		double var12 = 0.0D; // L: 62
		double var14 = 0.0D; // L: 63
		double var16 = (var8 + var10) / 2.0D; // L: 64
		if (var8 != var10) { // L: 65
			if (var16 < 0.5D) { // L: 66
				var14 = (var10 - var8) / (var10 + var8);
			}

			if (var16 >= 0.5D) { // L: 67
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var10 == var2) { // L: 68
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var10 == var4) { // L: 69
				var12 = (var6 - var2) / (var10 - var8) + 2.0D;
			} else if (var10 == var6) {
				var12 = (var2 - var4) / (var10 - var8) + 4.0D; // L: 70
			}
		}

		var12 /= 6.0D; // L: 72
		this.saturation = (int)(var14 * 256.0D); // L: 73
		this.lightness = (int)(256.0D * var16); // L: 74
		if (this.saturation < 0) { // L: 75
			this.saturation = 0;
		} else if (this.saturation > 255) { // L: 76
			this.saturation = 255;
		}

		if (this.lightness < 0) { // L: 77
			this.lightness = 0;
		} else if (this.lightness > 255) { // L: 78
			this.lightness = 255;
		}

		if (var16 > 0.5D) { // L: 79
			this.hueMultiplier = (int)(var14 * (1.0D - var16) * 512.0D);
		} else {
			this.hueMultiplier = (int)(512.0D * var16 * var14); // L: 80
		}

		if (this.hueMultiplier < 1) { // L: 81
			this.hueMultiplier = 1;
		}

		this.hue = (int)(var12 * (double)this.hueMultiplier); // L: 82
	} // L: 83
}
