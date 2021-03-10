import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hs")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
	AbstractByteArrayCopier() {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(I)[B",
		garbageValue = "1361682252"
	)
	@Export("get")
	abstract byte[] get();

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "([BI)V",
		garbageValue = "262833794"
	)
	@Export("set")
	abstract void set(byte[] var1);
}
