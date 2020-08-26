import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bm")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
	SecureRandomCallable() {
	}

	public Object call() {
		return BoundaryObject.method3387();
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(IIB)Lhq;",
		garbageValue = "105"
	)
	@Export("getWidgetChild")
	public static Widget getWidgetChild(int var0, int var1) {
		Widget var2 = TileItem.getWidget(var0);
		if (var1 == -1) {
			return var2;
		} else {
			return var2 != null && var2.children != null && var1 < var2.children.length ? var2.children[var1] : null;
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "2101058473"
	)
	static void method1204(int var0, int var1) {
		long var2 = (long)((var0 << 16) + var1);
		NetFileRequest var4 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var2);
		if (var4 != null) {
			NetCache.NetCache_pendingWritesQueue.addLast(var4);
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "(ILcy;ZI)I",
		garbageValue = "207665946"
	)
	static int method1200(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = TileItem.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
		} else {
			var3 = var2 ? Canvas.field438 : class3.field12;
		}

		String var4 = Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize];
		int[] var5 = null;
		if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
			int var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			if (var6 > 0) {
				for (var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]) {
				}
			}

			var4 = var4.substring(0, var4.length() - 1);
		}

		Object[] var8 = new Object[var4.length() + 1];

		int var7;
		for (var7 = var8.length - 1; var7 >= 1; --var7) {
			if (var4.charAt(var7 - 1) == 's') {
				var8[var7] = Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize];
			} else {
				var8[var7] = new Integer(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
			}
		}

		var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
		if (var7 != -1) {
			var8[0] = new Integer(var7);
		} else {
			var8 = null;
		}

		if (var0 == ScriptOpcodes.CC_SETONCLICK) {
			var3.onClick = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONHOLD) {
			var3.onHold = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONRELEASE) {
			var3.onRelease = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEOVER) {
			var3.onMouseOver = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSELEAVE) {
			var3.onMouseLeave = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAG) {
			var3.onDrag = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETLEAVE) {
			var3.onTargetLeave = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONVARTRANSMIT) {
			var3.onVarTransmit = var8;
			var3.varTransmitTriggers = var5;
		} else if (var0 == ScriptOpcodes.CC_SETONTIMER) {
			var3.onTimer = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONOP) {
			var3.onOp = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAGCOMPLETE) {
			var3.onDragComplete = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLICKREPEAT) {
			var3.onClickRepeat = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEREPEAT) {
			var3.onMouseRepeat = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONINVTRANSMIT) {
			var3.onInvTransmit = var8;
			var3.invTransmitTriggers = var5;
		} else if (var0 == ScriptOpcodes.CC_SETONSTATTRANSMIT) {
			var3.onStatTransmit = var8;
			var3.statTransmitTriggers = var5;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETENTER) {
			var3.onTargetEnter = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSCROLLWHEEL) {
			var3.onScroll = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCHATTRANSMIT) {
			var3.onChatTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONKEY) {
			var3.onKey = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONFRIENDTRANSMIT) {
			var3.onFriendTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANTRANSMIT) {
			var3.onClanTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMISCTRANSMIT) {
			var3.onMiscTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDIALOGABORT) {
			var3.onDialogAbort = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSUBCHANGE) {
			var3.onSubChange = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSTOCKTRANSMIT) {
			var3.onStockTransmit = var8;
		} else if (var0 == 1426) {
			var3.field2722 = var8;
		} else {
			if (var0 != ScriptOpcodes.CC_SETONRESIZE) {
				return 2;
			}

			var3.onResize = var8;
		}

		var3.hasListener = true;
		return 1;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "19136770"
	)
	public static void method1203() {
		Widget.Widget_cachedSprites.clear();
		Widget.Widget_cachedModels.clear();
		Widget.Widget_cachedFonts.clear();
		Widget.Widget_cachedSpriteMasks.clear();
	}

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		signature = "(IIIILjava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "-990196444"
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
			var8 = Client.getPacketBufferNode(ClientPacket.field2292, Client.packetWriter.isaacCipher);
			var8.packetBuffer.writeShort(var3);
			var8.packetBuffer.method5665(GrandExchangeOfferUnitPriceComparator.selectedItemSlot);
			var8.packetBuffer.method5645(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.writeShort(WorldMapLabel.baseY * 64 + var1);
			var8.packetBuffer.method5663(class105.selectedItemWidget);
			var8.packetBuffer.method5665(WorldMapManager.baseX * 64 + var0);
			var8.packetBuffer.method5665(Script.selectedItemId);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 2) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = Client.getPacketBufferNode(ClientPacket.field2303, Client.packetWriter.isaacCipher);
			var8.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method5654(WorldMapLabel.baseY * 64 + var1);
			var8.packetBuffer.method5653(WorldMapManager.baseX * 64 + var0);
			var8.packetBuffer.method5654(var3);
			var8.packetBuffer.method5663(class232.selectedSpellWidget);
			var8.packetBuffer.writeShort(Client.selectedSpellChildIndex);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 3) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = Client.getPacketBufferNode(ClientPacket.field2328, Client.packetWriter.isaacCipher);
			var8.packetBuffer.writeShort(WorldMapLabel.baseY * 64 + var1);
			var8.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method5665(WorldMapManager.baseX * 64 + var0);
			var8.packetBuffer.method5653(var3);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 4) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = Client.getPacketBufferNode(ClientPacket.field2281, Client.packetWriter.isaacCipher);
			var8.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method5654(var3);
			var8.packetBuffer.method5654(WorldMapManager.baseX * 64 + var0);
			var8.packetBuffer.method5665(WorldMapLabel.baseY * 64 + var1);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 5) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = Client.getPacketBufferNode(ClientPacket.field2323, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method5665(WorldMapLabel.baseY * 64 + var1);
			var8.packetBuffer.method5644(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method5653(var3);
			var8.packetBuffer.method5653(WorldMapManager.baseX * 64 + var0);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 6) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = Client.getPacketBufferNode(ClientPacket.field2282, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method5654(WorldMapLabel.baseY * 64 + var1);
			var8.packetBuffer.method5665(var3);
			var8.packetBuffer.method5653(WorldMapManager.baseX * 64 + var0);
			var8.packetBuffer.method5644(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
					var9 = Client.getPacketBufferNode(ClientPacket.field2285, Client.packetWriter.isaacCipher);
					var9.packetBuffer.writeShort(var3);
					var9.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.writeInt(class105.selectedItemWidget);
					var9.packetBuffer.writeShort(GrandExchangeOfferUnitPriceComparator.selectedItemSlot);
					var9.packetBuffer.writeShort(Script.selectedItemId);
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
					var9 = Client.getPacketBufferNode(ClientPacket.field2294, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method5669(class232.selectedSpellWidget);
					var9.packetBuffer.writeShort(var3);
					var9.packetBuffer.method5653(Client.selectedSpellChildIndex);
					var9.packetBuffer.method5644(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
					var9 = Client.getPacketBufferNode(ClientPacket.field2279, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method5645(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.method5653(var3);
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
					var9 = Client.getPacketBufferNode(ClientPacket.field2280, Client.packetWriter.isaacCipher);
					var9.packetBuffer.writeShort(var3);
					var9.packetBuffer.method5645(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
					var9 = Client.getPacketBufferNode(ClientPacket.field2270, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method5645(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.method5654(var3);
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
					var9 = Client.getPacketBufferNode(ClientPacket.field2272, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method5665(var3);
					var9.packetBuffer.method5644(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
					var9 = Client.getPacketBufferNode(ClientPacket.field2347, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method5665(var3);
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
						var9 = Client.getPacketBufferNode(ClientPacket.field2302, Client.packetWriter.isaacCipher);
						var9.packetBuffer.method5653(GrandExchangeOfferUnitPriceComparator.selectedItemSlot);
						var9.packetBuffer.writeShort(Script.selectedItemId);
						var9.packetBuffer.method5654(var3);
						var9.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
						var9.packetBuffer.writeInt(class105.selectedItemWidget);
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
						var9 = Client.getPacketBufferNode(ClientPacket.field2301, Client.packetWriter.isaacCipher);
						var9.packetBuffer.method5663(class232.selectedSpellWidget);
						var9.packetBuffer.method5644(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
						var9.packetBuffer.method5654(var3);
						var9.packetBuffer.method5654(Client.selectedSpellChildIndex);
						Client.packetWriter.addNode(var9);
					}
				} else if (var2 == 16) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = Client.getPacketBufferNode(ClientPacket.field2348, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShort(WorldMapLabel.baseY * 64 + var1);
					var8.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method5653(Script.selectedItemId);
					var8.packetBuffer.writeShort(var3);
					var8.packetBuffer.method5654(GrandExchangeOfferUnitPriceComparator.selectedItemSlot);
					var8.packetBuffer.writeInt(class105.selectedItemWidget);
					var8.packetBuffer.writeShort(WorldMapManager.baseX * 64 + var0);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 17) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = Client.getPacketBufferNode(ClientPacket.field2325, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method5669(class232.selectedSpellWidget);
					var8.packetBuffer.method5653(WorldMapLabel.baseY * 64 + var1);
					var8.packetBuffer.method5665(Client.selectedSpellChildIndex);
					var8.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.writeShort(var3);
					var8.packetBuffer.method5653(WorldMapManager.baseX * 64 + var0);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 18) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = Client.getPacketBufferNode(ClientPacket.field2252, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method5653(var3);
					var8.packetBuffer.method5665(WorldMapLabel.baseY * 64 + var1);
					var8.packetBuffer.method5654(WorldMapManager.baseX * 64 + var0);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 19) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = Client.getPacketBufferNode(ClientPacket.field2346, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShort(var3);
					var8.packetBuffer.method5654(WorldMapManager.baseX * 64 + var0);
					var8.packetBuffer.method5654(WorldMapLabel.baseY * 64 + var1);
					var8.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 20) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = Client.getPacketBufferNode(ClientPacket.field2248, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method5654(var3);
					var8.packetBuffer.method5654(WorldMapLabel.baseY * 64 + var1);
					var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method5665(WorldMapManager.baseX * 64 + var0);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 21) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = Client.getPacketBufferNode(ClientPacket.field2310, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method5644(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method5654(var3);
					var8.packetBuffer.method5654(WorldMapLabel.baseY * 64 + var1);
					var8.packetBuffer.method5653(WorldMapManager.baseX * 64 + var0);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 22) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = Client.getPacketBufferNode(ClientPacket.field2287, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method5653(var3);
					var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method5665(WorldMapLabel.baseY * 64 + var1);
					var8.packetBuffer.method5665(WorldMapManager.baseX * 64 + var0);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 23) {
					if (Client.isMenuOpen) {
						ScriptEvent.scene.setViewportWalking();
					} else {
						ScriptEvent.scene.menuOpen(Huffman.Client_plane, var0, var1, true);
					}
				} else {
					PacketBufferNode var11;
					Widget var16;
					if (var2 == 24) {
						var16 = TileItem.getWidget(var1);
						boolean var12 = true;
						if (var16.contentType > 0) {
							var12 = class4.method60(var16);
						}

						if (var12) {
							var11 = Client.getPacketBufferNode(ClientPacket.field2334, Client.packetWriter.isaacCipher);
							var11.packetBuffer.writeInt(var1);
							Client.packetWriter.addNode(var11);
						}
					} else {
						if (var2 == 25) {
							var16 = getWidgetChild(var1, var0);
							if (var16 != null) {
								class22.Widget_runOnTargetLeave();
								Nameable.selectSpell(var1, var0, GrandExchangeOfferTotalQuantityComparator.method176(WorldMapIcon_0.getWidgetClickMask(var16)), var16.itemId);
								Client.isItemSelected = 0;
								Client.selectedSpellActionName = SpriteMask.method4059(var16);
								if (Client.selectedSpellActionName == null) {
									Client.selectedSpellActionName = "null";
								}

								if (var16.isIf3) {
									Client.selectedSpellName = var16.dataText + WorldMapAreaData.colorStartTag(16777215);
								} else {
									Client.selectedSpellName = WorldMapAreaData.colorStartTag(65280) + var16.spellName + WorldMapAreaData.colorStartTag(16777215);
								}
							}

							return;
						}

						if (var2 == 26) {
							ItemContainer.method1213();
						} else {
							int var10;
							Widget var14;
							if (var2 == 28) {
								var8 = Client.getPacketBufferNode(ClientPacket.field2334, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeInt(var1);
								Client.packetWriter.addNode(var8);
								var14 = TileItem.getWidget(var1);
								if (var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) {
									var10 = var14.cs1Instructions[0][1];
									Varps.Varps_main[var10] = 1 - Varps.Varps_main[var10];
									Clock.changeGameOptions(var10);
								}
							} else if (var2 == 29) {
								var8 = Client.getPacketBufferNode(ClientPacket.field2334, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeInt(var1);
								Client.packetWriter.addNode(var8);
								var14 = TileItem.getWidget(var1);
								if (var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) {
									var10 = var14.cs1Instructions[0][1];
									if (Varps.Varps_main[var10] != var14.cs1ComparisonValues[0]) {
										Varps.Varps_main[var10] = var14.cs1ComparisonValues[0];
										Clock.changeGameOptions(var10);
									}
								}
							} else if (var2 == 30) {
								if (Client.meslayerContinueWidget == null) {
									AbstractSocket.resumePauseWidget(var1, var0);
									Client.meslayerContinueWidget = getWidgetChild(var1, var0);
									class52.invalidateWidget(Client.meslayerContinueWidget);
								}
							} else if (var2 == 31) {
								var8 = Client.getPacketBufferNode(ClientPacket.field2254, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method5654(var3);
								var8.packetBuffer.method5669(class105.selectedItemWidget);
								var8.packetBuffer.method5665(var0);
								var8.packetBuffer.method5665(Script.selectedItemId);
								var8.packetBuffer.method5669(var1);
								var8.packetBuffer.writeShort(GrandExchangeOfferUnitPriceComparator.selectedItemSlot);
								Client.packetWriter.addNode(var8);
								Client.field782 = 0;
								GrandExchangeEvent.field79 = TileItem.getWidget(var1);
								Client.field944 = var0;
							} else if (var2 == 32) {
								var8 = Client.getPacketBufferNode(ClientPacket.field2335, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method5653(var3);
								var8.packetBuffer.method5669(class232.selectedSpellWidget);
								var8.packetBuffer.method5653(Client.selectedSpellChildIndex);
								var8.packetBuffer.writeInt(var1);
								var8.packetBuffer.writeShort(var0);
								Client.packetWriter.addNode(var8);
								Client.field782 = 0;
								GrandExchangeEvent.field79 = TileItem.getWidget(var1);
								Client.field944 = var0;
							} else if (var2 == 33) {
								var8 = Client.getPacketBufferNode(ClientPacket.field2261, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method5665(var0);
								var8.packetBuffer.method5653(var3);
								var8.packetBuffer.method5669(var1);
								Client.packetWriter.addNode(var8);
								Client.field782 = 0;
								GrandExchangeEvent.field79 = TileItem.getWidget(var1);
								Client.field944 = var0;
							} else if (var2 == 34) {
								var8 = Client.getPacketBufferNode(ClientPacket.field2304, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method5662(var1);
								var8.packetBuffer.method5653(var0);
								var8.packetBuffer.method5654(var3);
								Client.packetWriter.addNode(var8);
								Client.field782 = 0;
								GrandExchangeEvent.field79 = TileItem.getWidget(var1);
								Client.field944 = var0;
							} else if (var2 == 35) {
								var8 = Client.getPacketBufferNode(ClientPacket.field2305, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method5654(var3);
								var8.packetBuffer.method5669(var1);
								var8.packetBuffer.method5653(var0);
								Client.packetWriter.addNode(var8);
								Client.field782 = 0;
								GrandExchangeEvent.field79 = TileItem.getWidget(var1);
								Client.field944 = var0;
							} else if (var2 == 36) {
								var8 = Client.getPacketBufferNode(ClientPacket.field2263, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeShort(var0);
								var8.packetBuffer.writeShort(var3);
								var8.packetBuffer.method5663(var1);
								Client.packetWriter.addNode(var8);
								Client.field782 = 0;
								GrandExchangeEvent.field79 = TileItem.getWidget(var1);
								Client.field944 = var0;
							} else if (var2 == 37) {
								var8 = Client.getPacketBufferNode(ClientPacket.field2331, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method5653(var3);
								var8.packetBuffer.writeShort(var0);
								var8.packetBuffer.method5669(var1);
								Client.packetWriter.addNode(var8);
								Client.field782 = 0;
								GrandExchangeEvent.field79 = TileItem.getWidget(var1);
								Client.field944 = var0;
							} else {
								if (var2 == 38) {
									class22.Widget_runOnTargetLeave();
									var16 = TileItem.getWidget(var1);
									Client.isItemSelected = 1;
									GrandExchangeOfferUnitPriceComparator.selectedItemSlot = var0;
									class105.selectedItemWidget = var1;
									Script.selectedItemId = var3;
									class52.invalidateWidget(var16);
									Client.selectedItemName = WorldMapAreaData.colorStartTag(16748608) + GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var3).name + WorldMapAreaData.colorStartTag(16777215);
									if (Client.selectedItemName == null) {
										Client.selectedItemName = "null";
									}

									return;
								}

								if (var2 == 39) {
									var8 = Client.getPacketBufferNode(ClientPacket.field2277, Client.packetWriter.isaacCipher);
									var8.packetBuffer.writeInt(var1);
									var8.packetBuffer.method5654(var0);
									var8.packetBuffer.method5654(var3);
									Client.packetWriter.addNode(var8);
									Client.field782 = 0;
									GrandExchangeEvent.field79 = TileItem.getWidget(var1);
									Client.field944 = var0;
								} else if (var2 == 40) {
									var8 = Client.getPacketBufferNode(ClientPacket.field2313, Client.packetWriter.isaacCipher);
									var8.packetBuffer.method5653(var0);
									var8.packetBuffer.method5653(var3);
									var8.packetBuffer.method5663(var1);
									Client.packetWriter.addNode(var8);
									Client.field782 = 0;
									GrandExchangeEvent.field79 = TileItem.getWidget(var1);
									Client.field944 = var0;
								} else if (var2 == 41) {
									var8 = Client.getPacketBufferNode(ClientPacket.field2340, Client.packetWriter.isaacCipher);
									var8.packetBuffer.method5669(var1);
									var8.packetBuffer.writeShort(var3);
									var8.packetBuffer.writeShort(var0);
									Client.packetWriter.addNode(var8);
									Client.field782 = 0;
									GrandExchangeEvent.field79 = TileItem.getWidget(var1);
									Client.field944 = var0;
								} else if (var2 == 42) {
									var8 = Client.getPacketBufferNode(ClientPacket.field2337, Client.packetWriter.isaacCipher);
									var8.packetBuffer.method5665(var3);
									var8.packetBuffer.writeShort(var0);
									var8.packetBuffer.method5662(var1);
									Client.packetWriter.addNode(var8);
									Client.field782 = 0;
									GrandExchangeEvent.field79 = TileItem.getWidget(var1);
									Client.field944 = var0;
								} else if (var2 == 43) {
									var8 = Client.getPacketBufferNode(ClientPacket.field2314, Client.packetWriter.isaacCipher);
									var8.packetBuffer.method5653(var0);
									var8.packetBuffer.method5654(var3);
									var8.packetBuffer.method5663(var1);
									Client.packetWriter.addNode(var8);
									Client.field782 = 0;
									GrandExchangeEvent.field79 = TileItem.getWidget(var1);
									Client.field944 = var0;
								} else if (var2 == 44) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = Client.getPacketBufferNode(ClientPacket.field2320, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method5665(var3);
										var9.packetBuffer.method5644(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
										var9 = Client.getPacketBufferNode(ClientPacket.field2265, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.method5665(var3);
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
										var9 = Client.getPacketBufferNode(ClientPacket.field2333, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method5654(var3);
										var9.packetBuffer.method5645(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
										var9 = Client.getPacketBufferNode(ClientPacket.field2246, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method5653(var3);
										var9.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
										var9 = Client.getPacketBufferNode(ClientPacket.field2297, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method5645(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.method5665(var3);
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
										var9 = Client.getPacketBufferNode(ClientPacket.field2274, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method5665(var3);
										var9.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
										var9 = Client.getPacketBufferNode(ClientPacket.field2343, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.method5654(var3);
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
										var9 = Client.getPacketBufferNode(ClientPacket.field2321, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method5644(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.writeShort(var3);
										Client.packetWriter.addNode(var9);
									}
								} else {
									label725: {
										if (var2 != 57) {
											if (var2 == 58) {
												var16 = getWidgetChild(var1, var0);
												if (var16 != null) {
													var9 = Client.getPacketBufferNode(ClientPacket.field2275, Client.packetWriter.isaacCipher);
													var9.packetBuffer.method5662(class232.selectedSpellWidget);
													var9.packetBuffer.method5665(Client.selectedSpellChildIndex);
													var9.packetBuffer.method5654(var16.itemId);
													var9.packetBuffer.method5669(var1);
													var9.packetBuffer.method5665(Client.field834);
													var9.packetBuffer.method5653(var0);
													Client.packetWriter.addNode(var9);
												}
												break label725;
											}

											if (var2 == 1001) {
												Client.mouseCrossX = var6;
												Client.mouseCrossY = var7;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												Client.destinationX = var0;
												Client.destinationY = var1;
												var8 = Client.getPacketBufferNode(ClientPacket.field2260, Client.packetWriter.isaacCipher);
												var8.packetBuffer.method5654(WorldMapLabel.baseY * 64 + var1);
												var8.packetBuffer.method5654(WorldMapManager.baseX * 64 + var0);
												var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
												var8.packetBuffer.method5665(var3);
												Client.packetWriter.addNode(var8);
												break label725;
											}

											if (var2 == 1002) {
												Client.mouseCrossX = var6;
												Client.mouseCrossY = var7;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												var8 = Client.getPacketBufferNode(ClientPacket.field2293, Client.packetWriter.isaacCipher);
												var8.packetBuffer.method5653(var3);
												Client.packetWriter.addNode(var8);
												break label725;
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
														var11 = Client.getPacketBufferNode(ClientPacket.field2311, Client.packetWriter.isaacCipher);
														var11.packetBuffer.method5654(var17.id);
														Client.packetWriter.addNode(var11);
													}
												}
												break label725;
											}

											if (var2 == 1004) {
												Client.mouseCrossX = var6;
												Client.mouseCrossY = var7;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												var8 = Client.getPacketBufferNode(ClientPacket.field2326, Client.packetWriter.isaacCipher);
												var8.packetBuffer.method5654(var3);
												Client.packetWriter.addNode(var8);
												break label725;
											}

											if (var2 == 1005) {
												var16 = TileItem.getWidget(var1);
												if (var16 != null && var16.itemQuantities[var0] >= 100000) {
													WorldMapRectangle.addGameMessage(27, "", var16.itemQuantities[var0] + " x " + GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var3).name);
												} else {
													var9 = Client.getPacketBufferNode(ClientPacket.field2326, Client.packetWriter.isaacCipher);
													var9.packetBuffer.method5654(var3);
													Client.packetWriter.addNode(var9);
												}

												Client.field782 = 0;
												GrandExchangeEvent.field79 = TileItem.getWidget(var1);
												Client.field944 = var0;
												break label725;
											}

											if (var2 != 1007) {
												if (var2 == 1010 || var2 == 1008 || var2 == 1011 || var2 == 1009 || var2 == 1012) {
													Message.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1));
												}
												break label725;
											}
										}

										var16 = getWidgetChild(var1, var0);
										if (var16 != null) {
											UserComparator8.widgetDefaultMenuAction(var3, var1, var0, var16.itemId, var5);
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
			class52.invalidateWidget(TileItem.getWidget(class105.selectedItemWidget));
		}

		if (Client.isSpellSelected) {
			class22.Widget_runOnTargetLeave();
		}

		if (GrandExchangeEvent.field79 != null && Client.field782 == 0) {
			class52.invalidateWidget(GrandExchangeEvent.field79);
		}

	}

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "460315375"
	)
	static String method1202(String var0) {
		PlayerType[] var1 = ApproximateRouteStrategy.PlayerType_values();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			PlayerType var3 = var1[var2];
			if (var3.modIcon != -1 && var0.startsWith(WorldMapScaleHandler.method824(var3.modIcon))) {
				var0 = var0.substring(6 + Integer.toString(var3.modIcon).length());
				break;
			}
		}

		return var0;
	}
}
