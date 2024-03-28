import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qz")
public class class424 extends class426 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	class333 field4644;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 314155859
	)
	int field4642;

	@ObfuscatedSignature(
		descriptor = "(Lqc;IZI)V"
	)
	public class424(class426 var1, int var2, boolean var3, int var4) {
		super(var1); // L: 11
		this.field4644 = null; // L: 7
		this.field4642 = 0; // L: 8
		super.field4651 = "FadeOutTask"; // L: 12
		if (var2 >= 0) { // L: 13
			if (var3 && var2 < class321.field3500.size()) { // L: 16
				this.field4644 = (class333)class321.field3500.get(var2); // L: 17
			} else if (!var3 && var2 < class321.field3495.size()) { // L: 19
				this.field4644 = (class333)class321.field3495.get(var2); // L: 20
			}

			this.field4642 = var4; // L: 22
		}
	} // L: 14 23

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-362428891"
	)
	public boolean vmethod7854() {
		if (this.field4644 != null && this.field4644.field3613 != null) { // L: 27
			this.field4644.field3604 = true; // L: 30

			try {
				if (this.field4644.field3608 > 0.0F && this.field4644.field3613.isReady()) { // L: 32
					float var1 = this.field4642 == 0 ? (float)this.field4642 : (float)this.field4644.field3607 / (float)this.field4642; // L: 33
					class333 var10000 = this.field4644; // L: 34
					var10000.field3608 -= 0.0F == var1 ? (float)this.field4644.field3607 : var1;
					if (this.field4644.field3608 < 0.0F) { // L: 35
						this.field4644.field3608 = 0.0F; // L: 36
					}

					this.field4644.field3613.setPcmStreamVolume((int)this.field4644.field3608); // L: 38
					return false; // L: 39
				}
			} catch (Exception var3) { // L: 42
				this.method7844(var3.getMessage()); // L: 43
				return true; // L: 44
			}

			this.field4644.field3604 = false; // L: 46
			return true; // L: 47
		} else {
			return true; // L: 28
		}
	}
}
