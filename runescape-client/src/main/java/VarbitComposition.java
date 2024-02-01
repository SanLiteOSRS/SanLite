import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hm")
@Implements("VarbitComposition")
public class VarbitComposition extends DualNode {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("VarbitDefinition_cached")
	public static EvictingDualNodeHashTable VarbitDefinition_cached;
	@ObfuscatedName("ar")
	static final int[] field2051;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 307876693
	)
	@Export("baseVar")
	public int baseVar;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 699414027
	)
	@Export("startBit")
	public int startBit;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1990797859
	)
	@Export("endBit")
	public int endBit;

	static {
		VarbitDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
		field2051 = new int[32]; // L: 15
		int var0 = 2; // L: 18

		for (int var1 = 0; var1 < 32; ++var1) { // L: 19
			field2051[var1] = var0 - 1; // L: 20
			var0 += var0; // L: 21
		}

	} // L: 23

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "-341719761"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 31
			if (var2 == 0) { // L: 32
				return; // L: 35
			}

			this.decodeNext(var1, var2); // L: 33
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Luk;II)V",
		garbageValue = "-1126848205"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 38
			this.baseVar = var1.readUnsignedShort(); // L: 39
			this.startBit = var1.readUnsignedByte(); // L: 40
			this.endBit = var1.readUnsignedByte(); // L: 41
		}

	} // L: 44

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1817926313"
	)
	static boolean method3843(int var0) {
		return (var0 & 128) != 0; // L: 107
	}

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "1712649200"
	)
	@Export("setViewportShape")
	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) { // L: 4892
			var2 = 1;
		}

		if (var3 < 1) { // L: 4893
			var3 = 1;
		}

		int var5 = var3 - 334; // L: 4894
		int var6;
		if (var5 < 0) { // L: 4896
			var6 = Client.field772;
		} else if (var5 >= 100) { // L: 4897
			var6 = Client.field773;
		} else {
			var6 = (Client.field773 - Client.field772) * var5 / 100 + Client.field772; // L: 4898
		}

		int var7 = var3 * var6 * 512 / (var2 * 334); // L: 4899
		int var8;
		int var9;
		short var15;
		if (var7 < Client.field778) { // L: 4900
			var15 = Client.field778; // L: 4901
			var6 = var15 * var2 * 334 / (var3 * 512); // L: 4902
			if (var6 > Client.field596) { // L: 4903
				var6 = Client.field596; // L: 4904
				var8 = var3 * var6 * 512 / (var15 * 334); // L: 4905
				var9 = (var2 - var8) / 2; // L: 4906
				if (var4) { // L: 4907
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 4908
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216); // L: 4909
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216); // L: 4910
				}

				var0 += var9; // L: 4912
				var2 -= var9 * 2; // L: 4913
			}
		} else if (var7 > Client.field779) { // L: 4916
			var15 = Client.field779; // L: 4917
			var6 = var15 * var2 * 334 / (var3 * 512); // L: 4918
			if (var6 < Client.field776) { // L: 4919
				var6 = Client.field776; // L: 4920
				var8 = var15 * var2 * 334 / (var6 * 512); // L: 4921
				var9 = (var3 - var8) / 2; // L: 4922
				if (var4) { // L: 4923
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 4924
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216); // L: 4925
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216); // L: 4926
				}

				var1 += var9; // L: 4928
				var3 -= var9 * 2; // L: 4929
			}
		}

		Client.viewportZoom = var3 * var6 / 334; // L: 4932
		if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) { // L: 4933
			int[] var14 = new int[9]; // L: 4935

			for (var9 = 0; var9 < var14.length; ++var9) { // L: 4936
				int var10 = var9 * 32 + 15 + 128; // L: 4937
				int var11 = var10 * 3 + 600; // L: 4940
				int var13 = Rasterizer3D.Rasterizer3D_sine[var10]; // L: 4943
				int var12 = class157.method3437(var11, var3); // L: 4944
				var14[var9] = var13 * var12 >> 16; // L: 4945
			}

			Scene.Scene_buildVisiblityMap(var14, 500, 800, var2 * 334 / var3, 334); // L: 4947
		}

		Client.viewportOffsetX = var0; // L: 4950
		Client.viewportOffsetY = var1; // L: 4951
		Client.viewportWidth = var2; // L: 4952
		Client.viewportHeight = var3; // L: 4953
	} // L: 4954
}
