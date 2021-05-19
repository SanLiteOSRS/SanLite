import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bo")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "[Lof;"
	)
	@Export("modIconSprites")
	static IndexedSprite[] modIconSprites;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1129387531
	)
	int field920;

	@ObfuscatedSignature(
		descriptor = "(Lnj;)V"
	)
	FriendSystem(LoginType var1) {
		this.field920 = 0;
		this.loginType = var1;
		this.friendsList = new FriendsList(var1);
		this.ignoreList = new IgnoreList(var1);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-75"
	)
	boolean method1744() {
		return this.field920 == 2;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1542795320"
	)
	final void method1734() {
		this.field920 = 1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lnk;IB)V",
		garbageValue = "-75"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2);
		this.field920 = 2;

		for (int var3 = 0; var3 < Players.Players_count; ++var3) {
			Player var4 = Client.players[Players.Players_indices[var3]];
			var4.clearIsFriend();
		}

		FontName.method6159();
		if (class25.clanChat != null) {
			class25.clanChat.clearFriends();
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1264028150"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) {
			if ((long)var1.field3840 < Archive.currentTimeMillis() / 1000L - 5L) {
				if (var1.world > 0) {
					WorldMapScaleHandler.addGameMessage(5, "", var1.username + " has logged in.");
				}

				if (var1.world == 0) {
					WorldMapScaleHandler.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove();
			}
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "962792858"
	)
	@Export("clear")
	final void clear() {
		this.field920 = 0;
		this.friendsList.clear();
		this.ignoreList.clear();
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lla;ZI)Z",
		garbageValue = "166133195"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) {
			return false;
		} else if (var1.equals(class35.localPlayer.username)) {
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2);
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lla;I)Z",
		garbageValue = "-919307241"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) {
			return false;
		} else {
			return this.ignoreList.contains(var1);
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "60"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsListIsFull()) {
					AbstractByteArrayCopier.method4738();
				} else {
					StringBuilder var10000;
					String var4;
					if (class35.localPlayer.username.equals(var2)) {
						var10000 = null;
						var4 = "You can't add yourself to your own friend list";
						WorldMapScaleHandler.addGameMessage(30, "", var4);
					} else {
						Object var10001;
						if (this.isFriended(var2, false)) {
							var10000 = (new StringBuilder()).append(var1);
							var10001 = null;
							var4 = var10000.append(" is already on your friend list").toString();
							WorldMapScaleHandler.addGameMessage(30, "", var4);
						} else if (this.isIgnored(var2)) {
							var10000 = new StringBuilder();
							var10001 = null;
							var10000 = var10000.append("Please remove ").append(var1);
							var10001 = null;
							var4 = var10000.append(" from your ignore list first").toString();
							WorldMapScaleHandler.addGameMessage(30, "", var4);
						} else {
							PacketBufferNode var3 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2589, Client.packetWriter.isaacCipher);
							var3.packetBuffer.writeByte(class4.stringCp1252NullTerminatedByteSize(var1));
							var3.packetBuffer.writeStringCp1252NullTerminated(var1);
							Client.packetWriter.addNode(var3);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2083998302"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field734 != 1;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1460320800"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				StringBuilder var10000;
				String var3;
				if (this.canAddIgnore()) {
					var10000 = null;
					var3 = "Your ignore list is full. Max of 100 for free users, and 400 for members";
					WorldMapScaleHandler.addGameMessage(30, "", var3);
				} else if (class35.localPlayer.username.equals(var2)) {
					var10000 = null;
					var3 = "You can't add yourself to your own ignore list";
					WorldMapScaleHandler.addGameMessage(30, "", var3);
				} else if (this.isIgnored(var2)) {
					class14.method222(var1);
				} else if (this.isFriended(var2, false)) {
					var10000 = new StringBuilder();
					Object var10001 = null;
					var10000 = var10000.append("Please remove ").append(var1);
					var10001 = null;
					var3 = var10000.append(" from your friend list first").toString();
					WorldMapScaleHandler.addGameMessage(30, "", var3);
				} else {
					class34.method393(var1);
				}
			}
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "2"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field734 != 1;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-81"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsList.removeByUsername(var2)) {
					Client.field801 = Client.cycleCntr;
					PacketBufferNode var3 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2573, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(class4.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}

				for (int var5 = 0; var5 < Players.Players_count; ++var5) {
					Player var4 = Client.players[Players.Players_indices[var5]];
					var4.clearIsFriend();
				}

				FontName.method6159();
				if (class25.clanChat != null) {
					class25.clanChat.clearFriends();
				}

			}
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1160977242"
	)
	@Export("removeIgnore")
	final void removeIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.ignoreList.removeByUsername(var2)) {
					Client.field801 = Client.cycleCntr;
					PacketBufferNode var3 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2648, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(class4.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}

				class181.FriendSystem_invalidateIgnoreds();
			}
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lla;B)Z",
		garbageValue = "-128"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1);
		return var2 != null && var2.hasWorld();
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-153839217"
	)
	static void method1782(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var1 != null) {
			var1.remove();
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZI)I",
		garbageValue = "714561014"
	)
	static int method1795(int var0, Script var1, boolean var2) {
		int var6;
		if (var0 == ScriptOpcodes.OC_NAME) {
			var6 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
			Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = Strings.ItemDefinition_get(var6).name;
			return 1;
		} else {
			int var4;
			ItemComposition var5;
			if (var0 == ScriptOpcodes.OC_OP) {
				WorldMapCacheName.Interpreter_intStackSize -= 2;
				var6 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
				var5 = Strings.ItemDefinition_get(var6);
				if (var4 >= 1 && var4 <= 5 && var5.groundActions[var4 - 1] != null) {
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var5.groundActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.OC_IOP) {
				WorldMapCacheName.Interpreter_intStackSize -= 2;
				var6 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
				var5 = Strings.ItemDefinition_get(var6);
				if (var4 >= 1 && var4 <= 5 && var5.inventoryActions[var4 - 1] != null) {
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var5.inventoryActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.OC_COST) {
				var6 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Strings.ItemDefinition_get(var6).price;
				return 1;
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) {
				var6 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Strings.ItemDefinition_get(var6).isStackable == 1 ? 1 : 0;
				return 1;
			} else {
				ItemComposition var7;
				if (var0 == ScriptOpcodes.OC_CERT) {
					var6 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
					var7 = Strings.ItemDefinition_get(var6);
					if (var7.noteTemplate == -1 && var7.note >= 0) {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var6;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNCERT) {
					var6 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
					var7 = Strings.ItemDefinition_get(var6);
					if (var7.noteTemplate >= 0 && var7.note >= 0) {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var6;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) {
					var6 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Strings.ItemDefinition_get(var6).isMembersOnly ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) {
					var6 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
					var7 = Strings.ItemDefinition_get(var6);
					if (var7.placeholderTemplate == -1 && var7.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var6;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) {
					var6 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
					var7 = Strings.ItemDefinition_get(var6);
					if (var7.placeholderTemplate >= 0 && var7.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var6;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_FIND) {
					String var3 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
					var4 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
					class10.findItemDefinitions(var3, var4 == 1);
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = class135.foundItemIdCount;
					return 1;
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) {
					if (var0 == ScriptOpcodes.OC_FINDRESET) {
						WorldMapManager.foundItemIndex = 0;
						return 1;
					} else {
						return 2;
					}
				} else {
					if (class179.foundItemIds != null && WorldMapManager.foundItemIndex < class135.foundItemIdCount) {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = class179.foundItemIds[++WorldMapManager.foundItemIndex - 1] & '\uffff';
					} else {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = -1;
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "405028707"
	)
	static void method1732() {
		if (Client.oculusOrbState == 1) {
			Client.field699 = true;
		}

	}
}
