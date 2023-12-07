import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("np")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "[Luz;"
	)
	static SpritePixels[] field3816;

	AbstractByteArrayCopier() {
	} // L: 4

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "5"
	)
	@Export("get")
	abstract byte[] get();

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "67"
	)
	@Export("set")
	abstract void set(byte[] var1);

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-880488507"
	)
	static boolean method6822() {
		return (Client.drawPlayerNames & 1) != 0; // L: 5184
	}
}
