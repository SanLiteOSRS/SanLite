import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bv")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "Lcf;"
	)
	@Export("mouseRecorder")
	static MouseRecorder mouseRecorder;
	@ObfuscatedName("ir")
	@Export("regionLandArchives")
	static byte[][] regionLandArchives;
	@ObfuscatedName("a")
	@Export("filterWorlds")
	boolean filterWorlds;

	GrandExchangeOfferOwnWorldComparator() {
	} // L: 12881

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Llp;Llp;I)I",
		garbageValue = "1853766659"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		if (var2.world == var1.world) { // L: 12884
			return 0;
		} else {
			if (this.filterWorlds) { // L: 12885
				if (Client.worldId == var1.world) { // L: 12886
					return -1;
				}

				if (var2.world == Client.worldId) { // L: 12887
					return 1;
				}
			}

			return var1.world < var2.world ? -1 : 1; // L: 12889
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 12893
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 12897
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1144789040"
	)
	static void method1171(int var0) {
		if (var0 != Login.loginIndex) { // L: 1884
			Login.loginIndex = var0; // L: 1885
		}
	} // L: 1886

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "(Lcl;I)V",
		garbageValue = "-2103978067"
	)
	static final void method1177(Actor var0) {
		var0.isWalking = false; // L: 4260
		SequenceDefinition var1;
		int var2;
		if (var0.movementSequence != -1) { // L: 4261
			var1 = WorldMapElement.SequenceDefinition_get(var0.movementSequence); // L: 4262
			if (var1 != null) { // L: 4263
				if (!var1.isCachedModelIdSet() && var1.frameIds != null) { // L: 4264
					++var0.movementFrameCycle; // L: 4265
					if (var0.movementFrame < var1.frameIds.length && var0.movementFrameCycle > var1.frameLengths[var0.movementFrame]) { // L: 4266
						var0.movementFrameCycle = 1; // L: 4267
						++var0.movementFrame; // L: 4268
						ArchiveDiskActionHandler.method6292(var1, var0.movementFrame, var0.x, var0.y); // L: 4269
					}

					if (var0.movementFrame >= var1.frameIds.length) { // L: 4271
						if (var1.frameCount > 0) { // L: 4272
							var0.movementFrame -= var1.frameCount; // L: 4273
							if (var1.field2227) { // L: 4274
								++var0.field1160;
							}

							if (var0.movementFrame < 0 || var0.movementFrame >= var1.frameIds.length || var1.field2227 && var0.field1160 >= var1.field2228) { // L: 4275
								var0.movementFrameCycle = 0; // L: 4276
								var0.movementFrame = 0; // L: 4277
								var0.field1160 = 0; // L: 4278
							}
						} else {
							var0.movementFrameCycle = 0; // L: 4282
							var0.movementFrame = 0; // L: 4283
						}

						ArchiveDiskActionHandler.method6292(var1, var0.movementFrame, var0.x, var0.y); // L: 4285
					}
				} else if (var1.isCachedModelIdSet()) { // L: 4288
					++var0.movementFrame; // L: 4289
					var2 = var1.method3876(); // L: 4290
					if (var0.movementFrame < var2) { // L: 4291
						AbstractSocket.method7484(var1, var0.movementFrame, var0.x, var0.y); // L: 4292
					} else {
						if (var1.frameCount > 0) { // L: 4295
							var0.movementFrame -= var1.frameCount; // L: 4296
							if (var1.field2227) { // L: 4297
								++var0.field1160;
							}

							if (var0.movementFrame < 0 || var0.movementFrame >= var2 || var1.field2227 && var0.field1160 >= var1.field2228) { // L: 4298
								var0.movementFrame = 0; // L: 4299
								var0.movementFrameCycle = 0; // L: 4300
								var0.field1160 = 0; // L: 4301
							}
						} else {
							var0.movementFrameCycle = 0; // L: 4305
							var0.movementFrame = 0; // L: 4306
						}

						AbstractSocket.method7484(var1, var0.movementFrame, var0.x, var0.y); // L: 4308
					}
				} else {
					var0.movementSequence = -1; // L: 4311
				}
			} else {
				var0.movementSequence = -1; // L: 4313
			}
		}

		if (var0.spotAnimation != -1 && Client.cycle >= var0.field1186) { // L: 4315
			if (var0.spotAnimationFrame < 0) {
				var0.spotAnimationFrame = 0; // L: 4316
			}

			int var4 = ReflectionCheck.SpotAnimationDefinition_get(var0.spotAnimation).sequence; // L: 4317
			if (var4 != -1) { // L: 4318
				SequenceDefinition var5 = WorldMapElement.SequenceDefinition_get(var4); // L: 4319
				if (var5 != null && var5.frameIds != null && !var5.isCachedModelIdSet()) { // L: 4320
					++var0.field1142; // L: 4321
					if (var0.spotAnimationFrame < var5.frameIds.length && var0.field1142 > var5.frameLengths[var0.spotAnimationFrame]) { // L: 4322
						var0.field1142 = 1; // L: 4323
						++var0.spotAnimationFrame; // L: 4324
						ArchiveDiskActionHandler.method6292(var5, var0.spotAnimationFrame, var0.x, var0.y); // L: 4325
					}

					if (var0.spotAnimationFrame >= var5.frameIds.length && (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var5.frameIds.length)) { // L: 4327 4328
						var0.spotAnimation = -1;
					}
				} else if (var5.isCachedModelIdSet()) { // L: 4331
					++var0.spotAnimationFrame; // L: 4332
					int var3 = var5.method3876(); // L: 4333
					if (var0.spotAnimationFrame < var3) { // L: 4334
						AbstractSocket.method7484(var5, var0.spotAnimationFrame, var0.x, var0.y); // L: 4335
					} else if (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var3) { // L: 4338
						var0.spotAnimation = -1;
					}
				} else {
					var0.spotAnimation = -1; // L: 4341
				}
			} else {
				var0.spotAnimation = -1; // L: 4343
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay <= 1) { // L: 4345
			var1 = WorldMapElement.SequenceDefinition_get(var0.sequence); // L: 4346
			if (var1.field2221 == 1 && var0.field1211 > 0 && var0.field1192 <= Client.cycle && var0.field1193 < Client.cycle) { // L: 4347 4348
				var0.sequenceDelay = 1; // L: 4349
				return; // L: 4350
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 4354
			var1 = WorldMapElement.SequenceDefinition_get(var0.sequence); // L: 4355
			if (var1 != null) { // L: 4356
				if (!var1.isCachedModelIdSet() && var1.frameIds != null) { // L: 4357
					++var0.sequenceFrameCycle; // L: 4358
					if (var0.sequenceFrame < var1.frameIds.length && var0.sequenceFrameCycle > var1.frameLengths[var0.sequenceFrame]) { // L: 4359
						var0.sequenceFrameCycle = 1; // L: 4360
						++var0.sequenceFrame; // L: 4361
						ArchiveDiskActionHandler.method6292(var1, var0.sequenceFrame, var0.x, var0.y); // L: 4362
					}

					if (var0.sequenceFrame >= var1.frameIds.length) { // L: 4364
						var0.sequenceFrame -= var1.frameCount; // L: 4365
						++var0.field1210; // L: 4366
						if (var0.field1210 >= var1.field2228) { // L: 4367
							var0.sequence = -1; // L: 4368
						} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var1.frameIds.length) { // L: 4370
							ArchiveDiskActionHandler.method6292(var1, var0.sequenceFrame, var0.x, var0.y); // L: 4374
						} else {
							var0.sequence = -1; // L: 4371
						}
					}

					var0.isWalking = var1.field2224; // L: 4377
				} else if (var1.isCachedModelIdSet()) { // L: 4379
					++var0.sequenceFrame; // L: 4380
					var2 = var1.method3876(); // L: 4381
					if (var0.sequenceFrame < var2) { // L: 4382
						AbstractSocket.method7484(var1, var0.sequenceFrame, var0.x, var0.y); // L: 4383
					} else {
						var0.sequenceFrame -= var1.frameCount; // L: 4386
						++var0.field1210; // L: 4387
						if (var0.field1210 >= var1.field2228) { // L: 4388
							var0.sequence = -1; // L: 4389
						} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var2) { // L: 4391
							AbstractSocket.method7484(var1, var0.sequenceFrame, var0.x, var0.y); // L: 4395
						} else {
							var0.sequence = -1; // L: 4392
						}
					}
				} else {
					var0.sequence = -1; // L: 4399
				}
			} else {
				var0.sequence = -1; // L: 4401
			}
		}

		if (var0.sequenceDelay > 0) { // L: 4403
			--var0.sequenceDelay;
		}

	} // L: 4404
}
