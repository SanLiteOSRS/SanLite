import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fo")
class class136 implements Callable {
	@ObfuscatedName("us")
	@ObfuscatedSignature(
		descriptor = "Lcg;"
	)
	@Export("decimator")
	static Decimator decimator;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	final class139 this$0;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lul;"
	)
	final Buffer val$p;
	// $FF: synthetic field
	final int val$version;

	@ObfuscatedSignature(
		descriptor = "(Lfk;Lul;I)V"
	)
	class136(class139 var1, Buffer var2, int var3) {
		this.this$0 = var1; // L: 42
		this.val$p = var2;
		this.val$version = var3;
	}

	public Object call() {
		this.this$0.method3103(this.val$p, this.val$version); // L: 45
		return null; // L: 46
	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1884389430"
	)
	static final int method3078() {
		if (class91.clientPreferences.method2502()) { // L: 5281
			return class87.Client_plane;
		} else {
			int var0 = 3; // L: 5282
			if (class365.cameraPitch < 310) { // L: 5283
				int var1;
				int var2;
				if (Client.oculusOrbState == 1) { // L: 5286
					var1 = ChatChannel.oculusOrbFocalPointX >> 7; // L: 5287
					var2 = AbstractWorldMapData.oculusOrbFocalPointY >> 7; // L: 5288
				} else {
					var1 = TextureProvider.localPlayer.x >> 7; // L: 5291
					var2 = TextureProvider.localPlayer.y >> 7; // L: 5292
				}

				int var3 = Client.cameraX >> 7; // L: 5294
				int var4 = WorldMapArea.cameraZ >> 7; // L: 5295
				if (var3 < 0 || var4 < 0 || var3 >= 104 || var4 >= 104) { // L: 5296
					return class87.Client_plane;
				}

				if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) { // L: 5297
					return class87.Client_plane;
				}

				if ((Tiles.Tiles_renderFlags[class87.Client_plane][var3][var4] & 4) != 0) { // L: 5298
					var0 = class87.Client_plane;
				}

				int var5;
				if (var1 > var3) { // L: 5300
					var5 = var1 - var3;
				} else {
					var5 = var3 - var1; // L: 5301
				}

				int var6;
				if (var2 > var4) { // L: 5303
					var6 = var2 - var4;
				} else {
					var6 = var4 - var2; // L: 5304
				}

				int var7;
				int var8;
				if (var5 > var6) { // L: 5305
					var7 = var6 * 65536 / var5; // L: 5306
					var8 = 32768; // L: 5307

					while (var1 != var3) { // L: 5308
						if (var3 < var1) { // L: 5309
							++var3;
						} else if (var3 > var1) { // L: 5310
							--var3;
						}

						if ((Tiles.Tiles_renderFlags[class87.Client_plane][var3][var4] & 4) != 0) { // L: 5311
							var0 = class87.Client_plane;
						}

						var8 += var7; // L: 5312
						if (var8 >= 65536) { // L: 5313
							var8 -= 65536; // L: 5314
							if (var4 < var2) { // L: 5315
								++var4;
							} else if (var4 > var2) { // L: 5316
								--var4;
							}

							if ((Tiles.Tiles_renderFlags[class87.Client_plane][var3][var4] & 4) != 0) { // L: 5317
								var0 = class87.Client_plane;
							}
						}
					}
				} else if (var6 > 0) { // L: 5321
					var7 = var5 * 65536 / var6; // L: 5322
					var8 = 32768; // L: 5323

					while (var4 != var2) { // L: 5324
						if (var4 < var2) { // L: 5325
							++var4;
						} else if (var4 > var2) { // L: 5326
							--var4;
						}

						if ((Tiles.Tiles_renderFlags[class87.Client_plane][var3][var4] & 4) != 0) { // L: 5327
							var0 = class87.Client_plane;
						}

						var8 += var7; // L: 5328
						if (var8 >= 65536) { // L: 5329
							var8 -= 65536; // L: 5330
							if (var3 < var1) { // L: 5331
								++var3;
							} else if (var3 > var1) { // L: 5332
								--var3;
							}

							if ((Tiles.Tiles_renderFlags[class87.Client_plane][var3][var4] & 4) != 0) { // L: 5333
								var0 = class87.Client_plane;
							}
						}
					}
				}
			}

			if (TextureProvider.localPlayer.x >= 0 && TextureProvider.localPlayer.y >= 0 && TextureProvider.localPlayer.x < 13312 && TextureProvider.localPlayer.y < 13312) { // L: 5338
				if ((Tiles.Tiles_renderFlags[class87.Client_plane][TextureProvider.localPlayer.x >> 7][TextureProvider.localPlayer.y >> 7] & 4) != 0) { // L: 5339
					var0 = class87.Client_plane;
				}

				return var0; // L: 5340
			} else {
				return class87.Client_plane;
			}
		}
	}
}
