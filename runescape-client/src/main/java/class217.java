import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hq")
public class class217 {
	@ObfuscatedName("b")
	@Export("localPlayerName")
	public static String localPlayerName;
	@ObfuscatedName("h")
	@Export("BZip2Decompressor_block")
	static int[] BZip2Decompressor_block;
	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		signature = "Lht;"
	)
	static Widget field2532;

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "([BI)V",
		garbageValue = "1671015223"
	)
	@Export("SpriteBuffer_decode")
	public static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		var1.offset = var0.length - 2;
		class336.SpriteBuffer_spriteCount = var1.readUnsignedShort();
		class336.SpriteBuffer_xOffsets = new int[class336.SpriteBuffer_spriteCount];
		class225.SpriteBuffer_yOffsets = new int[class336.SpriteBuffer_spriteCount];
		class336.SpriteBuffer_spriteWidths = new int[class336.SpriteBuffer_spriteCount];
		class336.SpriteBuffer_spriteHeights = new int[class336.SpriteBuffer_spriteCount];
		class13.SpriteBuffer_pixels = new byte[class336.SpriteBuffer_spriteCount][];
		var1.offset = var0.length - 7 - class336.SpriteBuffer_spriteCount * 8;
		class336.SpriteBuffer_spriteWidth = var1.readUnsignedShort();
		class336.SpriteBuffer_spriteHeight = var1.readUnsignedShort();
		int var2 = (var1.readUnsignedByte() & 255) + 1;

		int var3;
		for (var3 = 0; var3 < class336.SpriteBuffer_spriteCount; ++var3) {
			class336.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class336.SpriteBuffer_spriteCount; ++var3) {
			class225.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class336.SpriteBuffer_spriteCount; ++var3) {
			class336.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class336.SpriteBuffer_spriteCount; ++var3) {
			class336.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = var0.length - 7 - class336.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3;
		WorldMapID.SpriteBuffer_spritePalette = new int[var2];

		for (var3 = 1; var3 < var2; ++var3) {
			WorldMapID.SpriteBuffer_spritePalette[var3] = var1.readMedium();
			if (WorldMapID.SpriteBuffer_spritePalette[var3] == 0) {
				WorldMapID.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0;

		for (var3 = 0; var3 < class336.SpriteBuffer_spriteCount; ++var3) {
			int var4 = class336.SpriteBuffer_spriteWidths[var3];
			int var5 = class336.SpriteBuffer_spriteHeights[var3];
			int var6 = var5 * var4;
			byte[] var7 = new byte[var6];
			class13.SpriteBuffer_pixels[var3] = var7;
			int var8 = var1.readUnsignedByte();
			int var9;
			if (var8 == 0) {
				for (var9 = 0; var9 < var6; ++var9) {
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) {
				for (var9 = 0; var9 < var4; ++var9) {
					for (int var10 = 0; var10 < var5; ++var10) {
						var7[var9 + var10 * var4] = var1.readByte();
					}
				}
			}
		}

	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I)V",
		garbageValue = "-1102921575"
	)
	static final void method4098(String var0) {
		StringBuilder var10000 = (new StringBuilder()).append(var0);
		Object var10001 = null;
		String var1 = var10000.append(" is already on your ignore list").toString();
		DevicePcmPlayerProvider.addGameMessage(30, "", var1);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		signature = "(ILco;ZI)I",
		garbageValue = "1928769933"
	)
	static int method4099(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) {
			var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type();
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) {
			var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) {
			var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) {
			var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) {
			var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) {
			var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice;
			return 1;
		} else {
			int var12;
			if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) {
				var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
				var12 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var12 == 0 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) {
				var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
				var12 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var12 == 2 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) {
				var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
				var12 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var12 == 5 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) {
				var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
				var12 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var12 == 1 ? 1 : 0;
				return 1;
			} else {
				boolean var13;
				if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) {
					var13 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1;
					if (WorldMapDecoration.grandExchangeEvents != null) {
						WorldMapDecoration.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var13);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) {
					var13 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1;
					if (WorldMapDecoration.grandExchangeEvents != null) {
						WorldMapDecoration.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var13);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) {
					MilliClock.Interpreter_intStackSize -= 2;
					var13 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize] == 1;
					boolean var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1] == 1;
					if (WorldMapDecoration.grandExchangeEvents != null) {
						Client.GrandExchangeEvents_worldComparator.filterWorlds = var4;
						WorldMapDecoration.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var13);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) {
					var13 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1;
					if (WorldMapDecoration.grandExchangeEvents != null) {
						WorldMapDecoration.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var13);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) {
					var13 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1;
					if (WorldMapDecoration.grandExchangeEvents != null) {
						WorldMapDecoration.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var13);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) {
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = WorldMapDecoration.grandExchangeEvents == null ? 0 : WorldMapDecoration.grandExchangeEvents.events.size();
					return 1;
				} else {
					GrandExchangeEvent var11;
					if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) {
						var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
						var11 = (GrandExchangeEvent)WorldMapDecoration.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var11.world;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) {
						var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
						var11 = (GrandExchangeEvent)WorldMapDecoration.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var11.getOfferName();
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) {
						var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
						var11 = (GrandExchangeEvent)WorldMapDecoration.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var11.getPreviousOfferName();
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) {
						var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
						var11 = (GrandExchangeEvent)WorldMapDecoration.grandExchangeEvents.events.get(var3);
						long var5 = Nameable.currentTimeMillis() - class58.field444 - var11.age;
						int var7 = (int)(var5 / 3600000L);
						int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L);
						int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * 60000)) / 1000L);
						String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10;
						Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var10;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) {
						var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
						var11 = (GrandExchangeEvent)WorldMapDecoration.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var11.grandExchangeOffer.totalQuantity;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) {
						var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
						var11 = (GrandExchangeEvent)WorldMapDecoration.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var11.grandExchangeOffer.unitPrice;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) {
						var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
						var11 = (GrandExchangeEvent)WorldMapDecoration.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var11.grandExchangeOffer.id;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}
}
