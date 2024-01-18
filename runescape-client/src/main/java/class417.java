import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qz")
public class class417 extends class422 {
	@ObfuscatedName("am")
	ArrayList field4581;

	@ObfuscatedSignature(
		descriptor = "(Lqd;Ljava/util/ArrayList;)V"
	)
	public class417(class422 var1, ArrayList var2) {
		super(var1); // L: 12
		super.field4597 = "ClearRequestTask"; // L: 13
		this.field4581 = var2; // L: 14
	} // L: 15

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2012801823"
	)
	public boolean vmethod7975() {
		if (this.field4581.isEmpty()) { // L: 19
			return true; // L: 20
		} else {
			Iterator var1 = this.field4581.iterator(); // L: 22

			while (var1.hasNext()) {
				class331 var2 = (class331)var1.next(); // L: 23

				try {
					if (class319.field3459.contains(var2)) { // L: 26
						if (var2 == null) { // L: 27
							class319.field3459.remove(var2); // L: 28
						} else {
							if (var2.field3582.field3499 > 0) { // L: 31
								--var2.field3582.field3499; // L: 32
							}

							if (var2.field3582.field3499 == 0) { // L: 34
								var2.field3582.clear(); // L: 35
								var2.field3582.method6075(); // L: 36
								var2.field3582.setPcmStreamVolume(0); // L: 37
							}

							class129.method3075(var2.field3573, var2.field3574); // L: 39
							class319.field3459.remove(var2); // L: 40
						}
					}
				} catch (Exception var4) { // L: 43
					class368.RunException_sendStackTrace((String)null, var4); // L: 44
					this.method7954(var4.getMessage()); // L: 45
					class319.field3459.clear(); // L: 46
					return true; // L: 47
				}
			}

			return true; // L: 51
		}
	}
}
