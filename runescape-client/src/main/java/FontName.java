import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sg")
@Implements("FontName")
public class FontName {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	@Export("FontName_plain11")
	public static final FontName FontName_plain11;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	@Export("FontName_plain12")
	public static final FontName FontName_plain12;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	@Export("FontName_bold12")
	public static final FontName FontName_bold12;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	@Export("FontName_verdana11")
	public static final FontName FontName_verdana11;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	@Export("FontName_verdana13")
	public static final FontName FontName_verdana13;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	@Export("FontName_verdana15")
	public static final FontName FontName_verdana15;
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	@Export("worldSelectRightSprite")
	static IndexedSprite worldSelectRightSprite;
	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("archive13")
	static Archive archive13;
	@ObfuscatedName("un")
	@ObfuscatedGetter(
		intValue = -99375235
	)
	static int field4949;
	@ObfuscatedName("ag")
	@Export("name")
	String name;

	static {
		FontName_plain11 = new FontName("p11_full"); // L: 7
		FontName_plain12 = new FontName("p12_full"); // L: 8
		FontName_bold12 = new FontName("b12_full"); // L: 9
		FontName_verdana11 = new FontName("verdana_11pt_regular"); // L: 10
		FontName_verdana13 = new FontName("verdana_13pt_regular"); // L: 11
		FontName_verdana15 = new FontName("verdana_15pt_regular"); // L: 12
	}

	FontName(String var1) {
		this.name = var1; // L: 20
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-821041494"
	)
	static int method8744(int var0, int var1) {
		FloorOverlayDefinition var2 = class131.method3024(var0); // L: 15
		if (var2 == null) {
			return var1; // L: 17
		} else {
			int var4;
			int var5;
			int var6;
			int var7;
			int var8;
			if (var2.secondaryRgb >= 0) { // L: 19
				var4 = var2.secondaryHue;
				var5 = var2.secondarySaturation;
				var6 = var2.secondaryLightness;
				if (var6 > 179) { // L: 25
					var5 /= 2;
				}

				if (var6 > 192) { // L: 26
					var5 /= 2;
				}

				if (var6 > 217) { // L: 27
					var5 /= 2;
				}

				if (var6 > 243) { // L: 28
					var5 /= 2;
				}

				var7 = (var5 / 32 << 7) + var6 / 2 + (var4 / 4 << 10); // L: 29
				var8 = ClanChannelMember.method3150(var7, 96); // L: 33
				return Rasterizer3D.Rasterizer3D_colorPalette[var8] | -16777216; // L: 34
			} else if (var2.texture >= 0) { // L: 36
				int var3 = ClanChannelMember.method3150(Rasterizer3D.field2510.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.texture), 96); // L: 37
				return Rasterizer3D.Rasterizer3D_colorPalette[var3] | -16777216; // L: 38
			} else if (var2.primaryRgb == 16711935) { // L: 40
				return var1; // L: 41
			} else {
				var4 = var2.hue; // L: 45
				var5 = var2.saturation; // L: 46
				var6 = var2.lightness; // L: 47
				if (var6 > 179) { // L: 49
					var5 /= 2;
				}

				if (var6 > 192) { // L: 50
					var5 /= 2;
				}

				if (var6 > 217) { // L: 51
					var5 /= 2;
				}

				if (var6 > 243) { // L: 52
					var5 /= 2;
				}

				var7 = (var5 / 32 << 7) + var6 / 2 + (var4 / 4 << 10); // L: 53
				var8 = ClanChannelMember.method3150(var7, 96); // L: 57
				return Rasterizer3D.Rasterizer3D_colorPalette[var8] | -16777216; // L: 58
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)[Lsg;",
		garbageValue = "-347561633"
	)
	public static FontName[] method8739() {
		return new FontName[]{FontName_verdana15, FontName_bold12, FontName_verdana13, FontName_plain11, FontName_plain12, FontName_verdana11};
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)[Ldd;",
		garbageValue = "-718226553"
	)
	static class89[] method8742() {
		return new class89[]{class89.field1096, class89.field1091, class89.field1089, class89.field1093, class89.field1097}; // L: 16
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1946858719"
	)
	@Export("ItemContainer_getCount")
	static int ItemContainer_getCount(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 21
		if (var2 == null) { // L: 22
			return 0;
		} else {
			return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0; // L: 23 24
		}
	}
}
