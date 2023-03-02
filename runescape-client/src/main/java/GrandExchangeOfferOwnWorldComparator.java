import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bi")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
	@ObfuscatedName("f")
	@Export("filterWorlds")
	boolean filterWorlds;

	GrandExchangeOfferOwnWorldComparator() {
	} // L: 13461

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lmv;Lmv;I)I",
		garbageValue = "883548151"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		if (var2.world == var1.world) { // L: 13464
			return 0;
		} else {
			if (this.filterWorlds) { // L: 13465
				if (Client.worldId == var1.world) { // L: 13466
					return -1;
				}

				if (var2.world == Client.worldId) { // L: 13467
					return 1;
				}
			}

			return var1.world < var2.world ? -1 : 1; // L: 13469
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 13473
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 13477
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(FFFFLda;S)V",
		garbageValue = "18728"
	)
	static void method1202(float var0, float var1, float var2, float var3, class125 var4) {
		float var5 = var1 - var0; // L: 331
		float var6 = var2 - var1; // L: 332
		float var7 = var3 - var2; // L: 333
		float var8 = var6 - var5; // L: 334
		var4.field1531 = var7 - var6 - var8; // L: 335
		var4.field1543 = var8 + var8 + var8; // L: 336
		var4.field1529 = var5 + var5 + var5; // L: 337
		var4.field1528 = var0; // L: 338
	} // L: 339

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZI)I",
		garbageValue = "924609426"
	)
	static int method1209(int var0, Script var1, boolean var2) {
		int var4 = -1; // L: 626
		Widget var3;
		if (var0 >= 2000) { // L: 627
			var0 -= 1000; // L: 628
			var4 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 629
			var3 = class133.getWidget(var4); // L: 630
		} else {
			var3 = var2 ? Interpreter.scriptDotWidget : class85.field1091; // L: 632
		}

		int var13;
		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) { // L: 633
			class302.Interpreter_intStackSize -= 2; // L: 634
			var13 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 635
			int var9 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 636
			if (var3.type == 12) { // L: 637
				class307 var7 = var3.method6235(); // L: 638
				if (var7 != null && var7.method5932(var13, var9)) { // L: 639
					LoginScreenAnimation.invalidateWidget(var3); // L: 640
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

				LoginScreenAnimation.invalidateWidget(var3); // L: 650
			}

			return 1; // L: 652
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) { // L: 654
			var3.color = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 655
			LoginScreenAnimation.invalidateWidget(var3); // L: 656
			return 1; // L: 657
		} else if (var0 == ScriptOpcodes.CC_SETFILL) { // L: 659
			var3.fill = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 660
			LoginScreenAnimation.invalidateWidget(var3); // L: 661
			return 1; // L: 662
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) { // L: 664
			var3.transparencyTop = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 665
			LoginScreenAnimation.invalidateWidget(var3); // L: 666
			return 1; // L: 667
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) { // L: 669
			var3.lineWid = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 670
			LoginScreenAnimation.invalidateWidget(var3); // L: 671
			return 1; // L: 672
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) { // L: 674
			var3.spriteId2 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 675
			LoginScreenAnimation.invalidateWidget(var3); // L: 676
			return 1; // L: 677
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) { // L: 679
			var3.spriteAngle = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 680
			LoginScreenAnimation.invalidateWidget(var3); // L: 681
			return 1; // L: 682
		} else if (var0 == ScriptOpcodes.CC_SETTILING) { // L: 684
			var3.spriteTiling = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 685
			LoginScreenAnimation.invalidateWidget(var3); // L: 686
			return 1; // L: 687
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) { // L: 689
			var3.modelType = 1; // L: 690
			var3.modelId = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 691
			LoginScreenAnimation.invalidateWidget(var3); // L: 692
			return 1; // L: 693
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) { // L: 695
			class302.Interpreter_intStackSize -= 6; // L: 696
			var3.modelOffsetX = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 697
			var3.modelOffsetY = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 698
			var3.modelAngleX = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 2]; // L: 699
			var3.modelAngleY = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 3]; // L: 700
			var3.modelAngleZ = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 4]; // L: 701
			var3.modelZoom = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 5]; // L: 702
			LoginScreenAnimation.invalidateWidget(var3); // L: 703
			return 1; // L: 704
		} else if (var0 == ScriptOpcodes.CC_SETMODELANIM) { // L: 706
			var13 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 707
			if (var13 != var3.sequenceId) { // L: 708
				var3.sequenceId = var13; // L: 709
				var3.modelFrame = 0; // L: 710
				var3.modelFrameCycle = 0; // L: 711
				LoginScreenAnimation.invalidateWidget(var3); // L: 712
			}

			return 1; // L: 714
		} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) { // L: 716
			var3.modelOrthog = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 717
			LoginScreenAnimation.invalidateWidget(var3); // L: 718
			return 1; // L: 719
		} else if (var0 == ScriptOpcodes.CC_SETTEXT) { // L: 721
			String var14 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize]; // L: 722
			if (!var14.equals(var3.text)) { // L: 723
				var3.text = var14; // L: 724
				LoginScreenAnimation.invalidateWidget(var3); // L: 725
			}

			return 1; // L: 727
		} else {
			class307 var10;
			if (var0 == ScriptOpcodes.CC_SETTEXTFONT) { // L: 729
				var3.fontId = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 730
				if (var3.type == 12) { // L: 731
					var10 = var3.method6235(); // L: 732
					if (var10 != null) { // L: 733
						var10.method6031(); // L: 734
					}
				}

				LoginScreenAnimation.invalidateWidget(var3); // L: 737
				return 1; // L: 738
			} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) { // L: 740
				class302.Interpreter_intStackSize -= 3; // L: 741
				if (var3.type == 12) { // L: 742
					var10 = var3.method6235(); // L: 743
					if (var10 != null) { // L: 744
						var10.method6068(Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]); // L: 745
						var10.method5934(Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 2]); // L: 746
					}
				} else {
					var3.textXAlignment = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 750
					var3.textYAlignment = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 751
					var3.textLineHeight = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 2]; // L: 752
				}

				LoginScreenAnimation.invalidateWidget(var3); // L: 754
				return 1; // L: 755
			} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) { // L: 757
				var3.textShadowed = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 758
				LoginScreenAnimation.invalidateWidget(var3); // L: 759
				return 1; // L: 760
			} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) { // L: 762
				var3.outline = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 763
				LoginScreenAnimation.invalidateWidget(var3); // L: 764
				return 1; // L: 765
			} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) { // L: 767
				var3.spriteShadow = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 768
				LoginScreenAnimation.invalidateWidget(var3); // L: 769
				return 1; // L: 770
			} else if (var0 == ScriptOpcodes.CC_SETVFLIP) { // L: 772
				var3.spriteFlipV = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 773
				LoginScreenAnimation.invalidateWidget(var3); // L: 774
				return 1; // L: 775
			} else if (var0 == ScriptOpcodes.CC_SETHFLIP) { // L: 777
				var3.spriteFlipH = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 778
				LoginScreenAnimation.invalidateWidget(var3); // L: 779
				return 1; // L: 780
			} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) { // L: 782
				class302.Interpreter_intStackSize -= 2; // L: 783
				var3.scrollWidth = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 784
				var3.scrollHeight = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 785
				LoginScreenAnimation.invalidateWidget(var3); // L: 786
				if (var4 != -1 && var3.type == 0) { // L: 787
					AbstractWorldMapData.revalidateWidgetScroll(WorldMapLabel.Widget_interfaceComponents[var4 >> 16], var3, false);
				}

				return 1; // L: 788
			} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) { // L: 790
				class205.resumePauseWidget(var3.id, var3.childIndex); // L: 791
				Client.meslayerContinueWidget = var3; // L: 792
				LoginScreenAnimation.invalidateWidget(var3); // L: 793
				return 1; // L: 794
			} else if (var0 == 1122) { // L: 796
				var3.spriteId = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 797
				LoginScreenAnimation.invalidateWidget(var3); // L: 798
				return 1; // L: 799
			} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) { // L: 801
				var3.color2 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 802
				LoginScreenAnimation.invalidateWidget(var3); // L: 803
				return 1; // L: 804
			} else if (var0 == 1124) { // L: 806
				var3.transparencyBot = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 807
				LoginScreenAnimation.invalidateWidget(var3); // L: 808
				return 1; // L: 809
			} else if (var0 == 1125) { // L: 811
				var13 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 812
				class485 var11 = (class485)class4.findEnumerated(WorldMapData_0.FillMode_values(), var13); // L: 813
				if (var11 != null) { // L: 814
					var3.fillMode = var11; // L: 815
					LoginScreenAnimation.invalidateWidget(var3); // L: 816
				}

				return 1; // L: 818
			} else {
				boolean var8;
				if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) { // L: 820
					var8 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 821
					var3.field3606 = var8; // L: 822
					return 1; // L: 823
				} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) { // L: 825
					var8 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 826
					var3.modelTransparency = var8; // L: 827
					return 1; // L: 828
				} else if (var0 == 1129) { // L: 830
					var3.field3588 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize]; // L: 831
					LoginScreenAnimation.invalidateWidget(var3); // L: 832
					return 1; // L: 833
				} else if (var0 == 1130) { // L: 835
					var3.method6211(Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize], class245.urlRequester, class17.method246()); // L: 836
					return 1; // L: 837
				} else if (var0 == 1131) { // L: 839
					class302.Interpreter_intStackSize -= 2; // L: 840
					var3.method6213(Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]); // L: 841
					return 1; // L: 842
				} else if (var0 == 1132) { // L: 844
					var3.method6214(Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize], Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]); // L: 845
					return 1; // L: 846
				} else {
					class302 var12;
					if (var0 == 1133) { // L: 848
						--class302.Interpreter_intStackSize; // L: 849
						var12 = var3.method6226(); // L: 850
						if (var12 != null) { // L: 851
							var12.field3465 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 852
							LoginScreenAnimation.invalidateWidget(var3); // L: 853
						}

						return 1; // L: 855
					} else if (var0 == 1134) { // L: 857
						--class302.Interpreter_intStackSize; // L: 858
						var12 = var3.method6226(); // L: 859
						if (var12 != null) { // L: 860
							var12.field3470 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 861
							LoginScreenAnimation.invalidateWidget(var3); // L: 862
						}

						return 1; // L: 864
					} else if (var0 == 1135) { // L: 866
						--class20.Interpreter_stringStackSize; // L: 867
						var10 = var3.method6235(); // L: 868
						if (var10 != null) { // L: 869
							var3.text2 = Interpreter.Interpreter_stringStack[class20.Interpreter_stringStackSize]; // L: 870
						}

						return 1; // L: 872
					} else if (var0 == 1136) { // L: 874
						--class302.Interpreter_intStackSize; // L: 875
						var12 = var3.method6226(); // L: 876
						if (var12 != null) { // L: 877
							var12.field3467 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 878
							LoginScreenAnimation.invalidateWidget(var3); // L: 879
						}

						return 1; // L: 881
					} else if (var0 == 1137) { // L: 883
						--class302.Interpreter_intStackSize; // L: 884
						var10 = var3.method6235(); // L: 885
						if (var10 != null && var10.method5929(Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize])) { // L: 886
							LoginScreenAnimation.invalidateWidget(var3); // L: 887
						}

						return 1; // L: 889
					} else if (var0 == 1138) { // L: 891
						--class302.Interpreter_intStackSize; // L: 892
						var10 = var3.method6235(); // L: 893
						if (var10 != null && var10.method5930(Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize])) { // L: 894
							LoginScreenAnimation.invalidateWidget(var3); // L: 895
						}

						return 1; // L: 897
					} else if (var0 == 1139) { // L: 899
						--class302.Interpreter_intStackSize; // L: 900
						var10 = var3.method6235(); // L: 901
						if (var10 != null && var10.method6150(Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize])) { // L: 902
							LoginScreenAnimation.invalidateWidget(var3); // L: 903
						}

						return 1; // L: 905
					} else {
						class307 var6;
						if (var0 == 1140) { // L: 907
							var8 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 908
							Client.field752.method4097(); // L: 909
							var6 = var3.method6235(); // L: 910
							if (var6 != null && var6.method6057(var8)) { // L: 911
								if (var8) { // L: 912
									Client.field752.method4096(var3); // L: 913
								}

								LoginScreenAnimation.invalidateWidget(var3); // L: 915
							}

							return 1; // L: 917
						} else if (var0 == 1141) { // L: 919
							var8 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 920
							if (!var8 && Client.field752.method4109() == var3) { // L: 921
								Client.field752.method4097(); // L: 922
								LoginScreenAnimation.invalidateWidget(var3); // L: 923
							}

							var6 = var3.method6235(); // L: 925
							if (var6 != null) { // L: 926
								var6.method5924(var8); // L: 927
							}

							return 1; // L: 929
						} else if (var0 == 1142) { // L: 931
							class302.Interpreter_intStackSize -= 2; // L: 932
							var10 = var3.method6235(); // L: 933
							if (var10 != null && var10.method6013(Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1])) { // L: 934
								LoginScreenAnimation.invalidateWidget(var3); // L: 935
							}

							return 1; // L: 937
						} else if (var0 == 1143) { // L: 939
							--class302.Interpreter_intStackSize; // L: 940
							var10 = var3.method6235(); // L: 941
							if (var10 != null && var10.method6013(Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize])) { // L: 942
								LoginScreenAnimation.invalidateWidget(var3); // L: 943
							}

							return 1; // L: 945
						} else if (var0 == 1144) { // L: 947
							--class302.Interpreter_intStackSize; // L: 948
							var10 = var3.method6235(); // L: 949
							if (var10 != null) { // L: 950
								var10.method5936(Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]); // L: 951
								LoginScreenAnimation.invalidateWidget(var3); // L: 952
							}

							return 1; // L: 954
						} else if (var0 == 1145) { // L: 956
							--class302.Interpreter_intStackSize; // L: 957
							var10 = var3.method6235(); // L: 958
							if (var10 != null) { // L: 959
								var10.method5935(Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]); // L: 960
							}

							return 1; // L: 962
						} else if (var0 == 1146) { // L: 964
							--class302.Interpreter_intStackSize; // L: 965
							var10 = var3.method6235(); // L: 966
							if (var10 != null) { // L: 967
								var10.method5938(Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]); // L: 968
							}

							return 1; // L: 970
						} else if (var0 == 1147) { // L: 972
							--class302.Interpreter_intStackSize; // L: 973
							var10 = var3.method6235(); // L: 974
							if (var10 != null) { // L: 975
								var10.method5937(Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]); // L: 976
								LoginScreenAnimation.invalidateWidget(var3); // L: 977
							}

							return 1; // L: 979
						} else {
							class27 var5;
							if (var0 == 1148) { // L: 981
								class302.Interpreter_intStackSize -= 2; // L: 982
								var5 = var3.method6227(); // L: 983
								if (var5 != null) { // L: 984
									var5.method391(Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]); // L: 985
								}

								return 1; // L: 987
							} else if (var0 == 1149) { // L: 989
								class302.Interpreter_intStackSize -= 2; // L: 990
								var5 = var3.method6227(); // L: 991
								if (var5 != null) { // L: 992
									var5.method417((char)Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]); // L: 993
								}

								return 1; // L: 995
							} else {
								return 2; // L: 997
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZI)I",
		garbageValue = "-290172946"
	)
	static int method1208(int var0, Script var1, boolean var2) {
		boolean var3 = true; // L: 1042
		Widget var4;
		if (var0 >= 2000) { // L: 1044
			var0 -= 1000; // L: 1045
			var4 = class133.getWidget(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]); // L: 1046
			var3 = false; // L: 1047
		} else {
			var4 = var2 ? Interpreter.scriptDotWidget : class85.field1091; // L: 1049
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) { // L: 1050
			var11 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] - 1; // L: 1051
			if (var11 >= 0 && var11 <= 9) { // L: 1052
				var4.setAction(var11, Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize]); // L: 1056
				return 1; // L: 1057
			} else {
				--class20.Interpreter_stringStackSize; // L: 1053
				return 1; // L: 1054
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) { // L: 1059
				class302.Interpreter_intStackSize -= 2; // L: 1060
				var11 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 1061
				var6 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 1062
				var4.parent = class135.getWidgetChild(var11, var6); // L: 1063
				return 1; // L: 1064
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) { // L: 1066
				var4.isScrollBar = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 1067
				return 1; // L: 1068
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) { // L: 1070
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 1071
				return 1; // L: 1072
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) { // L: 1074
				var4.dragThreshold = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 1075
				return 1; // L: 1076
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) { // L: 1078
				var4.dataText = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize]; // L: 1079
				return 1; // L: 1080
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) { // L: 1082
				var4.spellActionName = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize]; // L: 1083
				return 1; // L: 1084
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) { // L: 1086
				var4.actions = null; // L: 1087
				return 1; // L: 1088
			} else if (var0 == 1308) { // L: 1090
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 1091
				return 1; // L: 1092
			} else if (var0 == 1309) { // L: 1094
				--class302.Interpreter_intStackSize; // L: 1095
				return 1; // L: 1096
			} else {
				int var7;
				byte[] var8;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) { // L: 1098
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) { // L: 1128
						class302.Interpreter_intStackSize -= 2; // L: 1129
						var5 = 10; // L: 1130
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]}; // L: 1131
						byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]}; // L: 1132
						ObjectSound.Widget_setKey(var4, var5, var8, var9); // L: 1133
						return 1; // L: 1134
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) { // L: 1136
						class302.Interpreter_intStackSize -= 3; // L: 1137
						var11 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize] - 1; // L: 1138
						var6 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 1139
						var7 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 2]; // L: 1140
						if (var11 >= 0 && var11 <= 9) { // L: 1141
							ViewportMouse.Widget_setKeyRate(var4, var11, var6, var7); // L: 1144
							return 1; // L: 1145
						} else {
							throw new RuntimeException(); // L: 1142
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) { // L: 1147
						var5 = 10; // L: 1148
						var6 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 1149
						var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 1150
						ViewportMouse.Widget_setKeyRate(var4, var5, var6, var7); // L: 1151
						return 1; // L: 1152
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) { // L: 1154
						--class302.Interpreter_intStackSize; // L: 1155
						var11 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize] - 1; // L: 1156
						if (var11 >= 0 && var11 <= 9) { // L: 1157
							class145.Widget_setKeyIgnoreHeld(var4, var11); // L: 1160
							return 1; // L: 1161
						} else {
							throw new RuntimeException(); // L: 1158
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) { // L: 1163
						var5 = 10; // L: 1164
						class145.Widget_setKeyIgnoreHeld(var4, var5); // L: 1165
						return 1; // L: 1166
					} else {
						return 2; // L: 1168
					}
				} else {
					byte[] var10 = null; // L: 1099
					var8 = null; // L: 1100
					if (var3) { // L: 1101
						class302.Interpreter_intStackSize -= 10; // L: 1102

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + class302.Interpreter_intStackSize] >= 0; var7 += 2) { // L: 1104 1105
						}

						if (var7 > 0) { // L: 1107
							var10 = new byte[var7 / 2]; // L: 1108
							var8 = new byte[var7 / 2]; // L: 1109

							for (var7 -= 2; var7 >= 0; var7 -= 2) { // L: 1110
								var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + class302.Interpreter_intStackSize]; // L: 1111
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + class302.Interpreter_intStackSize + 1]; // L: 1112
							}
						}
					} else {
						class302.Interpreter_intStackSize -= 2; // L: 1117
						var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]}; // L: 1118
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]}; // L: 1119
					}

					var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] - 1; // L: 1121
					if (var7 >= 0 && var7 <= 9) { // L: 1122
						ObjectSound.Widget_setKey(var4, var7, var10, var8); // L: 1125
						return 1; // L: 1126
					} else {
						throw new RuntimeException(); // L: 1123
					}
				}
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZI)I",
		garbageValue = "-2053256956"
	)
	static int method1205(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) { // L: 1789
			var3 = class133.getWidget(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]); // L: 1790
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.itemId; // L: 1791
			return 1; // L: 1792
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) { // L: 1794
			var3 = class133.getWidget(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]); // L: 1795
			if (var3.itemId != -1) { // L: 1796
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 1797
			}

			return 1; // L: 1798
		} else if (var0 == ScriptOpcodes.IF_HASSUB) { // L: 1800
			int var5 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 1801
			InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var5); // L: 1802
			if (var4 != null) { // L: 1803
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 1;
			} else {
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 1804
			}

			return 1; // L: 1805
		} else if (var0 == ScriptOpcodes.IF_GETTOP) { // L: 1807
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.rootInterface; // L: 1808
			return 1; // L: 1809
		} else if (var0 == 2707) { // L: 1811
			var3 = class133.getWidget(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]); // L: 1812
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.method6351() ? 1 : 0; // L: 1813
			return 1; // L: 1814
		} else if (var0 == 2708) { // L: 1816
			var3 = class133.getWidget(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]); // L: 1817
			return FileSystem.method3510(var3); // L: 1818
		} else if (var0 == 2709) { // L: 1820
			var3 = class133.getWidget(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]); // L: 1821
			return class308.method6188(var3); // L: 1822
		} else {
			return 2; // L: 1824
		}
	}

	@ObfuscatedName("mi")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "5"
	)
	static void method1210() {
		if (Client.field595 && class387.localPlayer != null) { // L: 13332
			int var0 = class387.localPlayer.pathX[0]; // L: 13333
			int var1 = class387.localPlayer.pathY[0]; // L: 13334
			if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) { // L: 13335
				return;
			}

			class245.oculusOrbFocalPointX = class387.localPlayer.x; // L: 13336
			int var2 = GrandExchangeOfferNameComparator.getTileHeight(class387.localPlayer.x, class387.localPlayer.y, class103.Client_plane) - Client.camFollowHeight; // L: 13337
			if (var2 < Ignored.field4573) { // L: 13338
				Ignored.field4573 = var2;
			}

			UserComparator10.oculusOrbFocalPointY = class387.localPlayer.y; // L: 13339
			Client.field595 = false; // L: 13340
		}

	} // L: 13342
}
