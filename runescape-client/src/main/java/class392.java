import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("og")
public class class392 implements MouseWheel {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Log;"
	)
	public static final class392 field4276;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Log;"
	)
	public static final class392 field4270;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Log;"
	)
	public static final class392 field4271;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 309429929
	)
	final int field4269;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -489911481
	)
	public final int field4273;
	@ObfuscatedName("g")
	public final Class field4274;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	public final class388 field4275;

	static {
		field4276 = new class392(2, 0, Integer.class, new class389());
		field4270 = new class392(1, 1, Long.class, new class391());
		field4271 = new class392(0, 2, String.class, new class393());
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/Class;Lnd;)V"
	)
	class392(int var1, int var2, Class var3, class388 var4) {
		this.field4269 = var1;
		this.field4273 = var2;
		this.field4274 = var3;
		this.field4275 = var4;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "238732485"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4273;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)Ljava/lang/Object;",
		garbageValue = "254534065"
	)
	public Object method6858(Buffer var1) {
		return this.field4275.vmethod6883(var1);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(S)[Log;",
		garbageValue = "-11950"
	)
	public static class392[] method6855() {
		return new class392[]{field4276, field4270, field4271};
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;I)Log;",
		garbageValue = "1132071847"
	)
	public static class392 method6856(Class var0) {
		class392[] var1 = method6855();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			class392 var3 = var1[var2];
			if (var3.field4274 == var0) {
				return var3;
			}
		}

		return null;
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "1"
	)
	@Export("getTileHeight")
	static final int getTileHeight(int var0, int var1, int var2) {
		int var3 = var0 >> 7;
		int var4 = var1 >> 7;
		if (var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) {
			int var5 = var2;
			if (var2 < 3 && (Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) {
				var5 = var2 + 1;
			}

			int var6 = var0 & 127;
			int var7 = var1 & 127;
			int var8 = (128 - var6) * Tiles.Tiles_heights[var5][var3][var4] + Tiles.Tiles_heights[var5][var3 + 1][var4] * var6 >> 7;
			int var9 = Tiles.Tiles_heights[var5][var3][var4 + 1] * (128 - var6) + var6 * Tiles.Tiles_heights[var5][var3 + 1][var4 + 1] >> 7;
			return var9 * var7 + var8 * (128 - var7) >> 7;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "106"
	)
	static void method6871(int var0, int var1) {
		int var2 = Login.fontBold12.stringWidth("Choose Option");

		int var3;
		int var4;
		for (var3 = 0; var3 < Client.menuOptionsCount; ++var3) {
			var4 = Login.fontBold12.stringWidth(method6873(var3));
			if (var4 > var2) {
				var2 = var4;
			}
		}

		var2 += 8;
		var3 = Client.menuOptionsCount * 15 + 22;
		var4 = var0 - var2 / 2;
		if (var2 + var4 > GameEngine.canvasWidth) {
			var4 = GameEngine.canvasWidth - var2;
		}

		if (var4 < 0) {
			var4 = 0;
		}

		int var5 = var1;
		if (var3 + var1 > KeyHandler.canvasHeight) {
			var5 = KeyHandler.canvasHeight - var3;
		}

		if (var5 < 0) {
			var5 = 0;
		}

		SecureRandomCallable.menuX = var4;
		Frames.menuY = var5;
		ObjectComposition.menuWidth = var2;
		StudioGame.menuHeight = Client.menuOptionsCount * 15 + 22;
	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-2087598232"
	)
	static String method6873(int var0) {
		if (var0 < 0) {
			return "";
		} else {
			return Client.menuTargets[var0].length() > 0 ? Client.menuActions[var0] + " " + Client.menuTargets[var0] : Client.menuActions[var0];
		}
	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-2121670407"
	)
	static final void method6872(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0;
		int var7 = var3 - var1;
		int var8 = var6 >= 0 ? var6 : -var6;
		int var9 = var7 >= 0 ? var7 : -var7;
		int var10 = var8;
		if (var8 < var9) {
			var10 = var9;
		}

		if (var10 != 0) {
			int var11 = (var6 << 16) / var10;
			int var12 = (var7 << 16) / var10;
			if (var12 <= var11) {
				var11 = -var11;
			} else {
				var12 = -var12;
			}

			int var13 = var5 * var12 >> 17;
			int var14 = var5 * var12 + 1 >> 17;
			int var15 = var5 * var11 >> 17;
			int var16 = var5 * var11 + 1 >> 17;
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart;
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart;
			int var17 = var0 + var13;
			int var18 = var0 - var14;
			int var19 = var0 + var6 - var14;
			int var20 = var0 + var6 + var13;
			int var21 = var15 + var1;
			int var22 = var1 - var16;
			int var23 = var7 + var1 - var16;
			int var24 = var15 + var7 + var1;
			Rasterizer3D.method4210(var17, var18, var19);
			Rasterizer3D.method4213(var21, var22, var23, var17, var18, var19, var4);
			Rasterizer3D.method4210(var17, var19, var20);
			Rasterizer3D.method4213(var21, var23, var24, var17, var19, var20, var4);
		}
	}
}
