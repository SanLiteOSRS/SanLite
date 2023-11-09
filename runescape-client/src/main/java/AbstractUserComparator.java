import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qy")
@Implements("AbstractUserComparator")
public abstract class AbstractUserComparator implements Comparator {
	@ObfuscatedName("an")
	@Export("nextComparator")
	Comparator nextComparator;

	protected AbstractUserComparator() {
	} // L: 8

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;I)V",
		garbageValue = "-997452391"
	)
	@Export("addComparator")
	final void addComparator(Comparator var1) {
		if (this.nextComparator == null) { // L: 11
			this.nextComparator = var1; // L: 12
		} else if (this.nextComparator instanceof AbstractUserComparator) { // L: 14
			((AbstractUserComparator)this.nextComparator).addComparator(var1); // L: 15
		}

	} // L: 17

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lqd;Lqd;I)I",
		garbageValue = "671099487"
	)
	@Export("compareUser")
	protected final int compareUser(Nameable var1, Nameable var2) {
		return this.nextComparator == null ? 0 : this.nextComparator.compare(var1, var2); // L: 20 21
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 25
	}

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "(IIIIILjava/lang/String;Ljava/lang/String;IIB)V",
		garbageValue = "-66"
	)
	static final void method7847(int var0, int var1, int var2, int var3, int var4, String var5, String var6, int var7, int var8) {
		if (var2 >= 2000) { // L: 9070
			var2 -= 2000;
		}

		PacketBufferNode var9;
		Widget var10;
		int var11;
		if (var2 == 29) { // L: 9071
			var9 = class251.getPacketBufferNode(ClientPacket.field3156, Client.packetWriter.isaacCipher); // L: 9073
			var9.packetBuffer.writeIntME(var1); // L: 9074
			Client.packetWriter.addNode(var9); // L: 9075
			var10 = ArchiveDiskActionHandler.getWidget(var1); // L: 9076
			if (var10 != null && var10.cs1Instructions != null && var10.cs1Instructions[0][0] == 5) { // L: 9077
				var11 = var10.cs1Instructions[0][1]; // L: 9078
				if (Varps.Varps_main[var11] != var10.cs1ComparisonValues[0]) { // L: 9079
					Varps.Varps_main[var11] = var10.cs1ComparisonValues[0]; // L: 9080
					class1.changeGameOptions(var11); // L: 9081
				}
			}
		}

		Widget var14;
		if (var2 == 57 || var2 == 1007) { // L: 9085
			var14 = ModelData0.getWidgetChild(var1, var0); // L: 9086
			if (var14 != null) { // L: 9087
				class90.widgetDefaultMenuAction(var3, var1, var0, var4, var6); // L: 9088
			}
		}

		if (var2 == 1001) { // L: 9091
			Client.mouseCrossX = var7; // L: 9092
			Client.mouseCrossY = var8; // L: 9093
			Client.mouseCrossColor = 2; // L: 9094
			Client.mouseCrossState = 0; // L: 9095
			Client.destinationX = var0; // L: 9096
			Client.destinationY = var1; // L: 9097
			var9 = class251.getPacketBufferNode(ClientPacket.field3149, Client.packetWriter.isaacCipher); // L: 9099
			var9.packetBuffer.method8993(Client.field759.method4087(82) ? 1 : 0); // L: 9100
			var9.packetBuffer.method9004(ModeWhere.baseY * 64 + var1); // L: 9101
			var9.packetBuffer.writeShort(class147.baseX * 64 + var0); // L: 9102
			var9.packetBuffer.method9139(var3); // L: 9103
			Client.packetWriter.addNode(var9); // L: 9104
		}

		Player var15;
		PacketBufferNode var16;
		if (var2 == 51) { // L: 9106
			var15 = Client.players[var3]; // L: 9107
			if (var15 != null) { // L: 9108
				Client.mouseCrossX = var7; // L: 9109
				Client.mouseCrossY = var8; // L: 9110
				Client.mouseCrossColor = 2; // L: 9111
				Client.mouseCrossState = 0; // L: 9112
				Client.destinationX = var0; // L: 9113
				Client.destinationY = var1; // L: 9114
				var16 = class251.getPacketBufferNode(ClientPacket.field3145, Client.packetWriter.isaacCipher); // L: 9116
				var16.packetBuffer.method9139(var3); // L: 9117
				var16.packetBuffer.writeByte(Client.field759.method4087(82) ? 1 : 0); // L: 9118
				Client.packetWriter.addNode(var16); // L: 9119
			}
		}

		NPC var17;
		if (var2 == 7) { // L: 9122
			var17 = Client.npcs[var3]; // L: 9123
			if (var17 != null) { // L: 9124
				Client.mouseCrossX = var7; // L: 9125
				Client.mouseCrossY = var8; // L: 9126
				Client.mouseCrossColor = 2; // L: 9127
				Client.mouseCrossState = 0; // L: 9128
				Client.destinationX = var0; // L: 9129
				Client.destinationY = var1; // L: 9130
				var16 = class251.getPacketBufferNode(ClientPacket.field3139, Client.packetWriter.isaacCipher); // L: 9132
				var16.packetBuffer.method8994(Client.field759.method4087(82) ? 1 : 0); // L: 9133
				var16.packetBuffer.method9088(class31.field154); // L: 9134
				var16.packetBuffer.method9139(class216.field2385); // L: 9135
				var16.packetBuffer.writeShort(class27.field130); // L: 9136
				var16.packetBuffer.writeShort(var3); // L: 9137
				Client.packetWriter.addNode(var16); // L: 9138
			}
		}

		if (var2 == 10) { // L: 9141
			var17 = Client.npcs[var3]; // L: 9142
			if (var17 != null) { // L: 9143
				Client.mouseCrossX = var7; // L: 9144
				Client.mouseCrossY = var8; // L: 9145
				Client.mouseCrossColor = 2; // L: 9146
				Client.mouseCrossState = 0; // L: 9147
				Client.destinationX = var0; // L: 9148
				Client.destinationY = var1; // L: 9149
				var16 = class251.getPacketBufferNode(ClientPacket.field3142, Client.packetWriter.isaacCipher); // L: 9151
				var16.packetBuffer.method8994(Client.field759.method4087(82) ? 1 : 0); // L: 9152
				var16.packetBuffer.method9002(var3); // L: 9153
				Client.packetWriter.addNode(var16); // L: 9154
			}
		}

		if (var2 == 9) { // L: 9157
			var17 = Client.npcs[var3]; // L: 9158
			if (var17 != null) { // L: 9159
				Client.mouseCrossX = var7; // L: 9160
				Client.mouseCrossY = var8; // L: 9161
				Client.mouseCrossColor = 2; // L: 9162
				Client.mouseCrossState = 0; // L: 9163
				Client.destinationX = var0; // L: 9164
				Client.destinationY = var1; // L: 9165
				var16 = class251.getPacketBufferNode(ClientPacket.field3174, Client.packetWriter.isaacCipher); // L: 9167
				var16.packetBuffer.writeByte(Client.field759.method4087(82) ? 1 : 0); // L: 9168
				var16.packetBuffer.method9139(var3); // L: 9169
				Client.packetWriter.addNode(var16); // L: 9170
			}
		}

		if (var2 == 26) { // L: 9173
			class30.method432(); // L: 9174
		}

		if (var2 == 1008 || var2 == 1009 || var2 == 1010 || var2 == 1011 || var2 == 1012) { // L: 9176
			ScriptEvent.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1)); // L: 9177
		}

		if (var2 == 6) { // L: 9179
			Client.mouseCrossX = var7; // L: 9180
			Client.mouseCrossY = var8; // L: 9181
			Client.mouseCrossColor = 2; // L: 9182
			Client.mouseCrossState = 0; // L: 9183
			Client.destinationX = var0; // L: 9184
			Client.destinationY = var1; // L: 9185
			var9 = class251.getPacketBufferNode(ClientPacket.field3165, Client.packetWriter.isaacCipher); // L: 9187
			var9.packetBuffer.method9004(ModeWhere.baseY * 64 + var1); // L: 9188
			var9.packetBuffer.method9139(class147.baseX * 64 + var0); // L: 9189
			var9.packetBuffer.writeByte(Client.field759.method4087(82) ? 1 : 0); // L: 9190
			var9.packetBuffer.method9002(var3); // L: 9191
			Client.packetWriter.addNode(var9); // L: 9192
		}

		if (var2 == 4) { // L: 9194
			Client.mouseCrossX = var7; // L: 9195
			Client.mouseCrossY = var8; // L: 9196
			Client.mouseCrossColor = 2; // L: 9197
			Client.mouseCrossState = 0; // L: 9198
			Client.destinationX = var0; // L: 9199
			Client.destinationY = var1; // L: 9200
			var9 = class251.getPacketBufferNode(ClientPacket.field3190, Client.packetWriter.isaacCipher); // L: 9202
			var9.packetBuffer.method9139(class147.baseX * 64 + var0); // L: 9203
			var9.packetBuffer.method9139(ModeWhere.baseY * 64 + var1); // L: 9204
			var9.packetBuffer.method8994(Client.field759.method4087(82) ? 1 : 0); // L: 9205
			var9.packetBuffer.method9004(var3); // L: 9206
			Client.packetWriter.addNode(var9); // L: 9207
		}

		if (var2 == 11) { // L: 9209
			var17 = Client.npcs[var3]; // L: 9210
			if (var17 != null) { // L: 9211
				Client.mouseCrossX = var7; // L: 9212
				Client.mouseCrossY = var8; // L: 9213
				Client.mouseCrossColor = 2; // L: 9214
				Client.mouseCrossState = 0; // L: 9215
				Client.destinationX = var0; // L: 9216
				Client.destinationY = var1; // L: 9217
				var16 = class251.getPacketBufferNode(ClientPacket.field3148, Client.packetWriter.isaacCipher); // L: 9219
				var16.packetBuffer.method8994(Client.field759.method4087(82) ? 1 : 0); // L: 9220
				var16.packetBuffer.writeShort(var3); // L: 9221
				Client.packetWriter.addNode(var16); // L: 9222
			}
		}

		if (var2 == 58) { // L: 9225
			var14 = ModelData0.getWidgetChild(var1, var0); // L: 9226
			if (var14 != null) { // L: 9227
				if (var14.field3716 != null) { // L: 9228
					ScriptEvent var18 = new ScriptEvent(); // L: 9229
					var18.widget = var14; // L: 9230
					var18.opIndex = var3; // L: 9231
					var18.targetName = var6; // L: 9232
					var18.args = var14.field3716; // L: 9233
					class260.runScriptEvent(var18); // L: 9234
				}

				var16 = class251.getPacketBufferNode(ClientPacket.field3163, Client.packetWriter.isaacCipher); // L: 9237
				var16.packetBuffer.method9002(Client.selectedSpellChildIndex); // L: 9238
				var16.packetBuffer.method9004(var0); // L: 9239
				var16.packetBuffer.method9002(Client.selectedSpellItemId); // L: 9240
				var16.packetBuffer.method9004(var4); // L: 9241
				var16.packetBuffer.method9088(var1); // L: 9242
				var16.packetBuffer.method9016(class60.selectedSpellWidget); // L: 9243
				Client.packetWriter.addNode(var16); // L: 9244
			}
		}

		if (var2 == 12) { // L: 9247
			var17 = Client.npcs[var3]; // L: 9248
			if (var17 != null) { // L: 9249
				Client.mouseCrossX = var7; // L: 9250
				Client.mouseCrossY = var8; // L: 9251
				Client.mouseCrossColor = 2; // L: 9252
				Client.mouseCrossState = 0; // L: 9253
				Client.destinationX = var0; // L: 9254
				Client.destinationY = var1; // L: 9255
				var16 = class251.getPacketBufferNode(ClientPacket.field3175, Client.packetWriter.isaacCipher); // L: 9257
				var16.packetBuffer.method8993(Client.field759.method4087(82) ? 1 : 0); // L: 9258
				var16.packetBuffer.method9002(var3); // L: 9259
				Client.packetWriter.addNode(var16); // L: 9260
			}
		}

		if (var2 == 3) { // L: 9263
			Client.mouseCrossX = var7; // L: 9264
			Client.mouseCrossY = var8; // L: 9265
			Client.mouseCrossColor = 2; // L: 9266
			Client.mouseCrossState = 0; // L: 9267
			Client.destinationX = var0; // L: 9268
			Client.destinationY = var1; // L: 9269
			var9 = class251.getPacketBufferNode(ClientPacket.field3164, Client.packetWriter.isaacCipher); // L: 9271
			var9.packetBuffer.method9139(var3); // L: 9272
			var9.packetBuffer.method9004(ModeWhere.baseY * 64 + var1); // L: 9273
			var9.packetBuffer.method8995(Client.field759.method4087(82) ? 1 : 0); // L: 9274
			var9.packetBuffer.method9004(class147.baseX * 64 + var0); // L: 9275
			Client.packetWriter.addNode(var9); // L: 9276
		}

		if (var2 == 8) { // L: 9278
			var17 = Client.npcs[var3]; // L: 9279
			if (var17 != null) { // L: 9280
				Client.mouseCrossX = var7; // L: 9281
				Client.mouseCrossY = var8; // L: 9282
				Client.mouseCrossColor = 2; // L: 9283
				Client.mouseCrossState = 0; // L: 9284
				Client.destinationX = var0; // L: 9285
				Client.destinationY = var1; // L: 9286
				var16 = class251.getPacketBufferNode(ClientPacket.field3117, Client.packetWriter.isaacCipher); // L: 9287
				var16.packetBuffer.method9002(var3); // L: 9288
				var16.packetBuffer.method9133(class60.selectedSpellWidget); // L: 9289
				var16.packetBuffer.method8994(Client.field759.method4087(82) ? 1 : 0); // L: 9290
				var16.packetBuffer.method9139(Client.selectedSpellItemId); // L: 9291
				var16.packetBuffer.method9002(Client.selectedSpellChildIndex); // L: 9292
				Client.packetWriter.addNode(var16); // L: 9293
			}
		}

		if (var2 == 22) { // L: 9296
			Client.mouseCrossX = var7; // L: 9297
			Client.mouseCrossY = var8; // L: 9298
			Client.mouseCrossColor = 2; // L: 9299
			Client.mouseCrossState = 0; // L: 9300
			Client.destinationX = var0; // L: 9301
			Client.destinationY = var1; // L: 9302
			var9 = class251.getPacketBufferNode(ClientPacket.field3107, Client.packetWriter.isaacCipher); // L: 9304
			var9.packetBuffer.method9002(var3); // L: 9305
			var9.packetBuffer.method8995(Client.field759.method4087(82) ? 1 : 0); // L: 9306
			var9.packetBuffer.method9004(ModeWhere.baseY * 64 + var1); // L: 9307
			var9.packetBuffer.method9004(class147.baseX * 64 + var0); // L: 9308
			Client.packetWriter.addNode(var9); // L: 9309
		}

		if (var2 == 2) { // L: 9311
			Client.mouseCrossX = var7; // L: 9312
			Client.mouseCrossY = var8; // L: 9313
			Client.mouseCrossColor = 2; // L: 9314
			Client.mouseCrossState = 0; // L: 9315
			Client.destinationX = var0; // L: 9316
			Client.destinationY = var1; // L: 9317
			var9 = class251.getPacketBufferNode(ClientPacket.field3119, Client.packetWriter.isaacCipher); // L: 9318
			var9.packetBuffer.writeShort(Client.selectedSpellChildIndex); // L: 9319
			var9.packetBuffer.method9004(Client.selectedSpellItemId); // L: 9320
			var9.packetBuffer.writeShort(var3); // L: 9321
			var9.packetBuffer.method9004(ModeWhere.baseY * 64 + var1); // L: 9322
			var9.packetBuffer.method8993(Client.field759.method4087(82) ? 1 : 0); // L: 9323
			var9.packetBuffer.method9004(class147.baseX * 64 + var0); // L: 9324
			var9.packetBuffer.method9088(class60.selectedSpellWidget); // L: 9325
			Client.packetWriter.addNode(var9); // L: 9326
		}

		if (var2 == 50) { // L: 9328
			var15 = Client.players[var3]; // L: 9329
			if (var15 != null) { // L: 9330
				Client.mouseCrossX = var7; // L: 9331
				Client.mouseCrossY = var8; // L: 9332
				Client.mouseCrossColor = 2; // L: 9333
				Client.mouseCrossState = 0; // L: 9334
				Client.destinationX = var0; // L: 9335
				Client.destinationY = var1; // L: 9336
				var16 = class251.getPacketBufferNode(ClientPacket.field3201, Client.packetWriter.isaacCipher); // L: 9338
				var16.packetBuffer.writeByte(Client.field759.method4087(82) ? 1 : 0); // L: 9339
				var16.packetBuffer.method9004(var3); // L: 9340
				Client.packetWriter.addNode(var16); // L: 9341
			}
		}

		if (var2 == 18) { // L: 9344
			Client.mouseCrossX = var7; // L: 9345
			Client.mouseCrossY = var8; // L: 9346
			Client.mouseCrossColor = 2; // L: 9347
			Client.mouseCrossState = 0; // L: 9348
			Client.destinationX = var0; // L: 9349
			Client.destinationY = var1; // L: 9350
			var9 = class251.getPacketBufferNode(ClientPacket.field3161, Client.packetWriter.isaacCipher); // L: 9352
			var9.packetBuffer.method9139(var3); // L: 9353
			var9.packetBuffer.method9004(ModeWhere.baseY * 64 + var1); // L: 9354
			var9.packetBuffer.method9002(class147.baseX * 64 + var0); // L: 9355
			var9.packetBuffer.writeByte(Client.field759.method4087(82) ? 1 : 0); // L: 9356
			Client.packetWriter.addNode(var9); // L: 9357
		}

		PacketBufferNode var12;
		if (var2 == 1003) { // L: 9359
			Client.mouseCrossX = var7; // L: 9360
			Client.mouseCrossY = var8; // L: 9361
			Client.mouseCrossColor = 2; // L: 9362
			Client.mouseCrossState = 0; // L: 9363
			var17 = Client.npcs[var3]; // L: 9364
			if (var17 != null) { // L: 9365
				NPCComposition var19 = var17.definition; // L: 9366
				if (var19.transforms != null) { // L: 9367
					var19 = var19.transform();
				}

				if (var19 != null) { // L: 9368
					var12 = class251.getPacketBufferNode(ClientPacket.field3185, Client.packetWriter.isaacCipher); // L: 9370
					var12.packetBuffer.method9002(var19.id); // L: 9371
					Client.packetWriter.addNode(var12); // L: 9372
				}
			}
		}

		if (var2 == 48) { // L: 9376
			var15 = Client.players[var3]; // L: 9377
			if (var15 != null) { // L: 9378
				Client.mouseCrossX = var7; // L: 9379
				Client.mouseCrossY = var8; // L: 9380
				Client.mouseCrossColor = 2; // L: 9381
				Client.mouseCrossState = 0; // L: 9382
				Client.destinationX = var0; // L: 9383
				Client.destinationY = var1; // L: 9384
				var16 = class251.getPacketBufferNode(ClientPacket.field3112, Client.packetWriter.isaacCipher); // L: 9386
				var16.packetBuffer.method9004(var3); // L: 9387
				var16.packetBuffer.writeByte(Client.field759.method4087(82) ? 1 : 0); // L: 9388
				Client.packetWriter.addNode(var16); // L: 9389
			}
		}

		if (var2 == 13) { // L: 9392
			var17 = Client.npcs[var3]; // L: 9393
			if (var17 != null) { // L: 9394
				Client.mouseCrossX = var7; // L: 9395
				Client.mouseCrossY = var8; // L: 9396
				Client.mouseCrossColor = 2; // L: 9397
				Client.mouseCrossState = 0; // L: 9398
				Client.destinationX = var0; // L: 9399
				Client.destinationY = var1; // L: 9400
				var16 = class251.getPacketBufferNode(ClientPacket.field3195, Client.packetWriter.isaacCipher); // L: 9402
				var16.packetBuffer.method9002(var3); // L: 9403
				var16.packetBuffer.method8993(Client.field759.method4087(82) ? 1 : 0); // L: 9404
				Client.packetWriter.addNode(var16); // L: 9405
			}
		}

		if (var2 == 23) { // L: 9408
			if (Client.isMenuOpen) { // L: 9409
				UserComparator4.scene.setViewportWalking(); // L: 9410
			} else {
				UserComparator4.scene.menuOpen(NetFileRequest.Client_plane, var0, var1, true); // L: 9413
			}
		}

		if (var2 == 16) { // L: 9416
			Client.mouseCrossX = var7; // L: 9417
			Client.mouseCrossY = var8; // L: 9418
			Client.mouseCrossColor = 2; // L: 9419
			Client.mouseCrossState = 0; // L: 9420
			Client.destinationX = var0; // L: 9421
			Client.destinationY = var1; // L: 9422
			var9 = class251.getPacketBufferNode(ClientPacket.field3155, Client.packetWriter.isaacCipher); // L: 9424
			var9.packetBuffer.method9016(class31.field154); // L: 9425
			var9.packetBuffer.writeShort(class147.baseX * 64 + var0); // L: 9426
			var9.packetBuffer.method9139(class216.field2385); // L: 9427
			var9.packetBuffer.method8993(Client.field759.method4087(82) ? 1 : 0); // L: 9428
			var9.packetBuffer.writeShort(ModeWhere.baseY * 64 + var1); // L: 9429
			var9.packetBuffer.method9139(var3); // L: 9430
			var9.packetBuffer.method9004(class27.field130); // L: 9431
			Client.packetWriter.addNode(var9); // L: 9432
		}

		if (var2 == 47) { // L: 9434
			var15 = Client.players[var3]; // L: 9435
			if (var15 != null) { // L: 9436
				Client.mouseCrossX = var7; // L: 9437
				Client.mouseCrossY = var8; // L: 9438
				Client.mouseCrossColor = 2; // L: 9439
				Client.mouseCrossState = 0; // L: 9440
				Client.destinationX = var0; // L: 9441
				Client.destinationY = var1; // L: 9442
				var16 = class251.getPacketBufferNode(ClientPacket.field3109, Client.packetWriter.isaacCipher); // L: 9444
				var16.packetBuffer.method9002(var3); // L: 9445
				var16.packetBuffer.method8993(Client.field759.method4087(82) ? 1 : 0); // L: 9446
				Client.packetWriter.addNode(var16); // L: 9447
			}
		}

		if (var2 == 1004) { // L: 9450
			Client.mouseCrossX = var7; // L: 9451
			Client.mouseCrossY = var8; // L: 9452
			Client.mouseCrossColor = 2; // L: 9453
			Client.mouseCrossState = 0; // L: 9454
			var9 = class251.getPacketBufferNode(ClientPacket.field3111, Client.packetWriter.isaacCipher); // L: 9456
			var9.packetBuffer.method9002(var3); // L: 9457
			var9.packetBuffer.method9139(ModeWhere.baseY * 64 + var1); // L: 9458
			var9.packetBuffer.method9004(class147.baseX * 64 + var0); // L: 9459
			Client.packetWriter.addNode(var9); // L: 9460
		}

		if (var2 == 5) { // L: 9462
			Client.mouseCrossX = var7; // L: 9463
			Client.mouseCrossY = var8; // L: 9464
			Client.mouseCrossColor = 2; // L: 9465
			Client.mouseCrossState = 0; // L: 9466
			Client.destinationX = var0; // L: 9467
			Client.destinationY = var1; // L: 9468
			var9 = class251.getPacketBufferNode(ClientPacket.field3127, Client.packetWriter.isaacCipher); // L: 9470
			var9.packetBuffer.method9004(var3); // L: 9471
			var9.packetBuffer.method9004(class147.baseX * 64 + var0); // L: 9472
			var9.packetBuffer.method8994(Client.field759.method4087(82) ? 1 : 0); // L: 9473
			var9.packetBuffer.method9002(ModeWhere.baseY * 64 + var1); // L: 9474
			Client.packetWriter.addNode(var9); // L: 9475
		}

		if (var2 == 25) { // L: 9477
			var14 = ModelData0.getWidgetChild(var1, var0); // L: 9478
			if (var14 != null) { // L: 9479
				ScriptEvent.Widget_runOnTargetLeave(); // L: 9480
				class47.selectSpell(var1, var0, class316.Widget_unpackTargetMask(class209.getWidgetFlags(var14)), var4); // L: 9481
				Client.isItemSelected = 0; // L: 9482
				Client.field543 = class92.Widget_getSpellActionName(var14); // L: 9483
				if (Client.field543 == null) { // L: 9484
					Client.field543 = "null";
				}

				if (var14.isIf3) { // L: 9485
					Client.field649 = var14.dataText + class396.colorStartTag(16777215);
				} else {
					Client.field649 = class396.colorStartTag(65280) + var14.field3737 + class396.colorStartTag(16777215); // L: 9486
				}
			}

		} else {
			if (var2 == 19) { // L: 9490
				Client.mouseCrossX = var7; // L: 9491
				Client.mouseCrossY = var8; // L: 9492
				Client.mouseCrossColor = 2; // L: 9493
				Client.mouseCrossState = 0; // L: 9494
				Client.destinationX = var0; // L: 9495
				Client.destinationY = var1; // L: 9496
				var9 = class251.getPacketBufferNode(ClientPacket.field3178, Client.packetWriter.isaacCipher); // L: 9498
				var9.packetBuffer.method9002(var3); // L: 9499
				var9.packetBuffer.method9004(ModeWhere.baseY * 64 + var1); // L: 9500
				var9.packetBuffer.method9004(class147.baseX * 64 + var0); // L: 9501
				var9.packetBuffer.writeByte(Client.field759.method4087(82) ? 1 : 0); // L: 9502
				Client.packetWriter.addNode(var9); // L: 9503
			}

			if (var2 == 30 && Client.meslayerContinueWidget == null) { // L: 9505 9506
				GrandExchangeOfferTotalQuantityComparator.resumePauseWidget(var1, var0); // L: 9507
				Client.meslayerContinueWidget = ModelData0.getWidgetChild(var1, var0); // L: 9508
				HorizontalAlignment.invalidateWidget(Client.meslayerContinueWidget); // L: 9509
			}

			if (var2 == 1) { // L: 9512
				Client.mouseCrossX = var7; // L: 9513
				Client.mouseCrossY = var8; // L: 9514
				Client.mouseCrossColor = 2; // L: 9515
				Client.mouseCrossState = 0; // L: 9516
				Client.destinationX = var0; // L: 9517
				Client.destinationY = var1; // L: 9518
				var9 = class251.getPacketBufferNode(ClientPacket.field3136, Client.packetWriter.isaacCipher); // L: 9520
				var9.packetBuffer.method9133(class31.field154); // L: 9521
				var9.packetBuffer.method9004(class27.field130); // L: 9522
				var9.packetBuffer.method9002(ModeWhere.baseY * 64 + var1); // L: 9523
				var9.packetBuffer.method9002(var3); // L: 9524
				var9.packetBuffer.method9139(class216.field2385); // L: 9525
				var9.packetBuffer.method9004(class147.baseX * 64 + var0); // L: 9526
				var9.packetBuffer.method8994(Client.field759.method4087(82) ? 1 : 0); // L: 9527
				Client.packetWriter.addNode(var9); // L: 9528
			}

			if (var2 == 46) { // L: 9530
				var15 = Client.players[var3]; // L: 9531
				if (var15 != null) { // L: 9532
					Client.mouseCrossX = var7; // L: 9533
					Client.mouseCrossY = var8; // L: 9534
					Client.mouseCrossColor = 2; // L: 9535
					Client.mouseCrossState = 0; // L: 9536
					Client.destinationX = var0; // L: 9537
					Client.destinationY = var1; // L: 9538
					var16 = class251.getPacketBufferNode(ClientPacket.field3186, Client.packetWriter.isaacCipher); // L: 9540
					var16.packetBuffer.method9139(var3); // L: 9541
					var16.packetBuffer.method8994(Client.field759.method4087(82) ? 1 : 0); // L: 9542
					Client.packetWriter.addNode(var16); // L: 9543
				}
			}

			if (var2 == 44) { // L: 9546
				var15 = Client.players[var3]; // L: 9547
				if (var15 != null) { // L: 9548
					Client.mouseCrossX = var7; // L: 9549
					Client.mouseCrossY = var8; // L: 9550
					Client.mouseCrossColor = 2; // L: 9551
					Client.mouseCrossState = 0; // L: 9552
					Client.destinationX = var0; // L: 9553
					Client.destinationY = var1; // L: 9554
					var16 = class251.getPacketBufferNode(ClientPacket.field3103, Client.packetWriter.isaacCipher); // L: 9556
					var16.packetBuffer.method8995(Client.field759.method4087(82) ? 1 : 0); // L: 9557
					var16.packetBuffer.method9139(var3); // L: 9558
					Client.packetWriter.addNode(var16); // L: 9559
				}
			}

			if (var2 == 49) { // L: 9562
				var15 = Client.players[var3]; // L: 9563
				if (var15 != null) { // L: 9564
					Client.mouseCrossX = var7; // L: 9565
					Client.mouseCrossY = var8; // L: 9566
					Client.mouseCrossColor = 2; // L: 9567
					Client.mouseCrossState = 0; // L: 9568
					Client.destinationX = var0; // L: 9569
					Client.destinationY = var1; // L: 9570
					var16 = class251.getPacketBufferNode(ClientPacket.field3188, Client.packetWriter.isaacCipher); // L: 9572
					var16.packetBuffer.method8994(Client.field759.method4087(82) ? 1 : 0); // L: 9573
					var16.packetBuffer.writeShort(var3); // L: 9574
					Client.packetWriter.addNode(var16); // L: 9575
				}
			}

			if (var2 == 17) { // L: 9578
				Client.mouseCrossX = var7; // L: 9579
				Client.mouseCrossY = var8; // L: 9580
				Client.mouseCrossColor = 2; // L: 9581
				Client.mouseCrossState = 0; // L: 9582
				Client.destinationX = var0; // L: 9583
				Client.destinationY = var1; // L: 9584
				var9 = class251.getPacketBufferNode(ClientPacket.field3122, Client.packetWriter.isaacCipher); // L: 9585
				var9.packetBuffer.writeShort(ModeWhere.baseY * 64 + var1); // L: 9586
				var9.packetBuffer.method9139(Client.selectedSpellChildIndex); // L: 9587
				var9.packetBuffer.method9016(class60.selectedSpellWidget); // L: 9588
				var9.packetBuffer.method9002(Client.selectedSpellItemId); // L: 9589
				var9.packetBuffer.writeByte(Client.field759.method4087(82) ? 1 : 0); // L: 9590
				var9.packetBuffer.method9002(var3); // L: 9591
				var9.packetBuffer.method9139(class147.baseX * 64 + var0); // L: 9592
				Client.packetWriter.addNode(var9); // L: 9593
			}

			if (var2 == 21) { // L: 9595
				Client.mouseCrossX = var7; // L: 9596
				Client.mouseCrossY = var8; // L: 9597
				Client.mouseCrossColor = 2; // L: 9598
				Client.mouseCrossState = 0; // L: 9599
				Client.destinationX = var0; // L: 9600
				Client.destinationY = var1; // L: 9601
				var9 = class251.getPacketBufferNode(ClientPacket.field3104, Client.packetWriter.isaacCipher); // L: 9603
				var9.packetBuffer.method9004(class147.baseX * 64 + var0); // L: 9604
				var9.packetBuffer.method8995(Client.field759.method4087(82) ? 1 : 0); // L: 9605
				var9.packetBuffer.method9002(var3); // L: 9606
				var9.packetBuffer.method9004(ModeWhere.baseY * 64 + var1); // L: 9607
				Client.packetWriter.addNode(var9); // L: 9608
			}

			if (var2 == 28) { // L: 9610
				var9 = class251.getPacketBufferNode(ClientPacket.field3156, Client.packetWriter.isaacCipher); // L: 9612
				var9.packetBuffer.writeIntME(var1); // L: 9613
				Client.packetWriter.addNode(var9); // L: 9614
				var10 = ArchiveDiskActionHandler.getWidget(var1); // L: 9615
				if (var10 != null && var10.cs1Instructions != null && var10.cs1Instructions[0][0] == 5) { // L: 9616
					var11 = var10.cs1Instructions[0][1]; // L: 9617
					Varps.Varps_main[var11] = 1 - Varps.Varps_main[var11]; // L: 9618
					class1.changeGameOptions(var11); // L: 9619
				}
			}

			if (var2 == 1002) { // L: 9622
				Client.mouseCrossX = var7; // L: 9623
				Client.mouseCrossY = var8; // L: 9624
				Client.mouseCrossColor = 2; // L: 9625
				Client.mouseCrossState = 0; // L: 9626
				var9 = class251.getPacketBufferNode(ClientPacket.field3198, Client.packetWriter.isaacCipher); // L: 9628
				var9.packetBuffer.method9139(var3); // L: 9629
				Client.packetWriter.addNode(var9); // L: 9630
			}

			if (var2 == 15) { // L: 9632
				var15 = Client.players[var3]; // L: 9633
				if (var15 != null) { // L: 9634
					Client.mouseCrossX = var7; // L: 9635
					Client.mouseCrossY = var8; // L: 9636
					Client.mouseCrossColor = 2; // L: 9637
					Client.mouseCrossState = 0; // L: 9638
					Client.destinationX = var0; // L: 9639
					Client.destinationY = var1; // L: 9640
					var16 = class251.getPacketBufferNode(ClientPacket.field3192, Client.packetWriter.isaacCipher); // L: 9641
					var16.packetBuffer.writeShort(var3); // L: 9642
					var16.packetBuffer.method9088(class60.selectedSpellWidget); // L: 9643
					var16.packetBuffer.writeShort(Client.selectedSpellItemId); // L: 9644
					var16.packetBuffer.method9002(Client.selectedSpellChildIndex); // L: 9645
					var16.packetBuffer.method8993(Client.field759.method4087(82) ? 1 : 0); // L: 9646
					Client.packetWriter.addNode(var16); // L: 9647
				}
			}

			if (var2 == 14) { // L: 9650
				var15 = Client.players[var3]; // L: 9651
				if (var15 != null) { // L: 9652
					Client.mouseCrossX = var7; // L: 9653
					Client.mouseCrossY = var8; // L: 9654
					Client.mouseCrossColor = 2; // L: 9655
					Client.mouseCrossState = 0; // L: 9656
					Client.destinationX = var0; // L: 9657
					Client.destinationY = var1; // L: 9658
					var16 = class251.getPacketBufferNode(ClientPacket.field3162, Client.packetWriter.isaacCipher); // L: 9660
					var16.packetBuffer.method8995(Client.field759.method4087(82) ? 1 : 0); // L: 9661
					var16.packetBuffer.method9016(class31.field154); // L: 9662
					var16.packetBuffer.method9139(class27.field130); // L: 9663
					var16.packetBuffer.method9139(class216.field2385); // L: 9664
					var16.packetBuffer.method9004(var3); // L: 9665
					Client.packetWriter.addNode(var16); // L: 9666
				}
			}

			if (var2 == 45) { // L: 9669
				var15 = Client.players[var3]; // L: 9670
				if (var15 != null) { // L: 9671
					Client.mouseCrossX = var7; // L: 9672
					Client.mouseCrossY = var8; // L: 9673
					Client.mouseCrossColor = 2; // L: 9674
					Client.mouseCrossState = 0; // L: 9675
					Client.destinationX = var0; // L: 9676
					Client.destinationY = var1; // L: 9677
					var16 = class251.getPacketBufferNode(ClientPacket.field3193, Client.packetWriter.isaacCipher); // L: 9679
					var16.packetBuffer.writeByte(Client.field759.method4087(82) ? 1 : 0); // L: 9680
					var16.packetBuffer.writeShort(var3); // L: 9681
					Client.packetWriter.addNode(var16); // L: 9682
				}
			}

			if (var2 == 24) { // L: 9685
				var14 = ArchiveDiskActionHandler.getWidget(var1); // L: 9686
				if (var14 != null) { // L: 9687
					boolean var13 = true; // L: 9688
					if (var14.contentType > 0) { // L: 9689
						var13 = class148.method3145(var14);
					}

					if (var13) { // L: 9690
						var12 = class251.getPacketBufferNode(ClientPacket.field3156, Client.packetWriter.isaacCipher); // L: 9692
						var12.packetBuffer.writeIntME(var1); // L: 9693
						Client.packetWriter.addNode(var12); // L: 9694
					}
				}
			}

			if (var2 == 20) { // L: 9698
				Client.mouseCrossX = var7; // L: 9699
				Client.mouseCrossY = var8; // L: 9700
				Client.mouseCrossColor = 2; // L: 9701
				Client.mouseCrossState = 0; // L: 9702
				Client.destinationX = var0; // L: 9703
				Client.destinationY = var1; // L: 9704
				var9 = class251.getPacketBufferNode(ClientPacket.field3144, Client.packetWriter.isaacCipher); // L: 9706
				var9.packetBuffer.method9004(var3); // L: 9707
				var9.packetBuffer.method9002(ModeWhere.baseY * 64 + var1); // L: 9708
				var9.packetBuffer.writeByte(Client.field759.method4087(82) ? 1 : 0); // L: 9709
				var9.packetBuffer.writeShort(class147.baseX * 64 + var0); // L: 9710
				Client.packetWriter.addNode(var9); // L: 9711
			}

			if (Client.isItemSelected != 0) { // L: 9713
				Client.isItemSelected = 0; // L: 9714
				HorizontalAlignment.invalidateWidget(ArchiveDiskActionHandler.getWidget(class31.field154)); // L: 9715
			}

			if (Client.isSpellSelected) { // L: 9717
				ScriptEvent.Widget_runOnTargetLeave();
			}

		}
	} // L: 9488 9718
}
