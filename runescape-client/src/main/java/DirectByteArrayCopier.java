import java.nio.ByteBuffer;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nb")
@Implements("DirectByteArrayCopier")
public class DirectByteArrayCopier extends AbstractByteArrayCopier {
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	@Export("worldSelectRightSprite")
	static IndexedSprite worldSelectRightSprite;
	@ObfuscatedName("az")
	@Export("directBuffer")
	ByteBuffer directBuffer;

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "-126"
	)
	@Export("get")
	byte[] get() {
		byte[] var1 = new byte[this.directBuffer.capacity()]; // L: 13
		this.directBuffer.position(0); // L: 14
		this.directBuffer.get(var1); // L: 15
		return var1; // L: 16
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "-67"
	)
	@Export("set")
	public void set(byte[] var1) {
		this.directBuffer = ByteBuffer.allocateDirect(var1.length); // L: 20
		this.directBuffer.position(0); // L: 21
		this.directBuffer.put(var1); // L: 22
	} // L: 23
}
