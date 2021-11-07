import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("el")
public class class139 extends class132 {
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	@Export("NetCache_reference")
	public static Buffer NetCache_reference;
	@ObfuscatedName("i")
	String field1526;
	@ObfuscatedName("w")
	byte field1527;
	@ObfuscatedName("s")
	byte field1528;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leh;"
	)
	final class133 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leh;)V"
	)
	class139(class133 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "-1393452113"
	)
	void vmethod2839(Buffer var1) {
		this.field1526 = var1.readStringCp1252NullTerminatedOrNull();
		if (this.field1526 != null) {
			var1.readUnsignedByte();
			this.field1527 = var1.readByte();
			this.field1528 = var1.readByte();
		}

	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lea;I)V",
		garbageValue = "-1714930149"
	)
	void vmethod2838(ClanChannel var1) {
		var1.name = this.field1526;
		if (this.field1526 != null) {
			var1.field1516 = this.field1527;
			var1.field1511 = this.field1528;
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZI)I",
		garbageValue = "-907104971"
	)
	static int method2837(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) {
			if (class112.friendSystem.field765 == 0) {
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -2;
			} else if (class112.friendSystem.field765 == 1) {
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = class112.friendSystem.friendsList.getSize();
			}

			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
				if (class112.friendSystem.method1757() && var3 >= 0 && var3 < class112.friendSystem.friendsList.getSize()) {
					Friend var8 = (Friend)class112.friendSystem.friendsList.get(var3);
					Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var8.getName();
					Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var8.getPreviousName();
				} else {
					Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
				if (class112.friendSystem.method1757() && var3 >= 0 && var3 < class112.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = ((Buddy)class112.friendSystem.friendsList.get(var3)).world;
				} else {
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
				if (class112.friendSystem.method1757() && var3 >= 0 && var3 < class112.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = ((Buddy)class112.friendSystem.friendsList.get(var3)).rank;
				} else {
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize];
					int var6 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
					class11.method107(var5, var6);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize];
					class112.friendSystem.addFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize];
					class112.friendSystem.removeFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize];
					class112.friendSystem.addIgnore(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize];
					class112.friendSystem.removeIgnore(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize];
					var5 = WallDecoration.method4643(var5);
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = class112.friendSystem.isFriended(new Username(var5, GrandExchangeOfferUnitPriceComparator.loginType), false) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (AbstractArchive.friendsChatManager != null) {
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = AbstractArchive.friendsChatManager.name;
					} else {
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (AbstractArchive.friendsChatManager != null) {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = AbstractArchive.friendsChatManager.getSize();
					} else {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
					if (AbstractArchive.friendsChatManager != null && var3 < AbstractArchive.friendsChatManager.getSize()) {
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = AbstractArchive.friendsChatManager.get(var3).getUsername().getName();
					} else {
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
					if (AbstractArchive.friendsChatManager != null && var3 < AbstractArchive.friendsChatManager.getSize()) {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = ((Buddy)AbstractArchive.friendsChatManager.get(var3)).getWorld();
					} else {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
					if (AbstractArchive.friendsChatManager != null && var3 < AbstractArchive.friendsChatManager.getSize()) {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = ((Buddy)AbstractArchive.friendsChatManager.get(var3)).rank;
					} else {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = AbstractArchive.friendsChatManager != null ? AbstractArchive.friendsChatManager.minKick : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize];
					Player.clanKickUser(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = AbstractArchive.friendsChatManager != null ? AbstractArchive.friendsChatManager.rank : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize];
					GrandExchangeOfferOwnWorldComparator.Clan_joinChat(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					class21.Clan_leaveChat();
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!class112.friendSystem.method1757()) {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = class112.friendSystem.ignoreList.getSize();
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
					if (class112.friendSystem.method1757() && var3 >= 0 && var3 < class112.friendSystem.ignoreList.getSize()) {
						Ignored var4 = (Ignored)class112.friendSystem.ignoreList.get(var3);
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var4.getName();
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var4.getPreviousName();
					} else {
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize];
					var5 = WallDecoration.method4643(var5);
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = class112.friendSystem.isIgnored(new Username(var5, GrandExchangeOfferUnitPriceComparator.loginType)) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
					if (AbstractArchive.friendsChatManager != null && var3 < AbstractArchive.friendsChatManager.getSize() && AbstractArchive.friendsChatManager.get(var3).getUsername().equals(HealthBarDefinition.localPlayer.username)) {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (AbstractArchive.friendsChatManager != null && AbstractArchive.friendsChatManager.owner != null) {
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = AbstractArchive.friendsChatManager.owner;
					} else {
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
					if (AbstractArchive.friendsChatManager != null && var3 < AbstractArchive.friendsChatManager.getSize() && ((FriendsChatMember)AbstractArchive.friendsChatManager.get(var3)).isFriend()) {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						class112.friendSystem.friendsList.removeComparator();
						return 1;
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1;
							class112.friendSystem.friendsList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1;
							class112.friendSystem.friendsList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1;
							class112.friendSystem.friendsList.addComparator(new UserComparator3(var7));
							return 1;
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1;
							class112.friendSystem.friendsList.addComparator(new UserComparator4(var7));
							return 1;
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1;
							class112.friendSystem.friendsList.addComparator(new UserComparator5(var7));
							return 1;
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1;
							class112.friendSystem.friendsList.addComparator(new UserComparator6(var7));
							return 1;
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1;
							class112.friendSystem.friendsList.addComparator(new UserComparator7(var7));
							return 1;
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1;
							class112.friendSystem.friendsList.addComparator(new UserComparator8(var7));
							return 1;
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1;
							class112.friendSystem.friendsList.addComparator(new UserComparator9(var7));
							return 1;
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1;
							class112.friendSystem.friendsList.addComparator(new UserComparator10(var7));
							return 1;
						} else if (var0 == 3639) {
							class112.friendSystem.friendsList.sort();
							return 1;
						} else if (var0 == 3640) {
							class112.friendSystem.ignoreList.removeComparator();
							return 1;
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1;
							class112.friendSystem.ignoreList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1;
							class112.friendSystem.ignoreList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3643) {
							class112.friendSystem.ignoreList.sort();
							return 1;
						} else if (var0 == 3644) {
							if (AbstractArchive.friendsChatManager != null) {
								AbstractArchive.friendsChatManager.removeComparator();
							}

							return 1;
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1;
							if (AbstractArchive.friendsChatManager != null) {
								AbstractArchive.friendsChatManager.addComparator(new UserComparator1(var7));
							}

							return 1;
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1;
							if (AbstractArchive.friendsChatManager != null) {
								AbstractArchive.friendsChatManager.addComparator(new UserComparator2(var7));
							}

							return 1;
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1;
							if (AbstractArchive.friendsChatManager != null) {
								AbstractArchive.friendsChatManager.addComparator(new UserComparator3(var7));
							}

							return 1;
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1;
							if (AbstractArchive.friendsChatManager != null) {
								AbstractArchive.friendsChatManager.addComparator(new UserComparator4(var7));
							}

							return 1;
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1;
							if (AbstractArchive.friendsChatManager != null) {
								AbstractArchive.friendsChatManager.addComparator(new UserComparator5(var7));
							}

							return 1;
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1;
							if (AbstractArchive.friendsChatManager != null) {
								AbstractArchive.friendsChatManager.addComparator(new UserComparator6(var7));
							}

							return 1;
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1;
							if (AbstractArchive.friendsChatManager != null) {
								AbstractArchive.friendsChatManager.addComparator(new UserComparator7(var7));
							}

							return 1;
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1;
							if (AbstractArchive.friendsChatManager != null) {
								AbstractArchive.friendsChatManager.addComparator(new UserComparator8(var7));
							}

							return 1;
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1;
							if (AbstractArchive.friendsChatManager != null) {
								AbstractArchive.friendsChatManager.addComparator(new UserComparator9(var7));
							}

							return 1;
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1;
							if (AbstractArchive.friendsChatManager != null) {
								AbstractArchive.friendsChatManager.addComparator(new UserComparator10(var7));
							}

							return 1;
						} else if (var0 == 3655) {
							if (AbstractArchive.friendsChatManager != null) {
								AbstractArchive.friendsChatManager.sort();
							}

							return 1;
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1;
							class112.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7));
							return 1;
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1;
							if (AbstractArchive.friendsChatManager != null) {
								AbstractArchive.friendsChatManager.addComparator(new BuddyRankComparator(var7));
							}

							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
					if (AbstractArchive.friendsChatManager != null && var3 < AbstractArchive.friendsChatManager.getSize() && ((FriendsChatMember)AbstractArchive.friendsChatManager.get(var3)).isIgnored()) {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZI)I",
		garbageValue = "-1892812009"
	)
	static int method2845(int var0, Script var1, boolean var2) {
		if (var0 != 7000 && var0 != 7005 && var0 != 7010 && var0 != 7015 && var0 != 7020 && var0 != 7025 && var0 != 7030 && var0 != 7035) {
			if (var0 != 7001 && var0 != 7002 && var0 != 7011 && var0 != 7012 && var0 != 7021 && var0 != 7022) {
				if (var0 != 7003 && var0 != 7013 && var0 != 7023) {
					if (var0 != 7006 && var0 != 7007 && var0 != 7016 && var0 != 7017 && var0 != 7026 && var0 != 7027) {
						if (var0 != 7008 && var0 != 7018 && var0 != 7028) {
							if (var0 != 7031 && var0 != 7032) {
								if (var0 == 7033) {
									--class295.Interpreter_stringStackSize;
									return 1;
								} else if (var0 != 7036 && var0 != 7037) {
									if (var0 == 7038) {
										--class14.Interpreter_intStackSize;
										return 1;
									} else if (var0 != 7004 && var0 != 7009 && var0 != 7014 && var0 != 7019 && var0 != 7024 && var0 != 7029 && var0 != 7034 && var0 != 7039) {
										return 2;
									} else {
										--class14.Interpreter_intStackSize;
										return 1;
									}
								} else {
									class14.Interpreter_intStackSize -= 2;
									return 1;
								}
							} else {
								--class295.Interpreter_stringStackSize;
								--class14.Interpreter_intStackSize;
								return 1;
							}
						} else {
							--class14.Interpreter_intStackSize;
							return 1;
						}
					} else {
						class14.Interpreter_intStackSize -= 2;
						return 1;
					}
				} else {
					class14.Interpreter_intStackSize -= 2;
					return 1;
				}
			} else {
				class14.Interpreter_intStackSize -= 3;
				return 1;
			}
		} else {
			class14.Interpreter_intStackSize -= 5;
			return 1;
		}
	}
}
