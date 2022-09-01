import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dg")
public enum class116 implements MouseWheel {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	field1434(0, 0),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	field1431(1, 1),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	field1428(2, 2),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	field1433(3, 3),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	field1432(4, 4);

	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -468392523
	)
	final int field1430;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -2081257831
	)
	final int field1429;

	class116(int var3, int var4) {
		this.field1430 = var3; // L: 117
		this.field1429 = var4; // L: 118
	} // L: 119

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "104"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1429; // L: 122
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-500725143"
	)
	static void method2683(int var0) {
		if (var0 != Login.loginIndex) { // L: 1908
			Login.loginIndex = var0; // L: 1909
		}
	} // L: 1910

	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1765352582"
	)
	static final void method2678() {
		VarpDefinition.method3288(); // L: 2862
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear(); // L: 2864
		UserComparator4.method2535(); // L: 2866
		class114.method2637(); // L: 2867
		class145.method3021(); // L: 2868
		class120.method2734(); // L: 2869
		SequenceDefinition.SequenceDefinition_cached.clear(); // L: 2871
		SequenceDefinition.SequenceDefinition_cachedFrames.clear(); // L: 2872
		SequenceDefinition.SequenceDefinition_cachedModel.clear(); // L: 2873
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear(); // L: 2876
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear(); // L: 2877
		class101.method2502(); // L: 2879
		VarpDefinition.VarpDefinition_cached.clear(); // L: 2881
		class290.HitSplatDefinition_cachedSprites.method7444(); // L: 2883
		Bounds.Ignored_cached.method7444(); // L: 2884
		class149.method3062(); // L: 2885
		HealthBarDefinition.HealthBarDefinition_cached.clear(); // L: 2887
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear(); // L: 2888
		Tiles.method2022(); // L: 2890
		ParamComposition.ParamComposition_cached.clear(); // L: 2892
		WorldMapElement.WorldMapElement_cachedSprites.clear(); // L: 2895
		Occluder.method4237(); // L: 2897
		class309.method5690(); // L: 2898
		Client.Widget_cachedModels.clear(); // L: 2899
		Client.Widget_cachedFonts.clear(); // L: 2900
		VarpDefinition.method3284(); // L: 2901
		Widget.Widget_cachedSprites.clear(); // L: 2903
		Widget.Widget_cachedModels.clear(); // L: 2904
		Widget.Widget_cachedFonts.clear(); // L: 2905
		Widget.Widget_cachedSpriteMasks.clear(); // L: 2906
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).clear(); // L: 2908
		Script.Script_cached.clear(); // L: 2909
		ClanChannelMember.archive5.clearFiles(); // L: 2910
		Decimator.field403.clearFiles(); // L: 2911
		class306.archive7.clearFiles(); // L: 2912
		class271.archive4.clearFiles(); // L: 2913
		class120.archive9.clearFiles(); // L: 2914
		PacketBuffer.archive6.clearFiles(); // L: 2915
		FloorUnderlayDefinition.archive11.clearFiles(); // L: 2916
		class299.archive8.clearFiles(); // L: 2917
		class201.field2366.clearFiles(); // L: 2918
		KitDefinition.archive10.clearFiles(); // L: 2919
		class17.field89.clearFiles(); // L: 2920
		SequenceDefinition.archive12.clearFiles(); // L: 2921
		Timer.field4232.clearFiles(); // L: 2922
	} // L: 2923

	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2085207398"
	)
	static final int method2682() {
		if (FriendsChatMember.clientPreferences.method2209()) { // L: 4879
			return class268.Client_plane;
		} else {
			int var0 = 3; // L: 4880
			if (class82.cameraPitch < 310) { // L: 4881
				label164: {
					int var1;
					int var2;
					if (Client.oculusOrbState == 1) { // L: 4884
						var1 = FloorOverlayDefinition.oculusOrbFocalPointX >> 7; // L: 4885
						var2 = AbstractUserComparator.oculusOrbFocalPointY >> 7; // L: 4886
					} else {
						var1 = ScriptFrame.localPlayer.x >> 7; // L: 4889
						var2 = ScriptFrame.localPlayer.y >> 7; // L: 4890
					}

					int var3 = class16.cameraX >> 7; // L: 4892
					int var4 = class269.cameraZ >> 7; // L: 4893
					if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 4894
						if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) { // L: 4895
							if ((Tiles.Tiles_renderFlags[class268.Client_plane][var3][var4] & 4) != 0) { // L: 4896
								var0 = class268.Client_plane;
							}

							int var5;
							if (var1 > var3) { // L: 4898
								var5 = var1 - var3;
							} else {
								var5 = var3 - var1; // L: 4899
							}

							int var6;
							if (var2 > var4) { // L: 4901
								var6 = var2 - var4;
							} else {
								var6 = var4 - var2; // L: 4902
							}

							int var7;
							int var8;
							if (var5 > var6) { // L: 4903
								var7 = var6 * 65536 / var5; // L: 4904
								var8 = 32768; // L: 4905

								while (true) {
									if (var1 == var3) { // L: 4906
										break label164;
									}

									if (var3 < var1) { // L: 4907
										++var3;
									} else if (var3 > var1) { // L: 4908
										--var3;
									}

									if ((Tiles.Tiles_renderFlags[class268.Client_plane][var3][var4] & 4) != 0) { // L: 4909
										var0 = class268.Client_plane;
									}

									var8 += var7; // L: 4910
									if (var8 >= 65536) { // L: 4911
										var8 -= 65536; // L: 4912
										if (var4 < var2) { // L: 4913
											++var4;
										} else if (var4 > var2) { // L: 4914
											--var4;
										}

										if ((Tiles.Tiles_renderFlags[class268.Client_plane][var3][var4] & 4) != 0) { // L: 4915
											var0 = class268.Client_plane;
										}
									}
								}
							} else {
								if (var6 > 0) { // L: 4919
									var7 = var5 * 65536 / var6; // L: 4920
									var8 = 32768; // L: 4921

									while (var2 != var4) { // L: 4922
										if (var4 < var2) { // L: 4923
											++var4;
										} else if (var4 > var2) { // L: 4924
											--var4;
										}

										if ((Tiles.Tiles_renderFlags[class268.Client_plane][var3][var4] & 4) != 0) { // L: 4925
											var0 = class268.Client_plane;
										}

										var8 += var7; // L: 4926
										if (var8 >= 65536) { // L: 4927
											var8 -= 65536; // L: 4928
											if (var3 < var1) { // L: 4929
												++var3;
											} else if (var3 > var1) { // L: 4930
												--var3;
											}

											if ((Tiles.Tiles_renderFlags[class268.Client_plane][var3][var4] & 4) != 0) { // L: 4931
												var0 = class268.Client_plane;
											}
										}
									}
								}
								break label164;
							}
						}

						return class268.Client_plane;
					}

					return class268.Client_plane;
				}
			}

			if (ScriptFrame.localPlayer.x >= 0 && ScriptFrame.localPlayer.y >= 0 && ScriptFrame.localPlayer.x < 13312 && ScriptFrame.localPlayer.y < 13312) { // L: 4936
				if ((Tiles.Tiles_renderFlags[class268.Client_plane][ScriptFrame.localPlayer.x >> 7][ScriptFrame.localPlayer.y >> 7] & 4) != 0) { // L: 4937
					var0 = class268.Client_plane;
				}

				return var0; // L: 4938
			} else {
				return class268.Client_plane;
			}
		}
	}
}
