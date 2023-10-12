import java.applet.Applet;
import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qi")
public class class416 extends class421 {
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("scriptDotWidget")
	static Widget scriptDotWidget;
	@ObfuscatedName("ac")
	ArrayList field4563;

	@ObfuscatedSignature(
		descriptor = "(Lqm;Ljava/util/ArrayList;)V"
	)
	public class416(class421 var1, ArrayList var2) {
		super(var1); // L: 12
		super.field4572 = "ClearRequestTask"; // L: 13
		this.field4563 = var2; // L: 14
	} // L: 15

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-90"
	)
	public boolean vmethod7780() {
		if (this.field4563.isEmpty()) { // L: 19
			return true; // L: 20
		} else {
			Iterator var1 = this.field4563.iterator();

			while (var1.hasNext()) {
				class331 var2 = (class331)var1.next();

				try {
					if (class319.field3433.contains(var2)) { // L: 26
						if (var2 == null) { // L: 27
							class319.field3433.remove(var2); // L: 28
						} else {
							if (var2.field3538.field3450 > 0) { // L: 31
								--var2.field3538.field3450; // L: 32
							}

							if (var2.field3538.field3450 == 0) { // L: 34
								var2.field3538.clear(); // L: 35
								var2.field3538.method6044(); // L: 36
								var2.field3538.setPcmStreamVolume(0); // L: 37
							}

							WorldMapDecorationType.method6793(var2.field3539, var2.field3540); // L: 39
							class319.field3433.remove(var2); // L: 40
						}
					}
				} catch (Exception var4) { // L: 43
					class190.RunException_sendStackTrace((String)null, var4); // L: 44
					this.method7773(var4.getMessage()); // L: 45
					class319.field3433.clear(); // L: 46
					return true; // L: 47
				}
			}

			return true; // L: 51
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/applet/Applet;Ljava/lang/String;B)V",
		garbageValue = "25"
	)
	public static void method7746(Applet var0, String var1) {
		class31.field171 = var0; // L: 22
		if (var1 != null) { // L: 23
			class31.field170 = var1;
		}

	} // L: 24
}
