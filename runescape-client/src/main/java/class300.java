import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lw")
public final class class300 {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = -3820023634805219991L
	)
	static long field3364;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		longValue = 4707895085052106175L
	)
	static long field3365;

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lhz;",
		garbageValue = "1204136963"
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

			if (!ItemComposition.ItemComposition_inMembersWorld && var1.isMembersOnly) { // L: 100
				var1.name = var1.name + " (Members)"; // L: 101
				var1.isTradable = false; // L: 102

				int var3;
				for (var3 = 0; var3 < var1.groundActions.length; ++var3) { // L: 103
					var1.groundActions[var3] = null; // L: 104
				}

				for (var3 = 0; var3 < var1.inventoryActions.length; ++var3) { // L: 106
					if (var3 != 4) { // L: 107
						var1.inventoryActions[var3] = null; // L: 108
					}
				}

				var1.shiftClickIndex = -2; // L: 111
				var1.team = 0; // L: 112
				if (var1.params != null) { // L: 113
					boolean var6 = false; // L: 114

					for (Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) { // L: 115
						ParamComposition var5 = ModeWhere.getParamDefinition((int)var4.key); // L: 116
						if (var5.autoDisable) { // L: 117
							var4.remove();
						} else {
							var6 = true; // L: 118
						}
					}

					if (!var6) { // L: 120
						var1.params = null;
					}
				}
			}

			ItemComposition.ItemComposition_cached.put(var1, (long)var0); // L: 123
			return var1;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2024632271"
	)
	static void method5686() {
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 48
			if (ArchiveDiskActionHandler.field4224 == 0) { // L: 49
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler()); // L: 50
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true); // L: 51
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start(); // L: 52
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5); // L: 53
			}

			ArchiveDiskActionHandler.field4224 = 600; // L: 55
		}
	} // L: 57

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1153355231"
	)
	static final void method5687() {
		ParamComposition.method3837("Your friend list is full. Max of 200 for free users, and 400 for members"); // L: 124
	} // L: 125

	@ObfuscatedName("mt")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "39"
	)
	static final void method5688(int var0, int var1) {
		ClanChannel var2 = var0 >= 0 ? Client.currentClanChannels[var0] : VerticalAlignment.guestClanChannel; // L: 12585
		if (var2 != null && var1 >= 0 && var1 < var2.method3346()) { // L: 12586
			ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1); // L: 12587
			if (var3.rank == -1) { // L: 12588
				String var4 = var3.username.getName(); // L: 12589
				PacketBufferNode var5 = ObjectComposition.getPacketBufferNode(ClientPacket.field3120, Client.packetWriter.isaacCipher); // L: 12590
				var5.packetBuffer.writeByte(3 + Widget.stringCp1252NullTerminatedByteSize(var4)); // L: 12591
				var5.packetBuffer.writeByte(var0); // L: 12592
				var5.packetBuffer.writeShort(var1); // L: 12593
				var5.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 12594
				Client.packetWriter.addNode(var5); // L: 12595
			}
		}
	} // L: 12596
}
