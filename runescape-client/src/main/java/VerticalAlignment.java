import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hr")
@Implements("VerticalAlignment")
public enum VerticalAlignment implements class386 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lhr;"
	)
	field2096(1, 0),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lhr;"
	)
	@Export("VerticalAlignment_centered")
	VerticalAlignment_centered(0, 1),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lhr;"
	)
	field2094(2, 2);

	@ObfuscatedName("tb")
	@ObfuscatedSignature(
		descriptor = "Lgi;"
	)
	@Export("guestClanSettings")
	static ClanSettings guestClanSettings;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1606831967
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1239612337
	)
	@Export("id")
	final int id;

	VerticalAlignment(int var3, int var4) {
		this.value = var3; // L: 14
		this.id = var4; // L: 15
	} // L: 16

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1243971674"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 20
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "900742897"
	)
	static void method3845(int var0) {
		if (var0 != -1) { // L: 5319
			if (class33.field184.method6242(var0)) { // L: 5320
				Widget[] var1 = class33.field184.field3587[var0]; // L: 5321

				for (int var2 = 0; var2 < var1.length; ++var2) { // L: 5322
					Widget var3 = var1[var2]; // L: 5323
					if (var3.onLoad != null) { // L: 5324
						ScriptEvent var4 = new ScriptEvent(); // L: 5325
						var4.widget = var3; // L: 5326
						var4.args = var3.onLoad; // L: 5327
						ArchiveDisk.runScript(var4, 5000000, 0); // L: 5328
					}
				}

			}
		}
	} // L: 5331

	@ObfuscatedName("na")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1054734987"
	)
	static final void method3841() {
		for (int var0 = 0; var0 < Players.Players_count; ++var0) { // L: 12573
			Player var1 = Client.players[Players.Players_indices[var0]]; // L: 12574
			var1.clearIsFriend(); // L: 12575
		}

		Iterator var2 = Messages.Messages_hashTable.iterator(); // L: 12578

		while (var2.hasNext()) {
			Message var3 = (Message)var2.next(); // L: 12579
			var3.clearIsFromFriend(); // L: 12581
		}

		if (class358.friendsChatManager != null) { // L: 12585
			class358.friendsChatManager.clearFriends(); // L: 12586
		}

	} // L: 12588
}
