import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ff")
public class class135 implements class125 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lol;Lol;IZB)Lko;",
		garbageValue = "1"
	)
	public static Frames method3151(AbstractArchive var0, AbstractArchive var1, int var2, boolean var3) {
		boolean var4 = true; // L: 11
		int[] var5 = var0.getGroupFileIds(var2); // L: 12

		for (int var6 = 0; var6 < var5.length; ++var6) { // L: 13
			byte[] var7 = var0.getFile(var2, var5[var6]); // L: 14
			if (var7 == null) { // L: 15
				var4 = false; // L: 16
			} else {
				int var8 = (var7[0] & 255) << 8 | var7[1] & 255; // L: 19
				byte[] var9;
				if (var3) { // L: 21
					var9 = var1.getFile(0, var8);
				} else {
					var9 = var1.getFile(var8, 0); // L: 22
				}

				if (var9 == null) { // L: 23
					var4 = false;
				}
			}
		}

		if (!var4) { // L: 25
			return null;
		} else {
			try {
				return new Frames(var0, var1, var2, var3); // L: 27
			} catch (Exception var11) { // L: 29
				return null; // L: 30
			}
		}
	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIIB)V",
		garbageValue = "112"
	)
	static void method3152(ArrayList var0, int var1, int var2, int var3, int var4) {
		if (!var0.isEmpty()) { // L: 3745
			int var5 = (Integer)var0.get(0); // L: 3748
			if (var5 == -1 && !Client.playingJingle) { // L: 3749
				WorldMapManager.method4769(0, 0); // L: 3750
			} else if (var5 != -1) { // L: 3752
				boolean var6;
				if (class316.field3424.isEmpty()) { // L: 3755
					var6 = false; // L: 3760
				} else {
					class328 var7 = (class328)class316.field3424.get(0); // L: 3756
					var6 = var7 != null && var5 == var7.field3523; // L: 3757
				}

				if (!var6 && WorldMapIcon_1.clientPreferences.method2554() != 0) { // L: 3762 3763
					ArrayList var9 = new ArrayList(); // L: 3764

					for (int var8 = 0; var8 < var0.size(); ++var8) { // L: 3765
						var9.add(new class328(class514.field5059, (Integer)var0.get(var8), 0, WorldMapIcon_1.clientPreferences.method2554(), false)); // L: 3766
					}

					if (Client.playingJingle) { // L: 3768
						class316.field3424.clear(); // L: 3770
						class316.field3424.addAll(var9); // L: 3771
						EnumComposition.method3678(var1, var2, var3, var4); // L: 3772
					} else {
						PendingSpawn.method2459(var9, var1, var2, var3, var4, false); // L: 3776
					}
				}
			}

		}
	} // L: 3746 3781
}
