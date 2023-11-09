import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lw")
@Implements("NetFileRequest")
public class NetFileRequest extends DualNode {
	@ObfuscatedName("vc")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	public static class340 field4144;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	@Export("archive")
	public Archive archive;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 623270301
	)
	@Export("crc")
	public int crc;
	@ObfuscatedName("c")
	@Export("padding")
	public byte padding;

	NetFileRequest() {
	} // L: 10

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-330790031"
	)
	static final int method6341() {
		if (BufferedSink.clientPreferences.method2452()) { // L: 4826
			return ApproximateRouteStrategy.Client_plane;
		} else {
			int var0 = 3; // L: 4827
			if (class408.cameraPitch < 310) { // L: 4828
				label166: {
					int var1;
					int var2;
					if (Client.oculusOrbState == 1) { // L: 4831
						var1 = class31.oculusOrbFocalPointX >> 7; // L: 4832
						var2 = PendingSpawn.oculusOrbFocalPointY >> 7; // L: 4833
					} else {
						var1 = class296.localPlayer.x >> 7; // L: 4836
						var2 = class296.localPlayer.y >> 7; // L: 4837
					}

					int var3 = TextureProvider.cameraX >> 7; // L: 4839
					int var4 = class313.cameraZ >> 7; // L: 4840
					if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 4841
						if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) { // L: 4842
							if ((Tiles.Tiles_renderFlags[ApproximateRouteStrategy.Client_plane][var3][var4] & 4) != 0) { // L: 4843
								var0 = ApproximateRouteStrategy.Client_plane;
							}

							int var5;
							if (var1 > var3) { // L: 4845
								var5 = var1 - var3;
							} else {
								var5 = var3 - var1; // L: 4846
							}

							int var6;
							if (var2 > var4) { // L: 4848
								var6 = var2 - var4;
							} else {
								var6 = var4 - var2; // L: 4849
							}

							int var7;
							int var8;
							if (var5 > var6) { // L: 4850
								var7 = var6 * 65536 / var5; // L: 4851
								var8 = 32768; // L: 4852

								while (true) {
									if (var1 == var3) { // L: 4853
										break label166;
									}

									if (var3 < var1) { // L: 4854
										++var3;
									} else if (var3 > var1) { // L: 4855
										--var3;
									}

									if ((Tiles.Tiles_renderFlags[ApproximateRouteStrategy.Client_plane][var3][var4] & 4) != 0) { // L: 4856
										var0 = ApproximateRouteStrategy.Client_plane;
									}

									var8 += var7; // L: 4857
									if (var8 >= 65536) { // L: 4858
										var8 -= 65536; // L: 4859
										if (var4 < var2) { // L: 4860
											++var4;
										} else if (var4 > var2) { // L: 4861
											--var4;
										}

										if ((Tiles.Tiles_renderFlags[ApproximateRouteStrategy.Client_plane][var3][var4] & 4) != 0) { // L: 4862
											var0 = ApproximateRouteStrategy.Client_plane;
										}
									}
								}
							} else {
								if (var6 > 0) { // L: 4866
									var7 = var5 * 65536 / var6; // L: 4867
									var8 = 32768; // L: 4868

									while (var2 != var4) { // L: 4869
										if (var4 < var2) { // L: 4870
											++var4;
										} else if (var4 > var2) { // L: 4871
											--var4;
										}

										if ((Tiles.Tiles_renderFlags[ApproximateRouteStrategy.Client_plane][var3][var4] & 4) != 0) { // L: 4872
											var0 = ApproximateRouteStrategy.Client_plane;
										}

										var8 += var7; // L: 4873
										if (var8 >= 65536) { // L: 4874
											var8 -= 65536; // L: 4875
											if (var3 < var1) { // L: 4876
												++var3;
											} else if (var3 > var1) { // L: 4877
												--var3;
											}

											if ((Tiles.Tiles_renderFlags[ApproximateRouteStrategy.Client_plane][var3][var4] & 4) != 0) { // L: 4878
												var0 = ApproximateRouteStrategy.Client_plane;
											}
										}
									}
								}
								break label166;
							}
						}

						return ApproximateRouteStrategy.Client_plane;
					}

					return ApproximateRouteStrategy.Client_plane;
				}
			}

			if (class296.localPlayer.x >= 0 && class296.localPlayer.y >= 0 && class296.localPlayer.x < 13312 && class296.localPlayer.y < 13312) { // L: 4883
				if ((Tiles.Tiles_renderFlags[ApproximateRouteStrategy.Client_plane][class296.localPlayer.x >> 7][class296.localPlayer.y >> 7] & 4) != 0) { // L: 4884
					var0 = ApproximateRouteStrategy.Client_plane;
				}

				return var0; // L: 4885
			} else {
				return ApproximateRouteStrategy.Client_plane;
			}
		}
	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIB)V",
		garbageValue = "6"
	)
	static final void method6340(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		PendingSpawn var10 = null; // L: 8026

		for (PendingSpawn var11 = (PendingSpawn)Client.pendingSpawns.last(); var11 != null; var11 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 8027 8028 8033
			if (var0 == var11.plane && var11.x == var1 && var2 == var11.y && var3 == var11.type) { // L: 8029
				var10 = var11; // L: 8030
				break;
			}
		}

		if (var10 == null) { // L: 8035
			var10 = new PendingSpawn(); // L: 8036
			var10.plane = var0; // L: 8037
			var10.type = var3; // L: 8038
			var10.x = var1; // L: 8039
			var10.y = var2; // L: 8040
			EnumComposition.method3528(var10); // L: 8041
			Client.pendingSpawns.addFirst(var10); // L: 8042
		}

		var10.field1127 = var4; // L: 8044
		var10.field1129 = var5; // L: 8045
		var10.field1120 = var6; // L: 8046
		var10.delay = var8; // L: 8047
		var10.hitpoints = var9; // L: 8048
		var10.method2310(var7); // L: 8049
	} // L: 8050
}
