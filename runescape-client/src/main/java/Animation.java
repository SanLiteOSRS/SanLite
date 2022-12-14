import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ho")
@Implements("Animation")
public class Animation {
	@ObfuscatedName("h")
	static int[] field2454;
	@ObfuscatedName("e")
	static int[] field2448;
	@ObfuscatedName("v")
	static int[] field2449;
	@ObfuscatedName("x")
	static int[] field2450;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lhn;"
	)
	@Export("skeleton")
	Skeleton skeleton;
	@ObfuscatedName("q")
	@Export("transformCount")
	int transformCount;
	@ObfuscatedName("f")
	@Export("transformSkeletonLabels")
	int[] transformSkeletonLabels;
	@ObfuscatedName("r")
	@Export("transformXs")
	int[] transformXs;
	@ObfuscatedName("u")
	@Export("transformYs")
	int[] transformYs;
	@ObfuscatedName("b")
	@Export("transformZs")
	int[] transformZs;
	@ObfuscatedName("j")
	@Export("hasAlphaTransform")
	boolean hasAlphaTransform;

	static {
		field2454 = new int[500]; // L: 8
		field2448 = new int[500]; // L: 9
		field2449 = new int[500]; // L: 10
		field2450 = new int[500]; // L: 11
	}

	@ObfuscatedSignature(
		descriptor = "([BLhn;)V"
	)
	Animation(byte[] var1, Skeleton var2) {
		this.skeleton = null; // L: 12
		this.transformCount = -1; // L: 13
		this.hasAlphaTransform = false; // L: 18
		this.skeleton = var2; // L: 21
		Buffer var3 = new Buffer(var1); // L: 22
		Buffer var4 = new Buffer(var1); // L: 23
		var3.offset = 2; // L: 24
		int var5 = var3.readUnsignedByte(); // L: 25
		int var6 = -1; // L: 26
		int var7 = 0; // L: 27
		var4.offset = var5 + var3.offset; // L: 28

		int var8;
		for (var8 = 0; var8 < var5; ++var8) { // L: 29
			int var9 = var3.readUnsignedByte(); // L: 30
			if (var9 > 0) { // L: 31
				if (this.skeleton.transformTypes[var8] != 0) { // L: 32
					for (int var10 = var8 - 1; var10 > var6; --var10) { // L: 33
						if (this.skeleton.transformTypes[var10] == 0) { // L: 34
							field2454[var7] = var10; // L: 35
							field2448[var7] = 0; // L: 36
							field2449[var7] = 0; // L: 37
							field2450[var7] = 0; // L: 38
							++var7; // L: 39
							break;
						}
					}
				}

				field2454[var7] = var8; // L: 44
				short var11 = 0; // L: 45
				if (this.skeleton.transformTypes[var8] == 3) { // L: 46
					var11 = 128;
				}

				if ((var9 & 1) != 0) { // L: 47
					field2448[var7] = var4.readShortSmart();
				} else {
					field2448[var7] = var11; // L: 48
				}

				if ((var9 & 2) != 0) { // L: 49
					field2449[var7] = var4.readShortSmart();
				} else {
					field2449[var7] = var11; // L: 50
				}

				if ((var9 & 4) != 0) { // L: 51
					field2450[var7] = var4.readShortSmart();
				} else {
					field2450[var7] = var11; // L: 52
				}

				var6 = var8; // L: 53
				++var7; // L: 54
				if (this.skeleton.transformTypes[var8] == 5) { // L: 55
					this.hasAlphaTransform = true;
				}
			}
		}

		if (var1.length != var4.offset) { // L: 58
			throw new RuntimeException(); // L: 59
		} else {
			this.transformCount = var7; // L: 61
			this.transformSkeletonLabels = new int[var7]; // L: 62
			this.transformXs = new int[var7]; // L: 63
			this.transformYs = new int[var7]; // L: 64
			this.transformZs = new int[var7]; // L: 65

			for (var8 = 0; var8 < var7; ++var8) { // L: 66
				this.transformSkeletonLabels[var8] = field2454[var8]; // L: 67
				this.transformXs[var8] = field2448[var8]; // L: 68
				this.transformYs[var8] = field2449[var8]; // L: 69
				this.transformZs[var8] = field2450[var8]; // L: 70
			}

		}
	} // L: 72
}
