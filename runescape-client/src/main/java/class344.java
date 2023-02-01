import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mk")
public class class344 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	static final class344 field4288;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	static final class344 field4287;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	static final class344 field4289;

	static {
		field4288 = new class344(); // L: 4
		field4287 = new class344(); // L: 5
		field4289 = new class344(); // L: 6
	}

	class344() {
	} // L: 8

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1623169078"
	)
	public static void method6675(boolean var0) {
		if (var0 != Clock.ItemComposition_inMembersWorld) { // L: 577
			ItemComposition.ItemComposition_cached.clear(); // L: 579
			ItemComposition.ItemComposition_cachedModels.clear(); // L: 580
			ItemComposition.ItemComposition_cachedSprites.clear(); // L: 581
			Clock.ItemComposition_inMembersWorld = var0; // L: 583
		}

	} // L: 585

	@ObfuscatedName("ms")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "25067"
	)
	static final void method6674() {
		for (int var0 = 0; var0 < Players.Players_count; ++var0) { // L: 12493
			Player var1 = Client.players[Players.Players_indices[var0]]; // L: 12494
			var1.clearIsFriend(); // L: 12495
		}

		class26.method379(); // L: 12497
		if (class281.friendsChatManager != null) { // L: 12498
			class281.friendsChatManager.clearFriends(); // L: 12499
		}

	} // L: 12501
}
