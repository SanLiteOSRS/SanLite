import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ho")
@Implements("SpriteMask")
public class SpriteMask extends DualNode {
	@ObfuscatedName("rl")
	@ObfuscatedGetter(
		intValue = -1921410783
	)
	static int field2542;
	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		signature = "[Lle;"
	)
	@Export("modIconSprites")
	static IndexedSprite[] modIconSprites;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 387841137
	)
	@Export("width")
	public final int width;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1259434667
	)
	@Export("height")
	public final int height;
	@ObfuscatedName("l")
	@Export("xWidths")
	public final int[] xWidths;
	@ObfuscatedName("m")
	@Export("xStarts")
	public final int[] xStarts;

	SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.width = var1;
		this.height = var2;
		this.xWidths = var3;
		this.xStarts = var4;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(IIB)Z",
		garbageValue = "92"
	)
	@Export("contains")
	public boolean contains(int var1, int var2) {
		if (var2 >= 0 && var2 < this.xStarts.length) {
			int var3 = this.xStarts[var2];
			if (var1 >= var3 && var1 <= var3 + this.xWidths[var2]) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		signature = "(ILco;ZI)I",
		garbageValue = "-239225469"
	)
	static int method4119(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) {
			if (WorldMapLabelSize.friendSystem.loadingProgress == 0) {
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -2;
			} else if (WorldMapLabelSize.friendSystem.loadingProgress == 1) {
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = WorldMapLabelSize.friendSystem.friendsList.getSize();
			}

			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
				if (WorldMapLabelSize.friendSystem.method1958() && var3 >= 0 && var3 < WorldMapLabelSize.friendSystem.friendsList.getSize()) {
					Friend var8 = (Friend)WorldMapLabelSize.friendSystem.friendsList.get(var3);
					Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var8.getName();
					Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var8.getPreviousName();
				} else {
					Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
				if (WorldMapLabelSize.friendSystem.method1958() && var3 >= 0 && var3 < WorldMapLabelSize.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = ((Buddy)WorldMapLabelSize.friendSystem.friendsList.get(var3)).world;
				} else {
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
				if (WorldMapLabelSize.friendSystem.method1958() && var3 >= 0 && var3 < WorldMapLabelSize.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = ((Buddy)WorldMapLabelSize.friendSystem.friendsList.get(var3)).rank;
				} else {
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize];
					int var6 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
					GameEngine.method1138(var5, var6);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize];
					WorldMapLabelSize.friendSystem.addFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize];
					WorldMapLabelSize.friendSystem.removeFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize];
					WorldMapLabelSize.friendSystem.addIgnore(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize];
					WorldMapLabelSize.friendSystem.removeIgnore(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize];
					var5 = GrandExchangeOfferUnitPriceComparator.method218(var5);
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = WorldMapLabelSize.friendSystem.isFriended(new Username(var5, UserComparator4.loginType), false) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (DevicePcmPlayerProvider.clanChat != null) {
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = DevicePcmPlayerProvider.clanChat.name;
					} else {
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (DevicePcmPlayerProvider.clanChat != null) {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = DevicePcmPlayerProvider.clanChat.getSize();
					} else {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
					if (DevicePcmPlayerProvider.clanChat != null && var3 < DevicePcmPlayerProvider.clanChat.getSize()) {
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = DevicePcmPlayerProvider.clanChat.get(var3).getUsername().getName();
					} else {
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
					if (DevicePcmPlayerProvider.clanChat != null && var3 < DevicePcmPlayerProvider.clanChat.getSize()) {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = ((Buddy)DevicePcmPlayerProvider.clanChat.get(var3)).getWorld();
					} else {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
					if (DevicePcmPlayerProvider.clanChat != null && var3 < DevicePcmPlayerProvider.clanChat.getSize()) {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = ((Buddy)DevicePcmPlayerProvider.clanChat.get(var3)).rank;
					} else {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = DevicePcmPlayerProvider.clanChat != null ? DevicePcmPlayerProvider.clanChat.minKick : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize];
					ScriptFrame.clanKickUser(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = DevicePcmPlayerProvider.clanChat != null ? DevicePcmPlayerProvider.clanChat.rank : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize];
					Message.Clan_joinChat(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					class1.Clan_leaveChat();
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!WorldMapLabelSize.friendSystem.method1958()) {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = WorldMapLabelSize.friendSystem.ignoreList.getSize();
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
					if (WorldMapLabelSize.friendSystem.method1958() && var3 >= 0 && var3 < WorldMapLabelSize.friendSystem.ignoreList.getSize()) {
						Ignored var4 = (Ignored)WorldMapLabelSize.friendSystem.ignoreList.get(var3);
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var4.getName();
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var4.getPreviousName();
					} else {
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize];
					var5 = GrandExchangeOfferUnitPriceComparator.method218(var5);
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = WorldMapLabelSize.friendSystem.isIgnored(new Username(var5, UserComparator4.loginType)) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
					if (DevicePcmPlayerProvider.clanChat != null && var3 < DevicePcmPlayerProvider.clanChat.getSize() && DevicePcmPlayerProvider.clanChat.get(var3).getUsername().equals(PlayerType.localPlayer.username)) {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (DevicePcmPlayerProvider.clanChat != null && DevicePcmPlayerProvider.clanChat.owner != null) {
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = DevicePcmPlayerProvider.clanChat.owner;
					} else {
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
					if (DevicePcmPlayerProvider.clanChat != null && var3 < DevicePcmPlayerProvider.clanChat.getSize() && ((FriendsChatMember)DevicePcmPlayerProvider.clanChat.get(var3)).isFriend()) {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						WorldMapLabelSize.friendSystem.friendsList.removeComparator();
						return 1;
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1;
							WorldMapLabelSize.friendSystem.friendsList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1;
							WorldMapLabelSize.friendSystem.friendsList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1;
							WorldMapLabelSize.friendSystem.friendsList.addComparator(new UserComparator3(var7));
							return 1;
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1;
							WorldMapLabelSize.friendSystem.friendsList.addComparator(new UserComparator4(var7));
							return 1;
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1;
							WorldMapLabelSize.friendSystem.friendsList.addComparator(new UserComparator5(var7));
							return 1;
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1;
							WorldMapLabelSize.friendSystem.friendsList.addComparator(new UserComparator6(var7));
							return 1;
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1;
							WorldMapLabelSize.friendSystem.friendsList.addComparator(new UserComparator7(var7));
							return 1;
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1;
							WorldMapLabelSize.friendSystem.friendsList.addComparator(new UserComparator8(var7));
							return 1;
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1;
							WorldMapLabelSize.friendSystem.friendsList.addComparator(new UserComparator9(var7));
							return 1;
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1;
							WorldMapLabelSize.friendSystem.friendsList.addComparator(new UserComparator10(var7));
							return 1;
						} else if (var0 == 3639) {
							WorldMapLabelSize.friendSystem.friendsList.sort();
							return 1;
						} else if (var0 == 3640) {
							WorldMapLabelSize.friendSystem.ignoreList.removeComparator();
							return 1;
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1;
							WorldMapLabelSize.friendSystem.ignoreList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1;
							WorldMapLabelSize.friendSystem.ignoreList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3643) {
							WorldMapLabelSize.friendSystem.ignoreList.sort();
							return 1;
						} else if (var0 == 3644) {
							if (DevicePcmPlayerProvider.clanChat != null) {
								DevicePcmPlayerProvider.clanChat.removeComparator();
							}

							return 1;
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1;
							if (DevicePcmPlayerProvider.clanChat != null) {
								DevicePcmPlayerProvider.clanChat.addComparator(new UserComparator1(var7));
							}

							return 1;
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1;
							if (DevicePcmPlayerProvider.clanChat != null) {
								DevicePcmPlayerProvider.clanChat.addComparator(new UserComparator2(var7));
							}

							return 1;
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1;
							if (DevicePcmPlayerProvider.clanChat != null) {
								DevicePcmPlayerProvider.clanChat.addComparator(new UserComparator3(var7));
							}

							return 1;
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1;
							if (DevicePcmPlayerProvider.clanChat != null) {
								DevicePcmPlayerProvider.clanChat.addComparator(new UserComparator4(var7));
							}

							return 1;
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1;
							if (DevicePcmPlayerProvider.clanChat != null) {
								DevicePcmPlayerProvider.clanChat.addComparator(new UserComparator5(var7));
							}

							return 1;
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1;
							if (DevicePcmPlayerProvider.clanChat != null) {
								DevicePcmPlayerProvider.clanChat.addComparator(new UserComparator6(var7));
							}

							return 1;
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1;
							if (DevicePcmPlayerProvider.clanChat != null) {
								DevicePcmPlayerProvider.clanChat.addComparator(new UserComparator7(var7));
							}

							return 1;
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1;
							if (DevicePcmPlayerProvider.clanChat != null) {
								DevicePcmPlayerProvider.clanChat.addComparator(new UserComparator8(var7));
							}

							return 1;
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1;
							if (DevicePcmPlayerProvider.clanChat != null) {
								DevicePcmPlayerProvider.clanChat.addComparator(new UserComparator9(var7));
							}

							return 1;
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1;
							if (DevicePcmPlayerProvider.clanChat != null) {
								DevicePcmPlayerProvider.clanChat.addComparator(new UserComparator10(var7));
							}

							return 1;
						} else if (var0 == 3655) {
							if (DevicePcmPlayerProvider.clanChat != null) {
								DevicePcmPlayerProvider.clanChat.sort();
							}

							return 1;
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1;
							WorldMapLabelSize.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7));
							return 1;
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1;
							if (DevicePcmPlayerProvider.clanChat != null) {
								DevicePcmPlayerProvider.clanChat.addComparator(new BuddyRankComparator(var7));
							}

							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
					if (DevicePcmPlayerProvider.clanChat != null && var3 < DevicePcmPlayerProvider.clanChat.getSize() && ((FriendsChatMember)DevicePcmPlayerProvider.clanChat.get(var3)).isIgnored()) {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;B)I",
		garbageValue = "1"
	)
	@Export("stringCp1252NullTerminatedByteSize")
	public static int stringCp1252NullTerminatedByteSize(String var0) {
		return var0.length() + 1;
	}
}
