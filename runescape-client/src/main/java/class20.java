import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ay")
public class class20 {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -675538159
	)
	final int field100;
	@ObfuscatedName("aw")
	final Map field96;
	@ObfuscatedName("al")
	final String field97;

	class20(String var1) {
		this.field100 = 400; // L: 35
		this.field96 = null; // L: 36
		this.field97 = ""; // L: 37
	} // L: 38

	class20(HttpURLConnection var1) throws IOException {
		this.field100 = var1.getResponseCode(); // L: 17
		var1.getResponseMessage(); // L: 18
		this.field96 = var1.getHeaderFields(); // L: 19
		StringBuilder var2 = new StringBuilder(); // L: 20
		InputStream var3 = this.field100 >= 300 ? var1.getErrorStream() : var1.getInputStream(); // L: 21
		if (var3 != null) { // L: 22
			InputStreamReader var4 = new InputStreamReader(var3); // L: 23
			BufferedReader var5 = new BufferedReader(var4); // L: 24

			String var6;
			while ((var6 = var5.readLine()) != null) { // L: 26
				var2.append(var6); // L: 27
			}

			var3.close(); // L: 29
		}

		this.field97 = var2.toString(); // L: 31
	} // L: 32

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-119"
	)
	public int method264() {
		return this.field100; // L: 41
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Map;",
		garbageValue = "1667816156"
	)
	public Map method262() {
		return this.field96; // L: 45
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "61"
	)
	public String method263() {
		return this.field97; // L: 49
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIIIII[Liz;I)V",
		garbageValue = "-1054610532"
	)
	static final void method269(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, CollisionMap[] var10) {
		int var12;
		for (int var11 = 0; var11 < 8; ++var11) { // L: 110
			for (var12 = 0; var12 < 8; ++var12) { // L: 111
				if (var11 + var2 > 0 && var11 + var2 < 103 && var3 + var12 > 0 && var3 + var12 < 103) { // L: 112
					int[] var10000 = var10[var1].flags[var11 + var2];
					var10000[var12 + var3] &= -16777217;
				}
			}
		}

		Buffer var24 = new Buffer(var0); // L: 115

		for (var12 = 0; var12 < 4; ++var12) { // L: 116
			for (int var13 = 0; var13 < 64; ++var13) { // L: 117
				for (int var14 = 0; var14 < 64; ++var14) { // L: 118
					if (var12 == var4 && var13 >= var5 && var13 < var5 + 8 && var14 >= var6 && var14 < var6 + 8) { // L: 119
						int var15 = var2 + Login.method2197(var13 & 7, var14 & 7, var7); // L: 120
						int var18 = var13 & 7; // L: 123
						int var19 = var14 & 7; // L: 124
						int var20 = var7 & 3; // L: 127
						int var17;
						if (var20 == 0) { // L: 128
							var17 = var19; // L: 129
						} else if (var20 == 1) { // L: 132
							var17 = 7 - var18; // L: 133
						} else if (var20 == 2) { // L: 136
							var17 = 7 - var19; // L: 137
						} else {
							var17 = var18; // L: 140
						}

						int var21 = var3 + var17; // L: 142
						int var22 = (var13 & 7) + var8 + var2; // L: 143
						int var23 = var3 + (var14 & 7) + var9; // L: 144
						class182.loadTerrain(var24, var1, var15, var21, var22, var23, var7); // L: 145
					} else {
						class182.loadTerrain(var24, 0, -1, -1, 0, 0, 0); // L: 147
					}
				}
			}
		}

	} // L: 151

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "543294315"
	)
	static final int method270(int var0, int var1, int var2) {
		int var3 = var0 / var2; // L: 967
		int var4 = var0 & var2 - 1; // L: 968
		int var5 = var1 / var2; // L: 969
		int var6 = var1 & var2 - 1; // L: 970
		int var7 = Decimator.method1104(var3, var5); // L: 971
		int var8 = Decimator.method1104(var3 + 1, var5); // L: 972
		int var9 = Decimator.method1104(var3, var5 + 1); // L: 973
		int var10 = Decimator.method1104(var3 + 1, var5 + 1); // L: 974
		int var11 = class128.method3011(var7, var8, var4, var2); // L: 975
		int var12 = class128.method3011(var9, var10, var4, var2); // L: 976
		return class128.method3011(var11, var12, var6, var2); // L: 977
	}

	@ObfuscatedName("nt")
	@ObfuscatedSignature(
		descriptor = "(IIIILvd;Lmc;I)V",
		garbageValue = "-2094972164"
	)
	@Export("worldToMinimap")
	static final void worldToMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		int var6 = var3 * var3 + var2 * var2; // L: 12659
		if (var6 > 4225 && var6 < 90000) { // L: 12660
			int var7 = Client.camAngleY & 2047; // L: 12661
			int var8 = Rasterizer3D.Rasterizer3D_sine[var7]; // L: 12662
			int var9 = Rasterizer3D.Rasterizer3D_cosine[var7]; // L: 12663
			int var10 = var9 * var2 + var3 * var8 >> 16; // L: 12664
			int var11 = var3 * var9 - var8 * var2 >> 16; // L: 12665
			double var12 = Math.atan2((double)var10, (double)var11); // L: 12666
			int var14 = var5.width / 2 - 25; // L: 12667
			int var15 = (int)(Math.sin(var12) * (double)var14); // L: 12668
			int var16 = (int)(Math.cos(var12) * (double)var14); // L: 12669
			byte var17 = 20; // L: 12670
			ItemComposition.redHintArrowSprite.method9928(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256); // L: 12671
		} else {
			class11.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5); // L: 12673
		}

	} // L: 12674
}
