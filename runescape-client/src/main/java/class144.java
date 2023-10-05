import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fa")
public class class144 extends class145 {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -279574085
	)
	int field1647;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lff;"
	)
	final class148 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lff;)V"
	)
	class144(class148 var1) {
		this.this$0 = var1;
		this.field1647 = -1; // L: 114
	} // L: 116

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lul;I)V",
		garbageValue = "-11659242"
	)
	void vmethod3414(Buffer var1) {
		this.field1647 = var1.readUnsignedShort(); // L: 119
	} // L: 120

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgi;I)V",
		garbageValue = "21847466"
	)
	void vmethod3415(ClanSettings var1) {
		var1.method3243(this.field1647); // L: 123
	} // L: 124

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1547227801"
	)
	@Export("savePreferences")
	static void savePreferences() {
		AccessFile var0 = null; // L: 141

		try {
			var0 = class17.getPreferencesFile("", UrlRequester.field1436.name, true); // L: 143
			Buffer var1 = class91.clientPreferences.toBuffer(); // L: 144
			var0.write(var1.array, 0, var1.offset); // L: 145
		} catch (Exception var3) { // L: 147
		}

		try {
			if (var0 != null) { // L: 149
				var0.closeSync(true); // L: 150
			}
		} catch (Exception var2) { // L: 153
		}

	} // L: 154
}
