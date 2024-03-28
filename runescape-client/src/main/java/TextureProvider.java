import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("je")
@Implements("TextureProvider")
public class TextureProvider implements TextureLoader {
	@ObfuscatedName("aw")
	static byte[][][] field2750;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[Ljk;"
	)
	@Export("textures")
	Texture[] textures;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("deque")
	NodeDeque deque;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -296837493
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -881924737
	)
	@Export("remaining")
	int remaining;
	@ObfuscatedName("an")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 69133945
	)
	@Export("textureSize")
	int textureSize;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("archive")
	AbstractArchive archive;

	@ObfuscatedSignature(
		descriptor = "(Loc;Loc;IDI)V"
	)
	public TextureProvider(AbstractArchive var1, AbstractArchive var2, int var3, double var4, int var6) {
		this.deque = new NodeDeque(); // L: 9
		this.remaining = 0; // L: 11
		this.brightness = 1.0D; // L: 12
		this.textureSize = 128; // L: 13
		this.archive = var2; // L: 17
		this.capacity = var3; // L: 18
		this.remaining = this.capacity; // L: 19
		this.brightness = var4; // L: 20
		this.textureSize = var6; // L: 21
		int[] var7 = var1.getGroupFileIds(0); // L: 22
		if (var7 != null) { // L: 23
			int var8 = var7.length; // L: 24
			this.textures = new Texture[var1.getGroupFileCount(0)]; // L: 25

			for (int var9 = 0; var9 < var8; ++var9) { // L: 26
				Buffer var10 = new Buffer(var1.takeFile(0, var7[var9])); // L: 27
				this.textures[var7[var9]] = new Texture(var10); // L: 28
			}
		} else {
			this.textures = new Texture[0]; // L: 32
		}

	} // L: 34

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1282794497"
	)
	@Export("getLoadedPercentage")
	public int getLoadedPercentage() {
		if (this.textures.length == 0) { // L: 37
			return 100;
		} else {
			int var1 = 0; // L: 38
			int var2 = 0; // L: 39
			Texture[] var3 = this.textures; // L: 41

			for (int var4 = 0; var4 < var3.length; ++var4) { // L: 42
				Texture var5 = var3[var4]; // L: 43
				if (var5 != null && var5.fileIds != null) { // L: 45
					var1 += var5.fileIds.length; // L: 46
					int[] var6 = var5.fileIds; // L: 48

					for (int var7 = 0; var7 < var6.length; ++var7) { // L: 49
						int var8 = var6[var7]; // L: 50
						if (this.archive.method6957(var8)) { // L: 52
							++var2; // L: 53
						}
					}
				}
			}

			if (var1 == 0) { // L: 61
				return 0;
			} else {
				return var2 * 100 / var1; // L: 62
			}
		}
	}

	@ObfuscatedName("ah")
	@Export("setBrightness")
	public void setBrightness(double var1) {
		this.brightness = var1; // L: 66
		this.clear(); // L: 67
	} // L: 68

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "-1101959318"
	)
	@Export("getTexturePixels")
	public int[] getTexturePixels(int var1) {
		Texture var2 = this.textures[var1]; // L: 71
		if (var2 != null) {
			if (var2.pixels != null) {
				this.deque.addLast(var2);
				var2.isLoaded = true; // L: 75
				return var2.pixels;
			}

			boolean var3 = var2.load(this.brightness, this.textureSize, this.archive);
			if (var3) {
				if (this.remaining == 0) {
					Texture var4 = (Texture)this.deque.removeFirst();
					var4.reset();
				} else {
					--this.remaining; // L: 84
				}

				this.deque.addLast(var2);
				var2.isLoaded = true;
				return var2.pixels; // L: 87
			}
		}

		return null; // L: 90
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2073193625"
	)
	@Export("getAverageTextureRGB")
	public int getAverageTextureRGB(int var1) {
		return this.textures[var1] != null ? this.textures[var1].averageRGB : 0; // L: 94 95
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "38"
	)
	public boolean vmethod5205(int var1) {
		return this.textures[var1].field2569; // L: 99
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1647932846"
	)
	@Export("isLowDetail")
	public boolean isLowDetail(int var1) {
		return this.textureSize == 64; // L: 103
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "990414333"
	)
	@Export("clear")
	public void clear() {
		for (int var1 = 0; var1 < this.textures.length; ++var1) { // L: 107
			if (this.textures[var1] != null) { // L: 108
				this.textures[var1].reset();
			}
		}

		this.deque = new NodeDeque(); // L: 110
		this.remaining = this.capacity; // L: 111
	} // L: 112

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1061631271"
	)
	@Export("animate")
	public void animate(int var1) {
		for (int var2 = 0; var2 < this.textures.length; ++var2) { // L: 115
			Texture var3 = this.textures[var2]; // L: 116
			if (var3 != null && var3.animationDirection != 0 && var3.isLoaded) { // L: 117
				var3.animate(var1); // L: 118
				var3.isLoaded = false; // L: 119
			}
		}

	} // L: 122

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lun;IB)V",
		garbageValue = "-15"
	)
	@Export("updatePlayers")
	static final void updatePlayers(PacketBuffer var0, int var1) {
		int var2 = var0.offset; // L: 72
		Players.Players_pendingUpdateCount = 0; // L: 73
		Login.method2160(var0); // L: 74

		for (int var3 = 0; var3 < Players.Players_pendingUpdateCount; ++var3) { // L: 76
			int var4 = Players.Players_pendingUpdateIndices[var3]; // L: 77
			Player var5 = Client.players[var4]; // L: 78
			int var6 = var0.readUnsignedByte(); // L: 79
			if ((var6 & 1) != 0) { // L: 80
				var6 += var0.readUnsignedByte() << 8;
			}

			if ((var6 & 2048) != 0) {
				var6 += var0.readUnsignedByte() << 16; // L: 81
			}

			class204.method3848(var0, var4, var5, var6); // L: 82
		}

		if (var0.offset - var2 != var1) { // L: 85
			throw new RuntimeException(var0.offset - var2 + " " + var1); // L: 86
		}
	} // L: 88

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZI)I",
		garbageValue = "739287375"
	)
	static int method4931(int var0, Script var1, boolean var2) {
		int var4 = -1; // L: 626
		Widget var3;
		if (var0 >= 2000) { // L: 627
			var0 -= 1000; // L: 628
			var4 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 629
			var3 = class243.field2620.method6281(var4); // L: 630
		} else {
			var3 = var2 ? class475.scriptDotWidget : class535.field5236; // L: 632
		}

		int var23;
		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) { // L: 633
			class19.Interpreter_intStackSize -= 2; // L: 634
			var23 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 635
			int var16 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 636
			if (var3.type == 12) { // L: 637
				class347 var17 = var3.method6667(); // L: 638
				if (var17 != null && var17.method6373(var23, var16)) { // L: 639
					WorldMapData_0.invalidateWidget(var3); // L: 640
				}
			} else {
				var3.scrollX = var23; // L: 644
				if (var3.scrollX > var3.scrollWidth - var3.width) { // L: 645
					var3.scrollX = var3.scrollWidth - var3.width;
				}

				if (var3.scrollX < 0) { // L: 646
					var3.scrollX = 0;
				}

				var3.scrollY = var16; // L: 647
				if (var3.scrollY > var3.scrollHeight - var3.height) { // L: 648
					var3.scrollY = var3.scrollHeight - var3.height;
				}

				if (var3.scrollY < 0) { // L: 649
					var3.scrollY = 0;
				}

				WorldMapData_0.invalidateWidget(var3); // L: 650
			}

			return 1; // L: 652
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) {
			var3.color = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 655
			WorldMapData_0.invalidateWidget(var3); // L: 656
			return 1; // L: 657
		} else if (var0 == ScriptOpcodes.CC_SETFILL) {
			var3.fill = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize] == 1; // L: 660
			WorldMapData_0.invalidateWidget(var3); // L: 661
			return 1; // L: 662
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) {
			var3.transparencyTop = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 665
			WorldMapData_0.invalidateWidget(var3); // L: 666
			return 1; // L: 667
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) {
			var3.lineWid = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 670
			WorldMapData_0.invalidateWidget(var3); // L: 671
			return 1; // L: 672
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) {
			var3.spriteId2 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 675
			WorldMapData_0.invalidateWidget(var3); // L: 676
			return 1; // L: 677
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) {
			var3.spriteAngle = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 680
			WorldMapData_0.invalidateWidget(var3); // L: 681
			return 1; // L: 682
		} else if (var0 == ScriptOpcodes.CC_SETTILING) {
			var3.spriteTiling = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize] == 1; // L: 685
			WorldMapData_0.invalidateWidget(var3); // L: 686
			return 1; // L: 687
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) {
			var3.modelType = 1; // L: 690
			var3.modelId = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 691
			WorldMapData_0.invalidateWidget(var3); // L: 692
			return 1; // L: 693
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) {
			class19.Interpreter_intStackSize -= 6; // L: 696
			var3.modelOffsetX = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 697
			var3.modelOffsetY = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 698
			var3.modelAngleX = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 2]; // L: 699
			var3.modelAngleY = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 3]; // L: 700
			var3.modelAngleZ = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 4]; // L: 701
			var3.modelZoom = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 5]; // L: 702
			WorldMapData_0.invalidateWidget(var3); // L: 703
			return 1; // L: 704
		} else if (var0 == ScriptOpcodes.CC_SETMODELANIM) {
			var23 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 707
			if (var23 != var3.sequenceId) { // L: 708
				var3.sequenceId = var23; // L: 709
				var3.modelFrame = 0; // L: 710
				var3.modelFrameCycle = 0; // L: 711
				WorldMapData_0.invalidateWidget(var3); // L: 712
			}

			return 1; // L: 714
		} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) {
			var3.modelOrthog = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize] == 1; // L: 717
			WorldMapData_0.invalidateWidget(var3); // L: 718
			return 1; // L: 719
		} else {
			String var15;
			class347 var21;
			if (var0 == ScriptOpcodes.CC_SETTEXT) {
				var15 = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize]; // L: 722
				if (var3.type == 12) { // L: 723
					var21 = var3.method6667(); // L: 724
					if (var21 != null && var21.method6513()) { // L: 725
						var21.method6366(var15); // L: 726
					} else {
						var3.text = var15; // L: 729
					}

					WorldMapData_0.invalidateWidget(var3); // L: 731
				} else if (!var15.equals(var3.text)) { // L: 733
					var3.text = var15; // L: 734
					WorldMapData_0.invalidateWidget(var3); // L: 735
				}

				return 1; // L: 737
			} else {
				class347 var19;
				if (var0 == ScriptOpcodes.CC_SETTEXTFONT) {
					var3.fontId = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 740
					if (var3.type == 12) { // L: 741
						var19 = var3.method6667(); // L: 742
						if (var19 != null) { // L: 743
							var19.method6380(); // L: 744
						}
					}

					WorldMapData_0.invalidateWidget(var3); // L: 747
					return 1; // L: 748
				} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) {
					class19.Interpreter_intStackSize -= 3; // L: 751
					if (var3.type == 12) { // L: 752
						var19 = var3.method6667(); // L: 753
						if (var19 != null) { // L: 754
							var19.method6374(Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]); // L: 755
							var19.method6375(Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 2]); // L: 756
						}
					} else {
						var3.textXAlignment = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 760
						var3.textYAlignment = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 761
						var3.textLineHeight = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 2]; // L: 762
					}

					WorldMapData_0.invalidateWidget(var3); // L: 764
					return 1; // L: 765
				} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) {
					var3.textShadowed = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize] == 1; // L: 768
					WorldMapData_0.invalidateWidget(var3); // L: 769
					return 1; // L: 770
				} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) {
					var3.outline = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 773
					WorldMapData_0.invalidateWidget(var3); // L: 774
					return 1; // L: 775
				} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) {
					var3.spriteShadow = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 778
					WorldMapData_0.invalidateWidget(var3); // L: 779
					return 1; // L: 780
				} else if (var0 == ScriptOpcodes.CC_SETVFLIP) {
					var3.spriteFlipV = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize] == 1; // L: 783
					WorldMapData_0.invalidateWidget(var3); // L: 784
					return 1; // L: 785
				} else if (var0 == ScriptOpcodes.CC_SETHFLIP) {
					var3.spriteFlipH = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize] == 1; // L: 788
					WorldMapData_0.invalidateWidget(var3); // L: 789
					return 1; // L: 790
				} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) {
					class19.Interpreter_intStackSize -= 2; // L: 793
					var3.scrollWidth = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 794
					var3.scrollHeight = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 795
					WorldMapData_0.invalidateWidget(var3); // L: 796
					if (var4 != -1 && var3.type == 0) { // L: 797
						IsaacCipher.revalidateWidgetScroll(class243.field2620.field3645[var4 >> 16], var3, false);
					}

					return 1; // L: 798
				} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) {
					class67.resumePauseWidget(var3.id, var3.childIndex); // L: 801
					Client.meslayerContinueWidget = var3; // L: 802
					WorldMapData_0.invalidateWidget(var3); // L: 803
					return 1; // L: 804
				} else if (var0 == 1122) {
					var3.spriteId = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 807
					WorldMapData_0.invalidateWidget(var3); // L: 808
					return 1; // L: 809
				} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) {
					var3.color2 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 812
					WorldMapData_0.invalidateWidget(var3); // L: 813
					return 1; // L: 814
				} else if (var0 == 1124) {
					var3.transparencyBot = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 817
					WorldMapData_0.invalidateWidget(var3); // L: 818
					return 1; // L: 819
				} else if (var0 == 1125) {
					var23 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 822
					class546 var22 = (class546)KitDefinition.findEnumerated(class234.FillMode_values(), var23); // L: 823
					if (var22 != null) { // L: 824
						var3.fillMode = var22; // L: 825
						WorldMapData_0.invalidateWidget(var3); // L: 826
					}

					return 1; // L: 828
				} else {
					boolean var14;
					if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) {
						var14 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize] == 1; // L: 831
						var3.field3862 = var14; // L: 832
						return 1; // L: 833
					} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) {
						var14 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize] == 1; // L: 836
						var3.modelTransparency = var14; // L: 837
						return 1; // L: 838
					} else if (var0 == 1129) {
						var3.field3780 = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize]; // L: 841
						WorldMapData_0.invalidateWidget(var3); // L: 842
						return 1; // L: 843
					} else if (var0 == 1130) {
						var3.method6662(Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize], "", class94.urlRequester, Varcs.method2752()); // L: 846
						return 1; // L: 847
					} else if (var0 == 1131) {
						class19.Interpreter_intStackSize -= 2; // L: 850
						var3.swapItems(Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]); // L: 851
						return 1; // L: 852
					} else if (var0 == 1132) {
						var3.method6659(Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize], Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]); // L: 855
						return 1; // L: 856
					} else {
						class341 var20;
						if (var0 == 1133) {
							--class19.Interpreter_intStackSize; // L: 859
							var20 = var3.method6699(); // L: 860
							if (var20 != null) { // L: 861
								var20.field3655 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 862
								WorldMapData_0.invalidateWidget(var3); // L: 863
							}

							return 1; // L: 865
						} else if (var0 == 1134) {
							--class19.Interpreter_intStackSize; // L: 868
							var20 = var3.method6699(); // L: 869
							if (var20 != null) { // L: 870
								var20.field3656 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 871
								WorldMapData_0.invalidateWidget(var3); // L: 872
							}

							return 1; // L: 874
						} else if (var0 == 1135) {
							--AbstractWorldMapIcon.Interpreter_stringStackSize; // L: 877
							var19 = var3.method6667(); // L: 878
							if (var19 != null) { // L: 879
								var3.field3807 = Interpreter.Interpreter_stringStack[AbstractWorldMapIcon.Interpreter_stringStackSize]; // L: 880
							}

							return 1; // L: 882
						} else if (var0 == 1136) {
							--class19.Interpreter_intStackSize; // L: 885
							var20 = var3.method6699(); // L: 886
							if (var20 != null) { // L: 887
								var20.field3657 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 888
								WorldMapData_0.invalidateWidget(var3); // L: 889
							}

							return 1; // L: 891
						} else if (var0 == 1137) {
							--class19.Interpreter_intStackSize; // L: 894
							var19 = var3.method6667(); // L: 895
							if (var19 != null && var19.method6370(Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize])) { // L: 896
								WorldMapData_0.invalidateWidget(var3); // L: 897
							}

							return 1; // L: 899
						} else if (var0 == 1138) {
							--class19.Interpreter_intStackSize; // L: 902
							var19 = var3.method6667(); // L: 903
							if (var19 != null && var19.method6390(Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize])) { // L: 904
								WorldMapData_0.invalidateWidget(var3); // L: 905
							}

							return 1; // L: 907
						} else if (var0 == 1139) {
							--class19.Interpreter_intStackSize; // L: 910
							var19 = var3.method6667(); // L: 911
							if (var19 != null && var19.method6520(Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize])) { // L: 912
								WorldMapData_0.invalidateWidget(var3); // L: 913
							}

							return 1; // L: 915
						} else if (var0 == 1140) {
							var14 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize] == 1; // L: 918
							Client.field749.method4282(); // L: 919
							var21 = var3.method6667(); // L: 920
							if (var21 != null && var21.method6486(var14)) { // L: 921
								if (var14) { // L: 922
									Client.field749.method4278(var3); // L: 923
								}

								WorldMapData_0.invalidateWidget(var3); // L: 925
							}

							return 1; // L: 927
						} else if (var0 == 1141) {
							var14 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize] == 1; // L: 930
							if (!var14 && Client.field749.method4279() == var3) { // L: 931
								Client.field749.method4282(); // L: 932
								WorldMapData_0.invalidateWidget(var3); // L: 933
							}

							var21 = var3.method6667(); // L: 935
							if (var21 != null) { // L: 936
								var21.method6365(var14); // L: 937
							}

							return 1; // L: 939
						} else if (var0 == 1142) {
							class19.Interpreter_intStackSize -= 2; // L: 942
							var19 = var3.method6667(); // L: 943
							if (var19 != null && var19.method6388(Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1])) { // L: 944
								WorldMapData_0.invalidateWidget(var3); // L: 945
							}

							return 1; // L: 947
						} else if (var0 == 1143) {
							--class19.Interpreter_intStackSize; // L: 950
							var19 = var3.method6667(); // L: 951
							if (var19 != null && var19.method6388(Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize])) { // L: 952
								WorldMapData_0.invalidateWidget(var3); // L: 953
							}

							return 1; // L: 955
						} else if (var0 == 1144) {
							--class19.Interpreter_intStackSize; // L: 958
							var19 = var3.method6667(); // L: 959
							if (var19 != null) { // L: 960
								var19.method6377(Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]); // L: 961
								WorldMapData_0.invalidateWidget(var3); // L: 962
							}

							return 1; // L: 964
						} else if (var0 == 1145) {
							--class19.Interpreter_intStackSize; // L: 967
							var19 = var3.method6667(); // L: 968
							if (var19 != null) { // L: 969
								var19.method6376(Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]); // L: 970
							}

							return 1; // L: 972
						} else if (var0 == 1146) {
							--class19.Interpreter_intStackSize; // L: 975
							var19 = var3.method6667(); // L: 976
							if (var19 != null) { // L: 977
								var19.method6379(Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]); // L: 978
							}

							return 1; // L: 980
						} else if (var0 == 1147) {
							--class19.Interpreter_intStackSize; // L: 983
							var19 = var3.method6667(); // L: 984
							if (var19 != null) { // L: 985
								var19.method6465(Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]); // L: 986
								WorldMapData_0.invalidateWidget(var3); // L: 987
							}

							return 1; // L: 989
						} else {
							class27 var18;
							if (var0 == 1148) {
								class19.Interpreter_intStackSize -= 2; // L: 992
								var18 = var3.method6682(); // L: 993
								if (var18 != null) { // L: 994
									var18.method396(Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]); // L: 995
								}

								return 1; // L: 997
							} else if (var0 == 1149) {
								class19.Interpreter_intStackSize -= 2; // L: 1000
								var18 = var3.method6682(); // L: 1001
								if (var18 != null) { // L: 1002
									var18.method402((char)Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]); // L: 1003
								}

								return 1; // L: 1005
							} else if (var0 == 1150) {
								var3.method6645(Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize], class94.urlRequester); // L: 1008
								return 1; // L: 1009
							} else if (var0 == 1151) {
								AbstractWorldMapIcon.Interpreter_stringStackSize -= 3; // L: 1012
								var15 = Interpreter.Interpreter_stringStack[AbstractWorldMapIcon.Interpreter_stringStackSize]; // L: 1013
								String var13 = Interpreter.Interpreter_stringStack[AbstractWorldMapIcon.Interpreter_stringStackSize + 1]; // L: 1014
								String var7 = Interpreter.Interpreter_stringStack[AbstractWorldMapIcon.Interpreter_stringStackSize + 2]; // L: 1015
								long var8 = Varcs.method2752(); // L: 1016
								long var10 = class421.method7807(); // L: 1017
								String var12 = ObjectSound.method1919().method8630(ObjectSound.method1919().field4969); // L: 1018
								if (-1L != var8) { // L: 1019
									var15 = var15.replaceAll("%userid%", Long.toString(var8)); // L: 1020
								}

								if (var10 != -1L) { // L: 1022
									var15 = var15.replaceAll("%userhash%", Long.toString(var10)); // L: 1023
								}

								if (!var12.isEmpty()) { // L: 1025
									var15 = var15.replaceAll("%deviceid%", var12); // L: 1026
								}

								var3.method6663(var15, var13, var7, var12, Long.toString(var10), class94.urlRequester); // L: 1028
								return 1; // L: 1029
							} else if (var0 == 1152) {
								if (var3.type != 11) { // L: 1032
									throw new RuntimeException(); // L: 1038
								} else {
									class171 var5 = var3.method6769(); // L: 1033
									boolean var6 = var5 != null && AttackOption.method2678().method3564(var5.method3452()); // L: 1034
									Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var6 ? 1 : 0; // L: 1035
									return 1; // L: 1040
								}
							} else {
								return 2; // L: 1042
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)[Lvg;",
		garbageValue = "902921219"
	)
	static SpritePixels[] method4930() {
		SpritePixels[] var0 = new SpritePixels[class549.SpriteBuffer_spriteCount]; // L: 151

		for (int var1 = 0; var1 < class549.SpriteBuffer_spriteCount; ++var1) { // L: 152
			SpritePixels var2 = var0[var1] = new SpritePixels(); // L: 153
			var2.width = class549.SpriteBuffer_spriteWidth; // L: 154
			var2.height = class549.SpriteBuffer_spriteHeight; // L: 155
			var2.xOffset = class549.SpriteBuffer_xOffsets[var1]; // L: 156
			var2.yOffset = class549.SpriteBuffer_yOffsets[var1]; // L: 157
			var2.subWidth = class549.SpriteBuffer_spriteWidths[var1]; // L: 158
			var2.subHeight = Ignored.SpriteBuffer_spriteHeights[var1]; // L: 159
			int var3 = var2.subWidth * var2.subHeight; // L: 160
			byte[] var4 = class549.SpriteBuffer_pixels[var1]; // L: 161
			var2.pixels = new int[var3]; // L: 162

			for (int var5 = 0; var5 < var3; ++var5) { // L: 163
				var2.pixels[var5] = class126.SpriteBuffer_spritePalette[var4[var5] & 255];
			}
		}

		class549.SpriteBuffer_xOffsets = null; // L: 166
		class549.SpriteBuffer_yOffsets = null; // L: 167
		class549.SpriteBuffer_spriteWidths = null; // L: 168
		Ignored.SpriteBuffer_spriteHeights = null; // L: 169
		class126.SpriteBuffer_spritePalette = null; // L: 170
		class549.SpriteBuffer_pixels = null; // L: 171
		return var0; // L: 173
	}

	@ObfuscatedName("ok")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-123926135"
	)
	static void method4928(int var0) {
		Client.oculusOrbState = var0; // L: 12916
	} // L: 12917
}
