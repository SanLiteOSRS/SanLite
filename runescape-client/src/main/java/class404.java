import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("px")
public class class404 extends class406 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	class317 field4517;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1221336075
	)
	int field4516;

	@ObfuscatedSignature(
		descriptor = "(Lpm;IZI)V"
	)
	public class404(class406 var1, int var2, boolean var3, int var4) {
		super(var1); // L: 11
		this.field4517 = null; // L: 7
		this.field4516 = 0; // L: 8
		super.field4523 = "FadeOutTask"; // L: 12
		if (var2 >= 0) { // L: 13
			if (var3 && var2 < class305.field3411.size()) { // L: 16
				this.field4517 = (class317)class305.field3411.get(var2); // L: 17
			} else if (!var3 && var2 < class305.field3404.size()) { // L: 19
				this.field4517 = (class317)class305.field3404.get(var2); // L: 20
			}

			this.field4516 = var4; // L: 22
		}
	} // L: 14 23

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1604030758"
	)
	public boolean vmethod7621() {
		if (this.field4517 != null && this.field4517.field3517 != null) { // L: 27
			this.field4517.field3524 = true; // L: 30

			try {
				if (this.field4517.field3510 > 0.0F && this.field4517.field3517.isReady()) { // L: 32
					float var1 = this.field4516 == 0 ? (float)this.field4516 : (float)this.field4517.field3513 / (float)this.field4516; // L: 33
					class317 var10000 = this.field4517;
					var10000.field3510 -= var1 == 0.0F ? (float)this.field4517.field3513 : var1; // L: 34
					if (this.field4517.field3510 < 0.0F) { // L: 35
						this.field4517.field3510 = 0.0F; // L: 36
					}

					this.field4517.field3517.setPcmStreamVolume((int)this.field4517.field3510); // L: 38
					return false; // L: 39
				}
			} catch (Exception var3) { // L: 42
				this.method7601(var3.getMessage()); // L: 43
				return true; // L: 44
			}

			this.field4517.field3524 = false; // L: 46
			return true; // L: 47
		} else {
			return true; // L: 28
		}
	}
}
