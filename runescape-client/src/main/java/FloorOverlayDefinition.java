import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hr")
@Implements("FloorOverlayDefinition")
public class FloorOverlayDefinition extends DualNode {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("FloorOverlayDefinition_archive")
	public static AbstractArchive FloorOverlayDefinition_archive;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("FloorOverlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorOverlayDefinition_cached;
	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "[Lui;"
	)
	static SpritePixels[] field2289;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1585644567
	)
	@Export("primaryRgb")
	public int primaryRgb;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 749238791
	)
	@Export("texture")
	public int texture;
	@ObfuscatedName("ac")
	@Export("hideUnderlay")
	public boolean hideUnderlay;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -256809039
	)
	@Export("secondaryRgb")
	public int secondaryRgb;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 62160947
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1090295773
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1895937717
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1243789243
	)
	@Export("secondaryHue")
	public int secondaryHue;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 440214237
	)
	@Export("secondarySaturation")
	public int secondarySaturation;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 301762917
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "32"
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ltm;IB)V",
		garbageValue = "7"
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltm;IIB)V",
		garbageValue = "42"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) { // L: 46
			this.primaryRgb = var1.readMedium();
		} else if (var2 == 2) { // L: 47
			this.texture = var1.readUnsignedByte();
		} else if (var2 == 5) { // L: 48
			this.hideUnderlay = false;
		} else if (var2 == 7) {
			this.secondaryRgb = var1.readMedium(); // L: 49
		} else if (var2 == 8) { // L: 50
		}

	} // L: 52

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1208532862"
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
		double var16 = (var8 + var10) / 2.0D; // L: 66
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
}
