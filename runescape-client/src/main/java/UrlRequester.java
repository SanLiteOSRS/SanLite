import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eg")
@Implements("UrlRequester")
public abstract class UrlRequester implements Runnable {
	@ObfuscatedName("wg")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	static class375 field1418;
	@ObfuscatedName("am")
	final Thread field1424;
	@ObfuscatedName("ap")
	@Export("isClosed")
	volatile boolean isClosed;
	@ObfuscatedName("af")
	@Export("requests")
	Queue requests;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1052478697
	)
	int field1421;

	UrlRequester(int var1) {
		this.requests = new LinkedList(); // L: 17
		this.field1424 = new Thread(this); // L: 21
		this.field1424.setPriority(1); // L: 22
		this.field1424.start(); // L: 23
		this.field1421 = var1; // L: 24
	} // L: 25

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lee;I)V",
		garbageValue = "-630521525"
	)
	abstract void vmethod2905(UrlRequest var1) throws IOException;

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;B)I",
		garbageValue = "71"
	)
	int method2895(URLConnection var1) {
		int var2 = UrlRequest.field1435; // L: 53
		if (var1 != null) { // L: 54
			try {
				if (var1 instanceof HttpURLConnection) { // L: 56
					var2 = ((HttpURLConnection)var1).getResponseCode(); // L: 57
				}
			} catch (IOException var4) { // L: 60
			}
		}

		return var2; // L: 62
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;I)V",
		garbageValue = "2130311728"
	)
	void method2877(URLConnection var1) {
		var1.setConnectTimeout(5000); // L: 66
		var1.setReadTimeout(5000); // L: 67
		var1.setUseCaches(false); // L: 68
		var1.setRequestProperty("Connection", "close"); // L: 69
		var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1421); // L: 70
	} // L: 71

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;Lee;I)V",
		garbageValue = "2006519047"
	)
	void method2878(URLConnection var1, UrlRequest var2) {
		DataInputStream var3 = null; // L: 74

		try {
			int var5 = var1.getContentLength(); // L: 77
			var3 = new DataInputStream(var1.getInputStream()); // L: 78
			byte[] var4;
			if (var5 >= 0) { // L: 79
				var4 = new byte[var5]; // L: 80
				var3.readFully(var4); // L: 81
			} else {
				var4 = new byte[0]; // L: 84
				byte[] var6 = class133.ByteArrayPool_getArray(5000); // L: 85

				for (int var7 = var3.read(var6); var7 > -1; var7 = var3.read(var6)) { // L: 86 87 92
					byte[] var8 = new byte[var4.length + var7]; // L: 88
					System.arraycopy(var4, 0, var8, 0, var4.length); // L: 89
					System.arraycopy(var6, 0, var8, var4.length, var7); // L: 90
					var4 = var8; // L: 91
				}

				class143.ByteArrayPool_release(var6); // L: 94
			}

			var2.response0 = var4; // L: 96
		} catch (IOException var14) { // L: 98
			var2.response0 = null; // L: 99
		} finally {
			var2.field1436 = this.method2895(var1); // L: 102
		}

		if (var3 != null) { // L: 104
			try {
				var3.close(); // L: 106
			} catch (IOException var13) { // L: 108
			}
		}

	} // L: 110

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;I)Lee;",
		garbageValue = "-1835272021"
	)
	@Export("request")
	public UrlRequest request(URL var1) {
		UrlRequest var2 = new UrlRequest(var1); // L: 113
		synchronized(this) { // L: 114
			this.requests.add(var2); // L: 115
			this.notify(); // L: 116
			return var2; // L: 118
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1650498174"
	)
	@Export("close")
	public void close() {
		this.isClosed = true; // L: 122

		try {
			synchronized(this) { // L: 124
				this.notify(); // L: 125
			} // L: 126

			this.field1424.join(); // L: 127
		} catch (InterruptedException var4) { // L: 129
		}

	} // L: 130

	public void run() {
		while (!this.isClosed) { // L: 29
			try {
				UrlRequest var1;
				synchronized(this) { // L: 32
					var1 = (UrlRequest)this.requests.poll(); // L: 33
					if (var1 == null) { // L: 34
						try {
							this.wait(); // L: 36
						} catch (InterruptedException var5) { // L: 38
						}
						continue;
					}
				}

				this.vmethod2905(var1); // L: 42
			} catch (Exception var7) { // L: 44
				class368.RunException_sendStackTrace((String)null, var7); // L: 45
			}
		}

	} // L: 48

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1743904903"
	)
	public static void method2901() {
		KitDefinition.KitDefinition_cached.clear(); // L: 132
	} // L: 133

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1070004280"
	)
	static int method2902(int var0, int var1) {
		for (int var2 = 0; var2 < 8; ++var2) { // L: 1181
			if (var1 <= var0 + 30) { // L: 1182
				return var2; // L: 1183
			}

			var0 += 30; // L: 1185
			var0 += var2 != 1 && var2 != 3 ? 5 : 20; // L: 1186
		}

		return 0; // L: 1188
	}

	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "(Luo;B)V",
		garbageValue = "77"
	)
	static final void method2903(PacketBuffer var0) {
		for (int var1 = 0; var1 < Client.field549; ++var1) { // L: 8783
			int var2 = Client.field603[var1]; // L: 8784
			NPC var3 = Client.npcs[var2]; // L: 8785
			int var4 = var0.readUnsignedByte(); // L: 8786
			int var5;
			if ((var4 & 128) != 0) { // L: 8787
				var5 = var0.readUnsignedByte(); // L: 8788
				var4 += var5 << 8; // L: 8789
			}

			if ((var4 & 16384) != 0) { // L: 8791
				var5 = var0.readUnsignedByte(); // L: 8792
				var4 += var5 << 16; // L: 8793
			}

			if ((var4 & 256) != 0) { // L: 8795
				var3.method2657(var0.readStringCp1252NullTerminated()); // L: 8796
			}

			int var6;
			if ((var4 & 1) != 0) { // L: 8798
				var5 = var0.method9538(); // L: 8799
				var6 = var0.readUnsignedShort(); // L: 8800
				var3.field1211 = var0.method9420() == 1; // L: 8801
				var3.field1213 = var5; // L: 8802
				var3.field1210 = var6; // L: 8803
			}

			if ((var4 & 2048) != 0) { // L: 8805
				var3.field1192 = var0.method9429(); // L: 8806
			}

			if ((var4 & 512) != 0) { // L: 8808
				var3.field1180 = Client.cycle + var0.readUnsignedShort(); // L: 8809
				var3.field1233 = Client.cycle + var0.method9538(); // L: 8810
				var3.field1234 = var0.method9446(); // L: 8811
				var3.field1193 = var0.method9422(); // L: 8812
				var3.field1204 = var0.readByte(); // L: 8813
				var3.field1237 = (byte)var0.readUnsignedByte(); // L: 8814
			}

			if ((var4 & 1024) != 0) { // L: 8816
				var3.method2710(var0.method9526()); // L: 8817
			}

			short[] var7;
			int var8;
			int[] var13;
			if ((var4 & 262144) != 0) { // L: 8819
				var5 = var0.method9420(); // L: 8820
				var13 = new int[8]; // L: 8821
				var7 = new short[8]; // L: 8822

				for (var8 = 0; var8 < 8; ++var8) { // L: 8823
					if ((var5 & 1 << var8) != 0) { // L: 8824
						var13[var8] = var0.method9547(); // L: 8825
						var7[var8] = (short)var0.method9389(); // L: 8826
					} else {
						var13[var8] = -1; // L: 8829
						var7[var8] = -1; // L: 8830
					}
				}

				var3.method2668(var13, var7); // L: 8833
			}

			if ((var4 & 4) != 0) { // L: 8835
				var3.field1195 = var0.readStringCp1252NullTerminated(); // L: 8836
				var3.field1212 = 100; // L: 8837
			}

			if ((var4 & 8) != 0) { // L: 8839
				var3.targetIndex = var0.method9430(); // L: 8841
				var3.targetIndex += var0.method9419() << 16; // L: 8842
				var5 = 16777215; // L: 8843
				if (var5 == var3.targetIndex) { // L: 8844
					var3.targetIndex = -1; // L: 8845
				}
			}

			int var9;
			int var10;
			int var14;
			if ((var4 & 32) != 0) { // L: 8848
				var5 = var0.method9526(); // L: 8849
				int var11;
				if (var5 > 0) { // L: 8850
					for (var6 = 0; var6 < var5; ++var6) { // L: 8851
						var8 = -1; // L: 8853
						var9 = -1; // L: 8854
						var10 = -1; // L: 8855
						var14 = var0.readUShortSmart(); // L: 8856
						if (var14 == 32767) { // L: 8857
							var14 = var0.readUShortSmart(); // L: 8858
							var9 = var0.readUShortSmart(); // L: 8859
							var8 = var0.readUShortSmart(); // L: 8860
							var10 = var0.readUShortSmart(); // L: 8861
						} else if (var14 != 32766) { // L: 8863
							var9 = var0.readUShortSmart(); // L: 8864
						} else {
							var14 = -1; // L: 8866
						}

						var11 = var0.readUShortSmart(); // L: 8867
						var3.addHitSplat(var14, var9, var8, var10, Client.cycle, var11); // L: 8868
					}
				}

				var6 = var0.method9526(); // L: 8871
				if (var6 > 0) { // L: 8872
					for (var14 = 0; var14 < var6; ++var14) { // L: 8873
						var8 = var0.readUShortSmart(); // L: 8874
						var9 = var0.readUShortSmart(); // L: 8875
						if (var9 != 32767) { // L: 8876
							var10 = var0.readUShortSmart(); // L: 8877
							var11 = var0.method9420(); // L: 8878
							int var12 = var9 > 0 ? var0.method9420() : var11; // L: 8879
							var3.addHealthBar(var8, Client.cycle, var9, var10, var11, var12); // L: 8880
						} else {
							var3.removeHealthBar(var8); // L: 8882
						}
					}
				}
			}

			if ((var4 & 2) != 0) { // L: 8886
				var0.method9538(); // L: 8887
				var0.method9429(); // L: 8888
			}

			if ((var4 & 4096) != 0) { // L: 8890
				var3.field1223 = var0.method9422(); // L: 8891
				var3.field1225 = var0.readByte(); // L: 8892
				var3.field1224 = var0.readByte(); // L: 8893
				var3.field1226 = var0.method9422(); // L: 8894
				var3.spotAnimation = var0.method9398() + Client.cycle; // L: 8895
				var3.field1228 = var0.readUnsignedShort() + Client.cycle; // L: 8896
				var3.field1173 = var0.method9538(); // L: 8897
				var3.pathLength = 1; // L: 8898
				var3.field1215 = 0; // L: 8899
				var3.field1223 += var3.pathX[0]; // L: 8900
				var3.field1225 += var3.pathY[0]; // L: 8901
				var3.field1224 += var3.pathX[0]; // L: 8902
				var3.field1226 += var3.pathY[0]; // L: 8903
			}

			if ((var4 & 131072) != 0) { // L: 8905
				var5 = var0.readUnsignedByte(); // L: 8906

				for (var6 = 0; var6 < var5; ++var6) { // L: 8907
					var14 = var0.method9419(); // L: 8908
					var8 = var0.method9538(); // L: 8909
					var9 = var0.method9442(); // L: 8910
					var3.method2469(var14, var8, var9 >> 16, var9 & 65535); // L: 8911
				}
			}

			if ((var4 & 64) != 0) { // L: 8914
				var3.definition = Script.getNpcDefinition(var0.method9430()); // L: 8915
				class142.method3229(var3); // L: 8916
				var3.method2669(); // L: 8917
			}

			if ((var4 & 16) != 0) { // L: 8919
				var5 = var0.readUnsignedShort(); // L: 8920
				if (var5 == 65535) { // L: 8921
					var5 = -1; // L: 8922
				}

				var6 = var0.readUnsignedByte(); // L: 8924
				if (var5 == var3.sequence && var5 != -1) { // L: 8925
					var14 = class9.SequenceDefinition_get(var5).field2246; // L: 8926
					if (var14 == 1) { // L: 8927
						var3.sequenceFrame = 0; // L: 8928
						var3.sequenceFrameCycle = 0; // L: 8929
						var3.sequenceDelay = var6; // L: 8930
						var3.field1220 = 0; // L: 8931
					}

					if (var14 == 2) { // L: 8933
						var3.field1220 = 0; // L: 8934
					}
				} else if (var5 == -1 || var3.sequence == -1 || class9.SequenceDefinition_get(var5).field2220 >= class9.SequenceDefinition_get(var3.sequence).field2220) { // L: 8937
					var3.sequence = var5; // L: 8938
					var3.sequenceFrame = 0; // L: 8939
					var3.sequenceFrameCycle = 0; // L: 8940
					var3.sequenceDelay = var6; // L: 8941
					var3.field1220 = 0; // L: 8942
					var3.field1215 = var3.pathLength; // L: 8943
				}
			}

			short[] var15;
			long var16;
			boolean var18;
			if ((var4 & 8192) != 0) { // L: 8947
				var5 = var0.method9420(); // L: 8948
				if ((var5 & 1) == 1) { // L: 8949
					var3.method2674(); // L: 8950
				} else {
					var13 = null; // L: 8953
					if ((var5 & 2) == 2) { // L: 8954
						var14 = var0.method9419(); // L: 8955
						var13 = new int[var14]; // L: 8956

						for (var8 = 0; var8 < var14; ++var8) { // L: 8957
							var9 = var0.readUnsignedShort(); // L: 8958
							var9 = var9 == 65535 ? -1 : var9; // L: 8959
							var13[var8] = var9; // L: 8960
						}
					}

					var7 = null; // L: 8963
					if ((var5 & 4) == 4) { // L: 8964
						var8 = 0; // L: 8965
						if (var3.definition.recolorTo != null) { // L: 8966
							var8 = var3.definition.recolorTo.length; // L: 8967
						}

						var7 = new short[var8]; // L: 8969

						for (var9 = 0; var9 < var8; ++var9) { // L: 8970
							var7[var9] = (short)var0.method9430(); // L: 8971
						}
					}

					var15 = null; // L: 8974
					if ((var5 & 8) == 8) { // L: 8975
						var9 = 0; // L: 8976
						if (var3.definition.retextureTo != null) { // L: 8977
							var9 = var3.definition.retextureTo.length; // L: 8978
						}

						var15 = new short[var9]; // L: 8980

						for (var10 = 0; var10 < var9; ++var10) { // L: 8981
							var15[var10] = (short)var0.readUnsignedShort(); // L: 8982
						}
					}

					var18 = false; // L: 8985
					if ((var5 & 16) != 0) { // L: 8986
						var18 = var0.readUnsignedByte() == 1; // L: 8987
					}

					var16 = (long)(++NPC.field1306 - 1); // L: 8989
					var3.method2664(new class187(var16, var13, var7, var15, var18)); // L: 8990
				}
			}

			if ((var4 & 65536) != 0) { // L: 8993
				var5 = var0.readInt(); // L: 8994
				var3.field1236 = (var5 & 1) != 0 ? var0.method9398() : var3.definition.turnLeftSequence; // L: 8995
				var3.field1179 = (var5 & 2) != 0 ? var0.readUnsignedShort() : var3.definition.turnRightSequence; // L: 8996
				var3.walkSequence = (var5 & 4) != 0 ? var0.method9538() : var3.definition.walkSequence; // L: 8997
				var3.walkBackSequence = (var5 & 8) != 0 ? var0.method9430() : var3.definition.walkBackSequence; // L: 8998
				var3.walkLeftSequence = (var5 & 16) != 0 ? var0.method9430() : var3.definition.walkLeftSequence; // L: 8999
				var3.walkRightSequence = (var5 & 32) != 0 ? var0.method9398() : var3.definition.walkRightSequence; // L: 9000
				var3.runSequence = (var5 & 64) != 0 ? var0.method9538() : var3.definition.field1962; // L: 9001
				var3.field1187 = (var5 & 128) != 0 ? var0.method9398() : var3.definition.field1963; // L: 9002
				var3.field1186 = (var5 & 256) != 0 ? var0.method9538() : var3.definition.field1964; // L: 9003
				var3.field1218 = (var5 & 512) != 0 ? var0.method9430() : var3.definition.field1965; // L: 9004
				var3.field1188 = (var5 & 1024) != 0 ? var0.method9398() : var3.definition.field1974; // L: 9005
				var3.field1178 = (var5 & 2048) != 0 ? var0.method9430() : var3.definition.field1967; // L: 9006
				var3.field1190 = (var5 & 4096) != 0 ? var0.method9538() : var3.definition.field1968; // L: 9007
				var3.field1191 = (var5 & 8192) != 0 ? var0.method9538() : var3.definition.field1969; // L: 9008
				var3.idleSequence = (var5 & 16384) != 0 ? var0.method9430() : var3.definition.idleSequence; // L: 9009
			}

			if ((var4 & 32768) != 0) { // L: 9011
				var5 = var0.method9526(); // L: 9012
				if ((var5 & 1) == 1) { // L: 9013
					var3.method2673(); // L: 9014
				} else {
					var13 = null; // L: 9017
					if ((var5 & 2) == 2) { // L: 9018
						var14 = var0.method9419(); // L: 9019
						var13 = new int[var14]; // L: 9020

						for (var8 = 0; var8 < var14; ++var8) { // L: 9021
							var9 = var0.method9398(); // L: 9022
							var9 = var9 == 65535 ? -1 : var9; // L: 9023
							var13[var8] = var9; // L: 9024
						}
					}

					var7 = null; // L: 9027
					if ((var5 & 4) == 4) { // L: 9028
						var8 = 0; // L: 9029
						if (var3.definition.recolorTo != null) { // L: 9030
							var8 = var3.definition.recolorTo.length; // L: 9031
						}

						var7 = new short[var8]; // L: 9033

						for (var9 = 0; var9 < var8; ++var9) { // L: 9034
							var7[var9] = (short)var0.method9430(); // L: 9035
						}
					}

					var15 = null; // L: 9038
					if ((var5 & 8) == 8) { // L: 9039
						var9 = 0; // L: 9040
						if (var3.definition.retextureTo != null) { // L: 9041
							var9 = var3.definition.retextureTo.length; // L: 9042
						}

						var15 = new short[var9]; // L: 9044

						for (var10 = 0; var10 < var9; ++var10) { // L: 9045
							var15[var10] = (short)var0.method9398(); // L: 9046
						}
					}

					var18 = false; // L: 9049
					if ((var5 & 16) != 0) { // L: 9050
						var18 = var0.method9420() == 1; // L: 9051
					}

					var16 = (long)(++NPC.field1302 - 1); // L: 9053
					var3.method2670(new class187(var16, var13, var7, var15, var18)); // L: 9054
				}
			}
		}

	} // L: 9058
}
