import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fp")
@Implements("FloorUnderlayDefinition")
public class FloorUnderlayDefinition extends DualNode {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("FloorUnderlayDefinition_archive")
	public static AbstractArchive FloorUnderlayDefinition_archive;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("FloorUnderlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorUnderlayDefinition_cached;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -775773749
	)
	@Export("rgb")
	int rgb;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -842998907
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 2077270313
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1956452595
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 660177459
	)
	@Export("hueMultiplier")
	public int hueMultiplier;

	static {
		FloorUnderlayDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	public FloorUnderlayDefinition() {
		this.rgb = 0;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2098968671"
	)
	@Export("postDecode")
	public void postDecode() {
		this.setHsl(this.rgb);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lop;II)V",
		garbageValue = "-1624898788"
	)
	@Export("decode")
	public void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 0) {
				return;
			}

			this.decodeNext(var1, var3, var2);
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lop;III)V",
		garbageValue = "1243167673"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) {
			this.rgb = var1.readMedium();
		}

	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "44"
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
				var14 = (var10 - var8) / (var8 + var10);
			}

			if (var16 >= 0.5D) {
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var10 == var2) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var10 == var4) {
				var12 = (var6 - var2) / (var10 - var8) + 2.0D;
			} else if (var6 == var10) {
				var12 = 4.0D + (var2 - var4) / (var10 - var8);
			}
		}

		var12 /= 6.0D;
		this.saturation = (int)(var14 * 256.0D);
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

		if (var16 > 0.5D) {
			this.hueMultiplier = (int)(var14 * (1.0D - var16) * 512.0D);
		} else {
			this.hueMultiplier = (int)(512.0D * var14 * var16);
		}

		if (this.hueMultiplier < 1) {
			this.hueMultiplier = 1;
		}

		this.hue = (int)((double)this.hueMultiplier * var12);
	}

	@ObfuscatedName("i")
	public static final void method3190(long var0) {
		if (var0 > 0L) {
			if (var0 % 10L == 0L) {
				AttackOption.method2308(var0 - 1L);
				AttackOption.method2308(1L);
			} else {
				AttackOption.method2308(var0);
			}

		}
	}
}
