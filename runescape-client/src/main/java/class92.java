import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dv")
public class class92 {
	@ObfuscatedName("gu")
	@ObfuscatedGetter(
		intValue = 384857183
	)
	@Export("currentPort")
	static int currentPort;

	@ObfuscatedName("an")
	static final void method2337(long var0) {
		try {
			Thread.sleep(var0); // L: 20
		} catch (InterruptedException var3) { // L: 22
		}

	} // L: 23

	@ObfuscatedName("ng")
	@ObfuscatedSignature(
		descriptor = "(Lmo;I)Ljava/lang/String;",
		garbageValue = "-1312762326"
	)
	@Export("Widget_getSpellActionName")
	static String Widget_getSpellActionName(Widget var0) {
		if (class316.Widget_unpackTargetMask(class209.getWidgetFlags(var0)) == 0) { // L: 12467
			return null;
		} else {
			return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null; // L: 12468 12469 12471
		}
	}
}
