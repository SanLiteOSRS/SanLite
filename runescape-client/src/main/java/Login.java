import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bb")
@Implements("Login")
public class Login {
	@ObfuscatedName("q")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1411364875
	)
	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "[Lql;"
	)
	@Export("runesSprite")
	static IndexedSprite[] runesSprite;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	static IndexedSprite field896;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "[Lql;"
	)
	@Export("title_muteSprite")
	static IndexedSprite[] title_muteSprite;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	@Export("options_buttons_2Sprite")
	static IndexedSprite options_buttons_2Sprite;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1251453039
	)
	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1821993491
	)
	@Export("loginBoxCenter")
	static int loginBoxCenter;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1543148131
	)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("r")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 462202927
	)
	static int field906;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1071854183
	)
	static int field919;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1929273885
	)
	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("bz")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("bs")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("bg")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("bv")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("ba")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("bd")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 1746648981
	)
	static int field912;
	@ObfuscatedName("bk")
	static String[] field901;
	@ObfuscatedName("bc")
	static boolean field892;
	@ObfuscatedName("bo")
	static boolean field918;
	@ObfuscatedName("bm")
	@Export("otp")
	static String otp;
	@ObfuscatedName("bl")
	static boolean field893;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -2020053889
	)
	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("ci")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "[Lql;"
	)
	@Export("worldSelectArrows")
	static IndexedSprite[] worldSelectArrows;
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	static IndexedSprite field931;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 111823069
	)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = -1302811983
	)
	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -1864267867
	)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		longValue = -1392885950958470859L
	)
	static long field928;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		longValue = 4805928807234507383L
	)
	static long field929;
	@ObfuscatedName("cl")
	static String[] field930;
	@ObfuscatedName("cn")
	static String[] field907;

	static {
		xPadding = 0; // L: 47
		loginBoxX = xPadding + 202; // L: 66
		Login_loadingPercent = 10; // L: 68
		Login_loadingText = ""; // L: 69
		field906 = -1; // L: 89
		field919 = 1; // L: 92
		loginIndex = 0; // L: 96
		Login_response0 = ""; // L: 97
		Login_response1 = ""; // L: 98
		Login_response2 = ""; // L: 99
		Login_response3 = ""; // L: 100
		Login_username = ""; // L: 101
		Login_password = ""; // L: 102
		field912 = 0; // L: 104
		field901 = new String[8]; // L: 105
		field892 = false; // L: 116
		field918 = false; // L: 117
		field893 = true; // L: 120
		currentLoginField = 0; // L: 121
		worldSelectOpen = false; // L: 125
		hoveredWorldIndex = -1; // L: 133
		worldSelectPage = 0; // L: 134
		worldSelectPagesCount = 0; // L: 135
		new DecimalFormat("##0.00"); // L: 138
		new class120();
		field928 = -1L; // L: 146
		field929 = -1L; // L: 147
		field930 = new String[]{"title.jpg"}; // L: 150
		field907 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"}; // L: 153
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Llc;Llc;IZI)Ldj;",
		garbageValue = "1657905624"
	)
	public static class122 method1972(AbstractArchive var0, AbstractArchive var1, int var2, boolean var3) {
		boolean var4 = true; // L: 21
		byte[] var5 = var0.getFile(var2 >> 16 & 65535, var2 & 65535); // L: 22
		if (var5 == null) { // L: 23
			var4 = false; // L: 24
			return null; // L: 25
		} else {
			int var6 = (var5[1] & 255) << 8 | var5[2] & 255; // L: 27
			byte[] var7;
			if (var3) {
				var7 = var1.getFile(0, var6); // L: 29
			} else {
				var7 = var1.getFile(var6, 0); // L: 30
			}

			if (var7 == null) { // L: 31
				var4 = false;
			}

			if (!var4) { // L: 32
				return null;
			} else {
				try {
					return new class122(var0, var1, var2, var3); // L: 34
				} catch (Exception var9) { // L: 36
					return null; // L: 37
				}
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILbc;ZB)I",
		garbageValue = "-47"
	)
	static int method1996(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) { // L: 3535
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Client.publicChatMode; // L: 3536
			return 1; // L: 3537
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) { // L: 3539
			TaskHandler.Interpreter_intStackSize -= 3; // L: 3540
			Client.publicChatMode = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 3541
			ItemLayer.privateChatMode = class119.method2819(Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]); // L: 3542
			if (ItemLayer.privateChatMode == null) { // L: 3543
				ItemLayer.privateChatMode = PrivateChatMode.field4825;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 2]; // L: 3544
			PacketBufferNode var13 = class433.getPacketBufferNode(ClientPacket.field2919, Client.packetWriter.isaacCipher); // L: 3546
			var13.packetBuffer.writeByte(Client.publicChatMode); // L: 3547
			var13.packetBuffer.writeByte(ItemLayer.privateChatMode.field4826); // L: 3548
			var13.packetBuffer.writeByte(Client.tradeChatMode); // L: 3549
			Client.packetWriter.addNode(var13); // L: 3550
			return 1; // L: 3551
		} else {
			PacketBufferNode var6;
			int var7;
			String var8;
			int var9;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) { // L: 3553
				var8 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]; // L: 3554
				TaskHandler.Interpreter_intStackSize -= 2; // L: 3555
				var7 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 3556
				var9 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 3557
				var6 = class433.getPacketBufferNode(ClientPacket.field3014, Client.packetWriter.isaacCipher); // L: 3559
				var6.packetBuffer.writeByte(class92.stringCp1252NullTerminatedByteSize(var8) + 2); // L: 3560
				var6.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 3561
				var6.packetBuffer.writeByte(var7 - 1); // L: 3562
				var6.packetBuffer.writeByte(var9); // L: 3563
				Client.packetWriter.addNode(var6); // L: 3564
				return 1; // L: 3565
			} else {
				int var3;
				Message var5;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) { // L: 3567
					TaskHandler.Interpreter_intStackSize -= 2; // L: 3568
					var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 3569
					var7 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 3570
					var5 = class113.Messages_getByChannelAndID(var3, var7); // L: 3571
					if (var5 != null) { // L: 3572
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var5.count; // L: 3573
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var5.cycle; // L: 3574
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 3575
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 3576
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 3577
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 3578
					} else {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1; // L: 3581
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 3582
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = ""; // L: 3583
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = ""; // L: 3584
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = ""; // L: 3585
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 3586
					}

					return 1; // L: 3588
				} else {
					Message var4;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) { // L: 3590
						var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 3591
						var4 = NPC.Messages_getMessage(var3); // L: 3592
						if (var4 != null) { // L: 3593
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var4.type; // L: 3594
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var4.cycle; // L: 3595
							Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 3596
							Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 3597
							Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 3598
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 3599
						} else {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1; // L: 3602
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 3603
							Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = ""; // L: 3604
							Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = ""; // L: 3605
							Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = ""; // L: 3606
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 3607
						}

						return 1; // L: 3609
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) { // L: 3611
						if (ItemLayer.privateChatMode == null) { // L: 3612
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = ItemLayer.privateChatMode.field4826; // L: 3613
						}

						return 1; // L: 3614
					} else {
						PacketBufferNode var12;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) { // L: 3616
							var8 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]; // L: 3617
							var7 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 3618
							var12 = class430.method7571(var7, var8, class21.clientLanguage, -1); // L: 3619
							Client.packetWriter.addNode(var12); // L: 3620
							return 1; // L: 3621
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) { // L: 3623
							GrandExchangeOfferAgeComparator.Interpreter_stringStackSize -= 2; // L: 3624
							var8 = Interpreter.Interpreter_stringStack[GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]; // L: 3625
							String var11 = Interpreter.Interpreter_stringStack[GrandExchangeOfferAgeComparator.Interpreter_stringStackSize + 1]; // L: 3626
							var12 = class433.getPacketBufferNode(ClientPacket.field3001, Client.packetWriter.isaacCipher); // L: 3628
							var12.packetBuffer.writeShort(0); // L: 3629
							int var10 = var12.packetBuffer.offset; // L: 3630
							var12.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 3631
							ArchiveDiskAction.method5785(var12.packetBuffer, var11); // L: 3632
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10); // L: 3633
							Client.packetWriter.addNode(var12); // L: 3634
							return 1; // L: 3635
						} else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) { // L: 3637
							var8 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]; // L: 3638
							TaskHandler.Interpreter_intStackSize -= 2; // L: 3639
							var7 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 3640
							var9 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 3641
							var6 = class430.method7571(var7, var8, class21.clientLanguage, var9); // L: 3642
							Client.packetWriter.addNode(var6); // L: 3643
							return 1; // L: 3644
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) { // L: 3646
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) { // L: 3653
								Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Client.tradeChatMode; // L: 3654
								return 1; // L: 3655
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) { // L: 3657
								var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 3658
								Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = UserComparator9.Messages_getHistorySize(var3); // L: 3659
								return 1; // L: 3660
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) { // L: 3662
								var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 3663
								Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class123.Messages_getLastChatID(var3); // L: 3664
								return 1; // L: 3665
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) { // L: 3667
								var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 3668
								Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class142.method3067(var3); // L: 3669
								return 1; // L: 3670
							} else if (var0 == ScriptOpcodes.DOCHEAT) { // L: 3672
								var8 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]; // L: 3673
								KeyHandler.doCheat(var8); // L: 3674
								return 1; // L: 3675
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) { // L: 3677
								Client.field719 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize].toLowerCase().trim(); // L: 3678
								return 1; // L: 3679
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) { // L: 3681
								Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = Client.field719; // L: 3682
								return 1; // L: 3683
							} else if (var0 == ScriptOpcodes.WRITECONSOLE) { // L: 3685
								var8 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]; // L: 3686
								System.out.println(var8); // L: 3687
								return 1; // L: 3688
							} else if (var0 == 5024) { // L: 3690
								--TaskHandler.Interpreter_intStackSize; // L: 3691
								return 1; // L: 3692
							} else if (var0 == 5025) { // L: 3694
								++TaskHandler.Interpreter_intStackSize; // L: 3695
								return 1; // L: 3696
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYTYPEANDLINE) { // L: 3698
								TaskHandler.Interpreter_intStackSize -= 2; // L: 3699
								var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 3700
								var7 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 3701
								var5 = class113.Messages_getByChannelAndID(var3, var7); // L: 3702
								if (var5 != null) { // L: 3703
									Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var5.count; // L: 3704
									Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var5.cycle; // L: 3705
									Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 3706
									Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 3707
									Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 3708
									Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 3709
									Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = ""; // L: 3710
									Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 3711
								} else {
									Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1; // L: 3714
									Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 3715
									Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = ""; // L: 3716
									Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = ""; // L: 3717
									Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = ""; // L: 3718
									Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 3719
									Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = ""; // L: 3720
									Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 3721
								}

								return 1; // L: 3723
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYUID) { // L: 3725
								var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 3726
								var4 = NPC.Messages_getMessage(var3); // L: 3727
								if (var4 != null) { // L: 3728
									Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var4.type; // L: 3729
									Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var4.cycle; // L: 3730
									Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 3731
									Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 3732
									Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 3733
									Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 3734
									Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = ""; // L: 3735
									Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 3736
								} else {
									Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1; // L: 3739
									Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 3740
									Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = ""; // L: 3741
									Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = ""; // L: 3742
									Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = ""; // L: 3743
									Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 3744
									Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = ""; // L: 3745
									Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 3746
								}

								return 1; // L: 3748
							} else {
								return 2; // L: 3750
							}
						} else {
							if (class28.localPlayer != null && class28.localPlayer.username != null) { // L: 3648
								var8 = class28.localPlayer.username.getName();
							} else {
								var8 = ""; // L: 3649
							}

							Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var8; // L: 3650
							return 1; // L: 3651
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILbc;ZB)I",
		garbageValue = "5"
	)
	static int method1940(int var0, Script var1, boolean var2) {
		if (var0 == 6800) { // L: 4520
			Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = ""; // L: 4521
			return 1; // L: 4522
		} else if (var0 != 6801 && var0 != 6802) { // L: 4524
			if (var0 == 6809) { // L: 4528
				int var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 4529
				ObjectComposition var4 = WorldMapDecoration.getObjectDefinition(var3); // L: 4530
				Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var4 != null ? var4.name : ""; // L: 4531
				return 1; // L: 4532
			} else if (var0 == 6850) { // L: 4534
				Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = ""; // L: 4535
				return 1; // L: 4536
			} else if (var0 != 6851 && var0 != 6852) { // L: 4538
				if (var0 == 6853) { // L: 4542
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 4543
					return 1; // L: 4544
				} else {
					return 2; // L: 4546
				}
			} else {
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1; // L: 4539
				return 1; // L: 4540
			}
		} else {
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1; // L: 4525
			return 1; // L: 4526
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(ILbc;ZI)I",
		garbageValue = "-2130618157"
	)
	static int method1999(int var0, Script var1, boolean var2) {
		if (var0 == 7600) { // L: 4901
			--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize; // L: 4902
			return 1; // L: 4903
		} else if (var0 == 7601) { // L: 4905
			--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize; // L: 4906
			return 1; // L: 4907
		} else if (var0 == 7602) { // L: 4909
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 4910
			return 1; // L: 4911
		} else if (var0 == 7603) { // L: 4913
			--TaskHandler.Interpreter_intStackSize; // L: 4914
			Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = ""; // L: 4915
			return 1; // L: 4916
		} else if (var0 == 7604) { // L: 4918
			--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize; // L: 4919
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 4920
			return 1; // L: 4921
		} else if (var0 == 7605) { // L: 4923
			--TaskHandler.Interpreter_intStackSize; // L: 4924
			return 1; // L: 4925
		} else if (var0 == 7606) { // L: 4927
			TaskHandler.Interpreter_intStackSize -= 2; // L: 4928
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 4929
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 4930
			return 1; // L: 4931
		} else if (var0 == 7607) { // L: 4933
			return 1; // L: 4934
		} else if (var0 == 7608) { // L: 4936
			--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize; // L: 4937
			return 1; // L: 4938
		} else if (var0 == 7609) { // L: 4940
			--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize; // L: 4941
			return 1; // L: 4942
		} else if (var0 == 7610) { // L: 4944
			--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize; // L: 4945
			return 1; // L: 4946
		} else if (var0 == 7611) { // L: 4948
			--TaskHandler.Interpreter_intStackSize; // L: 4949
			return 1; // L: 4950
		} else if (var0 == 7612) { // L: 4952
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 4953
			return 1; // L: 4954
		} else if (var0 == 7613) { // L: 4956
			--TaskHandler.Interpreter_intStackSize; // L: 4957
			Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = ""; // L: 4958
			return 1; // L: 4959
		} else if (var0 == 7614) { // L: 4961
			return 1; // L: 4962
		} else if (var0 == 7615) { // L: 4964
			--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize; // L: 4965
			return 1; // L: 4966
		} else if (var0 == 7616) { // L: 4968
			--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize; // L: 4969
			TaskHandler.Interpreter_intStackSize -= 2; // L: 4970
			return 1; // L: 4971
		} else if (var0 == 7617) { // L: 4973
			--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize; // L: 4974
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 4975
			return 1; // L: 4976
		} else {
			return 2; // L: 4978
		}
	}
}
