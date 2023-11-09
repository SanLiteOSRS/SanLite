import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gz")
@Implements("InvDefinition")
public class InvDefinition extends DualNode {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("InvDefinition_archive")
	public static AbstractArchive InvDefinition_archive;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("InvDefinition_cached")
	public static EvictingDualNodeHashTable InvDefinition_cached;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -285256807
	)
	@Export("size")
	public int size;

	static {
		InvDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	InvDefinition() {
		this.size = 0; // L: 12
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Luj;B)V",
		garbageValue = "0"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 28
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Luj;II)V",
		garbageValue = "-472687960"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 2) { // L: 35
			this.size = var1.readUnsignedShort();
		}

	} // L: 37

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lol;Lol;S)V",
		garbageValue = "1000"
	)
	public static void method3531(AbstractArchive var0, AbstractArchive var1) {
		KitDefinition.KitDefinition_archive = var0; // L: 29
		KitDefinition.KitDefinition_modelsArchive = var1; // L: 30
		class348.field3825 = KitDefinition.KitDefinition_archive.getGroupFileCount(3); // L: 31
	} // L: 32

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "264426483"
	)
	public static void method3530() {
		class173.field1810.clear(); // L: 14
	} // L: 15

	@ObfuscatedName("ny")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-103"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (class20.friendsChatManager != null) { // L: 12684
			PacketBufferNode var1 = class113.getPacketBufferNode(ClientPacket.field3173, Client.packetWriter.isaacCipher); // L: 12685
			var1.packetBuffer.writeByte(ClanChannel.stringCp1252NullTerminatedByteSize(var0)); // L: 12686
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 12687
			Client.packetWriter.addNode(var1); // L: 12688
		}
	} // L: 12689
}
