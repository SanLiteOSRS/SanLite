import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("px")
public class class404 extends class406 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	class317 field4506;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1802852307
	)
	int field4507;

	@ObfuscatedSignature(
		descriptor = "(Lps;IZI)V"
	)
	public class404(class406 var1, int var2, boolean var3, int var4) {
		super(var1); // L: 11
		this.field4506 = null; // L: 7
		this.field4507 = 0; // L: 8
		super.field4513 = "FadeOutTask"; // L: 12
		if (var2 >= 0) { // L: 13
			if (var3 && var2 < class305.field3392.size()) { // L: 16
				this.field4506 = (class317)class305.field3392.get(var2); // L: 17
			} else if (!var3 && var2 < class305.field3397.size()) { // L: 19
				this.field4506 = (class317)class305.field3397.get(var2); // L: 20
			}

			this.field4507 = var4; // L: 22
		}
	} // L: 14 23

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1705548260"
	)
	public boolean vmethod7648(int var1) {
		if (this.field4506 != null && this.field4506.field3511 != null) { // L: 27
			this.field4506.field3516 = true; // L: 30

			try {
				if (this.field4506.field3512 > 0.0F && this.field4506.field3511.isReady()) { // L: 32
					float var2 = this.field4507 == 0 ? (float)this.field4507 : (float)this.field4506.field3517 / (float)this.field4507; // L: 33
					class317 var10000 = this.field4506;
					var10000.field3512 -= 0.0F == var2 ? (float)this.field4506.field3517 : var2; // L: 34
					if (this.field4506.field3512 < 0.0F) { // L: 35
						this.field4506.field3512 = 0.0F; // L: 36
					}

					this.field4506.field3511.setPcmStreamVolume((int)this.field4506.field3512); // L: 38
					return false; // L: 39
				}
			} catch (Exception var4) { // L: 42
				this.method7631(var4.getMessage()); // L: 43
				return true; // L: 44
			}

			this.field4506.field3516 = false; // L: 46
			return true; // L: 47
		} else {
			return true; // L: 28
		}
	}
}
