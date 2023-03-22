import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hy")
final class class199 implements ThreadFactory {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 352168865
	)
	public static int field2093;
	@ObfuscatedName("cd")
	static String field2088;

	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS Maya Anim Load"); // L: 447
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILcv;ZI)I",
		garbageValue = "316630129"
	)
	static int method3795(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.CC_CREATE) { // L: 485
			Interpreter.Interpreter_intStackSize -= 3; // L: 486
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 487
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 488
			int var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 489
			if (var4 == 0) { // L: 490
				throw new RuntimeException(); // L: 491
			} else {
				Widget var6 = WorldMapSection1.getWidget(var9); // L: 493
				if (var6.children == null) { // L: 494
					var6.children = new Widget[var11 + 1];
				}

				if (var6.children.length <= var11) { // L: 495
					Widget[] var7 = new Widget[var11 + 1]; // L: 496

					for (int var8 = 0; var8 < var6.children.length; ++var8) { // L: 497
						var7[var8] = var6.children[var8];
					}

					var6.children = var7; // L: 498
				}

				if (var11 > 0 && var6.children[var11 - 1] == null) { // L: 500
					throw new RuntimeException("" + (var11 - 1));
				} else {
					Widget var12 = new Widget(); // L: 501
					var12.type = var4; // L: 502
					var12.parentId = var12.id = var6.id; // L: 503
					var12.childIndex = var11; // L: 504
					var12.isIf3 = true; // L: 505
					if (var4 == 12) { // L: 506
						var12.method6117(); // L: 507
						var12.method6118().method5864(new class102(var12)); // L: 508
						var12.method6118().method5851(new class103(var12)); // L: 518
					}

					var6.children[var11] = var12; // L: 529
					if (var2) { // L: 530
						GameObject.scriptDotWidget = var12;
					} else {
						SoundSystem.field319 = var12; // L: 531
					}

					class69.invalidateWidget(var6); // L: 532
					return 1; // L: 533
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) { // L: 535
				var3 = var2 ? GameObject.scriptDotWidget : SoundSystem.field319; // L: 536
				Widget var10 = WorldMapSection1.getWidget(var3.id); // L: 537
				var10.children[var3.childIndex] = null; // L: 538
				class69.invalidateWidget(var10); // L: 539
				return 1; // L: 540
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) { // L: 542
				var3 = WorldMapSection1.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 543
				var3.children = null; // L: 544
				class69.invalidateWidget(var3); // L: 545
				return 1; // L: 546
			} else if (var0 != ScriptOpcodes.CC_FIND) { // L: 548
				if (var0 == ScriptOpcodes.IF_FIND) { // L: 561
					var3 = WorldMapSection1.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 562
					if (var3 != null) { // L: 563
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 564
						if (var2) { // L: 565
							GameObject.scriptDotWidget = var3;
						} else {
							SoundSystem.field319 = var3; // L: 566
						}
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 568
					}

					return 1; // L: 569
				} else {
					return 2; // L: 571
				}
			} else {
				Interpreter.Interpreter_intStackSize -= 2; // L: 549
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 550
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 551
				Widget var5 = class36.getWidgetChild(var9, var4); // L: 552
				if (var5 != null && var4 != -1) { // L: 553
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 554
					if (var2) { // L: 555
						GameObject.scriptDotWidget = var5;
					} else {
						SoundSystem.field319 = var5; // L: 556
					}
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 558
				}

				return 1; // L: 559
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(CLnq;B)I",
		garbageValue = "122"
	)
	@Export("lowercaseChar")
	static int lowercaseChar(char var0, Language var1) {
		int var2 = var0 << 4; // L: 104
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) { // L: 105
			var0 = Character.toLowerCase(var0); // L: 106
			var2 = (var0 << 4) + 1; // L: 107
		}

		if (var0 == 241 && var1 == Language.Language_ES) { // L: 109
			var2 = 1762;
		}

		return var2; // L: 110
	}

	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-629099983"
	)
	static final void method3798(int var0, int var1) {
		if (Client.currentClanChannels[var0] != null) { // L: 12036
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3329()) { // L: 12037
				ClanChannelMember var2 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1); // L: 12038
				if (var2.rank == -1) { // L: 12039
					PacketBufferNode var3 = UserComparator9.getPacketBufferNode(ClientPacket.field3144, Client.packetWriter.isaacCipher); // L: 12040
					var3.packetBuffer.writeByte(3 + WorldMapLabel.stringCp1252NullTerminatedByteSize(var2.username.getName())); // L: 12041
					var3.packetBuffer.writeByte(var0); // L: 12042
					var3.packetBuffer.writeShort(var1); // L: 12043
					var3.packetBuffer.writeStringCp1252NullTerminated(var2.username.getName()); // L: 12044
					Client.packetWriter.addNode(var3); // L: 12045
				}
			}
		}
	} // L: 12046
}
