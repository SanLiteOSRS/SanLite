import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ro")
@Implements("BufferedNetSocket")
public class BufferedNetSocket extends AbstractSocket {
	@ObfuscatedName("az")
	@Export("socket")
	Socket socket;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lrs;"
	)
	@Export("source")
	BufferedSource source;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lrm;"
	)
	@Export("sink")
	BufferedSink sink;

	public BufferedNetSocket(Socket var1, int var2, int var3) throws IOException {
		this.socket = var1; // L: 12
		this.socket.setSoTimeout(30000); // L: 13
		this.socket.setTcpNoDelay(true); // L: 14
		this.socket.setReceiveBufferSize(65536); // L: 15
		this.socket.setSendBufferSize(65536); // L: 16
		this.source = new BufferedSource(this.socket.getInputStream(), var2); // L: 17
		this.sink = new BufferedSink(this.socket.getOutputStream(), var3); // L: 18
	} // L: 19

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1478013130"
	)
	@Export("isAvailable")
	public boolean isAvailable(int var1) throws IOException {
		return this.source.isAvailable(var1); // L: 23
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1012786095"
	)
	public int vmethod8271() throws IOException {
		return this.source.available(); // L: 28
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "257991578"
	)
	public int vmethod8273() throws IOException {
		return this.source.readUnsignedByte(); // L: 33
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([BIIB)I",
		garbageValue = "1"
	)
	@Export("read")
	public int read(byte[] var1, int var2, int var3) throws IOException {
		return this.source.read(var1, var2, var3); // L: 38
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "1580683310"
	)
	@Export("write")
	public void write(byte[] var1, int var2, int var3) throws IOException {
		this.sink.write(var1, var2, var3); // L: 43
	} // L: 44

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "124"
	)
	@Export("close")
	public void close() {
		this.sink.close(); // L: 48

		try {
			this.socket.close(); // L: 50
		} catch (IOException var2) { // L: 52
		}

		this.source.close(); // L: 53
	} // L: 54

	protected void finalize() {
		this.close(); // L: 58
	} // L: 59
}
