import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("y")
public enum class6 implements class342 {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Ly;"
	)
	field19(0, 0);

	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1499472863
	)
	static int field17;
	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "Lhg;"
	)
	@Export("textureProvider")
	static TextureProvider textureProvider;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -277308963
	)
	final int field23;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 2083873231
	)
	final int field16;

	class6(int var3, int var4) {
		this.field23 = var3; // L: 12
		this.field16 = var4; // L: 13
	} // L: 14

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field16; // L: 18
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "(Lcl;II)V",
		garbageValue = "-2095695257"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(Actor var0, int var1) {
		int var3;
		int var4;
		int var5;
		int var11;
		if (var0.field1192 >= Client.cycle) { // L: 4034
			Language.method6579(var0);
		} else if (var0.field1193 >= Client.cycle) { // L: 4035
			Occluder.method4470(var0);
		} else {
			var0.movementSequence = var0.idleSequence; // L: 4037
			if (var0.pathLength == 0) { // L: 4038
				var0.field1172 = 0; // L: 4039
			} else {
				label473: {
					if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 4042
						SequenceDefinition var2 = WorldMapElement.SequenceDefinition_get(var0.sequence); // L: 4043
						if (var0.field1211 > 0 && var2.field2221 == 0) { // L: 4044
							++var0.field1172; // L: 4045
							break label473; // L: 4046
						}

						if (var0.field1211 <= 0 && var2.field2211 == 0) { // L: 4048
							++var0.field1172; // L: 4049
							break label473; // L: 4050
						}
					}

					var11 = var0.x; // L: 4053
					var3 = var0.y; // L: 4054
					var4 = var0.pathX[var0.pathLength - 1] * 128 + var0.field1201 * 64; // L: 4055
					var5 = var0.pathY[var0.pathLength - 1] * 128 + var0.field1201 * 64; // L: 4056
					if (var11 < var4) { // L: 4057
						if (var3 < var5) { // L: 4058
							var0.orientation = 1280;
						} else if (var3 > var5) { // L: 4059
							var0.orientation = 1792;
						} else {
							var0.orientation = 1536; // L: 4060
						}
					} else if (var11 > var4) { // L: 4062
						if (var3 < var5) { // L: 4063
							var0.orientation = 768;
						} else if (var3 > var5) { // L: 4064
							var0.orientation = 256;
						} else {
							var0.orientation = 512; // L: 4065
						}
					} else if (var3 < var5) { // L: 4067
						var0.orientation = 1024;
					} else if (var3 > var5) { // L: 4068
						var0.orientation = 0;
					}

					class202 var6 = var0.pathTraversed[var0.pathLength - 1]; // L: 4069
					if (var4 - var11 <= 256 && var4 - var11 >= -256 && var5 - var3 <= 256 && var5 - var3 >= -256) { // L: 4070
						int var7 = var0.orientation - var0.rotation & 2047; // L: 4077
						if (var7 > 1024) { // L: 4078
							var7 -= 2048;
						}

						int var8 = var0.walkBackSequence; // L: 4079
						if (var7 >= -256 && var7 <= 256) { // L: 4080
							var8 = var0.walkSequence;
						} else if (var7 >= 256 && var7 < 768) { // L: 4081
							var8 = var0.walkRightSequence;
						} else if (var7 >= -768 && var7 <= -256) { // L: 4082
							var8 = var0.walkLeftSequence;
						}

						if (var8 == -1) { // L: 4083
							var8 = var0.walkSequence;
						}

						var0.movementSequence = var8; // L: 4084
						int var9 = 4; // L: 4085
						boolean var10 = true; // L: 4086
						if (var0 instanceof NPC) { // L: 4087
							var10 = ((NPC)var0).definition.isClickable;
						}

						if (var10) { // L: 4088
							if (var0.rotation != var0.orientation && var0.targetIndex == -1 && var0.field1205 != 0) { // L: 4089
								var9 = 2;
							}

							if (var0.pathLength > 2) { // L: 4090
								var9 = 6;
							}

							if (var0.pathLength > 3) { // L: 4091
								var9 = 8;
							}

							if (var0.field1172 > 0 && var0.pathLength > 1) { // L: 4092
								var9 = 8; // L: 4093
								--var0.field1172; // L: 4094
							}
						} else {
							if (var0.pathLength > 1) { // L: 4098
								var9 = 6;
							}

							if (var0.pathLength > 2) { // L: 4099
								var9 = 8;
							}

							if (var0.field1172 > 0 && var0.pathLength > 1) { // L: 4100
								var9 = 8; // L: 4101
								--var0.field1172; // L: 4102
							}
						}

						if (var6 == class202.field2284) { // L: 4105
							var9 <<= 1;
						} else if (var6 == class202.field2281) { // L: 4106
							var9 >>= 1;
						}

						if (var9 >= 8) { // L: 4107
							if (var0.movementSequence == var0.walkSequence && var0.runSequence != -1) { // L: 4108
								var0.movementSequence = var0.runSequence;
							} else if (var0.walkBackSequence == var0.movementSequence && var0.field1181 != -1) {
								var0.movementSequence = var0.field1181; // L: 4109
							} else if (var0.walkLeftSequence == var0.movementSequence && var0.field1151 != -1) { // L: 4110
								var0.movementSequence = var0.field1151;
							} else if (var0.movementSequence == var0.walkRightSequence && var0.field1152 != -1) { // L: 4111
								var0.movementSequence = var0.field1152;
							}
						} else if (var9 <= 1) { // L: 4113
							if (var0.movementSequence == var0.walkSequence && var0.field1153 != -1) { // L: 4114
								var0.movementSequence = var0.field1153;
							} else if (var0.movementSequence == var0.walkBackSequence && var0.field1209 != -1) { // L: 4115
								var0.movementSequence = var0.field1209;
							} else if (var0.movementSequence == var0.walkLeftSequence && var0.field1184 != -1) { // L: 4116
								var0.movementSequence = var0.field1184;
							} else if (var0.movementSequence == var0.walkRightSequence && var0.field1156 != -1) { // L: 4117
								var0.movementSequence = var0.field1156;
							}
						}

						if (var4 != var11 || var3 != var5) { // L: 4119
							if (var11 < var4) { // L: 4120
								var0.x += var9; // L: 4121
								if (var0.x > var4) { // L: 4122
									var0.x = var4;
								}
							} else if (var11 > var4) { // L: 4124
								var0.x -= var9; // L: 4125
								if (var0.x < var4) { // L: 4126
									var0.x = var4;
								}
							}

							if (var3 < var5) { // L: 4128
								var0.y += var9; // L: 4129
								if (var0.y > var5) { // L: 4130
									var0.y = var5;
								}
							} else if (var3 > var5) { // L: 4132
								var0.y -= var9; // L: 4133
								if (var0.y < var5) { // L: 4134
									var0.y = var5;
								}
							}
						}

						if (var4 == var0.x && var5 == var0.y) { // L: 4137
							--var0.pathLength; // L: 4138
							if (var0.field1211 > 0) { // L: 4139
								--var0.field1211;
							}
						}
					} else {
						var0.x = var4; // L: 4071
						var0.y = var5; // L: 4072
						--var0.pathLength; // L: 4073
						if (var0.field1211 > 0) { // L: 4074
							--var0.field1211;
						}
					}
				}
			}
		}

		if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) { // L: 4142
			var0.sequence = -1; // L: 4143
			var0.spotAnimation = -1; // L: 4144
			var0.field1192 = 0; // L: 4145
			var0.field1193 = 0; // L: 4146
			var0.x = var0.pathX[0] * 128 + var0.field1201 * 64; // L: 4147
			var0.y = var0.pathY[0] * 128 + var0.field1201 * 64; // L: 4148
			var0.method2316(); // L: 4149
		}

		if (class296.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) { // L: 4151 4152
			var0.sequence = -1; // L: 4153
			var0.spotAnimation = -1; // L: 4154
			var0.field1192 = 0; // L: 4155
			var0.field1193 = 0; // L: 4156
			var0.x = var0.pathX[0] * 128 + var0.field1201 * 64; // L: 4157
			var0.y = var0.pathY[0] * 128 + var0.field1201 * 64; // L: 4158
			var0.method2316(); // L: 4159
		}

		if (var0.field1205 != 0) { // L: 4163
			if (var0.targetIndex != -1) { // L: 4164
				Object var13 = null; // L: 4165
				var3 = Script.field972 ? 65536 : 32768; // L: 4166
				if (var0.targetIndex < var3) { // L: 4167
					var13 = Client.npcs[var0.targetIndex];
				} else if (var0.targetIndex >= var3) { // L: 4168
					var13 = Client.players[var0.targetIndex - var3];
				}

				if (var13 != null) { // L: 4169
					var4 = var0.x - ((Actor)var13).x; // L: 4170
					var5 = var0.y - ((Actor)var13).y; // L: 4171
					if (var4 != 0 || var5 != 0) { // L: 4172
						var0.orientation = (int)(Math.atan2((double)var4, (double)var5) * 325.949D) & 2047;
					}
				} else if (var0.false0) { // L: 4174
					var0.targetIndex = -1; // L: 4175
					var0.false0 = false; // L: 4176
				}
			}

			if (var0.field1203 != -1 && (var0.pathLength == 0 || var0.field1172 > 0)) { // L: 4179
				var0.orientation = var0.field1203; // L: 4180
				var0.field1203 = -1; // L: 4181
			}

			var11 = var0.orientation - var0.rotation & 2047; // L: 4183
			if (var11 == 0 && var0.false0) { // L: 4184
				var0.targetIndex = -1; // L: 4185
				var0.false0 = false; // L: 4186
			}

			if (var11 != 0) { // L: 4188
				++var0.field1204; // L: 4189
				boolean var14;
				if (var11 > 1024) { // L: 4190
					var0.rotation -= var0.field1173 ? var11 : var0.field1205; // L: 4191
					var14 = true; // L: 4192
					if (var11 < var0.field1205 || var11 > 2048 - var0.field1205) { // L: 4193
						var0.rotation = var0.orientation; // L: 4194
						var14 = false; // L: 4195
					}

					if (!var0.field1173 && var0.movementSequence == var0.idleSequence && (var0.field1204 > 25 || var14)) { // L: 4197
						if (var0.turnLeftSequence != -1) { // L: 4198
							var0.movementSequence = var0.turnLeftSequence;
						} else {
							var0.movementSequence = var0.walkSequence; // L: 4199
						}
					}
				} else {
					var0.rotation += var0.field1173 ? var11 : var0.field1205; // L: 4203
					var14 = true; // L: 4204
					if (var11 < var0.field1205 || var11 > 2048 - var0.field1205) { // L: 4205
						var0.rotation = var0.orientation; // L: 4206
						var14 = false; // L: 4207
					}

					if (!var0.field1173 && var0.movementSequence == var0.idleSequence && (var0.field1204 > 25 || var14)) { // L: 4209
						if (var0.turnRightSequence != -1) { // L: 4210
							var0.movementSequence = var0.turnRightSequence;
						} else {
							var0.movementSequence = var0.walkSequence; // L: 4211
						}
					}
				}

				var0.rotation &= 2047; // L: 4215
				var0.field1173 = false; // L: 4216
			} else {
				var0.field1204 = 0; // L: 4218
			}
		}

		GrandExchangeOfferOwnWorldComparator.method1177(var0); // L: 4220
	} // L: 4221

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(ZLqk;I)V",
		garbageValue = "-2107663742"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0; // L: 5606
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		if (!Client.isInInstance) { // L: 5607
			int var2 = var1.method8484(); // L: 5608
			var3 = var1.method8444(); // L: 5609
			var4 = var1.readUnsignedShort(); // L: 5610
			class26.xteaKeys = new int[var4][4]; // L: 5611

			for (var5 = 0; var5 < var4; ++var5) { // L: 5612
				for (var6 = 0; var6 < 4; ++var6) { // L: 5613
					class26.xteaKeys[var5][var6] = var1.readInt(); // L: 5614
				}
			}

			RouteStrategy.regions = new int[var4]; // L: 5617
			class143.regionMapArchiveIds = new int[var4]; // L: 5618
			class13.regionLandArchiveIds = new int[var4]; // L: 5619
			GrandExchangeOfferOwnWorldComparator.regionLandArchives = new byte[var4][]; // L: 5620
			class9.regionMapArchives = new byte[var4][]; // L: 5621
			var4 = 0; // L: 5622

			for (var5 = (var2 - 6) / 8; var5 <= (var2 + 6) / 8; ++var5) { // L: 5623
				for (var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) { // L: 5624
					var7 = var6 + (var5 << 8); // L: 5625
					RouteStrategy.regions[var4] = var7; // L: 5626
					class143.regionMapArchiveIds[var4] = SecureRandomFuture.archive9.getGroupId("m" + var5 + "_" + var6); // L: 5627
					class13.regionLandArchiveIds[var4] = SecureRandomFuture.archive9.getGroupId("l" + var5 + "_" + var6); // L: 5628
					++var4; // L: 5629
				}
			}

			CollisionMap.method4019(var2, var3, true); // L: 5632
		} else {
			boolean var15 = var1.method8436() == 1; // L: 5635
			var3 = var1.readUnsignedShort(); // L: 5636
			var4 = var1.method8444(); // L: 5637
			var5 = var1.readUnsignedShort(); // L: 5638
			var1.importIndex(); // L: 5639

			int var8;
			int var9;
			for (var6 = 0; var6 < 4; ++var6) { // L: 5640
				for (var7 = 0; var7 < 13; ++var7) { // L: 5641
					for (var8 = 0; var8 < 13; ++var8) { // L: 5642
						var9 = var1.readBits(1); // L: 5643
						if (var9 == 1) {
							Client.instanceChunkTemplates[var6][var7][var8] = var1.readBits(26); // L: 5644
						} else {
							Client.instanceChunkTemplates[var6][var7][var8] = -1; // L: 5645
						}
					}
				}
			}

			var1.exportIndex(); // L: 5649
			class26.xteaKeys = new int[var5][4]; // L: 5650

			for (var6 = 0; var6 < var5; ++var6) { // L: 5651
				for (var7 = 0; var7 < 4; ++var7) { // L: 5652
					class26.xteaKeys[var6][var7] = var1.readInt(); // L: 5653
				}
			}

			RouteStrategy.regions = new int[var5]; // L: 5656
			class143.regionMapArchiveIds = new int[var5]; // L: 5657
			class13.regionLandArchiveIds = new int[var5]; // L: 5658
			GrandExchangeOfferOwnWorldComparator.regionLandArchives = new byte[var5][]; // L: 5659
			class9.regionMapArchives = new byte[var5][]; // L: 5660
			var5 = 0; // L: 5661

			for (var6 = 0; var6 < 4; ++var6) { // L: 5662
				for (var7 = 0; var7 < 13; ++var7) { // L: 5663
					for (var8 = 0; var8 < 13; ++var8) { // L: 5664
						var9 = Client.instanceChunkTemplates[var6][var7][var8]; // L: 5665
						if (var9 != -1) { // L: 5666
							int var10 = var9 >> 14 & 1023; // L: 5667
							int var11 = var9 >> 3 & 2047; // L: 5668
							int var12 = (var10 / 8 << 8) + var11 / 8; // L: 5669

							int var13;
							for (var13 = 0; var13 < var5; ++var13) { // L: 5670
								if (RouteStrategy.regions[var13] == var12) {
									var12 = -1; // L: 5671
									break; // L: 5672
								}
							}

							if (var12 != -1) { // L: 5674
								RouteStrategy.regions[var5] = var12; // L: 5675
								var13 = var12 >> 8 & 255; // L: 5676
								int var14 = var12 & 255; // L: 5677
								class143.regionMapArchiveIds[var5] = SecureRandomFuture.archive9.getGroupId("m" + var13 + "_" + var14); // L: 5678
								class13.regionLandArchiveIds[var5] = SecureRandomFuture.archive9.getGroupId("l" + var13 + "_" + var14); // L: 5679
								++var5; // L: 5680
							}
						}
					}
				}
			}

			CollisionMap.method4019(var3, var4, !var15); // L: 5686
		}

	} // L: 5688

	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "(Lkn;I)Z",
		garbageValue = "-1613148148"
	)
	@Export("isComponentHidden")
	static boolean isComponentHidden(Widget var0) {
		return var0.isHidden; // L: 12609
	}
}
