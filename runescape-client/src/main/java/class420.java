import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qm")
public class class420 extends class425 {
	@ObfuscatedName("aq")
	ArrayList field4614;

	@ObfuscatedSignature(
		descriptor = "(Lqe;Ljava/util/ArrayList;)V"
	)
	public class420(class425 var1, ArrayList var2) {
		super(var1); // L: 12
		super.field4627 = "ClearRequestTask"; // L: 13
		this.field4614 = var2; // L: 14
	} // L: 15

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2024199564"
	)
	public boolean vmethod8043() {
		if (this.field4614.isEmpty()) { // L: 19
			return true; // L: 20
		} else {
			Iterator var1 = this.field4614.iterator(); // L: 22

			while (var1.hasNext()) {
				class333 var2 = (class333)var1.next(); // L: 23

				try {
					if (class321.field3474.contains(var2)) { // L: 26
						if (var2 == null) { // L: 27
							class321.field3474.remove(var2); // L: 28
						} else {
							if (var2.field3594.field3518 > 0) { // L: 31
								--var2.field3594.field3518; // L: 32
							}

							if (var2.field3594.field3518 == 0) { // L: 34
								var2.field3594.clear(); // L: 35
								var2.field3594.method6202(); // L: 36
								var2.field3594.setPcmStreamVolume(0); // L: 37
							}

							int var3 = var2.field3590; // L: 39
							int var4 = var2.field3591; // L: 40
							Iterator var5 = class321.field3482.iterator(); // L: 42

							while (var5.hasNext()) {
								class327 var6 = (class327)var5.next(); // L: 43
								var6.vmethod6339(var3, var4); // L: 45
							}

							class321.field3474.remove(var2); // L: 49
						}
					}
				} catch (Exception var8) { // L: 52
					class315.RunException_sendStackTrace((String)null, var8); // L: 53
					this.method8017(var8.getMessage()); // L: 54
					class321.field3474.clear(); // L: 55
					return true; // L: 56
				}
			}

			return true; // L: 60
		}
	}
}
