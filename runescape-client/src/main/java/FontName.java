import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tc")
@Implements("FontName")
public class FontName {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ltc;"
	)
	@Export("FontName_plain11")
	public static final FontName FontName_plain11;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ltc;"
	)
	@Export("FontName_plain12")
	public static final FontName FontName_plain12;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ltc;"
	)
	@Export("FontName_bold12")
	public static final FontName FontName_bold12;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ltc;"
	)
	@Export("FontName_verdana11")
	public static final FontName FontName_verdana11;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ltc;"
	)
	@Export("FontName_verdana13")
	public static final FontName FontName_verdana13;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ltc;"
	)
	@Export("FontName_verdana15")
	public static final FontName FontName_verdana15;
	@ObfuscatedName("ar")
	@Export("name")
	String name;

	static {
		FontName_plain11 = new FontName("p11_full"); // L: 7
		FontName_plain12 = new FontName("p12_full"); // L: 8
		FontName_bold12 = new FontName("b12_full"); // L: 9
		FontName_verdana11 = new FontName("verdana_11pt_regular"); // L: 10
		FontName_verdana13 = new FontName("verdana_13pt_regular"); // L: 11
		FontName_verdana15 = new FontName("verdana_15pt_regular"); // L: 12
	}

	FontName(String var1) {
		this.name = var1; // L: 16
	} // L: 17

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(Lif;IIII)V",
		garbageValue = "-1051855910"
	)
	static void method8850(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && class91.clientPreferences.method2589() != 0) { // L: 3825
			if (var0.soundEffects != null && var1 < var0.soundEffects.length) { // L: 3826
				class91.method2349(var0.soundEffects[var1], var2, var3); // L: 3827
			}
		}
	} // L: 3828

	@ObfuscatedName("md")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1514156294"
	)
	static final void method8851(int var0) {
		var0 = Math.max(Math.min(var0, 100), 0); // L: 12225
		var0 = 100 - var0; // L: 12226
		float var1 = 0.5F + (float)var0 / 200.0F; // L: 12227
		JagexCache.method3533((double)var1); // L: 12228
	} // L: 12229
}
