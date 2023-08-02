import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cd")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lsi;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1990932477
	)
	int field843;

	@ObfuscatedSignature(
		descriptor = "(Lsi;)V"
	)
	FriendSystem(LoginType var1) {
		this.field843 = 0; // L: 23
		this.loginType = var1; // L: 26
		this.friendsList = new FriendsList(var1); // L: 27
		this.ignoreList = new IgnoreList(var1); // L: 28
	} // L: 29

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "106"
	)
	boolean method1904() {
		return this.field843 == 2; // L: 32
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "109"
	)
	final void method1865() {
		this.field843 = 1; // L: 36
	} // L: 37

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lty;II)V",
		garbageValue = "1175550458"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2); // L: 40
		this.field843 = 2; // L: 41

		for (int var3 = 0; var3 < Players.Players_count; ++var3) { // L: 43
			Player var4 = Client.players[Players.Players_indices[var3]]; // L: 44
			var4.clearIsFriend(); // L: 45
		}

		class106.method2690(); // L: 47
		if (Canvas.friendsChatManager != null) { // L: 48
			Canvas.friendsChatManager.clearFriends(); // L: 49
		}

	} // L: 52

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-119"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) { // L: 55
			if ((long)var1.field4648 < class113.method2835() / 1000L - 5L) { // L: 56
				if (var1.world > 0) {
					class415.addGameMessage(5, "", var1.username + " has logged in."); // L: 57
				}

				if (var1.world == 0) { // L: 58
					class415.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove(); // L: 59
			}
		}

	} // L: 62

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1126290435"
	)
	@Export("clear")
	final void clear() {
		this.field843 = 0; // L: 65
		this.friendsList.clear(); // L: 66
		this.ignoreList.clear(); // L: 67
	} // L: 68

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lui;ZB)Z",
		garbageValue = "77"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) { // L: 71
			return false;
		} else if (var1.equals(class136.localPlayer.username)) { // L: 72
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2); // L: 73
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lui;I)Z",
		garbageValue = "1453652382"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) { // L: 78
			return false;
		} else {
			return this.ignoreList.contains(var1); // L: 79
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "119"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) { // L: 84
			Username var2 = new Username(var1, this.loginType); // L: 85
			if (var2.hasCleanName()) { // L: 86
				if (this.friendsListIsFull()) { // L: 87
					Tile.method4399("Your friend list is full. Max of 200 for free users, and 400 for members"); // L: 89
				} else if (class136.localPlayer.username.equals(var2)) { // L: 93
					class220.method4285(); // L: 94
				} else if (this.isFriended(var2, false)) { // L: 97
					WorldMapSectionType.method5466(var1); // L: 98
				} else if (this.isIgnored(var2)) { // L: 101
					Tile.method4399("Please remove " + var1 + " from your ignore list first"); // L: 103
				} else {
					Canvas.method321(var1); // L: 107
				}
			}
		}
	} // L: 91 95 99 105 108

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-30"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field641 != 1; // L: 131
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "109"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) { // L: 138
			Username var2 = new Username(var1, this.loginType); // L: 139
			if (var2.hasCleanName()) { // L: 140
				if (this.canAddIgnore()) { // L: 141
					UserComparator5.method2875(); // L: 142
				} else if (class136.localPlayer.username.equals(var2)) { // L: 145
					Tile.method4399("You can't add yourself to your own ignore list"); // L: 147
				} else if (this.isIgnored(var2)) { // L: 151
					MusicPatchNode.method6051(var1); // L: 152
				} else if (this.isFriended(var2, false)) { // L: 155
					Tile.method4399("Please remove " + var1 + " from your friend list first"); // L: 157
				} else {
					ItemContainer.method2271(var1); // L: 161
				}
			}
		}
	} // L: 143 149 153 159 162

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-876943227"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field641 != 1; // L: 181
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1474613294"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) { // L: 188
			Username var2 = new Username(var1, this.loginType); // L: 189
			if (var2.hasCleanName()) { // L: 190
				if (this.friendsList.removeByUsername(var2)) { // L: 191
					Client.field763 = Client.cycleCntr; // L: 193
					PacketBufferNode var3 = class503.getPacketBufferNode(ClientPacket.field3114, Client.packetWriter.isaacCipher); // L: 196
					var3.packetBuffer.writeByte(class501.stringCp1252NullTerminatedByteSize(var1)); // L: 197
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 198
					Client.packetWriter.addNode(var3); // L: 199
				}

				for (int var5 = 0; var5 < Players.Players_count; ++var5) { // L: 202
					Player var4 = Client.players[Players.Players_indices[var5]]; // L: 203
					var4.clearIsFriend(); // L: 204
				}

				class106.method2690(); // L: 206
				if (Canvas.friendsChatManager != null) { // L: 207
					Canvas.friendsChatManager.clearFriends(); // L: 208
				}

			}
		}
	} // L: 211

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)V",
		garbageValue = "-31"
	)
	public final void method1867(String var1, boolean var2) {
		if (var1 != null) { // L: 214
			Username var3 = new Username(var1, this.loginType); // L: 215
			if (var3.hasCleanName()) { // L: 216
				if (this.ignoreList.removeByUsername(var3)) { // L: 217
					Client.field763 = Client.cycleCntr; // L: 219
					if (var2) { // L: 221
						PacketBufferNode var4 = class503.getPacketBufferNode(ClientPacket.field3155, Client.packetWriter.isaacCipher); // L: 223
						var4.packetBuffer.writeByte(class501.stringCp1252NullTerminatedByteSize(var1)); // L: 224
						var4.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 225
						Client.packetWriter.addNode(var4); // L: 226
					}
				}

				GameBuild.FriendSystem_invalidateIgnoreds(); // L: 229
			}
		}
	} // L: 230

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lui;B)Z",
		garbageValue = "24"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1); // L: 242
		return var2 != null && var2.hasWorld(); // L: 243
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "-1211828959"
	)
	static int method1934(int var0, Script var1, boolean var2) {
		String var3;
		int var10;
		if (var0 == ScriptOpcodes.APPEND_NUM) { // L: 3827
			var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3828
			var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3829
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3 + var10; // L: 3830
			return 1; // L: 3831
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) { // L: 3833
				Interpreter.Interpreter_stringStackSize -= 2; // L: 3834
				var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize]; // L: 3835
				var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1]; // L: 3836
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3 + var4; // L: 3837
				return 1; // L: 3838
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) { // L: 3840
				var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3841
				var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3842
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3 + class509.intToString(var10, true); // L: 3843
				return 1; // L: 3844
			} else if (var0 == ScriptOpcodes.LOWERCASE) { // L: 3846
				var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3847
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.toLowerCase(); // L: 3848
				return 1; // L: 3849
			} else {
				int var6;
				int var11;
				if (var0 == ScriptOpcodes.FROMDATE) { // L: 3851
					var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3852
					long var14 = (11745L + (long)var11) * 86400000L; // L: 3853
					Interpreter.Interpreter_calendar.setTime(new Date(var14)); // L: 3854
					var6 = Interpreter.Interpreter_calendar.get(5); // L: 3855
					int var17 = Interpreter.Interpreter_calendar.get(2); // L: 3856
					int var8 = Interpreter.Interpreter_calendar.get(1); // L: 3857
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var17] + "-" + var8; // L: 3858
					return 1; // L: 3859
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) { // L: 3861
					if (var0 == ScriptOpcodes.TOSTRING) { // L: 3873
						var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3874
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = Integer.toString(var11); // L: 3875
						return 1; // L: 3876
					} else if (var0 == ScriptOpcodes.COMPARE) { // L: 3878
						Interpreter.Interpreter_stringStackSize -= 2; // L: 3879
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GrandExchangeOfferTotalQuantityComparator.method6890(FloorOverlayDefinition.compareStrings(Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1], Interpreter.clientLanguage)); // L: 3880
						return 1; // L: 3881
					} else {
						int var9;
						byte[] var12;
						Font var13;
						if (var0 == ScriptOpcodes.PARAHEIGHT) { // L: 3883
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3884
							Interpreter.Interpreter_intStackSize -= 2; // L: 3885
							var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3886
							var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3887
							var12 = FontName.archive13.takeFile(var9, 0); // L: 3888
							var13 = new Font(var12); // L: 3889
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13.lineCount(var3, var10); // L: 3890
							return 1; // L: 3891
						} else if (var0 == ScriptOpcodes.PARAWIDTH) { // L: 3893
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3894
							Interpreter.Interpreter_intStackSize -= 2; // L: 3895
							var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3896
							var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3897
							var12 = FontName.archive13.takeFile(var9, 0); // L: 3898
							var13 = new Font(var12); // L: 3899
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13.lineWidth(var3, var10); // L: 3900
							return 1; // L: 3901
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) { // L: 3903
							Interpreter.Interpreter_stringStackSize -= 2; // L: 3904
							var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize]; // L: 3905
							var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1]; // L: 3906
							if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 3907
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4; // L: 3908
							}

							return 1; // L: 3909
						} else if (var0 == ScriptOpcodes.ESCAPE) { // L: 3911
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3912
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3); // L: 3913
							return 1; // L: 3914
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) { // L: 3916
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3917
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3918
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3 + (char)var10; // L: 3919
							return 1; // L: 3920
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) { // L: 3922
							var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3923
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ChatChannel.isCharPrintable((char)var11) ? 1 : 0; // L: 3924
							return 1; // L: 3925
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) { // L: 3927
							var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3928
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class126.isAlphaNumeric((char)var11) ? 1 : 0; // L: 3929
							return 1; // L: 3930
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) { // L: 3932
							var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3933
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Canvas.isCharAlphabetic((char)var11) ? 1 : 0; // L: 3934
							return 1; // L: 3935
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) { // L: 3937
							var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3938
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class164.isDigit((char)var11) ? 1 : 0; // L: 3939
							return 1; // L: 3940
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) { // L: 3942
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3943
							if (var3 != null) { // L: 3944
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3945
							}

							return 1; // L: 3946
						} else if (var0 == ScriptOpcodes.SUBSTRING) { // L: 3948
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3949
							Interpreter.Interpreter_intStackSize -= 2; // L: 3950
							var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3951
							var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3952
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.substring(var10, var9); // L: 3953
							return 1; // L: 3954
						} else if (var0 == ScriptOpcodes.REMOVETAGS) { // L: 3956
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3957
							StringBuilder var16 = new StringBuilder(var3.length()); // L: 3958
							boolean var18 = false; // L: 3959

							for (var6 = 0; var6 < var3.length(); ++var6) { // L: 3960
								char var7 = var3.charAt(var6); // L: 3961
								if (var7 == '<') { // L: 3962
									var18 = true;
								} else if (var7 == '>') { // L: 3963
									var18 = false;
								} else if (!var18) { // L: 3964
									var16.append(var7);
								}
							}

							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var16.toString(); // L: 3966
							return 1; // L: 3967
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) { // L: 3969
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3970
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3971
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.indexOf(var10); // L: 3972
							return 1; // L: 3973
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) { // L: 3975
							Interpreter.Interpreter_stringStackSize -= 2; // L: 3976
							var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize]; // L: 3977
							var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1]; // L: 3978
							var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3979
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.indexOf(var4, var9); // L: 3980
							return 1; // L: 3981
						} else if (var0 == 4122) { // L: 3983
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3984
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.toUpperCase(); // L: 3985
							return 1; // L: 3986
						} else if (var0 == 4123) { // L: 3988
							Interpreter.Interpreter_stringStackSize -= 3; // L: 3989
							var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize]; // L: 3990
							var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1]; // L: 3991
							String var5 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 2]; // L: 3992
							if (class136.localPlayer.appearance == null) { // L: 3993
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5; // L: 3994
								return 1; // L: 3995
							} else {
								switch(class136.localPlayer.appearance.field3564) { // L: 3997
								case 0:
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3; // L: 3999
									break;
								case 1:
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4; // L: 4002
									break; // L: 4003
								case 2:
								default:
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5; // L: 4006
								}

								return 1; // L: 4009
							}
						} else {
							return 2; // L: 4011
						}
					}
				} else {
					Interpreter.Interpreter_stringStackSize -= 2; // L: 3862
					var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize]; // L: 3863
					var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1]; // L: 3864
					if (class136.localPlayer.appearance != null && class136.localPlayer.appearance.field3563 != 0) { // L: 3865
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4; // L: 3869
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3; // L: 3866
					}

					return 1; // L: 3871
				}
			}
		}
	}

	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		descriptor = "(Lmt;IIZI)V",
		garbageValue = "-593729074"
	)
	@Export("alignWidgetSize")
	static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
		int var4 = var0.width; // L: 11169
		int var5 = var0.height; // L: 11170
		if (var0.widthAlignment == 0) { // L: 11171
			var0.width = var0.rawWidth;
		} else if (var0.widthAlignment == 1) { // L: 11172
			var0.width = var1 - var0.rawWidth;
		} else if (var0.widthAlignment == 2) { // L: 11173
			var0.width = var0.rawWidth * var1 >> 14;
		}

		if (var0.heightAlignment == 0) { // L: 11174
			var0.height = var0.rawHeight;
		} else if (var0.heightAlignment == 1) { // L: 11175
			var0.height = var2 - var0.rawHeight;
		} else if (var0.heightAlignment == 2) {
			var0.height = var2 * var0.rawHeight >> 14; // L: 11176
		}

		if (var0.widthAlignment == 4) { // L: 11177
			var0.width = var0.height * var0.field3672 / var0.field3641;
		}

		if (var0.heightAlignment == 4) { // L: 11178
			var0.height = var0.width * var0.field3641 / var0.field3672;
		}

		if (var0.contentType == 1337) { // L: 11179
			Client.viewportWidget = var0;
		}

		if (var0.type == 12) { // L: 11180
			var0.method6504().method6165(var0.width, var0.height); // L: 11181
		}

		if (var3 && var0.onResize != null && (var4 != var0.width || var5 != var0.height)) { // L: 11183
			ScriptEvent var6 = new ScriptEvent(); // L: 11184
			var6.widget = var0; // L: 11185
			var6.args = var0.onResize; // L: 11186
			Client.scriptEvents.addFirst(var6); // L: 11187
		}

	} // L: 11189
}
