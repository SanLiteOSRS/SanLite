import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("by")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	@Export("options_buttons_0Sprite")
	static IndexedSprite options_buttons_0Sprite;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1124775275
	)
	int field941;

	@ObfuscatedSignature(
		descriptor = "(Lnc;)V"
	)
	FriendSystem(LoginType var1) {
		this.field941 = 0;
		this.loginType = var1;
		this.friendsList = new FriendsList(var1);
		this.ignoreList = new IgnoreList(var1);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1883790130"
	)
	boolean method1689() {
		return this.field941 == 2;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "6"
	)
	final void method1698() {
		this.field941 = 1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnd;IB)V",
		garbageValue = "103"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2);
		this.field941 = 2;
		Varps.method4647();
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1668816694"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) {
			if ((long)var1.field3828 < ObjectComposition.currentTimeMillis() / 1000L - 5L) {
				if (var1.world > 0) {
					World.addGameMessage(5, "", var1.username + " has logged in.");
				}

				if (var1.world == 0) {
					World.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove();
			}
		}

	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "118"
	)
	@Export("clear")
	final void clear() {
		this.field941 = 0;
		this.friendsList.clear();
		this.ignoreList.clear();
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lly;ZI)Z",
		garbageValue = "-1207370332"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) {
			return false;
		} else if (var1.equals(class93.localPlayer.username)) {
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2);
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lly;I)Z",
		garbageValue = "279756852"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) {
			return false;
		} else {
			return this.ignoreList.contains(var1);
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-2078408502"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsListIsFull()) {
					Tiles.method2053();
				} else {
					StringBuilder var10000;
					String var4;
					if (class93.localPlayer.username.equals(var2)) {
						var10000 = null;
						var4 = "You can't add yourself to your own friend list";
						World.addGameMessage(30, "", var4);
					} else if (this.isFriended(var2, false)) {
						WorldMapManager.method3490(var1);
					} else if (this.isIgnored(var2)) {
						var10000 = new StringBuilder();
						Object var10001 = null;
						var10000 = var10000.append("Please remove ").append(var1);
						var10001 = null;
						var4 = var10000.append(" from your ignore list first").toString();
						World.addGameMessage(30, "", var4);
					} else {
						PacketBufferNode var3 = class21.getPacketBufferNode(ClientPacket.field2664, Client.packetWriter.isaacCipher);
						var3.packetBuffer.writeByte(Tiles.stringCp1252NullTerminatedByteSize(var1));
						var3.packetBuffer.writeStringCp1252NullTerminated(var1);
						Client.packetWriter.addNode(var3);
					}
				}
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1614251669"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field759 != 1;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-7"
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
					World.addGameMessage(30, "", var4);
				} else if (class93.localPlayer.username.equals(var2)) {
					var10000 = null;
					var4 = "You can't add yourself to your own ignore list";
					World.addGameMessage(30, "", var4);
				} else {
					Object var10001;
					if (this.isIgnored(var2)) {
						var10000 = (new StringBuilder()).append(var1);
						var10001 = null;
						var4 = var10000.append(" is already on your ignore list").toString();
						World.addGameMessage(30, "", var4);
					} else if (this.isFriended(var2, false)) {
						var10000 = new StringBuilder();
						var10001 = null;
						var10000 = var10000.append("Please remove ").append(var1);
						var10001 = null;
						var4 = var10000.append(" from your friend list first").toString();
						World.addGameMessage(30, "", var4);
					} else {
						PacketBufferNode var3 = class21.getPacketBufferNode(ClientPacket.field2622, Client.packetWriter.isaacCipher);
						var3.packetBuffer.writeByte(Tiles.stringCp1252NullTerminatedByteSize(var1));
						var3.packetBuffer.writeStringCp1252NullTerminated(var1);
						Client.packetWriter.addNode(var3);
					}
				}
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1390615002"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field759 != 1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "752053487"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsList.removeByUsername(var2)) {
					Decimator.method1071();
					PacketBufferNode var3 = class21.getPacketBufferNode(ClientPacket.field2671, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(Tiles.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}

				Varps.method4647();
			}
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1893508939"
	)
	@Export("removeIgnore")
	final void removeIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.ignoreList.removeByUsername(var2)) {
					Decimator.method1071();
					PacketBufferNode var3 = class21.getPacketBufferNode(ClientPacket.field2655, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(Tiles.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}

				MouseRecorder.FriendSystem_invalidateIgnoreds();
			}
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lly;B)Z",
		garbageValue = "96"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1);
		return var2 != null && var2.hasWorld();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lnb;II)V",
		garbageValue = "-1580432233"
	)
	@Export("updatePlayers")
	static final void updatePlayers(PacketBuffer var0, int var1) {
		int var2 = var0.offset;
		Players.Players_pendingUpdateCount = 0;
		PcmPlayer.method750(var0);

		for (int var3 = 0; var3 < Players.Players_pendingUpdateCount; ++var3) {
			int var4 = Players.Players_pendingUpdateIndices[var3];
			Player var5 = Client.players[var4];
			int var6 = var0.readUnsignedByte();
			if ((var6 & 128) != 0) {
				var6 += var0.readUnsignedByte() << 8;
			}

			byte var7 = -1;
			if ((var6 & 8) != 0) {
				var5.targetIndex = var0.readUnsignedShort();
				if (var5.targetIndex == 65535) {
					var5.targetIndex = -1;
				}
			}

			int var8;
			if ((var6 & 256) != 0) {
				var5.spotAnimation = var0.method6604();
				var8 = var0.method6613();
				var5.field1277 = var8 >> 16;
				var5.field1287 = (var8 & 65535) + Client.cycle;
				var5.spotAnimationFrame = 0;
				var5.spotAnimationFrameCycle = 0;
				if (var5.field1287 > Client.cycle) {
					var5.spotAnimationFrame = -1;
				}

				if (var5.spotAnimation == 65535) {
					var5.spotAnimation = -1;
				}
			}

			int var9;
			int var11;
			int var12;
			int var15;
			if ((var6 & 16) != 0) {
				var8 = var0.method6549();
				int var10;
				int var13;
				int var18;
				if (var8 > 0) {
					for (var9 = 0; var9 < var8; ++var9) {
						var11 = -1;
						var12 = -1;
						var13 = -1;
						var10 = var0.readUShortSmart();
						if (var10 == 32767) {
							var10 = var0.readUShortSmart();
							var12 = var0.readUShortSmart();
							var11 = var0.readUShortSmart();
							var13 = var0.readUShortSmart();
						} else if (var10 != 32766) {
							var12 = var0.readUShortSmart();
						} else {
							var10 = -1;
						}

						var18 = var0.readUShortSmart();
						var5.addHitSplat(var10, var12, var11, var13, Client.cycle, var18);
					}
				}

				var9 = var0.readUnsignedByte();
				if (var9 > 0) {
					for (var10 = 0; var10 < var9; ++var10) {
						var11 = var0.readUShortSmart();
						var12 = var0.readUShortSmart();
						if (var12 != 32767) {
							var13 = var0.readUShortSmart();
							var18 = var0.method6671();
							var15 = var12 > 0 ? var0.method6595() : var18;
							var5.addHealthBar(var11, Client.cycle, var12, var13, var18, var15);
						} else {
							var5.removeHealthBar(var11);
						}
					}
				}
			}

			if ((var6 & 1) != 0) {
				var5.field1264 = var0.method6605();
				if (var5.pathLength == 0) {
					var5.orientation = var5.field1264;
					var5.field1264 = -1;
				}
			}

			if ((var6 & 2048) != 0) {
				Players.field1373[var4] = var0.method6593();
			}

			if ((var6 & 512) != 0) {
				for (var8 = 0; var8 < 3; ++var8) {
					var5.actions[var8] = var0.readStringCp1252NullTerminated();
				}
			}

			if ((var6 & 8192) != 0) {
				var5.field1278 = var0.method6559();
				var5.field1280 = var0.method6597();
				var5.field1269 = var0.method6597();
				var5.field1238 = var0.method6593();
				var5.field1265 = var0.readUnsignedShort() + Client.cycle;
				var5.field1283 = var0.method6604() + Client.cycle;
				var5.field1284 = var0.method6605();
				if (var5.field1218) {
					var5.field1278 += var5.tileX;
					var5.field1280 += var5.tileY;
					var5.field1269 += var5.tileX;
					var5.field1238 += var5.tileY;
					var5.pathLength = 0;
				} else {
					var5.field1278 += var5.pathX[0];
					var5.field1280 += var5.pathY[0];
					var5.field1269 += var5.pathX[0];
					var5.field1238 += var5.pathY[0];
					var5.pathLength = 1;
				}

				var5.field1274 = 0;
			}

			if ((var6 & 64) != 0) {
				var8 = var0.method6604();
				PlayerType var16 = (PlayerType)Messages.findEnumerated(class372.PlayerType_values(), var0.method6549());
				boolean var20 = var0.method6595() == 1;
				var11 = var0.method6595();
				var12 = var0.offset;
				if (var5.username != null && var5.appearance != null) {
					boolean var21 = false;
					if (var16.isUser && NetSocket.friendSystem.isIgnored(var5.username)) {
						var21 = true;
					}

					if (!var21 && Client.field755 == 0 && !var5.isHidden) {
						Players.field1384.offset = 0;
						var0.method6677(Players.field1384.array, 0, var11);
						Players.field1384.offset = 0;
						String var14 = AbstractFont.escapeBrackets(class43.method433(MusicPatch.method4592(Players.field1384)));
						var5.overheadText = var14.trim();
						var5.overheadTextColor = var8 >> 8;
						var5.overheadTextEffect = var8 & 255;
						var5.overheadTextCyclesRemaining = 150;
						var5.isAutoChatting = var20;
						var5.field1248 = var5 != class93.localPlayer && var16.isUser && "" != Client.field863 && var14.toLowerCase().indexOf(Client.field863) == -1;
						if (var16.isPrivileged) {
							var15 = var20 ? 91 : 1;
						} else {
							var15 = var20 ? 90 : 2;
						}

						if (var16.modIcon != -1) {
							World.addGameMessage(var15, SecureRandomFuture.method1982(var16.modIcon) + var5.username.getName(), var14);
						} else {
							World.addGameMessage(var15, var5.username.getName(), var14);
						}
					}
				}

				var0.offset = var12 + var11;
			}

			if ((var6 & 2) != 0) {
				var8 = var0.method6595();
				byte[] var22 = new byte[var8];
				Buffer var17 = new Buffer(var22);
				var0.method6677(var22, 0, var8);
				Players.field1374[var4] = var17;
				var5.read(var17);
			}

			if ((var6 & 4) != 0) {
				var8 = var0.method6603();
				if (var8 == 65535) {
					var8 = -1;
				}

				var9 = var0.method6595();
				class32.performPlayerAnimation(var5, var8, var9);
			}

			if ((var6 & 4096) != 0) {
				var7 = var0.method6597();
			}

			if ((var6 & 32) != 0) {
				var5.overheadText = var0.readStringCp1252NullTerminated();
				if (var5.overheadText.charAt(0) == '~') {
					var5.overheadText = var5.overheadText.substring(1);
					World.addGameMessage(2, var5.username.getName(), var5.overheadText);
				} else if (var5 == class93.localPlayer) {
					World.addGameMessage(2, var5.username.getName(), var5.overheadText);
				}

				var5.isAutoChatting = false;
				var5.overheadTextColor = 0;
				var5.overheadTextEffect = 0;
				var5.overheadTextCyclesRemaining = 150;
			}

			if (var5.field1218) {
				if (var7 == 127) {
					var5.resetPath(var5.tileX, var5.tileY);
				} else {
					byte var19;
					if (var7 != -1) {
						var19 = var7;
					} else {
						var19 = Players.field1373[var4];
					}

					var5.method2129(var5.tileX, var5.tileY, var19);
				}
			}
		}

		if (var0.offset - var2 != var1) {
			throw new RuntimeException(var0.offset - var2 + " " + var1);
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1063766627"
	)
	public static void method1746() {
		try {
			JagexCache.JagexCache_dat2File.close();

			for (int var0 = 0; var0 < SoundCache.idxCount; ++var0) {
				class93.JagexCache_idxFiles[var0].close();
			}

			JagexCache.JagexCache_idx255File.close();
			JagexCache.JagexCache_randomDat.close();
		} catch (Exception var2) {
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lkt;Lkt;Lkt;B)V",
		garbageValue = "0"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (class32.canvasWidth - 765) / 2;
		Login.loginBoxX = Login.xPadding + 202;
		UserComparator4.loginBoxCenter = Login.loginBoxX + 180;
		byte var3;
		int var4;
		int var12;
		int var25;
		int var26;
		int var32;
		int var41;
		if (Login.worldSelectOpen) {
			if (class337.worldSelectBackSprites == null) {
				class337.worldSelectBackSprites = class369.method6443(GrandExchangeOfferAgeComparator.archive8, "sl_back", "");
			}

			Archive var42;
			IndexedSprite[] var46;
			if (class25.worldSelectFlagSprites == null) {
				var42 = GrandExchangeOfferAgeComparator.archive8;
				var41 = var42.getGroupId("sl_flags");
				var26 = var42.getFileId(var41, "");
				var46 = VerticalAlignment.method2799(var42, var41, var26);
				class25.worldSelectFlagSprites = var46;
			}

			if (HitSplatDefinition.worldSelectArrows == null) {
				var42 = GrandExchangeOfferAgeComparator.archive8;
				var41 = var42.getGroupId("sl_arrows");
				var26 = var42.getFileId(var41, "");
				var46 = VerticalAlignment.method2799(var42, var41, var26);
				HitSplatDefinition.worldSelectArrows = var46;
			}

			if (class18.worldSelectStars == null) {
				var42 = GrandExchangeOfferAgeComparator.archive8;
				var41 = var42.getGroupId("sl_stars");
				var26 = var42.getFileId(var41, "");
				var46 = VerticalAlignment.method2799(var42, var41, var26);
				class18.worldSelectStars = var46;
			}

			if (class19.worldSelectLeftSprite == null) {
				class19.worldSelectLeftSprite = EnumComposition.SpriteBuffer_getIndexedSpriteByName(GrandExchangeOfferAgeComparator.archive8, "leftarrow", "");
			}

			if (WorldMapID.worldSelectRightSprite == null) {
				WorldMapID.worldSelectRightSprite = EnumComposition.SpriteBuffer_getIndexedSpriteByName(GrandExchangeOfferAgeComparator.archive8, "rightarrow", "");
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0);
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624);
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513);
			var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1);
			if (class18.worldSelectStars != null) {
				class18.worldSelectStars[1].drawAt(Login.xPadding + 140, 1);
				var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1);
				class18.worldSelectStars[0].drawAt(Login.xPadding + 140, 12);
				var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1);
			}

			if (HitSplatDefinition.worldSelectArrows != null) {
				var32 = Login.xPadding + 280;
				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) {
					HitSplatDefinition.worldSelectArrows[2].drawAt(var32, 4);
				} else {
					HitSplatDefinition.worldSelectArrows[0].drawAt(var32, 4);
				}

				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) {
					HitSplatDefinition.worldSelectArrows[3].drawAt(var32 + 15, 4);
				} else {
					HitSplatDefinition.worldSelectArrows[1].drawAt(var32 + 15, 4);
				}

				var0.draw("World", var32 + 32, 17, 16777215, -1);
				var4 = Login.xPadding + 390;
				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) {
					HitSplatDefinition.worldSelectArrows[2].drawAt(var4, 4);
				} else {
					HitSplatDefinition.worldSelectArrows[0].drawAt(var4, 4);
				}

				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) {
					HitSplatDefinition.worldSelectArrows[3].drawAt(var4 + 15, 4);
				} else {
					HitSplatDefinition.worldSelectArrows[1].drawAt(var4 + 15, 4);
				}

				var0.draw("Players", var4 + 32, 17, 16777215, -1);
				var41 = Login.xPadding + 500;
				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) {
					HitSplatDefinition.worldSelectArrows[2].drawAt(var41, 4);
				} else {
					HitSplatDefinition.worldSelectArrows[0].drawAt(var41, 4);
				}

				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) {
					HitSplatDefinition.worldSelectArrows[3].drawAt(var41 + 15, 4);
				} else {
					HitSplatDefinition.worldSelectArrows[1].drawAt(var41 + 15, 4);
				}

				var0.draw("Location", var41 + 32, 17, 16777215, -1);
				var26 = Login.xPadding + 610;
				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) {
					HitSplatDefinition.worldSelectArrows[2].drawAt(var26, 4);
				} else {
					HitSplatDefinition.worldSelectArrows[0].drawAt(var26, 4);
				}

				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) {
					HitSplatDefinition.worldSelectArrows[3].drawAt(var26 + 15, 4);
				} else {
					HitSplatDefinition.worldSelectArrows[1].drawAt(var26 + 15, 4);
				}

				var0.draw("Type", var26 + 32, 17, 16777215, -1);
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0);
			var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1);
			Login.hoveredWorldIndex = -1;
			if (class337.worldSelectBackSprites != null) {
				var3 = 88;
				byte var37 = 19;
				var41 = 765 / (var3 + 1) - 1;
				var26 = 480 / (var37 + 1);

				int var35;
				do {
					var25 = var26;
					var35 = var41;
					if (var26 * (var41 - 1) >= World.World_count) {
						--var41;
					}

					if (var41 * (var26 - 1) >= World.World_count) {
						--var26;
					}

					if (var41 * (var26 - 1) >= World.World_count) {
						--var26;
					}
				} while(var26 != var25 || var41 != var35);

				var25 = (765 - var41 * var3) / (var41 + 1);
				if (var25 > 5) {
					var25 = 5;
				}

				var35 = (480 - var37 * var26) / (var26 + 1);
				if (var35 > 5) {
					var35 = 5;
				}

				int var36 = (765 - var41 * var3 - var25 * (var41 - 1)) / 2;
				int var38 = (480 - var37 * var26 - var35 * (var26 - 1)) / 2;
				int var29 = (var26 + World.World_count - 1) / var26;
				Login.worldSelectPagesCount = var29 - var41;
				if (class19.worldSelectLeftSprite != null && Login.worldSelectPage > 0) {
					class19.worldSelectLeftSprite.drawAt(8, ReflectionCheck.canvasHeight / 2 - class19.worldSelectLeftSprite.subHeight / 2);
				}

				if (WorldMapID.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) {
					WorldMapID.worldSelectRightSprite.drawAt(class32.canvasWidth - WorldMapID.worldSelectRightSprite.subWidth - 8, ReflectionCheck.canvasHeight / 2 - WorldMapID.worldSelectRightSprite.subHeight / 2);
				}

				var12 = var38 + 23;
				int var39 = var36 + Login.xPadding;
				int var14 = 0;
				boolean var15 = false;
				int var16 = Login.worldSelectPage;

				int var17;
				for (var17 = var16 * var26; var17 < World.World_count && var16 - Login.worldSelectPage < var41; ++var17) {
					World var18 = Tiles.World_worlds[var17];
					boolean var19 = true;
					String var20 = Integer.toString(var18.population);
					if (var18.population == -1) {
						var20 = "OFF";
						var19 = false;
					} else if (var18.population > 1980) {
						var20 = "FULL";
						var19 = false;
					}

					int var22 = 0;
					byte var21;
					if (var18.isBeta()) {
						if (var18.isMembersOnly()) {
							var21 = 7;
						} else {
							var21 = 6;
						}
					} else if (var18.isDeadman()) {
						var22 = 16711680;
						if (var18.isMembersOnly()) {
							var21 = 5;
						} else {
							var21 = 4;
						}
					} else if (var18.method1643()) {
						if (var18.isMembersOnly()) {
							var21 = 9;
						} else {
							var21 = 8;
						}
					} else if (var18.isPvp()) {
						if (var18.isMembersOnly()) {
							var21 = 3;
						} else {
							var21 = 2;
						}
					} else if (var18.isMembersOnly()) {
						var21 = 1;
					} else {
						var21 = 0;
					}

					if (MouseHandler.MouseHandler_x >= var39 && MouseHandler.MouseHandler_y >= var12 && MouseHandler.MouseHandler_x < var3 + var39 && MouseHandler.MouseHandler_y < var37 + var12 && var19) {
						Login.hoveredWorldIndex = var17;
						class337.worldSelectBackSprites[var21].drawTransOverlayAt(var39, var12, 128, 16777215);
						var15 = true;
					} else {
						class337.worldSelectBackSprites[var21].drawAt(var39, var12);
					}

					if (class25.worldSelectFlagSprites != null) {
						class25.worldSelectFlagSprites[(var18.isMembersOnly() ? 8 : 0) + var18.location].drawAt(var39 + 29, var12);
					}

					var0.drawCentered(Integer.toString(var18.id), var39 + 15, var37 / 2 + var12 + 5, var22, -1);
					var1.drawCentered(var20, var39 + 60, var37 / 2 + var12 + 5, 268435455, -1);
					var12 = var12 + var37 + var35;
					++var14;
					if (var14 >= var26) {
						var12 = var38 + 23;
						var39 = var39 + var3 + var25;
						var14 = 0;
						++var16;
					}
				}

				if (var15) {
					var17 = var1.stringWidth(Tiles.World_worlds[Login.hoveredWorldIndex].activity) + 6;
					int var30 = var1.ascent + 8;
					int var40 = MouseHandler.MouseHandler_y + 25;
					if (var40 + var30 > 480) {
						var40 = MouseHandler.MouseHandler_y - 25 - var30;
					}

					Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var17 / 2, var40, var17, var30, 16777120);
					Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var17 / 2, var40, var17, var30, 0);
					var1.drawCentered(Tiles.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var40 + var1.ascent + 4, 0, -1);
				}
			}

			class26.rasterProvider.drawFull(0, 0);
		} else {
			Login.leftTitleSprite.drawAt(Login.xPadding, 0);
			class20.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			Fonts.logoSprite.drawAt(Login.xPadding + 382 - Fonts.logoSprite.subWidth / 2, 18);
			if (Client.gameState == 0 || Client.gameState == 5) {
				var3 = 20;
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1);
				var4 = 253 - var3;
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4, 304, 34, 9179409);
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4 + 1, 302, 32, 0);
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409);
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150 + Login.Login_loadingPercent * 3, var4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0);
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1);
			}

			String var5;
			String var6;
			short var31;
			short var33;
			if (Client.gameState == 20) {
				class260.titleboxSprite.drawAt(Login.loginBoxX + 180 - class260.titleboxSprite.subWidth / 2, 271 - class260.titleboxSprite.subHeight / 2);
				var31 = 201;
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16776960, 0);
				var32 = var31 + 15;
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16776960, 0);
				var32 += 15;
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16776960, 0);
				var32 += 15;
				var32 += 7;
				if (Login.loginIndex != 4) {
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var32, 16777215, 0);
					var33 = 200;
					var5 = ObjectComposition.clientPreferences.hideUsername ? class6.method67(Login.Login_username) : Login.Login_username;

					for (var6 = var5; var0.stringWidth(var6) > var33; var6 = var6.substring(0, var6.length() - 1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var6), Login.loginBoxX + 180 - 70, var32, 16777215, 0);
					var32 += 15;

					String var7;
					for (var7 = class6.method67(Login.Login_password); var0.stringWidth(var7) > var33; var7 = var7.substring(1)) {
					}

					var0.draw("Password: " + var7, Login.loginBoxX + 180 - 108, var32, 16777215, 0);
					var32 += 15;
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11) {
				class260.titleboxSprite.drawAt(Login.loginBoxX, 171);
				short var23;
				if (Login.loginIndex == 0) {
					var31 = 251;
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var31, 16776960, 0);
					var32 = var31 + 30;
					var4 = Login.loginBoxX + 180 - 80;
					var23 = 291;
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawLines("New User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					var4 = Login.loginBoxX + 180 + 80;
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawLines("Existing User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0);
				} else if (Login.loginIndex == 1) {
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0);
					var31 = 236;
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16777215, 0);
					var32 = var31 + 15;
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16777215, 0);
					var32 += 15;
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16777215, 0);
					var32 += 15;
					var4 = Login.loginBoxX + 180 - 80;
					var23 = 321;
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawCentered("Continue", var4, var23 + 5, 16777215, 0);
					var4 = Login.loginBoxX + 180 + 80;
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawCentered("Cancel", var4, var23 + 5, 16777215, 0);
				} else if (Login.loginIndex == 2) {
					var31 = 201;
					var0.drawCentered(Login.Login_response1, UserComparator4.loginBoxCenter, var31, 16776960, 0);
					var32 = var31 + 15;
					var0.drawCentered(Login.Login_response2, UserComparator4.loginBoxCenter, var32, 16776960, 0);
					var32 += 15;
					var0.drawCentered(Login.Login_response3, UserComparator4.loginBoxCenter, var32, 16776960, 0);
					var32 += 15;
					var32 += 7;
					var0.draw("Login: ", UserComparator4.loginBoxCenter - 110, var32, 16777215, 0);
					var33 = 200;

					for (var5 = ScriptEvent.method2086(); var0.stringWidth(var5) > var33; var5 = var5.substring(1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var5) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? class44.colorStartTag(16776960) + "|" : ""), UserComparator4.loginBoxCenter - 70, var32, 16777215, 0);
					var32 += 15;

					for (var6 = class6.method67(Login.Login_password); var0.stringWidth(var6) > var33; var6 = var6.substring(1)) {
					}

					var0.draw("Password: " + var6 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? class44.colorStartTag(16776960) + "|" : ""), UserComparator4.loginBoxCenter - 108, var32, 16777215, 0);
					var32 += 15;
					var31 = 277;
					var25 = UserComparator4.loginBoxCenter + -117;
					boolean var9 = Client.Login_isUsernameRemembered;
					boolean var10 = Login.field1041;
					IndexedSprite var27 = var9 ? (var10 ? class3.field33 : GrandExchangeOffer.options_buttons_2Sprite) : (var10 ? Decimator.field553 : options_buttons_0Sprite);
					var27.drawAt(var25, var31);
					var25 = var25 + var27.subWidth + 5;
					var1.draw("Remember username", var25, var31 + 13, 16776960, 0);
					var25 = UserComparator4.loginBoxCenter + 24;
					IndexedSprite var11 = Script.method1995(ObjectComposition.clientPreferences.hideUsername, Login.field1047);
					var11.drawAt(var25, var31);
					var25 = var25 + var11.subWidth + 5;
					var1.draw("Hide username", var25, var31 + 13, 16776960, 0);
					var32 = var31 + 15;
					var12 = UserComparator4.loginBoxCenter - 80;
					short var13 = 321;
					Login.titlebuttonSprite.drawAt(var12 - 73, var13 - 20);
					var0.drawCentered("Login", var12, var13 + 5, 16777215, 0);
					var12 = UserComparator4.loginBoxCenter + 80;
					Login.titlebuttonSprite.drawAt(var12 - 73, var13 - 20);
					var0.drawCentered("Cancel", var12, var13 + 5, 16777215, 0);
					var31 = 357;
					switch(Login.field1039) {
					case 2:
						MusicPatchPcmStream.field2885 = "Having trouble logging in?";
						break;
					default:
						MusicPatchPcmStream.field2885 = "Can't login? Click here.";
					}

					DynamicObject.field1107 = new Bounds(UserComparator4.loginBoxCenter, var31, var1.stringWidth(MusicPatchPcmStream.field2885), 11);
					GrandExchangeOfferOwnWorldComparator.field631 = new Bounds(UserComparator4.loginBoxCenter, var31, var1.stringWidth("Still having trouble logging in?"), 11);
					var1.drawCentered(MusicPatchPcmStream.field2885, UserComparator4.loginBoxCenter, var31, 16777215, 0);
				} else if (Login.loginIndex == 3) {
					var31 = 201;
					var0.drawCentered("Invalid credentials.", Login.loginBoxX + 180, var31, 16776960, 0);
					var32 = var31 + 20;
					var1.drawCentered("For accounts created after 24th November 2010, please use your", Login.loginBoxX + 180, var32, 16776960, 0);
					var32 += 15;
					var1.drawCentered("email address to login. Otherwise please login with your username.", Login.loginBoxX + 180, var32, 16776960, 0);
					var32 += 15;
					var4 = Login.loginBoxX + 180;
					var23 = 276;
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var2.drawCentered("Try again", var4, var23 + 5, 16777215, 0);
					var4 = Login.loginBoxX + 180;
					var23 = 326;
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var2.drawCentered("Forgotten password?", var4, var23 + 5, 16777215, 0);
				} else {
					short var8;
					if (Login.loginIndex == 4) {
						var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0);
						var31 = 236;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16777215, 0);
						var32 = var31 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16777215, 0);
						var32 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16777215, 0);
						var32 += 15;
						var0.draw("PIN: " + class6.method67(Varps.otp) + (Client.cycle % 40 < 20 ? class44.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var32, 16777215, 0);
						var32 -= 8;
						var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var32, 16776960, 0);
						var32 += 15;
						var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var32, 16776960, 0);
						var4 = Login.loginBoxX + 180 - 9 + var0.stringWidth("for 30 days: ") + 15;
						var41 = var32 - var0.ascent;
						IndexedSprite var34;
						if (Login.field1043) {
							var34 = GrandExchangeOffer.options_buttons_2Sprite;
						} else {
							var34 = options_buttons_0Sprite;
						}

						var34.drawAt(var4, var41);
						var32 += 15;
						var25 = Login.loginBoxX + 180 - 80;
						var8 = 321;
						Login.titlebuttonSprite.drawAt(var25 - 73, var8 - 20);
						var0.drawCentered("Continue", var25, var8 + 5, 16777215, 0);
						var25 = Login.loginBoxX + 180 + 80;
						Login.titlebuttonSprite.drawAt(var25 - 73, var8 - 20);
						var0.drawCentered("Cancel", var25, var8 + 5, 16777215, 0);
						var1.drawCentered("<u=ff>Can't Log In?</u>", Login.loginBoxX + 180, var8 + 36, 255, 0);
					} else if (Login.loginIndex == 5) {
						var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0);
						var31 = 221;
						var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16776960, 0);
						var32 = var31 + 15;
						var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var32 += 14;
						var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var32, 16777215, 0);
						var33 = 174;

						for (var5 = ScriptEvent.method2086(); var0.stringWidth(var5) > var33; var5 = var5.substring(1)) {
						}

						var0.draw(AbstractFont.escapeBrackets(var5) + (Client.cycle % 40 < 20 ? class44.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var32, 16777215, 0);
						var32 += 15;
						var26 = Login.loginBoxX + 180 - 80;
						short var45 = 321;
						Login.titlebuttonSprite.drawAt(var26 - 73, var45 - 20);
						var0.drawCentered("Recover", var26, var45 + 5, 16777215, 0);
						var26 = Login.loginBoxX + 180 + 80;
						Login.titlebuttonSprite.drawAt(var26 - 73, var45 - 20);
						var0.drawCentered("Back", var26, var45 + 5, 16777215, 0);
						var45 = 356;
						var1.drawCentered("Still having trouble logging in?", UserComparator4.loginBoxCenter, var45, 268435455, 0);
					} else if (Login.loginIndex == 6) {
						var31 = 201;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16776960, 0);
						var32 = var31 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var4 = Login.loginBoxX + 180;
						var23 = 321;
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 7) {
						var31 = 216;
						var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var31, 16776960, 0);
						var32 = var31 + 15;
						var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var4 = Login.loginBoxX + 180 - 80;
						var23 = 321;
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180 + 80;
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 8) {
						var31 = 216;
						var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var31, 16776960, 0);
						var32 = var31 + 15;
						var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var4 = Login.loginBoxX + 180 - 80;
						var23 = 321;
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Privacy Policy", var4, var23 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180 + 80;
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 12) {
						var31 = 201;
						String var24 = "";
						var5 = "";
						var6 = "";
						switch(Login.field1032) {
						case 0:
							var24 = "Your account has been disabled.";
							var5 = Strings.field3306;
							var6 = "";
							break;
						case 1:
							var24 = "Account locked as we suspect it has been stolen.";
							var5 = Strings.field3327;
							var6 = "";
							break;
						default:
							class9.Login_promptCredentials(false);
						}

						var0.drawCentered(var24, Login.loginBoxX + 180, var31, 16776960, 0);
						var32 = var31 + 15;
						var2.drawCentered(var5, Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var2.drawCentered(var6, Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var25 = Login.loginBoxX + 180;
						var8 = 276;
						Login.titlebuttonSprite.drawAt(var25 - 73, var8 - 20);
						var0.drawCentered("Support Page", var25, var8 + 5, 16777215, 0);
						var25 = Login.loginBoxX + 180;
						var8 = 326;
						Login.titlebuttonSprite.drawAt(var25 - 73, var8 - 20);
						var0.drawCentered("Back", var25, var8 + 5, 16777215, 0);
					} else if (Login.loginIndex == 24) {
						var31 = 221;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16777215, 0);
						var32 = var31 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16777215, 0);
						var32 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16777215, 0);
						var32 += 15;
						var4 = Login.loginBoxX + 180;
						var23 = 301;
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Ok", var4, var23 + 5, 16777215, 0);
					}
				}
			}

			if (Client.gameState >= 10) {
				int[] var28 = new int[4];
				Rasterizer2D.Rasterizer2D_getClipArray(var28);
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, ReflectionCheck.canvasHeight);
				class24.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle);
				class24.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle);
				Rasterizer2D.Rasterizer2D_setClipArray(var28);
			}

			Decimator.title_muteSprite[ObjectComposition.clientPreferences.titleMusicDisabled ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463);
			if (Client.gameState > 5 && Language.Language_EN == class378.clientLanguage) {
				if (class69.field597 != null) {
					var32 = Login.xPadding + 5;
					var33 = 463;
					byte var43 = 100;
					byte var44 = 35;
					class69.field597.drawAt(var32, var33);
					var0.drawCentered("World" + " " + Client.worldId, var43 / 2 + var32, var44 / 2 + var33 - 2, 16777215, 0);
					if (MilliClock.World_request != null) {
						var1.drawCentered("Loading...", var43 / 2 + var32, var44 / 2 + var33 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var43 / 2 + var32, var44 / 2 + var33 + 12, 16777215, 0);
					}
				} else {
					class69.field597 = EnumComposition.SpriteBuffer_getIndexedSpriteByName(GrandExchangeOfferAgeComparator.archive8, "sl_button", "");
				}
			}

		}
	}
}
