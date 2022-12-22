import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hs")
@Implements("GroundObject")
public final class GroundObject {
	@ObfuscatedName("u")
	@Export("SpriteBuffer_pixels")
	public static byte[][] SpriteBuffer_pixels;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "[Lra;"
	)
	@Export("worldSelectArrows")
	static IndexedSprite[] worldSelectArrows;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 133255249
	)
	@Export("z")
	int z;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 804453261
	)
	@Export("x")
	int x;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1531498091
	)
	@Export("y")
	int y;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lhr;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		longValue = 4180672137059809271L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1420887887
	)
	@Export("flags")
	int flags;

	GroundObject() {
	} // L: 11

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(Lct;IB)V",
		garbageValue = "13"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(Actor var0, int var1) {
		SequenceDefinition var2;
		int var3;
		int var4;
		SequenceDefinition var12;
		int var14;
		if (var0.field1233 >= Client.cycle) { // L: 3867
			class273.method5479(var0);
		} else {
			int var5;
			int var7;
			int var8;
			if (var0.field1234 >= Client.cycle) { // L: 3868
				boolean var11 = var0.field1234 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0; // L: 3869
				if (!var11) { // L: 3870
					var12 = class216.SequenceDefinition_get(var0.sequence); // L: 3871
					if (var12 != null && !var12.isCachedModelIdSet()) { // L: 3872
						var11 = var0.sequenceFrameCycle + 1 > var12.frameLengths[var0.sequenceFrame]; // L: 3876
					} else {
						var11 = true; // L: 3873
					}
				}

				if (var11) { // L: 3879
					var3 = var0.field1234 - var0.field1233; // L: 3880
					var4 = Client.cycle - var0.field1233; // L: 3881
					var5 = var0.field1196 * 128 + var0.field1181 * 64; // L: 3882
					int var13 = var0.field1185 * 128 + var0.field1181 * 64; // L: 3883
					var7 = var0.field1230 * 128 + var0.field1181 * 64; // L: 3884
					var8 = var0.field1213 * 128 + var0.field1181 * 64; // L: 3885
					var0.x = (var7 * var4 + var5 * (var3 - var4)) / var3; // L: 3886
					var0.y = (var8 * var4 + var13 * (var3 - var4)) / var3; // L: 3887
				}

				var0.field1239 = 0; // L: 3889
				var0.orientation = var0.field1235; // L: 3890
				var0.rotation = var0.orientation; // L: 3891
			} else {
				var0.movementSequence = var0.idleSequence; // L: 3894
				if (var0.pathLength == 0) { // L: 3895
					var0.field1239 = 0; // L: 3896
				} else {
					label621: {
						if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 3899
							var2 = class216.SequenceDefinition_get(var0.sequence); // L: 3900
							if (var0.field1252 > 0 && var2.field2290 == 0) { // L: 3901
								++var0.field1239; // L: 3902
								break label621; // L: 3903
							}

							if (var0.field1252 <= 0 && var2.field2284 == 0) { // L: 3905
								++var0.field1239; // L: 3906
								break label621; // L: 3907
							}
						}

						var14 = var0.x; // L: 3910
						var3 = var0.y; // L: 3911
						var4 = var0.pathX[var0.pathLength - 1] * 128 + var0.field1181 * 64; // L: 3912
						var5 = var0.pathY[var0.pathLength - 1] * 128 + var0.field1181 * 64; // L: 3913
						if (var14 < var4) { // L: 3914
							if (var3 < var5) { // L: 3915
								var0.orientation = 1280;
							} else if (var3 > var5) { // L: 3916
								var0.orientation = 1792;
							} else {
								var0.orientation = 1536; // L: 3917
							}
						} else if (var14 > var4) { // L: 3919
							if (var3 < var5) { // L: 3920
								var0.orientation = 768;
							} else if (var3 > var5) { // L: 3921
								var0.orientation = 256;
							} else {
								var0.orientation = 512; // L: 3922
							}
						} else if (var3 < var5) { // L: 3924
							var0.orientation = 1024;
						} else if (var3 > var5) { // L: 3925
							var0.orientation = 0;
						}

						class204 var6 = var0.pathTraversed[var0.pathLength - 1]; // L: 3926
						if (var4 - var14 <= 256 && var4 - var14 >= -256 && var5 - var3 <= 256 && var5 - var3 >= -256) { // L: 3927
							var7 = var0.orientation - var0.rotation & 2047; // L: 3934
							if (var7 > 1024) { // L: 3935
								var7 -= 2048;
							}

							var8 = var0.walkBackSequence; // L: 3936
							if (var7 >= -256 && var7 <= 256) { // L: 3937
								var8 = var0.walkSequence;
							} else if (var7 >= 256 && var7 < 768) { // L: 3938
								var8 = var0.walkRightSequence;
							} else if (var7 >= -768 && var7 <= -256) { // L: 3939
								var8 = var0.walkLeftSequence;
							}

							if (var8 == -1) { // L: 3940
								var8 = var0.walkSequence;
							}

							var0.movementSequence = var8; // L: 3941
							int var9 = 4; // L: 3942
							boolean var10 = true; // L: 3943
							if (var0 instanceof NPC) { // L: 3944
								var10 = ((NPC)var0).definition.isClickable;
							}

							if (var10) { // L: 3945
								if (var0.rotation != var0.orientation && var0.targetIndex == -1 && var0.field1249 != 0) { // L: 3946
									var9 = 2;
								}

								if (var0.pathLength > 2) { // L: 3947
									var9 = 6;
								}

								if (var0.pathLength > 3) { // L: 3948
									var9 = 8;
								}

								if (var0.field1239 > 0 && var0.pathLength > 1) { // L: 3949
									var9 = 8; // L: 3950
									--var0.field1239; // L: 3951
								}
							} else {
								if (var0.pathLength > 1) { // L: 3955
									var9 = 6;
								}

								if (var0.pathLength > 2) { // L: 3956
									var9 = 8;
								}

								if (var0.field1239 > 0 && var0.pathLength > 1) { // L: 3957
									var9 = 8; // L: 3958
									--var0.field1239; // L: 3959
								}
							}

							if (var6 == class204.field2357) { // L: 3962
								var9 <<= 1;
							} else if (var6 == class204.field2356) { // L: 3963
								var9 >>= 1;
							}

							if (var9 >= 8) { // L: 3964
								if (var0.movementSequence == var0.walkSequence && var0.runSequence != -1) { // L: 3965
									var0.movementSequence = var0.runSequence;
								} else if (var0.movementSequence == var0.walkBackSequence && var0.field1191 != -1) { // L: 3966
									var0.movementSequence = var0.field1191;
								} else if (var0.walkLeftSequence == var0.movementSequence && var0.field1201 != -1) { // L: 3967
									var0.movementSequence = var0.field1201;
								} else if (var0.walkRightSequence == var0.movementSequence && var0.field1193 != -1) { // L: 3968
									var0.movementSequence = var0.field1193;
								}
							} else if (var9 <= 1) { // L: 3970
								if (var0.walkSequence == var0.movementSequence && var0.field1194 != -1) { // L: 3971
									var0.movementSequence = var0.field1194;
								} else if (var0.movementSequence == var0.walkBackSequence && var0.field1195 != -1) { // L: 3972
									var0.movementSequence = var0.field1195;
								} else if (var0.movementSequence == var0.walkLeftSequence && var0.field1226 != -1) { // L: 3973
									var0.movementSequence = var0.field1226;
								} else if (var0.movementSequence == var0.walkRightSequence && var0.field1197 != -1) { // L: 3974
									var0.movementSequence = var0.field1197;
								}
							}

							if (var4 != var14 || var3 != var5) { // L: 3976
								if (var14 < var4) { // L: 3977
									var0.x += var9; // L: 3978
									if (var0.x > var4) { // L: 3979
										var0.x = var4;
									}
								} else if (var14 > var4) { // L: 3981
									var0.x -= var9; // L: 3982
									if (var0.x < var4) { // L: 3983
										var0.x = var4;
									}
								}

								if (var3 < var5) { // L: 3985
									var0.y += var9; // L: 3986
									if (var0.y > var5) { // L: 3987
										var0.y = var5;
									}
								} else if (var3 > var5) { // L: 3989
									var0.y -= var9; // L: 3990
									if (var0.y < var5) { // L: 3991
										var0.y = var5;
									}
								}
							}

							if (var4 == var0.x && var5 == var0.y) { // L: 3994
								--var0.pathLength; // L: 3995
								if (var0.field1252 > 0) { // L: 3996
									--var0.field1252;
								}
							}
						} else {
							var0.x = var4; // L: 3928
							var0.y = var5; // L: 3929
							--var0.pathLength; // L: 3930
							if (var0.field1252 > 0) { // L: 3931
								--var0.field1252;
							}
						}
					}
				}
			}
		}

		if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) { // L: 3999
			var0.sequence = -1; // L: 4000
			var0.spotAnimation = -1; // L: 4001
			var0.field1233 = 0; // L: 4002
			var0.field1234 = 0; // L: 4003
			var0.x = var0.pathX[0] * 128 + var0.field1181 * 64; // L: 4004
			var0.y = var0.pathY[0] * 128 + var0.field1181 * 64; // L: 4005
			var0.method2348(); // L: 4006
		}

		if (class155.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) { // L: 4008 4009
			var0.sequence = -1; // L: 4010
			var0.spotAnimation = -1; // L: 4011
			var0.field1233 = 0; // L: 4012
			var0.field1234 = 0; // L: 4013
			var0.x = var0.pathX[0] * 128 + var0.field1181 * 64; // L: 4014
			var0.y = var0.pathY[0] * 128 + var0.field1181 * 64; // L: 4015
			var0.method2348(); // L: 4016
		}

		FriendSystem.method1862(var0); // L: 4019
		var0.isWalking = false; // L: 4021
		if (var0.movementSequence != -1) { // L: 4022
			var2 = class216.SequenceDefinition_get(var0.movementSequence); // L: 4023
			if (var2 != null) { // L: 4024
				if (!var2.isCachedModelIdSet() && var2.frameIds != null) { // L: 4025
					++var0.movementFrameCycle; // L: 4026
					if (var0.movementFrame < var2.frameIds.length && var0.movementFrameCycle > var2.frameLengths[var0.movementFrame]) { // L: 4027
						var0.movementFrameCycle = 1; // L: 4028
						++var0.movementFrame; // L: 4029
						FriendsChatManager.method7459(var2, var0.movementFrame, var0.x, var0.y); // L: 4030
					}

					if (var0.movementFrame >= var2.frameIds.length) { // L: 4032
						if (var2.frameCount > 0) { // L: 4033
							var0.movementFrame -= var2.frameCount; // L: 4034
							if (var2.field2298) { // L: 4035
								++var0.field1218;
							}

							if (var0.movementFrame < 0 || var0.movementFrame >= var2.frameIds.length || var2.field2298 && var0.field1218 >= var2.field2301) { // L: 4036
								var0.movementFrameCycle = 0; // L: 4037
								var0.movementFrame = 0; // L: 4038
								var0.field1218 = 0; // L: 4039
							}
						} else {
							var0.movementFrameCycle = 0; // L: 4043
							var0.movementFrame = 0; // L: 4044
						}

						FriendsChatManager.method7459(var2, var0.movementFrame, var0.x, var0.y); // L: 4046
					}
				} else if (var2.isCachedModelIdSet()) { // L: 4049
					++var0.movementFrame; // L: 4050
					var3 = var2.method4024(); // L: 4051
					if (var0.movementFrame < var3) { // L: 4052
						class20.method293(var2, var0.movementFrame, var0.x, var0.y); // L: 4053
					} else {
						if (var2.frameCount > 0) { // L: 4056
							var0.movementFrame -= var2.frameCount; // L: 4057
							if (var2.field2298) { // L: 4058
								++var0.field1218;
							}

							if (var0.movementFrame < 0 || var0.movementFrame >= var3 || var2.field2298 && var0.field1218 >= var2.field2301) { // L: 4059
								var0.movementFrame = 0; // L: 4060
								var0.movementFrameCycle = 0; // L: 4061
								var0.field1218 = 0; // L: 4062
							}
						} else {
							var0.movementFrameCycle = 0; // L: 4066
							var0.movementFrame = 0; // L: 4067
						}

						class20.method293(var2, var0.movementFrame, var0.x, var0.y); // L: 4069
					}
				} else {
					var0.movementSequence = -1; // L: 4072
				}
			} else {
				var0.movementSequence = -1; // L: 4074
			}
		}

		if (var0.spotAnimation != -1 && Client.cycle >= var0.field1227) { // L: 4076
			if (var0.spotAnimationFrame < 0) { // L: 4077
				var0.spotAnimationFrame = 0;
			}

			var14 = ClanSettings.SpotAnimationDefinition_get(var0.spotAnimation).sequence; // L: 4078
			if (var14 != -1) { // L: 4079
				var12 = class216.SequenceDefinition_get(var14); // L: 4080
				if (var12 != null && var12.frameIds != null && !var12.isCachedModelIdSet()) { // L: 4081
					++var0.spotAnimationFrameCycle; // L: 4082
					if (var0.spotAnimationFrame < var12.frameIds.length && var0.spotAnimationFrameCycle > var12.frameLengths[var0.spotAnimationFrame]) { // L: 4083
						var0.spotAnimationFrameCycle = 1; // L: 4084
						++var0.spotAnimationFrame; // L: 4085
						FriendsChatManager.method7459(var12, var0.spotAnimationFrame, var0.x, var0.y); // L: 4086
					}

					if (var0.spotAnimationFrame >= var12.frameIds.length && (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var12.frameIds.length)) { // L: 4088 4089
						var0.spotAnimation = -1;
					}
				} else if (var12.isCachedModelIdSet()) { // L: 4092
					++var0.spotAnimationFrame; // L: 4093
					var4 = var12.method4024(); // L: 4094
					if (var0.spotAnimationFrame < var4) { // L: 4095
						class20.method293(var12, var0.spotAnimationFrame, var0.x, var0.y); // L: 4096
					} else if (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var4) { // L: 4099
						var0.spotAnimation = -1;
					}
				} else {
					var0.spotAnimation = -1; // L: 4102
				}
			} else {
				var0.spotAnimation = -1; // L: 4104
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay <= 1) { // L: 4106
			var2 = class216.SequenceDefinition_get(var0.sequence); // L: 4107
			if (var2.field2290 == 1 && var0.field1252 > 0 && var0.field1233 <= Client.cycle && var0.field1234 < Client.cycle) { // L: 4108 4109
				var0.sequenceDelay = 1; // L: 4110
				return; // L: 4166
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 4115
			var2 = class216.SequenceDefinition_get(var0.sequence); // L: 4116
			if (var2 == null) { // L: 4117
				var0.sequence = -1; // L: 4162
			} else if (!var2.isCachedModelIdSet() && var2.frameIds != null) { // L: 4118
				++var0.sequenceFrameCycle; // L: 4119
				if (var0.sequenceFrame < var2.frameIds.length && var0.sequenceFrameCycle > var2.frameLengths[var0.sequenceFrame]) { // L: 4120
					var0.sequenceFrameCycle = 1; // L: 4121
					++var0.sequenceFrame; // L: 4122
					FriendsChatManager.method7459(var2, var0.sequenceFrame, var0.x, var0.y); // L: 4123
				}

				if (var0.sequenceFrame >= var2.frameIds.length) { // L: 4125
					var0.sequenceFrame -= var2.frameCount; // L: 4126
					++var0.field1223; // L: 4127
					if (var0.field1223 >= var2.field2301) { // L: 4128
						var0.sequence = -1; // L: 4129
					} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var2.frameIds.length) { // L: 4131
						FriendsChatManager.method7459(var2, var0.sequenceFrame, var0.x, var0.y); // L: 4135
					} else {
						var0.sequence = -1; // L: 4132
					}
				}

				var0.isWalking = var2.field2281; // L: 4138
			} else if (var2.isCachedModelIdSet()) { // L: 4140
				++var0.sequenceFrame; // L: 4141
				var3 = var2.method4024(); // L: 4142
				if (var0.sequenceFrame < var3) { // L: 4143
					class20.method293(var2, var0.sequenceFrame, var0.x, var0.y); // L: 4144
				} else {
					var0.sequenceFrame -= var2.frameCount; // L: 4147
					++var0.field1223; // L: 4148
					if (var0.field1223 >= var2.field2301) { // L: 4149
						var0.sequence = -1; // L: 4150
					} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var3) { // L: 4152
						class20.method293(var2, var0.sequenceFrame, var0.x, var0.y); // L: 4156
					} else {
						var0.sequence = -1; // L: 4153
					}
				}
			} else {
				var0.sequence = -1; // L: 4160
			}
		}

		if (var0.sequenceDelay > 0) { // L: 4164
			--var0.sequenceDelay;
		}

	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(III)Lgg;",
		garbageValue = "1330231937"
	)
	static RouteStrategy method4298(int var0, int var1) {
		Client.field805.approxDestinationX = var0; // L: 8725
		Client.field805.approxDestinationY = var1; // L: 8726
		Client.field805.approxDestinationSizeX = 1; // L: 8727
		Client.field805.approxDestinationSizeY = 1; // L: 8728
		return Client.field805; // L: 8729
	}
}
