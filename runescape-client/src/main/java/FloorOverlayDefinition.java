import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("io")
@Implements("FloorOverlayDefinition")
public class FloorOverlayDefinition extends DualNode {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("FloorOverlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorOverlayDefinition_cached;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 206241625
	)
	@Export("primaryRgb")
	public int primaryRgb;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1464717765
	)
	@Export("texture")
	public int texture;
	@ObfuscatedName("ao")
	@Export("hideUnderlay")
	public boolean hideUnderlay;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1588071097
	)
	@Export("secondaryRgb")
	public int secondaryRgb;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 731732271
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1347460303
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1295466369
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1358889167
	)
	@Export("secondaryHue")
	public int secondaryHue;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1809313821
	)
	@Export("secondarySaturation")
	public int secondarySaturation;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 7366493
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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-178426447"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.secondaryRgb != -1) { // L: 41
			this.setHsl(this.secondaryRgb); // L: 42
			this.secondaryHue = this.hue; // L: 43
			this.secondarySaturation = this.saturation; // L: 44
			this.secondaryLightness = this.lightness; // L: 45
		}

		this.setHsl(this.primaryRgb); // L: 47
	} // L: 48

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lul;IB)V",
		garbageValue = "-33"
	)
	@Export("decode")
	void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte(); // L: 52
			if (var3 == 0) { // L: 53
				return; // L: 56
			}

			this.decodeNext(var1, var3, var2); // L: 54
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lul;III)V",
		garbageValue = "1318940948"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) { // L: 59
			this.primaryRgb = var1.readMedium();
		} else if (var2 == 2) { // L: 60
			this.texture = var1.readUnsignedByte();
		} else if (var2 == 5) { // L: 61
			this.hideUnderlay = false;
		} else if (var2 == 7) {
			this.secondaryRgb = var1.readMedium(); // L: 62
		} else if (var2 == 8) { // L: 63
		}

	} // L: 65

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "2"
	)
	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = (double)(var1 >> 16 & 255) / 256.0D; // L: 68
		double var4 = (double)(var1 >> 8 & 255) / 256.0D; // L: 69
		double var6 = (double)(var1 & 255) / 256.0D; // L: 70
		double var8 = var2; // L: 71
		if (var4 < var2) { // L: 72
			var8 = var4;
		}

		if (var6 < var8) { // L: 73
			var8 = var6;
		}

		double var10 = var2; // L: 74
		if (var4 > var2) { // L: 75
			var10 = var4;
		}

		if (var6 > var10) { // L: 76
			var10 = var6;
		}

		double var12 = 0.0D; // L: 77
		double var14 = 0.0D; // L: 78
		double var16 = (var8 + var10) / 2.0D; // L: 79
		if (var8 != var10) { // L: 80
			if (var16 < 0.5D) { // L: 81
				var14 = (var10 - var8) / (var8 + var10);
			}

			if (var16 >= 0.5D) { // L: 82
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var10 == var2) { // L: 83
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var10 == var4) { // L: 84
				var12 = (var6 - var2) / (var10 - var8) + 2.0D;
			} else if (var6 == var10) {
				var12 = 4.0D + (var2 - var4) / (var10 - var8); // L: 85
			}
		}

		var12 /= 6.0D; // L: 87
		this.hue = (int)(256.0D * var12); // L: 88
		this.saturation = (int)(var14 * 256.0D); // L: 89
		this.lightness = (int)(var16 * 256.0D); // L: 90
		if (this.saturation < 0) { // L: 91
			this.saturation = 0;
		} else if (this.saturation > 255) { // L: 92
			this.saturation = 255;
		}

		if (this.lightness < 0) { // L: 93
			this.lightness = 0;
		} else if (this.lightness > 255) { // L: 94
			this.lightness = 255;
		}

	} // L: 95

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)[Lmi;",
		garbageValue = "-1928270491"
	)
	static LoginPacket[] method4147() {
		return new LoginPacket[]{LoginPacket.field3389, LoginPacket.field3386, LoginPacket.field3387, LoginPacket.field3385, LoginPacket.field3391, LoginPacket.field3388};
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lom;I)V",
		garbageValue = "490485615"
	)
	public static void method4157(AbstractArchive var0) {
		ParamComposition.ParamDefinition_archive = var0; // L: 21
	} // L: 22

	@ObfuscatedName("nx")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1802192770"
	)
	static final void method4148(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127); // L: 12279
		class91.clientPreferences.updateSoundEffectVolume(var0); // L: 12280
	} // L: 12281
}
