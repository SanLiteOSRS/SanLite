import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gs")
@Implements("Clock")
public abstract class Clock {
	@ObfuscatedName("ug")
	@ObfuscatedGetter(
		intValue = 755563131
	)
	static int field1883;
	@ObfuscatedName("uy")
	@ObfuscatedGetter(
		intValue = -281119949
	)
	static int field1884;
	@ObfuscatedName("al")
	@Export("BZip2Decompressor_block")
	static int[] BZip2Decompressor_block;
	@ObfuscatedName("mh")
	@ObfuscatedGetter(
		intValue = -861734675
	)
	@Export("Client_plane")
	static int Client_plane;

	Clock() {
	} // L: 4

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1909200559"
	)
	@Export("mark")
	public abstract void mark();

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-4"
	)
	@Export("wait")
	public abstract int wait(int var1, int var2);

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ldz;S)V",
		garbageValue = "-20398"
	)
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		SoundSystem.runScript(var0, 500000, 475000); // L: 103
	} // L: 104

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lny;IB)V",
		garbageValue = "-118"
	)
	static void method3548(Archive var0, int var1) {
		if (var0.field4242) { // L: 110
			if (var1 <= NetCache.field4281) { // L: 111
				throw new RuntimeException(""); // L: 112
			}

			if (var1 < NetCache.field4267) { // L: 114
				NetCache.field4267 = var1; // L: 115
			}
		} else {
			if (var1 >= NetCache.field4267) { // L: 119
				throw new RuntimeException(""); // L: 120
			}

			if (var1 > NetCache.field4281) { // L: 122
				NetCache.field4281 = var1; // L: 123
			}
		}

		if (class411.field4561 != null) { // L: 126
			Fonts.method8576(var0, var1); // L: 127
		} else {
			class341.requestNetFile((Archive)null, 255, 255, 0, (byte)0, true); // L: 130
			NetCache.NetCache_archives[var1] = var0; // L: 131
		}
	} // L: 128 132

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(Ldi;B)V",
		garbageValue = "54"
	)
	static final void method3550(Actor var0) {
		var0.movementSequence = var0.idleSequence; // L: 4206
		if (var0.pathLength == 0) { // L: 4207
			var0.field1225 = 0; // L: 4208
		} else {
			if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 4211
				SequenceDefinition var1 = WorldMapLabelSize.SequenceDefinition_get(var0.sequence); // L: 4212
				if (var0.field1226 > 0 && var1.field2287 == 0) { // L: 4213
					++var0.field1225; // L: 4214
					return; // L: 4215
				}

				if (var0.field1226 <= 0 && var1.field2274 == 0) { // L: 4217
					++var0.field1225; // L: 4218
					return; // L: 4219
				}
			}

			int var10 = var0.x; // L: 4222
			int var2 = var0.y; // L: 4223
			int var3 = var0.field1155 * 1292107776 + var0.pathX[var0.pathLength - 1] * 128; // L: 4224
			int var4 = var0.field1155 * 1292107776 + var0.pathY[var0.pathLength - 1] * 128; // L: 4225
			if (var10 < var3) { // L: 4226
				if (var2 < var4) { // L: 4227
					var0.orientation = 1280;
				} else if (var2 > var4) { // L: 4228
					var0.orientation = 1792;
				} else {
					var0.orientation = 1536; // L: 4229
				}
			} else if (var10 > var3) { // L: 4231
				if (var2 < var4) { // L: 4232
					var0.orientation = 768;
				} else if (var2 > var4) { // L: 4233
					var0.orientation = 256;
				} else {
					var0.orientation = 512; // L: 4234
				}
			} else if (var2 < var4) { // L: 4236
				var0.orientation = 1024;
			} else if (var2 > var4) { // L: 4237
				var0.orientation = 0;
			}

			class216 var5 = var0.pathTraversed[var0.pathLength - 1]; // L: 4238
			if (var3 - var10 <= 256 && var3 - var10 >= -256 && var4 - var2 <= 256 && var4 - var2 >= -256) { // L: 4239
				int var6 = var0.orientation - var0.rotation & 2047; // L: 4246
				if (var6 > 1024) { // L: 4247
					var6 -= 2048;
				}

				int var7 = var0.walkBackSequence; // L: 4248
				if (var6 >= -256 && var6 <= 256) { // L: 4249
					var7 = var0.walkSequence;
				} else if (var6 >= 256 && var6 < 768) { // L: 4250
					var7 = var0.walkRightSequence;
				} else if (var6 >= -768 && var6 <= -256) { // L: 4251
					var7 = var0.walkLeftSequence;
				}

				if (var7 == -1) { // L: 4252
					var7 = var0.walkSequence;
				}

				var0.movementSequence = var7; // L: 4253
				int var8 = 4; // L: 4254
				boolean var9 = true; // L: 4255
				if (var0 instanceof NPC) { // L: 4256
					var9 = ((NPC)var0).definition.isClickable;
				}

				if (var9) { // L: 4257
					if (var0.rotation != var0.orientation && var0.targetIndex == -1 && var0.field1220 != 0) { // L: 4258
						var8 = 2;
					}

					if (var0.pathLength > 2) { // L: 4259
						var8 = 6;
					}

					if (var0.pathLength > 3) { // L: 4260
						var8 = 8;
					}

					if (var0.field1225 > 0 && var0.pathLength > 1) { // L: 4261
						var8 = 8; // L: 4262
						--var0.field1225; // L: 4263
					}
				} else {
					if (var0.pathLength > 1) { // L: 4267
						var8 = 6;
					}

					if (var0.pathLength > 2) { // L: 4268
						var8 = 8;
					}

					if (var0.field1225 > 0 && var0.pathLength > 1) { // L: 4269
						var8 = 8; // L: 4270
						--var0.field1225; // L: 4271
					}
				}

				if (var5 == class216.field2396) { // L: 4274
					var8 <<= 1;
				} else if (var5 == class216.field2394) { // L: 4275
					var8 >>= 1;
				}

				if (var8 >= 8) { // L: 4276
					if (var0.movementSequence == var0.walkSequence && var0.runSequence != -1) { // L: 4277
						var0.movementSequence = var0.runSequence;
					} else if (var0.movementSequence == var0.walkBackSequence && var0.field1191 != -1) { // L: 4278
						var0.movementSequence = var0.field1191;
					} else if (var0.movementSequence == var0.walkLeftSequence && var0.field1198 != -1) { // L: 4279
						var0.movementSequence = var0.field1198;
					} else if (var0.walkRightSequence == var0.movementSequence && var0.field1167 != -1) { // L: 4280
						var0.movementSequence = var0.field1167;
					}
				} else if (var8 <= 1) { // L: 4282
					if (var0.movementSequence == var0.walkSequence && var0.field1168 != -1) { // L: 4283
						var0.movementSequence = var0.field1168;
					} else if (var0.movementSequence == var0.walkBackSequence && var0.field1169 != -1) { // L: 4284
						var0.movementSequence = var0.field1169;
					} else if (var0.movementSequence == var0.walkLeftSequence && var0.field1183 != -1) { // L: 4285
						var0.movementSequence = var0.field1183;
					} else if (var0.movementSequence == var0.walkRightSequence && var0.field1171 != -1) { // L: 4286
						var0.movementSequence = var0.field1171;
					}
				}

				if (var3 != var10 || var2 != var4) { // L: 4288
					if (var10 < var3) { // L: 4289
						var0.x += var8; // L: 4290
						if (var0.x > var3) { // L: 4291
							var0.x = var3;
						}
					} else if (var10 > var3) { // L: 4293
						var0.x -= var8; // L: 4294
						if (var0.x < var3) { // L: 4295
							var0.x = var3;
						}
					}

					if (var2 < var4) { // L: 4297
						var0.y += var8; // L: 4298
						if (var0.y > var4) { // L: 4299
							var0.y = var4;
						}
					} else if (var2 > var4) { // L: 4301
						var0.y -= var8; // L: 4302
						if (var0.y < var4) { // L: 4303
							var0.y = var4;
						}
					}
				}

				if (var3 == var0.x && var4 == var0.y) { // L: 4306
					--var0.pathLength; // L: 4307
					if (var0.field1226 > 0) { // L: 4308
						--var0.field1226;
					}
				}

			} else {
				var0.x = var3; // L: 4240
				var0.y = var4; // L: 4241
				--var0.pathLength; // L: 4242
				if (var0.field1226 > 0) { // L: 4243
					--var0.field1226;
				}

			}
		}
	} // L: 4209 4244 4310
}
