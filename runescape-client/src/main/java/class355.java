import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mk")
public class class355 {
	@ObfuscatedName("a")
	@Export("cp1252AsciiExtension")
	public static final char[] cp1252AsciiExtension;
	@ObfuscatedName("bf")
	@Export("otp")
	static String otp;

	static {
		cp1252AsciiExtension = new char[]{'€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ'}; // L: 4
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lkn;IS)V",
		garbageValue = "2814"
	)
	@Export("Widget_setKeyIgnoreHeld")
	static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
		if (var0.field3562 == null) { // L: 1212
			throw new RuntimeException(); // L: 1213
		} else {
			if (var0.field3564 == null) { // L: 1215
				var0.field3564 = new int[var0.field3562.length]; // L: 1216
			}

			var0.field3564[var1] = Integer.MAX_VALUE; // L: 1218
		}
	} // L: 1219

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-30"
	)
	@Export("playPcmPlayers")
	static final void playPcmPlayers() {
		if (class86.pcmPlayer1 != null) { // L: 3811
			class86.pcmPlayer1.run();
		}

		if (HealthBar.pcmPlayer0 != null) { // L: 3812
			HealthBar.pcmPlayer0.run();
		}

	} // L: 3813

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-488142945"
	)
	static final void method6770(int var0, int var1, boolean var2) {
		if (Client.currentClanChannels[var0] != null) { // L: 12567
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3215()) { // L: 12568
				ClanChannelMember var3 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1); // L: 12569
				PacketBufferNode var4 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3090, Client.packetWriter.isaacCipher); // L: 12570
				var4.packetBuffer.writeByte(4 + Actor.stringCp1252NullTerminatedByteSize(var3.username.getName())); // L: 12571
				var4.packetBuffer.writeByte(var0); // L: 12572
				var4.packetBuffer.writeShort(var1); // L: 12573
				var4.packetBuffer.writeBoolean(var2); // L: 12574
				var4.packetBuffer.writeStringCp1252NullTerminated(var3.username.getName()); // L: 12575
				Client.packetWriter.addNode(var4); // L: 12576
			}
		}
	} // L: 12577
}
