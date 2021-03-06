import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lf")
@Implements("BufferedNetSocket")
public class BufferedNetSocket extends AbstractSocket {
	@ObfuscatedName("n")
	@Export("socket")
	Socket socket;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "Lll;"
	)
	@Export("source")
	BufferedSource source;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "Llt;"
	)
	@Export("sink")
	BufferedSink sink;

	BufferedNetSocket(Socket var1, int var2, int var3) throws IOException {
		this.socket = var1;
		this.socket.setSoTimeout(30000);
		this.socket.setTcpNoDelay(true);
		this.socket.setReceiveBufferSize(65536);
		this.socket.setSendBufferSize(65536);
		this.source = new BufferedSource(this.socket.getInputStream(), var2);
		this.sink = new BufferedSink(this.socket.getOutputStream(), var3);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		garbageValue = "136255387",
		signature = "(I)V"
	)
	@Export("close")
	public void close() {
		this.sink.close();

		try {
			this.socket.close();
		} catch (IOException var2) {
		}

		this.source.close();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "-29",
		signature = "(B)I"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() throws IOException {
		return this.source.readUnsignedByte();
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		garbageValue = "1",
		signature = "(B)I"
	)
	@Export("available")
	public int available() throws IOException {
		return this.source.available();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		garbageValue = "1621767276",
		signature = "(II)Z"
	)
	@Export("isAvailable")
	public boolean isAvailable(int var1) throws IOException {
		return this.source.isAvailable(var1);
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		garbageValue = "-127",
		signature = "([BIIB)I"
	)
	@Export("read")
	public int read(byte[] var1, int var2, int var3) throws IOException {
		return this.source.read(var1, var2, var3);
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		garbageValue = "1032488862",
		signature = "([BIII)V"
	)
	@Export("write")
	public void write(byte[] var1, int var2, int var3) throws IOException {
		this.sink.write(var1, var2, var3);
	}

	protected void finalize() {
		this.close();
	}
}
