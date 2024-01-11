import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ns")
public class class341 {
	@ObfuscatedName("au")
	@Export("Tiles_saturation")
	static int[] Tiles_saturation;
	@ObfuscatedName("ja")
	@Export("regionMapArchives")
	static byte[][] regionMapArchives;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lee;"
	)
	UrlRequest field3626;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Luc;"
	)
	SpritePixels field3625;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Leg;)V"
	)
	class341(String var1, UrlRequester var2) {
		try {
			this.field3626 = var2.request(new URL(var1)); // L: 16
		} catch (MalformedURLException var4) {
			this.field3626 = null;
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Lee;)V"
	)
	class341(UrlRequest var1) {
		this.field3626 = var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Luc;",
		garbageValue = "2000911952"
	)
	SpritePixels method6364() {
		if (this.field3625 == null && this.field3626 != null && this.field3626.isDone()) {
			if (this.field3626.getResponse() != null) { // L: 29
				this.field3625 = class181.method3691(this.field3626.getResponse());
			}

			this.field3626 = null;
		}

		return this.field3625;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)Lhp;",
		garbageValue = "-1949296619"
	)
	@Export("ItemComposition_get")
	public static ItemComposition ItemComposition_get(int var0) {
		ItemComposition var1 = (ItemComposition)ItemComposition.ItemComposition_cached.get((long)var0); // L: 90
		if (var1 != null) { // L: 91
			return var1;
		} else {
			byte[] var2 = ItemComposition.ItemComposition_archive.takeFile(10, var0); // L: 92
			var1 = new ItemComposition(); // L: 93
			var1.id = var0; // L: 94
			if (var2 != null) { // L: 95
				var1.decode(new Buffer(var2));
			}

			var1.post(); // L: 96
			if (var1.noteTemplate != -1) { // L: 97
				var1.genCert(ItemComposition_get(var1.noteTemplate), ItemComposition_get(var1.note));
			}

			if (var1.notedId != -1) { // L: 98
				var1.genBought(ItemComposition_get(var1.notedId), ItemComposition_get(var1.unnotedId));
			}

			if (var1.placeholderTemplate != -1) { // L: 99
				var1.genPlaceholder(ItemComposition_get(var1.placeholderTemplate), ItemComposition_get(var1.placeholder));
			}

			if (!class507.ItemComposition_inMembersWorld && var1.isMembersOnly) { // L: 100
				if (var1.noteTemplate == -1 && var1.notedId == -1 && var1.placeholderTemplate == -1) { // L: 101
					var1.name = var1.name + " (Members)"; // L: 102
				}

				var1.isTradable = false; // L: 104

				int var3;
				for (var3 = 0; var3 < var1.groundActions.length; ++var3) { // L: 105
					var1.groundActions[var3] = null; // L: 106
				}

				for (var3 = 0; var3 < var1.inventoryActions.length; ++var3) { // L: 108
					if (var3 != 4) { // L: 109
						var1.inventoryActions[var3] = null; // L: 110
					}
				}

				var1.shiftClickIndex = -2; // L: 113
				var1.field2157 = 0; // L: 114
				if (var1.params != null) { // L: 115
					boolean var6 = false; // L: 116

					for (Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) { // L: 117
						ParamComposition var5 = class6.getParamDefinition((int)var4.key); // L: 118
						if (var5.autoDisable) { // L: 119
							var4.remove();
						} else {
							var6 = true; // L: 120
						}
					}

					if (!var6) { // L: 122
						var1.params = null;
					}
				}
			}

			ItemComposition.ItemComposition_cached.put(var1, (long)var0); // L: 125
			return var1; // L: 126
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/CharSequence;IIB)Ljava/lang/String;",
		garbageValue = "0"
	)
	public static String method6369(CharSequence[] var0, int var1, int var2) {
		if (var2 == 0) { // L: 17
			return "";
		} else if (var2 == 1) { // L: 18
			CharSequence var10 = var0[var1]; // L: 19
			return var10 == null ? "null" : var10.toString(); // L: 20 21
		} else {
			int var3 = var2 + var1; // L: 23
			int var4 = 0; // L: 24

			for (int var5 = var1; var5 < var3; ++var5) { // L: 25
				CharSequence var9 = var0[var5]; // L: 26
				if (var9 == null) { // L: 27
					var4 += 4;
				} else {
					var4 += var9.length(); // L: 28
				}
			}

			StringBuilder var8 = new StringBuilder(var4); // L: 30

			for (int var6 = var1; var6 < var3; ++var6) { // L: 31
				CharSequence var7 = var0[var6]; // L: 32
				if (var7 == null) { // L: 33
					var8.append("null");
				} else {
					var8.append(var7); // L: 34
				}
			}

			return var8.toString(); // L: 36
		}
	}

	@ObfuscatedName("ot")
	@ObfuscatedSignature(
		descriptor = "(IIIILuc;Lmq;I)V",
		garbageValue = "-1304991398"
	)
	@Export("worldToMinimap")
	static final void worldToMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		int var6 = var3 * var3 + var2 * var2; // L: 12418
		if (var6 > 4225 && var6 < 90000) { // L: 12419
			int var7 = Client.camAngleY & 2047; // L: 12420
			int var8 = Rasterizer3D.Rasterizer3D_sine[var7]; // L: 12421
			int var9 = Rasterizer3D.Rasterizer3D_cosine[var7]; // L: 12422
			int var10 = var9 * var2 + var3 * var8 >> 16; // L: 12423
			int var11 = var3 * var9 - var8 * var2 >> 16; // L: 12424
			double var12 = Math.atan2((double)var10, (double)var11); // L: 12425
			int var14 = var5.width / 2 - 25; // L: 12426
			int var15 = (int)(Math.sin(var12) * (double)var14); // L: 12427
			int var16 = (int)(Math.cos(var12) * (double)var14); // L: 12428
			byte var17 = 20; // L: 12429
			class149.redHintArrowSprite.method9856(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256); // L: 12430
		} else {
			TileItem.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5); // L: 12432
		}

	} // L: 12433
}
