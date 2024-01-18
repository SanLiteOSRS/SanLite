import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hz")
@Implements("FloorUnderlayDefinition")
public class FloorUnderlayDefinition extends DualNode {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	static AbstractArchive field2035;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	static EvictingDualNodeHashTable field2039;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1495124097
	)
	@Export("rgb")
	int rgb;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 2108185927
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1666836151
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1379751603
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -253665703
	)
	@Export("hueMultiplier")
	public int hueMultiplier;

	static {
		field2039 = new EvictingDualNodeHashTable(64); // L: 11
	}

	FloorUnderlayDefinition() {
		this.rgb = 0; // L: 12
	} // L: 18

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2050153953"
	)
	@Export("postDecode")
	void postDecode() {
		this.setHsl(this.rgb); // L: 36
	} // L: 37

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Luk;II)V",
		garbageValue = "-1389646258"
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luk;IIB)V",
		garbageValue = "64"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) { // L: 48
			this.rgb = var1.readMedium();
		}

	} // L: 50

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1980721773"
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
		double var16 = (var10 + var8) / 2.0D; // L: 64
		if (var8 != var10) { // L: 65
			if (var16 < 0.5D) { // L: 66
				var14 = (var10 - var8) / (var10 + var8);
			}

			if (var16 >= 0.5D) { // L: 67
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var2 == var10) { // L: 68
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var10 == var4) { // L: 69
				var12 = (var6 - var2) / (var10 - var8) + 2.0D;
			} else if (var6 == var10) {
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
			this.hueMultiplier = (int)(512.0D * var14 * (1.0D - var16));
		} else {
			this.hueMultiplier = (int)(var14 * var16 * 512.0D); // L: 80
		}

		if (this.hueMultiplier < 1) { // L: 81
			this.hueMultiplier = 1;
		}

		this.hue = (int)(var12 * (double)this.hueMultiplier); // L: 82
	} // L: 83
}
