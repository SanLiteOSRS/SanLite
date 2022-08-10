import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("js")
public class class271 {
	@ObfuscatedName("o")
	static int[] field3179;

	static {
		new Object();
		field3179 = new int[33]; // L: 8
		field3179[0] = 0; // L: 11
		int var0 = 2; // L: 12

		for (int var1 = 1; var1 < 33; ++var1) { // L: 13
			field3179[var1] = var0 - 1; // L: 14
			var0 += var0; // L: 15
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1698477365"
	)
	@Export("getVarbit")
	public static int getVarbit(int var0) {
		VarbitComposition var2 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0); // L: 26
		VarbitComposition var1;
		if (var2 != null) { // L: 27
			var1 = var2; // L: 28
		} else {
			byte[] var3 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0); // L: 31
			var2 = new VarbitComposition(); // L: 32
			if (var3 != null) { // L: 33
				var2.decode(new Buffer(var3));
			}

			VarbitComposition.VarbitDefinition_cached.put(var2, (long)var0); // L: 34
			var1 = var2; // L: 35
		}

		int var7 = var1.baseVar; // L: 38
		int var4 = var1.startBit; // L: 39
		int var5 = var1.endBit; // L: 40
		int var6 = Varps.Varps_masks[var5 - var4]; // L: 41
		return Varps.Varps_main[var7] >> var4 & var6; // L: 42
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "([Llm;II)Llm;",
		garbageValue = "1310333735"
	)
	@Export("findEnumerated")
	public static MouseWheel findEnumerated(MouseWheel[] var0, int var1) {
		MouseWheel[] var2 = var0;

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 18
			MouseWheel var4 = var2[var3]; // L: 19
			if (var1 == var4.rsOrdinal()) {
				return var4; // L: 21
			}
		}

		return null; // L: 25
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "12830"
	)
	public static int method5244(int var0, int var1) {
		return (-3 - var0 << 8) + var1; // L: 17
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILbc;ZI)I",
		garbageValue = "-1878258428"
	)
	static int method5246(int var0, Script var1, boolean var2) {
		if (var0 != 7000 && var0 != 7005 && var0 != 7010 && var0 != 7015 && var0 != 7020 && var0 != 7025 && var0 != 7030 && var0 != 7035) { // L: 4562
			if (var0 != 7001 && var0 != 7002 && var0 != 7011 && var0 != 7012 && var0 != 7021 && var0 != 7022) { // L: 4566
				if (var0 != 7003 && var0 != 7013 && var0 != 7023) { // L: 4570
					if (var0 != 7006 && var0 != 7007 && var0 != 7016 && var0 != 7017 && var0 != 7026 && var0 != 7027) { // L: 4574
						if (var0 != 7008 && var0 != 7018 && var0 != 7028) { // L: 4578
							if (var0 != 7031 && var0 != 7032) { // L: 4582
								if (var0 == 7033) { // L: 4587
									--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize; // L: 4588
									return 1; // L: 4589
								} else if (var0 != 7036 && var0 != 7037) { // L: 4591
									if (var0 == 7038) { // L: 4595
										--TaskHandler.Interpreter_intStackSize; // L: 4596
										return 1; // L: 4597
									} else if (var0 != 7004 && var0 != 7009 && var0 != 7014 && var0 != 7019 && var0 != 7024 && var0 != 7029 && var0 != 7034 && var0 != 7039) { // L: 4599
										return 2; // L: 4603
									} else {
										--TaskHandler.Interpreter_intStackSize; // L: 4600
										return 1; // L: 4601
									}
								} else {
									TaskHandler.Interpreter_intStackSize -= 2; // L: 4592
									return 1; // L: 4593
								}
							} else {
								--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize; // L: 4583
								--TaskHandler.Interpreter_intStackSize; // L: 4584
								return 1; // L: 4585
							}
						} else {
							--TaskHandler.Interpreter_intStackSize; // L: 4579
							return 1; // L: 4580
						}
					} else {
						TaskHandler.Interpreter_intStackSize -= 2; // L: 4575
						return 1; // L: 4576
					}
				} else {
					TaskHandler.Interpreter_intStackSize -= 2; // L: 4571
					return 1; // L: 4572
				}
			} else {
				TaskHandler.Interpreter_intStackSize -= 3; // L: 4567
				return 1; // L: 4568
			}
		} else {
			TaskHandler.Interpreter_intStackSize -= 5; // L: 4563
			return 1; // L: 4564
		}
	}
}
