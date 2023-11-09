import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pb")
public class class406 extends class407 {
	@ObfuscatedName("ue")
	@ObfuscatedGetter(
		intValue = 1301217535
	)
	static int field4522;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	class318 field4524;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 870968583
	)
	int field4523;

	@ObfuscatedSignature(
		descriptor = "(Lpp;IZI)V"
	)
	public class406(class407 var1, int var2, boolean var3, int var4) {
		super(var1); // L: 11
		this.field4524 = null; // L: 7
		this.field4523 = 0; // L: 8
		super.field4528 = "FadeInTask"; // L: 12
		if (var2 >= 0) { // L: 13
			if (var3 && var2 < class306.field3396.size()) { // L: 16
				this.field4524 = (class318)class306.field3396.get(var2); // L: 17
			} else if (!var3 && var2 < class306.field3394.size()) { // L: 19
				this.field4524 = (class318)class306.field3394.get(var2); // L: 20
			}

			this.field4523 = var4; // L: 22
		}
	} // L: 14 23

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "994462530"
	)
	public boolean vmethod7676(int var1) {
		if (this.field4524 != null && this.field4524.field3516 != null) { // L: 27
			this.field4524.field3515 = true; // L: 30

			try {
				if (this.field4524.field3511 < (float)this.field4524.field3510 && this.field4524.field3516.isReady()) { // L: 32
					float var2 = this.field4523 == 0 ? (float)this.field4523 : (float)this.field4524.field3510 / (float)this.field4523; // L: 33
					class318 var10000 = this.field4524;
					var10000.field3511 += var2 == 0.0F ? (float)this.field4524.field3510 : var2; // L: 34
					if (this.field4524.field3511 > (float)this.field4524.field3510) { // L: 35
						this.field4524.field3511 = (float)this.field4524.field3510; // L: 36
					}

					this.field4524.field3516.setPcmStreamVolume((int)this.field4524.field3511); // L: 38
					return false; // L: 39
				}
			} catch (Exception var4) { // L: 42
				this.method7653(var4.getMessage()); // L: 43
				return true; // L: 44
			}

			this.field4524.field3515 = false; // L: 46
			return true; // L: 47
		} else {
			return true; // L: 28
		}
	}
}
