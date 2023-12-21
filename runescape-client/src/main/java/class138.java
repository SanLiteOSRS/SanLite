import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fi")
class class138 implements Callable {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfo;"
	)
	final class139 this$0;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Luj;"
	)
	final Buffer val$p;
	// $FF: synthetic field
	final int val$version;

	@ObfuscatedSignature(
		descriptor = "(Lfo;Luj;I)V"
	)
	class138(class139 var1, Buffer var2, int var3) {
		this.this$0 = var1; // L: 72
		this.val$p = var2;
		this.val$version = var3;
	}

	public Object call() {
		this.this$0.method3163(this.val$p, this.val$version); // L: 75
		return null; // L: 76
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	public static void method3158() {
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear(); // L: 94
	} // L: 95

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "721798432"
	)
	static int method3161(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) { // L: 4510
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = class241.loadWorlds() ? 1 : 0; // L: 4511
			return 1; // L: 4512
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) { // L: 4514
				var9 = Language.worldListStart(); // L: 4515
				if (var9 != null) { // L: 4516
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var9.id; // L: 4517
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var9.properties; // L: 4518
					Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var9.activity; // L: 4519
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var9.location; // L: 4520
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var9.population; // L: 4521
					Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var9.host; // L: 4522
				} else {
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = -1; // L: 4525
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 4526
					Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = ""; // L: 4527
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 4528
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 4529
					Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = ""; // L: 4530
				}

				return 1; // L: 4532
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) { // L: 4534
				var9 = WorldMapData_0.getNextWorldListWorld(); // L: 4535
				if (var9 != null) { // L: 4536
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var9.id; // L: 4537
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var9.properties; // L: 4538
					Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var9.activity; // L: 4539
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var9.location; // L: 4540
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var9.population; // L: 4541
					Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var9.host; // L: 4542
				} else {
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = -1; // L: 4545
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 4546
					Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = ""; // L: 4547
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 4548
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 4549
					Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = ""; // L: 4550
				}

				return 1; // L: 4552
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) { // L: 4554
					var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 4555
					var7 = null; // L: 4556

					for (var8 = 0; var8 < World.World_count; ++var8) { // L: 4557
						if (var3 == class361.World_worlds[var8].id) { // L: 4558
							var7 = class361.World_worlds[var8]; // L: 4559
							break;
						}
					}

					if (var7 != null) { // L: 4563
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var7.id; // L: 4564
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var7.properties; // L: 4565
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var7.activity; // L: 4566
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var7.location; // L: 4567
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var7.population; // L: 4568
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var7.host; // L: 4569
					} else {
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = -1; // L: 4572
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 4573
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = ""; // L: 4574
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 4575
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 4576
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = ""; // L: 4577
					}

					return 1; // L: 4579
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) { // L: 4581
					class517.Interpreter_intStackSize -= 4; // L: 4582
					var3 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 4583
					boolean var10 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1] == 1; // L: 4584
					var8 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 2]; // L: 4585
					boolean var6 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 3] == 1; // L: 4586
					PacketWriter.sortWorldList(var3, var10, var8, var6); // L: 4587
					return 1; // L: 4588
				} else if (var0 != 6511) { // L: 4590
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) { // L: 4611
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 4612
						return 1; // L: 4613
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) { // L: 4615
							class517.Interpreter_intStackSize -= 2; // L: 4616
							var3 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 4617
							var4 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 4618
							var5 = Frames.getParamDefinition(var4); // L: 4619
							if (var5.isString()) { // L: 4620
								Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = VerticalAlignment.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4621
							} else {
								Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = VerticalAlignment.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4624
							}

							return 1; // L: 4626
						} else if (var0 == ScriptOpcodes.LC_PARAM) { // L: 4628
							class517.Interpreter_intStackSize -= 2; // L: 4629
							var3 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 4630
							var4 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 4631
							var5 = Frames.getParamDefinition(var4); // L: 4632
							if (var5.isString()) { // L: 4633
								Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = WorldMapSection2.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4634
							} else {
								Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = WorldMapSection2.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4637
							}

							return 1; // L: 4639
						} else if (var0 == ScriptOpcodes.OC_PARAM) { // L: 4641
							class517.Interpreter_intStackSize -= 2; // L: 4642
							var3 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 4643
							var4 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 4644
							var5 = Frames.getParamDefinition(var4); // L: 4645
							if (var5.isString()) { // L: 4646
								Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = class214.ItemComposition_get(var3).getStringParam(var4, var5.defaultStr); // L: 4647
							} else {
								Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = class214.ItemComposition_get(var3).getIntParam(var4, var5.defaultInt); // L: 4650
							}

							return 1; // L: 4652
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) { // L: 4654
							class517.Interpreter_intStackSize -= 2; // L: 4655
							var3 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 4656
							var4 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 4657
							var5 = Frames.getParamDefinition(var4); // L: 4658
							if (var5.isString()) { // L: 4659
								Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = NameableContainer.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4660
							} else {
								Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = NameableContainer.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4663
							}

							return 1; // L: 4665
						} else if (var0 == ScriptOpcodes.ON_MOBILE) { // L: 4667
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0; // L: 4668
							return 1; // L: 4669
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) { // L: 4671
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Client.clientType; // L: 4672
							return 1; // L: 4673
						} else if (var0 == 6520) { // L: 4675
							return 1; // L: 4676
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) { // L: 4678
							return 1; // L: 4679
						} else if (var0 == 6522) { // L: 4681
							--class127.Interpreter_stringStackSize; // L: 4682
							--class517.Interpreter_intStackSize; // L: 4683
							return 1; // L: 4684
						} else if (var0 == 6523) { // L: 4686
							--class127.Interpreter_stringStackSize; // L: 4687
							--class517.Interpreter_intStackSize; // L: 4688
							return 1; // L: 4689
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) { // L: 4691
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = -1; // L: 4692
							return 1; // L: 4693
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) { // L: 4695
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 1; // L: 4696
							return 1; // L: 4697
						} else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) { // L: 4699
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 1; // L: 4700
							return 1; // L: 4701
						} else if (var0 == 6527) { // L: 4703
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Client.field490; // L: 4704
							return 1; // L: 4705
						} else {
							return 2; // L: 4707
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 4591
					if (var3 >= 0 && var3 < World.World_count) { // L: 4592
						var7 = class361.World_worlds[var3]; // L: 4593
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var7.id; // L: 4594
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var7.properties; // L: 4595
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var7.activity; // L: 4596
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var7.location; // L: 4597
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var7.population; // L: 4598
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var7.host; // L: 4599
					} else {
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = -1; // L: 4602
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 4603
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = ""; // L: 4604
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 4605
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 4606
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = ""; // L: 4607
					}

					return 1; // L: 4609
				}
			}
		}
	}

	@ObfuscatedName("nu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1926894842"
	)
	@Export("Clan_joinChat")
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) { // L: 12692
			PacketBufferNode var1 = class113.getPacketBufferNode(ClientPacket.field3188, Client.packetWriter.isaacCipher); // L: 12694
			var1.packetBuffer.writeByte(ClanChannel.stringCp1252NullTerminatedByteSize(var0)); // L: 12695
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 12696
			Client.packetWriter.addNode(var1); // L: 12697
		}
	} // L: 12698
}
