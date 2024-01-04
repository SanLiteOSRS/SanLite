import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cj")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("oi")
	@ObfuscatedGetter(
		intValue = 271780873
	)
	@Export("menuX")
	static int menuX;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ltt;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lqh;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lqs;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1161414997
	)
	int field816;

	@ObfuscatedSignature(
		descriptor = "(Ltt;)V"
	)
	FriendSystem(LoginType var1) {
		this.field816 = 0; // L: 23
		this.loginType = var1; // L: 26
		this.friendsList = new FriendsList(var1); // L: 27
		this.ignoreList = new IgnoreList(var1); // L: 28
	} // L: 29

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-69"
	)
	boolean method1902() {
		return this.field816 == 2; // L: 32
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-207858450"
	)
	final void method1929() {
		this.field816 = 1; // L: 36
	} // L: 37

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Luj;II)V",
		garbageValue = "-1145524939"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2); // L: 40
		this.field816 = 2; // L: 41

		for (int var3 = 0; var3 < Players.Players_count; ++var3) { // L: 43
			Player var4 = Client.players[Players.Players_indices[var3]]; // L: 44
			var4.clearIsFriend(); // L: 45
		}

		Iterator var5 = Messages.Messages_hashTable.iterator(); // L: 48

		while (var5.hasNext()) {
			Message var6 = (Message)var5.next(); // L: 49
			var6.clearIsFromFriend(); // L: 51
		}

		if (class20.friendsChatManager != null) { // L: 55
			class20.friendsChatManager.clearFriends(); // L: 56
		}

	} // L: 59

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1225915073"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) { // L: 62
			if ((long)var1.field4683 < SpotAnimationDefinition.method3775() / 1000L - 5L) { // L: 63
				if (var1.world > 0) {
					GrandExchangeOfferUnitPriceComparator.addGameMessage(5, "", var1.username + " has logged in."); // L: 64
				}

				if (var1.world == 0) { // L: 65
					GrandExchangeOfferUnitPriceComparator.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove(); // L: 66
			}
		}

	} // L: 69

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2013654454"
	)
	@Export("clear")
	final void clear() {
		this.field816 = 0; // L: 72
		this.friendsList.clear(); // L: 73
		this.ignoreList.clear(); // L: 74
	} // L: 75

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lvj;ZI)Z",
		garbageValue = "1878561272"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) { // L: 78
			return false;
		} else if (var1.equals(class229.localPlayer.username)) { // L: 79
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2); // L: 80
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lvj;I)Z",
		garbageValue = "150326624"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) { // L: 85
			return false;
		} else {
			return this.ignoreList.contains(var1); // L: 86
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1173246505"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) { // L: 91
			Username var2 = new Username(var1, this.loginType); // L: 92
			if (var2.hasCleanName()) { // L: 93
				if (this.friendsListIsFull()) { // L: 94
					AttackOption.method2748(); // L: 95
				} else if (class229.localPlayer.username.equals(var2)) { // L: 98
					class163.method3461(); // L: 99
				} else if (this.isFriended(var2, false)) { // L: 102
					class222.method4306(var1); // L: 103
				} else if (this.isIgnored(var2)) { // L: 106
					AbstractUserComparator.method8173(var1); // L: 107
				} else {
					PacketBufferNode var3 = class113.getPacketBufferNode(ClientPacket.field3154, Client.packetWriter.isaacCipher); // L: 112
					var3.packetBuffer.writeByte(ClanChannel.stringCp1252NullTerminatedByteSize(var1)); // L: 113
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 114
					Client.packetWriter.addNode(var3); // L: 115
				}
			}
		}
	} // L: 96 100 104 108 117

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1130501973"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field754 != 1; // L: 140
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "2025283192"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) { // L: 147
			Username var2 = new Username(var1, this.loginType); // L: 148
			if (var2.hasCleanName()) { // L: 149
				if (this.canAddIgnore()) { // L: 150
					WorldMapArea.method4622("Your ignore list is full. Max of 100 for free users, and 400 for members"); // L: 152
				} else if (class229.localPlayer.username.equals(var2)) { // L: 156
					class158.method3415(); // L: 157
				} else if (this.isIgnored(var2)) { // L: 160
					WorldMapArea.method4622(var1 + " is already on your ignore list"); // L: 162
				} else if (this.isFriended(var2, false)) { // L: 166
					WorldMapArea.method4622("Please remove " + var1 + " from your friend list first"); // L: 168
				} else {
					ScriptFrame.method1213(var1); // L: 172
				}
			}
		}
	} // L: 154 158 164 170 173

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "431528192"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field754 != 1; // L: 188
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-125"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) { // L: 195
			Username var2 = new Username(var1, this.loginType); // L: 196
			if (var2.hasCleanName()) { // L: 197
				if (this.friendsList.removeByUsername(var2)) { // L: 198
					JagexCache.method4214(); // L: 199
					PacketBufferNode var3 = class113.getPacketBufferNode(ClientPacket.field3199, Client.packetWriter.isaacCipher); // L: 201
					var3.packetBuffer.writeByte(ClanChannel.stringCp1252NullTerminatedByteSize(var1)); // L: 202
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 203
					Client.packetWriter.addNode(var3); // L: 204
				}

				for (int var5 = 0; var5 < Players.Players_count; ++var5) { // L: 207
					Player var4 = Client.players[Players.Players_indices[var5]]; // L: 208
					var4.clearIsFriend(); // L: 209
				}

				Iterator var6 = Messages.Messages_hashTable.iterator(); // L: 212

				while (var6.hasNext()) {
					Message var7 = (Message)var6.next(); // L: 213
					var7.clearIsFromFriend(); // L: 215
				}

				if (class20.friendsChatManager != null) { // L: 219
					class20.friendsChatManager.clearFriends(); // L: 220
				}

			}
		}
	} // L: 223

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "-462327739"
	)
	public final void method1914(String var1, boolean var2) {
		if (var1 != null) { // L: 226
			Username var3 = new Username(var1, this.loginType); // L: 227
			if (var3.hasCleanName()) { // L: 228
				if (this.ignoreList.removeByUsername(var3)) { // L: 229
					JagexCache.method4214(); // L: 230
					if (var2) { // L: 231
						PacketBufferNode var4 = class113.getPacketBufferNode(ClientPacket.field3133, Client.packetWriter.isaacCipher); // L: 233
						var4.packetBuffer.writeByte(ClanChannel.stringCp1252NullTerminatedByteSize(var1)); // L: 234
						var4.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 235
						Client.packetWriter.addNode(var4); // L: 236
					}
				}

				class414.FriendSystem_invalidateIgnoreds(); // L: 239
			}
		}
	} // L: 240

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lvj;I)Z",
		garbageValue = "-94470483"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1); // L: 252
		return var2 != null && var2.hasWorld(); // L: 253
	}
}
