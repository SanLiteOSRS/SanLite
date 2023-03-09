import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lk")
public class class287 {
	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "[Lsn;"
	)
	@Export("headIconPrayerSprites")
	static SpritePixels[] headIconPrayerSprites;

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Lqh;",
		garbageValue = "92"
	)
	public static class420 method5474() {
		synchronized(class420.field4606) { // L: 26
			if (class420.field4600 == 0) { // L: 27
				return new class420();
			} else {
				class420.field4606[--class420.field4600].method7818(); // L: 29
				return class420.field4606[class420.field4600]; // L: 30
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "47"
	)
	public static int method5476(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765); // L: 44
		var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459); // L: 45
		var0 = var0 + (var0 >>> 4) & 252645135; // L: 46
		var0 += var0 >>> 8; // L: 47
		var0 += var0 >>> 16; // L: 48
		return var0 & 255; // L: 49
	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(IIIIILjava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "1849187210"
	)
	static final void method5475(int var0, int var1, int var2, int var3, int var4, String var5, String var6, int var7, int var8) {
		if (var2 >= 2000) { // L: 8867
			var2 -= 2000;
		}

		Player var9;
		PacketBufferNode var10;
		if (var2 == 49) { // L: 8868
			var9 = Client.players[var3]; // L: 8869
			if (var9 != null) { // L: 8870
				Client.mouseCrossX = var7; // L: 8871
				Client.mouseCrossY = var8; // L: 8872
				Client.mouseCrossColor = 2; // L: 8873
				Client.mouseCrossState = 0; // L: 8874
				Client.destinationX = var0; // L: 8875
				Client.destinationY = var1; // L: 8876
				var10 = UserComparator9.getPacketBufferNode(ClientPacket.field3086, Client.packetWriter.isaacCipher); // L: 8878
				var10.packetBuffer.writeByte(Client.field712.method4074(82) ? 1 : 0); // L: 8879
				var10.packetBuffer.method8658(var3); // L: 8880
				Client.packetWriter.addNode(var10); // L: 8881
			}
		}

		PacketBufferNode var14;
		if (var2 == 19) { // L: 8884
			Client.mouseCrossX = var7; // L: 8885
			Client.mouseCrossY = var8; // L: 8886
			Client.mouseCrossColor = 2; // L: 8887
			Client.mouseCrossState = 0; // L: 8888
			Client.destinationX = var0; // L: 8889
			Client.destinationY = var1; // L: 8890
			var14 = UserComparator9.getPacketBufferNode(ClientPacket.field3071, Client.packetWriter.isaacCipher); // L: 8892
			var14.packetBuffer.method8659(var3); // L: 8893
			var14.packetBuffer.method8658(class178.baseY * 64 + var1); // L: 8894
			var14.packetBuffer.writeIntME(GameEngine.baseX * 64 + var0); // L: 8895
			var14.packetBuffer.writeByte(Client.field712.method4074(82) ? 1 : 0); // L: 8896
			Client.packetWriter.addNode(var14); // L: 8897
		}

		if (var2 == 23) { // L: 8899
			if (Client.isMenuOpen) { // L: 8900
				class1.scene.setViewportWalking(); // L: 8901
			} else {
				class1.scene.menuOpen(TaskHandler.Client_plane, var0, var1, true); // L: 8904
			}
		}

		NPC var15;
		if (var2 == 7) { // L: 8907
			var15 = Client.npcs[var3]; // L: 8908
			if (var15 != null) { // L: 8909
				Client.mouseCrossX = var7; // L: 8910
				Client.mouseCrossY = var8; // L: 8911
				Client.mouseCrossColor = 2; // L: 8912
				Client.mouseCrossState = 0; // L: 8913
				Client.destinationX = var0; // L: 8914
				Client.destinationY = var1; // L: 8915
				var10 = UserComparator9.getPacketBufferNode(ClientPacket.field3132, Client.packetWriter.isaacCipher); // L: 8917
				var10.packetBuffer.writeIntME(class124.field1479); // L: 8918
				var10.packetBuffer.method8659(class31.field164); // L: 8919
				var10.packetBuffer.method8620(Client.field712.method4074(82) ? 1 : 0); // L: 8920
				var10.packetBuffer.writeShort(var3); // L: 8921
				var10.packetBuffer.method8719(Interpreter.field844); // L: 8922
				Client.packetWriter.addNode(var10); // L: 8923
			}
		}

		PacketBufferNode var11;
		if (var2 == 1003) { // L: 8926
			Client.mouseCrossX = var7; // L: 8927
			Client.mouseCrossY = var8; // L: 8928
			Client.mouseCrossColor = 2; // L: 8929
			Client.mouseCrossState = 0; // L: 8930
			var15 = Client.npcs[var3]; // L: 8931
			if (var15 != null) { // L: 8932
				NPCComposition var16 = var15.definition; // L: 8933
				if (var16.transforms != null) { // L: 8934
					var16 = var16.transform();
				}

				if (var16 != null) { // L: 8935
					var11 = UserComparator9.getPacketBufferNode(ClientPacket.field3096, Client.packetWriter.isaacCipher); // L: 8937
					var11.packetBuffer.method8659(var16.id); // L: 8938
					Client.packetWriter.addNode(var11); // L: 8939
				}
			}
		}

		if (var2 == 51) { // L: 8943
			var9 = Client.players[var3]; // L: 8944
			if (var9 != null) { // L: 8945
				Client.mouseCrossX = var7; // L: 8946
				Client.mouseCrossY = var8; // L: 8947
				Client.mouseCrossColor = 2; // L: 8948
				Client.mouseCrossState = 0; // L: 8949
				Client.destinationX = var0; // L: 8950
				Client.destinationY = var1; // L: 8951
				var10 = UserComparator9.getPacketBufferNode(ClientPacket.field3105, Client.packetWriter.isaacCipher); // L: 8953
				var10.packetBuffer.method8658(var3); // L: 8954
				var10.packetBuffer.writeByte(Client.field712.method4074(82) ? 1 : 0); // L: 8955
				Client.packetWriter.addNode(var10); // L: 8956
			}
		}

		if (var2 == 4) { // L: 8959
			Client.mouseCrossX = var7; // L: 8960
			Client.mouseCrossY = var8; // L: 8961
			Client.mouseCrossColor = 2; // L: 8962
			Client.mouseCrossState = 0; // L: 8963
			Client.destinationX = var0; // L: 8964
			Client.destinationY = var1; // L: 8965
			var14 = UserComparator9.getPacketBufferNode(ClientPacket.field3152, Client.packetWriter.isaacCipher); // L: 8967
			var14.packetBuffer.writeShort(class178.baseY * 64 + var1); // L: 8968
			var14.packetBuffer.method8658(GameEngine.baseX * 64 + var0); // L: 8969
			var14.packetBuffer.writeIntME(var3); // L: 8970
			var14.packetBuffer.method8782(Client.field712.method4074(82) ? 1 : 0); // L: 8971
			Client.packetWriter.addNode(var14); // L: 8972
		}

		int var12;
		Widget var17;
		if (var2 == 28) { // L: 8974
			var14 = UserComparator9.getPacketBufferNode(ClientPacket.field3083, Client.packetWriter.isaacCipher); // L: 8976
			var14.packetBuffer.writeInt(var1); // L: 8977
			Client.packetWriter.addNode(var14); // L: 8978
			var17 = WorldMapSection1.getWidget(var1); // L: 8979
			if (var17 != null && var17.cs1Instructions != null && var17.cs1Instructions[0][0] == 5) { // L: 8980
				var12 = var17.cs1Instructions[0][1]; // L: 8981
				Varps.Varps_main[var12] = 1 - Varps.Varps_main[var12]; // L: 8982
				class159.changeGameOptions(var12); // L: 8983
			}
		}

		Widget var18;
		if (var2 == 25) { // L: 8986
			var18 = class36.getWidgetChild(var1, var0); // L: 8987
			if (var18 != null) { // L: 8988
				GameEngine.Widget_runOnTargetLeave(); // L: 8989
				TaskHandler.selectSpell(var1, var0, WorldMapDecorationType.Widget_unpackTargetMask(ParamComposition.getWidgetFlags(var18)), var4); // L: 8990
				Client.isItemSelected = 0; // L: 8991
				Client.field711 = Archive.Widget_getSpellActionName(var18); // L: 8992
				if (Client.field711 == null) { // L: 8993
					Client.field711 = "null";
				}

				if (var18.isIf3) { // L: 8994
					Client.field645 = var18.dataText + Canvas.colorStartTag(16777215);
				} else {
					Client.field645 = Canvas.colorStartTag(65280) + var18.field3653 + Canvas.colorStartTag(16777215); // L: 8995
				}
			}

		} else {
			if (var2 == 50) { // L: 8999
				var9 = Client.players[var3]; // L: 9000
				if (var9 != null) { // L: 9001
					Client.mouseCrossX = var7; // L: 9002
					Client.mouseCrossY = var8; // L: 9003
					Client.mouseCrossColor = 2; // L: 9004
					Client.mouseCrossState = 0; // L: 9005
					Client.destinationX = var0; // L: 9006
					Client.destinationY = var1; // L: 9007
					var10 = UserComparator9.getPacketBufferNode(ClientPacket.field3129, Client.packetWriter.isaacCipher); // L: 9009
					var10.packetBuffer.writeShort(var3); // L: 9010
					var10.packetBuffer.writeByte(Client.field712.method4074(82) ? 1 : 0); // L: 9011
					Client.packetWriter.addNode(var10); // L: 9012
				}
			}

			if (var2 == 13) { // L: 9015
				var15 = Client.npcs[var3]; // L: 9016
				if (var15 != null) { // L: 9017
					Client.mouseCrossX = var7; // L: 9018
					Client.mouseCrossY = var8; // L: 9019
					Client.mouseCrossColor = 2; // L: 9020
					Client.mouseCrossState = 0; // L: 9021
					Client.destinationX = var0; // L: 9022
					Client.destinationY = var1; // L: 9023
					var10 = UserComparator9.getPacketBufferNode(ClientPacket.field3148, Client.packetWriter.isaacCipher); // L: 9025
					var10.packetBuffer.writeShort(var3); // L: 9026
					var10.packetBuffer.method8782(Client.field712.method4074(82) ? 1 : 0); // L: 9027
					Client.packetWriter.addNode(var10); // L: 9028
				}
			}

			if (var2 == 21) { // L: 9031
				Client.mouseCrossX = var7; // L: 9032
				Client.mouseCrossY = var8; // L: 9033
				Client.mouseCrossColor = 2; // L: 9034
				Client.mouseCrossState = 0; // L: 9035
				Client.destinationX = var0; // L: 9036
				Client.destinationY = var1; // L: 9037
				var14 = UserComparator9.getPacketBufferNode(ClientPacket.field3067, Client.packetWriter.isaacCipher); // L: 9039
				var14.packetBuffer.method8658(GameEngine.baseX * 64 + var0); // L: 9040
				var14.packetBuffer.writeIntME(var3); // L: 9041
				var14.packetBuffer.method8659(class178.baseY * 64 + var1); // L: 9042
				var14.packetBuffer.writeByte(Client.field712.method4074(82) ? 1 : 0); // L: 9043
				Client.packetWriter.addNode(var14); // L: 9044
			}

			if (var2 == 12) { // L: 9046
				var15 = Client.npcs[var3]; // L: 9047
				if (var15 != null) { // L: 9048
					Client.mouseCrossX = var7; // L: 9049
					Client.mouseCrossY = var8; // L: 9050
					Client.mouseCrossColor = 2; // L: 9051
					Client.mouseCrossState = 0; // L: 9052
					Client.destinationX = var0; // L: 9053
					Client.destinationY = var1; // L: 9054
					var10 = UserComparator9.getPacketBufferNode(ClientPacket.field3124, Client.packetWriter.isaacCipher); // L: 9056
					var10.packetBuffer.writeShort(var3); // L: 9057
					var10.packetBuffer.method8620(Client.field712.method4074(82) ? 1 : 0); // L: 9058
					Client.packetWriter.addNode(var10); // L: 9059
				}
			}

			if (var2 == 22) { // L: 9062
				Client.mouseCrossX = var7; // L: 9063
				Client.mouseCrossY = var8; // L: 9064
				Client.mouseCrossColor = 2; // L: 9065
				Client.mouseCrossState = 0; // L: 9066
				Client.destinationX = var0; // L: 9067
				Client.destinationY = var1; // L: 9068
				var14 = UserComparator9.getPacketBufferNode(ClientPacket.field3126, Client.packetWriter.isaacCipher); // L: 9070
				var14.packetBuffer.method8873(Client.field712.method4074(82) ? 1 : 0); // L: 9071
				var14.packetBuffer.writeShort(class178.baseY * 64 + var1); // L: 9072
				var14.packetBuffer.writeIntME(GameEngine.baseX * 64 + var0); // L: 9073
				var14.packetBuffer.method8658(var3); // L: 9074
				Client.packetWriter.addNode(var14); // L: 9075
			}

			if (var2 == 17) { // L: 9077
				Client.mouseCrossX = var7; // L: 9078
				Client.mouseCrossY = var8; // L: 9079
				Client.mouseCrossColor = 2; // L: 9080
				Client.mouseCrossState = 0; // L: 9081
				Client.destinationX = var0; // L: 9082
				Client.destinationY = var1; // L: 9083
				var14 = UserComparator9.getPacketBufferNode(ClientPacket.field3100, Client.packetWriter.isaacCipher); // L: 9084
				var14.packetBuffer.writeIntME(GameEngine.baseX * 64 + var0); // L: 9085
				var14.packetBuffer.writeInt(class18.selectedSpellWidget); // L: 9086
				var14.packetBuffer.writeIntME(Client.selectedSpellChildIndex); // L: 9087
				var14.packetBuffer.writeIntME(Client.selectedSpellItemId); // L: 9088
				var14.packetBuffer.method8659(var3); // L: 9089
				var14.packetBuffer.writeShort(class178.baseY * 64 + var1); // L: 9090
				var14.packetBuffer.method8782(Client.field712.method4074(82) ? 1 : 0); // L: 9091
				Client.packetWriter.addNode(var14); // L: 9092
			}

			if (var2 == 1008 || var2 == 1009 || var2 == 1010 || var2 == 1011 || var2 == 1012) { // L: 9094
				WorldMapData_1.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1)); // L: 9095
			}

			if (var2 == 18) { // L: 9097
				Client.mouseCrossX = var7; // L: 9098
				Client.mouseCrossY = var8; // L: 9099
				Client.mouseCrossColor = 2; // L: 9100
				Client.mouseCrossState = 0; // L: 9101
				Client.destinationX = var0; // L: 9102
				Client.destinationY = var1; // L: 9103
				var14 = UserComparator9.getPacketBufferNode(ClientPacket.field3062, Client.packetWriter.isaacCipher); // L: 9105
				var14.packetBuffer.method8658(GameEngine.baseX * 64 + var0); // L: 9106
				var14.packetBuffer.writeShort(class178.baseY * 64 + var1); // L: 9107
				var14.packetBuffer.method8873(Client.field712.method4074(82) ? 1 : 0); // L: 9108
				var14.packetBuffer.method8658(var3); // L: 9109
				Client.packetWriter.addNode(var14); // L: 9110
			}

			if (var2 == 45) { // L: 9112
				var9 = Client.players[var3]; // L: 9113
				if (var9 != null) { // L: 9114
					Client.mouseCrossX = var7; // L: 9115
					Client.mouseCrossY = var8; // L: 9116
					Client.mouseCrossColor = 2; // L: 9117
					Client.mouseCrossState = 0; // L: 9118
					Client.destinationX = var0; // L: 9119
					Client.destinationY = var1; // L: 9120
					var10 = UserComparator9.getPacketBufferNode(ClientPacket.field3101, Client.packetWriter.isaacCipher); // L: 9122
					var10.packetBuffer.method8620(Client.field712.method4074(82) ? 1 : 0); // L: 9123
					var10.packetBuffer.writeShort(var3); // L: 9124
					Client.packetWriter.addNode(var10); // L: 9125
				}
			}

			if (var2 == 46) { // L: 9128
				var9 = Client.players[var3]; // L: 9129
				if (var9 != null) { // L: 9130
					Client.mouseCrossX = var7; // L: 9131
					Client.mouseCrossY = var8; // L: 9132
					Client.mouseCrossColor = 2; // L: 9133
					Client.mouseCrossState = 0; // L: 9134
					Client.destinationX = var0; // L: 9135
					Client.destinationY = var1; // L: 9136
					var10 = UserComparator9.getPacketBufferNode(ClientPacket.field3099, Client.packetWriter.isaacCipher); // L: 9138
					var10.packetBuffer.method8659(var3); // L: 9139
					var10.packetBuffer.method8620(Client.field712.method4074(82) ? 1 : 0); // L: 9140
					Client.packetWriter.addNode(var10); // L: 9141
				}
			}

			if (var2 == 1001) { // L: 9144
				Client.mouseCrossX = var7; // L: 9145
				Client.mouseCrossY = var8; // L: 9146
				Client.mouseCrossColor = 2; // L: 9147
				Client.mouseCrossState = 0; // L: 9148
				Client.destinationX = var0; // L: 9149
				Client.destinationY = var1; // L: 9150
				var14 = UserComparator9.getPacketBufferNode(ClientPacket.field3098, Client.packetWriter.isaacCipher); // L: 9152
				var14.packetBuffer.method8659(var3); // L: 9153
				var14.packetBuffer.method8873(Client.field712.method4074(82) ? 1 : 0); // L: 9154
				var14.packetBuffer.writeShort(class178.baseY * 64 + var1); // L: 9155
				var14.packetBuffer.writeShort(GameEngine.baseX * 64 + var0); // L: 9156
				Client.packetWriter.addNode(var14); // L: 9157
			}

			if (var2 == 10) { // L: 9159
				var15 = Client.npcs[var3]; // L: 9160
				if (var15 != null) { // L: 9161
					Client.mouseCrossX = var7; // L: 9162
					Client.mouseCrossY = var8; // L: 9163
					Client.mouseCrossColor = 2; // L: 9164
					Client.mouseCrossState = 0; // L: 9165
					Client.destinationX = var0; // L: 9166
					Client.destinationY = var1; // L: 9167
					var10 = UserComparator9.getPacketBufferNode(ClientPacket.field3076, Client.packetWriter.isaacCipher); // L: 9169
					var10.packetBuffer.method8782(Client.field712.method4074(82) ? 1 : 0); // L: 9170
					var10.packetBuffer.writeIntME(var3); // L: 9171
					Client.packetWriter.addNode(var10); // L: 9172
				}
			}

			if (var2 == 11) { // L: 9175
				var15 = Client.npcs[var3]; // L: 9176
				if (var15 != null) { // L: 9177
					Client.mouseCrossX = var7; // L: 9178
					Client.mouseCrossY = var8; // L: 9179
					Client.mouseCrossColor = 2; // L: 9180
					Client.mouseCrossState = 0; // L: 9181
					Client.destinationX = var0; // L: 9182
					Client.destinationY = var1; // L: 9183
					var10 = UserComparator9.getPacketBufferNode(ClientPacket.field3114, Client.packetWriter.isaacCipher); // L: 9185
					var10.packetBuffer.method8873(Client.field712.method4074(82) ? 1 : 0); // L: 9186
					var10.packetBuffer.writeShort(var3); // L: 9187
					Client.packetWriter.addNode(var10); // L: 9188
				}
			}

			if (var2 == 57 || var2 == 1007) { // L: 9191
				var18 = class36.getWidgetChild(var1, var0); // L: 9192
				if (var18 != null) { // L: 9193
					class333.widgetDefaultMenuAction(var3, var1, var0, var4, var6); // L: 9194
				}
			}

			if (var2 == 5) { // L: 9197
				Client.mouseCrossX = var7; // L: 9198
				Client.mouseCrossY = var8; // L: 9199
				Client.mouseCrossColor = 2; // L: 9200
				Client.mouseCrossState = 0; // L: 9201
				Client.destinationX = var0; // L: 9202
				Client.destinationY = var1; // L: 9203
				var14 = UserComparator9.getPacketBufferNode(ClientPacket.field3118, Client.packetWriter.isaacCipher); // L: 9205
				var14.packetBuffer.method8659(class178.baseY * 64 + var1); // L: 9206
				var14.packetBuffer.method8659(var3); // L: 9207
				var14.packetBuffer.writeIntME(GameEngine.baseX * 64 + var0); // L: 9208
				var14.packetBuffer.method8782(Client.field712.method4074(82) ? 1 : 0); // L: 9209
				Client.packetWriter.addNode(var14); // L: 9210
			}

			if (var2 == 48) { // L: 9212
				var9 = Client.players[var3]; // L: 9213
				if (var9 != null) { // L: 9214
					Client.mouseCrossX = var7; // L: 9215
					Client.mouseCrossY = var8; // L: 9216
					Client.mouseCrossColor = 2; // L: 9217
					Client.mouseCrossState = 0; // L: 9218
					Client.destinationX = var0; // L: 9219
					Client.destinationY = var1; // L: 9220
					var10 = UserComparator9.getPacketBufferNode(ClientPacket.field3128, Client.packetWriter.isaacCipher); // L: 9222
					var10.packetBuffer.method8873(Client.field712.method4074(82) ? 1 : 0); // L: 9223
					var10.packetBuffer.writeShort(var3); // L: 9224
					Client.packetWriter.addNode(var10); // L: 9225
				}
			}

			if (var2 == 44) { // L: 9228
				var9 = Client.players[var3]; // L: 9229
				if (var9 != null) { // L: 9230
					Client.mouseCrossX = var7; // L: 9231
					Client.mouseCrossY = var8; // L: 9232
					Client.mouseCrossColor = 2; // L: 9233
					Client.mouseCrossState = 0; // L: 9234
					Client.destinationX = var0; // L: 9235
					Client.destinationY = var1; // L: 9236
					var10 = UserComparator9.getPacketBufferNode(ClientPacket.field3069, Client.packetWriter.isaacCipher); // L: 9238
					var10.packetBuffer.writeShort(var3); // L: 9239
					var10.packetBuffer.method8782(Client.field712.method4074(82) ? 1 : 0); // L: 9240
					Client.packetWriter.addNode(var10); // L: 9241
				}
			}

			if (var2 == 2) { // L: 9244
				Client.mouseCrossX = var7; // L: 9245
				Client.mouseCrossY = var8; // L: 9246
				Client.mouseCrossColor = 2; // L: 9247
				Client.mouseCrossState = 0; // L: 9248
				Client.destinationX = var0; // L: 9249
				Client.destinationY = var1; // L: 9250
				var14 = UserComparator9.getPacketBufferNode(ClientPacket.field3063, Client.packetWriter.isaacCipher); // L: 9251
				var14.packetBuffer.method8620(Client.field712.method4074(82) ? 1 : 0); // L: 9252
				var14.packetBuffer.writeShort(Client.selectedSpellItemId); // L: 9253
				var14.packetBuffer.method8670(class18.selectedSpellWidget); // L: 9254
				var14.packetBuffer.writeShort(GameEngine.baseX * 64 + var0); // L: 9255
				var14.packetBuffer.writeShort(var3); // L: 9256
				var14.packetBuffer.method8658(class178.baseY * 64 + var1); // L: 9257
				var14.packetBuffer.writeShort(Client.selectedSpellChildIndex); // L: 9258
				Client.packetWriter.addNode(var14); // L: 9259
			}

			if (var2 == 8) { // L: 9261
				var15 = Client.npcs[var3]; // L: 9262
				if (var15 != null) { // L: 9263
					Client.mouseCrossX = var7; // L: 9264
					Client.mouseCrossY = var8; // L: 9265
					Client.mouseCrossColor = 2; // L: 9266
					Client.mouseCrossState = 0; // L: 9267
					Client.destinationX = var0; // L: 9268
					Client.destinationY = var1; // L: 9269
					var10 = UserComparator9.getPacketBufferNode(ClientPacket.field3059, Client.packetWriter.isaacCipher); // L: 9270
					var10.packetBuffer.writeIntME(Client.selectedSpellChildIndex); // L: 9271
					var10.packetBuffer.method8658(var3); // L: 9272
					var10.packetBuffer.writeShort(Client.selectedSpellItemId); // L: 9273
					var10.packetBuffer.method8782(Client.field712.method4074(82) ? 1 : 0); // L: 9274
					var10.packetBuffer.method8670(class18.selectedSpellWidget); // L: 9275
					Client.packetWriter.addNode(var10); // L: 9276
				}
			}

			if (var2 == 29) { // L: 9279
				var14 = UserComparator9.getPacketBufferNode(ClientPacket.field3083, Client.packetWriter.isaacCipher); // L: 9281
				var14.packetBuffer.writeInt(var1); // L: 9282
				Client.packetWriter.addNode(var14); // L: 9283
				var17 = WorldMapSection1.getWidget(var1); // L: 9284
				if (var17 != null && var17.cs1Instructions != null && var17.cs1Instructions[0][0] == 5) { // L: 9285
					var12 = var17.cs1Instructions[0][1]; // L: 9286
					if (Varps.Varps_main[var12] != var17.cs1ComparisonValues[0]) { // L: 9287
						Varps.Varps_main[var12] = var17.cs1ComparisonValues[0]; // L: 9288
						class159.changeGameOptions(var12); // L: 9289
					}
				}
			}

			if (var2 == 6) { // L: 9293
				Client.mouseCrossX = var7; // L: 9294
				Client.mouseCrossY = var8; // L: 9295
				Client.mouseCrossColor = 2; // L: 9296
				Client.mouseCrossState = 0; // L: 9297
				Client.destinationX = var0; // L: 9298
				Client.destinationY = var1; // L: 9299
				var14 = UserComparator9.getPacketBufferNode(ClientPacket.field3088, Client.packetWriter.isaacCipher); // L: 9301
				var14.packetBuffer.writeShort(var3); // L: 9302
				var14.packetBuffer.method8659(GameEngine.baseX * 64 + var0); // L: 9303
				var14.packetBuffer.method8658(class178.baseY * 64 + var1); // L: 9304
				var14.packetBuffer.writeByte(Client.field712.method4074(82) ? 1 : 0); // L: 9305
				Client.packetWriter.addNode(var14); // L: 9306
			}

			if (var2 == 9) { // L: 9308
				var15 = Client.npcs[var3]; // L: 9309
				if (var15 != null) { // L: 9310
					Client.mouseCrossX = var7; // L: 9311
					Client.mouseCrossY = var8; // L: 9312
					Client.mouseCrossColor = 2; // L: 9313
					Client.mouseCrossState = 0; // L: 9314
					Client.destinationX = var0; // L: 9315
					Client.destinationY = var1; // L: 9316
					var10 = UserComparator9.getPacketBufferNode(ClientPacket.field3142, Client.packetWriter.isaacCipher); // L: 9318
					var10.packetBuffer.writeShort(var3); // L: 9319
					var10.packetBuffer.method8620(Client.field712.method4074(82) ? 1 : 0); // L: 9320
					Client.packetWriter.addNode(var10); // L: 9321
				}
			}

			if (var2 == 16) { // L: 9324
				Client.mouseCrossX = var7; // L: 9325
				Client.mouseCrossY = var8; // L: 9326
				Client.mouseCrossColor = 2; // L: 9327
				Client.mouseCrossState = 0; // L: 9328
				Client.destinationX = var0; // L: 9329
				Client.destinationY = var1; // L: 9330
				var14 = UserComparator9.getPacketBufferNode(ClientPacket.field3094, Client.packetWriter.isaacCipher); // L: 9332
				var14.packetBuffer.method8671(Interpreter.field844); // L: 9333
				var14.packetBuffer.method8620(Client.field712.method4074(82) ? 1 : 0); // L: 9334
				var14.packetBuffer.writeIntME(GameEngine.baseX * 64 + var0); // L: 9335
				var14.packetBuffer.method8659(class178.baseY * 64 + var1); // L: 9336
				var14.packetBuffer.method8658(class31.field164); // L: 9337
				var14.packetBuffer.method8659(class124.field1479); // L: 9338
				var14.packetBuffer.writeIntME(var3); // L: 9339
				Client.packetWriter.addNode(var14); // L: 9340
			}

			if (var2 == 1002) { // L: 9342
				Client.mouseCrossX = var7; // L: 9343
				Client.mouseCrossY = var8; // L: 9344
				Client.mouseCrossColor = 2; // L: 9345
				Client.mouseCrossState = 0; // L: 9346
				var14 = UserComparator9.getPacketBufferNode(ClientPacket.field3140, Client.packetWriter.isaacCipher); // L: 9348
				var14.packetBuffer.writeIntME(var3); // L: 9349
				Client.packetWriter.addNode(var14); // L: 9350
			}

			if (var2 == 15) { // L: 9352
				var9 = Client.players[var3]; // L: 9353
				if (var9 != null) { // L: 9354
					Client.mouseCrossX = var7; // L: 9355
					Client.mouseCrossY = var8; // L: 9356
					Client.mouseCrossColor = 2; // L: 9357
					Client.mouseCrossState = 0; // L: 9358
					Client.destinationX = var0; // L: 9359
					Client.destinationY = var1; // L: 9360
					var10 = UserComparator9.getPacketBufferNode(ClientPacket.field3150, Client.packetWriter.isaacCipher); // L: 9361
					var10.packetBuffer.method8782(Client.field712.method4074(82) ? 1 : 0); // L: 9362
					var10.packetBuffer.method8659(Client.selectedSpellChildIndex); // L: 9363
					var10.packetBuffer.writeIntME(Client.selectedSpellItemId); // L: 9364
					var10.packetBuffer.method8671(class18.selectedSpellWidget); // L: 9365
					var10.packetBuffer.method8659(var3); // L: 9366
					Client.packetWriter.addNode(var10); // L: 9367
				}
			}

			if (var2 == 30 && Client.meslayerContinueWidget == null) { // L: 9370 9371
				class130.resumePauseWidget(var1, var0); // L: 9372
				Client.meslayerContinueWidget = class36.getWidgetChild(var1, var0); // L: 9373
				class69.invalidateWidget(Client.meslayerContinueWidget); // L: 9374
			}

			if (var2 == 26) { // L: 9377
				class240.method4792(); // L: 9378
			}

			if (var2 == 58) { // L: 9380
				var18 = class36.getWidgetChild(var1, var0); // L: 9381
				if (var18 != null) { // L: 9382
					if (var18.field3622 != null) { // L: 9383
						ScriptEvent var19 = new ScriptEvent(); // L: 9384
						var19.widget = var18; // L: 9385
						var19.opIndex = var3; // L: 9386
						var19.targetName = var6; // L: 9387
						var19.args = var18.field3622; // L: 9388
						class9.runScriptEvent(var19); // L: 9389
					}

					var10 = UserComparator9.getPacketBufferNode(ClientPacket.field3113, Client.packetWriter.isaacCipher); // L: 9392
					var10.packetBuffer.writeShort(Client.selectedSpellItemId); // L: 9393
					var10.packetBuffer.method8658(var4); // L: 9394
					var10.packetBuffer.method8659(Client.selectedSpellChildIndex); // L: 9395
					var10.packetBuffer.writeShort(var0); // L: 9396
					var10.packetBuffer.method8719(var1); // L: 9397
					var10.packetBuffer.method8671(class18.selectedSpellWidget); // L: 9398
					Client.packetWriter.addNode(var10); // L: 9399
				}
			}

			if (var2 == 1004) { // L: 9402
				Client.mouseCrossX = var7; // L: 9403
				Client.mouseCrossY = var8; // L: 9404
				Client.mouseCrossColor = 2; // L: 9405
				Client.mouseCrossState = 0; // L: 9406
				var14 = UserComparator9.getPacketBufferNode(ClientPacket.field3073, Client.packetWriter.isaacCipher); // L: 9408
				var14.packetBuffer.method8659(var3); // L: 9409
				var14.packetBuffer.writeShort(class178.baseY * 64 + var1); // L: 9410
				var14.packetBuffer.writeIntME(GameEngine.baseX * 64 + var0); // L: 9411
				Client.packetWriter.addNode(var14); // L: 9412
			}

			if (var2 == 1) { // L: 9414
				Client.mouseCrossX = var7; // L: 9415
				Client.mouseCrossY = var8; // L: 9416
				Client.mouseCrossColor = 2; // L: 9417
				Client.mouseCrossState = 0; // L: 9418
				Client.destinationX = var0; // L: 9419
				Client.destinationY = var1; // L: 9420
				var14 = UserComparator9.getPacketBufferNode(ClientPacket.field3079, Client.packetWriter.isaacCipher); // L: 9422
				var14.packetBuffer.writeShort(class31.field164); // L: 9423
				var14.packetBuffer.method8782(Client.field712.method4074(82) ? 1 : 0); // L: 9424
				var14.packetBuffer.method8658(class178.baseY * 64 + var1); // L: 9425
				var14.packetBuffer.writeShort(GameEngine.baseX * 64 + var0); // L: 9426
				var14.packetBuffer.method8719(Interpreter.field844); // L: 9427
				var14.packetBuffer.method8658(class124.field1479); // L: 9428
				var14.packetBuffer.method8659(var3); // L: 9429
				Client.packetWriter.addNode(var14); // L: 9430
			}

			if (var2 == 3) { // L: 9432
				Client.mouseCrossX = var7; // L: 9433
				Client.mouseCrossY = var8; // L: 9434
				Client.mouseCrossColor = 2; // L: 9435
				Client.mouseCrossState = 0; // L: 9436
				Client.destinationX = var0; // L: 9437
				Client.destinationY = var1; // L: 9438
				var14 = UserComparator9.getPacketBufferNode(ClientPacket.field3134, Client.packetWriter.isaacCipher); // L: 9440
				var14.packetBuffer.method8873(Client.field712.method4074(82) ? 1 : 0); // L: 9441
				var14.packetBuffer.method8659(var3); // L: 9442
				var14.packetBuffer.writeShort(GameEngine.baseX * 64 + var0); // L: 9443
				var14.packetBuffer.writeIntME(class178.baseY * 64 + var1); // L: 9444
				Client.packetWriter.addNode(var14); // L: 9445
			}

			if (var2 == 47) { // L: 9447
				var9 = Client.players[var3]; // L: 9448
				if (var9 != null) { // L: 9449
					Client.mouseCrossX = var7; // L: 9450
					Client.mouseCrossY = var8; // L: 9451
					Client.mouseCrossColor = 2; // L: 9452
					Client.mouseCrossState = 0; // L: 9453
					Client.destinationX = var0; // L: 9454
					Client.destinationY = var1; // L: 9455
					var10 = UserComparator9.getPacketBufferNode(ClientPacket.field3087, Client.packetWriter.isaacCipher); // L: 9457
					var10.packetBuffer.method8659(var3); // L: 9458
					var10.packetBuffer.method8620(Client.field712.method4074(82) ? 1 : 0); // L: 9459
					Client.packetWriter.addNode(var10); // L: 9460
				}
			}

			if (var2 == 24) { // L: 9463
				var18 = WorldMapSection1.getWidget(var1); // L: 9464
				if (var18 != null) { // L: 9465
					boolean var13 = true; // L: 9466
					if (var18.contentType > 0) { // L: 9467
						var13 = class11.method103(var18);
					}

					if (var13) { // L: 9468
						var11 = UserComparator9.getPacketBufferNode(ClientPacket.field3083, Client.packetWriter.isaacCipher); // L: 9470
						var11.packetBuffer.writeInt(var1); // L: 9471
						Client.packetWriter.addNode(var11); // L: 9472
					}
				}
			}

			if (var2 == 20) { // L: 9476
				Client.mouseCrossX = var7; // L: 9477
				Client.mouseCrossY = var8; // L: 9478
				Client.mouseCrossColor = 2; // L: 9479
				Client.mouseCrossState = 0; // L: 9480
				Client.destinationX = var0; // L: 9481
				Client.destinationY = var1; // L: 9482
				var14 = UserComparator9.getPacketBufferNode(ClientPacket.field3123, Client.packetWriter.isaacCipher); // L: 9484
				var14.packetBuffer.method8658(class178.baseY * 64 + var1); // L: 9485
				var14.packetBuffer.method8620(Client.field712.method4074(82) ? 1 : 0); // L: 9486
				var14.packetBuffer.method8658(var3); // L: 9487
				var14.packetBuffer.method8658(GameEngine.baseX * 64 + var0); // L: 9488
				Client.packetWriter.addNode(var14); // L: 9489
			}

			if (var2 == 14) { // L: 9491
				var9 = Client.players[var3]; // L: 9492
				if (var9 != null) { // L: 9493
					Client.mouseCrossX = var7; // L: 9494
					Client.mouseCrossY = var8; // L: 9495
					Client.mouseCrossColor = 2; // L: 9496
					Client.mouseCrossState = 0; // L: 9497
					Client.destinationX = var0; // L: 9498
					Client.destinationY = var1; // L: 9499
					var10 = UserComparator9.getPacketBufferNode(ClientPacket.field3130, Client.packetWriter.isaacCipher); // L: 9501
					var10.packetBuffer.method8782(Client.field712.method4074(82) ? 1 : 0); // L: 9502
					var10.packetBuffer.method8658(class31.field164); // L: 9503
					var10.packetBuffer.method8719(Interpreter.field844); // L: 9504
					var10.packetBuffer.writeIntME(class124.field1479); // L: 9505
					var10.packetBuffer.method8659(var3); // L: 9506
					Client.packetWriter.addNode(var10); // L: 9507
				}
			}

			if (Client.isItemSelected != 0) { // L: 9510
				Client.isItemSelected = 0; // L: 9511
				class69.invalidateWidget(WorldMapSection1.getWidget(Interpreter.field844)); // L: 9512
			}

			if (Client.isSpellSelected) { // L: 9514
				GameEngine.Widget_runOnTargetLeave();
			}

		}
	} // L: 8997 9515

	@ObfuscatedName("mk")
	@ObfuscatedSignature(
		descriptor = "(Lmy;I)Lmy;",
		garbageValue = "-1669266897"
	)
	static Widget method5477(Widget var0) {
		int var1 = class467.method8481(ParamComposition.getWidgetFlags(var0)); // L: 12076
		if (var1 == 0) { // L: 12077
			return null;
		} else {
			for (int var2 = 0; var2 < var1; ++var2) { // L: 12078
				var0 = WorldMapSection1.getWidget(var0.parentId); // L: 12079
				if (var0 == null) { // L: 12080
					return null;
				}
			}

			return var0; // L: 12082
		}
	}
}
