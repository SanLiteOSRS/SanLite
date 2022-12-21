import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cg")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1482970883
	)
	static int field1315;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -107770019
	)
	static int field1317;
	@ObfuscatedName("i")
	@Export("Tiles_hueMultiplier")
	static int[] Tiles_hueMultiplier;
	@ObfuscatedName("mw")
	@ObfuscatedGetter(
		intValue = -736500721
	)
	@Export("menuY")
	static int menuY;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	@Export("definition")
	NPCComposition definition;
	@ObfuscatedName("e")
	String field1311;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1973298013
	)
	int field1312;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lqz;"
	)
	class467 field1313;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lgp;"
	)
	class185 field1314;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lgp;"
	)
	class185 field1316;

	static {
		field1315 = 1; // L: 18
		field1317 = 1; // L: 20
	}

	NPC() {
		this.field1311 = ""; // L: 13
		this.field1312 = 31; // L: 15
	} // L: 22

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1631971802"
	)
	void method2573(String var1) {
		this.field1311 = var1 == null ? "" : var1; // L: 25
	} // L: 26

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Lhh;",
		garbageValue = "-1279733976"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) { // L: 116
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? class216.SequenceDefinition_get(super.sequence) : null; // L: 117
			SequenceDefinition var2 = super.movementSequence == -1 || super.idleSequence == super.movementSequence && var1 != null ? null : class216.SequenceDefinition_get(super.movementSequence); // L: 118
			Model var3 = this.definition.method3723(var1, super.sequenceFrame, var2, super.movementFrame, this.field1314); // L: 119
			if (var3 == null) { // L: 120
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 121
				super.defaultHeight = var3.height; // L: 122
				int var4 = var3.indicesCount; // L: 123
				if (super.spotAnimation != -1 && super.spotAnimationFrame != -1) { // L: 124
					Model var5 = ClanSettings.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame); // L: 125
					if (var5 != null) { // L: 126
						var5.offsetBy(0, -super.spotAnimationHeight, 0); // L: 127
						Model[] var6 = new Model[]{var3, var5}; // L: 128
						var3 = new Model(var6, 2); // L: 129
					}
				}

				if (this.definition.size == 1) { // L: 132
					var3.isSingleTile = true;
				}

				if (super.field1243 != 0 && Client.cycle >= super.field1238 && Client.cycle < super.field1200) { // L: 133
					var3.overrideHue = super.field1240; // L: 134
					var3.overrideSaturation = super.field1220; // L: 135
					var3.overrideLuminance = super.field1232; // L: 136
					var3.overrideAmount = super.field1243; // L: 137
					var3.field2741 = (short)var4; // L: 138
				} else {
					var3.overrideAmount = 0; // L: 141
				}

				return var3; // L: 143
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "939145985"
	)
	void method2531(int var1) {
		this.field1312 = var1; // L: 29
	} // L: 30

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1988661958"
	)
	boolean method2576(int var1) {
		if (var1 >= 0 && var1 <= 4) { // L: 33
			return (this.field1312 & 1 << var1) != 0; // L: 34
		} else {
			return true; // L: 36
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1271311386"
	)
	final String method2535() {
		if (!this.field1311.isEmpty()) { // L: 40
			return this.field1311; // L: 41
		} else {
			NPCComposition var1 = this.definition; // L: 43
			if (var1.transforms != null) { // L: 44
				var1 = var1.transform(); // L: 45
				if (var1 == null) { // L: 46
					var1 = this.definition; // L: 47
				}
			}

			return var1.name; // L: 50
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(ILgs;B)V",
		garbageValue = "-17"
	)
	final void method2533(int var1, class204 var2) {
		int var3 = super.pathX[0]; // L: 54
		int var4 = super.pathY[0]; // L: 55
		if (var1 == 0) { // L: 56
			--var3; // L: 57
			++var4; // L: 58
		}

		if (var1 == 1) { // L: 60
			++var4;
		}

		if (var1 == 2) { // L: 61
			++var3; // L: 62
			++var4; // L: 63
		}

		if (var1 == 3) { // L: 65
			--var3;
		}

		if (var1 == 4) { // L: 66
			++var3;
		}

		if (var1 == 5) { // L: 67
			--var3; // L: 68
			--var4; // L: 69
		}

		if (var1 == 6) { // L: 71
			--var4;
		}

		if (var1 == 7) { // L: 72
			++var3; // L: 73
			--var4; // L: 74
		}

		if (super.sequence != -1 && class216.SequenceDefinition_get(super.sequence).field2284 == 1) {
			super.sequence = -1; // L: 76
		}

		if (super.pathLength < 9) { // L: 77
			++super.pathLength;
		}

		for (int var5 = super.pathLength; var5 > 0; --var5) { // L: 78
			super.pathX[var5] = super.pathX[var5 - 1]; // L: 79
			super.pathY[var5] = super.pathY[var5 - 1]; // L: 80
			super.pathTraversed[var5] = super.pathTraversed[var5 - 1]; // L: 81
		}

		super.pathX[0] = var3; // L: 83
		super.pathY[0] = var4; // L: 84
		super.pathTraversed[0] = var2; // L: 85
	} // L: 86

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-468996840"
	)
	final void method2534(int var1, int var2, boolean var3) {
		if (super.sequence != -1 && class216.SequenceDefinition_get(super.sequence).field2284 == 1) { // L: 89
			super.sequence = -1;
		}

		if (!var3) { // L: 90
			int var4 = var1 - super.pathX[0]; // L: 91
			int var5 = var2 - super.pathY[0]; // L: 92
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) { // L: 93
				if (super.pathLength < 9) { // L: 94
					++super.pathLength;
				}

				for (int var6 = super.pathLength; var6 > 0; --var6) { // L: 95
					super.pathX[var6] = super.pathX[var6 - 1]; // L: 96
					super.pathY[var6] = super.pathY[var6 - 1]; // L: 97
					super.pathTraversed[var6] = super.pathTraversed[var6 - 1]; // L: 98
				}

				super.pathX[0] = var1; // L: 100
				super.pathY[0] = var2; // L: 101
				super.pathTraversed[0] = class204.field2355; // L: 102
				return; // L: 103
			}
		}

		super.pathLength = 0; // L: 106
		super.field1252 = 0; // L: 107
		super.field1239 = 0; // L: 108
		super.pathX[0] = var1; // L: 109
		super.pathY[0] = var2; // L: 110
		super.x = super.field1181 * 64 + super.pathX[0] * 128; // L: 111
		super.y = super.field1181 * 64 + super.pathY[0] * 128; // L: 112
	} // L: 113

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "114"
	)
	int[] method2546() {
		return this.field1313 != null ? this.field1313.method8797() : this.definition.method3678(); // L: 152 153 155
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)[S",
		garbageValue = "79"
	)
	short[] method2538() {
		return this.field1313 != null ? this.field1313.method8799() : this.definition.method3715(); // L: 159 160 162
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IISI)V",
		garbageValue = "1336672694"
	)
	void method2539(int var1, int var2, short var3) {
		if (this.field1313 == null) { // L: 166
			this.field1313 = new class467(this.definition); // L: 167
		}

		this.field1313.method8800(var1, var2, var3); // L: 169
	} // L: 170

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "([I[SI)V",
		garbageValue = "-1499310121"
	)
	void method2540(int[] var1, short[] var2) {
		if (this.field1313 == null) { // L: 173
			this.field1313 = new class467(this.definition); // L: 174
		}

		this.field1313.method8801(var1, var2); // L: 176
	} // L: 177

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-4"
	)
	void method2541() {
		this.field1313 = null; // L: 180
	} // L: 181

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lgp;I)V",
		garbageValue = "-812185885"
	)
	void method2542(class185 var1) {
		this.field1316 = var1; // L: 184
	} // L: 185

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Lgp;",
		garbageValue = "894608808"
	)
	class185 method2543() {
		return this.field1316; // L: 188
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lgp;I)V",
		garbageValue = "-1612778242"
	)
	void method2544(class185 var1) {
		this.field1314 = var1; // L: 192
	} // L: 193

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-200769249"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null; // L: 147
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-222403464"
	)
	void method2560() {
		this.field1316 = null; // L: 196
	} // L: 197

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "611713256"
	)
	void method2567() {
		this.field1314 = null; // L: 200
	} // L: 201

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(ILbm;ZI)I",
		garbageValue = "98652591"
	)
	static int method2530(int var0, Script var1, boolean var2) {
		int var4 = -1; // L: 626
		Widget var3;
		if (var0 >= 2000) { // L: 627
			var0 -= 1000; // L: 628
			var4 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 629
			var3 = class175.getWidget(var4); // L: 630
		} else {
			var3 = var2 ? class190.scriptDotWidget : class360.field4354; // L: 632
		}

		int var13;
		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) { // L: 633
			class87.Interpreter_intStackSize -= 2; // L: 634
			var13 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 635
			int var9 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 636
			if (var3.type == 12) { // L: 637
				class303 var7 = var3.method6167(); // L: 638
				if (var7 != null && var7.method5889(var13, var9)) { // L: 639
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
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) { // L: 654
			var3.color = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 655
			class69.invalidateWidget(var3); // L: 656
			return 1; // L: 657
		} else if (var0 == ScriptOpcodes.CC_SETFILL) { // L: 659
			var3.fill = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 660
			class69.invalidateWidget(var3); // L: 661
			return 1; // L: 662
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) { // L: 664
			var3.transparencyTop = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 665
			class69.invalidateWidget(var3); // L: 666
			return 1; // L: 667
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) { // L: 669
			var3.lineWid = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 670
			class69.invalidateWidget(var3); // L: 671
			return 1; // L: 672
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) { // L: 674
			var3.spriteId2 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 675
			class69.invalidateWidget(var3); // L: 676
			return 1; // L: 677
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) { // L: 679
			var3.spriteAngle = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 680
			class69.invalidateWidget(var3); // L: 681
			return 1; // L: 682
		} else if (var0 == ScriptOpcodes.CC_SETTILING) { // L: 684
			var3.spriteTiling = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 685
			class69.invalidateWidget(var3); // L: 686
			return 1; // L: 687
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) { // L: 689
			var3.modelType = 1; // L: 690
			var3.modelId = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 691
			class69.invalidateWidget(var3); // L: 692
			return 1; // L: 693
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) { // L: 695
			class87.Interpreter_intStackSize -= 6; // L: 696
			var3.modelOffsetX = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 697
			var3.modelOffsetY = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 698
			var3.modelAngleX = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 2]; // L: 699
			var3.modelAngleY = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 3]; // L: 700
			var3.modelAngleZ = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 4]; // L: 701
			var3.modelZoom = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 5]; // L: 702
			class69.invalidateWidget(var3); // L: 703
			return 1; // L: 704
		} else if (var0 == ScriptOpcodes.CC_SETMODELANIM) { // L: 706
			var13 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 707
			if (var13 != var3.sequenceId) { // L: 708
				var3.sequenceId = var13; // L: 709
				var3.modelFrame = 0; // L: 710
				var3.modelFrameCycle = 0; // L: 711
				class69.invalidateWidget(var3); // L: 712
			}

			return 1; // L: 714
		} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) { // L: 716
			var3.modelOrthog = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 717
			class69.invalidateWidget(var3); // L: 718
			return 1; // L: 719
		} else if (var0 == ScriptOpcodes.CC_SETTEXT) { // L: 721
			String var14 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 722
			if (!var14.equals(var3.text)) { // L: 723
				var3.text = var14; // L: 724
				class69.invalidateWidget(var3); // L: 725
			}

			return 1; // L: 727
		} else {
			class303 var10;
			if (var0 == ScriptOpcodes.CC_SETTEXTFONT) { // L: 729
				var3.fontId = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 730
				if (var3.type == 12) { // L: 731
					var10 = var3.method6167(); // L: 732
					if (var10 != null) { // L: 733
						var10.method5896(); // L: 734
					}
				}

				class69.invalidateWidget(var3); // L: 737
				return 1; // L: 738
			} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) { // L: 740
				class87.Interpreter_intStackSize -= 3; // L: 741
				if (var3.type == 12) { // L: 742
					var10 = var3.method6167(); // L: 743
					if (var10 != null) { // L: 744
						var10.method5890(Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]); // L: 745
						var10.method5891(Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 2]); // L: 746
					}
				} else {
					var3.textXAlignment = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 750
					var3.textYAlignment = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 751
					var3.textLineHeight = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 2]; // L: 752
				}

				class69.invalidateWidget(var3); // L: 754
				return 1; // L: 755
			} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) { // L: 757
				var3.textShadowed = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 758
				class69.invalidateWidget(var3); // L: 759
				return 1; // L: 760
			} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) { // L: 762
				var3.outline = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 763
				class69.invalidateWidget(var3); // L: 764
				return 1; // L: 765
			} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) { // L: 767
				var3.spriteShadow = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 768
				class69.invalidateWidget(var3); // L: 769
				return 1; // L: 770
			} else if (var0 == ScriptOpcodes.CC_SETVFLIP) { // L: 772
				var3.spriteFlipV = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 773
				class69.invalidateWidget(var3); // L: 774
				return 1; // L: 775
			} else if (var0 == ScriptOpcodes.CC_SETHFLIP) { // L: 777
				var3.spriteFlipH = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 778
				class69.invalidateWidget(var3); // L: 779
				return 1; // L: 780
			} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) { // L: 782
				class87.Interpreter_intStackSize -= 2; // L: 783
				var3.scrollWidth = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 784
				var3.scrollHeight = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 785
				class69.invalidateWidget(var3); // L: 786
				if (var4 != -1 && var3.type == 0) { // L: 787
					class169.revalidateWidgetScroll(class71.Widget_interfaceComponents[var4 >> 16], var3, false);
				}

				return 1; // L: 788
			} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) { // L: 790
				class262.resumePauseWidget(var3.id, var3.childIndex); // L: 791
				Client.meslayerContinueWidget = var3; // L: 792
				class69.invalidateWidget(var3); // L: 793
				return 1; // L: 794
			} else if (var0 == 1122) { // L: 796
				var3.spriteId = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 797
				class69.invalidateWidget(var3); // L: 798
				return 1; // L: 799
			} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) { // L: 801
				var3.color2 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 802
				class69.invalidateWidget(var3); // L: 803
				return 1; // L: 804
			} else if (var0 == 1124) { // L: 806
				var3.transparencyBot = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 807
				class69.invalidateWidget(var3); // L: 808
				return 1; // L: 809
			} else if (var0 == 1125) { // L: 811
				var13 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 812
				class478 var11 = (class478)World.findEnumerated(UrlRequest.FillMode_values(), var13); // L: 813
				if (var11 != null) { // L: 814
					var3.fillMode = var11; // L: 815
					class69.invalidateWidget(var3); // L: 816
				}

				return 1; // L: 818
			} else {
				boolean var8;
				if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) { // L: 820
					var8 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 821
					var3.field3575 = var8; // L: 822
					return 1; // L: 823
				} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) { // L: 825
					var8 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 826
					var3.modelTransparency = var8; // L: 827
					return 1; // L: 828
				} else if (var0 == 1129) { // L: 830
					var3.field3578 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 831
					class69.invalidateWidget(var3); // L: 832
					return 1; // L: 833
				} else if (var0 == 1130) { // L: 835
					var3.method6285(Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize], TaskHandler.urlRequester, class154.method3301()); // L: 836
					return 1; // L: 837
				} else if (var0 == 1131) { // L: 839
					class87.Interpreter_intStackSize -= 2; // L: 840
					var3.method6170(Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]); // L: 841
					return 1; // L: 842
				} else if (var0 == 1132) { // L: 844
					var3.method6162(Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize], Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]); // L: 845
					return 1; // L: 846
				} else {
					class298 var12;
					if (var0 == 1133) { // L: 848
						--class87.Interpreter_intStackSize; // L: 849
						var12 = var3.method6293(); // L: 850
						if (var12 != null) { // L: 851
							var12.field3454 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 852
							class69.invalidateWidget(var3); // L: 853
						}

						return 1; // L: 855
					} else if (var0 == 1134) { // L: 857
						--class87.Interpreter_intStackSize; // L: 858
						var12 = var3.method6293(); // L: 859
						if (var12 != null) { // L: 860
							var12.field3456 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 861
							class69.invalidateWidget(var3); // L: 862
						}

						return 1; // L: 864
					} else if (var0 == 1135) { // L: 866
						--Interpreter.Interpreter_stringStackSize; // L: 867
						var10 = var3.method6167(); // L: 868
						if (var10 != null) { // L: 869
							var3.text2 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize]; // L: 870
						}

						return 1; // L: 872
					} else if (var0 == 1136) { // L: 874
						--class87.Interpreter_intStackSize; // L: 875
						var12 = var3.method6293(); // L: 876
						if (var12 != null) { // L: 877
							var12.field3455 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 878
							class69.invalidateWidget(var3); // L: 879
						}

						return 1; // L: 881
					} else if (var0 == 1137) { // L: 883
						--class87.Interpreter_intStackSize; // L: 884
						var10 = var3.method6167(); // L: 885
						if (var10 != null && var10.method5886(Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize])) { // L: 886
							class69.invalidateWidget(var3); // L: 887
						}

						return 1; // L: 889
					} else if (var0 == 1138) { // L: 891
						--class87.Interpreter_intStackSize; // L: 892
						var10 = var3.method6167(); // L: 893
						if (var10 != null && var10.method5887(Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize])) { // L: 894
							class69.invalidateWidget(var3); // L: 895
						}

						return 1; // L: 897
					} else if (var0 == 1139) { // L: 899
						--class87.Interpreter_intStackSize; // L: 900
						var10 = var3.method6167(); // L: 901
						if (var10 != null && var10.method5888(Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize])) { // L: 902
							class69.invalidateWidget(var3); // L: 903
						}

						return 1; // L: 905
					} else {
						class303 var6;
						if (var0 == 1140) { // L: 907
							var8 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 908
							Client.field572.method4068(); // L: 909
							var6 = var3.method6167(); // L: 910
							if (var6 != null && var6.method5880(var8)) { // L: 911
								if (var8) { // L: 912
									Client.field572.method4066(var3); // L: 913
								}

								class69.invalidateWidget(var3); // L: 915
							}

							return 1; // L: 917
						} else if (var0 == 1141) { // L: 919
							var8 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 920
							if (!var8 && Client.field572.method4067() == var3) { // L: 921
								Client.field572.method4068(); // L: 922
								class69.invalidateWidget(var3); // L: 923
							}

							var6 = var3.method6167(); // L: 925
							if (var6 != null) { // L: 926
								var6.method5881(var8); // L: 927
							}

							return 1; // L: 929
						} else if (var0 == 1142) { // L: 931
							class87.Interpreter_intStackSize -= 2; // L: 932
							var10 = var3.method6167(); // L: 933
							if (var10 != null && var10.method5904(Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1])) { // L: 934
								class69.invalidateWidget(var3); // L: 935
							}

							return 1; // L: 937
						} else if (var0 == 1143) { // L: 939
							--class87.Interpreter_intStackSize; // L: 940
							var10 = var3.method6167(); // L: 941
							if (var10 != null && var10.method5904(Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize])) { // L: 942
								class69.invalidateWidget(var3); // L: 943
							}

							return 1; // L: 945
						} else if (var0 == 1144) { // L: 947
							--class87.Interpreter_intStackSize; // L: 948
							var10 = var3.method6167(); // L: 949
							if (var10 != null) { // L: 950
								var10.method6015(Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]); // L: 951
								class69.invalidateWidget(var3); // L: 952
							}

							return 1; // L: 954
						} else if (var0 == 1145) { // L: 956
							--class87.Interpreter_intStackSize; // L: 957
							var10 = var3.method6167(); // L: 958
							if (var10 != null) { // L: 959
								var10.method5892(Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]); // L: 960
							}

							return 1; // L: 962
						} else if (var0 == 1146) { // L: 964
							--class87.Interpreter_intStackSize; // L: 965
							var10 = var3.method6167(); // L: 966
							if (var10 != null) { // L: 967
								var10.method6044(Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]); // L: 968
							}

							return 1; // L: 970
						} else if (var0 == 1147) { // L: 972
							--class87.Interpreter_intStackSize; // L: 973
							var10 = var3.method6167(); // L: 974
							if (var10 != null) { // L: 975
								var10.method5941(Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]); // L: 976
								class69.invalidateWidget(var3); // L: 977
							}

							return 1; // L: 979
						} else {
							class28 var5;
							if (var0 == 1148) { // L: 981
								class87.Interpreter_intStackSize -= 2; // L: 982
								var5 = var3.method6187(); // L: 983
								if (var5 != null) { // L: 984
									var5.method400(Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]); // L: 985
								}

								return 1; // L: 987
							} else if (var0 == 1149) { // L: 989
								class87.Interpreter_intStackSize -= 2; // L: 990
								var5 = var3.method6187(); // L: 991
								if (var5 != null) { // L: 992
									var5.method394((char)Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]); // L: 993
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

	@ObfuscatedName("mn")
	@ObfuscatedSignature(
		descriptor = "(Lkd;I)Z",
		garbageValue = "1009858394"
	)
	static final boolean method2583(Widget var0) {
		int var1 = var0.contentType; // L: 12342
		if (var1 == 205) { // L: 12343
			Client.logoutTimer = 250; // L: 12344
			return true; // L: 12345
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) { // L: 12347
				var2 = (var1 - 300) / 2; // L: 12348
				var3 = var1 & 1; // L: 12349
				Client.playerAppearance.changeAppearance(var2, var3 == 1); // L: 12350
			}

			if (var1 >= 314 && var1 <= 323) { // L: 12352
				var2 = (var1 - 314) / 2; // L: 12353
				var3 = var1 & 1; // L: 12354
				Client.playerAppearance.method5852(var2, var3 == 1); // L: 12355
			}

			if (var1 == 324) { // L: 12357
				Client.playerAppearance.method5853(0);
			}

			if (var1 == 325) { // L: 12358
				Client.playerAppearance.method5853(1);
			}

			if (var1 == 326) { // L: 12359
				PacketBufferNode var4 = class136.getPacketBufferNode(ClientPacket.field3050, Client.packetWriter.isaacCipher); // L: 12361
				Client.playerAppearance.write(var4.packetBuffer); // L: 12362
				Client.packetWriter.addNode(var4); // L: 12363
				return true; // L: 12364
			} else {
				return false; // L: 12366
			}
		}
	}
}
