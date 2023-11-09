import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cb")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
	@ObfuscatedName("at")
	@Export("filterWorlds")
	boolean filterWorlds;

	GrandExchangeOfferOwnWorldComparator() {
	} // L: 12886

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lod;Lod;B)I",
		garbageValue = "-2"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		if (var2.world == var1.world) { // L: 12889
			return 0;
		} else {
			if (this.filterWorlds) { // L: 12890
				if (Client.worldId == var1.world) { // L: 12891
					return -1;
				}

				if (var2.world == Client.worldId) { // L: 12892
					return 1;
				}
			}

			return var1.world < var2.world ? -1 : 1; // L: 12894
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 12898
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 12902
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "-353159038"
	)
	static int method1195(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.CC_CREATE) { // L: 479
			Interpreter.Interpreter_intStackSize -= 3; // L: 480
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 481
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 482
			int var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 483
			if (var4 == 0) { // L: 484
				throw new RuntimeException(); // L: 485
			} else {
				Widget var6 = FriendSystem.getWidget(var9); // L: 487
				if (var6.children == null) { // L: 488
					var6.children = new Widget[var11 + 1];
				}

				if (var6.children.length <= var11) { // L: 489
					Widget[] var7 = new Widget[var11 + 1]; // L: 490

					for (int var8 = 0; var8 < var6.children.length; ++var8) { // L: 491
						var7[var8] = var6.children[var8];
					}

					var6.children = var7; // L: 492
				}

				if (var11 > 0 && var6.children[var11 - 1] == null) { // L: 494
					throw new RuntimeException("" + (var11 - 1));
				} else {
					Widget var12 = new Widget(); // L: 495
					var12.type = var4; // L: 496
					var12.parentId = var12.id = var6.id; // L: 497
					var12.childIndex = var11; // L: 498
					var12.isIf3 = true; // L: 499
					if (var4 == 12) { // L: 500
						var12.method6459(); // L: 501
						var12.method6380().method6103(new class104(var12)); // L: 502
						var12.method6380().method6271(new class105(var12)); // L: 512
					}

					var6.children[var11] = var12; // L: 523
					if (var2) { // L: 524
						class53.scriptDotWidget = var12;
					} else {
						Interpreter.field864 = var12; // L: 525
					}

					Messages.invalidateWidget(var6); // L: 526
					return 1; // L: 527
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) { // L: 529
				var3 = var2 ? class53.scriptDotWidget : Interpreter.field864; // L: 530
				Widget var10 = FriendSystem.getWidget(var3.id); // L: 531
				var10.children[var3.childIndex] = null; // L: 532
				Messages.invalidateWidget(var10); // L: 533
				return 1; // L: 534
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) { // L: 536
				var3 = FriendSystem.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 537
				var3.children = null; // L: 538
				Messages.invalidateWidget(var3); // L: 539
				return 1; // L: 540
			} else if (var0 != ScriptOpcodes.CC_FIND) { // L: 542
				if (var0 == ScriptOpcodes.IF_FIND) { // L: 555
					var3 = FriendSystem.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 556
					if (var3 != null) { // L: 557
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 558
						if (var2) { // L: 559
							class53.scriptDotWidget = var3;
						} else {
							Interpreter.field864 = var3; // L: 560
						}
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 562
					}

					return 1; // L: 563
				} else {
					return 2; // L: 565
				}
			} else {
				Interpreter.Interpreter_intStackSize -= 2; // L: 543
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 544
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 545
				Widget var5 = class158.getWidgetChild(var9, var4); // L: 546
				if (var5 != null && var4 != -1) { // L: 547
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 548
					if (var2) { // L: 549
						class53.scriptDotWidget = var5;
					} else {
						Interpreter.field864 = var5; // L: 550
					}
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 552
				}

				return 1; // L: 553
			}
		}
	}

	@ObfuscatedName("me")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "50"
	)
	static final void method1194(int var0, int var1, boolean var2) {
		if (Client.currentClanChannels[var0] != null) { // L: 12612
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3346()) { // L: 12613
				ClanChannelMember var3 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1); // L: 12614
				PacketBufferNode var4 = ObjectComposition.getPacketBufferNode(ClientPacket.field3152, Client.packetWriter.isaacCipher); // L: 12615
				var4.packetBuffer.writeByte(4 + Widget.stringCp1252NullTerminatedByteSize(var3.username.getName())); // L: 12616
				var4.packetBuffer.writeByte(var0); // L: 12617
				var4.packetBuffer.writeShort(var1); // L: 12618
				var4.packetBuffer.writeBoolean(var2); // L: 12619
				var4.packetBuffer.writeStringCp1252NullTerminated(var3.username.getName()); // L: 12620
				Client.packetWriter.addNode(var4); // L: 12621
			}
		}
	} // L: 12622
}
