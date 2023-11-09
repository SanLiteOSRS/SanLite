import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ib")
public class class230 {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -815710187
	)
	int field2615;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1622504827
	)
	int field2616;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -935812263
	)
	int field2614;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 717076899
	)
	int field2612;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -120678637
	)
	int field2613;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -877928513
	)
	int field2617;

	class230(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field2615 = var1; // L: 12
		this.field2616 = var2;
		this.field2614 = var3; // L: 14
		this.field2612 = var4; // L: 15
		this.field2613 = var5; // L: 16
		this.field2617 = var6; // L: 17
	} // L: 18

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "2095830606"
	)
	static final int method4705(int var0, int var1, int var2, int var3) {
		return var2 * var1 - var3 * var0 >> 16; // L: 13
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIIIII[Lic;B)V",
		garbageValue = "0"
	)
	static final void method4706(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, CollisionMap[] var10) {
		int var12;
		for (int var11 = 0; var11 < 8; ++var11) { // L: 110
			for (var12 = 0; var12 < 8; ++var12) { // L: 111
				if (var11 + var2 > 0 && var11 + var2 < 103 && var3 + var12 > 0 && var3 + var12 < 103) { // L: 112
					int[] var10000 = var10[var1].flags[var11 + var2];
					var10000[var3 + var12] &= -16777217;
				}
			}
		}

		Buffer var24 = new Buffer(var0); // L: 115

		for (var12 = 0; var12 < 4; ++var12) { // L: 116
			for (int var13 = 0; var13 < 64; ++var13) { // L: 117
				for (int var14 = 0; var14 < 64; ++var14) { // L: 118
					if (var12 == var4 && var13 >= var5 && var13 < var5 + 8 && var14 >= var6 && var14 < var6 + 8) { // L: 119
						int var15 = var2 + ModeWhere.method6929(var13 & 7, var14 & 7, var7); // L: 120
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

						int var21 = var17 + var3; // L: 142
						int var22 = (var13 & 7) + var8 + var2; // L: 143
						int var23 = var3 + (var14 & 7) + var9; // L: 144
						DevicePcmPlayerProvider.loadTerrain(var24, var1, var15, var21, var22, var23, var7); // L: 145
					} else {
						DevicePcmPlayerProvider.loadTerrain(var24, 0, -1, -1, 0, 0, 0); // L: 147
					}
				}
			}
		}

	} // L: 151

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "(I)Lse;",
		garbageValue = "1468482065"
	)
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return ScriptFrame.worldMap; // L: 736
	}

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "1962397573"
	)
	@Export("drawLoadingMessage")
	static final void drawLoadingMessage(String var0, boolean var1) {
		if (Client.showLoadingMessages) { // L: 4761
			byte var2 = 4; // L: 4762
			int var3 = var2 + 6; // L: 4763
			int var4 = var2 + 6; // L: 4764
			int var5 = class404.fontPlain12.lineWidth(var0, 250); // L: 4765
			int var6 = class404.fontPlain12.lineCount(var0, 250) * 13; // L: 4766
			Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var5 + var2 + var2, var2 + var6 + var2, 0); // L: 4767
			Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var2 + var6, 16777215); // L: 4768
			class404.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0); // L: 4769
			class20.method305(var3 - var2, var4 - var2, var2 + var5 + var2, var6 + var2 + var2); // L: 4770
			if (var1) { // L: 4771
				WorldMapSectionType.rasterProvider.drawFull(0, 0); // L: 4772
			} else {
				class330.method6526(var3, var4, var5, var6); // L: 4775
			}

		}
	} // L: 4777
}
