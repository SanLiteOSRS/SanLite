import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dt")
public enum class86 implements class356 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	field1080(0, -1),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	field1074(1, 2),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	field1075(2, 3),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	field1076(3, 4),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	field1077(4, 5),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	field1078(5, 6);

	@ObfuscatedName("uf")
	@ObfuscatedGetter(
		intValue = -1642659271
	)
	static int field1082;
	@ObfuscatedName("at")
	static int[] field1073;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -2060299987
	)
	final int field1081;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 2093130161
	)
	final int field1079;

	class86(int var3, int var4) {
		this.field1081 = var3; // L: 21
		this.field1079 = var4; // L: 22
	} // L: 23

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "741942848"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1079; // L: 27
	}

	@ObfuscatedName("mo")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-62"
	)
	static final void method2286(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255); // L: 11658
		if (var0 != class20.clientPreferences.method2461()) { // L: 11659
			if (class20.clientPreferences.method2461() == 0 && Client.currentTrackGroupId != -1) { // L: 11660
				Message.method1201(class399.archive6, Client.currentTrackGroupId, 0, var0, false); // L: 11661
				Client.playingJingle = false; // L: 11662
			} else if (var0 == 0) { // L: 11664
				FloorUnderlayDefinition.method3865(); // L: 11665
				Client.playingJingle = false; // L: 11666
			} else {
				class220.method4513(var0); // L: 11668
			}

			class20.clientPreferences.method2460(var0); // L: 11669
		}

	} // L: 11671
}
