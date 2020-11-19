import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cc")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("os")
	@ObfuscatedSignature(
		signature = "Lcz;"
	)
	@Export("varcs")
	static Varcs varcs;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lmc;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lkd;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Lke;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1331025573
	)
	@Export("loadingProgress")
	int loadingProgress;

	@ObfuscatedSignature(
		signature = "(Lmc;)V"
	)
	FriendSystem(LoginType var1) {
		this.loadingProgress = 0;
		this.loginType = var1;
		this.friendsList = new FriendsList(var1);
		this.ignoreList = new IgnoreList(var1);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "366163976"
	)
	boolean method1958() {
		return this.loadingProgress == 2;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1495060497"
	)
	final void method1957() {
		this.loadingProgress = 1;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(Lkb;II)V",
		garbageValue = "-320273584"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2);
		this.loadingProgress = 2;

		for (int var3 = 0; var3 < Players.Players_count; ++var3) {
			Player var4 = Client.players[Players.Players_indices[var3]];
			var4.clearIsFriend();
		}

		Iterator var5 = Messages.Messages_hashTable.iterator();

		while (var5.hasNext()) {
			Message var6 = (Message)var5.next();
			var6.clearIsFromFriend();
		}

		if (DevicePcmPlayerProvider.clanChat != null) {
			DevicePcmPlayerProvider.clanChat.clearFriends();
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1762300851"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) {
			if ((long)var1.field3670 < Nameable.currentTimeMillis() / 1000L - 5L) {
				if (var1.world > 0) {
					DevicePcmPlayerProvider.addGameMessage(5, "", var1.username + " has logged in.");
				}

				if (var1.world == 0) {
					DevicePcmPlayerProvider.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove();
			}
		}

	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-710169059"
	)
	@Export("clear")
	final void clear() {
		this.loadingProgress = 0;
		this.friendsList.clear();
		this.ignoreList.clear();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(Lkm;ZI)Z",
		garbageValue = "-1897160718"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) {
			return false;
		} else if (var1.equals(PlayerType.localPlayer.username)) {
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2);
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(Lkm;I)Z",
		garbageValue = "1651377109"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) {
			return false;
		} else {
			return this.ignoreList.contains(var1);
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I)V",
		garbageValue = "625813578"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsListIsFull()) {
					Object var10000 = null;
					String var3 = "Your friend list is full. Max of 200 for free users, and 400 for members";
					DevicePcmPlayerProvider.addGameMessage(30, "", var3);
				} else if (PlayerType.localPlayer.username.equals(var2)) {
					MouseRecorder.method1286();
				} else if (this.isFriended(var2, false)) {
					class60.method983(var1);
				} else if (this.isIgnored(var2)) {
					GrandExchangeOfferAgeComparator.method241(var1);
				} else {
					Canvas.method949(var1);
				}
			}
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "1768016322"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field799 != 1;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I)V",
		garbageValue = "-109423207"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				Object var10000;
				String var3;
				if (this.canAddIgnore()) {
					var10000 = null;
					var3 = "Your ignore list is full. Max of 100 for free users, and 400 for members";
					DevicePcmPlayerProvider.addGameMessage(30, "", var3);
				} else if (PlayerType.localPlayer.username.equals(var2)) {
					var10000 = null;
					var3 = "You can't add yourself to your own ignore list";
					DevicePcmPlayerProvider.addGameMessage(30, "", var3);
				} else if (this.isIgnored(var2)) {
					class217.method4098(var1);
				} else if (this.isFriended(var2, false)) {
					WorldMapArea.method506(var1);
				} else {
					HealthBarUpdate.method1869(var1);
				}
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(B)Z",
		garbageValue = "-34"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field799 != 1;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I)V",
		garbageValue = "-1777583860"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsList.removeByUsername(var2)) {
					Client.field874 = Client.cycleCntr;
					PacketBufferNode var3 = class4.getPacketBufferNode(ClientPacket.field2327, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(SpriteMask.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}

				for (int var5 = 0; var5 < Players.Players_count; ++var5) {
					Player var4 = Client.players[Players.Players_indices[var5]];
					var4.clearIsFriend();
				}

				Iterator var6 = Messages.Messages_hashTable.iterator();

				while (var6.hasNext()) {
					Message var7 = (Message)var6.next();
					var7.clearIsFromFriend();
				}

				if (DevicePcmPlayerProvider.clanChat != null) {
					DevicePcmPlayerProvider.clanChat.clearFriends();
				}

			}
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;B)V",
		garbageValue = "66"
	)
	@Export("removeIgnore")
	final void removeIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.ignoreList.removeByUsername(var2)) {
					Client.field874 = Client.cycleCntr;
					PacketBufferNode var3 = class4.getPacketBufferNode(ClientPacket.field2240, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(SpriteMask.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}

				class52.FriendSystem_invalidateIgnoreds();
			}
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(Lkm;I)Z",
		garbageValue = "-1712856211"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1);
		return var2 != null && var2.hasWorld();
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "-145581337"
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
		ModeWhere.sortWorlds(DefaultsGroup.World_worlds, 0, DefaultsGroup.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "1"
	)
	public static void method2017() {
		synchronized(KeyHandler.KeyHandler_instance) {
			++KeyHandler.KeyHandler_idleCycles;
			KeyHandler.field415 = KeyHandler.field428;
			KeyHandler.field427 = 0;
			int var1;
			if (KeyHandler.field423 < 0) {
				for (var1 = 0; var1 < 112; ++var1) {
					KeyHandler.KeyHandler_pressedKeys[var1] = false;
				}

				KeyHandler.field423 = KeyHandler.field422;
			} else {
				while (KeyHandler.field422 != KeyHandler.field423) {
					var1 = KeyHandler.field435[KeyHandler.field422];
					KeyHandler.field422 = KeyHandler.field422 + 1 & 127;
					if (var1 < 0) {
						KeyHandler.KeyHandler_pressedKeys[~var1] = false;
					} else {
						if (!KeyHandler.KeyHandler_pressedKeys[var1] && KeyHandler.field427 < KeyHandler.field430.length - 1) {
							KeyHandler.field430[++KeyHandler.field427 - 1] = var1;
						}

						KeyHandler.KeyHandler_pressedKeys[var1] = true;
					}
				}
			}

			if (KeyHandler.field427 > 0) {
				KeyHandler.KeyHandler_idleCycles = 0;
			}

			KeyHandler.field428 = KeyHandler.field413;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(ILco;ZB)I",
		garbageValue = "104"
	)
	static int method2018(int var0, Script var1, boolean var2) {
		boolean var3 = true;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = UserComparator4.getWidget(Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]);
			var3 = false;
		} else {
			var4 = var2 ? MouseRecorder.field621 : Interpreter.field1122;
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) {
			var11 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] - 1;
			if (var11 >= 0 && var11 <= 9) {
				var4.setAction(var11, Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize]);
				return 1;
			} else {
				--UrlRequester.Interpreter_stringStackSize;
				return 1;
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) {
				MilliClock.Interpreter_intStackSize -= 2;
				var11 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize];
				var6 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1];
				var4.parent = ItemContainer.getWidgetChild(var11, var6);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) {
				var4.isScrollBar = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) {
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) {
				var4.dragThreshold = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) {
				var4.dataText = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) {
				var4.spellActionName = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) {
				var4.actions = null;
				return 1;
			} else if (var0 == 1308) {
				var4.field2735 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1;
				return 1;
			} else if (var0 == 1309) {
				--MilliClock.Interpreter_intStackSize;
				return 1;
			} else {
				int var7;
				byte[] var9;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) {
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) {
						MilliClock.Interpreter_intStackSize -= 2;
						var5 = 10;
						var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]};
						byte[] var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]};
						ChatChannel.Widget_setKey(var4, var5, var9, var10);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) {
						MilliClock.Interpreter_intStackSize -= 3;
						var11 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize] - 1;
						var6 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1];
						var7 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 2];
						if (var11 >= 0 && var11 <= 9) {
							WorldMapIcon_1.Widget_setKeyRate(var4, var11, var6, var7);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) {
						var5 = 10;
						var6 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
						var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
						WorldMapIcon_1.Widget_setKeyRate(var4, var5, var6, var7);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) {
						--MilliClock.Interpreter_intStackSize;
						var11 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize] - 1;
						if (var11 >= 0 && var11 <= 9) {
							MusicPatchNode2.Widget_setKeyIgnoreHeld(var4, var11);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) {
						var5 = 10;
						MusicPatchNode2.Widget_setKeyIgnoreHeld(var4, var5);
						return 1;
					} else {
						return 2;
					}
				} else {
					byte[] var8 = null;
					var9 = null;
					if (var3) {
						MilliClock.Interpreter_intStackSize -= 10;

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + MilliClock.Interpreter_intStackSize] >= 0; var7 += 2) {
						}

						if (var7 > 0) {
							var8 = new byte[var7 / 2];
							var9 = new byte[var7 / 2];

							for (var7 -= 2; var7 >= 0; var7 -= 2) {
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + MilliClock.Interpreter_intStackSize];
								var9[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + MilliClock.Interpreter_intStackSize + 1];
							}
						}
					} else {
						MilliClock.Interpreter_intStackSize -= 2;
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]};
						var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]};
					}

					var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] - 1;
					if (var7 >= 0 && var7 <= 9) {
						ChatChannel.Widget_setKey(var4, var7, var8, var9);
						return 1;
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
	}

	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1364904686"
	)
	@Export("playPcmPlayers")
	static final void playPcmPlayers() {
		if (class23.pcmPlayer1 != null) {
			class23.pcmPlayer1.run();
		}

		if (class195.pcmPlayer0 != null) {
			class195.pcmPlayer0.run();
		}

	}
}
