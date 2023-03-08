import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fe")
public class class160 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZI)I",
		garbageValue = "-1845674352"
	)
	static int method3374(int var0, Script var1, boolean var2) {
		String var3;
		int var10;
		if (var0 == ScriptOpcodes.APPEND_NUM) { // L: 3649
			var3 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize]; // L: 3650
			var10 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 3651
			Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var3 + var10; // L: 3652
			return 1; // L: 3653
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) { // L: 3655
				class20.Interpreter_stringStackSize -= 2; // L: 3656
				var3 = Interpreter.Interpreter_stringStack[class20.Interpreter_stringStackSize]; // L: 3657
				var4 = Interpreter.Interpreter_stringStack[class20.Interpreter_stringStackSize + 1]; // L: 3658
				Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var3 + var4; // L: 3659
				return 1; // L: 3660
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) { // L: 3662
				var3 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize]; // L: 3663
				var10 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 3664
				Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var3 + ParamComposition.intToString(var10, true); // L: 3665
				return 1; // L: 3666
			} else if (var0 == ScriptOpcodes.LOWERCASE) { // L: 3668
				var3 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize]; // L: 3669
				Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var3.toLowerCase(); // L: 3670
				return 1; // L: 3671
			} else {
				int var6;
				int var11;
				if (var0 == ScriptOpcodes.FROMDATE) { // L: 3673
					var11 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 3674
					long var14 = 86400000L * (11745L + (long)var11); // L: 3675
					Interpreter.Interpreter_calendar.setTime(new Date(var14)); // L: 3676
					var6 = Interpreter.Interpreter_calendar.get(5); // L: 3677
					int var17 = Interpreter.Interpreter_calendar.get(2); // L: 3678
					int var8 = Interpreter.Interpreter_calendar.get(1); // L: 3679
					Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var17] + "-" + var8; // L: 3680
					return 1; // L: 3681
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) { // L: 3683
					if (var0 == ScriptOpcodes.TOSTRING) { // L: 3695
						var11 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 3696
						Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = Integer.toString(var11); // L: 3697
						return 1; // L: 3698
					} else if (var0 == ScriptOpcodes.COMPARE) { // L: 3700
						class20.Interpreter_stringStackSize -= 2; // L: 3701
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = AbstractArchive.method6625(Projectile.compareStrings(Interpreter.Interpreter_stringStack[class20.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[class20.Interpreter_stringStackSize + 1], class36.clientLanguage)); // L: 3702
						return 1; // L: 3703
					} else {
						int var9;
						byte[] var12;
						Font var13;
						if (var0 == ScriptOpcodes.PARAHEIGHT) { // L: 3705
							var3 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize]; // L: 3706
							class302.Interpreter_intStackSize -= 2; // L: 3707
							var10 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 3708
							var9 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 3709
							var12 = PendingSpawn.archive13.takeFile(var9, 0); // L: 3710
							var13 = new Font(var12); // L: 3711
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var13.lineCount(var3, var10); // L: 3712
							return 1; // L: 3713
						} else if (var0 == ScriptOpcodes.PARAWIDTH) { // L: 3715
							var3 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize]; // L: 3716
							class302.Interpreter_intStackSize -= 2; // L: 3717
							var10 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 3718
							var9 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 3719
							var12 = PendingSpawn.archive13.takeFile(var9, 0); // L: 3720
							var13 = new Font(var12); // L: 3721
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var13.lineWidth(var3, var10); // L: 3722
							return 1; // L: 3723
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) { // L: 3725
							class20.Interpreter_stringStackSize -= 2; // L: 3726
							var3 = Interpreter.Interpreter_stringStack[class20.Interpreter_stringStackSize]; // L: 3727
							var4 = Interpreter.Interpreter_stringStack[class20.Interpreter_stringStackSize + 1]; // L: 3728
							if (Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1) { // L: 3729
								Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var4; // L: 3730
							}

							return 1; // L: 3731
						} else if (var0 == ScriptOpcodes.ESCAPE) { // L: 3733
							var3 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize]; // L: 3734
							Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3); // L: 3735
							return 1; // L: 3736
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) { // L: 3738
							var3 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize]; // L: 3739
							var10 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 3740
							Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var3 + (char)var10; // L: 3741
							return 1; // L: 3742
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) { // L: 3744
							var11 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 3745
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = class126.isCharPrintable((char)var11) ? 1 : 0; // L: 3746
							return 1; // L: 3747
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) { // L: 3749
							var11 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 3750
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = class97.isAlphaNumeric((char)var11) ? 1 : 0; // L: 3751
							return 1; // L: 3752
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) { // L: 3754
							var11 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 3755
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = class155.isCharAlphabetic((char)var11) ? 1 : 0; // L: 3756
							return 1; // L: 3757
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) { // L: 3759
							var11 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 3760
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = CollisionMap.isDigit((char)var11) ? 1 : 0; // L: 3761
							return 1; // L: 3762
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) { // L: 3764
							var3 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize]; // L: 3765
							if (var3 != null) { // L: 3766
								Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 3767
							}

							return 1; // L: 3768
						} else if (var0 == ScriptOpcodes.SUBSTRING) { // L: 3770
							var3 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize]; // L: 3771
							class302.Interpreter_intStackSize -= 2; // L: 3772
							var10 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 3773
							var9 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 3774
							Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var3.substring(var10, var9); // L: 3775
							return 1; // L: 3776
						} else if (var0 == ScriptOpcodes.REMOVETAGS) { // L: 3778
							var3 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize]; // L: 3779
							StringBuilder var16 = new StringBuilder(var3.length()); // L: 3780
							boolean var18 = false; // L: 3781

							for (var6 = 0; var6 < var3.length(); ++var6) { // L: 3782
								char var7 = var3.charAt(var6); // L: 3783
								if (var7 == '<') { // L: 3784
									var18 = true;
								} else if (var7 == '>') { // L: 3785
									var18 = false;
								} else if (!var18) { // L: 3786
									var16.append(var7);
								}
							}

							Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var16.toString(); // L: 3788
							return 1; // L: 3789
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) { // L: 3791
							var3 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize]; // L: 3792
							var10 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 3793
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.indexOf(var10); // L: 3794
							return 1; // L: 3795
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) { // L: 3797
							class20.Interpreter_stringStackSize -= 2; // L: 3798
							var3 = Interpreter.Interpreter_stringStack[class20.Interpreter_stringStackSize]; // L: 3799
							var4 = Interpreter.Interpreter_stringStack[class20.Interpreter_stringStackSize + 1]; // L: 3800
							var9 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 3801
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.indexOf(var4, var9); // L: 3802
							return 1; // L: 3803
						} else if (var0 == 4122) { // L: 3805
							var3 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize]; // L: 3806
							Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var3.toUpperCase(); // L: 3807
							return 1; // L: 3808
						} else if (var0 == 4123) { // L: 3810
							class20.Interpreter_stringStackSize -= 3; // L: 3811
							var3 = Interpreter.Interpreter_stringStack[class20.Interpreter_stringStackSize]; // L: 3812
							var4 = Interpreter.Interpreter_stringStack[class20.Interpreter_stringStackSize + 1]; // L: 3813
							String var5 = Interpreter.Interpreter_stringStack[class20.Interpreter_stringStackSize + 2]; // L: 3814
							if (class387.localPlayer.appearance == null) { // L: 3815
								Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var5; // L: 3816
								return 1; // L: 3817
							} else {
								switch(class387.localPlayer.appearance.field3486) { // L: 3819
								case 0:
									Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var3; // L: 3825
									break; // L: 3826
								case 1:
									Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var4; // L: 3828
									break;
								case 2:
								default:
									Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var5; // L: 3822
								}

								return 1; // L: 3831
							}
						} else {
							return 2; // L: 3833
						}
					}
				} else {
					class20.Interpreter_stringStackSize -= 2; // L: 3684
					var3 = Interpreter.Interpreter_stringStack[class20.Interpreter_stringStackSize]; // L: 3685
					var4 = Interpreter.Interpreter_stringStack[class20.Interpreter_stringStackSize + 1]; // L: 3686
					if (class387.localPlayer.appearance != null && class387.localPlayer.appearance.field3491 != 0) { // L: 3687
						Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var4; // L: 3691
					} else {
						Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var3; // L: 3688
					}

					return 1; // L: 3693
				}
			}
		}
	}

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1080663115"
	)
	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field733 = 0L; // L: 4635
		if (var0 >= 2) { // L: 4636
			Client.isResizable = true;
		} else {
			Client.isResizable = false; // L: 4637
		}

		if (Message.getWindowedMode() == 1) { // L: 4638
			Decimator.client.setMaxCanvasSize(765, 503); // L: 4639
		} else {
			Decimator.client.setMaxCanvasSize(7680, 2160); // L: 4642
		}

		if (Client.gameState >= 25) { // L: 4644
			PacketBufferNode var1 = Renderable.getPacketBufferNode(ClientPacket.field3126, Client.packetWriter.isaacCipher); // L: 4646
			var1.packetBuffer.writeByte(Message.getWindowedMode()); // L: 4647
			var1.packetBuffer.writeShort(GameEngine.canvasWidth); // L: 4648
			var1.packetBuffer.writeShort(class127.canvasHeight); // L: 4649
			Client.packetWriter.addNode(var1); // L: 4650
		}

	} // L: 4652

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "0"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (class463.friendsChatManager != null) { // L: 13126
			PacketBufferNode var1 = Renderable.getPacketBufferNode(ClientPacket.field3066, Client.packetWriter.isaacCipher); // L: 13127
			var1.packetBuffer.writeByte(class96.stringCp1252NullTerminatedByteSize(var0)); // L: 13128
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 13129
			Client.packetWriter.addNode(var1); // L: 13130
		}
	} // L: 13131

	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "(Lkz;I)Z",
		garbageValue = "419433067"
	)
	@Export("isComponentHidden")
	static boolean isComponentHidden(Widget var0) {
		return var0.isHidden; // L: 13204
	}
}
