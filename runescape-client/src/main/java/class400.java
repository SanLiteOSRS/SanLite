import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pe")
public class class400 extends class407 {
	@ObfuscatedSignature(
		descriptor = "(Lpp;)V"
	)
	public class400(class407 var1) {
		super(var1); // L: 9
		super.field4528 = "AddRequestTask"; // L: 10
	} // L: 11

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "994462530"
	)
	public boolean vmethod7676(int var1) {
		while (!class306.field3396.isEmpty()) { // L: 15
			class318 var2 = (class318)class306.field3396.peek(); // L: 16
			if (var2 == null) { // L: 17
				class306.field3396.pop(); // L: 18
			} else {
				var2.field3516 = this.method7611(); // L: 21
				class306.field3394.add(var2); // L: 22
				class306.field3396.pop(); // L: 23
			}
		}

		return true; // L: 25
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Llc;",
		garbageValue = "1784609156"
	)
	MidiPcmStream method7611() {
		MidiPcmStream var1 = null; // L: 29
		Iterator var2 = class306.field3395.iterator(); // L: 30

		while (true) {
			MidiPcmStream var3;
			do {
				do {
					if (!var2.hasNext()) {
						if (var1 != null) { // L: 38
							++var1.field3439; // L: 39
							if (var1.method5816() == 0 && var1.isReady()) { // L: 40
								var1.clear(); // L: 41
								var1.method5820(); // L: 42
								var1.setPcmStreamVolume(0); // L: 43
							}
						}

						return var1; // L: 46
					}

					var3 = (MidiPcmStream)var2.next(); // L: 31
				} while(var3 == null);
			} while(var1 != null && var1.field3439 <= var3.field3439 && (var3.field3439 != var1.field3439 || var3.method5816() != 0 || !var3.isReady())); // L: 33

			var1 = var3; // L: 34
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lmt;I[B[BS)V",
		garbageValue = "24138"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field3711 == null) { // L: 1202
			if (var2 == null) { // L: 1203
				return; // L: 1209
			}

			var0.field3711 = new byte[11][]; // L: 1204
			var0.field3700 = new byte[11][]; // L: 1205
			var0.field3657 = new int[11]; // L: 1206
			var0.field3630 = new int[11]; // L: 1207
		}

		var0.field3711[var1] = var2; // L: 1211
		if (var2 != null) {
			var0.field3698 = true; // L: 1212
		} else {
			var0.field3698 = false; // L: 1214

			for (int var4 = 0; var4 < var0.field3711.length; ++var4) { // L: 1215
				if (var0.field3711[var4] != null) { // L: 1216
					var0.field3698 = true; // L: 1217
					break;
				}
			}
		}

		var0.field3700[var1] = var3; // L: 1222
	} // L: 1223
}
