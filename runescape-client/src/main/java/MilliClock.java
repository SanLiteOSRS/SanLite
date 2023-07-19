import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gy")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("ai")
	long[] field1881;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 763976735
	)
	int field1882;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 307690943
	)
	int field1883;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = 76046822303678177L
	)
	long field1880;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1279647793
	)
	int field1884;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -2003644419
	)
	int field1885;

	public MilliClock() {
		this.field1881 = new long[10]; // L: 7
		this.field1882 = 256; // L: 15
		this.field1883 = 1; // L: 16
		this.field1884 = 0; // L: 17
		this.field1880 = AttackOption.method2714(); // L: 18

		for (int var1 = 0; var1 < 10; ++var1) { // L: 19
			this.field1881[var1] = this.field1880; // L: 20
		}

	} // L: 22

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1677705643"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) { // L: 25
			this.field1881[var1] = 0L; // L: 26
		}

	} // L: 28

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "929339531"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field1882; // L: 31
		int var4 = this.field1883; // L: 32
		this.field1882 = 300; // L: 33
		this.field1883 = 1; // L: 34
		this.field1880 = AttackOption.method2714(); // L: 35
		if (0L == this.field1881[this.field1885]) { // L: 36
			this.field1882 = var3; // L: 37
			this.field1883 = var4; // L: 38
		} else if (this.field1880 > this.field1881[this.field1885]) { // L: 40
			this.field1882 = (int)((long)(var1 * 2560) / (this.field1880 - this.field1881[this.field1885]));
		}

		if (this.field1882 < 25) { // L: 41
			this.field1882 = 25;
		}

		if (this.field1882 > 256) { // L: 42
			this.field1882 = 256; // L: 43
			this.field1883 = (int)((long)var1 - (this.field1880 - this.field1881[this.field1885]) / 10L); // L: 44
		}

		if (this.field1883 > var1) { // L: 46
			this.field1883 = var1;
		}

		this.field1881[this.field1885] = this.field1880; // L: 47
		this.field1885 = (this.field1885 + 1) % 10; // L: 48
		int var5;
		if (this.field1883 > 1) { // L: 49
			for (var5 = 0; var5 < 10; ++var5) { // L: 50
				if (0L != this.field1881[var5]) { // L: 51
					this.field1881[var5] += (long)this.field1883;
				}
			}
		}

		if (this.field1883 < var2) { // L: 54
			this.field1883 = var2;
		}

		class9.method82((long)this.field1883); // L: 55

		for (var5 = 0; this.field1884 < 256; this.field1884 += this.field1882) { // L: 56 57 59
			++var5; // L: 58
		}

		this.field1884 &= 255; // L: 61
		return var5; // L: 62
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-626704846"
	)
	public static void method3625() {
		ParamComposition.ParamComposition_cached.clear(); // L: 72
	} // L: 73

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(Ldv;I)V",
		garbageValue = "2071952350"
	)
	static final void method3630(PendingSpawn var0) {
		long var1 = 0L; // L: 8376
		int var3 = -1; // L: 8377
		int var4 = 0; // L: 8378
		int var5 = 0; // L: 8379
		if (var0.type == 0) { // L: 8380
			var1 = class173.scene.getWallObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 1) { // L: 8381
			var1 = class173.scene.getDecorativeObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 2) { // L: 8382
			var1 = class173.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 3) { // L: 8383
			var1 = class173.scene.getGroundObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var1 != 0L) { // L: 8384
			int var6 = class173.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1); // L: 8385
			var3 = class318.Entity_unpackID(var1); // L: 8386
			var4 = var6 & 31; // L: 8387
			var5 = var6 >> 6 & 3; // L: 8388
		}

		var0.objectId = var3; // L: 8390
		var0.field1162 = var4; // L: 8391
		var0.field1167 = var5; // L: 8392
	} // L: 8393
}
