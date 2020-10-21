import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hh")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "[Lct;"
	)
	@Export("World_worlds")
	static World[] World_worlds;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "Lls;"
	)
	@Export("logoSprite")
	static IndexedSprite logoSprite;

	AbstractByteArrayCopier() {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(I)[B",
		garbageValue = "-1021172953"
	)
	@Export("get")
	abstract byte[] get();

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "([BI)V",
		garbageValue = "-1366071744"
	)
	@Export("set")
	abstract void set(byte[] var1);

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;Lhq;I)Ljava/lang/String;",
		garbageValue = "506679014"
	)
	static String method4028(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) {
			for (int var2 = 1; var2 <= 5; ++var2) {
				while (true) {
					int var3 = var0.indexOf("%" + var2);
					if (var3 == -1) {
						break;
					}

					var0 = var0.substring(0, var3) + ArchiveDiskActionHandler.method4338(GrandExchangeOfferNameComparator.method230(var1, var2 - 1)) + var0.substring(var3 + 2);
				}
			}
		}

		return var0;
	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1068531314"
	)
	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = Client.getPacketBufferNode(ClientPacket.field2324, Client.packetWriter.isaacCipher);
		var0.packetBuffer.writeByte(0);
		Client.packetWriter.addNode(var0);
	}
}
