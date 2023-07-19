import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ad")
class class17 implements SSLSession {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Las;"
	)
	final class12 this$1;

	@ObfuscatedSignature(
		descriptor = "(Las;)V"
	)
	class17(class12 var1) {
		this.this$1 = var1; // L: 141
	}

	public Principal getLocalPrincipal() {
		throw new UnsupportedOperationException(); // L: 174
	}

	public Object getValue(String var1) {
		throw new UnsupportedOperationException(); // L: 219
	}

	public long getCreationTime() {
		throw new UnsupportedOperationException();
	}

	public long getLastAccessedTime() {
		throw new UnsupportedOperationException(); // L: 164
	}

	public Certificate[] getLocalCertificates() {
		throw new UnsupportedOperationException(); // L: 169
	}

	public int getPacketBufferSize() {
		throw new UnsupportedOperationException(); // L: 179
	}

	public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
		return this.this$1.field57; // L: 189
	}

	public String getPeerHost() {
		throw new UnsupportedOperationException(); // L: 194
	}

	public int getPeerPort() {
		return 0; // L: 199
	}

	public void removeValue(String var1) {
		throw new UnsupportedOperationException(); // L: 244
	}

	public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
		return null; // L: 204
	}

	public String[] getValueNames() {
		throw new UnsupportedOperationException(); // L: 224
	}

	public void invalidate() {
		throw new UnsupportedOperationException(); // L: 229
	}

	public boolean isValid() {
		throw new UnsupportedOperationException(); // L: 234
	}

	public byte[] getId() {
		throw new UnsupportedOperationException(); // L: 159
	}

	public void putValue(String var1, Object var2) {
		throw new UnsupportedOperationException(); // L: 239
	}

	public int getApplicationBufferSize() {
		return 0; // L: 144
	}

	public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
		return null; // L: 184
	}

	public SSLSessionContext getSessionContext() {
		throw new UnsupportedOperationException(); // L: 214
	}

	public String getProtocol() {
		throw new UnsupportedOperationException(); // L: 209
	}

	public String getCipherSuite() {
		throw new UnsupportedOperationException(); // L: 149
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1458650071"
	)
	@Export("colorStartTag")
	static String colorStartTag(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">"; // L: 22
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1681602648"
	)
	@Export("Messages_getHistorySize")
	static int Messages_getHistorySize(int var0) {
		ChatChannel var1 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 48
		return var1 == null ? 0 : var1.size(); // L: 49 50
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-17"
	)
	static final void method286() {
		class339.method6635("Your ignore list is full. Max of 100 for free users, and 400 for members"); // L: 154
	} // L: 155

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(Ltf;I)V",
		garbageValue = "-1741798466"
	)
	static final void method284(PacketBuffer var0) {
		for (int var1 = 0; var1 < Client.field559; ++var1) { // L: 8771
			int var2 = Client.field560[var1]; // L: 8772
			NPC var3 = Client.npcs[var2]; // L: 8773
			int var4 = var0.readUnsignedByte(); // L: 8774
			int var5;
			if ((var4 & 32) != 0) { // L: 8775
				var5 = var0.readUnsignedByte(); // L: 8776
				var4 += var5 << 8; // L: 8777
			}

			if ((var4 & 1024) != 0) { // L: 8779
				var5 = var0.readUnsignedByte(); // L: 8780
				var4 += var5 << 16; // L: 8781
			}

			if ((var4 & 8) != 0) { // L: 8783
				var3.targetIndex = var0.readUnsignedShort(); // L: 8785
				var3.targetIndex += var0.readUnsignedByte() << 16; // L: 8786
				var5 = 16777215; // L: 8787
				if (var5 == var3.targetIndex) { // L: 8788
					var3.targetIndex = -1; // L: 8789
				}
			}

			if ((var4 & 1) != 0) { // L: 8792
				var3.definition = class144.getNpcDefinition(var0.method9100()); // L: 8793
				class93.method2409(var3); // L: 8794
				var3.method2638(); // L: 8795
			}

			int var6;
			int var7;
			if ((var4 & 4) != 0) { // L: 8797
				var5 = var0.method9099(); // L: 8798
				if (var5 == 65535) { // L: 8799
					var5 = -1; // L: 8800
				}

				var6 = var0.method9258(); // L: 8802
				if (var5 == var3.sequence && var5 != -1) { // L: 8803
					var7 = class140.SequenceDefinition_get(var5).field2301; // L: 8804
					if (var7 == 1) { // L: 8805
						var3.sequenceFrame = 0; // L: 8806
						var3.sequenceFrameCycle = 0; // L: 8807
						var3.sequenceDelay = var6; // L: 8808
						var3.field1226 = 0; // L: 8809
					}

					if (var7 == 2) { // L: 8811
						var3.field1226 = 0; // L: 8812
					}
				} else if (var5 == -1 || var3.sequence == -1 || class140.SequenceDefinition_get(var5).field2294 >= class140.SequenceDefinition_get(var3.sequence).field2294) { // L: 8815
					var3.sequence = var5; // L: 8816
					var3.sequenceFrame = 0; // L: 8817
					var3.sequenceFrameCycle = 0; // L: 8818
					var3.sequenceDelay = var6; // L: 8819
					var3.field1226 = 0; // L: 8820
					var3.field1252 = var3.pathLength; // L: 8821
				}
			}

			if ((var4 & 64) != 0) { // L: 8825
				var0.method9099(); // L: 8826
				var0.readInt(); // L: 8827
			}

			int var8;
			int var9;
			int var10;
			int[] var13;
			short[] var14;
			short[] var15;
			long var16;
			boolean var19;
			if ((var4 & 512) != 0) { // L: 8829
				var5 = var0.method9258(); // L: 8830
				if ((var5 & 1) == 1) { // L: 8831
					var3.method2642(); // L: 8832
				} else {
					var13 = null; // L: 8835
					if ((var5 & 2) == 2) { // L: 8836
						var7 = var0.method9130(); // L: 8837
						var13 = new int[var7]; // L: 8838

						for (var8 = 0; var8 < var7; ++var8) { // L: 8839
							var9 = var0.readUnsignedShort(); // L: 8840
							var9 = var9 == 65535 ? -1 : var9; // L: 8841
							var13[var8] = var9; // L: 8842
						}
					}

					var14 = null; // L: 8845
					if ((var5 & 4) == 4) { // L: 8846
						var8 = 0; // L: 8847
						if (var3.definition.recolorTo != null) { // L: 8848
							var8 = var3.definition.recolorTo.length; // L: 8849
						}

						var14 = new short[var8]; // L: 8851

						for (var9 = 0; var9 < var8; ++var9) { // L: 8852
							var14[var9] = (short)var0.readUnsignedShort(); // L: 8853
						}
					}

					var15 = null; // L: 8856
					if ((var5 & 8) == 8) { // L: 8857
						var9 = 0; // L: 8858
						if (var3.definition.retextureTo != null) { // L: 8859
							var9 = var3.definition.retextureTo.length; // L: 8860
						}

						var15 = new short[var9]; // L: 8862

						for (var10 = 0; var10 < var9; ++var10) { // L: 8863
							var15[var10] = (short)var0.method9100(); // L: 8864
						}
					}

					var19 = false; // L: 8867
					if ((var5 & 16) != 0) { // L: 8868
						var19 = var0.readUnsignedByte() == 1; // L: 8869
					}

					var16 = (long)(++NPC.field1308 - 1); // L: 8871
					var3.method2639(new class194(var16, var13, var14, var15, var19)); // L: 8872
				}
			}

			if ((var4 & 256) != 0) { // L: 8875
				var5 = var0.method9258(); // L: 8876
				if ((var5 & 1) == 1) { // L: 8877
					var3.method2646(); // L: 8878
				} else {
					var13 = null; // L: 8881
					if ((var5 & 2) == 2) { // L: 8882
						var7 = var0.method9226(); // L: 8883
						var13 = new int[var7]; // L: 8884

						for (var8 = 0; var8 < var7; ++var8) { // L: 8885
							var9 = var0.readUnsignedShort(); // L: 8886
							var9 = var9 == 65535 ? -1 : var9; // L: 8887
							var13[var8] = var9; // L: 8888
						}
					}

					var14 = null; // L: 8891
					if ((var5 & 4) == 4) { // L: 8892
						var8 = 0; // L: 8893
						if (var3.definition.recolorTo != null) { // L: 8894
							var8 = var3.definition.recolorTo.length; // L: 8895
						}

						var14 = new short[var8]; // L: 8897

						for (var9 = 0; var9 < var8; ++var9) { // L: 8898
							var14[var9] = (short)var0.method9099(); // L: 8899
						}
					}

					var15 = null; // L: 8902
					if ((var5 & 8) == 8) { // L: 8903
						var9 = 0; // L: 8904
						if (var3.definition.retextureTo != null) { // L: 8905
							var9 = var3.definition.retextureTo.length; // L: 8906
						}

						var15 = new short[var9]; // L: 8908

						for (var10 = 0; var10 < var9; ++var10) { // L: 8909
							var15[var10] = (short)var0.method9099(); // L: 8910
						}
					}

					var19 = false; // L: 8913
					if ((var5 & 16) != 0) { // L: 8914
						var19 = var0.method9130() == 1; // L: 8915
					}

					var16 = (long)(++NPC.field1314 - 1); // L: 8917
					var3.method2648(new class194(var16, var13, var14, var15, var19)); // L: 8918
				}
			}

			if ((var4 & 262144) != 0) { // L: 8921
				var5 = var0.method9144(); // L: 8922
				var3.field1184 = (var5 & 1) != 0 ? var0.method9099() : var3.definition.turnLeftSequence; // L: 8923
				var3.field1185 = (var5 & 2) != 0 ? var0.readUnsignedShort() : var3.definition.turnRightSequence; // L: 8924
				var3.walkSequence = (var5 & 4) != 0 ? var0.readUnsignedShort() : var3.definition.walkSequence; // L: 8925
				var3.walkBackSequence = (var5 & 8) != 0 ? var0.method9099() : var3.definition.walkBackSequence; // L: 8926
				var3.walkLeftSequence = (var5 & 16) != 0 ? var0.method9101() : var3.definition.walkLeftSequence; // L: 8927
				var3.walkRightSequence = (var5 & 32) != 0 ? var0.method9100() : var3.definition.walkRightSequence; // L: 8928
				var3.runSequence = (var5 & 64) != 0 ? var0.method9100() : var3.definition.field2023; // L: 8929
				var3.field1191 = (var5 & 128) != 0 ? var0.readUnsignedShort() : var3.definition.field2024; // L: 8930
				var3.field1192 = (var5 & 256) != 0 ? var0.method9101() : var3.definition.field2025; // L: 8931
				var3.field1193 = (var5 & 512) != 0 ? var0.method9101() : var3.definition.field2026; // L: 8932
				var3.field1194 = (var5 & 1024) != 0 ? var0.method9099() : var3.definition.field2028; // L: 8933
				var3.field1195 = (var5 & 2048) != 0 ? var0.method9099() : var3.definition.field2020; // L: 8934
				var3.field1196 = (var5 & 4096) != 0 ? var0.method9101() : var3.definition.field2029; // L: 8935
				var3.field1197 = (var5 & 8192) != 0 ? var0.method9100() : var3.definition.field2030; // L: 8936
				var3.idleSequence = (var5 & 16384) != 0 ? var0.method9099() : var3.definition.idleSequence; // L: 8937
			}

			if ((var4 & 131072) != 0) { // L: 8939
				var5 = var0.method9130(); // L: 8940

				for (var6 = 0; var6 < var5; ++var6) { // L: 8941
					var7 = var0.method9130(); // L: 8942
					var8 = var0.readUnsignedShort(); // L: 8943
					var9 = var0.method9144(); // L: 8944
					var3.method2428(var7, var8, var9 >> 16, var9 & 65535); // L: 8945
				}
			}

			if ((var4 & 32768) != 0) { // L: 8948
				var3.field1229 = var0.method9059(); // L: 8949
				var3.field1231 = var0.method9121(); // L: 8950
				var3.field1230 = var0.readByte(); // L: 8951
				var3.field1232 = var0.readByte(); // L: 8952
				var3.spotAnimation = var0.readUnsignedShort() + Client.cycle; // L: 8953
				var3.field1234 = var0.method9099() + Client.cycle; // L: 8954
				var3.field1235 = var0.method9100(); // L: 8955
				var3.pathLength = 1; // L: 8956
				var3.field1252 = 0; // L: 8957
				var3.field1229 += var3.pathX[0]; // L: 8958
				var3.field1231 += var3.pathY[0]; // L: 8959
				var3.field1230 += var3.pathX[0]; // L: 8960
				var3.field1232 += var3.pathY[0]; // L: 8961
			}

			if ((var4 & 2) != 0) { // L: 8963
				var5 = var0.method9101(); // L: 8964
				var6 = var0.method9101(); // L: 8965
				var3.field1217 = var0.readUnsignedByte() == 1; // L: 8966
				if (Client.field507 >= 212) { // L: 8967
					var3.field1215 = var5; // L: 8968
					var3.field1216 = var6; // L: 8969
				} else {
					var7 = var3.x - (var5 - class166.baseX * 64 - class166.baseX * 64) * 64; // L: 8972
					var8 = var3.y - (var6 - class9.baseY * 64 - class9.baseY * 64) * 64; // L: 8973
					if (var7 != 0 || var8 != 0) { // L: 8974
						var10 = (int)(Math.atan2((double)var7, (double)var8) * 325.94932345220167D) & 2047; // L: 8978
						var3.field1218 = var10; // L: 8980
					}
				}
			}

			if ((var4 & 4096) != 0) { // L: 8984
				var3.field1183 = Client.cycle + var0.method9099(); // L: 8985
				var3.field1189 = Client.cycle + var0.readUnsignedShort(); // L: 8986
				var3.field1240 = var0.method9121(); // L: 8987
				var3.field1247 = var0.readByte(); // L: 8988
				var3.field1190 = var0.method9094(); // L: 8989
				var3.field1243 = (byte)var0.readUnsignedByte(); // L: 8990
			}

			if ((var4 & 16) != 0) { // L: 8992
				var5 = var0.readUnsignedByte(); // L: 8993
				int var11;
				if (var5 > 0) { // L: 8994
					for (var6 = 0; var6 < var5; ++var6) { // L: 8995
						var8 = -1; // L: 8997
						var9 = -1; // L: 8998
						var10 = -1; // L: 8999
						var7 = var0.readUShortSmart(); // L: 9000
						if (var7 == 32767) { // L: 9001
							var7 = var0.readUShortSmart(); // L: 9002
							var9 = var0.readUShortSmart(); // L: 9003
							var8 = var0.readUShortSmart(); // L: 9004
							var10 = var0.readUShortSmart(); // L: 9005
						} else if (var7 != 32766) { // L: 9007
							var9 = var0.readUShortSmart(); // L: 9008
						} else {
							var7 = -1; // L: 9010
						}

						var11 = var0.readUShortSmart(); // L: 9011
						var3.addHitSplat(var7, var9, var8, var10, Client.cycle, var11); // L: 9012
					}
				}

				var6 = var0.readUnsignedByte(); // L: 9015
				if (var6 > 0) { // L: 9016
					for (var7 = 0; var7 < var6; ++var7) { // L: 9017
						var8 = var0.readUShortSmart(); // L: 9018
						var9 = var0.readUShortSmart(); // L: 9019
						if (var9 != 32767) { // L: 9020
							var10 = var0.readUShortSmart(); // L: 9021
							var11 = var0.method9258(); // L: 9022
							int var12 = var9 > 0 ? var0.method9258() : var11; // L: 9023
							var3.addHealthBar(var8, Client.cycle, var9, var10, var11, var12); // L: 9024
						} else {
							var3.removeHealthBar(var8); // L: 9026
						}
					}
				}
			}

			if ((var4 & 8192) != 0) { // L: 9030
				var3.method2628(var0.method9130()); // L: 9031
			}

			if ((var4 & 16384) != 0) { // L: 9033
				var3.field1253 = var0.method9111(); // L: 9034
			}

			if ((var4 & 65536) != 0) { // L: 9036
				var5 = var0.method9226(); // L: 9037
				var13 = new int[8]; // L: 9038
				var14 = new short[8]; // L: 9039

				for (var8 = 0; var8 < 8; ++var8) { // L: 9040
					if ((var5 & 1 << var8) != 0) { // L: 9041
						var13[var8] = var0.method9077(); // L: 9042
						var14[var8] = (short)var0.method9195(); // L: 9043
					} else {
						var13[var8] = -1; // L: 9046
						var14[var8] = -1; // L: 9047
					}
				}

				var3.method2682(var13, var14); // L: 9050
			}

			if ((var4 & 2048) != 0) { // L: 9052
				var3.method2645(var0.readStringCp1252NullTerminated()); // L: 9053
			}

			if ((var4 & 128) != 0) { // L: 9055
				var3.overheadText = var0.readStringCp1252NullTerminated(); // L: 9056
				var3.overheadTextCyclesRemaining = 100; // L: 9057
			}
		}

	} // L: 9060
}
