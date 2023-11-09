import java.util.Arrays;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pe")
class class427 implements Iterator {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1289417949
	)
	int field4640;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lpp;"
	)
	final class428 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lpp;)V"
	)
	class427(class428 var1) {
		this.this$0 = var1; // L: 51
	}

	public boolean hasNext() {
		return this.field4640 < this.this$0.method7011(); // L: 56
	}

	public Object next() {
		int var1 = ++this.field4640 - 1; // L: 61
		class394 var2 = (class394)this.this$0.field4645.get((long)var1); // L: 62
		return var2 != null ? var2 : this.this$0.method7446(var1); // L: 63 64
	}

	public void remove() {
		throw new UnsupportedOperationException(); // L: 69
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1897258636"
	)
	public static void method7443() {
		synchronized(KeyHandler.KeyHandler_instance) { // L: 130
			++KeyHandler.KeyHandler_idleCycles; // L: 131
			KeyHandler.field139 = KeyHandler.field141; // L: 132
			KeyHandler.field136 = 0; // L: 133
			KeyHandler.field138 = 0; // L: 134
			Arrays.fill(KeyHandler.field128, false); // L: 135
			Arrays.fill(KeyHandler.field126, false); // L: 136
			if (KeyHandler.field132 < 0) { // L: 137
				Arrays.fill(KeyHandler.KeyHandler_pressedKeys, false); // L: 138
				KeyHandler.field132 = KeyHandler.field149; // L: 139
			} else {
				while (KeyHandler.field149 != KeyHandler.field132) { // L: 142
					int var1 = KeyHandler.field130[KeyHandler.field149]; // L: 143
					KeyHandler.field149 = KeyHandler.field149 + 1 & 127; // L: 144
					if (var1 < 0) { // L: 145
						var1 = ~var1; // L: 146
						if (KeyHandler.KeyHandler_pressedKeys[var1]) { // L: 147
							KeyHandler.KeyHandler_pressedKeys[var1] = false; // L: 148
							KeyHandler.field126[var1] = true; // L: 149
							KeyHandler.field137[KeyHandler.field138] = var1; // L: 150
							++KeyHandler.field138; // L: 151
						}
					} else {
						if (!KeyHandler.KeyHandler_pressedKeys[var1] && KeyHandler.field136 < KeyHandler.field135.length - 1) { // L: 155
							KeyHandler.field128[var1] = true; // L: 156
							KeyHandler.field135[++KeyHandler.field136 - 1] = var1; // L: 157
						}

						KeyHandler.KeyHandler_pressedKeys[var1] = true; // L: 159
					}
				}
			}

			if (KeyHandler.field136 > 0) { // L: 163
				KeyHandler.KeyHandler_idleCycles = 0;
			}

			KeyHandler.field141 = KeyHandler.field133; // L: 164
		}
	} // L: 166
}
