import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cp")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "Lml;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "Lkm;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "Lkp;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1793991825
	)
	@Export("loadingProgress")
	int loadingProgress;

	@ObfuscatedSignature(
		signature = "(Lml;)V"
	)
	FriendSystem(LoginType var1) {
		this.loadingProgress = 0;
		this.loginType = var1;
		this.friendsList = new FriendsList(var1);
		this.ignoreList = new IgnoreList(var1);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		garbageValue = "1945346484",
		signature = "(I)Z"
	)
	boolean method1974() {
		return this.loadingProgress == 2;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "-2084368484",
		signature = "(I)V"
	)
	final void method1975() {
		this.loadingProgress = 1;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		garbageValue = "-1050410631",
		signature = "(Lkx;II)V"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2);
		this.loadingProgress = 2;
		class105.FriendSystem_invalidateFriends();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		garbageValue = "-1241092725",
		signature = "(I)V"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) {
			if ((long)var1.field3676 < Tiles.currentTimeMillis() / 1000L - 5L) {
				if (var1.world > 0) {
					AbstractWorldMapData.addGameMessage(5, "", var1.username + " has logged in.");
				}

				if (var1.world == 0) {
					AbstractWorldMapData.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove();
			}
		}

	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		garbageValue = "7",
		signature = "(B)V"
	)
	@Export("clear")
	final void clear() {
		this.loadingProgress = 0;
		this.friendsList.clear();
		this.ignoreList.clear();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "44",
		signature = "(Lkk;ZB)Z"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) {
			return false;
		} else if (var1.equals(UserComparator9.localPlayer.username)) {
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2);
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		garbageValue = "-645506648",
		signature = "(Lkk;I)Z"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) {
			return false;
		} else {
			return this.ignoreList.contains(var1);
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		garbageValue = "54",
		signature = "(Ljava/lang/String;B)V"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsListIsFull()) {
					class300.method5473("Your friend list is full. Max of 200 for free users, and 400 for members");
				} else if (UserComparator9.localPlayer.username.equals(var2)) {
					class300.method5473("You can't add yourself to your own friend list");
				} else if (this.isFriended(var2, false)) {
					class300.method5473(var1 + " is already on your friend list");
				} else if (this.isIgnored(var2)) {
					class300.method5473("Please remove " + var1 + " from your ignore list first");
				} else {
					PacketBufferNode var3 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2302, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(WorldMapLabelSize.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		garbageValue = "23277245",
		signature = "(I)Z"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field673 != 1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		garbageValue = "-821036710",
		signature = "(Ljava/lang/String;I)V"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.canAddIgnore()) {
					WorldMapAreaData.method781();
				} else if (UserComparator9.localPlayer.username.equals(var2)) {
					NetSocket.method3748();
				} else if (this.isIgnored(var2)) {
					class300.method5473(var1 + " is already on your ignore list");
				} else if (this.isFriended(var2, false)) {
					Tiles.method1209(var1);
				} else {
					PacketBufferNode var3 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2321, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(WorldMapLabelSize.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}
			}
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		garbageValue = "-319380471",
		signature = "(I)Z"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field673 != 1;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		garbageValue = "14",
		signature = "(Ljava/lang/String;B)V"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsList.removeByUsername(var2)) {
					Client.field857 = Client.cycleCntr;
					PacketBufferNode var3 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2237, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(WorldMapLabelSize.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}

				class105.FriendSystem_invalidateFriends();
			}
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		garbageValue = "-1962434605",
		signature = "(Ljava/lang/String;I)V"
	)
	@Export("removeIgnore")
	final void removeIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.ignoreList.removeByUsername(var2)) {
					Client.field857 = Client.cycleCntr;
					PacketBufferNode var3 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2329, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(WorldMapLabelSize.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}

				class51.FriendSystem_invalidateIgnoreds();
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		garbageValue = "-914482688",
		signature = "(Lkk;I)Z"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1);
		return var2 != null && var2.hasWorld();
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		garbageValue = "1",
		signature = "(Lhz;IIB)V"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) {
			if (var0 != null) {
				Widget var4 = Strings.method4325(var0);
				if (var4 == null) {
					var4 = var0.parent;
				}

				if (var4 != null) {
					Client.clickedWidget = var0;
					var4 = Strings.method4325(var0);
					if (var4 == null) {
						var4 = var0.parent;
					}

					Client.clickedWidgetParent = var4;
					Client.widgetClickX = var1;
					Client.widgetClickY = var2;
					PlayerComposition.widgetDragDuration = 0;
					Client.isDraggingWidget = false;
					int var6 = Client.menuOptionsCount - 1;
					if (var6 != -1) {
						class195.tempMenuAction = new MenuAction();
						class195.tempMenuAction.param0 = Client.menuArguments1[var6];
						class195.tempMenuAction.param1 = Client.menuArguments2[var6];
						class195.tempMenuAction.opcode = Client.menuOpcodes[var6];
						class195.tempMenuAction.identifier = Client.menuIdentifiers[var6];
						class195.tempMenuAction.action = Client.menuActions[var6];
					}

					return;
				}
			}

		}
	}
}
