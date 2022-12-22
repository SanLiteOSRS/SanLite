import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("em")
public class class139 {
	@ObfuscatedName("fu")
	@Export("worldHost")
	static String worldHost;
	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "Lrx;"
	)
	@Export("redHintArrowSprite")
	static SpritePixels redHintArrowSprite;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		longValue = -2412790718351732385L
	)
	long field1674;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 911939033
	)
	int field1668;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	IterableNodeDeque field1669;

	@ObfuscatedSignature(
		descriptor = "(Lqy;)V"
	)
	public class139(Buffer var1) {
		this.field1668 = -1; // L: 9
		this.field1669 = new IterableNodeDeque(); // L: 10
		this.method3093(var1); // L: 28
	} // L: 29

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lqy;I)V",
		garbageValue = "1937502404"
	)
	void method3093(Buffer var1) {
		this.field1674 = var1.readLong(); // L: 32
		this.field1668 = var1.readInt(); // L: 33

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) { // L: 34 35 55
			Object var3;
			if (var2 == 3) { // L: 37
				var3 = new class158(this);
			} else if (var2 == 1) { // L: 38
				var3 = new class134(this);
			} else if (var2 == 13) { // L: 39
				var3 = new class151(this);
			} else if (var2 == 4) { // L: 40
				var3 = new class143(this);
			} else if (var2 == 6) { // L: 41
				var3 = new class150(this);
			} else if (var2 == 5) { // L: 42
				var3 = new class135(this);
			} else if (var2 == 2) { // L: 43
				var3 = new class140(this);
			} else if (var2 == 7) { // L: 44
				var3 = new class133(this);
			} else if (var2 == 14) { // L: 45
				var3 = new class137(this);
			} else if (var2 == 8) { // L: 46
				var3 = new class154(this);
			} else if (var2 == 9) { // L: 47
				var3 = new class160(this);
			} else if (var2 == 10) {
				var3 = new class146(this); // L: 48
			} else if (var2 == 11) { // L: 49
				var3 = new class141(this);
			} else if (var2 == 12) { // L: 50
				var3 = new class145(this);
			} else {
				if (var2 != 15) { // L: 51
					throw new RuntimeException(""); // L: 52
				}

				var3 = new class155(this);
			}

			((class136)var3).vmethod3349(var1); // L: 53
			this.field1669.addFirst((Node)var3); // L: 54
		}

	} // L: 57

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lep;I)V",
		garbageValue = "-1399392797"
	)
	public void method3094(ClanSettings var1) {
		if (this.field1674 == var1.field1723 && this.field1668 == var1.field1746) { // L: 60
			for (class136 var2 = (class136)this.field1669.last(); var2 != null; var2 = (class136)this.field1669.previous()) { // L: 61
				var2.vmethod3350(var1); // L: 62
			}

			++var1.field1746; // L: 64
		} else {
			throw new RuntimeException("");
		}
	} // L: 65

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "([BIILhc;[Lgw;B)V",
		garbageValue = "115"
	)
	static final void method3087(byte[] var0, int var1, int var2, Scene var3, CollisionMap[] var4) {
		Buffer var5 = new Buffer(var0); // L: 281
		int var6 = -1; // L: 282

		while (true) {
			int var7 = var5.method8732(); // L: 284
			if (var7 == 0) { // L: 285
				return; // L: 309
			}

			var6 += var7; // L: 286
			int var8 = 0; // L: 287

			while (true) {
				int var9 = var5.readUShortSmart(); // L: 289
				if (var9 == 0) { // L: 290
					break;
				}

				var8 += var9 - 1; // L: 291
				int var10 = var8 & 63; // L: 292
				int var11 = var8 >> 6 & 63; // L: 293
				int var12 = var8 >> 12; // L: 294
				int var13 = var5.readUnsignedByte(); // L: 295
				int var14 = var13 >> 2; // L: 296
				int var15 = var13 & 3; // L: 297
				int var16 = var11 + var1; // L: 298
				int var17 = var10 + var2; // L: 299
				if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) { // L: 300
					int var18 = var12; // L: 301
					if ((Tiles.Tiles_renderFlags[1][var16][var17] & 2) == 2) { // L: 302
						var18 = var12 - 1;
					}

					CollisionMap var19 = null; // L: 303
					if (var18 >= 0) { // L: 304
						var19 = var4[var18];
					}

					UrlRequester.addObjects(var12, var16, var17, var6, var15, var14, var3, var19); // L: 305
				}
			}
		}
	}
}
