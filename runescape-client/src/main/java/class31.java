import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bx")
public class class31 {
	@ObfuscatedName("af")
	public static Applet field174;
	@ObfuscatedName("an")
	public static String field175;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Lcl;"
	)
	@Export("World_worlds")
	static World[] World_worlds;
	@ObfuscatedName("ai")
	static int[] field176;
	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	@Export("scene")
	static Scene scene;
	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "[Ltc;"
	)
	@Export("modIconSprites")
	static IndexedSprite[] modIconSprites;

	static {
		field174 = null; // L: 10
		field175 = ""; // L: 11
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1319661382"
	)
	public static String method469(String var0) {
		return var0 != null && !var0.isEmpty() && var0.charAt(0) != '#' ? var0 : ""; // L: 170 171
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILch;ZB)I",
		garbageValue = "14"
	)
	static int method474(int var0, Script var1, boolean var2) {
		int var4 = -1; // L: 616
		Widget var3;
		if (var0 >= 2000) { // L: 617
			var0 -= 1000; // L: 618
			var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 619
			var3 = class165.getWidget(var4); // L: 620
		} else {
			var3 = var2 ? SoundSystem.scriptDotWidget : class1.field5; // L: 622
		}

		int var13;
		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) { // L: 623
			Interpreter.Interpreter_intStackSize -= 2; // L: 624
			var13 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 625
			int var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 626
			if (var3.type == 12) { // L: 627
				class314 var7 = var3.method6392(); // L: 628
				if (var7 != null && var7.method6096(var13, var9)) { // L: 629
					class144.invalidateWidget(var3); // L: 630
				}
			} else {
				var3.scrollX = var13; // L: 634
				if (var3.scrollX > var3.scrollWidth - var3.width) { // L: 635
					var3.scrollX = var3.scrollWidth - var3.width;
				}

				if (var3.scrollX < 0) { // L: 636
					var3.scrollX = 0;
				}

				var3.scrollY = var9; // L: 637
				if (var3.scrollY > var3.scrollHeight - var3.height) { // L: 638
					var3.scrollY = var3.scrollHeight - var3.height;
				}

				if (var3.scrollY < 0) { // L: 639
					var3.scrollY = 0;
				}

				class144.invalidateWidget(var3); // L: 640
			}

			return 1; // L: 642
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) {
			var3.color = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 645
			class144.invalidateWidget(var3); // L: 646
			return 1; // L: 647
		} else if (var0 == ScriptOpcodes.CC_SETFILL) {
			var3.fill = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 650
			class144.invalidateWidget(var3); // L: 651
			return 1; // L: 652
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) {
			var3.transparencyTop = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 655
			class144.invalidateWidget(var3); // L: 656
			return 1; // L: 657
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) {
			var3.lineWid = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 660
			class144.invalidateWidget(var3); // L: 661
			return 1; // L: 662
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) {
			var3.spriteId2 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 665
			class144.invalidateWidget(var3); // L: 666
			return 1; // L: 667
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) {
			var3.spriteAngle = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 670
			class144.invalidateWidget(var3); // L: 671
			return 1; // L: 672
		} else if (var0 == ScriptOpcodes.CC_SETTILING) {
			var3.spriteTiling = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 675
			class144.invalidateWidget(var3); // L: 676
			return 1; // L: 677
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) {
			var3.modelType = 1; // L: 680
			var3.modelId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 681
			class144.invalidateWidget(var3); // L: 682
			return 1; // L: 683
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) {
			Interpreter.Interpreter_intStackSize -= 6; // L: 686
			var3.modelOffsetX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 687
			var3.modelOffsetY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 688
			var3.modelAngleX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 689
			var3.modelAngleY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 690
			var3.modelAngleZ = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 4]; // L: 691
			var3.modelZoom = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 5]; // L: 692
			class144.invalidateWidget(var3); // L: 693
			return 1; // L: 694
		} else if (var0 == ScriptOpcodes.CC_SETMODELANIM) {
			var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 697
			if (var13 != var3.sequenceId) { // L: 698
				var3.sequenceId = var13; // L: 699
				var3.modelFrame = 0; // L: 700
				var3.modelFrameCycle = 0; // L: 701
				class144.invalidateWidget(var3); // L: 702
			}

			return 1; // L: 704
		} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) {
			var3.modelOrthog = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 707
			class144.invalidateWidget(var3); // L: 708
			return 1; // L: 709
		} else if (var0 == ScriptOpcodes.CC_SETTEXT) {
			String var14 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize]; // L: 712
			if (!var14.equals(var3.text)) { // L: 713
				var3.text = var14; // L: 714
				class144.invalidateWidget(var3); // L: 715
			}

			return 1; // L: 717
		} else {
			class314 var10;
			if (var0 == ScriptOpcodes.CC_SETTEXTFONT) {
				var3.fontId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 720
				if (var3.type == 12) { // L: 721
					var10 = var3.method6392(); // L: 722
					if (var10 != null) { // L: 723
						var10.method6215(); // L: 724
					}
				}

				class144.invalidateWidget(var3); // L: 727
				return 1; // L: 728
			} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) {
				Interpreter.Interpreter_intStackSize -= 3; // L: 731
				if (var3.type == 12) { // L: 732
					var10 = var3.method6392(); // L: 733
					if (var10 != null) { // L: 734
						var10.method6097(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 735
						var10.method6098(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]); // L: 736
					}
				} else {
					var3.textXAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 740
					var3.textYAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 741
					var3.textLineHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 742
				}

				class144.invalidateWidget(var3); // L: 744
				return 1; // L: 745
			} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) {
				var3.textShadowed = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 748
				class144.invalidateWidget(var3); // L: 749
				return 1; // L: 750
			} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) {
				var3.outline = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 753
				class144.invalidateWidget(var3); // L: 754
				return 1; // L: 755
			} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) {
				var3.spriteShadow = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 758
				class144.invalidateWidget(var3); // L: 759
				return 1; // L: 760
			} else if (var0 == ScriptOpcodes.CC_SETVFLIP) {
				var3.spriteFlipV = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 763
				class144.invalidateWidget(var3); // L: 764
				return 1; // L: 765
			} else if (var0 == ScriptOpcodes.CC_SETHFLIP) {
				var3.spriteFlipH = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 768
				class144.invalidateWidget(var3); // L: 769
				return 1; // L: 770
			} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) {
				Interpreter.Interpreter_intStackSize -= 2; // L: 773
				var3.scrollWidth = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 774
				var3.scrollHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 775
				class144.invalidateWidget(var3); // L: 776
				if (var4 != -1 && var3.type == 0) { // L: 777
					DecorativeObject.revalidateWidgetScroll(VerticalAlignment.Widget_interfaceComponents[var4 >> 16], var3, false);
				}

				return 1; // L: 778
			} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) {
				class81.resumePauseWidget(var3.id, var3.childIndex); // L: 781
				Client.meslayerContinueWidget = var3; // L: 782
				class144.invalidateWidget(var3); // L: 783
				return 1; // L: 784
			} else if (var0 == 1122) {
				var3.spriteId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 787
				class144.invalidateWidget(var3); // L: 788
				return 1; // L: 789
			} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) {
				var3.color2 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 792
				class144.invalidateWidget(var3); // L: 793
				return 1; // L: 794
			} else if (var0 == 1124) {
				var3.transparencyBot = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 797
				class144.invalidateWidget(var3); // L: 798
				return 1; // L: 799
			} else if (var0 == 1125) {
				var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 802
				class500 var11 = (class500)StructComposition.findEnumerated(GrandExchangeOffer.FillMode_values(), var13); // L: 803
				if (var11 != null) { // L: 804
					var3.fillMode = var11; // L: 805
					class144.invalidateWidget(var3); // L: 806
				}

				return 1; // L: 808
			} else {
				boolean var8;
				if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) {
					var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 811
					var3.field3603 = var8; // L: 812
					return 1; // L: 813
				} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) {
					var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 816
					var3.modelTransparency = var8; // L: 817
					return 1; // L: 818
				} else if (var0 == 1129) {
					var3.field3606 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize]; // L: 821
					class144.invalidateWidget(var3); // L: 822
					return 1; // L: 823
				} else if (var0 == 1130) {
					var3.method6376(Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize], class14.urlRequester, Projectile.method2111()); // L: 826
					return 1; // L: 827
				} else if (var0 == 1131) {
					Interpreter.Interpreter_intStackSize -= 2; // L: 830
					var3.swapItems(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 831
					return 1; // L: 832
				} else if (var0 == 1132) {
					var3.method6380(Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize], Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 835
					return 1; // L: 836
				} else {
					class309 var12;
					if (var0 == 1133) {
						--Interpreter.Interpreter_intStackSize; // L: 839
						var12 = var3.method6394(); // L: 840
						if (var12 != null) { // L: 841
							var12.field3493 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 842
							class144.invalidateWidget(var3); // L: 843
						}

						return 1; // L: 845
					} else if (var0 == 1134) {
						--Interpreter.Interpreter_intStackSize; // L: 848
						var12 = var3.method6394(); // L: 849
						if (var12 != null) { // L: 850
							var12.field3489 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 851
							class144.invalidateWidget(var3); // L: 852
						}

						return 1; // L: 854
					} else if (var0 == 1135) {
						--SecureRandomCallable.Interpreter_stringStackSize; // L: 857
						var10 = var3.method6392(); // L: 858
						if (var10 != null) { // L: 859
							var3.field3633 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize]; // L: 860
						}

						return 1; // L: 862
					} else if (var0 == 1136) {
						--Interpreter.Interpreter_intStackSize; // L: 865
						var12 = var3.method6394(); // L: 866
						if (var12 != null) { // L: 867
							var12.field3491 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 868
							class144.invalidateWidget(var3); // L: 869
						}

						return 1; // L: 871
					} else if (var0 == 1137) {
						--Interpreter.Interpreter_intStackSize; // L: 874
						var10 = var3.method6392(); // L: 875
						if (var10 != null && var10.method6093(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) { // L: 876
							class144.invalidateWidget(var3); // L: 877
						}

						return 1; // L: 879
					} else if (var0 == 1138) {
						--Interpreter.Interpreter_intStackSize; // L: 882
						var10 = var3.method6392(); // L: 883
						if (var10 != null && var10.method6336(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) { // L: 884
							class144.invalidateWidget(var3); // L: 885
						}

						return 1; // L: 887
					} else if (var0 == 1139) {
						--Interpreter.Interpreter_intStackSize; // L: 890
						var10 = var3.method6392(); // L: 891
						if (var10 != null && var10.method6095(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) { // L: 892
							class144.invalidateWidget(var3); // L: 893
						}

						return 1; // L: 895
					} else {
						class314 var6;
						if (var0 == 1140) {
							var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 898
							Client.field722.method4181(); // L: 899
							var6 = var3.method6392(); // L: 900
							if (var6 != null && var6.method6087(var8)) { // L: 901
								if (var8) { // L: 902
									Client.field722.method4179(var3); // L: 903
								}

								class144.invalidateWidget(var3); // L: 905
							}

							return 1; // L: 907
						} else if (var0 == 1141) {
							var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 910
							if (!var8 && Client.field722.method4202() == var3) { // L: 911
								Client.field722.method4181(); // L: 912
								class144.invalidateWidget(var3); // L: 913
							}

							var6 = var3.method6392(); // L: 915
							if (var6 != null) { // L: 916
								var6.method6088(var8); // L: 917
							}

							return 1; // L: 919
						} else if (var0 == 1142) {
							Interpreter.Interpreter_intStackSize -= 2; // L: 922
							var10 = var3.method6392(); // L: 923
							if (var10 != null && var10.method6111(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1])) { // L: 924
								class144.invalidateWidget(var3); // L: 925
							}

							return 1; // L: 927
						} else if (var0 == 1143) {
							--Interpreter.Interpreter_intStackSize; // L: 930
							var10 = var3.method6392(); // L: 931
							if (var10 != null && var10.method6111(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) { // L: 932
								class144.invalidateWidget(var3); // L: 933
							}

							return 1; // L: 935
						} else if (var0 == 1144) {
							--Interpreter.Interpreter_intStackSize; // L: 938
							var10 = var3.method6392(); // L: 939
							if (var10 != null) { // L: 940
								var10.method6100(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]); // L: 941
								class144.invalidateWidget(var3); // L: 942
							}

							return 1; // L: 944
						} else if (var0 == 1145) {
							--Interpreter.Interpreter_intStackSize; // L: 947
							var10 = var3.method6392(); // L: 948
							if (var10 != null) { // L: 949
								var10.method6086(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]); // L: 950
							}

							return 1; // L: 952
						} else if (var0 == 1146) {
							--Interpreter.Interpreter_intStackSize; // L: 955
							var10 = var3.method6392(); // L: 956
							if (var10 != null) { // L: 957
								var10.method6102(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]); // L: 958
							}

							return 1; // L: 960
						} else if (var0 == 1147) {
							--Interpreter.Interpreter_intStackSize; // L: 963
							var10 = var3.method6392(); // L: 964
							if (var10 != null) { // L: 965
								var10.method6101(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]); // L: 966
								class144.invalidateWidget(var3); // L: 967
							}

							return 1; // L: 969
						} else {
							class27 var5;
							if (var0 == 1148) {
								Interpreter.Interpreter_intStackSize -= 2; // L: 972
								var5 = var3.method6367(); // L: 973
								if (var5 != null) { // L: 974
									var5.method407(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 975
								}

								return 1; // L: 977
							} else if (var0 == 1149) {
								Interpreter.Interpreter_intStackSize -= 2; // L: 980
								var5 = var3.method6367(); // L: 981
								if (var5 != null) { // L: 982
									var5.method408((char)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 983
								}

								return 1; // L: 985
							} else if (var0 == 1150) {
								var3.method6375(Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize], class14.urlRequester); // L: 988
								return 1; // L: 989
							} else {
								return 2; // L: 991
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILch;ZB)I",
		garbageValue = "57"
	)
	static int method471(int var0, Script var1, boolean var2) {
		Widget var3 = class165.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1628
		if (var0 == ScriptOpcodes.IF_GETX) { // L: 1629
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.x; // L: 1630
			return 1; // L: 1631
		} else if (var0 == ScriptOpcodes.IF_GETY) { // L: 1633
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.y; // L: 1634
			return 1; // L: 1635
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) { // L: 1637
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.width; // L: 1638
			return 1; // L: 1639
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) { // L: 1641
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.height; // L: 1642
			return 1; // L: 1643
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) { // L: 1645
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1646
			return 1; // L: 1647
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) { // L: 1649
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.parentId; // L: 1650
			return 1; // L: 1651
		} else {
			return 2; // L: 1653
		}
	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1613801130"
	)
	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close(); // L: 2720
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear(); // L: 2723
		class294.method5724(); // L: 2725
		class4.method19(); // L: 2726
		class14.method188(); // L: 2727
		class173.method3589(); // L: 2728
		class379.method7393(); // L: 2729
		SequenceDefinition.SequenceDefinition_cached.clear(); // L: 2731
		SequenceDefinition.SequenceDefinition_cachedFrames.clear(); // L: 2732
		SequenceDefinition.SequenceDefinition_cachedModel.clear(); // L: 2733
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear(); // L: 2736
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear(); // L: 2737
		VarbitComposition.VarbitDefinition_cached.clear(); // L: 2740
		VarpDefinition.VarpDefinition_cached.clear(); // L: 2743
		class160.HitSplatDefinition_cachedSprites.method8823(); // L: 2745
		MenuAction.Ignored_cached.method8823(); // L: 2746
		class432.method8317(); // L: 2747
		GrandExchangeEvent.method6857(); // L: 2748
		InterfaceParent.method2252(); // L: 2749
		class165.method3473(); // L: 2750
		Strings.method6602(); // L: 2751
		class383.method7542(); // L: 2752
		class483.DBRowType_cache.clear(); // L: 2754
		Client.Widget_cachedModels.clear(); // L: 2756
		Client.Widget_cachedFonts.clear(); // L: 2757
		GrandExchangeOfferTotalQuantityComparator.method6811(); // L: 2758
		class18.method288(); // L: 2759
		((TextureProvider)Rasterizer3D.field2514.Rasterizer3D_textureLoader).clear(); // L: 2760
		Script.Script_cached.clear(); // L: 2761
		Client.archive5.method7719(); // L: 2762
		DevicePcmPlayerProvider.field117.clearFiles(); // L: 2763
		GameBuild.field3803.clearFiles(); // L: 2764
		class85.archive7.clearFiles(); // L: 2765
		class426.archive4.clearFiles(); // L: 2766
		GrandExchangeOfferTotalQuantityComparator.archive9.clearFiles(); // L: 2767
		class399.archive6.clearFiles(); // L: 2768
		FloorUnderlayDefinition.archive11.clearFiles(); // L: 2769
		class452.archive8.clearFiles(); // L: 2770
		WorldMapLabelSize.field2868.clearFiles(); // L: 2771
		NetFileRequest.archive10.clearFiles(); // L: 2772
		class195.field2101.clearFiles(); // L: 2773
		class126.archive12.clearFiles(); // L: 2774
		PcmPlayer.field316.clearFiles(); // L: 2775
		scene.clear(); // L: 2777

		for (int var0 = 0; var0 < 4; ++var0) { // L: 2778
			Client.collisionMaps[var0].clear();
		}

		Client.field722.method4181(); // L: 2779
		System.gc(); // L: 2780
		class297.musicPlayerStatus = 1; // L: 2782
		class297.musicTrackArchive = null; // L: 2783
		class379.musicTrackGroupId = -1; // L: 2784
		VarpDefinition.musicTrackFileId = -1; // L: 2785
		class100.musicTrackVolume = 0; // L: 2786
		class120.musicTrackBoolean = false; // L: 2787
		class162.pcmSampleLength = 2; // L: 2788
		Client.currentTrackGroupId = -1; // L: 2790
		Client.playingJingle = false; // L: 2791
		StructComposition.method3926(); // L: 2792
		class138.method3208(10); // L: 2793
	} // L: 2794
}
