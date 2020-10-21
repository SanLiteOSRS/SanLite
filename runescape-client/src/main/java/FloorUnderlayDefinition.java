import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ia")
@Implements("FloorUnderlayDefinition")
public class FloorUnderlayDefinition extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Liw;"
	)
	@Export("FloorUnderlayDefinition_archive")
	static AbstractArchive FloorUnderlayDefinition_archive;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Lev;"
	)
	@Export("FloorUnderlayDefinition_cached")
	static EvictingDualNodeHashTable FloorUnderlayDefinition_cached;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1168290687
	)
	@Export("rgb")
	int rgb;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1022846445
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1296043119
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -834824709
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1129037543
	)
	@Export("hueMultiplier")
	public int hueMultiplier;

	static {
		FloorUnderlayDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	FloorUnderlayDefinition() {
		this.rgb = 0;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1295425125"
	)
	@Export("postDecode")
	void postDecode() {
		this.setHsl(this.rgb);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Lkb;II)V",
		garbageValue = "387811374"
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

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(Lkb;IIS)V",
		garbageValue = "255"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) {
			this.rgb = var1.readMedium();
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "1228051433"
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
		double var16 = (var10 + var8) / 2.0D;
		if (var8 != var10) {
			if (var16 < 0.5D) {
				var14 = (var10 - var8) / (var10 + var8);
			}

			if (var16 >= 0.5D) {
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var10 == var2) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) {
				var12 = 2.0D + (var6 - var2) / (var10 - var8);
			} else if (var6 == var10) {
				var12 = 4.0D + (var2 - var4) / (var10 - var8);
			}
		}

		var12 /= 6.0D;
		this.saturation = (int)(256.0D * var14);
		this.lightness = (int)(256.0D * var16);
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

		if (var16 > 0.5D) {
			this.hueMultiplier = (int)(512.0D * (1.0D - var16) * var14);
		} else {
			this.hueMultiplier = (int)(var14 * var16 * 512.0D);
		}

		if (this.hueMultiplier < 1) {
			this.hueMultiplier = 1;
		}

		this.hue = (int)((double)this.hueMultiplier * var12);
	}
}
