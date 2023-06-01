import java.nio.ByteBuffer;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mj")
@Implements("DirectByteArrayCopier")
public class DirectByteArrayCopier extends AbstractByteArrayCopier {
	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "[Ltt;"
	)
	@Export("mapDotSprites")
	static SpritePixels[] mapDotSprites;
	@ObfuscatedName("ay")
	@Export("directBuffer")
	ByteBuffer directBuffer;

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-430930006"
	)
	@Export("get")
	byte[] get() {
		byte[] var1 = new byte[this.directBuffer.capacity()]; // L: 13
		this.directBuffer.position(0); // L: 14
		this.directBuffer.get(var1); // L: 15
		return var1; // L: 16
	}

	@ObfuscatedName("ab")
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([FIFI)F",
		garbageValue = "399850909"
	)
	static float method6617(float[] var0, int var1, float var2) {
		float var3 = var0[var1]; // L: 108

		for (int var4 = var1 - 1; var4 >= 0; --var4) { // L: 109
			var3 = var0[var4] + var2 * var3; // L: 110
		}

		return var3; // L: 112
	}
}
