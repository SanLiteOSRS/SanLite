import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ca")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 66464725
	)
	@Export("id")
	int id;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 138730963
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 543043153
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -152487185
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1578002187
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1990585513
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1755264033
	)
	int field972;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 214178127
	)
	int field973;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -932015863
	)
	int field974;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1306387001
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1570300067
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 941385441
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 925751269
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1211907925
	)
	int field979;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -698893791
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("aj")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("au")
	@Export("x")
	double x;
	@ObfuscatedName("ay")
	@Export("y")
	double y;
	@ObfuscatedName("ap")
	@Export("z")
	double z;
	@ObfuscatedName("av")
	double field988;
	@ObfuscatedName("aa")
	double field980;
	@ObfuscatedName("aq")
	double field985;
	@ObfuscatedName("am")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("ac")
	double field989;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1600921187
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 349026613
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 11122815
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -462633923
	)
	@Export("frameCycle")
	int frameCycle;

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		this.isMoving = false; // L: 24
		this.frame = 0; // L: 36
		this.frameCycle = 0; // L: 37
		this.id = var1; // L: 40
		this.plane = var2; // L: 41
		this.sourceX = var3; // L: 42
		this.sourceY = var4; // L: 43
		this.sourceZ = var5; // L: 44
		this.cycleStart = var6; // L: 45
		this.cycleEnd = var7; // L: 46
		this.slope = var8; // L: 47
		this.startHeight = var9; // L: 48
		this.targetIndex = var10; // L: 49
		this.endHeight = var11; // L: 50
		this.isMoving = false; // L: 51
		int var12 = UserComparator3.SpotAnimationDefinition_get(this.id).sequence; // L: 52
		if (var12 != -1) { // L: 53
			this.sequenceDefinition = DevicePcmPlayerProvider.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null; // L: 54
		}

	} // L: 55

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
		this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, var12); // L: 58
		this.field979 = var10; // L: 59
	} // L: 60

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1281480726"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		this.field972 = var1; // L: 63
		this.field973 = var2; // L: 64
		this.field974 = var3; // L: 65
		double var5;
		if (!this.isMoving) { // L: 66
			var5 = (double)(this.field972 - this.sourceX); // L: 67
			double var7 = (double)(this.field973 - this.sourceY); // L: 68
			double var9 = Math.sqrt(var5 * var5 + var7 * var7); // L: 69
			this.x = (double)this.sourceX + var5 * (double)this.startHeight / var9; // L: 70
			this.y = var7 * (double)this.startHeight / var9 + (double)this.sourceY; // L: 71
			this.z = (double)this.sourceZ; // L: 72
		}

		var5 = (double)(this.cycleEnd + 1 - var4); // L: 74
		this.field988 = ((double)this.field972 - this.x) / var5; // L: 75
		this.field980 = ((double)this.field973 - this.y) / var5; // L: 76
		this.field985 = Math.sqrt(this.field980 * this.field980 + this.field988 * this.field988); // L: 77
		if (!this.isMoving) { // L: 78
			this.speedZ = -this.field985 * Math.tan((double)this.slope * 0.02454369D);
		}

		this.field989 = ((double)this.field974 - this.z - this.speedZ * var5) * 2.0D / (var5 * var5); // L: 79
	} // L: 80

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Ljn;",
		garbageValue = "1157175232"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = UserComparator3.SpotAnimationDefinition_get(this.id); // L: 113
		Model var2 = var1.getModel(this.frame); // L: 114
		if (var2 == null) { // L: 115
			return null;
		} else {
			var2.rotateZ(this.pitch); // L: 116
			return var2;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "141084497"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true; // L: 83
		this.x += this.field988 * (double)var1; // L: 84
		this.y += (double)var1 * this.field980; // L: 85
		this.z += this.speedZ * (double)var1 + this.field989 * 0.5D * (double)var1 * (double)var1; // L: 86
		this.speedZ += (double)var1 * this.field989; // L: 87
		this.yaw = (int)(Math.atan2(this.field988, this.field980) * 325.949D) + 1024 & 2047; // L: 88
		this.pitch = (int)(Math.atan2(this.speedZ, this.field985) * 325.949D) & 2047; // L: 89
		if (this.sequenceDefinition != null) { // L: 90
			if (!this.sequenceDefinition.isCachedModelIdSet()) { // L: 91
				this.frameCycle += var1; // L: 92

				while (true) {
					do {
						do {
							if (this.frameCycle <= this.sequenceDefinition.frameLengths[this.frame]) { // L: 93
								return; // L: 110
							}

							this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame]; // L: 94
							++this.frame; // L: 95
						} while(this.frame < this.sequenceDefinition.frameIds.length); // L: 96

						this.frame -= this.sequenceDefinition.frameCount; // L: 97
					} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length); // L: 98

					this.frame = 0;
				}
			} else {
				this.frame += var1; // L: 103
				int var2 = this.sequenceDefinition.method4232(); // L: 104
				if (this.frame >= var2) { // L: 105
					this.frame = var2 - this.sequenceDefinition.frameCount; // L: 106
				}
			}
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Lds;",
		garbageValue = "2086329573"
	)
	static ClientPreferences method2178() {
		AccessFile var0 = null; // L: 117
		ClientPreferences var1 = new ClientPreferences(); // L: 118

		try {
			var0 = ClanChannel.getPreferencesFile("", HorizontalAlignment.field2089.name, false); // L: 120
			byte[] var2 = new byte[(int)var0.length()]; // L: 121

			int var4;
			for (int var3 = 0; var3 < var2.length; var3 += var4) { // L: 122 123 126
				var4 = var0.read(var2, var3, var2.length - var3); // L: 124
				if (var4 == -1) {
					throw new IOException(); // L: 125
				}
			}

			var1 = new ClientPreferences(new Buffer(var2)); // L: 128
		} catch (Exception var6) { // L: 130
		}

		try {
			if (var0 != null) { // L: 132
				var0.close(); // L: 133
			}
		} catch (Exception var5) { // L: 136
		}

		return var1; // L: 137
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "250126113"
	)
	static final void method2177() {
		class6.method40("You can't add yourself to your own ignore list"); // L: 180
	} // L: 181

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZI)I",
		garbageValue = "-1456694734"
	)
	static int method2176(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) { // L: 4552
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = class11.loadWorlds() ? 1 : 0; // L: 4553
			return 1; // L: 4554
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) { // L: 4556
				var9 = class20.worldListStart(); // L: 4557
				if (var9 != null) { // L: 4558
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var9.id; // L: 4559
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var9.properties; // L: 4560
					Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var9.activity; // L: 4561
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var9.location; // L: 4562
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var9.population; // L: 4563
					Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var9.host; // L: 4564
				} else {
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = -1; // L: 4567
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 4568
					Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = ""; // L: 4569
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 4570
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 4571
					Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = ""; // L: 4572
				}

				return 1; // L: 4574
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) { // L: 4576
				var9 = UserComparator6.getNextWorldListWorld(); // L: 4577
				if (var9 != null) { // L: 4578
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var9.id; // L: 4579
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var9.properties; // L: 4580
					Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var9.activity; // L: 4581
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var9.location; // L: 4582
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var9.population; // L: 4583
					Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var9.host; // L: 4584
				} else {
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = -1; // L: 4587
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 4588
					Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = ""; // L: 4589
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 4590
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 4591
					Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = ""; // L: 4592
				}

				return 1; // L: 4594
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) { // L: 4596
					var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 4597
					var7 = null; // L: 4598

					for (var8 = 0; var8 < World.World_count; ++var8) { // L: 4599
						if (var3 == World.World_worlds[var8].id) { // L: 4600
							var7 = World.World_worlds[var8]; // L: 4601
							break;
						}
					}

					if (var7 != null) { // L: 4605
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var7.id; // L: 4606
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var7.properties; // L: 4607
						Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var7.activity; // L: 4608
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var7.location; // L: 4609
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var7.population; // L: 4610
						Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var7.host; // L: 4611
					} else {
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = -1; // L: 4614
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 4615
						Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = ""; // L: 4616
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 4617
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 4618
						Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = ""; // L: 4619
					}

					return 1; // L: 4621
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) { // L: 4623
					class19.Interpreter_intStackSize -= 4; // L: 4624
					var3 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 4625
					boolean var10 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1] == 1; // L: 4626
					var8 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 2]; // L: 4627
					boolean var6 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 3] == 1; // L: 4628
					WorldMapArea.sortWorldList(var3, var10, var8, var6); // L: 4629
					return 1; // L: 4630
				} else if (var0 != 6511) { // L: 4632
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) { // L: 4653
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize] == 1; // L: 4654
						return 1; // L: 4655
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) { // L: 4657
							class19.Interpreter_intStackSize -= 2; // L: 4658
							var3 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 4659
							var4 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 4660
							var5 = class127.getParamDefinition(var4); // L: 4661
							if (var5.isString()) { // L: 4662
								Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = UserComparator10.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4663
							} else {
								Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = UserComparator10.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4666
							}

							return 1; // L: 4668
						} else if (var0 == ScriptOpcodes.LC_PARAM) { // L: 4670
							class19.Interpreter_intStackSize -= 2; // L: 4671
							var3 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 4672
							var4 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 4673
							var5 = class127.getParamDefinition(var4); // L: 4674
							if (var5.isString()) { // L: 4675
								Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = MouseRecorder.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4676
							} else {
								Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = MouseRecorder.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4679
							}

							return 1; // L: 4681
						} else if (var0 == ScriptOpcodes.OC_PARAM) { // L: 4683
							class19.Interpreter_intStackSize -= 2; // L: 4684
							var3 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 4685
							var4 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 4686
							var5 = class127.getParamDefinition(var4); // L: 4687
							if (var5.isString()) { // L: 4688
								Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = class10.ItemComposition_get(var3).getStringParam(var4, var5.defaultStr); // L: 4689
							} else {
								Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = class10.ItemComposition_get(var3).getIntParam(var4, var5.defaultInt); // L: 4692
							}

							return 1; // L: 4694
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) { // L: 4696
							class19.Interpreter_intStackSize -= 2; // L: 4697
							var3 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 4698
							var4 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 4699
							var5 = class127.getParamDefinition(var4); // L: 4700
							if (var5.isString()) { // L: 4701
								Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = class136.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4702
							} else {
								Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = class136.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4705
							}

							return 1; // L: 4707
						} else if (var0 == ScriptOpcodes.ON_MOBILE) { // L: 4709
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0; // L: 4710
							return 1; // L: 4711
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) { // L: 4713
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = Client.clientType; // L: 4714
							return 1; // L: 4715
						} else if (var0 == 6520) { // L: 4717
							return 1; // L: 4718
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) { // L: 4720
							return 1; // L: 4721
						} else if (var0 == 6522) { // L: 4723
							--AbstractWorldMapIcon.Interpreter_stringStackSize; // L: 4724
							--class19.Interpreter_intStackSize; // L: 4725
							return 1; // L: 4726
						} else if (var0 == 6523) { // L: 4728
							--AbstractWorldMapIcon.Interpreter_stringStackSize; // L: 4729
							--class19.Interpreter_intStackSize; // L: 4730
							return 1; // L: 4731
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) { // L: 4733
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = -1; // L: 4734
							return 1; // L: 4735
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) { // L: 4737
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 1; // L: 4738
							return 1; // L: 4739
						} else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) { // L: 4741
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 1; // L: 4742
							return 1; // L: 4743
						} else if (var0 == 6527) { // L: 4745
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = Client.field794; // L: 4746
							return 1; // L: 4747
						} else {
							return 2; // L: 4749
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 4633
					if (var3 >= 0 && var3 < World.World_count) { // L: 4634
						var7 = World.World_worlds[var3]; // L: 4635
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var7.id; // L: 4636
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var7.properties; // L: 4637
						Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var7.activity; // L: 4638
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var7.location; // L: 4639
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var7.population; // L: 4640
						Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var7.host; // L: 4641
					} else {
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = -1; // L: 4644
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 4645
						Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = ""; // L: 4646
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 4647
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 4648
						Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = ""; // L: 4649
					}

					return 1; // L: 4651
				}
			}
		}
	}

	@ObfuscatedName("mn")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1129926855"
	)
	static boolean method2171(int var0) {
		for (int var1 = 0; var1 < Client.field611; ++var1) { // L: 12015
			if (Client.field767[var1] == var0) { // L: 12016
				return true;
			}
		}

		return false; // L: 12018
	}
}
