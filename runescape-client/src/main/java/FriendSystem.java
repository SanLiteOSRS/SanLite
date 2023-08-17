import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ci")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lqk;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1624494161
	)
	int field851;

	@ObfuscatedSignature(
		descriptor = "(Lsl;)V"
	)
	FriendSystem(LoginType var1) {
		this.field851 = 0;
		this.loginType = var1; // L: 26
		this.friendsList = new FriendsList(var1); // L: 27
		this.ignoreList = new IgnoreList(var1); // L: 28
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1751365649"
	)
	boolean method1855() {
		return this.field851 == 2;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-641955560"
	)
	final void method1856() {
		this.field851 = 1;
	} // L: 37

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ltm;II)V",
		garbageValue = "-479200024"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2); // L: 40
		this.field851 = 2; // L: 41

		for (int var3 = 0; var3 < Players.Players_count; ++var3) { // L: 43
			Player var4 = Client.players[Players.Players_indices[var3]]; // L: 44
			var4.clearIsFriend(); // L: 45
		}

		Iterator var5 = Messages.Messages_hashTable.iterator(); // L: 48

		while (var5.hasNext()) {
			Message var6 = (Message)var5.next(); // L: 49
			var6.clearIsFromFriend(); // L: 51
		}

		if (ReflectionCheck.friendsChatManager != null) { // L: 55
			ReflectionCheck.friendsChatManager.clearFriends(); // L: 56
		}

	} // L: 59

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-676446193"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) { // L: 62
			if ((long)var1.field4651 < GameEngine.method661() / 1000L - 5L) { // L: 63
				if (var1.world > 0) {
					MouseHandler.addGameMessage(5, "", var1.username + " has logged in."); // L: 64
				}

				if (var1.world == 0) { // L: 65
					MouseHandler.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove(); // L: 66
			}
		}

	} // L: 69

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "60"
	)
	@Export("clear")
	final void clear() {
		this.field851 = 0; // L: 72
		this.friendsList.clear(); // L: 73
		this.ignoreList.clear(); // L: 74
	} // L: 75

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Luc;ZI)Z",
		garbageValue = "496878304"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) { // L: 78
			return false;
		} else if (var1.equals(VarbitComposition.localPlayer.username)) { // L: 79
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2); // L: 80
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Luc;I)Z",
		garbageValue = "-1644388901"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) { // L: 85
			return false;
		} else {
			return this.ignoreList.contains(var1); // L: 86
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "76"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) { // L: 91
			Username var2 = new Username(var1, this.loginType); // L: 92
			if (var2.hasCleanName()) { // L: 93
				if (this.friendsListIsFull()) { // L: 94
					UserComparator8.method2870("Your friend list is full. Max of 200 for free users, and 400 for members"); // L: 96
				} else if (VarbitComposition.localPlayer.username.equals(var2)) { // L: 100
					Clock.method3543(); // L: 101
				} else if (this.isFriended(var2, false)) { // L: 104
					class351.method6621(var1); // L: 105
				} else if (this.isIgnored(var2)) { // L: 108
					UserComparator8.method2870("Please remove " + var1 + " from your ignore list first"); // L: 110
				} else {
					MouseHandler.method698(var1); // L: 114
				}
			}
		}
	} // L: 98 102 106 112 115

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1246160052"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field655 != 1; // L: 138
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "541901649"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) { // L: 145
			Username var2 = new Username(var1, this.loginType); // L: 146
			if (var2.hasCleanName()) { // L: 147
				if (this.canAddIgnore()) { // L: 148
					UserComparator8.method2870("Your ignore list is full. Max of 100 for free users, and 400 for members"); // L: 150
				} else if (VarbitComposition.localPlayer.username.equals(var2)) { // L: 154
					class503.method8932(); // L: 155
				} else if (this.isIgnored(var2)) { // L: 158
					class31.method466(var1); // L: 159
				} else if (this.isFriended(var2, false)) { // L: 162
					UserComparator8.method2870("Please remove " + var1 + " from your friend list first"); // L: 164
				} else {
					PacketBufferNode var3 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3162, Client.packetWriter.isaacCipher); // L: 170
					var3.packetBuffer.writeByte(AbstractSocket.stringCp1252NullTerminatedByteSize(var1)); // L: 171
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 172
					Client.packetWriter.addNode(var3); // L: 173
				}
			}
		}
	} // L: 152 156 160 166 175

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "203788977"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field655 != 1; // L: 186
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "2045043911"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) { // L: 193
			Username var2 = new Username(var1, this.loginType); // L: 194
			if (var2.hasCleanName()) { // L: 195
				if (this.friendsList.removeByUsername(var2)) { // L: 196
					class113.method2845(); // L: 197
					PacketBufferNode var3 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3142, Client.packetWriter.isaacCipher); // L: 199
					var3.packetBuffer.writeByte(AbstractSocket.stringCp1252NullTerminatedByteSize(var1)); // L: 200
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 201
					Client.packetWriter.addNode(var3); // L: 202
				}

				for (int var5 = 0; var5 < Players.Players_count; ++var5) { // L: 205
					Player var4 = Client.players[Players.Players_indices[var5]]; // L: 206
					var4.clearIsFriend(); // L: 207
				}

				Iterator var6 = Messages.Messages_hashTable.iterator(); // L: 210

				while (var6.hasNext()) {
					Message var7 = (Message)var6.next(); // L: 211
					var7.clearIsFromFriend(); // L: 213
				}

				if (ReflectionCheck.friendsChatManager != null) { // L: 217
					ReflectionCheck.friendsChatManager.clearFriends(); // L: 218
				}

			}
		}
	} // L: 221

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "81642025"
	)
	public final void method1867(String var1, boolean var2) {
		if (var1 != null) { // L: 224
			Username var3 = new Username(var1, this.loginType); // L: 225
			if (var3.hasCleanName()) { // L: 226
				if (this.ignoreList.removeByUsername(var3)) { // L: 227
					class113.method2845(); // L: 228
					if (var2) { // L: 229
						PacketBufferNode var4 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3164, Client.packetWriter.isaacCipher); // L: 231
						var4.packetBuffer.writeByte(AbstractSocket.stringCp1252NullTerminatedByteSize(var1)); // L: 232
						var4.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 233
						Client.packetWriter.addNode(var4); // L: 234
					}
				}

				AbstractSocket.FriendSystem_invalidateIgnoreds(); // L: 237
			}
		}
	} // L: 238

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Luc;I)Z",
		garbageValue = "1021453892"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1); // L: 250
		return var2 != null && var2.hasWorld(); // L: 251
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SIIB)V",
		garbageValue = "108"
	)
	@Export("sortItemsByName")
	public static void sortItemsByName(String[] var0, short[] var1, int var2, int var3) {
		if (var2 < var3) { // L: 9
			int var4 = (var3 + var2) / 2; // L: 10
			int var5 = var2; // L: 11
			String var6 = var0[var4]; // L: 12
			var0[var4] = var0[var3]; // L: 13
			var0[var3] = var6; // L: 14
			short var7 = var1[var4]; // L: 15
			var1[var4] = var1[var3]; // L: 16
			var1[var3] = var7; // L: 17

			for (int var8 = var2; var8 < var3; ++var8) { // L: 18
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) { // L: 19
					String var9 = var0[var8]; // L: 20
					var0[var8] = var0[var5]; // L: 21
					var0[var5] = var9; // L: 22
					short var10 = var1[var8]; // L: 23
					var1[var8] = var1[var5]; // L: 24
					var1[var5++] = var10; // L: 25
				}
			}

			var0[var3] = var0[var5]; // L: 29
			var0[var5] = var6; // L: 30
			var1[var3] = var1[var5]; // L: 31
			var1[var5] = var7; // L: 32
			sortItemsByName(var0, var1, var2, var5 - 1); // L: 33
			sortItemsByName(var0, var1, var5 + 1, var3); // L: 34
		}

	} // L: 36

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "284694724"
	)
	static int method1917() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1500
			int var0 = 0; // L: 1501

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) { // L: 1502
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount; // L: 1503
			}

			return var0 * 10000 / Client.field827; // L: 1505
		} else {
			return 10000;
		}
	}
}
