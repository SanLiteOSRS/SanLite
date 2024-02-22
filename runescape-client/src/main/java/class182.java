import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hg")
public class class182 {
	@ObfuscatedName("aj")
	@Export("Tiles_hueMultiplier")
	static int[] Tiles_hueMultiplier;

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lun;II)Z",
		garbageValue = "-1402960376"
	)
	@Export("updateExternalPlayer")
	static boolean updateExternalPlayer(PacketBuffer var0, int var1) {
		int var2 = var0.readBits(2); // L: 380
		int var3;
		int var4;
		int var7;
		int var8;
		int var9;
		int var10;
		if (var2 == 0) { // L: 381
			if (var0.readBits(1) != 0) { // L: 382
				updateExternalPlayer(var0, var1);
			}

			var3 = var0.readBits(13); // L: 383
			var4 = var0.readBits(13); // L: 384
			boolean var12 = var0.readBits(1) == 1; // L: 385
			if (var12) { // L: 386
				Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
			}

			if (Client.players[var1] != null) { // L: 387
				throw new RuntimeException(); // L: 388
			} else {
				Player var11 = Client.players[var1] = new Player(); // L: 390
				var11.index = var1; // L: 391
				if (Players.field1389[var1] != null) { // L: 392
					var11.read(Players.field1389[var1]);
				}

				var11.orientation = Players.Players_orientations[var1]; // L: 393
				var11.targetIndex = Players.Players_targetIndices[var1]; // L: 394
				var7 = Players.Players_regions[var1]; // L: 395
				var8 = var7 >> 28; // L: 396
				var9 = var7 >> 14 & 255; // L: 397
				var10 = var7 & 255; // L: 398
				var11.pathTraversed[0] = Players.field1378[var1]; // L: 399
				var11.plane = (byte)var8; // L: 400
				var11.resetPath((var9 << 13) + var3 - Projectile.baseX * 64, (var10 << 13) + var4 - GameEngine.baseY * 8); // L: 401
				var11.field1147 = false; // L: 402
				return true; // L: 403
			}
		} else if (var2 == 1) { // L: 405
			var3 = var0.readBits(2); // L: 406
			var4 = Players.Players_regions[var1]; // L: 407
			Players.Players_regions[var1] = (((var4 >> 28) + var3 & 3) << 28) + (var4 & 268435455); // L: 408
			return false; // L: 409
		} else {
			int var5;
			int var6;
			if (var2 == 2) { // L: 411
				var3 = var0.readBits(5); // L: 412
				var4 = var3 >> 3; // L: 413
				var5 = var3 & 7; // L: 414
				var6 = Players.Players_regions[var1]; // L: 415
				var7 = (var6 >> 28) + var4 & 3; // L: 416
				var8 = var6 >> 14 & 255; // L: 417
				var9 = var6 & 255; // L: 418
				if (var5 == 0) { // L: 419
					--var8; // L: 420
					--var9; // L: 421
				}

				if (var5 == 1) { // L: 423
					--var9;
				}

				if (var5 == 2) { // L: 424
					++var8; // L: 425
					--var9; // L: 426
				}

				if (var5 == 3) { // L: 428
					--var8;
				}

				if (var5 == 4) { // L: 429
					++var8;
				}

				if (var5 == 5) { // L: 430
					--var8; // L: 431
					++var9; // L: 432
				}

				if (var5 == 6) { // L: 434
					++var9;
				}

				if (var5 == 7) { // L: 435
					++var8; // L: 436
					++var9; // L: 437
				}

				Players.Players_regions[var1] = (var8 << 14) + var9 + (var7 << 28); // L: 439
				return false; // L: 440
			} else {
				var3 = var0.readBits(18); // L: 442
				var4 = var3 >> 16; // L: 443
				var5 = var3 >> 8 & 255; // L: 444
				var6 = var3 & 255; // L: 445
				var7 = Players.Players_regions[var1]; // L: 446
				var8 = (var7 >> 28) + var4 & 3; // L: 447
				var9 = var5 + (var7 >> 14) & 255; // L: 448
				var10 = var6 + var7 & 255; // L: 449
				Players.Players_regions[var1] = (var9 << 14) + var10 + (var8 << 28); // L: 450
				return false; // L: 451
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Luq;IIIIIIB)V",
		garbageValue = "-93"
	)
	@Export("loadTerrain")
	static final void loadTerrain(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		if (class193.method3782(var1, var2, var3)) { // L: 169
			Tiles.Tiles_renderFlags[var1][var2][var3] = 0; // L: 170

			while (true) {
				var7 = var0.readUnsignedShort(); // L: 172
				if (var7 == 0) { // L: 173
					if (var1 == 0) { // L: 174
						int[] var14 = Tiles.Tiles_heights[0][var2]; // L: 175
						int var11 = var4 + 932731; // L: 178
						int var12 = var5 + 556238; // L: 179
						int var13 = class20.method270(var11 + 45365, var12 + 91923, 4) - 128 + (class20.method270(var11 + 10294, 37821 + var12, 2) - 128 >> 1) + (class20.method270(var11, var12, 1) - 128 >> 2); // L: 181
						var13 = (int)(0.3D * (double)var13) + 35; // L: 182
						if (var13 < 10) { // L: 183
							var13 = 10;
						} else if (var13 > 60) { // L: 184
							var13 = 60;
						}

						var14[var3] = -var13 * 8; // L: 187
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - 240; // L: 189
					}
					break;
				}

				if (var7 == 1) { // L: 192
					int var8 = var0.readUnsignedByte(); // L: 193
					if (var8 == 1) { // L: 194
						var8 = 0;
					}

					if (var1 == 0) { // L: 195
						Tiles.Tiles_heights[0][var2][var3] = -var8 * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - var8 * 8; // L: 196
					}
					break;
				}

				if (var7 <= 49) { // L: 199
					TriBool.field4773[var1][var2][var3] = (short)var0.readShort(); // L: 200
					class173.field1845[var1][var2][var3] = (byte)((var7 - 2) / 4); // L: 201
					class350.field3876[var1][var2][var3] = (byte)(var7 - 2 + var6 & 3); // L: 202
				} else if (var7 <= 81) { // L: 205
					Tiles.Tiles_renderFlags[var1][var2][var3] = (byte)(var7 - 49); // L: 206
				} else {
					GrandExchangeOfferAgeComparator.field4442[var1][var2][var3] = (short)(var7 - 81); // L: 209
				}
			}
		} else {
			while (true) {
				var7 = var0.readUnsignedShort(); // L: 214
				if (var7 == 0) { // L: 215
					break;
				}

				if (var7 == 1) { // L: 216
					var0.readUnsignedByte(); // L: 217
					break; // L: 218
				}

				if (var7 <= 49) { // L: 220
					var0.readShort(); // L: 221
				}
			}
		}

	} // L: 225

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "-21352582"
	)
	static int method3658(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) { // L: 4541
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = FileSystem.loadWorlds() ? 1 : 0; // L: 4542
			return 1; // L: 4543
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) { // L: 4545
				var9 = class130.worldListStart(); // L: 4546
				if (var9 != null) { // L: 4547
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.id; // L: 4548
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.properties; // L: 4549
					Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var9.activity; // L: 4550
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.location; // L: 4551
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.population; // L: 4552
					Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var9.host; // L: 4553
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4556
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4557
					Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = ""; // L: 4558
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4559
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4560
					Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = ""; // L: 4561
				}

				return 1; // L: 4563
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) { // L: 4565
				var9 = UserComparator5.getNextWorldListWorld(); // L: 4566
				if (var9 != null) { // L: 4567
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.id; // L: 4568
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.properties; // L: 4569
					Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var9.activity; // L: 4570
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.location; // L: 4571
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.population; // L: 4572
					Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var9.host; // L: 4573
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4576
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4577
					Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = ""; // L: 4578
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4579
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4580
					Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = ""; // L: 4581
				}

				return 1; // L: 4583
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) { // L: 4585
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4586
					var7 = null; // L: 4587

					for (var8 = 0; var8 < World.World_count; ++var8) { // L: 4588
						if (var3 == WorldMapID.World_worlds[var8].id) { // L: 4589
							var7 = WorldMapID.World_worlds[var8]; // L: 4590
							break;
						}
					}

					if (var7 != null) { // L: 4594
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.id; // L: 4595
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.properties; // L: 4596
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var7.activity; // L: 4597
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.location; // L: 4598
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.population; // L: 4599
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var7.host; // L: 4600
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4603
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4604
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = ""; // L: 4605
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4606
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4607
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = ""; // L: 4608
					}

					return 1; // L: 4610
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) { // L: 4612
					Interpreter.Interpreter_intStackSize -= 4; // L: 4613
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4614
					boolean var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 4615
					var8 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 4616
					boolean var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3] == 1; // L: 4617
					class1.sortWorldList(var3, var10, var8, var6); // L: 4618
					return 1; // L: 4619
				} else if (var0 != 6511) { // L: 4621
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) { // L: 4642
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 4643
						return 1; // L: 4644
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) { // L: 4646
							Interpreter.Interpreter_intStackSize -= 2; // L: 4647
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4648
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4649
							var5 = UserComparator4.getParamDefinition(var4); // L: 4650
							if (var5.isString()) { // L: 4651
								Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = VarcInt.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4652
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = VarcInt.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4655
							}

							return 1; // L: 4657
						} else if (var0 == ScriptOpcodes.LC_PARAM) { // L: 4659
							Interpreter.Interpreter_intStackSize -= 2; // L: 4660
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4661
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4662
							var5 = UserComparator4.getParamDefinition(var4); // L: 4663
							if (var5.isString()) { // L: 4664
								Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = class127.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4665
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class127.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4668
							}

							return 1; // L: 4670
						} else if (var0 == ScriptOpcodes.OC_PARAM) { // L: 4672
							Interpreter.Interpreter_intStackSize -= 2; // L: 4673
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4674
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4675
							var5 = UserComparator4.getParamDefinition(var4); // L: 4676
							if (var5.isString()) { // L: 4677
								Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = ArchiveDiskActionHandler.ItemComposition_get(var3).getStringParam(var4, var5.defaultStr); // L: 4678
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ArchiveDiskActionHandler.ItemComposition_get(var3).getIntParam(var4, var5.defaultInt); // L: 4681
							}

							return 1; // L: 4683
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) { // L: 4685
							Interpreter.Interpreter_intStackSize -= 2; // L: 4686
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4687
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4688
							var5 = UserComparator4.getParamDefinition(var4); // L: 4689
							if (var5.isString()) { // L: 4690
								Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = class144.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4691
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class144.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4694
							}

							return 1; // L: 4696
						} else if (var0 == ScriptOpcodes.ON_MOBILE) { // L: 4698
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0; // L: 4699
							return 1; // L: 4700
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) { // L: 4702
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.clientType; // L: 4703
							return 1; // L: 4704
						} else if (var0 == 6520) { // L: 4706
							return 1; // L: 4707
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) { // L: 4709
							return 1; // L: 4710
						} else if (var0 == 6522) { // L: 4712
							--class60.Interpreter_stringStackSize; // L: 4713
							--Interpreter.Interpreter_intStackSize; // L: 4714
							return 1; // L: 4715
						} else if (var0 == 6523) { // L: 4717
							--class60.Interpreter_stringStackSize; // L: 4718
							--Interpreter.Interpreter_intStackSize; // L: 4719
							return 1; // L: 4720
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) { // L: 4722
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4723
							return 1; // L: 4724
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) { // L: 4726
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 4727
							return 1; // L: 4728
						} else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) { // L: 4730
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 4731
							return 1; // L: 4732
						} else if (var0 == 6527) { // L: 4734
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field528; // L: 4735
							return 1; // L: 4736
						} else {
							return 2; // L: 4738
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4622
					if (var3 >= 0 && var3 < World.World_count) { // L: 4623
						var7 = WorldMapID.World_worlds[var3]; // L: 4624
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.id; // L: 4625
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.properties; // L: 4626
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var7.activity; // L: 4627
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.location; // L: 4628
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.population; // L: 4629
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var7.host; // L: 4630
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4633
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4634
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = ""; // L: 4635
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4636
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4637
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = ""; // L: 4638
					}

					return 1; // L: 4640
				}
			}
		}
	}

	@ObfuscatedName("mv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-990046890"
	)
	static final void method3660(int var0) {
		var0 = Math.max(Math.min(var0, 100), 0); // L: 12335
		var0 = 100 - var0; // L: 12336
		float var1 = 0.5F + (float)var0 / 200.0F; // L: 12337
		class19.method260((double)var1); // L: 12338
	} // L: 12339
}
