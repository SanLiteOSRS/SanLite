import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rm")
public class class442 implements class447 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lsn;"
	)
	public final class477 field4708;

	@ObfuscatedSignature(
		descriptor = "(Lsy;)V"
	)
	class442(class478 var1) {
		this.field4708 = var1; // L: 14
	} // L: 15

	@ObfuscatedSignature(
		descriptor = "(Lrx;)V"
	)
	public class442(class443 var1) {
		this(new class478(var1)); // L: 10
	} // L: 11

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-493898286"
	)
	public int method8187(int var1) {
		return this.field4708.vmethod8643(var1); // L: 18
	}

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-36"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		Player.method2340(); // L: 9102
		Client.menuActions[0] = "Cancel"; // L: 9103
		Client.menuTargets[0] = ""; // L: 9104
		Client.menuOpcodes[0] = 1006; // L: 9105
		Client.menuShiftClick[0] = false; // L: 9106
		Client.menuOptionsCount = 1; // L: 9107
	} // L: 9108
}
