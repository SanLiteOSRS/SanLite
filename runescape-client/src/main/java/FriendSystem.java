import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ck")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1563649439
	)
	int field835;

	@ObfuscatedSignature(
		descriptor = "(Lsj;)V"
	)
	FriendSystem(LoginType var1) {
		this.field835 = 0; // L: 23
		this.loginType = var1; // L: 26
		this.friendsList = new FriendsList(var1); // L: 27
		this.ignoreList = new IgnoreList(var1); // L: 28
	} // L: 29

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-151991990"
	)
	boolean method1803() {
		return this.field835 == 2; // L: 32
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "694283927"
	)
	final void method1804() {
		this.field835 = 1; // L: 36
	} // L: 37

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ltz;II)V",
		garbageValue = "1429504887"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2); // L: 40
		this.field835 = 2; // L: 41

		for (int var3 = 0; var3 < Players.Players_count; ++var3) { // L: 43
			Player var4 = Client.players[Players.Players_indices[var3]]; // L: 44
			var4.clearIsFriend(); // L: 45
		}

		Iterator var5 = Messages.Messages_hashTable.iterator(); // L: 48

		while (var5.hasNext()) {
			Message var6 = (Message)var5.next(); // L: 49
			var6.clearIsFromFriend(); // L: 51
		}

		if (class406.friendsChatManager != null) { // L: 55
			class406.friendsChatManager.clearFriends(); // L: 56
		}

	} // L: 59

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "116"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) { // L: 62
			if ((long)var1.field4591 < WallObject.method5027() / 1000L - 5L) { // L: 63
				if (var1.world > 0) {
					class59.addGameMessage(5, "", var1.username + " has logged in."); // L: 64
				}

				if (var1.world == 0) { // L: 65
					class59.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove(); // L: 66
			}
		}

	} // L: 69

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "42"
	)
	@Export("clear")
	final void clear() {
		this.field835 = 0; // L: 72
		this.friendsList.clear(); // L: 73
		this.ignoreList.clear(); // L: 74
	} // L: 75

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lun;ZS)Z",
		garbageValue = "-29781"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) { // L: 78
			return false;
		} else if (var1.equals(Projectile.localPlayer.username)) { // L: 79
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2); // L: 80
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lun;I)Z",
		garbageValue = "-777054287"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) { // L: 85
			return false;
		} else {
			return this.ignoreList.contains(var1); // L: 86
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1535555082"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) { // L: 91
			Username var2 = new Username(var1, this.loginType); // L: 92
			if (var2.hasCleanName()) { // L: 93
				if (this.friendsListIsFull()) { // L: 94
					class300.method5687(); // L: 95
				} else if (Projectile.localPlayer.username.equals(var2)) { // L: 98
					ItemComposition.method4018(); // L: 99
				} else if (this.isFriended(var2, false)) { // L: 102
					class127.method2957(var1); // L: 103
				} else if (this.isIgnored(var2)) { // L: 106
					class143.method3132(var1); // L: 107
				} else {
					PacketBufferNode var3 = ObjectComposition.getPacketBufferNode(ClientPacket.field3153, Client.packetWriter.isaacCipher); // L: 112
					var3.packetBuffer.writeByte(Widget.stringCp1252NullTerminatedByteSize(var1)); // L: 113
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 114
					Client.packetWriter.addNode(var3); // L: 115
				}
			}
		}
	} // L: 96 100 104 108 117

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "111948697"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field630 != 1; // L: 140
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)V",
		garbageValue = "16949"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) { // L: 147
			Username var2 = new Username(var1, this.loginType); // L: 148
			if (var2.hasCleanName()) { // L: 149
				if (this.canAddIgnore()) { // L: 150
					ParamComposition.method3837("Your ignore list is full. Max of 100 for free users, and 400 for members"); // L: 152
				} else if (Projectile.localPlayer.username.equals(var2)) { // L: 156
					ParamComposition.method3837("You can't add yourself to your own ignore list"); // L: 158
				} else if (this.isIgnored(var2)) { // L: 162
					ParamComposition.method3837(var1 + " is already on your ignore list"); // L: 164
				} else if (this.isFriended(var2, false)) { // L: 168
					ParamComposition.method3837("Please remove " + var1 + " from your friend list first"); // L: 170
				} else {
					class7.method51(var1); // L: 174
				}
			}
		}
	} // L: 154 160 166 172 175

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "65"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field630 != 1; // L: 186
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "0"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) { // L: 193
			Username var2 = new Username(var1, this.loginType); // L: 194
			if (var2.hasCleanName()) { // L: 195
				if (this.friendsList.removeByUsername(var2)) { // L: 196
					PacketBufferNode.method5665(); // L: 197
					PacketBufferNode var3 = ObjectComposition.getPacketBufferNode(ClientPacket.field3169, Client.packetWriter.isaacCipher); // L: 199
					var3.packetBuffer.writeByte(Widget.stringCp1252NullTerminatedByteSize(var1)); // L: 200
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 201
					Client.packetWriter.addNode(var3); // L: 202
				}

				for (int var5 = 0; var5 < Players.Players_count; ++var5) { // L: 205
					Player var4 = Client.players[Players.Players_indices[var5]]; // L: 206
					var4.clearIsFriend(); // L: 207
				}

				Iterator var6 = Messages.Messages_hashTable.iterator(); // L: 210

				while (var6.hasNext()) {
					Message var7 = (Message)var6.next(); // L: 211
					var7.clearIsFromFriend(); // L: 213
				}

				if (class406.friendsChatManager != null) { // L: 217
					class406.friendsChatManager.clearFriends(); // L: 218
				}

			}
		}
	} // L: 221

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "-1138743001"
	)
	public final void method1815(String var1, boolean var2) {
		if (var1 != null) { // L: 224
			Username var3 = new Username(var1, this.loginType);
			if (var3.hasCleanName()) {
				if (this.ignoreList.removeByUsername(var3)) {
					PacketBufferNode.method5665();
					if (var2) {
						PacketBufferNode var4 = ObjectComposition.getPacketBufferNode(ClientPacket.field3173, Client.packetWriter.isaacCipher);
						var4.packetBuffer.writeByte(Widget.stringCp1252NullTerminatedByteSize(var1)); // L: 232
						var4.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 233
						Client.packetWriter.addNode(var4); // L: 234
					}
				}

				Player.FriendSystem_invalidateIgnoreds(); // L: 237
			}
		}
	} // L: 238

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lun;B)Z",
		garbageValue = "41"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1); // L: 250
		return var2 != null && var2.hasWorld(); // L: 251
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lmb;",
		garbageValue = "-1490786494"
	)
	@Export("getWidget")
	public static Widget getWidget(int var0) {
		int var1 = var0 >> 16; // L: 225
		int var2 = var0 & 65535; // L: 226
		if (class16.Widget_interfaceComponents[var1] == null || class16.Widget_interfaceComponents[var1][var2] == null) { // L: 227
			boolean var3 = Client.loadInterface(var1); // L: 228
			if (!var3) { // L: 229
				return null;
			}
		}

		return class16.Widget_interfaceComponents[var1][var2]; // L: 231
	}

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "(IZZZZI)Lny;",
		garbageValue = "-2038793065"
	)
	@Export("newArchive")
	static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3, boolean var4) {
		ArchiveDisk var5 = null; // L: 2093
		if (JagexCache.JagexCache_dat2File != null) { // L: 2094
			var5 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, WorldMapSection0.JagexCache_idxFiles[var0], 1000000);
		}

		return new Archive(var5, ClanChannelMember.masterDisk, var0, var1, var2, var3, var4); // L: 2095
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1072800741"
	)
	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close(); // L: 2979
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear(); // L: 2982
		class490.method8764(); // L: 2984
		KitDefinition.KitDefinition_cached.clear(); // L: 2986
		ObjectComposition.ObjectDefinition_cached.clear(); // L: 2989
		ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 2990
		ObjectComposition.ObjectDefinition_cachedEntities.clear(); // L: 2991
		ObjectComposition.ObjectDefinition_cachedModels.clear(); // L: 2992
		class141.method3119(); // L: 2994
		ItemComposition.ItemComposition_cached.clear(); // L: 2996
		ItemComposition.ItemComposition_cachedModels.clear(); // L: 2997
		ItemComposition.ItemComposition_cachedSprites.clear(); // L: 2998
		VarcInt.method3617(); // L: 3000
		AbstractWorldMapIcon.method5525(); // L: 3001
		SecureRandomCallable.method2210(); // L: 3002
		class143.method3134(); // L: 3003
		GraphicsObject.HitSplatDefinition_cachedSprites.method8721(); // L: 3004
		HealthBar.Ignored_cached.method8721(); // L: 3005
		class291.method5661(); // L: 3006
		VarpDefinition.method3584(); // L: 3007
		class168.method3398(); // L: 3008
		ParamComposition.ParamComposition_cached.clear(); // L: 3010
		WorldMapElement.WorldMapElement_cachedSprites.clear(); // L: 3013
		class90.method2280(); // L: 3015
		SecureRandomCallable.method2215(); // L: 3016
		Client.Widget_cachedModels.clear(); // L: 3017
		Client.Widget_cachedFonts.clear(); // L: 3018
		PlayerComposition.PlayerComposition_cachedModels.clear(); // L: 3020
		class33.method460(); // L: 3022
		((TextureProvider)Rasterizer3D.field2520.Rasterizer3D_textureLoader).clear(); // L: 3023
		Script.Script_cached.clear(); // L: 3024
		Client.field615.method7699(); // L: 3025
		class466.archive5.clearFiles(); // L: 3026
		Actor.field1223.clearFiles(); // L: 3027
		BuddyRankComparator.archive7.clearFiles(); // L: 3028
		LoginScreenAnimation.archive4.clearFiles(); // L: 3029
		class305.archive9.clearFiles(); // L: 3030
		ReflectionCheck.archive6.clearFiles(); // L: 3031
		FontName.archive11.clearFiles(); // L: 3032
		class180.archive8.clearFiles(); // L: 3033
		Language.field4347.clearFiles(); // L: 3034
		class53.archive10.clearFiles(); // L: 3035
		ViewportMouse.field2770.clearFiles(); // L: 3036
		class33.archive12.clearFiles(); // L: 3037
		Messages.field1377.clearFiles(); // L: 3038
		class36.scene.clear(); // L: 3040

		for (int var0 = 0; var0 < 4; ++var0) { // L: 3041
			Client.collisionMaps[var0].clear();
		}

		Client.field740.method4102(); // L: 3042
		System.gc(); // L: 3043
		class304.musicPlayerStatus = 1; // L: 3045
		UserComparator9.musicTrackArchive = null; // L: 3046
		VarbitComposition.musicTrackGroupId = -1; // L: 3047
		class304.musicTrackFileId = -1; // L: 3048
		class304.musicTrackVolume = 0; // L: 3049
		class132.musicTrackBoolean = false; // L: 3050
		class157.pcmSampleLength = 2; // L: 3051
		Client.currentTrackGroupId = -1; // L: 3053
		Client.playingJingle = false; // L: 3054
		class145.method3139(); // L: 3055
		UserComparator8.method2855(10); // L: 3056
	} // L: 3057
}
