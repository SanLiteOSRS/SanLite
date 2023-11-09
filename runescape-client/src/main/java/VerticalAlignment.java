import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hz")
@Implements("VerticalAlignment")
public enum VerticalAlignment implements class371 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	field2056(0, 0),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("VerticalAlignment_centered")
	VerticalAlignment_centered(2, 1),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	field2058(1, 2);

	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -642038691
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1341360891
	)
	@Export("id")
	final int id;

	VerticalAlignment(int var3, int var4) {
		this.value = var3; // L: 18
		this.id = var4; // L: 19
	} // L: 20

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1233989967"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 24
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	static final void method3884() {
		if (Client.logoutTimer > 0) { // L: 3036
			class36.logOut(); // L: 3037
		} else {
			Client.timer.method7711(); // L: 3040
			AttackOption.method2723(40); // L: 3041
			Interpreter.field863 = Client.packetWriter.getSocket(); // L: 3042
			Client.packetWriter.removeSocket(); // L: 3043
		}
	} // L: 3038 3044
}
