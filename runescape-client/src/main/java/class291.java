import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lj")
public class class291 {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("KitDefinition_modelsArchive")
	static AbstractArchive KitDefinition_modelsArchive;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("SequenceDefinition_archive")
	static AbstractArchive SequenceDefinition_archive;

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ldn;III)V",
		garbageValue = "-1738028445"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args; // L: 107
		Script var4;
		if (Player.isWorldMapEvent(var0.type)) { // L: 109
			AttackOption.worldMapEvent = (WorldMapEvent)var3[0]; // L: 110
			WorldMapElement var6 = class147.WorldMapElement_get(AttackOption.worldMapEvent.mapElement); // L: 111
			var4 = MouseHandler.getWorldMapScript(var0.type, var6.objectId, var6.category); // L: 112
		} else {
			int var5 = (Integer)var3[0]; // L: 115
			var4 = class193.getScript(var5); // L: 116
		}

		if (var4 != null) { // L: 118
			Client.method1688(var0, var4, var1, var2); // L: 119
		}

	} // L: 121
}
