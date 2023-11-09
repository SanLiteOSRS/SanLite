import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("na")
public class class378 {
	@ObfuscatedName("vf")
	@ObfuscatedGetter(
		intValue = 1549309693
	)
	@Export("foundItemIdCount")
	static int foundItemIdCount;
	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	static Widget field4437;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -880447267
	)
	int field4442;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1086284991
	)
	int field4438;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1922297331
	)
	int field4439;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1946808189
	)
	int field4441;

	public String toString() {
		boolean var1 = true; // L: 15
		int var2 = 10 - Integer.toString(this.field4442).length(); // L: 16
		int var3 = 10 - Integer.toString(this.field4439).length(); // L: 17
		int var4 = 10 - Integer.toString(this.field4438).length(); // L: 18
		String var5 = "          ".substring(10 - var2); // L: 19
		String var6 = "          ".substring(10 - var3); // L: 20
		String var7 = "          ".substring(10 - var4); // L: 21
		return "    Size: " + this.field4442 + var5 + "Created: " + this.field4438 + var7 + "Total used: " + this.field4439 + var6 + "Max-In-Use: " + this.field4441; // L: 22
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZI)I",
		garbageValue = "-1374612729"
	)
	static int method7358(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) { // L: 4314
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = class290.loadWorlds() ? 1 : 0; // L: 4315
			return 1; // L: 4316
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) { // L: 4318
				var9 = class108.worldListStart(); // L: 4319
				if (var9 != null) { // L: 4320
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var9.id; // L: 4321
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var9.properties; // L: 4322
					Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var9.activity; // L: 4323
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var9.location; // L: 4324
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var9.population; // L: 4325
					Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var9.host; // L: 4326
				} else {
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1; // L: 4329
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 4330
					Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = ""; // L: 4331
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 4332
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 4333
					Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = ""; // L: 4334
				}

				return 1; // L: 4336
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) { // L: 4338
				var9 = TileItem.getNextWorldListWorld(); // L: 4339
				if (var9 != null) { // L: 4340
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var9.id; // L: 4341
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var9.properties; // L: 4342
					Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var9.activity; // L: 4343
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var9.location; // L: 4344
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var9.population; // L: 4345
					Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var9.host; // L: 4346
				} else {
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1; // L: 4349
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 4350
					Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = ""; // L: 4351
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 4352
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 4353
					Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = ""; // L: 4354
				}

				return 1; // L: 4356
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) { // L: 4358
					var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 4359
					var7 = null; // L: 4360

					for (var8 = 0; var8 < World.World_count; ++var8) { // L: 4361
						if (var3 == class88.World_worlds[var8].id) { // L: 4362
							var7 = class88.World_worlds[var8]; // L: 4363
							break;
						}
					}

					if (var7 != null) { // L: 4367
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7.id; // L: 4368
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7.properties; // L: 4369
						Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var7.activity; // L: 4370
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7.location; // L: 4371
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7.population; // L: 4372
						Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var7.host; // L: 4373
					} else {
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1; // L: 4376
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 4377
						Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = ""; // L: 4378
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 4379
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 4380
						Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = ""; // L: 4381
					}

					return 1; // L: 4383
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) { // L: 4385
					class302.Interpreter_intStackSize -= 4; // L: 4386
					var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 4387
					boolean var10 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1] == 1; // L: 4388
					var8 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 2]; // L: 4389
					boolean var6 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 3] == 1; // L: 4390
					SecureRandomCallable.sortWorldList(var3, var10, var8, var6); // L: 4391
					return 1; // L: 4392
				} else if (var0 != 6511) { // L: 4394
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) { // L: 4415
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 4416
						return 1; // L: 4417
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) { // L: 4419
							class302.Interpreter_intStackSize -= 2; // L: 4420
							var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 4421
							var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 4422
							var5 = ClanChannelMember.getParamDefinition(var4); // L: 4423
							if (var5.isString()) { // L: 4424
								Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = class137.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4425
							} else {
								Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = class137.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4428
							}

							return 1; // L: 4430
						} else if (var0 == ScriptOpcodes.LC_PARAM) { // L: 4432
							class302.Interpreter_intStackSize -= 2; // L: 4433
							var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 4434
							var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 4435
							var5 = ClanChannelMember.getParamDefinition(var4); // L: 4436
							if (var5.isString()) { // L: 4437
								Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = class463.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4438
							} else {
								Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = class463.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4441
							}

							return 1; // L: 4443
						} else if (var0 == ScriptOpcodes.OC_PARAM) { // L: 4445
							class302.Interpreter_intStackSize -= 2; // L: 4446
							var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 4447
							var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 4448
							var5 = ClanChannelMember.getParamDefinition(var4); // L: 4449
							if (var5.isString()) { // L: 4450
								Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = TileItem.ItemComposition_get(var3).getStringParam(var4, var5.defaultStr); // L: 4451
							} else {
								Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = TileItem.ItemComposition_get(var3).getIntParam(var4, var5.defaultInt); // L: 4454
							}

							return 1; // L: 4456
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) { // L: 4458
							class302.Interpreter_intStackSize -= 2; // L: 4459
							var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 4460
							var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 4461
							var5 = ClanChannelMember.getParamDefinition(var4); // L: 4462
							if (var5.isString()) { // L: 4463
								Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = Actor.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4464
							} else {
								Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Actor.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4467
							}

							return 1; // L: 4469
						} else if (var0 == ScriptOpcodes.ON_MOBILE) { // L: 4471
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0; // L: 4472
							return 1; // L: 4473
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) { // L: 4475
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.clientType; // L: 4476
							return 1; // L: 4477
						} else if (var0 == 6520) { // L: 4479
							return 1; // L: 4480
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) { // L: 4482
							return 1; // L: 4483
						} else if (var0 == 6522) { // L: 4485
							--class20.Interpreter_stringStackSize; // L: 4486
							--class302.Interpreter_intStackSize; // L: 4487
							return 1; // L: 4488
						} else if (var0 == 6523) { // L: 4490
							--class20.Interpreter_stringStackSize; // L: 4491
							--class302.Interpreter_intStackSize; // L: 4492
							return 1; // L: 4493
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) { // L: 4495
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1; // L: 4496
							return 1; // L: 4497
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) { // L: 4499
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 1; // L: 4500
							return 1; // L: 4501
						} else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) { // L: 4503
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 1; // L: 4504
							return 1; // L: 4505
						} else if (var0 == 6527) { // L: 4507
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.field503; // L: 4508
							return 1; // L: 4509
						} else {
							return 2; // L: 4511
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 4395
					if (var3 >= 0 && var3 < World.World_count) { // L: 4396
						var7 = class88.World_worlds[var3]; // L: 4397
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7.id; // L: 4398
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7.properties; // L: 4399
						Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var7.activity; // L: 4400
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7.location; // L: 4401
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7.population; // L: 4402
						Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var7.host; // L: 4403
					} else {
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1; // L: 4406
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 4407
						Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = ""; // L: 4408
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 4409
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 4410
						Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = ""; // L: 4411
					}

					return 1; // L: 4413
				}
			}
		}
	}
}
