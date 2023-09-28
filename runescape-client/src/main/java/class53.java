import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cu")
public class class53 extends Node {
	@ObfuscatedName("ry")
	@ObfuscatedSignature(
		descriptor = "Ltx;"
	)
	@Export("Widget_cachedFonts")
	static class512 Widget_cachedFonts;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lbj;"
	)
	class47 field382;

	public class53() {
		this.field382 = null; // L: 9
	} // L: 10

	@ObfuscatedSignature(
		descriptor = "(Lcw;)V"
	)
	class53(VorbisSample var1) {
		if (var1 != null) { // L: 13
			this.field382 = new class47(var1, (RawSound)null); // L: 16
		}
	} // L: 14 17

	@ObfuscatedSignature(
		descriptor = "(Lbs;)V"
	)
	public class53(RawSound var1) {
		this.field382 = new class47((VorbisSample)null, var1); // L: 20
	} // L: 21

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1320640993"
	)
	public boolean method1080() {
		return this.field382 == null; // L: 24
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Lbs;",
		garbageValue = "248890116"
	)
	public RawSound method1081() {
		if (this.field382 != null && this.field382.field348.tryLock()) { // L: 28
			RawSound var1;
			try {
				var1 = this.method1087(); // L: 31
			} finally {
				this.field382.field348.unlock(); // L: 34
			}

			return var1; // L: 36
		} else {
			return null; // L: 38
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Lbs;",
		garbageValue = "-262816062"
	)
	public RawSound method1078() {
		if (this.field382 != null) { // L: 42
			this.field382.field348.lock(); // L: 43

			RawSound var1;
			try {
				var1 = this.method1087(); // L: 46
			} finally {
				this.field382.field348.unlock(); // L: 49
			}

			return var1; // L: 51
		} else {
			return null; // L: 53
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Lbs;",
		garbageValue = "1547022770"
	)
	RawSound method1087() {
		if (this.field382.field344 == null) { // L: 57
			this.field382.field344 = this.field382.field345.toRawSound((int[])null); // L: 58
			this.field382.field345 = null; // L: 59
		}

		return this.field382.field344; // L: 61
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Lcv;",
		garbageValue = "-111"
	)
	@Export("worldListStart")
	static World worldListStart() {
		World.World_listCount = 0; // L: 238
		return DevicePcmPlayerProvider.getNextWorldListWorld(); // L: 239
	}

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "1325251796"
	)
	@Export("setViewportShape")
	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) { // L: 5107
			var2 = 1;
		}

		if (var3 < 1) { // L: 5108
			var3 = 1;
		}

		int var5 = var3 - 334; // L: 5109
		int var6;
		if (var5 < 0) { // L: 5111
			var6 = Client.field791;
		} else if (var5 >= 100) { // L: 5112
			var6 = Client.field792;
		} else {
			var6 = (Client.field792 - Client.field791) * var5 / 100 + Client.field791; // L: 5113
		}

		int var7 = var3 * var6 * 512 / (var2 * 334); // L: 5114
		int var8;
		int var9;
		short var18;
		if (var7 < Client.field594) { // L: 5115
			var18 = Client.field594; // L: 5116
			var6 = var18 * var2 * 334 / (var3 * 512); // L: 5117
			if (var6 > Client.field662) { // L: 5118
				var6 = Client.field662; // L: 5119
				var8 = var3 * var6 * 512 / (var18 * 334); // L: 5120
				var9 = (var2 - var8) / 2; // L: 5121
				if (var4) { // L: 5122
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 5123
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216); // L: 5124
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216); // L: 5125
				}

				var0 += var9; // L: 5127
				var2 -= var9 * 2; // L: 5128
			}
		} else if (var7 > Client.field798) { // L: 5131
			var18 = Client.field798; // L: 5132
			var6 = var18 * var2 * 334 / (var3 * 512); // L: 5133
			if (var6 < Client.field795) { // L: 5134
				var6 = Client.field795; // L: 5135
				var8 = var18 * var2 * 334 / (var6 * 512); // L: 5136
				var9 = (var3 - var8) / 2; // L: 5137
				if (var4) { // L: 5138
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 5139
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216); // L: 5140
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216); // L: 5141
				}

				var1 += var9; // L: 5143
				var3 -= var9 * 2; // L: 5144
			}
		}

		Client.viewportZoom = var3 * var6 / 334; // L: 5147
		if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) { // L: 5148
			int[] var17 = new int[9]; // L: 5150

			for (var9 = 0; var9 < var17.length; ++var9) { // L: 5151
				int var10 = var9 * 32 + 15 + 128; // L: 5152
				int var11 = var10 * 3 + 600; // L: 5155
				int var13 = Rasterizer3D.Rasterizer3D_sine[var10]; // L: 5158
				int var15 = var3 - 334; // L: 5161
				if (var15 < 0) { // L: 5162
					var15 = 0;
				} else if (var15 > 100) { // L: 5163
					var15 = 100;
				}

				int var16 = (Client.zoomWidth - Client.zoomHeight) * var15 / 100 + Client.zoomHeight; // L: 5164
				int var14 = var16 * var11 / 256; // L: 5165
				var17[var9] = var13 * var14 >> 16; // L: 5168
			}

			Scene.Scene_buildVisiblityMap(var17, 500, 800, var2 * 334 / var3, 334); // L: 5170
		}

		Client.viewportOffsetX = var0; // L: 5173
		Client.viewportOffsetY = var1; // L: 5174
		Client.viewportWidth = var2; // L: 5175
		Client.viewportHeight = var3; // L: 5176
	} // L: 5177
}
