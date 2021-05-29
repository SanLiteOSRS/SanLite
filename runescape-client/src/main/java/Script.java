import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cf")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 1575006245
	)
	static int field1094;
	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	@Export("dragInventoryWidget")
	static Widget dragInventoryWidget;
	@ObfuscatedName("n")
	String field1084;
	@ObfuscatedName("f")
	@Export("opcodes")
	int[] opcodes;
	@ObfuscatedName("y")
	@Export("intOperands")
	int[] intOperands;
	@ObfuscatedName("p")
	@Export("stringOperands")
	String[] stringOperands;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1356584441
	)
	@Export("localIntCount")
	int localIntCount;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -2056602721
	)
	@Export("localStringCount")
	int localStringCount;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1265512819
	)
	@Export("intArgumentCount")
	int intArgumentCount;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -162786155
	)
	@Export("stringArgumentCount")
	int stringArgumentCount;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "[Lmr;"
	)
	@Export("switches")
	IterableNodeHashTable[] switches;

	static {
		Script_cached = new EvictingDualNodeHashTable(128);
	}

	Script() {
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(II)[Lmr;",
		garbageValue = "920031088"
	)
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1];
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Z",
		garbageValue = "2094340190"
	)
	static boolean method1996(String var0, int var1, String var2) {
		if (var1 == 0) {
			try {
				if (!class44.field318.startsWith("win")) {
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
					throw new Exception();
				} else {
					String var10 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

					for (int var4 = 0; var4 < var0.length(); ++var4) {
						if (var10.indexOf(var0.charAt(var4)) == -1) {
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
					return true;
				}
			} catch (Throwable var5) {
				return false;
			}
		} else if (var1 == 1) {
			try {
				Object var3 = class42.method422(class44.applet, var2, new Object[]{(new URL(class44.applet.getCodeBase(), var0)).toString()});
				return var3 != null;
			} catch (Throwable var6) {
				return false;
			}
		} else if (var1 == 2) {
			try {
				class44.applet.getAppletContext().showDocument(new URL(class44.applet.getCodeBase(), var0), "_blank");
				return true;
			} catch (Exception var7) {
				return false;
			}
		} else if (var1 == 3) {
			try {
				class42.method421(class44.applet, "loggedout");
			} catch (Throwable var9) {
			}

			try {
				class44.applet.getAppletContext().showDocument(new URL(class44.applet.getCodeBase(), var0), "_top");
				return true;
			} catch (Exception var8) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ZZI)Lop;",
		garbageValue = "-488222672"
	)
	static IndexedSprite method1995(boolean var0, boolean var1) {
		return var0 ? (var1 ? class3.field33 : GrandExchangeOffer.options_buttons_2Sprite) : (var1 ? Decimator.field553 : FriendSystem.options_buttons_0Sprite);
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IIZB)Ljava/lang/String;",
		garbageValue = "-128"
	)
	static String method1998(int var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) {
			if (var2 && var0 >= 0) {
				int var3 = 2;

				for (int var4 = var0 / var1; var4 != 0; ++var3) {
					var4 /= var1;
				}

				char[] var5 = new char[var3];
				var5[0] = '+';

				for (int var6 = var3 - 1; var6 > 0; --var6) {
					int var7 = var0;
					var0 /= var1;
					int var8 = var7 - var0 * var1;
					if (var8 >= 10) {
						var5[var6] = (char)(var8 + 87);
					} else {
						var5[var6] = (char)(var8 + 48);
					}
				}

				return new String(var5);
			} else {
				return Integer.toString(var0, var1);
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "2054699794"
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
			var8 = class21.getPacketBufferNode(ClientPacket.field2677, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method6619(UserComparator5.selectedItemId);
			var8.packetBuffer.method6602(var3);
			var8.packetBuffer.method6594(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method6602(SoundSystem.baseY * 64 + var1);
			var8.packetBuffer.writeInt(Player.selectedItemWidget);
			var8.packetBuffer.method6602(VertexNormal.baseX * 64 + var0);
			var8.packetBuffer.writeShort(class9.selectedItemSlot);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 2) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = class21.getPacketBufferNode(ClientPacket.field2643, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method6600(VertexNormal.baseX * 64 + var0);
			var8.packetBuffer.writeShort(var3);
			var8.packetBuffer.method6600(Client.field788);
			var8.packetBuffer.writeShort(SoundSystem.baseY * 64 + var1);
			var8.packetBuffer.writeShort(Client.selectedSpellChildIndex);
			var8.packetBuffer.method6594(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method6612(Decimator.selectedSpellWidget);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 3) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = class21.getPacketBufferNode(ClientPacket.field2641, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method6594(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method6602(var3);
			var8.packetBuffer.writeShort(VertexNormal.baseX * 64 + var0);
			var8.packetBuffer.method6600(SoundSystem.baseY * 64 + var1);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 4) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = class21.getPacketBufferNode(ClientPacket.field2626, Client.packetWriter.isaacCipher);
			var8.packetBuffer.writeShort(VertexNormal.baseX * 64 + var0);
			var8.packetBuffer.method6602(var3);
			var8.packetBuffer.method6581(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method6602(SoundSystem.baseY * 64 + var1);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 5) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = class21.getPacketBufferNode(ClientPacket.field2672, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method6600(VertexNormal.baseX * 64 + var0);
			var8.packetBuffer.method6602(SoundSystem.baseY * 64 + var1);
			var8.packetBuffer.method6581(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method6619(var3);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 6) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = class21.getPacketBufferNode(ClientPacket.field2572, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method6619(var3);
			var8.packetBuffer.method6619(SoundSystem.baseY * 64 + var1);
			var8.packetBuffer.method6581(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method6602(VertexNormal.baseX * 64 + var0);
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
					var9 = class21.getPacketBufferNode(ClientPacket.field2675, Client.packetWriter.isaacCipher);
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.method6602(UserComparator5.selectedItemId);
					var9.packetBuffer.method6612(Player.selectedItemWidget);
					var9.packetBuffer.method6619(var3);
					var9.packetBuffer.method6600(class9.selectedItemSlot);
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
					var9 = class21.getPacketBufferNode(ClientPacket.field2599, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method6612(Decimator.selectedSpellWidget);
					var9.packetBuffer.method6600(Client.field788);
					var9.packetBuffer.method6600(var3);
					var9.packetBuffer.writeShort(Client.selectedSpellChildIndex);
					var9.packetBuffer.method6594(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
					var9 = class21.getPacketBufferNode(ClientPacket.field2624, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method6581(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.method6600(var3);
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
					var9 = class21.getPacketBufferNode(ClientPacket.field2670, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method6619(var3);
					var9.packetBuffer.method6581(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
					var9 = class21.getPacketBufferNode(ClientPacket.field2618, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method6600(var3);
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
					var9 = class21.getPacketBufferNode(ClientPacket.field2601, Client.packetWriter.isaacCipher);
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.method6619(var3);
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
					var9 = class21.getPacketBufferNode(ClientPacket.field2625, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method6594(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.method6602(var3);
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
						var9 = class21.getPacketBufferNode(ClientPacket.field2623, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeIntME(Player.selectedItemWidget);
						var9.packetBuffer.method6619(UserComparator5.selectedItemId);
						var9.packetBuffer.method6581(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
						var9.packetBuffer.method6619(class9.selectedItemSlot);
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
						var9 = class21.getPacketBufferNode(ClientPacket.field2615, Client.packetWriter.isaacCipher);
						var9.packetBuffer.method6619(Client.selectedSpellChildIndex);
						var9.packetBuffer.method6602(var3);
						var9.packetBuffer.method6611(Decimator.selectedSpellWidget);
						var9.packetBuffer.method6584(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
						var9.packetBuffer.method6602(Client.field788);
						Client.packetWriter.addNode(var9);
					}
				} else if (var2 == 16) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = class21.getPacketBufferNode(ClientPacket.field2577, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6600(class9.selectedItemSlot);
					var8.packetBuffer.method6619(var3);
					var8.packetBuffer.method6600(UserComparator5.selectedItemId);
					var8.packetBuffer.method6602(SoundSystem.baseY * 64 + var1);
					var8.packetBuffer.method6600(VertexNormal.baseX * 64 + var0);
					var8.packetBuffer.method6612(Player.selectedItemWidget);
					var8.packetBuffer.method6584(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 17) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = class21.getPacketBufferNode(ClientPacket.field2668, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6581(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method6611(Decimator.selectedSpellWidget);
					var8.packetBuffer.method6600(SoundSystem.baseY * 64 + var1);
					var8.packetBuffer.method6602(Client.field788);
					var8.packetBuffer.method6619(var3);
					var8.packetBuffer.writeShort(VertexNormal.baseX * 64 + var0);
					var8.packetBuffer.method6600(Client.selectedSpellChildIndex);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 18) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = class21.getPacketBufferNode(ClientPacket.field2666, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShort(var3);
					var8.packetBuffer.method6584(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method6602(SoundSystem.baseY * 64 + var1);
					var8.packetBuffer.writeShort(VertexNormal.baseX * 64 + var0);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 19) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = class21.getPacketBufferNode(ClientPacket.field2659, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6600(VertexNormal.baseX * 64 + var0);
					var8.packetBuffer.method6602(SoundSystem.baseY * 64 + var1);
					var8.packetBuffer.method6581(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method6600(var3);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 20) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = class21.getPacketBufferNode(ClientPacket.field2676, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6619(var3);
					var8.packetBuffer.method6600(VertexNormal.baseX * 64 + var0);
					var8.packetBuffer.method6584(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method6602(SoundSystem.baseY * 64 + var1);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 21) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = class21.getPacketBufferNode(ClientPacket.field2575, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6602(var3);
					var8.packetBuffer.writeShort(SoundSystem.baseY * 64 + var1);
					var8.packetBuffer.method6581(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.writeShort(VertexNormal.baseX * 64 + var0);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 22) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = class21.getPacketBufferNode(ClientPacket.field2649, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6602(var3);
					var8.packetBuffer.method6619(VertexNormal.baseX * 64 + var0);
					var8.packetBuffer.method6594(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method6619(SoundSystem.baseY * 64 + var1);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 23) {
					if (Client.isMenuOpen) {
						AbstractSocket.scene.setViewportWalking();
					} else {
						AbstractSocket.scene.menuOpen(class22.Client_plane, var0, var1, true);
					}
				} else {
					PacketBufferNode var11;
					Widget var16;
					if (var2 == 24) {
						var16 = Frames.getWidget(var1);
						boolean var12 = true;
						if (var16.contentType > 0) {
							var12 = SequenceDefinition.method3148(var16);
						}

						if (var12) {
							var11 = class21.getPacketBufferNode(ClientPacket.field2619, Client.packetWriter.isaacCipher);
							var11.packetBuffer.writeInt(var1);
							Client.packetWriter.addNode(var11);
						}
					} else {
						if (var2 == 25) {
							var16 = ModeWhere.getWidgetChild(var1, var0);
							if (var16 != null) {
								class5.Widget_runOnTargetLeave();
								LoginScreenAnimation.selectSpell(var1, var0, AttackOption.Widget_unpackTargetMask(class21.getWidgetFlags(var16)), var16.itemId);
								Client.isItemSelected = 0;
								Client.selectedSpellActionName = BoundaryObject.Widget_getSpellActionName(var16);
								if (Client.selectedSpellActionName == null) {
									Client.selectedSpellActionName = "null";
								}

								if (var16.isIf3) {
									Client.selectedSpellName = var16.dataText + class44.colorStartTag(16777215);
								} else {
									Client.selectedSpellName = class44.colorStartTag(65280) + var16.spellName + class44.colorStartTag(16777215);
								}
							}

							return;
						}

						if (var2 == 26) {
							class4.method47();
						} else {
							int var10;
							Widget var14;
							if (var2 == 28) {
								var8 = class21.getPacketBufferNode(ClientPacket.field2619, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeInt(var1);
								Client.packetWriter.addNode(var8);
								var14 = Frames.getWidget(var1);
								if (var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) {
									var10 = var14.cs1Instructions[0][1];
									Varps.Varps_main[var10] = 1 - Varps.Varps_main[var10];
									ApproximateRouteStrategy.changeGameOptions(var10);
								}
							} else if (var2 == 29) {
								var8 = class21.getPacketBufferNode(ClientPacket.field2619, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeInt(var1);
								Client.packetWriter.addNode(var8);
								var14 = Frames.getWidget(var1);
								if (var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) {
									var10 = var14.cs1Instructions[0][1];
									if (Varps.Varps_main[var10] != var14.cs1ComparisonValues[0]) {
										Varps.Varps_main[var10] = var14.cs1ComparisonValues[0];
										ApproximateRouteStrategy.changeGameOptions(var10);
									}
								}
							} else if (var2 == 30) {
								if (Client.meslayerContinueWidget == null) {
									class22.resumePauseWidget(var1, var0);
									Client.meslayerContinueWidget = ModeWhere.getWidgetChild(var1, var0);
									WorldMapCacheName.invalidateWidget(Client.meslayerContinueWidget);
								}
							} else if (var2 == 31) {
								var8 = class21.getPacketBufferNode(ClientPacket.field2631, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeInt(var1);
								var8.packetBuffer.writeIntME(Player.selectedItemWidget);
								var8.packetBuffer.method6619(var0);
								var8.packetBuffer.writeShort(var3);
								var8.packetBuffer.method6602(class9.selectedItemSlot);
								var8.packetBuffer.method6602(UserComparator5.selectedItemId);
								Client.packetWriter.addNode(var8);
								Client.field747 = 0;
								GrandExchangeEvents.field3626 = Frames.getWidget(var1);
								Client.field841 = var0;
							} else if (var2 == 32) {
								var8 = class21.getPacketBufferNode(ClientPacket.field2609, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method6612(Decimator.selectedSpellWidget);
								var8.packetBuffer.method6619(Client.selectedSpellChildIndex);
								var8.packetBuffer.method6612(var1);
								var8.packetBuffer.method6600(var3);
								var8.packetBuffer.method6619(var0);
								Client.packetWriter.addNode(var8);
								Client.field747 = 0;
								GrandExchangeEvents.field3626 = Frames.getWidget(var1);
								Client.field841 = var0;
							} else if (var2 == 33) {
								var8 = class21.getPacketBufferNode(ClientPacket.field2585, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method6612(var1);
								var8.packetBuffer.method6600(var0);
								var8.packetBuffer.writeShort(var3);
								Client.packetWriter.addNode(var8);
								Client.field747 = 0;
								GrandExchangeEvents.field3626 = Frames.getWidget(var1);
								Client.field841 = var0;
							} else if (var2 == 34) {
								var8 = class21.getPacketBufferNode(ClientPacket.field2576, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeIntME(var1);
								var8.packetBuffer.method6600(var0);
								var8.packetBuffer.method6600(var3);
								Client.packetWriter.addNode(var8);
								Client.field747 = 0;
								GrandExchangeEvents.field3626 = Frames.getWidget(var1);
								Client.field841 = var0;
							} else if (var2 == 35) {
								var8 = class21.getPacketBufferNode(ClientPacket.field2627, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeShort(var3);
								var8.packetBuffer.method6612(var1);
								var8.packetBuffer.method6602(var0);
								Client.packetWriter.addNode(var8);
								Client.field747 = 0;
								GrandExchangeEvents.field3626 = Frames.getWidget(var1);
								Client.field841 = var0;
							} else if (var2 == 36) {
								var8 = class21.getPacketBufferNode(ClientPacket.field2661, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method6611(var1);
								var8.packetBuffer.method6600(var3);
								var8.packetBuffer.method6602(var0);
								Client.packetWriter.addNode(var8);
								Client.field747 = 0;
								GrandExchangeEvents.field3626 = Frames.getWidget(var1);
								Client.field841 = var0;
							} else if (var2 == 37) {
								var8 = class21.getPacketBufferNode(ClientPacket.field2673, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeIntME(var1);
								var8.packetBuffer.method6602(var0);
								var8.packetBuffer.writeShort(var3);
								Client.packetWriter.addNode(var8);
								Client.field747 = 0;
								GrandExchangeEvents.field3626 = Frames.getWidget(var1);
								Client.field841 = var0;
							} else {
								if (var2 == 38) {
									class5.Widget_runOnTargetLeave();
									var16 = Frames.getWidget(var1);
									Client.isItemSelected = 1;
									class9.selectedItemSlot = var0;
									Player.selectedItemWidget = var1;
									UserComparator5.selectedItemId = var3;
									WorldMapCacheName.invalidateWidget(var16);
									Client.selectedItemName = class44.colorStartTag(16748608) + class260.ItemDefinition_get(var3).name + class44.colorStartTag(16777215);
									if (Client.selectedItemName == null) {
										Client.selectedItemName = "null";
									}

									return;
								}

								if (var2 == 39) {
									var8 = class21.getPacketBufferNode(ClientPacket.field2581, Client.packetWriter.isaacCipher);
									var8.packetBuffer.method6602(var0);
									var8.packetBuffer.method6600(var3);
									var8.packetBuffer.method6611(var1);
									Client.packetWriter.addNode(var8);
									Client.field747 = 0;
									GrandExchangeEvents.field3626 = Frames.getWidget(var1);
									Client.field841 = var0;
								} else if (var2 == 40) {
									var8 = class21.getPacketBufferNode(ClientPacket.field2579, Client.packetWriter.isaacCipher);
									var8.packetBuffer.method6600(var0);
									var8.packetBuffer.writeIntME(var1);
									var8.packetBuffer.method6619(var3);
									Client.packetWriter.addNode(var8);
									Client.field747 = 0;
									GrandExchangeEvents.field3626 = Frames.getWidget(var1);
									Client.field841 = var0;
								} else if (var2 == 41) {
									var8 = class21.getPacketBufferNode(ClientPacket.field2639, Client.packetWriter.isaacCipher);
									var8.packetBuffer.method6600(var3);
									var8.packetBuffer.method6619(var0);
									var8.packetBuffer.writeIntME(var1);
									Client.packetWriter.addNode(var8);
									Client.field747 = 0;
									GrandExchangeEvents.field3626 = Frames.getWidget(var1);
									Client.field841 = var0;
								} else if (var2 == 42) {
									var8 = class21.getPacketBufferNode(ClientPacket.field2635, Client.packetWriter.isaacCipher);
									var8.packetBuffer.method6612(var1);
									var8.packetBuffer.writeShort(var3);
									var8.packetBuffer.method6619(var0);
									Client.packetWriter.addNode(var8);
									Client.field747 = 0;
									GrandExchangeEvents.field3626 = Frames.getWidget(var1);
									Client.field841 = var0;
								} else if (var2 == 43) {
									var8 = class21.getPacketBufferNode(ClientPacket.field2633, Client.packetWriter.isaacCipher);
									var8.packetBuffer.method6619(var3);
									var8.packetBuffer.method6602(var0);
									var8.packetBuffer.method6611(var1);
									Client.packetWriter.addNode(var8);
									Client.field747 = 0;
									GrandExchangeEvents.field3626 = Frames.getWidget(var1);
									Client.field841 = var0;
								} else if (var2 == 44) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = class21.getPacketBufferNode(ClientPacket.field2597, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method6619(var3);
										var9.packetBuffer.method6584(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
										var9 = class21.getPacketBufferNode(ClientPacket.field2654, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method6600(var3);
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
										var9 = class21.getPacketBufferNode(ClientPacket.field2637, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method6584(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
										var9 = class21.getPacketBufferNode(ClientPacket.field2605, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method6619(var3);
										var9.packetBuffer.method6584(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
										var9 = class21.getPacketBufferNode(ClientPacket.field2602, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method6602(var3);
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
										var9 = class21.getPacketBufferNode(ClientPacket.field2636, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method6581(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.method6602(var3);
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
										var9 = class21.getPacketBufferNode(ClientPacket.field2620, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.method6602(var3);
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
										var9 = class21.getPacketBufferNode(ClientPacket.field2656, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeShort(var3);
										var9.packetBuffer.method6594(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										Client.packetWriter.addNode(var9);
									}
								} else {
									label642: {
										if (var2 != 57) {
											if (var2 == 58) {
												var16 = ModeWhere.getWidgetChild(var1, var0);
												if (var16 != null) {
													var9 = class21.getPacketBufferNode(ClientPacket.field2598, Client.packetWriter.isaacCipher);
													var9.packetBuffer.writeIntME(var1);
													var9.packetBuffer.method6619(var16.itemId);
													var9.packetBuffer.method6600(Client.field788);
													var9.packetBuffer.writeInt(Decimator.selectedSpellWidget);
													var9.packetBuffer.method6619(Client.selectedSpellChildIndex);
													var9.packetBuffer.method6600(var0);
													Client.packetWriter.addNode(var9);
												}
												break label642;
											}

											if (var2 == 1001) {
												Client.mouseCrossX = var6;
												Client.mouseCrossY = var7;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												Client.destinationX = var0;
												Client.destinationY = var1;
												var8 = class21.getPacketBufferNode(ClientPacket.field2640, Client.packetWriter.isaacCipher);
												var8.packetBuffer.method6602(VertexNormal.baseX * 64 + var0);
												var8.packetBuffer.method6594(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
												var8.packetBuffer.writeShort(var3);
												var8.packetBuffer.method6602(SoundSystem.baseY * 64 + var1);
												Client.packetWriter.addNode(var8);
												break label642;
											}

											if (var2 == 1002) {
												Client.mouseCrossX = var6;
												Client.mouseCrossY = var7;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												var8 = class21.getPacketBufferNode(ClientPacket.field2591, Client.packetWriter.isaacCipher);
												var8.packetBuffer.method6600(var3);
												Client.packetWriter.addNode(var8);
												break label642;
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
														var11 = class21.getPacketBufferNode(ClientPacket.field2578, Client.packetWriter.isaacCipher);
														var11.packetBuffer.method6600(var17.id);
														Client.packetWriter.addNode(var11);
													}
												}
												break label642;
											}

											if (var2 == 1004) {
												Client.mouseCrossX = var6;
												Client.mouseCrossY = var7;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												var8 = class21.getPacketBufferNode(ClientPacket.field2646, Client.packetWriter.isaacCipher);
												var8.packetBuffer.method6600(var3);
												Client.packetWriter.addNode(var8);
												break label642;
											}

											if (var2 == 1005) {
												var16 = Frames.getWidget(var1);
												if (var16 != null && var16.itemQuantities[var0] >= 100000) {
													World.addGameMessage(27, "", var16.itemQuantities[var0] + " x " + class260.ItemDefinition_get(var3).name);
												} else {
													var9 = class21.getPacketBufferNode(ClientPacket.field2646, Client.packetWriter.isaacCipher);
													var9.packetBuffer.method6600(var3);
													Client.packetWriter.addNode(var9);
												}

												Client.field747 = 0;
												GrandExchangeEvents.field3626 = Frames.getWidget(var1);
												Client.field841 = var0;
												break label642;
											}

											if (var2 != 1007) {
												if (var2 == 1008 || var2 == 1011 || var2 == 1009 || var2 == 1010 || var2 == 1012) {
													class243.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1));
												}
												break label642;
											}
										}

										var16 = ModeWhere.getWidgetChild(var1, var0);
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
			WorldMapCacheName.invalidateWidget(Frames.getWidget(Player.selectedItemWidget));
		}

		if (Client.isSpellSelected) {
			class5.Widget_runOnTargetLeave();
		}

		if (GrandExchangeEvents.field3626 != null && Client.field747 == 0) {
			WorldMapCacheName.invalidateWidget(GrandExchangeEvents.field3626);
		}

	}

	@ObfuscatedName("lv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2124366444"
	)
	static void method1999() {
		if (Client.oculusOrbState == 1) {
			Client.field724 = true;
		}

	}
}
