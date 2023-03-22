import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cg")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 620631549
	)
	static int field800;
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	static IndexedSprite field801;
	@ObfuscatedName("md")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	@Export("textureProvider")
	static TextureProvider textureProvider;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lrm;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1223770545
	)
	int field799;

	@ObfuscatedSignature(
		descriptor = "(Lrm;)V"
	)
	FriendSystem(LoginType var1) {
		this.field799 = 0; // L: 23
		this.loginType = var1; // L: 26
		this.friendsList = new FriendsList(var1); // L: 27
		this.ignoreList = new IgnoreList(var1); // L: 28
	} // L: 29

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1984618151"
	)
	boolean method1888() {
		return this.field799 == 2; // L: 32
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-805849904"
	)
	final void method1836() {
		this.field799 = 1; // L: 36
	} // L: 37

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lsy;II)V",
		garbageValue = "1609164705"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2); // L: 40
		this.field799 = 2; // L: 41

		for (int var3 = 0; var3 < Players.Players_count; ++var3) { // L: 43
			Player var4 = Client.players[Players.Players_indices[var3]]; // L: 44
			var4.clearIsFriend(); // L: 45
		}

		class289.method5485(); // L: 47
		if (ReflectionCheck.friendsChatManager != null) { // L: 48
			ReflectionCheck.friendsChatManager.clearFriends(); // L: 49
		}

	} // L: 52

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "173893470"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) { // L: 55
			if ((long)var1.field4512 < WorldMapSection2.method4844() / 1000L - 5L) { // L: 56
				if (var1.world > 0) {
					MusicPatchNode.addGameMessage(5, "", var1.username + " has logged in."); // L: 57
				}

				if (var1.world == 0) { // L: 58
					MusicPatchNode.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove(); // L: 59
			}
		}

	} // L: 62

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "63"
	)
	@Export("clear")
	final void clear() {
		this.field799 = 0; // L: 65
		this.friendsList.clear(); // L: 66
		this.ignoreList.clear(); // L: 67
	} // L: 68

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ltj;ZI)Z",
		garbageValue = "-1897361318"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) { // L: 71
			return false;
		} else if (var1.equals(BuddyRankComparator.localPlayer.username)) { // L: 72
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2); // L: 73
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ltj;B)Z",
		garbageValue = "-77"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) { // L: 78
			return false;
		} else {
			return this.ignoreList.contains(var1); // L: 79
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-24"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) { // L: 84
			Username var2 = new Username(var1, this.loginType); // L: 85
			if (var2.hasCleanName()) { // L: 86
				if (this.friendsListIsFull()) { // L: 87
					class161.method3341(); // L: 88
				} else if (BuddyRankComparator.localPlayer.username.equals(var2)) { // L: 91
					class7.method52(); // L: 92
				} else if (this.isFriended(var2, false)) { // L: 95
					Tiles.method2216(var1 + " is already on your friend list"); // L: 97
				} else if (this.isIgnored(var2)) { // L: 101
					Tiles.method2216("Please remove " + var1 + " from your ignore list first"); // L: 103
				} else {
					PacketBufferNode var3 = UserComparator9.getPacketBufferNode(ClientPacket.field3070, Client.packetWriter.isaacCipher); // L: 109
					var3.packetBuffer.writeByte(WorldMapLabel.stringCp1252NullTerminatedByteSize(var1)); // L: 110
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 111
					Client.packetWriter.addNode(var3); // L: 112
				}
			}
		}
	} // L: 89 93 99 105 114

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1996234524"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field603 != 1; // L: 129
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-936621609"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) { // L: 136
			Username var2 = new Username(var1, this.loginType); // L: 137
			if (var2.hasCleanName()) { // L: 138
				if (this.canAddIgnore()) { // L: 139
					Tiles.method2216("Your ignore list is full. Max of 100 for free users, and 400 for members"); // L: 141
				} else if (BuddyRankComparator.localPlayer.username.equals(var2)) { // L: 145
					class315.method6278(); // L: 146
				} else if (this.isIgnored(var2)) { // L: 149
					Tiles.method2216(var1 + " is already on your ignore list"); // L: 151
				} else if (this.isFriended(var2, false)) { // L: 155
					Tiles.method2216("Please remove " + var1 + " from your friend list first"); // L: 157
				} else {
					PacketBufferNode var3 = UserComparator9.getPacketBufferNode(ClientPacket.field3127, Client.packetWriter.isaacCipher); // L: 163
					var3.packetBuffer.writeByte(WorldMapLabel.stringCp1252NullTerminatedByteSize(var1)); // L: 164
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 165
					Client.packetWriter.addNode(var3); // L: 166
				}
			}
		}
	} // L: 143 147 153 159 168

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1019684673"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field603 != 1; // L: 175
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "118"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) { // L: 182
			Username var2 = new Username(var1, this.loginType); // L: 183
			if (var2.hasCleanName()) { // L: 184
				if (this.friendsList.removeByUsername(var2)) { // L: 185
					Client.field701 = Client.cycleCntr; // L: 187
					PacketBufferNode var3 = UserComparator9.getPacketBufferNode(ClientPacket.field3084, Client.packetWriter.isaacCipher); // L: 190
					var3.packetBuffer.writeByte(WorldMapLabel.stringCp1252NullTerminatedByteSize(var1)); // L: 191
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 192
					Client.packetWriter.addNode(var3); // L: 193
				}

				for (int var5 = 0; var5 < Players.Players_count; ++var5) { // L: 196
					Player var4 = Client.players[Players.Players_indices[var5]]; // L: 197
					var4.clearIsFriend(); // L: 198
				}

				class289.method5485(); // L: 200
				if (ReflectionCheck.friendsChatManager != null) { // L: 201
					ReflectionCheck.friendsChatManager.clearFriends(); // L: 202
				}

			}
		}
	} // L: 205

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "185621103"
	)
	public final void method1896(String var1, boolean var2) {
		if (var1 != null) { // L: 208
			Username var3 = new Username(var1, this.loginType); // L: 209
			if (var3.hasCleanName()) { // L: 210
				if (this.ignoreList.removeByUsername(var3)) { // L: 211
					Client.field701 = Client.cycleCntr; // L: 213
					if (var2) { // L: 215
						PacketBufferNode var4 = UserComparator9.getPacketBufferNode(ClientPacket.field3112, Client.packetWriter.isaacCipher); // L: 217
						var4.packetBuffer.writeByte(WorldMapLabel.stringCp1252NullTerminatedByteSize(var1)); // L: 218
						var4.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 219
						Client.packetWriter.addNode(var4); // L: 220
					}
				}

				Message.FriendSystem_invalidateIgnoreds(); // L: 223
			}
		}
	} // L: 224

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ltj;B)Z",
		garbageValue = "-57"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1); // L: 236
		return var2 != null && var2.hasWorld(); // L: 237
	}
}
