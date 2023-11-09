import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ex")
public class class141 extends class136 {
	@ObfuscatedName("bb")
	@Export("otp")
	static String otp;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -567167913
	)
	int field1683;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 923571903
	)
	int field1682;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -841112261
	)
	int field1681;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 2108363067
	)
	int field1680;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	final class139 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lem;)V"
	)
	class141(class139 var1) {
		this.this$0 = var1; // L: 289
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lqy;I)V",
		garbageValue = "1101327225"
	)
	void vmethod3349(Buffer var1) {
		this.field1683 = var1.readInt(); // L: 292
		this.field1680 = var1.readInt(); // L: 293
		this.field1682 = var1.readUnsignedByte(); // L: 294
		this.field1681 = var1.readUnsignedByte(); // L: 295
	} // L: 296

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lep;I)V",
		garbageValue = "839088249"
	)
	void vmethod3350(ClanSettings var1) {
		var1.method3180(this.field1683, this.field1680, this.field1682, this.field1681); // L: 299
	} // L: 300

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILbm;ZB)I",
		garbageValue = "108"
	)
	static int method3107(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) { // L: 4303
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = KeyHandler.loadWorlds() ? 1 : 0; // L: 4304
			return 1; // L: 4305
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) { // L: 4307
				var9 = PlayerComposition.worldListStart(); // L: 4308
				if (var9 != null) { // L: 4309
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var9.id; // L: 4310
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var9.properties; // L: 4311
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.activity; // L: 4312
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var9.location; // L: 4313
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var9.population; // L: 4314
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.host; // L: 4315
				} else {
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1; // L: 4318
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 4319
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 4320
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 4321
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 4322
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 4323
				}

				return 1; // L: 4325
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) { // L: 4327
				var9 = UserComparator9.getNextWorldListWorld(); // L: 4328
				if (var9 != null) { // L: 4329
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var9.id; // L: 4330
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var9.properties; // L: 4331
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.activity; // L: 4332
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var9.location; // L: 4333
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var9.population; // L: 4334
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.host; // L: 4335
				} else {
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1; // L: 4338
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 4339
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 4340
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 4341
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 4342
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 4343
				}

				return 1; // L: 4345
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) { // L: 4347
					var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 4348
					var7 = null; // L: 4349

					for (var8 = 0; var8 < World.World_count; ++var8) { // L: 4350
						if (var3 == World.World_worlds[var8].id) { // L: 4351
							var7 = World.World_worlds[var8]; // L: 4352
							break;
						}
					}

					if (var7 != null) { // L: 4356
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7.id; // L: 4357
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7.properties; // L: 4358
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.activity; // L: 4359
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7.location; // L: 4360
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7.population; // L: 4361
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.host; // L: 4362
					} else {
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1; // L: 4365
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 4366
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 4367
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 4368
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 4369
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 4370
					}

					return 1; // L: 4372
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) { // L: 4374
					class87.Interpreter_intStackSize -= 4; // L: 4375
					var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 4376
					boolean var10 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1] == 1; // L: 4377
					var8 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 2]; // L: 4378
					boolean var6 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 3] == 1; // L: 4379
					class416.sortWorldList(var3, var10, var8, var6); // L: 4380
					return 1; // L: 4381
				} else if (var0 != 6511) { // L: 4383
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) { // L: 4404
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 4405
						return 1; // L: 4406
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) { // L: 4408
							class87.Interpreter_intStackSize -= 2; // L: 4409
							var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 4410
							var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 4411
							var5 = class149.getParamDefinition(var4); // L: 4412
							if (var5.isString()) { // L: 4413
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class129.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4414
							} else {
								Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class129.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4417
							}

							return 1; // L: 4419
						} else if (var0 == ScriptOpcodes.LC_PARAM) { // L: 4421
							class87.Interpreter_intStackSize -= 2; // L: 4422
							var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 4423
							var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 4424
							var5 = class149.getParamDefinition(var4); // L: 4425
							if (var5.isString()) { // L: 4426
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = VarpDefinition.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4427
							} else {
								Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = VarpDefinition.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4430
							}

							return 1; // L: 4432
						} else if (var0 == ScriptOpcodes.OC_PARAM) { // L: 4434
							class87.Interpreter_intStackSize -= 2; // L: 4435
							var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 4436
							var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 4437
							var5 = class149.getParamDefinition(var4); // L: 4438
							if (var5.isString()) { // L: 4439
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = NPCComposition.ItemComposition_get(var3).getStringParam(var4, var5.defaultStr); // L: 4440
							} else {
								Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = NPCComposition.ItemComposition_get(var3).getIntParam(var4, var5.defaultInt); // L: 4443
							}

							return 1; // L: 4445
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) { // L: 4447
							class87.Interpreter_intStackSize -= 2; // L: 4448
							var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 4449
							var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 4450
							var5 = class149.getParamDefinition(var4); // L: 4451
							if (var5.isString()) { // L: 4452
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = UserComparator3.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4453
							} else {
								Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = UserComparator3.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4456
							}

							return 1; // L: 4458
						} else if (var0 == ScriptOpcodes.ON_MOBILE) { // L: 4460
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0; // L: 4461
							return 1; // L: 4462
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) { // L: 4464
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.clientType; // L: 4465
							return 1; // L: 4466
						} else if (var0 == 6520) { // L: 4468
							return 1; // L: 4469
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) { // L: 4471
							return 1; // L: 4472
						} else if (var0 == 6522) { // L: 4474
							--Interpreter.Interpreter_stringStackSize; // L: 4475
							--class87.Interpreter_intStackSize; // L: 4476
							return 1; // L: 4477
						} else if (var0 == 6523) { // L: 4479
							--Interpreter.Interpreter_stringStackSize; // L: 4480
							--class87.Interpreter_intStackSize; // L: 4481
							return 1; // L: 4482
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) { // L: 4484
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1; // L: 4485
							return 1; // L: 4486
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) { // L: 4488
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 1; // L: 4489
							return 1; // L: 4490
						} else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) { // L: 4492
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 1; // L: 4493
							return 1; // L: 4494
						} else if (var0 == 6527) { // L: 4496
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.field698; // L: 4497
							return 1; // L: 4498
						} else {
							return 2; // L: 4500
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 4384
					if (var3 >= 0 && var3 < World.World_count) { // L: 4385
						var7 = World.World_worlds[var3]; // L: 4386
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7.id; // L: 4387
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7.properties; // L: 4388
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.activity; // L: 4389
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7.location; // L: 4390
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7.population; // L: 4391
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.host; // L: 4392
					} else {
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1; // L: 4395
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 4396
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 4397
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 4398
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 4399
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 4400
					}

					return 1; // L: 4402
				}
			}
		}
	}
}
