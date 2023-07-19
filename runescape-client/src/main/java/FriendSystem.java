import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ce")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("vm")
	@ObfuscatedSignature(
		descriptor = "Lso;"
	)
	static PlatformInfo field831;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	@Export("HealthBarDefinition_archive")
	public static AbstractArchive HealthBarDefinition_archive;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1600458929
	)
	int field824;

	@ObfuscatedSignature(
		descriptor = "(Lsl;)V"
	)
	FriendSystem(LoginType var1) {
		this.field824 = 0;
		this.loginType = var1;
		this.friendsList = new FriendsList(var1);
		this.ignoreList = new IgnoreList(var1);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "47"
	)
	boolean method1868() {
		return this.field824 == 2;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "29571"
	)
	final void method1891() {
		this.field824 = 1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ltl;II)V",
		garbageValue = "-960033037"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2); // L: 40
		this.field824 = 2; // L: 41
		GrandExchangeOfferOwnWorldComparator.method1240(); // L: 42
	} // L: 43

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-365343128"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) {
			if ((long)var1.field4627 < AttackOption.method2714() / 1000L - 5L) {
				if (var1.world > 0) {
					ReflectionCheck.addGameMessage(5, "", var1.username + " has logged in.");
				}

				if (var1.world == 0) {
					ReflectionCheck.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove();
			}
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-474598796"
	)
	@Export("clear")
	final void clear() {
		this.field824 = 0;
		this.friendsList.clear();
		this.ignoreList.clear();
	} // L: 59

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lur;ZI)Z",
		garbageValue = "397188635"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) { // L: 62
			return false;
		} else if (var1.equals(class27.localPlayer.username)) { // L: 63
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2); // L: 64
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lur;S)Z",
		garbageValue = "-1190"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) { // L: 69
			return false;
		} else {
			return this.ignoreList.contains(var1); // L: 70
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)V",
		garbageValue = "-8516"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) { // L: 75
			Username var2 = new Username(var1, this.loginType); // L: 76
			if (var2.hasCleanName()) { // L: 77
				if (this.friendsListIsFull()) { // L: 78
					InterfaceParent.method2304(); // L: 79
				} else if (class27.localPlayer.username.equals(var2)) { // L: 82
					class339.method6635("You can't add yourself to your own friend list"); // L: 84
				} else if (this.isFriended(var2, false)) { // L: 88
					class339.method6635(var1 + " is already on your friend list"); // L: 90
				} else if (this.isIgnored(var2)) { // L: 94
					class339.method6635("Please remove " + var1 + " from your ignore list first"); // L: 96
				} else {
					PacketBufferNode var3 = class217.getPacketBufferNode(ClientPacket.field3110, Client.packetWriter.isaacCipher); // L: 102
					var3.packetBuffer.writeByte(Player.stringCp1252NullTerminatedByteSize(var1)); // L: 103
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 104
					Client.packetWriter.addNode(var3); // L: 105
				}
			}
		}
	} // L: 80 86 92 98 107

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-59"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field671 != 1; // L: 118
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-425320947"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) { // L: 125
			Username var2 = new Username(var1, this.loginType); // L: 126
			if (var2.hasCleanName()) { // L: 127
				if (this.canAddIgnore()) { // L: 128
					class17.method286(); // L: 129
				} else if (class27.localPlayer.username.equals(var2)) { // L: 132
					class339.method6635("You can't add yourself to your own ignore list"); // L: 134
				} else if (this.isIgnored(var2)) { // L: 138
					class339.method6635(var1 + " is already on your ignore list"); // L: 140
				} else if (this.isFriended(var2, false)) { // L: 144
					class339.method6635("Please remove " + var1 + " from your friend list first"); // L: 146
				} else {
					SecureRandomFuture.method2179(var1); // L: 150
				}
			}
		}
	} // L: 130 136 142 148 151

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "89"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field671 != 1; // L: 166
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1573758468"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) { // L: 173
			Username var2 = new Username(var1, this.loginType); // L: 174
			if (var2.hasCleanName()) { // L: 175
				if (this.friendsList.removeByUsername(var2)) { // L: 176
					Client.field701 = Client.cycleCntr; // L: 178
					PacketBufferNode var3 = class217.getPacketBufferNode(ClientPacket.field3121, Client.packetWriter.isaacCipher); // L: 181
					var3.packetBuffer.writeByte(Player.stringCp1252NullTerminatedByteSize(var1)); // L: 182
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 183
					Client.packetWriter.addNode(var3); // L: 184
				}

				GrandExchangeOfferOwnWorldComparator.method1240(); // L: 186
			}
		}
	} // L: 187

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "-1593952554"
	)
	public final void method1880(String var1, boolean var2) {
		if (var1 != null) { // L: 190
			Username var3 = new Username(var1, this.loginType); // L: 191
			if (var3.hasCleanName()) { // L: 192
				if (this.ignoreList.removeByUsername(var3)) { // L: 193
					Client.field701 = Client.cycleCntr; // L: 195
					if (var2) { // L: 197
						PacketBufferNode var4 = class217.getPacketBufferNode(ClientPacket.field3185, Client.packetWriter.isaacCipher); // L: 199
						var4.packetBuffer.writeByte(Player.stringCp1252NullTerminatedByteSize(var1)); // L: 200
						var4.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 201
						Client.packetWriter.addNode(var4); // L: 202
					}
				}

				TextureProvider.FriendSystem_invalidateIgnoreds(); // L: 205
			}
		}
	} // L: 206

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)Z",
		garbageValue = "-1023397195"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1); // L: 218
		return var2 != null && var2.hasWorld(); // L: 219
	}

	@ObfuscatedName("ai")
	@Export("base37DecodeLong")
	public static String base37DecodeLong(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) { // L: 16
			if (var0 % 37L == 0L) { // L: 17
				return null;
			} else {
				int var2 = 0; // L: 18

				for (long var3 = var0; var3 != 0L; var3 /= 37L) { // L: 19 20 22
					++var2; // L: 21
				}

				StringBuilder var5;
				char var8;
				for (var5 = new StringBuilder(var2); 0L != var0; var5.append(var8)) { // L: 34
					long var6 = var0;
					var0 /= 37L;
					var8 = class388.base37Table[(int)(var6 - var0 * 37L)];
					if (var8 == '_') {
						int var9 = var5.length() - 1; // L: 30
						var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9))); // L: 31
						var8 = 160; // L: 32
					}
				}

				var5.reverse(); // L: 36
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0))); // L: 37
				return var5.toString(); // L: 38
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1499486375"
	)
	static void method1925() {
		Tiles.Tiles_minPlane = 99; // L: 45
		Tiles.field1018 = new short[4][104][104]; // L: 46
		Tiles.field1033 = new short[4][104][104]; // L: 47
		class53.field367 = new byte[4][104][104]; // L: 48
		Tiles.field1019 = new byte[4][104][104]; // L: 49
		WorldMapCacheName.field3059 = new int[4][105][105]; // L: 50
		class350.field3891 = new byte[4][105][105]; // L: 51
		Tiles.field1021 = new int[105][105]; // L: 52
		class509.Tiles_hue = new int[104]; // L: 53
		GrandExchangeOfferNameComparator.Tiles_saturation = new int[104]; // L: 54
		class350.Tiles_lightness = new int[104]; // L: 55
		class27.Tiles_hueMultiplier = new int[104]; // L: 56
		class59.field430 = new int[104]; // L: 57
	} // L: 58

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IS)Lhv;",
		garbageValue = "-29043"
	)
	@Export("VarpDefinition_get")
	public static VarpDefinition VarpDefinition_get(int var0) {
		VarpDefinition var1 = (VarpDefinition)VarpDefinition.VarpDefinition_cached.get((long)var0); // L: 23
		if (var1 != null) { // L: 24
			return var1;
		} else {
			byte[] var2 = VarpDefinition.VarpDefinition_archive.takeFile(16, var0); // L: 25
			var1 = new VarpDefinition(); // L: 26
			if (var2 != null) { // L: 27
				var1.decode(new Buffer(var2));
			}

			VarpDefinition.VarpDefinition_cached.put(var1, (long)var0); // L: 28
			return var1; // L: 29
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)Lfw;",
		garbageValue = "1829081442"
	)
	static class138 method1923(int var0) {
		class138 var2 = class184.method3661(var0); // L: 393
		int var1;
		if (var2 == null) { // L: 394
			var1 = 2; // L: 395
		} else {
			var1 = var2.method3154() ? 0 : 1; // L: 398
		}

		return var1 != 0 ? null : class184.method3661(var0); // L: 400 401 403
	}
}
