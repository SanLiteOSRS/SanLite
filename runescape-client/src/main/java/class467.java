import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("qc")
public class class467 implements class342 {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lqc;"
	)
	public static final class467 field4923;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lqc;"
	)
	public static final class467 field4919;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lqc;"
	)
	static final class467 field4920;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lqc;"
	)
	static final class467 field4921;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lqc;"
	)
	static final class467 field4922;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lqc;"
	)
	static final class467 field4925;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -141028607
	)
	final int field4924;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -2070295773
	)
	final int field4918;

	static {
		field4923 = new class467(1, 0); // L: 8
		field4919 = new class467(0, 2); // L: 9
		field4920 = new class467(5, 5); // L: 10
		field4921 = new class467(4, 6); // L: 11
		field4922 = new class467(3, 7); // L: 12
		field4925 = new class467(2, 8); // L: 13
	}

	class467(int var1, int var2) {
		this.field4924 = var1; // L: 18
		this.field4918 = var2; // L: 19
	} // L: 20

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4918; // L: 24
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1694657326"
	)
	public boolean method8675() {
		return this == field4919; // L: 28
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "1561760912"
	)
	static int method8672(int var0, Script var1, boolean var2) {
		int var4 = -1; // L: 634
		Widget var3;
		if (var0 >= 2000) { // L: 635
			var0 -= 1000; // L: 636
			var4 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 637
			var3 = class281.getWidget(var4); // L: 638
		} else {
			var3 = var2 ? class140.scriptDotWidget : class136.field1589; // L: 640
		}

		int var13;
		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) { // L: 641
			class379.Interpreter_intStackSize -= 2; // L: 642
			var13 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 643
			int var9 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 644
			if (var3.type == 12) { // L: 645
				class300 var7 = var3.method6076(); // L: 646
				if (var7 != null && var7.method5946(var13, var9)) { // L: 647
					class143.invalidateWidget(var3); // L: 648
				}
			} else {
				var3.scrollX = var13; // L: 652
				if (var3.scrollX > var3.scrollWidth - var3.width) { // L: 653
					var3.scrollX = var3.scrollWidth - var3.width;
				}

				if (var3.scrollX < 0) { // L: 654
					var3.scrollX = 0;
				}

				var3.scrollY = var9; // L: 655
				if (var3.scrollY > var3.scrollHeight - var3.height) { // L: 656
					var3.scrollY = var3.scrollHeight - var3.height;
				}

				if (var3.scrollY < 0) { // L: 657
					var3.scrollY = 0;
				}

				class143.invalidateWidget(var3); // L: 658
			}

			return 1; // L: 660
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) { // L: 662
			var3.color = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 663
			class143.invalidateWidget(var3); // L: 664
			return 1; // L: 665
		} else if (var0 == ScriptOpcodes.CC_SETFILL) { // L: 667
			var3.fill = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 668
			class143.invalidateWidget(var3); // L: 669
			return 1; // L: 670
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) { // L: 672
			var3.transparencyTop = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 673
			class143.invalidateWidget(var3); // L: 674
			return 1; // L: 675
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) { // L: 677
			var3.lineWid = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 678
			class143.invalidateWidget(var3); // L: 679
			return 1; // L: 680
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) { // L: 682
			var3.spriteId2 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 683
			class143.invalidateWidget(var3); // L: 684
			return 1; // L: 685
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) { // L: 687
			var3.spriteAngle = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 688
			class143.invalidateWidget(var3); // L: 689
			return 1; // L: 690
		} else if (var0 == ScriptOpcodes.CC_SETTILING) { // L: 692
			var3.spriteTiling = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 693
			class143.invalidateWidget(var3); // L: 694
			return 1; // L: 695
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) { // L: 697
			var3.modelType = 1; // L: 698
			var3.modelId = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 699
			class143.invalidateWidget(var3); // L: 700
			return 1; // L: 701
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) { // L: 703
			class379.Interpreter_intStackSize -= 6; // L: 704
			var3.modelOffsetX = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 705
			var3.modelOffsetY = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 706
			var3.modelAngleX = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 2]; // L: 707
			var3.modelAngleY = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 3]; // L: 708
			var3.modelAngleZ = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 4]; // L: 709
			var3.modelZoom = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 5]; // L: 710
			class143.invalidateWidget(var3); // L: 711
			return 1; // L: 712
		} else if (var0 == ScriptOpcodes.CC_SETMODELANIM) { // L: 714
			var13 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 715
			if (var13 != var3.sequenceId) { // L: 716
				var3.sequenceId = var13; // L: 717
				var3.modelFrame = 0; // L: 718
				var3.modelFrameCycle = 0; // L: 719
				class143.invalidateWidget(var3); // L: 720
			}

			return 1; // L: 722
		} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) { // L: 724
			var3.modelOrthog = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 725
			class143.invalidateWidget(var3); // L: 726
			return 1; // L: 727
		} else if (var0 == ScriptOpcodes.CC_SETTEXT) { // L: 729
			String var14 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize]; // L: 730
			if (!var14.equals(var3.text)) { // L: 731
				var3.text = var14; // L: 732
				class143.invalidateWidget(var3); // L: 733
			}

			return 1; // L: 735
		} else {
			class300 var10;
			if (var0 == ScriptOpcodes.CC_SETTEXTFONT) { // L: 737
				var3.fontId = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 738
				if (var3.type == 12) { // L: 739
					var10 = var3.method6076(); // L: 740
					if (var10 != null) { // L: 741
						var10.method5783(); // L: 742
					}
				}

				class143.invalidateWidget(var3); // L: 745
				return 1; // L: 746
			} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) { // L: 748
				class379.Interpreter_intStackSize -= 3; // L: 749
				if (var3.type == 12) { // L: 750
					var10 = var3.method6076(); // L: 751
					if (var10 != null) { // L: 752
						var10.method5777(Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]); // L: 753
						var10.method5778(Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 2]); // L: 754
					}
				} else {
					var3.textXAlignment = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 758
					var3.textYAlignment = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 759
					var3.textLineHeight = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 2]; // L: 760
				}

				class143.invalidateWidget(var3); // L: 762
				return 1; // L: 763
			} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) { // L: 765
				var3.textShadowed = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 766
				class143.invalidateWidget(var3); // L: 767
				return 1; // L: 768
			} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) { // L: 770
				var3.outline = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 771
				class143.invalidateWidget(var3); // L: 772
				return 1; // L: 773
			} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) { // L: 775
				var3.spriteShadow = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 776
				class143.invalidateWidget(var3); // L: 777
				return 1; // L: 778
			} else if (var0 == ScriptOpcodes.CC_SETVFLIP) { // L: 780
				var3.spriteFlipV = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 781
				class143.invalidateWidget(var3); // L: 782
				return 1; // L: 783
			} else if (var0 == ScriptOpcodes.CC_SETHFLIP) { // L: 785
				var3.spriteFlipH = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 786
				class143.invalidateWidget(var3); // L: 787
				return 1; // L: 788
			} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) { // L: 790
				class379.Interpreter_intStackSize -= 2; // L: 791
				var3.scrollWidth = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 792
				var3.scrollHeight = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 793
				class143.invalidateWidget(var3); // L: 794
				if (var4 != -1 && var3.type == 0) { // L: 795
					class16.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var4 >> 16], var3, false);
				}

				return 1; // L: 796
			} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) { // L: 798
				class453.resumePauseWidget(var3.id, var3.childIndex); // L: 799
				Client.meslayerContinueWidget = var3; // L: 800
				class143.invalidateWidget(var3); // L: 801
				return 1; // L: 802
			} else if (var0 == 1122) { // L: 804
				var3.spriteId = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 805
				class143.invalidateWidget(var3); // L: 806
				return 1; // L: 807
			} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) { // L: 809
				var3.color2 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 810
				class143.invalidateWidget(var3); // L: 811
				return 1; // L: 812
			} else if (var0 == 1124) { // L: 814
				var3.transparencyBot = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 815
				class143.invalidateWidget(var3); // L: 816
				return 1; // L: 817
			} else if (var0 == 1125) { // L: 819
				var13 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 820
				class474 var11 = (class474)DecorativeObject.findEnumerated(Language.FillMode_values(), var13); // L: 821
				if (var11 != null) { // L: 822
					var3.fillMode = var11; // L: 823
					class143.invalidateWidget(var3); // L: 824
				}

				return 1; // L: 826
			} else {
				boolean var8;
				if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) { // L: 828
					var8 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 829
					var3.field3515 = var8; // L: 830
					return 1; // L: 831
				} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) { // L: 833
					var8 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 834
					var3.modelTransparency = var8; // L: 835
					return 1; // L: 836
				} else if (var0 == 1129) { // L: 838
					var3.field3518 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize]; // L: 839
					class143.invalidateWidget(var3); // L: 840
					return 1; // L: 841
				} else if (var0 == 1130) { // L: 843
					var3.method6062(Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize], PcmPlayer.urlRequester, class147.method3141()); // L: 844
					return 1; // L: 845
				} else if (var0 == 1131) { // L: 847
					class379.Interpreter_intStackSize -= 2; // L: 848
					var3.method6074(Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]); // L: 849
					return 1; // L: 850
				} else if (var0 == 1132) { // L: 852
					var3.method6065(Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize], Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]); // L: 853
					return 1; // L: 854
				} else {
					class295 var12;
					if (var0 == 1133) { // L: 856
						--class379.Interpreter_intStackSize; // L: 857
						var12 = var3.method6153(); // L: 858
						if (var12 != null) { // L: 859
							var12.field3399 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 860
							class143.invalidateWidget(var3); // L: 861
						}

						return 1; // L: 863
					} else if (var0 == 1134) { // L: 865
						--class379.Interpreter_intStackSize; // L: 866
						var12 = var3.method6153(); // L: 867
						if (var12 != null) { // L: 868
							var12.field3401 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 869
							class143.invalidateWidget(var3); // L: 870
						}

						return 1; // L: 872
					} else if (var0 == 1135) { // L: 874
						--class125.Interpreter_stringStackSize; // L: 875
						var10 = var3.method6076(); // L: 876
						if (var10 != null) { // L: 877
							var3.text2 = Interpreter.Interpreter_stringStack[class125.Interpreter_stringStackSize]; // L: 878
						}

						return 1; // L: 880
					} else if (var0 == 1136) { // L: 882
						--class379.Interpreter_intStackSize; // L: 883
						var12 = var3.method6153(); // L: 884
						if (var12 != null) { // L: 885
							var12.field3400 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 886
							class143.invalidateWidget(var3); // L: 887
						}

						return 1; // L: 889
					} else if (var0 == 1137) { // L: 891
						--class379.Interpreter_intStackSize; // L: 892
						var10 = var3.method6076(); // L: 893
						if (var10 != null && var10.method5773(Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize])) { // L: 894
							class143.invalidateWidget(var3); // L: 895
						}

						return 1; // L: 897
					} else if (var0 == 1138) { // L: 899
						--class379.Interpreter_intStackSize; // L: 900
						var10 = var3.method6076(); // L: 901
						if (var10 != null && var10.method5774(Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize])) { // L: 902
							class143.invalidateWidget(var3); // L: 903
						}

						return 1; // L: 905
					} else if (var0 == 1139) { // L: 907
						--class379.Interpreter_intStackSize; // L: 908
						var10 = var3.method6076(); // L: 909
						if (var10 != null && var10.method5775(Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize])) { // L: 910
							class143.invalidateWidget(var3); // L: 911
						}

						return 1; // L: 913
					} else {
						class300 var6;
						if (var0 == 1140) { // L: 915
							var8 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 916
							Client.field734.method3933(); // L: 917
							var6 = var3.method6076(); // L: 918
							if (var6 != null && var6.method5767(var8)) { // L: 919
								if (var8) { // L: 920
									Client.field734.method3915(var3); // L: 921
								}

								class143.invalidateWidget(var3); // L: 923
							}

							return 1; // L: 925
						} else if (var0 == 1141) { // L: 927
							var8 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 928
							if (!var8 && Client.field734.method3916() == var3) { // L: 929
								Client.field734.method3933(); // L: 930
								class143.invalidateWidget(var3); // L: 931
							}

							var6 = var3.method6076(); // L: 933
							if (var6 != null) { // L: 934
								var6.method5843(var8); // L: 935
							}

							return 1; // L: 937
						} else if (var0 == 1142) { // L: 939
							class379.Interpreter_intStackSize -= 2; // L: 940
							var10 = var3.method6076(); // L: 941
							if (var10 != null && var10.method5791(Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1])) { // L: 942
								class143.invalidateWidget(var3); // L: 943
							}

							return 1; // L: 945
						} else if (var0 == 1143) { // L: 947
							--class379.Interpreter_intStackSize; // L: 948
							var10 = var3.method6076(); // L: 949
							if (var10 != null && var10.method5791(Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize])) { // L: 950
								class143.invalidateWidget(var3); // L: 951
							}

							return 1; // L: 953
						} else if (var0 == 1144) { // L: 955
							--class379.Interpreter_intStackSize; // L: 956
							var10 = var3.method6076(); // L: 957
							if (var10 != null) { // L: 958
								var10.method5780(Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]); // L: 959
								class143.invalidateWidget(var3); // L: 960
							}

							return 1; // L: 962
						} else if (var0 == 1145) { // L: 964
							--class379.Interpreter_intStackSize; // L: 965
							var10 = var3.method6076(); // L: 966
							if (var10 != null) { // L: 967
								var10.method5779(Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]); // L: 968
							}

							return 1; // L: 970
						} else if (var0 == 1146) { // L: 972
							--class379.Interpreter_intStackSize; // L: 973
							var10 = var3.method6076(); // L: 974
							if (var10 != null) { // L: 975
								var10.method5936(Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]); // L: 976
							}

							return 1; // L: 978
						} else if (var0 == 1147) { // L: 980
							--class379.Interpreter_intStackSize; // L: 981
							var10 = var3.method6076(); // L: 982
							if (var10 != null) { // L: 983
								var10.method5781(Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]); // L: 984
								class143.invalidateWidget(var3); // L: 985
							}

							return 1; // L: 987
						} else {
							class28 var5;
							if (var0 == 1148) { // L: 989
								class379.Interpreter_intStackSize -= 2; // L: 990
								var5 = var3.method6078(); // L: 991
								if (var5 != null) { // L: 992
									var5.method406(Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]); // L: 993
								}

								return 1; // L: 995
							} else if (var0 == 1149) { // L: 997
								class379.Interpreter_intStackSize -= 2; // L: 998
								var5 = var3.method6078(); // L: 999
								if (var5 != null) { // L: 1000
									var5.method407((char)Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]); // L: 1001
								}

								return 1; // L: 1003
							} else {
								return 2; // L: 1005
							}
						}
					}
				}
			}
		}
	}
}
