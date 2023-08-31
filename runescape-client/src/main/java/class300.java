import java.util.HashMap;
import java.util.Iterator;
import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@mr
@ObfuscatedName("lc")
public final class class300 {
	@ObfuscatedName("ao")
	static final HashMap field3372;

	static {
		field3372 = new HashMap(); // L: 11
		TimeZone var0;
		synchronized(field3372) { // L: 16
			TimeZone var2 = (TimeZone)field3372.get("Europe/London"); // L: 17
			if (var2 == null) { // L: 18
				var2 = TimeZone.getTimeZone("Europe/London"); // L: 19
				field3372.put("Europe/London", var2); // L: 20
			}

			var0 = var2; // L: 22
		}

		java.util.Calendar.getInstance(var0); // L: 25
	} // L: 26

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "57"
	)
	public static void method5718(int var0) {
		if (!class305.field3404.isEmpty()) { // L: 73
			Iterator var1 = class305.field3404.iterator(); // L: 74

			while (var1.hasNext()) {
				class317 var2 = (class317)var1.next(); // L: 75
				if (var2 != null) { // L: 77
					var2.field3513 = var0; // L: 80
				}
			}

			class317 var3 = (class317)class305.field3404.get(0); // L: 83
			if (var3 != null && var3.field3517 != null && var3.field3517.isReady() && !var3.field3524) { // L: 84
				var3.field3517.setPcmStreamVolume(var0); // L: 85
				var3.field3510 = (float)var0; // L: 86
			}
		}

	} // L: 89

	@ObfuscatedName("oz")
	@ObfuscatedSignature(
		descriptor = "(Lmi;B)Ljava/lang/String;",
		garbageValue = "-51"
	)
	@Export("Widget_getSpellActionName")
	static String Widget_getSpellActionName(Widget var0) {
		if (HealthBarDefinition.Widget_unpackTargetMask(class194.getWidgetFlags(var0)) == 0) { // L: 12698
			return null;
		} else {
			return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null; // L: 12699 12700 12702
		}
	}
}
