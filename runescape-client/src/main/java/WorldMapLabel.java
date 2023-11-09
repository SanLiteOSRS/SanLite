import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iy")
@Implements("WorldMapLabel")
public class WorldMapLabel {
	@ObfuscatedName("o")
	@Export("text")
	String text;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 175930427
	)
	@Export("width")
	int width;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1778296107
	)
	@Export("height")
	int height;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lhy;"
	)
	@Export("size")
	WorldMapLabelSize size;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IILhy;)V"
	)
	WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
		this.text = var1; // L: 10
		this.width = var2; // L: 11
		this.height = var3; // L: 12
		this.size = var4; // L: 13
	} // L: 14

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "3878"
	)
	static final void method4977(int var0, int var1) {
		ClanChannel var2 = var0 >= 0 ? Client.currentClanChannels[var0] : class17.guestClanChannel; // L: 12222
		if (var2 != null && var1 >= 0 && var1 < var2.method3117()) { // L: 12223
			ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1); // L: 12224
			if (var3.rank == -1) {
				String var4 = var3.username.getName(); // L: 12226
				PacketBufferNode var5 = class433.getPacketBufferNode(ClientPacket.field2978, Client.packetWriter.isaacCipher); // L: 12227
				var5.packetBuffer.writeByte(3 + class92.stringCp1252NullTerminatedByteSize(var4)); // L: 12228
				var5.packetBuffer.writeByte(var0); // L: 12229
				var5.packetBuffer.writeShort(var1); // L: 12230
				var5.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 12231
				Client.packetWriter.addNode(var5); // L: 12232
			}
		}
	} // L: 12225 12233
}
