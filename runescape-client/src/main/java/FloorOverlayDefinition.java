import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gz")
@Implements("FloorOverlayDefinition")
public class FloorOverlayDefinition extends DualNode {
	@ObfuscatedName("tw")
	@ObfuscatedGetter(
		intValue = -1461054387
	)
	static int field2266;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("FloorOverlayDefinition_archive")
	public static AbstractArchive FloorOverlayDefinition_archive;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("FloorOverlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorOverlayDefinition_cached;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1932156485
	)
	@Export("primaryRgb")
	public int primaryRgb;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -324883547
	)
	@Export("texture")
	public int texture;
	@ObfuscatedName("z")
	@Export("hideUnderlay")
	public boolean hideUnderlay;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -788139287
	)
	@Export("secondaryRgb")
	public int secondaryRgb;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 2059431479
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1087787593
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1590005757
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -594146849
	)
	@Export("secondaryHue")
	public int secondaryHue;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 92274617
	)
	@Export("secondarySaturation")
	public int secondarySaturation;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1733464847
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

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "24"
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lrd;II)V",
		garbageValue = "-1230969930"
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

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lrd;III)V",
		garbageValue = "573553274"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) { // L: 46
			this.primaryRgb = var1.readMedium();
		} else if (var2 == 2) {
			this.texture = var1.readUnsignedByte(); // L: 47
		} else if (var2 == 5) { // L: 48
			this.hideUnderlay = false;
		} else if (var2 == 7) {
			this.secondaryRgb = var1.readMedium(); // L: 49
		} else if (var2 == 8) { // L: 50
		}

	} // L: 52

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "338648813"
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
				var14 = (var10 - var8) / (var10 + var8);
			}

			if (var16 >= 0.5D) { // L: 69
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var10 == var2) { // L: 70
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) { // L: 71
				var12 = 2.0D + (var6 - var2) / (var10 - var8);
			} else if (var10 == var6) { // L: 72
				var12 = 4.0D + (var2 - var4) / (var10 - var8);
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

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "613614059"
	)
	static final void method4027(int var0, int var1) {
		if (var0 < 128) { // L: 4192
			var0 = 128;
		}

		if (var0 > 383) { // L: 4193
			var0 = 383;
		}

		if (class103.cameraPitch < var0) { // L: 4194
			class103.cameraPitch = (var0 - class103.cameraPitch) * AttackOption.field1320 / 1000 + class103.cameraPitch + Message.field485; // L: 4195
			if (class103.cameraPitch > var0) { // L: 4196
				class103.cameraPitch = var0;
			}
		}

		if (class103.cameraPitch > var0) { // L: 4198
			class103.cameraPitch -= (class103.cameraPitch - var0) * AttackOption.field1320 / 1000 + Message.field485; // L: 4199
			if (class103.cameraPitch < var0) { // L: 4200
				class103.cameraPitch = var0;
			}
		}

		int var2 = var1 - class285.cameraYaw; // L: 4202
		if (var2 > 1024) { // L: 4203
			var2 -= 2048;
		}

		if (var2 < -1024) { // L: 4204
			var2 += 2048;
		}

		if (var2 > 0) { // L: 4205
			class285.cameraYaw = var2 * AttackOption.field1320 / 1000 + class285.cameraYaw + Message.field485; // L: 4206
			class285.cameraYaw &= 2047; // L: 4207
		}

		if (var2 < 0) { // L: 4209
			class285.cameraYaw -= -var2 * AttackOption.field1320 / 1000 + Message.field485; // L: 4210
			class285.cameraYaw &= 2047; // L: 4211
		}

		int var3 = var1 - class285.cameraYaw; // L: 4213
		if (var3 > 1024) { // L: 4214
			var3 -= 2048;
		}

		if (var3 < -1024) { // L: 4215
			var3 += 2048;
		}

		if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) { // L: 4216
			class285.cameraYaw = var1;
		}

	} // L: 4217
}
