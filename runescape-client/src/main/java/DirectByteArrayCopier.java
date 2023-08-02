import java.nio.ByteBuffer;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("np")
@Implements("DirectByteArrayCopier")
public class DirectByteArrayCopier extends AbstractByteArrayCopier {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	static IndexedSprite field3792;
	@ObfuscatedName("ix")
	@ObfuscatedGetter(
		intValue = -2097525913
	)
	static int field3796;
	@ObfuscatedName("aw")
	@Export("directBuffer")
	ByteBuffer directBuffer;

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-2134030911"
	)
	@Export("get")
	byte[] get() {
		byte[] var1 = new byte[this.directBuffer.capacity()]; // L: 13
		this.directBuffer.position(0); // L: 14
		this.directBuffer.get(var1); // L: 15
		return var1; // L: 16
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-379413774"
	)
	@Export("set")
	public void set(byte[] var1) {
		this.directBuffer = ByteBuffer.allocateDirect(var1.length); // L: 20
		this.directBuffer.position(0); // L: 21
		this.directBuffer.put(var1); // L: 22
	} // L: 23
}
