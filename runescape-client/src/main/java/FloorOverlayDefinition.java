import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hg")
@Implements("FloorOverlayDefinition")
public class FloorOverlayDefinition extends DualNode {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("FloorOverlayDefinition_archive")
	public static AbstractArchive FloorOverlayDefinition_archive;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("FloorOverlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorOverlayDefinition_cached;
	@ObfuscatedName("hr")
	static int[] field2268;
	@ObfuscatedName("uh")
	@ObfuscatedSignature(
		descriptor = "Lch;"
	)
	static Decimator field2259;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 2120418151
	)
	@Export("primaryRgb")
	public int primaryRgb;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 91594995
	)
	@Export("texture")
	public int texture;
	@ObfuscatedName("ax")
	@Export("hideUnderlay")
	public boolean hideUnderlay;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1909348793
	)
	@Export("secondaryRgb")
	public int secondaryRgb;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1169710103
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -914575673
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1082285021
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 358320181
	)
	@Export("secondaryHue")
	public int secondaryHue;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -855683399
	)
	@Export("secondarySaturation")
	public int secondarySaturation;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1715930167
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "10897"
	)
	@Export("postDecode")
	public void postDecode() {
		if (this.secondaryRgb != -1) { // L: 28
			this.setHsl(this.secondaryRgb); // L: 29
			this.secondaryHue = this.hue;
			this.secondarySaturation = this.saturation;
			this.secondaryLightness = this.lightness;
		}

		this.setHsl(this.primaryRgb);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ltz;II)V",
		garbageValue = "1351995456"
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ltz;IIB)V",
		garbageValue = "60"
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2003241893"
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
		this.hue = (int)(256.0D * var12); // L: 75
		this.saturation = (int)(var14 * 256.0D); // L: 76
		this.lightness = (int)(var16 * 256.0D); // L: 77
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "23674"
	)
	public static int method4023(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765); // L: 30
		var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459); // L: 31
		var0 = var0 + (var0 >>> 4) & 252645135; // L: 32
		var0 += var0 >>> 8; // L: 33
		var0 += var0 >>> 16; // L: 34
		return var0 & 255; // L: 35
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "339603144"
	)
	public static boolean method4035(int var0) {
		return var0 == WorldMapDecorationType.field3804.id; // L: 51
	}

	@ObfuscatedName("mm")
	@ObfuscatedSignature(
		descriptor = "(Lmb;I)Z",
		garbageValue = "1654223314"
	)
	static final boolean method4043(Widget var0) {
		int var1 = var0.contentType; // L: 12389
		if (var1 == 205) { // L: 12390
			Client.logoutTimer = 250; // L: 12391
			return true; // L: 12392
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) { // L: 12394
				var2 = (var1 - 300) / 2; // L: 12395
				var3 = var1 & 1; // L: 12396
				Client.playerAppearance.changeAppearance(var2, var3 == 1); // L: 12397
			}

			if (var1 >= 314 && var1 <= 323) { // L: 12399
				var2 = (var1 - 314) / 2; // L: 12400
				var3 = var1 & 1; // L: 12401
				Client.playerAppearance.method6014(var2, var3 == 1); // L: 12402
			}

			if (var1 == 324) { // L: 12404
				Client.playerAppearance.method6015(0);
			}

			if (var1 == 325) { // L: 12405
				Client.playerAppearance.method6015(1);
			}

			if (var1 == 326) { // L: 12406
				PacketBufferNode var4 = ObjectComposition.getPacketBufferNode(ClientPacket.field3140, Client.packetWriter.isaacCipher); // L: 12408
				Client.playerAppearance.write(var4.packetBuffer); // L: 12409
				Client.packetWriter.addNode(var4); // L: 12410
				return true; // L: 12411
			} else {
				return false; // L: 12413
			}
		}
	}
}
