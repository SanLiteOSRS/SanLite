import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fz")
public class class136 extends DualNode {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1048712745
	)
	static int field1585;
	@ObfuscatedName("bx")
	protected static String field1591;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -937938317
	)
	int field1588;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[[Leq;"
	)
	public class129[][] field1583;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[[Leq;"
	)
	class129[][] field1584;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	public Skeleton field1587;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1017129951
	)
	int field1586;
	@ObfuscatedName("ap")
	boolean field1582;
	@ObfuscatedName("ae")
	Future field1590;
	@ObfuscatedName("af")
	List field1589;

	@ObfuscatedSignature(
		descriptor = "(Lnq;Lnq;IZ)V",
		garbageValue = "0"
	)
	public class136(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		this.field1583 = null; // L: 21
		this.field1584 = null; // L: 22
		this.field1586 = 0; // L: 24
		this.field1588 = var3; // L: 32
		byte[] var5 = var1.takeFile(this.field1588 >> 16 & 65535, this.field1588 & 65535); // L: 33
		Buffer var6 = new Buffer(var5); // L: 34
		int var7 = var6.readUnsignedByte(); // L: 35
		int var8 = var6.readUnsignedShort(); // L: 36
		byte[] var9 = var2.getFile(var8, 0); // L: 39
		this.field1587 = new Skeleton(var8, var9); // L: 40
		this.field1589 = new ArrayList(); // L: 41
		this.field1590 = class125.field1468.submit(new class133(this, var6, var7)); // L: 42
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltz;IB)V",
		garbageValue = "4"
	)
	void method3069(Buffer var1, int var2) {
		var1.readUnsignedShort(); // L: 52
		var1.readUnsignedShort(); // L: 53
		this.field1586 = var1.readUnsignedByte(); // L: 54
		int var3 = var1.readUnsignedShort(); // L: 55
		this.field1584 = new class129[this.field1587.method4507().method4451()][]; // L: 56
		this.field1583 = new class129[this.field1587.method4509()][]; // L: 57
		class128[] var4 = new class128[var3]; // L: 58

		int var5;
		int var7;
		for (var5 = 0; var5 < var3; ++var5) { // L: 59
			class130 var12 = Varps.method5963(var1.readUnsignedByte()); // L: 60
			var7 = var1.readShortSmart(); // L: 61
			class131 var13 = class177.method3518(var1.readUnsignedByte()); // L: 62
			class129 var14 = new class129(); // L: 63
			var14.method2976(var1, var2); // L: 64
			var4[var5] = new class128(this, var14, var12, var13, var7); // L: 65
			int var10 = var12.method3003(); // L: 66
			class129[][] var15;
			if (var12 == class130.field1529) { // L: 68
				var15 = this.field1584; // L: 69
			} else {
				var15 = this.field1583; // L: 72
			}

			if (var15[var7] == null) { // L: 74
				var15[var7] = new class129[var10]; // L: 75
			}

			if (var12 == class130.field1532) { // L: 77
				this.field1582 = true; // L: 78
			}
		}

		var5 = var3 / AccessFile.field4940; // L: 81
		int var6 = var3 % AccessFile.field4940; // L: 82
		int var8 = 0; // L: 84

		for (int var9 = 0; var9 < AccessFile.field4940; ++var9) { // L: 85
			var7 = var8; // L: 86
			var8 += var5; // L: 87
			if (var6 > 0) { // L: 88
				++var8; // L: 89
				--var6; // L: 90
			}

			if (var7 == var8) { // L: 92
				break;
			}

			this.field1589.add(class125.field1468.submit(new class135(this, var7, var8, var4))); // L: 97
		}

	} // L: 107

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-5"
	)
	public boolean method3051() {
		if (this.field1590 == null && this.field1589 == null) { // L: 110
			return true; // L: 111
		} else {
			if (this.field1590 != null) { // L: 113
				if (!this.field1590.isDone()) { // L: 114
					return false; // L: 115
				}

				this.field1590 = null; // L: 117
			}

			boolean var1 = true; // L: 119

			for (int var2 = 0; var2 < this.field1589.size(); ++var2) { // L: 120
				if (!((Future)this.field1589.get(var2)).isDone()) { // L: 121
					var1 = false; // L: 122
				} else {
					this.field1589.remove(var2); // L: 125
					--var2; // L: 126
				}
			}

			if (!var1) { // L: 129
				return false; // L: 130
			} else {
				this.field1589 = null; // L: 132
				return true; // L: 133
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "619897416"
	)
	public int method3052() {
		return this.field1586; // L: 137
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "6"
	)
	public boolean method3053() {
		return this.field1582; // L: 141
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILej;III)V",
		garbageValue = "-666610798"
	)
	public void method3054(int var1, class126 var2, int var3, int var4) {
		class438 var5 = class396.method7554(); // L: 145
		this.method3055(var5, var3, var2, var1); // L: 146
		this.method3057(var5, var3, var2, var1); // L: 147
		this.method3056(var5, var3, var2, var1); // L: 148
		var2.method2939(var5); // L: 149
		var5.method8119(); // L: 150
	} // L: 151

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lqp;ILej;II)V",
		garbageValue = "1698958692"
	)
	void method3055(class438 var1, int var2, class126 var3, int var4) {
		float[] var5 = var3.method2929(this.field1586); // L: 154
		float var6 = var5[0]; // L: 155
		float var7 = var5[1]; // L: 156
		float var8 = var5[2]; // L: 157
		if (this.field1584[var2] != null) { // L: 158
			class129 var9 = this.field1584[var2][0]; // L: 159
			class129 var10 = this.field1584[var2][1]; // L: 160
			class129 var11 = this.field1584[var2][2]; // L: 161
			if (var9 != null) { // L: 162
				var6 = var9.method2975(var4);
			}

			if (var10 != null) { // L: 163
				var7 = var10.method2975(var4);
			}

			if (var11 != null) { // L: 164
				var8 = var11.method2975(var4);
			}
		}

		class437 var22;
		synchronized(class437.field4677) { // L: 168
			if (class437.field4676 == 0) { // L: 169
				var22 = new class437();
			} else {
				class437.field4677[--class437.field4676].method8070(); // L: 171
				var22 = class437.field4677[class437.field4676]; // L: 172
			}
		}

		var22.method8069(1.0F, 0.0F, 0.0F, var6); // L: 177
		class437 var23;
		synchronized(class437.field4677) { // L: 180
			if (class437.field4676 == 0) { // L: 181
				var23 = new class437();
			} else {
				class437.field4677[--class437.field4676].method8070(); // L: 183
				var23 = class437.field4677[class437.field4676]; // L: 184
			}
		}

		var23.method8069(0.0F, 1.0F, 0.0F, var7); // L: 189
		class437 var13;
		synchronized(class437.field4677) { // L: 192
			if (class437.field4676 == 0) { // L: 193
				var13 = new class437();
			} else {
				class437.field4677[--class437.field4676].method8070(); // L: 195
				var13 = class437.field4677[class437.field4676]; // L: 196
			}
		}

		var13.method8069(0.0F, 0.0F, 1.0F, var8); // L: 201
		class437 var15;
		synchronized(class437.field4677) { // L: 204
			if (class437.field4676 == 0) { // L: 205
				var15 = new class437();
			} else {
				class437.field4677[--class437.field4676].method8070(); // L: 207
				var15 = class437.field4677[class437.field4676]; // L: 208
			}
		}

		var15.method8071(var13); // L: 213
		var15.method8071(var22); // L: 214
		var15.method8071(var23); // L: 215
		class438 var17 = class396.method7554(); // L: 216
		var17.method8105(var15); // L: 217
		var1.method8104(var17); // L: 218
		var22.method8076(); // L: 219
		var23.method8076(); // L: 220
		var13.method8076(); // L: 221
		var15.method8076(); // L: 222
		var17.method8119(); // L: 223
	} // L: 224

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lqp;ILej;II)V",
		garbageValue = "1814069017"
	)
	void method3056(class438 var1, int var2, class126 var3, int var4) {
		float[] var5 = var3.method2930(this.field1586); // L: 227
		float var6 = var5[0]; // L: 228
		float var7 = var5[1]; // L: 229
		float var8 = var5[2]; // L: 230
		if (this.field1584[var2] != null) { // L: 231
			class129 var9 = this.field1584[var2][3]; // L: 232
			class129 var10 = this.field1584[var2][4]; // L: 233
			class129 var11 = this.field1584[var2][5]; // L: 234
			if (var9 != null) { // L: 235
				var6 = var9.method2975(var4);
			}

			if (var10 != null) { // L: 236
				var7 = var10.method2975(var4);
			}

			if (var11 != null) { // L: 237
				var8 = var11.method2975(var4);
			}
		}

		var1.field4685[12] = var6; // L: 239
		var1.field4685[13] = var7; // L: 240
		var1.field4685[14] = var8; // L: 241
	} // L: 242

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lqp;ILej;IS)V",
		garbageValue = "16384"
	)
	void method3057(class438 var1, int var2, class126 var3, int var4) {
		float[] var5 = var3.method2931(this.field1586); // L: 245
		float var6 = var5[0]; // L: 246
		float var7 = var5[1]; // L: 247
		float var8 = var5[2]; // L: 248
		if (this.field1584[var2] != null) { // L: 249
			class129 var9 = this.field1584[var2][6]; // L: 250
			class129 var10 = this.field1584[var2][7]; // L: 251
			class129 var11 = this.field1584[var2][8]; // L: 252
			if (var9 != null) { // L: 253
				var6 = var9.method2975(var4);
			}

			if (var10 != null) { // L: 254
				var7 = var10.method2975(var4);
			}

			if (var11 != null) { // L: 255
				var8 = var11.method2975(var4);
			}
		}

		class438 var12 = class396.method7554(); // L: 257
		var12.method8102(var6, var7, var8); // L: 258
		var1.method8104(var12); // L: 259
		var12.method8119(); // L: 260
	} // L: 261

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "1970905733"
	)
	static int method3075(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.ADD) { // L: 3537
			Interpreter.Interpreter_intStackSize -= 2; // L: 3538
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3539
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3540
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 + var9; // L: 3541
			return 1; // L: 3542
		} else if (var0 == ScriptOpcodes.SUB) { // L: 3544
			Interpreter.Interpreter_intStackSize -= 2; // L: 3545
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3546
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3547
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 - var4; // L: 3548
			return 1; // L: 3549
		} else if (var0 == ScriptOpcodes.MULTIPLY) { // L: 3551
			Interpreter.Interpreter_intStackSize -= 2; // L: 3552
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3553
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3554
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 * var9; // L: 3555
			return 1; // L: 3556
		} else if (var0 == ScriptOpcodes.DIV) { // L: 3558
			Interpreter.Interpreter_intStackSize -= 2; // L: 3559
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3560
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3561
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 / var4; // L: 3562
			return 1; // L: 3563
		} else if (var0 == ScriptOpcodes.RANDOM) { // L: 3565
			var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3566
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var9); // L: 3567
			return 1; // L: 3568
		} else if (var0 == ScriptOpcodes.RANDOMINC) { // L: 3570
			var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3571
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var9 + 1)); // L: 3572
			return 1; // L: 3573
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) { // L: 3575
				Interpreter.Interpreter_intStackSize -= 5; // L: 3576
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3577
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3578
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3579
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 3580
				var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 4]; // L: 3581
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 + (var4 - var9) * (var7 - var5) / (var6 - var5); // L: 3582
				return 1; // L: 3583
			} else if (var0 == ScriptOpcodes.ADDPERCENT) { // L: 3585
				Interpreter.Interpreter_intStackSize -= 2; // L: 3586
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3587
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3588
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 + var9 * var4 / 100; // L: 3589
				return 1; // L: 3590
			} else if (var0 == ScriptOpcodes.SETBIT) { // L: 3592
				Interpreter.Interpreter_intStackSize -= 2; // L: 3593
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3594
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3595
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 | 1 << var4; // L: 3596
				return 1; // L: 3597
			} else if (var0 == ScriptOpcodes.CLEARBIT) { // L: 3599
				Interpreter.Interpreter_intStackSize -= 2; // L: 3600
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3601
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3602
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 & -1 - (1 << var4); // L: 3603
				return 1; // L: 3604
			} else if (var0 == ScriptOpcodes.TESTBIT) { // L: 3606
				Interpreter.Interpreter_intStackSize -= 2; // L: 3607
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3608
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3609
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var9 & 1 << var4) != 0 ? 1 : 0; // L: 3610
				return 1; // L: 3611
			} else if (var0 == ScriptOpcodes.MOD) { // L: 3613
				Interpreter.Interpreter_intStackSize -= 2; // L: 3614
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3615
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3616
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 % var4; // L: 3617
				return 1; // L: 3618
			} else if (var0 == ScriptOpcodes.POW) { // L: 3620
				Interpreter.Interpreter_intStackSize -= 2; // L: 3621
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3622
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3623
				if (var9 == 0) { // L: 3624
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, (double)var4); // L: 3625
				}

				return 1; // L: 3626
			} else if (var0 == ScriptOpcodes.INVPOW) { // L: 3628
				Interpreter.Interpreter_intStackSize -= 2; // L: 3629
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3630
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3631
				if (var9 == 0) { // L: 3632
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3633
					return 1; // L: 3634
				} else {
					switch(var4) { // L: 3636
					case 0:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Integer.MAX_VALUE; // L: 3649
						break; // L: 3650
					case 1:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9; // L: 3639
						break;
					case 2:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var9); // L: 3659
						break; // L: 3660
					case 3:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var9); // L: 3664
						break;
					case 4:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var9)); // L: 3654
						break; // L: 3655
					default:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, 1.0D / (double)var4); // L: 3644
					}

					return 1; // L: 3668
				}
			} else if (var0 == ScriptOpcodes.AND) { // L: 3670
				Interpreter.Interpreter_intStackSize -= 2; // L: 3671
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3672
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3673
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 & var4; // L: 3674
				return 1; // L: 3675
			} else if (var0 == ScriptOpcodes.OR) { // L: 3677
				Interpreter.Interpreter_intStackSize -= 2; // L: 3678
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3679
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3680
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 | var4; // L: 3681
				return 1; // L: 3682
			} else if (var0 == 4016) { // L: 3684
				Interpreter.Interpreter_intStackSize -= 2; // L: 3685
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3686
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3687
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 < var4 ? var9 : var4; // L: 3688
				return 1; // L: 3689
			} else if (var0 == 4017) { // L: 3691
				Interpreter.Interpreter_intStackSize -= 2; // L: 3692
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3693
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3694
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 > var4 ? var9 : var4; // L: 3695
				return 1; // L: 3696
			} else if (var0 == ScriptOpcodes.SCALE) { // L: 3698
				Interpreter.Interpreter_intStackSize -= 3; // L: 3699
				long var10 = (long)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3700
				long var12 = (long)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3701
				long var14 = (long)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3702
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)(var10 * var14 / var12); // L: 3703
				return 1; // L: 3704
			} else if (var0 == ScriptOpcodes.BITCOUNT) { // L: 3706
				var9 = FloorOverlayDefinition.method4023(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 3707
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9; // L: 3708
				return 1; // L: 3709
			} else if (var0 == ScriptOpcodes.TOGGLEBIT) { // L: 3711
				Interpreter.Interpreter_intStackSize -= 2; // L: 3712
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3713
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3714
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 ^ 1 << var4; // L: 3715
				return 1; // L: 3716
			} else if (var0 == ScriptOpcodes.SETBIT_RANGE) { // L: 3718
				Interpreter.Interpreter_intStackSize -= 3; // L: 3719
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3720
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3721
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3722
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = MouseHandler.method642(var9, var4, var5); // L: 3723
				return 1; // L: 3724
			} else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) { // L: 3726
				Interpreter.Interpreter_intStackSize -= 3; // L: 3727
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3728
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3729
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3730
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = PlayerComposition.method6052(var9, var4, var5); // L: 3731
				return 1; // L: 3732
			} else if (var0 == ScriptOpcodes.GETBIT_RANGE) { // L: 3734
				Interpreter.Interpreter_intStackSize -= 3; // L: 3735
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3736
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3737
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3738
				var6 = 31 - var5; // L: 3739
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 << var6 >>> var6 + var4; // L: 3740
				return 1; // L: 3741
			} else if (var0 == 4030) { // L: 3743
				Interpreter.Interpreter_intStackSize -= 4; // L: 3744
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3745
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3746
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3747
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 3748
				var9 = PlayerComposition.method6052(var9, var5, var6); // L: 3749
				var7 = class155.method3288(var6 - var5 + 1); // L: 3750
				if (var4 > var7) { // L: 3751
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 | var4 << var5; // L: 3752
				return 1; // L: 3753
			} else if (var0 == 4032) { // L: 3755
				Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = MouseHandler.method655(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]); // L: 3756
				return 1; // L: 3757
			} else if (var0 == 4033) { // L: 3759
				Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = GrandExchangeOfferWorldComparator.method6833(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]); // L: 3760
				return 1; // L: 3761
			} else if (var0 == 4034) { // L: 3763
				Interpreter.Interpreter_intStackSize -= 2; // L: 3764
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3765
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3766
				var5 = UserComparator7.method2860(var9, var4); // L: 3767
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5; // L: 3768
				return 1; // L: 3769
			} else if (var0 == 4035) { // L: 3771
				Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]); // L: 3772
				return 1; // L: 3773
			} else if (var0 == 4036) { // L: 3775
				String var3 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize]; // L: 3776
				var4 = -1; // L: 3777
				if (class146.isNumber(var3)) { // L: 3778
					var4 = TextureProvider.method4744(var3); // L: 3779
				}

				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4; // L: 3781
				return 1; // L: 3782
			} else {
				return 2; // L: 3784
			}
		}
	}

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "(Lny;Ljava/lang/String;I)V",
		garbageValue = "2030574471"
	)
	static void method3070(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1); // L: 1527
		Client.archiveLoaders.add(var2); // L: 1528
		Client.field767 += var2.groupCount; // L: 1529
	} // L: 1530

	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-860479964"
	)
	@Export("load")
	static void load() {
		int var18;
		if (Client.titleLoadingStage == 0) { // L: 1576
			class36.scene = new Scene(4, 104, 104, Tiles.Tiles_heights); // L: 1577

			for (var18 = 0; var18 < 4; ++var18) { // L: 1578
				Client.collisionMaps[var18] = new CollisionMap(104, 104);
			}

			class33.sceneMinimapSprite = new SpritePixels(512, 512); // L: 1579
			Login.Login_loadingText = "Starting game engine..."; // L: 1580
			Login.Login_loadingPercent = 5; // L: 1581
			Client.titleLoadingStage = 20; // L: 1582
		} else if (Client.titleLoadingStage == 20) { // L: 1585
			Login.Login_loadingText = "Prepared visibility map"; // L: 1586
			Login.Login_loadingPercent = 10; // L: 1587
			Client.titleLoadingStage = 30; // L: 1588
		} else if (Client.titleLoadingStage == 30) { // L: 1591
			class466.field4812 = FriendSystem.newArchive(0, false, true, true, false); // L: 1592
			Actor.field1223 = FriendSystem.newArchive(1, false, true, true, false); // L: 1593
			MouseRecorder.archive2 = FriendSystem.newArchive(2, true, false, true, false); // L: 1594
			BuddyRankComparator.archive7 = FriendSystem.newArchive(3, false, true, true, false); // L: 1595
			LoginScreenAnimation.archive4 = FriendSystem.newArchive(4, false, true, true, false); // L: 1596
			class305.archive9 = FriendSystem.newArchive(5, true, true, true, false); // L: 1597
			ReflectionCheck.archive6 = FriendSystem.newArchive(6, true, true, true, false); // L: 1598
			FontName.archive11 = FriendSystem.newArchive(7, false, true, true, false); // L: 1599
			class180.archive8 = FriendSystem.newArchive(8, false, true, true, false); // L: 1600
			Language.field4347 = FriendSystem.newArchive(9, false, true, true, false); // L: 1601
			class53.archive10 = FriendSystem.newArchive(10, false, true, true, false); // L: 1602
			ViewportMouse.field2770 = FriendSystem.newArchive(11, false, true, true, false); // L: 1603
			class33.archive12 = FriendSystem.newArchive(12, false, true, true, false); // L: 1604
			class310.archive13 = FriendSystem.newArchive(13, true, false, true, false); // L: 1605
			GrandExchangeOffer.archive14 = FriendSystem.newArchive(14, false, true, true, false); // L: 1606
			class17.archive15 = FriendSystem.newArchive(15, false, true, true, false); // L: 1607
			Language.archive17 = FriendSystem.newArchive(17, true, true, true, false); // L: 1608
			class350.archive18 = FriendSystem.newArchive(18, false, true, true, false); // L: 1609
			ChatChannel.archive19 = FriendSystem.newArchive(19, false, true, true, false); // L: 1610
			class291.archive20 = FriendSystem.newArchive(20, false, true, true, false); // L: 1611
			Messages.field1377 = FriendSystem.newArchive(21, false, true, true, true); // L: 1612
			Login.Login_loadingText = "Connecting to update server"; // L: 1613
			Login.Login_loadingPercent = 20; // L: 1614
			Client.titleLoadingStage = 40; // L: 1615
		} else if (Client.titleLoadingStage == 40) { // L: 1618
			byte var41 = 0; // L: 1619
			var18 = var41 + class466.field4812.percentage() * 4 / 100; // L: 1620
			var18 += Actor.field1223.percentage() * 4 / 100; // L: 1621
			var18 += MouseRecorder.archive2.percentage() * 2 / 100; // L: 1622
			var18 += BuddyRankComparator.archive7.percentage() * 2 / 100; // L: 1623
			var18 += LoginScreenAnimation.archive4.percentage() * 6 / 100; // L: 1624
			var18 += class305.archive9.percentage() * 4 / 100; // L: 1625
			var18 += ReflectionCheck.archive6.percentage() * 2 / 100; // L: 1626
			var18 += FontName.archive11.percentage() * 55 / 100; // L: 1627
			var18 += class180.archive8.percentage() * 2 / 100; // L: 1628
			var18 += Language.field4347.percentage() * 2 / 100; // L: 1629
			var18 += class53.archive10.percentage() * 2 / 100; // L: 1630
			var18 += ViewportMouse.field2770.percentage() * 2 / 100; // L: 1631
			var18 += class33.archive12.percentage() * 2 / 100; // L: 1632
			var18 += class310.archive13.percentage() * 2 / 100; // L: 1633
			var18 += GrandExchangeOffer.archive14.percentage() * 2 / 100; // L: 1634
			var18 += class17.archive15.percentage() * 2 / 100; // L: 1635
			var18 += ChatChannel.archive19.percentage() / 100; // L: 1636
			var18 += class350.archive18.percentage() / 100; // L: 1637
			var18 += class291.archive20.percentage() / 100; // L: 1638
			var18 += Messages.field1377.percentage() / 100; // L: 1639
			var18 += Language.archive17.method6647() && Language.archive17.isFullyLoaded() ? 1 : 0; // L: 1640
			if (var18 != 100) { // L: 1641
				if (var18 != 0) { // L: 1642
					Login.Login_loadingText = "Checking for updates - " + var18 + "%";
				}

				Login.Login_loadingPercent = 30; // L: 1643
			} else {
				method3070(class466.field4812, "Animations"); // L: 1646
				method3070(Actor.field1223, "Skeletons"); // L: 1647
				method3070(LoginScreenAnimation.archive4, "Sound FX"); // L: 1648
				method3070(class305.archive9, "Maps"); // L: 1649
				method3070(ReflectionCheck.archive6, "Music Tracks"); // L: 1650
				method3070(FontName.archive11, "Models"); // L: 1651
				method3070(class180.archive8, "Sprites"); // L: 1652
				method3070(ViewportMouse.field2770, "Music Jingles"); // L: 1653
				method3070(GrandExchangeOffer.archive14, "Music Samples"); // L: 1654
				method3070(class17.archive15, "Music Patches"); // L: 1655
				method3070(ChatChannel.archive19, "World Map"); // L: 1656
				method3070(class350.archive18, "World Map Geography"); // L: 1657
				method3070(class291.archive20, "World Map Ground"); // L: 1658
				FontName.spriteIds = new GraphicsDefaults(); // L: 1659
				FontName.spriteIds.decode(Language.archive17); // L: 1660
				Login.Login_loadingText = "Loaded update list"; // L: 1661
				Login.Login_loadingPercent = 30; // L: 1662
				Client.titleLoadingStage = 45; // L: 1663
			}
		} else {
			Archive var2;
			Archive var31;
			if (Client.titleLoadingStage == 45) { // L: 1666
				WorldMapScaleHandler.method5595(22050, !Client.isLowDetail, 2); // L: 1667
				MidiPcmStream var29 = new MidiPcmStream(); // L: 1668
				var29.method5769(9, 128); // L: 1669
				MouseRecorder.pcmPlayer0 = ObjectComposition.method3907(GameEngine.taskHandler, 0, 22050); // L: 1670
				MouseRecorder.pcmPlayer0.setStream(var29); // L: 1671
				var31 = class17.archive15; // L: 1672
				var2 = GrandExchangeOffer.archive14; // L: 1673
				Archive var39 = LoginScreenAnimation.archive4; // L: 1674
				class304.musicPatchesArchive = var31; // L: 1676
				class304.musicSamplesArchive = var2; // L: 1677
				class304.soundEffectsArchive = var39; // L: 1678
				class304.midiPcmStream = var29; // L: 1679
				class290.pcmPlayer1 = ObjectComposition.method3907(GameEngine.taskHandler, 1, 2048); // L: 1681
				KitDefinition.pcmStreamMixer = new PcmStreamMixer(); // L: 1682
				class290.pcmPlayer1.setStream(KitDefinition.pcmStreamMixer); // L: 1683
				FloorOverlayDefinition.field2259 = new Decimator(22050, PcmPlayer.field291); // L: 1684
				Login.Login_loadingText = "Prepared sound engine"; // L: 1685
				Login.Login_loadingPercent = 35; // L: 1686
				Client.titleLoadingStage = 50; // L: 1687
				class490.WorldMapElement_fonts = new Fonts(class180.archive8, class310.archive13); // L: 1688
			} else {
				int var19;
				if (Client.titleLoadingStage == 50) { // L: 1691
					FontName[] var28 = new FontName[]{FontName.FontName_plain12, FontName.FontName_bold12, FontName.FontName_verdana13, FontName.FontName_verdana11, FontName.FontName_verdana15, FontName.FontName_plain11}; // L: 1694
					var19 = var28.length; // L: 1696
					Fonts var30 = class490.WorldMapElement_fonts; // L: 1697
					FontName[] var38 = new FontName[]{FontName.FontName_plain12, FontName.FontName_bold12, FontName.FontName_verdana13, FontName.FontName_verdana11, FontName.FontName_verdana15, FontName.FontName_plain11}; // L: 1700
					Client.fontsMap = var30.createMap(var38); // L: 1702
					if (Client.fontsMap.size() < var19) { // L: 1703
						Login.Login_loadingText = "Loading fonts - " + Client.fontsMap.size() * 100 / var19 + "%"; // L: 1704
						Login.Login_loadingPercent = 40; // L: 1705
					} else {
						MouseHandler.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11); // L: 1708
						class404.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12); // L: 1709
						class166.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12); // L: 1710
						ChatChannel.platformInfo = Client.platformInfoProvider.get(); // L: 1711
						Login.Login_loadingText = "Loaded fonts"; // L: 1712
						Login.Login_loadingPercent = 40; // L: 1713
						Client.titleLoadingStage = 60; // L: 1714
					}
				} else {
					int var3;
					if (Client.titleLoadingStage == 60) { // L: 1717
						var18 = WorldMapScaleHandler.method5598(class53.archive10, class180.archive8); // L: 1718
						var2 = class180.archive8; // L: 1720
						var3 = Login.field953.length + Login.field952.length; // L: 1722
						String[] var40 = Login.field933; // L: 1724

						for (int var25 = 0; var25 < var40.length; ++var25) { // L: 1725
							String var35 = var40[var25]; // L: 1726
							if (var2.getGroupId(var35) != -1) { // L: 1728
								++var3; // L: 1729
							}
						}

						if (var18 < var3) { // L: 1737
							Login.Login_loadingText = "Loading title screen - " + var18 * 100 / var3 + "%"; // L: 1738
							Login.Login_loadingPercent = 50; // L: 1739
						} else {
							Login.Login_loadingText = "Loaded title screen"; // L: 1742
							Login.Login_loadingPercent = 50; // L: 1743
							UserComparator8.method2855(5); // L: 1744
							Client.titleLoadingStage = 70; // L: 1745
						}
					} else if (Client.titleLoadingStage == 70) { // L: 1748
						if (!MouseRecorder.archive2.isFullyLoaded()) { // L: 1749
							Login.Login_loadingText = "Loading config - " + MouseRecorder.archive2.loadPercent() + "%"; // L: 1750
							Login.Login_loadingPercent = 60; // L: 1751
						} else if (!Messages.field1377.isFullyLoaded()) { // L: 1754
							Login.Login_loadingText = "Loading config - " + (80 + class33.archive12.loadPercent() / 6) + "%"; // L: 1755
							Login.Login_loadingPercent = 60; // L: 1756
						} else {
							class164.method3365(MouseRecorder.archive2); // L: 1759
							class323.method6002(MouseRecorder.archive2); // L: 1760
							UserComparator9.method2876(MouseRecorder.archive2, FontName.archive11); // L: 1761
							ScriptFrame.method1148(MouseRecorder.archive2, FontName.archive11, Client.isLowDetail); // L: 1762
							UserComparator4.method2847(MouseRecorder.archive2, FontName.archive11); // L: 1763
							class17.method244(MouseRecorder.archive2); // L: 1764
							Archive var27 = MouseRecorder.archive2; // L: 1765
							var31 = FontName.archive11; // L: 1766
							boolean var37 = Client.isMembersWorld; // L: 1767
							Font var21 = MouseHandler.fontPlain11; // L: 1768
							ItemComposition.ItemComposition_archive = var27; // L: 1770
							ItemComposition.ItemComposition_modelArchive = var31; // L: 1771
							ItemComposition.ItemComposition_inMembersWorld = var37; // L: 1772
							class435.ItemComposition_fileCount = ItemComposition.ItemComposition_archive.getGroupFileCount(10); // L: 1773
							class259.ItemComposition_fontPlain11 = var21; // L: 1774
							FriendLoginUpdate.method7785(MouseRecorder.archive2, class466.field4812, Actor.field1223); // L: 1776
							ObjectSound.method1883(MouseRecorder.archive2, FontName.archive11); // L: 1777
							Archive var22 = MouseRecorder.archive2; // L: 1778
							VarbitComposition.VarbitDefinition_archive = var22; // L: 1780
							Archive var32 = MouseRecorder.archive2; // L: 1782
							class305.VarpDefinition_archive = var32; // L: 1784
							VarpDefinition.field1903 = class305.VarpDefinition_archive.getGroupFileCount(16); // L: 1785
							Archive var33 = BuddyRankComparator.archive7; // L: 1787
							Archive var23 = FontName.archive11; // L: 1788
							Archive var36 = class180.archive8; // L: 1789
							Archive var9 = class310.archive13; // L: 1790
							int var10 = 0; // L: 1792
							if (var33 != null) { // L: 1793
								Widget.Widget_archive = var33; // L: 1794
								class309.field3453 = var23; // L: 1795
								MenuAction.Widget_spritesArchive = var36; // L: 1796
								class13.Widget_fontsArchive = var9; // L: 1797
								var10 = Widget.Widget_archive.getGroupCount(); // L: 1798
							}

							class16.Widget_interfaceComponents = new Widget[var10][]; // L: 1800
							class143.Widget_loadedInterfaces = new boolean[var10]; // L: 1801
							WorldMapSection1.method5501(MouseRecorder.archive2); // L: 1803
							class140.method3112(MouseRecorder.archive2); // L: 1804
							Archive var24 = MouseRecorder.archive2; // L: 1805
							VarcInt.VarcInt_archive = var24; // L: 1807
							class133.method3038(MouseRecorder.archive2); // L: 1809
							Archive var11 = MouseRecorder.archive2; // L: 1810
							ParamComposition.ParamDefinition_archive = var11; // L: 1812
							class386.method7207(MouseRecorder.archive2); // L: 1814
							Archive var12 = MouseRecorder.archive2; // L: 1815
							class495.field4997 = var12; // L: 1817
							GraphicsObject.HitSplatDefinition_cachedSprites = new class485(GameBuild.field3841, 54, TriBool.clientLanguage, MouseRecorder.archive2); // L: 1819
							HealthBar.Ignored_cached = new class485(GameBuild.field3841, 47, TriBool.clientLanguage, MouseRecorder.archive2); // L: 1820
							MouseHandler.varcs = new Varcs(); // L: 1821
							Archive var13 = MouseRecorder.archive2; // L: 1822
							Archive var14 = class180.archive8; // L: 1823
							Archive var15 = class310.archive13; // L: 1824
							HitSplatDefinition.HitSplatDefinition_archive = var13; // L: 1826
							HitSplatDefinition.field2118 = var14; // L: 1827
							HitSplatDefinition.HitSplatDefinition_fontsArchive = var15; // L: 1828
							Archive var16 = MouseRecorder.archive2; // L: 1830
							Archive var17 = class180.archive8; // L: 1831
							HealthBarDefinition.HealthBarDefinition_archive = var16; // L: 1833
							HealthBarDefinition.field1952 = var17; // L: 1834
							World.method1798(MouseRecorder.archive2, class180.archive8); // L: 1836
							Login.Login_loadingText = "Loaded config"; // L: 1837
							Login.Login_loadingPercent = 60; // L: 1838
							Client.titleLoadingStage = 80; // L: 1839
						}
					} else if (Client.titleLoadingStage == 80) { // L: 1842
						var18 = 0; // L: 1843
						if (class304.compass == null) { // L: 1844
							class304.compass = class107.SpriteBuffer_getSprite(class180.archive8, FontName.spriteIds.compass, 0);
						} else {
							++var18; // L: 1845
						}

						if (class404.redHintArrowSprite == null) { // L: 1846
							class404.redHintArrowSprite = class107.SpriteBuffer_getSprite(class180.archive8, FontName.spriteIds.field4654, 0);
						} else {
							++var18; // L: 1847
						}

						IndexedSprite[] var1;
						boolean var4;
						byte[] var5;
						IndexedSprite[] var6;
						int var7;
						IndexedSprite var8;
						if (class47.mapSceneSprites == null) { // L: 1848
							var2 = class180.archive8; // L: 1850
							var3 = FontName.spriteIds.mapScenes; // L: 1851
							var5 = var2.takeFile(var3, 0); // L: 1855
							if (var5 == null) { // L: 1856
								var4 = false; // L: 1857
							} else {
								UserComparator2.SpriteBuffer_decode(var5); // L: 1860
								var4 = true; // L: 1861
							}

							if (!var4) { // L: 1863
								var1 = null; // L: 1864
							} else {
								var6 = new IndexedSprite[class515.SpriteBuffer_spriteCount]; // L: 1869

								for (var7 = 0; var7 < class515.SpriteBuffer_spriteCount; ++var7) { // L: 1870
									var8 = var6[var7] = new IndexedSprite(); // L: 1871
									var8.width = class330.SpriteBuffer_spriteWidth; // L: 1872
									var8.height = class489.SpriteBuffer_spriteHeight; // L: 1873
									var8.xOffset = class515.SpriteBuffer_xOffsets[var7]; // L: 1874
									var8.yOffset = class402.SpriteBuffer_yOffsets[var7]; // L: 1875
									var8.subWidth = class515.SpriteBuffer_spriteWidths[var7]; // L: 1876
									var8.subHeight = class515.SpriteBuffer_spriteHeights[var7]; // L: 1877
									var8.palette = class515.SpriteBuffer_spritePalette; // L: 1878
									var8.pixels = class515.SpriteBuffer_pixels[var7]; // L: 1879
								}

								TextureProvider.method4758(); // L: 1881
								var1 = var6; // L: 1884
							}

							class47.mapSceneSprites = var1; // L: 1886
						} else {
							++var18; // L: 1888
						}

						if (NPCComposition.headIconPkSprites == null) { // L: 1889
							NPCComposition.headIconPkSprites = WorldMapScaleHandler.method5597(class180.archive8, FontName.spriteIds.headIconsPk, 0);
						} else {
							++var18; // L: 1890
						}

						if (class157.headIconPrayerSprites == null) { // L: 1891
							class157.headIconPrayerSprites = WorldMapScaleHandler.method5597(class180.archive8, FontName.spriteIds.field4657, 0);
						} else {
							++var18; // L: 1892
						}

						if (ReflectionCheck.headIconHintSprites == null) { // L: 1893
							ReflectionCheck.headIconHintSprites = WorldMapScaleHandler.method5597(class180.archive8, FontName.spriteIds.field4658, 0);
						} else {
							++var18; // L: 1894
						}

						if (LoginScreenAnimation.mapMarkerSprites == null) { // L: 1895
							LoginScreenAnimation.mapMarkerSprites = WorldMapScaleHandler.method5597(class180.archive8, FontName.spriteIds.field4655, 0);
						} else {
							++var18; // L: 1896
						}

						if (class12.crossSprites == null) { // L: 1897
							class12.crossSprites = WorldMapScaleHandler.method5597(class180.archive8, FontName.spriteIds.field4660, 0);
						} else {
							++var18; // L: 1898
						}

						if (class19.mapDotSprites == null) { // L: 1899
							class19.mapDotSprites = WorldMapScaleHandler.method5597(class180.archive8, FontName.spriteIds.field4661, 0);
						} else {
							++var18; // L: 1900
						}

						if (class411.scrollBarSprites == null) { // L: 1901
							var2 = class180.archive8; // L: 1903
							var3 = FontName.spriteIds.field4662; // L: 1904
							var5 = var2.takeFile(var3, 0); // L: 1908
							if (var5 == null) { // L: 1909
								var4 = false; // L: 1910
							} else {
								UserComparator2.SpriteBuffer_decode(var5); // L: 1913
								var4 = true; // L: 1914
							}

							if (!var4) { // L: 1916
								var1 = null; // L: 1917
							} else {
								var6 = new IndexedSprite[class515.SpriteBuffer_spriteCount]; // L: 1922

								for (var7 = 0; var7 < class515.SpriteBuffer_spriteCount; ++var7) { // L: 1923
									var8 = var6[var7] = new IndexedSprite(); // L: 1924
									var8.width = class330.SpriteBuffer_spriteWidth; // L: 1925
									var8.height = class489.SpriteBuffer_spriteHeight; // L: 1926
									var8.xOffset = class515.SpriteBuffer_xOffsets[var7]; // L: 1927
									var8.yOffset = class402.SpriteBuffer_yOffsets[var7]; // L: 1928
									var8.subWidth = class515.SpriteBuffer_spriteWidths[var7]; // L: 1929
									var8.subHeight = class515.SpriteBuffer_spriteHeights[var7]; // L: 1930
									var8.palette = class515.SpriteBuffer_spritePalette; // L: 1931
									var8.pixels = class515.SpriteBuffer_pixels[var7]; // L: 1932
								}

								TextureProvider.method4758(); // L: 1934
								var1 = var6; // L: 1937
							}

							class411.scrollBarSprites = var1; // L: 1939
						} else {
							++var18; // L: 1941
						}

						if (VerticalAlignment.modIconSprites == null) { // L: 1942
							var2 = class180.archive8; // L: 1944
							var3 = FontName.spriteIds.field4659; // L: 1945
							var5 = var2.takeFile(var3, 0); // L: 1949
							if (var5 == null) { // L: 1950
								var4 = false; // L: 1951
							} else {
								UserComparator2.SpriteBuffer_decode(var5); // L: 1954
								var4 = true; // L: 1955
							}

							if (!var4) { // L: 1957
								var1 = null; // L: 1958
							} else {
								var6 = new IndexedSprite[class515.SpriteBuffer_spriteCount]; // L: 1963

								for (var7 = 0; var7 < class515.SpriteBuffer_spriteCount; ++var7) { // L: 1964
									var8 = var6[var7] = new IndexedSprite(); // L: 1965
									var8.width = class330.SpriteBuffer_spriteWidth; // L: 1966
									var8.height = class489.SpriteBuffer_spriteHeight; // L: 1967
									var8.xOffset = class515.SpriteBuffer_xOffsets[var7]; // L: 1968
									var8.yOffset = class402.SpriteBuffer_yOffsets[var7]; // L: 1969
									var8.subWidth = class515.SpriteBuffer_spriteWidths[var7]; // L: 1970
									var8.subHeight = class515.SpriteBuffer_spriteHeights[var7]; // L: 1971
									var8.palette = class515.SpriteBuffer_spritePalette; // L: 1972
									var8.pixels = class515.SpriteBuffer_pixels[var7]; // L: 1973
								}

								TextureProvider.method4758(); // L: 1975
								var1 = var6; // L: 1978
							}

							VerticalAlignment.modIconSprites = var1; // L: 1980
						} else {
							++var18; // L: 1982
						}

						if (var18 < 11) { // L: 1983
							Login.Login_loadingText = "Loading sprites - " + var18 * 100 / 12 + "%"; // L: 1984
							Login.Login_loadingPercent = 70; // L: 1985
						} else {
							AbstractFont.AbstractFont_modIconSprites = VerticalAlignment.modIconSprites; // L: 1988
							class404.redHintArrowSprite.normalize(); // L: 1989
							var19 = (int)(Math.random() * 21.0D) - 10; // L: 1990
							int var20 = (int)(Math.random() * 21.0D) - 10; // L: 1991
							var3 = (int)(Math.random() * 21.0D) - 10; // L: 1992
							int var34 = (int)(Math.random() * 41.0D) - 20; // L: 1993
							class47.mapSceneSprites[0].shiftColors(var34 + var19, var34 + var20, var3 + var34); // L: 1994
							Login.Login_loadingText = "Loaded sprites"; // L: 1995
							Login.Login_loadingPercent = 70; // L: 1996
							Client.titleLoadingStage = 90; // L: 1997
						}
					} else if (Client.titleLoadingStage == 90) { // L: 2000
						if (!Language.field4347.isFullyLoaded()) { // L: 2001
							Login.Login_loadingText = "Loading textures - " + "0%"; // L: 2002
							Login.Login_loadingPercent = 90; // L: 2003
						} else {
							Messages.textureProvider = new TextureProvider(Language.field4347, class180.archive8, 20, class10.clientPreferences.method2430(), Client.isLowDetail ? 64 : 128); // L: 2006
							Rasterizer3D.method4371(Messages.textureProvider); // L: 2007
							Rasterizer3D.method4372(class10.clientPreferences.method2430()); // L: 2008
							Client.titleLoadingStage = 100; // L: 2009
						}
					} else if (Client.titleLoadingStage == 100) { // L: 2012
						var18 = Messages.textureProvider.getLoadedPercentage(); // L: 2013
						if (var18 < 100) { // L: 2014
							Login.Login_loadingText = "Loading textures - " + var18 + "%"; // L: 2015
							Login.Login_loadingPercent = 90; // L: 2016
						} else {
							Login.Login_loadingText = "Loaded textures"; // L: 2019
							Login.Login_loadingPercent = 90; // L: 2020
							Client.titleLoadingStage = 110; // L: 2021
						}
					} else if (Client.titleLoadingStage == 110) { // L: 2024
						class85.mouseRecorder = new MouseRecorder(); // L: 2025
						GameEngine.taskHandler.newThreadTask(class85.mouseRecorder, 10); // L: 2026
						Login.Login_loadingText = "Loaded input handler"; // L: 2027
						Login.Login_loadingPercent = 92; // L: 2028
						Client.titleLoadingStage = 120; // L: 2029
					} else if (Client.titleLoadingStage == 120) { // L: 2032
						if (!class53.archive10.tryLoadFileByNames("huffman", "")) { // L: 2033
							Login.Login_loadingText = "Loading wordpack - " + 0 + "%"; // L: 2034
							Login.Login_loadingPercent = 94; // L: 2035
						} else {
							Huffman var26 = new Huffman(class53.archive10.takeFileByNames("huffman", "")); // L: 2038
							class332.huffman = var26; // L: 2040
							Login.Login_loadingText = "Loaded wordpack"; // L: 2042
							Login.Login_loadingPercent = 94; // L: 2043
							Client.titleLoadingStage = 130; // L: 2044
						}
					} else if (Client.titleLoadingStage == 130) { // L: 2047
						if (!BuddyRankComparator.archive7.isFullyLoaded()) { // L: 2048
							Login.Login_loadingText = "Loading interfaces - " + BuddyRankComparator.archive7.loadPercent() * 4 / 5 + "%"; // L: 2049
							Login.Login_loadingPercent = 96; // L: 2050
						} else if (!class33.archive12.isFullyLoaded()) { // L: 2053
							Login.Login_loadingText = "Loading interfaces - " + (80 + class33.archive12.loadPercent() / 6) + "%"; // L: 2054
							Login.Login_loadingPercent = 96; // L: 2055
						} else if (!class310.archive13.isFullyLoaded()) { // L: 2058
							Login.Login_loadingText = "Loading interfaces - " + (96 + class310.archive13.loadPercent() / 50) + "%"; // L: 2059
							Login.Login_loadingPercent = 96; // L: 2060
						} else {
							Login.Login_loadingText = "Loaded interfaces"; // L: 2063
							Login.Login_loadingPercent = 98; // L: 2064
							if (class33.archive12.isValidFileName("version.dat", "")) { // L: 2065
								Buffer var0 = new Buffer(class33.archive12.takeFileByNames("version.dat", "")); // L: 2066
								var0.readUnsignedShort(); // L: 2067
							}

							Client.titleLoadingStage = 140; // L: 2069
						}
					} else if (Client.titleLoadingStage == 140) { // L: 2072
						Login.Login_loadingPercent = 100; // L: 2073
						if (ChatChannel.archive19.getGroupCount() > 0 && !ChatChannel.archive19.tryLoadGroupByName(WorldMapCacheName.field3049.name)) { // L: 2074
							Login.Login_loadingText = "Loading world map - " + ChatChannel.archive19.groupLoadPercentByName(WorldMapCacheName.field3049.name) / 10 + "%"; // L: 2075
						} else {
							if (ScriptFrame.worldMap == null) { // L: 2078
								ScriptFrame.worldMap = new WorldMap(); // L: 2079
								ScriptFrame.worldMap.init(ChatChannel.archive19, class350.archive18, class291.archive20, class166.fontBold12, Client.fontsMap, class47.mapSceneSprites); // L: 2080
							}

							Login.Login_loadingText = "Loaded world map"; // L: 2082
							Client.titleLoadingStage = 150; // L: 2083
						}
					} else if (Client.titleLoadingStage == 150) { // L: 2086
						UserComparator8.method2855(10); // L: 2087
					}
				}
			}
		}
	} // L: 1583 1589 1616 1644 1664 1689 1706 1715 1740 1746 1752 1757 1840 1986 1998 2004 2010 2017 2022 2030 2036 2045 2051 2056 2061 2070 2076 2084 2088 2090

	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "31"
	)
	@Export("Widget_resetModelFrames")
	static final void Widget_resetModelFrames(int var0) {
		if (Client.loadInterface(var0)) { // L: 12124
			Widget[] var1 = class16.Widget_interfaceComponents[var0]; // L: 12125

			for (int var2 = 0; var2 < var1.length; ++var2) { // L: 12126
				Widget var3 = var1[var2]; // L: 12127
				if (var3 != null) { // L: 12128
					var3.modelFrame = 0; // L: 12129
					var3.modelFrameCycle = 0; // L: 12130
				}
			}

		}
	} // L: 12132

	@ObfuscatedName("mk")
	@ObfuscatedSignature(
		descriptor = "(IIIILtm;Lmc;B)V",
		garbageValue = "-72"
	)
	@Export("worldToMinimap")
	static final void worldToMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		int var6 = var3 * var3 + var2 * var2; // L: 12509
		if (var6 > 4225 && var6 < 90000) { // L: 12510
			int var7 = Client.camAngleY & 2047; // L: 12511
			int var8 = Rasterizer3D.Rasterizer3D_sine[var7]; // L: 12512
			int var9 = Rasterizer3D.Rasterizer3D_cosine[var7]; // L: 12513
			int var10 = var9 * var2 + var3 * var8 >> 16; // L: 12514
			int var11 = var3 * var9 - var8 * var2 >> 16; // L: 12515
			double var12 = Math.atan2((double)var10, (double)var11); // L: 12516
			int var14 = var5.width / 2 - 25; // L: 12517
			int var15 = (int)(Math.sin(var12) * (double)var14); // L: 12518
			int var16 = (int)(Math.cos(var12) * (double)var14); // L: 12519
			byte var17 = 20; // L: 12520
			class404.redHintArrowSprite.method9412(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256); // L: 12521
		} else {
			class59.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5); // L: 12523
		}

	} // L: 12524
}
