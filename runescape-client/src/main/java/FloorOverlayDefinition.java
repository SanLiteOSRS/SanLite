import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hj")
@Implements("FloorOverlayDefinition")
public class FloorOverlayDefinition extends DualNode {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("FloorOverlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorOverlayDefinition_cached;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1765451533
	)
	@Export("primaryRgb")
	public int primaryRgb;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 911416629
	)
	@Export("texture")
	public int texture;
	@ObfuscatedName("aq")
	@Export("hideUnderlay")
	public boolean hideUnderlay;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1654002855
	)
	@Export("secondaryRgb")
	public int secondaryRgb;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -296564859
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1586934865
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1180819355
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1181612697
	)
	@Export("secondaryHue")
	public int secondaryHue;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 515374741
	)
	@Export("secondarySaturation")
	public int secondarySaturation;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 495350763
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "510902427"
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Luk;IB)V",
		garbageValue = "54"
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Luk;III)V",
		garbageValue = "1715850925"
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "103"
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
		if (var8 != var10) { // L: 67
			if (var16 < 0.5D) { // L: 68
				var14 = (var10 - var8) / (var8 + var10);
			}

			if (var16 >= 0.5D) { // L: 69
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var2 == var10) { // L: 70
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) { // L: 71
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

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Lbl;B)V",
		garbageValue = "63"
	)
	@Export("PcmStream_disable")
	static final void PcmStream_disable(PcmStream var0) {
		var0.active = false; // L: 230
		if (var0.sound != null) { // L: 231
			var0.sound.position = 0;
		}

		for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
			PcmStream_disable(var1); // L: 232
		}

	} // L: 233
}
