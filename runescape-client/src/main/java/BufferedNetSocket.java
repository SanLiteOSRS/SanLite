import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qy")
@Implements("BufferedNetSocket")
public class BufferedNetSocket extends AbstractSocket {
	@ObfuscatedName("ar")
	static int[][][] field4679;
	@ObfuscatedName("au")
	@Export("socket")
	Socket socket;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	@Export("source")
	BufferedSource source;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lqh;"
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-67"
	)
	@Export("isAvailable")
	public boolean isAvailable(int var1) throws IOException {
		return this.source.isAvailable(var1); // L: 23
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1947351494"
	)
	@Export("available")
	public int available() throws IOException {
		return this.source.available(); // L: 28
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "969166986"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() throws IOException {
		return this.source.readUnsignedByte(); // L: 33
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([BIIS)I",
		garbageValue = "206"
	)
	@Export("read")
	public int read(byte[] var1, int var2, int var3) throws IOException {
		return this.source.read(var1, var2, var3); // L: 38
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "1371855899"
	)
	@Export("write")
	public void write(byte[] var1, int var2, int var3) throws IOException {
		this.sink.write(var1, var2, var3); // L: 43
	} // L: 44

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1457160931"
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)[Lub;",
		garbageValue = "-1"
	)
	static PrivateChatMode[] method8052() {
		return new PrivateChatMode[]{PrivateChatMode.field5248, PrivateChatMode.field5245, PrivateChatMode.field5247}; // L: 11
	}
}
