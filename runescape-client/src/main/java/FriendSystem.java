import java.awt.Component;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cm")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpc;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lpz;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -282441673
	)
	int field808;

	@ObfuscatedSignature(
		descriptor = "(Lsg;)V"
	)
	FriendSystem(LoginType var1) {
		this.field808 = 0; // L: 23
		this.loginType = var1; // L: 26
		this.friendsList = new FriendsList(var1); // L: 27
		this.ignoreList = new IgnoreList(var1); // L: 28
	} // L: 29

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "25054"
	)
	boolean method1829() {
		return this.field808 == 2; // L: 32
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "90"
	)
	final void method1830() {
		this.field808 = 1; // L: 36
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ltc;II)V",
		garbageValue = "-87449024"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2);
		this.field808 = 2; // L: 41

		for (int var3 = 0; var3 < Players.Players_count; ++var3) { // L: 43
			Player var4 = Client.players[Players.Players_indices[var3]]; // L: 44
			var4.clearIsFriend(); // L: 45
		}

		class343.method6640(); // L: 47
		if (BZip2State.friendsChatManager != null) { // L: 48
			BZip2State.friendsChatManager.clearFriends(); // L: 49
		}

	} // L: 52

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-102"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) { // L: 55
			if ((long)var1.field4602 < Canvas.method310() / 1000L - 5L) { // L: 56
				if (var1.world > 0) {
					HealthBarUpdate.addGameMessage(5, "", var1.username + " has logged in."); // L: 57
				}

				if (var1.world == 0) { // L: 58
					HealthBarUpdate.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove(); // L: 59
			}
		}

	} // L: 62

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "507568380"
	)
	@Export("clear")
	final void clear() {
		this.field808 = 0; // L: 65
		this.friendsList.clear(); // L: 66
		this.ignoreList.clear(); // L: 67
	} // L: 68

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Luy;ZI)Z",
		garbageValue = "-1398494691"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) { // L: 71
			return false;
		} else if (var1.equals(HitSplatDefinition.localPlayer.username)) { // L: 72
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2); // L: 73
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Luy;I)Z",
		garbageValue = "-1877714437"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) { // L: 78
			return false;
		} else {
			return this.ignoreList.contains(var1); // L: 79
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1298387721"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) { // L: 84
			Username var2 = new Username(var1, this.loginType); // L: 85
			if (var2.hasCleanName()) { // L: 86
				if (this.friendsListIsFull()) { // L: 87
					class147.method3138("Your friend list is full. Max of 200 for free users, and 400 for members"); // L: 89
				} else if (HitSplatDefinition.localPlayer.username.equals(var2)) { // L: 93
					class147.method3138("You can't add yourself to your own friend list"); // L: 95
				} else if (this.isFriended(var2, false)) { // L: 99
					class72.method2049(var1); // L: 100
				} else if (this.isIgnored(var2)) { // L: 103
					StringBuilder var10000 = new StringBuilder();
					Object var10001 = null; // L: 105
					var10000 = var10000.append("Please remove ").append(var1);
					var10001 = null;
					String var3 = var10000.append(" from your ignore list first").toString();
					HealthBarUpdate.addGameMessage(30, "", var3); // L: 107
				} else {
					class210.method4078(var1); // L: 112
				}
			}
		}
	} // L: 91 97 101 110 113

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-107"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field607 != 1; // L: 132
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "412023547"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) { // L: 139
			Username var2 = new Username(var1, this.loginType); // L: 140
			if (var2.hasCleanName()) { // L: 141
				if (this.canAddIgnore()) { // L: 142
					class147.method3138("Your ignore list is full. Max of 100 for free users, and 400 for members"); // L: 144
				} else if (HitSplatDefinition.localPlayer.username.equals(var2)) { // L: 148
					class147.method3138("You can't add yourself to your own ignore list"); // L: 150
				} else if (this.isIgnored(var2)) { // L: 154
					UserComparator10.method2887(var1); // L: 155
				} else if (this.isFriended(var2, false)) { // L: 158
					BufferedSink.method8036(var1); // L: 159
				} else {
					WorldMapIcon_1.method5057(var1); // L: 162
				}
			}
		}
	} // L: 146 152 156 160 163

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-97"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field607 != 1; // L: 185
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-79"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) { // L: 192
			Username var2 = new Username(var1, this.loginType); // L: 193
			if (var2.hasCleanName()) { // L: 194
				if (this.friendsList.removeByUsername(var2)) { // L: 195
					Client.field736 = Client.cycleCntr; // L: 197
					PacketBufferNode var3 = class251.getPacketBufferNode(ClientPacket.field3121, Client.packetWriter.isaacCipher); // L: 200
					var3.packetBuffer.writeByte(class298.stringCp1252NullTerminatedByteSize(var1)); // L: 201
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 202
					Client.packetWriter.addNode(var3); // L: 203
				}

				for (int var5 = 0; var5 < Players.Players_count; ++var5) { // L: 206
					Player var4 = Client.players[Players.Players_indices[var5]]; // L: 207
					var4.clearIsFriend(); // L: 208
				}

				class343.method6640(); // L: 210
				if (BZip2State.friendsChatManager != null) { // L: 211
					BZip2State.friendsChatManager.clearFriends(); // L: 212
				}

			}
		}
	} // L: 215

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)V",
		garbageValue = "0"
	)
	public final void method1876(String var1, boolean var2) {
		if (var1 != null) { // L: 218
			Username var3 = new Username(var1, this.loginType); // L: 219
			if (var3.hasCleanName()) { // L: 220
				if (this.ignoreList.removeByUsername(var3)) { // L: 221
					Client.field736 = Client.cycleCntr; // L: 223
					if (var2) { // L: 225
						PacketBufferNode var4 = class251.getPacketBufferNode(ClientPacket.field3137, Client.packetWriter.isaacCipher); // L: 227
						var4.packetBuffer.writeByte(class298.stringCp1252NullTerminatedByteSize(var1)); // L: 228
						var4.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 229
						Client.packetWriter.addNode(var4); // L: 230
					}
				}

				PlatformInfo.FriendSystem_invalidateIgnoreds(); // L: 233
			}
		}
	} // L: 234

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luy;B)Z",
		garbageValue = "-7"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1); // L: 246
		return var2 != null && var2.hasWorld(); // L: 247
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "-83"
	)
	static void method1881(Component var0) {
		var0.addMouseListener(MouseHandler.KeyHandler_instance); // L: 37
		var0.addMouseMotionListener(MouseHandler.KeyHandler_instance); // L: 38
		var0.addFocusListener(MouseHandler.KeyHandler_instance); // L: 39
	} // L: 40
}
