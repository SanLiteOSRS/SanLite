import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bs")
public class class31 {
	@ObfuscatedName("aw")
	static Applet field179;
	@ObfuscatedName("ay")
	static String field176;

	static {
		field179 = null; // L: 10
		field176 = ""; // L: 11
	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(IIIIZB)V",
		garbageValue = "-36"
	)
	@Export("setViewportShape")
	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) { // L: 4924
			var2 = 1;
		}

		if (var3 < 1) { // L: 4925
			var3 = 1;
		}

		int var5 = var3 - 334; // L: 4926
		int var6;
		if (var5 < 0) { // L: 4928
			var6 = Client.field787;
		} else if (var5 >= 100) { // L: 4929
			var6 = Client.field777;
		} else {
			var6 = (Client.field777 - Client.field787) * var5 / 100 + Client.field787; // L: 4930
		}

		int var7 = var3 * var6 * 512 / (var2 * 334); // L: 4931
		int var8;
		int var9;
		short var10;
		if (var7 < Client.field759) { // L: 4932
			var10 = Client.field759; // L: 4933
			var6 = var10 * var2 * 334 / (var3 * 512); // L: 4934
			if (var6 > Client.field592) { // L: 4935
				var6 = Client.field592; // L: 4936
				var8 = var3 * var6 * 512 / (var10 * 334); // L: 4937
				var9 = (var2 - var8) / 2; // L: 4938
				if (var4) { // L: 4939
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 4940
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216); // L: 4941
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216); // L: 4942
				}

				var0 += var9; // L: 4944
				var2 -= var9 * 2; // L: 4945
			}
		} else if (var7 > Client.field794) { // L: 4948
			var10 = Client.field794; // L: 4949
			var6 = var10 * var2 * 334 / (var3 * 512); // L: 4950
			if (var6 < Client.field791) { // L: 4951
				var6 = Client.field791; // L: 4952
				var8 = var10 * var2 * 334 / (var6 * 512); // L: 4953
				var9 = (var3 - var8) / 2; // L: 4954
				if (var4) { // L: 4955
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 4956
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216); // L: 4957
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216); // L: 4958
				}

				var1 += var9; // L: 4960
				var3 -= var9 * 2; // L: 4961
			}
		}

		Client.viewportZoom = var3 * var6 / 334; // L: 4964
		if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) { // L: 4965
			class421.method7818(var2, var3); // L: 4966
		}

		Client.viewportOffsetX = var0; // L: 4968
		Client.viewportOffsetY = var1; // L: 4969
		Client.viewportWidth = var2; // L: 4970
		Client.viewportHeight = var3; // L: 4971
	} // L: 4972
}
