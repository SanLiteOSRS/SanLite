import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hs")
@Implements("FloorUnderlayDefinition")
public class FloorUnderlayDefinition extends DualNode {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	public static AbstractArchive field2112;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("FloorUnderlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorUnderlayDefinition_cached;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1996012319
	)
	@Export("rgb")
	int rgb;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1722213545
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 371900765
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1490313473
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1165742935
	)
	@Export("hueMultiplier")
	public int hueMultiplier;

	static {
		FloorUnderlayDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	public FloorUnderlayDefinition() {
		this.rgb = 0; // L: 12
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-525788142"
	)
	@Export("postDecode")
	public void postDecode() {
		this.setHsl(this.rgb); // L: 23
	} // L: 24

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ltm;II)V",
		garbageValue = "1362647388"
	)
	@Export("decode")
	public void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte(); // L: 28
			if (var3 == 0) { // L: 29
				return; // L: 32
			}

			this.decodeNext(var1, var3, var2); // L: 30
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltm;IIB)V",
		garbageValue = "34"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) { // L: 35
			this.rgb = var1.readMedium();
		}

	} // L: 37

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-628456834"
	)
	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = (double)(var1 >> 16 & 255) / 256.0D; // L: 40
		double var4 = (double)(var1 >> 8 & 255) / 256.0D; // L: 41
		double var6 = (double)(var1 & 255) / 256.0D; // L: 42
		double var8 = var2; // L: 43
		if (var4 < var2) { // L: 44
			var8 = var4;
		}

		if (var6 < var8) { // L: 45
			var8 = var6;
		}

		double var10 = var2; // L: 46
		if (var4 > var2) { // L: 47
			var10 = var4;
		}

		if (var6 > var10) { // L: 48
			var10 = var6;
		}

		double var12 = 0.0D; // L: 49
		double var14 = 0.0D; // L: 50
		double var16 = (var8 + var10) / 2.0D; // L: 51
		if (var10 != var8) { // L: 52
			if (var16 < 0.5D) { // L: 53
				var14 = (var10 - var8) / (var8 + var10);
			}

			if (var16 >= 0.5D) { // L: 54
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var2 == var10) { // L: 55
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var10 == var4) { // L: 56
				var12 = (var6 - var2) / (var10 - var8) + 2.0D;
			} else if (var10 == var6) {
				var12 = 4.0D + (var2 - var4) / (var10 - var8); // L: 57
			}
		}

		var12 /= 6.0D; // L: 59
		this.saturation = (int)(var14 * 256.0D); // L: 60
		this.lightness = (int)(256.0D * var16); // L: 61
		if (this.saturation < 0) { // L: 62
			this.saturation = 0;
		} else if (this.saturation > 255) { // L: 63
			this.saturation = 255;
		}

		if (this.lightness < 0) { // L: 64
			this.lightness = 0;
		} else if (this.lightness > 255) { // L: 65
			this.lightness = 255;
		}

		if (var16 > 0.5D) { // L: 66
			this.hueMultiplier = (int)((1.0D - var16) * var14 * 512.0D);
		} else {
			this.hueMultiplier = (int)(var14 * var16 * 512.0D); // L: 67
		}

		if (this.hueMultiplier < 1) { // L: 68
			this.hueMultiplier = 1;
		}

		this.hue = (int)(var12 * (double)this.hueMultiplier); // L: 69
	} // L: 70
}
