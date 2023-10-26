import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("es")
public class class115 extends UrlRequester {
	@ObfuscatedName("ao")
	final boolean field1441;

	public class115(boolean var1, int var2) {
		super(var2); // L: 13
		this.field1441 = var1; // L: 14
	} // L: 15

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Leq;I)V",
		garbageValue = "1796222901"
	)
	void vmethod2859(UrlRequest var1) throws IOException {
		URLConnection var2 = null; // L: 19
		boolean var9 = false;

		HttpURLConnection var12;
		label131: {
			label125: {
				try {
					label115: {
						var9 = true; // L: 21
						String var3 = var1.field1444.getProtocol(); // L: 22
						if (var3.equals("http")) {
							var2 = this.method2850(var1); // L: 23
						} else {
							if (!var3.equals("https")) { // L: 25
								var1.field1445 = UrlRequest.field1446; // L: 29
								var9 = false;
								break label115;
							}

							var2 = this.method2849(var1); // L: 26
						}

						this.method2840(var2, var1); // L: 32
						var9 = false;
						break label131;
					}
				} catch (IOException var10) { // L: 34
					var1.field1445 = UrlRequest.field1446; // L: 35
					var9 = false;
					break label125;
				} finally {
					if (var9) {
						if (var2 != null && var2 instanceof HttpURLConnection) {
							HttpURLConnection var6 = (HttpURLConnection)var2;
							var6.disconnect();
						}

					}
				}

				if (var2 != null && var2 instanceof HttpURLConnection) {
					HttpURLConnection var4 = (HttpURLConnection)var2;
					var4.disconnect();
				}

				return; // L: 30
			}

			if (var2 != null && var2 instanceof HttpURLConnection) { // L: 38 39
				var12 = (HttpURLConnection)var2; // L: 40
				var12.disconnect(); // L: 41
			}

			return; // L: 45
		}

		if (var2 != null && var2 instanceof HttpURLConnection) {
			var12 = (HttpURLConnection)var2;
			var12.disconnect();
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Leq;I)Ljava/net/URLConnection;",
		garbageValue = "-188799571"
	)
	URLConnection method2850(UrlRequest var1) throws IOException {
		URLConnection var2 = var1.field1444.openConnection(); // L: 48
		this.method2847(var2); // L: 49
		return var2; // L: 50
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Leq;I)Ljava/net/URLConnection;",
		garbageValue = "-1796104931"
	)
	URLConnection method2849(UrlRequest var1) throws IOException {
		HttpsURLConnection var2 = (HttpsURLConnection)var1.field1444.openConnection(); // L: 54
		if (!this.field1441) { // L: 55
			if (class15.field82 == null) { // L: 59
				class15.field82 = new class15(); // L: 60
			}

			class15 var4 = class15.field82; // L: 62
			var2.setSSLSocketFactory(var4); // L: 64
		}

		this.method2847(var2); // L: 66
		return var2; // L: 67
	}

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "-57"
	)
	@Export("getTileHeight")
	static final int getTileHeight(int var0, int var1, int var2) {
		int var3 = var0 >> 7; // L: 5899
		int var4 = var1 >> 7; // L: 5900
		if (var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) { // L: 5901
			int var5 = var2; // L: 5902
			if (var2 < 3 && (Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) { // L: 5903
				var5 = var2 + 1;
			}

			int var6 = var0 & 127; // L: 5904
			int var7 = var1 & 127; // L: 5905
			int var8 = Tiles.Tiles_heights[var5][var3 + 1][var4] * var6 + (128 - var6) * Tiles.Tiles_heights[var5][var3][var4] >> 7; // L: 5906
			int var9 = Tiles.Tiles_heights[var5][var3 + 1][var4 + 1] * var6 + Tiles.Tiles_heights[var5][var3][var4 + 1] * (128 - var6) >> 7; // L: 5907
			return var7 * var9 + var8 * (128 - var7) >> 7; // L: 5908
		} else {
			return 0;
		}
	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIB)V",
		garbageValue = "-12"
	)
	static final void method2852(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) { // L: 8736
			if (Client.isLowDetail && var0 != class87.Client_plane) { // L: 8737
				return;
			}

			long var8 = 0L; // L: 8738
			boolean var10 = true; // L: 8739
			boolean var11 = false; // L: 8740
			boolean var12 = false; // L: 8741
			if (var1 == 0) { // L: 8742
				var8 = class10.scene.getWallObjectTag(var0, var2, var3);
			}

			if (var1 == 1) { // L: 8743
				var8 = class10.scene.getDecorativeObjectTag(var0, var2, var3);
			}

			if (var1 == 2) { // L: 8744
				var8 = class10.scene.getGameObjectTag(var0, var2, var3);
			}

			if (var1 == 3) { // L: 8745
				var8 = class10.scene.getGroundObjectTag(var0, var2, var3);
			}

			int var13;
			if (var8 != 0L) { // L: 8746
				var13 = class10.scene.getObjectFlags(var0, var2, var3, var8); // L: 8747
				int var15 = SecureRandomFuture.Entity_unpackID(var8); // L: 8748
				int var16 = var13 & 31; // L: 8749
				int var17 = var13 >> 6 & 3; // L: 8750
				ObjectComposition var14;
				if (var1 == 0) { // L: 8751
					class10.scene.method4676(var0, var2, var3); // L: 8752
					var14 = class91.getObjectDefinition(var15); // L: 8753
					if (var14.interactType != 0) { // L: 8754
						Client.collisionMaps[var0].method4334(var2, var3, var16, var17, var14.boolean1);
					}
				}

				if (var1 == 1) { // L: 8756
					class10.scene.method4677(var0, var2, var3);
				}

				if (var1 == 2) { // L: 8757
					class10.scene.removeGameObject(var0, var2, var3); // L: 8758
					var14 = class91.getObjectDefinition(var15); // L: 8759
					if (var2 + var14.sizeX > 103 || var3 + var14.sizeX > 103 || var2 + var14.sizeY > 103 || var3 + var14.sizeY > 103) { // L: 8760
						return;
					}

					if (var14.interactType != 0) { // L: 8761
						Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var14.sizeX, var14.sizeY, var17, var14.boolean1);
					}
				}

				if (var1 == 3) { // L: 8763
					class10.scene.method4679(var0, var2, var3); // L: 8764
					var14 = class91.getObjectDefinition(var15); // L: 8765
					if (var14.interactType == 1) { // L: 8766
						Client.collisionMaps[var0].method4315(var2, var3);
					}
				}
			}

			if (var4 >= 0) { // L: 8769
				var13 = var0; // L: 8770
				if (var0 < 3 && (Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 8771
					var13 = var0 + 1;
				}

				MouseRecorder.method2332(var0, var13, var2, var3, var4, var5, var6, var7, class10.scene, Client.collisionMaps[var0]); // L: 8772
			}
		}

	} // L: 8775
}
