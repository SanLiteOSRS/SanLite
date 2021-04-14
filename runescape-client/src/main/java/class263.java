import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jf")
public class class263 {
	@ObfuscatedName("f")
	@Export("spriteMap")
	final HashMap spriteMap;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Llj;"
	)
	@Export("bounds")
	Bounds bounds;
	@ObfuscatedName("u")
	int[] field3334;
	@ObfuscatedName("p")
	int[] field3335;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1919452297
	)
	int field3336;

	public class263() {
		this.spriteMap = new HashMap();
		this.bounds = new Bounds(0, 0);
		this.field3334 = new int[2048];
		this.field3335 = new int[2048];
		this.field3336 = 0;
		Renderable.method3629();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-1364258777"
	)
	void method4654(int var1) {
		int var2 = var1 * 2 + 1;
		double[] var3 = Frames.method3639(0.0D, (double)((float)var1 / 3.0F), var1);
		double var4 = var3[var1] * var3[var1];
		int[] var6 = new int[var2 * var2];
		boolean var7 = false;

		for (int var8 = 0; var8 < var2; ++var8) {
			for (int var9 = 0; var9 < var2; ++var9) {
				int var10 = var6[var9 + var8 * var2] = (int)(var3[var9] * var3[var8] / var4 * 256.0D);
				if (!var7 && var10 > 0) {
					var7 = true;
				}
			}
		}

		SpritePixels var11 = new SpritePixels(var6, var2, var2);
		this.spriteMap.put(var1, var11);
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(II)Loh;",
		garbageValue = "264389909"
	)
	SpritePixels method4665(int var1) {
		if (!this.spriteMap.containsKey(var1)) {
			this.method4654(var1);
		}

		return (SpritePixels)this.spriteMap.get(var1);
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "-176265199"
	)
	public final void method4656(int var1, int var2) {
		if (this.field3336 < this.field3334.length) {
			this.field3334[this.field3336] = var1;
			this.field3335[this.field3336] = var2;
			++this.field3336;
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "50833165"
	)
	public final void method4657() {
		this.field3336 = 0;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(IILoh;FI)V",
		garbageValue = "-1913528659"
	)
	public final void method4658(int var1, int var2, SpritePixels var3, float var4) {
		int var5 = (int)(var4 * 18.0F);
		SpritePixels var6 = this.method4665(var5);
		int var7 = var5 * 2 + 1;
		Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight);
		Bounds var9 = new Bounds(0, 0);
		this.bounds.setHigh(var7, var7);
		System.nanoTime();

		int var10;
		int var11;
		int var12;
		for (var10 = 0; var10 < this.field3336; ++var10) {
			var11 = this.field3334[var10];
			var12 = this.field3335[var10];
			int var13 = (int)((float)(var11 - var1) * var4) - var5;
			int var14 = (int)((float)var3.subHeight - (float)(var12 - var2) * var4) - var5;
			this.bounds.setLow(var13, var14);
			this.bounds.method5954(var8, var9);
			this.method4659(var6, var3, var9);
		}

		System.nanoTime();
		System.nanoTime();

		for (var10 = 0; var10 < var3.pixels.length; ++var10) {
			if (var3.pixels[var10] == 0) {
				var3.pixels[var10] = -16777216;
			} else {
				var11 = (var3.pixels[var10] + 64 - 1) / 256;
				if (var11 <= 0) {
					var3.pixels[var10] = -16777216;
				} else {
					if (var11 > HealthBar.field1311.length) {
						var11 = HealthBar.field1311.length;
					}

					var12 = HealthBar.field1311[var11 - 1];
					var3.pixels[var10] = -16777216 | var12;
				}
			}
		}

		System.nanoTime();
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(Loh;Loh;Llj;I)V",
		garbageValue = "-1779062903"
	)
	void method4659(SpritePixels var1, SpritePixels var2, Bounds var3) {
		if (var3.highX != 0 && var3.highY != 0) {
			int var4 = 0;
			int var5 = 0;
			if (var3.lowX == 0) {
				var4 = var1.subWidth - var3.highX;
			}

			if (var3.lowY == 0) {
				var5 = var1.subHeight - var3.highY;
			}

			int var6 = var4 + var5 * var1.subWidth;
			int var7 = var2.subWidth * var3.lowY + var3.lowX;

			for (int var8 = 0; var8 < var3.highY; ++var8) {
				for (int var9 = 0; var9 < var3.highX; ++var9) {
					int[] var10000 = var2.pixels;
					int var10001 = var7++;
					var10000[var10001] += var1.pixels[var6++];
				}

				var6 += var1.subWidth - var3.highX;
				var7 += var2.subWidth - var3.highX;
			}

		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "(ILcc;ZB)I",
		garbageValue = "-9"
	)
	static int method4666(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) {
			if (class13.friendSystem.loadingProgress == 0) {
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -2;
			} else if (class13.friendSystem.loadingProgress == 1) {
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class13.friendSystem.friendsList.getSize();
			}

			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
				if (class13.friendSystem.method1719() && var3 >= 0 && var3 < class13.friendSystem.friendsList.getSize()) {
					Friend var8 = (Friend)class13.friendSystem.friendsList.get(var3);
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var8.getName();
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var8.getPreviousName();
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
				if (class13.friendSystem.method1719() && var3 >= 0 && var3 < class13.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = ((Buddy)class13.friendSystem.friendsList.get(var3)).world;
				} else {
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
				if (class13.friendSystem.method1719() && var3 >= 0 && var3 < class13.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = ((Buddy)class13.friendSystem.friendsList.get(var3)).rank;
				} else {
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					int var6 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
					KeyHandler.method462(var5, var6);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					class13.friendSystem.addFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					class13.friendSystem.removeFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					class13.friendSystem.addIgnore(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					class13.friendSystem.removeIgnore(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					var5 = class1.method24(var5);
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class13.friendSystem.isFriended(new Username(var5, AbstractUserComparator.loginType), false) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (InterfaceParent.clanChat != null) {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = InterfaceParent.clanChat.name;
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (InterfaceParent.clanChat != null) {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = InterfaceParent.clanChat.getSize();
					} else {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
					if (InterfaceParent.clanChat != null && var3 < InterfaceParent.clanChat.getSize()) {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = InterfaceParent.clanChat.get(var3).getUsername().getName();
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
					if (InterfaceParent.clanChat != null && var3 < InterfaceParent.clanChat.getSize()) {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = ((Buddy)InterfaceParent.clanChat.get(var3)).getWorld();
					} else {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
					if (InterfaceParent.clanChat != null && var3 < InterfaceParent.clanChat.getSize()) {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = ((Buddy)InterfaceParent.clanChat.get(var3)).rank;
					} else {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = InterfaceParent.clanChat != null ? InterfaceParent.clanChat.minKick : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					MenuAction.clanKickUser(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = InterfaceParent.clanChat != null ? InterfaceParent.clanChat.rank : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					ArchiveLoader.Clan_joinChat(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					class238.Clan_leaveChat();
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!class13.friendSystem.method1719()) {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class13.friendSystem.ignoreList.getSize();
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
					if (class13.friendSystem.method1719() && var3 >= 0 && var3 < class13.friendSystem.ignoreList.getSize()) {
						Ignored var4 = (Ignored)class13.friendSystem.ignoreList.get(var3);
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.getName();
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.getPreviousName();
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					var5 = class1.method24(var5);
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class13.friendSystem.isIgnored(new Username(var5, AbstractUserComparator.loginType)) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
					if (InterfaceParent.clanChat != null && var3 < InterfaceParent.clanChat.getSize() && InterfaceParent.clanChat.get(var3).getUsername().equals(Varcs.localPlayer.username)) {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (InterfaceParent.clanChat != null && InterfaceParent.clanChat.owner != null) {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = InterfaceParent.clanChat.owner;
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
					if (InterfaceParent.clanChat != null && var3 < InterfaceParent.clanChat.getSize() && ((FriendsChatMember)InterfaceParent.clanChat.get(var3)).isFriend()) {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						class13.friendSystem.friendsList.removeComparator();
						return 1;
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1;
							class13.friendSystem.friendsList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1;
							class13.friendSystem.friendsList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1;
							class13.friendSystem.friendsList.addComparator(new UserComparator3(var7));
							return 1;
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1;
							class13.friendSystem.friendsList.addComparator(new UserComparator4(var7));
							return 1;
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1;
							class13.friendSystem.friendsList.addComparator(new UserComparator5(var7));
							return 1;
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1;
							class13.friendSystem.friendsList.addComparator(new UserComparator6(var7));
							return 1;
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1;
							class13.friendSystem.friendsList.addComparator(new UserComparator7(var7));
							return 1;
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1;
							class13.friendSystem.friendsList.addComparator(new UserComparator8(var7));
							return 1;
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1;
							class13.friendSystem.friendsList.addComparator(new UserComparator9(var7));
							return 1;
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1;
							class13.friendSystem.friendsList.addComparator(new UserComparator10(var7));
							return 1;
						} else if (var0 == 3639) {
							class13.friendSystem.friendsList.sort();
							return 1;
						} else if (var0 == 3640) {
							class13.friendSystem.ignoreList.removeComparator();
							return 1;
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1;
							class13.friendSystem.ignoreList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1;
							class13.friendSystem.ignoreList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3643) {
							class13.friendSystem.ignoreList.sort();
							return 1;
						} else if (var0 == 3644) {
							if (InterfaceParent.clanChat != null) {
								InterfaceParent.clanChat.removeComparator();
							}

							return 1;
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1;
							if (InterfaceParent.clanChat != null) {
								InterfaceParent.clanChat.addComparator(new UserComparator1(var7));
							}

							return 1;
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1;
							if (InterfaceParent.clanChat != null) {
								InterfaceParent.clanChat.addComparator(new UserComparator2(var7));
							}

							return 1;
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1;
							if (InterfaceParent.clanChat != null) {
								InterfaceParent.clanChat.addComparator(new UserComparator3(var7));
							}

							return 1;
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1;
							if (InterfaceParent.clanChat != null) {
								InterfaceParent.clanChat.addComparator(new UserComparator4(var7));
							}

							return 1;
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1;
							if (InterfaceParent.clanChat != null) {
								InterfaceParent.clanChat.addComparator(new UserComparator5(var7));
							}

							return 1;
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1;
							if (InterfaceParent.clanChat != null) {
								InterfaceParent.clanChat.addComparator(new UserComparator6(var7));
							}

							return 1;
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1;
							if (InterfaceParent.clanChat != null) {
								InterfaceParent.clanChat.addComparator(new UserComparator7(var7));
							}

							return 1;
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1;
							if (InterfaceParent.clanChat != null) {
								InterfaceParent.clanChat.addComparator(new UserComparator8(var7));
							}

							return 1;
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1;
							if (InterfaceParent.clanChat != null) {
								InterfaceParent.clanChat.addComparator(new UserComparator9(var7));
							}

							return 1;
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1;
							if (InterfaceParent.clanChat != null) {
								InterfaceParent.clanChat.addComparator(new UserComparator10(var7));
							}

							return 1;
						} else if (var0 == 3655) {
							if (InterfaceParent.clanChat != null) {
								InterfaceParent.clanChat.sort();
							}

							return 1;
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1;
							class13.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7));
							return 1;
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1;
							if (InterfaceParent.clanChat != null) {
								InterfaceParent.clanChat.addComparator(new BuddyRankComparator(var7));
							}

							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
					if (InterfaceParent.clanChat != null && var3 < InterfaceParent.clanChat.getSize() && ((FriendsChatMember)InterfaceParent.clanChat.get(var3)).isIgnored()) {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				}
			}
		}
	}
}
