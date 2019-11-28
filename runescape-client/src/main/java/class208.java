import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hr")
public class class208 {
	@ObfuscatedName("je")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "682234129"
	)
	static void method3991(int var0) {
		Tiles.tempMenuAction = new MenuAction();
		Tiles.tempMenuAction.argument1 = Client.menuArguments1[var0];
		Tiles.tempMenuAction.argument2 = Client.menuArguments2[var0];
		Tiles.tempMenuAction.opcode = Client.menuOpcodes[var0];
		Tiles.tempMenuAction.argument0 = Client.menuIdentifiers[var0];
		Tiles.tempMenuAction.action = Client.menuActions[var0];
	}
}
