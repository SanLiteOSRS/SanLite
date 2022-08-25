import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dl")
public class class127 extends class128 {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1705057231
	)
	int field1535;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lei;)V"
	)
	class127(class131 var1) {
		this.this$0 = var1;
		this.field1535 = -1; // L: 114
	} // L: 116

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "-885940784"
	)
	void vmethod3087(Buffer var1) {
		this.field1535 = var1.readUnsignedShort(); // L: 119
	} // L: 120

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Leh;B)V",
		garbageValue = "0"
	)
	void vmethod3084(ClanSettings var1) {
		var1.method2906(this.field1535); // L: 123
	} // L: 124

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lls;I)V",
		garbageValue = "848477537"
	)
	public static void method2798(AbstractArchive var0) {
		FloorOverlayDefinition.FloorOverlayDefinition_archive = var0; // L: 24
	} // L: 25

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lbz;",
		garbageValue = "-1413111060"
	)
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = FontName.method7323(var1, var0); // L: 38
		Script var4 = Varps.method5465(var3, var0); // L: 39
		if (var4 != null) { // L: 40
			return var4; // L: 41
		} else {
			var3 = class286.method5455(var2, var0); // L: 43
			var4 = Varps.method5465(var3, var0); // L: 44
			return var4 != null ? var4 : null; // L: 45 48
		}
	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(IIZS)V",
		garbageValue = "-10523"
	)
	static final void method2792(int var0, int var1, boolean var2) {
		if (Client.currentClanChannels[var0] != null) { // L: 12053
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3046()) { // L: 12054
				ClanChannelMember var3 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1); // L: 12055
				PacketBufferNode var4 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2987, Client.packetWriter.isaacCipher); // L: 12056
				var4.packetBuffer.writeByte(4 + class309.stringCp1252NullTerminatedByteSize(var3.username.getName())); // L: 12057
				var4.packetBuffer.writeByte(var0); // L: 12058
				var4.packetBuffer.writeShort(var1); // L: 12059
				var4.packetBuffer.writeBoolean(var2); // L: 12060
				var4.packetBuffer.writeStringCp1252NullTerminated(var3.username.getName()); // L: 12061
				Client.packetWriter.addNode(var4); // L: 12062
			}
		}
	} // L: 12063
}
