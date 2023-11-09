import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("er")
@Implements("BuddyRankComparator")
public class BuddyRankComparator extends AbstractUserComparator {
	@ObfuscatedName("af")
	@Export("reversed")
	final boolean reversed;

	public BuddyRankComparator(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lpb;Lpb;B)I",
		garbageValue = "-49"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.rank != var1.rank) { // L: 14
			return this.reversed ? var1.rank - var2.rank : var2.rank - var1.rank; // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIII)J",
		garbageValue = "-1198658533"
	)
	static long method2959(int var0, int var1, int var2) {
		return (long)(var2 << 16 | var0 << 8 | var1); // L: 38
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lnm;Lnm;I)V",
		garbageValue = "893030532"
	)
	public static void method2958(AbstractArchive var0, AbstractArchive var1) {
		SpotAnimationDefinition.SpotAnimationDefinition_archive = var0; // L: 32
		SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = var1; // L: 33
	} // L: 34

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1625583201"
	)
	static int method2949(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0); // L: 79
		if (var1 == null) { // L: 80
			return -1;
		} else {
			return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.nextDual).count; // L: 81 82
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "-55"
	)
	public static String method2960(String var0) {
		int var1 = var0.length(); // L: 158
		char[] var2 = new char[var1]; // L: 159
		byte var3 = 2; // L: 160

		for (int var4 = 0; var4 < var1; ++var4) { // L: 161
			char var5 = var0.charAt(var4); // L: 162
			if (var3 == 0) { // L: 163
				var5 = Character.toLowerCase(var5);
			} else if (var3 == 2 || Character.isUpperCase(var5)) { // L: 164
				var5 = WorldMapSectionType.method5420(var5);
			}

			if (Character.isLetter(var5)) { // L: 165
				var3 = 0;
			} else if (var5 != '.' && var5 != '?' && var5 != '!') { // L: 166
				if (Character.isSpaceChar(var5)) { // L: 167
					if (var3 != 2) { // L: 168
						var3 = 1;
					}
				} else {
					var3 = 1; // L: 170
				}
			} else {
				var3 = 2;
			}

			var2[var4] = var5; // L: 171
		}

		return new String(var2); // L: 173
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1723997839"
	)
	public static int method2961(int var0) {
		if (var0 > 0) { // L: 194
			return 1;
		} else {
			return var0 < 0 ? -1 : 0; // L: 195 196
		}
	}
}
