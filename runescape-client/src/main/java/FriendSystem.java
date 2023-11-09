import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bg")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 927837377
	)
	int field794;

	@ObfuscatedSignature(
		descriptor = "(Lpl;)V"
	)
	FriendSystem(LoginType var1) {
		this.field794 = 0; // L: 23
		this.loginType = var1; // L: 26
		this.friendsList = new FriendsList(var1); // L: 27
		this.ignoreList = new IgnoreList(var1); // L: 28
	} // L: 29

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-788390797"
	)
	boolean method1627() {
		return this.field794 == 2; // L: 32
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	final void method1702() {
		this.field794 = 1; // L: 36
	} // L: 37

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lqr;II)V",
		garbageValue = "15776660"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2); // L: 40
		this.field794 = 2; // L: 41
		class271.method5170(); // L: 42
	} // L: 43

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-596929038"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) { // L: 46
			if ((long)var1.field4296 < class181.method3483() / 1000L - 5L) { // L: 47
				if (var1.world > 0) {
					VarcInt.addGameMessage(5, "", var1.username + " has logged in."); // L: 48
				}

				if (var1.world == 0) { // L: 49
					VarcInt.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove(); // L: 50
			}
		}

	} // L: 53

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-860887782"
	)
	@Export("clear")
	final void clear() {
		this.field794 = 0; // L: 56
		this.friendsList.clear(); // L: 57
		this.ignoreList.clear(); // L: 58
	} // L: 59

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lqy;ZI)Z",
		garbageValue = "244591169"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) { // L: 62
			return false;
		} else if (var1.equals(ScriptFrame.localPlayer.username)) { // L: 63
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2); // L: 64
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lqy;I)Z",
		garbageValue = "-622799263"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) { // L: 69
			return false;
		} else {
			return this.ignoreList.contains(var1); // L: 70
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1454729750"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) { // L: 75
			Username var2 = new Username(var1, this.loginType); // L: 76
			if (var2.hasCleanName()) { // L: 77
				if (this.friendsListIsFull()) { // L: 78
					Object var10000 = null; // L: 80
					String var4 = "Your friend list is full. Max of 200 for free users, and 400 for members";
					VarcInt.addGameMessage(30, "", var4); // L: 82
				} else if (ScriptFrame.localPlayer.username.equals(var2)) { // L: 87
					class270.method5154(); // L: 88
				} else if (this.isFriended(var2, false)) { // L: 91
					WorldMapLabelSize.method4449(var1); // L: 92
				} else if (this.isIgnored(var2)) { // L: 95
					class128.method2801(var1); // L: 96
				} else {
					PacketBufferNode var3 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field3009, Client.packetWriter.isaacCipher); // L: 101
					var3.packetBuffer.writeByte(class309.stringCp1252NullTerminatedByteSize(var1)); // L: 102
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 103
					Client.packetWriter.addNode(var3); // L: 104
				}
			}
		}
	} // L: 85 89 93 97 106

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-360356908"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field592 != 1; // L: 125
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-34"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) { // L: 132
			Username var2 = new Username(var1, this.loginType); // L: 133
			if (var2.hasCleanName()) { // L: 134
				if (this.canAddIgnore()) { // L: 135
					class4.method20("Your ignore list is full. Max of 100 for free users, and 400 for members"); // L: 137
				} else if (ScriptFrame.localPlayer.username.equals(var2)) { // L: 141
					PacketBufferNode.method5137(); // L: 142
				} else if (this.isIgnored(var2)) { // L: 145
					WorldMapCacheName.method4984(var1); // L: 146
				} else if (this.isFriended(var2, false)) { // L: 149
					UserComparator8.method2552(var1); // L: 150
				} else {
					UserComparator3.method2582(var1); // L: 153
				}
			}
		}
	} // L: 139 143 147 151 154

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-64"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field592 != 1; // L: 180
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-509438981"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) { // L: 187
			Username var2 = new Username(var1, this.loginType); // L: 188
			if (var2.hasCleanName()) { // L: 189
				if (this.friendsList.removeByUsername(var2)) { // L: 190
					ParamComposition.method3508(); // L: 191
					PacketBufferNode var3 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2962, Client.packetWriter.isaacCipher); // L: 193
					var3.packetBuffer.writeByte(class309.stringCp1252NullTerminatedByteSize(var1)); // L: 194
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 195
					Client.packetWriter.addNode(var3); // L: 196
				}

				class271.method5170(); // L: 198
			}
		}
	} // L: 199

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1617210876"
	)
	@Export("removeIgnore")
	final void removeIgnore(String var1) {
		if (var1 != null) { // L: 202
			Username var2 = new Username(var1, this.loginType); // L: 203
			if (var2.hasCleanName()) { // L: 204
				if (this.ignoreList.removeByUsername(var2)) { // L: 205
					ParamComposition.method3508(); // L: 206
					PacketBufferNode var3 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2917, Client.packetWriter.isaacCipher); // L: 208
					var3.packetBuffer.writeByte(class309.stringCp1252NullTerminatedByteSize(var1)); // L: 209
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 210
					Client.packetWriter.addNode(var3); // L: 211
				}

				ParamComposition.FriendSystem_invalidateIgnoreds(); // L: 213
			}
		}
	} // L: 214

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqy;B)Z",
		garbageValue = "2"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1); // L: 226
		return var2 != null && var2.hasWorld(); // L: 227
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Lbd;",
		garbageValue = "-1446818255"
	)
	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World.World_listCount < World.World_count ? World.World_worlds[++World.World_listCount - 1] : null; // L: 242 243
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "63163772"
	)
	static int method1661(int var0) {
		return (int)((Math.log((double)var0) / Interpreter.field824 - 7.0D) * 256.0D); // L: 3859
	}

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2052694572"
	)
	static final void method1670() {
		for (int var0 = 0; var0 < Players.Players_count; ++var0) { // L: 11981
			Player var1 = Client.players[Players.Players_indices[var0]]; // L: 11982
			var1.clearIsInFriendsChat(); // L: 11983
		}

	} // L: 11985
}
