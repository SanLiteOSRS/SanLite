import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ae")
public class class26 extends class14 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lbh;"
	)
	@Export("pcmPlayerProvider")
	static class60 pcmPlayerProvider;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Ll;"
	)
	static class11 field220;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	@Export("rasterProvider")
	public static AbstractRasterProvider rasterProvider;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		longValue = 1552499431731106411L
	)
	long field217;
	@ObfuscatedName("n")
	String field218;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1135955153
	)
	int field219;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lf;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lf;)V"
	)
	class26(class2 var1) {
		this.this$0 = var1;
		this.field217 = -1L;
		this.field218 = null;
		this.field219 = 0;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "-1281352827"
	)
	void vmethod276(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field217 = var1.readLong();
		}

		this.field218 = var1.readStringCp1252NullTerminatedOrNull();
		this.field219 = var1.readUnsignedShort();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ll;B)V",
		garbageValue = "29"
	)
	void vmethod281(class11 var1) {
		var1.method103(this.field217, this.field218, this.field219);
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1494621592"
	)
	static final int method272(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "1261558074"
	)
	static int method274(int var0, Script var1, boolean var2) {
		Widget var6;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) {
			int var4;
			if (var0 == 1928) {
				var6 = var2 ? class13.scriptDotWidget : Interpreter.scriptActiveWidget;
				var4 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
				if (var4 >= 1 && var4 <= 10) {
					class376.widgetDefaultMenuAction(var4, var6.id, var6.childIndex, var6.itemId, "");
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == 2928) {
				class44.Interpreter_intStackSize -= 3;
				int var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1];
				int var5 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 2];
				if (var5 >= 1 && var5 <= 10) {
					class376.widgetDefaultMenuAction(var5, var3, var4, Frames.getWidget(var3).itemId, "");
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else {
				return 2;
			}
		} else if (Interpreter.field987 >= 10) {
			throw new RuntimeException();
		} else {
			if (var0 >= 2000) {
				var6 = Frames.getWidget(Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]);
			} else {
				var6 = var2 ? class13.scriptDotWidget : Interpreter.scriptActiveWidget;
			}

			if (var6.onResize == null) {
				return 0;
			} else {
				ScriptEvent var7 = new ScriptEvent();
				var7.widget = var6;
				var7.args = var6.onResize;
				var7.field1180 = Interpreter.field987 + 1;
				Client.scriptEvents.addFirst(var7);
				return 1;
			}
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZB)I",
		garbageValue = "55"
	)
	static int method273(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) {
			if (NetSocket.friendSystem.field941 == 0) {
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -2;
			} else if (NetSocket.friendSystem.field941 == 1) {
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = NetSocket.friendSystem.friendsList.getSize();
			}

			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
				if (NetSocket.friendSystem.method1689() && var3 >= 0 && var3 < NetSocket.friendSystem.friendsList.getSize()) {
					Friend var8 = (Friend)NetSocket.friendSystem.friendsList.get(var3);
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var8.getName();
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var8.getPreviousName();
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
				if (NetSocket.friendSystem.method1689() && var3 >= 0 && var3 < NetSocket.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = ((Buddy)NetSocket.friendSystem.friendsList.get(var3)).world;
				} else {
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
				if (NetSocket.friendSystem.method1689() && var3 >= 0 && var3 < NetSocket.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = ((Buddy)NetSocket.friendSystem.friendsList.get(var3)).rank;
				} else {
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					int var6 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
					VerticalAlignment.method2796(var5, var6);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					NetSocket.friendSystem.addFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					NetSocket.friendSystem.removeFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					NetSocket.friendSystem.addIgnore(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					NetSocket.friendSystem.removeIgnore(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					var5 = class15.method189(var5);
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = NetSocket.friendSystem.isFriended(new Username(var5, WorldMapSection0.loginType), false) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (WorldMapRegion.clanChat != null) {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = WorldMapRegion.clanChat.name;
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (WorldMapRegion.clanChat != null) {
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = WorldMapRegion.clanChat.getSize();
					} else {
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
					if (WorldMapRegion.clanChat != null && var3 < WorldMapRegion.clanChat.getSize()) {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = WorldMapRegion.clanChat.get(var3).getUsername().getName();
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
					if (WorldMapRegion.clanChat != null && var3 < WorldMapRegion.clanChat.getSize()) {
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = ((Buddy)WorldMapRegion.clanChat.get(var3)).getWorld();
					} else {
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
					if (WorldMapRegion.clanChat != null && var3 < WorldMapRegion.clanChat.getSize()) {
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = ((Buddy)WorldMapRegion.clanChat.get(var3)).rank;
					} else {
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = WorldMapRegion.clanChat != null ? WorldMapRegion.clanChat.minKick : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					class105.clanKickUser(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = WorldMapRegion.clanChat != null ? WorldMapRegion.clanChat.rank : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					NPCComposition.Clan_joinChat(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					MouseHandler.Clan_leaveChat();
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!NetSocket.friendSystem.method1689()) {
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = NetSocket.friendSystem.ignoreList.getSize();
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
					if (NetSocket.friendSystem.method1689() && var3 >= 0 && var3 < NetSocket.friendSystem.ignoreList.getSize()) {
						Ignored var4 = (Ignored)NetSocket.friendSystem.ignoreList.get(var3);
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.getName();
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.getPreviousName();
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					var5 = class15.method189(var5);
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = NetSocket.friendSystem.isIgnored(new Username(var5, WorldMapSection0.loginType)) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
					if (WorldMapRegion.clanChat != null && var3 < WorldMapRegion.clanChat.getSize() && WorldMapRegion.clanChat.get(var3).getUsername().equals(class93.localPlayer.username)) {
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (WorldMapRegion.clanChat != null && WorldMapRegion.clanChat.owner != null) {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = WorldMapRegion.clanChat.owner;
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
					if (WorldMapRegion.clanChat != null && var3 < WorldMapRegion.clanChat.getSize() && ((FriendsChatMember)WorldMapRegion.clanChat.get(var3)).isFriend()) {
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						NetSocket.friendSystem.friendsList.removeComparator();
						return 1;
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1;
							NetSocket.friendSystem.friendsList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1;
							NetSocket.friendSystem.friendsList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1;
							NetSocket.friendSystem.friendsList.addComparator(new UserComparator3(var7));
							return 1;
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1;
							NetSocket.friendSystem.friendsList.addComparator(new UserComparator4(var7));
							return 1;
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1;
							NetSocket.friendSystem.friendsList.addComparator(new UserComparator5(var7));
							return 1;
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1;
							NetSocket.friendSystem.friendsList.addComparator(new UserComparator6(var7));
							return 1;
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1;
							NetSocket.friendSystem.friendsList.addComparator(new UserComparator7(var7));
							return 1;
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1;
							NetSocket.friendSystem.friendsList.addComparator(new UserComparator8(var7));
							return 1;
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1;
							NetSocket.friendSystem.friendsList.addComparator(new UserComparator9(var7));
							return 1;
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1;
							NetSocket.friendSystem.friendsList.addComparator(new UserComparator10(var7));
							return 1;
						} else if (var0 == 3639) {
							NetSocket.friendSystem.friendsList.sort();
							return 1;
						} else if (var0 == 3640) {
							NetSocket.friendSystem.ignoreList.removeComparator();
							return 1;
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1;
							NetSocket.friendSystem.ignoreList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1;
							NetSocket.friendSystem.ignoreList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3643) {
							NetSocket.friendSystem.ignoreList.sort();
							return 1;
						} else if (var0 == 3644) {
							if (WorldMapRegion.clanChat != null) {
								WorldMapRegion.clanChat.removeComparator();
							}

							return 1;
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1;
							if (WorldMapRegion.clanChat != null) {
								WorldMapRegion.clanChat.addComparator(new UserComparator1(var7));
							}

							return 1;
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1;
							if (WorldMapRegion.clanChat != null) {
								WorldMapRegion.clanChat.addComparator(new UserComparator2(var7));
							}

							return 1;
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1;
							if (WorldMapRegion.clanChat != null) {
								WorldMapRegion.clanChat.addComparator(new UserComparator3(var7));
							}

							return 1;
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1;
							if (WorldMapRegion.clanChat != null) {
								WorldMapRegion.clanChat.addComparator(new UserComparator4(var7));
							}

							return 1;
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1;
							if (WorldMapRegion.clanChat != null) {
								WorldMapRegion.clanChat.addComparator(new UserComparator5(var7));
							}

							return 1;
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1;
							if (WorldMapRegion.clanChat != null) {
								WorldMapRegion.clanChat.addComparator(new UserComparator6(var7));
							}

							return 1;
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1;
							if (WorldMapRegion.clanChat != null) {
								WorldMapRegion.clanChat.addComparator(new UserComparator7(var7));
							}

							return 1;
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1;
							if (WorldMapRegion.clanChat != null) {
								WorldMapRegion.clanChat.addComparator(new UserComparator8(var7));
							}

							return 1;
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1;
							if (WorldMapRegion.clanChat != null) {
								WorldMapRegion.clanChat.addComparator(new UserComparator9(var7));
							}

							return 1;
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1;
							if (WorldMapRegion.clanChat != null) {
								WorldMapRegion.clanChat.addComparator(new UserComparator10(var7));
							}

							return 1;
						} else if (var0 == 3655) {
							if (WorldMapRegion.clanChat != null) {
								WorldMapRegion.clanChat.sort();
							}

							return 1;
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1;
							NetSocket.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7));
							return 1;
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1;
							if (WorldMapRegion.clanChat != null) {
								WorldMapRegion.clanChat.addComparator(new BuddyRankComparator(var7));
							}

							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
					if (WorldMapRegion.clanChat != null && var3 < WorldMapRegion.clanChat.getSize() && ((FriendsChatMember)WorldMapRegion.clanChat.get(var3)).isIgnored()) {
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				}
			}
		}
	}
}
