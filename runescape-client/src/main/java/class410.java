import java.applet.Applet;
import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ph")
class class410 implements Comparator {
	@ObfuscatedName("ay")
	@Export("RunException_applet")
	public static Applet RunException_applet;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	final class411 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lpo;)V"
	)
	class410(class411 var1) {
		this.this$0 = var1; // L: 7
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lps;Lps;I)I",
		garbageValue = "-1143853388"
	)
	int method7680(class412 var1, class412 var2) {
		if (var1.field4573 > var2.field4573) {
			return 1; // L: 9
		} else {
			return var1.field4573 < var2.field4573 ? -1 : 0; // L: 10 11
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method7680((class412)var1, (class412)var2); // L: 15
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 19
	}
}
