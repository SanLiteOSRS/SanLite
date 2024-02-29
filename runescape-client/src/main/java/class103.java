import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dr")
public class class103 {
	@ObfuscatedName("pj")
	@ObfuscatedGetter(
		intValue = -270514001
	)
	static int field1354;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 904918569
	)
	int field1352;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -166196487
	)
	int field1351;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -745370045
	)
	int field1356;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -392550043
	)
	int field1353;

	class103(int var1, int var2, int var3, int var4) {
		this.field1352 = var1;
		this.field1351 = var2;
		this.field1356 = var3;
		this.field1353 = var4; // L: 13
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1608707945"
	)
	int method2733() {
		return this.field1352;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-28872"
	)
	int method2748() {
		return this.field1351;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	int method2734() {
		return this.field1356;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "3"
	)
	int method2735() {
		return this.field1353;
	}

	@ObfuscatedName("aq")
	public static final int method2747(double var0, double var2, double var4) {
		double var6 = var4; // L: 9
		double var8 = var4; // L: 10
		double var10 = var4; // L: 11
		if (0.0D != var2) { // L: 12
			double var12;
			if (var4 < 0.5D) { // L: 14
				var12 = (1.0D + var2) * var4;
			} else {
				var12 = var4 + var2 - var2 * var4; // L: 15
			}

			double var14 = var4 * 2.0D - var12; // L: 16
			double var16 = var0 + 0.3333333333333333D; // L: 17
			if (var16 > 1.0D) { // L: 18
				--var16;
			}

			double var20 = var0 - 0.3333333333333333D; // L: 20
			if (var20 < 0.0D) { // L: 21
				++var20;
			}

			if (6.0D * var16 < 1.0D) { // L: 22
				var6 = var14 + (var12 - var14) * 6.0D * var16;
			} else if (var16 * 2.0D < 1.0D) { // L: 23
				var6 = var12;
			} else if (var16 * 3.0D < 2.0D) { // L: 24
				var6 = var14 + 6.0D * (var12 - var14) * (0.6666666666666666D - var16);
			} else {
				var6 = var14; // L: 25
			}

			if (6.0D * var0 < 1.0D) { // L: 26
				var8 = var14 + 6.0D * (var12 - var14) * var0;
			} else if (var0 * 2.0D < 1.0D) { // L: 27
				var8 = var12;
			} else if (var0 * 3.0D < 2.0D) {
				var8 = var14 + (0.6666666666666666D - var0) * (var12 - var14) * 6.0D; // L: 28
			} else {
				var8 = var14; // L: 29
			}

			if (6.0D * var20 < 1.0D) { // L: 30
				var10 = var20 * (var12 - var14) * 6.0D + var14;
			} else if (2.0D * var20 < 1.0D) { // L: 31
				var10 = var12;
			} else if (3.0D * var20 < 2.0D) { // L: 32
				var10 = 6.0D * (var12 - var14) * (0.6666666666666666D - var20) + var14;
			} else {
				var10 = var14; // L: 33
			}
		}

		int var22 = (int)(var6 * 256.0D); // L: 35
		int var13 = (int)(256.0D * var8); // L: 36
		int var23 = (int)(var10 * 256.0D); // L: 37
		int var15 = var23 + (var13 << 8) + (var22 << 16); // L: 38
		return var15; // L: 39
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "25817"
	)
	public static void method2737() {
		while (true) {
			ArchiveDiskAction var0;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 64
				var0 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast(); // L: 65
			} // L: 66

			if (var0 == null) {
				return; // L: 67
			}

			var0.archive.load(var0.archiveDisk, (int)var0.key, var0.data, false); // L: 68
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "-1244805083"
	)
	static int method2749(int var0, Script var1, boolean var2) {
		int var4 = -1; // L: 625
		Widget var3;
		if (var0 >= 2000) { // L: 626
			var0 -= 1000; // L: 627
			var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 628
			var3 = ArchiveLoader.field1070.method6431(var4); // L: 629
		} else {
			var3 = var2 ? Interpreter.scriptDotWidget : class141.field1644; // L: 631
		}

		int var16;
		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) { // L: 632
			Interpreter.Interpreter_intStackSize -= 2; // L: 633
			var16 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 634
			int var14 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 635
			if (var3.type == 12) { // L: 636
				class347 var17 = var3.method6806(); // L: 637
				if (var17 != null && var17.method6516(var16, var14)) { // L: 638
					UserComparator5.invalidateWidget(var3); // L: 639
				}
			} else {
				var3.scrollX = var16; // L: 643
				if (var3.scrollX > var3.scrollWidth - var3.width) { // L: 644
					var3.scrollX = var3.scrollWidth - var3.width;
				}

				if (var3.scrollX < 0) { // L: 645
					var3.scrollX = 0;
				}

				var3.scrollY = var14; // L: 646
				if (var3.scrollY > var3.scrollHeight - var3.height) { // L: 647
					var3.scrollY = var3.scrollHeight - var3.height;
				}

				if (var3.scrollY < 0) { // L: 648
					var3.scrollY = 0;
				}

				UserComparator5.invalidateWidget(var3); // L: 649
			}

			return 1; // L: 651
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) {
			var3.color = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 654
			UserComparator5.invalidateWidget(var3); // L: 655
			return 1; // L: 656
		} else if (var0 == ScriptOpcodes.CC_SETFILL) {
			var3.fill = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 659
			UserComparator5.invalidateWidget(var3); // L: 660
			return 1; // L: 661
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) {
			var3.transparencyTop = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 664
			UserComparator5.invalidateWidget(var3); // L: 665
			return 1; // L: 666
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) {
			var3.lineWid = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 669
			UserComparator5.invalidateWidget(var3); // L: 670
			return 1; // L: 671
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) {
			var3.spriteId2 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 674
			UserComparator5.invalidateWidget(var3); // L: 675
			return 1; // L: 676
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) {
			var3.spriteAngle = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 679
			UserComparator5.invalidateWidget(var3); // L: 680
			return 1; // L: 681
		} else if (var0 == ScriptOpcodes.CC_SETTILING) {
			var3.spriteTiling = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 684
			UserComparator5.invalidateWidget(var3); // L: 685
			return 1; // L: 686
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) {
			var3.modelType = 1; // L: 689
			var3.modelId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 690
			UserComparator5.invalidateWidget(var3); // L: 691
			return 1; // L: 692
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) {
			Interpreter.Interpreter_intStackSize -= 6; // L: 695
			var3.modelOffsetX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 696
			var3.modelOffsetY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 697
			var3.modelAngleX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 698
			var3.modelAngleY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 699
			var3.modelAngleZ = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 4]; // L: 700
			var3.modelZoom = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 5]; // L: 701
			UserComparator5.invalidateWidget(var3); // L: 702
			return 1; // L: 703
		} else if (var0 == ScriptOpcodes.CC_SETMODELANIM) {
			var16 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 706
			if (var16 != var3.sequenceId) { // L: 707
				var3.sequenceId = var16; // L: 708
				var3.modelFrame = 0; // L: 709
				var3.modelFrameCycle = 0; // L: 710
				UserComparator5.invalidateWidget(var3); // L: 711
			}

			return 1; // L: 713
		} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) {
			var3.modelOrthog = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 716
			UserComparator5.invalidateWidget(var3); // L: 717
			return 1; // L: 718
		} else {
			class347 var6;
			String var13;
			if (var0 != ScriptOpcodes.CC_SETTEXT) {
				class347 var20;
				if (var0 == ScriptOpcodes.CC_SETTEXTFONT) {
					var3.fontId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 739
					if (var3.type == 12) { // L: 740
						var20 = var3.method6806(); // L: 741
						if (var20 != null) { // L: 742
							var20.method6742(); // L: 743
						}
					}

					UserComparator5.invalidateWidget(var3); // L: 746
					return 1; // L: 747
				} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) {
					Interpreter.Interpreter_intStackSize -= 3; // L: 750
					if (var3.type == 12) { // L: 751
						var20 = var3.method6806(); // L: 752
						if (var20 != null) { // L: 753
							var20.method6517(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 754
							var20.method6554(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]); // L: 755
						}
					} else {
						var3.textXAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 759
						var3.textYAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 760
						var3.textLineHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 761
					}

					UserComparator5.invalidateWidget(var3); // L: 763
					return 1; // L: 764
				} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) {
					var3.textShadowed = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 767
					UserComparator5.invalidateWidget(var3); // L: 768
					return 1; // L: 769
				} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) {
					var3.outline = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 772
					UserComparator5.invalidateWidget(var3); // L: 773
					return 1; // L: 774
				} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) {
					var3.spriteShadow = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 777
					UserComparator5.invalidateWidget(var3); // L: 778
					return 1; // L: 779
				} else if (var0 == ScriptOpcodes.CC_SETVFLIP) {
					var3.spriteFlipV = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 782
					UserComparator5.invalidateWidget(var3); // L: 783
					return 1; // L: 784
				} else if (var0 == ScriptOpcodes.CC_SETHFLIP) {
					var3.spriteFlipH = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 787
					UserComparator5.invalidateWidget(var3); // L: 788
					return 1; // L: 789
				} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) {
					Interpreter.Interpreter_intStackSize -= 2; // L: 792
					var3.scrollWidth = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 793
					var3.scrollHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 794
					UserComparator5.invalidateWidget(var3); // L: 795
					if (var4 != -1 && var3.type == 0) { // L: 796
						class167.revalidateWidgetScroll(ArchiveLoader.field1070.field3633[var4 >> 16], var3, false);
					}

					return 1; // L: 797
				} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) {
					class192.resumePauseWidget(var3.id, var3.childIndex); // L: 800
					Client.meslayerContinueWidget = var3; // L: 801
					UserComparator5.invalidateWidget(var3); // L: 802
					return 1; // L: 803
				} else if (var0 == 1122) {
					var3.spriteId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 806
					UserComparator5.invalidateWidget(var3); // L: 807
					return 1; // L: 808
				} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) {
					var3.color2 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 811
					UserComparator5.invalidateWidget(var3); // L: 812
					return 1; // L: 813
				} else if (var0 == 1124) {
					var3.transparencyBot = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 816
					UserComparator5.invalidateWidget(var3); // L: 817
					return 1; // L: 818
				} else if (var0 == 1125) {
					var16 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 821
					class545 var18 = (class545)class356.findEnumerated(ArchiveDiskAction.FillMode_values(), var16); // L: 822
					if (var18 != null) { // L: 823
						var3.fillMode = var18; // L: 824
						UserComparator5.invalidateWidget(var3); // L: 825
					}

					return 1; // L: 827
				} else {
					boolean var5;
					if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) {
						var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 830
						var3.field3759 = var5; // L: 831
						return 1; // L: 832
					} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) {
						var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 835
						var3.modelTransparency = var5; // L: 836
						return 1; // L: 837
					} else if (var0 == 1129) {
						var3.field3762 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize]; // L: 840
						UserComparator5.invalidateWidget(var3); // L: 841
						return 1; // L: 842
					} else if (var0 == 1130) {
						var3.method6874(Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize], "", InvDefinition.urlRequester, AttackOption.method2755()); // L: 845
						return 1; // L: 846
					} else if (var0 == 1131) {
						Interpreter.Interpreter_intStackSize -= 2; // L: 849
						var3.swapItems(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 850
						return 1; // L: 851
					} else if (var0 == 1132) {
						var3.method6810(Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize], Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 854
						return 1; // L: 855
					} else {
						class341 var21;
						if (var0 == 1133) {
							--Interpreter.Interpreter_intStackSize; // L: 858
							var21 = var3.method6823(); // L: 859
							if (var21 != null) { // L: 860
								var21.field3643 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 861
								UserComparator5.invalidateWidget(var3); // L: 862
							}

							return 1; // L: 864
						} else if (var0 == 1134) {
							--Interpreter.Interpreter_intStackSize; // L: 867
							var21 = var3.method6823(); // L: 868
							if (var21 != null) { // L: 869
								var21.field3639 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 870
								UserComparator5.invalidateWidget(var3); // L: 871
							}

							return 1; // L: 873
						} else if (var0 == 1135) {
							--class60.Interpreter_stringStackSize; // L: 876
							var20 = var3.method6806(); // L: 877
							if (var20 != null) { // L: 878
								var3.field3789 = Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize]; // L: 879
							}

							return 1; // L: 881
						} else if (var0 == 1136) {
							--Interpreter.Interpreter_intStackSize; // L: 884
							var21 = var3.method6823(); // L: 885
							if (var21 != null) { // L: 886
								var21.field3640 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 887
								UserComparator5.invalidateWidget(var3); // L: 888
							}

							return 1; // L: 890
						} else if (var0 == 1137) {
							--Interpreter.Interpreter_intStackSize; // L: 893
							var20 = var3.method6806(); // L: 894
							if (var20 != null && var20.method6519(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) { // L: 895
								UserComparator5.invalidateWidget(var3); // L: 896
							}

							return 1; // L: 898
						} else if (var0 == 1138) {
							--Interpreter.Interpreter_intStackSize; // L: 901
							var20 = var3.method6806(); // L: 902
							if (var20 != null && var20.method6577(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) { // L: 903
								UserComparator5.invalidateWidget(var3); // L: 904
							}

							return 1; // L: 906
						} else if (var0 == 1139) {
							--Interpreter.Interpreter_intStackSize; // L: 909
							var20 = var3.method6806(); // L: 910
							if (var20 != null && var20.method6772(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) { // L: 911
								UserComparator5.invalidateWidget(var3); // L: 912
							}

							return 1; // L: 914
						} else if (var0 == 1140) {
							var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 917
							Client.field737.method4394(); // L: 918
							var6 = var3.method6806(); // L: 919
							if (var6 != null && var6.method6722(var5)) { // L: 920
								if (var5) { // L: 921
									Client.field737.method4402(var3); // L: 922
								}

								UserComparator5.invalidateWidget(var3); // L: 924
							}

							return 1; // L: 926
						} else if (var0 == 1141) {
							var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 929
							if (!var5 && Client.field737.method4393() == var3) { // L: 930
								Client.field737.method4394(); // L: 931
								UserComparator5.invalidateWidget(var3); // L: 932
							}

							var6 = var3.method6806(); // L: 934
							if (var6 != null) { // L: 935
								var6.method6508(var5); // L: 936
							}

							return 1; // L: 938
						} else if (var0 == 1142) {
							Interpreter.Interpreter_intStackSize -= 2; // L: 941
							var20 = var3.method6806(); // L: 942
							if (var20 != null && var20.method6530(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1])) { // L: 943
								UserComparator5.invalidateWidget(var3); // L: 944
							}

							return 1; // L: 946
						} else if (var0 == 1143) {
							--Interpreter.Interpreter_intStackSize; // L: 949
							var20 = var3.method6806(); // L: 950
							if (var20 != null && var20.method6530(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) { // L: 951
								UserComparator5.invalidateWidget(var3); // L: 952
							}

							return 1; // L: 954
						} else if (var0 == 1144) {
							--Interpreter.Interpreter_intStackSize; // L: 957
							var20 = var3.method6806(); // L: 958
							if (var20 != null) { // L: 959
								var20.method6520(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]); // L: 960
								UserComparator5.invalidateWidget(var3); // L: 961
							}

							return 1; // L: 963
						} else if (var0 == 1145) {
							--Interpreter.Interpreter_intStackSize; // L: 966
							var20 = var3.method6806(); // L: 967
							if (var20 != null) { // L: 968
								var20.method6639(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]); // L: 969
							}

							return 1; // L: 971
						} else if (var0 == 1146) {
							--Interpreter.Interpreter_intStackSize; // L: 974
							var20 = var3.method6806(); // L: 975
							if (var20 != null) { // L: 976
								var20.method6651(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]); // L: 977
							}

							return 1; // L: 979
						} else if (var0 == 1147) {
							--Interpreter.Interpreter_intStackSize; // L: 982
							var20 = var3.method6806(); // L: 983
							if (var20 != null) { // L: 984
								var20.method6521(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]); // L: 985
								UserComparator5.invalidateWidget(var3); // L: 986
							}

							return 1; // L: 988
						} else {
							class27 var19;
							if (var0 == 1148) {
								Interpreter.Interpreter_intStackSize -= 2; // L: 991
								var19 = var3.method6825(); // L: 992
								if (var19 != null) { // L: 993
									var19.method359(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 994
								}

								return 1; // L: 996
							} else if (var0 == 1149) {
								Interpreter.Interpreter_intStackSize -= 2; // L: 999
								var19 = var3.method6825(); // L: 1000
								if (var19 != null) { // L: 1001
									var19.method360((char)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 1002
								}

								return 1; // L: 1004
							} else if (var0 == 1150) {
								var3.method6807(Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize], InvDefinition.urlRequester); // L: 1007
								return 1; // L: 1008
							} else if (var0 == 1151) {
								class60.Interpreter_stringStackSize -= 3; // L: 1011
								var13 = Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize]; // L: 1012
								String var15 = Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize + 1]; // L: 1013
								String var7 = Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize + 2]; // L: 1014
								long var8 = AttackOption.method2755(); // L: 1015
								long var10 = class159.method3416(); // L: 1016
								String var12 = class425.method8037().method8836(class425.method8037().field4959); // L: 1017
								if (var8 != -1L) { // L: 1018
									var13 = var13.replaceAll("%userid%", Long.toString(var8)); // L: 1019
								}

								if (var10 != -1L) { // L: 1021
									var13 = var13.replaceAll("%userhash%", Long.toString(var10)); // L: 1022
								}

								if (!var12.isEmpty()) { // L: 1024
									var13 = var13.replaceAll("%deviceid%", var12); // L: 1025
								}

								var3.method6788(var13, var15, var7, var12, Long.toString(var10), InvDefinition.urlRequester); // L: 1027
								return 1; // L: 1028
							} else if (var0 == 1152) {
								if (var3.type == 11) { // L: 1031
									var5 = VarbitComposition.method3830().method4274(var3.method6819().method4141()); // L: 1032
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5 ? 1 : 0; // L: 1033
								} else {
									System.out.println("Attempting to call function on a non-CRMView object."); // L: 1036
								}

								return 1; // L: 1038
							} else {
								return 2; // L: 1040
							}
						}
					}
				}
			} else {
				var13 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize]; // L: 721
				if (var3.type == 12) { // L: 722
					var6 = var3.method6806(); // L: 723
					if (var6 != null && var6.method6562()) { // L: 724
						var6.method6551(var13); // L: 725
					} else {
						var3.text = var13; // L: 728
					}

					UserComparator5.invalidateWidget(var3); // L: 730
				} else if (!var13.equals(var3.text)) { // L: 732
					var3.text = var13; // L: 733
					UserComparator5.invalidateWidget(var3); // L: 734
				}

				return 1; // L: 736
			}
		}
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-2069548538"
	)
	static final void method2750(int var0, int var1, boolean var2) {
		if (!var2 || var0 != class378.field4434 || class317.field3456 != var1) { // L: 5954
			class378.field4434 = var0; // L: 5957
			class317.field3456 = var1; // L: 5958
			Interpreter.method2106(25); // L: 5959
			RouteStrategy.drawLoadingMessage("Loading - please wait.", true); // L: 5960
			int var3 = Projectile.baseX * 64; // L: 5961
			int var4 = GameEngine.baseY * 8; // L: 5962
			Projectile.baseX = (var0 - 6) * 8; // L: 5963
			GameEngine.baseY = (var1 - 6) * 64; // L: 5964
			int var5 = Projectile.baseX * 64 - var3; // L: 5965
			int var6 = GameEngine.baseY * 8 - var4; // L: 5966
			var3 = Projectile.baseX * 64; // L: 5967
			var4 = GameEngine.baseY * 8; // L: 5968

			int var7;
			int var9;
			int[] var10000;
			for (var7 = 0; var7 < 65536; ++var7) { // L: 5969
				NPC var19 = Client.npcs[var7]; // L: 5970
				if (var19 != null) { // L: 5971
					for (var9 = 0; var9 < 10; ++var9) { // L: 5972
						var10000 = var19.pathX; // L: 5973
						var10000[var9] -= var5;
						var10000 = var19.pathY; // L: 5974
						var10000[var9] -= var6;
					}

					var19.x -= var5 * 128; // L: 5976
					var19.y -= var6 * 128; // L: 5977
				}
			}

			for (var7 = 0; var7 < 2048; ++var7) { // L: 5980
				Player var22 = Client.players[var7]; // L: 5981
				if (var22 != null) { // L: 5982
					for (var9 = 0; var9 < 10; ++var9) { // L: 5983
						var10000 = var22.pathX; // L: 5984
						var10000[var9] -= var5;
						var10000 = var22.pathY; // L: 5985
						var10000[var9] -= var6;
					}

					var22.x -= var5 * 128; // L: 5987
					var22.y -= var6 * 128; // L: 5988
				}
			}

			byte var20 = 0; // L: 5991
			byte var8 = 104; // L: 5992
			byte var21 = 1; // L: 5993
			if (var5 < 0) { // L: 5994
				var20 = 103; // L: 5995
				var8 = -1; // L: 5996
				var21 = -1; // L: 5997
			}

			byte var10 = 0; // L: 5999
			byte var11 = 104; // L: 6000
			byte var12 = 1; // L: 6001
			if (var6 < 0) { // L: 6002
				var10 = 103; // L: 6003
				var11 = -1; // L: 6004
				var12 = -1; // L: 6005
			}

			int var14;
			for (int var13 = var20; var8 != var13; var13 += var21) { // L: 6007
				for (var14 = var10; var11 != var14; var14 += var12) { // L: 6008
					int var15 = var13 + var5; // L: 6009
					int var16 = var14 + var6; // L: 6010

					for (int var17 = 0; var17 < 4; ++var17) { // L: 6011
						if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) { // L: 6012
							Client.groundItems[var17][var13][var14] = Client.groundItems[var17][var15][var16];
						} else {
							Client.groundItems[var17][var13][var14] = null; // L: 6013
						}
					}
				}
			}

			for (PendingSpawn var18 = (PendingSpawn)Client.pendingSpawns.last(); var18 != null; var18 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 6017 6018 6022
				var18.x -= var5; // L: 6019
				var18.y -= var6; // L: 6020
				if (var18.x < 0 || var18.y < 0 || var18.x >= 104 || var18.y >= 104) { // L: 6021
					var18.remove();
				}
			}

			if (Client.destinationX != 0) { // L: 6024
				Client.destinationX -= var5; // L: 6025
				Client.destinationY -= var6; // L: 6026
			}

			Client.soundEffectCount = 0; // L: 6028
			Client.isCameraLocked = false; // L: 6029
			FriendsChatMember.cameraX -= var5 << 7; // L: 6030
			class317.cameraZ -= var6 << 7; // L: 6031
			Friend.oculusOrbFocalPointX -= var5 << 7; // L: 6032
			class59.oculusOrbFocalPointY -= var6 << 7; // L: 6033
			Client.field772 = -1; // L: 6034
			Client.graphicsObjects.clear(); // L: 6035
			Client.projectiles.clear(); // L: 6036

			for (var14 = 0; var14 < 4; ++var14) { // L: 6037
				Client.collisionMaps[var14].clear();
			}

		}
	} // L: 5955 6038
}
