import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hs")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
	@ObfuscatedName("af")
	protected static String field2693;
	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	@Export("fontBold12")
	static Font fontBold12;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -137422977
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1423393629
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 247134525
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1123861549
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1869034957
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1040460307
	)
	@Export("regionEndY")
	int regionEndY;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 698009939
	)
	int field2703;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1367759899
	)
	int field2700;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1215718131
	)
	int field2701;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -843132573
	)
	int field2696;

	WorldMapSection2() {
	} // L: 18

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lht;I)V",
		garbageValue = "362337348"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2703) { // L: 22
			var1.regionLowX = this.field2703;
		}

		if (var1.regionHighX < this.field2701) {
			var1.regionHighX = this.field2701; // L: 23
		}

		if (var1.regionLowY > this.field2700) { // L: 24
			var1.regionLowY = this.field2700;
		}

		if (var1.regionHighY < this.field2696) { // L: 25
			var1.regionHighY = this.field2696;
		}

	} // L: 26

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIIS)Z",
		garbageValue = "-6948"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) { // L: 30
			return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY; // L: 33
		} else {
			return false; // L: 31
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1464078865"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 >= this.field2703 && var1 >> 6 <= this.field2701 && var2 >> 6 >= this.field2700 && var2 >> 6 <= this.field2696; // L: 38
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "2119764221"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 43
			return null; // L: 44
		} else {
			int[] var4 = new int[]{this.field2703 * 64 - this.regionStartX * 64 + var2, var3 + (this.field2700 * 64 - this.regionStartY * 64)}; // L: 46 47 48
			return var4; // L: 49
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)Lku;",
		garbageValue = "-1688632698"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 54
			return null; // L: 55
		} else {
			int var3 = this.regionStartX * 64 - this.field2703 * 64 + var1; // L: 57
			int var4 = this.regionStartY * 64 - this.field2700 * 64 + var2; // L: 58
			return new Coord(this.minPlane, var3, var4); // L: 59
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lqr;B)V",
		garbageValue = "-89"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte(); // L: 64
		this.planes = var1.readUnsignedByte(); // L: 65
		this.regionStartX = var1.readUnsignedShort(); // L: 66
		this.regionStartY = var1.readUnsignedShort(); // L: 67
		this.regionEndX = var1.readUnsignedShort();
		this.regionEndY = var1.readUnsignedShort(); // L: 69
		this.field2703 = var1.readUnsignedShort(); // L: 70
		this.field2700 = var1.readUnsignedShort(); // L: 71
		this.field2701 = var1.readUnsignedShort(); // L: 72
		this.field2696 = var1.readUnsignedShort(); // L: 73
		this.postRead(); // L: 74
	} // L: 75

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-39"
	)
	@Export("postRead")
	void postRead() {
	} // L: 77

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II)I",
		garbageValue = "1283436399"
	)
	public static int method4509(CharSequence var0, int var1) {
		return WorldMapIcon_0.method4838(var0, var1, true); // L: 81
	}

	@ObfuscatedName("q")
	@Export("Entity_unpackID")
	public static int Entity_unpackID(long var0) {
		return (int)(var0 >>> 17 & 4294967295L); // L: 68
	}

	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "(Lcx;II)V",
		garbageValue = "-347899176"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(Actor var0, int var1) {
		int var3;
		int var4;
		int var16;
		if (var0.field1182 >= Client.cycle) { // L: 3924
			ApproximateRouteStrategy.method1068(var0);
		} else {
			int var5;
			int var7;
			int var8;
			if (var0.field1183 >= Client.cycle) { // L: 3925
				boolean var11 = var0.field1183 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0; // L: 3926
				if (!var11) { // L: 3927
					SequenceDefinition var12 = ByteArrayPool.SequenceDefinition_get(var0.sequence); // L: 3928
					if (var12 != null && !var12.isCachedModelIdSet()) { // L: 3929
						var11 = var0.sequenceFrameCycle + 1 > var12.frameLengths[var0.sequenceFrame]; // L: 3933
					} else {
						var11 = true; // L: 3930
					}
				}

				if (var11) { // L: 3936
					var3 = var0.field1183 - var0.field1182; // L: 3937
					var4 = Client.cycle - var0.field1182; // L: 3938
					var5 = var0.field1178 * 128 + var0.field1190 * -1534074048; // L: 3939
					int var13 = var0.field1127 * 128 + var0.field1190 * -1534074048; // L: 3940
					var7 = var0.field1179 * 128 + var0.field1190 * -1534074048; // L: 3941
					var8 = var0.field1181 * 128 + var0.field1190 * -1534074048; // L: 3942
					var0.x = (var4 * var7 + var5 * (var3 - var4)) / var3; // L: 3943
					var0.y = (var4 * var8 + var13 * (var3 - var4)) / var3; // L: 3944
				}

				var0.field1200 = 0; // L: 3946
				var0.orientation = var0.field1136; // L: 3947
				var0.rotation = var0.orientation; // L: 3948
			} else {
				var0.movementSequence = var0.idleSequence; // L: 3951
				if (var0.pathLength == 0) { // L: 3952
					var0.field1200 = 0; // L: 3953
				} else {
					label510: {
						if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 3956
							SequenceDefinition var2 = ByteArrayPool.SequenceDefinition_get(var0.sequence); // L: 3957
							if (var0.field1201 > 0 && var2.field2179 == 0) { // L: 3958
								++var0.field1200; // L: 3959
								break label510; // L: 3960
							}

							if (var0.field1201 <= 0 && var2.field2180 == 0) { // L: 3962
								++var0.field1200; // L: 3963
								break label510; // L: 3964
							}
						}

						var16 = var0.x; // L: 3967
						var3 = var0.y; // L: 3968
						var4 = var0.pathX[var0.pathLength - 1] * 128 + var0.field1190 * -1534074048; // L: 3969
						var5 = var0.pathY[var0.pathLength - 1] * 128 + var0.field1190 * -1534074048; // L: 3970
						if (var16 < var4) { // L: 3971
							if (var3 < var5) { // L: 3972
								var0.orientation = 1280;
							} else if (var3 > var5) { // L: 3973
								var0.orientation = 1792;
							} else {
								var0.orientation = 1536; // L: 3974
							}
						} else if (var16 > var4) { // L: 3976
							if (var3 < var5) { // L: 3977
								var0.orientation = 768;
							} else if (var3 > var5) { // L: 3978
								var0.orientation = 256;
							} else {
								var0.orientation = 512; // L: 3979
							}
						} else if (var3 < var5) { // L: 3981
							var0.orientation = 1024;
						} else if (var3 > var5) { // L: 3982
							var0.orientation = 0;
						}

						class192 var6 = var0.pathTraversed[var0.pathLength - 1]; // L: 3983
						if (var4 - var16 <= 256 && var4 - var16 >= -256 && var5 - var3 <= 256 && var5 - var3 >= -256) { // L: 3984
							var7 = var0.orientation - var0.rotation & 2047; // L: 3991
							if (var7 > 1024) { // L: 3992
								var7 -= 2048;
							}

							var8 = var0.walkBackSequence; // L: 3993
							if (var7 >= -256 && var7 <= 256) { // L: 3994
								var8 = var0.walkSequence;
							} else if (var7 >= 256 && var7 < 768) { // L: 3995
								var8 = var0.walkRightSequence;
							} else if (var7 >= -768 && var7 <= -256) { // L: 3996
								var8 = var0.walkLeftSequence;
							}

							if (var8 == -1) { // L: 3997
								var8 = var0.walkSequence;
							}

							var0.movementSequence = var8; // L: 3998
							int var9 = 4; // L: 3999
							boolean var10 = true; // L: 4000
							if (var0 instanceof NPC) { // L: 4001
								var10 = ((NPC)var0).definition.isClickable;
							}

							if (var10) { // L: 4002
								if (var0.orientation != var0.rotation && var0.targetIndex == -1 && var0.field1180 != 0) { // L: 4003
									var9 = 2;
								}

								if (var0.pathLength > 2) { // L: 4004
									var9 = 6;
								}

								if (var0.pathLength > 3) { // L: 4005
									var9 = 8;
								}

								if (var0.field1200 > 0 && var0.pathLength > 1) { // L: 4006
									var9 = 8; // L: 4007
									--var0.field1200; // L: 4008
								}
							} else {
								if (var0.pathLength > 1) { // L: 4012
									var9 = 6;
								}

								if (var0.pathLength > 2) { // L: 4013
									var9 = 8;
								}

								if (var0.field1200 > 0 && var0.pathLength > 1) { // L: 4014
									var9 = 8; // L: 4015
									--var0.field1200; // L: 4016
								}
							}

							if (var6 == class192.field2207) { // L: 4019
								var9 <<= 1;
							} else if (var6 == class192.field2209) { // L: 4020
								var9 >>= 1;
							}

							if (var9 >= 8) { // L: 4021
								if (var0.movementSequence == var0.walkSequence && var0.runSequence != -1) { // L: 4022
									var0.movementSequence = var0.runSequence;
								} else if (var0.walkBackSequence == var0.movementSequence && var0.field1140 != -1) { // L: 4023
									var0.movementSequence = var0.field1140;
								} else if (var0.walkLeftSequence == var0.movementSequence && var0.field1141 != -1) { // L: 4024
									var0.movementSequence = var0.field1141;
								} else if (var0.walkRightSequence == var0.movementSequence && var0.field1149 != -1) { // L: 4025
									var0.movementSequence = var0.field1149;
								}
							} else if (var9 <= 1) { // L: 4027
								if (var0.movementSequence == var0.walkSequence && var0.field1143 != -1) { // L: 4028
									var0.movementSequence = var0.field1143;
								} else if (var0.movementSequence == var0.walkBackSequence && var0.field1170 != -1) { // L: 4029
									var0.movementSequence = var0.field1170;
								} else if (var0.walkLeftSequence == var0.movementSequence && var0.field1145 != -1) { // L: 4030
									var0.movementSequence = var0.field1145;
								} else if (var0.movementSequence == var0.walkRightSequence && var0.field1150 != -1) { // L: 4031
									var0.movementSequence = var0.field1150;
								}
							}

							if (var16 != var4 || var5 != var3) { // L: 4033
								if (var16 < var4) { // L: 4034
									var0.x += var9; // L: 4035
									if (var0.x > var4) { // L: 4036
										var0.x = var4;
									}
								} else if (var16 > var4) { // L: 4038
									var0.x -= var9; // L: 4039
									if (var0.x < var4) { // L: 4040
										var0.x = var4;
									}
								}

								if (var3 < var5) { // L: 4042
									var0.y += var9; // L: 4043
									if (var0.y > var5) { // L: 4044
										var0.y = var5;
									}
								} else if (var3 > var5) { // L: 4046
									var0.y -= var9; // L: 4047
									if (var0.y < var5) { // L: 4048
										var0.y = var5;
									}
								}
							}

							if (var4 == var0.x && var5 == var0.y) { // L: 4051
								--var0.pathLength; // L: 4052
								if (var0.field1201 > 0) { // L: 4053
									--var0.field1201;
								}
							}
						} else {
							var0.x = var4; // L: 3985
							var0.y = var5; // L: 3986
							--var0.pathLength; // L: 3987
							if (var0.field1201 > 0) { // L: 3988
								--var0.field1201;
							}
						}
					}
				}
			}
		}

		if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) { // L: 4056
			var0.sequence = -1; // L: 4057
			var0.spotAnimation = -1; // L: 4058
			var0.field1182 = 0; // L: 4059
			var0.field1183 = 0; // L: 4060
			var0.x = var0.pathX[0] * 128 + var0.field1190 * -1534074048; // L: 4061
			var0.y = var0.pathY[0] * 128 + var0.field1190 * -1534074048; // L: 4062
			var0.method2149(); // L: 4063
		}

		if (ScriptFrame.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) { // L: 4065 4066
			var0.sequence = -1; // L: 4067
			var0.spotAnimation = -1; // L: 4068
			var0.field1182 = 0; // L: 4069
			var0.field1183 = 0; // L: 4070
			var0.x = var0.pathX[0] * 128 + var0.field1190 * -1534074048; // L: 4071
			var0.y = var0.pathY[0] * 128 + var0.field1190 * -1534074048; // L: 4072
			var0.method2149(); // L: 4073
		}

		if (var0.field1180 != 0) { // L: 4077
			if (var0.targetIndex != -1) { // L: 4078
				Object var14 = null; // L: 4079
				if (var0.targetIndex < 32768) { // L: 4080
					var14 = Client.npcs[var0.targetIndex];
				} else if (var0.targetIndex >= 32768) { // L: 4081
					var14 = Client.players[var0.targetIndex - 32768];
				}

				if (var14 != null) { // L: 4082
					var3 = var0.x - ((Actor)var14).x; // L: 4083
					var4 = var0.y - ((Actor)var14).y; // L: 4084
					if (var3 != 0 || var4 != 0) { // L: 4085
						var0.orientation = (int)(Math.atan2((double)var3, (double)var4) * 325.949D) & 2047;
					}
				} else if (var0.false0) { // L: 4087
					var0.targetIndex = -1; // L: 4088
					var0.false0 = false; // L: 4089
				}
			}

			if (var0.field1162 != -1 && (var0.pathLength == 0 || var0.field1200 > 0)) { // L: 4092
				var0.orientation = var0.field1162; // L: 4093
				var0.field1162 = -1; // L: 4094
			}

			var16 = var0.orientation - var0.rotation & 2047; // L: 4096
			if (var16 == 0 && var0.false0) { // L: 4097
				var0.targetIndex = -1; // L: 4098
				var0.false0 = false; // L: 4099
			}

			if (var16 != 0) { // L: 4101
				++var0.field1194; // L: 4102
				boolean var15;
				if (var16 > 1024) { // L: 4103
					var0.rotation -= var0.field1163 ? var16 : var0.field1180; // L: 4104
					var15 = true; // L: 4105
					if (var16 < var0.field1180 || var16 > 2048 - var0.field1180) { // L: 4106
						var0.rotation = var0.orientation; // L: 4107
						var15 = false; // L: 4108
					}

					if (!var0.field1163 && var0.movementSequence == var0.idleSequence && (var0.field1194 > 25 || var15)) { // L: 4110
						if (var0.turnLeftSequence != -1) { // L: 4111
							var0.movementSequence = var0.turnLeftSequence;
						} else {
							var0.movementSequence = var0.walkSequence; // L: 4112
						}
					}
				} else {
					var0.rotation += var0.field1163 ? var16 : var0.field1180; // L: 4116
					var15 = true; // L: 4117
					if (var16 < var0.field1180 || var16 > 2048 - var0.field1180) { // L: 4118
						var0.rotation = var0.orientation; // L: 4119
						var15 = false; // L: 4120
					}

					if (!var0.field1163 && var0.movementSequence == var0.idleSequence && (var0.field1194 > 25 || var15)) { // L: 4122
						if (var0.turnRightSequence != -1) { // L: 4123
							var0.movementSequence = var0.turnRightSequence;
						} else {
							var0.movementSequence = var0.walkSequence; // L: 4124
						}
					}
				}

				var0.rotation &= 2047; // L: 4128
				var0.field1163 = false; // L: 4129
			} else {
				var0.field1194 = 0; // L: 4131
			}
		}

		method4493(var0); // L: 4133
	} // L: 4134

	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "(Lcx;I)V",
		garbageValue = "1824990148"
	)
	static final void method4493(Actor var0) {
		var0.isWalking = false; // L: 4147
		SequenceDefinition var1;
		int var2;
		if (var0.movementSequence != -1) { // L: 4148
			var1 = ByteArrayPool.SequenceDefinition_get(var0.movementSequence); // L: 4149
			if (var1 != null) { // L: 4150
				if (!var1.isCachedModelIdSet() && var1.frameIds != null) { // L: 4151
					++var0.movementFrameCycle; // L: 4152
					if (var0.movementFrame < var1.frameIds.length && var0.movementFrameCycle > var1.frameLengths[var0.movementFrame]) { // L: 4153
						var0.movementFrameCycle = 1; // L: 4154
						++var0.movementFrame; // L: 4155
						class282.method5426(var1, var0.movementFrame, var0.x, var0.y); // L: 4156
					}

					if (var0.movementFrame >= var1.frameIds.length) { // L: 4158
						if (var1.frameCount > 0) { // L: 4159
							var0.movementFrame -= var1.frameCount; // L: 4160
							if (var1.field2178) { // L: 4161
								++var0.field1167;
							}

							if (var0.movementFrame < 0 || var0.movementFrame >= var1.frameIds.length || var1.field2178 && var0.field1167 >= var1.field2177) { // L: 4162
								var0.movementFrameCycle = 0; // L: 4163
								var0.movementFrame = 0; // L: 4164
								var0.field1167 = 0; // L: 4165
							}
						} else {
							var0.movementFrameCycle = 0; // L: 4169
							var0.movementFrame = 0; // L: 4170
						}

						class282.method5426(var1, var0.movementFrame, var0.x, var0.y); // L: 4172
					}
				} else if (var1.isCachedModelIdSet()) { // L: 4175
					++var0.movementFrame; // L: 4176
					var2 = var1.method3729(); // L: 4177
					if (var0.movementFrame < var2) { // L: 4178
						WorldMapRectangle.method4912(var1, var0.movementFrame, var0.x, var0.y); // L: 4179
					} else {
						if (var1.frameCount > 0) { // L: 4182
							var0.movementFrame -= var1.frameCount; // L: 4183
							if (var1.field2178) { // L: 4184
								++var0.field1167;
							}

							if (var0.movementFrame < 0 || var0.movementFrame >= var2 || var1.field2178 && var0.field1167 >= var1.field2177) { // L: 4185
								var0.movementFrame = 0; // L: 4186
								var0.movementFrameCycle = 0; // L: 4187
								var0.field1167 = 0; // L: 4188
							}
						} else {
							var0.movementFrameCycle = 0; // L: 4192
							var0.movementFrame = 0; // L: 4193
						}

						WorldMapRectangle.method4912(var1, var0.movementFrame, var0.x, var0.y); // L: 4195
					}
				} else {
					var0.movementSequence = -1; // L: 4198
				}
			} else {
				var0.movementSequence = -1; // L: 4200
			}
		}

		if (var0.spotAnimation != -1 && Client.cycle >= var0.field1176) { // L: 4202
			if (var0.spotAnimationFrame < 0) { // L: 4203
				var0.spotAnimationFrame = 0;
			}

			int var4 = ArchiveDisk.SpotAnimationDefinition_get(var0.spotAnimation).sequence; // L: 4204
			if (var4 != -1) { // L: 4205
				SequenceDefinition var5 = ByteArrayPool.SequenceDefinition_get(var4); // L: 4206
				if (var5 != null && var5.frameIds != null && !var5.isCachedModelIdSet()) { // L: 4207
					++var0.field1175; // L: 4208
					if (var0.spotAnimationFrame < var5.frameIds.length && var0.field1175 > var5.frameLengths[var0.spotAnimationFrame]) { // L: 4209
						var0.field1175 = 1; // L: 4210
						++var0.spotAnimationFrame; // L: 4211
						class282.method5426(var5, var0.spotAnimationFrame, var0.x, var0.y); // L: 4212
					}

					if (var0.spotAnimationFrame >= var5.frameIds.length && (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var5.frameIds.length)) { // L: 4214 4215
						var0.spotAnimation = -1;
					}
				} else if (var5.isCachedModelIdSet()) { // L: 4218
					++var0.spotAnimationFrame; // L: 4219
					int var3 = var5.method3729(); // L: 4220
					if (var0.spotAnimationFrame < var3) { // L: 4221
						WorldMapRectangle.method4912(var5, var0.spotAnimationFrame, var0.x, var0.y); // L: 4222
					} else if (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var3) { // L: 4225
						var0.spotAnimation = -1;
					}
				} else {
					var0.spotAnimation = -1; // L: 4228
				}
			} else {
				var0.spotAnimation = -1; // L: 4230
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay <= 1) { // L: 4232
			var1 = ByteArrayPool.SequenceDefinition_get(var0.sequence); // L: 4233
			if (var1.field2179 == 1 && var0.field1201 > 0 && var0.field1182 <= Client.cycle && var0.field1183 < Client.cycle) { // L: 4234 4235
				var0.sequenceDelay = 1; // L: 4236
				return; // L: 4237
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 4241
			var1 = ByteArrayPool.SequenceDefinition_get(var0.sequence); // L: 4242
			if (var1 != null) { // L: 4243
				if (!var1.isCachedModelIdSet() && var1.frameIds != null) { // L: 4244
					++var0.sequenceFrameCycle; // L: 4245
					if (var0.sequenceFrame < var1.frameIds.length && var0.sequenceFrameCycle > var1.frameLengths[var0.sequenceFrame]) { // L: 4246
						var0.sequenceFrameCycle = 1; // L: 4247
						++var0.sequenceFrame; // L: 4248
						class282.method5426(var1, var0.sequenceFrame, var0.x, var0.y); // L: 4249
					}

					if (var0.sequenceFrame >= var1.frameIds.length) { // L: 4251
						var0.sequenceFrame -= var1.frameCount; // L: 4252
						++var0.field1172; // L: 4253
						if (var0.field1172 >= var1.field2177) { // L: 4254
							var0.sequence = -1; // L: 4255
						} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var1.frameIds.length) { // L: 4257
							class282.method5426(var1, var0.sequenceFrame, var0.x, var0.y); // L: 4261
						} else {
							var0.sequence = -1; // L: 4258
						}
					}

					var0.isWalking = var1.field2173; // L: 4264
				} else if (var1.isCachedModelIdSet()) { // L: 4266
					++var0.sequenceFrame; // L: 4267
					var2 = var1.method3729(); // L: 4268
					if (var0.sequenceFrame < var2) { // L: 4269
						WorldMapRectangle.method4912(var1, var0.sequenceFrame, var0.x, var0.y); // L: 4270
					} else {
						var0.sequenceFrame -= var1.frameCount; // L: 4273
						++var0.field1172; // L: 4274
						if (var0.field1172 >= var1.field2177) { // L: 4275
							var0.sequence = -1; // L: 4276
						} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var2) { // L: 4278
							WorldMapRectangle.method4912(var1, var0.sequenceFrame, var0.x, var0.y); // L: 4282
						} else {
							var0.sequence = -1; // L: 4279
						}
					}
				} else {
					var0.sequence = -1; // L: 4286
				}
			} else {
				var0.sequence = -1; // L: 4288
			}
		}

		if (var0.sequenceDelay > 0) { // L: 4290
			--var0.sequenceDelay;
		}

	} // L: 4291

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "293828807"
	)
	static final int method4502() {
		float var0 = 200.0F * ((float)FriendsChatMember.clientPreferences.method2220() - 0.5F); // L: 11605
		return 100 - Math.round(var0); // L: 11606
	}
}
