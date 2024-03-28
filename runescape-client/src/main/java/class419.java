import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qe")
public class class419 extends class426 {
	@ObfuscatedSignature(
		descriptor = "(Lqc;)V"
	)
	public class419(class426 var1) {
		super(var1); // L: 9
		super.field4651 = "AddRequestTask"; // L: 10
	} // L: 11

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-362428891"
	)
	public boolean vmethod7854() {
		while (!class321.field3500.isEmpty()) { // L: 15
			class333 var1 = (class333)class321.field3500.peek(); // L: 16
			if (var1 == null) { // L: 17
				class321.field3500.pop(); // L: 18
			} else {
				var1.field3613 = this.method7793(); // L: 21
				class321.field3495.add(var1); // L: 22
				class321.field3500.pop(); // L: 23
			}
		}

		return true; // L: 25
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Lmx;",
		garbageValue = "0"
	)
	MidiPcmStream method7793() {
		MidiPcmStream var1 = null; // L: 29
		Iterator var2 = class321.field3491.iterator(); // L: 30

		while (true) {
			MidiPcmStream var3;
			do {
				do {
					if (!var2.hasNext()) {
						if (var1 != null) { // L: 38
							++var1.field3534; // L: 39
							if (var1.method6000() == 0 && var1.isReady()) { // L: 40
								var1.clear(); // L: 41
								var1.method6004(); // L: 42
								var1.setPcmStreamVolume(0); // L: 43
							}
						}

						return var1; // L: 46
					}

					var3 = (MidiPcmStream)var2.next(); // L: 31
				} while(var3 == null); // L: 33
			} while(var1 != null && var1.field3534 <= var3.field3534 && (var3.method6000() != 0 || !var3.isReady()));

			var1 = var3; // L: 34
		}
	}
}
