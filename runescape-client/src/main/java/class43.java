import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("au")
public class class43 {
	@ObfuscatedName("qh")
	@ObfuscatedSignature(
		signature = "Lbh;"
	)
	@Export("pcmPlayer1")
	static PcmPlayer pcmPlayer1;

	static {
		ImageIO.setUseCache(false);
	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "-1704226507"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = ObjectComposition.getPacketBufferNode(ClientPacket.field2286, Client.packetWriter.isaacCipher);
		var2.packetBuffer.method6625(var0);
		var2.packetBuffer.method6716(var1);
		Client.packetWriter.addNode(var2);
	}
}
