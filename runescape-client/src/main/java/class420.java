import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qa")
public class class420 extends class422 {
	@ObfuscatedName("ae")
	static int[][] field4590;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	class331 field4588;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1848218251
	)
	int field4589;

	@ObfuscatedSignature(
		descriptor = "(Lqd;IZI)V"
	)
	public class420(class422 var1, int var2, boolean var3, int var4) {
		super(var1); // L: 11
		this.field4588 = null; // L: 7
		this.field4589 = 0; // L: 8
		super.field4597 = "FadeOutTask"; // L: 12
		if (var2 >= 0) { // L: 13
			if (var3 && var2 < class319.field3461.size()) { // L: 16
				this.field4588 = (class331)class319.field3461.get(var2); // L: 17
			} else if (!var3 && var2 < class319.field3459.size()) { // L: 19
				this.field4588 = (class331)class319.field3459.get(var2); // L: 20
			}

			this.field4589 = var4; // L: 22
		}
	} // L: 14 23

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2012801823"
	)
	public boolean vmethod7975() {
		if (this.field4588 != null && this.field4588.field3582 != null) { // L: 27
			this.field4588.field3580 = true; // L: 30

			try {
				if (this.field4588.field3576 > 0.0F && this.field4588.field3582.isReady()) { // L: 32
					float var1 = this.field4589 == 0 ? (float)this.field4589 : (float)this.field4588.field3577 / (float)this.field4589; // L: 33
					class331 var10000 = this.field4588; // L: 34
					var10000.field3576 -= 0.0F == var1 ? (float)this.field4588.field3577 : var1;
					if (this.field4588.field3576 < 0.0F) { // L: 35
						this.field4588.field3576 = 0.0F; // L: 36
					}

					this.field4588.field3582.setPcmStreamVolume((int)this.field4588.field3576); // L: 38
					return false; // L: 39
				}
			} catch (Exception var3) { // L: 42
				this.method7954(var3.getMessage()); // L: 43
				return true; // L: 44
			}

			this.field4588.field3580 = false; // L: 46
			return true; // L: 47
		} else {
			return true; // L: 28
		}
	}
}
