import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gx")
public class class167 extends class143 {
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "[Luc;"
	)
	@Export("worldSelectBackSprites")
	static SpritePixels[] worldSelectBackSprites;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1928445647
	)
	int field1791;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		longValue = -5933219131196010131L
	)
	long field1789;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfm;)V"
	)
	class167(class146 var1) {
		this.this$0 = var1; // L: 307
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "-411371469"
	)
	void vmethod3531(Buffer var1) {
		this.field1791 = var1.readInt(); // L: 310
		this.field1789 = var1.readLong(); // L: 311
	} // L: 312

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lfn;I)V",
		garbageValue = "1048713263"
	)
	void vmethod3529(ClanSettings var1) {
		var1.method3354(this.field1791, this.field1789); // L: 315
	} // L: 316

	@ObfuscatedName("ag")
	@Export("Entity_unpackID")
	public static int Entity_unpackID(long var0) {
		return (int)(var0 >>> 17 & 4294967295L); // L: 76
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "124"
	)
	public static String method3535(String var0) {
		int var1 = var0.length(); // L: 188
		char[] var2 = new char[var1]; // L: 189
		byte var3 = 2; // L: 190

		for (int var4 = 0; var4 < var1; ++var4) { // L: 191
			char var5 = var0.charAt(var4); // L: 192
			if (var3 == 0) { // L: 193
				var5 = Character.toLowerCase(var5);
			} else if (var3 == 2 || Character.isUpperCase(var5)) { // L: 194
				char var6;
				if (var5 != 181 && var5 != 402) { // L: 197
					var6 = Character.toTitleCase(var5); // L: 201
				} else {
					var6 = var5; // L: 198
				}

				var5 = var6; // L: 203
			}

			if (Character.isLetter(var5)) { // L: 205
				var3 = 0;
			} else if (var5 != '.' && var5 != '?' && var5 != '!') { // L: 206
				if (Character.isSpaceChar(var5)) { // L: 207
					if (var3 != 2) { // L: 208
						var3 = 1;
					}
				} else {
					var3 = 1; // L: 210
				}
			} else {
				var3 = 2;
			}

			var2[var4] = var5; // L: 211
		}

		return new String(var2); // L: 213
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(CII)Ljava/lang/String;",
		garbageValue = "2039050057"
	)
	static String method3532(char var0, int var1) {
		char[] var2 = new char[var1]; // L: 217

		for (int var3 = 0; var3 < var1; ++var3) { // L: 218
			var2[var3] = var0;
		}

		return new String(var2); // L: 219
	}

	@ObfuscatedName("lv")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)Z",
		garbageValue = "-1926744742"
	)
	static boolean method3538(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var8;
		if (var5 == class368.field4292.field4296) { // L: 8439
			WallObject var7 = GrandExchangeOfferOwnWorldComparator.scene.method5404(var0, var1, var2); // L: 8440
			if (var7 != null) { // L: 8441
				var8 = Entity_unpackID(var7.tag); // L: 8442
				if (var3 == WorldMapDecorationType.field3886.id) { // L: 8443
					var7.renderable1 = new DynamicObject(var8, 2, var4 + 4, var0, var1, var2, var6, false, var7.renderable1); // L: 8444
					var7.renderable2 = new DynamicObject(var8, 2, var4 + 1 & 3, var0, var1, var2, var6, false, var7.renderable2); // L: 8445
				} else {
					var7.renderable1 = new DynamicObject(var8, var3, var4, var0, var1, var2, var6, false, var7.renderable1); // L: 8448
				}

				return true; // L: 8450
			}
		} else if (var5 == class368.field4293.field4296) { // L: 8453
			DecorativeObject var9 = GrandExchangeOfferOwnWorldComparator.scene.method5469(var0, var1, var2); // L: 8454
			if (var9 != null) { // L: 8455
				var8 = Entity_unpackID(var9.tag); // L: 8456
				if (var3 != WorldMapDecorationType.field3889.id && var3 != WorldMapDecorationType.field3900.id) { // L: 8457
					if (var3 == WorldMapDecorationType.field3891.id) { // L: 8460
						var9.renderable1 = new DynamicObject(var8, 4, var4 + 4, var0, var1, var2, var6, false, var9.renderable1); // L: 8461
					} else if (var3 == WorldMapDecorationType.field3892.id) { // L: 8463
						var9.renderable1 = new DynamicObject(var8, 4, (var4 + 2 & 3) + 4, var0, var1, var2, var6, false, var9.renderable1); // L: 8464
					} else if (var3 == WorldMapDecorationType.field3898.id) { // L: 8466
						var9.renderable1 = new DynamicObject(var8, 4, var4 + 4, var0, var1, var2, var6, false, var9.renderable1); // L: 8467
						var9.renderable2 = new DynamicObject(var8, 4, (var4 + 2 & 3) + 4, var0, var1, var2, var6, false, var9.renderable2); // L: 8468
					}
				} else {
					var9.renderable1 = new DynamicObject(var8, 4, var4, var0, var1, var2, var6, false, var9.renderable1); // L: 8458
				}

				return true; // L: 8470
			}
		} else if (var5 == class368.field4294.field4296) { // L: 8473
			GameObject var10 = GrandExchangeOfferOwnWorldComparator.scene.getGameObject(var0, var1, var2); // L: 8474
			if (var3 == WorldMapDecorationType.field3905.id) { // L: 8475
				var3 = WorldMapDecorationType.field3904.id;
			}

			if (var10 != null) { // L: 8476
				var10.renderable = new DynamicObject(Entity_unpackID(var10.tag), var3, var4, var0, var1, var2, var6, false, var10.renderable); // L: 8477
				return true; // L: 8478
			}
		} else if (var5 == class368.field4295.field4296) { // L: 8481
			GroundObject var11 = GrandExchangeOfferOwnWorldComparator.scene.getGroundObject(var0, var1, var2); // L: 8482
			if (var11 != null) { // L: 8483
				var11.renderable = new DynamicObject(Entity_unpackID(var11.tag), 22, var4, var0, var1, var2, var6, false, var11.renderable); // L: 8484
				return true; // L: 8485
			}
		}

		return false; // L: 8488
	}
}
