import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("la")
public class class286 {
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1330424245
	)
	static int field3074;

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Lni;I)Z",
		garbageValue = "-249009883"
	)
	static boolean method5662(PlayerComposition var0) {
		if (var0.equipment[0] < 512) { // L: 1022
			return false; // L: 1026
		} else {
			ItemComposition var1 = class214.ItemComposition_get(var0.equipment[0] - 512); // L: 1023
			return var1.maleModel1 != class223.field2348.field2342 && var1.maleModel2 != class223.field2348.field2342; // L: 1024
		}
	}

	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "863743368"
	)
	static void method5663() {
		if (Client.isSpellSelected) { // L: 10165
			Widget var0 = class33.field184.method6241(JagexCache.field1841, Client.field585); // L: 10166
			if (var0 != null && var0.onTargetLeave != null) { // L: 10167
				ScriptEvent var1 = new ScriptEvent(); // L: 10168
				var1.widget = var0; // L: 10169
				var1.args = var0.onTargetLeave; // L: 10170
				Interpreter.runScriptEvent(var1); // L: 10171
			}

			Client.field686 = -1; // L: 10173
			Client.isSpellSelected = false; // L: 10174
			ClanChannelMember.invalidateWidget(var0); // L: 10175
		}
	} // L: 10176
}
