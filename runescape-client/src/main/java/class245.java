import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("il")
public class class245 {
	@ObfuscatedName("i")
	static int[] field2908;

	static {
		new Object();
		field2908 = new int[33];
		field2908[0] = 0;
		int var0 = 2;

		for (int var1 = 1; var1 < 33; ++var1) {
			field2908[var1] = var0 - 1;
			var0 += var0;
		}

	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(S)[Ljk;",
		garbageValue = "15748"
	)
	static GameBuild[] method4742() {
		return new GameBuild[]{GameBuild.LIVE, GameBuild.WIP, GameBuild.RC, GameBuild.BUILDLIVE};
	}
}
