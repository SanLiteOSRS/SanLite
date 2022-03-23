import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ct")
@Implements("UrlRequest")
public class UrlRequest {
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Ley;"
	)
	static ClanChannel field1344;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -565666141
	)
	static int field1346;
	@ObfuscatedName("v")
	@Export("url")
	final URL url;
	@ObfuscatedName("o")
	@Export("isDone0")
	volatile boolean isDone0;
	@ObfuscatedName("h")
	@Export("response0")
	volatile byte[] response0;

	UrlRequest(URL var1) {
		this.url = var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2022569902"
	)
	@Export("isDone")
	public boolean isDone() {
		return this.isDone0;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-892038744"
	)
	@Export("getResponse")
	public byte[] getResponse() {
		return this.response0;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "4111"
	)
	public String method2546() {
		return this.url.toString();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "1"
	)
	static int method2545(int var0, int var1, int var2) {
		return var0 << 28 | var1 << 14 | var2;
	}

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "624212840"
	)
	static final void method2555(int var0, int var1) {
		if (Client.currentClanChannels[var0] != null) {
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3056()) {
				ClanChannelMember var2 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1);
				if (var2.rank == -1) {
					PacketBufferNode var3 = ItemContainer.getPacketBufferNode(ClientPacket.field2953, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(3 + ItemLayer.stringCp1252NullTerminatedByteSize(var2.username.getName()));
					var3.packetBuffer.writeByte(var0);
					var3.packetBuffer.writeShort(var1);
					var3.packetBuffer.writeStringCp1252NullTerminated(var2.username.getName());
					Client.packetWriter.addNode(var3);
				}
			}
		}
	}
}
