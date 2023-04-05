import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gu")
public class class163 extends class156 {
	@ObfuscatedName("aj")
	String field1773;
	@ObfuscatedName("al")
	byte field1774;
	@ObfuscatedName("ac")
	byte field1772;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgk;"
	)
	final class157 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgk;)V"
	)
	class163(class157 var1) {
		this.this$0 = var1; // L: 155
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lsy;I)V",
		garbageValue = "2070491057"
	)
	void vmethod3353(Buffer var1) {
		this.field1773 = var1.readStringCp1252NullTerminatedOrNull(); // L: 158
		if (this.field1773 != null) { // L: 159
			var1.readUnsignedByte(); // L: 160
			this.field1774 = var1.readByte(); // L: 161
			this.field1772 = var1.readByte(); // L: 162
		}

	} // L: 164

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgn;B)V",
		garbageValue = "-82"
	)
	void vmethod3354(ClanChannel var1) {
		var1.name = this.field1773; // L: 167
		if (this.field1773 != null) { // L: 168
			var1.field1758 = this.field1774; // L: 169
			var1.field1761 = this.field1772; // L: 170
		}

	} // L: 172

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lne;IIIZI)V",
		garbageValue = "590202172"
	)
	public static void method3352(AbstractArchive var0, int var1, int var2, int var3, boolean var4) {
		class293.musicPlayerStatus = 1; // L: 34
		class364.musicTrackArchive = var0; // L: 35
		IntHashTable.musicTrackGroupId = var1; // L: 36
		class293.musicTrackFileId = var2; // L: 37
		class368.musicTrackVolume = var3; // L: 38
		class293.musicTrackBoolean = var4; // L: 39
		AbstractRasterProvider.pcmSampleLength = 10000; // L: 40
	} // L: 41

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1594025816"
	)
	public static void method3357() {
		WorldMapRegion.WorldMapRegion_cachedSprites.demote(5); // L: 50
	} // L: 51

	@ObfuscatedName("nf")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "370588109"
	)
	public static void method3359(int var0, int var1, int var2, boolean var3) {
		PacketBufferNode var4 = UserComparator9.getPacketBufferNode(ClientPacket.field3135, Client.packetWriter.isaacCipher); // L: 12183
		var4.packetBuffer.writeShort(var0); // L: 12184
		var4.packetBuffer.method8782(var2); // L: 12185
		var4.packetBuffer.method8671(var3 ? Client.field575 : 0); // L: 12186
		var4.packetBuffer.method8658(var1); // L: 12187
		Client.packetWriter.addNode(var4); // L: 12188
	} // L: 12189
}
