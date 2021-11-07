import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bm")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -991444483
	)
	int field765;

	@ObfuscatedSignature(
		descriptor = "(Lni;)V"
	)
	FriendSystem(LoginType var1) {
		this.field765 = 0;
		this.loginType = var1;
		this.friendsList = new FriendsList(var1);
		this.ignoreList = new IgnoreList(var1);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1885773213"
	)
	boolean method1757() {
		return this.field765 == 2;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1636767062"
	)
	final void method1746() {
		this.field765 = 1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lop;IB)V",
		garbageValue = "-3"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2);
		this.field765 = 2;
		UserComparator8.method2462();
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-41"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) {
			if ((long)var1.field3945 < class111.method2516() / 1000L - 5L) {
				if (var1.world > 0) {
					class397.addGameMessage(5, "", var1.username + " has logged in.");
				}

				if (var1.world == 0) {
					class397.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove();
			}
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-903439002"
	)
	@Export("clear")
	final void clear() {
		this.field765 = 0;
		this.friendsList.clear();
		this.ignoreList.clear();
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lpb;ZI)Z",
		garbageValue = "-1394062445"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) {
			return false;
		} else if (var1.equals(HealthBarDefinition.localPlayer.username)) {
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2);
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lpb;I)Z",
		garbageValue = "624915849"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) {
			return false;
		} else {
			return this.ignoreList.contains(var1);
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1752227266"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsListIsFull()) {
					class20.method294();
				} else {
					StringBuilder var10000;
					String var4;
					if (HealthBarDefinition.localPlayer.username.equals(var2)) {
						var10000 = null;
						var4 = "You can't add yourself to your own friend list";
						class397.addGameMessage(30, "", var4);
					} else if (this.isFriended(var2, false)) {
						var10000 = (new StringBuilder()).append(var1);
						Object var10001 = null;
						var4 = var10000.append(" is already on your friend list").toString();
						class397.addGameMessage(30, "", var4);
					} else if (this.isIgnored(var2)) {
						class279.method5217(var1);
					} else {
						PacketBufferNode var3 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2747, Client.packetWriter.isaacCipher);
						var3.packetBuffer.writeByte(Client.stringCp1252NullTerminatedByteSize(var1));
						var3.packetBuffer.writeStringCp1252NullTerminated(var1);
						Client.packetWriter.addNode(var3);
					}
				}
			}
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1476294097"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field588 != 1;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1282328040"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				StringBuilder var10000;
				String var3;
				if (this.canAddIgnore()) {
					var10000 = null;
					var3 = "Your ignore list is full. Max of 100 for free users, and 400 for members";
					class397.addGameMessage(30, "", var3);
				} else if (HealthBarDefinition.localPlayer.username.equals(var2)) {
					var10000 = null;
					var3 = "You can't add yourself to your own ignore list";
					class397.addGameMessage(30, "", var3);
				} else if (this.isIgnored(var2)) {
					var10000 = (new StringBuilder()).append(var1);
					Object var10001 = null;
					var3 = var10000.append(" is already on your ignore list").toString();
					class397.addGameMessage(30, "", var3);
				} else if (this.isFriended(var2, false)) {
					KeyHandler.method324(var1);
				} else {
					class9.method82(var1);
				}
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-31"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field588 != 1;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "11"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsList.removeByUsername(var2)) {
					VarcInt.method3033();
					PacketBufferNode var3 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2684, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(Client.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}

				for (int var5 = 0; var5 < Players.Players_count; ++var5) {
					Player var4 = Client.players[Players.Players_indices[var5]];
					var4.clearIsFriend();
				}

				Iterator var6 = Messages.Messages_hashTable.iterator();

				while (var6.hasNext()) {
					Message var7 = (Message)var6.next();
					var7.clearIsFromFriend();
				}

				if (AbstractArchive.friendsChatManager != null) {
					AbstractArchive.friendsChatManager.clearFriends();
				}

			}
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "42"
	)
	@Export("removeIgnore")
	final void removeIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.ignoreList.removeByUsername(var2)) {
					VarcInt.method3033();
					PacketBufferNode var3 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2700, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(Client.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}

				TextureProvider.FriendSystem_invalidateIgnoreds();
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lpb;I)Z",
		garbageValue = "1383012789"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1);
		return var2 != null && var2.hasWorld();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIIZIZB)V",
		garbageValue = "87"
	)
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) {
			int var6 = (var0 + var1) / 2;
			int var7 = var0;
			World var8 = WorldMapEvent.World_worlds[var6];
			WorldMapEvent.World_worlds[var6] = WorldMapEvent.World_worlds[var1];
			WorldMapEvent.World_worlds[var1] = var8;

			for (int var9 = var0; var9 < var1; ++var9) {
				World var11 = WorldMapEvent.World_worlds[var9];
				int var12 = WorldMapArchiveLoader.compareWorlds(var11, var8, var2, var3);
				int var10;
				if (var12 != 0) {
					if (var3) {
						var10 = -var12;
					} else {
						var10 = var12;
					}
				} else if (var4 == -1) {
					var10 = 0;
				} else {
					int var13 = WorldMapArchiveLoader.compareWorlds(var11, var8, var4, var5);
					if (var5) {
						var10 = -var13;
					} else {
						var10 = var13;
					}
				}

				if (var10 <= 0) {
					World var14 = WorldMapEvent.World_worlds[var9];
					WorldMapEvent.World_worlds[var9] = WorldMapEvent.World_worlds[var7];
					WorldMapEvent.World_worlds[var7++] = var14;
				}
			}

			WorldMapEvent.World_worlds[var1] = WorldMapEvent.World_worlds[var7];
			WorldMapEvent.World_worlds[var7] = var8;
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5);
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5);
		}

	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1917272702"
	)
	public static void method1755(boolean var0) {
		if (var0 != BuddyRankComparator.ItemDefinition_inMembersWorld) {
			CollisionMap.method3492();
			BuddyRankComparator.ItemDefinition_inMembersWorld = var0;
		}

	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-725135495"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		KeyHandler.method343();
		Client.menuActions[0] = "Cancel";
		Client.menuTargets[0] = "";
		Client.menuOpcodes[0] = 1006;
		Client.menuShiftClick[0] = false;
		Client.menuOptionsCount = 1;
	}
}
