import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("nk")
@Implements("PacketBuffer")
public class PacketBuffer extends Buffer {
	@ObfuscatedName("o")
	static final int[] field4149;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Loy;"
	)
	@Export("isaacCipher")
	IsaacCipher isaacCipher;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1837417315
	)
	@Export("bitIndex")
	int bitIndex;

	static {
		field4149 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
	}

	public PacketBuffer(int var1) {
		super(var1);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "([IB)V",
		garbageValue = "87"
	)
	@Export("newIsaacCipher")
	public void newIsaacCipher(int[] var1) {
		this.isaacCipher = new IsaacCipher(var1);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Loy;B)V",
		garbageValue = "1"
	)
	@Export("setIsaacCipher")
	public void setIsaacCipher(IsaacCipher var1) {
		this.isaacCipher = var1;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(IB)V",
		garbageValue = "2"
	)
	@Export("writeByteIsaac")
	public void writeByteIsaac(int var1) {
		super.array[++super.offset - 1] = (byte)(var1 + this.isaacCipher.nextInt());
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "94"
	)
	@Export("readByteIsaac")
	public int readByteIsaac() {
		return super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "-689040710"
	)
	public boolean method6529() {
		int var1 = super.array[super.offset] - this.isaacCipher.method7100() & 255;
		return var1 >= 128;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "-114"
	)
	@Export("readSmartByteShortIsaac")
	public int readSmartByteShortIsaac() {
		int var1 = super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255;
		return var1 < 128 ? var1 : (var1 - 128 << 8) + (super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "([BIII)V",
		garbageValue = "990689178"
	)
	public void method6530(byte[] var1, int var2, int var3) {
		for (int var4 = 0; var4 < var3; ++var4) {
			var1[var4 + var2] = (byte)(super.array[++super.offset - 1] - this.isaacCipher.nextInt());
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1082258734"
	)
	@Export("importIndex")
	public void importIndex() {
		this.bitIndex = super.offset * 8;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(II)I",
		garbageValue = "1718914740"
	)
	@Export("readBits")
	public int readBits(int var1) {
		int var2 = this.bitIndex >> 3;
		int var3 = 8 - (this.bitIndex & 7);
		int var4 = 0;

		for (this.bitIndex += var1; var1 > var3; var3 = 8) {
			var4 += (super.array[var2++] & field4149[var3]) << var1 - var3;
			var1 -= var3;
		}

		if (var3 == var1) {
			var4 += super.array[var2] & field4149[var3];
		} else {
			var4 += super.array[var2] >> var3 - var1 & field4149[var1];
		}

		return var4;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1142217359"
	)
	@Export("exportIndex")
	public void exportIndex() {
		super.offset = (this.bitIndex + 7) / 8;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(II)I",
		garbageValue = "1244745268"
	)
	@Export("bitsRemaining")
	public int bitsRemaining(int var1) {
		return var1 * 8 - this.bitIndex;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(I)Let;",
		garbageValue = "-1779924577"
	)
	public static Clock method6523() {
		try {
			return new NanoClock();
		} catch (Throwable var1) {
			return new MilliClock();
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		signature = "(ILcc;ZI)I",
		garbageValue = "1312881118"
	)
	static int method6559(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) {
			var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type();
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) {
			var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) {
			var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) {
			var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) {
			var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) {
			var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice;
			return 1;
		} else {
			int var12;
			if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) {
				var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
				var12 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var12 == 0 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) {
				var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
				var12 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var12 == 2 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) {
				var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
				var12 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var12 == 5 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) {
				var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
				var12 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var12 == 1 ? 1 : 0;
				return 1;
			} else {
				boolean var13;
				if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) {
					var13 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1;
					if (Calendar.grandExchangeEvents != null) {
						Calendar.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var13);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) {
					var13 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1;
					if (Calendar.grandExchangeEvents != null) {
						Calendar.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var13);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) {
					class16.Interpreter_intStackSize -= 2;
					var13 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize] == 1;
					boolean var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1] == 1;
					if (Calendar.grandExchangeEvents != null) {
						Client.GrandExchangeEvents_worldComparator.filterWorlds = var4;
						Calendar.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var13);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) {
					var13 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1;
					if (Calendar.grandExchangeEvents != null) {
						Calendar.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var13);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) {
					var13 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1;
					if (Calendar.grandExchangeEvents != null) {
						Calendar.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var13);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) {
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Calendar.grandExchangeEvents == null ? 0 : Calendar.grandExchangeEvents.events.size();
					return 1;
				} else {
					GrandExchangeEvent var11;
					if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) {
						var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
						var11 = (GrandExchangeEvent)Calendar.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var11.world;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) {
						var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
						var11 = (GrandExchangeEvent)Calendar.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var11.getOfferName();
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) {
						var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
						var11 = (GrandExchangeEvent)Calendar.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var11.getPreviousOfferName();
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) {
						var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
						var11 = (GrandExchangeEvent)Calendar.grandExchangeEvents.events.get(var3);
						long var5 = ObjectSound.currentTimeMillis() - HealthBarUpdate.field1272 - var11.age;
						int var7 = (int)(var5 / 3600000L);
						int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L);
						int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * 60000)) / 1000L);
						String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var10;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) {
						var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
						var11 = (GrandExchangeEvent)Calendar.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var11.grandExchangeOffer.totalQuantity;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) {
						var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
						var11 = (GrandExchangeEvent)Calendar.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var11.grandExchangeOffer.unitPrice;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) {
						var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
						var11 = (GrandExchangeEvent)Calendar.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var11.grandExchangeOffer.id;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}
}
