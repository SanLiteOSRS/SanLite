import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bs")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("vy")
	@ObfuscatedSignature(
		descriptor = "Lcm;"
	)
	@Export("friendSystem")
	public static FriendSystem friendSystem;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -755730941
	)
	@Export("id")
	int id;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1503596191
	)
	@Export("size")
	int size;
	@ObfuscatedName("ar")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("ab")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("at")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("ax")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("al")
	@Export("methods")
	Method[] methods;
	@ObfuscatedName("aj")
	@Export("arguments")
	byte[][][] arguments;

	ReflectionCheck() {
	} // L: 17

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Lfe;",
		garbageValue = "-1338707480"
	)
	static class138 method693(int var0) {
		class138 var1 = (class138)class217.findEnumerated(Message.method1191(), var0); // L: 114
		if (var1 == null) {
			var1 = class138.field1595; // L: 115
		}

		return var1; // L: 116
	}

	@ObfuscatedName("aj")
	static int method692(long var0) {
		return (int)(var0 >>> 14 & 3L); // L: 80
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1705504599"
	)
	static final int method691() {
		if (WorldMapManager.clientPreferences.method2536()) { // L: 4925
			return NetFileRequest.Client_plane;
		} else {
			int var0 = 3; // L: 4926
			if (ObjectComposition.cameraPitch < 310) { // L: 4927
				label169: {
					int var1;
					int var2;
					if (Client.oculusOrbState == 1) { // L: 4930
						var1 = WorldMapSection0.oculusOrbFocalPointX >> 7; // L: 4931
						var2 = TextureProvider.oculusOrbFocalPointY >> 7; // L: 4932
					} else {
						var1 = HitSplatDefinition.localPlayer.x >> 7; // L: 4935
						var2 = HitSplatDefinition.localPlayer.y >> 7; // L: 4936
					}

					int var3 = class19.cameraX >> 7; // L: 4938
					int var4 = BuddyRankComparator.cameraZ >> 7; // L: 4939
					if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 4940
						if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) { // L: 4941
							if ((Tiles.Tiles_renderFlags[NetFileRequest.Client_plane][var3][var4] & 4) != 0) { // L: 4942
								var0 = NetFileRequest.Client_plane;
							}

							int var5;
							if (var1 > var3) { // L: 4944
								var5 = var1 - var3;
							} else {
								var5 = var3 - var1; // L: 4945
							}

							int var6;
							if (var2 > var4) { // L: 4947
								var6 = var2 - var4;
							} else {
								var6 = var4 - var2; // L: 4948
							}

							int var7;
							int var8;
							if (var5 > var6) { // L: 4949
								var7 = var6 * 65536 / var5; // L: 4950
								var8 = 32768; // L: 4951

								while (true) {
									if (var1 == var3) { // L: 4952
										break label169;
									}

									if (var3 < var1) { // L: 4953
										++var3;
									} else if (var3 > var1) { // L: 4954
										--var3;
									}

									if ((Tiles.Tiles_renderFlags[NetFileRequest.Client_plane][var3][var4] & 4) != 0) { // L: 4955
										var0 = NetFileRequest.Client_plane;
									}

									var8 += var7; // L: 4956
									if (var8 >= 65536) { // L: 4957
										var8 -= 65536; // L: 4958
										if (var4 < var2) { // L: 4959
											++var4;
										} else if (var4 > var2) { // L: 4960
											--var4;
										}

										if ((Tiles.Tiles_renderFlags[NetFileRequest.Client_plane][var3][var4] & 4) != 0) { // L: 4961
											var0 = NetFileRequest.Client_plane;
										}
									}
								}
							} else {
								if (var6 > 0) { // L: 4965
									var7 = var5 * 65536 / var6; // L: 4966
									var8 = 32768; // L: 4967

									while (var2 != var4) { // L: 4968
										if (var4 < var2) { // L: 4969
											++var4;
										} else if (var4 > var2) { // L: 4970
											--var4;
										}

										if ((Tiles.Tiles_renderFlags[NetFileRequest.Client_plane][var3][var4] & 4) != 0) { // L: 4971
											var0 = NetFileRequest.Client_plane;
										}

										var8 += var7; // L: 4972
										if (var8 >= 65536) { // L: 4973
											var8 -= 65536; // L: 4974
											if (var3 < var1) { // L: 4975
												++var3;
											} else if (var3 > var1) { // L: 4976
												--var3;
											}

											if ((Tiles.Tiles_renderFlags[NetFileRequest.Client_plane][var3][var4] & 4) != 0) { // L: 4977
												var0 = NetFileRequest.Client_plane;
											}
										}
									}
								}
								break label169;
							}
						}

						return NetFileRequest.Client_plane;
					}

					return NetFileRequest.Client_plane;
				}
			}

			if (HitSplatDefinition.localPlayer.x >= 0 && HitSplatDefinition.localPlayer.y >= 0 && HitSplatDefinition.localPlayer.x < 13312 && HitSplatDefinition.localPlayer.y < 13312) { // L: 4982
				if ((Tiles.Tiles_renderFlags[NetFileRequest.Client_plane][HitSplatDefinition.localPlayer.x >> 7][HitSplatDefinition.localPlayer.y >> 7] & 4) != 0) { // L: 4983
					var0 = NetFileRequest.Client_plane;
				}

				return var0; // L: 4984
			} else {
				return NetFileRequest.Client_plane;
			}
		}
	}
}
