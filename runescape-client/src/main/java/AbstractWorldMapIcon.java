import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("kd")
@Implements("AbstractWorldMapIcon")
public abstract class AbstractWorldMapIcon {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	@Export("coord2")
	public final Coord coord2;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	@Export("coord1")
	public final Coord coord1;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 807441569
	)
	@Export("screenX")
	int screenX;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1518101671
	)
	@Export("screenY")
	int screenY;

	@ObfuscatedSignature(
		descriptor = "(Lmk;Lmk;)V"
	)
	AbstractWorldMapIcon(Coord var1, Coord var2) {
		this.coord1 = var1; // L: 13
		this.coord2 = var2; // L: 14
	} // L: 15

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1344079947"
	)
	@Export("getElement")
	public abstract int getElement();

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Lkc;",
		garbageValue = "-248484486"
	)
	@Export("getLabel")
	abstract WorldMapLabel getLabel();

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1481600529"
	)
	@Export("getSubWidth")
	abstract int getSubWidth();

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-33"
	)
	@Export("getSubHeight")
	abstract int getSubHeight();

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIS)Z",
		garbageValue = "383"
	)
	@Export("fitsScreen")
	boolean fitsScreen(int var1, int var2) {
		if (this.elementFitsScreen(var1, var2)) { // L: 18
			return true; // L: 19
		} else {
			return this.labelFitsScreen(var1, var2); // L: 21
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "2"
	)
	@Export("hasValidElement")
	boolean hasValidElement() {
		return this.getElement() >= 0;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-9"
	)
	@Export("elementFitsScreen")
	boolean elementFitsScreen(int var1, int var2) {
		if (!this.hasValidElement()) {
			return false;
		} else {
			WorldMapElement var3 = class127.WorldMapElement_get(this.getElement());
			int var4 = this.getSubWidth();
			int var5 = this.getSubHeight();
			switch(var3.horizontalAlignment.value) {
			case 0:
				if (var1 <= this.screenX - var4 || var1 > this.screenX) {
					return false;
				}
				break;
			case 1:
				if (var1 >= this.screenX - var4 / 2 && var1 <= var4 / 2 + this.screenX) { // L: 49
					break;
				}

				return false;
			case 2:
				if (var1 < this.screenX || var1 >= var4 + this.screenX) { // L: 54
					return false;
				}
			}

			switch(var3.verticalAlignment.value) { // L: 58
			case 0:
				if (var2 > this.screenY - var5 && var2 <= this.screenY) { // L: 71
					break;
				}

				return false;
			case 1:
				if (var2 >= this.screenY && var2 < var5 + this.screenY) { // L: 61
					break;
				}

				return false;
			case 2:
				if (var2 < this.screenY - var5 / 2 || var2 > var5 / 2 + this.screenY) { // L: 66
					return false;
				}
			}

			return true; // L: 75
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "430580953"
	)
	@Export("labelFitsScreen")
	boolean labelFitsScreen(int var1, int var2) {
		WorldMapLabel var3 = this.getLabel(); // L: 79
		if (var3 == null) { // L: 80
			return false; // L: 81
		} else if (var1 >= this.screenX - var3.width / 2 && var1 <= var3.width / 2 + this.screenX) { // L: 83
			return var2 >= this.screenY && var2 <= var3.height + this.screenY; // L: 84
		} else {
			return false; // L: 85
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lnr;III)Lum;",
		garbageValue = "-1581888707"
	)
	static IndexedSprite method5607(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2); // L: 25
		boolean var3;
		if (var4 == null) { // L: 26
			var3 = false; // L: 27
		} else {
			GrandExchangeEvent.SpriteBuffer_decode(var4); // L: 30
			var3 = true; // L: 31
		}

		if (!var3) { // L: 33
			return null;
		} else {
			IndexedSprite var5 = new IndexedSprite(); // L: 36
			var5.width = class527.SpriteBuffer_spriteWidth; // L: 37
			var5.height = class527.SpriteBuffer_spriteHeight; // L: 38
			var5.xOffset = class527.SpriteBuffer_xOffsets[0]; // L: 39
			var5.yOffset = class527.SpriteBuffer_yOffsets[0]; // L: 40
			var5.subWidth = class496.SpriteBuffer_spriteWidths[0]; // L: 41
			var5.subHeight = BuddyRankComparator.SpriteBuffer_spriteHeights[0]; // L: 42
			var5.palette = class527.SpriteBuffer_spritePalette; // L: 43
			var5.pixels = class464.SpriteBuffer_pixels[0]; // L: 44
			PlatformInfo.method8433(); // L: 45
			return var5; // L: 48
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILdr;ZB)I",
		garbageValue = "8"
	)
	static int method5604(int var0, Script var1, boolean var2) {
		int var4 = -1; // L: 621
		Widget var3;
		if (var0 >= 2000) { // L: 622
			var0 -= 1000; // L: 623
			var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 624
			var3 = Interpreter.getWidget(var4); // L: 625
		} else {
			var3 = var2 ? Interpreter.scriptDotWidget : class184.field1907; // L: 627
		}

		int var13;
		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) { // L: 628
			Interpreter.Interpreter_intStackSize -= 2; // L: 629
			var13 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 630
			int var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 631
			if (var3.type == 12) { // L: 632
				class329 var7 = var3.method6470(); // L: 633
				if (var7 != null && var7.method6430(var13, var9)) { // L: 634
					class303.invalidateWidget(var3); // L: 635
				}
			} else {
				var3.scrollX = var13; // L: 639
				if (var3.scrollX > var3.scrollWidth - var3.width) { // L: 640
					var3.scrollX = var3.scrollWidth - var3.width;
				}

				if (var3.scrollX < 0) { // L: 641
					var3.scrollX = 0;
				}

				var3.scrollY = var9; // L: 642
				if (var3.scrollY > var3.scrollHeight - var3.height) { // L: 643
					var3.scrollY = var3.scrollHeight - var3.height;
				}

				if (var3.scrollY < 0) { // L: 644
					var3.scrollY = 0;
				}

				class303.invalidateWidget(var3); // L: 645
			}

			return 1; // L: 647
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) {
			var3.color = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 650
			class303.invalidateWidget(var3); // L: 651
			return 1; // L: 652
		} else if (var0 == ScriptOpcodes.CC_SETFILL) {
			var3.fill = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 655
			class303.invalidateWidget(var3); // L: 656
			return 1; // L: 657
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) {
			var3.transparencyTop = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 660
			class303.invalidateWidget(var3); // L: 661
			return 1; // L: 662
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) {
			var3.lineWid = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 665
			class303.invalidateWidget(var3); // L: 666
			return 1; // L: 667
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) {
			var3.spriteId2 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 670
			class303.invalidateWidget(var3); // L: 671
			return 1; // L: 672
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) {
			var3.spriteAngle = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 675
			class303.invalidateWidget(var3); // L: 676
			return 1; // L: 677
		} else if (var0 == ScriptOpcodes.CC_SETTILING) {
			var3.spriteTiling = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 680
			class303.invalidateWidget(var3); // L: 681
			return 1; // L: 682
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) {
			var3.modelType = 1; // L: 685
			var3.modelId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 686
			class303.invalidateWidget(var3); // L: 687
			return 1; // L: 688
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) {
			Interpreter.Interpreter_intStackSize -= 6; // L: 691
			var3.modelOffsetX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 692
			var3.modelOffsetY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 693
			var3.modelAngleX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 694
			var3.modelAngleY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 695
			var3.modelAngleZ = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 4]; // L: 696
			var3.modelZoom = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 5]; // L: 697
			class303.invalidateWidget(var3); // L: 698
			return 1; // L: 699
		} else if (var0 == ScriptOpcodes.CC_SETMODELANIM) {
			var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 702
			if (var13 != var3.sequenceId) { // L: 703
				var3.sequenceId = var13; // L: 704
				var3.modelFrame = 0; // L: 705
				var3.modelFrameCycle = 0; // L: 706
				class303.invalidateWidget(var3); // L: 707
			}

			return 1; // L: 709
		} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) {
			var3.modelOrthog = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 712
			class303.invalidateWidget(var3); // L: 713
			return 1; // L: 714
		} else if (var0 == ScriptOpcodes.CC_SETTEXT) {
			String var14 = Interpreter.Interpreter_stringStack[--class179.Interpreter_stringStackSize]; // L: 717
			if (!var14.equals(var3.text)) { // L: 718
				var3.text = var14; // L: 719
				class303.invalidateWidget(var3); // L: 720
			}

			return 1; // L: 722
		} else {
			class329 var10;
			if (var0 == ScriptOpcodes.CC_SETTEXTFONT) {
				var3.fontId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 725
				if (var3.type == 12) { // L: 726
					var10 = var3.method6470(); // L: 727
					if (var10 != null) { // L: 728
						var10.method6178(); // L: 729
					}
				}

				class303.invalidateWidget(var3); // L: 732
				return 1; // L: 733
			} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) {
				Interpreter.Interpreter_intStackSize -= 3; // L: 736
				if (var3.type == 12) { // L: 737
					var10 = var3.method6470(); // L: 738
					if (var10 != null) { // L: 739
						var10.method6172(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 740
						var10.method6173(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]); // L: 741
					}
				} else {
					var3.textXAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 745
					var3.textYAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 746
					var3.textLineHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 747
				}

				class303.invalidateWidget(var3); // L: 749
				return 1; // L: 750
			} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) {
				var3.textShadowed = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 753
				class303.invalidateWidget(var3); // L: 754
				return 1; // L: 755
			} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) {
				var3.outline = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 758
				class303.invalidateWidget(var3); // L: 759
				return 1; // L: 760
			} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) {
				var3.spriteShadow = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 763
				class303.invalidateWidget(var3); // L: 764
				return 1; // L: 765
			} else if (var0 == ScriptOpcodes.CC_SETVFLIP) {
				var3.spriteFlipV = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 768
				class303.invalidateWidget(var3); // L: 769
				return 1; // L: 770
			} else if (var0 == ScriptOpcodes.CC_SETHFLIP) {
				var3.spriteFlipH = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 773
				class303.invalidateWidget(var3); // L: 774
				return 1; // L: 775
			} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) {
				Interpreter.Interpreter_intStackSize -= 2; // L: 778
				var3.scrollWidth = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 779
				var3.scrollHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 780
				class303.invalidateWidget(var3); // L: 781
				if (var4 != -1 && var3.type == 0) {
					class238.revalidateWidgetScroll(class179.Widget_interfaceComponents[var4 >> 16], var3, false); // L: 782
				}

				return 1; // L: 783
			} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) {
				class143.resumePauseWidget(var3.id, var3.childIndex); // L: 786
				Client.meslayerContinueWidget = var3; // L: 787
				class303.invalidateWidget(var3); // L: 788
				return 1; // L: 789
			} else if (var0 == 1122) {
				var3.spriteId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 792
				class303.invalidateWidget(var3); // L: 793
				return 1; // L: 794
			} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) {
				var3.color2 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 797
				class303.invalidateWidget(var3); // L: 798
				return 1; // L: 799
			} else if (var0 == 1124) {
				var3.transparencyBot = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 802
				class303.invalidateWidget(var3); // L: 803
				return 1; // L: 804
			} else if (var0 == 1125) {
				var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 807
				class524 var11 = (class524)class93.findEnumerated(class485.FillMode_values(), var13); // L: 808
				if (var11 != null) { // L: 809
					var3.fillMode = var11; // L: 810
					class303.invalidateWidget(var3); // L: 811
				}

				return 1; // L: 813
			} else {
				boolean var8;
				if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) {
					var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 816
					var3.field3661 = var8; // L: 817
					return 1; // L: 818
				} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) {
					var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 821
					var3.modelTransparency = var8; // L: 822
					return 1; // L: 823
				} else if (var0 == 1129) {
					var3.field3732 = Interpreter.Interpreter_stringStack[--class179.Interpreter_stringStackSize]; // L: 826
					class303.invalidateWidget(var3); // L: 827
					return 1; // L: 828
				} else if (var0 == 1130) {
					var3.method6459(Interpreter.Interpreter_stringStack[--class179.Interpreter_stringStackSize], class327.urlRequester, class135.method3132()); // L: 831
					return 1; // L: 832
				} else if (var0 == 1131) {
					Interpreter.Interpreter_intStackSize -= 2; // L: 835
					var3.swapItems(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 836
					return 1; // L: 837
				} else if (var0 == 1132) {
					var3.method6458(Interpreter.Interpreter_stringStack[--class179.Interpreter_stringStackSize], Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 840
					return 1; // L: 841
				} else {
					class324 var12;
					if (var0 == 1133) {
						--Interpreter.Interpreter_intStackSize; // L: 844
						var12 = var3.method6471(); // L: 845
						if (var12 != null) { // L: 846
							var12.field3539 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 847
							class303.invalidateWidget(var3); // L: 848
						}

						return 1; // L: 850
					} else if (var0 == 1134) {
						--Interpreter.Interpreter_intStackSize; // L: 853
						var12 = var3.method6471(); // L: 854
						if (var12 != null) { // L: 855
							var12.field3538 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 856
							class303.invalidateWidget(var3); // L: 857
						}

						return 1; // L: 859
					} else if (var0 == 1135) {
						--class179.Interpreter_stringStackSize; // L: 862
						var10 = var3.method6470(); // L: 863
						if (var10 != null) { // L: 864
							var3.field3771 = Interpreter.Interpreter_stringStack[class179.Interpreter_stringStackSize]; // L: 865
						}

						return 1; // L: 867
					} else if (var0 == 1136) {
						--Interpreter.Interpreter_intStackSize; // L: 870
						var12 = var3.method6471(); // L: 871
						if (var12 != null) { // L: 872
							var12.field3540 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 873
							class303.invalidateWidget(var3); // L: 874
						}

						return 1; // L: 876
					} else if (var0 == 1137) {
						--Interpreter.Interpreter_intStackSize; // L: 879
						var10 = var3.method6470(); // L: 880
						if (var10 != null && var10.method6214(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) { // L: 881
							class303.invalidateWidget(var3); // L: 882
						}

						return 1; // L: 884
					} else if (var0 == 1138) {
						--Interpreter.Interpreter_intStackSize; // L: 887
						var10 = var3.method6470(); // L: 888
						if (var10 != null && var10.method6169(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) { // L: 889
							class303.invalidateWidget(var3); // L: 890
						}

						return 1; // L: 892
					} else if (var0 == 1139) {
						--Interpreter.Interpreter_intStackSize; // L: 895
						var10 = var3.method6470(); // L: 896
						if (var10 != null && var10.method6170(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) { // L: 897
							class303.invalidateWidget(var3); // L: 898
						}

						return 1; // L: 900
					} else {
						class329 var6;
						if (var0 == 1140) {
							var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 903
							Client.field734.method4226(); // L: 904
							var6 = var3.method6470(); // L: 905
							if (var6 != null && var6.method6386(var8)) { // L: 906
								if (var8) { // L: 907
									Client.field734.method4225(var3); // L: 908
								}

								class303.invalidateWidget(var3); // L: 910
							}

							return 1; // L: 912
						} else if (var0 == 1141) {
							var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 915
							if (!var8 && Client.field734.method4246() == var3) { // L: 916
								Client.field734.method4226(); // L: 917
								class303.invalidateWidget(var3); // L: 918
							}

							var6 = var3.method6470(); // L: 920
							if (var6 != null) { // L: 921
								var6.method6162(var8); // L: 922
							}

							return 1; // L: 924
						} else if (var0 == 1142) {
							Interpreter.Interpreter_intStackSize -= 2; // L: 927
							var10 = var3.method6470(); // L: 928
							if (var10 != null && var10.method6186(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1])) { // L: 929
								class303.invalidateWidget(var3); // L: 930
							}

							return 1; // L: 932
						} else if (var0 == 1143) {
							--Interpreter.Interpreter_intStackSize; // L: 935
							var10 = var3.method6470(); // L: 936
							if (var10 != null && var10.method6186(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize])) { // L: 937
								class303.invalidateWidget(var3); // L: 938
							}

							return 1; // L: 940
						} else if (var0 == 1144) {
							--Interpreter.Interpreter_intStackSize; // L: 943
							var10 = var3.method6470(); // L: 944
							if (var10 != null) { // L: 945
								var10.method6175(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]); // L: 946
								class303.invalidateWidget(var3); // L: 947
							}

							return 1; // L: 949
						} else if (var0 == 1145) {
							--Interpreter.Interpreter_intStackSize; // L: 952
							var10 = var3.method6470(); // L: 953
							if (var10 != null) { // L: 954
								var10.method6174(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]); // L: 955
							}

							return 1; // L: 957
						} else if (var0 == 1146) {
							--Interpreter.Interpreter_intStackSize; // L: 960
							var10 = var3.method6470(); // L: 961
							if (var10 != null) { // L: 962
								var10.method6243(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]); // L: 963
							}

							return 1; // L: 965
						} else if (var0 == 1147) {
							--Interpreter.Interpreter_intStackSize; // L: 968
							var10 = var3.method6470(); // L: 969
							if (var10 != null) { // L: 970
								var10.method6176(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]); // L: 971
								class303.invalidateWidget(var3); // L: 972
							}

							return 1; // L: 974
						} else {
							class27 var5;
							if (var0 == 1148) {
								Interpreter.Interpreter_intStackSize -= 2; // L: 977
								var5 = var3.method6472(); // L: 978
								if (var5 != null) { // L: 979
									var5.method445(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 980
								}

								return 1; // L: 982
							} else if (var0 == 1149) {
								Interpreter.Interpreter_intStackSize -= 2; // L: 985
								var5 = var3.method6472(); // L: 986
								if (var5 != null) { // L: 987
									var5.method415((char)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 988
								}

								return 1; // L: 990
							} else if (var0 == 1150) {
								var3.method6455(Interpreter.Interpreter_stringStack[--class179.Interpreter_stringStackSize], class327.urlRequester); // L: 993
								return 1; // L: 994
							} else {
								return 2; // L: 996
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ltl;IB)V",
		garbageValue = "-18"
	)
	public static void method5605(Buffer var0, int var1) {
		if (JagexCache.JagexCache_randomDat != null) { // L: 340
			try {
				JagexCache.JagexCache_randomDat.seek(0L); // L: 342
				JagexCache.JagexCache_randomDat.write(var0.array, var1, 24); // L: 343
			} catch (Exception var3) { // L: 345
			}
		}

	} // L: 347

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1382769814"
	)
	static void method5583(String var0, String var1, String var2) {
		ObjectSound.method1926(7); // L: 1107
		class156.setLoginResponseString(var0, var1, var2); // L: 1108
	} // L: 1109
}
