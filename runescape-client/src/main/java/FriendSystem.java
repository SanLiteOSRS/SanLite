import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cg")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lsw;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1736413869
	)
	int field812;

	@ObfuscatedSignature(
		descriptor = "(Lsw;)V"
	)
	FriendSystem(LoginType var1) {
		this.field812 = 0; // L: 23
		this.loginType = var1; // L: 26
		this.friendsList = new FriendsList(var1); // L: 27
		this.ignoreList = new IgnoreList(var1); // L: 28
	} // L: 29

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-405500659"
	)
	boolean method1845() {
		return this.field812 == 2; // L: 32
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	final void method1832() {
		this.field812 = 1; // L: 36
	} // L: 37

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lsg;II)V",
		garbageValue = "734353750"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2); // L: 40
		this.field812 = 2; // L: 41

		for (int var3 = 0; var3 < Players.Players_count; ++var3) { // L: 43
			Player var4 = Client.players[Players.Players_indices[var3]]; // L: 44
			var4.clearIsFriend(); // L: 45
		}

		GameEngine.method585(); // L: 47
		if (UserComparator5.friendsChatManager != null) { // L: 48
			UserComparator5.friendsChatManager.clearFriends(); // L: 49
		}

	} // L: 52

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1673735823"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) { // L: 55
			if ((long)var1.field4575 < class96.method2634() / 1000L - 5L) { // L: 56
				if (var1.world > 0) {
					UserComparator5.addGameMessage(5, "", var1.username + " has logged in."); // L: 57
				}

				if (var1.world == 0) { // L: 58
					UserComparator5.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove(); // L: 59
			}
		}

	} // L: 62

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "108"
	)
	@Export("clear")
	final void clear() {
		this.field812 = 0; // L: 65
		this.friendsList.clear(); // L: 66
		this.ignoreList.clear(); // L: 67
	} // L: 68

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ltm;ZB)Z",
		garbageValue = "-51"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) { // L: 71
			return false;
		} else if (var1.equals(MusicPatchNode.localPlayer.username)) { // L: 72
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2); // L: 73
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ltm;I)Z",
		garbageValue = "-1193559293"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) { // L: 78
			return false;
		} else {
			return this.ignoreList.contains(var1); // L: 79
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-60"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) { // L: 84
			Username var2 = new Username(var1, this.loginType); // L: 85
			if (var2.hasCleanName()) { // L: 86
				if (this.friendsListIsFull()) { // L: 87
					VerticalAlignment.method3825("Your friend list is full. Max of 200 for free users, and 400 for members"); // L: 89
				} else if (MusicPatchNode.localPlayer.username.equals(var2)) { // L: 93
					class33.method502(); // L: 94
				} else if (this.isFriended(var2, false)) { // L: 97
					VerticalAlignment.method3825(var1 + " is already on your friend list"); // L: 99
				} else if (this.isIgnored(var2)) { // L: 103
					Message.method1174(var1); // L: 104
				} else {
					PacketBufferNode var3 = class330.getPacketBufferNode(ClientPacket.field3153, Client.packetWriter.isaacCipher); // L: 109
					var3.packetBuffer.writeByte(DynamicObject.stringCp1252NullTerminatedByteSize(var1)); // L: 110
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 111
					Client.packetWriter.addNode(var3); // L: 112
				}
			}
		}
	} // L: 91 95 101 105 114

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-57"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field612 != 1; // L: 129
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "42988923"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) { // L: 136
			Username var2 = new Username(var1, this.loginType); // L: 137
			if (var2.hasCleanName()) { // L: 138
				if (this.canAddIgnore()) { // L: 139
					VerticalAlignment.method3825("Your ignore list is full. Max of 100 for free users, and 400 for members"); // L: 141
				} else if (MusicPatchNode.localPlayer.username.equals(var2)) { // L: 145
					GrandExchangeOfferOwnWorldComparator.method1224(); // L: 146
				} else if (this.isIgnored(var2)) { // L: 149
					VerticalAlignment.method3825(var1 + " is already on your ignore list"); // L: 151
				} else if (this.isFriended(var2, false)) { // L: 155
					VerticalAlignment.method3825("Please remove " + var1 + " from your friend list first"); // L: 157
				} else {
					PacketBufferNode var3 = class330.getPacketBufferNode(ClientPacket.field3119, Client.packetWriter.isaacCipher); // L: 163
					var3.packetBuffer.writeByte(DynamicObject.stringCp1252NullTerminatedByteSize(var1)); // L: 164
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 165
					Client.packetWriter.addNode(var3); // L: 166
				}
			}
		}
	} // L: 143 147 153 159 168

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-300357261"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field612 != 1; // L: 175
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1657474548"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) { // L: 182
			Username var2 = new Username(var1, this.loginType); // L: 183
			if (var2.hasCleanName()) { // L: 184
				if (this.friendsList.removeByUsername(var2)) { // L: 185
					Client.field689 = Client.cycleCntr; // L: 187
					PacketBufferNode var3 = class330.getPacketBufferNode(ClientPacket.field3194, Client.packetWriter.isaacCipher); // L: 190
					var3.packetBuffer.writeByte(DynamicObject.stringCp1252NullTerminatedByteSize(var1)); // L: 191
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 192
					Client.packetWriter.addNode(var3); // L: 193
				}

				for (int var5 = 0; var5 < Players.Players_count; ++var5) { // L: 196
					Player var4 = Client.players[Players.Players_indices[var5]]; // L: 197
					var4.clearIsFriend(); // L: 198
				}

				GameEngine.method585(); // L: 200
				if (UserComparator5.friendsChatManager != null) { // L: 201
					UserComparator5.friendsChatManager.clearFriends(); // L: 202
				}

			}
		}
	} // L: 205

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)V",
		garbageValue = "-43"
	)
	public final void method1843(String var1, boolean var2) {
		if (var1 != null) { // L: 208
			Username var3 = new Username(var1, this.loginType); // L: 209
			if (var3.hasCleanName()) { // L: 210
				if (this.ignoreList.removeByUsername(var3)) { // L: 211
					Client.field689 = Client.cycleCntr; // L: 213
					if (var2) { // L: 215
						PacketBufferNode var4 = class330.getPacketBufferNode(ClientPacket.field3112, Client.packetWriter.isaacCipher); // L: 217
						var4.packetBuffer.writeByte(DynamicObject.stringCp1252NullTerminatedByteSize(var1)); // L: 218
						var4.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 219
						Client.packetWriter.addNode(var4); // L: 220
					}
				}

				Login.FriendSystem_invalidateIgnoreds(); // L: 223
			}
		}
	} // L: 224

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ltm;I)Z",
		garbageValue = "-2018991784"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1); // L: 236
		return var2 != null && var2.hasWorld(); // L: 237
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(ILch;ZI)I",
		garbageValue = "994468925"
	)
	static int method1890(int var0, Script var1, boolean var2) {
		return 2; // L: 5232
	}
}
