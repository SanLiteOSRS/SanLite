import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ar")
class class17 implements SSLSession {
	@ObfuscatedName("au")
	@Export("SpriteBuffer_yOffsets")
	public static int[] SpriteBuffer_yOffsets;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	final class12 this$1;

	@ObfuscatedSignature(
		descriptor = "(Lax;)V"
	)
	class17(class12 var1) {
		this.this$1 = var1; // L: 134
	}

	public String getCipherSuite() {
		throw new UnsupportedOperationException(); // L: 142
	}

	public int getApplicationBufferSize() {
		return 0; // L: 137
	}

	public void removeValue(String var1) {
		throw new UnsupportedOperationException(); // L: 237
	}

	public long getLastAccessedTime() {
		throw new UnsupportedOperationException(); // L: 157
	}

	public Principal getLocalPrincipal() {
		throw new UnsupportedOperationException(); // L: 167
	}

	public int getPacketBufferSize() {
		throw new UnsupportedOperationException(); // L: 172
	}

	public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
		return null; // L: 177
	}

	public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
		return this.this$1.field61; // L: 182
	}

	public int getPeerPort() {
		return 0; // L: 192
	}

	public SSLSessionContext getSessionContext() {
		throw new UnsupportedOperationException(); // L: 207
	}

	public boolean isValid() {
		throw new UnsupportedOperationException(); // L: 227
	}

	public String[] getValueNames() {
		throw new UnsupportedOperationException(); // L: 217
	}

	public byte[] getId() {
		throw new UnsupportedOperationException(); // L: 152
	}

	public void putValue(String var1, Object var2) {
		throw new UnsupportedOperationException(); // L: 232
	}

	public String getProtocol() {
		throw new UnsupportedOperationException(); // L: 202
	}

	public String getPeerHost() {
		throw new UnsupportedOperationException(); // L: 187
	}

	public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
		return null; // L: 197
	}

	public long getCreationTime() {
		throw new UnsupportedOperationException(); // L: 147
	}

	public Certificate[] getLocalCertificates() {
		throw new UnsupportedOperationException(); // L: 162
	}

	public Object getValue(String var1) {
		throw new UnsupportedOperationException(); // L: 212
	}

	public void invalidate() {
		throw new UnsupportedOperationException(); // L: 222
	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(IIIIILjava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "-1745540313"
	)
	static final void method249(int var0, int var1, int var2, int var3, int var4, String var5, String var6, int var7, int var8) {
		if (var2 >= 2000) { // L: 8770
			var2 -= 2000;
		}

		NPC var9;
		PacketBufferNode var10;
		if (var2 == 11) { // L: 8771
			var9 = Client.npcs[var3]; // L: 8772
			if (var9 != null) { // L: 8773
				Client.mouseCrossX = var7; // L: 8774
				Client.mouseCrossY = var8; // L: 8775
				Client.mouseCrossColor = 2; // L: 8776
				Client.mouseCrossState = 0; // L: 8777
				Client.destinationX = var0; // L: 8778
				Client.destinationY = var1; // L: 8779
				var10 = class330.getPacketBufferNode(ClientPacket.field3178, Client.packetWriter.isaacCipher); // L: 8781
				var10.packetBuffer.method9132(var3); // L: 8782
				var10.packetBuffer.method9086(Client.field721.method4229(82) ? 1 : 0); // L: 8783
				Client.packetWriter.addNode(var10); // L: 8784
			}
		}

		PacketBufferNode var14;
		if (var2 == 6) { // L: 8787
			Client.mouseCrossX = var7; // L: 8788
			Client.mouseCrossY = var8; // L: 8789
			Client.mouseCrossColor = 2; // L: 8790
			Client.mouseCrossState = 0; // L: 8791
			Client.destinationX = var0; // L: 8792
			Client.destinationY = var1; // L: 8793
			var14 = class330.getPacketBufferNode(ClientPacket.field3100, Client.packetWriter.isaacCipher); // L: 8795
			var14.packetBuffer.method9096(var3); // L: 8796
			var14.packetBuffer.method9086(Client.field721.method4229(82) ? 1 : 0); // L: 8797
			var14.packetBuffer.method9096(GameObject.baseY * 64 + var1); // L: 8798
			var14.packetBuffer.method9132(WorldMapData_0.baseX * 64 + var0); // L: 8799
			Client.packetWriter.addNode(var14); // L: 8800
		}

		if (var2 == 13) { // L: 8802
			var9 = Client.npcs[var3]; // L: 8803
			if (var9 != null) { // L: 8804
				Client.mouseCrossX = var7; // L: 8805
				Client.mouseCrossY = var8; // L: 8806
				Client.mouseCrossColor = 2; // L: 8807
				Client.mouseCrossState = 0; // L: 8808
				Client.destinationX = var0; // L: 8809
				Client.destinationY = var1; // L: 8810
				var10 = class330.getPacketBufferNode(ClientPacket.field3187, Client.packetWriter.isaacCipher); // L: 8812
				var10.packetBuffer.writeByte(Client.field721.method4229(82) ? 1 : 0); // L: 8813
				var10.packetBuffer.method9096(var3); // L: 8814
				Client.packetWriter.addNode(var10); // L: 8815
			}
		}

		if (var2 == 5) { // L: 8818
			Client.mouseCrossX = var7; // L: 8819
			Client.mouseCrossY = var8; // L: 8820
			Client.mouseCrossColor = 2; // L: 8821
			Client.mouseCrossState = 0; // L: 8822
			Client.destinationX = var0; // L: 8823
			Client.destinationY = var1; // L: 8824
			var14 = class330.getPacketBufferNode(ClientPacket.field3143, Client.packetWriter.isaacCipher); // L: 8826
			var14.packetBuffer.method9257(WorldMapData_0.baseX * 64 + var0); // L: 8827
			var14.packetBuffer.method9132(var3); // L: 8828
			var14.packetBuffer.method9257(GameObject.baseY * 64 + var1); // L: 8829
			var14.packetBuffer.method9114(Client.field721.method4229(82) ? 1 : 0); // L: 8830
			Client.packetWriter.addNode(var14); // L: 8831
		}

		if (var2 == 1008 || var2 == 1009 || var2 == 1010 || var2 == 1011 || var2 == 1012) { // L: 8833
			class126.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1)); // L: 8834
		}

		if (var2 == 19) { // L: 8836
			Client.mouseCrossX = var7; // L: 8837
			Client.mouseCrossY = var8; // L: 8838
			Client.mouseCrossColor = 2; // L: 8839
			Client.mouseCrossState = 0; // L: 8840
			Client.destinationX = var0; // L: 8841
			Client.destinationY = var1; // L: 8842
			var14 = class330.getPacketBufferNode(ClientPacket.field3132, Client.packetWriter.isaacCipher); // L: 8844
			var14.packetBuffer.method9096(GameObject.baseY * 64 + var1); // L: 8845
			var14.packetBuffer.method9257(var3); // L: 8846
			var14.packetBuffer.writeByte(Client.field721.method4229(82) ? 1 : 0); // L: 8847
			var14.packetBuffer.method9257(WorldMapData_0.baseX * 64 + var0); // L: 8848
			Client.packetWriter.addNode(var14); // L: 8849
		}

		if (var2 == 1001) { // L: 8851
			Client.mouseCrossX = var7; // L: 8852
			Client.mouseCrossY = var8; // L: 8853
			Client.mouseCrossColor = 2; // L: 8854
			Client.mouseCrossState = 0; // L: 8855
			Client.destinationX = var0; // L: 8856
			Client.destinationY = var1; // L: 8857
			var14 = class330.getPacketBufferNode(ClientPacket.field3170, Client.packetWriter.isaacCipher); // L: 8859
			var14.packetBuffer.method9114(Client.field721.method4229(82) ? 1 : 0); // L: 8860
			var14.packetBuffer.method9257(var3); // L: 8861
			var14.packetBuffer.method9096(WorldMapData_0.baseX * 64 + var0); // L: 8862
			var14.packetBuffer.method9257(GameObject.baseY * 64 + var1); // L: 8863
			Client.packetWriter.addNode(var14); // L: 8864
		}

		if (var2 == 23) { // L: 8866
			if (Client.isMenuOpen) { // L: 8867
				class31.scene.setViewportWalking(); // L: 8868
			} else {
				class31.scene.menuOpen(GameEngine.Client_plane, var0, var1, true); // L: 8871
			}
		}

		int var11;
		Widget var15;
		if (var2 == 28) { // L: 8874
			var14 = class330.getPacketBufferNode(ClientPacket.field3131, Client.packetWriter.isaacCipher); // L: 8876
			var14.packetBuffer.writeInt(var1); // L: 8877
			Client.packetWriter.addNode(var14); // L: 8878
			var15 = class165.getWidget(var1); // L: 8879
			if (var15 != null && var15.cs1Instructions != null && var15.cs1Instructions[0][0] == 5) { // L: 8880
				var11 = var15.cs1Instructions[0][1]; // L: 8881
				Varps.Varps_main[var11] = 1 - Varps.Varps_main[var11]; // L: 8882
				class7.changeGameOptions(var11); // L: 8883
			}
		}

		Player var16;
		if (var2 == 47) { // L: 8886
			var16 = Client.players[var3]; // L: 8887
			if (var16 != null) { // L: 8888
				Client.mouseCrossX = var7; // L: 8889
				Client.mouseCrossY = var8; // L: 8890
				Client.mouseCrossColor = 2; // L: 8891
				Client.mouseCrossState = 0; // L: 8892
				Client.destinationX = var0; // L: 8893
				Client.destinationY = var1; // L: 8894
				var10 = class330.getPacketBufferNode(ClientPacket.field3160, Client.packetWriter.isaacCipher); // L: 8896
				var10.packetBuffer.method9114(Client.field721.method4229(82) ? 1 : 0); // L: 8897
				var10.packetBuffer.method9132(var3); // L: 8898
				Client.packetWriter.addNode(var10); // L: 8899
			}
		}

		if (var2 == 7) { // L: 8902
			var9 = Client.npcs[var3]; // L: 8903
			if (var9 != null) { // L: 8904
				Client.mouseCrossX = var7; // L: 8905
				Client.mouseCrossY = var8; // L: 8906
				Client.mouseCrossColor = 2; // L: 8907
				Client.mouseCrossState = 0; // L: 8908
				Client.destinationX = var0; // L: 8909
				Client.destinationY = var1; // L: 8910
				var10 = class330.getPacketBufferNode(ClientPacket.field3191, Client.packetWriter.isaacCipher); // L: 8912
				var10.packetBuffer.method9203(Client.field721.method4229(82) ? 1 : 0); // L: 8913
				var10.packetBuffer.writeInt(class294.field3364); // L: 8914
				var10.packetBuffer.method9096(var3); // L: 8915
				var10.packetBuffer.method9257(class144.field1677); // L: 8916
				var10.packetBuffer.writeShort(WorldMapSectionType.field2984); // L: 8917
				Client.packetWriter.addNode(var10); // L: 8918
			}
		}

		if (var2 == 50) { // L: 8921
			var16 = Client.players[var3]; // L: 8922
			if (var16 != null) { // L: 8923
				Client.mouseCrossX = var7; // L: 8924
				Client.mouseCrossY = var8; // L: 8925
				Client.mouseCrossColor = 2; // L: 8926
				Client.mouseCrossState = 0; // L: 8927
				Client.destinationX = var0; // L: 8928
				Client.destinationY = var1; // L: 8929
				var10 = class330.getPacketBufferNode(ClientPacket.field3116, Client.packetWriter.isaacCipher); // L: 8931
				var10.packetBuffer.method9257(var3); // L: 8932
				var10.packetBuffer.method9086(Client.field721.method4229(82) ? 1 : 0); // L: 8933
				Client.packetWriter.addNode(var10); // L: 8934
			}
		}

		if (var2 == 10) { // L: 8937
			var9 = Client.npcs[var3]; // L: 8938
			if (var9 != null) { // L: 8939
				Client.mouseCrossX = var7; // L: 8940
				Client.mouseCrossY = var8; // L: 8941
				Client.mouseCrossColor = 2; // L: 8942
				Client.mouseCrossState = 0; // L: 8943
				Client.destinationX = var0; // L: 8944
				Client.destinationY = var1; // L: 8945
				var10 = class330.getPacketBufferNode(ClientPacket.field3164, Client.packetWriter.isaacCipher); // L: 8947
				var10.packetBuffer.method9096(var3); // L: 8948
				var10.packetBuffer.method9086(Client.field721.method4229(82) ? 1 : 0); // L: 8949
				Client.packetWriter.addNode(var10); // L: 8950
			}
		}

		Widget var17;
		if (var2 == 57 || var2 == 1007) { // L: 8953
			var17 = SoundSystem.getWidgetChild(var1, var0); // L: 8954
			if (var17 != null) { // L: 8955
				Message.widgetDefaultMenuAction(var3, var1, var0, var4, var6); // L: 8956
			}
		}

		if (var2 == 14) { // L: 8959
			var16 = Client.players[var3]; // L: 8960
			if (var16 != null) { // L: 8961
				Client.mouseCrossX = var7; // L: 8962
				Client.mouseCrossY = var8; // L: 8963
				Client.mouseCrossColor = 2; // L: 8964
				Client.mouseCrossState = 0; // L: 8965
				Client.destinationX = var0; // L: 8966
				Client.destinationY = var1; // L: 8967
				var10 = class330.getPacketBufferNode(ClientPacket.field3129, Client.packetWriter.isaacCipher); // L: 8969
				var10.packetBuffer.writeShort(var3); // L: 8970
				var10.packetBuffer.method9086(Client.field721.method4229(82) ? 1 : 0); // L: 8971
				var10.packetBuffer.method9096(WorldMapSectionType.field2984); // L: 8972
				var10.packetBuffer.writeInt(class294.field3364); // L: 8973
				var10.packetBuffer.writeShort(class144.field1677); // L: 8974
				Client.packetWriter.addNode(var10); // L: 8975
			}
		}

		if (var2 == 48) { // L: 8978
			var16 = Client.players[var3]; // L: 8979
			if (var16 != null) { // L: 8980
				Client.mouseCrossX = var7; // L: 8981
				Client.mouseCrossY = var8; // L: 8982
				Client.mouseCrossColor = 2; // L: 8983
				Client.mouseCrossState = 0; // L: 8984
				Client.destinationX = var0; // L: 8985
				Client.destinationY = var1; // L: 8986
				var10 = class330.getPacketBufferNode(ClientPacket.field3120, Client.packetWriter.isaacCipher); // L: 8988
				var10.packetBuffer.method9114(Client.field721.method4229(82) ? 1 : 0); // L: 8989
				var10.packetBuffer.writeShort(var3); // L: 8990
				Client.packetWriter.addNode(var10); // L: 8991
			}
		}

		if (var2 == 9) { // L: 8994
			var9 = Client.npcs[var3]; // L: 8995
			if (var9 != null) { // L: 8996
				Client.mouseCrossX = var7; // L: 8997
				Client.mouseCrossY = var8; // L: 8998
				Client.mouseCrossColor = 2; // L: 8999
				Client.mouseCrossState = 0; // L: 9000
				Client.destinationX = var0; // L: 9001
				Client.destinationY = var1; // L: 9002
				var10 = class330.getPacketBufferNode(ClientPacket.field3189, Client.packetWriter.isaacCipher); // L: 9004
				var10.packetBuffer.writeByte(Client.field721.method4229(82) ? 1 : 0); // L: 9005
				var10.packetBuffer.method9257(var3); // L: 9006
				Client.packetWriter.addNode(var10); // L: 9007
			}
		}

		if (var2 == 51) { // L: 9010
			var16 = Client.players[var3]; // L: 9011
			if (var16 != null) { // L: 9012
				Client.mouseCrossX = var7; // L: 9013
				Client.mouseCrossY = var8; // L: 9014
				Client.mouseCrossColor = 2; // L: 9015
				Client.mouseCrossState = 0; // L: 9016
				Client.destinationX = var0; // L: 9017
				Client.destinationY = var1; // L: 9018
				var10 = class330.getPacketBufferNode(ClientPacket.field3106, Client.packetWriter.isaacCipher); // L: 9020
				var10.packetBuffer.method9096(var3); // L: 9021
				var10.packetBuffer.method9114(Client.field721.method4229(82) ? 1 : 0); // L: 9022
				Client.packetWriter.addNode(var10); // L: 9023
			}
		}

		if (var2 == 3) { // L: 9026
			Client.mouseCrossX = var7; // L: 9027
			Client.mouseCrossY = var8; // L: 9028
			Client.mouseCrossColor = 2; // L: 9029
			Client.mouseCrossState = 0; // L: 9030
			Client.destinationX = var0; // L: 9031
			Client.destinationY = var1; // L: 9032
			var14 = class330.getPacketBufferNode(ClientPacket.field3108, Client.packetWriter.isaacCipher); // L: 9034
			var14.packetBuffer.method9132(WorldMapData_0.baseX * 64 + var0); // L: 9035
			var14.packetBuffer.method9086(Client.field721.method4229(82) ? 1 : 0); // L: 9036
			var14.packetBuffer.method9257(GameObject.baseY * 64 + var1); // L: 9037
			var14.packetBuffer.method9096(var3); // L: 9038
			Client.packetWriter.addNode(var14); // L: 9039
		}

		if (var2 == 25) { // L: 9041
			var17 = SoundSystem.getWidgetChild(var1, var0); // L: 9042
			if (var17 != null) { // L: 9043
				class166.Widget_runOnTargetLeave(); // L: 9044
				class18.selectSpell(var1, var0, class195.Widget_unpackTargetMask(class25.getWidgetFlags(var17)), var4); // L: 9045
				Client.isItemSelected = 0; // L: 9046
				Client.selectedSpellActionName = MusicPatchNode.Widget_getSpellActionName(var17); // L: 9047
				if (Client.selectedSpellActionName == null) { // L: 9048
					Client.selectedSpellActionName = "null";
				}

				if (var17.isIf3) { // L: 9049
					Client.selectedSpellName = var17.dataText + class383.colorStartTag(16777215);
				} else {
					Client.selectedSpellName = class383.colorStartTag(65280) + var17.field3698 + class383.colorStartTag(16777215); // L: 9050
				}
			}

		} else {
			PacketBufferNode var13;
			if (var2 == 24) { // L: 9054
				var17 = class165.getWidget(var1); // L: 9055
				if (var17 != null) { // L: 9056
					boolean var12 = true; // L: 9057
					if (var17.contentType > 0) { // L: 9058
						var12 = Message.method1199(var17);
					}

					if (var12) { // L: 9059
						var13 = class330.getPacketBufferNode(ClientPacket.field3131, Client.packetWriter.isaacCipher); // L: 9061
						var13.packetBuffer.writeInt(var1); // L: 9062
						Client.packetWriter.addNode(var13); // L: 9063
					}
				}
			}

			if (var2 == 1003) { // L: 9067
				Client.mouseCrossX = var7; // L: 9068
				Client.mouseCrossY = var8; // L: 9069
				Client.mouseCrossColor = 2; // L: 9070
				Client.mouseCrossState = 0; // L: 9071
				var9 = Client.npcs[var3]; // L: 9072
				if (var9 != null) { // L: 9073
					NPCComposition var18 = var9.definition; // L: 9074
					if (var18.transforms != null) { // L: 9075
						var18 = var18.transform();
					}

					if (var18 != null) { // L: 9076
						var13 = class330.getPacketBufferNode(ClientPacket.field3158, Client.packetWriter.isaacCipher); // L: 9078
						var13.packetBuffer.method9132(var18.id); // L: 9079
						Client.packetWriter.addNode(var13); // L: 9080
					}
				}
			}

			if (var2 == 20) { // L: 9084
				Client.mouseCrossX = var7; // L: 9085
				Client.mouseCrossY = var8; // L: 9086
				Client.mouseCrossColor = 2; // L: 9087
				Client.mouseCrossState = 0; // L: 9088
				Client.destinationX = var0; // L: 9089
				Client.destinationY = var1; // L: 9090
				var14 = class330.getPacketBufferNode(ClientPacket.field3126, Client.packetWriter.isaacCipher); // L: 9092
				var14.packetBuffer.method9096(WorldMapData_0.baseX * 64 + var0); // L: 9093
				var14.packetBuffer.writeByte(Client.field721.method4229(82) ? 1 : 0); // L: 9094
				var14.packetBuffer.method9257(var3); // L: 9095
				var14.packetBuffer.method9096(GameObject.baseY * 64 + var1); // L: 9096
				Client.packetWriter.addNode(var14); // L: 9097
			}

			if (var2 == 49) { // L: 9099
				var16 = Client.players[var3]; // L: 9100
				if (var16 != null) { // L: 9101
					Client.mouseCrossX = var7; // L: 9102
					Client.mouseCrossY = var8; // L: 9103
					Client.mouseCrossColor = 2; // L: 9104
					Client.mouseCrossState = 0; // L: 9105
					Client.destinationX = var0; // L: 9106
					Client.destinationY = var1; // L: 9107
					var10 = class330.getPacketBufferNode(ClientPacket.field3155, Client.packetWriter.isaacCipher); // L: 9109
					var10.packetBuffer.method9096(var3); // L: 9110
					var10.packetBuffer.method9114(Client.field721.method4229(82) ? 1 : 0); // L: 9111
					Client.packetWriter.addNode(var10); // L: 9112
				}
			}

			if (var2 == 8) { // L: 9115
				var9 = Client.npcs[var3]; // L: 9116
				if (var9 != null) { // L: 9117
					Client.mouseCrossX = var7; // L: 9118
					Client.mouseCrossY = var8; // L: 9119
					Client.mouseCrossColor = 2; // L: 9120
					Client.mouseCrossState = 0; // L: 9121
					Client.destinationX = var0; // L: 9122
					Client.destinationY = var1; // L: 9123
					var10 = class330.getPacketBufferNode(ClientPacket.field3150, Client.packetWriter.isaacCipher); // L: 9124
					var10.packetBuffer.method9096(Client.selectedSpellItemId); // L: 9125
					var10.packetBuffer.method9043(class236.selectedSpellWidget); // L: 9126
					var10.packetBuffer.method9132(var3); // L: 9127
					var10.packetBuffer.method9096(Client.selectedSpellChildIndex); // L: 9128
					var10.packetBuffer.method9086(Client.field721.method4229(82) ? 1 : 0); // L: 9129
					Client.packetWriter.addNode(var10); // L: 9130
				}
			}

			if (var2 == 2) { // L: 9133
				Client.mouseCrossX = var7; // L: 9134
				Client.mouseCrossY = var8; // L: 9135
				Client.mouseCrossColor = 2; // L: 9136
				Client.mouseCrossState = 0; // L: 9137
				Client.destinationX = var0; // L: 9138
				Client.destinationY = var1; // L: 9139
				var14 = class330.getPacketBufferNode(ClientPacket.field3122, Client.packetWriter.isaacCipher); // L: 9140
				var14.packetBuffer.method9086(Client.field721.method4229(82) ? 1 : 0); // L: 9141
				var14.packetBuffer.method9132(var3); // L: 9142
				var14.packetBuffer.method9132(Client.selectedSpellItemId); // L: 9143
				var14.packetBuffer.method9132(WorldMapData_0.baseX * 64 + var0); // L: 9144
				var14.packetBuffer.method9257(Client.selectedSpellChildIndex); // L: 9145
				var14.packetBuffer.method9043(class236.selectedSpellWidget); // L: 9146
				var14.packetBuffer.method9257(GameObject.baseY * 64 + var1); // L: 9147
				Client.packetWriter.addNode(var14); // L: 9148
			}

			if (var2 == 1002) { // L: 9150
				Client.mouseCrossX = var7; // L: 9151
				Client.mouseCrossY = var8; // L: 9152
				Client.mouseCrossColor = 2; // L: 9153
				Client.mouseCrossState = 0; // L: 9154
				var14 = class330.getPacketBufferNode(ClientPacket.field3107, Client.packetWriter.isaacCipher); // L: 9156
				var14.packetBuffer.method9257(var3); // L: 9157
				Client.packetWriter.addNode(var14); // L: 9158
			}

			if (var2 == 45) { // L: 9160
				var16 = Client.players[var3]; // L: 9161
				if (var16 != null) { // L: 9162
					Client.mouseCrossX = var7; // L: 9163
					Client.mouseCrossY = var8; // L: 9164
					Client.mouseCrossColor = 2; // L: 9165
					Client.mouseCrossState = 0; // L: 9166
					Client.destinationX = var0; // L: 9167
					Client.destinationY = var1; // L: 9168
					var10 = class330.getPacketBufferNode(ClientPacket.field3133, Client.packetWriter.isaacCipher); // L: 9170
					var10.packetBuffer.method9086(Client.field721.method4229(82) ? 1 : 0); // L: 9171
					var10.packetBuffer.method9132(var3); // L: 9172
					Client.packetWriter.addNode(var10); // L: 9173
				}
			}

			if (var2 == 16) { // L: 9176
				Client.mouseCrossX = var7; // L: 9177
				Client.mouseCrossY = var8; // L: 9178
				Client.mouseCrossColor = 2; // L: 9179
				Client.mouseCrossState = 0; // L: 9180
				Client.destinationX = var0; // L: 9181
				Client.destinationY = var1; // L: 9182
				var14 = class330.getPacketBufferNode(ClientPacket.field3113, Client.packetWriter.isaacCipher); // L: 9184
				var14.packetBuffer.writeShort(WorldMapSectionType.field2984); // L: 9185
				var14.packetBuffer.method9257(WorldMapData_0.baseX * 64 + var0); // L: 9186
				var14.packetBuffer.method9257(var3); // L: 9187
				var14.packetBuffer.method9257(GameObject.baseY * 64 + var1); // L: 9188
				var14.packetBuffer.writeShort(class144.field1677); // L: 9189
				var14.packetBuffer.writeByte(Client.field721.method4229(82) ? 1 : 0); // L: 9190
				var14.packetBuffer.method9043(class294.field3364); // L: 9191
				Client.packetWriter.addNode(var14); // L: 9192
			}

			if (var2 == 46) { // L: 9194
				var16 = Client.players[var3]; // L: 9195
				if (var16 != null) { // L: 9196
					Client.mouseCrossX = var7; // L: 9197
					Client.mouseCrossY = var8; // L: 9198
					Client.mouseCrossColor = 2; // L: 9199
					Client.mouseCrossState = 0; // L: 9200
					Client.destinationX = var0; // L: 9201
					Client.destinationY = var1; // L: 9202
					var10 = class330.getPacketBufferNode(ClientPacket.field3130, Client.packetWriter.isaacCipher); // L: 9204
					var10.packetBuffer.method9132(var3); // L: 9205
					var10.packetBuffer.method9203(Client.field721.method4229(82) ? 1 : 0); // L: 9206
					Client.packetWriter.addNode(var10); // L: 9207
				}
			}

			if (var2 == 4) { // L: 9210
				Client.mouseCrossX = var7; // L: 9211
				Client.mouseCrossY = var8; // L: 9212
				Client.mouseCrossColor = 2; // L: 9213
				Client.mouseCrossState = 0; // L: 9214
				Client.destinationX = var0; // L: 9215
				Client.destinationY = var1; // L: 9216
				var14 = class330.getPacketBufferNode(ClientPacket.field3147, Client.packetWriter.isaacCipher); // L: 9218
				var14.packetBuffer.method9257(WorldMapData_0.baseX * 64 + var0); // L: 9219
				var14.packetBuffer.method9132(GameObject.baseY * 64 + var1); // L: 9220
				var14.packetBuffer.method9257(var3); // L: 9221
				var14.packetBuffer.method9203(Client.field721.method4229(82) ? 1 : 0); // L: 9222
				Client.packetWriter.addNode(var14); // L: 9223
			}

			if (var2 == 44) { // L: 9225
				var16 = Client.players[var3]; // L: 9226
				if (var16 != null) { // L: 9227
					Client.mouseCrossX = var7; // L: 9228
					Client.mouseCrossY = var8; // L: 9229
					Client.mouseCrossColor = 2; // L: 9230
					Client.mouseCrossState = 0; // L: 9231
					Client.destinationX = var0; // L: 9232
					Client.destinationY = var1; // L: 9233
					var10 = class330.getPacketBufferNode(ClientPacket.field3127, Client.packetWriter.isaacCipher); // L: 9235
					var10.packetBuffer.method9203(Client.field721.method4229(82) ? 1 : 0); // L: 9236
					var10.packetBuffer.writeShort(var3); // L: 9237
					Client.packetWriter.addNode(var10); // L: 9238
				}
			}

			if (var2 == 18) { // L: 9241
				Client.mouseCrossX = var7; // L: 9242
				Client.mouseCrossY = var8; // L: 9243
				Client.mouseCrossColor = 2; // L: 9244
				Client.mouseCrossState = 0; // L: 9245
				Client.destinationX = var0; // L: 9246
				Client.destinationY = var1; // L: 9247
				var14 = class330.getPacketBufferNode(ClientPacket.field3182, Client.packetWriter.isaacCipher); // L: 9249
				var14.packetBuffer.method9257(var3); // L: 9250
				var14.packetBuffer.writeShort(GameObject.baseY * 64 + var1); // L: 9251
				var14.packetBuffer.method9086(Client.field721.method4229(82) ? 1 : 0); // L: 9252
				var14.packetBuffer.method9132(WorldMapData_0.baseX * 64 + var0); // L: 9253
				Client.packetWriter.addNode(var14); // L: 9254
			}

			if (var2 == 58) { // L: 9256
				var17 = SoundSystem.getWidgetChild(var1, var0); // L: 9257
				if (var17 != null) { // L: 9258
					if (var17.field3677 != null) { // L: 9259
						ScriptEvent var19 = new ScriptEvent(); // L: 9260
						var19.widget = var17; // L: 9261
						var19.opIndex = var3; // L: 9262
						var19.targetName = var6; // L: 9263
						var19.args = var17.field3677; // L: 9264
						HealthBarUpdate.runScriptEvent(var19); // L: 9265
					}

					var10 = class330.getPacketBufferNode(ClientPacket.field3118, Client.packetWriter.isaacCipher); // L: 9268
					var10.packetBuffer.method9132(var0); // L: 9269
					var10.packetBuffer.writeShort(var4); // L: 9270
					var10.packetBuffer.writeIntME(class236.selectedSpellWidget); // L: 9271
					var10.packetBuffer.method9257(Client.selectedSpellChildIndex); // L: 9272
					var10.packetBuffer.method9043(var1); // L: 9273
					var10.packetBuffer.method9096(Client.selectedSpellItemId); // L: 9274
					Client.packetWriter.addNode(var10); // L: 9275
				}
			}

			if (var2 == 30 && Client.meslayerContinueWidget == null) { // L: 9278 9279
				class81.resumePauseWidget(var1, var0); // L: 9280
				Client.meslayerContinueWidget = SoundSystem.getWidgetChild(var1, var0); // L: 9281
				class144.invalidateWidget(Client.meslayerContinueWidget); // L: 9282
			}

			if (var2 == 26) { // L: 9285
				class148.method3291(); // L: 9286
			}

			if (var2 == 15) { // L: 9288
				var16 = Client.players[var3]; // L: 9289
				if (var16 != null) { // L: 9290
					Client.mouseCrossX = var7; // L: 9291
					Client.mouseCrossY = var8; // L: 9292
					Client.mouseCrossColor = 2; // L: 9293
					Client.mouseCrossState = 0; // L: 9294
					Client.destinationX = var0; // L: 9295
					Client.destinationY = var1; // L: 9296
					var10 = class330.getPacketBufferNode(ClientPacket.field3145, Client.packetWriter.isaacCipher); // L: 9297
					var10.packetBuffer.method9257(Client.selectedSpellChildIndex); // L: 9298
					var10.packetBuffer.method9096(Client.selectedSpellItemId); // L: 9299
					var10.packetBuffer.method9132(var3); // L: 9300
					var10.packetBuffer.method9086(Client.field721.method4229(82) ? 1 : 0); // L: 9301
					var10.packetBuffer.writeInt(class236.selectedSpellWidget); // L: 9302
					Client.packetWriter.addNode(var10); // L: 9303
				}
			}

			if (var2 == 12) { // L: 9306
				var9 = Client.npcs[var3]; // L: 9307
				if (var9 != null) { // L: 9308
					Client.mouseCrossX = var7; // L: 9309
					Client.mouseCrossY = var8; // L: 9310
					Client.mouseCrossColor = 2; // L: 9311
					Client.mouseCrossState = 0; // L: 9312
					Client.destinationX = var0; // L: 9313
					Client.destinationY = var1; // L: 9314
					var10 = class330.getPacketBufferNode(ClientPacket.field3162, Client.packetWriter.isaacCipher); // L: 9316
					var10.packetBuffer.method9096(var3); // L: 9317
					var10.packetBuffer.method9203(Client.field721.method4229(82) ? 1 : 0); // L: 9318
					Client.packetWriter.addNode(var10); // L: 9319
				}
			}

			if (var2 == 1) { // L: 9322
				Client.mouseCrossX = var7; // L: 9323
				Client.mouseCrossY = var8; // L: 9324
				Client.mouseCrossColor = 2; // L: 9325
				Client.mouseCrossState = 0; // L: 9326
				Client.destinationX = var0; // L: 9327
				Client.destinationY = var1; // L: 9328
				var14 = class330.getPacketBufferNode(ClientPacket.field3141, Client.packetWriter.isaacCipher); // L: 9330
				var14.packetBuffer.method9096(var3); // L: 9331
				var14.packetBuffer.method9043(class294.field3364); // L: 9332
				var14.packetBuffer.writeShort(WorldMapSectionType.field2984); // L: 9333
				var14.packetBuffer.method9096(WorldMapData_0.baseX * 64 + var0); // L: 9334
				var14.packetBuffer.method9086(Client.field721.method4229(82) ? 1 : 0); // L: 9335
				var14.packetBuffer.method9096(class144.field1677); // L: 9336
				var14.packetBuffer.method9257(GameObject.baseY * 64 + var1); // L: 9337
				Client.packetWriter.addNode(var14); // L: 9338
			}

			if (var2 == 17) { // L: 9340
				Client.mouseCrossX = var7; // L: 9341
				Client.mouseCrossY = var8; // L: 9342
				Client.mouseCrossColor = 2; // L: 9343
				Client.mouseCrossState = 0; // L: 9344
				Client.destinationX = var0; // L: 9345
				Client.destinationY = var1; // L: 9346
				var14 = class330.getPacketBufferNode(ClientPacket.field3123, Client.packetWriter.isaacCipher); // L: 9347
				var14.packetBuffer.method9086(Client.field721.method4229(82) ? 1 : 0); // L: 9348
				var14.packetBuffer.method9043(class236.selectedSpellWidget); // L: 9349
				var14.packetBuffer.method9257(Client.selectedSpellChildIndex); // L: 9350
				var14.packetBuffer.writeShort(var3); // L: 9351
				var14.packetBuffer.method9132(WorldMapData_0.baseX * 64 + var0); // L: 9352
				var14.packetBuffer.method9096(GameObject.baseY * 64 + var1); // L: 9353
				var14.packetBuffer.method9096(Client.selectedSpellItemId); // L: 9354
				Client.packetWriter.addNode(var14); // L: 9355
			}

			if (var2 == 21) { // L: 9357
				Client.mouseCrossX = var7; // L: 9358
				Client.mouseCrossY = var8; // L: 9359
				Client.mouseCrossColor = 2; // L: 9360
				Client.mouseCrossState = 0; // L: 9361
				Client.destinationX = var0; // L: 9362
				Client.destinationY = var1; // L: 9363
				var14 = class330.getPacketBufferNode(ClientPacket.field3121, Client.packetWriter.isaacCipher); // L: 9365
				var14.packetBuffer.method9096(WorldMapData_0.baseX * 64 + var0); // L: 9366
				var14.packetBuffer.method9086(Client.field721.method4229(82) ? 1 : 0); // L: 9367
				var14.packetBuffer.method9257(GameObject.baseY * 64 + var1); // L: 9368
				var14.packetBuffer.method9132(var3); // L: 9369
				Client.packetWriter.addNode(var14); // L: 9370
			}

			if (var2 == 29) { // L: 9372
				var14 = class330.getPacketBufferNode(ClientPacket.field3131, Client.packetWriter.isaacCipher); // L: 9374
				var14.packetBuffer.writeInt(var1); // L: 9375
				Client.packetWriter.addNode(var14); // L: 9376
				var15 = class165.getWidget(var1); // L: 9377
				if (var15 != null && var15.cs1Instructions != null && var15.cs1Instructions[0][0] == 5) { // L: 9378
					var11 = var15.cs1Instructions[0][1]; // L: 9379
					if (Varps.Varps_main[var11] != var15.cs1ComparisonValues[0]) { // L: 9380
						Varps.Varps_main[var11] = var15.cs1ComparisonValues[0]; // L: 9381
						class7.changeGameOptions(var11); // L: 9382
					}
				}
			}

			if (var2 == 22) { // L: 9386
				Client.mouseCrossX = var7; // L: 9387
				Client.mouseCrossY = var8; // L: 9388
				Client.mouseCrossColor = 2; // L: 9389
				Client.mouseCrossState = 0; // L: 9390
				Client.destinationX = var0; // L: 9391
				Client.destinationY = var1; // L: 9392
				var14 = class330.getPacketBufferNode(ClientPacket.field3117, Client.packetWriter.isaacCipher); // L: 9394
				var14.packetBuffer.method9132(GameObject.baseY * 64 + var1); // L: 9395
				var14.packetBuffer.method9114(Client.field721.method4229(82) ? 1 : 0); // L: 9396
				var14.packetBuffer.writeShort(WorldMapData_0.baseX * 64 + var0); // L: 9397
				var14.packetBuffer.method9132(var3); // L: 9398
				Client.packetWriter.addNode(var14); // L: 9399
			}

			if (var2 == 1004) { // L: 9401
				Client.mouseCrossX = var7; // L: 9402
				Client.mouseCrossY = var8; // L: 9403
				Client.mouseCrossColor = 2; // L: 9404
				Client.mouseCrossState = 0; // L: 9405
				var14 = class330.getPacketBufferNode(ClientPacket.field3176, Client.packetWriter.isaacCipher); // L: 9407
				var14.packetBuffer.writeShort(GameObject.baseY * 64 + var1); // L: 9408
				var14.packetBuffer.method9132(var3); // L: 9409
				var14.packetBuffer.method9132(WorldMapData_0.baseX * 64 + var0); // L: 9410
				Client.packetWriter.addNode(var14); // L: 9411
			}

			if (Client.isItemSelected != 0) { // L: 9413
				Client.isItemSelected = 0; // L: 9414
				class144.invalidateWidget(class165.getWidget(class294.field3364)); // L: 9415
			}

			if (Client.isSpellSelected) { // L: 9417
				class166.Widget_runOnTargetLeave();
			}

		}
	} // L: 9052 9418
}
