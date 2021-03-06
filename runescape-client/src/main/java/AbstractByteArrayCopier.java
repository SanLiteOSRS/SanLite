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
		garbageValue = "1361682252",
		signature = "(I)[B"
	)
	@Export("get")
	abstract byte[] get();

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		garbageValue = "262833794",
		signature = "([BI)V"
	)
	@Export("set")
	abstract void set(byte[] var1);
}
