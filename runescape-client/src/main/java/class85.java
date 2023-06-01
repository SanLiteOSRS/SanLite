import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ds")
public class class85 {
	@ObfuscatedName("ag")
	@Export("Tiles_hue")
	static int[] Tiles_hue;

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IZIZB)V",
		garbageValue = "1"
	)
	@Export("sortWorldList")
	static void sortWorldList(int var0, boolean var1, int var2, boolean var3) {
		if (class20.World_worlds != null) { // L: 171
			Players.doWorldSorting(0, class20.World_worlds.length - 1, var0, var1, var2, var3); // L: 172
		}

	} // L: 174

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2059436926"
	)
	@Export("playPcmPlayers")
	static final void playPcmPlayers() {
		if (Language.pcmPlayer1 != null) { // L: 3673
			Language.pcmPlayer1.run();
		}

		if (class139.pcmPlayer0 != null) { // L: 3674
			class139.pcmPlayer0.run();
		}

	} // L: 3675

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "(Ltn;I)V",
		garbageValue = "1968937875"
	)
	static final void method2238(PacketBuffer var0) {
		for (int var1 = 0; var1 < Client.field542; ++var1) { // L: 8554
			int var2 = Client.field512[var1]; // L: 8555
			NPC var3 = Client.npcs[var2]; // L: 8556
			int var4 = var0.readUnsignedByte(); // L: 8557
			int var5;
			if ((var4 & 8) != 0) { // L: 8558
				var5 = var0.readUnsignedByte(); // L: 8559
				var4 += var5 << 8; // L: 8560
			}

			if ((var4 & 2048) != 0) { // L: 8562
				var5 = var0.readUnsignedByte(); // L: 8563
				var4 += var5 << 16; // L: 8564
			}

			if ((var4 & 256) != 0) { // L: 8566
				var3.field1200 = Client.cycle + var0.method9007(); // L: 8567
				var3.field1201 = Client.cycle + var0.method9005(); // L: 8568
				var3.field1175 = var0.method8965(); // L: 8569
				var3.field1203 = var0.method9000(); // L: 8570
				var3.field1153 = var0.method8965(); // L: 8571
				var3.field1205 = (byte)var0.method9026(); // L: 8572
			}

			if ((var4 & 1024) != 0) { // L: 8574
				var3.field1158 = var0.method9090(); // L: 8575
				var3.field1193 = var0.method9000(); // L: 8576
				var3.field1192 = var0.method9000(); // L: 8577
				var3.field1189 = var0.method9000(); // L: 8578
				var3.spotAnimation = var0.readUnsignedShort() + Client.cycle; // L: 8579
				var3.field1196 = var0.method9005() + Client.cycle; // L: 8580
				var3.field1139 = var0.readUnsignedShort(); // L: 8581
				var3.pathLength = 1; // L: 8582
				var3.field1214 = 0; // L: 8583
				var3.field1158 += var3.pathX[0]; // L: 8584
				var3.field1193 += var3.pathY[0]; // L: 8585
				var3.field1192 += var3.pathX[0]; // L: 8586
				var3.field1189 += var3.pathY[0]; // L: 8587
			}

			int var6;
			int var7;
			int var8;
			if ((var4 & 1) != 0) { // L: 8589
				var5 = var0.method9005(); // L: 8590
				var6 = var0.method9006(); // L: 8591
				var3.field1140 = var0.method8998() == 1; // L: 8592
				if (Client.field657 >= 212) { // L: 8593
					var3.field1177 = var5; // L: 8594
					var3.field1178 = var6; // L: 8595
				} else {
					var7 = var3.x - (var5 - class147.baseX * 64 - class147.baseX * 64) * 64; // L: 8598
					var8 = var3.y - (var6 - ModeWhere.baseY * 64 - ModeWhere.baseY * 64) * 64; // L: 8599
					if (var7 != 0 || var8 != 0) { // L: 8600
						var3.field1211 = ClientPreferences.method2538(var7, var8);
					}
				}
			}

			if ((var4 & 128) != 0) { // L: 8603
				var3.definition = class407.getNpcDefinition(var0.method9005()); // L: 8604
				DevicePcmPlayerProvider.method299(var3); // L: 8605
				var3.method2561(); // L: 8606
			}

			int var9;
			if ((var4 & 262144) != 0) { // L: 8608
				var5 = var0.method8998(); // L: 8609

				for (var6 = 0; var6 < var5; ++var6) { // L: 8610
					var7 = var0.readUnsignedByte(); // L: 8611
					var8 = var0.method9007(); // L: 8612
					var9 = var0.readInt(); // L: 8613
					var3.method2358(var7, var8, var9 >> 16, var9 & 65535); // L: 8614
				}
			}

			if ((var4 & 16) != 0) { // L: 8617
				var3.field1160 = var0.readStringCp1252NullTerminated(); // L: 8618
				var3.field1163 = 100; // L: 8619
			}

			if ((var4 & 16384) != 0) { // L: 8621
				var3.field1215 = var0.readInt(); // L: 8622
			}

			int var10;
			if ((var4 & 2) != 0) { // L: 8624
				var5 = var0.method9026(); // L: 8625
				int var11;
				if (var5 > 0) { // L: 8626
					for (var6 = 0; var6 < var5; ++var6) { // L: 8627
						var8 = -1; // L: 8629
						var9 = -1; // L: 8630
						var10 = -1; // L: 8631
						var7 = var0.readUShortSmart(); // L: 8632
						if (var7 == 32767) { // L: 8633
							var7 = var0.readUShortSmart(); // L: 8634
							var9 = var0.readUShortSmart(); // L: 8635
							var8 = var0.readUShortSmart(); // L: 8636
							var10 = var0.readUShortSmart(); // L: 8637
						} else if (var7 != 32766) { // L: 8639
							var9 = var0.readUShortSmart(); // L: 8640
						} else {
							var7 = -1; // L: 8642
						}

						var11 = var0.readUShortSmart(); // L: 8643
						var3.addHitSplat(var7, var9, var8, var10, Client.cycle, var11); // L: 8644
					}
				}

				var6 = var0.readUnsignedByte(); // L: 8647
				if (var6 > 0) { // L: 8648
					for (var7 = 0; var7 < var6; ++var7) { // L: 8649
						var8 = var0.readUShortSmart(); // L: 8650
						var9 = var0.readUShortSmart(); // L: 8651
						if (var9 != 32767) { // L: 8652
							var10 = var0.readUShortSmart(); // L: 8653
							var11 = var0.readUnsignedByte(); // L: 8654
							int var12 = var9 > 0 ? var0.method9026() : var11; // L: 8655
							var3.addHealthBar(var8, Client.cycle, var9, var10, var11, var12); // L: 8656
						} else {
							var3.removeHealthBar(var8); // L: 8658
						}
					}
				}
			}

			if ((var4 & 64) != 0) { // L: 8662
				var3.targetIndex = var0.method9006(); // L: 8664
				var3.targetIndex += var0.readUnsignedByte() << 16; // L: 8665
				var5 = 16777215; // L: 8666
				if (var5 == var3.targetIndex) { // L: 8667
					var3.targetIndex = -1; // L: 8668
				}
			}

			if ((var4 & 32) != 0) { // L: 8671
				var0.method9007(); // L: 8672
				var0.readInt(); // L: 8673
			}

			int[] var13;
			short[] var14;
			if ((var4 & 131072) != 0) { // L: 8675
				var5 = var0.method9050(); // L: 8676
				var13 = new int[8]; // L: 8677
				var14 = new short[8]; // L: 8678

				for (var8 = 0; var8 < 8; ++var8) { // L: 8679
					if ((var5 & 1 << var8) != 0) { // L: 8680
						var13[var8] = var0.method9095(); // L: 8681
						var14[var8] = (short)var0.method8980(); // L: 8682
					} else {
						var13[var8] = -1; // L: 8685
						var14[var8] = -1; // L: 8686
					}
				}

				var3.method2607(var13, var14); // L: 8689
			}

			if ((var4 & 65536) != 0) { // L: 8691
				var5 = var0.method9018(); // L: 8692
				var3.field1146 = (var5 & 1) != 0 ? var0.method9005() : var3.definition.turnLeftSequence; // L: 8693
				var3.field1171 = (var5 & 2) != 0 ? var0.method9005() : var3.definition.turnRightSequence; // L: 8694
				var3.walkSequence = (var5 & 4) != 0 ? var0.method9006() : var3.definition.walkSequence; // L: 8695
				var3.walkBackSequence = (var5 & 8) != 0 ? var0.method9005() : var3.definition.walkBackSequence; // L: 8696
				var3.walkLeftSequence = (var5 & 16) != 0 ? var0.method9005() : var3.definition.walkLeftSequence; // L: 8697
				var3.walkRightSequence = (var5 & 32) != 0 ? var0.readUnsignedShort() : var3.definition.walkRightSequence; // L: 8698
				var3.runSequence = (var5 & 64) != 0 ? var0.method9006() : var3.definition.field2021; // L: 8699
				var3.field1156 = (var5 & 128) != 0 ? var0.method9007() : var3.definition.field2024; // L: 8700
				var3.field1143 = (var5 & 256) != 0 ? var0.method9006() : var3.definition.field2010; // L: 8701
				var3.field1199 = (var5 & 512) != 0 ? var0.method9005() : var3.definition.field2030; // L: 8702
				var3.field1179 = (var5 & 1024) != 0 ? var0.method9007() : var3.definition.field2025; // L: 8703
				var3.field1157 = (var5 & 2048) != 0 ? var0.method9005() : var3.definition.field2026; // L: 8704
				var3.field1149 = (var5 & 4096) != 0 ? var0.readUnsignedShort() : var3.definition.field2027; // L: 8705
				var3.field1197 = (var5 & 8192) != 0 ? var0.method9005() : var3.definition.field2043; // L: 8706
				var3.idleSequence = (var5 & 16384) != 0 ? var0.method9006() : var3.definition.idleSequence; // L: 8707
			}

			if ((var4 & 4) != 0) { // L: 8709
				var5 = var0.method9006(); // L: 8710
				if (var5 == 65535) { // L: 8711
					var5 = -1; // L: 8712
				}

				var6 = var0.method9050(); // L: 8714
				if (var5 == var3.sequence && var5 != -1) { // L: 8715
					var7 = class149.SequenceDefinition_get(var5).field2277; // L: 8716
					if (var7 == 1) { // L: 8717
						var3.sequenceFrame = 0; // L: 8718
						var3.sequenceFrameCycle = 0; // L: 8719
						var3.sequenceDelay = var6; // L: 8720
						var3.field1188 = 0; // L: 8721
					}

					if (var7 == 2) { // L: 8723
						var3.field1188 = 0; // L: 8724
					}
				} else if (var5 == -1 || var3.sequence == -1 || class149.SequenceDefinition_get(var5).field2285 >= class149.SequenceDefinition_get(var3.sequence).field2285) { // L: 8727
					var3.sequence = var5; // L: 8728
					var3.sequenceFrame = 0; // L: 8729
					var3.sequenceFrameCycle = 0; // L: 8730
					var3.sequenceDelay = var6; // L: 8731
					var3.field1188 = 0; // L: 8732
					var3.field1214 = var3.pathLength; // L: 8733
				}
			}

			if ((var4 & 4096) != 0) { // L: 8737
				var3.method2581(var0.method8998()); // L: 8738
			}

			short[] var15;
			long var16;
			boolean var18;
			if ((var4 & 512) != 0) { // L: 8740
				var5 = var0.method9026(); // L: 8741
				if ((var5 & 1) == 1) { // L: 8742
					var3.method2558(); // L: 8743
				} else {
					var13 = null; // L: 8746
					if ((var5 & 2) == 2) { // L: 8747
						var7 = var0.method9026(); // L: 8748
						var13 = new int[var7]; // L: 8749

						for (var8 = 0; var8 < var7; ++var8) { // L: 8750
							var9 = var0.method9006(); // L: 8751
							var9 = var9 == 65535 ? -1 : var9; // L: 8752
							var13[var8] = var9; // L: 8753
						}
					}

					var14 = null; // L: 8756
					if ((var5 & 4) == 4) { // L: 8757
						var8 = 0; // L: 8758
						if (var3.definition.recolorTo != null) { // L: 8759
							var8 = var3.definition.recolorTo.length; // L: 8760
						}

						var14 = new short[var8]; // L: 8762

						for (var9 = 0; var9 < var8; ++var9) { // L: 8763
							var14[var9] = (short)var0.method9005(); // L: 8764
						}
					}

					var15 = null; // L: 8767
					if ((var5 & 8) == 8) { // L: 8768
						var9 = 0; // L: 8769
						if (var3.definition.retextureTo != null) { // L: 8770
							var9 = var3.definition.retextureTo.length; // L: 8771
						}

						var15 = new short[var9]; // L: 8773

						for (var10 = 0; var10 < var9; ++var10) { // L: 8774
							var15[var10] = (short)var0.method9005(); // L: 8775
						}
					}

					var18 = false; // L: 8778
					if ((var5 & 16) != 0) { // L: 8779
						var18 = var0.method9026() == 1; // L: 8780
					}

					var16 = (long)(++NPC.field1277 - 1); // L: 8782
					var3.method2554(new class193(var16, var13, var14, var15, var18)); // L: 8783
				}
			}

			if ((var4 & 8192) != 0) { // L: 8786
				var5 = var0.method8998(); // L: 8787
				if ((var5 & 1) == 1) { // L: 8788
					var3.method2566(); // L: 8789
				} else {
					var13 = null; // L: 8792
					if ((var5 & 2) == 2) { // L: 8793
						var7 = var0.readUnsignedByte(); // L: 8794
						var13 = new int[var7]; // L: 8795

						for (var8 = 0; var8 < var7; ++var8) { // L: 8796
							var9 = var0.method9006(); // L: 8797
							var9 = var9 == 65535 ? -1 : var9; // L: 8798
							var13[var8] = var9; // L: 8799
						}
					}

					var14 = null; // L: 8802
					if ((var5 & 4) == 4) { // L: 8803
						var8 = 0; // L: 8804
						if (var3.definition.recolorTo != null) { // L: 8805
							var8 = var3.definition.recolorTo.length; // L: 8806
						}

						var14 = new short[var8]; // L: 8808

						for (var9 = 0; var9 < var8; ++var9) { // L: 8809
							var14[var9] = (short)var0.method9007(); // L: 8810
						}
					}

					var15 = null; // L: 8813
					if ((var5 & 8) == 8) { // L: 8814
						var9 = 0; // L: 8815
						if (var3.definition.retextureTo != null) { // L: 8816
							var9 = var3.definition.retextureTo.length; // L: 8817
						}

						var15 = new short[var9]; // L: 8819

						for (var10 = 0; var10 < var9; ++var10) { // L: 8820
							var15[var10] = (short)var0.method9006(); // L: 8821
						}
					}

					var18 = false; // L: 8824
					if ((var5 & 16) != 0) { // L: 8825
						var18 = var0.readUnsignedByte() == 1; // L: 8826
					}

					var16 = (long)(++NPC.field1271 - 1); // L: 8828
					var3.method2594(new class193(var16, var13, var14, var15, var18)); // L: 8829
				}
			}

			if ((var4 & 32768) != 0) { // L: 8832
				var3.method2549(var0.readStringCp1252NullTerminated()); // L: 8833
			}
		}

	} // L: 8836
}
