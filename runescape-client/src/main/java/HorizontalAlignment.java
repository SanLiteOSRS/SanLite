import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eg")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements Enumerated {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Leg;"
	)
	field1626(0, 0),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Leg;"
	)
	@Export("HorizontalAlignment_centered")
	HorizontalAlignment_centered(1, 1),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Leg;"
	)
	field1632(2, 2);

	@ObfuscatedName("in")
	@ObfuscatedGetter(
		intValue = 822805303
	)
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1511289313
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -571608141
	)
	@Export("id")
	final int id;

	HorizontalAlignment(int var3, int var4) {
		this.value = var3;
		this.id = var4;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-708237537"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "0"
	)
	@Export("colorStartTag")
	static String colorStartTag(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">";
	}

	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-313207505"
	)
	static final void method2733() {
		int[] var0 = Players.Players_indices;

		int var1;
		for (var1 = 0; var1 < Players.Players_count; ++var1) {
			Player var4 = Client.players[var0[var1]];
			if (var4 != null && var4.overheadTextCyclesRemaining > 0) {
				--var4.overheadTextCyclesRemaining;
				if (var4.overheadTextCyclesRemaining == 0) {
					var4.overheadText = null;
				}
			}
		}

		for (var1 = 0; var1 < Client.npcCount; ++var1) {
			int var2 = Client.npcIndices[var1];
			NPC var3 = Client.npcs[var2];
			if (var3 != null && var3.overheadTextCyclesRemaining > 0) {
				--var3.overheadTextCyclesRemaining;
				if (var3.overheadTextCyclesRemaining == 0) {
					var3.overheadText = null;
				}
			}
		}

	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;Ljava/lang/String;IIB)V",
		garbageValue = "4"
	)
	@Export("menuAction")
	static final void menuAction(int var0, int var1, int var2, int var3, String var4, String var5, int var6, int var7) {
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		PacketBufferNode var8;
		if (var2 == 1) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2656, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method6483(class8.selectedItemId);
			var8.packetBuffer.method6484(var3);
			var8.packetBuffer.method6475(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method6484(Messages.baseY * 64 + var1);
			var8.packetBuffer.writeInt(class35.selectedItemWidget);
			var8.packetBuffer.method6484(JagexCache.baseX * 64 + var0);
			var8.packetBuffer.writeShort(UserComparator8.selectedItemSlot);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 2) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2636, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method6482(JagexCache.baseX * 64 + var0);
			var8.packetBuffer.writeShort(var3);
			var8.packetBuffer.method6482(Client.field773);
			var8.packetBuffer.writeShort(Messages.baseY * 64 + var1);
			var8.packetBuffer.writeShort(Client.selectedSpellChildIndex);
			var8.packetBuffer.method6475(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method6445(class6.selectedSpellWidget);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 3) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2634, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method6475(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method6484(var3);
			var8.packetBuffer.writeShort(JagexCache.baseX * 64 + var0);
			var8.packetBuffer.method6482(Messages.baseY * 64 + var1);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 4) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2619, Client.packetWriter.isaacCipher);
			var8.packetBuffer.writeShort(JagexCache.baseX * 64 + var0);
			var8.packetBuffer.method6484(var3);
			var8.packetBuffer.method6449(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method6484(Messages.baseY * 64 + var1);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 5) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2615, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method6482(JagexCache.baseX * 64 + var0);
			var8.packetBuffer.method6484(Messages.baseY * 64 + var1);
			var8.packetBuffer.method6449(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method6483(var3);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 6) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2572, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method6483(var3);
			var8.packetBuffer.method6483(Messages.baseY * 64 + var1);
			var8.packetBuffer.method6449(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method6484(JagexCache.baseX * 64 + var0);
			Client.packetWriter.addNode(var8);
		} else {
			PacketBufferNode var9;
			NPC var13;
			if (var2 == 7) {
				var13 = Client.npcs[var3];
				if (var13 != null) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2579, Client.packetWriter.isaacCipher);
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.method6484(class8.selectedItemId);
					var9.packetBuffer.method6445(class35.selectedItemWidget);
					var9.packetBuffer.method6483(var3);
					var9.packetBuffer.method6482(UserComparator8.selectedItemSlot);
					Client.packetWriter.addNode(var9);
				}
			} else if (var2 == 8) {
				var13 = Client.npcs[var3];
				if (var13 != null) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2591, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method6445(class6.selectedSpellWidget);
					var9.packetBuffer.method6482(Client.field773);
					var9.packetBuffer.method6482(var3);
					var9.packetBuffer.writeShort(Client.selectedSpellChildIndex);
					var9.packetBuffer.method6475(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					Client.packetWriter.addNode(var9);
				}
			} else if (var2 == 9) {
				var13 = Client.npcs[var3];
				if (var13 != null) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2597, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method6449(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.method6482(var3);
					Client.packetWriter.addNode(var9);
				}
			} else if (var2 == 10) {
				var13 = Client.npcs[var3];
				if (var13 != null) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2612, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method6483(var3);
					var9.packetBuffer.method6449(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					Client.packetWriter.addNode(var9);
				}
			} else if (var2 == 11) {
				var13 = Client.npcs[var3];
				if (var13 != null) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2602, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method6482(var3);
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					Client.packetWriter.addNode(var9);
				}
			} else if (var2 == 12) {
				var13 = Client.npcs[var3];
				if (var13 != null) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2594, Client.packetWriter.isaacCipher);
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.method6483(var3);
					Client.packetWriter.addNode(var9);
				}
			} else if (var2 == 13) {
				var13 = Client.npcs[var3];
				if (var13 != null) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var9 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2618, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method6475(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.method6484(var3);
					Client.packetWriter.addNode(var9);
				}
			} else {
				Player var15;
				if (var2 == 14) {
					var15 = Client.players[var3];
					if (var15 != null) {
						Client.mouseCrossX = var6;
						Client.mouseCrossY = var7;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var9 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2616, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeIntME(class35.selectedItemWidget);
						var9.packetBuffer.method6483(class8.selectedItemId);
						var9.packetBuffer.method6449(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
						var9.packetBuffer.method6483(UserComparator8.selectedItemSlot);
						var9.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var9);
					}
				} else if (var2 == 15) {
					var15 = Client.players[var3];
					if (var15 != null) {
						Client.mouseCrossX = var6;
						Client.mouseCrossY = var7;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var9 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2608, Client.packetWriter.isaacCipher);
						var9.packetBuffer.method6483(Client.selectedSpellChildIndex);
						var9.packetBuffer.method6484(var3);
						var9.packetBuffer.method6493(class6.selectedSpellWidget);
						var9.packetBuffer.method6610(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
						var9.packetBuffer.method6484(Client.field773);
						Client.packetWriter.addNode(var9);
					}
				} else if (var2 == 16) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2570, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6482(UserComparator8.selectedItemSlot);
					var8.packetBuffer.method6483(var3);
					var8.packetBuffer.method6482(class8.selectedItemId);
					var8.packetBuffer.method6484(Messages.baseY * 64 + var1);
					var8.packetBuffer.method6482(JagexCache.baseX * 64 + var0);
					var8.packetBuffer.method6445(class35.selectedItemWidget);
					var8.packetBuffer.method6610(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 17) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2661, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6449(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method6493(class6.selectedSpellWidget);
					var8.packetBuffer.method6482(Messages.baseY * 64 + var1);
					var8.packetBuffer.method6484(Client.field773);
					var8.packetBuffer.method6483(var3);
					var8.packetBuffer.writeShort(JagexCache.baseX * 64 + var0);
					var8.packetBuffer.method6482(Client.selectedSpellChildIndex);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 18) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2617, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShort(var3);
					var8.packetBuffer.method6610(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method6484(Messages.baseY * 64 + var1);
					var8.packetBuffer.writeShort(JagexCache.baseX * 64 + var0);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 19) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2652, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6482(JagexCache.baseX * 64 + var0);
					var8.packetBuffer.method6484(Messages.baseY * 64 + var1);
					var8.packetBuffer.method6449(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method6482(var3);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 20) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2627, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6483(var3);
					var8.packetBuffer.method6482(JagexCache.baseX * 64 + var0);
					var8.packetBuffer.method6610(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method6484(Messages.baseY * 64 + var1);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 21) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2645, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6484(var3);
					var8.packetBuffer.writeShort(Messages.baseY * 64 + var1);
					var8.packetBuffer.method6449(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.writeShort(JagexCache.baseX * 64 + var0);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 22) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2642, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6484(var3);
					var8.packetBuffer.method6483(JagexCache.baseX * 64 + var0);
					var8.packetBuffer.method6475(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method6483(Messages.baseY * 64 + var1);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 23) {
					if (Client.isMenuOpen) {
						class5.scene.setViewportWalking();
					} else {
						class5.scene.menuOpen(ParamComposition.Client_plane, var0, var1, true);
					}
				} else {
					PacketBufferNode var10;
					Widget var16;
					if (var2 == 24) {
						var16 = DevicePcmPlayerProvider.getWidget(var1);
						boolean var12 = true;
						if (var16.contentType > 0) {
							var12 = WorldMapSprite.method3580(var16);
						}

						if (var12) {
							var10 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2630, Client.packetWriter.isaacCipher);
							var10.packetBuffer.writeInt(var1);
							Client.packetWriter.addNode(var10);
						}
					} else {
						if (var2 == 25) {
							var16 = PacketWriter.getWidgetChild(var1, var0);
							if (var16 != null) {
								class15.Widget_runOnTargetLeave();
								GrandExchangeOffer.selectSpell(var1, var0, AttackOption.Widget_unpackTargetMask(class26.getWidgetFlags(var16)), var16.itemId);
								Client.isItemSelected = 0;
								Client.selectedSpellActionName = UserComparator9.Widget_getSpellActionName(var16);
								if (Client.selectedSpellActionName == null) {
									Client.selectedSpellActionName = "null";
								}

								if (var16.isIf3) {
									Client.selectedSpellName = var16.dataText + colorStartTag(16777215);
								} else {
									Client.selectedSpellName = colorStartTag(65280) + var16.spellName + colorStartTag(16777215);
								}
							}

							return;
						}

						if (var2 == 26) {
							class80.method1943();
						} else {
							int var11;
							Widget var14;
							if (var2 == 28) {
								var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2630, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeInt(var1);
								Client.packetWriter.addNode(var8);
								var14 = DevicePcmPlayerProvider.getWidget(var1);
								if (var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) {
									var11 = var14.cs1Instructions[0][1];
									Varps.Varps_main[var11] = 1 - Varps.Varps_main[var11];
									WorldMapData_0.changeGameOptions(var11);
								}
							} else if (var2 == 29) {
								var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2630, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeInt(var1);
								Client.packetWriter.addNode(var8);
								var14 = DevicePcmPlayerProvider.getWidget(var1);
								if (var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) {
									var11 = var14.cs1Instructions[0][1];
									if (Varps.Varps_main[var11] != var14.cs1ComparisonValues[0]) {
										Varps.Varps_main[var11] = var14.cs1ComparisonValues[0];
										WorldMapData_0.changeGameOptions(var11);
									}
								}
							} else if (var2 == 30) {
								if (Client.meslayerContinueWidget == null) {
									resumePauseWidget(var1, var0);
									Client.meslayerContinueWidget = PacketWriter.getWidgetChild(var1, var0);
									VerticalAlignment.invalidateWidget(Client.meslayerContinueWidget);
								}
							} else if (var2 == 31) {
								var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2624, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeInt(var1);
								var8.packetBuffer.writeIntME(class35.selectedItemWidget);
								var8.packetBuffer.method6483(var0);
								var8.packetBuffer.writeShort(var3);
								var8.packetBuffer.method6484(UserComparator8.selectedItemSlot);
								var8.packetBuffer.method6484(class8.selectedItemId);
								Client.packetWriter.addNode(var8);
								Client.field817 = 0;
								Projectile.field1039 = DevicePcmPlayerProvider.getWidget(var1);
								Client.field633 = var0;
							} else if (var2 == 32) {
								var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2663, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method6445(class6.selectedSpellWidget);
								var8.packetBuffer.method6483(Client.selectedSpellChildIndex);
								var8.packetBuffer.method6445(var1);
								var8.packetBuffer.method6482(var3);
								var8.packetBuffer.method6483(var0);
								Client.packetWriter.addNode(var8);
								Client.field817 = 0;
								Projectile.field1039 = DevicePcmPlayerProvider.getWidget(var1);
								Client.field633 = var0;
							} else if (var2 == 33) {
								var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2595, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method6445(var1);
								var8.packetBuffer.method6482(var0);
								var8.packetBuffer.writeShort(var3);
								Client.packetWriter.addNode(var8);
								Client.field817 = 0;
								Projectile.field1039 = DevicePcmPlayerProvider.getWidget(var1);
								Client.field633 = var0;
							} else if (var2 == 34) {
								var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2569, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeIntME(var1);
								var8.packetBuffer.method6482(var0);
								var8.packetBuffer.method6482(var3);
								Client.packetWriter.addNode(var8);
								Client.field817 = 0;
								Projectile.field1039 = DevicePcmPlayerProvider.getWidget(var1);
								Client.field633 = var0;
							} else if (var2 == 35) {
								var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2620, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeShort(var3);
								var8.packetBuffer.method6445(var1);
								var8.packetBuffer.method6484(var0);
								Client.packetWriter.addNode(var8);
								Client.field817 = 0;
								Projectile.field1039 = DevicePcmPlayerProvider.getWidget(var1);
								Client.field633 = var0;
							} else if (var2 == 36) {
								var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2651, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method6493(var1);
								var8.packetBuffer.method6482(var3);
								var8.packetBuffer.method6484(var0);
								Client.packetWriter.addNode(var8);
								Client.field817 = 0;
								Projectile.field1039 = DevicePcmPlayerProvider.getWidget(var1);
								Client.field633 = var0;
							} else if (var2 == 37) {
								var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2575, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeIntME(var1);
								var8.packetBuffer.method6484(var0);
								var8.packetBuffer.writeShort(var3);
								Client.packetWriter.addNode(var8);
								Client.field817 = 0;
								Projectile.field1039 = DevicePcmPlayerProvider.getWidget(var1);
								Client.field633 = var0;
							} else {
								if (var2 == 38) {
									class15.Widget_runOnTargetLeave();
									var16 = DevicePcmPlayerProvider.getWidget(var1);
									Client.isItemSelected = 1;
									UserComparator8.selectedItemSlot = var0;
									class35.selectedItemWidget = var1;
									class8.selectedItemId = var3;
									VerticalAlignment.invalidateWidget(var16);
									Client.selectedItemName = colorStartTag(16748608) + Strings.ItemDefinition_get(var3).name + colorStartTag(16777215);
									if (Client.selectedItemName == null) {
										Client.selectedItemName = "null";
									}

									return;
								}

								if (var2 == 39) {
									var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2664, Client.packetWriter.isaacCipher);
									var8.packetBuffer.method6484(var0);
									var8.packetBuffer.method6482(var3);
									var8.packetBuffer.method6493(var1);
									Client.packetWriter.addNode(var8);
									Client.field817 = 0;
									Projectile.field1039 = DevicePcmPlayerProvider.getWidget(var1);
									Client.field633 = var0;
								} else if (var2 == 40) {
									var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2641, Client.packetWriter.isaacCipher);
									var8.packetBuffer.method6482(var0);
									var8.packetBuffer.writeIntME(var1);
									var8.packetBuffer.method6483(var3);
									Client.packetWriter.addNode(var8);
									Client.field817 = 0;
									Projectile.field1039 = DevicePcmPlayerProvider.getWidget(var1);
									Client.field633 = var0;
								} else if (var2 == 41) {
									var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2668, Client.packetWriter.isaacCipher);
									var8.packetBuffer.method6482(var3);
									var8.packetBuffer.method6483(var0);
									var8.packetBuffer.writeIntME(var1);
									Client.packetWriter.addNode(var8);
									Client.field817 = 0;
									Projectile.field1039 = DevicePcmPlayerProvider.getWidget(var1);
									Client.field633 = var0;
								} else if (var2 == 42) {
									var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2577, Client.packetWriter.isaacCipher);
									var8.packetBuffer.method6445(var1);
									var8.packetBuffer.writeShort(var3);
									var8.packetBuffer.method6483(var0);
									Client.packetWriter.addNode(var8);
									Client.field817 = 0;
									Projectile.field1039 = DevicePcmPlayerProvider.getWidget(var1);
									Client.field633 = var0;
								} else if (var2 == 43) {
									var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2660, Client.packetWriter.isaacCipher);
									var8.packetBuffer.method6483(var3);
									var8.packetBuffer.method6484(var0);
									var8.packetBuffer.method6493(var1);
									Client.packetWriter.addNode(var8);
									Client.field817 = 0;
									Projectile.field1039 = DevicePcmPlayerProvider.getWidget(var1);
									Client.field633 = var0;
								} else if (var2 == 44) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2571, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method6483(var3);
										var9.packetBuffer.method6610(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										Client.packetWriter.addNode(var9);
									}
								} else if (var2 == 45) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2647, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method6482(var3);
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										Client.packetWriter.addNode(var9);
									}
								} else if (var2 == 46) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2622, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method6610(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.writeShort(var3);
										Client.packetWriter.addNode(var9);
									}
								} else if (var2 == 47) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2565, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method6483(var3);
										var9.packetBuffer.method6610(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										Client.packetWriter.addNode(var9);
									}
								} else if (var2 == 48) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2654, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method6484(var3);
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										Client.packetWriter.addNode(var9);
									}
								} else if (var2 == 49) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2600, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method6449(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.method6484(var3);
										Client.packetWriter.addNode(var9);
									}
								} else if (var2 == 50) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2613, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.method6484(var3);
										Client.packetWriter.addNode(var9);
									}
								} else if (var2 == 51) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2669, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeShort(var3);
										var9.packetBuffer.method6475(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										Client.packetWriter.addNode(var9);
									}
								} else {
									label640: {
										if (var2 != 57) {
											if (var2 == 58) {
												var16 = PacketWriter.getWidgetChild(var1, var0);
												if (var16 != null) {
													var9 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2598, Client.packetWriter.isaacCipher);
													var9.packetBuffer.writeIntME(var1);
													var9.packetBuffer.method6483(var16.itemId);
													var9.packetBuffer.method6482(Client.field773);
													var9.packetBuffer.writeInt(class6.selectedSpellWidget);
													var9.packetBuffer.method6483(Client.selectedSpellChildIndex);
													var9.packetBuffer.method6482(var0);
													Client.packetWriter.addNode(var9);
												}
												break label640;
											}

											if (var2 == 1001) {
												Client.mouseCrossX = var6;
												Client.mouseCrossY = var7;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												Client.destinationX = var0;
												Client.destinationY = var1;
												var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2643, Client.packetWriter.isaacCipher);
												var8.packetBuffer.method6484(JagexCache.baseX * 64 + var0);
												var8.packetBuffer.method6475(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
												var8.packetBuffer.writeShort(var3);
												var8.packetBuffer.method6484(Messages.baseY * 64 + var1);
												Client.packetWriter.addNode(var8);
												break label640;
											}

											if (var2 == 1002) {
												Client.mouseCrossX = var6;
												Client.mouseCrossY = var7;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2671, Client.packetWriter.isaacCipher);
												var8.packetBuffer.method6482(var3);
												Client.packetWriter.addNode(var8);
												break label640;
											}

											if (var2 == 1003) {
												Client.mouseCrossX = var6;
												Client.mouseCrossY = var7;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												var13 = Client.npcs[var3];
												if (var13 != null) {
													NPCComposition var17 = var13.definition;
													if (var17.transforms != null) {
														var17 = var17.transform();
													}

													if (var17 != null) {
														var10 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2593, Client.packetWriter.isaacCipher);
														var10.packetBuffer.method6482(var17.id);
														Client.packetWriter.addNode(var10);
													}
												}
												break label640;
											}

											if (var2 == 1004) {
												Client.mouseCrossX = var6;
												Client.mouseCrossY = var7;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2639, Client.packetWriter.isaacCipher);
												var8.packetBuffer.method6482(var3);
												Client.packetWriter.addNode(var8);
												break label640;
											}

											if (var2 == 1005) {
												var16 = DevicePcmPlayerProvider.getWidget(var1);
												if (var16 != null && var16.itemQuantities[var0] >= 100000) {
													WorldMapScaleHandler.addGameMessage(27, "", var16.itemQuantities[var0] + " x " + Strings.ItemDefinition_get(var3).name);
												} else {
													var9 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2639, Client.packetWriter.isaacCipher);
													var9.packetBuffer.method6482(var3);
													Client.packetWriter.addNode(var9);
												}

												Client.field817 = 0;
												Projectile.field1039 = DevicePcmPlayerProvider.getWidget(var1);
												Client.field633 = var0;
												break label640;
											}

											if (var2 != 1007) {
												if (var2 == 1011 || var2 == 1009 || var2 == 1008 || var2 == 1010 || var2 == 1012) {
													NetSocket.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1));
												}
												break label640;
											}
										}

										var16 = PacketWriter.getWidgetChild(var1, var0);
										if (var16 != null) {
											class245.widgetDefaultMenuAction(var3, var1, var0, var16.itemId, var5);
										}
									}
								}
							}
						}
					}
				}
			}
		}

		if (Client.isItemSelected != 0) {
			Client.isItemSelected = 0;
			VerticalAlignment.invalidateWidget(DevicePcmPlayerProvider.getWidget(class35.selectedItemWidget));
		}

		if (Client.isSpellSelected) {
			class15.Widget_runOnTargetLeave();
		}

		if (Projectile.field1039 != null && Client.field817 == 0) {
			VerticalAlignment.invalidateWidget(Projectile.field1039);
		}

	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "999793942"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2584, Client.packetWriter.isaacCipher);
		var2.packetBuffer.method6483(var1);
		var2.packetBuffer.writeIntME(var0);
		Client.packetWriter.addNode(var2);
	}

	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "(Liv;I)Liv;",
		garbageValue = "2056882108"
	)
	static Widget method2731(Widget var0) {
		int var2 = class26.getWidgetFlags(var0);
		int var1 = var2 >> 17 & 7;
		int var3 = var1;
		if (var1 == 0) {
			return null;
		} else {
			for (int var4 = 0; var4 < var3; ++var4) {
				var0 = DevicePcmPlayerProvider.getWidget(var0.parentId);
				if (var0 == null) {
					return null;
				}
			}

			return var0;
		}
	}
}
