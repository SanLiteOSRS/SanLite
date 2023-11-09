import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pr")
@Implements("BufferedNetSocket")
public class BufferedNetSocket extends AbstractSocket {
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("musicTrack")
	public static MusicTrack musicTrack;
	@ObfuscatedName("aj")
	@Export("socket")
	Socket socket;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("source")
	BufferedSource source;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1511735162"
	)
	@Export("isAvailable")
	public boolean isAvailable(int var1) throws IOException {
		return this.source.isAvailable(var1); // L: 23
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1330081033"
	)
	@Export("available")
	public int available() throws IOException {
		return this.source.available(); // L: 28
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-16"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() throws IOException {
		return this.source.readUnsignedByte(); // L: 33
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([BIIB)I",
		garbageValue = "0"
	)
	@Export("read")
	public int read(byte[] var1, int var2, int var3) throws IOException {
		return this.source.read(var1, var2, var3); // L: 38
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-1968026935"
	)
	@Export("write")
	public void write(byte[] var1, int var2, int var3) throws IOException {
		this.sink.write(var1, var2, var3); // L: 43
	} // L: 44

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-105"
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
