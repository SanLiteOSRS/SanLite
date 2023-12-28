import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pp")
public class class396 {
	@ObfuscatedName("at")
	@Export("cp1252AsciiExtension")
	static final char[] cp1252AsciiExtension;
	@ObfuscatedName("al")
	@Export("SpriteBuffer_pixels")
	public static byte[][] SpriteBuffer_pixels;
	@ObfuscatedName("rs")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	@Export("mouseWheel")
	static class212 mouseWheel;

	static {
		cp1252AsciiExtension = new char[]{'€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ'}; // L: 4
	}

	@ObfuscatedName("mw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1031282913"
	)
	static void method7403() {
		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) { // L: 12195
			int var1 = var0.group; // L: 12196
			if (HealthBarDefinition.field1877.method6282(var1)) { // L: 12197
				boolean var2 = true; // L: 12198
				Widget[] var3 = HealthBarDefinition.field1877.field3568[var1]; // L: 12199

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) { // L: 12200
					if (var3[var4] != null) { // L: 12201
						var2 = var3[var4].isIf3; // L: 12202
						break;
					}
				}

				if (!var2) { // L: 12206
					var4 = (int)var0.key; // L: 12207
					Widget var5 = HealthBarDefinition.field1877.method6285(var4); // L: 12208
					if (var5 != null) { // L: 12209
						class159.invalidateWidget(var5);
					}
				}
			}
		}

	} // L: 12213
}
