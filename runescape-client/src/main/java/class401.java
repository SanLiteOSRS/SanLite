import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pa")
public class class401 extends class406 {
	@ObfuscatedName("ai")
	ArrayList field4497;

	@ObfuscatedSignature(
		descriptor = "(Lps;Ljava/util/ArrayList;)V"
	)
	public class401(class406 var1, ArrayList var2) {
		super(var1); // L: 11
		super.field4513 = "ClearRequestTask"; // L: 12
		this.field4497 = var2; // L: 13
	} // L: 14

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1705548260"
	)
	public boolean vmethod7648(int var1) {
		if (this.field4497.isEmpty()) { // L: 18
			return true; // L: 19
		} else {
			Iterator var2 = this.field4497.iterator(); // L: 21

			while (var2.hasNext()) {
				class317 var3 = (class317)var2.next(); // L: 22

				try {
					if (class305.field3397.contains(var3)) { // L: 25
						if (var3 == null) { // L: 26
							class305.field3397.remove(var3); // L: 27
						} else {
							--var3.field3511.field3434; // L: 30
							if (var3.field3511.field3434 == 0) { // L: 31
								var3.field3511.clear(); // L: 32
								var3.field3511.method5832(); // L: 33
								var3.field3511.setPcmStreamVolume(0); // L: 34
							}

							int var4 = var3.field3509; // L: 36
							int var5 = var3.field3508; // L: 37
							Iterator var6 = class305.field3394.iterator(); // L: 39

							while (var6.hasNext()) {
								class311 var7 = (class311)var6.next(); // L: 40
								var7.vmethod6029(var4, var5); // L: 42
							}

							class305.field3397.remove(var3); // L: 46
						}
					}
				} catch (Exception var9) { // L: 49
					var9.printStackTrace(); // L: 50
					this.method7631(var9.getMessage()); // L: 51
					class305.field3397.clear(); // L: 52
					return true; // L: 53
				}
			}

			return true; // L: 57
		}
	}
}
