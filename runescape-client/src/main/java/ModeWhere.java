import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pm")
@Implements("ModeWhere")
public enum ModeWhere implements class391 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	field4531("", 0, new class390[]{class390.field4505, class390.field4504}),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	field4521("", 1, new class390[]{class390.field4506, class390.field4505, class390.field4504}),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	field4523("", 2, new class390[]{class390.field4506, class390.field4503, class390.field4505}),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	field4522("", 3, new class390[]{class390.field4506}),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	field4524("", 4),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	field4525("", 5, new class390[]{class390.field4506, class390.field4505}),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	field4530("", 6, new class390[]{class390.field4505}),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	field4527("", 8, new class390[]{class390.field4506, class390.field4505}),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	field4533("", 9, new class390[]{class390.field4506, class390.field4503}),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	field4529("", 10, new class390[]{class390.field4506}),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	field4534("", 11, new class390[]{class390.field4506}),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	field4520("", 12, new class390[]{class390.field4506, class390.field4505}),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	field4532("", 13, new class390[]{class390.field4506});

	@ObfuscatedName("ws")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	@Export("worldMap")
	static WorldMap worldMap;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1960789161
	)
	@Export("id")
	final int id;
	@ObfuscatedName("ar")
	final Set field4528;

	static {
		method7203(); // L: 26
	} // L: 27

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Lpj;)V"
	)
	ModeWhere(String var3, int var4, class390[] var5) {
		this.field4528 = new HashSet();
		this.id = var4; // L: 41
		class390[] var6 = var5; // L: 43

		for (int var7 = 0; var7 < var6.length; ++var7) { // L: 44
			class390 var8 = var6[var7]; // L: 45
			this.field4528.add(var8); // L: 46
		}

	} // L: 49

	ModeWhere(String var3, int var4) {
		this.field4528 = new HashSet(); // L: 30
		this.id = var4; // L: 37
	} // L: 38

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "800883718"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 53
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Loc;B)V",
		garbageValue = "29"
	)
	public static void method7206(AbstractArchive var0) {
		class525.field5163 = var0; // L: 19
	} // L: 20

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[Lpm;",
		garbageValue = "1915834439"
	)
	static ModeWhere[] method7203() {
		return new ModeWhere[]{field4522, field4525, field4521, field4527, field4533, field4529, field4520, field4523, field4524, field4532, field4534, field4530, field4531}; // L: 33
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I[B[BB)V",
		garbageValue = "-2"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field3836 == null) { // L: 1248
			if (var2 == null) { // L: 1249
				return; // L: 1255
			}

			var0.field3836 = new byte[11][]; // L: 1250
			var0.field3820 = new byte[11][]; // L: 1251
			var0.field3821 = new int[11]; // L: 1252
			var0.field3738 = new int[11]; // L: 1253
		}

		var0.field3836[var1] = var2; // L: 1257
		if (var2 != null) {
			var0.field3818 = true; // L: 1258
		} else {
			var0.field3818 = false; // L: 1260

			for (int var4 = 0; var4 < var0.field3836.length; ++var4) { // L: 1261
				if (var0.field3836[var4] != null) { // L: 1262
					var0.field3818 = true; // L: 1263
					break;
				}
			}
		}

		var0.field3820[var1] = var3; // L: 1268
	} // L: 1269

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(Lde;II)V",
		garbageValue = "-1486010157"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(Actor var0, int var1) {
		SequenceDefinition var2;
		int var3;
		int var4;
		int var5;
		int var7;
		int var13;
		int var18;
		if (var0.spotAnimation >= Client.cycle) { // L: 4152
			Players.method2716(var0);
		} else {
			int var8;
			if (var0.field1256 >= Client.cycle) { // L: 4153
				boolean var11 = var0.field1256 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0; // L: 4154
				if (!var11) { // L: 4155
					SequenceDefinition var12 = DevicePcmPlayerProvider.SequenceDefinition_get(var0.sequence); // L: 4156
					if (var12 != null && !var12.isCachedModelIdSet()) { // L: 4157
						var11 = var0.sequenceFrameCycle + 1 > var12.frameLengths[var0.sequenceFrame]; // L: 4161
					} else {
						var11 = true; // L: 4158
					}
				}

				if (var11) { // L: 4164
					var3 = var0.field1256 - var0.spotAnimation; // L: 4165
					var4 = Client.cycle - var0.spotAnimation; // L: 4166
					var5 = var0.field1251 * 128 + var0.field1249 * 64; // L: 4167
					var13 = var0.field1238 * 128 + var0.field1249 * 64; // L: 4168
					var7 = var0.field1258 * 128 + var0.field1249 * 64; // L: 4169
					var8 = var0.field1253 * 128 + var0.field1249 * 64; // L: 4170
					var0.x = (var7 * var4 + var5 * (var3 - var4)) / var3; // L: 4171
					var0.y = (var8 * var4 + var13 * (var3 - var4)) / var3; // L: 4172
				}

				var0.field1257 = 0; // L: 4174
				var0.orientation = var0.field1203; // L: 4175
				var0.rotation = var0.orientation; // L: 4176
			} else {
				var0.movementSequence = var0.idleSequence; // L: 4179
				if (var0.pathLength == 0) { // L: 4180
					var0.field1257 = 0; // L: 4181
				} else {
					label496: {
						if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 4184
							var2 = DevicePcmPlayerProvider.SequenceDefinition_get(var0.sequence); // L: 4185
							if (var0.field1274 > 0 && var2.field2398 == 0) { // L: 4186
								++var0.field1257; // L: 4187
								break label496; // L: 4188
							}

							if (var0.field1274 <= 0 && var2.field2399 == 0) { // L: 4190
								++var0.field1257; // L: 4191
								break label496; // L: 4192
							}
						}

						var18 = var0.x; // L: 4195
						var3 = var0.y; // L: 4196
						var4 = var0.pathX[var0.pathLength - 1] * 128 + var0.field1249 * 64; // L: 4197
						var5 = var0.pathY[var0.pathLength - 1] * 128 + var0.field1249 * 64; // L: 4198
						if (var18 < var4) { // L: 4199
							if (var3 < var5) { // L: 4200
								var0.orientation = 1280;
							} else if (var3 > var5) { // L: 4201
								var0.orientation = 1792;
							} else {
								var0.orientation = 1536; // L: 4202
							}
						} else if (var18 > var4) { // L: 4204
							if (var3 < var5) { // L: 4205
								var0.orientation = 768;
							} else if (var3 > var5) { // L: 4206
								var0.orientation = 256;
							} else {
								var0.orientation = 512; // L: 4207
							}
						} else if (var3 < var5) { // L: 4209
							var0.orientation = 1024;
						} else if (var3 > var5) { // L: 4210
							var0.orientation = 0;
						}

						class233 var6 = var0.pathTraversed[var0.pathLength - 1]; // L: 4211
						if (var4 - var18 <= 256 && var4 - var18 >= -256 && var5 - var3 <= 256 && var5 - var3 >= -256) { // L: 4212
							var7 = var0.orientation - var0.rotation & 2047; // L: 4219
							if (var7 > 1024) { // L: 4220
								var7 -= 2048;
							}

							var8 = var0.walkBackSequence; // L: 4221
							if (var7 >= -256 && var7 <= 256) { // L: 4222
								var8 = var0.walkSequence;
							} else if (var7 >= 256 && var7 < 768) { // L: 4223
								var8 = var0.walkRightSequence;
							} else if (var7 >= -768 && var7 <= -256) { // L: 4224
								var8 = var0.walkLeftSequence;
							}

							if (var8 == -1) { // L: 4225
								var8 = var0.walkSequence;
							}

							var0.movementSequence = var8; // L: 4226
							int var9 = 4; // L: 4227
							boolean var10 = true; // L: 4228
							if (var0 instanceof NPC) { // L: 4229
								var10 = ((NPC)var0).definition.isClickable;
							}

							if (var10) { // L: 4230
								if (var0.orientation != var0.rotation && var0.targetIndex == -1 && var0.field1268 != 0) { // L: 4231
									var9 = 2;
								}

								if (var0.pathLength > 2) { // L: 4232
									var9 = 6;
								}

								if (var0.pathLength > 3) { // L: 4233
									var9 = 8;
								}

								if (var0.field1257 > 0 && var0.pathLength > 1) { // L: 4234
									var9 = 8; // L: 4235
									--var0.field1257; // L: 4236
								}
							} else {
								if (var0.pathLength > 1) { // L: 4240
									var9 = 6;
								}

								if (var0.pathLength > 2) { // L: 4241
									var9 = 8;
								}

								if (var0.field1257 > 0 && var0.pathLength > 1) { // L: 4242
									var9 = 8; // L: 4243
									--var0.field1257; // L: 4244
								}
							}

							if (var6 == class233.field2485) { // L: 4247
								var9 <<= 1;
							} else if (var6 == class233.field2483) { // L: 4248
								var9 >>= 1;
							}

							if (var9 >= 8) { // L: 4249
								if (var0.movementSequence == var0.walkSequence && var0.runSequence != -1) { // L: 4250
									var0.movementSequence = var0.runSequence;
								} else if (var0.walkBackSequence == var0.movementSequence && var0.field1213 != -1) {
									var0.movementSequence = var0.field1213; // L: 4251
								} else if (var0.movementSequence == var0.walkLeftSequence && var0.field1214 != -1) { // L: 4252
									var0.movementSequence = var0.field1214;
								} else if (var0.walkRightSequence == var0.movementSequence && var0.field1215 != -1) { // L: 4253
									var0.movementSequence = var0.field1215;
								}
							} else if (var9 <= 2) { // L: 4255
								if (var0.movementSequence == var0.walkSequence && var0.field1264 != -1) { // L: 4256
									var0.movementSequence = var0.field1264;
								} else if (var0.movementSequence == var0.walkBackSequence && var0.field1269 != -1) { // L: 4257
									var0.movementSequence = var0.field1269;
								} else if (var0.movementSequence == var0.walkLeftSequence && var0.field1218 != -1) { // L: 4258
									var0.movementSequence = var0.field1218;
								} else if (var0.walkRightSequence == var0.movementSequence && var0.field1226 != -1) { // L: 4259
									var0.movementSequence = var0.field1226;
								}
							}

							if (var4 != var18 || var5 != var3) { // L: 4261
								if (var18 < var4) { // L: 4262
									var0.x += var9; // L: 4263
									if (var0.x > var4) { // L: 4264
										var0.x = var4;
									}
								} else if (var18 > var4) { // L: 4266
									var0.x -= var9; // L: 4267
									if (var0.x < var4) { // L: 4268
										var0.x = var4;
									}
								}

								if (var3 < var5) { // L: 4270
									var0.y += var9; // L: 4271
									if (var0.y > var5) { // L: 4272
										var0.y = var5;
									}
								} else if (var3 > var5) { // L: 4274
									var0.y -= var9; // L: 4275
									if (var0.y < var5) { // L: 4276
										var0.y = var5;
									}
								}
							}

							if (var4 == var0.x && var5 == var0.y) { // L: 4279
								--var0.pathLength; // L: 4280
								if (var0.field1274 > 0) { // L: 4281
									--var0.field1274;
								}
							}
						} else {
							var0.x = var4; // L: 4213
							var0.y = var5; // L: 4214
							--var0.pathLength; // L: 4215
							if (var0.field1274 > 0) { // L: 4216
								--var0.field1274;
							}
						}
					}
				}
			}
		}

		if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) { // L: 4284
			var0.sequence = -1; // L: 4285
			var0.spotAnimation = 0; // L: 4286
			var0.field1256 = 0; // L: 4287
			var0.method2400(); // L: 4288
			var0.x = var0.pathX[0] * 128 + var0.field1249 * 64; // L: 4289
			var0.y = var0.pathY[0] * 128 + var0.field1249 * 64; // L: 4290
			var0.method2393(); // L: 4291
		}

		if (class133.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) { // L: 4293 4294
			var0.sequence = -1; // L: 4295
			var0.spotAnimation = 0; // L: 4296
			var0.field1256 = 0; // L: 4297
			var0.method2400(); // L: 4298
			var0.x = var0.pathX[0] * 128 + var0.field1249 * 64; // L: 4299
			var0.y = var0.pathY[0] * 128 + var0.field1249 * 64; // L: 4300
			var0.method2393(); // L: 4301
		}

		if (var0.targetIndex != -1) { // L: 4305
			var2 = null; // L: 4306
			var3 = 65536; // L: 4307
			Object var15;
			if (var0.targetIndex < var3) { // L: 4308
				var15 = Client.npcs[var0.targetIndex]; // L: 4309
			} else {
				var15 = Client.players[var0.targetIndex - var3]; // L: 4312
			}

			if (var15 != null) { // L: 4314
				var4 = var0.x - ((Actor)var15).x; // L: 4315
				var5 = var0.y - ((Actor)var15).y; // L: 4316
				if (var4 != 0 || var5 != 0) { // L: 4317
					var7 = (int)(Math.atan2((double)var4, (double)var5) * 325.94932345220167D) & 2047; // L: 4321
					var0.orientation = var7; // L: 4323
				}
			} else if (var0.field1227) { // L: 4326
				var0.targetIndex = -1; // L: 4327
				var0.field1227 = false; // L: 4328
			}
		}

		if (var0.pathLength == 0 || var0.field1257 > 0) { // L: 4331
			var18 = -1; // L: 4332
			if (var0.field1237 != -1 && var0.field1216 != -1) { // L: 4333
				var3 = var0.field1237 * 128 - GrandExchangeOfferOwnWorldComparator.baseX * 8192 + 64; // L: 4334
				var4 = var0.field1216 * 128 - DevicePcmPlayerProvider.baseY * 8192 + 64; // L: 4335
				var5 = var0.x - var3; // L: 4336
				var13 = var0.y - var4; // L: 4337
				if (var5 != 0 || var13 != 0) { // L: 4338
					var7 = (int)(Math.atan2((double)var5, (double)var13) * 325.94932345220167D) & 2047; // L: 4341
					var18 = var7; // L: 4343
				}
			} else if (var0.field1272 != -1) { // L: 4346
				var18 = var0.field1272; // L: 4347
			}

			if (var18 != -1) { // L: 4349
				var0.orientation = var18; // L: 4350
				if (var0.field1239) { // L: 4351
					var0.rotation = var0.orientation; // L: 4352
				}
			}

			var0.method2419(); // L: 4355
		}

		var18 = var0.orientation - var0.rotation & 2047; // L: 4357
		if (var18 != 0) { // L: 4358
			boolean var16 = true; // L: 4359
			boolean var17 = true; // L: 4360
			++var0.field1267; // L: 4361
			var5 = var18 > 1024 ? -1 : 1; // L: 4362
			var0.rotation += var5 * var0.field1268; // L: 4363
			boolean var19 = true; // L: 4364
			if (var18 < var0.field1268 || var18 > 2048 - var0.field1268) { // L: 4365
				var0.rotation = var0.orientation; // L: 4366
				var19 = false; // L: 4367
			}

			if (var0.field1268 > 0 && var0.movementSequence == var0.idleSequence && (var0.field1267 > 25 || var19)) { // L: 4369
				if (var5 == -1 && var0.field1206 != -1) { // L: 4370
					var0.movementSequence = var0.field1206; // L: 4371
				} else if (var5 == 1 && var0.field1207 != -1) { // L: 4373
					var0.movementSequence = var0.field1207; // L: 4374
				} else {
					var0.movementSequence = var0.walkSequence; // L: 4377
				}
			}

			var0.rotation &= 2047; // L: 4381
		} else {
			if (var0.field1227) { // L: 4384
				var0.targetIndex = -1; // L: 4385
				var0.field1227 = false; // L: 4386
			}

			var0.field1267 = 0; // L: 4388
		}

		class484.method8581(var0); // L: 4391
	} // L: 4392
}
