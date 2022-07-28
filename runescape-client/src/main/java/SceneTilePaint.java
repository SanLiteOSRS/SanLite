import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hf")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
	@ObfuscatedName("sc")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	@Export("sceneMinimapSprite")
	static SpritePixels sceneMinimapSprite;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1690514069
	)
	@Export("swColor")
	int swColor;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -504198131
	)
	@Export("seColor")
	int seColor;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -831521809
	)
	@Export("neColor")
	int neColor;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 851338797
	)
	@Export("nwColor")
	int nwColor;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 42115919
	)
	@Export("texture")
	int texture;
	@ObfuscatedName("w")
	@Export("isFlat")
	boolean isFlat;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1794433853
	)
	@Export("rgb")
	int rgb;

	SceneTilePaint(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		this.isFlat = true;
		this.swColor = var1;
		this.seColor = var2;
		this.neColor = var3;
		this.nwColor = var4; // L: 16
		this.texture = var5;
		this.rgb = var6; // L: 18
		this.isFlat = var7; // L: 19
	} // L: 20

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)I",
		garbageValue = "80"
	)
	public static int method4491(CharSequence var0) {
		int var1 = var0.length(); // L: 9
		int var2 = 0; // L: 10

		for (int var3 = 0; var3 < var1; ++var3) { // L: 11
			char var4 = var0.charAt(var3); // L: 12
			if (var4 <= 127) { // L: 13
				++var2;
			} else if (var4 <= 2047) { // L: 14
				var2 += 2;
			} else {
				var2 += 3; // L: 15
			}
		}

		return var2; // L: 17
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(ILbc;ZI)I",
		garbageValue = "-1633545616"
	)
	static int method4490(int var0, Script var1, boolean var2) {
		int var4 = -1; // L: 622
		Widget var3;
		if (var0 >= 2000) { // L: 623
			var0 -= 1000; // L: 624
			var4 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 625
			var3 = FloorUnderlayDefinition.getWidget(var4); // L: 626
		} else {
			var3 = var2 ? VertexNormal.scriptDotWidget : class321.scriptActiveWidget; // L: 628
		}

		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) { // L: 629
			TaskHandler.Interpreter_intStackSize -= 2; // L: 630
			var3.scrollX = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 631
			if (var3.scrollX > var3.scrollWidth - var3.width) { // L: 632
				var3.scrollX = var3.scrollWidth - var3.width;
			}

			if (var3.scrollX < 0) { // L: 633
				var3.scrollX = 0;
			}

			var3.scrollY = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 634
			if (var3.scrollY > var3.scrollHeight - var3.height) { // L: 635
				var3.scrollY = var3.scrollHeight - var3.height;
			}

			if (var3.scrollY < 0) { // L: 636
				var3.scrollY = 0;
			}

			class220.invalidateWidget(var3); // L: 637
			return 1; // L: 638
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) { // L: 640
			var3.color = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 641
			class220.invalidateWidget(var3); // L: 642
			return 1; // L: 643
		} else if (var0 == ScriptOpcodes.CC_SETFILL) { // L: 645
			var3.fill = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1; // L: 646
			class220.invalidateWidget(var3); // L: 647
			return 1; // L: 648
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) { // L: 650
			var3.transparencyTop = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 651
			class220.invalidateWidget(var3); // L: 652
			return 1; // L: 653
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) { // L: 655
			var3.lineWid = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 656
			class220.invalidateWidget(var3); // L: 657
			return 1; // L: 658
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) { // L: 660
			var3.spriteId2 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 661
			class220.invalidateWidget(var3); // L: 662
			return 1; // L: 663
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) { // L: 665
			var3.spriteAngle = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 666
			class220.invalidateWidget(var3); // L: 667
			return 1; // L: 668
		} else if (var0 == ScriptOpcodes.CC_SETTILING) { // L: 670
			var3.spriteTiling = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1; // L: 671
			class220.invalidateWidget(var3); // L: 672
			return 1; // L: 673
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) { // L: 675
			var3.modelType = 1; // L: 676
			var3.modelId = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 677
			class220.invalidateWidget(var3); // L: 678
			return 1; // L: 679
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) { // L: 681
			TaskHandler.Interpreter_intStackSize -= 6; // L: 682
			var3.modelOffsetX = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 683
			var3.modelOffsetY = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 684
			var3.modelAngleX = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 2]; // L: 685
			var3.modelAngleY = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 3]; // L: 686
			var3.modelAngleZ = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 4]; // L: 687
			var3.modelZoom = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 5]; // L: 688
			class220.invalidateWidget(var3); // L: 689
			return 1; // L: 690
		} else {
			int var8;
			if (var0 == ScriptOpcodes.CC_SETMODELANIM) { // L: 692
				var8 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 693
				if (var8 != var3.sequenceId) { // L: 694
					var3.sequenceId = var8; // L: 695
					var3.modelFrame = 0; // L: 696
					var3.modelFrameCycle = 0; // L: 697
					class220.invalidateWidget(var3); // L: 698
				}

				return 1; // L: 700
			} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) { // L: 702
				var3.modelOrthog = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1; // L: 703
				class220.invalidateWidget(var3); // L: 704
				return 1; // L: 705
			} else if (var0 == ScriptOpcodes.CC_SETTEXT) { // L: 707
				String var7 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]; // L: 708
				if (!var7.equals(var3.text)) { // L: 709
					var3.text = var7; // L: 710
					class220.invalidateWidget(var3); // L: 711
				}

				return 1; // L: 713
			} else if (var0 == ScriptOpcodes.CC_SETTEXTFONT) { // L: 715
				var3.fontId = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 716
				class220.invalidateWidget(var3); // L: 717
				return 1; // L: 718
			} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) { // L: 720
				TaskHandler.Interpreter_intStackSize -= 3; // L: 721
				var3.textXAlignment = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 722
				var3.textYAlignment = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 723
				var3.textLineHeight = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 2]; // L: 724
				class220.invalidateWidget(var3); // L: 725
				return 1; // L: 726
			} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) { // L: 728
				var3.textShadowed = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1; // L: 729
				class220.invalidateWidget(var3); // L: 730
				return 1; // L: 731
			} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) { // L: 733
				var3.outline = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 734
				class220.invalidateWidget(var3); // L: 735
				return 1; // L: 736
			} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) { // L: 738
				var3.spriteShadow = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 739
				class220.invalidateWidget(var3); // L: 740
				return 1; // L: 741
			} else if (var0 == ScriptOpcodes.CC_SETVFLIP) { // L: 743
				var3.spriteFlipV = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1; // L: 744
				class220.invalidateWidget(var3); // L: 745
				return 1; // L: 746
			} else if (var0 == ScriptOpcodes.CC_SETHFLIP) { // L: 748
				var3.spriteFlipH = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1; // L: 749
				class220.invalidateWidget(var3); // L: 750
				return 1; // L: 751
			} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) { // L: 753
				TaskHandler.Interpreter_intStackSize -= 2; // L: 754
				var3.scrollWidth = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 755
				var3.scrollHeight = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 756
				class220.invalidateWidget(var3); // L: 757
				if (var4 != -1 && var3.type == 0) { // L: 758
					class439.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var4 >> 16], var3, false);
				}

				return 1; // L: 759
			} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) { // L: 761
				WorldMapSection2.resumePauseWidget(var3.id, var3.childIndex); // L: 762
				Client.meslayerContinueWidget = var3; // L: 763
				class220.invalidateWidget(var3); // L: 764
				return 1; // L: 765
			} else if (var0 == 1122) { // L: 767
				var3.spriteId = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 768
				class220.invalidateWidget(var3); // L: 769
				return 1; // L: 770
			} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) { // L: 772
				var3.color2 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 773
				class220.invalidateWidget(var3); // L: 774
				return 1; // L: 775
			} else if (var0 == 1124) { // L: 777
				var3.transparencyBot = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 778
				class220.invalidateWidget(var3); // L: 779
				return 1; // L: 780
			} else if (var0 == 1125) { // L: 782
				var8 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 783
				class454 var6 = (class454)class271.findEnumerated(class386.FillMode_values(), var8); // L: 784
				if (var6 != null) { // L: 785
					var3.fillMode = var6; // L: 786
					class220.invalidateWidget(var3); // L: 787
				}

				return 1; // L: 789
			} else {
				boolean var5;
				if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) { // L: 791
					var5 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1; // L: 792
					var3.field3399 = var5; // L: 793
					return 1; // L: 794
				} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) { // L: 796
					var5 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1; // L: 797
					var3.modelTransparency = var5; // L: 798
					return 1; // L: 799
				} else if (var0 == 1128) { // L: 801
					TaskHandler.Interpreter_intStackSize -= 2; // L: 802
					return 1; // L: 803
				} else if (var0 == 1129) { // L: 805
					var3.field3402 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]; // L: 806
					class220.invalidateWidget(var3); // L: 807
					return 1; // L: 808
				} else if (var0 == 1130) { // L: 810
					var3.method5635(Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize], class152.urlRequester, ArchiveLoader.method2130()); // L: 811
					return 1; // L: 812
				} else if (var0 == 1131) { // L: 814
					TaskHandler.Interpreter_intStackSize -= 2; // L: 815
					var3.method5698(Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize], Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]); // L: 816
					return 1; // L: 817
				} else if (var0 == 1132) { // L: 819
					var3.method5638(Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize], Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]); // L: 820
					return 1; // L: 821
				} else {
					return 2; // L: 823
				}
			}
		}
	}
}
