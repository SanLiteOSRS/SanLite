import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ji")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "[Lji;"
	)
	@Export("PacketBufferNode_packetBufferNodes")
	static PacketBufferNode[] PacketBufferNode_packetBufferNodes;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 491378593
	)
	@Export("PacketBufferNode_packetBufferNodeCount")
	static int PacketBufferNode_packetBufferNodeCount;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	@Export("clientPacket")
	ClientPacket clientPacket;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 931538281
	)
	@Export("clientPacketLength")
	int clientPacketLength;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	@Export("packetBuffer")
	public PacketBuffer packetBuffer;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -534137851
	)
	@Export("index")
	public int index;

	static {
		PacketBufferNode_packetBufferNodes = new PacketBufferNode[300]; // L: 13
		PacketBufferNode_packetBufferNodeCount = 0; // L: 14
	}

	PacketBufferNode() {
	} // L: 19

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-152464347"
	)
	@Export("release")
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) { // L: 61
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this; // L: 62
		}
	} // L: 63

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILbc;ZS)I",
		garbageValue = "256"
	)
	static int method5196(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.OC_NAME) { // L: 3438
			var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 3439
			Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = class258.ItemComposition_get(var3).name; // L: 3440
			return 1; // L: 3441
		} else {
			int var4;
			ItemComposition var5;
			if (var0 == ScriptOpcodes.OC_OP) { // L: 3443
				TaskHandler.Interpreter_intStackSize -= 2; // L: 3444
				var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 3445
				var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 3446
				var5 = class258.ItemComposition_get(var3); // L: 3447
				if (var4 >= 1 && var4 <= 5 && var5.groundActions[var4 - 1] != null) {
					Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var5.groundActions[var4 - 1]; // L: 3448
				} else {
					Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = ""; // L: 3449
				}

				return 1; // L: 3450
			} else if (var0 == ScriptOpcodes.OC_IOP) { // L: 3452
				TaskHandler.Interpreter_intStackSize -= 2; // L: 3453
				var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 3454
				var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 3455
				var5 = class258.ItemComposition_get(var3); // L: 3456
				if (var4 >= 1 && var4 <= 5 && var5.inventoryActions[var4 - 1] != null) { // L: 3457
					Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var5.inventoryActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = ""; // L: 3458
				}

				return 1; // L: 3459
			} else if (var0 == ScriptOpcodes.OC_COST) { // L: 3461
				var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 3462
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class258.ItemComposition_get(var3).price; // L: 3463
				return 1; // L: 3464
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) { // L: 3466
				var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 3467
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class258.ItemComposition_get(var3).isStackable == 1 ? 1 : 0; // L: 3468
				return 1; // L: 3469
			} else {
				ItemComposition var7;
				if (var0 == ScriptOpcodes.OC_CERT) { // L: 3471
					var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 3472
					var7 = class258.ItemComposition_get(var3); // L: 3473
					if (var7.noteTemplate == -1 && var7.note >= 0) { // L: 3474
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3; // L: 3475
					}

					return 1; // L: 3476
				} else if (var0 == ScriptOpcodes.OC_UNCERT) { // L: 3478
					var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 3479
					var7 = class258.ItemComposition_get(var3); // L: 3480
					if (var7.noteTemplate >= 0 && var7.note >= 0) { // L: 3481
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3; // L: 3482
					}

					return 1; // L: 3483
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) { // L: 3485
					var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 3486
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class258.ItemComposition_get(var3).isMembersOnly ? 1 : 0; // L: 3487
					return 1; // L: 3488
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) { // L: 3490
					var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 3491
					var7 = class258.ItemComposition_get(var3); // L: 3492
					if (var7.placeholderTemplate == -1 && var7.placeholder >= 0) { // L: 3493
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3; // L: 3494
					}

					return 1; // L: 3495
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) { // L: 3497
					var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 3498
					var7 = class258.ItemComposition_get(var3); // L: 3499
					if (var7.placeholderTemplate >= 0 && var7.placeholder >= 0) { // L: 3500
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3; // L: 3501
					}

					return 1; // L: 3502
				} else if (var0 == ScriptOpcodes.OC_FIND) { // L: 3504
					String var6 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]; // L: 3505
					var4 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 3506
					class193.findItemDefinitions(var6, var4 == 1); // L: 3507
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class127.foundItemIdCount; // L: 3508
					return 1; // L: 3509
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) { // L: 3511
					if (var0 == ScriptOpcodes.OC_FINDRESET) { // L: 3516
						WorldMapSection2.foundItemIndex = 0; // L: 3517
						return 1; // L: 3518
					} else if (var0 == 4213) { // L: 3520
						var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 3521
						var4 = class258.ItemComposition_get(var3).getShiftClickIndex(); // L: 3522
						if (var4 == -1) { // L: 3523
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var4; // L: 3524
						} else {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var4 + 1; // L: 3527
						}

						return 1; // L: 3529
					} else {
						return 2; // L: 3531
					}
				} else {
					if (WorldMapData_1.foundItemIds != null && WorldMapSection2.foundItemIndex < class127.foundItemIdCount) { // L: 3512
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = WorldMapData_1.foundItemIds[++WorldMapSection2.foundItemIndex - 1] & '\uffff'; // L: 3513
					} else {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1;
					}

					return 1; // L: 3514
				}
			}
		}
	}
}
