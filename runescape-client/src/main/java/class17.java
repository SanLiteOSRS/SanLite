import java.io.File;
import java.io.IOException;
import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("au")
class class17 implements SSLSession {
	@ObfuscatedName("ku")
	@ObfuscatedGetter(
		intValue = 1053269587
	)
	@Export("cameraY")
	static int cameraY;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lap;"
	)
	final class12 this$1;

	@ObfuscatedSignature(
		descriptor = "(Lap;)V"
	)
	class17(class12 var1) {
		this.this$1 = var1; // L: 134
	}

	public int getApplicationBufferSize() {
		return 0; // L: 137
	}

	public long getCreationTime() {
		throw new UnsupportedOperationException(); // L: 147
	}

	public SSLSessionContext getSessionContext() {
		throw new UnsupportedOperationException(); // L: 207
	}

	public long getLastAccessedTime() {
		throw new UnsupportedOperationException(); // L: 157
	}

	public Certificate[] getLocalCertificates() {
		throw new UnsupportedOperationException(); // L: 162
	}

	public Principal getLocalPrincipal() {
		throw new UnsupportedOperationException(); // L: 167
	}

	public int getPacketBufferSize() {
		throw new UnsupportedOperationException(); // L: 172
	}

	public void putValue(String var1, Object var2) {
		throw new UnsupportedOperationException(); // L: 232
	}

	public String getProtocol() {
		throw new UnsupportedOperationException(); // L: 202
	}

	public String getPeerHost() {
		throw new UnsupportedOperationException(); // L: 187
	}

	public void removeValue(String var1) {
		throw new UnsupportedOperationException(); // L: 237
	}

	public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
		return null; // L: 197
	}

	public String[] getValueNames() {
		throw new UnsupportedOperationException(); // L: 217
	}

	public void invalidate() {
		throw new UnsupportedOperationException(); // L: 222
	}

	public boolean isValid() {
		throw new UnsupportedOperationException(); // L: 227
	}

	public byte[] getId() {
		throw new UnsupportedOperationException(); // L: 152
	}

	public int getPeerPort() {
		return 0; // L: 192
	}

	public Object getValue(String var1) {
		throw new UnsupportedOperationException(); // L: 212
	}

	public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
		return this.this$1.field63; // L: 182
	}

	public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
		return null; // L: 177
	}

	public String getCipherSuite() {
		throw new UnsupportedOperationException(); // L: 142
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;ZB)Lto;",
		garbageValue = "110"
	)
	@Export("getPreferencesFile")
	public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
		File var3 = new File(class500.cacheDir, "preferences" + var0 + ".dat"); // L: 267
		if (var3.exists()) { // L: 268
			try {
				AccessFile var10 = new AccessFile(var3, "rw", 10000L); // L: 270
				return var10; // L: 271
			} catch (IOException var9) { // L: 273
			}
		}

		String var4 = ""; // L: 275
		if (FileSystem.cacheGamebuild == 33) { // L: 276
			var4 = "_rc";
		} else if (FileSystem.cacheGamebuild == 34) { // L: 277
			var4 = "_wip";
		}

		File var5 = new File(DevicePcmPlayerProvider.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat"); // L: 278
		AccessFile var6;
		if (!var2 && var5.exists()) { // L: 279
			try {
				var6 = new AccessFile(var5, "rw", 10000L); // L: 281
				return var6; // L: 282
			} catch (IOException var8) { // L: 284
			}
		}

		try {
			var6 = new AccessFile(var3, "rw", 10000L); // L: 287
			return var6; // L: 288
		} catch (IOException var7) { // L: 290
			throw new RuntimeException(); // L: 291
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZI)I",
		garbageValue = "201012705"
	)
	static int method267(int var0, Script var1, boolean var2) {
		int var4 = -1; // L: 624
		Widget var3;
		if (var0 >= 2000) { // L: 625
			var0 -= 1000; // L: 626
			var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 627
			var3 = class33.field184.method6240(var4); // L: 628
		} else {
			var3 = var2 ? class416.scriptDotWidget : class306.field3131; // L: 630
		}

		int var14;
		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) { // L: 631
			Interpreter.Interpreter_intStackSize -= 2; // L: 632
			var14 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 633
			int var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 634
			if (var3.type == 12) { // L: 635
				class344 var7 = var3.method6614(); // L: 636
				if (var7 != null && var7.method6313(var14, var9)) { // L: 637
					ClanChannelMember.invalidateWidget(var3); // L: 638
				}
			} else {
				var3.scrollX = var14; // L: 642
				if (var3.scrollX > var3.scrollWidth - var3.width) { // L: 643
					var3.scrollX = var3.scrollWidth - var3.width;
				}

				if (var3.scrollX < 0) { // L: 644
					var3.scrollX = 0;
				}

				var3.scrollY = var9; // L: 645
				if (var3.scrollY > var3.scrollHeight - var3.height) { // L: 646
					var3.scrollY = var3.scrollHeight - var3.height;
				}

				if (var3.scrollY < 0) { // L: 647
					var3.scrollY = 0;
				}

				ClanChannelMember.invalidateWidget(var3); // L: 648
			}

			return 1; // L: 650
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) {
			var3.color = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 653
			ClanChannelMember.invalidateWidget(var3); // L: 654
			return 1; // L: 655
		} else if (var0 == ScriptOpcodes.CC_SETFILL) {
			var3.fill = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 658
			ClanChannelMember.invalidateWidget(var3); // L: 659
			return 1; // L: 660
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) {
			var3.transparencyTop = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 663
			ClanChannelMember.invalidateWidget(var3); // L: 664
			return 1; // L: 665
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) {
			var3.lineWid = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 668
			ClanChannelMember.invalidateWidget(var3); // L: 669
			return 1; // L: 670
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) {
			var3.spriteId2 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 673
			ClanChannelMember.invalidateWidget(var3); // L: 674
			return 1; // L: 675
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) {
			var3.spriteAngle = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 678
			ClanChannelMember.invalidateWidget(var3); // L: 679
			return 1; // L: 680
		} else if (var0 == ScriptOpcodes.CC_SETTILING) {
			var3.spriteTiling = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 683
			ClanChannelMember.invalidateWidget(var3); // L: 684
			return 1; // L: 685
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) {
			var3.modelType = 1; // L: 688
			var3.modelId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 689
			ClanChannelMember.invalidateWidget(var3); // L: 690
			return 1; // L: 691
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) {
			Interpreter.Interpreter_intStackSize -= 6; // L: 694
			var3.modelOffsetX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 695
			var3.modelOffsetY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 696
			var3.modelAngleX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 697
			var3.modelAngleY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 698
			var3.modelAngleZ = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 4]; // L: 699
			var3.modelZoom = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 5]; // L: 700
			ClanChannelMember.invalidateWidget(var3); // L: 701
			return 1; // L: 702
		} else if (var0 == ScriptOpcodes.CC_SETMODELANIM) {
			var14 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 705
			if (var14 != var3.sequenceId) { // L: 706
				var3.sequenceId = var14; // L: 707
				var3.modelFrame = 0; // L: 708
				var3.modelFrameCycle = 0; // L: 709
				ClanChannelMember.invalidateWidget(var3); // L: 710
			}

			return 1; // L: 712
		} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) {
			var3.modelOrthog = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 715
			ClanChannelMember.invalidateWidget(var3); // L: 716
			return 1; // L: 717
		} else {
			class344 var6;
			if (var0 != ScriptOpcodes.CC_SETTEXT) {
				class344 var11;
				if (var0 == ScriptOpcodes.CC_SETTEXTFONT) {
					var3.fontId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 739
					if (var3.type == 12) { // L: 740
						var11 = var3.method6614(); // L: 741
						if (var11 != null) { // L: 742
							var11.method6486(); // L: 743
						}
					}

					ClanChannelMember.invalidateWidget(var3); // L: 746
					return 1; // L: 747
				} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) {
					Interpreter.Interpreter_intStackSize -= 3; // L: 750
					if (var3.type == 12) { // L: 751
						var11 = var3.method6614(); // L: 752
						if (var11 != null) { // L: 753
							var11.method6537(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 754
							var11.method6315(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]); // L: 755
						}
					} else {
						var3.textXAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 759
						var3.textYAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 760
						var3.textLineHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 761
					}

					ClanChannelMember.invalidateWidget(var3); // L: 763
					return 1; // L: 764
				} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) {
					var3.textShadowed = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 767
					ClanChannelMember.invalidateWidget(var3); // L: 768
					return 1; // L: 769
				} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) {
					var3.outline = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 772
					ClanChannelMember.invalidateWidget(var3); // L: 773
					return 1; // L: 774
				} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) {
					var3.spriteShadow = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 777
					ClanChannelMember.invalidateWidget(var3); // L: 778
					return 1; // L: 779
				} else if (var0 == ScriptOpcodes.CC_SETVFLIP) {
					var3.spriteFlipV = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 782
					ClanChannelMember.invalidateWidget(var3); // L: 783
					return 1; // L: 784
				} else if (var0 == ScriptOpcodes.CC_SETHFLIP) {
					var3.spriteFlipH = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 787
					ClanChannelMember.invalidateWidget(var3); // L: 788
					return 1; // L: 789
				} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) {
					Interpreter.Interpreter_intStackSize -= 2; // L: 792
					var3.scrollWidth = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 793
					var3.scrollHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 794
					ClanChannelMember.invalidateWidget(var3); // L: 795
					if (var4 != -1 && var3.type == 0) {
						PendingSpawn.revalidateWidgetScroll(class33.field184.field3587[var4 >> 16], var3, false); // L: 796
					}

					return 1; // L: 797
				} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) {
					class174.resumePauseWidget(var3.id, var3.childIndex); // L: 800
					Client.meslayerContinueWidget = var3; // L: 801
					ClanChannelMember.invalidateWidget(var3); // L: 802
					return 1; // L: 803
				} else if (var0 == 1122) {
					var3.spriteId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 806
					ClanChannelMember.invalidateWidget(var3); // L: 807
					return 1; // L: 808
				} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) {
					var3.color2 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 811
					ClanChannelMember.invalidateWidget(var3); // L: 812
					return 1; // L: 813
				} else if (var0 == 1124) {
					var3.transparencyBot = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 816
					ClanChannelMember.invalidateWidget(var3); // L: 817
					return 1; // L: 818
				} else if (var0 == 1125) {
					var14 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 821
					class541 var12 = (class541)SequenceDefinition.findEnumerated(class472.FillMode_values(), var14); // L: 822
					if (var12 != null) { // L: 823
						var3.fillMode = var12; // L: 824
						ClanChannelMember.invalidateWidget(var3); // L: 825
					}

					return 1; // L: 827
				} else {
					boolean var8;
					if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) {
						var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 830
						var3.field3700 = var8; // L: 831
						return 1; // L: 832
					} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) {
						var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 835
						var3.modelTransparency = var8; // L: 836
						return 1; // L: 837
					} else if (var0 == 1129) {
						var3.field3713 = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize]; // L: 840
						ClanChannelMember.invalidateWidget(var3); // L: 841
						return 1; // L: 842
					} else if (var0 == 1130) {
						var3.method6692(Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize], AbstractWorldMapIcon.urlRequester, class304.method5858()); // L: 845
						return 1; // L: 846
					} else if (var0 == 1131) {
						Interpreter.Interpreter_intStackSize -= 2; // L: 849
						var3.swapItems(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 850
						return 1; // L: 851
					} else if (var0 == 1132) {
						var3.method6602(Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize], Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 854
						return 1; // L: 855
					} else {
						class339 var13;
						if (var0 == 1133) {
							--Interpreter.Interpreter_intStackSize; // L: 858
							var13 = var3.method6615(); // L: 859
							if (var13 != null) { // L: 860
								var13.field3591 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 861
								ClanChannelMember.invalidateWidget(var3); // L: 862
							}

							return 1; // L: 864
						} else if (var0 == 1134) {
							--Interpreter.Interpreter_intStackSize; // L: 867
							var13 = var3.method6615(); // L: 868
							if (var13 != null) { // L: 869
								var13.field3592 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 870
								ClanChannelMember.invalidateWidget(var3); // L: 871
							}

							return 1; // L: 873
						} else if (var0 == 1135) {
							--class180.Interpreter_stringStackSize; // L: 876
							var11 = var3.method6614(); // L: 877
							if (var11 != null) { // L: 878
								var3.field3810 = Interpreter.Interpreter_stringStack[class180.Interpreter_stringStackSize]; // L: 879
							}

							return 1; // L: 881
						} else if (var0 == 1136) {
							--Interpreter.Interpreter_intStackSize; // L: 884
							var13 = var3.method6615(); // L: 885
							if (var13 != null) { // L: 886
								var13.field3593 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 887
								ClanChannelMember.invalidateWidget(var3); // L: 888
							}

							return 1; // L: 890
						} else if (var0 == 1137) {
							--Interpreter.Interpreter_intStackSize; // L: 893
							var11 = var3.method6614(); // L: 894
							if (var11 != null && var11.method6321(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) { // L: 895
								ClanChannelMember.invalidateWidget(var3); // L: 896
							}

							return 1; // L: 898
						} else if (var0 == 1138) {
							--Interpreter.Interpreter_intStackSize; // L: 901
							var11 = var3.method6614(); // L: 902
							if (var11 != null && var11.method6311(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) { // L: 903
								ClanChannelMember.invalidateWidget(var3); // L: 904
							}

							return 1; // L: 906
						} else if (var0 == 1139) {
							--Interpreter.Interpreter_intStackSize; // L: 909
							var11 = var3.method6614(); // L: 910
							if (var11 != null && var11.method6412(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) { // L: 911
								ClanChannelMember.invalidateWidget(var3); // L: 912
							}

							return 1; // L: 914
						} else if (var0 == 1140) {
							var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 917
							Client.field756.method4232(); // L: 918
							var6 = var3.method6614(); // L: 919
							if (var6 != null && var6.method6304(var8)) { // L: 920
								if (var8) { // L: 921
									Client.field756.method4216(var3); // L: 922
								}

								ClanChannelMember.invalidateWidget(var3); // L: 924
							}

							return 1; // L: 926
						} else if (var0 == 1141) {
							var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 929
							if (!var8 && Client.field756.method4217() == var3) { // L: 930
								Client.field756.method4232(); // L: 931
								ClanChannelMember.invalidateWidget(var3); // L: 932
							}

							var6 = var3.method6614(); // L: 934
							if (var6 != null) { // L: 935
								var6.method6305(var8); // L: 936
							}

							return 1; // L: 938
						} else if (var0 == 1142) {
							Interpreter.Interpreter_intStackSize -= 2; // L: 941
							var11 = var3.method6614(); // L: 942
							if (var11 != null && var11.method6314(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1])) { // L: 943
								ClanChannelMember.invalidateWidget(var3); // L: 944
							}

							return 1; // L: 946
						} else if (var0 == 1143) {
							--Interpreter.Interpreter_intStackSize; // L: 949
							var11 = var3.method6614(); // L: 950
							if (var11 != null && var11.method6314(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) { // L: 951
								ClanChannelMember.invalidateWidget(var3); // L: 952
							}

							return 1; // L: 954
						} else if (var0 == 1144) {
							--Interpreter.Interpreter_intStackSize; // L: 957
							var11 = var3.method6614(); // L: 958
							if (var11 != null) { // L: 959
								var11.method6317(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]); // L: 960
								ClanChannelMember.invalidateWidget(var3); // L: 961
							}

							return 1; // L: 963
						} else if (var0 == 1145) {
							--Interpreter.Interpreter_intStackSize; // L: 966
							var11 = var3.method6614(); // L: 967
							if (var11 != null) { // L: 968
								var11.method6316(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]); // L: 969
							}

							return 1; // L: 971
						} else if (var0 == 1146) {
							--Interpreter.Interpreter_intStackSize; // L: 974
							var11 = var3.method6614(); // L: 975
							if (var11 != null) { // L: 976
								var11.method6319(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]); // L: 977
							}

							return 1; // L: 979
						} else if (var0 == 1147) {
							--Interpreter.Interpreter_intStackSize; // L: 982
							var11 = var3.method6614(); // L: 983
							if (var11 != null) { // L: 984
								var11.method6318(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]); // L: 985
								ClanChannelMember.invalidateWidget(var3); // L: 986
							}

							return 1; // L: 988
						} else {
							class27 var10;
							if (var0 == 1148) {
								Interpreter.Interpreter_intStackSize -= 2; // L: 991
								var10 = var3.method6591(); // L: 992
								if (var10 != null) { // L: 993
									var10.method372(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 994
								}

								return 1; // L: 996
							} else if (var0 == 1149) {
								Interpreter.Interpreter_intStackSize -= 2; // L: 999
								var10 = var3.method6591(); // L: 1000
								if (var10 != null) { // L: 1001
									var10.method373((char)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 1002
								}

								return 1; // L: 1004
							} else if (var0 == 1150) {
								var3.method6676(Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize], AbstractWorldMapIcon.urlRequester); // L: 1007
								return 1; // L: 1008
							} else {
								return 2; // L: 1010
							}
						}
					}
				}
			} else {
				String var5 = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize]; // L: 720
				if (!var5.equals(var3.text)) { // L: 721
					if (var3.type == 12) { // L: 722
						var6 = var3.method6614(); // L: 723
						if (var6 != null && var6.method6360()) { // L: 724
							var6.method6306(var5); // L: 725
						} else {
							var3.text = var5; // L: 728
						}
					} else {
						var3.text = var5; // L: 732
					}

					ClanChannelMember.invalidateWidget(var3); // L: 734
				}

				return 1; // L: 736
			}
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZI)I",
		garbageValue = "-236516761"
	)
	static int method265(int var0, Script var1, boolean var2) {
		if (var0 == 7108) { // L: 5114
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = VarcInt.method3678() ? 1 : 0; // L: 5115
			return 1; // L: 5116
		} else {
			return 2; // L: 5118
		}
	}
}
