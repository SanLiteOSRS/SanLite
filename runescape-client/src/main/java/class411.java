import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pj")
public class class411 extends class418 {
	@ObfuscatedSignature(
		descriptor = "(Lql;)V"
	)
	public class411(class418 var1) {
		super(var1); // L: 9
		super.field4552 = "AddRequestTask"; // L: 10
	} // L: 11

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-799935345"
	)
	public boolean vmethod7858() {
		while (!class316.field3416.isEmpty()) { // L: 15
			class328 var1 = (class328)class316.field3416.peek(); // L: 16
			if (var1 == null) { // L: 17
				class316.field3416.pop(); // L: 18
			} else {
				var1.field3522 = this.method7805(); // L: 21
				class316.field3422.add(var1); // L: 22
				class316.field3416.pop(); // L: 23
			}
		}

		return true; // L: 25
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Lmn;",
		garbageValue = "1270029666"
	)
	MidiPcmStream method7805() {
		MidiPcmStream var1 = null; // L: 29
		Iterator var2 = class316.field3415.iterator(); // L: 30

		while (true) {
			MidiPcmStream var3;
			do {
				do {
					if (!var2.hasNext()) {
						if (var1 != null) { // L: 38
							++var1.field3455; // L: 39
							if (var1.method6007() == 0 && var1.isReady()) { // L: 40
								var1.clear(); // L: 41
								var1.method6011(); // L: 42
								var1.setPcmStreamVolume(0); // L: 43
							}
						}

						return var1; // L: 46
					}

					var3 = (MidiPcmStream)var2.next(); // L: 31
				} while(var3 == null); // L: 33
			} while(var1 != null && var1.field3455 <= var3.field3455 && (var3.method6007() != 0 || !var3.isReady()));

			var1 = var3; // L: 34
		}
	}
}
