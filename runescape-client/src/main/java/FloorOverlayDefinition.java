import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hk")
@Implements("FloorOverlayDefinition")
public class FloorOverlayDefinition extends DualNode {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("FloorOverlayDefinition_archive")
	public static AbstractArchive FloorOverlayDefinition_archive;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	@Export("FloorOverlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorOverlayDefinition_cached;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1889574527
	)
	@Export("primaryRgb")
	public int primaryRgb;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -202963991
	)
	@Export("texture")
	public int texture;
	@ObfuscatedName("au")
	@Export("hideUnderlay")
	public boolean hideUnderlay;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -2085280195
	)
	@Export("secondaryRgb")
	public int secondaryRgb;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 174415927
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 470803713
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 532980473
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -187777599
	)
	@Export("secondaryHue")
	public int secondaryHue;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1797179473
	)
	@Export("secondarySaturation")
	public int secondarySaturation;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1379609783
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
		descriptor = "(I)V",
		garbageValue = "-1436922747"
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lsg;IS)V",
		garbageValue = "128"
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lsg;IIS)V",
		garbageValue = "132"
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2082710578"
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

			if (var10 == var2) { // L: 70
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) { // L: 71
				var12 = 2.0D + (var6 - var2) / (var10 - var8);
			} else if (var10 == var6) {
				var12 = 4.0D + (var2 - var4) / (var10 - var8); // L: 72
			}
		}

		var12 /= 6.0D; // L: 74
		this.hue = (int)(256.0D * var12); // L: 75
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lcl;I)V",
		garbageValue = "1003171316"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) { // L: 2161
			Client.isMembersWorld = var0.isMembersOnly(); // L: 2162
			boolean var1 = var0.isMembersOnly(); // L: 2163
			if (var1 != FileSystem.ItemComposition_inMembersWorld) { // L: 2165
				class379.method7393(); // L: 2166
				FileSystem.ItemComposition_inMembersWorld = var1; // L: 2167
			}
		}

		if (var0.properties != Client.worldProperties) { // L: 2171
			Archive var3 = class452.archive8; // L: 2172
			int var2 = var0.properties; // L: 2173
			if ((var2 & 536870912) != 0) { // L: 2175
				Canvas.logoSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(var3, "logo_deadman_mode", ""); // L: 2176
			} else if ((var2 & 1073741824) != 0) { // L: 2178
				Canvas.logoSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(var3, "logo_seasonal_mode", ""); // L: 2179
			} else if ((var2 & 256) != 0) { // L: 2181
				Canvas.logoSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(var3, "logo_speedrunning", ""); // L: 2182
			} else {
				Canvas.logoSprite = MusicPatchNode2.SpriteBuffer_getIndexedSpriteByName(var3, "logo", ""); // L: 2185
			}
		}

		UserComparator8.worldHost = var0.host; // L: 2189
		Client.worldId = var0.id; // L: 2190
		Client.worldProperties = var0.properties; // L: 2191
		FriendsChatManager.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000; // L: 2192
		class127.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000; // L: 2193
		ItemContainer.currentPort = FriendsChatManager.worldPort; // L: 2194
	} // L: 2195

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ILch;ZI)I",
		garbageValue = "2032974834"
	)
	static int method4123(int var0, Script var1, boolean var2) {
		return 2; // L: 3195
	}
}
