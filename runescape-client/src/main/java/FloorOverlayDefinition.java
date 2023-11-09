import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ia")
@Implements("FloorOverlayDefinition")
public class FloorOverlayDefinition extends DualNode {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("FloorOverlayDefinition_archive")
	public static AbstractArchive FloorOverlayDefinition_archive;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("FloorOverlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorOverlayDefinition_cached;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 993550227
	)
	@Export("primaryRgb")
	public int primaryRgb;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -324845379
	)
	@Export("texture")
	public int texture;
	@ObfuscatedName("as")
	@Export("hideUnderlay")
	public boolean hideUnderlay;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 489051865
	)
	@Export("secondaryRgb")
	public int secondaryRgb;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -702369401
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 14125191
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 85508161
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -717259657
	)
	@Export("secondaryHue")
	public int secondaryHue;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1550018733
	)
	@Export("secondarySaturation")
	public int secondarySaturation;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 9379429
	)
	@Export("secondaryLightness")
	public int secondaryLightness;

	static {
		FloorOverlayDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	public FloorOverlayDefinition() {
		this.primaryRgb = 0;
		this.texture = -1;
		this.hideUnderlay = true;
		this.secondaryRgb = -1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2116098894"
	)
	@Export("postDecode")
	public void postDecode() {
		if (this.secondaryRgb != -1) {
			this.setHsl(this.secondaryRgb);
			this.secondaryHue = this.hue; // L: 41
			this.secondarySaturation = this.saturation; // L: 42
			this.secondaryLightness = this.lightness;
		}

		this.setHsl(this.primaryRgb);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lty;II)V",
		garbageValue = "-120471705"
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lty;IIB)V",
		garbageValue = "25"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) { // L: 57
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1964246469"
	)
	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = (double)(var1 >> 16 & 255) / 256.0D; // L: 66
		double var4 = (double)(var1 >> 8 & 255) / 256.0D; // L: 67
		double var6 = (double)(var1 & 255) / 256.0D; // L: 68
		double var8 = var2; // L: 69
		if (var4 < var2) { // L: 70
			var8 = var4;
		}

		if (var6 < var8) { // L: 71
			var8 = var6;
		}

		double var10 = var2; // L: 72
		if (var4 > var2) { // L: 73
			var10 = var4;
		}

		if (var6 > var10) { // L: 74
			var10 = var6;
		}

		double var12 = 0.0D; // L: 75
		double var14 = 0.0D; // L: 76
		double var16 = (var10 + var8) / 2.0D; // L: 77
		if (var10 != var8) { // L: 78
			if (var16 < 0.5D) { // L: 79
				var14 = (var10 - var8) / (var8 + var10);
			}

			if (var16 >= 0.5D) { // L: 80
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var2 == var10) { // L: 81
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) { // L: 82
				var12 = 2.0D + (var6 - var2) / (var10 - var8);
			} else if (var6 == var10) {
				var12 = 4.0D + (var2 - var4) / (var10 - var8); // L: 83
			}
		}

		var12 /= 6.0D; // L: 85
		this.hue = (int)(256.0D * var12); // L: 86
		this.saturation = (int)(var14 * 256.0D); // L: 87
		this.lightness = (int)(var16 * 256.0D); // L: 88
		if (this.saturation < 0) { // L: 89
			this.saturation = 0;
		} else if (this.saturation > 255) { // L: 90
			this.saturation = 255;
		}

		if (this.lightness < 0) { // L: 91
			this.lightness = 0;
		} else if (this.lightness > 255) { // L: 92
			this.lightness = 255;
		}

	} // L: 93

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lot;I)I",
		garbageValue = "-452810030"
	)
	@Export("compareStrings")
	public static int compareStrings(CharSequence var0, CharSequence var1, Language var2) {
		int var3 = var0.length(); // L: 11
		int var4 = var1.length(); // L: 12
		int var5 = 0; // L: 13
		int var6 = 0; // L: 14
		char var7 = 0; // L: 15
		char var8 = 0; // L: 16

		while (var5 - var7 < var3 || var6 - var8 < var4) { // L: 18
			if (var5 - var7 >= var3) { // L: 19
				return -1;
			}

			if (var6 - var8 >= var4) { // L: 20
				return 1;
			}

			char var9;
			if (var7 != 0) { // L: 23
				var9 = var7; // L: 24
				boolean var14 = false; // L: 25
			} else {
				var9 = var0.charAt(var5++); // L: 27
			}

			char var10;
			if (var8 != 0) { // L: 28
				var10 = var8; // L: 29
				boolean var15 = false; // L: 30
			} else {
				var10 = var1.charAt(var6++); // L: 32
			}

			var7 = ClanSettings.method3292(var9); // L: 33
			var8 = ClanSettings.method3292(var10); // L: 34
			var9 = class102.standardizeChar(var9, var2); // L: 35
			var10 = class102.standardizeChar(var10, var2); // L: 36
			if (var9 != var10 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) { // L: 37
				var9 = Character.toLowerCase(var9); // L: 38
				var10 = Character.toLowerCase(var10); // L: 39
				if (var9 != var10) { // L: 40
					return Decimator.lowercaseChar(var9, var2) - Decimator.lowercaseChar(var10, var2);
				}
			}
		}

		int var16 = Math.min(var3, var4);

		char var12;
		int var17;
		for (var17 = 0; var17 < var16; ++var17) {
			if (var2 == Language.Language_FR) { // L: 45
				var5 = var3 - 1 - var17;
				var6 = var4 - 1 - var17; // L: 47
			} else {
				var6 = var17;
				var5 = var17;
			}

			char var11 = var0.charAt(var5); // L: 50
			var12 = var1.charAt(var6); // L: 51
			if (var12 != var11 && Character.toUpperCase(var11) != Character.toUpperCase(var12)) { // L: 52
				var11 = Character.toLowerCase(var11); // L: 53
				var12 = Character.toLowerCase(var12); // L: 54
				if (var12 != var11) {
					return Decimator.lowercaseChar(var11, var2) - Decimator.lowercaseChar(var12, var2); // L: 55
				}
			}
		}

		var17 = var3 - var4; // L: 58
		if (var17 != 0) { // L: 59
			return var17;
		} else {
			for (int var18 = 0; var18 < var16; ++var18) { // L: 60
				var12 = var0.charAt(var18); // L: 61
				char var13 = var1.charAt(var18); // L: 62
				if (var12 != var13) { // L: 63
					return Decimator.lowercaseChar(var12, var2) - Decimator.lowercaseChar(var13, var2);
				}
			}

			return 0; // L: 65
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "464683458"
	)
	public static void method4061(int var0, int var1) {
		Iterator var2 = class306.field3400.iterator(); // L: 43

		while (var2.hasNext()) {
			class312 var3 = (class312)var2.next(); // L: 44
			var3.vmethod6017(var0, var1); // L: 46
		}

	} // L: 49
}
