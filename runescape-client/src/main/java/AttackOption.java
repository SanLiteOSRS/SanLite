import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dw")
@Implements("AttackOption")
public enum AttackOption implements class369 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	@Export("AttackOption_dependsOnCombatLevels")
	AttackOption_dependsOnCombatLevels(0),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	@Export("AttackOption_alwaysRightClick")
	AttackOption_alwaysRightClick(1),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	field1303(2),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	@Export("AttackOption_hidden")
	AttackOption_hidden(3),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	field1305(4);

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("worldMapEvent")
	static WorldMapEvent worldMapEvent;
	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "Ldz;"
	)
	@Export("mouseRecorder")
	static MouseRecorder mouseRecorder;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 367322715
	)
	@Export("id")
	final int id;

	AttackOption(int var3) {
		this.id = var3; // L: 12695
	} // L: 12696

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1108588956"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 12700
	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1868685089"
	)
	static final void method2639() {
		if (LoginType.field4933) { // L: 3784
			for (int var0 = 0; var0 < Players.Players_count; ++var0) { // L: 3786
				Player var1 = Client.players[Players.Players_indices[var0]]; // L: 3787
				var1.method2305(); // L: 3788
			}

			LoginType.field4933 = false; // L: 3791
		}

	} // L: 3793
}
