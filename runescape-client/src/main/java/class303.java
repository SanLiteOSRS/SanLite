import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("kv")
public final class class303 {
	@ObfuscatedName("af")
	@Export("client")
	@ObfuscatedSignature(
		descriptor = "Lclient;"
	)
	static Client client;

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "64684553"
	)
	@Export("changeWorldSelectSorting")
	static void changeWorldSelectSorting(int var0, int var1) {
		int[] var2 = new int[4];
		int[] var3 = new int[4];
		var2[0] = var0;
		var3[0] = var1;
		int var4 = 1;

		for (int var5 = 0; var5 < 4; ++var5) {
			if (World.World_sortOption1[var5] != var0) {
				var2[var4] = World.World_sortOption1[var5];
				var3[var4] = World.World_sortOption2[var5];
				++var4;
			}
		}

		World.World_sortOption1 = var2;
		World.World_sortOption2 = var3;
		VarcInt.sortWorlds(Messages.World_worlds, 0, Messages.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-120515195"
	)
	@Export("SpriteBuffer_decode")
	static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		var1.offset = var0.length - 2;
		class396.SpriteBuffer_spriteCount = var1.readUnsignedShort();
		class243.SpriteBuffer_xOffsets = new int[class396.SpriteBuffer_spriteCount];
		class396.SpriteBuffer_yOffsets = new int[class396.SpriteBuffer_spriteCount];
		ArchiveDiskActionHandler.SpriteBuffer_spriteWidths = new int[class396.SpriteBuffer_spriteCount];
		class372.SpriteBuffer_spriteHeights = new int[class396.SpriteBuffer_spriteCount];
		class396.SpriteBuffer_pixels = new byte[class396.SpriteBuffer_spriteCount][];
		var1.offset = var0.length - 7 - class396.SpriteBuffer_spriteCount * 8;
		class396.SpriteBuffer_spriteWidth = var1.readUnsignedShort();
		class396.SpriteBuffer_spriteHeight = var1.readUnsignedShort();
		int var2 = (var1.readUnsignedByte() & 255) + 1;

		int var3;
		for (var3 = 0; var3 < class396.SpriteBuffer_spriteCount; ++var3) {
			class243.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class396.SpriteBuffer_spriteCount; ++var3) {
			class396.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class396.SpriteBuffer_spriteCount; ++var3) {
			ArchiveDiskActionHandler.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class396.SpriteBuffer_spriteCount; ++var3) {
			class372.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = var0.length - 7 - class396.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3;
		AccessFile.SpriteBuffer_spritePalette = new int[var2];

		for (var3 = 1; var3 < var2; ++var3) {
			AccessFile.SpriteBuffer_spritePalette[var3] = var1.readMedium();
			if (AccessFile.SpriteBuffer_spritePalette[var3] == 0) {
				AccessFile.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0;

		for (var3 = 0; var3 < class396.SpriteBuffer_spriteCount; ++var3) {
			int var4 = ArchiveDiskActionHandler.SpriteBuffer_spriteWidths[var3];
			int var5 = class372.SpriteBuffer_spriteHeights[var3];
			int var6 = var4 * var5;
			byte[] var7 = new byte[var6];
			class396.SpriteBuffer_pixels[var3] = var7;
			int var8 = var1.readUnsignedByte();
			int var9;
			if (var8 == 0) {
				for (var9 = 0; var9 < var6; ++var9) {
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) {
				for (var9 = 0; var9 < var4; ++var9) {
					for (int var10 = 0; var10 < var5; ++var10) {
						var7[var9 + var10 * var4] = var1.readByte();
					}
				}
			}
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZI)I",
		garbageValue = "-1352766813"
	)
	static int method5379(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) {
			if (GrandExchangeOfferUnitPriceComparator.friendSystem.field920 == 0) {
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = -2;
			} else if (GrandExchangeOfferUnitPriceComparator.friendSystem.field920 == 1) {
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.friendSystem.friendsList.getSize();
			}

			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
				if (GrandExchangeOfferUnitPriceComparator.friendSystem.method1744() && var3 >= 0 && var3 < GrandExchangeOfferUnitPriceComparator.friendSystem.friendsList.getSize()) {
					Friend var8 = (Friend)GrandExchangeOfferUnitPriceComparator.friendSystem.friendsList.get(var3);
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var8.getName();
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var8.getPreviousName();
				} else {
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
				if (GrandExchangeOfferUnitPriceComparator.friendSystem.method1744() && var3 >= 0 && var3 < GrandExchangeOfferUnitPriceComparator.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = ((Buddy)GrandExchangeOfferUnitPriceComparator.friendSystem.friendsList.get(var3)).world;
				} else {
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
				if (GrandExchangeOfferUnitPriceComparator.friendSystem.method1744() && var3 >= 0 && var3 < GrandExchangeOfferUnitPriceComparator.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = ((Buddy)GrandExchangeOfferUnitPriceComparator.friendSystem.friendsList.get(var3)).rank;
				} else {
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
					int var6 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
					ParamComposition.method2825(var5, var6);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
					GrandExchangeOfferUnitPriceComparator.friendSystem.addFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
					GrandExchangeOfferUnitPriceComparator.friendSystem.removeFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
					GrandExchangeOfferUnitPriceComparator.friendSystem.addIgnore(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
					GrandExchangeOfferUnitPriceComparator.friendSystem.removeIgnore(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
					var5 = Canvas.method468(var5);
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.friendSystem.isFriended(new Username(var5, ModeWhere.loginType), false) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (class25.clanChat != null) {
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = class25.clanChat.name;
					} else {
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (class25.clanChat != null) {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = class25.clanChat.getSize();
					} else {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
					if (class25.clanChat != null && var3 < class25.clanChat.getSize()) {
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = class25.clanChat.get(var3).getUsername().getName();
					} else {
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
					if (class25.clanChat != null && var3 < class25.clanChat.getSize()) {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = ((Buddy)class25.clanChat.get(var3)).getWorld();
					} else {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
					if (class25.clanChat != null && var3 < class25.clanChat.getSize()) {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = ((Buddy)class25.clanChat.get(var3)).rank;
					} else {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = class25.clanChat != null ? class25.clanChat.minKick : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
					class280.clanKickUser(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = class25.clanChat != null ? class25.clanChat.rank : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
					Tiles.Clan_joinChat(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					AbstractSocket.Clan_leaveChat();
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!GrandExchangeOfferUnitPriceComparator.friendSystem.method1744()) {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.friendSystem.ignoreList.getSize();
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
					if (GrandExchangeOfferUnitPriceComparator.friendSystem.method1744() && var3 >= 0 && var3 < GrandExchangeOfferUnitPriceComparator.friendSystem.ignoreList.getSize()) {
						Ignored var4 = (Ignored)GrandExchangeOfferUnitPriceComparator.friendSystem.ignoreList.get(var3);
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var4.getName();
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var4.getPreviousName();
					} else {
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
					var5 = Canvas.method468(var5);
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.friendSystem.isIgnored(new Username(var5, ModeWhere.loginType)) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
					if (class25.clanChat != null && var3 < class25.clanChat.getSize() && class25.clanChat.get(var3).getUsername().equals(class35.localPlayer.username)) {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (class25.clanChat != null && class25.clanChat.owner != null) {
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = class25.clanChat.owner;
					} else {
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
					if (class25.clanChat != null && var3 < class25.clanChat.getSize() && ((FriendsChatMember)class25.clanChat.get(var3)).isFriend()) {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						GrandExchangeOfferUnitPriceComparator.friendSystem.friendsList.removeComparator();
						return 1;
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1;
							GrandExchangeOfferUnitPriceComparator.friendSystem.friendsList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1;
							GrandExchangeOfferUnitPriceComparator.friendSystem.friendsList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1;
							GrandExchangeOfferUnitPriceComparator.friendSystem.friendsList.addComparator(new UserComparator3(var7));
							return 1;
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1;
							GrandExchangeOfferUnitPriceComparator.friendSystem.friendsList.addComparator(new UserComparator4(var7));
							return 1;
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1;
							GrandExchangeOfferUnitPriceComparator.friendSystem.friendsList.addComparator(new UserComparator5(var7));
							return 1;
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1;
							GrandExchangeOfferUnitPriceComparator.friendSystem.friendsList.addComparator(new UserComparator6(var7));
							return 1;
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1;
							GrandExchangeOfferUnitPriceComparator.friendSystem.friendsList.addComparator(new UserComparator7(var7));
							return 1;
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1;
							GrandExchangeOfferUnitPriceComparator.friendSystem.friendsList.addComparator(new UserComparator8(var7));
							return 1;
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1;
							GrandExchangeOfferUnitPriceComparator.friendSystem.friendsList.addComparator(new UserComparator9(var7));
							return 1;
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1;
							GrandExchangeOfferUnitPriceComparator.friendSystem.friendsList.addComparator(new UserComparator10(var7));
							return 1;
						} else if (var0 == 3639) {
							GrandExchangeOfferUnitPriceComparator.friendSystem.friendsList.sort();
							return 1;
						} else if (var0 == 3640) {
							GrandExchangeOfferUnitPriceComparator.friendSystem.ignoreList.removeComparator();
							return 1;
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1;
							GrandExchangeOfferUnitPriceComparator.friendSystem.ignoreList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1;
							GrandExchangeOfferUnitPriceComparator.friendSystem.ignoreList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3643) {
							GrandExchangeOfferUnitPriceComparator.friendSystem.ignoreList.sort();
							return 1;
						} else if (var0 == 3644) {
							if (class25.clanChat != null) {
								class25.clanChat.removeComparator();
							}

							return 1;
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1;
							if (class25.clanChat != null) {
								class25.clanChat.addComparator(new UserComparator1(var7));
							}

							return 1;
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1;
							if (class25.clanChat != null) {
								class25.clanChat.addComparator(new UserComparator2(var7));
							}

							return 1;
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1;
							if (class25.clanChat != null) {
								class25.clanChat.addComparator(new UserComparator3(var7));
							}

							return 1;
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1;
							if (class25.clanChat != null) {
								class25.clanChat.addComparator(new UserComparator4(var7));
							}

							return 1;
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1;
							if (class25.clanChat != null) {
								class25.clanChat.addComparator(new UserComparator5(var7));
							}

							return 1;
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1;
							if (class25.clanChat != null) {
								class25.clanChat.addComparator(new UserComparator6(var7));
							}

							return 1;
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1;
							if (class25.clanChat != null) {
								class25.clanChat.addComparator(new UserComparator7(var7));
							}

							return 1;
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1;
							if (class25.clanChat != null) {
								class25.clanChat.addComparator(new UserComparator8(var7));
							}

							return 1;
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1;
							if (class25.clanChat != null) {
								class25.clanChat.addComparator(new UserComparator9(var7));
							}

							return 1;
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1;
							if (class25.clanChat != null) {
								class25.clanChat.addComparator(new UserComparator10(var7));
							}

							return 1;
						} else if (var0 == 3655) {
							if (class25.clanChat != null) {
								class25.clanChat.sort();
							}

							return 1;
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1;
							GrandExchangeOfferUnitPriceComparator.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7));
							return 1;
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1;
							if (class25.clanChat != null) {
								class25.clanChat.addComparator(new BuddyRankComparator(var7));
							}

							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
					if (class25.clanChat != null && var3 < class25.clanChat.getSize() && ((FriendsChatMember)class25.clanChat.get(var3)).isIgnored()) {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				}
			}
		}
	}
}
