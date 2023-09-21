import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hz")
@Implements("KitDefinition")
public class KitDefinition extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("KitDefinition_archive")
	static AbstractArchive KitDefinition_archive;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("KitDefinition_modelsArchive")
	static AbstractArchive KitDefinition_modelsArchive;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("KitDefinition_cached")
	public static EvictingDualNodeHashTable KitDefinition_cached;
	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "[Lun;"
	)
	@Export("mapSceneSprites")
	static IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1660729609
	)
	@Export("bodypartID")
	public int bodypartID;
	@ObfuscatedName("ah")
	@Export("models2")
	int[] models2;
	@ObfuscatedName("ar")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("ab")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("am")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("av")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("ag")
	@Export("models")
	int[] models;
	@ObfuscatedName("aa")
	@Export("nonSelectable")
	public boolean nonSelectable;

	static {
		KitDefinition_cached = new EvictingDualNodeHashTable(64); // L: 14
	}

	KitDefinition() {
		this.bodypartID = -1; // L: 15
		this.models = new int[]{-1, -1, -1, -1, -1};
		this.nonSelectable = false;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lul;B)V",
		garbageValue = "-80"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 46
			if (var2 == 0) { // L: 47
				return; // L: 50
			}

			this.decodeNext(var1, var2); // L: 48
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lul;IB)V",
		garbageValue = "4"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 53
			this.bodypartID = var1.readUnsignedByte();
		} else {
			int var3;
			int var4;
			if (var2 == 2) { // L: 54
				var3 = var1.readUnsignedByte(); // L: 55
				this.models2 = new int[var3]; // L: 56

				for (var4 = 0; var4 < var3; ++var4) { // L: 57
					this.models2[var4] = var1.readUnsignedShort();
				}
			} else if (var2 == 3) { // L: 59
				this.nonSelectable = true;
			} else if (var2 == 40) { // L: 60
				var3 = var1.readUnsignedByte(); // L: 61
				this.recolorFrom = new short[var3]; // L: 62
				this.recolorTo = new short[var3]; // L: 63

				for (var4 = 0; var4 < var3; ++var4) { // L: 64
					this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 65
					this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 66
				}
			} else if (var2 == 41) { // L: 69
				var3 = var1.readUnsignedByte(); // L: 70
				this.retextureFrom = new short[var3]; // L: 71
				this.retextureTo = new short[var3]; // L: 72

				for (var4 = 0; var4 < var3; ++var4) { // L: 73
					this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 74
					this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 75
				}
			} else if (var2 >= 60 && var2 < 70) { // L: 78
				this.models[var2 - 60] = var1.readUnsignedShort();
			}
		}

	} // L: 80

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "699085118"
	)
	@Export("ready")
	public boolean ready() {
		if (this.models2 == null) { // L: 83
			return true;
		} else {
			boolean var1 = true; // L: 84

			for (int var2 = 0; var2 < this.models2.length; ++var2) { // L: 85
				if (!KitDefinition_modelsArchive.tryLoadFile(this.models2[var2], 0)) {
					var1 = false;
				}
			}

			return var1; // L: 86
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Ljw;",
		garbageValue = "1587109036"
	)
	@Export("getModelData")
	public ModelData getModelData() {
		if (this.models2 == null) { // L: 90
			return null;
		} else {
			ModelData[] var1 = new ModelData[this.models2.length]; // L: 91

			for (int var2 = 0; var2 < this.models2.length; ++var2) { // L: 92
				var1[var2] = ModelData.ModelData_get(KitDefinition_modelsArchive, this.models2[var2], 0);
			}

			ModelData var4;
			if (var1.length == 1) { // L: 94
				var4 = var1[0];
			} else {
				var4 = new ModelData(var1, var1.length); // L: 95
			}

			int var3;
			if (this.recolorFrom != null) { // L: 96
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) { // L: 97
					var4.recolor(this.recolorFrom[var3], this.recolorTo[var3]); // L: 98
				}
			}

			if (this.retextureFrom != null) { // L: 101
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) { // L: 102
					var4.retexture(this.retextureFrom[var3], this.retextureTo[var3]); // L: 103
				}
			}

			return var4; // L: 106
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-9"
	)
	public boolean method3687() {
		boolean var1 = true; // L: 110

		for (int var2 = 0; var2 < 5; ++var2) { // L: 111
			if (this.models[var2] != -1 && !KitDefinition_modelsArchive.tryLoadFile(this.models[var2], 0)) { // L: 112
				var1 = false;
			}
		}

		return var1; // L: 114
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(S)Ljw;",
		garbageValue = "2504"
	)
	@Export("getKitDefinitionModels")
	public ModelData getKitDefinitionModels() {
		ModelData[] var1 = new ModelData[5]; // L: 118
		int var2 = 0; // L: 119

		for (int var3 = 0; var3 < 5; ++var3) { // L: 120
			if (this.models[var3] != -1) { // L: 121
				var1[var2++] = ModelData.ModelData_get(KitDefinition_modelsArchive, this.models[var3], 0);
			}
		}

		ModelData var5 = new ModelData(var1, var2); // L: 123
		int var4;
		if (this.recolorFrom != null) { // L: 124
			for (var4 = 0; var4 < this.recolorFrom.length; ++var4) { // L: 125
				var5.recolor(this.recolorFrom[var4], this.recolorTo[var4]); // L: 126
			}
		}

		if (this.retextureFrom != null) { // L: 129
			for (var4 = 0; var4 < this.retextureFrom.length; ++var4) { // L: 130
				var5.retexture(this.retextureFrom[var4], this.retextureTo[var4]); // L: 131
			}
		}

		return var5; // L: 134
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Lie;",
		garbageValue = "-765907227"
	)
	public static FloorUnderlayDefinition method3706(int var0) {
		FloorUnderlayDefinition var1 = (FloorUnderlayDefinition)FloorUnderlayDefinition.field2129.get((long)var0); // L: 21
		if (var1 != null) { // L: 22
			return var1;
		} else {
			byte[] var2 = FloorUnderlayDefinition.field2130.takeFile(1, var0); // L: 23
			var1 = new FloorUnderlayDefinition(); // L: 24
			if (var2 != null) { // L: 25
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode(); // L: 26
			FloorUnderlayDefinition.field2129.put(var1, (long)var0); // L: 27
			return var1; // L: 28
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "769007597"
	)
	@Export("Widget_unpackTargetMask")
	public static int Widget_unpackTargetMask(int var0) {
		return var0 >> 11 & 63; // L: 13
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZS)I",
		garbageValue = "9029"
	)
	static int method3707(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.ADD) { // L: 3590
			Interpreter.Interpreter_intStackSize -= 2; // L: 3591
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3592
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3593
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 + var9; // L: 3594
			return 1; // L: 3595
		} else if (var0 == ScriptOpcodes.SUB) { // L: 3597
			Interpreter.Interpreter_intStackSize -= 2; // L: 3598
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3599
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3600
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 - var4; // L: 3601
			return 1; // L: 3602
		} else if (var0 == ScriptOpcodes.MULTIPLY) { // L: 3604
			Interpreter.Interpreter_intStackSize -= 2; // L: 3605
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3606
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3607
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 * var4; // L: 3608
			return 1; // L: 3609
		} else if (var0 == ScriptOpcodes.DIV) { // L: 3611
			Interpreter.Interpreter_intStackSize -= 2; // L: 3612
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3613
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3614
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 / var4; // L: 3615
			return 1; // L: 3616
		} else if (var0 == ScriptOpcodes.RANDOM) { // L: 3618
			var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3619
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var9); // L: 3620
			return 1; // L: 3621
		} else if (var0 == ScriptOpcodes.RANDOMINC) { // L: 3623
			var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3624
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var9 + 1)); // L: 3625
			return 1; // L: 3626
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) { // L: 3628
				Interpreter.Interpreter_intStackSize -= 5; // L: 3629
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3630
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3631
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3632
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 3633
				var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 4]; // L: 3634
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 + (var4 - var9) * (var7 - var5) / (var6 - var5); // L: 3635
				return 1; // L: 3636
			} else if (var0 == ScriptOpcodes.ADDPERCENT) { // L: 3638
				Interpreter.Interpreter_intStackSize -= 2; // L: 3639
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3640
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3641
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 + var9 * var4 / 100; // L: 3642
				return 1; // L: 3643
			} else if (var0 == ScriptOpcodes.SETBIT) { // L: 3645
				Interpreter.Interpreter_intStackSize -= 2; // L: 3646
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3647
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3648
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 | 1 << var4; // L: 3649
				return 1; // L: 3650
			} else if (var0 == ScriptOpcodes.CLEARBIT) { // L: 3652
				Interpreter.Interpreter_intStackSize -= 2; // L: 3653
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3654
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3655
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 & -1 - (1 << var4); // L: 3656
				return 1; // L: 3657
			} else if (var0 == ScriptOpcodes.TESTBIT) { // L: 3659
				Interpreter.Interpreter_intStackSize -= 2; // L: 3660
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3661
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3662
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var9 & 1 << var4) != 0 ? 1 : 0; // L: 3663
				return 1; // L: 3664
			} else if (var0 == ScriptOpcodes.MOD) { // L: 3666
				Interpreter.Interpreter_intStackSize -= 2; // L: 3667
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3668
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3669
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 % var4; // L: 3670
				return 1; // L: 3671
			} else if (var0 == ScriptOpcodes.POW) { // L: 3673
				Interpreter.Interpreter_intStackSize -= 2; // L: 3674
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3675
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3676
				if (var9 == 0) { // L: 3677
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, (double)var4); // L: 3678
				}

				return 1; // L: 3679
			} else if (var0 == ScriptOpcodes.INVPOW) { // L: 3681
				Interpreter.Interpreter_intStackSize -= 2; // L: 3682
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3683
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3684
				if (var9 == 0) { // L: 3685
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3686
					return 1; // L: 3687
				} else {
					switch(var4) { // L: 3689
					case 0:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Integer.MAX_VALUE; // L: 3707
						break; // L: 3708
					case 1:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9; // L: 3712
						break; // L: 3713
					case 2:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var9); // L: 3697
						break; // L: 3698
					case 3:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var9); // L: 3702
						break; // L: 3703
					case 4:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var9)); // L: 3692
						break;
					default:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, 1.0D / (double)var4); // L: 3717
					}

					return 1; // L: 3721
				}
			} else if (var0 == ScriptOpcodes.AND) { // L: 3723
				Interpreter.Interpreter_intStackSize -= 2; // L: 3724
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3725
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3726
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 & var4; // L: 3727
				return 1; // L: 3728
			} else if (var0 == ScriptOpcodes.OR) { // L: 3730
				Interpreter.Interpreter_intStackSize -= 2; // L: 3731
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3732
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3733
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 | var4; // L: 3734
				return 1; // L: 3735
			} else if (var0 == 4016) { // L: 3737
				Interpreter.Interpreter_intStackSize -= 2; // L: 3738
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3739
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3740
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 < var4 ? var9 : var4; // L: 3741
				return 1; // L: 3742
			} else if (var0 == 4017) { // L: 3744
				Interpreter.Interpreter_intStackSize -= 2; // L: 3745
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3746
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3747
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 > var4 ? var9 : var4; // L: 3748
				return 1; // L: 3749
			} else if (var0 == ScriptOpcodes.SCALE) { // L: 3751
				Interpreter.Interpreter_intStackSize -= 3; // L: 3752
				long var10 = (long)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3753
				long var12 = (long)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3754
				long var14 = (long)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3755
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)(var14 * var10 / var12); // L: 3756
				return 1; // L: 3757
			} else if (var0 == ScriptOpcodes.BITCOUNT) { // L: 3759
				var9 = WorldMapLabel.method5653(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 3760
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9; // L: 3761
				return 1; // L: 3762
			} else if (var0 == ScriptOpcodes.TOGGLEBIT) { // L: 3764
				Interpreter.Interpreter_intStackSize -= 2; // L: 3765
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3766
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3767
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 ^ 1 << var4; // L: 3768
				return 1; // L: 3769
			} else if (var0 == ScriptOpcodes.SETBIT_RANGE) { // L: 3771
				Interpreter.Interpreter_intStackSize -= 3; // L: 3772
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3773
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3774
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3775
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class345.method6580(var9, var4, var5); // L: 3776
				return 1; // L: 3777
			} else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) { // L: 3779
				Interpreter.Interpreter_intStackSize -= 3; // L: 3780
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3781
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3782
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3783
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class164.method3375(var9, var4, var5); // L: 3784
				return 1; // L: 3785
			} else if (var0 == ScriptOpcodes.GETBIT_RANGE) { // L: 3787
				Interpreter.Interpreter_intStackSize -= 3; // L: 3788
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3789
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3790
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3791
				var6 = 31 - var5; // L: 3792
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 << var6 >>> var6 + var4; // L: 3793
				return 1; // L: 3794
			} else if (var0 == 4030) { // L: 3796
				Interpreter.Interpreter_intStackSize -= 4; // L: 3797
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3798
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3799
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3800
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 3801
				var9 = class164.method3375(var9, var5, var6); // L: 3802
				var7 = class76.method2124(var6 - var5 + 1); // L: 3803
				if (var4 > var7) { // L: 3804
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 | var4 << var5; // L: 3805
				return 1; // L: 3806
			} else if (var0 == 4032) { // L: 3808
				Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = GameObject.method5195(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]); // L: 3809
				return 1; // L: 3810
			} else if (var0 == 4033) { // L: 3812
				Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = WorldMapLabelSize.method5221(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]); // L: 3813
				return 1; // L: 3814
			} else if (var0 == 4034) { // L: 3816
				Interpreter.Interpreter_intStackSize -= 2; // L: 3817
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3818
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3819
				var5 = HealthBar.method2618(var9, var4); // L: 3820
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5; // L: 3821
				return 1; // L: 3822
			} else if (var0 == 4035) { // L: 3824
				Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]); // L: 3825
				return 1; // L: 3826
			} else if (var0 == 4036) { // L: 3828
				String var3 = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize]; // L: 3829
				var4 = -1; // L: 3830
				if (AttackOption.isNumber(var3)) { // L: 3831
					var4 = class36.method686(var3); // L: 3832
				}

				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4; // L: 3834
				return 1; // L: 3835
			} else {
				return 2; // L: 3837
			}
		}
	}
}
