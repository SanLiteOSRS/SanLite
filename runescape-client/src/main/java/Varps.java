import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mm")
@Implements("Varps")
public class Varps {
	@ObfuscatedName("wf")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	public static class385 field3599;
	@ObfuscatedName("am")
	@Export("Varps_masks")
	static int[] Varps_masks;
	@ObfuscatedName("af")
	@Export("Varps_temp")
	public static int[] Varps_temp;
	@ObfuscatedName("aj")
	@Export("Varps_main")
	public static int[] Varps_main;

	static {
		Varps_masks = new int[32]; // L: 6
		int var0 = 2; // L: 9

		for (int var1 = 0; var1 < 32; ++var1) { // L: 10
			Varps_masks[var1] = var0 - 1; // L: 11
			var0 += var0; // L: 12
		}

		Varps_temp = new int[5000]; // L: 17
		Varps_main = new int[5000]; // L: 18
	}

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "69187627"
	)
	static void method6320() {
		if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) { // L: 4963
			class141.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false); // L: 4964
		}

	} // L: 4966

	@ObfuscatedName("ow")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2067083131"
	)
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		LoginPacket.method5995(); // L: 12460
		if (ClientPreferences.friendsChatManager != null) { // L: 12461
			ClientPreferences.friendsChatManager.invalidateIgnoreds(); // L: 12462
		}

	} // L: 12464
}
