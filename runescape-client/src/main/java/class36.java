import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bp")
public class class36 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	@Export("reflectionChecks")
	public static IterableNodeDeque reflectionChecks;
	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "[Lun;"
	)
	@Export("scrollBarSprites")
	static IndexedSprite[] scrollBarSprites;

	static {
		reflectionChecks = new IterableNodeDeque(); // L: 17
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1924526365"
	)
	@Export("getVarbit")
	public static int getVarbit(int var0) {
		VarbitComposition var1 = Messages.method2802(var0); // L: 25
		int var2 = var1.baseVar; // L: 26
		int var3 = var1.startBit; // L: 27
		int var4 = var1.endBit; // L: 28
		int var5 = Varps.Varps_masks[var4 - var3]; // L: 29
		return Varps.Varps_main[var2] >> var3 & var5; // L: 30
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Lif;",
		garbageValue = "1398442265"
	)
	@Export("SequenceDefinition_get")
	public static SequenceDefinition SequenceDefinition_get(int var0) {
		SequenceDefinition var1 = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.get((long)var0); // L: 57
		if (var1 != null) { // L: 58
			return var1; // L: 59
		} else {
			byte[] var2 = class295.SequenceDefinition_archive.takeFile(12, var0); // L: 61
			var1 = new SequenceDefinition(); // L: 62
			if (var2 != null) { // L: 63
				var1.decode(new Buffer(var2)); // L: 64
			}

			var1.postDecode(); // L: 66
			SequenceDefinition.SequenceDefinition_cached.put(var1, (long)var0); // L: 67
			return var1; // L: 68
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "1831211968"
	)
	public static int method686(CharSequence var0) {
		return class230.method4347(var0, 10, true); // L: 73
	}

	@ObfuscatedName("ne")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1735203823"
	)
	static final void method697(int var0, int var1) {
		if (Client.currentClanChannels[var0] != null) { // L: 12653
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3382()) { // L: 12654
				ClanChannelMember var2 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1); // L: 12655
				if (var2.rank == -1) { // L: 12656
					PacketBufferNode var3 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3209, Client.packetWriter.isaacCipher); // L: 12657
					var3.packetBuffer.writeByte(3 + class478.stringCp1252NullTerminatedByteSize(var2.username.getName())); // L: 12658
					var3.packetBuffer.writeByte(var0); // L: 12659
					var3.packetBuffer.writeShort(var1); // L: 12660
					var3.packetBuffer.writeStringCp1252NullTerminated(var2.username.getName()); // L: 12661
					Client.packetWriter.addNode(var3); // L: 12662
				}
			}
		}
	} // L: 12663
}
