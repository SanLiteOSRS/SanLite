import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nl")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements class369 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	field3801(0, 0),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	field3799(1, 0),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	field3807(2, 0),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	field3810(3, 0),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	field3802(9, 2),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	field3803(4, 1),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	field3804(5, 1),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	field3809(6, 1),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	field3806(7, 1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	field3800(8, 1),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	field3808(12, 2),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	field3816(13, 2),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	field3805(14, 2),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	field3811(15, 2),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	field3812(16, 2),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	field3813(17, 2),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	field3814(18, 2),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	field3815(19, 2),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	field3798(20, 2),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	field3817(21, 2),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	field3818(10, 2),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	field3819(11, 2),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	field3820(22, 3);

	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1321108147
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1108588956"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 39
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(IIIIZS)V",
		garbageValue = "23104"
	)
	@Export("setViewportShape")
	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) { // L: 4801
			var2 = 1;
		}

		if (var3 < 1) { // L: 4802
			var3 = 1;
		}

		int var5 = var3 - 334; // L: 4803
		int var6;
		if (var5 < 0) { // L: 4805
			var6 = Client.field753;
		} else if (var5 >= 100) { // L: 4806
			var6 = Client.field754;
		} else {
			var6 = (Client.field754 - Client.field753) * var5 / 100 + Client.field753; // L: 4807
		}

		int var7 = var3 * var6 * 512 / (var2 * 334); // L: 4808
		int var8;
		int var9;
		short var10;
		if (var7 < Client.field676) { // L: 4809
			var10 = Client.field676; // L: 4810
			var6 = var10 * var2 * 334 / (var3 * 512); // L: 4811
			if (var6 > Client.field758) { // L: 4812
				var6 = Client.field758; // L: 4813
				var8 = var3 * var6 * 512 / (var10 * 334); // L: 4814
				var9 = (var2 - var8) / 2; // L: 4815
				if (var4) { // L: 4816
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 4817
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216); // L: 4818
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216); // L: 4819
				}

				var0 += var9; // L: 4821
				var2 -= var9 * 2; // L: 4822
			}
		} else if (var7 > Client.field760) { // L: 4825
			var10 = Client.field760; // L: 4826
			var6 = var10 * var2 * 334 / (var3 * 512); // L: 4827
			if (var6 < Client.field757) { // L: 4828
				var6 = Client.field757; // L: 4829
				var8 = var10 * var2 * 334 / (var6 * 512); // L: 4830
				var9 = (var3 - var8) / 2; // L: 4831
				if (var4) { // L: 4832
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 4833
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216); // L: 4834
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216); // L: 4835
				}

				var1 += var9; // L: 4837
				var3 -= var9 * 2; // L: 4838
			}
		}

		Client.viewportZoom = var3 * var6 / 334; // L: 4841
		if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) { // L: 4842
			ArchiveDiskAction.method6660(var2, var3); // L: 4843
		}

		Client.viewportOffsetX = var0; // L: 4845
		Client.viewportOffsetY = var1; // L: 4846
		Client.viewportWidth = var2; // L: 4847
		Client.viewportHeight = var3; // L: 4848
	} // L: 4849
}
