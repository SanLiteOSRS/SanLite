import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fh")
public class class147 {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		longValue = -7511183678987547969L
	)
	long field1689;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -527511193
	)
	public int field1696;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	IterableNodeDeque field1690;

	@ObfuscatedSignature(
		descriptor = "(Lur;)V"
	)
	public class147(Buffer var1) {
		this.field1696 = -1; // L: 9
		this.field1690 = new IterableNodeDeque(); // L: 10
		this.method3166(var1); // L: 28
	} // L: 29

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)V",
		garbageValue = "19136782"
	)
	void method3166(Buffer var1) {
		this.field1689 = var1.readLong(); // L: 32
		this.field1696 = var1.readInt(); // L: 33

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) { // L: 34 35 55
			Object var3;
			if (var2 == 3) { // L: 37
				var3 = new class166(this);
			} else if (var2 == 1) { // L: 38
				var3 = new class142(this);
			} else if (var2 == 13) { // L: 39
				var3 = new class159(this);
			} else if (var2 == 4) { // L: 40
				var3 = new class151(this);
			} else if (var2 == 6) { // L: 41
				var3 = new class158(this);
			} else if (var2 == 5) {
				var3 = new class143(this); // L: 42
			} else if (var2 == 2) { // L: 43
				var3 = new class148(this);
			} else if (var2 == 7) { // L: 44
				var3 = new class141(this);
			} else if (var2 == 14) { // L: 45
				var3 = new class145(this);
			} else if (var2 == 8) { // L: 46
				var3 = new class162(this);
			} else if (var2 == 9) { // L: 47
				var3 = new class168(this);
			} else if (var2 == 10) {
				var3 = new class154(this); // L: 48
			} else if (var2 == 11) { // L: 49
				var3 = new class149(this);
			} else if (var2 == 12) { // L: 50
				var3 = new class153(this);
			} else {
				if (var2 != 15) { // L: 51
					throw new RuntimeException(""); // L: 52
				}

				var3 = new class163(this);
			}

			((class144)var3).vmethod3420(var1); // L: 53
			this.field1690.addFirst((Node)var3); // L: 54
		}

	} // L: 57

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lfp;I)V",
		garbageValue = "-2105530802"
	)
	public void method3174(ClanSettings var1) {
		if (this.field1689 == var1.field1734 && this.field1696 == var1.field1744) { // L: 60
			for (class144 var2 = (class144)this.field1690.last(); var2 != null; var2 = (class144)this.field1690.previous()) { // L: 61
				var2.vmethod3419(var1); // L: 62
			}

			++var1.field1744; // L: 64
		} else {
			throw new RuntimeException("");
		}
	} // L: 65

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[Lor;",
		garbageValue = "507270402"
	)
	public static class370[] method3171() {
		return new class370[]{class370.field4320, class370.field4319, class370.field4321, class370.field4324}; // L: 15
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)[Liu;",
		garbageValue = "-32"
	)
	public static class233[] method3172() {
		return new class233[]{class233.field2483, class233.field2485, class233.field2488, class233.field2486}; // L: 14
	}

	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "(Lnt;II)I",
		garbageValue = "-1220326076"
	)
	static final int method3173(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) { // L: 11325
			try {
				int[] var2 = var0.cs1Instructions[var1]; // L: 11327
				int var3 = 0; // L: 11328
				int var4 = 0; // L: 11329
				byte var5 = 0; // L: 11330

				while (true) {
					int var6 = var2[var4++]; // L: 11332
					int var7 = 0; // L: 11333
					byte var8 = 0; // L: 11334
					if (var6 == 0) { // L: 11335
						return var3;
					}

					if (var6 == 1) { // L: 11336
						var7 = Client.currentLevels[var2[var4++]];
					}

					if (var6 == 2) { // L: 11337
						var7 = Client.levels[var2[var4++]];
					}

					if (var6 == 3) { // L: 11338
						var7 = Client.experience[var2[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) { // L: 11339
						var9 = var2[var4++] << 16; // L: 11340
						var9 += var2[var4++]; // L: 11341
						var10 = class243.field2620.method6281(var9); // L: 11342
						var11 = var2[var4++]; // L: 11343
						if (var11 != -1 && (!class10.ItemComposition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 11344
							for (var12 = 0; var12 < var10.field3874.length; ++var12) { // L: 11345
								if (var11 + 1 == var10.field3874[var12]) { // L: 11346
									var7 += var10.field3875[var12];
								}
							}
						}
					}

					if (var6 == 5) { // L: 11350
						var7 = Varps.Varps_main[var2[var4++]];
					}

					if (var6 == 6) { // L: 11351
						var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
					}

					if (var6 == 7) { // L: 11352
						var7 = Varps.Varps_main[var2[var4++]] * 100 / 46875;
					}

					if (var6 == 8) { // L: 11353
						var7 = class133.localPlayer.combatLevel;
					}

					if (var6 == 9) { // L: 11354
						for (var9 = 0; var9 < 25; ++var9) { // L: 11355
							if (Skills.Skills_enabled[var9]) { // L: 11356
								var7 += Client.levels[var9];
							}
						}
					}

					if (var6 == 10) { // L: 11359
						var9 = var2[var4++] << 16; // L: 11360
						var9 += var2[var4++]; // L: 11361
						var10 = class243.field2620.method6281(var9); // L: 11362
						var11 = var2[var4++]; // L: 11363
						if (var11 != -1 && (!class10.ItemComposition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 11364
							for (var12 = 0; var12 < var10.field3874.length; ++var12) { // L: 11365
								if (var11 + 1 == var10.field3874[var12]) { // L: 11366
									var7 = 999999999; // L: 11367
									break; // L: 11368
								}
							}
						}
					}

					if (var6 == 11) { // L: 11373
						var7 = Client.field633;
					}

					if (var6 == 12) { // L: 11374
						var7 = Client.weight;
					}

					if (var6 == 13) { // L: 11375
						var9 = Varps.Varps_main[var2[var4++]]; // L: 11376
						int var13 = var2[var4++]; // L: 11377
						var7 = (var9 & 1 << var13) != 0 ? 1 : 0; // L: 11378
					}

					if (var6 == 14) { // L: 11380
						var9 = var2[var4++]; // L: 11381
						var7 = SpotAnimationDefinition.getVarbit(var9); // L: 11382
					}

					if (var6 == 15) { // L: 11384
						var8 = 1;
					}

					if (var6 == 16) { // L: 11385
						var8 = 2;
					}

					if (var6 == 17) { // L: 11386
						var8 = 3;
					}

					if (var6 == 18) { // L: 11387
						var7 = GrandExchangeOfferOwnWorldComparator.baseX * 64 + (class133.localPlayer.x >> 7);
					}

					if (var6 == 19) { // L: 11388
						var7 = DevicePcmPlayerProvider.baseY * 64 + (class133.localPlayer.y >> 7);
					}

					if (var6 == 20) { // L: 11389
						var7 = var2[var4++];
					}

					if (var8 == 0) { // L: 11390
						if (var5 == 0) { // L: 11391
							var3 += var7;
						}

						if (var5 == 1) { // L: 11392
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) { // L: 11393
							var3 /= var7;
						}

						if (var5 == 3) { // L: 11394
							var3 *= var7;
						}

						var5 = 0; // L: 11395
					} else {
						var5 = var8; // L: 11397
					}
				}
			} catch (Exception var14) { // L: 11400
				return -1; // L: 11401
			}
		} else {
			return -2;
		}
	}
}
