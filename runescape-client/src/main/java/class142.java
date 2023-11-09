import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("es")
public class class142 extends class128 {
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1165730347
	)
	@Export("gameCyclesToDo")
	static int gameCyclesToDo;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1781355329
	)
	int field1647;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lec;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lec;)V"
	)
	class142(class131 var1) {
		this.this$0 = var1;
		this.field1647 = -1; // L: 213
	} // L: 215

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lqw;I)V",
		garbageValue = "-423569520"
	)
	void vmethod3155(Buffer var1) {
		this.field1647 = var1.readUnsignedShort(); // L: 218
	} // L: 219

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lez;I)V",
		garbageValue = "-1755436064"
	)
	void vmethod3154(ClanSettings var1) {
		var1.method2982(this.field1647); // L: 222
	} // L: 223

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2021363720"
	)
	static void method3069() {
		class356.Tiles_underlays = null; // L: 64
		Tiles.Tiles_overlays = null; // L: 65
		Tiles.Tiles_shapes = null; // L: 66
		Tiles.field997 = null; // L: 67
		MouseRecorder.field1060 = null; // L: 68
		Tiles.field998 = null; // L: 69
		class295.field3524 = null; // L: 70
		NetFileRequest.Tiles_hue = null; // L: 71
		class430.Tiles_saturation = null; // L: 72
		DecorativeObject.Tiles_lightness = null; // L: 73
		class4.Tiles_hueMultiplier = null; // L: 74
		Tiles.field999 = null; // L: 75
	} // L: 76

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1710253974"
	)
	static int method3067(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0); // L: 57
		if (var1 == null) { // L: 58
			return -1;
		} else {
			return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.nextDual).count; // L: 59 60
		}
	}

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "45"
	)
	static final void method3068() {
		if (ClanChannelMember.FriendsChatManager_inFriendsChat) { // L: 3779
			if (class13.friendsChatManager != null) { // L: 3780
				class13.friendsChatManager.sort(); // L: 3781
			}

			for (int var0 = 0; var0 < Players.Players_count; ++var0) { // L: 3784
				Player var1 = Client.players[Players.Players_indices[var0]]; // L: 3785
				var1.clearIsInFriendsChat(); // L: 3786
			}

			ClanChannelMember.FriendsChatManager_inFriendsChat = false; // L: 3789
		}

	} // L: 3791
}
