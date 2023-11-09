import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bx")
@Implements("SoundCache")
public class SoundCache {
	@ObfuscatedName("of")
	@ObfuscatedGetter(
		intValue = -733430137
	)
	@Export("selectedSpellFlags")
	static int selectedSpellFlags;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("soundEffectIndex")
	AbstractArchive soundEffectIndex;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	AbstractArchive field306;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lsq;"
	)
	NodeHashTable field307;

	@ObfuscatedSignature(
		descriptor = "(Lni;Lni;)V"
	)
	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		new NodeHashTable(256); // L: 11
		this.field307 = new NodeHashTable(256); // L: 14
		this.soundEffectIndex = var1; // L: 17
		this.field306 = var2; // L: 18
	} // L: 19

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II[II)Lbm;",
		garbageValue = "-384014510"
	)
	@Export("getSoundEffect0")
	RawSound getSoundEffect0(int var1, int var2, int[] var3) {
		long var4 = this.method846(var1, var2, false); // L: 22
		class53 var6 = (class53)this.field307.get(var4); // L: 23
		if (var6 != null) { // L: 24
			return var6.method1062();
		} else if (var3 != null && var3[0] <= 0) { // L: 25
			return null;
		} else {
			SoundEffect var7 = SoundEffect.readSoundEffect(this.soundEffectIndex, var1, var2); // L: 26
			if (var7 == null) { // L: 27
				return null;
			} else {
				RawSound var8 = var7.toRawSound(); // L: 28
				this.field307.put(new class53(var8), var4); // L: 29
				if (var3 != null) { // L: 30
					var3[0] -= var8.samples.length;
				}

				return var8; // L: 31
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)Lcg;",
		garbageValue = "-856323268"
	)
	class53 method854(int var1, int var2) {
		long var3 = this.method846(var1, var2, true); // L: 35
		class53 var5 = (class53)this.field307.get(var3); // L: 36
		if (var5 != null) { // L: 37
			return var5; // L: 38
		} else {
			class53 var6 = new class53(VorbisSample.readMusicSample(this.field306, var1, var2)); // L: 40
			this.field307.put(var6, var3); // L: 41
			return var6; // L: 42
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I[II)Lbm;",
		garbageValue = "-434495931"
	)
	@Export("getSoundEffect")
	RawSound getSoundEffect(int var1, int[] var2) {
		if (this.soundEffectIndex.getGroupCount() == 1) { // L: 46
			return this.getSoundEffect0(0, var1, var2);
		} else if (this.soundEffectIndex.getGroupFileCount(var1) == 1) {
			return this.getSoundEffect0(var1, 0, var2); // L: 47
		} else {
			throw new RuntimeException(); // L: 48
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Lcg;",
		garbageValue = "-1976225105"
	)
	public class53 method844(int var1) {
		if (this.field306.getGroupCount() == 1) { // L: 52
			return this.method854(0, var1); // L: 53
		} else if (this.field306.getGroupFileCount(var1) == 1) {
			return this.method854(var1, 0); // L: 56
		} else {
			throw new RuntimeException(); // L: 59
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)Lbm;",
		garbageValue = "1"
	)
	public RawSound method845(int var1) {
		return this.getSoundEffect(var1, (int[])null); // L: 64
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIZB)J",
		garbageValue = "25"
	)
	long method846(int var1, int var2, boolean var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >> 12); // L: 68
		var4 |= var1 << 16; // L: 69
		return var3 ? (long)var4 ^ 4294967296L : (long)var4; // L: 70 71 74
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lma;I)V",
		garbageValue = "16434318"
	)
	public static void method862(class312 var0) {
		class304.field3393.remove(var0); // L: 54
	} // L: 55

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)I",
		garbageValue = "-72"
	)
	static final int method860(int var0, int var1, int var2, int var3) {
		int var4 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var2 * 1024 / var3] >> 1; // L: 943
		return ((65536 - var4) * var0 >> 16) + (var4 * var1 >> 16); // L: 944
	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "989147980"
	)
	static long method849() {
		return Client.field608; // L: 3125
	}
}
