import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ql")
public class class418 extends class425 {
	@ObfuscatedSignature(
		descriptor = "(Lqe;)V"
	)
	public class418(class425 var1) {
		super(var1); // L: 9
		super.field4627 = "AddRequestTask"; // L: 10
	} // L: 11

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2024199564"
	)
	public boolean vmethod8043() {
		while (!class321.field3478.isEmpty()) { // L: 15
			class333 var1 = (class333)class321.field3478.peek(); // L: 16
			if (var1 == null) { // L: 17
				class321.field3478.pop(); // L: 18
			} else {
				var1.field3594 = this.method7985(); // L: 21
				class321.field3474.add(var1); // L: 22
				class321.field3478.pop(); // L: 23
			}
		}

		return true; // L: 25
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lmo;",
		garbageValue = "-485784038"
	)
	MidiPcmStream method7985() {
		MidiPcmStream var1 = null; // L: 29
		Iterator var2 = class321.field3479.iterator(); // L: 30

		while (true) {
			MidiPcmStream var3;
			do {
				do {
					if (!var2.hasNext()) {
						if (var1 != null) { // L: 38
							++var1.field3518; // L: 39
							if (var1.method6150() == 0 && var1.isReady()) { // L: 40
								var1.clear(); // L: 41
								var1.method6202(); // L: 42
								var1.setPcmStreamVolume(0); // L: 43
							}
						}

						return var1; // L: 46
					}

					var3 = (MidiPcmStream)var2.next(); // L: 31
				} while(var3 == null); // L: 33
			} while(var1 != null && var1.field3518 <= var3.field3518 && (var3.method6150() != 0 || !var3.isReady()));

			var1 = var3; // L: 34
		}
	}
}
