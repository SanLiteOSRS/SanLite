import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ms")
public final class class361 {
	@ObfuscatedName("a")
	final Object field4310;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1220600737
	)
	int field4311;

	class361(Object var1, int var2) {
		this.field4310 = var1; // L: 170
		this.field4311 = var2; // L: 171
	} // L: 172

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "([BIILhf;[Lgr;B)V",
		garbageValue = "-47"
	)
	static final void method6839(byte[] var0, int var1, int var2, Scene var3, CollisionMap[] var4) {
		Buffer var5 = new Buffer(var0); // L: 259
		int var6 = -1; // L: 260

		while (true) {
			int var7 = var5.method8420(); // L: 262
			if (var7 == 0) { // L: 263
				return; // L: 287
			}

			var6 += var7; // L: 264
			int var8 = 0; // L: 265

			while (true) {
				int var9 = var5.readUShortSmart(); // L: 267
				if (var9 == 0) { // L: 268
					break;
				}

				var8 += var9 - 1; // L: 269
				int var10 = var8 & 63; // L: 270
				int var11 = var8 >> 6 & 63; // L: 271
				int var12 = var8 >> 12; // L: 272
				int var13 = var5.readUnsignedByte(); // L: 273
				int var14 = var13 >> 2; // L: 274
				int var15 = var13 & 3; // L: 275
				int var16 = var11 + var1; // L: 276
				int var17 = var10 + var2; // L: 277
				if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) { // L: 278
					int var18 = var12; // L: 279
					if ((Tiles.Tiles_renderFlags[1][var16][var17] & 2) == 2) { // L: 280
						var18 = var12 - 1;
					}

					CollisionMap var19 = null; // L: 281
					if (var18 >= 0) { // L: 282
						var19 = var4[var18];
					}

					class456.addObjects(var12, var16, var17, var6, var15, var14, var3, var19); // L: 283
				}
			}
		}
	}
}
