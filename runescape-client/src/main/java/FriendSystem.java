import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ci")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lte;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lrt;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -509475701
	)
	int field849;

	@ObfuscatedSignature(
		descriptor = "(Lte;)V"
	)
	FriendSystem(LoginType var1) {
		this.field849 = 0; // L: 23
		this.loginType = var1; // L: 26
		this.friendsList = new FriendsList(var1); // L: 27
		this.ignoreList = new IgnoreList(var1); // L: 28
	} // L: 29

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1564644877"
	)
	boolean method1896() {
		return this.field849 == 2; // L: 32
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	final void method1889() {
		this.field849 = 1; // L: 36
	} // L: 37

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lul;IB)V",
		garbageValue = "-47"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2); // L: 40
		this.field849 = 2; // L: 41
		VerticalAlignment.method3841(); // L: 42
	} // L: 43

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-592111602"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) { // L: 46
			if ((long)var1.field4691 < GrandExchangeOfferTotalQuantityComparator.method7049() / 1000L - 5L) { // L: 47
				if (var1.world > 0) {
					class411.addGameMessage(5, "", var1.username + " has logged in."); // L: 48
				}

				if (var1.world == 0) { // L: 49
					class411.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove(); // L: 50
			}
		}

	} // L: 53

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1144489465"
	)
	@Export("clear")
	final void clear() {
		this.field849 = 0; // L: 56
		this.friendsList.clear(); // L: 57
		this.ignoreList.clear(); // L: 58
	} // L: 59

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lvf;ZB)Z",
		garbageValue = "32"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) { // L: 62
			return false;
		} else if (var1.equals(TextureProvider.localPlayer.username)) { // L: 63
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2); // L: 64
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lvf;I)Z",
		garbageValue = "1117529753"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) { // L: 69
			return false;
		} else {
			return this.ignoreList.contains(var1); // L: 70
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "2080092876"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) { // L: 75
			Username var2 = new Username(var1, this.loginType); // L: 76
			if (var2.hasCleanName()) { // L: 77
				if (this.friendsListIsFull()) { // L: 78
					class436.method7914("Your friend list is full. Max of 200 for free users, and 400 for members"); // L: 80
				} else if (TextureProvider.localPlayer.username.equals(var2)) { // L: 84
					class436.method7914("You can't add yourself to your own friend list"); // L: 86
				} else if (this.isFriended(var2, false)) { // L: 90
					PendingSpawn.method2418(var1); // L: 91
				} else if (this.isIgnored(var2)) { // L: 94
					class436.method7914("Please remove " + var1 + " from your ignore list first"); // L: 96
				} else {
					PacketBufferNode var3 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3214, Client.packetWriter.isaacCipher); // L: 102
					var3.packetBuffer.writeByte(class478.stringCp1252NullTerminatedByteSize(var1)); // L: 103
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 104
					Client.packetWriter.addNode(var3); // L: 105
				}
			}
		}
	} // L: 82 88 92 98 107

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "19"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field646 != 1; // L: 118
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "0"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) { // L: 125
			Username var2 = new Username(var1, this.loginType); // L: 126
			if (var2.hasCleanName()) { // L: 127
				if (this.canAddIgnore()) { // L: 128
					class284.method5656(); // L: 129
				} else if (TextureProvider.localPlayer.username.equals(var2)) { // L: 132
					RouteStrategy.method4340(); // L: 133
				} else if (this.isIgnored(var2)) { // L: 136
					class436.method7914(var1 + " is already on your ignore list"); // L: 138
				} else if (this.isFriended(var2, false)) { // L: 142
					class436.method7914("Please remove " + var1 + " from your friend list first"); // L: 144
				} else {
					class145.method3153(var1); // L: 148
				}
			}
		}
	} // L: 130 134 140 146 149

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "592853895"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field646 != 1; // L: 168
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-16"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) { // L: 175
			Username var2 = new Username(var1, this.loginType); // L: 176
			if (var2.hasCleanName()) { // L: 177
				if (this.friendsList.removeByUsername(var2)) { // L: 178
					Client.field723 = Client.cycleCntr; // L: 180
					PacketBufferNode var3 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3146, Client.packetWriter.isaacCipher); // L: 183
					var3.packetBuffer.writeByte(class478.stringCp1252NullTerminatedByteSize(var1)); // L: 184
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 185
					Client.packetWriter.addNode(var3); // L: 186
				}

				VerticalAlignment.method3841(); // L: 188
			}
		}
	} // L: 189

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "-2065988446"
	)
	public final void method1901(String var1, boolean var2) {
		if (var1 != null) { // L: 192
			Username var3 = new Username(var1, this.loginType); // L: 193
			if (var3.hasCleanName()) { // L: 194
				if (this.ignoreList.removeByUsername(var3)) { // L: 195
					Client.field723 = Client.cycleCntr; // L: 197
					if (var2) { // L: 199
						PacketBufferNode var4 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3201, Client.packetWriter.isaacCipher); // L: 201
						var4.packetBuffer.writeByte(class478.stringCp1252NullTerminatedByteSize(var1)); // L: 202
						var4.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 203
						Client.packetWriter.addNode(var4); // L: 204
					}
				}

				class492.FriendSystem_invalidateIgnoreds(); // L: 207
			}
		}
	} // L: 208

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lvf;B)Z",
		garbageValue = "-15"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1); // L: 220
		return var2 != null && var2.hasWorld(); // L: 221
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)[B",
		garbageValue = "1223769236"
	)
	public static byte[] method1945(CharSequence var0) {
		int var1 = var0.length(); // L: 9
		byte[] var2 = new byte[var1]; // L: 10

		for (int var3 = 0; var3 < var1; ++var3) { // L: 11
			char var4 = var0.charAt(var3); // L: 12
			if (var4 > 127) { // L: 13
				var2[var3] = 63;
			} else {
				var2[var3] = (byte)var4; // L: 14
			}
		}

		return var2; // L: 16
	}
}
