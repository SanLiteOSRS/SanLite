import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dw")
public class class93 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZI)I",
		garbageValue = "36436435"
	)
	static int method2358(int var0, Script var1, boolean var2) {
		int var4 = -1; // L: 624
		Widget var3;
		if (var0 >= 2000) { // L: 625
			var0 -= 1000; // L: 626
			var4 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 627
			var3 = class92.getWidget(var4); // L: 628
		} else {
			var3 = var2 ? GameObject.scriptDotWidget : SceneTilePaint.field2808; // L: 630
		}

		int var13;
		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) { // L: 631
			SoundCache.Interpreter_intStackSize -= 2; // L: 632
			var13 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 633
			int var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 634
			if (var3.type == 12) { // L: 635
				class329 var7 = var3.method6532(); // L: 636
				if (var7 != null && var7.method6115(var13, var9)) { // L: 637
					class218.invalidateWidget(var3); // L: 638
				}
			} else {
				var3.scrollX = var13; // L: 642
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

				class218.invalidateWidget(var3); // L: 648
			}

			return 1; // L: 650
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) {
			var3.color = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 653
			class218.invalidateWidget(var3); // L: 654
			return 1; // L: 655
		} else if (var0 == ScriptOpcodes.CC_SETFILL) {
			var3.fill = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 658
			class218.invalidateWidget(var3); // L: 659
			return 1; // L: 660
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) {
			var3.transparencyTop = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 663
			class218.invalidateWidget(var3); // L: 664
			return 1; // L: 665
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) {
			var3.lineWid = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 668
			class218.invalidateWidget(var3); // L: 669
			return 1; // L: 670
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) {
			var3.spriteId2 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 673
			class218.invalidateWidget(var3); // L: 674
			return 1; // L: 675
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) {
			var3.spriteAngle = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 678
			class218.invalidateWidget(var3); // L: 679
			return 1; // L: 680
		} else if (var0 == ScriptOpcodes.CC_SETTILING) {
			var3.spriteTiling = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 683
			class218.invalidateWidget(var3); // L: 684
			return 1; // L: 685
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) {
			var3.modelType = 1; // L: 688
			var3.modelId = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 689
			class218.invalidateWidget(var3); // L: 690
			return 1; // L: 691
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) {
			SoundCache.Interpreter_intStackSize -= 6; // L: 694
			var3.modelOffsetX = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 695
			var3.modelOffsetY = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 696
			var3.modelAngleX = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 2]; // L: 697
			var3.modelAngleY = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 3]; // L: 698
			var3.modelAngleZ = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 4]; // L: 699
			var3.modelZoom = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 5]; // L: 700
			class218.invalidateWidget(var3); // L: 701
			return 1; // L: 702
		} else if (var0 == ScriptOpcodes.CC_SETMODELANIM) {
			var13 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 705
			if (var13 != var3.sequenceId) { // L: 706
				var3.sequenceId = var13; // L: 707
				var3.modelFrame = 0; // L: 708
				var3.modelFrameCycle = 0; // L: 709
				class218.invalidateWidget(var3); // L: 710
			}

			return 1; // L: 712
		} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) {
			var3.modelOrthog = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 715
			class218.invalidateWidget(var3); // L: 716
			return 1; // L: 717
		} else if (var0 == ScriptOpcodes.CC_SETTEXT) {
			String var14 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize]; // L: 720
			if (!var14.equals(var3.text)) { // L: 721
				var3.text = var14; // L: 722
				class218.invalidateWidget(var3); // L: 723
			}

			return 1; // L: 725
		} else {
			class329 var10;
			if (var0 == ScriptOpcodes.CC_SETTEXTFONT) {
				var3.fontId = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 728
				if (var3.type == 12) { // L: 729
					var10 = var3.method6532(); // L: 730
					if (var10 != null) { // L: 731
						var10.method6122(); // L: 732
					}
				}

				class218.invalidateWidget(var3); // L: 735
				return 1; // L: 736
			} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) {
				SoundCache.Interpreter_intStackSize -= 3; // L: 739
				if (var3.type == 12) { // L: 740
					var10 = var3.method6532(); // L: 741
					if (var10 != null) { // L: 742
						var10.method6267(Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize], Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]); // L: 743
						var10.method6117(Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 2]); // L: 744
					}
				} else {
					var3.textXAlignment = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 748
					var3.textYAlignment = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 749
					var3.textLineHeight = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 2]; // L: 750
				}

				class218.invalidateWidget(var3); // L: 752
				return 1; // L: 753
			} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) {
				var3.textShadowed = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 756
				class218.invalidateWidget(var3); // L: 757
				return 1; // L: 758
			} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) {
				var3.outline = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 761
				class218.invalidateWidget(var3); // L: 762
				return 1; // L: 763
			} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) {
				var3.spriteShadow = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 766
				class218.invalidateWidget(var3); // L: 767
				return 1; // L: 768
			} else if (var0 == ScriptOpcodes.CC_SETVFLIP) {
				var3.spriteFlipV = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 771
				class218.invalidateWidget(var3); // L: 772
				return 1; // L: 773
			} else if (var0 == ScriptOpcodes.CC_SETHFLIP) {
				var3.spriteFlipH = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 776
				class218.invalidateWidget(var3); // L: 777
				return 1; // L: 778
			} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) {
				SoundCache.Interpreter_intStackSize -= 2; // L: 781
				var3.scrollWidth = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 782
				var3.scrollHeight = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 783
				class218.invalidateWidget(var3); // L: 784
				if (var4 != -1 && var3.type == 0) {
					Login.revalidateWidgetScroll(PacketBufferNode.Widget_interfaceComponents[var4 >> 16], var3, false); // L: 785
				}

				return 1; // L: 786
			} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) {
				class466.resumePauseWidget(var3.id, var3.childIndex); // L: 789
				Client.meslayerContinueWidget = var3; // L: 790
				class218.invalidateWidget(var3); // L: 791
				return 1; // L: 792
			} else if (var0 == 1122) {
				var3.spriteId = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 795
				class218.invalidateWidget(var3); // L: 796
				return 1; // L: 797
			} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) {
				var3.color2 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 800
				class218.invalidateWidget(var3); // L: 801
				return 1; // L: 802
			} else if (var0 == 1124) {
				var3.transparencyBot = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 805
				class218.invalidateWidget(var3); // L: 806
				return 1; // L: 807
			} else if (var0 == 1125) {
				var13 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 810
				class526 var11 = (class526)class25.findEnumerated(MidiPcmStream.FillMode_values(), var13); // L: 811
				if (var11 != null) { // L: 812
					var3.fillMode = var11; // L: 813
					class218.invalidateWidget(var3); // L: 814
				}

				return 1; // L: 816
			} else {
				boolean var8;
				if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) {
					var8 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 819
					var3.field3680 = var8; // L: 820
					return 1; // L: 821
				} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) {
					var8 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 824
					var3.modelTransparency = var8; // L: 825
					return 1; // L: 826
				} else if (var0 == 1129) {
					var3.field3683 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize]; // L: 829
					class218.invalidateWidget(var3); // L: 830
					return 1; // L: 831
				} else if (var0 == 1130) {
					var3.method6491(Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize], FriendsChatManager.urlRequester, UrlRequester.method2810()); // L: 834
					return 1; // L: 835
				} else if (var0 == 1131) {
					SoundCache.Interpreter_intStackSize -= 2; // L: 838
					var3.swapItems(Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize], Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]); // L: 839
					return 1; // L: 840
				} else if (var0 == 1132) {
					var3.method6403(Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize], Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]); // L: 843
					return 1; // L: 844
				} else {
					class324 var12;
					if (var0 == 1133) {
						--SoundCache.Interpreter_intStackSize; // L: 847
						var12 = var3.method6416(); // L: 848
						if (var12 != null) { // L: 849
							var12.field3547 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 850
							class218.invalidateWidget(var3); // L: 851
						}

						return 1; // L: 853
					} else if (var0 == 1134) {
						--SoundCache.Interpreter_intStackSize; // L: 856
						var12 = var3.method6416(); // L: 857
						if (var12 != null) { // L: 858
							var12.field3548 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 859
							class218.invalidateWidget(var3); // L: 860
						}

						return 1; // L: 862
					} else if (var0 == 1135) {
						--class137.Interpreter_stringStackSize; // L: 865
						var10 = var3.method6532(); // L: 866
						if (var10 != null) { // L: 867
							var3.field3626 = Interpreter.Interpreter_stringStack[class137.Interpreter_stringStackSize]; // L: 868
						}

						return 1; // L: 870
					} else if (var0 == 1136) {
						--SoundCache.Interpreter_intStackSize; // L: 873
						var12 = var3.method6416(); // L: 874
						if (var12 != null) { // L: 875
							var12.field3549 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 876
							class218.invalidateWidget(var3); // L: 877
						}

						return 1; // L: 879
					} else if (var0 == 1137) {
						--SoundCache.Interpreter_intStackSize; // L: 882
						var10 = var3.method6532(); // L: 883
						if (var10 != null && var10.method6112(Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize])) { // L: 884
							class218.invalidateWidget(var3); // L: 885
						}

						return 1; // L: 887
					} else if (var0 == 1138) {
						--SoundCache.Interpreter_intStackSize; // L: 890
						var10 = var3.method6532(); // L: 891
						if (var10 != null && var10.method6113(Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize])) { // L: 892
							class218.invalidateWidget(var3); // L: 893
						}

						return 1; // L: 895
					} else if (var0 == 1139) {
						--SoundCache.Interpreter_intStackSize; // L: 898
						var10 = var3.method6532(); // L: 899
						if (var10 != null && var10.method6322(Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize])) { // L: 900
							class218.invalidateWidget(var3); // L: 901
						}

						return 1; // L: 903
					} else {
						class329 var6;
						if (var0 == 1140) {
							var8 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 906
							Client.field765.method4092(); // L: 907
							var6 = var3.method6532(); // L: 908
							if (var6 != null && var6.method6106(var8)) { // L: 909
								if (var8) { // L: 910
									Client.field765.method4093(var3); // L: 911
								}

								class218.invalidateWidget(var3); // L: 913
							}

							return 1; // L: 915
						} else if (var0 == 1141) {
							var8 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 918
							if (!var8 && Client.field765.method4075() == var3) { // L: 919
								Client.field765.method4092(); // L: 920
								class218.invalidateWidget(var3); // L: 921
							}

							var6 = var3.method6532(); // L: 923
							if (var6 != null) { // L: 924
								var6.method6143(var8); // L: 925
							}

							return 1; // L: 927
						} else if (var0 == 1142) {
							SoundCache.Interpreter_intStackSize -= 2; // L: 930
							var10 = var3.method6532(); // L: 931
							if (var10 != null && var10.method6130(Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize], Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1])) { // L: 932
								class218.invalidateWidget(var3); // L: 933
							}

							return 1; // L: 935
						} else if (var0 == 1143) {
							--SoundCache.Interpreter_intStackSize; // L: 938
							var10 = var3.method6532(); // L: 939
							if (var10 != null && var10.method6130(Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize], Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize])) { // L: 940
								class218.invalidateWidget(var3); // L: 941
							}

							return 1; // L: 943
						} else if (var0 == 1144) {
							--SoundCache.Interpreter_intStackSize; // L: 946
							var10 = var3.method6532(); // L: 947
							if (var10 != null) { // L: 948
								var10.method6378(Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]); // L: 949
								class218.invalidateWidget(var3); // L: 950
							}

							return 1; // L: 952
						} else if (var0 == 1145) {
							--SoundCache.Interpreter_intStackSize; // L: 955
							var10 = var3.method6532(); // L: 956
							if (var10 != null) { // L: 957
								var10.method6118(Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]); // L: 958
							}

							return 1; // L: 960
						} else if (var0 == 1146) {
							--SoundCache.Interpreter_intStackSize; // L: 963
							var10 = var3.method6532(); // L: 964
							if (var10 != null) { // L: 965
								var10.method6201(Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]); // L: 966
							}

							return 1; // L: 968
						} else if (var0 == 1147) {
							--SoundCache.Interpreter_intStackSize; // L: 971
							var10 = var3.method6532(); // L: 972
							if (var10 != null) { // L: 973
								var10.method6376(Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]); // L: 974
								class218.invalidateWidget(var3); // L: 975
							}

							return 1; // L: 977
						} else {
							class27 var5;
							if (var0 == 1148) {
								SoundCache.Interpreter_intStackSize -= 2; // L: 980
								var5 = var3.method6401(); // L: 981
								if (var5 != null) { // L: 982
									var5.method394(Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize], Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]); // L: 983
								}

								return 1; // L: 985
							} else if (var0 == 1149) {
								SoundCache.Interpreter_intStackSize -= 2; // L: 988
								var5 = var3.method6401(); // L: 989
								if (var5 != null) { // L: 990
									var5.method419((char)Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize], Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]); // L: 991
								}

								return 1; // L: 993
							} else if (var0 == 1150) {
								var3.method6467(Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize], FriendsChatManager.urlRequester); // L: 996
								return 1; // L: 997
							} else {
								return 2; // L: 999
							}
						}
					}
				}
			}
		}
	}
}
