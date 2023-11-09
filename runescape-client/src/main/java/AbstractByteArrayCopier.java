import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mu")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
	AbstractByteArrayCopier() {
	} // L: 4

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-1234922791"
	)
	@Export("get")
	public abstract byte[] get();

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "2019945218"
	)
	@Export("set")
	abstract void set(byte[] var1);
}
