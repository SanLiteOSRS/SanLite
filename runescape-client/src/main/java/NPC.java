import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("co")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("su")
	@ObfuscatedGetter(
		intValue = 1781055488
	)
	static int field1261;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	@Export("definition")
	NPCComposition definition;
	@ObfuscatedName("q")
	String field1259;

	NPC() {
		this.field1259 = ""; // L: 11
	} // L: 13

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-61"
	)
	void method2412(String var1) {
		this.field1259 = var1 == null ? "" : var1; // L: 16
	} // L: 17

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Lhd;",
		garbageValue = "-842208187"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) { // L: 96
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? class14.SequenceDefinition_get(super.sequence) : null; // L: 97
			SequenceDefinition var2 = super.movementSequence == -1 || super.idleSequence == super.movementSequence && var1 != null ? null : class14.SequenceDefinition_get(super.movementSequence); // L: 98
			Model var3 = this.definition.getModel(var1, super.sequenceFrame, var2, super.movementFrame); // L: 99
			if (var3 == null) { // L: 100
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 101
				super.defaultHeight = var3.height; // L: 102
				int var4 = var3.indicesCount; // L: 103
				if (super.spotAnimation != -1 && super.spotAnimationFrame != -1) { // L: 104
					Model var5 = class13.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame); // L: 105
					if (var5 != null) { // L: 106
						var5.offsetBy(0, -super.field1128, 0); // L: 107
						Model[] var6 = new Model[]{var3, var5}; // L: 108
						var3 = new Model(var6, 2); // L: 109
					}
				}

				if (this.definition.size == 1) { // L: 112
					var3.isSingleTile = true;
				}

				if (super.field1184 != 0 && Client.cycle >= super.field1189 && Client.cycle < super.field1136) { // L: 113
					var3.overrideHue = super.field1191; // L: 114
					var3.overrideSaturation = super.field1168; // L: 115
					var3.overrideLuminance = super.field1193; // L: 116
					var3.overrideAmount = super.field1184; // L: 117
					var3.field2516 = (short)var4; // L: 118
				} else {
					var3.overrideAmount = 0; // L: 121
				}

				return var3; // L: 123
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "124"
	)
	final String method2413() {
		if (!this.field1259.isEmpty()) { // L: 20
			return this.field1259; // L: 21
		} else {
			NPCComposition var1 = this.definition; // L: 23
			if (var1.transforms != null) { // L: 24
				var1 = var1.transform(); // L: 25
				if (var1 == null) {
					var1 = this.definition; // L: 27
				}
			}

			return var1.name; // L: 30
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILgl;I)V",
		garbageValue = "-177937130"
	)
	final void method2414(int var1, class192 var2) {
		int var3 = super.pathX[0]; // L: 34
		int var4 = super.pathY[0]; // L: 35
		if (var1 == 0) { // L: 36
			--var3; // L: 37
			++var4; // L: 38
		}

		if (var1 == 1) {
			++var4;
		}

		if (var1 == 2) {
			++var3;
			++var4; // L: 43
		}

		if (var1 == 3) {
			--var3;
		}

		if (var1 == 4) {
			++var3;
		}

		if (var1 == 5) { // L: 47
			--var3;
			--var4;
		}

		if (var1 == 6) { // L: 51
			--var4;
		}

		if (var1 == 7) { // L: 52
			++var3; // L: 53
			--var4; // L: 54
		}

		if (super.sequence != -1 && class14.SequenceDefinition_get(super.sequence).field2156 == 1) { // L: 56
			super.sequence = -1;
		}

		if (super.pathLength < 9) { // L: 57
			++super.pathLength;
		}

		for (int var5 = super.pathLength; var5 > 0; --var5) { // L: 58
			super.pathX[var5] = super.pathX[var5 - 1]; // L: 59
			super.pathY[var5] = super.pathY[var5 - 1]; // L: 60
			super.pathTraversed[var5] = super.pathTraversed[var5 - 1]; // L: 61
		}

		super.pathX[0] = var3; // L: 63
		super.pathY[0] = var4; // L: 64
		super.pathTraversed[0] = var2; // L: 65
	} // L: 66

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "421072963"
	)
	final void method2415(int var1, int var2, boolean var3) {
		if (super.sequence != -1 && class14.SequenceDefinition_get(super.sequence).field2156 == 1) { // L: 69
			super.sequence = -1;
		}

		if (!var3) { // L: 70
			int var4 = var1 - super.pathX[0]; // L: 71
			int var5 = var2 - super.pathY[0]; // L: 72
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) { // L: 73
				if (super.pathLength < 9) { // L: 74
					++super.pathLength;
				}

				for (int var6 = super.pathLength; var6 > 0; --var6) { // L: 75
					super.pathX[var6] = super.pathX[var6 - 1]; // L: 76
					super.pathY[var6] = super.pathY[var6 - 1]; // L: 77
					super.pathTraversed[var6] = super.pathTraversed[var6 - 1]; // L: 78
				}

				super.pathX[0] = var1; // L: 80
				super.pathY[0] = var2; // L: 81
				super.pathTraversed[0] = class192.field2194; // L: 82
				return; // L: 83
			}
		}

		super.pathLength = 0; // L: 86
		super.field1203 = 0; // L: 87
		super.field1142 = 0; // L: 88
		super.pathX[0] = var1; // L: 89
		super.pathY[0] = var2; // L: 90
		super.x = super.field1202 * 64 + super.pathX[0] * 128; // L: 91
		super.y = super.field1202 * 64 + super.pathY[0] * 128; // L: 92
	} // L: 93

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2042091468"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null; // L: 127
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Llc;III)[Lqj;",
		garbageValue = "-2054591461"
	)
	public static SpritePixels[] method2434(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2);
		boolean var3;
		if (var4 == null) { // L: 41
			var3 = false; // L: 42
		} else {
			class83.SpriteBuffer_decode(var4); // L: 45
			var3 = true; // L: 46
		}

		return !var3 ? null : class291.method5570(); // L: 48 49
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-798314074"
	)
	public static int method2433(int var0) {
		return (var0 & class439.field4696) - 1; // L: 26
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IB)Lbd;",
		garbageValue = "125"
	)
	@Export("Messages_getMessage")
	static Message Messages_getMessage(int var0) {
		return (Message)Messages.Messages_hashTable.get((long)var0); // L: 40
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)Lbk;",
		garbageValue = "29"
	)
	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World.World_listCount < World.World_count ? class93.World_worlds[++World.World_listCount - 1] : null; // L: 252 253
	}

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(ZLqy;B)V",
		garbageValue = "-16"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0; // L: 5635
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		if (!Client.isInInstance) { // L: 5636
			int var2 = var1.readUnsignedShort(); // L: 5637
			var3 = var1.method7741(); // L: 5638
			var4 = var1.readUnsignedShort(); // L: 5639
			class131.xteaKeys = new int[var4][4]; // L: 5640

			for (var5 = 0; var5 < var4; ++var5) { // L: 5641
				for (var6 = 0; var6 < 4; ++var6) { // L: 5642
					class131.xteaKeys[var5][var6] = var1.readInt(); // L: 5643
				}
			}

			FileSystem.regions = new int[var4]; // L: 5646
			MidiPcmStream.regionMapArchiveIds = new int[var4]; // L: 5647
			class19.regionLandArchiveIds = new int[var4]; // L: 5648
			class7.regionLandArchives = new byte[var4][]; // L: 5649
			PcmPlayer.regionMapArchives = new byte[var4][]; // L: 5650
			var4 = 0; // L: 5651

			for (var5 = (var3 - 6) / 8; var5 <= (var3 + 6) / 8; ++var5) { // L: 5652
				for (var6 = (var2 - 6) / 8; var6 <= (var2 + 6) / 8; ++var6) { // L: 5653
					var7 = var6 + (var5 << 8); // L: 5654
					FileSystem.regions[var4] = var7; // L: 5655
					MidiPcmStream.regionMapArchiveIds[var4] = class21.archive9.getGroupId("m" + var5 + "_" + var6); // L: 5656
					class19.regionLandArchiveIds[var4] = class21.archive9.getGroupId("l" + var5 + "_" + var6); // L: 5657
					++var4; // L: 5658
				}
			}

			class18.method265(var3, var2, true); // L: 5661
		} else {
			boolean var15 = var1.method7908() == 1; // L: 5664
			var3 = var1.readUnsignedShort(); // L: 5665
			var4 = var1.method7774(); // L: 5666
			var5 = var1.readUnsignedShort(); // L: 5667
			var1.importIndex(); // L: 5668

			int var8;
			int var9;
			for (var6 = 0; var6 < 4; ++var6) { // L: 5669
				for (var7 = 0; var7 < 13; ++var7) { // L: 5670
					for (var8 = 0; var8 < 13; ++var8) { // L: 5671
						var9 = var1.readBits(1); // L: 5672
						if (var9 == 1) {
							Client.instanceChunkTemplates[var6][var7][var8] = var1.readBits(26); // L: 5673
						} else {
							Client.instanceChunkTemplates[var6][var7][var8] = -1; // L: 5674
						}
					}
				}
			}

			var1.exportIndex(); // L: 5678
			class131.xteaKeys = new int[var5][4]; // L: 5679

			for (var6 = 0; var6 < var5; ++var6) { // L: 5680
				for (var7 = 0; var7 < 4; ++var7) { // L: 5681
					class131.xteaKeys[var6][var7] = var1.readInt(); // L: 5682
				}
			}

			FileSystem.regions = new int[var5]; // L: 5685
			MidiPcmStream.regionMapArchiveIds = new int[var5]; // L: 5686
			class19.regionLandArchiveIds = new int[var5]; // L: 5687
			class7.regionLandArchives = new byte[var5][]; // L: 5688
			PcmPlayer.regionMapArchives = new byte[var5][]; // L: 5689
			var5 = 0; // L: 5690

			for (var6 = 0; var6 < 4; ++var6) { // L: 5691
				for (var7 = 0; var7 < 13; ++var7) { // L: 5692
					for (var8 = 0; var8 < 13; ++var8) { // L: 5693
						var9 = Client.instanceChunkTemplates[var6][var7][var8]; // L: 5694
						if (var9 != -1) { // L: 5695
							int var10 = var9 >> 14 & 1023; // L: 5696
							int var11 = var9 >> 3 & 2047; // L: 5697
							int var12 = (var10 / 8 << 8) + var11 / 8; // L: 5698

							int var13;
							for (var13 = 0; var13 < var5; ++var13) { // L: 5699
								if (FileSystem.regions[var13] == var12) {
									var12 = -1; // L: 5700
									break; // L: 5701
								}
							}

							if (var12 != -1) { // L: 5703
								FileSystem.regions[var5] = var12; // L: 5704
								var13 = var12 >> 8 & 255; // L: 5705
								int var14 = var12 & 255; // L: 5706
								MidiPcmStream.regionMapArchiveIds[var5] = class21.archive9.getGroupId("m" + var13 + "_" + var14); // L: 5707
								class19.regionLandArchiveIds[var5] = class21.archive9.getGroupId("l" + var13 + "_" + var14); // L: 5708
								++var5; // L: 5709
							}
						}
					}
				}
			}

			class18.method265(var4, var3, !var15); // L: 5715
		}

	} // L: 5717
}
