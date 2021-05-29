import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ik")
@Implements("Varps")
public class Varps {
	@ObfuscatedName("v")
	@Export("Varps_masks")
	static int[] Varps_masks;
	@ObfuscatedName("n")
	@Export("Varps_temp")
	public static int[] Varps_temp;
	@ObfuscatedName("f")
	@Export("Varps_main")
	public static int[] Varps_main;
	@ObfuscatedName("bd")
	@Export("otp")
	static String otp;

	static {
		Varps_masks = new int[32];
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			Varps_masks[var1] = var0 - 1;
			var0 += var0;
		}

		Varps_temp = new int[4000];
		Varps_main = new int[4000];
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-1"
	)
	static final void method4647() {
		for (int var0 = 0; var0 < Players.Players_count; ++var0) {
			Player var1 = Client.players[Players.Players_indices[var0]];
			var1.clearIsFriend();
		}

		Iterator var2 = Messages.Messages_hashTable.iterator();

		while (var2.hasNext()) {
			Message var3 = (Message)var2.next();
			var3.clearIsFromFriend();
		}

		if (WorldMapRegion.clanChat != null) {
			WorldMapRegion.clanChat.clearFriends();
		}

	}
}
