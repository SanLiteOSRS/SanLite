import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("g")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements class51 {
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	@Export("musicTrackArchive")
	public static AbstractArchive musicTrackArchive;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Lry;"
	)
	@Export("worldSelectRightSprite")
	static IndexedSprite worldSelectRightSprite;
	@ObfuscatedName("iv")
	@ObfuscatedGetter(
		intValue = -1833710583
	)
	static int field122;

	DevicePcmPlayerProvider() {
	} // L: 7

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Lab;",
		garbageValue = "469257339"
	)
	@Export("player")
	public PcmPlayer player() {
		return new DevicePcmPlayer(); // L: 11
	}

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)V",
		garbageValue = "146"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (MenuAction.friendsChatManager != null) { // L: 12516
			PacketBufferNode var1 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3030, Client.packetWriter.isaacCipher); // L: 12517
			var1.packetBuffer.writeByte(Actor.stringCp1252NullTerminatedByteSize(var0)); // L: 12518
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 12519
			Client.packetWriter.addNode(var1); // L: 12520
		}
	} // L: 12521
}
