import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jr")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
	@ObfuscatedName("p")
	@Export("ByteArrayPool_arrays")
	public static byte[][][] ByteArrayPool_arrays;
	@ObfuscatedName("al")
	@Export("client")
	@ObfuscatedSignature(
		descriptor = "Lclient;"
	)
	static Client client;

	AbstractByteArrayCopier() {
	} // L: 4

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-946242295"
	)
	@Export("get")
	abstract byte[] get();

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "1451224319"
	)
	@Export("set")
	public abstract void set(byte[] var1);
}
