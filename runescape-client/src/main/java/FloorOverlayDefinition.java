import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ke")
@Implements("FloorOverlayDefinition")
public class FloorOverlayDefinition extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lir;"
	)
	@Export("FloorOverlayDefinition_archive")
	public static AbstractArchive FloorOverlayDefinition_archive;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lgf;"
	)
	@Export("FloorOverlayDefinition_cached")
	static EvictingDualNodeHashTable FloorOverlayDefinition_cached;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 980969933
	)
	@Export("primaryRgb")
	public int primaryRgb;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -2093072057
	)
	@Export("texture")
	public int texture;
	@ObfuscatedName("b")
	@Export("hideUnderlay")
	public boolean hideUnderlay;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1989870403
	)
	@Export("secondaryRgb")
	public int secondaryRgb;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 537487059
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1328712215
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -969196131
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 803362363
	)
	@Export("secondaryHue")
	public int secondaryHue;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 2116212795
	)
	@Export("secondarySaturation")
	public int secondarySaturation;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 61795661
	)
	@Export("secondaryLightness")
	public int secondaryLightness;

	static {
		FloorOverlayDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	FloorOverlayDefinition() {
		this.primaryRgb = 0;
		this.texture = -1;
		this.hideUnderlay = true;
		this.secondaryRgb = -1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "-113"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.secondaryRgb != -1) {
			this.setHsl(this.secondaryRgb);
			this.secondaryHue = this.hue;
			this.secondarySaturation = this.saturation;
			this.secondaryLightness = this.lightness;
		}

		this.setHsl(this.primaryRgb);
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(Lnu;IB)V",
		garbageValue = "6"
	)
	@Export("decode")
	void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 0) {
				return;
			}

			this.decodeNext(var1, var3, var2);
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(Lnu;III)V",
		garbageValue = "-1985782893"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) {
			this.primaryRgb = var1.readMedium();
		} else if (var2 == 2) {
			this.texture = var1.readUnsignedByte();
		} else if (var2 == 5) {
			this.hideUnderlay = false;
		} else if (var2 == 7) {
			this.secondaryRgb = var1.readMedium();
		} else if (var2 == 8) {
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-524815797"
	)
	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = (double)(var1 >> 16 & 255) / 256.0D;
		double var4 = (double)(var1 >> 8 & 255) / 256.0D;
		double var6 = (double)(var1 & 255) / 256.0D;
		double var8 = var2;
		if (var4 < var2) {
			var8 = var4;
		}

		if (var6 < var8) {
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
		double var16 = (var8 + var10) / 2.0D;
		if (var8 != var10) {
			if (var16 < 0.5D) {
				var14 = (var10 - var8) / (var8 + var10);
			}

			if (var16 >= 0.5D) {
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var2 == var10) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var10 == var4) {
				var12 = (var6 - var2) / (var10 - var8) + 2.0D;
			} else if (var6 == var10) {
				var12 = (var2 - var4) / (var10 - var8) + 4.0D;
			}
		}

		var12 /= 6.0D;
		this.hue = (int)(256.0D * var12);
		this.saturation = (int)(256.0D * var14);
		this.lightness = (int)(var16 * 256.0D);
		if (this.saturation < 0) {
			this.saturation = 0;
		} else if (this.saturation > 255) {
			this.saturation = 255;
		}

		if (this.lightness < 0) {
			this.lightness = 0;
		} else if (this.lightness > 255) {
			this.lightness = 255;
		}

	}
}
