import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cs")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "[Lvl;"
	)
	@Export("scrollBarSprites")
	static IndexedSprite[] scrollBarSprites;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ltr;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lri;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lrp;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1036601557
	)
	int field837;

	@ObfuscatedSignature(
		descriptor = "(Ltr;)V"
	)
	FriendSystem(LoginType var1) {
		this.field837 = 0; // L: 23
		this.loginType = var1; // L: 26
		this.friendsList = new FriendsList(var1); // L: 27
		this.ignoreList = new IgnoreList(var1); // L: 28
	} // L: 29

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1854467383"
	)
	boolean method1904() {
		return this.field837 == 2; // L: 32
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "42"
	)
	final void method1849() {
		this.field837 = 1; // L: 36
	} // L: 37

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lur;II)V",
		garbageValue = "-1820828369"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2); // L: 40
		this.field837 = 2; // L: 41

		for (int var3 = 0; var3 < Players.Players_count; ++var3) { // L: 43
			Player var4 = Client.players[Players.Players_indices[var3]]; // L: 44
			var4.clearIsFriend(); // L: 45
		}

		Iterator var5 = Messages.Messages_hashTable.iterator(); // L: 48

		while (var5.hasNext()) {
			Message var6 = (Message)var5.next(); // L: 49
			var6.clearIsFromFriend(); // L: 51
		}

		if (class143.friendsChatManager != null) { // L: 55
			class143.friendsChatManager.clearFriends(); // L: 56
		}

	} // L: 59

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "4"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) { // L: 62
			if ((long)var1.field4787 < VerticalAlignment.method3924() / 1000L - 5L) { // L: 63
				if (var1.world > 0) {
					SecureRandomCallable.addGameMessage(5, "", var1.username + " has logged in."); // L: 64
				}

				if (var1.world == 0) { // L: 65
					SecureRandomCallable.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove(); // L: 66
			}
		}

	} // L: 69

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1563117344"
	)
	@Export("clear")
	final void clear() {
		this.field837 = 0; // L: 72
		this.friendsList.clear(); // L: 73
		this.ignoreList.clear(); // L: 74
	} // L: 75

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lvx;ZI)Z",
		garbageValue = "-626395081"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) { // L: 78
			return false;
		} else if (var1.equals(class133.localPlayer.username)) { // L: 79
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2); // L: 80
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvx;S)Z",
		garbageValue = "2048"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) { // L: 85
			return false;
		} else {
			return this.ignoreList.contains(var1); // L: 86
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "2076717120"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) { // L: 91
			Username var2 = new Username(var1, this.loginType); // L: 92
			if (var2.hasCleanName()) { // L: 93
				if (this.friendsListIsFull()) { // L: 94
					AbstractWorldMapIcon.method5748(); // L: 95
				} else if (class133.localPlayer.username.equals(var2)) { // L: 98
					SequenceDefinition.method4270(); // L: 99
				} else if (this.isFriended(var2, false)) { // L: 102
					class6.method40(var1 + " is already on your friend list"); // L: 104
				} else if (this.isIgnored(var2)) { // L: 108
					Client.method1791(var1); // L: 109
				} else {
					PacketBufferNode var3 = class425.getPacketBufferNode(ClientPacket.field3207, Client.packetWriter.isaacCipher); // L: 114
					var3.packetBuffer.writeByte(SequenceDefinition.stringCp1252NullTerminatedByteSize(var1)); // L: 115
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 116
					Client.packetWriter.addNode(var3); // L: 117
				}
			}
		}
	} // L: 96 100 106 110 119

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1411136213"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field783 != 1; // L: 138
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1957948062"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) { // L: 145
			Username var2 = new Username(var1, this.loginType); // L: 146
			if (var2.hasCleanName()) { // L: 147
				if (this.canAddIgnore()) { // L: 148
					class6.method40("Your ignore list is full. Max of 100 for free users, and 400 for members"); // L: 150
				} else if (class133.localPlayer.username.equals(var2)) { // L: 154
					Projectile.method2177(); // L: 155
				} else if (this.isIgnored(var2)) { // L: 158
					class6.method40(var1 + " is already on your ignore list"); // L: 160
				} else if (this.isFriended(var2, false)) { // L: 164
					class6.method40("Please remove " + var1 + " from your friend list first"); // L: 166
				} else {
					PacketBufferNode var3 = class425.getPacketBufferNode(ClientPacket.field3210, Client.packetWriter.isaacCipher); // L: 172
					var3.packetBuffer.writeByte(SequenceDefinition.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3); // L: 175
				}
			}
		}
	} // L: 152 156 162 168

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "65"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field783 != 1; // L: 184
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "2102552250"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType); // L: 192
			if (var2.hasCleanName()) {
				if (this.friendsList.removeByUsername(var2)) { // L: 194
					Client.field716 = Client.cycleCntr;
					PacketBufferNode var3 = class425.getPacketBufferNode(ClientPacket.field3275, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(SequenceDefinition.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 201
					Client.packetWriter.addNode(var3); // L: 202
				}

				for (int var5 = 0; var5 < Players.Players_count; ++var5) {
					Player var4 = Client.players[Players.Players_indices[var5]];
					var4.clearIsFriend(); // L: 207
				}

				Iterator var6 = Messages.Messages_hashTable.iterator();

				while (var6.hasNext()) {
					Message var7 = (Message)var6.next(); // L: 211
					var7.clearIsFromFriend();
				}

				if (class143.friendsChatManager != null) { // L: 217
					class143.friendsChatManager.clearFriends();
				}

			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)V",
		garbageValue = "-64"
	)
	public final void method1860(String var1, boolean var2) {
		if (var1 != null) {
			Username var3 = new Username(var1, this.loginType);
			if (var3.hasCleanName()) { // L: 226
				if (this.ignoreList.removeByUsername(var3)) { // L: 227
					Client.field716 = Client.cycleCntr;
					if (var2) { // L: 231
						PacketBufferNode var4 = class425.getPacketBufferNode(ClientPacket.field3231, Client.packetWriter.isaacCipher); // L: 233
						var4.packetBuffer.writeByte(SequenceDefinition.stringCp1252NullTerminatedByteSize(var1)); // L: 234
						var4.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 235
						Client.packetWriter.addNode(var4); // L: 236
					}
				}

				ClientPacket.FriendSystem_invalidateIgnoreds(); // L: 239
			}
		}
	} // L: 240

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lvx;I)Z",
		garbageValue = "-458167689"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1); // L: 252
		return var2 != null && var2.hasWorld(); // L: 253
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lur;IIIIIIB)V",
		garbageValue = "4"
	)
	@Export("loadTerrain")
	static final void loadTerrain(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = var1 >= 0 && var1 < 4 && var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104; // L: 171
		int var8;
		if (var7) { // L: 173
			Tiles.Tiles_renderFlags[var1][var2][var3] = 0; // L: 174

			while (true) {
				var8 = var0.readUnsignedShort(); // L: 176
				if (var8 == 0) { // L: 177
					if (var1 == 0) { // L: 178
						int[] var15 = Tiles.Tiles_heights[0][var2]; // L: 179
						int var12 = var4 + 932731; // L: 182
						int var13 = var5 + 556238; // L: 183
						int var14 = InvDefinition.method3695(var12 + 45365, 91923 + var13, 4) - 128 + (InvDefinition.method3695(10294 + var12, var13 + 37821, 2) - 128 >> 1) + (InvDefinition.method3695(var12, var13, 1) - 128 >> 2); // L: 185
						var14 = (int)((double)var14 * 0.3D) + 35; // L: 186
						if (var14 < 10) { // L: 187
							var14 = 10;
						} else if (var14 > 60) { // L: 188
							var14 = 60;
						}

						var15[var3] = -var14 * 8; // L: 191
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - 240; // L: 193
					}
					break;
				}

				if (var8 == 1) { // L: 196
					int var9 = var0.readUnsignedByte(); // L: 197
					if (var9 == 1) { // L: 198
						var9 = 0;
					}

					if (var1 == 0) { // L: 199
						Tiles.Tiles_heights[0][var2][var3] = -var9 * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - var9 * 8; // L: 200
					}
					break;
				}

				if (var8 <= 49) { // L: 203
					AccessFile.field5129[var1][var2][var3] = (short)var0.readShort(); // L: 204
					Tiles.field1031[var1][var2][var3] = (byte)((var8 - 2) / 4); // L: 205
					Tiles.field1028[var1][var2][var3] = (byte)(var8 - 2 + var6 & 3); // L: 206
				} else if (var8 <= 81) { // L: 209
					Tiles.Tiles_renderFlags[var1][var2][var3] = (byte)(var8 - 49); // L: 210
				} else {
					Tiles.field1030[var1][var2][var3] = (short)(var8 - 81); // L: 213
				}
			}
		} else {
			while (true) {
				var8 = var0.readUnsignedShort(); // L: 218
				if (var8 == 0) { // L: 219
					break;
				}

				if (var8 == 1) { // L: 220
					var0.readUnsignedByte(); // L: 221
					break; // L: 222
				}

				if (var8 <= 49) { // L: 224
					var0.readShort(); // L: 225
				}
			}
		}

	} // L: 229

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIIB)V",
		garbageValue = "56"
	)
	static void method1892(ArrayList var0, int var1, int var2, int var3, int var4) {
		if (!var0.isEmpty()) { // L: 3896
			int var5 = (Integer)var0.get(0); // L: 3899
			if (var5 == -1 && !Client.playingJingle) { // L: 3900
				class11.method108(0, 0); // L: 3901
			} else if (var5 != -1) { // L: 3903
				boolean var6;
				if (class321.field3496.isEmpty()) { // L: 3906
					var6 = false; // L: 3911
				} else {
					class333 var7 = (class333)class321.field3496.get(0); // L: 3907
					var6 = var7 != null && var5 == var7.field3605; // L: 3908
				}

				if (!var6 && NPC.clientPreferences.method2503() != 0) { // L: 3913 3914
					ArrayList var9 = new ArrayList(); // L: 3915

					for (int var8 = 0; var8 < var0.size(); ++var8) { // L: 3916
						var9.add(new class333(UserComparator6.field1508, (Integer)var0.get(var8), 0, NPC.clientPreferences.method2503(), false)); // L: 3917
					}

					if (Client.playingJingle) { // L: 3919
						HealthBar.method2572(var9, var1, var2, var3, var4); // L: 3920
					} else {
						Renderable.method4881(var9, var1, var2, var3, var4, false); // L: 3923
					}
				}
			}

		}
	} // L: 3897 3928
}
