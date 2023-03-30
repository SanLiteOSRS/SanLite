import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("mj")
public class class325 {
	static {
		Math.sqrt(8192.0D); // L: 9
	} // L: 10

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILcv;ZB)I",
		garbageValue = "12"
	)
	static int method6326(int var0, Script var1, boolean var2) {
		int var4 = -1; // L: 626
		Widget var3;
		if (var0 >= 2000) { // L: 627
			var0 -= 1000; // L: 628
			var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 629
			var3 = WorldMapSection1.getWidget(var4); // L: 630
		} else {
			var3 = var2 ? GameObject.scriptDotWidget : SoundSystem.field319; // L: 632
		}

		int var13;
		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) { // L: 633
			Interpreter.Interpreter_intStackSize -= 2; // L: 634
			var13 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 635
			int var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 636
			if (var3.type == 12) { // L: 637
				class310 var7 = var3.method6118(); // L: 638
				if (var7 != null && var7.method5826(var13, var9)) { // L: 639
					class69.invalidateWidget(var3); // L: 640
				}
			} else {
				var3.scrollX = var13; // L: 644
				if (var3.scrollX > var3.scrollWidth - var3.width) { // L: 645
					var3.scrollX = var3.scrollWidth - var3.width;
				}

				if (var3.scrollX < 0) { // L: 646
					var3.scrollX = 0;
				}

				var3.scrollY = var9; // L: 647
				if (var3.scrollY > var3.scrollHeight - var3.height) { // L: 648
					var3.scrollY = var3.scrollHeight - var3.height;
				}

				if (var3.scrollY < 0) { // L: 649
					var3.scrollY = 0;
				}

				class69.invalidateWidget(var3); // L: 650
			}

			return 1; // L: 652
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) {
			var3.color = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 655
			class69.invalidateWidget(var3); // L: 656
			return 1; // L: 657
		} else if (var0 == ScriptOpcodes.CC_SETFILL) {
			var3.fill = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 660
			class69.invalidateWidget(var3); // L: 661
			return 1; // L: 662
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) {
			var3.transparencyTop = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 665
			class69.invalidateWidget(var3); // L: 666
			return 1; // L: 667
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) {
			var3.lineWid = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 670
			class69.invalidateWidget(var3); // L: 671
			return 1; // L: 672
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) {
			var3.spriteId2 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 675
			class69.invalidateWidget(var3); // L: 676
			return 1; // L: 677
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) {
			var3.spriteAngle = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 680
			class69.invalidateWidget(var3); // L: 681
			return 1; // L: 682
		} else if (var0 == ScriptOpcodes.CC_SETTILING) {
			var3.spriteTiling = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 685
			class69.invalidateWidget(var3); // L: 686
			return 1; // L: 687
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) {
			var3.modelType = 1; // L: 690
			var3.modelId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 691
			class69.invalidateWidget(var3); // L: 692
			return 1; // L: 693
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) {
			Interpreter.Interpreter_intStackSize -= 6; // L: 696
			var3.modelOffsetX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 697
			var3.modelOffsetY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 698
			var3.modelAngleX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 699
			var3.modelAngleY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 700
			var3.modelAngleZ = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 4]; // L: 701
			var3.modelZoom = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 5]; // L: 702
			class69.invalidateWidget(var3); // L: 703
			return 1; // L: 704
		} else if (var0 == ScriptOpcodes.CC_SETMODELANIM) {
			var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 707
			if (var13 != var3.sequenceId) { // L: 708
				var3.sequenceId = var13; // L: 709
				var3.modelFrame = 0; // L: 710
				var3.modelFrameCycle = 0; // L: 711
				class69.invalidateWidget(var3); // L: 712
			}

			return 1; // L: 714
		} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) {
			var3.modelOrthog = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 717
			class69.invalidateWidget(var3); // L: 718
			return 1; // L: 719
		} else if (var0 == ScriptOpcodes.CC_SETTEXT) {
			String var14 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]; // L: 722
			if (!var14.equals(var3.text)) { // L: 723
				var3.text = var14; // L: 724
				class69.invalidateWidget(var3); // L: 725
			}

			return 1; // L: 727
		} else {
			class310 var10;
			if (var0 == ScriptOpcodes.CC_SETTEXTFONT) {
				var3.fontId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 730
				if (var3.type == 12) { // L: 731
					var10 = var3.method6118(); // L: 732
					if (var10 != null) { // L: 733
						var10.method5833(); // L: 734
					}
				}

				class69.invalidateWidget(var3); // L: 737
				return 1; // L: 738
			} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) {
				Interpreter.Interpreter_intStackSize -= 3; // L: 741
				if (var3.type == 12) { // L: 742
					var10 = var3.method6118(); // L: 743
					if (var10 != null) { // L: 744
						var10.method5935(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 745
						var10.method5828(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]); // L: 746
					}
				} else {
					var3.textXAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 750
					var3.textYAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 751
					var3.textLineHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 752
				}

				class69.invalidateWidget(var3); // L: 754
				return 1; // L: 755
			} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) {
				var3.textShadowed = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 758
				class69.invalidateWidget(var3); // L: 759
				return 1; // L: 760
			} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) {
				var3.outline = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 763
				class69.invalidateWidget(var3); // L: 764
				return 1; // L: 765
			} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) {
				var3.spriteShadow = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 768
				class69.invalidateWidget(var3); // L: 769
				return 1; // L: 770
			} else if (var0 == ScriptOpcodes.CC_SETVFLIP) {
				var3.spriteFlipV = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 773
				class69.invalidateWidget(var3); // L: 774
				return 1; // L: 775
			} else if (var0 == ScriptOpcodes.CC_SETHFLIP) {
				var3.spriteFlipH = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 778
				class69.invalidateWidget(var3); // L: 779
				return 1; // L: 780
			} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) {
				Interpreter.Interpreter_intStackSize -= 2; // L: 783
				var3.scrollWidth = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 784
				var3.scrollHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 785
				class69.invalidateWidget(var3); // L: 786
				if (var4 != -1 && var3.type == 0) { // L: 787
					class278.revalidateWidgetScroll(class155.Widget_interfaceComponents[var4 >> 16], var3, false);
				}

				return 1; // L: 788
			} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) {
				class130.resumePauseWidget(var3.id, var3.childIndex); // L: 791
				Client.meslayerContinueWidget = var3; // L: 792
				class69.invalidateWidget(var3); // L: 793
				return 1; // L: 794
			} else if (var0 == 1122) {
				var3.spriteId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 797
				class69.invalidateWidget(var3); // L: 798
				return 1; // L: 799
			} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) {
				var3.color2 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 802
				class69.invalidateWidget(var3); // L: 803
				return 1; // L: 804
			} else if (var0 == 1124) {
				var3.transparencyBot = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 807
				class69.invalidateWidget(var3); // L: 808
				return 1; // L: 809
			} else if (var0 == 1125) {
				var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 812
				class489 var11 = (class489)SpriteMask.findEnumerated(GameObject.FillMode_values(), var13); // L: 813
				if (var11 != null) { // L: 814
					var3.fillMode = var11; // L: 815
					class69.invalidateWidget(var3); // L: 816
				}

				return 1; // L: 818
			} else {
				boolean var8;
				if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) {
					var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 821
					var3.field3545 = var8; // L: 822
					return 1; // L: 823
				} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) {
					var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 826
					var3.modelTransparency = var8; // L: 827
					return 1; // L: 828
				} else if (var0 == 1129) {
					var3.field3562 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]; // L: 831
					class69.invalidateWidget(var3); // L: 832
					return 1; // L: 833
				} else if (var0 == 1130) {
					var3.method6136(Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize], class345.urlRequester, class138.method3095()); // L: 836
					return 1; // L: 837
				} else if (var0 == 1131) {
					Interpreter.Interpreter_intStackSize -= 2; // L: 840
					var3.swapItems(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 841
					return 1; // L: 842
				} else if (var0 == 1132) {
					var3.method6106(Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize], Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 845
					return 1; // L: 846
				} else {
					class305 var12;
					if (var0 == 1133) {
						--Interpreter.Interpreter_intStackSize; // L: 849
						var12 = var3.method6119(); // L: 850
						if (var12 != null) { // L: 851
							var12.field3436 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 852
							class69.invalidateWidget(var3); // L: 853
						}

						return 1; // L: 855
					} else if (var0 == 1134) {
						--Interpreter.Interpreter_intStackSize; // L: 858
						var12 = var3.method6119(); // L: 859
						if (var12 != null) { // L: 860
							var12.field3437 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 861
							class69.invalidateWidget(var3); // L: 862
						}

						return 1; // L: 864
					} else if (var0 == 1135) {
						--HealthBar.Interpreter_stringStackSize; // L: 867
						var10 = var3.method6118(); // L: 868
						if (var10 != null) { // L: 869
							var3.text2 = Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize]; // L: 870
						}

						return 1; // L: 872
					} else if (var0 == 1136) {
						--Interpreter.Interpreter_intStackSize; // L: 875
						var12 = var3.method6119(); // L: 876
						if (var12 != null) { // L: 877
							var12.field3440 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 878
							class69.invalidateWidget(var3); // L: 879
						}

						return 1; // L: 881
					} else if (var0 == 1137) {
						--Interpreter.Interpreter_intStackSize; // L: 884
						var10 = var3.method6118(); // L: 885
						if (var10 != null && var10.method5815(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) { // L: 886
							class69.invalidateWidget(var3); // L: 887
						}

						return 1; // L: 889
					} else if (var0 == 1138) {
						--Interpreter.Interpreter_intStackSize; // L: 892
						var10 = var3.method6118(); // L: 893
						if (var10 != null && var10.method5824(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) { // L: 894
							class69.invalidateWidget(var3); // L: 895
						}

						return 1; // L: 897
					} else if (var0 == 1139) {
						--Interpreter.Interpreter_intStackSize; // L: 900
						var10 = var3.method6118(); // L: 901
						if (var10 != null && var10.method5825(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) { // L: 902
							class69.invalidateWidget(var3); // L: 903
						}

						return 1; // L: 905
					} else {
						class310 var6;
						if (var0 == 1140) {
							var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 908
							Client.field713.method4070(); // L: 909
							var6 = var3.method6118(); // L: 910
							if (var6 != null && var6.method5891(var8)) { // L: 911
								if (var8) { // L: 912
									Client.field713.method4049(var3); // L: 913
								}

								class69.invalidateWidget(var3); // L: 915
							}

							return 1; // L: 917
						} else if (var0 == 1141) {
							var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 920
							if (!var8 && Client.field713.method4050() == var3) { // L: 921
								Client.field713.method4070(); // L: 922
								class69.invalidateWidget(var3); // L: 923
							}

							var6 = var3.method6118(); // L: 925
							if (var6 != null) { // L: 926
								var6.method5839(var8); // L: 927
							}

							return 1; // L: 929
						} else if (var0 == 1142) {
							Interpreter.Interpreter_intStackSize -= 2; // L: 932
							var10 = var3.method6118(); // L: 933
							if (var10 != null && var10.method5841(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1])) { // L: 934
								class69.invalidateWidget(var3); // L: 935
							}

							return 1; // L: 937
						} else if (var0 == 1143) {
							--Interpreter.Interpreter_intStackSize; // L: 940
							var10 = var3.method6118(); // L: 941
							if (var10 != null && var10.method5841(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) { // L: 942
								class69.invalidateWidget(var3); // L: 943
							}

							return 1; // L: 945
						} else if (var0 == 1144) {
							--Interpreter.Interpreter_intStackSize; // L: 948
							var10 = var3.method6118(); // L: 949
							if (var10 != null) { // L: 950
								var10.method5903(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]); // L: 951
								class69.invalidateWidget(var3); // L: 952
							}

							return 1; // L: 954
						} else if (var0 == 1145) {
							--Interpreter.Interpreter_intStackSize; // L: 957
							var10 = var3.method6118(); // L: 958
							if (var10 != null) { // L: 959
								var10.method5862(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]); // L: 960
							}

							return 1; // L: 962
						} else if (var0 == 1146) {
							--Interpreter.Interpreter_intStackSize; // L: 965
							var10 = var3.method6118(); // L: 966
							if (var10 != null) { // L: 967
								var10.method5918(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]); // L: 968
							}

							return 1; // L: 970
						} else if (var0 == 1147) {
							--Interpreter.Interpreter_intStackSize; // L: 973
							var10 = var3.method6118(); // L: 974
							if (var10 != null) { // L: 975
								var10.method5831(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]); // L: 976
								class69.invalidateWidget(var3); // L: 977
							}

							return 1; // L: 979
						} else {
							class27 var5;
							if (var0 == 1148) {
								Interpreter.Interpreter_intStackSize -= 2; // L: 982
								var5 = var3.method6120(); // L: 983
								if (var5 != null) { // L: 984
									var5.method384(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 985
								}

								return 1; // L: 987
							} else if (var0 == 1149) {
								Interpreter.Interpreter_intStackSize -= 2; // L: 990
								var5 = var3.method6120(); // L: 991
								if (var5 != null) { // L: 992
									var5.method385((char)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 993
								}

								return 1; // L: 995
							} else if (var0 == 1150) {
								var3.method6176(Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize], class345.urlRequester); // L: 998
								return 1; // L: 999
							} else {
								return 2; // L: 1001
							}
						}
					}
				}
			}
		}
	}
}
