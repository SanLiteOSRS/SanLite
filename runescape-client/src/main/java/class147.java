import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fq")
public class class147 extends class155 {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lgj;"
	)
	static ClanChannel field1694;
	@ObfuscatedName("nv")
	@ObfuscatedGetter(
		intValue = 245252327
	)
	@Export("menuHeight")
	static int menuHeight;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1141502341
	)
	int field1693;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgr;"
	)
	final class156 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgr;)V"
	)
	class147(class156 var1) {
		this.this$0 = var1;
		this.field1693 = -1; // L: 82
	} // L: 84

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lsg;I)V",
		garbageValue = "-1949352075"
	)
	void vmethod3448(Buffer var1) {
		this.field1693 = var1.readUnsignedShort(); // L: 87
		var1.readUnsignedByte(); // L: 88
		if (var1.readUnsignedByte() != 255) { // L: 89
			--var1.offset; // L: 90
			var1.readLong(); // L: 91
		}

	} // L: 93

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lgj;B)V",
		garbageValue = "-49"
	)
	void vmethod3450(ClanChannel var1) {
		var1.removeMember(this.field1693); // L: 96
	} // L: 97

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([BIILie;[Lif;I)V",
		garbageValue = "1108782763"
	)
	static final void method3277(byte[] var0, int var1, int var2, Scene var3, CollisionMap[] var4) {
		Buffer var5 = new Buffer(var0); // L: 272
		int var6 = -1; // L: 273

		while (true) {
			int var7 = var5.method9178(); // L: 275
			if (var7 == 0) { // L: 276
				return; // L: 300
			}

			var6 += var7; // L: 277
			int var8 = 0; // L: 278

			while (true) {
				int var9 = var5.readUShortSmart(); // L: 280
				if (var9 == 0) { // L: 281
					break;
				}

				var8 += var9 - 1; // L: 282
				int var10 = var8 & 63; // L: 283
				int var11 = var8 >> 6 & 63; // L: 284
				int var12 = var8 >> 12; // L: 285
				int var13 = var5.readUnsignedByte(); // L: 286
				int var14 = var13 >> 2; // L: 287
				int var15 = var13 & 3; // L: 288
				int var16 = var11 + var1; // L: 289
				int var17 = var10 + var2; // L: 290
				if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) { // L: 291
					int var18 = var12; // L: 292
					if ((Tiles.Tiles_renderFlags[1][var16][var17] & 2) == 2) { // L: 293
						var18 = var12 - 1;
					}

					CollisionMap var19 = null; // L: 294
					if (var18 >= 0) { // L: 295
						var19 = var4[var18];
					}

					class207.addObjects(var12, var16, var17, var6, var15, var14, var3, var19); // L: 296
				}
			}
		}
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "-99"
	)
	@Export("getTileHeight")
	static final int getTileHeight(int var0, int var1, int var2) {
		int var3 = var0 >> 7; // L: 5489
		int var4 = var1 >> 7; // L: 5490
		if (var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) { // L: 5491
			int var5 = var2; // L: 5492
			if (var2 < 3 && (Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) { // L: 5493
				var5 = var2 + 1;
			}

			int var6 = var0 & 127; // L: 5494
			int var7 = var1 & 127; // L: 5495
			int var8 = (128 - var6) * Tiles.Tiles_heights[var5][var3][var4] + var6 * Tiles.Tiles_heights[var5][var3 + 1][var4] >> 7; // L: 5496
			int var9 = Tiles.Tiles_heights[var5][var3][var4 + 1] * (128 - var6) + var6 * Tiles.Tiles_heights[var5][var3 + 1][var4 + 1] >> 7; // L: 5497
			return var8 * (128 - var7) + var7 * var9 >> 7; // L: 5498
		} else {
			return 0;
		}
	}
}
