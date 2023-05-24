import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bj")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -2085912871
	)
	static int field268;
	@ObfuscatedName("bj")
	protected static String field269;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1600861545
	)
	@Export("id")
	int id;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -153242533
	)
	@Export("size")
	int size;
	@ObfuscatedName("aw")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("ac")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("au")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("ab")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("aq")
	@Export("methods")
	Method[] methods;
	@ObfuscatedName("al")
	@Export("arguments")
	byte[][][] arguments;

	ReflectionCheck() {
	} // L: 17

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lnm;I)V",
		garbageValue = "-1333163047"
	)
	public static void method724(AbstractArchive var0) {
		class481.field4961 = var0; // L: 19
	} // L: 20

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(Lde;IB)V",
		garbageValue = "-110"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(Actor var0, int var1) {
		SequenceDefinition var2;
		int var3;
		int var4;
		int var5;
		int var7;
		int var11;
		int var13;
		if (var0.spotAnimation >= Client.cycle) { // L: 3815
			var11 = Math.max(1, var0.spotAnimation - Client.cycle); // L: 3816
			var3 = var0.field1187 * 128 + var0.field1140 * 64; // L: 3817
			var4 = var0.field1189 * 128 + var0.field1140 * 64; // L: 3818
			var0.x += (var3 - var0.x) / var11; // L: 3819
			var0.y += (var4 - var0.y) / var11; // L: 3820
			var0.field1209 = 0; // L: 3821
			var0.orientation = var0.field1193; // L: 3822
		} else {
			int var8;
			if (var0.field1192 >= Client.cycle) { // L: 3824
				boolean var18 = var0.field1192 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0; // L: 3825
				if (!var18) { // L: 3826
					SequenceDefinition var12 = ItemContainer.SequenceDefinition_get(var0.sequence); // L: 3827
					if (var12 != null && !var12.isCachedModelIdSet()) { // L: 3828
						var18 = var0.sequenceFrameCycle + 1 > var12.frameLengths[var0.sequenceFrame]; // L: 3832
					} else {
						var18 = true; // L: 3829
					}
				}

				if (var18) { // L: 3835
					var3 = var0.field1192 - var0.spotAnimation; // L: 3836
					var4 = Client.cycle - var0.spotAnimation; // L: 3837
					var5 = var0.field1187 * 128 + var0.field1140 * 64; // L: 3838
					var13 = var0.field1189 * 128 + var0.field1140 * 64; // L: 3839
					var7 = var0.field1188 * 128 + var0.field1140 * 64; // L: 3840
					var8 = var0.field1207 * 128 + var0.field1140 * 64; // L: 3841
					var0.x = (var7 * var4 + var5 * (var3 - var4)) / var3; // L: 3842
					var0.y = (var4 * var8 + var13 * (var3 - var4)) / var3; // L: 3843
				}

				var0.field1209 = 0; // L: 3845
				var0.orientation = var0.field1193; // L: 3846
				var0.rotation = var0.orientation; // L: 3847
			} else {
				var0.movementSequence = var0.idleSequence; // L: 3850
				if (var0.pathLength == 0) { // L: 3851
					var0.field1209 = 0; // L: 3852
				} else {
					label490: {
						if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 3855
							var2 = ItemContainer.SequenceDefinition_get(var0.sequence); // L: 3856
							if (var0.field1210 > 0 && var2.field2312 == 0) { // L: 3857
								++var0.field1209; // L: 3858
								break label490; // L: 3859
							}

							if (var0.field1210 <= 0 && var2.field2313 == 0) { // L: 3861
								++var0.field1209; // L: 3862
								break label490; // L: 3863
							}
						}

						var11 = var0.x; // L: 3866
						var3 = var0.y; // L: 3867
						var4 = var0.pathX[var0.pathLength - 1] * 128 + var0.field1140 * 64; // L: 3868
						var5 = var0.pathY[var0.pathLength - 1] * 128 + var0.field1140 * 64; // L: 3869
						if (var11 < var4) { // L: 3870
							if (var3 < var5) { // L: 3871
								var0.orientation = 1280;
							} else if (var3 > var5) { // L: 3872
								var0.orientation = 1792;
							} else {
								var0.orientation = 1536; // L: 3873
							}
						} else if (var11 > var4) { // L: 3875
							if (var3 < var5) { // L: 3876
								var0.orientation = 768;
							} else if (var3 > var5) { // L: 3877
								var0.orientation = 256;
							} else {
								var0.orientation = 512; // L: 3878
							}
						} else if (var3 < var5) { // L: 3880
							var0.orientation = 1024;
						} else if (var3 > var5) { // L: 3881
							var0.orientation = 0;
						}

						class210 var6 = var0.pathTraversed[var0.pathLength - 1]; // L: 3882
						if (var4 - var11 <= 256 && var4 - var11 >= -256 && var5 - var3 <= 256 && var5 - var3 >= -256) { // L: 3883
							var7 = var0.orientation - var0.rotation & 2047; // L: 3890
							if (var7 > 1024) { // L: 3891
								var7 -= 2048;
							}

							var8 = var0.walkBackSequence; // L: 3892
							if (var7 >= -256 && var7 <= 256) { // L: 3893
								var8 = var0.walkSequence;
							} else if (var7 >= 256 && var7 < 768) { // L: 3894
								var8 = var0.walkRightSequence;
							} else if (var7 >= -768 && var7 <= -256) { // L: 3895
								var8 = var0.walkLeftSequence;
							}

							if (var8 == -1) { // L: 3896
								var8 = var0.walkSequence;
							}

							var0.movementSequence = var8; // L: 3897
							int var9 = 4; // L: 3898
							boolean var10 = true; // L: 3899
							if (var0 instanceof NPC) { // L: 3900
								var10 = ((NPC)var0).definition.isClickable;
							}

							if (var10) { // L: 3901
								if (var0.rotation != var0.orientation && var0.targetIndex == -1 && var0.field1190 != 0) { // L: 3902
									var9 = 2;
								}

								if (var0.pathLength > 2) { // L: 3903
									var9 = 6;
								}

								if (var0.pathLength > 3) { // L: 3904
									var9 = 8;
								}

								if (var0.field1209 > 0 && var0.pathLength > 1) { // L: 3905
									var9 = 8; // L: 3906
									--var0.field1209; // L: 3907
								}
							} else {
								if (var0.pathLength > 1) { // L: 3911
									var9 = 6;
								}

								if (var0.pathLength > 2) { // L: 3912
									var9 = 8;
								}

								if (var0.field1209 > 0 && var0.pathLength > 1) { // L: 3913
									var9 = 8; // L: 3914
									--var0.field1209; // L: 3915
								}
							}

							if (var6 == class210.field2387) { // L: 3918
								var9 <<= 1;
							} else if (var6 == class210.field2388) { // L: 3919
								var9 >>= 1;
							}

							if (var9 >= 8) { // L: 3920
								if (var0.movementSequence == var0.walkSequence && var0.runSequence != -1) { // L: 3921
									var0.movementSequence = var0.runSequence;
								} else if (var0.movementSequence == var0.walkBackSequence && var0.field1150 != -1) { // L: 3922
									var0.movementSequence = var0.field1150;
								} else if (var0.walkLeftSequence == var0.movementSequence && var0.field1151 != -1) {
									var0.movementSequence = var0.field1151; // L: 3923
								} else if (var0.walkRightSequence == var0.movementSequence && var0.field1152 != -1) { // L: 3924
									var0.movementSequence = var0.field1152;
								}
							} else if (var9 <= 1) { // L: 3926
								if (var0.walkSequence == var0.movementSequence && var0.field1153 != -1) { // L: 3927
									var0.movementSequence = var0.field1153;
								} else if (var0.walkBackSequence == var0.movementSequence && var0.field1196 != -1) { // L: 3928
									var0.movementSequence = var0.field1196;
								} else if (var0.walkLeftSequence == var0.movementSequence && var0.field1155 != -1) { // L: 3929
									var0.movementSequence = var0.field1155;
								} else if (var0.movementSequence == var0.walkRightSequence && var0.field1157 != -1) { // L: 3930
									var0.movementSequence = var0.field1157;
								}
							}

							if (var4 != var11 || var3 != var5) { // L: 3932
								if (var11 < var4) { // L: 3933
									var0.x += var9; // L: 3934
									if (var0.x > var4) { // L: 3935
										var0.x = var4;
									}
								} else if (var11 > var4) { // L: 3937
									var0.x -= var9; // L: 3938
									if (var0.x < var4) { // L: 3939
										var0.x = var4;
									}
								}

								if (var3 < var5) { // L: 3941
									var0.y += var9; // L: 3942
									if (var0.y > var5) { // L: 3943
										var0.y = var5;
									}
								} else if (var3 > var5) { // L: 3945
									var0.y -= var9; // L: 3946
									if (var0.y < var5) { // L: 3947
										var0.y = var5;
									}
								}
							}

							if (var4 == var0.x && var5 == var0.y) { // L: 3950
								--var0.pathLength; // L: 3951
								if (var0.field1210 > 0) { // L: 3952
									--var0.field1210;
								}
							}
						} else {
							var0.x = var4; // L: 3884
							var0.y = var5; // L: 3885
							--var0.pathLength; // L: 3886
							if (var0.field1210 > 0) { // L: 3887
								--var0.field1210;
							}
						}
					}
				}
			}
		}

		if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) { // L: 3955
			var0.sequence = -1; // L: 3956
			var0.spotAnimation = 0; // L: 3957
			var0.field1192 = 0; // L: 3958
			var0.method2377(); // L: 3959
			var0.x = var0.pathX[0] * 128 + var0.field1140 * 64; // L: 3960
			var0.y = var0.pathY[0] * 128 + var0.field1140 * 64; // L: 3961
			var0.method2388(); // L: 3962
		}

		if (MusicPatchNode.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) { // L: 3964 3965
			var0.sequence = -1; // L: 3966
			var0.spotAnimation = 0; // L: 3967
			var0.field1192 = 0; // L: 3968
			var0.method2377(); // L: 3969
			var0.x = var0.pathX[0] * 128 + var0.field1140 * 64; // L: 3970
			var0.y = var0.pathY[0] * 128 + var0.field1140 * 64; // L: 3971
			var0.method2388(); // L: 3972
		}

		if (var0.targetIndex != -1) { // L: 3976
			var2 = null; // L: 3977
			var3 = 65536; // L: 3978
			Object var15;
			if (var0.targetIndex < var3) { // L: 3979
				var15 = Client.npcs[var0.targetIndex]; // L: 3980
			} else {
				var15 = Client.players[var0.targetIndex - var3]; // L: 3983
			}

			if (var15 != null) { // L: 3985
				var4 = var0.x - ((Actor)var15).x; // L: 3986
				var5 = var0.y - ((Actor)var15).y; // L: 3987
				if (var4 != 0 || var5 != 0) { // L: 3988
					var7 = (int)(Math.atan2((double)var4, (double)var5) * 325.94932345220167D) & 2047; // L: 3992
					var0.orientation = var7; // L: 3994
				}
			} else if (var0.false0) { // L: 3997
				var0.targetIndex = -1; // L: 3998
				var0.false0 = false; // L: 3999
			}
		}

		if (var0.pathLength == 0 || var0.field1209 > 0) { // L: 4002
			var11 = -1; // L: 4003
			if (var0.field1197 != -1 && var0.field1174 != -1) { // L: 4004
				var3 = var0.field1197 * 128 - WorldMapData_0.baseX * 8192 + 64; // L: 4005
				var4 = var0.field1174 * 128 - GameObject.baseY * 8192 + 64; // L: 4006
				var5 = var0.x - var3; // L: 4007
				var13 = var0.y - var4; // L: 4008
				if (var5 != 0 || var13 != 0) { // L: 4009
					var7 = (int)(Math.atan2((double)var5, (double)var13) * 325.94932345220167D) & 2047; // L: 4012
					var11 = var7; // L: 4014
				}
			} else if (var0.field1172 != -1) { // L: 4017
				var11 = var0.field1172; // L: 4018
			}

			if (var11 != -1) { // L: 4020
				var0.orientation = var11; // L: 4021
				if (var0.field1142) { // L: 4022
					var0.rotation = var0.orientation; // L: 4023
				}
			}

			var0.method2370(); // L: 4026
		}

		var11 = var0.orientation - var0.rotation & 2047; // L: 4028
		if (var11 != 0) { // L: 4029
			boolean var16 = true; // L: 4030
			boolean var17 = true; // L: 4031
			++var0.field1203; // L: 4032
			var5 = var11 > 1024 ? -1 : 1; // L: 4033
			var0.rotation += var5 * var0.field1190; // L: 4034
			boolean var19 = true; // L: 4035
			if (var11 < var0.field1190 || var11 > 2048 - var0.field1190) { // L: 4036
				var0.rotation = var0.orientation; // L: 4037
				var19 = false; // L: 4038
			}

			if (var0.field1190 > 0 && var0.movementSequence == var0.idleSequence && (var0.field1203 > 25 || var19)) { // L: 4040
				if (var5 == -1 && var0.field1136 != -1) { // L: 4041
					var0.movementSequence = var0.field1136; // L: 4042
				} else if (var5 == 1 && var0.field1166 != -1) { // L: 4044
					var0.movementSequence = var0.field1166; // L: 4045
				} else {
					var0.movementSequence = var0.walkSequence; // L: 4048
				}
			}

			var0.rotation &= 2047; // L: 4052
		} else {
			if (var0.false0) { // L: 4055
				var0.targetIndex = -1; // L: 4056
				var0.false0 = false; // L: 4057
			}

			var0.field1203 = 0; // L: 4059
		}

		NetFileRequest.method6684(var0); // L: 4062
	} // L: 4063

	@ObfuscatedName("mt")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "-631543188"
	)
	@Export("updateRootInterface")
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (SoundSystem.loadInterface(var0)) { // L: 10808
			ViewportMouse.updateInterface(VerticalAlignment.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6); // L: 10809
		}
	} // L: 10810
}
