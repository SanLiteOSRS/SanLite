import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("nm")
public class class357 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	static final class357 field3895;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	static final class357 field3897;
	@ObfuscatedName("bh")
	@Export("hasFocus")
	protected static boolean hasFocus;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 346159071
	)
	final int field3894;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1315455049
	)
	final int field3893;

	static {
		field3895 = new class357(51, 27, 800, 0, 16, 16); // L: 33
		field3897 = new class357(25, 28, 800, 656, 40, 40); // L: 34
	}

	class357(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field3894 = var5; // L: 39
		this.field3893 = var6; // L: 40
	} // L: 41

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "1617415071"
	)
	static int method6861(int var0, Script var1, boolean var2) {
		int var4 = -1; // L: 624
		Widget var3;
		if (var0 >= 2000) { // L: 625
			var0 -= 1000; // L: 626
			var4 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 627
			var3 = HealthBarDefinition.field1877.method6285(var4); // L: 628
		} else {
			var3 = var2 ? Interpreter.scriptDotWidget : HealthBar.field1302; // L: 630
		}

		int var14;
		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) { // L: 631
			class517.Interpreter_intStackSize -= 2; // L: 632
			var14 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 633
			int var9 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 634
			if (var3.type == 12) { // L: 635
				class341 var7 = var3.method6688(); // L: 636
				if (var7 != null && var7.method6370(var14, var9)) { // L: 637
					class159.invalidateWidget(var3); // L: 638
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

				class159.invalidateWidget(var3); // L: 648
			}

			return 1; // L: 650
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) {
			var3.color = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 653
			class159.invalidateWidget(var3); // L: 654
			return 1; // L: 655
		} else if (var0 == ScriptOpcodes.CC_SETFILL) {
			var3.fill = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 658
			class159.invalidateWidget(var3); // L: 659
			return 1; // L: 660
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) {
			var3.transparencyTop = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 663
			class159.invalidateWidget(var3); // L: 664
			return 1; // L: 665
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) {
			var3.lineWid = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 668
			class159.invalidateWidget(var3); // L: 669
			return 1; // L: 670
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) {
			var3.spriteId2 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 673
			class159.invalidateWidget(var3); // L: 674
			return 1; // L: 675
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) {
			var3.spriteAngle = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 678
			class159.invalidateWidget(var3); // L: 679
			return 1; // L: 680
		} else if (var0 == ScriptOpcodes.CC_SETTILING) {
			var3.spriteTiling = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 683
			class159.invalidateWidget(var3); // L: 684
			return 1; // L: 685
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) {
			var3.modelType = 1; // L: 688
			var3.modelId = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 689
			class159.invalidateWidget(var3); // L: 690
			return 1; // L: 691
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) {
			class517.Interpreter_intStackSize -= 6; // L: 694
			var3.modelOffsetX = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 695
			var3.modelOffsetY = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 696
			var3.modelAngleX = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 2]; // L: 697
			var3.modelAngleY = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 3]; // L: 698
			var3.modelAngleZ = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 4]; // L: 699
			var3.modelZoom = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 5]; // L: 700
			class159.invalidateWidget(var3); // L: 701
			return 1; // L: 702
		} else if (var0 == ScriptOpcodes.CC_SETMODELANIM) {
			var14 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 705
			if (var14 != var3.sequenceId) { // L: 706
				var3.sequenceId = var14; // L: 707
				var3.modelFrame = 0; // L: 708
				var3.modelFrameCycle = 0; // L: 709
				class159.invalidateWidget(var3); // L: 710
			}

			return 1; // L: 712
		} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) {
			var3.modelOrthog = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 715
			class159.invalidateWidget(var3); // L: 716
			return 1; // L: 717
		} else {
			class341 var6;
			if (var0 != ScriptOpcodes.CC_SETTEXT) {
				class341 var11;
				if (var0 == ScriptOpcodes.CC_SETTEXTFONT) {
					var3.fontId = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 738
					if (var3.type == 12) { // L: 739
						var11 = var3.method6688(); // L: 740
						if (var11 != null) { // L: 741
							var11.method6386(); // L: 742
						}
					}

					class159.invalidateWidget(var3); // L: 745
					return 1; // L: 746
				} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) {
					class517.Interpreter_intStackSize -= 3; // L: 749
					if (var3.type == 12) { // L: 750
						var11 = var3.method6688(); // L: 751
						if (var11 != null) { // L: 752
							var11.method6371(Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]); // L: 753
							var11.method6372(Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 2]); // L: 754
						}
					} else {
						var3.textXAlignment = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 758
						var3.textYAlignment = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 759
						var3.textLineHeight = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 2]; // L: 760
					}

					class159.invalidateWidget(var3); // L: 762
					return 1; // L: 763
				} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) {
					var3.textShadowed = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 766
					class159.invalidateWidget(var3); // L: 767
					return 1; // L: 768
				} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) {
					var3.outline = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 771
					class159.invalidateWidget(var3); // L: 772
					return 1; // L: 773
				} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) {
					var3.spriteShadow = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 776
					class159.invalidateWidget(var3); // L: 777
					return 1; // L: 778
				} else if (var0 == ScriptOpcodes.CC_SETVFLIP) {
					var3.spriteFlipV = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 781
					class159.invalidateWidget(var3); // L: 782
					return 1; // L: 783
				} else if (var0 == ScriptOpcodes.CC_SETHFLIP) {
					var3.spriteFlipH = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 786
					class159.invalidateWidget(var3); // L: 787
					return 1; // L: 788
				} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) {
					class517.Interpreter_intStackSize -= 2; // L: 791
					var3.scrollWidth = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 792
					var3.scrollHeight = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 793
					class159.invalidateWidget(var3); // L: 794
					if (var4 != -1 && var3.type == 0) { // L: 795
						class132.revalidateWidgetScroll(HealthBarDefinition.field1877.field3568[var4 >> 16], var3, false);
					}

					return 1; // L: 796
				} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) {
					class10.resumePauseWidget(var3.id, var3.childIndex); // L: 799
					Client.meslayerContinueWidget = var3; // L: 800
					class159.invalidateWidget(var3); // L: 801
					return 1; // L: 802
				} else if (var0 == 1122) {
					var3.spriteId = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 805
					class159.invalidateWidget(var3); // L: 806
					return 1; // L: 807
				} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) {
					var3.color2 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 810
					class159.invalidateWidget(var3); // L: 811
					return 1; // L: 812
				} else if (var0 == 1124) {
					var3.transparencyBot = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 815
					class159.invalidateWidget(var3); // L: 816
					return 1; // L: 817
				} else if (var0 == 1125) {
					var14 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 820
					class538 var12 = (class538)class12.findEnumerated(DecorativeObject.FillMode_values(), var14); // L: 821
					if (var12 != null) { // L: 822
						var3.fillMode = var12; // L: 823
						class159.invalidateWidget(var3); // L: 824
					}

					return 1; // L: 826
				} else {
					boolean var8;
					if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) {
						var8 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 829
						var3.field3693 = var8; // L: 830
						return 1; // L: 831
					} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) {
						var8 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 834
						var3.modelTransparency = var8; // L: 835
						return 1; // L: 836
					} else if (var0 == 1129) {
						var3.field3696 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize]; // L: 839
						class159.invalidateWidget(var3); // L: 840
						return 1; // L: 841
					} else if (var0 == 1130) {
						var3.method6672(Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize], class60.urlRequester, ModelData0.method5817()); // L: 844
						return 1; // L: 845
					} else if (var0 == 1131) {
						class517.Interpreter_intStackSize -= 2; // L: 848
						var3.swapItems(Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]); // L: 849
						return 1; // L: 850
					} else if (var0 == 1132) {
						var3.method6781(Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize], Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]); // L: 853
						return 1; // L: 854
					} else {
						class336 var13;
						if (var0 == 1133) {
							--class517.Interpreter_intStackSize; // L: 857
							var13 = var3.method6724(); // L: 858
							if (var13 != null) { // L: 859
								var13.field3580 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 860
								class159.invalidateWidget(var3); // L: 861
							}

							return 1; // L: 863
						} else if (var0 == 1134) {
							--class517.Interpreter_intStackSize; // L: 866
							var13 = var3.method6724(); // L: 867
							if (var13 != null) { // L: 868
								var13.field3578 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 869
								class159.invalidateWidget(var3); // L: 870
							}

							return 1; // L: 872
						} else if (var0 == 1135) {
							--class127.Interpreter_stringStackSize; // L: 875
							var11 = var3.method6688(); // L: 876
							if (var11 != null) { // L: 877
								var3.field3723 = Interpreter.Interpreter_stringStack[class127.Interpreter_stringStackSize]; // L: 878
							}

							return 1; // L: 880
						} else if (var0 == 1136) {
							--class517.Interpreter_intStackSize; // L: 883
							var13 = var3.method6724(); // L: 884
							if (var13 != null) { // L: 885
								var13.field3579 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 886
								class159.invalidateWidget(var3); // L: 887
							}

							return 1; // L: 889
						} else if (var0 == 1137) {
							--class517.Interpreter_intStackSize; // L: 892
							var11 = var3.method6688(); // L: 893
							if (var11 != null && var11.method6367(Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize])) { // L: 894
								class159.invalidateWidget(var3); // L: 895
							}

							return 1; // L: 897
						} else if (var0 == 1138) {
							--class517.Interpreter_intStackSize; // L: 900
							var11 = var3.method6688(); // L: 901
							if (var11 != null && var11.method6553(Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize])) { // L: 902
								class159.invalidateWidget(var3); // L: 903
							}

							return 1; // L: 905
						} else if (var0 == 1139) {
							--class517.Interpreter_intStackSize; // L: 908
							var11 = var3.method6688(); // L: 909
							if (var11 != null && var11.method6369(Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize])) { // L: 910
								class159.invalidateWidget(var3); // L: 911
							}

							return 1; // L: 913
						} else if (var0 == 1140) {
							var8 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 916
							Client.field725.method4281(); // L: 917
							var6 = var3.method6688(); // L: 918
							if (var6 != null && var6.method6361(var8)) { // L: 919
								if (var8) { // L: 920
									Client.field725.method4279(var3); // L: 921
								}

								class159.invalidateWidget(var3); // L: 923
							}

							return 1; // L: 925
						} else if (var0 == 1141) {
							var8 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 928
							if (!var8 && Client.field725.method4303() == var3) { // L: 929
								Client.field725.method4281(); // L: 930
								class159.invalidateWidget(var3); // L: 931
							}

							var6 = var3.method6688(); // L: 933
							if (var6 != null) { // L: 934
								var6.method6614(var8); // L: 935
							}

							return 1; // L: 937
						} else if (var0 == 1142) {
							class517.Interpreter_intStackSize -= 2; // L: 940
							var11 = var3.method6688(); // L: 941
							if (var11 != null && var11.method6385(Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1])) { // L: 942
								class159.invalidateWidget(var3); // L: 943
							}

							return 1; // L: 945
						} else if (var0 == 1143) {
							--class517.Interpreter_intStackSize; // L: 948
							var11 = var3.method6688(); // L: 949
							if (var11 != null && var11.method6385(Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize])) { // L: 950
								class159.invalidateWidget(var3); // L: 951
							}

							return 1; // L: 953
						} else if (var0 == 1144) {
							--class517.Interpreter_intStackSize; // L: 956
							var11 = var3.method6688(); // L: 957
							if (var11 != null) { // L: 958
								var11.method6413(Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]); // L: 959
								class159.invalidateWidget(var3); // L: 960
							}

							return 1; // L: 962
						} else if (var0 == 1145) {
							--class517.Interpreter_intStackSize; // L: 965
							var11 = var3.method6688(); // L: 966
							if (var11 != null) { // L: 967
								var11.method6373(Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]); // L: 968
							}

							return 1; // L: 970
						} else if (var0 == 1146) {
							--class517.Interpreter_intStackSize; // L: 973
							var11 = var3.method6688(); // L: 974
							if (var11 != null) { // L: 975
								var11.method6376(Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]); // L: 976
							}

							return 1; // L: 978
						} else if (var0 == 1147) {
							--class517.Interpreter_intStackSize; // L: 981
							var11 = var3.method6688(); // L: 982
							if (var11 != null) { // L: 983
								var11.method6375(Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]); // L: 984
								class159.invalidateWidget(var3); // L: 985
							}

							return 1; // L: 987
						} else {
							class27 var10;
							if (var0 == 1148) {
								class517.Interpreter_intStackSize -= 2; // L: 990
								var10 = var3.method6690(); // L: 991
								if (var10 != null) { // L: 992
									var10.method404(Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]); // L: 993
								}

								return 1; // L: 995
							} else if (var0 == 1149) {
								class517.Interpreter_intStackSize -= 2; // L: 998
								var10 = var3.method6690(); // L: 999
								if (var10 != null) { // L: 1000
									var10.method406((char)Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]); // L: 1001
								}

								return 1; // L: 1003
							} else if (var0 == 1150) {
								var3.method6673(Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize], class60.urlRequester); // L: 1006
								return 1; // L: 1007
							} else {
								return 2; // L: 1009
							}
						}
					}
				}
			} else {
				String var5 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize]; // L: 720
				if (var3.type == 12) { // L: 721
					var6 = var3.method6688(); // L: 722
					if (var6 != null && var6.method6394()) { // L: 723
						var6.method6363(var5); // L: 724
					} else {
						var3.text = var5; // L: 727
					}

					class159.invalidateWidget(var3); // L: 729
				} else if (!var5.equals(var3.text)) { // L: 731
					var3.text = var5; // L: 732
					class159.invalidateWidget(var3); // L: 733
				}

				return 1; // L: 735
			}
		}
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(Loh;Ljava/lang/String;I)V",
		garbageValue = "-587575754"
	)
	static void method6862(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1); // L: 1447
		Client.archiveLoaders.add(var2); // L: 1448
		Client.field645 += var2.groupCount; // L: 1449
	} // L: 1450
}
