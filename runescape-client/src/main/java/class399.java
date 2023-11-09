import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pf")
public class class399 extends class406 {
	@ObfuscatedName("tw")
	@ObfuscatedSignature(
		descriptor = "Lbb;"
	)
	@Export("pcmPlayer0")
	static PcmPlayer pcmPlayer0;

	@ObfuscatedSignature(
		descriptor = "(Lpm;)V"
	)
	public class399(class406 var1) {
		super(var1); // L: 9
		super.field4523 = "AddRequestTask"; // L: 10
	} // L: 11

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1604030758"
	)
	public boolean vmethod7621() {
		while (!class305.field3411.isEmpty()) { // L: 15
			class317 var1 = (class317)class305.field3411.peek(); // L: 16
			if (var1 == null) { // L: 17
				class305.field3411.pop(); // L: 18
			} else {
				var1.field3517 = this.method7571(); // L: 21
				class305.field3404.add(var1); // L: 22
				class305.field3411.pop(); // L: 23
			}
		}

		return true; // L: 25
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Llf;",
		garbageValue = "53"
	)
	MidiPcmStream method7571() {
		MidiPcmStream var1 = null; // L: 29
		Iterator var2 = class305.field3402.iterator(); // L: 30

		while (true) {
			MidiPcmStream var3;
			do {
				do {
					if (!var2.hasNext()) {
						if (var1 != null) { // L: 38
							++var1.field3443; // L: 39
							if (var1.method5830() == 0 && var1.isReady()) { // L: 40
								var1.clear(); // L: 41
								var1.removeAll(); // L: 42
								var1.setPcmStreamVolume(0); // L: 43
							}
						}

						return var1; // L: 46
					}

					var3 = (MidiPcmStream)var2.next(); // L: 31
				} while(var3 == null); // L: 33
			} while(var1 != null && var1.field3443 <= var3.field3443 && (var3.method5830() != 0 || !var3.isReady()));

			var1 = var3; // L: 34
		}
	}

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-71"
	)
	static final void method7574() {
		if (WorldMapIcon_0.field2973) { // L: 3657
			for (int var0 = 0; var0 < Players.Players_count; ++var0) { // L: 3659
				Player var1 = Client.players[Players.Players_indices[var0]]; // L: 3660
				var1.method2353(); // L: 3661
			}

			WorldMapIcon_0.field2973 = false; // L: 3664
		}

	} // L: 3666
}
