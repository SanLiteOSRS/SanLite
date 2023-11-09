import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pw")
public class class424 {
	@ObfuscatedName("f")
	public static final char[] field4634;
	@ObfuscatedName("u")
	public static final char[] field4637;

	static {
		field4634 = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'}; // L: 8
		field4637 = new char[]{'[', ']', '#'}; // L: 9
	}

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1065463731"
	)
	static void method7495() {
		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) { // L: 11709
			int var1 = var0.group; // L: 11710
			if (ReflectionCheck.loadInterface(var1)) { // L: 11711
				boolean var2 = true; // L: 11712
				Widget[] var3 = Widget.Widget_interfaceComponents[var1]; // L: 11713

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) { // L: 11714
					if (var3[var4] != null) { // L: 11715
						var2 = var3[var4].isIf3; // L: 11716
						break;
					}
				}

				if (!var2) { // L: 11720
					var4 = (int)var0.key; // L: 11721
					Widget var5 = FloorUnderlayDefinition.getWidget(var4); // L: 11722
					if (var5 != null) { // L: 11723
						class220.invalidateWidget(var5);
					}
				}
			}
		}

	} // L: 11727
}
