import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jt")
@Implements("Frames")
public class Frames extends DualNode {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 166856245
	)
	static int field2642;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Lia;"
	)
	@Export("frames")
	Animation[] frames;

	@ObfuscatedSignature(
		descriptor = "(Lnu;Lnu;IZ)V"
	)
	Frames(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		NodeDeque var5 = new NodeDeque();
		int var6 = var1.getGroupFileCount(var3);
		this.frames = new Animation[var6];
		int[] var7 = var1.getGroupFileIds(var3);

		for (int var8 = 0; var8 < var7.length; ++var8) {
			byte[] var9 = var1.takeFile(var3, var7[var8]);
			Skeleton var10 = null;
			int var11 = (var9[0] & 255) << 8 | var9[1] & 255; // L: 42

			for (Skeleton var12 = (Skeleton)var5.last(); var12 != null; var12 = (Skeleton)var5.previous()) { // L: 43 44 49
				if (var11 == var12.id) { // L: 45
					var10 = var12; // L: 46
					break;
				}
			}

			if (var10 == null) { // L: 51
				byte[] var13;
				if (var4) { // L: 53
					var13 = var2.getFile(0, var11);
				} else {
					var13 = var2.getFile(var11, 0); // L: 54
				}

				var10 = new Skeleton(var11, var13); // L: 55
				var5.addFirst(var10); // L: 56
			}

			this.frames[var7[var8]] = new Animation(var9, var10); // L: 58
		}

	} // L: 60

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-8394863"
	)
	@Export("hasAlphaTransform")
	public boolean hasAlphaTransform(int var1) {
		return this.frames[var1].hasAlphaTransform; // L: 63
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-292158439"
	)
	public static void method4723(int var0, int var1) {
		VarbitComposition var2 = class384.method7145(var0); // L: 33
		int var3 = var2.baseVar; // L: 34
		int var4 = var2.startBit; // L: 35
		int var5 = var2.endBit; // L: 36
		int var6 = Varps.Varps_masks[var5 - var4]; // L: 37
		if (var1 < 0 || var1 > var6) { // L: 38
			var1 = 0;
		}

		var6 <<= var4; // L: 39
		Varps.Varps_main[var3] = Varps.Varps_main[var3] & ~var6 | var1 << var4 & var6; // L: 40
	} // L: 41

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1760053534"
	)
	public static int method4722(int var0) {
		return class464.field4786[var0 & 16383]; // L: 28
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZB)I",
		garbageValue = "-8"
	)
	static int method4719(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.CC_CREATE) { // L: 483
			SoundCache.Interpreter_intStackSize -= 3; // L: 484
			var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 485
			var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 486
			int var11 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 2]; // L: 487
			if (var4 == 0) { // L: 488
				throw new RuntimeException(); // L: 489
			} else {
				Widget var6 = class92.getWidget(var9); // L: 491
				if (var6.children == null) { // L: 492
					var6.children = new Widget[var11 + 1];
				}

				if (var6.children.length <= var11) { // L: 493
					Widget[] var7 = new Widget[var11 + 1]; // L: 494

					for (int var8 = 0; var8 < var6.children.length; ++var8) { // L: 495
						var7[var8] = var6.children[var8];
					}

					var6.children = var7; // L: 496
				}

				if (var11 > 0 && var6.children[var11 - 1] == null) { // L: 498
					throw new RuntimeException("" + (var11 - 1));
				} else {
					Widget var12 = new Widget(); // L: 499
					var12.type = var4; // L: 500
					var12.parentId = var12.id = var6.id; // L: 501
					var12.childIndex = var11; // L: 502
					var12.isIf3 = true; // L: 503
					if (var4 == 12) { // L: 504
						var12.method6414(); // L: 505
						var12.method6532().method6153(new class105(var12)); // L: 506
						var12.method6532().method6152(new class106(var12)); // L: 516
					}

					var6.children[var11] = var12; // L: 527
					if (var2) { // L: 528
						GameObject.scriptDotWidget = var12;
					} else {
						SceneTilePaint.field2808 = var12; // L: 529
					}

					class218.invalidateWidget(var6); // L: 530
					return 1; // L: 531
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) { // L: 533
				var3 = var2 ? GameObject.scriptDotWidget : SceneTilePaint.field2808; // L: 534
				Widget var10 = class92.getWidget(var3.id); // L: 535
				var10.children[var3.childIndex] = null; // L: 536
				class218.invalidateWidget(var10); // L: 537
				return 1; // L: 538
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) { // L: 540
				var3 = class92.getWidget(Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]); // L: 541
				var3.children = null; // L: 542
				class218.invalidateWidget(var3); // L: 543
				return 1; // L: 544
			} else if (var0 != ScriptOpcodes.CC_FIND) { // L: 546
				if (var0 == ScriptOpcodes.IF_FIND) { // L: 559
					var3 = class92.getWidget(Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]); // L: 560
					if (var3 != null) { // L: 561
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 1; // L: 562
						if (var2) { // L: 563
							GameObject.scriptDotWidget = var3;
						} else {
							SceneTilePaint.field2808 = var3; // L: 564
						}
					} else {
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 566
					}

					return 1; // L: 567
				} else {
					return 2; // L: 569
				}
			} else {
				SoundCache.Interpreter_intStackSize -= 2; // L: 547
				var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 548
				var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 549
				Widget var5 = SoundCache.getWidgetChild(var9, var4); // L: 550
				if (var5 != null && var4 != -1) { // L: 551
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 1; // L: 552
					if (var2) { // L: 553
						GameObject.scriptDotWidget = var5;
					} else {
						SceneTilePaint.field2808 = var5; // L: 554
					}
				} else {
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 556
				}

				return 1; // L: 557
			}
		}
	}

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(ZLto;I)V",
		garbageValue = "101109035"
	)
	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1) {
		Client.field796 = 0; // L: 8748
		Client.field640 = 0; // L: 8749
		var1.importIndex(); // L: 8751
		int var2 = var1.readBits(8); // L: 8752
		int var3;
		if (var2 < Client.npcCount) { // L: 8753
			for (var3 = var2; var3 < Client.npcCount; ++var3) { // L: 8754
				Client.field552[++Client.field796 - 1] = Client.npcIndices[var3];
			}
		}

		if (var2 > Client.npcCount) { // L: 8756
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0; // L: 8757

			for (var3 = 0; var3 < var2; ++var3) { // L: 8758
				int var4 = Client.npcIndices[var3]; // L: 8759
				NPC var5 = Client.npcs[var4]; // L: 8760
				int var6 = var1.readBits(1); // L: 8761
				if (var6 == 0) { // L: 8762
					Client.npcIndices[++Client.npcCount - 1] = var4; // L: 8763
					var5.npcCycle = Client.cycle; // L: 8764
				} else {
					int var7 = var1.readBits(2); // L: 8767
					if (var7 == 0) { // L: 8768
						Client.npcIndices[++Client.npcCount - 1] = var4; // L: 8769
						var5.npcCycle = Client.cycle; // L: 8770
						Client.field737[++Client.field640 - 1] = var4; // L: 8771
					} else {
						int var8;
						int var9;
						if (var7 == 1) { // L: 8774
							Client.npcIndices[++Client.npcCount - 1] = var4; // L: 8775
							var5.npcCycle = Client.cycle; // L: 8776
							var8 = var1.readBits(3); // L: 8777
							var5.method2573(var8, class217.field2410); // L: 8778
							var9 = var1.readBits(1); // L: 8779
							if (var9 == 1) { // L: 8780
								Client.field737[++Client.field640 - 1] = var4;
							}
						} else if (var7 == 2) { // L: 8783
							Client.npcIndices[++Client.npcCount - 1] = var4; // L: 8784
							var5.npcCycle = Client.cycle; // L: 8785
							if (var1.readBits(1) == 1) { // L: 8786
								var8 = var1.readBits(3); // L: 8787
								var5.method2573(var8, class217.field2407); // L: 8788
								var9 = var1.readBits(3); // L: 8789
								var5.method2573(var9, class217.field2407); // L: 8790
							} else {
								var8 = var1.readBits(3); // L: 8793
								var5.method2573(var8, class217.field2406); // L: 8794
							}

							var8 = var1.readBits(1); // L: 8796
							if (var8 == 1) { // L: 8797
								Client.field737[++Client.field640 - 1] = var4;
							}
						} else if (var7 == 3) { // L: 8800
							Client.field552[++Client.field796 - 1] = var4; // L: 8801
						}
					}
				}
			}

			class349.method6619(var0, var1); // L: 8806
			class151.method3155(var1); // L: 8807

			for (var2 = 0; var2 < Client.field796; ++var2) { // L: 8808
				var3 = Client.field552[var2]; // L: 8809
				if (Client.npcs[var3].npcCycle != Client.cycle) { // L: 8810
					Client.npcs[var3].definition = null; // L: 8811
					Client.npcs[var3] = null; // L: 8812
				}
			}

			if (var1.offset != Client.packetWriter.serverPacketLength) { // L: 8815
				throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength); // L: 8816
			} else {
				for (var2 = 0; var2 < Client.npcCount; ++var2) { // L: 8818
					if (Client.npcs[Client.npcIndices[var2]] == null) { // L: 8819
						throw new RuntimeException(var2 + "," + Client.npcCount); // L: 8820
					}
				}

			}
		}
	} // L: 8823

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1066961664"
	)
	static void method4718() {
		Client.menuOptionsCount = 0; // L: 9197
		Client.isMenuOpen = false; // L: 9198
	} // L: 9199
}
