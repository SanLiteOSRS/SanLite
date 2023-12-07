import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iz")
public enum class228 implements class383 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	field2412((byte)-1),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	field2408((byte)0),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	field2409((byte)1),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	field2410((byte)2);

	@ObfuscatedName("cw")
	static String field2415;
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "[Lup;"
	)
	@Export("worldSelectStars")
	static IndexedSprite[] worldSelectStars;
	@ObfuscatedName("ab")
	public byte field2414;

	class228(byte var3) {
		this.field2414 = var3; // L: 14
	} // L: 15

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-11"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field2414; // L: 19
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I[III)V",
		garbageValue = "-1953021335"
	)
	static void method4438(int var0, int[] var1, int var2) {
		for (int var3 = 0; var3 < class348.field3825; ++var3) { // L: 80
			KitDefinition var4 = class1.KitDefinition_get(var3); // L: 81
			if (var4 != null && !var4.nonSelectable && var4.bodypartID == (var0 == 1 ? 7 : 0) + var2) { // L: 82
				var1[PlayerComposition.equipmentIndices[var2]] = var3 + 256; // L: 83
				break;
			}
		}

	} // L: 87

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(Ldf;II)V",
		garbageValue = "-1026770295"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(Actor var0, int var1) {
		SequenceDefinition var3;
		int var4;
		int var6;
		int var9;
		if (var0.spotAnimation >= Client.cycle) { // L: 4110
			int var2 = Math.max(1, var0.spotAnimation - Client.cycle); // L: 4111
			var9 = var0.field1209 * 128 + var0.field1198 * 64; // L: 4112
			var4 = var0.field1194 * 128 + var0.field1198 * 64; // L: 4113
			var0.x += (var9 - var0.x) / var2; // L: 4114
			var0.y += (var4 - var0.y) / var2; // L: 4115
			var0.field1245 = 0; // L: 4116
			var0.orientation = var0.field1229; // L: 4117
		} else if (var0.field1187 >= Client.cycle) { // L: 4119
			boolean var12 = var0.field1187 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0; // L: 4120
			if (!var12) { // L: 4121
				var3 = DynamicObject.SequenceDefinition_get(var0.sequence); // L: 4122
				if (var3 != null && !var3.isCachedModelIdSet()) { // L: 4123
					var12 = var0.sequenceFrameCycle + 1 > var3.frameLengths[var0.sequenceFrame]; // L: 4127
				} else {
					var12 = true; // L: 4124
				}
			}

			if (var12) { // L: 4130
				var9 = var0.field1187 - var0.spotAnimation; // L: 4131
				var4 = Client.cycle - var0.spotAnimation; // L: 4132
				int var5 = var0.field1209 * 128 + var0.field1198 * 64; // L: 4133
				var6 = var0.field1194 * 128 + var0.field1198 * 64; // L: 4134
				int var7 = var0.field1224 * 128 + var0.field1198 * 64; // L: 4135
				int var8 = var0.field1203 * 128 + var0.field1198 * 64; // L: 4136
				var0.x = (var4 * var7 + var5 * (var9 - var4)) / var9; // L: 4137
				var0.y = (var8 * var4 + var6 * (var9 - var4)) / var9; // L: 4138
			}

			var0.field1245 = 0; // L: 4140
			var0.orientation = var0.field1229; // L: 4141
			var0.rotation = var0.orientation; // L: 4142
		} else {
			DevicePcmPlayerProvider.method322(var0); // L: 4144
		}

		if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) { // L: 4145
			var0.sequence = -1; // L: 4146
			var0.spotAnimation = 0; // L: 4147
			var0.field1187 = 0; // L: 4148
			var0.method2491(); // L: 4149
			var0.x = var0.pathX[0] * 128 + var0.field1198 * 64; // L: 4150
			var0.y = var0.pathY[0] * 128 + var0.field1198 * 64; // L: 4151
			var0.method2461(); // L: 4152
		}

		if (class229.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) { // L: 4154 4155
			var0.sequence = -1; // L: 4156
			var0.spotAnimation = 0; // L: 4157
			var0.field1187 = 0; // L: 4158
			var0.method2491(); // L: 4159
			var0.x = var0.pathX[0] * 128 + var0.field1198 * 64; // L: 4160
			var0.y = var0.pathY[0] * 128 + var0.field1198 * 64; // L: 4161
			var0.method2461(); // L: 4162
		}

		WorldMap.method8922(var0); // L: 4165
		var0.isWalking = false; // L: 4167
		if (var0.movementSequence != -1) { // L: 4168
			SequenceDefinition var10 = DynamicObject.SequenceDefinition_get(var0.movementSequence); // L: 4169
			if (var10 != null) { // L: 4170
				if (!var10.isCachedModelIdSet() && var10.frameIds != null) { // L: 4171
					++var0.field1214; // L: 4172
					if (var0.movementFrame < var10.frameIds.length && var0.field1214 > var10.frameLengths[var0.movementFrame]) { // L: 4173
						var0.field1214 = 1; // L: 4174
						++var0.movementFrame; // L: 4175
						DynamicObject.method2244(var10, var0.movementFrame, var0.x, var0.y, var0); // L: 4176
					}

					if (var0.movementFrame >= var10.frameIds.length) { // L: 4178
						if (var10.frameCount > 0) { // L: 4179
							var0.movementFrame -= var10.frameCount; // L: 4180
							if (var10.field2210) { // L: 4181
								++var0.field1248;
							}

							if (var0.movementFrame < 0 || var0.movementFrame >= var10.frameIds.length || var10.field2210 && var0.field1248 >= var10.field2211) { // L: 4182
								var0.field1214 = 0; // L: 4183
								var0.movementFrame = 0; // L: 4184
								var0.field1248 = 0; // L: 4185
							}
						} else {
							var0.field1214 = 0; // L: 4189
							var0.movementFrame = 0; // L: 4190
						}

						DynamicObject.method2244(var10, var0.movementFrame, var0.x, var0.y, var0); // L: 4192
					}
				} else if (var10.isCachedModelIdSet()) { // L: 4195
					++var0.movementFrame; // L: 4196
					var9 = var10.method4064(); // L: 4197
					if (var0.movementFrame < var9) { // L: 4198
						FriendLoginUpdate.method8127(var10, var0.movementFrame, var0.x, var0.y, var0); // L: 4199
					} else {
						if (var10.frameCount > 0) { // L: 4202
							var0.movementFrame -= var10.frameCount; // L: 4203
							if (var10.field2210) { // L: 4204
								++var0.field1248;
							}

							if (var0.movementFrame < 0 || var0.movementFrame >= var9 || var10.field2210 && var0.field1248 >= var10.field2211) { // L: 4205
								var0.movementFrame = 0; // L: 4206
								var0.field1214 = 0; // L: 4207
								var0.field1248 = 0; // L: 4208
							}
						} else {
							var0.field1214 = 0; // L: 4212
							var0.movementFrame = 0; // L: 4213
						}

						FriendLoginUpdate.method8127(var10, var0.movementFrame, var0.x, var0.y, var0); // L: 4215
					}
				} else {
					var0.movementSequence = -1; // L: 4218
				}
			} else {
				var0.movementSequence = -1; // L: 4220
			}
		}

		IterableNodeHashTableIterator var14 = new IterableNodeHashTableIterator(var0.method2467()); // L: 4222

		for (class548 var13 = (class548)var14.method8937(); var13 != null; var13 = (class548)var14.next()) { // L: 4223
			if (var13.field5287 != -1 && Client.cycle >= var13.field5285) { // L: 4224
				var4 = Canvas.SpotAnimationDefinition_get(var13.field5287).sequence; // L: 4227
				if (var4 == -1) { // L: 4228
					var13.remove(); // L: 4229
					--var0.field1216; // L: 4230
				} else {
					var13.field5289 = Math.max(var13.field5289, 0); // L: 4233
					SequenceDefinition var11 = DynamicObject.SequenceDefinition_get(var4); // L: 4234
					if (var11.frameIds != null && !var11.isCachedModelIdSet()) { // L: 4235
						++var13.field5286; // L: 4236
						if (var13.field5289 < var11.frameIds.length && var13.field5286 > var11.frameLengths[var13.field5289]) { // L: 4237
							var13.field5286 = 1; // L: 4238
							++var13.field5289; // L: 4239
							DynamicObject.method2244(var11, var13.field5289, var0.x, var0.y, var0); // L: 4240
						}

						if (var13.field5289 >= var11.frameIds.length) { // L: 4242
							var13.remove(); // L: 4243
							--var0.field1216; // L: 4244
						}
					} else if (var11.isCachedModelIdSet()) { // L: 4247
						++var13.field5289; // L: 4248
						var6 = var11.method4064(); // L: 4249
						if (var13.field5289 < var6) { // L: 4250
							FriendLoginUpdate.method8127(var11, var13.field5289, var0.x, var0.y, var0); // L: 4251
						} else {
							var13.remove(); // L: 4254
							--var0.field1216; // L: 4255
						}
					} else {
						var13.remove(); // L: 4259
						--var0.field1216; // L: 4260
					}
				}
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay <= 1) { // L: 4263
			var3 = DynamicObject.SequenceDefinition_get(var0.sequence); // L: 4264
			if (var3.field2218 == 1 && var0.field1220 > 0 && var0.spotAnimation <= Client.cycle && var0.field1187 < Client.cycle) { // L: 4265 4266
				var0.sequenceDelay = 1; // L: 4267
				return; // L: 4323
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 4272
			var3 = DynamicObject.SequenceDefinition_get(var0.sequence); // L: 4273
			if (var3 == null) { // L: 4274
				var0.sequence = -1; // L: 4319
			} else if (!var3.isCachedModelIdSet() && var3.frameIds != null) { // L: 4275
				++var0.sequenceFrameCycle; // L: 4276
				if (var0.sequenceFrame < var3.frameIds.length && var0.sequenceFrameCycle > var3.frameLengths[var0.sequenceFrame]) { // L: 4277
					var0.sequenceFrameCycle = 1; // L: 4278
					++var0.sequenceFrame; // L: 4279
					DynamicObject.method2244(var3, var0.sequenceFrame, var0.x, var0.y, var0); // L: 4280
				}

				if (var0.sequenceFrame >= var3.frameIds.length) { // L: 4282
					var0.sequenceFrame -= var3.frameCount; // L: 4283
					++var0.field1199; // L: 4284
					if (var0.field1199 >= var3.field2211) { // L: 4285
						var0.sequence = -1; // L: 4286
					} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var3.frameIds.length) { // L: 4288
						DynamicObject.method2244(var3, var0.sequenceFrame, var0.x, var0.y, var0); // L: 4292
					} else {
						var0.sequence = -1; // L: 4289
					}
				}

				var0.isWalking = var3.field2224; // L: 4295
			} else if (var3.isCachedModelIdSet()) { // L: 4297
				++var0.sequenceFrame; // L: 4298
				var4 = var3.method4064(); // L: 4299
				if (var0.sequenceFrame < var4) { // L: 4300
					FriendLoginUpdate.method8127(var3, var0.sequenceFrame, var0.x, var0.y, var0); // L: 4301
				} else {
					var0.sequenceFrame -= var3.frameCount; // L: 4304
					++var0.field1199; // L: 4305
					if (var0.field1199 >= var3.field2211) { // L: 4306
						var0.sequence = -1; // L: 4307
					} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var4) { // L: 4309
						FriendLoginUpdate.method8127(var3, var0.sequenceFrame, var0.x, var0.y, var0); // L: 4313
					} else {
						var0.sequence = -1; // L: 4310
					}
				}
			} else {
				var0.sequence = -1; // L: 4317
			}
		}

		if (var0.sequenceDelay > 0) { // L: 4321
			--var0.sequenceDelay;
		}

	}
}
