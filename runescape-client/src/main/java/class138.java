import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
public class class138 extends DualNode {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1871715735
	)
	int field1602;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[[Lfx;"
	)
	public class131[][] field1598;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[[Lfx;"
	)
	class131[][] field1599;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	public Skeleton field1601;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 189412585
	)
	int field1604;
	@ObfuscatedName("ar")
	boolean field1603;
	@ObfuscatedName("ae")
	Future field1600;
	@ObfuscatedName("aa")
	List field1597;

	@ObfuscatedSignature(
		descriptor = "(Low;Low;IZ)V",
		garbageValue = "0"
	)
	public class138(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		this.field1598 = null; // L: 21
		this.field1599 = null; // L: 22
		this.field1604 = 0; // L: 24
		this.field1602 = var3; // L: 32
		byte[] var5 = var1.takeFile(this.field1602 >> 16 & 65535, this.field1602 & 65535); // L: 33
		Buffer var6 = new Buffer(var5); // L: 34
		int var7 = var6.readUnsignedByte(); // L: 35
		int var8 = var6.readUnsignedShort(); // L: 36
		byte[] var9 = var2.getFile(var8, 0); // L: 39
		this.field1601 = new Skeleton(var8, var9); // L: 40
		this.field1597 = new ArrayList(); // L: 41
		this.field1600 = class18.field85.submit(new class135(this, var6, var7)); // L: 42
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Luk;IB)V",
		garbageValue = "-101"
	)
	void method3158(Buffer var1, int var2) {
		var1.readUnsignedShort(); // L: 52
		var1.readUnsignedShort(); // L: 53
		this.field1604 = var1.readUnsignedByte(); // L: 54
		int var3 = var1.readUnsignedShort(); // L: 55
		this.field1599 = new class131[this.field1601.method5373().method5323()][]; // L: 56
		this.field1598 = new class131[this.field1601.method5372()][]; // L: 57
		class130[] var4 = new class130[var3]; // L: 58

		int var5;
		int var7;
		int var9;
		for (var5 = 0; var5 < var3; ++var5) { // L: 59
			var7 = var1.readUnsignedByte(); // L: 61
			class132 var14 = (class132)GrandExchangeEvents.findEnumerated(BuddyRankComparator.method2996(), var7); // L: 63
			if (var14 == null) { // L: 64
				var14 = class132.field1555;
			}

			var9 = var1.readShortSmart(); // L: 68
			class133 var16 = class53.method1096(var1.readUnsignedByte()); // L: 69
			class131 var17 = new class131(); // L: 70
			var17.method3083(var1, var2); // L: 71
			var4[var5] = new class130(this, var17, var14, var16, var9); // L: 72
			int var12 = var14.method3117(); // L: 73
			class131[][] var13;
			if (var14 == class132.field1553) { // L: 75
				var13 = this.field1599; // L: 76
			} else {
				var13 = this.field1598; // L: 79
			}

			if (var13[var9] == null) { // L: 81
				var13[var9] = new class131[var12]; // L: 82
			}

			if (var14 == class132.field1556) { // L: 84
				this.field1603 = true; // L: 85
			}
		}

		var5 = var3 / class74.field897; // L: 88
		int var6 = var3 % class74.field897; // L: 89
		int var8 = 0; // L: 91

		for (var9 = 0; var9 < class74.field897; ++var9) { // L: 92
			var7 = var8; // L: 93
			var8 += var5; // L: 94
			if (var6 > 0) { // L: 95
				++var8; // L: 96
				--var6; // L: 97
			}

			if (var8 == var7) { // L: 99
				break;
			}

			this.field1597.add(class18.field85.submit(new class137(this, var7, var8, var4))); // L: 104
		}

	} // L: 114

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "714723337"
	)
	public boolean method3159() {
		if (this.field1600 == null && this.field1597 == null) { // L: 117
			return true; // L: 118
		} else {
			if (this.field1600 != null) { // L: 120
				if (!this.field1600.isDone()) { // L: 121
					return false; // L: 122
				}

				this.field1600 = null; // L: 124
			}

			boolean var1 = true; // L: 126

			for (int var2 = 0; var2 < this.field1597.size(); ++var2) { // L: 127
				if (!((Future)this.field1597.get(var2)).isDone()) { // L: 128
					var1 = false; // L: 129
				} else {
					this.field1597.remove(var2); // L: 132
					--var2; // L: 133
				}
			}

			if (!var1) { // L: 136
				return false; // L: 137
			} else {
				this.field1597 = null; // L: 139
				return true; // L: 140
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-50964561"
	)
	public int method3160() {
		return this.field1604; // L: 144
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1751305567"
	)
	public boolean method3161() {
		return this.field1603; // L: 148
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILez;III)V",
		garbageValue = "-1787937822"
	)
	public void method3162(int var1, class128 var2, int var3, int var4) {
		class466 var5 = class255.method5035(); // L: 152
		this.method3163(var5, var3, var2, var1); // L: 153
		this.method3183(var5, var3, var2, var1); // L: 154
		this.method3164(var5, var3, var2, var1); // L: 155
		var2.method3053(var5); // L: 156
		var5.method8559(); // L: 157
	} // L: 158

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lrh;ILez;II)V",
		garbageValue = "284391843"
	)
	void method3163(class466 var1, int var2, class128 var3, int var4) {
		float[] var5 = var3.method3051(this.field1604); // L: 161
		float var6 = var5[0]; // L: 162
		float var7 = var5[1]; // L: 163
		float var8 = var5[2]; // L: 164
		if (this.field1599[var2] != null) { // L: 165
			class131 var9 = this.field1599[var2][0]; // L: 166
			class131 var10 = this.field1599[var2][1]; // L: 167
			class131 var11 = this.field1599[var2][2]; // L: 168
			if (var9 != null) { // L: 169
				var6 = var9.method3086(var4);
			}

			if (var10 != null) { // L: 170
				var7 = var10.method3086(var4);
			}

			if (var11 != null) { // L: 171
				var8 = var11.method3086(var4);
			}
		}

		class465 var22;
		synchronized(class465.field4800) { // L: 175
			if (class465.field4801 == 0) { // L: 176
				var22 = new class465();
			} else {
				class465.field4800[--class465.field4801].method8515(); // L: 178
				var22 = class465.field4800[class465.field4801]; // L: 179
			}
		}

		var22.method8514(1.0F, 0.0F, 0.0F, var6); // L: 184
		class465 var23;
		synchronized(class465.field4800) { // L: 187
			if (class465.field4801 == 0) { // L: 188
				var23 = new class465();
			} else {
				class465.field4800[--class465.field4801].method8515(); // L: 190
				var23 = class465.field4800[class465.field4801]; // L: 191
			}
		}

		var23.method8514(0.0F, 1.0F, 0.0F, var7); // L: 196
		class465 var13;
		synchronized(class465.field4800) { // L: 199
			if (class465.field4801 == 0) { // L: 200
				var13 = new class465();
			} else {
				class465.field4800[--class465.field4801].method8515(); // L: 202
				var13 = class465.field4800[class465.field4801]; // L: 203
			}
		}

		var13.method8514(0.0F, 0.0F, 1.0F, var8); // L: 208
		class465 var15;
		synchronized(class465.field4800) { // L: 211
			if (class465.field4801 == 0) { // L: 212
				var15 = new class465();
			} else {
				class465.field4800[--class465.field4801].method8515(); // L: 214
				var15 = class465.field4800[class465.field4801]; // L: 215
			}
		}

		var15.method8531(var13); // L: 220
		var15.method8531(var22); // L: 221
		var15.method8531(var23); // L: 222
		class466 var17 = class255.method5035(); // L: 223
		var17.method8590(var15); // L: 224
		var1.method8552(var17); // L: 225
		var22.method8533(); // L: 226
		var23.method8533(); // L: 227
		var13.method8533(); // L: 228
		var15.method8533(); // L: 229
		var17.method8559(); // L: 230
	} // L: 231

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lrh;ILez;IB)V",
		garbageValue = "9"
	)
	void method3164(class466 var1, int var2, class128 var3, int var4) {
		float[] var5 = var3.method3054(this.field1604); // L: 234
		float var6 = var5[0]; // L: 235
		float var7 = var5[1]; // L: 236
		float var8 = var5[2]; // L: 237
		if (this.field1599[var2] != null) { // L: 238
			class131 var9 = this.field1599[var2][3]; // L: 239
			class131 var10 = this.field1599[var2][4]; // L: 240
			class131 var11 = this.field1599[var2][5]; // L: 241
			if (var9 != null) { // L: 242
				var6 = var9.method3086(var4);
			}

			if (var10 != null) { // L: 243
				var7 = var10.method3086(var4);
			}

			if (var11 != null) { // L: 244
				var8 = var11.method3086(var4);
			}
		}

		var1.field4809[12] = var6; // L: 246
		var1.field4809[13] = var7; // L: 247
		var1.field4809[14] = var8; // L: 248
	} // L: 249

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lrh;ILez;II)V",
		garbageValue = "-1361275855"
	)
	void method3183(class466 var1, int var2, class128 var3, int var4) {
		float[] var5 = var3.method3040(this.field1604); // L: 252
		float var6 = var5[0]; // L: 253
		float var7 = var5[1]; // L: 254
		float var8 = var5[2]; // L: 255
		if (this.field1599[var2] != null) { // L: 256
			class131 var9 = this.field1599[var2][6]; // L: 257
			class131 var10 = this.field1599[var2][7]; // L: 258
			class131 var11 = this.field1599[var2][8]; // L: 259
			if (var9 != null) { // L: 260
				var6 = var9.method3086(var4);
			}

			if (var10 != null) { // L: 261
				var7 = var10.method3086(var4);
			}

			if (var11 != null) { // L: 262
				var8 = var11.method3086(var4);
			}
		}

		class466 var12 = class255.method5035(); // L: 264
		var12.method8579(var6, var7, var8); // L: 265
		var1.method8552(var12); // L: 266
		var12.method8559(); // L: 267
	} // L: 268

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-30"
	)
	public static boolean method3165(int var0) {
		return var0 == WorldMapDecorationType.field3906.id; // L: 47
	}

	@ObfuscatedName("mf")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "37"
	)
	@Export("formatItemStacks")
	static final String formatItemStacks(int var0) {
		String var1 = Integer.toString(var0); // L: 10965

		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) { // L: 10966
			var1 = var1.substring(0, var2) + "," + var1.substring(var2); // L: 10967
		}

		if (var1.length() > 9) { // L: 10969
			return " " + class208.colorStartTag(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")" + "</col>";
		} else {
			return var1.length() > 6 ? " " + class208.colorStartTag(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " (" + var1 + ")" + "</col>" : " " + class208.colorStartTag(16776960) + var1 + "</col>"; // L: 10970 10971
		}
	}
}
