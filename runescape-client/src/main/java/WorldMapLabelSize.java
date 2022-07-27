import java.awt.Component;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hy")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("tx")
	@ObfuscatedGetter(
		intValue = 250890624
	)
	static int field2673;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lhy;"
	)
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lhy;"
	)
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lhy;"
	)
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("jz")
	@ObfuscatedGetter(
		intValue = 797881643
	)
	@Export("cameraX")
	static int cameraX;
	@ObfuscatedName("pf")
	@ObfuscatedGetter(
		intValue = -1936766189
	)
	static int field2667;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -33133369
	)
	final int field2663;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 405844709
	)
	final int field2660;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1054164177
	)
	final int field2661;

	static {
		WorldMapLabelSize_small = new WorldMapLabelSize(1, 0, 4); // L: 7
		WorldMapLabelSize_medium = new WorldMapLabelSize(0, 1, 2); // L: 8
		WorldMapLabelSize_large = new WorldMapLabelSize(2, 2, 0); // L: 9
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field2663 = var1; // L: 15
		this.field2660 = var2; // L: 16
		this.field2661 = var3; // L: 17
	} // L: 18

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(FB)Z",
		garbageValue = "-55"
	)
	boolean method4533(float var1) {
		return var1 >= (float)this.field2661; // L: 21
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "1029928300"
	)
	static void method4535(Component var0) {
		var0.setFocusTraversalKeysEnabled(false);
		var0.addKeyListener(KeyHandler.KeyHandler_instance); // L: 125
		var0.addFocusListener(KeyHandler.KeyHandler_instance);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)Lhy;",
		garbageValue = "487763242"
	)
	static WorldMapLabelSize method4534(int var0) {
		WorldMapLabelSize[] var1 = new WorldMapLabelSize[]{WorldMapLabelSize_small, WorldMapLabelSize_large, WorldMapLabelSize_medium}; // L: 28
		WorldMapLabelSize[] var2 = var1; // L: 30

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 31
			WorldMapLabelSize var4 = var2[var3]; // L: 32
			if (var0 == var4.field2660) { // L: 34
				return var4; // L: 35
			}
		}

		return null; // L: 40
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqy;S)V",
		garbageValue = "30541"
	)
	static final void method4532(PacketBuffer var0) {
		int var1 = 0; // L: 81
		var0.importIndex(); // L: 82

		byte[] var10000;
		int var2;
		int var4;
		int var5;
		for (var2 = 0; var2 < Players.Players_count; ++var2) { // L: 83
			var5 = Players.Players_indices[var2]; // L: 84
			if ((Players.field1293[var5] & 1) == 0) { // L: 85
				if (var1 > 0) { // L: 86
					--var1; // L: 87
					var10000 = Players.field1293; // L: 88
					var10000[var5] = (byte)(var10000[var5] | 2);
				} else {
					var4 = var0.readBits(1); // L: 91
					if (var4 == 0) { // L: 92
						var1 = class78.method2158(var0); // L: 93
						var10000 = Players.field1293; // L: 94
						var10000[var5] = (byte)(var10000[var5] | 2);
					} else {
						class259.readPlayerUpdate(var0, var5); // L: 97
					}
				}
			}
		}

		var0.exportIndex(); // L: 100
		if (var1 != 0) { // L: 101
			throw new RuntimeException(); // L: 102
		} else {
			var0.importIndex(); // L: 104

			for (var2 = 0; var2 < Players.Players_count; ++var2) { // L: 105
				var5 = Players.Players_indices[var2]; // L: 106
				if ((Players.field1293[var5] & 1) != 0) { // L: 107
					if (var1 > 0) { // L: 108
						--var1; // L: 109
						var10000 = Players.field1293; // L: 110
						var10000[var5] = (byte)(var10000[var5] | 2);
					} else {
						var4 = var0.readBits(1); // L: 113
						if (var4 == 0) { // L: 114
							var1 = class78.method2158(var0); // L: 115
							var10000 = Players.field1293; // L: 116
							var10000[var5] = (byte)(var10000[var5] | 2);
						} else {
							class259.readPlayerUpdate(var0, var5); // L: 119
						}
					}
				}
			}

			var0.exportIndex(); // L: 122
			if (var1 != 0) { // L: 123
				throw new RuntimeException(); // L: 124
			} else {
				var0.importIndex(); // L: 126

				for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) { // L: 127
					var5 = Players.Players_emptyIndices[var2]; // L: 128
					if ((Players.field1293[var5] & 1) != 0) { // L: 129
						if (var1 > 0) { // L: 130
							--var1; // L: 131
							var10000 = Players.field1293; // L: 132
							var10000[var5] = (byte)(var10000[var5] | 2);
						} else {
							var4 = var0.readBits(1); // L: 135
							if (var4 == 0) { // L: 136
								var1 = class78.method2158(var0); // L: 137
								var10000 = Players.field1293; // L: 138
								var10000[var5] = (byte)(var10000[var5] | 2);
							} else if (WorldMapSectionType.updateExternalPlayer(var0, var5)) { // L: 141
								var10000 = Players.field1293;
								var10000[var5] = (byte)(var10000[var5] | 2);
							}
						}
					}
				}

				var0.exportIndex(); // L: 144
				if (var1 != 0) { // L: 145
					throw new RuntimeException(); // L: 146
				} else {
					var0.importIndex(); // L: 148

					for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) { // L: 149
						var5 = Players.Players_emptyIndices[var2]; // L: 150
						if ((Players.field1293[var5] & 1) == 0) { // L: 151
							if (var1 > 0) { // L: 152
								--var1; // L: 153
								var10000 = Players.field1293; // L: 154
								var10000[var5] = (byte)(var10000[var5] | 2);
							} else {
								var4 = var0.readBits(1); // L: 157
								if (var4 == 0) { // L: 158
									var1 = class78.method2158(var0); // L: 159
									var10000 = Players.field1293; // L: 160
									var10000[var5] = (byte)(var10000[var5] | 2);
								} else if (WorldMapSectionType.updateExternalPlayer(var0, var5)) { // L: 163
									var10000 = Players.field1293;
									var10000[var5] = (byte)(var10000[var5] | 2);
								}
							}
						}
					}

					var0.exportIndex(); // L: 166
					if (var1 != 0) { // L: 167
						throw new RuntimeException(); // L: 168
					} else {
						Players.Players_count = 0; // L: 170
						Players.Players_emptyIdxCount = 0; // L: 171

						for (var2 = 1; var2 < 2048; ++var2) { // L: 172
							var10000 = Players.field1293; // L: 173
							var10000[var2] = (byte)(var10000[var2] >> 1);
							Player var3 = Client.players[var2]; // L: 174
							if (var3 != null) { // L: 175
								Players.Players_indices[++Players.Players_count - 1] = var2;
							} else {
								Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var2; // L: 176
							}
						}

					}
				}
			}
		}
	} // L: 178

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILku;IIIII[FB)Lku;",
		garbageValue = "94"
	)
	static Widget method4542(int var0, Widget var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
		Widget var8 = new Widget(); // L: 928
		var8.type = var0; // L: 929
		var8.parentId = var1.id; // L: 930
		var8.childIndex = var2; // L: 931
		var8.isIf3 = true; // L: 932
		var8.xAlignment = var3; // L: 933
		var8.yAlignment = var4; // L: 934
		var8.widthAlignment = var5; // L: 935
		var8.heightAlignment = var6; // L: 936
		var8.rawX = (int)(var7[0] * (float)var1.width); // L: 937
		var8.rawY = (int)((float)var1.height * var7[1]); // L: 938
		var8.rawWidth = (int)((float)var1.width * var7[2]); // L: 939
		var8.rawHeight = (int)(var7[3] * (float)var1.height); // L: 940
		return var8; // L: 941
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILbc;ZI)I",
		garbageValue = "641313023"
	)
	static int method4539(int var0, Script var1, boolean var2) {
		if (var0 == 6900) { // L: 4550
			Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = ""; // L: 4551
			return 1; // L: 4552
		} else if (var0 == 6950) { // L: 4554
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1; // L: 4555
			return 1; // L: 4556
		} else {
			return 2; // L: 4558
		}
	}

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "([Lku;II)V",
		garbageValue = "-2014511302"
	)
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 11746
			Widget var3 = var0[var2]; // L: 11747
			if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !ModeWhere.isComponentHidden(var3))) { // L: 11748 11749 11750
				if (var3.type == 0) { // L: 11751
					if (!var3.isIf3 && ModeWhere.isComponentHidden(var3) && var3 != FontName.mousedOverWidgetIf1) { // L: 11752
						continue;
					}

					drawModelComponents(var0, var3.id); // L: 11753
					if (var3.children != null) { // L: 11754
						drawModelComponents(var3.children, var3.id);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 11755
					if (var4 != null) { // L: 11756
						ReflectionCheck.method610(var4.group);
					}
				}

				if (var3.type == 6) { // L: 11758
					int var5;
					if (var3.sequenceId != -1 || var3.sequenceId2 != -1) { // L: 11759
						boolean var7 = FriendSystem.runCs1(var3); // L: 11760
						if (var7) { // L: 11762
							var5 = var3.sequenceId2;
						} else {
							var5 = var3.sequenceId; // L: 11763
						}

						if (var5 != -1) { // L: 11764
							SequenceDefinition var6 = class14.SequenceDefinition_get(var5); // L: 11765

							for (var3.modelFrameCycle += Client.field744; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; class220.invalidateWidget(var3)) { // L: 11766 11767 11774
								var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame]; // L: 11768
								++var3.modelFrame; // L: 11769
								if (var3.modelFrame >= var6.frameIds.length) { // L: 11770
									var3.modelFrame -= var6.frameCount; // L: 11771
									if (var3.modelFrame < 0 || var3.modelFrame >= var6.frameIds.length) { // L: 11772
										var3.modelFrame = 0;
									}
								}
							}
						}
					}

					if (var3.field3422 != 0 && !var3.isIf3) { // L: 11778
						int var8 = var3.field3422 >> 16; // L: 11779
						var5 = var3.field3422 << 16 >> 16; // L: 11780
						var8 *= Client.field744; // L: 11781
						var5 *= Client.field744; // L: 11782
						var3.modelAngleX = var8 + var3.modelAngleX & 2047; // L: 11783
						var3.modelAngleY = var5 + var3.modelAngleY & 2047; // L: 11784
						class220.invalidateWidget(var3); // L: 11785
					}
				}
			}
		}

	} // L: 11789
}
