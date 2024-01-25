import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pb")
public class class415 extends class422 {
	@ObfuscatedSignature(
		descriptor = "(Lqd;)V"
	)
	public class415(class422 var1) {
		super(var1); // L: 9
		super.field4597 = "AddRequestTask"; // L: 10
	} // L: 11

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2012801823"
	)
	public boolean vmethod7975() {
		while (!class319.field3461.isEmpty()) { // L: 15
			class331 var1 = (class331)class319.field3461.peek(); // L: 16
			if (var1 == null) { // L: 17
				class319.field3461.pop(); // L: 18
			} else {
				var1.field3582 = this.method7914(); // L: 21
				class319.field3459.add(var1); // L: 22
				class319.field3461.pop(); // L: 23
			}
		}

		return true; // L: 25
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lmk;",
		garbageValue = "450811833"
	)
	MidiPcmStream method7914() {
		MidiPcmStream var1 = null; // L: 29
		Iterator var2 = class319.field3457.iterator(); // L: 30

		while (true) {
			MidiPcmStream var3;
			do {
				do {
					if (!var2.hasNext()) {
						if (var1 != null) { // L: 38
							++var1.field3499; // L: 39
							if (var1.method6071() == 0 && var1.isReady()) { // L: 40
								var1.clear(); // L: 41
								var1.method6075(); // L: 42
								var1.setPcmStreamVolume(0); // L: 43
							}
						}

						return var1; // L: 46
					}

					var3 = (MidiPcmStream)var2.next(); // L: 31
				} while(var3 == null); // L: 33
			} while(var1 != null && var1.field3499 <= var3.field3499 && (var3.method6071() != 0 || !var3.isReady()));

			var1 = var3; // L: 34
		}
	}

	@ObfuscatedName("pe")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "1"
	)
	static void method7922(boolean var0) {
		Client.field645 = var0; // L: 12766
	} // L: 12767
}
