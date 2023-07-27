import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pu")
public class class402 extends class407 {
	@ObfuscatedName("aw")
	ArrayList field4515;

	@ObfuscatedSignature(
		descriptor = "(Lpp;Ljava/util/ArrayList;)V"
	)
	public class402(class407 var1, ArrayList var2) {
		super(var1); // L: 11
		super.field4528 = "ClearRequestTask"; // L: 12
		this.field4515 = var2; // L: 13
	} // L: 14

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "994462530"
	)
	public boolean vmethod7676(int var1) {
		if (this.field4515.isEmpty()) { // L: 18
			return true; // L: 19
		} else {
			Iterator var2 = this.field4515.iterator(); // L: 21

			while (var2.hasNext()) {
				class318 var3 = (class318)var2.next(); // L: 22

				try {
					if (class306.field3394.contains(var3)) { // L: 25
						if (var3 == null) { // L: 26
							class306.field3394.remove(var3); // L: 27
						} else {
							--var3.field3516.field3439; // L: 30
							if (var3.field3516.field3439 == 0) { // L: 31
								var3.field3516.clear(); // L: 32
								var3.field3516.method5820(); // L: 33
								var3.field3516.setPcmStreamVolume(0); // L: 34
							}

							FloorOverlayDefinition.method4061(var3.field3507, var3.field3509); // L: 36
							class306.field3394.remove(var3); // L: 37
						}
					}
				} catch (Exception var5) { // L: 40
					var5.printStackTrace(); // L: 41
					this.method7653(var5.getMessage()); // L: 42
					class306.field3394.clear(); // L: 43
					return true; // L: 44
				}
			}

			return true; // L: 48
		}
	}
}
