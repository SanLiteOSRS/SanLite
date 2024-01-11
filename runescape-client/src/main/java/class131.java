import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fx")
public class class131 {
	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "[Lut;"
	)
	@Export("worldSelectFlagSprites")
	static IndexedSprite[] worldSelectFlagSprites;
	@ObfuscatedName("am")
	boolean field1541;
	@ObfuscatedName("ap")
	boolean field1527;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lek;"
	)
	class129 field1539;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lek;"
	)
	class129 field1530;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Lei;"
	)
	class126[] field1545;
	@ObfuscatedName("ar")
	boolean field1532;
	@ObfuscatedName("ag")
	float field1533;
	@ObfuscatedName("ao")
	float field1534;
	@ObfuscatedName("ae")
	float field1535;
	@ObfuscatedName("aa")
	float field1540;
	@ObfuscatedName("au")
	float field1546;
	@ObfuscatedName("an")
	float field1538;
	@ObfuscatedName("ad")
	float field1537;
	@ObfuscatedName("ax")
	float field1531;
	@ObfuscatedName("aw")
	float field1529;
	@ObfuscatedName("az")
	float field1542;
	@ObfuscatedName("av")
	boolean field1543;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1042030441
	)
	int field1544;
	@ObfuscatedName("ay")
	float[] field1528;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1017319781
	)
	int field1536;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 939425181
	)
	int field1547;
	@ObfuscatedName("ah")
	float field1548;
	@ObfuscatedName("ai")
	float field1549;

	class131() {
		this.field1543 = true; // L: 24
		this.field1544 = 0; // L: 25
	} // L: 32

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Luk;II)I",
		garbageValue = "1608855587"
	)
	int method3083(Buffer var1, int var2) {
		int var3 = var1.readUnsignedShort(); // L: 35
		int var4 = var1.readUnsignedByte(); // L: 36
		class139 var5 = (class139)GrandExchangeEvents.findEnumerated(class169.method3551(), var4); // L: 38
		if (var5 == null) { // L: 39
			var5 = class139.field1615;
		}

		this.field1539 = class12.method169(var1.readUnsignedByte()); // L: 41
		this.field1530 = class12.method169(var1.readUnsignedByte()); // L: 42
		this.field1541 = var1.readUnsignedByte() != 0; // L: 43
		this.field1545 = new class126[var3]; // L: 44
		class126 var8 = null; // L: 45

		for (int var6 = 0; var6 < var3; ++var6) { // L: 46
			class126 var7 = new class126(); // L: 47
			var7.method3009(var1, var2); // L: 48
			this.field1545[var6] = var7; // L: 49
			if (var8 != null) { // L: 50
				var8.field1485 = var7; // L: 51
			}

			var8 = var7; // L: 53
		}

		return var3; // L: 55
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	void method3085() {
		this.field1536 = this.field1545[0].field1483; // L: 59
		this.field1547 = this.field1545[this.method3088() - 1].field1483; // L: 60
		this.field1528 = new float[this.method3089() + 1]; // L: 62

		for (int var1 = this.method3111(); var1 <= this.method3112(); ++var1) { // L: 63
			this.field1528[var1 - this.method3111()] = class155.method3423(this, (float)var1); // L: 64
		}

		this.field1545 = null; // L: 66
		this.field1548 = class155.method3423(this, (float)(this.method3111() - 1)); // L: 68
		this.field1549 = class155.method3423(this, (float)(this.method3112() + 1)); // L: 69
	} // L: 70

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "763849285"
	)
	public float method3086(int var1) {
		if (var1 < this.method3111()) { // L: 74
			return this.field1548; // L: 75
		} else {
			return var1 > this.method3112() ? this.field1549 : this.field1528[var1 - this.method3111()]; // L: 77 78 80
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "780354422"
	)
	int method3111() {
		return this.field1536; // L: 85
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "37011230"
	)
	int method3112() {
		return this.field1547; // L: 89
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1038677469"
	)
	int method3089() {
		return this.method3112() - this.method3111(); // L: 93
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(FB)I",
		garbageValue = "-11"
	)
	int method3090(float var1) {
		if (this.field1544 < 0 || (float)this.field1545[this.field1544].field1483 > var1 || this.field1545[this.field1544].field1485 != null && (float)this.field1545[this.field1544].field1485.field1483 <= var1) { // L: 97
			if (var1 >= (float)this.method3111() && var1 <= (float)this.method3112()) { // L: 100
				int var2 = this.method3088(); // L: 103
				int var3 = this.field1544; // L: 104
				if (var2 > 0) { // L: 105
					int var4 = 0; // L: 106
					int var5 = var2 - 1; // L: 107

					do {
						int var6 = var5 + var4 >> 1; // L: 109
						if (var1 < (float)this.field1545[var6].field1483) { // L: 110
							if (var1 > (float)this.field1545[var6 - 1].field1483) { // L: 111
								var3 = var6 - 1; // L: 112
								break;
							}

							var5 = var6 - 1; // L: 116
						} else {
							if (var1 <= (float)this.field1545[var6].field1483) { // L: 119
								var3 = var6; // L: 129
								break; // L: 130
							}

							if (var1 < (float)this.field1545[var6 + 1].field1483) { // L: 120
								var3 = var6; // L: 121
								break; // L: 122
							}

							var4 = var6 + 1; // L: 125
						}
					} while(var4 <= var5); // L: 132
				}

				if (var3 != this.field1544) { // L: 134
					this.field1544 = var3; // L: 135
					this.field1543 = true; // L: 136
				}

				return this.field1544; // L: 138
			} else {
				return -1; // L: 101
			}
		} else {
			return this.field1544; // L: 98
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(FB)Lei;",
		garbageValue = "-103"
	)
	class126 method3091(float var1) {
		int var2 = this.method3090(var1); // L: 142
		return var2 >= 0 && var2 < this.field1545.length ? this.field1545[var2] : null; // L: 143 144 147
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2052429363"
	)
	int method3088() {
		return this.field1545 == null ? 0 : this.field1545.length; // L: 152 153
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "1461307275"
	)
	static int method3092(int var0, Script var1, boolean var2) {
		int var4 = -1; // L: 625
		Widget var3;
		if (var0 >= 2000) { // L: 626
			var0 -= 1000; // L: 627
			var4 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 628
			var3 = class380.field4414.method6348(var4); // L: 629
		} else {
			var3 = var2 ? class31.scriptDotWidget : class185.field1932; // L: 631
		}

		int var16;
		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) { // L: 632
			UserComparator6.Interpreter_intStackSize -= 2; // L: 633
			var16 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 634
			int var14 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 635
			if (var3.type == 12) { // L: 636
				class344 var17 = var3.method6700(); // L: 637
				if (var17 != null && var17.method6426(var16, var14)) { // L: 638
					FaceNormal.invalidateWidget(var3); // L: 639
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

				FaceNormal.invalidateWidget(var3); // L: 649
			}

			return 1; // L: 651
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) {
			var3.color = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 654
			FaceNormal.invalidateWidget(var3); // L: 655
			return 1; // L: 656
		} else if (var0 == ScriptOpcodes.CC_SETFILL) {
			var3.fill = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 659
			FaceNormal.invalidateWidget(var3); // L: 660
			return 1; // L: 661
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) {
			var3.transparencyTop = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 664
			FaceNormal.invalidateWidget(var3); // L: 665
			return 1; // L: 666
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) {
			var3.lineWid = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 669
			FaceNormal.invalidateWidget(var3); // L: 670
			return 1; // L: 671
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) {
			var3.spriteId2 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 674
			FaceNormal.invalidateWidget(var3); // L: 675
			return 1; // L: 676
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) {
			var3.spriteAngle = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 679
			FaceNormal.invalidateWidget(var3); // L: 680
			return 1; // L: 681
		} else if (var0 == ScriptOpcodes.CC_SETTILING) {
			var3.spriteTiling = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 684
			FaceNormal.invalidateWidget(var3); // L: 685
			return 1; // L: 686
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) {
			var3.modelType = 1; // L: 689
			var3.modelId = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 690
			FaceNormal.invalidateWidget(var3); // L: 691
			return 1; // L: 692
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) {
			UserComparator6.Interpreter_intStackSize -= 6; // L: 695
			var3.modelOffsetX = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 696
			var3.modelOffsetY = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 697
			var3.modelAngleX = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 2]; // L: 698
			var3.modelAngleY = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 3]; // L: 699
			var3.modelAngleZ = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 4]; // L: 700
			var3.modelZoom = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 5]; // L: 701
			FaceNormal.invalidateWidget(var3); // L: 702
			return 1; // L: 703
		} else if (var0 == ScriptOpcodes.CC_SETMODELANIM) {
			var16 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 706
			if (var16 != var3.sequenceId) { // L: 707
				var3.sequenceId = var16; // L: 708
				var3.modelFrame = 0; // L: 709
				var3.modelFrameCycle = 0; // L: 710
				FaceNormal.invalidateWidget(var3); // L: 711
			}

			return 1; // L: 713
		} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) {
			var3.modelOrthog = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 716
			FaceNormal.invalidateWidget(var3); // L: 717
			return 1; // L: 718
		} else {
			class344 var6;
			String var13;
			if (var0 != ScriptOpcodes.CC_SETTEXT) {
				class344 var20;
				if (var0 == ScriptOpcodes.CC_SETTEXTFONT) {
					var3.fontId = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 739
					if (var3.type == 12) { // L: 740
						var20 = var3.method6700(); // L: 741
						if (var20 != null) { // L: 742
							var20.method6433(); // L: 743
						}
					}

					FaceNormal.invalidateWidget(var3); // L: 746
					return 1; // L: 747
				} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) {
					UserComparator6.Interpreter_intStackSize -= 3; // L: 750
					if (var3.type == 12) { // L: 751
						var20 = var3.method6700(); // L: 752
						if (var20 != null) { // L: 753
							var20.method6435(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize], Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]); // L: 754
							var20.method6428(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 2]); // L: 755
						}
					} else {
						var3.textXAlignment = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 759
						var3.textYAlignment = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 760
						var3.textLineHeight = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 2]; // L: 761
					}

					FaceNormal.invalidateWidget(var3); // L: 763
					return 1; // L: 764
				} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) {
					var3.textShadowed = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 767
					FaceNormal.invalidateWidget(var3); // L: 768
					return 1; // L: 769
				} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) {
					var3.outline = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 772
					FaceNormal.invalidateWidget(var3); // L: 773
					return 1; // L: 774
				} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) {
					var3.spriteShadow = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 777
					FaceNormal.invalidateWidget(var3); // L: 778
					return 1; // L: 779
				} else if (var0 == ScriptOpcodes.CC_SETVFLIP) {
					var3.spriteFlipV = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 782
					FaceNormal.invalidateWidget(var3); // L: 783
					return 1; // L: 784
				} else if (var0 == ScriptOpcodes.CC_SETHFLIP) {
					var3.spriteFlipH = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 787
					FaceNormal.invalidateWidget(var3); // L: 788
					return 1; // L: 789
				} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) {
					UserComparator6.Interpreter_intStackSize -= 2; // L: 792
					var3.scrollWidth = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 793
					var3.scrollHeight = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 794
					FaceNormal.invalidateWidget(var3); // L: 795
					if (var4 != -1 && var3.type == 0) { // L: 796
						class16.revalidateWidgetScroll(class380.field4414.field3610[var4 >> 16], var3, false);
					}

					return 1; // L: 797
				} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) {
					Occluder.resumePauseWidget(var3.id, var3.childIndex); // L: 800
					Client.meslayerContinueWidget = var3; // L: 801
					FaceNormal.invalidateWidget(var3); // L: 802
					return 1; // L: 803
				} else if (var0 == 1122) {
					var3.spriteId = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 806
					FaceNormal.invalidateWidget(var3); // L: 807
					return 1; // L: 808
				} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) {
					var3.color2 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 811
					FaceNormal.invalidateWidget(var3); // L: 812
					return 1; // L: 813
				} else if (var0 == 1124) {
					var3.transparencyBot = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 816
					FaceNormal.invalidateWidget(var3); // L: 817
					return 1; // L: 818
				} else if (var0 == 1125) {
					var16 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 821
					class542 var18 = (class542)GrandExchangeEvents.findEnumerated(class171.FillMode_values(), var16); // L: 822
					if (var18 != null) { // L: 823
						var3.fillMode = var18; // L: 824
						FaceNormal.invalidateWidget(var3); // L: 825
					}

					return 1; // L: 827
				} else {
					boolean var5;
					if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) {
						var5 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 830
						var3.field3735 = var5; // L: 831
						return 1; // L: 832
					} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) {
						var5 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 835
						var3.modelTransparency = var5; // L: 836
						return 1; // L: 837
					} else if (var0 == 1129) {
						var3.field3728 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize]; // L: 840
						FaceNormal.invalidateWidget(var3); // L: 841
						return 1; // L: 842
					} else if (var0 == 1130) {
						var3.method6704(Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize], "", class113.urlRequester, WorldMapSprite.method5024()); // L: 845
						return 1; // L: 846
					} else if (var0 == 1131) {
						UserComparator6.Interpreter_intStackSize -= 2; // L: 849
						var3.swapItems(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize], Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]); // L: 850
						return 1; // L: 851
					} else if (var0 == 1132) {
						var3.method6709(Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize], Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]); // L: 854
						return 1; // L: 855
					} else {
						class339 var21;
						if (var0 == 1133) {
							--UserComparator6.Interpreter_intStackSize; // L: 858
							var21 = var3.method6729(); // L: 859
							if (var21 != null) { // L: 860
								var21.field3623 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 861
								FaceNormal.invalidateWidget(var3); // L: 862
							}

							return 1; // L: 864
						} else if (var0 == 1134) {
							--UserComparator6.Interpreter_intStackSize; // L: 867
							var21 = var3.method6729(); // L: 868
							if (var21 != null) { // L: 869
								var21.field3619 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 870
								FaceNormal.invalidateWidget(var3); // L: 871
							}

							return 1; // L: 873
						} else if (var0 == 1135) {
							--class211.Interpreter_stringStackSize; // L: 876
							var20 = var3.method6700(); // L: 877
							if (var20 != null) { // L: 878
								var3.field3752 = Interpreter.Interpreter_stringStack[class211.Interpreter_stringStackSize]; // L: 879
							}

							return 1; // L: 881
						} else if (var0 == 1136) {
							--UserComparator6.Interpreter_intStackSize; // L: 884
							var21 = var3.method6729(); // L: 885
							if (var21 != null) { // L: 886
								var21.field3620 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 887
								FaceNormal.invalidateWidget(var3); // L: 888
							}

							return 1; // L: 890
						} else if (var0 == 1137) {
							--UserComparator6.Interpreter_intStackSize; // L: 893
							var20 = var3.method6700(); // L: 894
							if (var20 != null && var20.method6423(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize])) { // L: 895
								FaceNormal.invalidateWidget(var3); // L: 896
							}

							return 1; // L: 898
						} else if (var0 == 1138) {
							--UserComparator6.Interpreter_intStackSize; // L: 901
							var20 = var3.method6700(); // L: 902
							if (var20 != null && var20.method6424(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize])) { // L: 903
								FaceNormal.invalidateWidget(var3); // L: 904
							}

							return 1; // L: 906
						} else if (var0 == 1139) {
							--UserComparator6.Interpreter_intStackSize; // L: 909
							var20 = var3.method6700(); // L: 910
							if (var20 != null && var20.method6425(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize])) { // L: 911
								FaceNormal.invalidateWidget(var3); // L: 912
							}

							return 1; // L: 914
						} else if (var0 == 1140) {
							var5 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 917
							Client.field608.method4407(); // L: 918
							var6 = var3.method6700(); // L: 919
							if (var6 != null && var6.method6475(var5)) { // L: 920
								if (var5) { // L: 921
									Client.field608.method4391(var3); // L: 922
								}

								FaceNormal.invalidateWidget(var3); // L: 924
							}

							return 1; // L: 926
						} else if (var0 == 1141) {
							var5 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 929
							if (!var5 && Client.field608.method4392() == var3) { // L: 930
								Client.field608.method4407(); // L: 931
								FaceNormal.invalidateWidget(var3); // L: 932
							}

							var6 = var3.method6700(); // L: 934
							if (var6 != null) { // L: 935
								var6.method6418(var5); // L: 936
							}

							return 1; // L: 938
						} else if (var0 == 1142) {
							UserComparator6.Interpreter_intStackSize -= 2; // L: 941
							var20 = var3.method6700(); // L: 942
							if (var20 != null && var20.method6441(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize], Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1])) { // L: 943
								FaceNormal.invalidateWidget(var3); // L: 944
							}

							return 1; // L: 946
						} else if (var0 == 1143) {
							--UserComparator6.Interpreter_intStackSize; // L: 949
							var20 = var3.method6700(); // L: 950
							if (var20 != null && var20.method6441(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize], Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize])) { // L: 951
								FaceNormal.invalidateWidget(var3); // L: 952
							}

							return 1; // L: 954
						} else if (var0 == 1144) {
							--UserComparator6.Interpreter_intStackSize; // L: 957
							var20 = var3.method6700(); // L: 958
							if (var20 != null) { // L: 959
								var20.method6446(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]); // L: 960
								FaceNormal.invalidateWidget(var3); // L: 961
							}

							return 1; // L: 963
						} else if (var0 == 1145) {
							--UserComparator6.Interpreter_intStackSize; // L: 966
							var20 = var3.method6700(); // L: 967
							if (var20 != null) { // L: 968
								var20.method6429(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]); // L: 969
							}

							return 1; // L: 971
						} else if (var0 == 1146) {
							--UserComparator6.Interpreter_intStackSize; // L: 974
							var20 = var3.method6700(); // L: 975
							if (var20 != null) { // L: 976
								var20.method6432(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]); // L: 977
							}

							return 1; // L: 979
						} else if (var0 == 1147) {
							--UserComparator6.Interpreter_intStackSize; // L: 982
							var20 = var3.method6700(); // L: 983
							if (var20 != null) { // L: 984
								var20.method6431(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]); // L: 985
								FaceNormal.invalidateWidget(var3); // L: 986
							}

							return 1; // L: 988
						} else {
							class27 var19;
							if (var0 == 1148) {
								UserComparator6.Interpreter_intStackSize -= 2; // L: 991
								var19 = var3.method6724(); // L: 992
								if (var19 != null) { // L: 993
									var19.method427(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize], Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]); // L: 994
								}

								return 1; // L: 996
							} else if (var0 == 1149) {
								UserComparator6.Interpreter_intStackSize -= 2; // L: 999
								var19 = var3.method6724(); // L: 1000
								if (var19 != null) { // L: 1001
									var19.method393((char)Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize], Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]); // L: 1002
								}

								return 1; // L: 1004
							} else if (var0 == 1150) {
								var3.method6768(Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize], class113.urlRequester); // L: 1007
								return 1; // L: 1008
							} else if (var0 == 1151) {
								class211.Interpreter_stringStackSize -= 3; // L: 1011
								var13 = Interpreter.Interpreter_stringStack[class211.Interpreter_stringStackSize]; // L: 1012
								String var15 = Interpreter.Interpreter_stringStack[class211.Interpreter_stringStackSize + 1]; // L: 1013
								String var7 = Interpreter.Interpreter_stringStack[class211.Interpreter_stringStackSize + 2]; // L: 1014
								long var8 = WorldMapSprite.method5024(); // L: 1015
								long var10 = class226.method4462(); // L: 1016
								String var12 = class72.method2142().method8776(class72.method2142().field4926); // L: 1017
								if (-1L != var8) { // L: 1018
									var13 = var13.replaceAll("%userid%", Long.toString(var8)); // L: 1019
								}

								if (var10 != -1L) { // L: 1021
									var13 = var13.replaceAll("%userhash%", Long.toString(var10)); // L: 1022
								}

								if (!var12.isEmpty()) { // L: 1024
									var13 = var13.replaceAll("%deviceid%", var12); // L: 1025
								}

								var3.method6705(var13, var15, var7, var12, Long.toString(var10), class113.urlRequester); // L: 1027
								return 1; // L: 1028
							} else if (var0 == 1152) {
								if (var3.type == 11) { // L: 1031
									var5 = KitDefinition.method3664().method4308(var3.method6718().method4154()); // L: 1032
									Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var5 ? 1 : 0; // L: 1033
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
				var13 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize]; // L: 721
				if (var3.type == 12) { // L: 722
					var6 = var3.method6700(); // L: 723
					if (var6 != null && var6.method6472()) { // L: 724
						var6.method6639(var13); // L: 725
					} else {
						var3.text = var13; // L: 728
					}

					FaceNormal.invalidateWidget(var3); // L: 730
				} else if (!var13.equals(var3.text)) { // L: 732
					var3.text = var13; // L: 733
					FaceNormal.invalidateWidget(var3); // L: 734
				}

				return 1; // L: 736
			}
		}
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-37"
	)
	static void method3087(int var0) {
		if (var0 != Client.gameState) { // L: 1322
			if (Client.gameState == 30) { // L: 1323
				Client.field608.method4407(); // L: 1324
			}

			if (Client.gameState == 0) { // L: 1326
				VertexNormal.client.method557();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) { // L: 1327
				UrlRequest.method2930(0); // L: 1328
				Client.field533 = 0; // L: 1329
				Client.field534 = 0; // L: 1330
				Client.timer.method8041(var0); // L: 1331
				if (var0 != 20) { // L: 1332
					ParamComposition.method3870(false);
				}
			}

			if (var0 != 20 && var0 != 40 && PlayerType.field4298 != null) { // L: 1334 1335
				PlayerType.field4298.close(); // L: 1336
				PlayerType.field4298 = null; // L: 1337
			}

			if (Client.gameState == 25) { // L: 1340
				Client.field568 = 0; // L: 1341
				Client.field566 = 0; // L: 1342
				Client.field567 = 1; // L: 1343
				Client.field555 = 0; // L: 1344
				Client.field569 = 1; // L: 1345
			}

			int var1;
			if (var0 != 5 && var0 != 10) { // L: 1347
				if (var0 == 20) { // L: 1351
					var1 = Client.gameState == 11 ? 4 : 0; // L: 1352
					class124.method3004(class189.field1995, class19.field94, false, var1); // L: 1353
				} else if (var0 == 11) { // L: 1355
					class124.method3004(class189.field1995, class19.field94, false, 4); // L: 1356
				} else if (var0 == 50) { // L: 1358
					class142.setLoginResponseString("", "Updating date of birth...", ""); // L: 1359
					class124.method3004(class189.field1995, class19.field94, false, 7); // L: 1360
				} else {
					class47.method913(); // L: 1362
				}
			} else {
				var1 = GrandExchangeOfferUnitPriceComparator.method7241() ? 0 : 12; // L: 1348
				class124.method3004(class189.field1995, class19.field94, true, var1); // L: 1349
			}

			Client.gameState = var0; // L: 1363
		}
	} // L: 1364

	@ObfuscatedName("mg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1788330842"
	)
	static final void method3113() {
		boolean var0 = false; // L: 10121

		while (!var0) { // L: 10122
			var0 = true; // L: 10123

			for (int var1 = 0; var1 < Client.menuOptionsCount - 1; ++var1) { // L: 10124
				if (Client.menuOpcodes[var1] < 1000 && Client.menuOpcodes[var1 + 1] > 1000) { // L: 10125
					String var2 = Client.menuTargets[var1]; // L: 10126
					Client.menuTargets[var1] = Client.menuTargets[var1 + 1]; // L: 10127
					Client.menuTargets[var1 + 1] = var2; // L: 10128
					String var3 = Client.menuActions[var1]; // L: 10129
					Client.menuActions[var1] = Client.menuActions[var1 + 1]; // L: 10130
					Client.menuActions[var1 + 1] = var3; // L: 10131
					int var4 = Client.menuOpcodes[var1]; // L: 10132
					Client.menuOpcodes[var1] = Client.menuOpcodes[var1 + 1]; // L: 10133
					Client.menuOpcodes[var1 + 1] = var4; // L: 10134
					var4 = Client.menuArguments1[var1]; // L: 10135
					Client.menuArguments1[var1] = Client.menuArguments1[var1 + 1]; // L: 10136
					Client.menuArguments1[var1 + 1] = var4; // L: 10137
					var4 = Client.menuArguments2[var1]; // L: 10138
					Client.menuArguments2[var1] = Client.menuArguments2[var1 + 1]; // L: 10139
					Client.menuArguments2[var1 + 1] = var4; // L: 10140
					var4 = Client.menuIdentifiers[var1]; // L: 10141
					Client.menuIdentifiers[var1] = Client.menuIdentifiers[var1 + 1]; // L: 10142
					Client.menuIdentifiers[var1 + 1] = var4; // L: 10143
					var4 = Client.field687[var1]; // L: 10144
					Client.field687[var1] = Client.field687[var1 + 1]; // L: 10145
					Client.field687[var1 + 1] = var4; // L: 10146
					boolean var5 = Client.menuShiftClick[var1]; // L: 10147
					Client.menuShiftClick[var1] = Client.menuShiftClick[var1 + 1]; // L: 10148
					Client.menuShiftClick[var1 + 1] = var5; // L: 10149
					var0 = false; // L: 10150
				}
			}
		}

	} // L: 10154
}
