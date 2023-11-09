import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dp")
public class class117 {
	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("archive12")
	static Archive archive12;
	@ObfuscatedName("fo")
	@ObfuscatedGetter(
		intValue = -605035153
	)
	@Export("currentPort")
	static int currentPort;
	@ObfuscatedName("o")
	boolean field1446;
	@ObfuscatedName("q")
	boolean field1434;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ldy;"
	)
	class116 field1435;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Ldy;"
	)
	class116 field1436;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "[Ldd;"
	)
	class113[] field1437;
	@ObfuscatedName("w")
	boolean field1433;
	@ObfuscatedName("z")
	float field1439;
	@ObfuscatedName("j")
	float field1440;
	@ObfuscatedName("h")
	float[] field1441;
	@ObfuscatedName("a")
	float[] field1442;
	@ObfuscatedName("d")
	boolean field1448;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1623274009
	)
	int field1438;
	@ObfuscatedName("x")
	float[] field1445;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1130550585
	)
	int field1447;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1061946561
	)
	int field1444;
	@ObfuscatedName("b")
	float field1449;
	@ObfuscatedName("l")
	float field1443;

	class117() {
		this.field1441 = new float[4]; // L: 16
		this.field1442 = new float[4]; // L: 17
		this.field1448 = true; // L: 18
		this.field1438 = 0; // L: 19
	} // L: 26

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lqw;II)I",
		garbageValue = "1712190926"
	)
	int method2773(Buffer var1, int var2) {
		int var3 = var1.readUnsignedShort(); // L: 29
		int var4 = var1.readUnsignedByte(); // L: 30
		class123 var5 = (class123)class271.findEnumerated(class306.method5767(), var4); // L: 32
		if (var5 == null) { // L: 33
			var5 = class123.field1510;
		}

		int var6 = var1.readUnsignedByte(); // L: 36
		class116[] var7 = new class116[]{class116.field1431, class116.field1423, class116.field1424, class116.field1425, class116.field1422}; // L: 40
		class116 var8 = (class116)class271.findEnumerated(var7, var6); // L: 42
		if (var8 == null) { // L: 43
			var8 = class116.field1431;
		}

		this.field1435 = var8; // L: 46
		int var12 = var1.readUnsignedByte(); // L: 48
		class116[] var9 = new class116[]{class116.field1431, class116.field1423, class116.field1424, class116.field1425, class116.field1422}; // L: 52
		class116 var10 = (class116)class271.findEnumerated(var9, var12); // L: 54
		if (var10 == null) { // L: 55
			var10 = class116.field1431;
		}

		this.field1436 = var10; // L: 58
		this.field1446 = var1.readUnsignedByte() != 0; // L: 59
		this.field1437 = new class113[var3]; // L: 60
		class113 var14 = null; // L: 61

		int var13;
		for (var13 = 0; var13 < var3; ++var13) { // L: 62
			class113 var11 = new class113(); // L: 63
			var11.method2708(var1, var2); // L: 64
			this.field1437[var13] = var11; // L: 65
			if (var14 != null) { // L: 66
				var14.field1388 = var11; // L: 67
			}

			var14 = var11; // L: 69
		}

		this.field1447 = this.field1437[0].field1390; // L: 71
		this.field1444 = this.field1437[this.method2785() - 1].field1390; // L: 72
		this.field1445 = new float[this.method2772() + 1]; // L: 74

		for (var13 = this.method2769(); var13 <= this.method2775(); ++var13) { // L: 75
			this.field1445[var13 - this.method2769()] = MouseHandler.method600(this, (float)var13); // L: 76
		}

		this.field1437 = null; // L: 78
		this.field1449 = MouseHandler.method600(this, (float)(this.method2769() - 1)); // L: 80
		this.field1443 = MouseHandler.method600(this, (float)(this.method2775() + 1)); // L: 81
		return var3; // L: 82
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "-1139151310"
	)
	public float method2777(int var1) {
		if (var1 < this.method2769()) { // L: 87
			return this.field1449; // L: 88
		} else {
			return var1 > this.method2775() ? this.field1443 : this.field1445[var1 - this.method2769()]; // L: 90 91 93
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-24"
	)
	int method2769() {
		return this.field1447; // L: 98
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-828010612"
	)
	int method2775() {
		return this.field1444; // L: 102
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "323526183"
	)
	int method2772() {
		return this.method2775() - this.method2769(); // L: 106
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(FI)I",
		garbageValue = "-1662333309"
	)
	int method2771(float var1) {
		if (this.field1438 < 0 || (float)this.field1437[this.field1438].field1390 > var1 || this.field1437[this.field1438].field1388 != null && (float)this.field1437[this.field1438].field1388.field1390 <= var1) { // L: 110
			if (var1 >= (float)this.method2769() && var1 <= (float)this.method2775()) { // L: 113
				int var2 = this.method2785(); // L: 116
				int var3 = this.field1438; // L: 117
				if (var2 > 0) { // L: 118
					int var4 = 0; // L: 119
					int var5 = var2 - 1; // L: 120

					do {
						int var6 = var4 + var5 >> 1; // L: 122
						if (var1 < (float)this.field1437[var6].field1390) { // L: 123
							if (var1 > (float)this.field1437[var6 - 1].field1390) { // L: 124
								var3 = var6 - 1; // L: 125
								break;
							}

							var5 = var6 - 1; // L: 129
						} else {
							if (var1 <= (float)this.field1437[var6].field1390) { // L: 132
								var3 = var6; // L: 142
								break; // L: 143
							}

							if (var1 < (float)this.field1437[var6 + 1].field1390) { // L: 133
								var3 = var6; // L: 134
								break; // L: 135
							}

							var4 = var6 + 1; // L: 138
						}
					} while(var4 <= var5); // L: 145
				}

				if (var3 != this.field1438) { // L: 147
					this.field1438 = var3; // L: 148
					this.field1448 = true; // L: 149
				}

				return this.field1438; // L: 151
			} else {
				return -1; // L: 114
			}
		} else {
			return this.field1438; // L: 111
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(FI)Ldd;",
		garbageValue = "-1944565910"
	)
	class113 method2774(float var1) {
		int var2 = this.method2771(var1); // L: 155
		return var2 >= 0 && var2 < this.field1437.length ? this.field1437[var2] : null; // L: 156 157 160
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1901581488"
	)
	int method2785() {
		return this.field1437 == null ? 0 : this.field1437.length; // L: 165 166
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILbc;ZB)I",
		garbageValue = "4"
	)
	static int method2793(int var0, Script var1, boolean var2) {
		int var3;
		int var6;
		int var9;
		if (var0 == ScriptOpcodes.ENUM_STRING) { // L: 2280
			TaskHandler.Interpreter_intStackSize -= 2; // L: 2281
			var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 2282
			var9 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 2283
			EnumComposition var10 = class174.getEnum(var3); // L: 2284
			if (var10.outputType != 's') { // L: 2285
			}

			for (var6 = 0; var6 < var10.outputCount; ++var6) { // L: 2286
				if (var9 == var10.keys[var6]) { // L: 2287
					Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var10.strVals[var6]; // L: 2288
					var10 = null; // L: 2289
					break;
				}
			}

			if (var10 != null) { // L: 2293
				Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var10.defaultStr;
			}

			return 1; // L: 2294
		} else if (var0 != ScriptOpcodes.ENUM) { // L: 2296
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) { // L: 2322
				var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 2323
				EnumComposition var4 = class174.getEnum(var3); // L: 2324
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var4.size(); // L: 2325
				return 1; // L: 2326
			} else {
				return 2; // L: 2328
			}
		} else {
			TaskHandler.Interpreter_intStackSize -= 4; // L: 2297
			var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 2298
			var9 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 2299
			int var5 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 2]; // L: 2300
			var6 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 3]; // L: 2301
			EnumComposition var7 = class174.getEnum(var5); // L: 2302
			if (var3 == var7.inputType && var9 == var7.outputType) { // L: 2303
				for (int var8 = 0; var8 < var7.outputCount; ++var8) { // L: 2308
					if (var6 == var7.keys[var8]) { // L: 2309
						if (var9 == 115) { // L: 2310
							Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var7.intVals[var8]; // L: 2311
						}

						var7 = null; // L: 2312
						break;
					}
				}

				if (var7 != null) { // L: 2316
					if (var9 == 115) { // L: 2317
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var7.defaultStr;
					} else {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var7.defaultInt; // L: 2318
					}
				}

				return 1; // L: 2320
			} else {
				if (var9 == 115) { // L: 2304
					Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 2305
				}

				return 1; // L: 2306
			}
		}
	}
}
