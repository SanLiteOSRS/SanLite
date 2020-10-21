import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gc")
@Implements("ModeWhere")
public enum ModeWhere implements Enumerated {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lgc;"
	)
	field2400("", 0, new class200[]{class200.field2392}),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Lgc;"
	)
	field2396("", 1, new class200[]{class200.field2390, class200.field2392}),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "Lgc;"
	)
	field2395("", 2, new class200[]{class200.field2390, class200.field2391, class200.field2392}),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lgc;"
	)
	field2398("", 3, new class200[]{class200.field2390}),
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lgc;"
	)
	field2397("", 4),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Lgc;"
	)
	field2405("", 5, new class200[]{class200.field2390, class200.field2392}),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lgc;"
	)
	field2402("", 6, new class200[]{class200.field2392}),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "Lgc;"
	)
	field2401("", 8, new class200[]{class200.field2390, class200.field2392}),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Lgc;"
	)
	field2403("", 9, new class200[]{class200.field2390, class200.field2391}),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "Lgc;"
	)
	field2404("", 10, new class200[]{class200.field2390}),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "Lgc;"
	)
	field2409("", 11, new class200[]{class200.field2390}),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lgc;"
	)
	field2406("", 12, new class200[]{class200.field2390, class200.field2392}),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "Lgc;"
	)
	field2407("", 13, new class200[]{class200.field2390});

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		signature = "Lef;"
	)
	@Export("scene")
	static Scene scene;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 797439581
	)
	@Export("id")
	final int id;
	@ObfuscatedName("p")
	final Set field2399;

	static {
		method3813();
	}

	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I[Lgj;)V"
	)
	ModeWhere(String var3, int var4, class200[] var5) {
		this.field2399 = new HashSet();
		this.id = var4;
		class200[] var6 = var5;

		for (int var7 = 0; var7 < var6.length; ++var7) {
			class200 var8 = var6[var7];
			this.field2399.add(var8);
		}

	}

	ModeWhere(String var3, int var4) {
		this.field2399 = new HashSet();
		this.id = var4;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "23"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(B)[Lgc;",
		garbageValue = "52"
	)
	static ModeWhere[] method3813() {
		return new ModeWhere[]{field2404, field2409, field2396, field2403, field2401, field2406, field2395, field2400, field2402, field2397, field2405, field2398, field2407};
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(Llc;IIII)V",
		garbageValue = "13725684"
	)
	static void method3814(SpritePixels var0, int var1, int var2, int var3) {
		WorldMapRegion.WorldMapRegion_cachedSprites.put(var0, class8.method117(var1, var2, var3), var0.pixels.length * 4);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "([Lcf;II[I[IB)V",
		garbageValue = "48"
	)
	@Export("sortWorlds")
	static void sortWorlds(World[] var0, int var1, int var2, int[] var3, int[] var4) {
		if (var1 < var2) {
			int var5 = var1 - 1;
			int var6 = var2 + 1;
			int var7 = (var2 + var1) / 2;
			World var8 = var0[var7];
			var0[var7] = var0[var1];
			var0[var1] = var8;

			while (var5 < var6) {
				boolean var9 = true;

				int var10;
				int var11;
				int var12;
				do {
					--var6;

					for (var10 = 0; var10 < 4; ++var10) {
						if (var3[var10] == 2) {
							var11 = var0[var6].index;
							var12 = var8.index;
						} else if (var3[var10] == 1) {
							var11 = var0[var6].population;
							var12 = var8.population;
							if (var11 == -1 && var4[var10] == 1) {
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) {
								var12 = 2001;
							}
						} else if (var3[var10] == 3) {
							var11 = var0[var6].isMembersOnly() ? 1 : 0;
							var12 = var8.isMembersOnly() ? 1 : 0;
						} else {
							var11 = var0[var6].id;
							var12 = var8.id;
						}

						if (var12 != var11) {
							if ((var4[var10] != 1 || var11 <= var12) && (var4[var10] != 0 || var11 >= var12)) {
								var9 = false;
							}
							break;
						}

						if (var10 == 3) {
							var9 = false;
						}
					}
				} while(var9);

				var9 = true;

				do {
					++var5;

					for (var10 = 0; var10 < 4; ++var10) {
						if (var3[var10] == 2) {
							var11 = var0[var5].index;
							var12 = var8.index;
						} else if (var3[var10] == 1) {
							var11 = var0[var5].population;
							var12 = var8.population;
							if (var11 == -1 && var4[var10] == 1) {
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) {
								var12 = 2001;
							}
						} else if (var3[var10] == 3) {
							var11 = var0[var5].isMembersOnly() ? 1 : 0;
							var12 = var8.isMembersOnly() ? 1 : 0;
						} else {
							var11 = var0[var5].id;
							var12 = var8.id;
						}

						if (var12 != var11) {
							if ((var4[var10] != 1 || var11 >= var12) && (var4[var10] != 0 || var11 <= var12)) {
								var9 = false;
							}
							break;
						}

						if (var10 == 3) {
							var9 = false;
						}
					}
				} while(var9);

				if (var5 < var6) {
					World var13 = var0[var5];
					var0[var5] = var0[var6];
					var0[var6] = var13;
				}
			}

			sortWorlds(var0, var1, var6, var3, var4);
			sortWorlds(var0, var6 + 1, var2, var3, var4);
		}

	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(Leh;IIIB)Z",
		garbageValue = "127"
	)
	static final boolean method3818(Model var0, int var1, int var2, int var3) {
		if (!WorldMapSection2.method425()) {
			return false;
		} else {
			class238.method4271();
			int var4 = var0.xMid + var1;
			int var5 = var2 + var0.yMid;
			int var6 = var3 + var0.zMid;
			int var7 = var0.xMidOffset;
			int var8 = var0.yMidOffset;
			int var9 = var0.zMidOffset;
			int var10 = ViewportMouse.field1770 - var4;
			int var11 = WorldMapEvent.field377 - var5;
			int var12 = ViewportMouse.field1768 - var6;
			if (Math.abs(var10) > var7 + class1.field3) {
				return false;
			} else if (Math.abs(var11) > var8 + ItemContainer.field570) {
				return false;
			} else if (Math.abs(var12) > var9 + ViewportMouse.field1772) {
				return false;
			} else if (Math.abs(var12 * GrandExchangeOfferTotalQuantityComparator.field81 - var11 * SecureRandomCallable.field553) > var9 * ItemContainer.field570 + var8 * ViewportMouse.field1772) {
				return false;
			} else if (Math.abs(var10 * SecureRandomCallable.field553 - var12 * ViewportMouse.field1771) > var7 * ViewportMouse.field1772 + var9 * class1.field3) {
				return false;
			} else {
				return Math.abs(var11 * ViewportMouse.field1771 - var10 * GrandExchangeOfferTotalQuantityComparator.field81) <= var7 * ItemContainer.field570 + var8 * class1.field3;
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		signature = "(ILco;ZI)I",
		garbageValue = "1986323726"
	)
	static int method3806(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.OC_NAME) {
			var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
			Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = AbstractWorldMapData.ItemDefinition_get(var3).name;
			return 1;
		} else {
			int var4;
			ItemComposition var5;
			if (var0 == ScriptOpcodes.OC_OP) {
				MilliClock.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1];
				var5 = AbstractWorldMapData.ItemDefinition_get(var3);
				if (var4 >= 1 && var4 <= 5 && var5.groundActions[var4 - 1] != null) {
					Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var5.groundActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.OC_IOP) {
				MilliClock.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1];
				var5 = AbstractWorldMapData.ItemDefinition_get(var3);
				if (var4 >= 1 && var4 <= 5 && var5.inventoryActions[var4 - 1] != null) {
					Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var5.inventoryActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.OC_COST) {
				var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = AbstractWorldMapData.ItemDefinition_get(var3).price;
				return 1;
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) {
				var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = AbstractWorldMapData.ItemDefinition_get(var3).isStackable == 1 ? 1 : 0;
				return 1;
			} else {
				ItemComposition var6;
				if (var0 == ScriptOpcodes.OC_CERT) {
					var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
					var6 = AbstractWorldMapData.ItemDefinition_get(var3);
					if (var6.noteTemplate == -1 && var6.note >= 0) {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var6.note;
					} else {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNCERT) {
					var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
					var6 = AbstractWorldMapData.ItemDefinition_get(var3);
					if (var6.noteTemplate >= 0 && var6.note >= 0) {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var6.note;
					} else {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) {
					var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = AbstractWorldMapData.ItemDefinition_get(var3).isMembersOnly ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
					var6 = AbstractWorldMapData.ItemDefinition_get(var3);
					if (var6.placeholderTemplate == -1 && var6.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var6.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
					var6 = AbstractWorldMapData.ItemDefinition_get(var3);
					if (var6.placeholderTemplate >= 0 && var6.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var6.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_FIND) {
					String var7 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize];
					var4 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
					class22.findItemDefinitions(var7, var4 == 1);
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = PendingSpawn.foundItemIdCount;
					return 1;
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) {
					if (var0 == ScriptOpcodes.OC_FINDRESET) {
						AbstractWorldMapIcon.foundItemIndex = 0;
						return 1;
					} else {
						return 2;
					}
				} else {
					if (Message.foundItemIds != null && AbstractWorldMapIcon.foundItemIndex < PendingSpawn.foundItemIdCount) {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Message.foundItemIds[++AbstractWorldMapIcon.foundItemIndex - 1] & '\uffff';
					} else {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1;
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "-1868104521"
	)
	@Export("getTapToDrop")
	static boolean getTapToDrop() {
		return Client.tapToDrop;
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1392240516"
	)
	static final void method3815() {
		PacketBufferNode var0 = class4.getPacketBufferNode(ClientPacket.field2262, Client.packetWriter.isaacCipher);
		Client.packetWriter.addNode(var0);

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) {
			if (var1.type == 0 || var1.type == 3) {
				Player.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) {
			GrandExchangeOfferOwnWorldComparator.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

	}
}
