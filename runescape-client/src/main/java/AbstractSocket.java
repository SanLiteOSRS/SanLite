import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ln")
@Implements("AbstractSocket")
public abstract class AbstractSocket {
	protected AbstractSocket() {
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-147773206"
	)
	@Export("close")
	public abstract void close();

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "-99"
	)
	@Export("readUnsignedByte")
	public abstract int readUnsignedByte() throws IOException;

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "12"
	)
	@Export("available")
	public abstract int available() throws IOException;

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(IB)Z",
		garbageValue = "-78"
	)
	@Export("isAvailable")
	public abstract boolean isAvailable(int var1) throws IOException;

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "([BIII)I",
		garbageValue = "-1533815985"
	)
	@Export("read")
	public abstract int read(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "([BIIB)V",
		garbageValue = "52"
	)
	@Export("write")
	public abstract void write(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "1292618906"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = Client.getPacketBufferNode(ClientPacket.field2276, Client.packetWriter.isaacCipher);
		var2.packetBuffer.method5654(var1);
		var2.packetBuffer.method5663(var0);
		Client.packetWriter.addNode(var2);
	}
}
