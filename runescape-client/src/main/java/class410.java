import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pi")
class class410 implements Comparator {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("WorldMapElement_archive")
	static AbstractArchive WorldMapElement_archive;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	final class411 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lpa;)V"
	)
	class410(class411 var1) {
		this.this$0 = var1; // L: 7
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lpl;Lpl;I)I",
		garbageValue = "-1198540003"
	)
	int method7688(class412 var1, class412 var2) {
		if (var1.field4566 > var2.field4566) {
			return 1; // L: 9
		} else {
			return var1.field4566 < var2.field4566 ? -1 : 0; // L: 10 11
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method7688((class412)var1, (class412)var2); // L: 15
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 19
	}
}
