import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fb")
@Implements("UserComparator5")
public class UserComparator5 extends AbstractUserComparator {
	@ObfuscatedName("z")
	@Export("reversed")
	final boolean reversed;

	public UserComparator5(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(Lko;Lko;B)I",
		garbageValue = "46"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0) {
			if (var2.world == 0) {
				return this.reversed ? -1 : 1;
			}
		} else if (var2.world != 0) {
			return this.reversed ? 1 : -1;
		}

		return this.compareUser(var1, var2);
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(Lic;IIB)[Lls;",
		garbageValue = "20"
	)
	public static IndexedSprite[] method3515(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2);
		boolean var3;
		if (var4 == null) {
			var3 = false;
		} else {
			Occluder.SpriteBuffer_decode(var4);
			var3 = true;
		}

		return !var3 ? null : class307.method5558();
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(I)[Lgd;",
		garbageValue = "-755062190"
	)
	public static class194[] method3518() {
		return new class194[]{class194.field2371, class194.field2362, class194.field2363, class194.field2370, class194.field2365, class194.field2366, class194.field2364, class194.field2368, class194.field2361, class194.field2367};
	}
}
