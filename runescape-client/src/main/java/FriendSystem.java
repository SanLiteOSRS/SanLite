import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ct")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -883395869
	)
	static int field859;
	@ObfuscatedName("ko")
	@ObfuscatedGetter(
		intValue = 1321952883
	)
	@Export("cameraPitch")
	static int cameraPitch;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lte;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lrh;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lrn;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -216489171
	)
	int field857;

	@ObfuscatedSignature(
		descriptor = "(Lte;)V"
	)
	FriendSystem(LoginType var1) {
		this.field857 = 0; // L: 23
		this.loginType = var1; // L: 26
		this.friendsList = new FriendsList(var1); // L: 27
		this.ignoreList = new IgnoreList(var1); // L: 28
	} // L: 29

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-152880935"
	)
	boolean method1942() {
		return this.field857 == 2; // L: 32
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-240124587"
	)
	final void method1874() {
		this.field857 = 1; // L: 36
	} // L: 37

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Luq;II)V",
		garbageValue = "-1330528881"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2); // L: 40
		this.field857 = 2; // L: 41

		for (int var3 = 0; var3 < Players.Players_count; ++var3) { // L: 43
			Player var4 = Client.players[Players.Players_indices[var3]]; // L: 44
			var4.clearIsFriend(); // L: 45
		}

		PendingSpawn.method2454(); // L: 47
		if (Projectile.friendsChatManager != null) { // L: 48
			Projectile.friendsChatManager.clearFriends(); // L: 49
		}

	} // L: 52

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-417770306"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) { // L: 55
			if ((long)var1.field4751 < SecureRandomCallable.method2320() / 1000L - 5L) { // L: 56
				if (var1.world > 0) {
					class209.addGameMessage(5, "", var1.username + " has logged in."); // L: 57
				}

				if (var1.world == 0) { // L: 58
					class209.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove(); // L: 59
			}
		}

	} // L: 62

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("clear")
	final void clear() {
		this.field857 = 0; // L: 65
		this.friendsList.clear(); // L: 66
		this.ignoreList.clear(); // L: 67
	} // L: 68

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lvn;ZB)Z",
		garbageValue = "14"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) { // L: 71
			return false;
		} else if (var1.equals(VarpDefinition.localPlayer.username)) { // L: 72
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2); // L: 73
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lvn;I)Z",
		garbageValue = "-133614505"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) { // L: 78
			return false;
		} else {
			return this.ignoreList.contains(var1); // L: 79
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1586069873"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) { // L: 84
			Username var2 = new Username(var1, this.loginType); // L: 85
			if (var2.hasCleanName()) { // L: 86
				if (this.friendsListIsFull()) { // L: 87
					class59.method1137(); // L: 88
				} else if (VarpDefinition.localPlayer.username.equals(var2)) { // L: 91
					SecureRandomCallable.method2319("You can't add yourself to your own friend list"); // L: 93
				} else if (this.isFriended(var2, false)) { // L: 97
					class30.method416(var1); // L: 98
				} else if (this.isIgnored(var2)) { // L: 101
					class388.method7344(var1); // L: 102
				} else {
					IgnoreList.method8240(var1); // L: 105
				}
			}
		}
	} // L: 89 95 99 103 106

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1536951971"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field653 != 1; // L: 133
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "37"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) { // L: 140
			Username var2 = new Username(var1, this.loginType); // L: 141
			if (var2.hasCleanName()) { // L: 142
				if (this.canAddIgnore()) { // L: 143
					SecureRandomCallable.method2319("Your ignore list is full. Max of 100 for free users, and 400 for members"); // L: 145
				} else if (VarpDefinition.localPlayer.username.equals(var2)) { // L: 149
					NPC.method2711(); // L: 150
				} else if (this.isIgnored(var2)) { // L: 153
					class368.method7011(var1); // L: 154
				} else if (this.isFriended(var2, false)) { // L: 157
					class53.method1064(var1); // L: 158
				} else {
					HitSplatDefinition.method3917(var1); // L: 161
				}
			}
		}
	} // L: 147 151 155 159 162

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1866014959"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field653 != 1; // L: 185
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1642083231"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) { // L: 192
			Username var2 = new Username(var1, this.loginType); // L: 193
			if (var2.hasCleanName()) { // L: 194
				if (this.friendsList.removeByUsername(var2)) { // L: 195
					Client.field732 = Client.cycleCntr; // L: 197
					PacketBufferNode var3 = ViewportMouse.getPacketBufferNode(ClientPacket.field3263, Client.packetWriter.isaacCipher); // L: 200
					var3.packetBuffer.writeByte(class145.stringCp1252NullTerminatedByteSize(var1)); // L: 201
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 202
					Client.packetWriter.addNode(var3); // L: 203
				}

				for (int var5 = 0; var5 < Players.Players_count; ++var5) { // L: 206
					Player var4 = Client.players[Players.Players_indices[var5]]; // L: 207
					var4.clearIsFriend(); // L: 208
				}

				PendingSpawn.method2454(); // L: 210
				if (Projectile.friendsChatManager != null) { // L: 211
					Projectile.friendsChatManager.clearFriends(); // L: 212
				}

			}
		}
	} // L: 215

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "-805764742"
	)
	public final void method1880(String var1, boolean var2) {
		if (var1 != null) { // L: 218
			Username var3 = new Username(var1, this.loginType); // L: 219
			if (var3.hasCleanName()) { // L: 220
				if (this.ignoreList.removeByUsername(var3)) { // L: 221
					Client.field732 = Client.cycleCntr; // L: 223
					if (var2) { // L: 225
						PacketBufferNode var4 = ViewportMouse.getPacketBufferNode(ClientPacket.field3261, Client.packetWriter.isaacCipher); // L: 227
						var4.packetBuffer.writeByte(class145.stringCp1252NullTerminatedByteSize(var1)); // L: 228
						var4.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 229
						Client.packetWriter.addNode(var4); // L: 230
					}
				}

				class224.FriendSystem_invalidateIgnoreds(); // L: 233
			}
		}
	} // L: 234

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvn;I)Z",
		garbageValue = "-1082572779"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1); // L: 246
		return var2 != null && var2.hasWorld(); // L: 247
	}

	@ObfuscatedName("ns")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1627467272"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		class67.method1206(); // L: 12402

		for (ObjectSound var1 = (ObjectSound)ObjectSound.objectSounds.last(); var1 != null; var1 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 12404
			if (var1.obj != null) { // L: 12405
				var1.set();
			}
		}

		int var3 = class148.VarpDefinition_get(var0).type; // L: 12408
		if (var3 != 0) { // L: 12409
			int var2 = Varps.Varps_main[var0]; // L: 12410
			if (var3 == 1) { // L: 12411
				if (var2 == 1) { // L: 12412
					class19.method260(0.9D);
				}

				if (var2 == 2) { // L: 12413
					class19.method260(0.8D);
				}

				if (var2 == 3) { // L: 12414
					class19.method260(0.7D);
				}

				if (var2 == 4) { // L: 12415
					class19.method260(0.6D);
				}
			}

			if (var3 == 3) { // L: 12417
				if (var2 == 0) { // L: 12418
					SpriteMask.method6399(255);
				}

				if (var2 == 1) { // L: 12419
					SpriteMask.method6399(192);
				}

				if (var2 == 2) { // L: 12420
					SpriteMask.method6399(128);
				}

				if (var2 == 3) { // L: 12421
					SpriteMask.method6399(64);
				}

				if (var2 == 4) { // L: 12422
					SpriteMask.method6399(0);
				}
			}

			if (var3 == 4) { // L: 12424
				if (var2 == 0) { // L: 12425
					SoundCache.method831(127);
				}

				if (var2 == 1) { // L: 12426
					SoundCache.method831(96);
				}

				if (var2 == 2) { // L: 12427
					SoundCache.method831(64);
				}

				if (var2 == 3) { // L: 12428
					SoundCache.method831(32);
				}

				if (var2 == 4) { // L: 12429
					SoundCache.method831(0);
				}
			}

			if (var3 == 5) {
				Client.field673 = var2 == 1; // L: 12431
			}

			if (var3 == 6) { // L: 12432
				Client.chatEffects = var2;
			}

			if (var3 == 9) { // L: 12433
			}

			if (var3 == 10) { // L: 12434
				if (var2 == 0) { // L: 12435
					class222.method4344(127);
				}

				if (var2 == 1) { // L: 12436
					class222.method4344(96);
				}

				if (var2 == 2) { // L: 12437
					class222.method4344(64);
				}

				if (var2 == 3) { // L: 12438
					class222.method4344(32);
				}

				if (var2 == 4) { // L: 12439
					class222.method4344(0);
				}
			}

			if (var3 == 17) { // L: 12441
				Client.followerIndex = var2 & 65535; // L: 12442
			}

			if (var3 == 18) { // L: 12444
				Client.playerAttackOption = (AttackOption)class356.findEnumerated(UserComparator7.method2951(), var2); // L: 12445
				if (Client.playerAttackOption == null) { // L: 12446
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var3 == 19) { // L: 12448
				if (var2 == -1) { // L: 12449
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047; // L: 12450
				}
			}

			if (var3 == 22) { // L: 12452
				Client.npcAttackOption = (AttackOption)class356.findEnumerated(UserComparator7.method2951(), var2); // L: 12453
				if (Client.npcAttackOption == null) { // L: 12454
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	} // L: 12456
}
