import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lx")
@Implements("BufferedNetSocket")
public class BufferedNetSocket extends AbstractSocket {
	@ObfuscatedName("f")
	@Export("socket")
	Socket socket;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Llz;"
	)
	@Export("source")
	BufferedSource source;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "Lld;"
	)
	@Export("sink")
	BufferedSink sink;

	public BufferedNetSocket(Socket var1, int var2, int var3) throws IOException {
		this.socket = var1;
		this.socket.setSoTimeout(30000);
		this.socket.setTcpNoDelay(true);
		this.socket.setReceiveBufferSize(65536);
		this.socket.setSendBufferSize(65536);
		this.source = new BufferedSource(this.socket.getInputStream(), var2);
		this.sink = new BufferedSink(this.socket.getOutputStream(), var3);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1983450651"
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

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "1"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() throws IOException {
		return this.source.readUnsignedByte();
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "933186835"
	)
	@Export("available")
	public int available() throws IOException {
		return this.source.available();
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(II)Z",
		garbageValue = "-916126565"
	)
	@Export("isAvailable")
	public boolean isAvailable(int var1) throws IOException {
		return this.source.isAvailable(var1);
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "([BIII)I",
		garbageValue = "1049423117"
	)
	@Export("read")
	public int read(byte[] var1, int var2, int var3) throws IOException {
		return this.source.read(var1, var2, var3);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "([BIII)V",
		garbageValue = "1456512196"
	)
	@Export("write")
	public void write(byte[] var1, int var2, int var3) throws IOException {
		this.sink.write(var1, var2, var3);
	}

	protected void finalize() {
		this.close();
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		signature = "(Lht;B)Z",
		garbageValue = "15"
	)
	@Export("runCs1")
	static final boolean runCs1(Widget var0) {
		if (var0.cs1Comparisons == null) {
			return false;
		} else {
			for (int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) {
				int var2 = WorldMapID.method663(var0, var1);
				int var3 = var0.cs1ComparisonValues[var1];
				if (var0.cs1Comparisons[var1] == 2) {
					if (var2 >= var3) {
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 3) {
					if (var2 <= var3) {
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 4) {
					if (var2 == var3) {
						return false;
					}
				} else if (var2 != var3) {
					return false;
				}
			}

			return true;
		}
	}
}
