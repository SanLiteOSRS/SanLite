import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bt")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -77560523
	)
	int field824;

	@ObfuscatedSignature(
		descriptor = "(Lqj;)V"
	)
	FriendSystem(LoginType var1) {
		this.field824 = 0; // L: 23
		this.loginType = var1;
		this.friendsList = new FriendsList(var1); // L: 27
		this.ignoreList = new IgnoreList(var1); // L: 28
	} // L: 29

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-26998"
	)
	boolean method1907() {
		return this.field824 == 2; // L: 32
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "2407"
	)
	final void method1856() {
		this.field824 = 1; // L: 36
	} // L: 37

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lrd;IB)V",
		garbageValue = "-46"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2); // L: 40
		this.field824 = 2; // L: 41

		for (int var3 = 0; var3 < Players.Players_count; ++var3) { // L: 43
			Player var4 = Client.players[Players.Players_indices[var3]]; // L: 44
			var4.clearIsFriend(); // L: 45
		}

		Iterator var5 = Messages.Messages_hashTable.iterator(); // L: 48

		while (var5.hasNext()) {
			Message var6 = (Message)var5.next(); // L: 49
			var6.clearIsFromFriend(); // L: 51
		}

		if (class463.friendsChatManager != null) { // L: 55
			class463.friendsChatManager.clearFriends(); // L: 56
		}

	} // L: 59

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "100"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) { // L: 62
			if ((long)var1.field4556 < class153.method3317() / 1000L - 5L) { // L: 63
				if (var1.world > 0) {
					class280.addGameMessage(5, "", var1.username + " has logged in."); // L: 64
				}

				if (var1.world == 0) { // L: 65
					class280.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove(); // L: 66
			}
		}

	} // L: 69

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-16593"
	)
	@Export("clear")
	final void clear() {
		this.field824 = 0; // L: 72
		this.friendsList.clear(); // L: 73
		this.ignoreList.clear(); // L: 74
	} // L: 75

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lsi;ZI)Z",
		garbageValue = "-1227333084"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) { // L: 78
			return false;
		} else if (var1.equals(class387.localPlayer.username)) { // L: 79
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2); // L: 80
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lsi;B)Z",
		garbageValue = "-68"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) { // L: 85
			return false;
		} else {
			return this.ignoreList.contains(var1); // L: 86
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "610172535"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) { // L: 91
			Username var2 = new Username(var1, this.loginType); // L: 92
			if (var2.hasCleanName()) { // L: 93
				if (this.friendsListIsFull()) { // L: 94
					method1903(); // L: 95
				} else if (class387.localPlayer.username.equals(var2)) { // L: 98
					UserComparator6.method2973(); // L: 99
				} else if (this.isFriended(var2, false)) { // L: 102
					Decimator.method1115(var1 + " is already on your friend list"); // L: 104
				} else if (this.isIgnored(var2)) { // L: 108
					class6.method52(var1); // L: 109
				} else {
					WorldMapElement.method3631(var1); // L: 112
				}
			}
		}
	} // L: 96 100 106 110 113

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "22745263"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field630 != 1; // L: 140
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1660462621"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) { // L: 147
			Username var2 = new Username(var1, this.loginType); // L: 148
			if (var2.hasCleanName()) { // L: 149
				if (this.canAddIgnore()) { // L: 150
					RouteStrategy.method4218(); // L: 151
				} else if (class387.localPlayer.username.equals(var2)) { // L: 154
					ChatChannel.method2213(); // L: 155
				} else if (this.isIgnored(var2)) { // L: 158
					class31.method471(var1); // L: 159
				} else if (this.isFriended(var2, false)) { // L: 162
					UserComparator9.method2943(var1); // L: 163
				} else {
					class380.method7375(var1); // L: 166
				}
			}
		}
	} // L: 152 156 160 164 167

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "802889644"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field630 != 1; // L: 194
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "450503844"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) { // L: 201
			Username var2 = new Username(var1, this.loginType); // L: 202
			if (var2.hasCleanName()) { // L: 203
				if (this.friendsList.removeByUsername(var2)) { // L: 204
					UserComparator7.method2926(); // L: 205
					PacketBufferNode var3 = Renderable.getPacketBufferNode(ClientPacket.field3151, Client.packetWriter.isaacCipher); // L: 207
					var3.packetBuffer.writeByte(class96.stringCp1252NullTerminatedByteSize(var1)); // L: 208
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 209
					Client.packetWriter.addNode(var3); // L: 210
				}

				for (int var5 = 0; var5 < Players.Players_count; ++var5) { // L: 213
					Player var4 = Client.players[Players.Players_indices[var5]]; // L: 214
					var4.clearIsFriend(); // L: 215
				}

				Iterator var6 = Messages.Messages_hashTable.iterator(); // L: 218

				while (var6.hasNext()) {
					Message var7 = (Message)var6.next(); // L: 219
					var7.clearIsFromFriend(); // L: 221
				}

				if (class463.friendsChatManager != null) { // L: 225
					class463.friendsChatManager.clearFriends(); // L: 226
				}

			}
		}
	} // L: 229

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-992361699"
	)
	@Export("removeIgnore")
	final void removeIgnore(String var1) {
		if (var1 != null) { // L: 232
			Username var2 = new Username(var1, this.loginType); // L: 233
			if (var2.hasCleanName()) { // L: 234
				if (this.ignoreList.removeByUsername(var2)) { // L: 235
					UserComparator7.method2926(); // L: 236
					PacketBufferNode var3 = Renderable.getPacketBufferNode(ClientPacket.field3122, Client.packetWriter.isaacCipher); // L: 238
					var3.packetBuffer.writeByte(class96.stringCp1252NullTerminatedByteSize(var1)); // L: 239
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 240
					Client.packetWriter.addNode(var3); // L: 241
				}

				FontName.FriendSystem_invalidateIgnoreds(); // L: 243
			}
		}
	} // L: 244

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lsi;B)Z",
		garbageValue = "-42"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1); // L: 256
		return var2 != null && var2.hasWorld(); // L: 257
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "31"
	)
	static boolean method1874(int var0, int var1) {
		return var0 != 4 || var1 < 8; // L: 26
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1466707418"
	)
	static void method1908() {
		if (Login.Login_username == null || Login.Login_username.length() <= 0) { // L: 289
			if (PacketWriter.clientPreferences.method2545() != null) { // L: 290
				Login.Login_username = PacketWriter.clientPreferences.method2545(); // L: 291
				Client.Login_isUsernameRemembered = true; // L: 292
			} else {
				Client.Login_isUsernameRemembered = false; // L: 294
			}

		}
	} // L: 295

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(FFFFLda;I)V",
		garbageValue = "2116224706"
	)
	static void method1909(float var0, float var1, float var2, float var3, class125 var4) {
		float var5 = var1 - var0; // L: 342
		float var6 = var2 - var1; // L: 343
		float var7 = var3 - var2; // L: 344
		float var8 = var6 - var5; // L: 345
		var4.field1535 = var7 - var6 - var8; // L: 346
		var4.field1534 = var8 + var8 + var8; // L: 347
		var4.field1537 = var5 + var5 + var5; // L: 348
		var4.field1532 = var0; // L: 349
	} // L: 350

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1439216327"
	)
	static final void method1903() {
		Decimator.method1115("Your friend list is full. Max of 200 for free users, and 400 for members"); // L: 120
	} // L: 121

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZB)I",
		garbageValue = "-53"
	)
	static int method1855(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) { // L: 4166
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Message.getWindowedMode(); // L: 4167
			return 1; // L: 4168
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) { // L: 4170
				var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 4171
				if (var3 == 1 || var3 == 2) { // L: 4172
					class160.setWindowedMode(var3);
				}

				return 1; // L: 4173
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) { // L: 4175
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = PacketWriter.clientPreferences.method2505(); // L: 4176
				return 1; // L: 4177
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) { // L: 4179
				if (var0 == 5310) { // L: 4186
					--class302.Interpreter_intStackSize; // L: 4187
					return 1; // L: 4188
				} else {
					return 2; // L: 4190
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 4180
				if (var3 == 1 || var3 == 2) { // L: 4181
					PacketWriter.clientPreferences.method2504(var3); // L: 4182
				}

				return 1; // L: 4184
			}
		}
	}
}
