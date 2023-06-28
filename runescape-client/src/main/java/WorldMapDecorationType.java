import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nf")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements class369 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	field3801(0, 0),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	field3791(1, 0),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	field3785(2, 0),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	field3786(3, 0),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	field3799(9, 2),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	field3783(4, 1),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	field3789(5, 1),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	field3790(6, 1),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	field3805(7, 1),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	field3792(8, 1),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	field3793(12, 2),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	field3794(13, 2),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	field3795(14, 2),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	field3796(15, 2),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	field3797(16, 2),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	field3798(17, 2),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	field3802(18, 2),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	field3800(19, 2),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	field3784(20, 2),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	field3807(21, 2),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	field3803(10, 2),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	field3809(11, 2),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	field3804(22, 3);

	@ObfuscatedName("by")
	static String field3787;
	@ObfuscatedName("gl")
	static String field3788;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 728624085
	)
	@Export("id")
	public final int id;

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "0"
	)
	WorldMapDecorationType(int var3, int var4) {
		this.id = var3; // L: 34
	} // L: 35

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-14"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 39
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)[Ldb;",
		garbageValue = "31"
	)
	static class89[] method6590() {
		return new class89[]{class89.field1084, class89.field1083, class89.field1081, class89.field1082, class89.field1085}; // L: 16
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(IIIIZB)V",
		garbageValue = "-113"
	)
	@Export("setViewportShape")
	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) { // L: 5013
			var2 = 1;
		}

		if (var3 < 1) { // L: 5014
			var3 = 1;
		}

		int var5 = var3 - 334; // L: 5015
		int var6;
		if (var5 < 0) { // L: 5017
			var6 = Client.field776;
		} else if (var5 >= 100) { // L: 5018
			var6 = Client.field620;
		} else {
			var6 = (Client.field620 - Client.field776) * var5 / 100 + Client.field776; // L: 5019
		}

		int var7 = var3 * var6 * 512 / (var2 * 334); // L: 5020
		int var8;
		int var9;
		short var10;
		if (var7 < Client.field591) { // L: 5021
			var10 = Client.field591; // L: 5022
			var6 = var10 * var2 * 334 / (var3 * 512); // L: 5023
			if (var6 > Client.field781) { // L: 5024
				var6 = Client.field781; // L: 5025
				var8 = var3 * var6 * 512 / (var10 * 334); // L: 5026
				var9 = (var2 - var8) / 2; // L: 5027
				if (var4) { // L: 5028
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 5029
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216); // L: 5030
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216); // L: 5031
				}

				var0 += var9; // L: 5033
				var2 -= var9 * 2; // L: 5034
			}
		} else if (var7 > Client.field783) { // L: 5037
			var10 = Client.field783; // L: 5038
			var6 = var10 * var2 * 334 / (var3 * 512); // L: 5039
			if (var6 < Client.field780) { // L: 5040
				var6 = Client.field780; // L: 5041
				var8 = var10 * var2 * 334 / (var6 * 512); // L: 5042
				var9 = (var3 - var8) / 2; // L: 5043
				if (var4) { // L: 5044
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 5045
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216); // L: 5046
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216); // L: 5047
				}

				var1 += var9; // L: 5049
				var3 -= var9 * 2; // L: 5050
			}
		}

		Client.viewportZoom = var3 * var6 / 334; // L: 5053
		if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) { // L: 5054
			class157.method3300(var2, var3); // L: 5055
		}

		Client.viewportOffsetX = var0; // L: 5057
		Client.viewportOffsetY = var1; // L: 5058
		Client.viewportWidth = var2; // L: 5059
		Client.viewportHeight = var3; // L: 5060
	} // L: 5061
}
