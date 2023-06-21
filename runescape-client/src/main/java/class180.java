import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gq")
public abstract class class180 {
	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("archive8")
	static Archive archive8;
	@ObfuscatedName("no")
	@ObfuscatedGetter(
		intValue = 567132225
	)
	@Export("menuX")
	static int menuX;
	@ObfuscatedName("as")
	String field1878;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgi;"
	)
	final class169 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgi;Ljava/lang/String;)V"
	)
	class180(class169 var1, String var2) {
		this.this$0 = var1; // L: 371
		this.field1878 = var2; // L: 372
	} // L: 373

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1756234342"
	)
	public abstract int vmethod3531();

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1324098336"
	)
	public String vmethod3532() {
		return null; // L: 382
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "16858419"
	)
	public int vmethod3536() {
		return -1; // L: 386
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "139137054"
	)
	public String method3530() {
		return this.field1878; // L: 376
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZB)I",
		garbageValue = "-87"
	)
	static int method3540(int var0, Script var1, boolean var2) {
		int var4 = -1; // L: 620
		Widget var3;
		if (var0 >= 2000) { // L: 621
			var0 -= 1000; // L: 622
			var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 623
			var3 = FriendSystem.getWidget(var4); // L: 624
		} else {
			var3 = var2 ? class53.scriptDotWidget : Interpreter.field864; // L: 626
		}

		int var13;
		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) { // L: 627
			Interpreter.Interpreter_intStackSize -= 2; // L: 628
			var13 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 629
			int var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 630
			if (var3.type == 12) { // L: 631
				class327 var7 = var3.method6380(); // L: 632
				if (var7 != null && var7.method6338(var13, var9)) { // L: 633
					Messages.invalidateWidget(var3); // L: 634
				}
			} else {
				var3.scrollX = var13; // L: 638
				if (var3.scrollX > var3.scrollWidth - var3.width) { // L: 639
					var3.scrollX = var3.scrollWidth - var3.width;
				}

				if (var3.scrollX < 0) { // L: 640
					var3.scrollX = 0;
				}

				var3.scrollY = var9; // L: 641
				if (var3.scrollY > var3.scrollHeight - var3.height) { // L: 642
					var3.scrollY = var3.scrollHeight - var3.height;
				}

				if (var3.scrollY < 0) { // L: 643
					var3.scrollY = 0;
				}

				Messages.invalidateWidget(var3); // L: 644
			}

			return 1; // L: 646
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) {
			var3.color = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 649
			Messages.invalidateWidget(var3); // L: 650
			return 1; // L: 651
		} else if (var0 == ScriptOpcodes.CC_SETFILL) {
			var3.fill = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 654
			Messages.invalidateWidget(var3); // L: 655
			return 1; // L: 656
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) {
			var3.transparencyTop = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 659
			Messages.invalidateWidget(var3); // L: 660
			return 1; // L: 661
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) {
			var3.lineWid = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 664
			Messages.invalidateWidget(var3); // L: 665
			return 1; // L: 666
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) {
			var3.spriteId2 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 669
			Messages.invalidateWidget(var3); // L: 670
			return 1; // L: 671
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) {
			var3.spriteAngle = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 674
			Messages.invalidateWidget(var3); // L: 675
			return 1; // L: 676
		} else if (var0 == ScriptOpcodes.CC_SETTILING) {
			var3.spriteTiling = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 679
			Messages.invalidateWidget(var3); // L: 680
			return 1; // L: 681
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) {
			var3.modelType = 1; // L: 684
			var3.modelId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 685
			Messages.invalidateWidget(var3); // L: 686
			return 1; // L: 687
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) {
			Interpreter.Interpreter_intStackSize -= 6; // L: 690
			var3.modelOffsetX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 691
			var3.modelOffsetY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 692
			var3.modelAngleX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 693
			var3.modelAngleY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 694
			var3.modelAngleZ = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 4]; // L: 695
			var3.modelZoom = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 5]; // L: 696
			Messages.invalidateWidget(var3); // L: 697
			return 1; // L: 698
		} else if (var0 == ScriptOpcodes.CC_SETMODELANIM) {
			var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 701
			if (var13 != var3.sequenceId) { // L: 702
				var3.sequenceId = var13; // L: 703
				var3.modelFrame = 0; // L: 704
				var3.modelFrameCycle = 0; // L: 705
				Messages.invalidateWidget(var3); // L: 706
			}

			return 1; // L: 708
		} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) {
			var3.modelOrthog = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 711
			Messages.invalidateWidget(var3); // L: 712
			return 1; // L: 713
		} else if (var0 == ScriptOpcodes.CC_SETTEXT) {
			String var14 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize]; // L: 716
			if (!var14.equals(var3.text)) { // L: 717
				var3.text = var14; // L: 718
				Messages.invalidateWidget(var3); // L: 719
			}

			return 1; // L: 721
		} else {
			class327 var10;
			if (var0 == ScriptOpcodes.CC_SETTEXTFONT) {
				var3.fontId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 724
				if (var3.type == 12) { // L: 725
					var10 = var3.method6380(); // L: 726
					if (var10 != null) { // L: 727
						var10.method6072(); // L: 728
					}
				}

				Messages.invalidateWidget(var3); // L: 731
				return 1; // L: 732
			} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) {
				Interpreter.Interpreter_intStackSize -= 3; // L: 735
				if (var3.type == 12) { // L: 736
					var10 = var3.method6380(); // L: 737
					if (var10 != null) { // L: 738
						var10.method6066(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 739
						var10.method6067(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]); // L: 740
					}
				} else {
					var3.textXAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 744
					var3.textYAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 745
					var3.textLineHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 746
				}

				Messages.invalidateWidget(var3); // L: 748
				return 1; // L: 749
			} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) {
				var3.textShadowed = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 752
				Messages.invalidateWidget(var3); // L: 753
				return 1; // L: 754
			} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) {
				var3.outline = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 757
				Messages.invalidateWidget(var3); // L: 758
				return 1; // L: 759
			} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) {
				var3.spriteShadow = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 762
				Messages.invalidateWidget(var3); // L: 763
				return 1; // L: 764
			} else if (var0 == ScriptOpcodes.CC_SETVFLIP) {
				var3.spriteFlipV = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 767
				Messages.invalidateWidget(var3); // L: 768
				return 1; // L: 769
			} else if (var0 == ScriptOpcodes.CC_SETHFLIP) {
				var3.spriteFlipH = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 772
				Messages.invalidateWidget(var3); // L: 773
				return 1; // L: 774
			} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) {
				Interpreter.Interpreter_intStackSize -= 2; // L: 777
				var3.scrollWidth = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 778
				var3.scrollHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 779
				Messages.invalidateWidget(var3); // L: 780
				if (var4 != -1 && var3.type == 0) { // L: 781
					Projectile.revalidateWidgetScroll(class16.Widget_interfaceComponents[var4 >> 16], var3, false);
				}

				return 1; // L: 782
			} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) {
				GroundObject.resumePauseWidget(var3.id, var3.childIndex); // L: 785
				Client.meslayerContinueWidget = var3; // L: 786
				Messages.invalidateWidget(var3); // L: 787
				return 1; // L: 788
			} else if (var0 == 1122) {
				var3.spriteId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 791
				Messages.invalidateWidget(var3); // L: 792
				return 1; // L: 793
			} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) {
				var3.color2 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 796
				Messages.invalidateWidget(var3); // L: 797
				return 1; // L: 798
			} else if (var0 == 1124) {
				var3.transparencyBot = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 801
				Messages.invalidateWidget(var3); // L: 802
				return 1; // L: 803
			} else if (var0 == 1125) {
				var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 806
				class512 var11 = (class512)GameObject.findEnumerated(ClanChannelMember.FillMode_values(), var13); // L: 807
				if (var11 != null) { // L: 808
					var3.fillMode = var11; // L: 809
					Messages.invalidateWidget(var3); // L: 810
				}

				return 1; // L: 812
			} else {
				boolean var8;
				if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) {
					var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 815
					var3.field3658 = var8; // L: 816
					return 1; // L: 817
				} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) {
					var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 820
					var3.modelTransparency = var8; // L: 821
					return 1; // L: 822
				} else if (var0 == 1129) {
					var3.field3693 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize]; // L: 825
					Messages.invalidateWidget(var3); // L: 826
					return 1; // L: 827
				} else if (var0 == 1130) {
					var3.method6386(Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize], class47.urlRequester, class27.method406()); // L: 830
					return 1; // L: 831
				} else if (var0 == 1131) {
					Interpreter.Interpreter_intStackSize -= 2; // L: 834
					var3.swapItems(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 835
					return 1; // L: 836
				} else if (var0 == 1132) {
					var3.method6368(Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize], Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 839
					return 1; // L: 840
				} else {
					class322 var12;
					if (var0 == 1133) {
						--Interpreter.Interpreter_intStackSize; // L: 843
						var12 = var3.method6381(); // L: 844
						if (var12 != null) { // L: 845
							var12.field3522 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 846
							Messages.invalidateWidget(var3); // L: 847
						}

						return 1; // L: 849
					} else if (var0 == 1134) {
						--Interpreter.Interpreter_intStackSize; // L: 852
						var12 = var3.method6381(); // L: 853
						if (var12 != null) { // L: 854
							var12.field3519 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 855
							Messages.invalidateWidget(var3); // L: 856
						}

						return 1; // L: 858
					} else if (var0 == 1135) {
						--class149.Interpreter_stringStackSize; // L: 861
						var10 = var3.method6380(); // L: 862
						if (var10 != null) { // L: 863
							var3.field3666 = Interpreter.Interpreter_stringStack[class149.Interpreter_stringStackSize]; // L: 864
						}

						return 1; // L: 866
					} else if (var0 == 1136) {
						--Interpreter.Interpreter_intStackSize; // L: 869
						var12 = var3.method6381(); // L: 870
						if (var12 != null) { // L: 871
							var12.field3520 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 872
							Messages.invalidateWidget(var3); // L: 873
						}

						return 1; // L: 875
					} else if (var0 == 1137) {
						--Interpreter.Interpreter_intStackSize; // L: 878
						var10 = var3.method6380(); // L: 879
						if (var10 != null && var10.method6167(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) { // L: 880
							Messages.invalidateWidget(var3); // L: 881
						}

						return 1; // L: 883
					} else if (var0 == 1138) {
						--Interpreter.Interpreter_intStackSize; // L: 886
						var10 = var3.method6380(); // L: 887
						if (var10 != null && var10.method6110(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) { // L: 888
							Messages.invalidateWidget(var3); // L: 889
						}

						return 1; // L: 891
					} else if (var0 == 1139) {
						--Interpreter.Interpreter_intStackSize; // L: 894
						var10 = var3.method6380(); // L: 895
						if (var10 != null && var10.method6064(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) { // L: 896
							Messages.invalidateWidget(var3); // L: 897
						}

						return 1; // L: 899
					} else {
						class327 var6;
						if (var0 == 1140) {
							var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 902
							Client.field740.method4102(); // L: 903
							var6 = var3.method6380(); // L: 904
							if (var6 != null && var6.method6056(var8)) { // L: 905
								if (var8) { // L: 906
									Client.field740.method4120(var3); // L: 907
								}

								Messages.invalidateWidget(var3); // L: 909
							}

							return 1; // L: 911
						} else if (var0 == 1141) {
							var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 914
							if (!var8 && Client.field740.method4099() == var3) { // L: 915
								Client.field740.method4102(); // L: 916
								Messages.invalidateWidget(var3); // L: 917
							}

							var6 = var3.method6380(); // L: 919
							if (var6 != null) { // L: 920
								var6.method6057(var8); // L: 921
							}

							return 1; // L: 923
						} else if (var0 == 1142) {
							Interpreter.Interpreter_intStackSize -= 2; // L: 926
							var10 = var3.method6380(); // L: 927
							if (var10 != null && var10.method6080(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1])) { // L: 928
								Messages.invalidateWidget(var3); // L: 929
							}

							return 1; // L: 931
						} else if (var0 == 1143) {
							--Interpreter.Interpreter_intStackSize; // L: 934
							var10 = var3.method6380(); // L: 935
							if (var10 != null && var10.method6080(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) { // L: 936
								Messages.invalidateWidget(var3); // L: 937
							}

							return 1; // L: 939
						} else if (var0 == 1144) {
							--Interpreter.Interpreter_intStackSize; // L: 942
							var10 = var3.method6380(); // L: 943
							if (var10 != null) { // L: 944
								var10.method6069(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]); // L: 945
								Messages.invalidateWidget(var3); // L: 946
							}

							return 1; // L: 948
						} else if (var0 == 1145) {
							--Interpreter.Interpreter_intStackSize; // L: 951
							var10 = var3.method6380(); // L: 952
							if (var10 != null) { // L: 953
								var10.method6168(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]); // L: 954
							}

							return 1; // L: 956
						} else if (var0 == 1146) {
							--Interpreter.Interpreter_intStackSize; // L: 959
							var10 = var3.method6380(); // L: 960
							if (var10 != null) { // L: 961
								var10.method6071(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]); // L: 962
							}

							return 1; // L: 964
						} else if (var0 == 1147) {
							--Interpreter.Interpreter_intStackSize; // L: 967
							var10 = var3.method6380(); // L: 968
							if (var10 != null) { // L: 969
								var10.method6070(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]); // L: 970
								Messages.invalidateWidget(var3); // L: 971
							}

							return 1; // L: 973
						} else {
							class27 var5;
							if (var0 == 1148) {
								Interpreter.Interpreter_intStackSize -= 2; // L: 976
								var5 = var3.method6382(); // L: 977
								if (var5 != null) { // L: 978
									var5.method382(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 979
								}

								return 1; // L: 981
							} else if (var0 == 1149) {
								Interpreter.Interpreter_intStackSize -= 2; // L: 984
								var5 = var3.method6382(); // L: 985
								if (var5 != null) { // L: 986
									var5.method383((char)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 987
								}

								return 1; // L: 989
							} else if (var0 == 1150) {
								var3.method6365(Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize], class47.urlRequester); // L: 992
								return 1; // L: 993
							} else {
								return 2; // L: 995
							}
						}
					}
				}
			}
		}
	}
}
