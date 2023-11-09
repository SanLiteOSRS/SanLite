import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qt")
public class class417 extends class418 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	class328 field4550;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -204248099
	)
	int field4549;

	@ObfuscatedSignature(
		descriptor = "(Lql;IZI)V"
	)
	public class417(class418 var1, int var2, boolean var3, int var4) {
		super(var1); // L: 11
		this.field4550 = null; // L: 7
		this.field4549 = 0; // L: 8
		super.field4552 = "FadeInTask"; // L: 12
		if (var2 >= 0) { // L: 13
			if (var3 && var2 < class316.field3416.size()) { // L: 16
				this.field4550 = (class328)class316.field3416.get(var2); // L: 17
			} else if (!var3 && var2 < class316.field3422.size()) { // L: 19
				this.field4550 = (class328)class316.field3422.get(var2); // L: 20
			}

			this.field4549 = var4; // L: 22
		}
	} // L: 14 23

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-799935345"
	)
	public boolean vmethod7858() {
		if (this.field4550 != null && this.field4550.field3522 != null) { // L: 27
			this.field4550.field3530 = true; // L: 30

			try {
				if (this.field4550.field3528 < (float)this.field4550.field3525 && this.field4550.field3522.isReady()) { // L: 32
					float var1 = this.field4549 == 0 ? (float)this.field4549 : (float)this.field4550.field3525 / (float)this.field4549; // L: 33
					class328 var10000 = this.field4550;
					var10000.field3528 += var1 == 0.0F ? (float)this.field4550.field3525 : var1; // L: 34
					if (this.field4550.field3528 > (float)this.field4550.field3525) { // L: 35
						this.field4550.field3528 = (float)this.field4550.field3525; // L: 36
					}

					this.field4550.field3522.setPcmStreamVolume((int)this.field4550.field3528); // L: 38
					return false; // L: 39
				}
			} catch (Exception var3) { // L: 42
				this.method7840(var3.getMessage()); // L: 43
				return true; // L: 44
			}

			this.field4550.field3530 = false; // L: 46
			return true; // L: 47
		} else {
			return true; // L: 28
		}
	}
}
