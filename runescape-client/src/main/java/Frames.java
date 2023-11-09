import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ha")
@Implements("Frames")
public class Frames extends DualNode {
	@ObfuscatedName("td")
	@ObfuscatedGetter(
		intValue = -1844423635
	)
	static int field2616;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lra;"
	)
	static IndexedSprite field2611;
	@ObfuscatedName("a")
	@Export("ByteArrayPool_alternativeSizes")
	public static int[] ByteArrayPool_alternativeSizes;
	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("archive10")
	static Archive archive10;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "[Lho;"
	)
	@Export("frames")
	Animation[] frames;

	@ObfuscatedSignature(
		descriptor = "(Lly;Lly;IZ)V",
		garbageValue = "0"
	)
	public Frames(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		NodeDeque var5 = new NodeDeque();
		int var6 = var1.getGroupFileCount(var3); // L: 12
		this.frames = new Animation[var6]; // L: 13
		int[] var7 = var1.getGroupFileIds(var3);

		for (int var8 = 0; var8 < var7.length; ++var8) {
			byte[] var9 = var1.takeFile(var3, var7[var8]);
			Skeleton var10 = null; // L: 17
			int var11 = (var9[0] & 255) << 8 | var9[1] & 255;

			for (Skeleton var12 = (Skeleton)var5.last(); var12 != null; var12 = (Skeleton)var5.previous()) { // L: 19 20 25
				if (var11 == var12.id) { // L: 21
					var10 = var12; // L: 22
					break;
				}
			}

			if (var10 == null) { // L: 27
				byte[] var13 = var2.getFile(var11, 0); // L: 30
				var10 = new Skeleton(var11, var13); // L: 31
				var5.addFirst(var10); // L: 32
			}

			this.frames[var7[var8]] = new Animation(var9, var10); // L: 34
		}

	} // L: 36

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-974350891"
	)
	@Export("hasAlphaTransform")
	public boolean hasAlphaTransform(int var1) {
		return this.frames[var1].hasAlphaTransform; // L: 39
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;ZI)[B",
		garbageValue = "2083897545"
	)
	public static byte[] method4623(Object var0, boolean var1) {
		if (var0 == null) { // L: 8
			return null;
		} else if (var0 instanceof byte[]) { // L: 9
			byte[] var3 = (byte[])((byte[])var0); // L: 10
			return var1 ? class451.method8356(var3) : var3; // L: 11
		} else if (var0 instanceof AbstractByteArrayCopier) { // L: 14
			AbstractByteArrayCopier var2 = (AbstractByteArrayCopier)var0; // L: 15
			return var2.get(); // L: 16
		} else {
			throw new IllegalArgumentException(); // L: 18
		}
	}
}
