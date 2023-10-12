import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ee")
@Implements("UserComparator9")
public class UserComparator9 extends AbstractUserComparator {
	@ObfuscatedName("ac")
	@Export("reversed")
	final boolean reversed;

	public UserComparator9(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lri;Lri;I)I",
		garbageValue = "1813564346"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) { // L: 15
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername()); // L: 16
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lom;Lom;Lom;I)V",
		garbageValue = "-1363426561"
	)
	public static void method2917(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
		HitSplatDefinition.HitSplatDefinition_archive = var0; // L: 46
		HitSplatDefinition.field2167 = var1; // L: 47
		class135.HitSplatDefinition_fontsArchive = var2; // L: 48
	} // L: 49

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Lva;",
		garbageValue = "1793860244"
	)
	public static PrivateChatMode method2919(int var0) {
		PrivateChatMode[] var1 = new PrivateChatMode[]{PrivateChatMode.field5272, PrivateChatMode.field5273, PrivateChatMode.field5274};
		PrivateChatMode[] var2 = var1; // L: 20

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 21
			PrivateChatMode var4 = var2[var3]; // L: 22
			if (var0 == var4.field5271) { // L: 24
				return var4;
			}
		}

		return null; // L: 28
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1897883590"
	)
	public static void method2912() {
		class212.archive6.clear(); // L: 17
	} // L: 18

	@ObfuscatedName("mc")
	@ObfuscatedSignature(
		descriptor = "(Lnm;I)Z",
		garbageValue = "1578685634"
	)
	@Export("runCs1")
	static final boolean runCs1(Widget var0) {
		if (var0.cs1Comparisons == null) { // L: 11256
			return false;
		} else {
			for (int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) { // L: 11257
				int var2 = VarcInt.method3681(var0, var1); // L: 11258
				int var3 = var0.cs1ComparisonValues[var1]; // L: 11259
				if (var0.cs1Comparisons[var1] == 2) { // L: 11260
					if (var2 >= var3) { // L: 11261
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 3) { // L: 11263
					if (var2 <= var3) { // L: 11264
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 4) { // L: 11266
					if (var2 == var3) { // L: 11267
						return false;
					}
				} else if (var3 != var2) { // L: 11269
					return false;
				}
			}

			return true; // L: 11271
		}
	}
}
