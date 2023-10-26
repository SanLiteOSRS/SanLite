import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qk")
public class class419 extends class421 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	class331 field4567;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1941779921
	)
	int field4566;

	@ObfuscatedSignature(
		descriptor = "(Lqm;IZI)V"
	)
	public class419(class421 var1, int var2, boolean var3, int var4) {
		super(var1); // L: 11
		this.field4567 = null; // L: 7
		this.field4566 = 0; // L: 8
		super.field4572 = "FadeOutTask"; // L: 12
		if (var2 >= 0) { // L: 13
			if (var3 && var2 < class319.field3428.size()) { // L: 16
				this.field4567 = (class331)class319.field3428.get(var2); // L: 17
			} else if (!var3 && var2 < class319.field3433.size()) { // L: 19
				this.field4567 = (class331)class319.field3433.get(var2); // L: 20
			}

			this.field4566 = var4; // L: 22
		}
	} // L: 14 23

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-90"
	)
	public boolean vmethod7780() {
		if (this.field4567 != null && this.field4567.field3538 != null) { // L: 27
			this.field4567.field3546 = true; // L: 30

			try {
				if (this.field4567.field3542 > 0.0F && this.field4567.field3538.isReady()) { // L: 32
					float var1 = this.field4566 == 0 ? (float)this.field4566 : (float)this.field4567.field3541 / (float)this.field4566; // L: 33
					class331 var10000 = this.field4567;
					var10000.field3542 -= var1 == 0.0F ? (float)this.field4567.field3541 : var1; // L: 34
					if (this.field4567.field3542 < 0.0F) { // L: 35
						this.field4567.field3542 = 0.0F; // L: 36
					}

					this.field4567.field3538.setPcmStreamVolume((int)this.field4567.field3542); // L: 38
					return false; // L: 39
				}
			} catch (Exception var3) { // L: 42
				this.method7773(var3.getMessage()); // L: 43
				return true; // L: 44
			}

			this.field4567.field3546 = false; // L: 46
			return true; // L: 47
		} else {
			return true; // L: 28
		}
	}
}
