import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("es")
@Implements("UserComparator5")
public class UserComparator5 extends AbstractUserComparator {
	@ObfuscatedName("jx")
	@Export("regionLandArchives")
	static byte[][] regionLandArchives;
	@ObfuscatedName("au")
	@Export("reversed")
	final boolean reversed;

	public UserComparator5(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lqb;Lqb;B)I",
		garbageValue = "-73"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0) { // L: 14
			if (var2.world == 0) { // L: 15
				return this.reversed ? -1 : 1;
			}
		} else if (var2.world != 0) {
			return this.reversed ? 1 : -1; // L: 18
		}

		return this.compareUser(var1, var2); // L: 20
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 24
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Ljava/lang/String;S)[F",
		garbageValue = "21147"
	)
	static float[] method2889(JSONObject var0, String var1) throws JSONException {
		float[] var2 = new float[4]; // L: 329

		try {
			JSONArray var3 = var0.getJSONArray(var1); // L: 331
			var2[0] = (float)var3.optDouble(0, 0.0D); // L: 332
			var2[1] = (float)var3.optDouble(1, 0.0D); // L: 333
			var2[2] = (float)var3.optDouble(2, 1.0D); // L: 334
			var2[3] = (float)var3.optDouble(3, 1.0D); // L: 335
		} catch (JSONException var4) { // L: 337
			var2[0] = 0.0F; // L: 338
			var2[1] = 0.0F; // L: 339
			var2[2] = 1.0F; // L: 340
			var2[3] = 1.0F; // L: 341
		}

		return var2; // L: 343
	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(Ldr;I)V",
		garbageValue = "-316834748"
	)
	static final void method2886(Actor var0) {
		var0.isWalking = false; // L: 4259
		if (var0.movementSequence != -1) { // L: 4260
			SequenceDefinition var1 = EnumComposition.SequenceDefinition_get(var0.movementSequence); // L: 4261
			if (var1 != null) { // L: 4262
				if (!var1.isCachedModelIdSet() && var1.frameIds != null) { // L: 4263
					++var0.field1240; // L: 4264
					if (var0.movementFrame < var1.frameIds.length && var0.field1240 > var1.frameLengths[var0.movementFrame]) { // L: 4265
						var0.field1240 = 1; // L: 4266
						++var0.movementFrame; // L: 4267
						FileSystem.method3490(var1, var0.movementFrame, var0.x, var0.y); // L: 4268
					}

					if (var0.movementFrame >= var1.frameIds.length) { // L: 4270
						if (var1.frameCount > 0) { // L: 4271
							var0.movementFrame -= var1.frameCount; // L: 4272
							if (var1.field2324) { // L: 4273
								++var0.field1241;
							}

							if (var0.movementFrame < 0 || var0.movementFrame >= var1.frameIds.length || var1.field2324 && var0.field1241 >= var1.field2304) { // L: 4274
								var0.field1240 = 0; // L: 4275
								var0.movementFrame = 0; // L: 4276
								var0.field1241 = 0; // L: 4277
							}
						} else {
							var0.field1240 = 0; // L: 4281
							var0.movementFrame = 0; // L: 4282
						}

						FileSystem.method3490(var1, var0.movementFrame, var0.x, var0.y); // L: 4284
					}
				} else if (var1.isCachedModelIdSet()) { // L: 4287
					++var0.movementFrame; // L: 4288
					int var2 = var1.method4034(); // L: 4289
					if (var0.movementFrame < var2) { // L: 4290
						class169.method3362(var1, var0.movementFrame, var0.x, var0.y); // L: 4291
					} else {
						if (var1.frameCount > 0) { // L: 4294
							var0.movementFrame -= var1.frameCount; // L: 4295
							if (var1.field2324) { // L: 4296
								++var0.field1241;
							}

							if (var0.movementFrame < 0 || var0.movementFrame >= var2 || var1.field2324 && var0.field1241 >= var1.field2304) { // L: 4297
								var0.movementFrame = 0; // L: 4298
								var0.field1240 = 0; // L: 4299
								var0.field1241 = 0; // L: 4300
							}
						} else {
							var0.field1240 = 0; // L: 4304
							var0.movementFrame = 0; // L: 4305
						}

						class169.method3362(var1, var0.movementFrame, var0.x, var0.y); // L: 4307
					}
				} else {
					var0.movementSequence = -1; // L: 4310
				}
			} else {
				var0.movementSequence = -1; // L: 4312
			}
		}

		IterableNodeHashTableIterator var7 = new IterableNodeHashTableIterator(var0.method2377()); // L: 4314

		int var3;
		for (class536 var6 = (class536)var7.method8713(); var6 != null; var6 = (class536)var7.next()) { // L: 4315
			if (var6.field5256 != -1 && Client.cycle >= var6.field5255) { // L: 4316
				var3 = StructComposition.SpotAnimationDefinition_get(var6.field5256).sequence; // L: 4319
				if (var3 == -1) { // L: 4320
					var6.remove(); // L: 4321
					--var0.field1248; // L: 4322
				} else {
					var6.field5253 = Math.max(var6.field5253, 0); // L: 4325
					SequenceDefinition var4 = EnumComposition.SequenceDefinition_get(var3); // L: 4326
					if (var4.frameIds != null && !var4.isCachedModelIdSet()) { // L: 4327
						++var6.field5252; // L: 4328
						if (var6.field5253 < var4.frameIds.length && var6.field5252 > var4.frameLengths[var6.field5253]) { // L: 4329
							var6.field5252 = 1; // L: 4330
							++var6.field5253; // L: 4331
							FileSystem.method3490(var4, var6.field5253, var0.x, var0.y); // L: 4332
						}

						if (var6.field5253 >= var4.frameIds.length) { // L: 4334
							var6.remove(); // L: 4335
							--var0.field1248; // L: 4336
						}
					} else if (var4.isCachedModelIdSet()) { // L: 4339
						++var6.field5253; // L: 4340
						int var5 = var4.method4034(); // L: 4341
						if (var6.field5253 < var5) { // L: 4342
							class169.method3362(var4, var6.field5253, var0.x, var0.y); // L: 4343
						} else {
							var6.remove(); // L: 4346
							--var0.field1248; // L: 4347
						}
					} else {
						var6.remove(); // L: 4351
						--var0.field1248; // L: 4352
					}
				}
			}
		}

		SequenceDefinition var8;
		if (var0.sequence != -1 && var0.sequenceDelay <= 1) { // L: 4355
			var8 = EnumComposition.SequenceDefinition_get(var0.sequence); // L: 4356
			if (var8.field2325 == 1 && var0.field1261 > 0 && var0.spotAnimation <= Client.cycle && var0.field1254 < Client.cycle) { // L: 4357 4358
				var0.sequenceDelay = 1; // L: 4359
				return; // L: 4360
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 4364
			var8 = EnumComposition.SequenceDefinition_get(var0.sequence); // L: 4365
			if (var8 != null) { // L: 4366
				if (!var8.isCachedModelIdSet() && var8.frameIds != null) { // L: 4367
					++var0.sequenceFrameCycle; // L: 4368
					if (var0.sequenceFrame < var8.frameIds.length && var0.sequenceFrameCycle > var8.frameLengths[var0.sequenceFrame]) { // L: 4369
						var0.sequenceFrameCycle = 1; // L: 4370
						++var0.sequenceFrame; // L: 4371
						FileSystem.method3490(var8, var0.sequenceFrame, var0.x, var0.y); // L: 4372
					}

					if (var0.sequenceFrame >= var8.frameIds.length) { // L: 4374
						var0.sequenceFrame -= var8.frameCount; // L: 4375
						++var0.field1224; // L: 4376
						if (var0.field1224 >= var8.field2304) { // L: 4377
							var0.sequence = -1; // L: 4378
						} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var8.frameIds.length) { // L: 4380
							FileSystem.method3490(var8, var0.sequenceFrame, var0.x, var0.y); // L: 4384
						} else {
							var0.sequence = -1; // L: 4381
						}
					}

					var0.isWalking = var8.field2319; // L: 4387
				} else if (var8.isCachedModelIdSet()) { // L: 4389
					++var0.sequenceFrame; // L: 4390
					var3 = var8.method4034(); // L: 4391
					if (var0.sequenceFrame < var3) { // L: 4392
						class169.method3362(var8, var0.sequenceFrame, var0.x, var0.y); // L: 4393
					} else {
						var0.sequenceFrame -= var8.frameCount; // L: 4396
						++var0.field1224; // L: 4397
						if (var0.field1224 >= var8.field2304) { // L: 4398
							var0.sequence = -1; // L: 4399
						} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var3) { // L: 4401
							class169.method3362(var8, var0.sequenceFrame, var0.x, var0.y); // L: 4405
						} else {
							var0.sequence = -1; // L: 4402
						}
					}
				} else {
					var0.sequence = -1; // L: 4409
				}
			} else {
				var0.sequence = -1; // L: 4411
			}
		}

		if (var0.sequenceDelay > 0) {
			--var0.sequenceDelay; // L: 4413
		}

	} // L: 4414
}
