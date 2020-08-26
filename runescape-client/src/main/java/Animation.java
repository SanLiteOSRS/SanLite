import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("es")
@Implements("Animation")
public class Animation {
	@ObfuscatedName("z")
	static int[] field1659;
	@ObfuscatedName("k")
	static int[] field1658;
	@ObfuscatedName("s")
	static int[] field1667;
	@ObfuscatedName("t")
	static int[] field1660;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "Leh;"
	)
	@Export("skeleton")
	Skeleton skeleton;
	@ObfuscatedName("o")
	@Export("transformCount")
	int transformCount;
	@ObfuscatedName("x")
	@Export("transformSkeletonLabels")
	int[] transformSkeletonLabels;
	@ObfuscatedName("w")
	@Export("transformXs")
	int[] transformXs;
	@ObfuscatedName("g")
	@Export("transformYs")
	int[] transformYs;
	@ObfuscatedName("m")
	@Export("transformZs")
	int[] transformZs;
	@ObfuscatedName("n")
	@Export("hasAlphaTransform")
	boolean hasAlphaTransform;

	static {
		field1659 = new int[500];
		field1658 = new int[500];
		field1667 = new int[500];
		field1660 = new int[500];
	}

	@ObfuscatedSignature(
		signature = "([BLeh;)V"
	)
	Animation(byte[] var1, Skeleton var2) {
		this.skeleton = null;
		this.transformCount = -1;
		this.hasAlphaTransform = false;
		this.skeleton = var2;
		Buffer var3 = new Buffer(var1);
		Buffer var4 = new Buffer(var1);
		var3.offset = 2;
		int var5 = var3.readUnsignedByte();
		int var6 = -1;
		int var7 = 0;
		var4.offset = var5 + var3.offset;

		int var8;
		for (var8 = 0; var8 < var5; ++var8) {
			int var9 = var3.readUnsignedByte();
			if (var9 > 0) {
				if (this.skeleton.transformTypes[var8] != 0) {
					for (int var10 = var8 - 1; var10 > var6; --var10) {
						if (this.skeleton.transformTypes[var10] == 0) {
							field1659[var7] = var10;
							field1658[var7] = 0;
							field1667[var7] = 0;
							field1660[var7] = 0;
							++var7;
							break;
						}
					}
				}

				field1659[var7] = var8;
				short var11 = 0;
				if (this.skeleton.transformTypes[var8] == 3) {
					var11 = 128;
				}

				if ((var9 & 1) != 0) {
					field1658[var7] = var4.readShortSmart();
				} else {
					field1658[var7] = var11;
				}

				if ((var9 & 2) != 0) {
					field1667[var7] = var4.readShortSmart();
				} else {
					field1667[var7] = var11;
				}

				if ((var9 & 4) != 0) {
					field1660[var7] = var4.readShortSmart();
				} else {
					field1660[var7] = var11;
				}

				var6 = var8;
				++var7;
				if (this.skeleton.transformTypes[var8] == 5) {
					this.hasAlphaTransform = true;
				}
			}
		}

		if (var1.length != var4.offset) {
			throw new RuntimeException();
		} else {
			this.transformCount = var7;
			this.transformSkeletonLabels = new int[var7];
			this.transformXs = new int[var7];
			this.transformYs = new int[var7];
			this.transformZs = new int[var7];

			for (var8 = 0; var8 < var7; ++var8) {
				this.transformSkeletonLabels[var8] = field1659[var8];
				this.transformXs[var8] = field1658[var8];
				this.transformYs[var8] = field1667[var8];
				this.transformZs[var8] = field1660[var8];
			}

		}
	}
}
