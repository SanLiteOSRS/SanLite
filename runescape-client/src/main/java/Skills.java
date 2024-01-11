import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ny")
@Implements("Skills")
public class Skills {
	@ObfuscatedName("ap")
	@Export("Skills_enabled")
	public static final boolean[] Skills_enabled;
	@ObfuscatedName("af")
	@Export("Skills_experienceTable")
	public static int[] Skills_experienceTable;
	@ObfuscatedName("ag")
	static boolean[] field3912;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -1485031115
	)
	static int field3911;

	static {
		Skills_enabled = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false}; // L: 5
		Skills_experienceTable = new int[99]; // L: 6
		int var0 = 0; // L: 9

		for (int var1 = 0; var1 < 99; ++var1) { // L: 10
			int var2 = var1 + 1; // L: 11
			int var3 = (int)((double)var2 + 300.0D * Math.pow(2.0D, (double)var2 / 7.0D)); // L: 12
			var0 += var3; // L: 13
			Skills_experienceTable[var1] = var0 / 4; // L: 14
		}

	} // L: 16

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIII)V",
		garbageValue = "1951977903"
	)
	static void method6928(ArrayList var0, int var1, int var2, int var3, int var4) {
		if (!var0.isEmpty()) { // L: 3883
			int var5 = (Integer)var0.get(0); // L: 3886
			if (var5 == -1 && !Client.playingJingle) { // L: 3887
				Actor.method2488(0, 0); // L: 3888
			} else if (var5 != -1) { // L: 3890
				boolean var6;
				if (class319.field3466.isEmpty()) { // L: 3893
					var6 = false; // L: 3898
				} else {
					class331 var7 = (class331)class319.field3466.get(0); // L: 3894
					var6 = var7 != null && var5 == var7.field3573; // L: 3895
				}

				if (!var6 && class93.clientPreferences.method2597() != 0) { // L: 3900 3901
					ArrayList var9 = new ArrayList(); // L: 3902

					for (int var8 = 0; var8 < var0.size(); ++var8) { // L: 3903
						var9.add(new class331(WorldMapSection0.field2587, (Integer)var0.get(var8), 0, class93.clientPreferences.method2597(), false)); // L: 3904
					}

					if (Client.playingJingle) { // L: 3906
						class319.field3466.clear(); // L: 3908
						class319.field3466.addAll(var9); // L: 3909
						WorldMapRectangle.method5019(var1, var2, var3, var4); // L: 3910
					} else {
						LoginScreenAnimation.method2528(var9, var1, var2, var3, var4, false); // L: 3914
					}
				}
			}

		}
	} // L: 3884 3919
}
