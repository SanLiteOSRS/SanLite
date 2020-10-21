import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lv")
@Implements("AbstractSocket")
public abstract class AbstractSocket {
	protected AbstractSocket() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1983450651"
	)
	@Export("close")
	public abstract void close();

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "1"
	)
	@Export("readUnsignedByte")
	public abstract int readUnsignedByte() throws IOException;

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "933186835"
	)
	@Export("available")
	public abstract int available() throws IOException;

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(II)Z",
		garbageValue = "-916126565"
	)
	@Export("isAvailable")
	public abstract boolean isAvailable(int var1) throws IOException;

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "([BIII)I",
		garbageValue = "1049423117"
	)
	@Export("read")
	public abstract int read(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "([BIII)V",
		garbageValue = "1456512196"
	)
	@Export("write")
	public abstract void write(byte[] var1, int var2, int var3) throws IOException;
}
