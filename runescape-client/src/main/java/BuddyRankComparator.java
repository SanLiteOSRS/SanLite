import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("es")
@Implements("BuddyRankComparator")
public class BuddyRankComparator extends AbstractUserComparator {
	@ObfuscatedName("am")
	@Export("reversed")
	final boolean reversed;

	public BuddyRankComparator(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lrj;Lrj;I)I",
		garbageValue = "1898768769"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.rank != var1.rank) {
			return this.reversed ? var1.rank - var2.rank : var2.rank - var1.rank;
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("am")
	public static final void method2992(long var0) {
		if (var0 > 0L) { // L: 9
			if (0L == var0 % 10L) { // L: 10
				GameBuild.method6934(var0 - 1L); // L: 11
				GameBuild.method6934(1L); // L: 12
			} else {
				GameBuild.method6934(var0); // L: 14
			}

		}
	} // L: 15

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)[Lff;",
		garbageValue = "-1880947968"
	)
	static class132[] method2996() {
		return new class132[]{class132.field1555, class132.field1553, class132.field1554, class132.field1560, class132.field1556, class132.field1561}; // L: 25
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lnn;I)I",
		garbageValue = "116060212"
	)
	static int method2997(Widget var0) {
		if (var0.type != 11) { // L: 1603
			Interpreter.Interpreter_stringStack[class211.Interpreter_stringStackSize - 1] = ""; // L: 1604
			return 1; // L: 1605
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize]; // L: 1607
			Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var0.method6806(var1); // L: 1608
			return 1; // L: 1609
		}
	}

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "3"
	)
	static final void method2990() {
		for (PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 8537 8538 8544
			if (var0.hitpoints == -1) { // L: 8539
				var0.delay = 0; // L: 8540
				class1.method12(var0); // L: 8541
			} else {
				var0.remove(); // L: 8543
			}
		}

	} // L: 8546
}
