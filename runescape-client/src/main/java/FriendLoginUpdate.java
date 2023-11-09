import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qv")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1811096149
	)
	public int field4602;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Luy;"
	)
	@Export("username")
	public Username username;
	@ObfuscatedName("ar")
	@Export("world")
	public short world;

	@ObfuscatedSignature(
		descriptor = "(Luy;I)V"
	)
	FriendLoginUpdate(Username var1, int var2) {
		this.field4602 = (int)(Canvas.method310() / 1000L); // L: 109
		this.username = var1; // L: 110
		this.world = (short)var2; // L: 111
	} // L: 112

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "927922304"
	)
	public static void method7789() {
		class515.SpriteBuffer_xOffsets = null; // L: 239
		class515.SpriteBuffer_yOffsets = null; // L: 240
		SecureRandomCallable.SpriteBuffer_spriteWidths = null; // L: 241
		SecureRandomCallable.SpriteBuffer_spriteHeights = null; // L: 242
		class515.SpriteBuffer_spritePalette = null; // L: 243
		WorldMapDecoration.SpriteBuffer_pixels = null; // L: 244
	} // L: 245

	@ObfuscatedName("nv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-863946202"
	)
	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = class251.getPacketBufferNode(ClientPacket.field3132, Client.packetWriter.isaacCipher); // L: 12411
		var0.packetBuffer.writeByte(0); // L: 12412
		Client.packetWriter.addNode(var0); // L: 12413
	} // L: 12414
}
