import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ba")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("l")
	@Export("Tiles_saturation")
	static int[] Tiles_saturation;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 334169297
	)
	int field814;

	@ObfuscatedSignature(
		descriptor = "(Lqu;)V"
	)
	FriendSystem(LoginType var1) {
		this.field814 = 0; // L: 23
		this.loginType = var1;
		this.friendsList = new FriendsList(var1);
		this.ignoreList = new IgnoreList(var1); // L: 28
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1547874236"
	)
	boolean method1818() {
		return this.field814 == 2; // L: 32
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2081175355"
	)
	final void method1842() {
		this.field814 = 1; // L: 36
	} // L: 37

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqr;II)V",
		garbageValue = "-1301657243"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2); // L: 40
		this.field814 = 2; // L: 41

		for (int var3 = 0; var3 < Players.Players_count; ++var3) { // L: 43
			Player var4 = Client.players[Players.Players_indices[var3]]; // L: 44
			var4.clearIsFriend(); // L: 45
		}

		Iterator var5 = Messages.Messages_hashTable.iterator(); // L: 48

		while (var5.hasNext()) {
			Message var6 = (Message)var5.next(); // L: 49
			var6.clearIsFromFriend(); // L: 51
		}

		if (MenuAction.friendsChatManager != null) { // L: 55
			MenuAction.friendsChatManager.clearFriends(); // L: 56
		}

	} // L: 59

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) {
			if ((long)var1.field4477 < UserComparator8.method2748() / 1000L - 5L) {
				if (var1.world > 0) {
					MouseHandler.addGameMessage(5, "", var1.username + " has logged in.");
				}

				if (var1.world == 0) { // L: 65
					MouseHandler.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove();
			}
		}

	} // L: 69

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-47"
	)
	@Export("clear")
	final void clear() {
		this.field814 = 0;
		this.friendsList.clear(); // L: 73
		this.ignoreList.clear();
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lrg;ZI)Z",
		garbageValue = "181698123"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) {
			return false;
		} else if (var1.equals(class296.localPlayer.username)) { // L: 79
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2);
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lrg;I)Z",
		garbageValue = "271722372"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) { // L: 85
			return false;
		} else {
			return this.ignoreList.contains(var1);
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)V",
		garbageValue = "-27197"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) { // L: 91
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) { // L: 93
				if (this.friendsListIsFull()) {
					UserComparator4.method2732();
				} else if (class296.localPlayer.username.equals(var2)) { // L: 98
					class11.method101("You can't add yourself to your own friend list"); // L: 100
				} else if (this.isFriended(var2, false)) { // L: 104
					UserComparator4.method2739(var1); // L: 105
				} else if (this.isIgnored(var2)) { // L: 108
					MusicPatchNode2.method5441(var1); // L: 109
				} else {
					SoundSystem.method859(var1); // L: 112
				}
			}
		}
	} // L: 102 106 110 113

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "8"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field778 != 1; // L: 140
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "2035906343"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) { // L: 147
			Username var2 = new Username(var1, this.loginType); // L: 148
			if (var2.hasCleanName()) { // L: 149
				if (this.canAddIgnore()) { // L: 150
					class11.method101("Your ignore list is full. Max of 100 for free users, and 400 for members"); // L: 152
				} else if (class296.localPlayer.username.equals(var2)) { // L: 156
					class11.method101("You can't add yourself to your own ignore list"); // L: 158
				} else if (this.isIgnored(var2)) { // L: 162
					DefaultsGroup.method7565(var1); // L: 163
				} else if (this.isFriended(var2, false)) { // L: 166
					LoginScreenAnimation.method2350(var1); // L: 167
				} else {
					PacketBufferNode var3 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3085, Client.packetWriter.isaacCipher); // L: 172
					var3.packetBuffer.writeByte(Actor.stringCp1252NullTerminatedByteSize(var1)); // L: 173
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 174
					Client.packetWriter.addNode(var3); // L: 175
				}
			}
		}
	} // L: 154 160 164 168 177

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "319936245"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field778 != 1; // L: 188
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1370133803"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) { // L: 195
			Username var2 = new Username(var1, this.loginType); // L: 196
			if (var2.hasCleanName()) { // L: 197
				if (this.friendsList.removeByUsername(var2)) { // L: 198
					Client.field701 = Client.cycleCntr; // L: 200
					PacketBufferNode var3 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3086, Client.packetWriter.isaacCipher); // L: 203
					var3.packetBuffer.writeByte(Actor.stringCp1252NullTerminatedByteSize(var1)); // L: 204
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 205
					Client.packetWriter.addNode(var3); // L: 206
				}

				for (int var5 = 0; var5 < Players.Players_count; ++var5) { // L: 209
					Player var4 = Client.players[Players.Players_indices[var5]]; // L: 210
					var4.clearIsFriend(); // L: 211
				}

				Iterator var6 = Messages.Messages_hashTable.iterator(); // L: 214

				while (var6.hasNext()) {
					Message var7 = (Message)var6.next(); // L: 215
					var7.clearIsFromFriend(); // L: 217
				}

				if (MenuAction.friendsChatManager != null) { // L: 221
					MenuAction.friendsChatManager.clearFriends();
				}

			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1582566104"
	)
	@Export("removeIgnore")
	final void removeIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType); // L: 229
			if (var2.hasCleanName()) { // L: 230
				if (this.ignoreList.removeByUsername(var2)) { // L: 231
					Client.field701 = Client.cycleCntr; // L: 233
					PacketBufferNode var3 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3059, Client.packetWriter.isaacCipher); // L: 236
					var3.packetBuffer.writeByte(Actor.stringCp1252NullTerminatedByteSize(var1)); // L: 237
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 238
					Client.packetWriter.addNode(var3); // L: 239
				}

				FontName.FriendSystem_invalidateIgnoreds(); // L: 241
			}
		}
	} // L: 242

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lrg;I)Z",
		garbageValue = "410030854"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1); // L: 254
		return var2 != null && var2.hasWorld(); // L: 255
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(S)Loy;",
		garbageValue = "-15572"
	)
	public static class406 method1847() {
		synchronized(class406.field4561) { // L: 26
			if (class406.field4560 == 0) { // L: 27
				return new class406();
			} else {
				class406.field4561[--class406.field4560].method7633(); // L: 29
				return class406.field4561[class406.field4560]; // L: 30
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Llx;II)V",
		garbageValue = "154671982"
	)
	static void method1825(Archive var0, int var1) {
		if (var0.field4140) { // L: 62
			if (var1 <= NetCache.field4174) { // L: 63
				throw new RuntimeException(""); // L: 64
			}

			if (var1 < NetCache.field4179) { // L: 66
				NetCache.field4179 = var1; // L: 67
			}
		} else {
			if (var1 >= NetCache.field4179) { // L: 71
				throw new RuntimeException(""); // L: 72
			}

			if (var1 > NetCache.field4174) { // L: 74
				NetCache.field4174 = var1; // L: 75
			}
		}

		if (Messages.field1361 != null) { // L: 78
			Messages.field1361.offset = var1 * 8 + 5; // L: 80
			if (Messages.field1361.offset >= Messages.field1361.array.length) { // L: 81
				if (!var0.field4140) { // L: 82
					throw new RuntimeException(""); // L: 86
				}

				var0.method6306(); // L: 83
			} else {
				int var2 = Messages.field1361.readInt(); // L: 88
				int var3 = Messages.field1361.readInt(); // L: 89
				var0.loadIndex(var2, var3); // L: 90
			}

		} else {
			class158.requestNetFile((Archive)null, 255, 255, 0, (byte)0, true); // L: 94
			NetCache.NetCache_archives[var1] = var0; // L: 95
		}
	} // L: 92 96

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)[Lcb;",
		garbageValue = "-1372063677"
	)
	static AttackOption[] method1778() {
		return new AttackOption[]{AttackOption.field1285, AttackOption.field1289, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_alwaysRightClick, AttackOption.AttackOption_hidden}; // L: 12853
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-564682770"
	)
	public static void method1845() {
		try {
			JagexCache.JagexCache_dat2File.close(); // L: 222

			for (int var0 = 0; var0 < JagexCache.idxCount; ++var0) { // L: 223
				JagexCache.JagexCache_idxFiles[var0].close();
			}

			JagexCache.JagexCache_idx255File.close(); // L: 224
			JagexCache.JagexCache_randomDat.close(); // L: 225
		} catch (Exception var2) { // L: 227
		}

	} // L: 228
}
