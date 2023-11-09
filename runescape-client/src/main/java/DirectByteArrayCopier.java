import java.nio.ByteBuffer;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mt")
@Implements("DirectByteArrayCopier")
public class DirectByteArrayCopier extends AbstractByteArrayCopier {
	@ObfuscatedName("at")
	@Export("directBuffer")
	ByteBuffer directBuffer;

	DirectByteArrayCopier() {
	} // L: 10

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-2143916315"
	)
	@Export("get")
	byte[] get() {
		byte[] var1 = new byte[this.directBuffer.capacity()]; // L: 13
		this.directBuffer.position(0); // L: 14
		this.directBuffer.get(var1); // L: 15
		return var1; // L: 16
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-752004447"
	)
	@Export("set")
	void set(byte[] var1) {
		this.directBuffer = ByteBuffer.allocateDirect(var1.length); // L: 20
		this.directBuffer.position(0); // L: 21
		this.directBuffer.put(var1); // L: 22
	} // L: 23

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(Ldv;B)V",
		garbageValue = "-55"
	)
	static final void method6568(PendingSpawn var0) {
		long var1 = 0L; // L: 8367
		int var3 = -1; // L: 8368
		int var4 = 0; // L: 8369
		int var5 = 0; // L: 8370
		if (var0.type == 0) { // L: 8371
			var1 = class36.scene.getWallObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 1) { // L: 8372
			var1 = class36.scene.getDecorativeObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 2) { // L: 8373
			var1 = class36.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 3) { // L: 8374
			var1 = class36.scene.getGroundObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var1 != 0L) { // L: 8375
			int var6 = class36.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1); // L: 8376
			var3 = class215.Entity_unpackID(var1); // L: 8377
			var4 = var6 & 31; // L: 8378
			var5 = var6 >> 6 & 3; // L: 8379
		}

		var0.objectId = var3; // L: 8381
		var0.field1133 = var4; // L: 8382
		var0.field1140 = var5; // L: 8383
	} // L: 8384
}
