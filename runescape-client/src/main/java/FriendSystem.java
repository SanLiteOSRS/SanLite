import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bh")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("id")
	@ObfuscatedGetter(
		intValue = 1091220247
	)
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lli;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1019813463
	)
	int field928;

	@ObfuscatedSignature(
		descriptor = "(Lnb;)V"
	)
	FriendSystem(LoginType var1) {
		this.field928 = 0;
		this.loginType = var1;
		this.friendsList = new FriendsList(var1);
		this.ignoreList = new IgnoreList(var1);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	boolean method1804() {
		return this.field928 == 2;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-26603"
	)
	final void method1817() {
		this.field928 = 1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnt;II)V",
		garbageValue = "-1640361249"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2);
		this.field928 = 2;

		for (int var3 = 0; var3 < Players.Players_count; ++var3) {
			Player var4 = Client.players[Players.Players_indices[var3]];
			var4.clearIsFriend();
		}

		FileSystem.method2647();
		if (class289.friendsChatManager != null) {
			class289.friendsChatManager.clearFriends();
		}

	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1325813770"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) {
			if ((long)var1.field3829 < ClientPacket.currentTimeMillis() / 1000L - 5L) {
				if (var1.world > 0) {
					UserComparator10.addGameMessage(5, "", var1.username + " has logged in.");
				}

				if (var1.world == 0) {
					UserComparator10.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove();
			}
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "120"
	)
	@Export("clear")
	final void clear() {
		this.field928 = 0;
		this.friendsList.clear();
		this.ignoreList.clear();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Llc;ZI)Z",
		garbageValue = "2140108913"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) {
			return false;
		} else if (var1.equals(class262.localPlayer.username)) {
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2);
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Llc;I)Z",
		garbageValue = "668891946"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) {
			return false;
		} else {
			return this.ignoreList.contains(var1);
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-935678134"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsListIsFull()) {
					GrandExchangeEvent.method5223();
				} else if (class262.localPlayer.username.equals(var2)) {
					FloorOverlayDefinition.method3168();
				} else if (this.isFriended(var2, false)) {
					MusicPatchNode2.method4537(var1);
				} else if (this.isIgnored(var2)) {
					DirectByteArrayCopier.method4955(var1);
				} else {
					class375.method6530(var1);
				}
			}
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-69"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field740 != 1;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "0"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				Object var10000;
				String var3;
				if (this.canAddIgnore()) {
					var10000 = null;
					var3 = "Your ignore list is full. Max of 100 for free users, and 400 for members";
					UserComparator10.addGameMessage(30, "", var3);
				} else if (class262.localPlayer.username.equals(var2)) {
					var10000 = null;
					var3 = "You can't add yourself to your own ignore list";
					UserComparator10.addGameMessage(30, "", var3);
				} else if (this.isIgnored(var2)) {
					class314.method5693(var1);
				} else if (this.isFriended(var2, false)) {
					ClanSettings.method201(var1);
				} else {
					TextureProvider.method4291(var1);
				}
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "6"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field740 != 1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-120"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsList.removeByUsername(var2)) {
					Coord.method4801();
					PacketBufferNode var3 = InterfaceParent.getPacketBufferNode(ClientPacket.field2612, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(class44.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}

				for (int var5 = 0; var5 < Players.Players_count; ++var5) {
					Player var4 = Client.players[Players.Players_indices[var5]];
					var4.clearIsFriend();
				}

				FileSystem.method2647();
				if (class289.friendsChatManager != null) {
					class289.friendsChatManager.clearFriends();
				}

			}
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "79"
	)
	@Export("removeIgnore")
	final void removeIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.ignoreList.removeByUsername(var2)) {
					Coord.method4801();
					PacketBufferNode var3 = InterfaceParent.getPacketBufferNode(ClientPacket.field2587, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(class44.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}

				World.FriendSystem_invalidateIgnoreds();
			}
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Llc;I)Z",
		garbageValue = "1657999347"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1);
		return var2 != null && var2.hasWorld();
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(Lcr;I)V",
		garbageValue = "702642598"
	)
	static final void method1875(PendingSpawn var0) {
		long var1 = 0L;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;
		if (var0.type == 0) {
			var1 = DevicePcmPlayerProvider.scene.getBoundaryObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 1) {
			var1 = DevicePcmPlayerProvider.scene.getWallDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 2) {
			var1 = DevicePcmPlayerProvider.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 3) {
			var1 = DevicePcmPlayerProvider.scene.getFloorDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (var1 != 0L) {
			int var6 = DevicePcmPlayerProvider.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1);
			var3 = Message.Entity_unpackID(var1);
			var4 = var6 & 31;
			var5 = var6 >> 6 & 3;
		}

		var0.objectId = var3;
		var0.field1210 = var4;
		var0.field1209 = var5;
	}

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Lci;",
		garbageValue = "-81"
	)
	static final InterfaceParent method1867(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent();
		var3.group = var1;
		var3.type = var2;
		Client.interfaceParents.put(var3, (long)var0);
		TextureProvider.Widget_resetModelFrames(var1);
		Widget var4 = WorldMapData_1.getWidget(var0);
		Script.invalidateWidget(var4);
		if (Client.meslayerContinueWidget != null) {
			Script.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		WorldMapScaleHandler.method3856();
		WorldMapLabelSize.revalidateWidgetScroll(GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var0 >> 16], var4, false);
		ScriptFrame.runWidgetOnLoadListener(var1);
		if (Client.rootInterface != -1) {
			class8.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3;
	}
}
