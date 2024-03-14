import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ks")
@Implements("Frames")
public class Frames extends DualNode {
	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "[Lvg;"
	)
	@Export("worldSelectStars")
	static IndexedSprite[] worldSelectStars;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Lkb;"
	)
	@Export("frames")
	Animation[] frames;

	@ObfuscatedSignature(
		descriptor = "(Lof;Lof;IZ)V"
	)
	Frames(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		NodeDeque var5 = new NodeDeque(); // L: 35
		int var6 = var1.getGroupFileCount(var3); // L: 36
		this.frames = new Animation[var6]; // L: 37
		int[] var7 = var1.getGroupFileIds(var3); // L: 38

		for (int var8 = 0; var8 < var7.length; ++var8) { // L: 39
			byte[] var9 = var1.takeFile(var3, var7[var8]); // L: 40
			Skeleton var10 = null; // L: 41
			int var11 = (var9[0] & 255) << 8 | var9[1] & 255; // L: 42

			for (Skeleton var12 = (Skeleton)var5.last(); var12 != null; var12 = (Skeleton)var5.previous()) { // L: 43 44 49
				if (var11 == var12.id) { // L: 45
					var10 = var12; // L: 46
					break;
				}
			}

			if (var10 == null) { // L: 51
				byte[] var13;
				if (var4) { // L: 53
					var13 = var2.getFile(0, var11);
				} else {
					var13 = var2.getFile(var11, 0); // L: 54
				}

				var10 = new Skeleton(var11, var13); // L: 55
				var5.addFirst(var10); // L: 56
			}

			this.frames[var7[var8]] = new Animation(var9, var10); // L: 58
		}

	} // L: 60

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-79"
	)
	@Export("hasAlphaTransform")
	public boolean hasAlphaTransform(int var1) {
		return this.frames[var1].hasAlphaTransform; // L: 63
	}

	@ObfuscatedName("my")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "549876396"
	)
	static final int method5635() {
		float var0 = 200.0F * ((float)class30.clientPreferences.method2542() - 0.5F); // L: 12342
		return 100 - Math.round(var0); // L: 12343
	}
}
