import java.util.ArrayList;
import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qp")
class class437 implements Comparator {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	final class438 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lqe;)V"
	)
	class437(class438 var1) {
		this.this$0 = var1; // L: 7
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lqd;Lqd;I)I",
		garbageValue = "-199204638"
	)
	int method7918(class439 var1, class439 var2) {
		if (var1.field4665 > var2.field4665) { // L: 9
			return 1;
		} else {
			return var1.field4665 < var2.field4665 ? -1 : 0; // L: 10 11
		}
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 19
	}

	public int compare(Object var1, Object var2) {
		return this.method7918((class439)var1, (class439)var2); // L: 15
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1139961954"
	)
	static void method7924(int var0, int var1) {
		if (class91.clientPreferences.method2515() != 0 && var0 != -1) { // L: 3927
			ArrayList var2 = new ArrayList(); // L: 3928
			var2.add(new class331(Language.field4435, var0, 0, class91.clientPreferences.method2515(), false)); // L: 3929
			class148.method3166(var2, 0, 0, 0, 0, true); // L: 3930
			Client.playingJingle = true; // L: 3931
		}

	} // L: 3933
}
