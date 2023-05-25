import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pv")
@Implements("BufferedNetSocket")
public class BufferedNetSocket extends AbstractSocket {
	@ObfuscatedName("af")
	@Export("socket")
	Socket socket;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	@Export("source")
	BufferedSource source;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	@Export("sink")
	BufferedSink sink;

	BufferedNetSocket(Socket var1, int var2, int var3) throws IOException {
		this.socket = var1; // L: 12
		this.socket.setSoTimeout(30000); // L: 13
		this.socket.setTcpNoDelay(true); // L: 14
		this.socket.setReceiveBufferSize(65536); // L: 15
		this.socket.setSendBufferSize(65536); // L: 16
		this.source = new BufferedSource(this.socket.getInputStream(), var2); // L: 17
		this.sink = new BufferedSink(this.socket.getOutputStream(), var3); // L: 18
	} // L: 19

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1063469226"
	)
	@Export("isAvailable")
	public boolean isAvailable(int var1) throws IOException {
		return this.source.isAvailable(var1); // L: 23
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1612671788"
	)
	@Export("available")
	public int available() throws IOException {
		return this.source.available();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-591957582"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() throws IOException {
		return this.source.readUnsignedByte();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "-2106093590"
	)
	@Export("read")
	public int read(byte[] var1, int var2, int var3) throws IOException {
		return this.source.read(var1, var2, var3); // L: 38
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-2115422184"
	)
	@Export("write")
	public void write(byte[] var1, int var2, int var3) throws IOException {
		this.sink.write(var1, var2, var3); // L: 43
	} // L: 44

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "323141636"
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "66317544"
	)
	static int method8016(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 28
		if (var2 == null) { // L: 29
			return 0;
		} else if (var1 == -1) { // L: 30
			return 0;
		} else {
			int var3 = 0; // L: 31

			for (int var4 = 0; var4 < var2.quantities.length; ++var4) { // L: 32
				if (var2.ids[var4] == var1) {
					var3 += var2.quantities[var4]; // L: 33
				}
			}

			return var3; // L: 35
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lnm;Lnm;Ljava/lang/String;Ljava/lang/String;I)Lon;",
		garbageValue = "1606925660"
	)
	public static Font method8027(AbstractArchive var0, AbstractArchive var1, String var2, String var3) {
		if (!var0.isValidFileName(var2, var3)) { // L: 136
			return null;
		} else {
			int var4 = var0.getGroupId(var2); // L: 137
			int var5 = var0.getFileId(var4, var3); // L: 138
			byte[] var8 = var0.takeFile(var4, var5); // L: 143
			boolean var7;
			if (var8 == null) { // L: 144
				var7 = false; // L: 145
			} else {
				class485.SpriteBuffer_decode(var8); // L: 148
				var7 = true; // L: 149
			}

			Font var6;
			if (!var7) { // L: 151
				var6 = null; // L: 152
			} else {
				byte[] var9 = var1.takeFile(var4, var5); // L: 156
				Font var11;
				if (var9 == null) { // L: 158
					var11 = null; // L: 159
				} else {
					Font var10 = new Font(var9, class503.SpriteBuffer_xOffsets, class17.SpriteBuffer_yOffsets, class97.SpriteBuffer_spriteWidths, class138.SpriteBuffer_spriteHeights, class394.SpriteBuffer_spritePalette, VarbitComposition.SpriteBuffer_pixels); // L: 162
					class398.method7709(); // L: 163
					var11 = var10; // L: 164
				}

				var6 = var11; // L: 166
			}

			return var6; // L: 168
		}
	}
}
