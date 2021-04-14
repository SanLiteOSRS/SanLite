import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dp")
@Implements("UserComparator9")
public class UserComparator9 extends AbstractUserComparator {
	@ObfuscatedName("rx")
	@ObfuscatedGetter(
		intValue = -1797290331
	)
	static int field1435;
	@ObfuscatedName("f")
	@Export("reversed")
	final boolean reversed;

	public UserComparator9(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Llg;Llg;B)I",
		garbageValue = "6"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) {
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername());
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		signature = "(IIIILjava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "-1402191695"
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
			var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2322, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method6771(Client.selectedItemId);
			var8.packetBuffer.writeInt(UserComparator6.selectedItemWidget);
			var8.packetBuffer.writeShort(var3);
			var8.packetBuffer.method6716(class208.selectedItemSlot);
			var8.packetBuffer.writeShort(Tile.baseY * 64 + var1);
			var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.writeShort(ItemLayer.baseX * 64 + var0);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 2) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2229, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method6716(Client.selectedSpellChildIndex);
			var8.packetBuffer.method6614(ItemLayer.baseX * 64 + var0);
			var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method6614(Tile.baseY * 64 + var1);
			var8.packetBuffer.method6614(var3);
			var8.packetBuffer.method6625(class148.selectedSpellWidget);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 3) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2222, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method6716(Tile.baseY * 64 + var1);
			var8.packetBuffer.method6658(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method6771(var3);
			var8.packetBuffer.writeShort(ItemLayer.baseX * 64 + var0);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 4) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2292, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method6614(Tile.baseY * 64 + var1);
			var8.packetBuffer.writeShort(ItemLayer.baseX * 64 + var0);
			var8.packetBuffer.method6658(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method6614(var3);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 5) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2296, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method6771(ItemLayer.baseX * 64 + var0);
			var8.packetBuffer.method6771(var3);
			var8.packetBuffer.method6606(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method6771(Tile.baseY * 64 + var1);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 6) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2261, Client.packetWriter.isaacCipher);
			var8.packetBuffer.writeShort(var3);
			var8.packetBuffer.method6771(Tile.baseY * 64 + var1);
			var8.packetBuffer.method6716(ItemLayer.baseX * 64 + var0);
			var8.packetBuffer.method6606(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
					var9 = ObjectComposition.getPacketBufferNode(ClientPacket.field2248, Client.packetWriter.isaacCipher);
					var9.packetBuffer.writeInt(UserComparator6.selectedItemWidget);
					var9.packetBuffer.method6614(Client.selectedItemId);
					var9.packetBuffer.method6614(class208.selectedItemSlot);
					var9.packetBuffer.method6658(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.method6716(var3);
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
					var9 = ObjectComposition.getPacketBufferNode(ClientPacket.field2215, Client.packetWriter.isaacCipher);
					var9.packetBuffer.writeInt(class148.selectedSpellWidget);
					var9.packetBuffer.method6606(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.writeShort(Client.selectedSpellChildIndex);
					var9.packetBuffer.method6771(var3);
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
					var9 = ObjectComposition.getPacketBufferNode(ClientPacket.field2278, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method6614(var3);
					var9.packetBuffer.method6639(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
					var9 = ObjectComposition.getPacketBufferNode(ClientPacket.field2242, Client.packetWriter.isaacCipher);
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.method6771(var3);
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
					var9 = ObjectComposition.getPacketBufferNode(ClientPacket.field2258, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method6614(var3);
					var9.packetBuffer.method6658(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
					var9 = ObjectComposition.getPacketBufferNode(ClientPacket.field2282, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method6771(var3);
					var9.packetBuffer.method6639(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
					var9 = ObjectComposition.getPacketBufferNode(ClientPacket.field2309, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method6614(var3);
					var9.packetBuffer.method6606(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
						var9 = ObjectComposition.getPacketBufferNode(ClientPacket.field2287, Client.packetWriter.isaacCipher);
						var9.packetBuffer.method6624(UserComparator6.selectedItemWidget);
						var9.packetBuffer.method6639(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
						var9.packetBuffer.writeShort(Client.selectedItemId);
						var9.packetBuffer.method6716(class208.selectedItemSlot);
						var9.packetBuffer.method6614(var3);
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
						var9 = ObjectComposition.getPacketBufferNode(ClientPacket.field2265, Client.packetWriter.isaacCipher);
						var9.packetBuffer.method6624(class148.selectedSpellWidget);
						var9.packetBuffer.method6606(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
						var9.packetBuffer.method6716(var3);
						var9.packetBuffer.method6771(Client.selectedSpellChildIndex);
						Client.packetWriter.addNode(var9);
					}
				} else if (var2 == 16) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2259, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6614(class208.selectedItemSlot);
					var8.packetBuffer.method6625(UserComparator6.selectedItemWidget);
					var8.packetBuffer.method6771(ItemLayer.baseX * 64 + var0);
					var8.packetBuffer.method6639(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method6614(Client.selectedItemId);
					var8.packetBuffer.method6614(Tile.baseY * 64 + var1);
					var8.packetBuffer.writeShort(var3);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 17) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2321, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeInt(class148.selectedSpellWidget);
					var8.packetBuffer.method6639(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method6771(var3);
					var8.packetBuffer.method6716(Tile.baseY * 64 + var1);
					var8.packetBuffer.method6614(Client.selectedSpellChildIndex);
					var8.packetBuffer.writeShort(ItemLayer.baseX * 64 + var0);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 18) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2232, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6614(ItemLayer.baseX * 64 + var0);
					var8.packetBuffer.method6639(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method6614(Tile.baseY * 64 + var1);
					var8.packetBuffer.writeShort(var3);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 19) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2260, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6716(Tile.baseY * 64 + var1);
					var8.packetBuffer.method6658(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method6614(var3);
					var8.packetBuffer.method6716(ItemLayer.baseX * 64 + var0);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 20) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2305, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6771(ItemLayer.baseX * 64 + var0);
					var8.packetBuffer.method6606(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method6771(Tile.baseY * 64 + var1);
					var8.packetBuffer.method6716(var3);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 21) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2303, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method6716(Tile.baseY * 64 + var1);
					var8.packetBuffer.method6716(ItemLayer.baseX * 64 + var0);
					var8.packetBuffer.writeShort(var3);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 22) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2254, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6606(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method6716(ItemLayer.baseX * 64 + var0);
					var8.packetBuffer.writeShort(Tile.baseY * 64 + var1);
					var8.packetBuffer.method6716(var3);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 23) {
					if (Client.isMenuOpen) {
						WorldMapArea.scene.setViewportWalking();
					} else {
						WorldMapArea.scene.menuOpen(class26.Client_plane, var0, var1, true);
					}
				} else {
					PacketBufferNode var11;
					Widget var16;
					if (var2 == 24) {
						var16 = class139.getWidget(var1);
						boolean var12 = true;
						if (var16.contentType > 0) {
							var12 = FriendsChatManager.method5644(var16);
						}

						if (var12) {
							var11 = ObjectComposition.getPacketBufferNode(ClientPacket.field2240, Client.packetWriter.isaacCipher);
							var11.packetBuffer.writeInt(var1);
							Client.packetWriter.addNode(var11);
						}
					} else {
						if (var2 == 25) {
							var16 = class231.getWidgetChild(var1, var0);
							if (var16 != null) {
								WorldMapID.Widget_runOnTargetLeave();
								Strings.selectSpell(var1, var0, class223.method4231(DirectByteArrayCopier.getWidgetClickMask(var16)), var16.itemId);
								Client.isItemSelected = 0;
								Client.selectedSpellActionName = class11.method199(var16);
								if (Client.selectedSpellActionName == null) {
									Client.selectedSpellActionName = "null";
								}

								if (var16.isIf3) {
									Client.selectedSpellName = var16.dataText + DefaultsGroup.colorStartTag(16777215);
								} else {
									Client.selectedSpellName = DefaultsGroup.colorStartTag(65280) + var16.spellName + DefaultsGroup.colorStartTag(16777215);
								}
							}

							return;
						}

						if (var2 == 26) {
							Archive.method4470();
						} else {
							int var10;
							Widget var14;
							if (var2 == 28) {
								var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2240, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeInt(var1);
								Client.packetWriter.addNode(var8);
								var14 = class139.getWidget(var1);
								if (var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) {
									var10 = var14.cs1Instructions[0][1];
									Varps.Varps_main[var10] = 1 - Varps.Varps_main[var10];
									class27.changeGameOptions(var10);
								}
							} else if (var2 == 29) {
								var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2240, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeInt(var1);
								Client.packetWriter.addNode(var8);
								var14 = class139.getWidget(var1);
								if (var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) {
									var10 = var14.cs1Instructions[0][1];
									if (Varps.Varps_main[var10] != var14.cs1ComparisonValues[0]) {
										Varps.Varps_main[var10] = var14.cs1ComparisonValues[0];
										class27.changeGameOptions(var10);
									}
								}
							} else if (var2 == 30) {
								if (Client.meslayerContinueWidget == null) {
									class43.resumePauseWidget(var1, var0);
									Client.meslayerContinueWidget = class231.getWidgetChild(var1, var0);
									class29.invalidateWidget(Client.meslayerContinueWidget);
								}
							} else if (var2 == 31) {
								var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2274, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method6771(var3);
								var8.packetBuffer.method6754(var1);
								var8.packetBuffer.method6716(Client.selectedItemId);
								var8.packetBuffer.writeShort(var0);
								var8.packetBuffer.writeShort(class208.selectedItemSlot);
								var8.packetBuffer.method6754(UserComparator6.selectedItemWidget);
								Client.packetWriter.addNode(var8);
								Client.field708 = 0;
								PacketWriter.field1394 = class139.getWidget(var1);
								Client.field709 = var0;
							} else if (var2 == 32) {
								var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2219, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method6716(var0);
								var8.packetBuffer.writeShort(var3);
								var8.packetBuffer.method6624(class148.selectedSpellWidget);
								var8.packetBuffer.writeInt(var1);
								var8.packetBuffer.method6614(Client.selectedSpellChildIndex);
								Client.packetWriter.addNode(var8);
								Client.field708 = 0;
								PacketWriter.field1394 = class139.getWidget(var1);
								Client.field709 = var0;
							} else if (var2 == 33) {
								var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2277, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method6625(var1);
								var8.packetBuffer.method6771(var3);
								var8.packetBuffer.method6771(var0);
								Client.packetWriter.addNode(var8);
								Client.field708 = 0;
								PacketWriter.field1394 = class139.getWidget(var1);
								Client.field709 = var0;
							} else if (var2 == 34) {
								var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2299, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method6716(var3);
								var8.packetBuffer.method6716(var0);
								var8.packetBuffer.method6754(var1);
								Client.packetWriter.addNode(var8);
								Client.field708 = 0;
								PacketWriter.field1394 = class139.getWidget(var1);
								Client.field709 = var0;
							} else if (var2 == 35) {
								var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2264, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeInt(var1);
								var8.packetBuffer.method6716(var3);
								var8.packetBuffer.writeShort(var0);
								Client.packetWriter.addNode(var8);
								Client.field708 = 0;
								PacketWriter.field1394 = class139.getWidget(var1);
								Client.field709 = var0;
							} else if (var2 == 36) {
								var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2317, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeShort(var0);
								var8.packetBuffer.method6771(var3);
								var8.packetBuffer.method6624(var1);
								Client.packetWriter.addNode(var8);
								Client.field708 = 0;
								PacketWriter.field1394 = class139.getWidget(var1);
								Client.field709 = var0;
							} else if (var2 == 37) {
								var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2289, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method6624(var1);
								var8.packetBuffer.method6716(var3);
								var8.packetBuffer.method6614(var0);
								Client.packetWriter.addNode(var8);
								Client.field708 = 0;
								PacketWriter.field1394 = class139.getWidget(var1);
								Client.field709 = var0;
							} else {
								if (var2 == 38) {
									WorldMapID.Widget_runOnTargetLeave();
									var16 = class139.getWidget(var1);
									Client.isItemSelected = 1;
									class208.selectedItemSlot = var0;
									UserComparator6.selectedItemWidget = var1;
									Client.selectedItemId = var3;
									class29.invalidateWidget(var16);
									Client.selectedItemName = DefaultsGroup.colorStartTag(16748608) + class23.ItemDefinition_get(var3).name + DefaultsGroup.colorStartTag(16777215);
									if (Client.selectedItemName == null) {
										Client.selectedItemName = "null";
									}

									return;
								}

								if (var2 == 39) {
									var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2315, Client.packetWriter.isaacCipher);
									var8.packetBuffer.method6754(var1);
									var8.packetBuffer.method6771(var3);
									var8.packetBuffer.method6771(var0);
									Client.packetWriter.addNode(var8);
									Client.field708 = 0;
									PacketWriter.field1394 = class139.getWidget(var1);
									Client.field709 = var0;
								} else if (var2 == 40) {
									var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2325, Client.packetWriter.isaacCipher);
									var8.packetBuffer.method6614(var3);
									var8.packetBuffer.method6716(var0);
									var8.packetBuffer.method6754(var1);
									Client.packetWriter.addNode(var8);
									Client.field708 = 0;
									PacketWriter.field1394 = class139.getWidget(var1);
									Client.field709 = var0;
								} else if (var2 == 41) {
									var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2280, Client.packetWriter.isaacCipher);
									var8.packetBuffer.method6614(var3);
									var8.packetBuffer.method6614(var0);
									var8.packetBuffer.method6624(var1);
									Client.packetWriter.addNode(var8);
									Client.field708 = 0;
									PacketWriter.field1394 = class139.getWidget(var1);
									Client.field709 = var0;
								} else if (var2 == 42) {
									var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2257, Client.packetWriter.isaacCipher);
									var8.packetBuffer.method6614(var0);
									var8.packetBuffer.method6614(var3);
									var8.packetBuffer.method6754(var1);
									Client.packetWriter.addNode(var8);
									Client.field708 = 0;
									PacketWriter.field1394 = class139.getWidget(var1);
									Client.field709 = var0;
								} else if (var2 == 43) {
									var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2237, Client.packetWriter.isaacCipher);
									var8.packetBuffer.method6614(var0);
									var8.packetBuffer.writeInt(var1);
									var8.packetBuffer.method6771(var3);
									Client.packetWriter.addNode(var8);
									Client.field708 = 0;
									PacketWriter.field1394 = class139.getWidget(var1);
									Client.field709 = var0;
								} else if (var2 == 44) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = ObjectComposition.getPacketBufferNode(ClientPacket.field2318, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method6639(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.method6614(var3);
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
										var9 = ObjectComposition.getPacketBufferNode(ClientPacket.field2251, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method6614(var3);
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
										var9 = ObjectComposition.getPacketBufferNode(ClientPacket.field2275, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method6716(var3);
										var9.packetBuffer.method6639(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
										var9 = ObjectComposition.getPacketBufferNode(ClientPacket.field2250, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method6658(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.method6771(var3);
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
										var9 = ObjectComposition.getPacketBufferNode(ClientPacket.field2308, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeShort(var3);
										var9.packetBuffer.method6606(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
										var9 = ObjectComposition.getPacketBufferNode(ClientPacket.field2276, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method6614(var3);
										var9.packetBuffer.method6606(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
										var9 = ObjectComposition.getPacketBufferNode(ClientPacket.field2244, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method6658(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.method6614(var3);
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
										var9 = ObjectComposition.getPacketBufferNode(ClientPacket.field2228, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method6771(var3);
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										Client.packetWriter.addNode(var9);
									}
								} else {
									label874: {
										if (var2 != 57) {
											if (var2 == 58) {
												var16 = class231.getWidgetChild(var1, var0);
												if (var16 != null) {
													var9 = ObjectComposition.getPacketBufferNode(ClientPacket.field2223, Client.packetWriter.isaacCipher);
													var9.packetBuffer.method6614(var16.itemId);
													var9.packetBuffer.method6624(var1);
													var9.packetBuffer.writeShort(Client.field874);
													var9.packetBuffer.method6771(Client.selectedSpellChildIndex);
													var9.packetBuffer.method6625(class148.selectedSpellWidget);
													var9.packetBuffer.method6716(var0);
													Client.packetWriter.addNode(var9);
												}
												break label874;
											}

											if (var2 == 1001) {
												Client.mouseCrossX = var6;
												Client.mouseCrossY = var7;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												Client.destinationX = var0;
												Client.destinationY = var1;
												var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2285, Client.packetWriter.isaacCipher);
												var8.packetBuffer.method6716(Tile.baseY * 64 + var1);
												var8.packetBuffer.method6606(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
												var8.packetBuffer.method6771(var3);
												var8.packetBuffer.method6614(ItemLayer.baseX * 64 + var0);
												Client.packetWriter.addNode(var8);
												break label874;
											}

											if (var2 == 1002) {
												Client.mouseCrossX = var6;
												Client.mouseCrossY = var7;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2246, Client.packetWriter.isaacCipher);
												var8.packetBuffer.method6614(var3);
												Client.packetWriter.addNode(var8);
												break label874;
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
														var11 = ObjectComposition.getPacketBufferNode(ClientPacket.field2290, Client.packetWriter.isaacCipher);
														var11.packetBuffer.method6771(var17.id);
														Client.packetWriter.addNode(var11);
													}
												}
												break label874;
											}

											if (var2 == 1004) {
												Client.mouseCrossX = var6;
												Client.mouseCrossY = var7;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2295, Client.packetWriter.isaacCipher);
												var8.packetBuffer.method6771(var3);
												Client.packetWriter.addNode(var8);
												break label874;
											}

											if (var2 == 1005) {
												var16 = class139.getWidget(var1);
												if (var16 != null && var16.itemQuantities[var0] >= 100000) {
													class69.addGameMessage(27, "", var16.itemQuantities[var0] + " x " + class23.ItemDefinition_get(var3).name);
												} else {
													var9 = ObjectComposition.getPacketBufferNode(ClientPacket.field2295, Client.packetWriter.isaacCipher);
													var9.packetBuffer.method6771(var3);
													Client.packetWriter.addNode(var9);
												}

												Client.field708 = 0;
												PacketWriter.field1394 = class139.getWidget(var1);
												Client.field709 = var0;
												break label874;
											}

											if (var2 != 1007) {
												if (var2 == 1010 || var2 == 1008 || var2 == 1011 || var2 == 1009 || var2 == 1012) {
													UserComparator4.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1));
												}
												break label874;
											}
										}

										var16 = class231.getWidgetChild(var1, var0);
										if (var16 != null) {
											class376.widgetDefaultMenuAction(var3, var1, var0, var16.itemId, var5);
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
			class29.invalidateWidget(class139.getWidget(UserComparator6.selectedItemWidget));
		}

		if (Client.isSpellSelected) {
			WorldMapID.Widget_runOnTargetLeave();
		}

		if (PacketWriter.field1394 != null && Client.field708 == 0) {
			class29.invalidateWidget(PacketWriter.field1394);
		}

	}
}
