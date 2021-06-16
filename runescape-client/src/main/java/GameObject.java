import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hf")
@Implements("GameObject")
public final class GameObject {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1608001459
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1563453913
	)
	@Export("height")
	int height;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1270457979
	)
	@Export("centerX")
	int centerX;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1248595947
	)
	@Export("centerY")
	int centerY;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lgr;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1891554599
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 835758211
	)
	@Export("startX")
	int startX;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1267971371
	)
	@Export("endX")
	int endX;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -509888291
	)
	@Export("startY")
	int startY;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -2077981723
	)
	@Export("endY")
	int endY;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 569603025
	)
	int field2552;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1288318445
	)
	@Export("lastDrawn")
	int lastDrawn;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		longValue = 4383749992013445467L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1389469279
	)
	@Export("flags")
	int flags;

	GameObject() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-126"
	)
	public static void method4431() {
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
			if (ArchiveDiskActionHandler.field3557 != 0) {
				ArchiveDiskActionHandler.field3557 = 1;

				try {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.wait();
				} catch (InterruptedException var3) {
				}
			}

		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1327988393"
	)
	static void method4433() {
		if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
			Login.currentLoginField = 1;
		} else {
			Login.currentLoginField = 0;
		}

	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1544544242"
	)
	static void method4432() {
		Login.loginIndex = 24;
		CollisionMap.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", "");
	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "-1747523197"
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
			var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2642, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method6649(class15.baseX * 64 + var0);
			var8.packetBuffer.writeShort(var3);
			var8.packetBuffer.method6649(Timer.selectedItemSlot);
			var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method6658(class246.selectedItemWidget);
			var8.packetBuffer.writeShort(WorldMapSprite.baseY * 64 + var1);
			var8.packetBuffer.method6648(Buddy.selectedItemId);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 2) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2639, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method6648(Client.field634);
			var8.packetBuffer.method6649(class15.baseX * 64 + var0);
			var8.packetBuffer.method6705(Client.selectedSpellChildIndex);
			var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method6658(class15.selectedSpellWidget);
			var8.packetBuffer.method6705(WorldMapSprite.baseY * 64 + var1);
			var8.packetBuffer.method6649(var3);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 3) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2578, Client.packetWriter.isaacCipher);
			var8.packetBuffer.writeShort(WorldMapSprite.baseY * 64 + var1);
			var8.packetBuffer.method6639(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method6648(class15.baseX * 64 + var0);
			var8.packetBuffer.writeShort(var3);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 4) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2589, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method6648(WorldMapSprite.baseY * 64 + var1);
			var8.packetBuffer.method6649(class15.baseX * 64 + var0);
			var8.packetBuffer.method6639(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method6648(var3);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 5) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2657, Client.packetWriter.isaacCipher);
			var8.packetBuffer.writeShort(class15.baseX * 64 + var0);
			var8.packetBuffer.method6649(WorldMapSprite.baseY * 64 + var1);
			var8.packetBuffer.writeShort(var3);
			var8.packetBuffer.method6641(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 6) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2616, Client.packetWriter.isaacCipher);
			var8.packetBuffer.writeShort(var3);
			var8.packetBuffer.method6649(WorldMapSprite.baseY * 64 + var1);
			var8.packetBuffer.method6639(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method6649(class15.baseX * 64 + var0);
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
					var9 = InterfaceParent.getPacketBufferNode(ClientPacket.field2666, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method6648(var3);
					var9.packetBuffer.method6648(Buddy.selectedItemId);
					var9.packetBuffer.method6658(class246.selectedItemWidget);
					var9.packetBuffer.method6641(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.writeShort(Timer.selectedItemSlot);
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
					var9 = InterfaceParent.getPacketBufferNode(ClientPacket.field2617, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method6649(Client.selectedSpellChildIndex);
					var9.packetBuffer.writeInt(class15.selectedSpellWidget);
					var9.packetBuffer.writeShort(Client.field634);
					var9.packetBuffer.method6649(var3);
					var9.packetBuffer.method6639(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
					var9 = InterfaceParent.getPacketBufferNode(ClientPacket.field2671, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method6648(var3);
					var9.packetBuffer.method6641(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
					var9 = InterfaceParent.getPacketBufferNode(ClientPacket.field2649, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method6649(var3);
					var9.packetBuffer.method6639(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
					var9 = InterfaceParent.getPacketBufferNode(ClientPacket.field2597, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method6648(var3);
					var9.packetBuffer.method6640(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
					var9 = InterfaceParent.getPacketBufferNode(ClientPacket.field2681, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method6640(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.method6705(var3);
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
					var9 = InterfaceParent.getPacketBufferNode(ClientPacket.field2595, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method6641(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.method6705(var3);
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
						var9 = InterfaceParent.getPacketBufferNode(ClientPacket.field2650, Client.packetWriter.isaacCipher);
						var9.packetBuffer.method6641(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
						var9.packetBuffer.writeShort(var3);
						var9.packetBuffer.method6649(Timer.selectedItemSlot);
						var9.packetBuffer.method6649(Buddy.selectedItemId);
						var9.packetBuffer.writeIntME(class246.selectedItemWidget);
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
						var9 = InterfaceParent.getPacketBufferNode(ClientPacket.field2611, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeShort(Client.selectedSpellChildIndex);
						var9.packetBuffer.method6658(class15.selectedSpellWidget);
						var9.packetBuffer.method6649(var3);
						var9.packetBuffer.method6641(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
						var9.packetBuffer.method6705(Client.field634);
						Client.packetWriter.addNode(var9);
					}
				} else if (var2 == 16) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2654, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6639(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method6659(class246.selectedItemWidget);
					var8.packetBuffer.method6648(Buddy.selectedItemId);
					var8.packetBuffer.writeShort(Timer.selectedItemSlot);
					var8.packetBuffer.writeShort(var3);
					var8.packetBuffer.method6649(class15.baseX * 64 + var0);
					var8.packetBuffer.method6648(WorldMapSprite.baseY * 64 + var1);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 17) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2646, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6641(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.writeInt(class15.selectedSpellWidget);
					var8.packetBuffer.method6649(var3);
					var8.packetBuffer.method6648(Client.selectedSpellChildIndex);
					var8.packetBuffer.method6649(class15.baseX * 64 + var0);
					var8.packetBuffer.method6648(Client.field634);
					var8.packetBuffer.method6649(WorldMapSprite.baseY * 64 + var1);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 18) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2614, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6639(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method6649(WorldMapSprite.baseY * 64 + var1);
					var8.packetBuffer.method6705(class15.baseX * 64 + var0);
					var8.packetBuffer.method6649(var3);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 19) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2613, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6705(class15.baseX * 64 + var0);
					var8.packetBuffer.writeShort(var3);
					var8.packetBuffer.writeShort(WorldMapSprite.baseY * 64 + var1);
					var8.packetBuffer.method6639(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 20) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2602, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6641(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method6649(WorldMapSprite.baseY * 64 + var1);
					var8.packetBuffer.writeShort(class15.baseX * 64 + var0);
					var8.packetBuffer.method6649(var3);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 21) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2678, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6705(var3);
					var8.packetBuffer.method6705(WorldMapSprite.baseY * 64 + var1);
					var8.packetBuffer.method6648(class15.baseX * 64 + var0);
					var8.packetBuffer.method6641(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 22) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2604, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6640(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method6705(class15.baseX * 64 + var0);
					var8.packetBuffer.method6648(var3);
					var8.packetBuffer.method6705(WorldMapSprite.baseY * 64 + var1);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 23) {
					if (Client.isMenuOpen) {
						DevicePcmPlayerProvider.scene.setViewportWalking();
					} else {
						DevicePcmPlayerProvider.scene.menuOpen(SoundSystem.Client_plane, var0, var1, true);
					}
				} else {
					PacketBufferNode var11;
					Widget var16;
					if (var2 == 24) {
						var16 = WorldMapData_1.getWidget(var1);
						boolean var12 = true;
						if (var16.contentType > 0) {
							var12 = class343.method6080(var16);
						}

						if (var12) {
							var11 = InterfaceParent.getPacketBufferNode(ClientPacket.field2677, Client.packetWriter.isaacCipher);
							var11.packetBuffer.writeInt(var1);
							Client.packetWriter.addNode(var11);
						}
					} else {
						if (var2 == 25) {
							var16 = class17.getWidgetChild(var1, var0);
							if (var16 != null) {
								class20.Widget_runOnTargetLeave();
								ItemComposition.selectSpell(var1, var0, ModelData0.Widget_unpackTargetMask(class22.getWidgetFlags(var16)), var16.itemId);
								Client.isItemSelected = 0;
								Client.selectedSpellActionName = SecureRandomCallable.Widget_getSpellActionName(var16);
								if (Client.selectedSpellActionName == null) {
									Client.selectedSpellActionName = "null";
								}

								if (var16.isIf3) {
									Client.selectedSpellName = var16.dataText + SecureRandomFuture.colorStartTag(16777215);
								} else {
									Client.selectedSpellName = SecureRandomFuture.colorStartTag(65280) + var16.spellName + SecureRandomFuture.colorStartTag(16777215);
								}
							}

							return;
						}

						if (var2 == 26) {
							class20.method288();
						} else {
							int var10;
							Widget var14;
							if (var2 == 28) {
								var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2677, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeInt(var1);
								Client.packetWriter.addNode(var8);
								var14 = WorldMapData_1.getWidget(var1);
								if (var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) {
									var10 = var14.cs1Instructions[0][1];
									Varps.Varps_main[var10] = 1 - Varps.Varps_main[var10];
									class6.changeGameOptions(var10);
								}
							} else if (var2 == 29) {
								var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2677, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeInt(var1);
								Client.packetWriter.addNode(var8);
								var14 = WorldMapData_1.getWidget(var1);
								if (var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) {
									var10 = var14.cs1Instructions[0][1];
									if (Varps.Varps_main[var10] != var14.cs1ComparisonValues[0]) {
										Varps.Varps_main[var10] = var14.cs1ComparisonValues[0];
										class6.changeGameOptions(var10);
									}
								}
							} else if (var2 == 30) {
								if (Client.meslayerContinueWidget == null) {
									ClanChannelMember.resumePauseWidget(var1, var0);
									Client.meslayerContinueWidget = class17.getWidgetChild(var1, var0);
									Script.invalidateWidget(Client.meslayerContinueWidget);
								}
							} else if (var2 == 31) {
								var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2620, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method6648(Timer.selectedItemSlot);
								var8.packetBuffer.method6658(var1);
								var8.packetBuffer.method6705(Buddy.selectedItemId);
								var8.packetBuffer.writeIntME(class246.selectedItemWidget);
								var8.packetBuffer.method6648(var3);
								var8.packetBuffer.method6705(var0);
								Client.packetWriter.addNode(var8);
								Client.field869 = 0;
								Login.field1034 = WorldMapData_1.getWidget(var1);
								Client.field729 = var0;
							} else if (var2 == 32) {
								var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2632, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method6648(var0);
								var8.packetBuffer.writeShort(var3);
								var8.packetBuffer.method6649(Client.selectedSpellChildIndex);
								var8.packetBuffer.writeInt(var1);
								var8.packetBuffer.writeInt(class15.selectedSpellWidget);
								Client.packetWriter.addNode(var8);
								Client.field869 = 0;
								Login.field1034 = WorldMapData_1.getWidget(var1);
								Client.field729 = var0;
							} else if (var2 == 33) {
								var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2663, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeInt(var1);
								var8.packetBuffer.writeShort(var0);
								var8.packetBuffer.method6649(var3);
								Client.packetWriter.addNode(var8);
								Client.field869 = 0;
								Login.field1034 = WorldMapData_1.getWidget(var1);
								Client.field729 = var0;
							} else if (var2 == 34) {
								var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2638, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeInt(var1);
								var8.packetBuffer.method6648(var0);
								var8.packetBuffer.method6649(var3);
								Client.packetWriter.addNode(var8);
								Client.field869 = 0;
								Login.field1034 = WorldMapData_1.getWidget(var1);
								Client.field729 = var0;
							} else if (var2 == 35) {
								var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2628, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method6648(var0);
								var8.packetBuffer.method6649(var3);
								var8.packetBuffer.method6659(var1);
								Client.packetWriter.addNode(var8);
								Client.field869 = 0;
								Login.field1034 = WorldMapData_1.getWidget(var1);
								Client.field729 = var0;
							} else if (var2 == 36) {
								var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2590, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method6658(var1);
								var8.packetBuffer.method6649(var0);
								var8.packetBuffer.method6648(var3);
								Client.packetWriter.addNode(var8);
								Client.field869 = 0;
								Login.field1034 = WorldMapData_1.getWidget(var1);
								Client.field729 = var0;
							} else if (var2 == 37) {
								var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2580, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method6705(var3);
								var8.packetBuffer.writeShort(var0);
								var8.packetBuffer.method6658(var1);
								Client.packetWriter.addNode(var8);
								Client.field869 = 0;
								Login.field1034 = WorldMapData_1.getWidget(var1);
								Client.field729 = var0;
							} else {
								if (var2 == 38) {
									class20.Widget_runOnTargetLeave();
									var16 = WorldMapData_1.getWidget(var1);
									Client.isItemSelected = 1;
									Timer.selectedItemSlot = var0;
									class246.selectedItemWidget = var1;
									Buddy.selectedItemId = var3;
									Script.invalidateWidget(var16);
									Client.selectedItemName = SecureRandomFuture.colorStartTag(16748608) + class250.ItemDefinition_get(var3).name + SecureRandomFuture.colorStartTag(16777215);
									if (Client.selectedItemName == null) {
										Client.selectedItemName = "null";
									}

									return;
								}

								if (var2 == 39) {
									var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2640, Client.packetWriter.isaacCipher);
									var8.packetBuffer.writeIntME(var1);
									var8.packetBuffer.method6649(var3);
									var8.packetBuffer.method6648(var0);
									Client.packetWriter.addNode(var8);
									Client.field869 = 0;
									Login.field1034 = WorldMapData_1.getWidget(var1);
									Client.field729 = var0;
								} else if (var2 == 40) {
									var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2641, Client.packetWriter.isaacCipher);
									var8.packetBuffer.writeShort(var0);
									var8.packetBuffer.writeIntME(var1);
									var8.packetBuffer.writeShort(var3);
									Client.packetWriter.addNode(var8);
									Client.field869 = 0;
									Login.field1034 = WorldMapData_1.getWidget(var1);
									Client.field729 = var0;
								} else if (var2 == 41) {
									var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2637, Client.packetWriter.isaacCipher);
									var8.packetBuffer.writeShort(var0);
									var8.packetBuffer.method6649(var3);
									var8.packetBuffer.writeIntME(var1);
									Client.packetWriter.addNode(var8);
									Client.field869 = 0;
									Login.field1034 = WorldMapData_1.getWidget(var1);
									Client.field729 = var0;
								} else if (var2 == 42) {
									var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2672, Client.packetWriter.isaacCipher);
									var8.packetBuffer.method6648(var3);
									var8.packetBuffer.method6648(var0);
									var8.packetBuffer.writeInt(var1);
									Client.packetWriter.addNode(var8);
									Client.field869 = 0;
									Login.field1034 = WorldMapData_1.getWidget(var1);
									Client.field729 = var0;
								} else if (var2 == 43) {
									var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2645, Client.packetWriter.isaacCipher);
									var8.packetBuffer.writeIntME(var1);
									var8.packetBuffer.writeShort(var3);
									var8.packetBuffer.method6705(var0);
									Client.packetWriter.addNode(var8);
									Client.field869 = 0;
									Login.field1034 = WorldMapData_1.getWidget(var1);
									Client.field729 = var0;
								} else if (var2 == 44) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = InterfaceParent.getPacketBufferNode(ClientPacket.field2618, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method6705(var3);
										var9.packetBuffer.method6640(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
										var9 = InterfaceParent.getPacketBufferNode(ClientPacket.field2625, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method6649(var3);
										var9.packetBuffer.method6641(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
										var9 = InterfaceParent.getPacketBufferNode(ClientPacket.field2652, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method6639(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.method6649(var3);
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
										var9 = InterfaceParent.getPacketBufferNode(ClientPacket.field2627, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method6640(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.method6648(var3);
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
										var9 = InterfaceParent.getPacketBufferNode(ClientPacket.field2608, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method6648(var3);
										var9.packetBuffer.method6641(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
										var9 = InterfaceParent.getPacketBufferNode(ClientPacket.field2605, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method6649(var3);
										var9.packetBuffer.method6639(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
										var9 = InterfaceParent.getPacketBufferNode(ClientPacket.field2673, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.method6705(var3);
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
										var9 = InterfaceParent.getPacketBufferNode(ClientPacket.field2674, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method6641(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.writeShort(var3);
										Client.packetWriter.addNode(var9);
									}
								} else if (var2 != 57 && var2 != 1007) {
									if (var2 == 58) {
										var16 = class17.getWidgetChild(var1, var0);
										if (var16 != null) {
											var9 = InterfaceParent.getPacketBufferNode(ClientPacket.field2676, Client.packetWriter.isaacCipher);
											var9.packetBuffer.method6649(var16.itemId);
											var9.packetBuffer.writeIntME(var1);
											var9.packetBuffer.method6705(Client.selectedSpellChildIndex);
											var9.packetBuffer.method6648(var0);
											var9.packetBuffer.writeInt(class15.selectedSpellWidget);
											var9.packetBuffer.writeShort(Client.field634);
											Client.packetWriter.addNode(var9);
										}
									} else if (var2 == 1001) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2623, Client.packetWriter.isaacCipher);
										var8.packetBuffer.method6649(var3);
										var8.packetBuffer.method6641(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var8.packetBuffer.method6705(WorldMapSprite.baseY * 64 + var1);
										var8.packetBuffer.method6648(class15.baseX * 64 + var0);
										Client.packetWriter.addNode(var8);
									} else if (var2 == 1002) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2626, Client.packetWriter.isaacCipher);
										var8.packetBuffer.writeShort(var3);
										Client.packetWriter.addNode(var8);
									} else if (var2 == 1003) {
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
												var11 = InterfaceParent.getPacketBufferNode(ClientPacket.field2634, Client.packetWriter.isaacCipher);
												var11.packetBuffer.method6649(var17.id);
												Client.packetWriter.addNode(var11);
											}
										}
									} else if (var2 == 1004) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										var8 = InterfaceParent.getPacketBufferNode(ClientPacket.field2629, Client.packetWriter.isaacCipher);
										var8.packetBuffer.writeShort(var3);
										Client.packetWriter.addNode(var8);
									} else if (var2 == 1005) {
										var16 = WorldMapData_1.getWidget(var1);
										if (var16 != null && var16.itemQuantities[var0] >= 100000) {
											UserComparator10.addGameMessage(27, "", var16.itemQuantities[var0] + " x " + class250.ItemDefinition_get(var3).name);
										} else {
											var9 = InterfaceParent.getPacketBufferNode(ClientPacket.field2629, Client.packetWriter.isaacCipher);
											var9.packetBuffer.writeShort(var3);
											Client.packetWriter.addNode(var9);
										}

										Client.field869 = 0;
										Login.field1034 = WorldMapData_1.getWidget(var1);
										Client.field729 = var0;
									} else if (var2 == 1009 || var2 == 1008 || var2 == 1010 || var2 == 1011 || var2 == 1012) {
										class80.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1));
									}
								} else {
									var16 = class17.getWidgetChild(var1, var0);
									if (var16 != null) {
										MouseHandler.widgetDefaultMenuAction(var3, var1, var0, var16.itemId, var5);
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
			Script.invalidateWidget(WorldMapData_1.getWidget(class246.selectedItemWidget));
		}

		if (Client.isSpellSelected) {
			class20.Widget_runOnTargetLeave();
		}

		if (Login.field1034 != null && Client.field869 == 0) {
			Script.invalidateWidget(Login.field1034);
		}

	}
}
