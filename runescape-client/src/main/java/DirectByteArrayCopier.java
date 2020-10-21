import java.nio.ByteBuffer;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hv")
@Implements("DirectByteArrayCopier")
public class DirectByteArrayCopier extends AbstractByteArrayCopier {
	@ObfuscatedName("f")
	@Export("directBuffer")
	ByteBuffer directBuffer;

	DirectByteArrayCopier() {
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(B)[B",
		garbageValue = "-47"
	)
	@Export("get")
	byte[] get() {
		byte[] var1 = new byte[this.directBuffer.capacity()];
		this.directBuffer.position(0);
		this.directBuffer.get(var1);
		return var1;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "([BB)V",
		garbageValue = "0"
	)
	@Export("set")
	void set(byte[] var1) {
		this.directBuffer = ByteBuffer.allocateDirect(var1.length);
		this.directBuffer.position(0);
		this.directBuffer.put(var1);
	}
}
