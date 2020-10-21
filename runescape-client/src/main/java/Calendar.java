import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hn")
@Implements("Calendar")
public class Calendar {
	@ObfuscatedName("f")
	@Export("MONTH_NAMES_ENGLISH_GERMAN")
	public static final String[][] MONTH_NAMES_ENGLISH_GERMAN;
	@ObfuscatedName("b")
	@Export("DAYS_OF_THE_WEEK")
	public static final String[] DAYS_OF_THE_WEEK;
	@ObfuscatedName("l")
	@Export("Calendar_calendar")
	public static java.util.Calendar Calendar_calendar;

	static {
		MONTH_NAMES_ENGLISH_GERMAN = new String[][]{{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"}, {"jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc"}, {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"}, {"jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec"}, {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic"}};
		DAYS_OF_THE_WEEK = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
		java.util.Calendar.getInstance();
		Calendar_calendar = java.util.Calendar.getInstance(TimeZone.getTimeZone("GMT"));
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		signature = "(IIIILjava/lang/String;Ljava/lang/String;IIB)V",
		garbageValue = "-63"
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
			var8 = class4.getPacketBufferNode(ClientPacket.field2293, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method5674(FloorDecoration.baseX * 64 + var0);
			var8.packetBuffer.method5684(SpotAnimationDefinition.selectedItemWidget);
			var8.packetBuffer.method5673(Renderable.selectedItemId);
			var8.packetBuffer.method5664(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method5672(InvDefinition.selectedItemSlot);
			var8.packetBuffer.method5674(var3);
			var8.packetBuffer.method5672(WorldMapData_0.baseY * 64 + var1);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 2) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = class4.getPacketBufferNode(ClientPacket.field2282, Client.packetWriter.isaacCipher);
			var8.packetBuffer.writeShort(WorldMapData_0.baseY * 64 + var1);
			var8.packetBuffer.method5683(class307.selectedSpellWidget);
			var8.packetBuffer.method5674(Client.selectedSpellChildIndex);
			var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.writeShort(FloorDecoration.baseX * 64 + var0);
			var8.packetBuffer.method5674(var3);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 3) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = class4.getPacketBufferNode(ClientPacket.field2249, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method5673(FloorDecoration.baseX * 64 + var0);
			var8.packetBuffer.method5674(var3);
			var8.packetBuffer.writeShort(WorldMapData_0.baseY * 64 + var1);
			var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 4) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = class4.getPacketBufferNode(ClientPacket.field2301, Client.packetWriter.isaacCipher);
			var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method5672(FloorDecoration.baseX * 64 + var0);
			var8.packetBuffer.method5674(var3);
			var8.packetBuffer.writeShort(WorldMapData_0.baseY * 64 + var1);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 5) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = class4.getPacketBufferNode(ClientPacket.field2306, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method5674(FloorDecoration.baseX * 64 + var0);
			var8.packetBuffer.method5663(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.writeShort(WorldMapData_0.baseY * 64 + var1);
			var8.packetBuffer.method5674(var3);
			Client.packetWriter.addNode(var8);
		} else if (var2 == 6) {
			Client.mouseCrossX = var6;
			Client.mouseCrossY = var7;
			Client.mouseCrossColor = 2;
			Client.mouseCrossState = 0;
			Client.destinationX = var0;
			Client.destinationY = var1;
			var8 = class4.getPacketBufferNode(ClientPacket.field2265, Client.packetWriter.isaacCipher);
			var8.packetBuffer.method5674(WorldMapData_0.baseY * 64 + var1);
			var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
			var8.packetBuffer.method5674(var3);
			var8.packetBuffer.method5674(FloorDecoration.baseX * 64 + var0);
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
					var9 = class4.getPacketBufferNode(ClientPacket.field2332, Client.packetWriter.isaacCipher);
					var9.packetBuffer.writeInt(SpotAnimationDefinition.selectedItemWidget);
					var9.packetBuffer.writeShort(var3);
					var9.packetBuffer.method5672(InvDefinition.selectedItemSlot);
					var9.packetBuffer.writeShort(Renderable.selectedItemId);
					var9.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
					var9 = class4.getPacketBufferNode(ClientPacket.field2304, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method5673(Client.selectedSpellChildIndex);
					var9.packetBuffer.method5672(var3);
					var9.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.method5684(class307.selectedSpellWidget);
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
					var9 = class4.getPacketBufferNode(ClientPacket.field2264, Client.packetWriter.isaacCipher);
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var9.packetBuffer.method5674(var3);
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
					var9 = class4.getPacketBufferNode(ClientPacket.field2325, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method5672(var3);
					var9.packetBuffer.method5664(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
					var9 = class4.getPacketBufferNode(ClientPacket.field2290, Client.packetWriter.isaacCipher);
					var9.packetBuffer.writeShort(var3);
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
					var9 = class4.getPacketBufferNode(ClientPacket.field2311, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method5672(var3);
					var9.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
					var9 = class4.getPacketBufferNode(ClientPacket.field2235, Client.packetWriter.isaacCipher);
					var9.packetBuffer.method5673(var3);
					var9.packetBuffer.method5664(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
						var9 = class4.getPacketBufferNode(ClientPacket.field2328, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeShort(var3);
						var9.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
						var9.packetBuffer.method5674(InvDefinition.selectedItemSlot);
						var9.packetBuffer.writeInt(SpotAnimationDefinition.selectedItemWidget);
						var9.packetBuffer.method5674(Renderable.selectedItemId);
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
						var9 = class4.getPacketBufferNode(ClientPacket.field2275, Client.packetWriter.isaacCipher);
						var9.packetBuffer.method5682(class307.selectedSpellWidget);
						var9.packetBuffer.writeShort(Client.selectedSpellChildIndex);
						var9.packetBuffer.method5672(var3);
						var9.packetBuffer.method5664(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
						Client.packetWriter.addNode(var9);
					}
				} else if (var2 == 16) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = class4.getPacketBufferNode(ClientPacket.field2299, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method5672(var3);
					var8.packetBuffer.method5673(InvDefinition.selectedItemSlot);
					var8.packetBuffer.writeInt(SpotAnimationDefinition.selectedItemWidget);
					var8.packetBuffer.method5672(WorldMapData_0.baseY * 64 + var1);
					var8.packetBuffer.method5674(Renderable.selectedItemId);
					var8.packetBuffer.method5673(FloorDecoration.baseX * 64 + var0);
					var8.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 17) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = class4.getPacketBufferNode(ClientPacket.field2261, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method5672(var3);
					var8.packetBuffer.method5673(WorldMapData_0.baseY * 64 + var1);
					var8.packetBuffer.method5673(Client.selectedSpellChildIndex);
					var8.packetBuffer.method5683(class307.selectedSpellWidget);
					var8.packetBuffer.method5672(FloorDecoration.baseX * 64 + var0);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 18) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = class4.getPacketBufferNode(ClientPacket.field2257, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShort(WorldMapData_0.baseY * 64 + var1);
					var8.packetBuffer.writeShort(FloorDecoration.baseX * 64 + var0);
					var8.packetBuffer.method5673(var3);
					var8.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 19) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = class4.getPacketBufferNode(ClientPacket.field2258, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method5674(FloorDecoration.baseX * 64 + var0);
					var8.packetBuffer.method5674(var3);
					var8.packetBuffer.method5663(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method5674(WorldMapData_0.baseY * 64 + var1);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 20) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = class4.getPacketBufferNode(ClientPacket.field2305, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method5673(var3);
					var8.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method5674(FloorDecoration.baseX * 64 + var0);
					var8.packetBuffer.method5673(WorldMapData_0.baseY * 64 + var1);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 21) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = class4.getPacketBufferNode(ClientPacket.field2288, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method5672(var3);
					var8.packetBuffer.writeIntME(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method5672(FloorDecoration.baseX * 64 + var0);
					var8.packetBuffer.writeShort(WorldMapData_0.baseY * 64 + var1);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 22) {
					Client.mouseCrossX = var6;
					Client.mouseCrossY = var7;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var8 = class4.getPacketBufferNode(ClientPacket.field2246, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method5673(FloorDecoration.baseX * 64 + var0);
					var8.packetBuffer.method5664(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
					var8.packetBuffer.method5673(var3);
					var8.packetBuffer.method5672(WorldMapData_0.baseY * 64 + var1);
					Client.packetWriter.addNode(var8);
				} else if (var2 == 23) {
					if (Client.isMenuOpen) {
						ModeWhere.scene.setViewportWalking();
					} else {
						ModeWhere.scene.menuOpen(GrandExchangeOfferUnitPriceComparator.Client_plane, var0, var1, true);
					}
				} else {
					PacketBufferNode var10;
					Widget var16;
					if (var2 == 24) {
						var16 = UserComparator4.getWidget(var1);
						boolean var12 = true;
						if (var16.contentType > 0) {
							var12 = Varcs.method2313(var16);
						}

						if (var12) {
							var10 = class4.getPacketBufferNode(ClientPacket.field2286, Client.packetWriter.isaacCipher);
							var10.packetBuffer.writeInt(var1);
							Client.packetWriter.addNode(var10);
						}
					} else {
						if (var2 == 25) {
							var16 = ItemContainer.getWidgetChild(var1, var0);
							if (var16 != null) {
								class69.Widget_runOnTargetLeave();
								class3.selectSpell(var1, var0, JagexCache.method3625(WorldMapData_0.getWidgetClickMask(var16)), var16.itemId);
								Client.isItemSelected = 0;
								Client.selectedSpellActionName = PendingSpawn.method1843(var16);
								if (Client.selectedSpellActionName == null) {
									Client.selectedSpellActionName = "null";
								}

								if (var16.isIf3) {
									Client.selectedSpellName = var16.dataText + Client.colorStartTag(16777215);
								} else {
									Client.selectedSpellName = Client.colorStartTag(65280) + var16.spellName + Client.colorStartTag(16777215);
								}
							}

							return;
						}

						if (var2 == 26) {
							ModeWhere.method3815();
						} else {
							int var11;
							Widget var14;
							if (var2 == 28) {
								var8 = class4.getPacketBufferNode(ClientPacket.field2286, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeInt(var1);
								Client.packetWriter.addNode(var8);
								var14 = UserComparator4.getWidget(var1);
								if (var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) {
									var11 = var14.cs1Instructions[0][1];
									Varps.Varps_main[var11] = 1 - Varps.Varps_main[var11];
									class23.changeGameOptions(var11);
								}
							} else if (var2 == 29) {
								var8 = class4.getPacketBufferNode(ClientPacket.field2286, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeInt(var1);
								Client.packetWriter.addNode(var8);
								var14 = UserComparator4.getWidget(var1);
								if (var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) {
									var11 = var14.cs1Instructions[0][1];
									if (Varps.Varps_main[var11] != var14.cs1ComparisonValues[0]) {
										Varps.Varps_main[var11] = var14.cs1ComparisonValues[0];
										class23.changeGameOptions(var11);
									}
								}
							} else if (var2 == 30) {
								if (Client.meslayerContinueWidget == null) {
									class171.resumePauseWidget(var1, var0);
									Client.meslayerContinueWidget = ItemContainer.getWidgetChild(var1, var0);
									GrandExchangeOfferOwnWorldComparator.invalidateWidget(Client.meslayerContinueWidget);
								}
							} else if (var2 == 31) {
								var8 = class4.getPacketBufferNode(ClientPacket.field2232, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method5672(Renderable.selectedItemId);
								var8.packetBuffer.writeShort(var3);
								var8.packetBuffer.method5674(InvDefinition.selectedItemSlot);
								var8.packetBuffer.method5683(var1);
								var8.packetBuffer.writeInt(SpotAnimationDefinition.selectedItemWidget);
								var8.packetBuffer.method5673(var0);
								Client.packetWriter.addNode(var8);
								Client.field828 = 0;
								MouseHandler.field525 = UserComparator4.getWidget(var1);
								Client.field788 = var0;
							} else if (var2 == 32) {
								var8 = class4.getPacketBufferNode(ClientPacket.field2236, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method5684(class307.selectedSpellWidget);
								var8.packetBuffer.method5674(var0);
								var8.packetBuffer.method5683(var1);
								var8.packetBuffer.writeShort(var3);
								var8.packetBuffer.method5674(Client.selectedSpellChildIndex);
								Client.packetWriter.addNode(var8);
								Client.field828 = 0;
								MouseHandler.field525 = UserComparator4.getWidget(var1);
								Client.field788 = var0;
							} else if (var2 == 33) {
								var8 = class4.getPacketBufferNode(ClientPacket.field2250, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method5673(var0);
								var8.packetBuffer.writeInt(var1);
								var8.packetBuffer.method5674(var3);
								Client.packetWriter.addNode(var8);
								Client.field828 = 0;
								MouseHandler.field525 = UserComparator4.getWidget(var1);
								Client.field788 = var0;
							} else if (var2 == 34) {
								var8 = class4.getPacketBufferNode(ClientPacket.field2289, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeShort(var3);
								var8.packetBuffer.method5684(var1);
								var8.packetBuffer.method5672(var0);
								Client.packetWriter.addNode(var8);
								Client.field828 = 0;
								MouseHandler.field525 = UserComparator4.getWidget(var1);
								Client.field788 = var0;
							} else if (var2 == 35) {
								var8 = class4.getPacketBufferNode(ClientPacket.field2263, Client.packetWriter.isaacCipher);
								var8.packetBuffer.writeInt(var1);
								var8.packetBuffer.method5672(var3);
								var8.packetBuffer.method5673(var0);
								Client.packetWriter.addNode(var8);
								Client.field828 = 0;
								MouseHandler.field525 = UserComparator4.getWidget(var1);
								Client.field788 = var0;
							} else if (var2 == 36) {
								var8 = class4.getPacketBufferNode(ClientPacket.field2291, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method5673(var0);
								var8.packetBuffer.method5673(var3);
								var8.packetBuffer.method5682(var1);
								Client.packetWriter.addNode(var8);
								Client.field828 = 0;
								MouseHandler.field525 = UserComparator4.getWidget(var1);
								Client.field788 = var0;
							} else if (var2 == 37) {
								var8 = class4.getPacketBufferNode(ClientPacket.field2266, Client.packetWriter.isaacCipher);
								var8.packetBuffer.method5674(var0);
								var8.packetBuffer.method5682(var1);
								var8.packetBuffer.method5672(var3);
								Client.packetWriter.addNode(var8);
								Client.field828 = 0;
								MouseHandler.field525 = UserComparator4.getWidget(var1);
								Client.field788 = var0;
							} else {
								if (var2 == 38) {
									class69.Widget_runOnTargetLeave();
									var16 = UserComparator4.getWidget(var1);
									Client.isItemSelected = 1;
									InvDefinition.selectedItemSlot = var0;
									SpotAnimationDefinition.selectedItemWidget = var1;
									Renderable.selectedItemId = var3;
									GrandExchangeOfferOwnWorldComparator.invalidateWidget(var16);
									Client.selectedItemName = Client.colorStartTag(16748608) + AbstractWorldMapData.ItemDefinition_get(var3).name + Client.colorStartTag(16777215);
									if (Client.selectedItemName == null) {
										Client.selectedItemName = "null";
									}

									return;
								}

								if (var2 == 39) {
									var8 = class4.getPacketBufferNode(ClientPacket.field2243, Client.packetWriter.isaacCipher);
									var8.packetBuffer.method5674(var3);
									var8.packetBuffer.method5674(var0);
									var8.packetBuffer.writeInt(var1);
									Client.packetWriter.addNode(var8);
									Client.field828 = 0;
									MouseHandler.field525 = UserComparator4.getWidget(var1);
									Client.field788 = var0;
								} else if (var2 == 40) {
									var8 = class4.getPacketBufferNode(ClientPacket.field2294, Client.packetWriter.isaacCipher);
									var8.packetBuffer.method5684(var1);
									var8.packetBuffer.method5673(var0);
									var8.packetBuffer.method5672(var3);
									Client.packetWriter.addNode(var8);
									Client.field828 = 0;
									MouseHandler.field525 = UserComparator4.getWidget(var1);
									Client.field788 = var0;
								} else if (var2 == 41) {
									var8 = class4.getPacketBufferNode(ClientPacket.field2297, Client.packetWriter.isaacCipher);
									var8.packetBuffer.method5672(var3);
									var8.packetBuffer.method5672(var0);
									var8.packetBuffer.method5683(var1);
									Client.packetWriter.addNode(var8);
									Client.field828 = 0;
									MouseHandler.field525 = UserComparator4.getWidget(var1);
									Client.field788 = var0;
								} else if (var2 == 42) {
									var8 = class4.getPacketBufferNode(ClientPacket.field2276, Client.packetWriter.isaacCipher);
									var8.packetBuffer.writeShort(var3);
									var8.packetBuffer.method5674(var0);
									var8.packetBuffer.method5683(var1);
									Client.packetWriter.addNode(var8);
									Client.field828 = 0;
									MouseHandler.field525 = UserComparator4.getWidget(var1);
									Client.field788 = var0;
								} else if (var2 == 43) {
									var8 = class4.getPacketBufferNode(ClientPacket.field2313, Client.packetWriter.isaacCipher);
									var8.packetBuffer.method5674(var3);
									var8.packetBuffer.writeInt(var1);
									var8.packetBuffer.method5673(var0);
									Client.packetWriter.addNode(var8);
									Client.field828 = 0;
									MouseHandler.field525 = UserComparator4.getWidget(var1);
									Client.field788 = var0;
								} else if (var2 == 44) {
									var15 = Client.players[var3];
									if (var15 != null) {
										Client.mouseCrossX = var6;
										Client.mouseCrossY = var7;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var9 = class4.getPacketBufferNode(ClientPacket.field2239, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.method5673(var3);
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
										var9 = class4.getPacketBufferNode(ClientPacket.field2254, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method5664(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.method5674(var3);
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
										var9 = class4.getPacketBufferNode(ClientPacket.field2280, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method5664(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.method5673(var3);
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
										var9 = class4.getPacketBufferNode(ClientPacket.field2281, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeShort(var3);
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
										var9 = class4.getPacketBufferNode(ClientPacket.field2308, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method5663(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										var9.packetBuffer.method5672(var3);
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
										var9 = class4.getPacketBufferNode(ClientPacket.field2323, Client.packetWriter.isaacCipher);
										var9.packetBuffer.writeShort(var3);
										var9.packetBuffer.method5663(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
										var9 = class4.getPacketBufferNode(ClientPacket.field2324, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method5674(var3);
										var9.packetBuffer.method5663(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
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
										var9 = class4.getPacketBufferNode(ClientPacket.field2244, Client.packetWriter.isaacCipher);
										var9.packetBuffer.method5673(var3);
										var9.packetBuffer.method5663(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
										Client.packetWriter.addNode(var9);
									}
								} else {
									label899: {
										if (var2 != 57) {
											if (var2 == 58) {
												var16 = ItemContainer.getWidgetChild(var1, var0);
												if (var16 != null) {
													var9 = class4.getPacketBufferNode(ClientPacket.field2238, Client.packetWriter.isaacCipher);
													var9.packetBuffer.method5673(var0);
													var9.packetBuffer.method5672(Client.field838);
													var9.packetBuffer.method5672(Client.selectedSpellChildIndex);
													var9.packetBuffer.writeInt(var1);
													var9.packetBuffer.method5684(class307.selectedSpellWidget);
													var9.packetBuffer.writeShort(var16.itemId);
													Client.packetWriter.addNode(var9);
												}
												break label899;
											}

											if (var2 == 1001) {
												Client.mouseCrossX = var6;
												Client.mouseCrossY = var7;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												Client.destinationX = var0;
												Client.destinationY = var1;
												var8 = class4.getPacketBufferNode(ClientPacket.field2259, Client.packetWriter.isaacCipher);
												var8.packetBuffer.method5664(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0);
												var8.packetBuffer.method5674(var3);
												var8.packetBuffer.method5674(WorldMapData_0.baseY * 64 + var1);
												var8.packetBuffer.method5672(FloorDecoration.baseX * 64 + var0);
												Client.packetWriter.addNode(var8);
												break label899;
											}

											if (var2 == 1002) {
												Client.mouseCrossX = var6;
												Client.mouseCrossY = var7;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												var8 = class4.getPacketBufferNode(ClientPacket.field2233, Client.packetWriter.isaacCipher);
												var8.packetBuffer.writeShort(var3);
												Client.packetWriter.addNode(var8);
												break label899;
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
														var10 = class4.getPacketBufferNode(ClientPacket.field2284, Client.packetWriter.isaacCipher);
														var10.packetBuffer.method5672(var17.id);
														Client.packetWriter.addNode(var10);
													}
												}
												break label899;
											}

											if (var2 == 1004) {
												Client.mouseCrossX = var6;
												Client.mouseCrossY = var7;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												var8 = class4.getPacketBufferNode(ClientPacket.field2317, Client.packetWriter.isaacCipher);
												var8.packetBuffer.method5672(var3);
												Client.packetWriter.addNode(var8);
												break label899;
											}

											if (var2 == 1005) {
												var16 = UserComparator4.getWidget(var1);
												if (var16 != null && var16.itemQuantities[var0] >= 100000) {
													DevicePcmPlayerProvider.addGameMessage(27, "", var16.itemQuantities[var0] + " x " + AbstractWorldMapData.ItemDefinition_get(var3).name);
												} else {
													var9 = class4.getPacketBufferNode(ClientPacket.field2317, Client.packetWriter.isaacCipher);
													var9.packetBuffer.method5672(var3);
													Client.packetWriter.addNode(var9);
												}

												Client.field828 = 0;
												MouseHandler.field525 = UserComparator4.getWidget(var1);
												Client.field788 = var0;
												break label899;
											}

											if (var2 != 1007) {
												if (var2 == 1011 || var2 == 1010 || var2 == 1008 || var2 == 1009 || var2 == 1012) {
													KeyHandler.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1));
												}
												break label899;
											}
										}

										var16 = ItemContainer.getWidgetChild(var1, var0);
										if (var16 != null) {
											Messages.widgetDefaultMenuAction(var3, var1, var0, var16.itemId, var5);
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
			GrandExchangeOfferOwnWorldComparator.invalidateWidget(UserComparator4.getWidget(SpotAnimationDefinition.selectedItemWidget));
		}

		if (Client.isSpellSelected) {
			class69.Widget_runOnTargetLeave();
		}

		if (MouseHandler.field525 != null && Client.field828 == 0) {
			GrandExchangeOfferOwnWorldComparator.invalidateWidget(MouseHandler.field525);
		}

	}
}
