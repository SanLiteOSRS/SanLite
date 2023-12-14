import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pq")
public class class413 extends class418 {
	@ObfuscatedName("at")
	ArrayList field4541;

	@ObfuscatedSignature(
		descriptor = "(Lql;Ljava/util/ArrayList;)V"
	)
	public class413(class418 var1, ArrayList var2) {
		super(var1); // L: 12
		super.field4552 = "ClearRequestTask"; // L: 13
		this.field4541 = var2; // L: 14
	} // L: 15

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-799935345"
	)
	public boolean vmethod7858() {
		if (this.field4541.isEmpty()) { // L: 19
			return true; // L: 20
		} else {
			Iterator var1 = this.field4541.iterator(); // L: 22

			while (var1.hasNext()) {
				class328 var2 = (class328)var1.next(); // L: 23

				try {
					if (class316.field3422.contains(var2)) { // L: 26
						if (var2 == null) { // L: 27
							class316.field3422.remove(var2); // L: 28
						} else {
							if (var2.field3522.field3455 > 0) { // L: 31
								--var2.field3522.field3455; // L: 32
							}

							if (var2.field3522.field3455 == 0) { // L: 34
								var2.field3522.clear(); // L: 35
								var2.field3522.method6011(); // L: 36
								var2.field3522.setPcmStreamVolume(0); // L: 37
							}

							int var3 = var2.field3523; // L: 39
							int var4 = var2.field3531; // L: 40
							Iterator var5 = class316.field3420.iterator(); // L: 42

							while (var5.hasNext()) {
								class322 var6 = (class322)var5.next(); // L: 43
								var6.vmethod6202(var3, var4); // L: 45
							}

							class316.field3422.remove(var2); // L: 49
						}
					}
				} catch (Exception var8) { // L: 52
					GrandExchangeOfferWorldComparator.RunException_sendStackTrace((String)null, var8); // L: 53
					this.method7840(var8.getMessage()); // L: 54
					class316.field3422.clear(); // L: 55
					return true; // L: 56
				}
			}

			return true; // L: 60
		}
	}
}
