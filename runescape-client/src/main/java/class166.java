import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gz")
public class class166 extends class142 {
	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	@Export("fontBold12")
	static Font fontBold12;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -18195497
	)
	int field1786;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		longValue = -6556220409657227367L
	)
	long field1787;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class145 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class166(class145 var1) {
		this.this$0 = var1; // L: 307
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltz;B)V",
		garbageValue = "59"
	)
	void vmethod3381(Buffer var1) {
		this.field1786 = var1.readInt(); // L: 310
		this.field1787 = var1.readLong(); // L: 311
	} // L: 312

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfs;B)V",
		garbageValue = "-72"
	)
	void vmethod3382(ClanSettings var1) {
		var1.method3264(this.field1786, this.field1787); // L: 315
	} // L: 316

	@ObfuscatedName("av")
	public static int method3386(long var0) {
		return (int)(var0 >>> 7 & 127L); // L: 65
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Lcg;",
		garbageValue = "-1307291801"
	)
	@Export("Messages_getMessage")
	static Message Messages_getMessage(int var0) {
		return (Message)Messages.Messages_hashTable.get((long)var0); // L: 44
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)[Lfg;",
		garbageValue = "-27"
	)
	static class130[] method3387() {
		return new class130[]{class130.field1534, class130.field1529, class130.field1530, class130.field1531, class130.field1532, class130.field1533}; // L: 25
	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(Ltl;I)V",
		garbageValue = "1746629784"
	)
	static final void method3380(PacketBuffer var0) {
		for (int var1 = 0; var1 < Client.field579; ++var1) { // L: 8764
			int var2 = Client.field566[var1]; // L: 8765
			NPC var3 = Client.npcs[var2]; // L: 8766
			int var4 = var0.readUnsignedByte(); // L: 8767
			int var5;
			if ((var4 & 8) != 0) { // L: 8768
				var5 = var0.readUnsignedByte(); // L: 8769
				var4 += var5 << 8; // L: 8770
			}

			if ((var4 & 2048) != 0) { // L: 8772
				var5 = var0.readUnsignedByte(); // L: 8773
				var4 += var5 << 16; // L: 8774
			}

			if ((var4 & 256) != 0) { // L: 8776
				var3.field1170 = Client.cycle + var0.method8952(); // L: 8777
				var3.field1213 = Client.cycle + var0.method8950(); // L: 8778
				var3.field1164 = var0.method8971(); // L: 8779
				var3.field1215 = var0.method9022(); // L: 8780
				var3.field1196 = var0.method8971(); // L: 8781
				var3.field1217 = (byte)var0.method8942(); // L: 8782
			}

			if ((var4 & 1024) != 0) { // L: 8784
				var3.field1203 = var0.method8979(); // L: 8785
				var3.field1205 = var0.method9022(); // L: 8786
				var3.field1173 = var0.method9022(); // L: 8787
				var3.field1206 = var0.method9022(); // L: 8788
				var3.spotAnimation = var0.readUnsignedShort() + Client.cycle; // L: 8789
				var3.field1208 = var0.method8950() + Client.cycle; // L: 8790
				var3.field1209 = var0.readUnsignedShort(); // L: 8791
				var3.pathLength = 1; // L: 8792
				var3.field1226 = 0; // L: 8793
				var3.field1203 += var3.pathX[0]; // L: 8794
				var3.field1205 += var3.pathY[0]; // L: 8795
				var3.field1173 += var3.pathX[0]; // L: 8796
				var3.field1206 += var3.pathY[0]; // L: 8797
			}

			int var6;
			int var7;
			int var8;
			if ((var4 & 1) != 0) { // L: 8799
				var5 = var0.method8950(); // L: 8800
				var6 = var0.method9030(); // L: 8801
				var3.field1184 = var0.method8943() == 1; // L: 8802
				if (Client.field512 >= 212) { // L: 8803
					var3.field1178 = var5; // L: 8804
					var3.field1190 = var6; // L: 8805
				} else {
					var7 = var3.x - (var5 - class213.baseX * 64 - class213.baseX * 64) * 64; // L: 8808
					var8 = var3.y - (var6 - class101.baseY * 64 - class101.baseY * 64) * 64; // L: 8809
					if (var7 != 0 || var8 != 0) { // L: 8810
						var3.field1228 = class398.method7591(var7, var8);
					}
				}
			}

			if ((var4 & 128) != 0) { // L: 8813
				var3.definition = Bounds.getNpcDefinition(var0.method8950()); // L: 8814
				class381.method7122(var3); // L: 8815
				var3.method2567(); // L: 8816
			}

			int var9;
			if ((var4 & 262144) != 0) { // L: 8818
				var5 = var0.method8943(); // L: 8819

				for (var6 = 0; var6 < var5; ++var6) { // L: 8820
					var7 = var0.readUnsignedByte(); // L: 8821
					var8 = var0.method8952(); // L: 8822
					var9 = var0.readInt(); // L: 8823
					var3.method2363(var7, var8, var9 >> 16, var9 & 65535); // L: 8824
				}
			}

			if ((var4 & 16) != 0) { // L: 8827
				var3.overheadText = var0.readStringCp1252NullTerminated(); // L: 8828
				var3.overheadTextCyclesRemaining = 100; // L: 8829
			}

			if ((var4 & 16384) != 0) { // L: 8831
				var3.field1227 = var0.readInt(); // L: 8832
			}

			int var10;
			if ((var4 & 2) != 0) { // L: 8834
				var5 = var0.method8942(); // L: 8835
				int var11;
				if (var5 > 0) { // L: 8836
					for (var6 = 0; var6 < var5; ++var6) { // L: 8837
						var8 = -1; // L: 8839
						var9 = -1; // L: 8840
						var10 = -1; // L: 8841
						var7 = var0.readUShortSmart(); // L: 8842
						if (var7 == 32767) { // L: 8843
							var7 = var0.readUShortSmart(); // L: 8844
							var9 = var0.readUShortSmart(); // L: 8845
							var8 = var0.readUShortSmart(); // L: 8846
							var10 = var0.readUShortSmart(); // L: 8847
						} else if (var7 != 32766) { // L: 8849
							var9 = var0.readUShortSmart(); // L: 8850
						} else {
							var7 = -1; // L: 8852
						}

						var11 = var0.readUShortSmart(); // L: 8853
						var3.addHitSplat(var7, var9, var8, var10, Client.cycle, var11); // L: 8854
					}
				}

				var6 = var0.readUnsignedByte(); // L: 8857
				if (var6 > 0) { // L: 8858
					for (var7 = 0; var7 < var6; ++var7) { // L: 8859
						var8 = var0.readUShortSmart(); // L: 8860
						var9 = var0.readUShortSmart(); // L: 8861
						if (var9 != 32767) { // L: 8862
							var10 = var0.readUShortSmart(); // L: 8863
							var11 = var0.readUnsignedByte(); // L: 8864
							int var12 = var9 > 0 ? var0.method8942() : var11; // L: 8865
							var3.addHealthBar(var8, Client.cycle, var9, var10, var11, var12); // L: 8866
						} else {
							var3.removeHealthBar(var8); // L: 8868
						}
					}
				}
			}

			if ((var4 & 64) != 0) { // L: 8872
				var3.targetIndex = var0.method9030(); // L: 8874
				var3.targetIndex += var0.readUnsignedByte() << 16; // L: 8875
				var5 = 16777215; // L: 8876
				if (var5 == var3.targetIndex) { // L: 8877
					var3.targetIndex = -1; // L: 8878
				}
			}

			if ((var4 & 32) != 0) { // L: 8881
				var0.method8952(); // L: 8882
				var0.readInt(); // L: 8883
			}

			int[] var13;
			short[] var14;
			if ((var4 & 131072) != 0) { // L: 8885
				var5 = var0.method8941(); // L: 8886
				var13 = new int[8]; // L: 8887
				var14 = new short[8]; // L: 8888

				for (var8 = 0; var8 < 8; ++var8) { // L: 8889
					if ((var5 & 1 << var8) != 0) { // L: 8890
						var13[var8] = var0.method8928(); // L: 8891
						var14[var8] = (short)var0.method8938(); // L: 8892
					} else {
						var13[var8] = -1; // L: 8895
						var14[var8] = -1; // L: 8896
					}
				}

				var3.method2566(var13, var14); // L: 8899
			}

			if ((var4 & 65536) != 0) { // L: 8901
				var5 = var0.method8963(); // L: 8902
				var3.field1199 = (var5 & 1) != 0 ? var0.method8950() : var3.definition.turnLeftSequence; // L: 8903
				var3.field1159 = (var5 & 2) != 0 ? var0.method8950() : var3.definition.turnRightSequence; // L: 8904
				var3.walkSequence = (var5 & 4) != 0 ? var0.method9030() : var3.definition.walkSequence; // L: 8905
				var3.walkBackSequence = (var5 & 8) != 0 ? var0.method8950() : var3.definition.walkBackSequence; // L: 8906
				var3.walkLeftSequence = (var5 & 16) != 0 ? var0.method8950() : var3.definition.walkLeftSequence; // L: 8907
				var3.walkRightSequence = (var5 & 32) != 0 ? var0.readUnsignedShort() : var3.definition.walkRightSequence; // L: 8908
				var3.runSequence = (var5 & 64) != 0 ? var0.method9030() : var3.definition.field2014; // L: 8909
				var3.field1191 = (var5 & 128) != 0 ? var0.method8952() : var3.definition.field2011; // L: 8910
				var3.field1198 = (var5 & 256) != 0 ? var0.method9030() : var3.definition.field2012; // L: 8911
				var3.field1167 = (var5 & 512) != 0 ? var0.method8950() : var3.definition.field2013; // L: 8912
				var3.field1168 = (var5 & 1024) != 0 ? var0.method8952() : var3.definition.field1994; // L: 8913
				var3.field1169 = (var5 & 2048) != 0 ? var0.method8950() : var3.definition.field2015; // L: 8914
				var3.field1183 = (var5 & 4096) != 0 ? var0.readUnsignedShort() : var3.definition.field2016; // L: 8915
				var3.field1171 = (var5 & 8192) != 0 ? var0.method8950() : var3.definition.field2017; // L: 8916
				var3.idleSequence = (var5 & 16384) != 0 ? var0.method9030() : var3.definition.idleSequence; // L: 8917
			}

			if ((var4 & 4) != 0) { // L: 8919
				var5 = var0.method9030(); // L: 8920
				if (var5 == 65535) { // L: 8921
					var5 = -1; // L: 8922
				}

				var6 = var0.method8941(); // L: 8924
				if (var5 == var3.sequence && var5 != -1) { // L: 8925
					var7 = WorldMapLabelSize.SequenceDefinition_get(var5).field2299; // L: 8926
					if (var7 == 1) { // L: 8927
						var3.sequenceFrame = 0; // L: 8928
						var3.sequenceFrameCycle = 0; // L: 8929
						var3.sequenceDelay = var6; // L: 8930
						var3.field1200 = 0; // L: 8931
					}

					if (var7 == 2) { // L: 8933
						var3.field1200 = 0; // L: 8934
					}
				} else if (var5 == -1 || var3.sequence == -1 || WorldMapLabelSize.SequenceDefinition_get(var5).field2278 >= WorldMapLabelSize.SequenceDefinition_get(var3.sequence).field2278) { // L: 8937
					var3.sequence = var5; // L: 8938
					var3.sequenceFrame = 0; // L: 8939
					var3.sequenceFrameCycle = 0; // L: 8940
					var3.sequenceDelay = var6; // L: 8941
					var3.field1200 = 0; // L: 8942
					var3.field1226 = var3.pathLength; // L: 8943
				}
			}

			if ((var4 & 4096) != 0) { // L: 8947
				var3.method2615(var0.method8943()); // L: 8948
			}

			short[] var15;
			long var16;
			boolean var18;
			if ((var4 & 512) != 0) { // L: 8950
				var5 = var0.method8942(); // L: 8951
				if ((var5 & 1) == 1) { // L: 8952
					var3.method2571(); // L: 8953
				} else {
					var13 = null; // L: 8956
					if ((var5 & 2) == 2) { // L: 8957
						var7 = var0.method8942(); // L: 8958
						var13 = new int[var7]; // L: 8959

						for (var8 = 0; var8 < var7; ++var8) { // L: 8960
							var9 = var0.method9030(); // L: 8961
							var9 = var9 == 65535 ? -1 : var9; // L: 8962
							var13[var8] = var9; // L: 8963
						}
					}

					var14 = null; // L: 8966
					if ((var5 & 4) == 4) { // L: 8967
						var8 = 0; // L: 8968
						if (var3.definition.recolorTo != null) { // L: 8969
							var8 = var3.definition.recolorTo.length; // L: 8970
						}

						var14 = new short[var8]; // L: 8972

						for (var9 = 0; var9 < var8; ++var9) { // L: 8973
							var14[var9] = (short)var0.method8950(); // L: 8974
						}
					}

					var15 = null; // L: 8977
					if ((var5 & 8) == 8) { // L: 8978
						var9 = 0; // L: 8979
						if (var3.definition.retextureTo != null) { // L: 8980
							var9 = var3.definition.retextureTo.length; // L: 8981
						}

						var15 = new short[var9]; // L: 8983

						for (var10 = 0; var10 < var9; ++var10) { // L: 8984
							var15[var10] = (short)var0.method8950(); // L: 8985
						}
					}

					var18 = false; // L: 8988
					if ((var5 & 16) != 0) { // L: 8989
						var18 = var0.method8942() == 1; // L: 8990
					}

					var16 = (long)(++NPC.field1289 - 1); // L: 8992
					var3.method2579(new class193(var16, var13, var14, var15, var18)); // L: 8993
				}
			}

			if ((var4 & 8192) != 0) { // L: 8996
				var5 = var0.method8943(); // L: 8997
				if ((var5 & 1) == 1) { // L: 8998
					var3.method2572(); // L: 8999
				} else {
					var13 = null; // L: 9002
					if ((var5 & 2) == 2) { // L: 9003
						var7 = var0.readUnsignedByte(); // L: 9004
						var13 = new int[var7]; // L: 9005

						for (var8 = 0; var8 < var7; ++var8) { // L: 9006
							var9 = var0.method9030(); // L: 9007
							var9 = var9 == 65535 ? -1 : var9; // L: 9008
							var13[var8] = var9; // L: 9009
						}
					}

					var14 = null; // L: 9012
					if ((var5 & 4) == 4) { // L: 9013
						var8 = 0; // L: 9014
						if (var3.definition.recolorTo != null) { // L: 9015
							var8 = var3.definition.recolorTo.length; // L: 9016
						}

						var14 = new short[var8]; // L: 9018

						for (var9 = 0; var9 < var8; ++var9) { // L: 9019
							var14[var9] = (short)var0.method8952(); // L: 9020
						}
					}

					var15 = null; // L: 9023
					if ((var5 & 8) == 8) { // L: 9024
						var9 = 0; // L: 9025
						if (var3.definition.retextureTo != null) { // L: 9026
							var9 = var3.definition.retextureTo.length; // L: 9027
						}

						var15 = new short[var9]; // L: 9029

						for (var10 = 0; var10 < var9; ++var10) { // L: 9030
							var15[var10] = (short)var0.method9030(); // L: 9031
						}
					}

					var18 = false; // L: 9034
					if ((var5 & 16) != 0) { // L: 9035
						var18 = var0.readUnsignedByte() == 1; // L: 9036
					}

					var16 = (long)(++NPC.field1281 - 1); // L: 9038
					var3.method2570(new class193(var16, var13, var14, var15, var18)); // L: 9039
				}
			}

			if ((var4 & 32768) != 0) { // L: 9042
				var3.method2555(var0.readStringCp1252NullTerminated()); // L: 9043
			}
		}

	} // L: 9046
}
