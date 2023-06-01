import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dt")
public enum class90 implements class369 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	field1081(0, -1),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	field1078(1, 2),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	field1080(2, 3),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	field1079(3, 4),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	field1086(4, 5),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	field1083(5, 6);

	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 209280171
	)
	final int field1084;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 404646253
	)
	final int field1085;

	class90(int var3, int var4) {
		this.field1084 = var3; // L: 21
		this.field1085 = var4; // L: 22
	} // L: 23

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1108588956"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1085; // L: 27
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "870029691"
	)
	protected static final void method2273() {
		GameEngine.clock.mark(); // L: 449

		int var0;
		for (var0 = 0; var0 < 32; ++var0) { // L: 450
			GameEngine.graphicsTickTimes[var0] = 0L;
		}

		for (var0 = 0; var0 < 32; ++var0) { // L: 451
			GameEngine.clientTickTimes[var0] = 0L;
		}

		UserComparator7.gameCyclesToDo = 0; // L: 452
	} // L: 453

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "426513145"
	)
	static final void method2272() {
		for (PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 8318 8319 8338
			if (var0.hitpoints > 0) { // L: 8320
				--var0.hitpoints;
			}

			if (var0.hitpoints == 0) { // L: 8321
				if (var0.objectId < 0 || class434.method8100(var0.objectId, var0.field1128)) { // L: 8322
					class138.method3069(var0.plane, var0.type, var0.x, var0.y, var0.objectId, var0.field1136, var0.field1128, var0.field1122); // L: 8323
					var0.remove(); // L: 8324
				}
			} else {
				if (var0.delay > 0) { // L: 8328
					--var0.delay;
				}

				if (var0.delay == 0 && var0.x >= 1 && var0.y >= 1 && var0.x <= 102 && var0.y <= 102 && (var0.field1129 < 0 || class434.method8100(var0.field1129, var0.field1131))) { // L: 8329 8330
					class138.method3069(var0.plane, var0.type, var0.x, var0.y, var0.field1129, var0.field1130, var0.field1131, var0.field1122); // L: 8331
					var0.delay = -1; // L: 8332
					if (var0.field1129 == var0.objectId && var0.objectId == -1) { // L: 8333
						var0.remove();
					} else if (var0.objectId == var0.field1129 && var0.field1130 == var0.field1136 && var0.field1128 == var0.field1131) {
						var0.remove(); // L: 8334
					}
				}
			}
		}

	} // L: 8340

	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;B)V",
		garbageValue = "-4"
	)
	@Export("widgetDefaultMenuAction")
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		Widget var5 = ModelData0.getWidgetChild(var1, var2); // L: 9802
		if (var5 != null) { // L: 9803
			if (var5.onOp != null) { // L: 9804
				ScriptEvent var6 = new ScriptEvent(); // L: 9805
				var6.widget = var5; // L: 9806
				var6.opIndex = var0; // L: 9807
				var6.targetName = var4; // L: 9808
				var6.args = var5.onOp; // L: 9809
				class260.runScriptEvent(var6); // L: 9810
			}

			boolean var11 = true; // L: 9812
			if (var5.contentType > 0) { // L: 9813
				var11 = class148.method3145(var5);
			}

			if (var11) { // L: 9814
				int var8 = class209.getWidgetFlags(var5); // L: 9816
				int var9 = var0 - 1; // L: 9817
				boolean var7 = (var8 >> var9 + 1 & 1) != 0; // L: 9819
				if (var7) { // L: 9821
					PacketBufferNode var10;
					if (var0 == 1) { // L: 9824
						var10 = class251.getPacketBufferNode(ClientPacket.field3194, Client.packetWriter.isaacCipher); // L: 9826
						var10.packetBuffer.writeIntME(var1); // L: 9827
						var10.packetBuffer.writeShort(var2); // L: 9828
						var10.packetBuffer.writeShort(var3); // L: 9829
						Client.packetWriter.addNode(var10); // L: 9830
					}

					if (var0 == 2) { // L: 9832
						var10 = class251.getPacketBufferNode(ClientPacket.field3187, Client.packetWriter.isaacCipher); // L: 9834
						var10.packetBuffer.writeIntME(var1); // L: 9835
						var10.packetBuffer.writeShort(var2); // L: 9836
						var10.packetBuffer.writeShort(var3); // L: 9837
						Client.packetWriter.addNode(var10); // L: 9838
					}

					if (var0 == 3) { // L: 9840
						var10 = class251.getPacketBufferNode(ClientPacket.field3146, Client.packetWriter.isaacCipher); // L: 9842
						var10.packetBuffer.writeIntME(var1); // L: 9843
						var10.packetBuffer.writeShort(var2); // L: 9844
						var10.packetBuffer.writeShort(var3); // L: 9845
						Client.packetWriter.addNode(var10); // L: 9846
					}

					if (var0 == 4) { // L: 9848
						var10 = class251.getPacketBufferNode(ClientPacket.field3106, Client.packetWriter.isaacCipher); // L: 9850
						var10.packetBuffer.writeIntME(var1); // L: 9851
						var10.packetBuffer.writeShort(var2); // L: 9852
						var10.packetBuffer.writeShort(var3); // L: 9853
						Client.packetWriter.addNode(var10); // L: 9854
					}

					if (var0 == 5) { // L: 9856
						var10 = class251.getPacketBufferNode(ClientPacket.field3176, Client.packetWriter.isaacCipher); // L: 9858
						var10.packetBuffer.writeIntME(var1); // L: 9859
						var10.packetBuffer.writeShort(var2); // L: 9860
						var10.packetBuffer.writeShort(var3); // L: 9861
						Client.packetWriter.addNode(var10); // L: 9862
					}

					if (var0 == 6) { // L: 9864
						var10 = class251.getPacketBufferNode(ClientPacket.field3120, Client.packetWriter.isaacCipher); // L: 9866
						var10.packetBuffer.writeIntME(var1); // L: 9867
						var10.packetBuffer.writeShort(var2); // L: 9868
						var10.packetBuffer.writeShort(var3); // L: 9869
						Client.packetWriter.addNode(var10); // L: 9870
					}

					if (var0 == 7) { // L: 9872
						var10 = class251.getPacketBufferNode(ClientPacket.field3172, Client.packetWriter.isaacCipher); // L: 9874
						var10.packetBuffer.writeIntME(var1); // L: 9875
						var10.packetBuffer.writeShort(var2); // L: 9876
						var10.packetBuffer.writeShort(var3); // L: 9877
						Client.packetWriter.addNode(var10); // L: 9878
					}

					if (var0 == 8) { // L: 9880
						var10 = class251.getPacketBufferNode(ClientPacket.field3167, Client.packetWriter.isaacCipher); // L: 9882
						var10.packetBuffer.writeIntME(var1); // L: 9883
						var10.packetBuffer.writeShort(var2); // L: 9884
						var10.packetBuffer.writeShort(var3); // L: 9885
						Client.packetWriter.addNode(var10); // L: 9886
					}

					if (var0 == 9) { // L: 9888
						var10 = class251.getPacketBufferNode(ClientPacket.field3133, Client.packetWriter.isaacCipher); // L: 9890
						var10.packetBuffer.writeIntME(var1); // L: 9891
						var10.packetBuffer.writeShort(var2); // L: 9892
						var10.packetBuffer.writeShort(var3); // L: 9893
						Client.packetWriter.addNode(var10); // L: 9894
					}

					if (var0 == 10) { // L: 9896
						var10 = class251.getPacketBufferNode(ClientPacket.field3140, Client.packetWriter.isaacCipher); // L: 9898
						var10.packetBuffer.writeIntME(var1); // L: 9899
						var10.packetBuffer.writeShort(var2); // L: 9900
						var10.packetBuffer.writeShort(var3); // L: 9901
						Client.packetWriter.addNode(var10); // L: 9902
					}

				}
			}
		}
	} // L: 9822 9904

	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "2114713894"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) { // L: 9940
			class388.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3); // L: 9941
		}

		long var4 = -1L; // L: 9944
		long var6 = -1L; // L: 9945

		int var8;
		for (var8 = 0; var8 < class104.method2654(); ++var8) { // L: 9946
			long var22 = SequenceDefinition.method4048(var8); // L: 9947
			if (var22 != var6) { // L: 9948
				var6 = var22; // L: 9949
				int var24 = WorldMapSection2.method5097(var8); // L: 9950
				long var14 = ViewportMouse.ViewportMouse_entityTags[var8]; // L: 9954
				int var13 = (int)(var14 >>> 7 & 127L); // L: 9956
				var13 = var13; // L: 9960
				int var25 = class146.method3128(var8); // L: 9961
				int var15 = class346.method6645(var8); // L: 9962
				int var19;
				if (var25 == 2 && UserComparator4.scene.getObjectFlags(NetFileRequest.Client_plane, var24, var13, var22) >= 0) { // L: 9963 9964
					ObjectComposition var16 = class59.getObjectDefinition(var15); // L: 9965
					if (var16.transforms != null) { // L: 9966
						var16 = var16.transform();
					}

					if (var16 == null) { // L: 9967
						continue;
					}

					PendingSpawn var17 = null; // L: 9968

					for (PendingSpawn var18 = (PendingSpawn)Client.pendingSpawns.last(); var18 != null; var18 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 9969
						if (var18.plane == NetFileRequest.Client_plane && var24 == var18.x && var13 == var18.y && var15 == var18.field1129) { // L: 9970
							var17 = var18; // L: 9971
							break;
						}
					}

					if (Client.isItemSelected == 1) { // L: 9975
						class388.insertMenuItemNoShift("Use", Client.field644 + " " + "->" + " " + class396.colorStartTag(65535) + var16.name, 1, var15, var24, var13); // L: 9976
					} else if (Client.isSpellSelected) { // L: 9979
						if ((SoundCache.selectedSpellFlags & 4) == 4) { // L: 9980
							class388.insertMenuItemNoShift(Client.field543, Client.field649 + " " + "->" + " " + class396.colorStartTag(65535) + var16.name, 2, var15, var24, var13); // L: 9981
						}
					} else {
						String[] var33 = var16.actions; // L: 9986
						if (var33 != null) { // L: 9987
							for (var19 = 4; var19 >= 0; --var19) { // L: 9988
								if ((var17 == null || var17.method2348(var19)) && var33[var19] != null) { // L: 9989 9990
									short var20 = 0; // L: 9991
									if (var19 == 0) { // L: 9992
										var20 = 3;
									}

									if (var19 == 1) { // L: 9993
										var20 = 4;
									}

									if (var19 == 2) { // L: 9994
										var20 = 5;
									}

									if (var19 == 3) { // L: 9995
										var20 = 6;
									}

									if (var19 == 4) { // L: 9996
										var20 = 1001;
									}

									class388.insertMenuItemNoShift(var33[var19], class396.colorStartTag(65535) + var16.name, var20, var15, var24, var13); // L: 9997
								}
							}
						}

						class388.insertMenuItemNoShift("Examine", class396.colorStartTag(65535) + var16.name, 1002, var16.id, var24, var13); // L: 10002
					}
				}

				int var26;
				Player var27;
				NPC var34;
				int[] var35;
				if (var25 == 1) { // L: 10007
					NPC var29 = Client.npcs[var15]; // L: 10008
					if (var29 == null) { // L: 10009
						continue;
					}

					if (var29.definition.size == 1 && (var29.x & 127) == 64 && (var29.y & 127) == 64) { // L: 10010
						for (var26 = 0; var26 < Client.npcCount; ++var26) { // L: 10011
							var34 = Client.npcs[Client.npcIndices[var26]]; // L: 10012
							if (var34 != null && var29 != var34 && var34.definition.size == 1 && var29.x == var34.x && var29.y == var34.y) { // L: 10013
								class348.addNpcToMenu(var34, Client.npcIndices[var26], var24, var13);
							}
						}

						var26 = Players.Players_count; // L: 10015
						var35 = Players.Players_indices; // L: 10016

						for (var19 = 0; var19 < var26; ++var19) { // L: 10017
							var27 = Client.players[var35[var19]]; // L: 10018
							if (var27 != null && var27.x == var29.x && var29.y == var27.y) { // L: 10019
								class148.addPlayerToMenu(var27, var35[var19], var24, var13);
							}
						}
					}

					class348.addNpcToMenu(var29, var15, var24, var13); // L: 10022
				}

				if (var25 == 0) { // L: 10024
					Player var30 = Client.players[var15]; // L: 10025
					if (var30 == null) { // L: 10026
						continue;
					}

					if ((var30.x & 127) == 64 && (var30.y & 127) == 64) { // L: 10027
						for (var26 = 0; var26 < Client.npcCount; ++var26) { // L: 10028
							var34 = Client.npcs[Client.npcIndices[var26]]; // L: 10029
							if (var34 != null && var34.definition.size == 1 && var30.x == var34.x && var30.y == var34.y) { // L: 10030
								class348.addNpcToMenu(var34, Client.npcIndices[var26], var24, var13);
							}
						}

						var26 = Players.Players_count; // L: 10032
						var35 = Players.Players_indices; // L: 10033

						for (var19 = 0; var19 < var26; ++var19) { // L: 10034
							var27 = Client.players[var35[var19]]; // L: 10035
							if (var27 != null && var27 != var30 && var30.x == var27.x && var27.y == var30.y) { // L: 10036
								class148.addPlayerToMenu(var27, var35[var19], var24, var13);
							}
						}
					}

					if (var15 != Client.combatTargetPlayerIndex) { // L: 10039
						class148.addPlayerToMenu(var30, var15, var24, var13);
					} else {
						var4 = var22; // L: 10040
					}
				}

				if (var25 == 3) { // L: 10042
					NodeDeque var31 = Client.groundItems[NetFileRequest.Client_plane][var24][var13]; // L: 10043
					if (var31 != null) { // L: 10044
						for (TileItem var32 = (TileItem)var31.first(); var32 != null; var32 = (TileItem)var31.next()) { // L: 10045 10046 10080
							ItemComposition var36 = class230.ItemComposition_get(var32.id); // L: 10047
							if (Client.isItemSelected == 1) { // L: 10048
								class388.insertMenuItemNoShift("Use", Client.field644 + " " + "->" + " " + class396.colorStartTag(16748608) + var36.name, 16, var32.id, var24, var13); // L: 10049
							} else if (Client.isSpellSelected) { // L: 10052
								if ((SoundCache.selectedSpellFlags & 1) == 1) { // L: 10053
									class388.insertMenuItemNoShift(Client.field543, Client.field649 + " " + "->" + " " + class396.colorStartTag(16748608) + var36.name, 17, var32.id, var24, var13); // L: 10054
								}
							} else {
								String[] var28 = var36.groundActions; // L: 10059

								for (int var37 = 4; var37 >= 0; --var37) { // L: 10060
									if (var32.method2642(var37)) { // L: 10061
										if (var28 != null && var28[var37] != null) { // L: 10062
											byte var21 = 0; // L: 10063
											if (var37 == 0) { // L: 10064
												var21 = 18;
											}

											if (var37 == 1) { // L: 10065
												var21 = 19;
											}

											if (var37 == 2) { // L: 10066
												var21 = 20;
											}

											if (var37 == 3) { // L: 10067
												var21 = 21;
											}

											if (var37 == 4) { // L: 10068
												var21 = 22;
											}

											class388.insertMenuItemNoShift(var28[var37], class396.colorStartTag(16748608) + var36.name, var21, var32.id, var24, var13); // L: 10069
										} else if (var37 == 2) { // L: 10072
											class388.insertMenuItemNoShift("Take", class396.colorStartTag(16748608) + var36.name, 20, var32.id, var24, var13); // L: 10073
										}
									}
								}

								class388.insertMenuItemNoShift("Examine", class396.colorStartTag(16748608) + var36.name, 1004, var32.id, var24, var13); // L: 10077
							}
						}
					}
				}
			}
		}

		if (-1L != var4) { // L: 10085
			var8 = CollisionMap.method4149(var4); // L: 10086
			int var9 = (int)(var4 >>> 7 & 127L); // L: 10089
			Player var11 = Client.players[Client.combatTargetPlayerIndex]; // L: 10092
			class148.addPlayerToMenu(var11, Client.combatTargetPlayerIndex, var8, var9); // L: 10093
		}

	} // L: 10095
}
