import java.security.SecureRandom;
import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bw")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
	@ObfuscatedName("i")
	static byte[][][] field473;
	@ObfuscatedName("gl")
	@Export("secureRandom")
	static SecureRandom secureRandom;
	@ObfuscatedName("s")
	@Export("filterWorlds")
	boolean filterWorlds;

	GrandExchangeOfferOwnWorldComparator() {
	} // L: 12329

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Llh;Llh;B)I",
		garbageValue = "11"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		if (var2.world == var1.world) { // L: 12332
			return 0;
		} else {
			if (this.filterWorlds) { // L: 12333
				if (Client.worldId == var1.world) { // L: 12334
					return -1;
				}

				if (var2.world == Client.worldId) { // L: 12335
					return 1;
				}
			}

			return var1.world < var2.world ? -1 : 1; // L: 12337
		}
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 12345
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 12341
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "38684118"
	)
	static int method1081(int var0, Script var1, boolean var2) {
		int var4 = -1; // L: 623
		Widget var3;
		if (var0 >= 2000) { // L: 624
			var0 -= 1000; // L: 625
			var4 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 626
			var3 = HitSplatDefinition.getWidget(var4); // L: 627
		} else {
			var3 = var2 ? SoundSystem.scriptDotWidget : Ignored.scriptActiveWidget; // L: 629
		}

		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) { // L: 630
			Nameable.Interpreter_intStackSize -= 2; // L: 631
			var3.scrollX = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 632
			if (var3.scrollX > var3.scrollWidth - var3.width) { // L: 633
				var3.scrollX = var3.scrollWidth - var3.width;
			}

			if (var3.scrollX < 0) { // L: 634
				var3.scrollX = 0;
			}

			var3.scrollY = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 635
			if (var3.scrollY > var3.scrollHeight - var3.height) { // L: 636
				var3.scrollY = var3.scrollHeight - var3.height;
			}

			if (var3.scrollY < 0) { // L: 637
				var3.scrollY = 0;
			}

			class125.invalidateWidget(var3); // L: 638
			return 1; // L: 639
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) { // L: 641
			var3.color = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 642
			class125.invalidateWidget(var3); // L: 643
			return 1; // L: 644
		} else if (var0 == ScriptOpcodes.CC_SETFILL) { // L: 646
			var3.fill = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1; // L: 647
			class125.invalidateWidget(var3); // L: 648
			return 1; // L: 649
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) { // L: 651
			var3.transparencyTop = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 652
			class125.invalidateWidget(var3); // L: 653
			return 1; // L: 654
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) { // L: 656
			var3.lineWid = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 657
			class125.invalidateWidget(var3); // L: 658
			return 1; // L: 659
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) { // L: 661
			var3.spriteId2 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 662
			class125.invalidateWidget(var3); // L: 663
			return 1; // L: 664
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) { // L: 666
			var3.spriteAngle = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 667
			class125.invalidateWidget(var3); // L: 668
			return 1; // L: 669
		} else if (var0 == ScriptOpcodes.CC_SETTILING) { // L: 671
			var3.spriteTiling = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1; // L: 672
			class125.invalidateWidget(var3); // L: 673
			return 1; // L: 674
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) { // L: 676
			var3.modelType = 1; // L: 677
			var3.modelId = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 678
			class125.invalidateWidget(var3); // L: 679
			return 1; // L: 680
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) { // L: 682
			Nameable.Interpreter_intStackSize -= 6; // L: 683
			var3.modelOffsetX = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 684
			var3.modelOffsetY = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 685
			var3.modelAngleX = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 2]; // L: 686
			var3.modelAngleY = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 3]; // L: 687
			var3.modelAngleZ = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 4]; // L: 688
			var3.modelZoom = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 5]; // L: 689
			class125.invalidateWidget(var3); // L: 690
			return 1; // L: 691
		} else {
			int var8;
			if (var0 == ScriptOpcodes.CC_SETMODELANIM) { // L: 693
				var8 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 694
				if (var8 != var3.sequenceId) { // L: 695
					var3.sequenceId = var8; // L: 696
					var3.modelFrame = 0; // L: 697
					var3.modelFrameCycle = 0; // L: 698
					class125.invalidateWidget(var3); // L: 699
				}

				return 1; // L: 701
			} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) { // L: 703
				var3.modelOrthog = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1; // L: 704
				class125.invalidateWidget(var3); // L: 705
				return 1; // L: 706
			} else if (var0 == ScriptOpcodes.CC_SETTEXT) { // L: 708
				String var7 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize]; // L: 709
				if (!var7.equals(var3.text)) { // L: 710
					var3.text = var7; // L: 711
					class125.invalidateWidget(var3); // L: 712
				}

				return 1; // L: 714
			} else if (var0 == ScriptOpcodes.CC_SETTEXTFONT) { // L: 716
				var3.fontId = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 717
				class125.invalidateWidget(var3); // L: 718
				return 1; // L: 719
			} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) { // L: 721
				Nameable.Interpreter_intStackSize -= 3; // L: 722
				var3.textXAlignment = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 723
				var3.textYAlignment = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 724
				var3.textLineHeight = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 2]; // L: 725
				class125.invalidateWidget(var3); // L: 726
				return 1; // L: 727
			} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) { // L: 729
				var3.textShadowed = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1; // L: 730
				class125.invalidateWidget(var3); // L: 731
				return 1; // L: 732
			} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) { // L: 734
				var3.outline = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 735
				class125.invalidateWidget(var3); // L: 736
				return 1; // L: 737
			} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) { // L: 739
				var3.spriteShadow = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 740
				class125.invalidateWidget(var3); // L: 741
				return 1; // L: 742
			} else if (var0 == ScriptOpcodes.CC_SETVFLIP) { // L: 744
				var3.spriteFlipV = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1; // L: 745
				class125.invalidateWidget(var3); // L: 746
				return 1; // L: 747
			} else if (var0 == ScriptOpcodes.CC_SETHFLIP) { // L: 749
				var3.spriteFlipH = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1; // L: 750
				class125.invalidateWidget(var3); // L: 751
				return 1; // L: 752
			} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) { // L: 754
				Nameable.Interpreter_intStackSize -= 2; // L: 755
				var3.scrollWidth = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 756
				var3.scrollHeight = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 757
				class125.invalidateWidget(var3); // L: 758
				if (var4 != -1 && var3.type == 0) { // L: 759
					class181.revalidateWidgetScroll(class358.Widget_interfaceComponents[var4 >> 16], var3, false);
				}

				return 1; // L: 760
			} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) { // L: 762
				Client.resumePauseWidget(var3.id, var3.childIndex); // L: 763
				Client.meslayerContinueWidget = var3; // L: 764
				class125.invalidateWidget(var3); // L: 765
				return 1; // L: 766
			} else if (var0 == 1122) { // L: 768
				var3.spriteId = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 769
				class125.invalidateWidget(var3); // L: 770
				return 1; // L: 771
			} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) { // L: 773
				var3.color2 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 774
				class125.invalidateWidget(var3); // L: 775
				return 1; // L: 776
			} else if (var0 == 1124) { // L: 778
				var3.transparencyBot = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 779
				class125.invalidateWidget(var3); // L: 780
				return 1; // L: 781
			} else if (var0 == 1125) { // L: 783
				var8 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 784
				class454 var6 = (class454)GameEngine.findEnumerated(ArchiveDiskAction.FillMode_values(), var8); // L: 785
				if (var6 != null) { // L: 786
					var3.fillMode = var6; // L: 787
					class125.invalidateWidget(var3); // L: 788
				}

				return 1; // L: 790
			} else {
				boolean var5;
				if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) { // L: 792
					var5 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1; // L: 793
					var3.field3450 = var5; // L: 794
					return 1; // L: 795
				} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) { // L: 797
					var5 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1; // L: 798
					var3.modelTransparency = var5; // L: 799
					return 1; // L: 800
				} else if (var0 == 1128) { // L: 802
					Nameable.Interpreter_intStackSize -= 2; // L: 803
					return 1; // L: 804
				} else if (var0 == 1129) { // L: 806
					var3.field3373 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize]; // L: 807
					class125.invalidateWidget(var3); // L: 808
					return 1; // L: 809
				} else if (var0 == 1130) { // L: 811
					var3.method5539(Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize], MilliClock.urlRequester, Client.method1127()); // L: 812
					return 1; // L: 813
				} else if (var0 == 1131) { // L: 815
					Nameable.Interpreter_intStackSize -= 2; // L: 816
					var3.method5548(Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]); // L: 817
					return 1; // L: 818
				} else if (var0 == 1132) { // L: 820
					var3.method5533(Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize], Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]); // L: 821
					return 1; // L: 822
				} else {
					return 2; // L: 824
				}
			}
		}
	}

	@ObfuscatedName("o")
	static final void method1082(long var0) {
		ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var0; // L: 86
	} // L: 87
}
