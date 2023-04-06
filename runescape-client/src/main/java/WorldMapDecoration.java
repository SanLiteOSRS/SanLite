import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ji")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -192568909
	)
	@Export("objectDefinitionId")
	final int objectDefinitionId;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1253616953
	)
	@Export("decoration")
	final int decoration;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1349259141
	)
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1; // L: 9
		this.decoration = var2; // L: 10
		this.rotation = var3; // L: 11
	} // L: 12

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "([BIILir;[Liz;B)V",
		garbageValue = "64"
	)
	static final void method5220(byte[] var0, int var1, int var2, Scene var3, CollisionMap[] var4) {
		Buffer var5 = new Buffer(var0); // L: 279
		int var6 = -1; // L: 280

		while (true) {
			int var7 = var5.method8696(); // L: 282
			if (var7 == 0) { // L: 283
				return; // L: 307
			}

			var6 += var7; // L: 284
			int var8 = 0; // L: 285

			while (true) {
				int var9 = var5.readUShortSmart(); // L: 287
				if (var9 == 0) { // L: 288
					break;
				}

				var8 += var9 - 1; // L: 289
				int var10 = var8 & 63; // L: 290
				int var11 = var8 >> 6 & 63; // L: 291
				int var12 = var8 >> 12; // L: 292
				int var13 = var5.readUnsignedByte(); // L: 293
				int var14 = var13 >> 2; // L: 294
				int var15 = var13 & 3; // L: 295
				int var16 = var11 + var1; // L: 296
				int var17 = var10 + var2; // L: 297
				if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) { // L: 298
					int var18 = var12; // L: 299
					if ((Tiles.Tiles_renderFlags[1][var16][var17] & 2) == 2) { // L: 300
						var18 = var12 - 1;
					}

					CollisionMap var19 = null; // L: 301
					if (var18 >= 0) { // L: 302
						var19 = var4[var18];
					}

					class30.addObjects(var12, var16, var17, var6, var15, var14, var3, var19); // L: 303
				}
			}
		}
	}
}
