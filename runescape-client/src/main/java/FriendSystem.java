import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cr")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("wn")
	@ObfuscatedSignature(
		descriptor = "Lsa;"
	)
	static PlatformInfo field823;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lrs;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lqb;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -23968915
	)
	int field828;

	@ObfuscatedSignature(
		descriptor = "(Lth;)V"
	)
	FriendSystem(LoginType var1) {
		this.field828 = 0; // L: 23
		this.loginType = var1; // L: 26
		this.friendsList = new FriendsList(var1); // L: 27
		this.ignoreList = new IgnoreList(var1); // L: 28
	} // L: 29

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-58"
	)
	boolean method1900() {
		return this.field828 == 2; // L: 32
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2127783427"
	)
	final void method1901() {
		this.field828 = 1; // L: 36
	} // L: 37

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Luk;II)V",
		garbageValue = "-613423136"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2); // L: 40
		this.field828 = 2; // L: 41
		Occluder.method5589(); // L: 42
	} // L: 43

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "659623582"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) { // L: 46
			if ((long)var1.field4723 < UserComparator9.method2973() / 1000L - 5L) { // L: 47
				if (var1.world > 0) {
					GrandExchangeEvents.addGameMessage(5, "", var1.username + " has logged in."); // L: 48
				}

				if (var1.world == 0) { // L: 49
					GrandExchangeEvents.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove(); // L: 50
			}
		}

	} // L: 53

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1771897068"
	)
	@Export("clear")
	final void clear() {
		this.field828 = 0; // L: 56
		this.friendsList.clear(); // L: 57
		this.ignoreList.clear(); // L: 58
	} // L: 59

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lvs;ZI)Z",
		garbageValue = "1674739073"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) { // L: 62
			return false;
		} else if (var1.equals(class25.localPlayer.username)) { // L: 63
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2); // L: 64
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lvs;I)Z",
		garbageValue = "2027984135"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) { // L: 69
			return false;
		} else {
			return this.ignoreList.contains(var1); // L: 70
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1415095436"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) { // L: 75
			Username var2 = new Username(var1, this.loginType); // L: 76
			if (var2.hasCleanName()) { // L: 77
				if (this.friendsListIsFull()) { // L: 78
					Canvas.method334("Your friend list is full. Max of 200 for free users, and 400 for members"); // L: 80
				} else if (class25.localPlayer.username.equals(var2)) { // L: 84
					class25.method366(); // L: 85
				} else if (this.isFriended(var2, false)) { // L: 88
					Canvas.method334(var1 + " is already on your friend list"); // L: 90
				} else if (this.isIgnored(var2)) { // L: 94
					Canvas.method333(var1); // L: 95
				} else {
					PacketBufferNode var3 = class482.getPacketBufferNode(ClientPacket.field3210, Client.packetWriter.isaacCipher); // L: 100
					var3.packetBuffer.writeByte(CollisionMap.stringCp1252NullTerminatedByteSize(var1)); // L: 101
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 102
					Client.packetWriter.addNode(var3); // L: 103
				}
			}
		}
	} // L: 82 86 92 96 105

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "728677755"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field518 != 1; // L: 120
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-76"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) { // L: 127
			Username var2 = new Username(var1, this.loginType); // L: 128
			if (var2.hasCleanName()) { // L: 129
				if (this.canAddIgnore()) { // L: 130
					Canvas.method334("Your ignore list is full. Max of 100 for free users, and 400 for members"); // L: 132
				} else if (class25.localPlayer.username.equals(var2)) {
					Canvas.method334("You can't add yourself to your own ignore list");
				} else if (this.isIgnored(var2)) {
					Projectile.method2221(var1);
				} else if (this.isFriended(var2, false)) {
					class467.method8636(var1); // L: 147
				} else {
					PacketBufferNode var3 = class482.getPacketBufferNode(ClientPacket.field3201, Client.packetWriter.isaacCipher); // L: 152
					var3.packetBuffer.writeByte(CollisionMap.stringCp1252NullTerminatedByteSize(var1)); // L: 153
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 154
					Client.packetWriter.addNode(var3); // L: 155
				}
			}
		}
	} // L: 134 148 157

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-367407536"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field518 != 1; // L: 171
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1920078386"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) { // L: 178
			Username var2 = new Username(var1, this.loginType); // L: 179
			if (var2.hasCleanName()) { // L: 180
				if (this.friendsList.removeByUsername(var2)) { // L: 181
					class13.method176(); // L: 182
					PacketBufferNode var3 = class482.getPacketBufferNode(ClientPacket.field3241, Client.packetWriter.isaacCipher); // L: 184
					var3.packetBuffer.writeByte(CollisionMap.stringCp1252NullTerminatedByteSize(var1)); // L: 185
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 186
					Client.packetWriter.addNode(var3); // L: 187
				}

				for (int var5 = 0; var5 < Players.Players_count; ++var5) { // L: 190
					Player var4 = Client.players[Players.Players_indices[var5]]; // L: 191
					var4.clearIsFriend(); // L: 192
				}

				class113.method2916(); // L: 194
				if (ClientPreferences.friendsChatManager != null) { // L: 195
					ClientPreferences.friendsChatManager.clearFriends(); // L: 196
				}

			}
		}
	} // L: 199

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "-1543576051"
	)
	public final void method1968(String var1, boolean var2) {
		if (var1 != null) { // L: 202
			Username var3 = new Username(var1, this.loginType); // L: 203
			if (var3.hasCleanName()) { // L: 204
				if (this.ignoreList.removeByUsername(var3)) { // L: 205
					class13.method176(); // L: 206
					if (var2) { // L: 207
						PacketBufferNode var4 = class482.getPacketBufferNode(ClientPacket.field3187, Client.packetWriter.isaacCipher); // L: 209
						var4.packetBuffer.writeByte(CollisionMap.stringCp1252NullTerminatedByteSize(var1)); // L: 210
						var4.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 211
						Client.packetWriter.addNode(var4); // L: 212
					}
				}

				Varps.FriendSystem_invalidateIgnoreds(); // L: 215
			}
		}
	} // L: 216

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lvs;I)Z",
		garbageValue = "667447544"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1); // L: 228
		return var2 != null && var2.hasWorld(); // L: 229
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1017893005"
	)
	public static void method1927(int var0, int var1, int var2, int var3) {
		if (class319.field3459.size() > 1 && class319.field3459.get(0) != null && ((class331)class319.field3459.get(0)).field3582.isReady() && class319.field3459.get(1) != null && ((class331)class319.field3459.get(1)).field3582.isReady()) { // L: 136
			WorldMapRectangle.method5019(var0, var1, var2, var3); // L: 137
			class319.field3462.add(new class416((class422)null)); // L: 138
			ArrayList var4 = new ArrayList(); // L: 139
			var4.add(new class418(new class421((class422)null, 1, false, class319.field3454), class319.field3465)); // L: 140
			var4.add(new class418(new class420((class422)null, 0, false, class319.field3464), class319.field3460)); // L: 141
			class319.field3462.add(new class423((class422)null, var4)); // L: 142
			if (class319.field3466.get(0) != null && class319.field3466.get(1) != null) { // L: 143
				class331 var5 = (class331)class319.field3466.get(0); // L: 144
				class319.field3466.set(0, class319.field3459.get(1)); // L: 145
				class319.field3466.set(1, var5); // L: 146
			}
		}

	} // L: 149

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1553854475"
	)
	@Export("worldToScreen")
	static final void worldToScreen(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) { // L: 5737
			int var3 = class19.getTileHeight(var0, var1, class113.Client_plane) - var2; // L: 5742
			var0 -= GameEngine.cameraX; // L: 5743
			var3 -= KeyHandler.cameraY; // L: 5744
			var1 -= GrandExchangeOfferTotalQuantityComparator.cameraZ; // L: 5745
			int var4 = Rasterizer3D.Rasterizer3D_sine[UserComparator3.cameraPitch]; // L: 5746
			int var5 = Rasterizer3D.Rasterizer3D_cosine[UserComparator3.cameraPitch]; // L: 5747
			int var6 = Rasterizer3D.Rasterizer3D_sine[HealthBarUpdate.cameraYaw]; // L: 5748
			int var7 = Rasterizer3D.Rasterizer3D_cosine[HealthBarUpdate.cameraYaw]; // L: 5749
			int var8 = var6 * var1 + var0 * var7 >> 16; // L: 5750
			var1 = var7 * var1 - var0 * var6 >> 16; // L: 5751
			var0 = var8; // L: 5752
			var8 = var5 * var3 - var4 * var1 >> 16; // L: 5753
			var1 = var5 * var1 + var3 * var4 >> 16; // L: 5754
			if (var1 >= 50) { // L: 5756
				Client.viewportTempX = var0 * Client.viewportZoom / var1 + Client.viewportWidth / 2; // L: 5757
				Client.viewportTempY = Client.viewportHeight / 2 + var8 * Client.viewportZoom / var1; // L: 5758
			} else {
				Client.viewportTempX = -1; // L: 5761
				Client.viewportTempY = -1; // L: 5762
			}

		} else {
			Client.viewportTempX = -1; // L: 5738
			Client.viewportTempY = -1; // L: 5739
		}
	} // L: 5740 5764
}
