import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pv")
public class class401 extends class406 {
	@ObfuscatedName("au")
	ArrayList field4511;

	@ObfuscatedSignature(
		descriptor = "(Lpm;Ljava/util/ArrayList;)V"
	)
	public class401(class406 var1, ArrayList var2) {
		super(var1); // L: 12
		super.field4523 = "ClearRequestTask"; // L: 13
		this.field4511 = var2; // L: 14
	} // L: 15

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1604030758"
	)
	public boolean vmethod7621() {
		if (this.field4511.isEmpty()) { // L: 19
			return true; // L: 20
		} else {
			Iterator var1 = this.field4511.iterator(); // L: 22

			while (var1.hasNext()) {
				class317 var2 = (class317)var1.next(); // L: 23

				try {
					if (class305.field3404.contains(var2)) { // L: 26
						if (var2 == null) { // L: 27
							class305.field3404.remove(var2); // L: 28
						} else {
							if (var2.field3517.field3443 > 0) { // L: 31
								--var2.field3517.field3443; // L: 32
							}

							if (var2.field3517.field3443 == 0) { // L: 34
								var2.field3517.clear(); // L: 35
								var2.field3517.removeAll(); // L: 36
								var2.field3517.setPcmStreamVolume(0); // L: 37
							}

							int var3 = var2.field3511; // L: 39
							int var4 = var2.field3512; // L: 40
							Iterator var5 = class305.field3407.iterator(); // L: 42

							while (var5.hasNext()) {
								class311 var6 = (class311)var5.next(); // L: 43
								var6.vmethod5967(var3, var4); // L: 45
							}

							class305.field3404.remove(var2); // L: 49
						}
					}
				} catch (Exception var8) { // L: 52
					Messages.RunException_sendStackTrace((String)null, var8); // L: 53
					this.method7601(var8.getMessage()); // L: 54
					class305.field3404.clear(); // L: 55
					return true; // L: 56
				}
			}

			return true; // L: 60
		}
	}
}
