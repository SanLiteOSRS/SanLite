import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cj")
public enum class86 implements class342 {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	field1068(0, -1),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	field1067(1, 1),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	field1075(2, 7),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	field1069(3, 8),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	field1070(4, 9);

	@ObfuscatedName("tl")
	@ObfuscatedSignature(
		descriptor = "Lab;"
	)
	@Export("pcmPlayer1")
	static PcmPlayer pcmPlayer1;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1450432843
	)
	final int field1071;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1482134259
	)
	final int field1074;

	class86(int var3, int var4) {
		this.field1071 = var3;
		this.field1074 = var4;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1074; // L: 26
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I[BLob;B)V",
		garbageValue = "70"
	)
	static void method2249(int var0, byte[] var1, ArchiveDisk var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction(); // L: 18
		var3.type = 0; // L: 19
		var3.key = (long)var0; // L: 20
		var3.data = var1; // L: 21
		var3.archiveDisk = var2; // L: 22
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 23
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3); // L: 24
		} // L: 25

		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 27
			if (ArchiveDiskActionHandler.field4122 == 0) { // L: 28
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true);
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start();
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5);
			}

			ArchiveDiskActionHandler.field4122 = 600;
		}
	} // L: 37

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqk;I)V",
		garbageValue = "-503527030"
	)
	@Export("performReflectionCheck")
	public static void performReflectionCheck(PacketBuffer var0) {
		ReflectionCheck var1 = (ReflectionCheck)class37.reflectionChecks.last(); // L: 29
		if (var1 != null) { // L: 30
			int var2 = var0.offset; // L: 31
			var0.writeInt(var1.id); // L: 32

			for (int var3 = 0; var3 < var1.size; ++var3) { // L: 33
				if (var1.creationErrors[var3] != 0) { // L: 34
					var0.writeByte(var1.creationErrors[var3]); // L: 35
				} else {
					try {
						int var4 = var1.operations[var3]; // L: 39
						Field var5;
						int var6;
						if (var4 == 0) { // L: 40
							var5 = var1.fields[var3]; // L: 41
							var6 = Reflection.getInt(var5, (Object)null); // L: 42
							var0.writeByte(0); // L: 43
							var0.writeInt(var6); // L: 44
						} else if (var4 == 1) { // L: 46
							var5 = var1.fields[var3]; // L: 47
							Reflection.setInt(var5, (Object)null, var1.intReplaceValues[var3]); // L: 48
							var0.writeByte(0); // L: 49
						} else if (var4 == 2) { // L: 51
							var5 = var1.fields[var3]; // L: 52
							var6 = var5.getModifiers(); // L: 53
							var0.writeByte(0); // L: 54
							var0.writeInt(var6); // L: 55
						}

						Method var25;
						if (var4 != 3) { // L: 57
							if (var4 == 4) { // L: 77
								var25 = var1.methods[var3]; // L: 78
								var6 = var25.getModifiers(); // L: 79
								var0.writeByte(0); // L: 80
								var0.writeInt(var6); // L: 81
							}
						} else {
							var25 = var1.methods[var3]; // L: 58
							byte[][] var10 = var1.arguments[var3]; // L: 59
							Object[] var7 = new Object[var10.length]; // L: 60

							for (int var8 = 0; var8 < var10.length; ++var8) { // L: 61
								ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var10[var8])); // L: 62
								var7[var8] = var9.readObject(); // L: 63
							}

							Object var11 = Reflection.invoke(var25, (Object)null, var7); // L: 65
							if (var11 == null) { // L: 66
								var0.writeByte(0);
							} else if (var11 instanceof Number) { // L: 67
								var0.writeByte(1); // L: 68
								var0.writeLong(((Number)var11).longValue()); // L: 69
							} else if (var11 instanceof String) { // L: 71
								var0.writeByte(2); // L: 72
								var0.writeStringCp1252NullTerminated((String)var11); // L: 73
							} else {
								var0.writeByte(4); // L: 75
							}
						}
					} catch (ClassNotFoundException var13) { // L: 84
						var0.writeByte(-10); // L: 85
					} catch (InvalidClassException var14) { // L: 87
						var0.writeByte(-11); // L: 88
					} catch (StreamCorruptedException var15) { // L: 90
						var0.writeByte(-12); // L: 91
					} catch (OptionalDataException var16) { // L: 93
						var0.writeByte(-13); // L: 94
					} catch (IllegalAccessException var17) { // L: 96
						var0.writeByte(-14); // L: 97
					} catch (IllegalArgumentException var18) { // L: 99
						var0.writeByte(-15); // L: 100
					} catch (InvocationTargetException var19) { // L: 102
						var0.writeByte(-16); // L: 103
					} catch (SecurityException var20) { // L: 105
						var0.writeByte(-17); // L: 106
					} catch (IOException var21) { // L: 108
						var0.writeByte(-18); // L: 109
					} catch (NullPointerException var22) { // L: 111
						var0.writeByte(-19); // L: 112
					} catch (Exception var23) { // L: 114
						var0.writeByte(-20); // L: 115
					} catch (Throwable var24) { // L: 117
						var0.writeByte(-21); // L: 118
					}
				}
			}

			var0.writeCrc(var2); // L: 121
			var1.remove(); // L: 122
		}
	} // L: 123

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "-1755288637"
	)
	static int method2250(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) { // L: 4307
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = GrandExchangeEvent.loadWorlds() ? 1 : 0; // L: 4308
			return 1; // L: 4309
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) { // L: 4311
				var9 = GameEngine.worldListStart(); // L: 4312
				if (var9 != null) { // L: 4313
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var9.id; // L: 4314
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var9.properties; // L: 4315
					Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var9.activity; // L: 4316
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var9.location; // L: 4317
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var9.population; // L: 4318
					Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var9.host; // L: 4319
				} else {
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1; // L: 4322
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 4323
					Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = ""; // L: 4324
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 4325
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 4326
					Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = ""; // L: 4327
				}

				return 1; // L: 4329
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) { // L: 4331
				var9 = TextureProvider.getNextWorldListWorld(); // L: 4332
				if (var9 != null) { // L: 4333
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var9.id; // L: 4334
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var9.properties; // L: 4335
					Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var9.activity; // L: 4336
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var9.location; // L: 4337
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var9.population; // L: 4338
					Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var9.host; // L: 4339
				} else {
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1; // L: 4342
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 4343
					Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = ""; // L: 4344
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 4345
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 4346
					Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = ""; // L: 4347
				}

				return 1; // L: 4349
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) { // L: 4351
					var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 4352
					var7 = null; // L: 4353

					for (var8 = 0; var8 < World.World_count; ++var8) { // L: 4354
						if (var3 == class412.World_worlds[var8].id) { // L: 4355
							var7 = class412.World_worlds[var8]; // L: 4356
							break;
						}
					}

					if (var7 != null) { // L: 4360
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7.id; // L: 4361
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7.properties; // L: 4362
						Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var7.activity; // L: 4363
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7.location; // L: 4364
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7.population; // L: 4365
						Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var7.host; // L: 4366
					} else {
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1; // L: 4369
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 4370
						Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = ""; // L: 4371
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 4372
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 4373
						Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = ""; // L: 4374
					}

					return 1; // L: 4376
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) { // L: 4378
					class379.Interpreter_intStackSize -= 4; // L: 4379
					var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 4380
					boolean var10 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1] == 1; // L: 4381
					var8 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 2]; // L: 4382
					boolean var6 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 3] == 1; // L: 4383
					class181.sortWorldList(var3, var10, var8, var6); // L: 4384
					return 1; // L: 4385
				} else if (var0 != 6511) { // L: 4387
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) { // L: 4408
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 4409
						return 1; // L: 4410
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) { // L: 4412
							class379.Interpreter_intStackSize -= 2; // L: 4413
							var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 4414
							var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 4415
							var5 = class230.getParamDefinition(var4); // L: 4416
							if (var5.isString()) { // L: 4417
								Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = HealthBarDefinition.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4418
							} else {
								Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = HealthBarDefinition.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4421
							}

							return 1; // L: 4423
						} else if (var0 == ScriptOpcodes.LC_PARAM) { // L: 4425
							class379.Interpreter_intStackSize -= 2; // L: 4426
							var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 4427
							var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 4428
							var5 = class230.getParamDefinition(var4); // L: 4429
							if (var5.isString()) { // L: 4430
								Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = InterfaceParent.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4431
							} else {
								Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = InterfaceParent.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4434
							}

							return 1; // L: 4436
						} else if (var0 == ScriptOpcodes.OC_PARAM) { // L: 4438
							class379.Interpreter_intStackSize -= 2; // L: 4439
							var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 4440
							var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 4441
							var5 = class230.getParamDefinition(var4); // L: 4442
							if (var5.isString()) { // L: 4443
								Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = MidiPcmStream.ItemComposition_get(var3).getStringParam(var4, var5.defaultStr); // L: 4444
							} else {
								Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = MidiPcmStream.ItemComposition_get(var3).getIntParam(var4, var5.defaultInt); // L: 4447
							}

							return 1; // L: 4449
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) { // L: 4451
							class379.Interpreter_intStackSize -= 2; // L: 4452
							var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 4453
							var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 4454
							var5 = class230.getParamDefinition(var4); // L: 4455
							if (var5.isString()) { // L: 4456
								Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = class203.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4457
							} else {
								Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = class203.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4460
							}

							return 1; // L: 4462
						} else if (var0 == ScriptOpcodes.ON_MOBILE) { // L: 4464
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0; // L: 4465
							return 1; // L: 4466
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) { // L: 4468
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.clientType; // L: 4469
							return 1; // L: 4470
						} else if (var0 == 6520) { // L: 4472
							return 1; // L: 4473
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) { // L: 4475
							return 1; // L: 4476
						} else if (var0 == 6522) { // L: 4478
							--class125.Interpreter_stringStackSize; // L: 4479
							--class379.Interpreter_intStackSize; // L: 4480
							return 1; // L: 4481
						} else if (var0 == 6523) { // L: 4483
							--class125.Interpreter_stringStackSize; // L: 4484
							--class379.Interpreter_intStackSize; // L: 4485
							return 1; // L: 4486
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) { // L: 4488
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1; // L: 4489
							return 1; // L: 4490
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) { // L: 4492
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 1; // L: 4493
							return 1; // L: 4494
						} else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) { // L: 4496
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 1; // L: 4497
							return 1; // L: 4498
						} else if (var0 == 6527) { // L: 4500
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.field573; // L: 4501
							return 1; // L: 4502
						} else {
							return 2; // L: 4504
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 4388
					if (var3 >= 0 && var3 < World.World_count) { // L: 4389
						var7 = class412.World_worlds[var3]; // L: 4390
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7.id; // L: 4391
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7.properties; // L: 4392
						Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var7.activity; // L: 4393
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7.location; // L: 4394
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7.population; // L: 4395
						Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var7.host; // L: 4396
					} else {
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1; // L: 4399
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 4400
						Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = ""; // L: 4401
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 4402
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 4403
						Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = ""; // L: 4404
					}

					return 1; // L: 4406
				}
			}
		}
	}
}
