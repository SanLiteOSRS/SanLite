import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pi")
public class class414 extends class421 {
	@ObfuscatedName("am")
	@Export("SpriteBuffer_pixels")
	public static byte[][] SpriteBuffer_pixels;

	@ObfuscatedSignature(
		descriptor = "(Lqm;)V"
	)
	public class414(class421 var1) {
		super(var1); // L: 9
		super.field4572 = "AddRequestTask"; // L: 10
	} // L: 11

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-90"
	)
	public boolean vmethod7780() {
		while (!class319.field3428.isEmpty()) { // L: 15
			class331 var1 = (class331)class319.field3428.peek(); // L: 16
			if (var1 == null) { // L: 17
				class319.field3428.pop(); // L: 18
			} else {
				var1.field3538 = this.method7733(); // L: 21
				class319.field3433.add(var1); // L: 22
				class319.field3428.pop(); // L: 23
			}
		}

		return true; // L: 25
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Lmt;",
		garbageValue = "4"
	)
	MidiPcmStream method7733() {
		MidiPcmStream var1 = null; // L: 29
		Iterator var2 = class319.field3431.iterator(); // L: 30

		while (true) {
			MidiPcmStream var3;
			do {
				do {
					if (!var2.hasNext()) {
						if (var1 != null) { // L: 38
							++var1.field3450; // L: 39
							if (var1.method5971() == 0 && var1.isReady()) { // L: 40
								var1.clear(); // L: 41
								var1.method6044(); // L: 42
								var1.setPcmStreamVolume(0); // L: 43
							}
						}

						return var1; // L: 46
					}

					var3 = (MidiPcmStream)var2.next(); // L: 31
				} while(var3 == null); // L: 33
			} while(var1 != null && var1.field3450 <= var3.field3450 && (var3.method5971() != 0 || !var3.isReady()));

			var1 = var3; // L: 34
		}
	}

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1457106589"
	)
	static final void method7739() {
		Scene.Scene_isLowDetail = false; // L: 894
		Client.isLowDetail = false; // L: 895
	} // L: 896

	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "19136899"
	)
	static final void method7738(int var0) {
		if (var0 >= 0) { // L: 9436
			int var1 = Client.menuArguments1[var0]; // L: 9437
			int var2 = Client.menuArguments2[var0]; // L: 9438
			int var3 = Client.menuOpcodes[var0]; // L: 9439
			int var4 = Client.menuIdentifiers[var0]; // L: 9440
			int var5 = Client.field671[var0]; // L: 9441
			String var6 = Client.menuActions[var0]; // L: 9442
			String var7 = Client.menuTargets[var0]; // L: 9443
			class33.method477(var1, var2, var3, var4, var5, var6, var7, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY); // L: 9444
		}
	} // L: 9445
}
