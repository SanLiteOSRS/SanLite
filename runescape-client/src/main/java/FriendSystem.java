import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bl")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Lhu;"
	)
	static Widget field905;
	@ObfuscatedName("oc")
	@ObfuscatedSignature(
		signature = "Lnh;"
	)
	static class368 field910;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Lmf;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Llx;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "Llu;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1378545391
	)
	@Export("loadingProgress")
	int loadingProgress;

	@ObfuscatedSignature(
		signature = "(Lmf;)V"
	)
	FriendSystem(LoginType var1) {
		this.loadingProgress = 0;
		this.loginType = var1;
		this.friendsList = new FriendsList(var1);
		this.ignoreList = new IgnoreList(var1);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(B)Z",
		garbageValue = "0"
	)
	boolean method1719() {
		return this.loadingProgress == 2;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "13"
	)
	final void method1720() {
		this.loadingProgress = 1;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(Lnu;II)V",
		garbageValue = "474808595"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2);
		this.loadingProgress = 2;

		for (int var3 = 0; var3 < Players.Players_count; ++var3) {
			Player var4 = Client.players[Players.Players_indices[var3]];
			var4.clearIsFriend();
		}

		GameEngine.method682();
		if (InterfaceParent.clanChat != null) {
			InterfaceParent.clanChat.clearFriends();
		}

	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1118155085"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) {
			if ((long)var1.field3833 < ObjectSound.currentTimeMillis() / 1000L - 5L) {
				if (var1.world > 0) {
					class69.addGameMessage(5, "", var1.username + " has logged in.");
				}

				if (var1.world == 0) {
					class69.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove();
			}
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "61"
	)
	@Export("clear")
	final void clear() {
		this.loadingProgress = 0;
		this.friendsList.clear();
		this.ignoreList.clear();
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(Llw;ZI)Z",
		garbageValue = "-302791861"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) {
			return false;
		} else if (var1.equals(Varcs.localPlayer.username)) {
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2);
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(Llw;I)Z",
		garbageValue = "2086987830"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) {
			return false;
		} else {
			return this.ignoreList.contains(var1);
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I)V",
		garbageValue = "91342792"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsListIsFull()) {
					class124.method2488();
				} else if (Varcs.localPlayer.username.equals(var2)) {
					Object var10000 = null;
					String var4 = "You can't add yourself to your own friend list";
					class69.addGameMessage(30, "", var4);
				} else if (this.isFriended(var2, false)) {
					class147.method3014(var1);
				} else if (this.isIgnored(var2)) {
					Projectile.method1981(var1);
				} else {
					PacketBufferNode var3 = ObjectComposition.getPacketBufferNode(ClientPacket.field2313, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(Friend.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "2112164938"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field720 != 1;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;B)V",
		garbageValue = "-9"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.canAddIgnore()) {
					class157.method3113();
				} else if (Varcs.localPlayer.username.equals(var2)) {
					class35.method435();
				} else if (this.isIgnored(var2)) {
					HealthBarUpdate.method2180(var1);
				} else if (this.isFriended(var2, false)) {
					class11.method205(var1);
				} else {
					PacketBufferNode var3 = ObjectComposition.getPacketBufferNode(ClientPacket.field2301, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(Friend.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}
			}
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(B)Z",
		garbageValue = "57"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field720 != 1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;B)V",
		garbageValue = "45"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsList.removeByUsername(var2)) {
					MouseHandler.method707();
					PacketBufferNode var3 = ObjectComposition.getPacketBufferNode(ClientPacket.field2249, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(Friend.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}

				for (int var5 = 0; var5 < Players.Players_count; ++var5) {
					Player var4 = Client.players[Players.Players_indices[var5]];
					var4.clearIsFriend();
				}

				GameEngine.method682();
				if (InterfaceParent.clanChat != null) {
					InterfaceParent.clanChat.clearFriends();
				}

			}
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I)V",
		garbageValue = "-784998952"
	)
	@Export("removeIgnore")
	final void removeIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.ignoreList.removeByUsername(var2)) {
					MouseHandler.method707();
					PacketBufferNode var3 = ObjectComposition.getPacketBufferNode(ClientPacket.field2300, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(Friend.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}

				class1.FriendSystem_invalidateIgnoreds();
			}
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(Llw;I)Z",
		garbageValue = "-448496053"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1);
		return var2 != null && var2.hasWorld();
	}

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		signature = "(Lcs;ZI)V",
		garbageValue = "1735869199"
	)
	@Export("addPlayerToScene")
	static void addPlayerToScene(Player var0, boolean var1) {
		if (var0 != null && var0.isVisible() && !var0.isHidden) {
			var0.isUnanimated = false;
			if ((Client.isLowDetail && Players.Players_count > 50 || Players.Players_count > 200) && var1 && var0.readySequence == var0.movementSequence) {
				var0.isUnanimated = true;
			}

			int var2 = var0.x >> 7;
			int var3 = var0.y >> 7;
			if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
				long var4 = AttackOption.calculateTag(0, 0, 0, false, var0.index);
				if (var0.model0 != null && Client.cycle >= var0.animationCycleStart && Client.cycle < var0.animationCycleEnd) {
					var0.isUnanimated = false;
					var0.tileHeight = UserComparator7.getTileHeight(var0.x, var0.y, class26.Client_plane);
					var0.playerCycle = Client.cycle;
					WorldMapArea.scene.addNullableObject(class26.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.field1187, var0.field1179, var0.field1180, var0.field1176);
				} else {
					if ((var0.x & 127) == 64 && (var0.y & 127) == 64) {
						if (Client.tileLastDrawnActor[var2][var3] == Client.viewportDrawCount) {
							return;
						}

						Client.tileLastDrawnActor[var2][var3] = Client.viewportDrawCount;
					}

					var0.tileHeight = UserComparator7.getTileHeight(var0.x, var0.y, class26.Client_plane);
					var0.playerCycle = Client.cycle;
					WorldMapArea.scene.drawEntity(class26.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.isWalking);
				}
			}
		}

	}
}
