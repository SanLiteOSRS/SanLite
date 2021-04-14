import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lr")
public enum class337 implements Enumerated {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Llr;"
	)
	field3920(3, 1),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Llr;"
	)
	field3922(2, 2),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Llr;"
	)
	field3921(1, 3),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Llr;"
	)
	field3925(0, 10);

	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1527224895
	)
	final int field3923;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 436920949
	)
	final int field3924;

	class337(int var3, int var4) {
		this.field3923 = var3;
		this.field3924 = var4;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1000839247"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3924;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(II)Ljava/lang/String;",
		garbageValue = "-405584171"
	)
	static String method5986(int var0) {
		return "<img=" + var0 + ">";
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lir;III)[Loh;",
		garbageValue = "738130292"
	)
	public static SpritePixels[] method5985(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2);
		boolean var3;
		if (var4 == null) {
			var3 = false;
		} else {
			class244.SpriteBuffer_decode(var4);
			var3 = true;
		}

		if (!var3) {
			return null;
		} else {
			SpritePixels[] var5 = new SpritePixels[class124.SpriteBuffer_spriteCount];

			for (int var6 = 0; var6 < class124.SpriteBuffer_spriteCount; ++var6) {
				SpritePixels var7 = var5[var6] = new SpritePixels();
				var7.width = class395.SpriteBuffer_spriteWidth;
				var7.height = class395.SpriteBuffer_spriteHeight;
				var7.xOffset = class0.SpriteBuffer_xOffsets[var6];
				var7.yOffset = Interpreter.SpriteBuffer_yOffsets[var6];
				var7.subWidth = class395.SpriteBuffer_spriteWidths[var6];
				var7.subHeight = class157.SpriteBuffer_spriteHeights[var6];
				int var8 = var7.subWidth * var7.subHeight;
				byte[] var9 = class223.SpriteBuffer_pixels[var6];
				var7.pixels = new int[var8];

				for (int var10 = 0; var10 < var8; ++var10) {
					var7.pixels[var10] = Varps.SpriteBuffer_spritePalette[var9[var10] & 255];
				}
			}

			WorldMapDecorationType.method4370();
			return var5;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "1948443713"
	)
	public static void method5984(int var0, int var1) {
		VarbitComposition var3 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0);
		VarbitComposition var2;
		if (var3 != null) {
			var2 = var3;
		} else {
			byte[] var8 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0);
			var3 = new VarbitComposition();
			if (var8 != null) {
				var3.decode(new Buffer(var8));
			}

			VarbitComposition.VarbitDefinition_cached.put(var3, (long)var0);
			var2 = var3;
		}

		int var4 = var2.baseVar;
		int var5 = var2.startBit;
		int var6 = var2.endBit;
		int var7 = Varps.Varps_masks[var6 - var5];
		if (var1 < 0 || var1 > var7) {
			var1 = 0;
		}

		var7 <<= var5;
		Varps.Varps_main[var4] = Varps.Varps_main[var4] & ~var7 | var1 << var5 & var7;
	}
}
