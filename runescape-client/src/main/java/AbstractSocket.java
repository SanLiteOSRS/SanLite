import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qz")
@Implements("AbstractSocket")
public abstract class AbstractSocket {
	AbstractSocket() {
	} // L: 7

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1623804098"
	)
	@Export("isAvailable")
	public abstract boolean isAvailable(int var1) throws IOException;

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("available")
	public abstract int available() throws IOException;

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "82"
	)
	@Export("readUnsignedByte")
	public abstract int readUnsignedByte() throws IOException;

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "([BIIB)I",
		garbageValue = "-22"
	)
	@Export("read")
	public abstract int read(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-1586948718"
	)
	@Export("write")
	public abstract void write(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-22185"
	)
	@Export("close")
	public abstract void close();

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-643972337"
	)
	static void method7950(int var0) {
	} // L: 32

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1423800052"
	)
	static final int method7958(int var0, int var1) {
		if (var0 == -2) { // L: 977
			return 12345678;
		} else if (var0 == -1) { // L: 978
			if (var1 < 2) { // L: 979
				var1 = 2;
			} else if (var1 > 126) { // L: 980
				var1 = 126;
			}

			return var1; // L: 981
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 983
			if (var1 < 2) { // L: 984
				var1 = 2;
			} else if (var1 > 126) { // L: 985
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 986
		}
	}
}
