import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ro")
public class class448 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lro;"
	)
	public static final class448 field4717;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lro;"
	)
	static final class448 field4715;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1708361053
	)
	@Export("canvasWidth")
	public static int canvasWidth;
	@ObfuscatedName("av")
	String field4716;

	static {
		field4717 = new class448("application/json"); // L: 4
		field4715 = new class448("text/plain"); // L: 5
	}

	class448(String var1) {
		this.field4716 = var1; // L: 9
	} // L: 10

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-959614296"
	)
	public String method8223() {
		return this.field4716; // L: 13
	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-459894997"
	)
	static final void method8227() {
		if (class14.FriendsChatManager_inFriendsChat) { // L: 3801
			if (class406.friendsChatManager != null) { // L: 3802
				class406.friendsChatManager.sort(); // L: 3803
			}

			for (int var0 = 0; var0 < Players.Players_count; ++var0) { // L: 3806
				Player var1 = Client.players[Players.Players_indices[var0]]; // L: 3807
				var1.clearIsInFriendsChat(); // L: 3808
			}

			class14.FriendsChatManager_inFriendsChat = false; // L: 3811
		}

	} // L: 3813
}
