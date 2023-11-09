import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gc")
@Implements("FloorUnderlayDefinition")
public class FloorUnderlayDefinition extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("FloorUnderlayDefinition_archive")
	public static AbstractArchive FloorUnderlayDefinition_archive;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("FloorUnderlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorUnderlayDefinition_cached;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -425847811
	)
	@Export("rgb")
	int rgb;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1860129533
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1269276951
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -661866217
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1462532523
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
		descriptor = "(I)V",
		garbageValue = "47120163"
	)
	@Export("postDecode")
	void postDecode() {
		this.setHsl(this.rgb); // L: 32
	} // L: 33

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lrd;IS)V",
		garbageValue = "334"
	)
	@Export("decode")
	void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte(); // L: 37
			if (var3 == 0) { // L: 38
				return; // L: 41
			}

			this.decodeNext(var1, var3, var2); // L: 39
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lrd;III)V",
		garbageValue = "723763837"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) { // L: 44
			this.rgb = var1.readMedium();
		}

	} // L: 46

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2083501850"
	)
	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = (double)(var1 >> 16 & 255) / 256.0D; // L: 49
		double var4 = (double)(var1 >> 8 & 255) / 256.0D; // L: 50
		double var6 = (double)(var1 & 255) / 256.0D; // L: 51
		double var8 = var2; // L: 52
		if (var4 < var2) { // L: 53
			var8 = var4;
		}

		if (var6 < var8) { // L: 54
			var8 = var6;
		}

		double var10 = var2; // L: 55
		if (var4 > var2) { // L: 56
			var10 = var4;
		}

		if (var6 > var10) { // L: 57
			var10 = var6;
		}

		double var12 = 0.0D; // L: 58
		double var14 = 0.0D; // L: 59
		double var16 = (var10 + var8) / 2.0D; // L: 60
		if (var8 != var10) { // L: 61
			if (var16 < 0.5D) { // L: 62
				var14 = (var10 - var8) / (var8 + var10);
			}

			if (var16 >= 0.5D) { // L: 63
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var2 == var10) { // L: 64
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) { // L: 65
				var12 = 2.0D + (var6 - var2) / (var10 - var8);
			} else if (var6 == var10) {
				var12 = 4.0D + (var2 - var4) / (var10 - var8); // L: 66
			}
		}

		var12 /= 6.0D; // L: 68
		this.saturation = (int)(256.0D * var14); // L: 69
		this.lightness = (int)(var16 * 256.0D); // L: 70
		if (this.saturation < 0) { // L: 71
			this.saturation = 0;
		} else if (this.saturation > 255) { // L: 72
			this.saturation = 255;
		}

		if (this.lightness < 0) { // L: 73
			this.lightness = 0;
		} else if (this.lightness > 255) { // L: 74
			this.lightness = 255;
		}

		if (var16 > 0.5D) { // L: 75
			this.hueMultiplier = (int)(512.0D * (1.0D - var16) * var14);
		} else {
			this.hueMultiplier = (int)(512.0D * var14 * var16); // L: 76
		}

		if (this.hueMultiplier < 1) { // L: 77
			this.hueMultiplier = 1;
		}

		this.hue = (int)(var12 * (double)this.hueMultiplier); // L: 78
	} // L: 79

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "2038548197"
	)
	static final int method3806(int var0, int var1) {
		if (var0 == -2) { // L: 1009
			return 12345678;
		} else if (var0 == -1) { // L: 1010
			if (var1 < 2) { // L: 1011
				var1 = 2;
			} else if (var1 > 126) { // L: 1012
				var1 = 126;
			}

			return var1; // L: 1013
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 1015
			if (var1 < 2) { // L: 1016
				var1 = 2;
			} else if (var1 > 126) { // L: 1017
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 1018
		}
	}
}
