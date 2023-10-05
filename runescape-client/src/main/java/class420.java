import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qg")
public class class420 extends class421 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	class331 field4571;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 941678669
	)
	int field4570;

	@ObfuscatedSignature(
		descriptor = "(Lqm;IZI)V"
	)
	public class420(class421 var1, int var2, boolean var3, int var4) {
		super(var1); // L: 11
		this.field4571 = null; // L: 7
		this.field4570 = 0; // L: 8
		super.field4572 = "FadeInTask"; // L: 12
		if (var2 >= 0) { // L: 13
			if (var3 && var2 < class319.field3428.size()) { // L: 16
				this.field4571 = (class331)class319.field3428.get(var2); // L: 17
			} else if (!var3 && var2 < class319.field3433.size()) { // L: 19
				this.field4571 = (class331)class319.field3433.get(var2); // L: 20
			}

			this.field4570 = var4; // L: 22
		}
	} // L: 14 23

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-90"
	)
	public boolean vmethod7780() {
		if (this.field4571 != null && this.field4571.field3538 != null) { // L: 27
			this.field4571.field3546 = true; // L: 30

			try {
				if (this.field4571.field3542 < (float)this.field4571.field3541 && this.field4571.field3538.isReady()) { // L: 32
					float var1 = this.field4570 == 0 ? (float)this.field4570 : (float)this.field4571.field3541 / (float)this.field4570; // L: 33
					class331 var10000 = this.field4571;
					var10000.field3542 += 0.0F == var1 ? (float)this.field4571.field3541 : var1; // L: 34
					if (this.field4571.field3542 > (float)this.field4571.field3541) { // L: 35
						this.field4571.field3542 = (float)this.field4571.field3541; // L: 36
					}

					this.field4571.field3538.setPcmStreamVolume((int)this.field4571.field3542); // L: 38
					return false; // L: 39
				}
			} catch (Exception var3) { // L: 42
				this.method7773(var3.getMessage()); // L: 43
				return true; // L: 44
			}

			this.field4571.field3546 = false; // L: 46
			return true; // L: 47
		} else {
			return true; // L: 28
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Ldy;",
		garbageValue = "1147627487"
	)
	static ClientPreferences method7759() {
		AccessFile var0 = null; // L: 117
		ClientPreferences var1 = new ClientPreferences(); // L: 118

		try {
			var0 = class17.getPreferencesFile("", UrlRequester.field1436.name, false); // L: 120
			byte[] var2 = new byte[(int)var0.length()]; // L: 121

			int var4;
			for (int var3 = 0; var3 < var2.length; var3 += var4) { // L: 122 123 126
				var4 = var0.read(var2, var3, var2.length - var3); // L: 124
				if (var4 == -1) {
					throw new IOException(); // L: 125
				}
			}

			var1 = new ClientPreferences(new Buffer(var2)); // L: 128
		} catch (Exception var6) { // L: 130
		}

		try {
			if (var0 != null) { // L: 132
				var0.close(); // L: 133
			}
		} catch (Exception var5) { // L: 136
		}

		return var1; // L: 137
	}
}
