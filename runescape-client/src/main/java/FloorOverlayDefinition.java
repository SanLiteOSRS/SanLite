import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hy")
@Implements("FloorOverlayDefinition")
public class FloorOverlayDefinition extends DualNode {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("FloorOverlayDefinition_archive")
	public static AbstractArchive FloorOverlayDefinition_archive;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("FloorOverlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorOverlayDefinition_cached;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -9900189
	)
	@Export("primaryRgb")
	public int primaryRgb;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1829384013
	)
	@Export("texture")
	public int texture;
	@ObfuscatedName("at")
	@Export("hideUnderlay")
	public boolean hideUnderlay;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1985336649
	)
	@Export("secondaryRgb")
	public int secondaryRgb;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1781308269
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1434722665
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 320181271
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1672070217
	)
	@Export("secondaryHue")
	public int secondaryHue;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 697068525
	)
	@Export("secondarySaturation")
	public int secondarySaturation;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -699410459
	)
	@Export("secondaryLightness")
	public int secondaryLightness;

	static {
		FloorOverlayDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	FloorOverlayDefinition() {
		this.primaryRgb = 0; // L: 12
		this.texture = -1; // L: 13
		this.hideUnderlay = true; // L: 14
		this.secondaryRgb = -1; // L: 15
	} // L: 23

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1271191927"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.secondaryRgb != -1) { // L: 37
			this.setHsl(this.secondaryRgb); // L: 38
			this.secondaryHue = this.hue; // L: 39
			this.secondarySaturation = this.saturation; // L: 40
			this.secondaryLightness = this.lightness; // L: 41
		}

		this.setHsl(this.primaryRgb); // L: 43
	} // L: 44

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ltc;IS)V",
		garbageValue = "-29838"
	)
	@Export("decode")
	void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte(); // L: 48
			if (var3 == 0) { // L: 49
				return; // L: 52
			}

			this.decodeNext(var1, var3, var2); // L: 50
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ltc;III)V",
		garbageValue = "756864898"
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
			this.secondaryRgb = var1.readMedium(); // L: 58
		} else if (var2 == 8) { // L: 59
		}

	} // L: 61

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-91"
	)
	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = (double)(var1 >> 16 & 255) / 256.0D; // L: 64
		double var4 = (double)(var1 >> 8 & 255) / 256.0D; // L: 65
		double var6 = (double)(var1 & 255) / 256.0D; // L: 66
		double var8 = var2; // L: 67
		if (var4 < var2) { // L: 68
			var8 = var4;
		}

		if (var6 < var8) { // L: 69
			var8 = var6;
		}

		double var10 = var2; // L: 70
		if (var4 > var2) { // L: 71
			var10 = var4;
		}

		if (var6 > var10) { // L: 72
			var10 = var6;
		}

		double var12 = 0.0D; // L: 73
		double var14 = 0.0D; // L: 74
		double var16 = (var10 + var8) / 2.0D; // L: 75
		if (var8 != var10) { // L: 76
			if (var16 < 0.5D) { // L: 77
				var14 = (var10 - var8) / (var10 + var8);
			}

			if (var16 >= 0.5D) { // L: 78
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var10 == var2) { // L: 79
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var10 == var4) { // L: 80
				var12 = 2.0D + (var6 - var2) / (var10 - var8);
			} else if (var6 == var10) {
				var12 = 4.0D + (var2 - var4) / (var10 - var8); // L: 81
			}
		}

		var12 /= 6.0D; // L: 83
		this.hue = (int)(var12 * 256.0D); // L: 84
		this.saturation = (int)(var14 * 256.0D); // L: 85
		this.lightness = (int)(256.0D * var16); // L: 86
		if (this.saturation < 0) { // L: 87
			this.saturation = 0;
		} else if (this.saturation > 255) { // L: 88
			this.saturation = 255;
		}

		if (this.lightness < 0) { // L: 89
			this.lightness = 0;
		} else if (this.lightness > 255) { // L: 90
			this.lightness = 255;
		}

	} // L: 91

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Lhp;",
		garbageValue = "-363569805"
	)
	@Export("getEnum")
	public static EnumComposition getEnum(int var0) {
		EnumComposition var1 = (EnumComposition)EnumComposition.EnumDefinition_cached.get((long)var0); // L: 29
		if (var1 != null) { // L: 30
			return var1;
		} else {
			byte[] var2 = EnumComposition.EnumDefinition_archive.takeFile(8, var0); // L: 31
			var1 = new EnumComposition(); // L: 32
			if (var2 != null) { // L: 33
				var1.decode(new Buffer(var2));
			}

			EnumComposition.EnumDefinition_cached.put(var1, (long)var0); // L: 34
			return var1; // L: 35
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lni;Ljava/lang/String;Ljava/lang/String;B)[Lty;",
		garbageValue = "-3"
	)
	public static IndexedSprite[] method3986(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) { // L: 54
			return null;
		} else {
			int var3 = var0.getGroupId(var1); // L: 55
			int var4 = var0.getFileId(var3, var2); // L: 56
			return MouseRecorder.method2253(var0, var3, var4); // L: 57
		}
	}
}
