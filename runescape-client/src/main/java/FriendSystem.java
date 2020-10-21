import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cr")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "Lmu;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "Lkw;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Ljs;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1061950327
	)
	@Export("loadingProgress")
	int loadingProgress;

	@ObfuscatedSignature(
		signature = "(Lmu;)V"
	)
	FriendSystem(LoginType var1) {
		this.loadingProgress = 0;
		this.loginType = var1;
		this.friendsList = new FriendsList(var1);
		this.ignoreList = new IgnoreList(var1);
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "-1895979589"
	)
	boolean method1972() {
		return this.loadingProgress == 2;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1001513486"
	)
	final void method1919() {
		this.loadingProgress = 1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(Lkf;IS)V",
		garbageValue = "-279"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2);
		this.loadingProgress = 2;

		for (int var3 = 0; var3 < Players.Players_count; ++var3) {
			Player var4 = Client.players[Players.Players_indices[var3]];
			var4.clearIsFriend();
		}

		class89.method2127();
		if (Renderable.clanChat != null) {
			Renderable.clanChat.clearFriends();
		}

	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1616251932"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) {
			if ((long)var1.field3664 < PacketWriter.currentTimeMillis() / 1000L - 5L) {
				if (var1.world > 0) {
					WorldMapRectangle.addGameMessage(5, "", var1.username + " has logged in.");
				}

				if (var1.world == 0) {
					WorldMapRectangle.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove();
			}
		}

	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "16776960"
	)
	@Export("clear")
	final void clear() {
		this.loadingProgress = 0;
		this.friendsList.clear();
		this.ignoreList.clear();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lku;ZB)Z",
		garbageValue = "6"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) {
			return false;
		} else if (var1.equals(WorldMapLabelSize.localPlayer.username)) {
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2);
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(Lku;B)Z",
		garbageValue = "-12"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) {
			return false;
		} else {
			return this.ignoreList.contains(var1);
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I)V",
		garbageValue = "597249959"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsListIsFull()) {
					Object var10000 = null;
					String var3 = "Your friend list is full. Max of 200 for free users, and 400 for members";
					WorldMapRectangle.addGameMessage(30, "", var3);
				} else if (WorldMapLabelSize.localPlayer.username.equals(var2)) {
					WorldMapSection1.method649();
				} else if (this.isFriended(var2, false)) {
					ModelData0.method3377(var1);
				} else if (this.isIgnored(var2)) {
					WorldMapRegion.method609(var1);
				} else {
					UserComparator9.method3492(var1);
				}
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(S)Z",
		garbageValue = "-12193"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field888 != 1;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I)V",
		garbageValue = "-1984933223"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				StringBuilder var10000;
				String var4;
				if (this.canAddIgnore()) {
					var10000 = null;
					var4 = "Your ignore list is full. Max of 100 for free users, and 400 for members";
					WorldMapRectangle.addGameMessage(30, "", var4);
				} else if (WorldMapLabelSize.localPlayer.username.equals(var2)) {
					var10000 = null;
					var4 = "You can't add yourself to your own ignore list";
					WorldMapRectangle.addGameMessage(30, "", var4);
				} else {
					Object var10001;
					if (this.isIgnored(var2)) {
						var10000 = (new StringBuilder()).append(var1);
						var10001 = null;
						var4 = var10000.append(" is already on your ignore list").toString();
						WorldMapRectangle.addGameMessage(30, "", var4);
					} else if (this.isFriended(var2, false)) {
						var10000 = new StringBuilder();
						var10001 = null;
						var10000 = var10000.append("Please remove ").append(var1);
						var10001 = null;
						var4 = var10000.append(" from your friend list first").toString();
						WorldMapRectangle.addGameMessage(30, "", var4);
					} else {
						PacketBufferNode var3 = Client.getPacketBufferNode(ClientPacket.field2288, Client.packetWriter.isaacCipher);
						var3.packetBuffer.writeByte(Decimator.stringCp1252NullTerminatedByteSize(var1));
						var3.packetBuffer.writeStringCp1252NullTerminated(var1);
						Client.packetWriter.addNode(var3);
					}
				}
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(B)Z",
		garbageValue = "61"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field888 != 1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I)V",
		garbageValue = "-1937520523"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsList.removeByUsername(var2)) {
					Client.field870 = Client.cycleCntr;
					PacketBufferNode var3 = Client.getPacketBufferNode(ClientPacket.field2319, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(Decimator.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}

				for (int var5 = 0; var5 < Players.Players_count; ++var5) {
					Player var4 = Client.players[Players.Players_indices[var5]];
					var4.clearIsFriend();
				}

				class89.method2127();
				if (Renderable.clanChat != null) {
					Renderable.clanChat.clearFriends();
				}

			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I)V",
		garbageValue = "1683783285"
	)
	@Export("removeIgnore")
	final void removeIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.ignoreList.removeByUsername(var2)) {
					Client.field870 = Client.cycleCntr;
					PacketBufferNode var3 = Client.getPacketBufferNode(ClientPacket.field2322, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(Decimator.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}

				KitDefinition.FriendSystem_invalidateIgnoreds();
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(Lku;I)Z",
		garbageValue = "-1919732460"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1);
		return var2 != null && var2.hasWorld();
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(II)Lie;",
		garbageValue = "-2171031"
	)
	@Export("KitDefinition_get")
	public static KitDefinition KitDefinition_get(int var0) {
		KitDefinition var1 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = KitDefinition.KitDefinition_archive.takeFile(3, var0);
			var1 = new KitDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			KitDefinition.KitDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(IIILgk;Lft;B)Z",
		garbageValue = "6"
	)
	static final boolean method1976(int var0, int var1, int var2, RouteStrategy var3, CollisionMap var4) {
		int var5 = var0;
		int var6 = var1;
		byte var7 = 64;
		byte var8 = 64;
		int var9 = var0 - var7;
		int var10 = var1 - var8;
		class182.directions[var7][var8] = 99;
		class182.distances[var7][var8] = 0;
		byte var11 = 0;
		int var12 = 0;
		class182.bufferX[var11] = var0;
		int var20 = var11 + 1;
		class182.bufferY[var11] = var1;
		int[][] var13 = var4.flags;

		while (true) {
			label313:
			while (true) {
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				do {
					do {
						do {
							label290:
							do {
								if (var20 == var12) {
									class182.field2135 = var5;
									class182.field2136 = var6;
									return false;
								}

								var5 = class182.bufferX[var12];
								var6 = class182.bufferY[var12];
								var12 = var12 + 1 & 4095;
								var18 = var5 - var9;
								var19 = var6 - var10;
								var14 = var5 - var4.xInset;
								var15 = var6 - var4.yInset;
								if (var3.hasArrived(var2, var5, var6, var4)) {
									class182.field2135 = var5;
									class182.field2136 = var6;
									return true;
								}

								var16 = class182.distances[var18][var19] + 1;
								if (var18 > 0 && class182.directions[var18 - 1][var19] == 0 && (var13[var14 - 1][var15] & 19136782) == 0 && (var13[var14 - 1][var15 + var2 - 1] & 19136824) == 0) {
									var17 = 1;

									while (true) {
										if (var17 >= var2 - 1) {
											class182.bufferX[var20] = var5 - 1;
											class182.bufferY[var20] = var6;
											var20 = var20 + 1 & 4095;
											class182.directions[var18 - 1][var19] = 2;
											class182.distances[var18 - 1][var19] = var16;
											break;
										}

										if ((var13[var14 - 1][var17 + var15] & 19136830) != 0) {
											break;
										}

										++var17;
									}
								}

								if (var18 < 128 - var2 && class182.directions[var18 + 1][var19] == 0 && (var13[var14 + var2][var15] & 19136899) == 0 && (var13[var14 + var2][var15 + var2 - 1] & 19136992) == 0) {
									var17 = 1;

									while (true) {
										if (var17 >= var2 - 1) {
											class182.bufferX[var20] = var5 + 1;
											class182.bufferY[var20] = var6;
											var20 = var20 + 1 & 4095;
											class182.directions[var18 + 1][var19] = 8;
											class182.distances[var18 + 1][var19] = var16;
											break;
										}

										if ((var13[var14 + var2][var17 + var15] & 19136995) != 0) {
											break;
										}

										++var17;
									}
								}

								if (var19 > 0 && class182.directions[var18][var19 - 1] == 0 && (var13[var14][var15 - 1] & 19136782) == 0 && (var13[var14 + var2 - 1][var15 - 1] & 19136899) == 0) {
									var17 = 1;

									while (true) {
										if (var17 >= var2 - 1) {
											class182.bufferX[var20] = var5;
											class182.bufferY[var20] = var6 - 1;
											var20 = var20 + 1 & 4095;
											class182.directions[var18][var19 - 1] = 1;
											class182.distances[var18][var19 - 1] = var16;
											break;
										}

										if ((var13[var17 + var14][var15 - 1] & 19136911) != 0) {
											break;
										}

										++var17;
									}
								}

								if (var19 < 128 - var2 && class182.directions[var18][var19 + 1] == 0 && (var13[var14][var15 + var2] & 19136824) == 0 && (var13[var14 + var2 - 1][var15 + var2] & 19136992) == 0) {
									var17 = 1;

									while (true) {
										if (var17 >= var2 - 1) {
											class182.bufferX[var20] = var5;
											class182.bufferY[var20] = var6 + 1;
											var20 = var20 + 1 & 4095;
											class182.directions[var18][var19 + 1] = 4;
											class182.distances[var18][var19 + 1] = var16;
											break;
										}

										if ((var13[var14 + var17][var15 + var2] & 19137016) != 0) {
											break;
										}

										++var17;
									}
								}

								if (var18 > 0 && var19 > 0 && class182.directions[var18 - 1][var19 - 1] == 0 && (var13[var14 - 1][var15 - 1] & 19136782) == 0) {
									var17 = 1;

									while (true) {
										if (var17 >= var2) {
											class182.bufferX[var20] = var5 - 1;
											class182.bufferY[var20] = var6 - 1;
											var20 = var20 + 1 & 4095;
											class182.directions[var18 - 1][var19 - 1] = 3;
											class182.distances[var18 - 1][var19 - 1] = var16;
											break;
										}

										if ((var13[var14 - 1][var17 + (var15 - 1)] & 19136830) != 0 || (var13[var17 + (var14 - 1)][var15 - 1] & 19136911) != 0) {
											break;
										}

										++var17;
									}
								}

								if (var18 < 128 - var2 && var19 > 0 && class182.directions[var18 + 1][var19 - 1] == 0 && (var13[var14 + var2][var15 - 1] & 19136899) == 0) {
									var17 = 1;

									while (true) {
										if (var17 >= var2) {
											class182.bufferX[var20] = var5 + 1;
											class182.bufferY[var20] = var6 - 1;
											var20 = var20 + 1 & 4095;
											class182.directions[var18 + 1][var19 - 1] = 9;
											class182.distances[var18 + 1][var19 - 1] = var16;
											break;
										}

										if ((var13[var14 + var2][var17 + (var15 - 1)] & 19136995) != 0 || (var13[var14 + var17][var15 - 1] & 19136911) != 0) {
											break;
										}

										++var17;
									}
								}

								if (var18 > 0 && var19 < 128 - var2 && class182.directions[var18 - 1][var19 + 1] == 0 && (var13[var14 - 1][var15 + var2] & 19136824) == 0) {
									for (var17 = 1; var17 < var2; ++var17) {
										if ((var13[var14 - 1][var15 + var17] & 19136830) != 0 || (var13[var17 + (var14 - 1)][var15 + var2] & 19137016) != 0) {
											continue label290;
										}
									}

									class182.bufferX[var20] = var5 - 1;
									class182.bufferY[var20] = var6 + 1;
									var20 = var20 + 1 & 4095;
									class182.directions[var18 - 1][var19 + 1] = 6;
									class182.distances[var18 - 1][var19 + 1] = var16;
								}
							} while(var18 >= 128 - var2);
						} while(var19 >= 128 - var2);
					} while(class182.directions[var18 + 1][var19 + 1] != 0);
				} while((var13[var14 + var2][var15 + var2] & 19136992) != 0);

				for (var17 = 1; var17 < var2; ++var17) {
					if ((var13[var17 + var14][var15 + var2] & 19137016) != 0 || (var13[var14 + var2][var17 + var15] & 19136995) != 0) {
						continue label313;
					}
				}

				class182.bufferX[var20] = var5 + 1;
				class182.bufferY[var20] = var6 + 1;
				var20 = var20 + 1 & 4095;
				class182.directions[var18 + 1][var19 + 1] = 12;
				class182.distances[var18 + 1][var19 + 1] = var16;
			}
		}
	}
}
