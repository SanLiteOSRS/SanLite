import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("or")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	static final NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -407533941
	)
	static int field4362;
	@ObfuscatedName("ai")
	static boolean field4363;
	@ObfuscatedName("ar")
	static Object field4365;
	@ObfuscatedName("as")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque(); // L: 9
		ArchiveDiskActionHandler_responseQueue = new NodeDeque(); // L: 10
		field4362 = 0; // L: 11
		field4363 = false; // L: 12
		field4365 = new Object(); // L: 13
	}

	ArchiveDiskActionHandler() {
	} // L: 18

	public void run() {
		try {
			while (true) {
				ArchiveDiskAction var1;
				synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 76
					var1 = (ArchiveDiskAction)ArchiveDiskActionHandler_requestQueue.last(); // L: 77
				} // L: 78

				if (var1 != null) { // L: 79
					if (var1.type == 0) { // L: 80
						var1.archiveDisk.write((int)var1.key, var1.data, var1.data.length); // L: 81
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 82
							var1.remove(); // L: 83
						} // L: 84
					} else if (var1.type == 1) { // L: 86
						var1.data = var1.archiveDisk.read((int)var1.key); // L: 87
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 88
							ArchiveDiskActionHandler_responseQueue.addFirst(var1); // L: 89
						}
					}

					synchronized(field4365) {
						if ((field4363 || field4362 <= 1) && ArchiveDiskActionHandler_requestQueue.method7425()) {
							field4362 = 0;
							field4365.notifyAll();
							return;
						}

						field4362 = 600;
					}
				} else {
					class143.method3209(100L);
					synchronized(field4365) { // L: 103
						if ((field4363 || field4362 <= 1) && ArchiveDiskActionHandler_requestQueue.method7425()) {
							field4362 = 0;
							field4365.notifyAll();
							return; // L: 107
						}

						--field4362;
					}
				}
			}
		} catch (Exception var13) {
			class315.RunException_sendStackTrace((String)null, var13);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhb;",
		garbageValue = "-21"
	)
	@Export("ItemComposition_get")
	public static ItemComposition ItemComposition_get(int var0) {
		ItemComposition var1 = (ItemComposition)ItemComposition.ItemComposition_cached.get((long)var0); // L: 90
		if (var1 != null) { // L: 91
			return var1;
		} else {
			byte[] var2 = ItemComposition.ItemComposition_archive.takeFile(10, var0); // L: 92
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
				var1.field2223 = 0; // L: 114
				if (var1.params != null) { // L: 115
					boolean var6 = false; // L: 116

					for (Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) { // L: 117
						ParamComposition var5 = UserComparator4.getParamDefinition((int)var4.key); // L: 118
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
}
