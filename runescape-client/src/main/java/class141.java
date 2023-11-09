import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fc")
public class class141 extends class144 {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1765672251
	)
	@Export("ItemComposition_fileCount")
	public static int ItemComposition_fileCount;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1430837995
	)
	int field1639;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 526694739
	)
	int field1638;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1132875093
	)
	int field1637;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 611932781
	)
	int field1640;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	final class147 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lft;)V"
	)
	class141(class147 var1) {
		this.this$0 = var1;
		this.field1639 = -1; // L: 158
	} // L: 163

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ltl;I)V",
		garbageValue = "-25252119"
	)
	void vmethod3458(Buffer var1) {
		this.field1639 = var1.readUnsignedShort(); // L: 166
		this.field1638 = var1.readInt(); // L: 167
		this.field1637 = var1.readUnsignedByte(); // L: 168
		this.field1640 = var1.readUnsignedByte(); // L: 169
	} // L: 170

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lfn;I)V",
		garbageValue = "-1582049647"
	)
	void vmethod3460(ClanSettings var1) {
		var1.method3304(this.field1639, this.field1638, this.field1637, this.field1640); // L: 173
	} // L: 174

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Lhe;",
		garbageValue = "-377550190"
	)
	@Export("ItemComposition_get")
	public static ItemComposition ItemComposition_get(int var0) {
		ItemComposition var1 = (ItemComposition)ItemComposition.ItemComposition_cached.get((long)var0); // L: 90
		if (var1 != null) { // L: 91
			return var1;
		} else {
			byte[] var2 = class497.ItemComposition_archive.takeFile(10, var0); // L: 92
			var1 = new ItemComposition(); // L: 93
			var1.id = var0; // L: 94
			if (var2 != null) { // L: 95
				var1.decode(new Buffer(var2));
			}

			var1.post(); // L: 96
			if (var1.noteTemplate != -1) { // L: 97
				var1.genCert(ItemComposition_get(var1.noteTemplate), ItemComposition_get(var1.note));
			}

			if (var1.notedId != -1) { // L: 98
				var1.genBought(ItemComposition_get(var1.notedId), ItemComposition_get(var1.unnotedId));
			}

			if (var1.placeholderTemplate != -1) { // L: 99
				var1.genPlaceholder(ItemComposition_get(var1.placeholderTemplate), ItemComposition_get(var1.placeholder));
			}

			if (!HealthBarUpdate.ItemComposition_inMembersWorld && var1.isMembersOnly) { // L: 100
				if (var1.noteTemplate == -1 && var1.notedId == -1 && var1.placeholderTemplate == -1) { // L: 101
					var1.name = var1.name + " (Members)"; // L: 102
				}

				var1.isTradable = false; // L: 104

				int var3;
				for (var3 = 0; var3 < var1.groundActions.length; ++var3) { // L: 105
					var1.groundActions[var3] = null; // L: 106
				}

				for (var3 = 0; var3 < var1.inventoryActions.length; ++var3) { // L: 108
					if (var3 != 4) { // L: 109
						var1.inventoryActions[var3] = null; // L: 110
					}
				}

				var1.shiftClickIndex = -2; // L: 113
				var1.team = 0; // L: 114
				if (var1.params != null) { // L: 115
					boolean var6 = false; // L: 116

					for (Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) { // L: 117
						ParamComposition var5 = class291.getParamDefinition((int)var4.key); // L: 118
						if (var5.autoDisable) { // L: 119
							var4.remove();
						} else {
							var6 = true; // L: 120
						}
					}

					if (!var6) { // L: 122
						var1.params = null;
					}
				}
			}

			ItemComposition.ItemComposition_cached.put(var1, (long)var0); // L: 125
			return var1; // L: 126
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-108919890"
	)
	static void method3182(int var0) {
		class450.field4732 = var0; // L: 21
		class450.field4733 = new class450[var0]; // L: 22
		class383.field4405 = 0; // L: 23
	} // L: 24

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lnr;I)V",
		garbageValue = "1767133400"
	)
	public static void method3188(AbstractArchive var0) {
		StructComposition.StructDefinition_archive = var0; // L: 19
	} // L: 20

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILdr;ZI)I",
		garbageValue = "-2391083"
	)
	static int method3191(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? Interpreter.scriptDotWidget : class184.field1907; // L: 1356
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) { // L: 1357
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1358
			return 1; // L: 1359
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) { // L: 1361
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1362
			return 1; // L: 1363
		} else {
			class329 var7;
			if (var0 == ScriptOpcodes.CC_GETTEXT) { // L: 1365
				if (var3.type == 12) { // L: 1366
					var7 = var3.method6470(); // L: 1367
					if (var7 != null) { // L: 1368
						Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var7.method6210().method7416(); // L: 1369
						return 1; // L: 1370
					}
				}

				Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var3.text; // L: 1373
				return 1; // L: 1374
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) { // L: 1376
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1377
				return 1; // L: 1378
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) { // L: 1380
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1381
				return 1; // L: 1382
			} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) { // L: 1384
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1385
				return 1; // L: 1386
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) { // L: 1388
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1389
				return 1; // L: 1390
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) { // L: 1392
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1393
				return 1; // L: 1394
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) { // L: 1396
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1397
				return 1; // L: 1398
			} else if (var0 == ScriptOpcodes.CC_GETTRANS) { // L: 1400
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1401
				return 1; // L: 1402
			} else if (var0 == 1610) { // L: 1404
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1405
				return 1; // L: 1406
			} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) { // L: 1408
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color; // L: 1409
				return 1; // L: 1410
			} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) { // L: 1412
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color2; // L: 1413
				return 1; // L: 1414
			} else if (var0 == 1613) { // L: 1416
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1417
				return 1; // L: 1418
			} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) { // L: 1420
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1421
				return 1; // L: 1422
			} else {
				class324 var4;
				if (var0 == 1617) { // L: 1424
					var4 = var3.method6471(); // L: 1425
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3539 : 0; // L: 1426
				}

				if (var0 == 1618) { // L: 1428
					var4 = var3.method6471(); // L: 1429
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3538 : 0; // L: 1430
					return 1; // L: 1431
				} else if (var0 == 1619) { // L: 1433
					var7 = var3.method6470(); // L: 1434
					Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6219().method7416() : ""; // L: 1435
					return 1; // L: 1436
				} else if (var0 == 1620) { // L: 1438
					var4 = var3.method6471(); // L: 1439
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3540 : 0; // L: 1440
					return 1; // L: 1441
				} else if (var0 == 1621) { // L: 1443
					var7 = var3.method6470(); // L: 1444
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6221() : 0; // L: 1445
					return 1; // L: 1446
				} else if (var0 == 1622) { // L: 1448
					var7 = var3.method6470(); // L: 1449
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6246() : 0; // L: 1450
					return 1; // L: 1451
				} else if (var0 == 1623) { // L: 1453
					var7 = var3.method6470(); // L: 1454
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6223() : 0; // L: 1455
					return 1; // L: 1456
				} else if (var0 == 1624) { // L: 1458
					var7 = var3.method6470(); // L: 1459
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null && var7.method6434() ? 1 : 0; // L: 1460
					return 1; // L: 1461
				} else if (var0 != 1625) { // L: 1463
					if (var0 == 1626) { // L: 1468
						var7 = var3.method6470(); // L: 1469
						Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6255().method7580() : ""; // L: 1470
						return 1; // L: 1471
					} else if (var0 == 1627) { // L: 1473
						var7 = var3.method6470(); // L: 1474
						int var5 = var7 != null ? var7.method6263() : 0; // L: 1475
						int var6 = var7 != null ? var7.method6177() : 0; // L: 1476
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.min(var5, var6); // L: 1477
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.max(var5, var6); // L: 1478
						return 1; // L: 1479
					} else if (var0 == 1628) { // L: 1481
						var7 = var3.method6470(); // L: 1482
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6177() : 0; // L: 1483
						return 1; // L: 1484
					} else if (var0 == 1629) { // L: 1486
						var7 = var3.method6470(); // L: 1487
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6225() : 0; // L: 1488
						return 1; // L: 1489
					} else if (var0 == 1630) { // L: 1491
						var7 = var3.method6470(); // L: 1492
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6385() : 0; // L: 1493
						return 1; // L: 1494
					} else if (var0 == 1631) { // L: 1496
						var7 = var3.method6470(); // L: 1497
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6226() : 0; // L: 1498
						return 1; // L: 1499
					} else if (var0 == 1632) { // L: 1501
						var7 = var3.method6470(); // L: 1502
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6227() : 0; // L: 1503
						return 1; // L: 1504
					} else {
						class27 var8;
						if (var0 == 1633) { // L: 1506
							var8 = var3.method6472(); // L: 1507
							Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = var8 != null ? var8.method414(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]) : 0; // L: 1508
							return 1; // L: 1509
						} else if (var0 == 1634) { // L: 1511
							var8 = var3.method6472(); // L: 1512
							Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = var8 != null ? var8.method417((char)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]) : 0; // L: 1513
							return 1; // L: 1514
						} else {
							return 2; // L: 1516
						}
					}
				} else {
					var7 = var3.method6470(); // L: 1464
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null && var7.method6207() ? 1 : 0; // L: 1465
					return 1; // L: 1466
				}
			}
		}
	}

	@ObfuscatedName("mu")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1759313643"
	)
	static final void method3192(int var0, int var1) {
		ClanChannel var2 = var0 >= 0 ? Client.currentClanChannels[var0] : class9.guestClanChannel; // L: 12620
		if (var2 != null && var1 >= 0 && var1 < var2.method3423()) { // L: 12621
			ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1); // L: 12622
			if (var3.rank == -1) {
				String var4 = var3.username.getName(); // L: 12624
				PacketBufferNode var5 = class217.getPacketBufferNode(ClientPacket.field3158, Client.packetWriter.isaacCipher); // L: 12625
				var5.packetBuffer.writeByte(3 + Player.stringCp1252NullTerminatedByteSize(var4)); // L: 12626
				var5.packetBuffer.writeByte(var0); // L: 12627
				var5.packetBuffer.writeShort(var1); // L: 12628
				var5.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 12629
				Client.packetWriter.addNode(var5); // L: 12630
			}
		}
	} // L: 12623 12631
}
