import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ak")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements class51 {
	DevicePcmPlayerProvider() {
	} // L: 7

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Lbu;",
		garbageValue = "-522510238"
	)
	@Export("player")
	public PcmPlayer player() {
		return new DevicePcmPlayer(); // L: 11
	}

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(Ldy;B)V",
		garbageValue = "115"
	)
	static void method299(NPC var0) {
		var0.field1147 = var0.definition.size; // L: 8839
		var0.field1209 = var0.definition.rotation; // L: 8840
		var0.walkSequence = var0.definition.walkSequence; // L: 8841
		var0.walkBackSequence = var0.definition.walkBackSequence; // L: 8842
		var0.walkLeftSequence = var0.definition.walkLeftSequence; // L: 8843
		var0.walkRightSequence = var0.definition.walkRightSequence; // L: 8844
		var0.idleSequence = var0.definition.idleSequence; // L: 8845
		var0.field1146 = var0.definition.turnLeftSequence; // L: 8846
		var0.field1171 = var0.definition.turnRightSequence; // L: 8847
		var0.runSequence = var0.definition.field2021; // L: 8848
		var0.field1156 = var0.definition.field2024; // L: 8849
		var0.field1143 = var0.definition.field2010; // L: 8850
		var0.field1199 = var0.definition.field2030; // L: 8851
		var0.field1179 = var0.definition.field2025; // L: 8852
		var0.field1157 = var0.definition.field2026; // L: 8853
		var0.field1149 = var0.definition.field2027; // L: 8854
		var0.field1197 = var0.definition.field2043; // L: 8855
	} // L: 8856

	@ObfuscatedName("ni")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "30"
	)
	static final void method296(int var0, int var1) {
		if (Client.currentClanChannels[var0] != null) { // L: 12431
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3316()) { // L: 12432
				ClanChannelMember var2 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1); // L: 12433
				if (var2.rank == -1) { // L: 12434
					PacketBufferNode var3 = class251.getPacketBufferNode(ClientPacket.field3134, Client.packetWriter.isaacCipher); // L: 12435
					var3.packetBuffer.writeByte(3 + class298.stringCp1252NullTerminatedByteSize(var2.username.getName())); // L: 12436
					var3.packetBuffer.writeByte(var0); // L: 12437
					var3.packetBuffer.writeShort(var1); // L: 12438
					var3.packetBuffer.writeStringCp1252NullTerminated(var2.username.getName()); // L: 12439
					Client.packetWriter.addNode(var3); // L: 12440
				}
			}
		}
	} // L: 12441

	@ObfuscatedName("og")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-27426"
	)
	public static boolean method300() {
		return Client.staffModLevel >= 2; // L: 12574
	}
}
