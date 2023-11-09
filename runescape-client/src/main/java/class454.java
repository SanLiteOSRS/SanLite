import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rg")
public class class454 implements class459 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lsc;"
	)
	public final class489 field4760;

	@ObfuscatedSignature(
		descriptor = "(Lst;)V"
	)
	class454(class490 var1) {
		this.field4760 = var1; // L: 14
	} // L: 15

	@ObfuscatedSignature(
		descriptor = "(Lrd;)V"
	)
	public class454(class455 var1) {
		this(new class490(var1)); // L: 10
	} // L: 11

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-785830464"
	)
	public int method8294(int var1) {
		return this.field4760.vmethod8762(var1); // L: 18
	}

	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-17"
	)
	static void method8293(int var0) {
		class302.tempMenuAction = new MenuAction(); // L: 12047
		class302.tempMenuAction.param0 = Client.menuArguments1[var0]; // L: 12048
		class302.tempMenuAction.param1 = Client.menuArguments2[var0]; // L: 12049
		class302.tempMenuAction.opcode = Client.menuOpcodes[var0]; // L: 12050
		class302.tempMenuAction.identifier = Client.menuIdentifiers[var0]; // L: 12051
		class302.tempMenuAction.field904 = Client.field663[var0]; // L: 12052
		class302.tempMenuAction.field905 = Client.menuActions[var0]; // L: 12053
		class302.tempMenuAction.field906 = Client.menuTargets[var0]; // L: 12054
	} // L: 12055
}
