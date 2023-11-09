import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ks")
@Implements("ArchiveDiskAction")
public class ArchiveDiskAction extends Node {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 16021623
	)
	@Export("type")
	int type;
	@ObfuscatedName("q")
	@Export("data")
	byte[] data;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("archive")
	Archive archive;

	ArchiveDiskAction() {
	} // L: 12

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lqw;Ljava/lang/String;I)I",
		garbageValue = "1650594582"
	)
	public static int method5785(Buffer var0, String var1) {
		int var2 = var0.offset; // L: 14
		int var4 = var1.length(); // L: 17
		byte[] var5 = new byte[var4]; // L: 18

		for (int var6 = 0; var6 < var4; ++var6) { // L: 19
			char var7 = var1.charAt(var6); // L: 20
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) { // L: 21
				var5[var6] = (byte)var7;
			} else if (var7 == 8364) { // L: 22
				var5[var6] = -128;
			} else if (var7 == 8218) { // L: 23
				var5[var6] = -126;
			} else if (var7 == 402) { // L: 24
				var5[var6] = -125;
			} else if (var7 == 8222) { // L: 25
				var5[var6] = -124;
			} else if (var7 == 8230) { // L: 26
				var5[var6] = -123;
			} else if (var7 == 8224) { // L: 27
				var5[var6] = -122;
			} else if (var7 == 8225) { // L: 28
				var5[var6] = -121;
			} else if (var7 == 710) { // L: 29
				var5[var6] = -120;
			} else if (var7 == 8240) { // L: 30
				var5[var6] = -119;
			} else if (var7 == 352) { // L: 31
				var5[var6] = -118;
			} else if (var7 == 8249) { // L: 32
				var5[var6] = -117;
			} else if (var7 == 338) { // L: 33
				var5[var6] = -116;
			} else if (var7 == 381) { // L: 34
				var5[var6] = -114;
			} else if (var7 == 8216) { // L: 35
				var5[var6] = -111;
			} else if (var7 == 8217) { // L: 36
				var5[var6] = -110;
			} else if (var7 == 8220) { // L: 37
				var5[var6] = -109;
			} else if (var7 == 8221) { // L: 38
				var5[var6] = -108;
			} else if (var7 == 8226) { // L: 39
				var5[var6] = -107;
			} else if (var7 == 8211) { // L: 40
				var5[var6] = -106;
			} else if (var7 == 8212) { // L: 41
				var5[var6] = -105;
			} else if (var7 == 732) { // L: 42
				var5[var6] = -104;
			} else if (var7 == 8482) { // L: 43
				var5[var6] = -103;
			} else if (var7 == 353) { // L: 44
				var5[var6] = -102;
			} else if (var7 == 8250) { // L: 45
				var5[var6] = -101;
			} else if (var7 == 339) { // L: 46
				var5[var6] = -100;
			} else if (var7 == 382) { // L: 47
				var5[var6] = -98;
			} else if (var7 == 376) { // L: 48
				var5[var6] = -97;
			} else {
				var5[var6] = 63; // L: 49
			}
		}

		var0.writeSmartByteShort(var5.length); // L: 54
		var0.offset += class18.huffman.compress(var5, 0, var5.length, var0.array, var0.offset); // L: 55
		return var0.offset - var2; // L: 56
	}

	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1242746658"
	)
	static int method5786() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1573
			int var0 = 0; // L: 1574

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) { // L: 1575
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount; // L: 1576
			}

			return var0 * 10000 / Client.field630; // L: 1578
		} else {
			return 10000;
		}
	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(Lbe;III)V",
		garbageValue = "410958599"
	)
	static final void method5787(MenuAction var0, int var1, int var2) {
		if (var0 != null) { // L: 8572
			class9.method78(var0.param0, var0.param1, var0.opcode, var0.identifier, var0.field879, var0.field880, var0.action, var1, var2); // L: 8573
		}

	} // L: 8575

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "([Lku;II)V",
		garbageValue = "-1292694171"
	)
	@Export("runComponentCloseListeners")
	static final void runComponentCloseListeners(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 11481
			Widget var3 = var0[var2]; // L: 11482
			if (var3 != null) { // L: 11483
				if (var3.type == 0) { // L: 11484
					if (var3.children != null) { // L: 11485
						runComponentCloseListeners(var3.children, var1);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 11486
					if (var4 != null) { // L: 11487
						class220.runIntfCloseListeners(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) { // L: 11489
					var5 = new ScriptEvent(); // L: 11490
					var5.widget = var3; // L: 11491
					var5.args = var3.onDialogAbort; // L: 11492
					class17.runScriptEvent(var5); // L: 11493
				}

				if (var1 == 1 && var3.onSubChange != null) { // L: 11495
					if (var3.childIndex >= 0) { // L: 11496
						Widget var6 = FloorUnderlayDefinition.getWidget(var3.id); // L: 11497
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) { // L: 11498
							continue;
						}
					}

					var5 = new ScriptEvent(); // L: 11502
					var5.widget = var3; // L: 11503
					var5.args = var3.onSubChange; // L: 11504
					class17.runScriptEvent(var5); // L: 11505
				}
			}
		}

	} // L: 11508
}
