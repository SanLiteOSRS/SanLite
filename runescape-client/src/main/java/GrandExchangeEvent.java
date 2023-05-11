import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nu")
@Implements("GrandExchangeEvent")
public class GrandExchangeEvent {
	@ObfuscatedName("il")
	@ObfuscatedGetter(
		longValue = 7290179413469624005L
	)
	static long field4287;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -39392873
	)
	@Export("world")
	public final int world;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		longValue = -2107275097961185091L
	)
	@Export("age")
	public final long age;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	@Export("grandExchangeOffer")
	public final GrandExchangeOffer grandExchangeOffer;
	@ObfuscatedName("ac")
	@Export("offerName")
	String offerName;
	@ObfuscatedName("au")
	@Export("previousOfferName")
	String previousOfferName;

	@ObfuscatedSignature(
		descriptor = "(Lsg;BI)V"
	)
	GrandExchangeEvent(Buffer var1, byte var2, int var3) {
		this.offerName = var1.readStringCp1252NullTerminated(); // L: 111
		this.previousOfferName = var1.readStringCp1252NullTerminated(); // L: 112
		this.world = var1.readUnsignedShort();
		this.age = var1.readLong(); // L: 114
		int var4 = var1.readInt(); // L: 115
		int var5 = var1.readInt();
		this.grandExchangeOffer = new GrandExchangeOffer();
		this.grandExchangeOffer.method6869(2); // L: 118
		this.grandExchangeOffer.method6865(var2); // L: 119
		this.grandExchangeOffer.unitPrice = var4; // L: 120
		this.grandExchangeOffer.totalQuantity = var5;
		this.grandExchangeOffer.currentQuantity = 0;
		this.grandExchangeOffer.currentPrice = 0; // L: 123
		this.grandExchangeOffer.id = var3;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "513475535"
	)
	@Export("getOfferName")
	public String getOfferName() {
		return this.offerName;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-171427168"
	)
	@Export("getPreviousOfferName")
	public String getPreviousOfferName() {
		return this.previousOfferName;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lek;FI)F",
		garbageValue = "-1064924394"
	)
	static float method6858(class125 var0, float var1) {
		if (var0 != null && var0.method3068() != 0) { // L: 20
			if (var1 < (float)var0.field1511[0].field1452) { // L: 23
				return var0.field1512 == class123.field1496 ? var0.field1511[0].field1455 : Message.method1204(var0, var1, true); // L: 24 25 27
			} else if (var1 > (float)var0.field1511[var0.method3068() - 1].field1452) { // L: 29
				return var0.field1528 == class123.field1496 ? var0.field1511[var0.method3068() - 1].field1455 : Message.method1204(var0, var1, false); // L: 30 31 33
			} else if (var0.field1508) { // L: 35
				return var0.field1511[0].field1455; // L: 36
			} else {
				class120 var2 = var0.method3067(var1); // L: 38
				boolean var3 = false; // L: 39
				boolean var4 = false; // L: 40
				if (var2 == null) { // L: 41
					return 0.0F; // L: 160
				} else {
					float var5;
					float var6;
					float var7;
					if ((double)var2.field1453 == 0.0D && (double)var2.field1450 == 0.0D) { // L: 42
						var3 = true; // L: 43
					} else if (Float.MAX_VALUE == var2.field1453 && Float.MAX_VALUE == var2.field1450) { // L: 45
						var4 = true; // L: 46
					} else if (var2.field1454 != null) { // L: 48
						if (var0.field1524) { // L: 49
							var5 = (float)var2.field1452; // L: 58
							float var9 = var2.field1455; // L: 59
							var6 = var5 + var2.field1453 * 0.33333334F; // L: 60
							float var10 = var9 + var2.field1450 * 0.33333334F; // L: 61
							float var8 = (float)var2.field1454.field1452; // L: 62
							float var12 = var2.field1454.field1455; // L: 63
							var7 = var8 - 0.33333334F * var2.field1454.field1451; // L: 64
							float var11 = var12 - 0.33333334F * var2.field1454.field1449; // L: 65
							if (var0.field1523) { // L: 66
								ParamComposition.method3916(var0, var5, var6, var7, var8, var9, var10, var11, var12); // L: 67
							} else if (var0 != null) { // L: 71
								var0.field1513 = var5; // L: 74
								float var13 = var8 - var5; // L: 75
								float var14 = var12 - var9; // L: 76
								float var15 = var6 - var5;
								float var16 = 0.0F;
								float var17 = 0.0F;
								if ((double)var15 != 0.0D) { // L: 80
									var16 = (var10 - var9) / var15; // L: 81
								}

								var15 = var8 - var7; // L: 83
								if (0.0D != (double)var15) { // L: 84
									var17 = (var12 - var11) / var15; // L: 85
								}

								float var18 = 1.0F / (var13 * var13); // L: 87
								float var19 = var13 * var16; // L: 88
								float var20 = var17 * var13; // L: 89
								var0.field1515 = (var20 + var19 - var14 - var14) * var18 / var13; // L: 90
								var0.field1516 = (var14 + var14 + var14 - var19 - var19 - var20) * var18; // L: 91
								var0.field1529 = var16; // L: 92
								var0.field1518 = var9; // L: 93
							}

							var0.field1524 = false; // L: 96
						}
					} else {
						var3 = true; // L: 100
					}

					if (var3) { // L: 102
						return var2.field1455; // L: 103
					} else if (var4) { // L: 105
						return var1 != (float)var2.field1452 && var2.field1454 != null ? var2.field1454.field1455 : var2.field1455; // L: 106 107 110
					} else if (var0.field1523) { // L: 113
						if (var0 == null) { // L: 116
							var5 = 0.0F; // L: 117
						} else {
							if (var1 == var0.field1513) { // L: 121
								var6 = 0.0F; // L: 122
							} else if (var0.field1521 == var1) { // L: 124
								var6 = 1.0F; // L: 125
							} else {
								var6 = (var1 - var0.field1513) / (var0.field1521 - var0.field1513); // L: 128
							}

							if (var0.field1509) { // L: 131
								var7 = var6; // L: 132
							} else {
								class121.field1468[3] = var0.field1518; // L: 135
								class121.field1468[2] = var0.field1529; // L: 136
								class121.field1468[1] = var0.field1516; // L: 137
								class121.field1468[0] = var0.field1515 - var6; // L: 138
								class121.field1465[0] = 0.0F; // L: 139
								class121.field1465[1] = 0.0F; // L: 140
								class121.field1465[2] = 0.0F; // L: 141
								class121.field1465[3] = 0.0F; // L: 142
								class121.field1465[4] = 0.0F; // L: 143
								int var21 = class103.method2716(class121.field1468, 3, 0.0F, true, 1.0F, true, class121.field1465); // L: 144
								if (var21 == 1) { // L: 145
									var7 = class121.field1465[0]; // L: 146
								} else {
									var7 = 0.0F; // L: 149
								}
							}

							var5 = var0.field1519 + (var0.field1520 + (var0.field1522 * var7 + var0.field1517) * var7) * var7; // L: 152
						}

						return var5; // L: 154
					} else {
						return class14.method191(var0, var1); // L: 157
					}
				}
			}
		} else {
			return 0.0F; // L: 21
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "157863063"
	)
	public static void method6857() {
		HealthBarDefinition.HealthBarDefinition_cached.clear(); // L: 77
		HealthBarDefinition.HitSplatDefinition_cachedSprites.clear(); // L: 78
	} // L: 79
}
