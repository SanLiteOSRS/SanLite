import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bc")
@Implements("Login")
public class Login {
	@ObfuscatedName("h")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 143934889
	)
	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "[Lqe;"
	)
	@Export("runesSprite")
	static IndexedSprite[] runesSprite;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	@Export("titlebuttonSprite")
	static IndexedSprite titlebuttonSprite;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	static IndexedSprite field872;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;
	@ObfuscatedName("d")
	@Export("Tiles_saturation")
	static int[] Tiles_saturation;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	static IndexedSprite field874;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -117827515
	)
	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1356153485
	)
	@Export("loginBoxCenter")
	static int loginBoxCenter;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1175847013
	)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("j")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -385916361
	)
	static int field882;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1490840701
	)
	static int field875;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1607677011
	)
	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("bq")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("bn")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("bl")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("bv")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("bu")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("bb")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 206786913
	)
	static int field891;
	@ObfuscatedName("bd")
	static String[] field892;
	@ObfuscatedName("bz")
	static boolean field868;
	@ObfuscatedName("bo")
	static boolean field894;
	@ObfuscatedName("be")
	static boolean field895;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 1084940731
	)
	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("co")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -1240701521
	)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -2103334835
	)
	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -979458741
	)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		longValue = 2792997058446921493L
	)
	static long field889;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		longValue = 7709479161078177483L
	)
	static long field910;
	@ObfuscatedName("cs")
	static String[] field901;
	@ObfuscatedName("cy")
	static String[] field906;

	static {
		xPadding = 0; // L: 47
		loginBoxX = xPadding + 202; // L: 66
		Login_loadingPercent = 10; // L: 68
		Login_loadingText = ""; // L: 69
		field882 = -1; // L: 89
		field875 = 1; // L: 92
		loginIndex = 0; // L: 96
		Login_response0 = "";
		Login_response1 = "";
		Login_response2 = "";
		Login_response3 = "";
		Login_username = "";
		Login_password = "";
		field891 = 0; // L: 104
		field892 = new String[8]; // L: 105
		field868 = false;
		field894 = false;
		field895 = true;
		currentLoginField = 0;
		worldSelectOpen = false;
		hoveredWorldIndex = -1; // L: 133
		worldSelectPage = 0;
		worldSelectPagesCount = 0; // L: 135
		new DecimalFormat("##0.00");
		new class120();
		field889 = -1L;
		field910 = -1L;
		field901 = new String[]{"title.jpg"};
		field906 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"};
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lqz;II)V",
		garbageValue = "517279501"
	)
	@Export("updatePlayers")
	static final void updatePlayers(PacketBuffer var0, int var1) {
		int var2 = var0.offset; // L: 71
		Players.Players_pendingUpdateCount = 0; // L: 72
		int var3 = 0; // L: 74
		var0.importIndex(); // L: 75

		byte[] var10000;
		int var4;
		int var6;
		int var7;
		for (var4 = 0; var4 < Players.Players_count; ++var4) { // L: 76
			var7 = Players.Players_indices[var4]; // L: 77
			if ((Players.field1297[var7] & 1) == 0) { // L: 78
				if (var3 > 0) { // L: 79
					--var3; // L: 80
					var10000 = Players.field1297; // L: 81
					var10000[var7] = (byte)(var10000[var7] | 2);
				} else {
					var6 = var0.readBits(1); // L: 84
					if (var6 == 0) { // L: 85
						var3 = MusicPatch.method5371(var0); // L: 86
						var10000 = Players.field1297; // L: 87
						var10000[var7] = (byte)(var10000[var7] | 2);
					} else {
						class13.readPlayerUpdate(var0, var7); // L: 90
					}
				}
			}
		}

		var0.exportIndex(); // L: 93
		if (var3 != 0) { // L: 94
			throw new RuntimeException(); // L: 95
		} else {
			var0.importIndex(); // L: 97

			for (var4 = 0; var4 < Players.Players_count; ++var4) { // L: 98
				var7 = Players.Players_indices[var4]; // L: 99
				if ((Players.field1297[var7] & 1) != 0) { // L: 100
					if (var3 > 0) { // L: 101
						--var3; // L: 102
						var10000 = Players.field1297; // L: 103
						var10000[var7] = (byte)(var10000[var7] | 2);
					} else {
						var6 = var0.readBits(1); // L: 106
						if (var6 == 0) { // L: 107
							var3 = MusicPatch.method5371(var0); // L: 108
							var10000 = Players.field1297; // L: 109
							var10000[var7] = (byte)(var10000[var7] | 2);
						} else {
							class13.readPlayerUpdate(var0, var7); // L: 112
						}
					}
				}
			}

			var0.exportIndex(); // L: 115
			if (var3 != 0) { // L: 116
				throw new RuntimeException(); // L: 117
			} else {
				var0.importIndex(); // L: 119

				for (var4 = 0; var4 < Players.Players_emptyIdxCount; ++var4) { // L: 120
					var7 = Players.Players_emptyIndices[var4]; // L: 121
					if ((Players.field1297[var7] & 1) != 0) { // L: 122
						if (var3 > 0) { // L: 123
							--var3; // L: 124
							var10000 = Players.field1297; // L: 125
							var10000[var7] = (byte)(var10000[var7] | 2);
						} else {
							var6 = var0.readBits(1); // L: 128
							if (var6 == 0) { // L: 129
								var3 = MusicPatch.method5371(var0); // L: 130
								var10000 = Players.field1297; // L: 131
								var10000[var7] = (byte)(var10000[var7] | 2);
							} else if (class118.updateExternalPlayer(var0, var7)) { // L: 134
								var10000 = Players.field1297;
								var10000[var7] = (byte)(var10000[var7] | 2);
							}
						}
					}
				}

				var0.exportIndex(); // L: 137
				if (var3 != 0) { // L: 138
					throw new RuntimeException(); // L: 139
				} else {
					var0.importIndex(); // L: 141

					for (var4 = 0; var4 < Players.Players_emptyIdxCount; ++var4) { // L: 142
						var7 = Players.Players_emptyIndices[var4]; // L: 143
						if ((Players.field1297[var7] & 1) == 0) { // L: 144
							if (var3 > 0) { // L: 145
								--var3; // L: 146
								var10000 = Players.field1297; // L: 147
								var10000[var7] = (byte)(var10000[var7] | 2);
							} else {
								var6 = var0.readBits(1); // L: 150
								if (var6 == 0) { // L: 151
									var3 = MusicPatch.method5371(var0); // L: 152
									var10000 = Players.field1297; // L: 153
									var10000[var7] = (byte)(var10000[var7] | 2);
								} else if (class118.updateExternalPlayer(var0, var7)) { // L: 156
									var10000 = Players.field1297;
									var10000[var7] = (byte)(var10000[var7] | 2);
								}
							}
						}
					}

					var0.exportIndex(); // L: 159
					if (var3 != 0) { // L: 160
						throw new RuntimeException(); // L: 161
					} else {
						Players.Players_count = 0; // L: 163
						Players.Players_emptyIdxCount = 0; // L: 164

						for (var4 = 1; var4 < 2048; ++var4) { // L: 165
							var10000 = Players.field1297; // L: 166
							var10000[var4] = (byte)(var10000[var4] >> 1);
							Player var5 = Client.players[var4]; // L: 167
							if (var5 != null) { // L: 168
								Players.Players_indices[++Players.Players_count - 1] = var4;
							} else {
								Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var4; // L: 169
							}
						}

						class126.method2789(var0); // L: 172
						if (var0.offset - var2 != var1) { // L: 173
							throw new RuntimeException(var0.offset - var2 + " " + var1); // L: 174
						}
					}
				}
			}
		}
	} // L: 176

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZB)I",
		garbageValue = "-15"
	)
	static int method1879(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) { // L: 3544
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Client.publicChatMode; // L: 3545
			return 1; // L: 3546
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) { // L: 3548
			Nameable.Interpreter_intStackSize -= 3; // L: 3549
			Client.publicChatMode = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 3550
			Player.privateChatMode = class299.method5660(Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]); // L: 3551
			if (Player.privateChatMode == null) { // L: 3552
				Player.privateChatMode = PrivateChatMode.field4823;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 2]; // L: 3553
			PacketBufferNode var13 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2999, Client.packetWriter.isaacCipher); // L: 3555
			var13.packetBuffer.writeByte(Client.publicChatMode); // L: 3556
			var13.packetBuffer.writeByte(Player.privateChatMode.field4824); // L: 3557
			var13.packetBuffer.writeByte(Client.tradeChatMode); // L: 3558
			Client.packetWriter.addNode(var13); // L: 3559
			return 1; // L: 3560
		} else {
			PacketBufferNode var6;
			int var7;
			String var8;
			int var9;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) { // L: 3562
				var8 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize]; // L: 3563
				Nameable.Interpreter_intStackSize -= 2; // L: 3564
				var7 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 3565
				var9 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 3566
				var6 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field3020, Client.packetWriter.isaacCipher); // L: 3568
				var6.packetBuffer.writeByte(class309.stringCp1252NullTerminatedByteSize(var8) + 2); // L: 3569
				var6.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 3570
				var6.packetBuffer.writeByte(var7 - 1); // L: 3571
				var6.packetBuffer.writeByte(var9); // L: 3572
				Client.packetWriter.addNode(var6); // L: 3573
				return 1; // L: 3574
			} else {
				int var3;
				Message var5;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) { // L: 3576
					Nameable.Interpreter_intStackSize -= 2; // L: 3577
					var3 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 3578
					var7 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 3579
					var5 = class282.Messages_getByChannelAndID(var3, var7); // L: 3580
					if (var5 != null) { // L: 3581
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var5.count; // L: 3582
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var5.cycle; // L: 3583
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 3584
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 3585
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 3586
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 3587
					} else {
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = -1; // L: 3590
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 3591
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = ""; // L: 3592
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = ""; // L: 3593
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = ""; // L: 3594
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 3595
					}

					return 1; // L: 3597
				} else {
					Message var4;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) { // L: 3599
						var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 3600
						var4 = ClientPreferences.Messages_getMessage(var3); // L: 3601
						if (var4 != null) { // L: 3602
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var4.type; // L: 3603
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var4.cycle; // L: 3604
							Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 3605
							Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 3606
							Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 3607
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 3608
						} else {
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = -1; // L: 3611
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 3612
							Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = ""; // L: 3613
							Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = ""; // L: 3614
							Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = ""; // L: 3615
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 3616
						}

						return 1; // L: 3618
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) { // L: 3620
						if (Player.privateChatMode == null) { // L: 3621
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Player.privateChatMode.field4824; // L: 3622
						}

						return 1; // L: 3623
					} else {
						PacketBufferNode var12;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) { // L: 3625
							var8 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize]; // L: 3626
							var7 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 3627
							var12 = class259.method5125(var7, var8, MilliClock.clientLanguage, -1); // L: 3628
							Client.packetWriter.addNode(var12); // L: 3629
							return 1; // L: 3630
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) { // L: 3632
							UserComparator8.Interpreter_stringStackSize -= 2; // L: 3633
							var8 = Interpreter.Interpreter_stringStack[UserComparator8.Interpreter_stringStackSize]; // L: 3634
							String var11 = Interpreter.Interpreter_stringStack[UserComparator8.Interpreter_stringStackSize + 1]; // L: 3635
							var12 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field3007, Client.packetWriter.isaacCipher); // L: 3637
							var12.packetBuffer.writeShort(0); // L: 3638
							int var10 = var12.packetBuffer.offset; // L: 3639
							var12.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 3640
							WorldMapScaleHandler.method5045(var12.packetBuffer, var11); // L: 3641
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10); // L: 3642
							Client.packetWriter.addNode(var12); // L: 3643
							return 1; // L: 3644
						} else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) { // L: 3646
							var8 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize]; // L: 3647
							Nameable.Interpreter_intStackSize -= 2; // L: 3648
							var7 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 3649
							var9 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 3650
							var6 = class259.method5125(var7, var8, MilliClock.clientLanguage, var9); // L: 3651
							Client.packetWriter.addNode(var6); // L: 3652
							return 1; // L: 3653
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) { // L: 3655
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) { // L: 3662
								Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Client.tradeChatMode; // L: 3663
								return 1; // L: 3664
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) { // L: 3666
								var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 3667
								Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = WorldMapManager.Messages_getHistorySize(var3); // L: 3668
								return 1; // L: 3669
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) { // L: 3671
								var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 3672
								Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = class16.Messages_getLastChatID(var3); // L: 3673
								return 1; // L: 3674
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) { // L: 3676
								var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 3677
								Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = FontName.method7322(var3); // L: 3678
								return 1; // L: 3679
							} else if (var0 == ScriptOpcodes.DOCHEAT) { // L: 3681
								var8 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize]; // L: 3682
								ReflectionCheck.doCheat(var8); // L: 3683
								return 1; // L: 3684
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) { // L: 3686
								Client.field711 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize].toLowerCase().trim(); // L: 3687
								return 1; // L: 3688
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) { // L: 3690
								Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = Client.field711; // L: 3691
								return 1; // L: 3692
							} else if (var0 == ScriptOpcodes.WRITECONSOLE) { // L: 3694
								var8 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize]; // L: 3695
								System.out.println(var8); // L: 3696
								return 1; // L: 3697
							} else if (var0 == 5024) { // L: 3699
								--Nameable.Interpreter_intStackSize; // L: 3700
								return 1; // L: 3701
							} else if (var0 == 5025) { // L: 3703
								++Nameable.Interpreter_intStackSize; // L: 3704
								return 1; // L: 3705
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYTYPEANDLINE) { // L: 3707
								Nameable.Interpreter_intStackSize -= 2; // L: 3708
								var3 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 3709
								var7 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 3710
								var5 = class282.Messages_getByChannelAndID(var3, var7); // L: 3711
								if (var5 != null) { // L: 3712
									Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var5.count; // L: 3713
									Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var5.cycle; // L: 3714
									Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 3715
									Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 3716
									Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 3717
									Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 3718
									Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = ""; // L: 3719
									Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 3720
								} else {
									Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = -1; // L: 3723
									Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 3724
									Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = ""; // L: 3725
									Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = ""; // L: 3726
									Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = ""; // L: 3727
									Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 3728
									Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = ""; // L: 3729
									Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 3730
								}

								return 1; // L: 3732
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYUID) { // L: 3734
								var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 3735
								var4 = ClientPreferences.Messages_getMessage(var3); // L: 3736
								if (var4 != null) { // L: 3737
									Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var4.type; // L: 3738
									Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var4.cycle; // L: 3739
									Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 3740
									Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 3741
									Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 3742
									Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 3743
									Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = ""; // L: 3744
									Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 3745
								} else {
									Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = -1; // L: 3748
									Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 3749
									Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = ""; // L: 3750
									Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = ""; // L: 3751
									Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = ""; // L: 3752
									Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 3753
									Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = ""; // L: 3754
									Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 3755
								}

								return 1; // L: 3757
							} else {
								return 2; // L: 3759
							}
						} else {
							if (ScriptFrame.localPlayer != null && ScriptFrame.localPlayer.username != null) { // L: 3657
								var8 = ScriptFrame.localPlayer.username.getName();
							} else {
								var8 = ""; // L: 3658
							}

							Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var8; // L: 3659
							return 1; // L: 3660
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "455630942"
	)
	@Export("Clan_joinChat")
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) { // L: 12010
			PacketBufferNode var1 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2989, Client.packetWriter.isaacCipher); // L: 12012
			var1.packetBuffer.writeByte(class309.stringCp1252NullTerminatedByteSize(var0)); // L: 12013
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 12014
			Client.packetWriter.addNode(var1); // L: 12015
		}
	} // L: 12016
}
