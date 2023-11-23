import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fo")
public class class139 extends DualNode {
	@ObfuscatedName("ac")
	static ThreadPoolExecutor field1595;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -982980799
	)
	int field1599;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[[Lfm;"
	)
	public class131[][] field1596;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[[Lfm;"
	)
	class131[][] field1597;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	public Skeleton field1600;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 808756239
	)
	int field1598;
	@ObfuscatedName("au")
	boolean field1606;
	@ObfuscatedName("al")
	Future field1602;
	@ObfuscatedName("az")
	List field1603;

	@ObfuscatedSignature(
		descriptor = "(Lol;Lol;IZ)V"
	)
	class139(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		this.field1596 = null; // L: 21
		this.field1597 = null; // L: 22
		this.field1598 = 0; // L: 24
		this.field1599 = var3; // L: 62
		byte[] var5 = var1.takeFile(this.field1599 >> 16 & 65535, this.field1599 & 65535); // L: 63
		Buffer var6 = new Buffer(var5); // L: 64
		int var7 = var6.readUnsignedByte(); // L: 65
		int var8 = var6.readUnsignedShort(); // L: 66
		byte[] var9;
		if (var4) { // L: 68
			var9 = var2.getFile(0, var8);
		} else {
			var9 = var2.getFile(var8, 0); // L: 69
		}

		this.field1600 = new Skeleton(var8, var9); // L: 70
		this.field1603 = new ArrayList(); // L: 71
		this.field1602 = field1595.submit(new class138(this, var6, var7)); // L: 72
	} // L: 79

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Luj;II)V",
		garbageValue = "-170957792"
	)
	void method3163(Buffer var1, int var2) {
		var1.readUnsignedShort(); // L: 82
		var1.readUnsignedShort(); // L: 83
		this.field1598 = var1.readUnsignedByte(); // L: 84
		int var3 = var1.readUnsignedShort(); // L: 85
		this.field1597 = new class131[this.field1600.method5317().method5269()][]; // L: 86
		this.field1596 = new class131[this.field1600.method5316()][]; // L: 87
		class130[] var4 = new class130[var3]; // L: 88

		int var5;
		int var7;
		int var9;
		for (var5 = 0; var5 < var3; ++var5) { // L: 89
			var7 = var1.readUnsignedByte(); // L: 91
			class132 var16 = (class132)class12.findEnumerated(Language.method7187(), var7); // L: 93
			if (var16 == null) { // L: 94
				var16 = class132.field1549;
			}

			var9 = var1.readShortSmart(); // L: 98
			int var11 = var1.readUnsignedByte(); // L: 100
			class133[] var12 = new class133[]{class133.field1575, class133.field1559, class133.field1568, class133.field1579, class133.field1562, class133.field1560, class133.field1564, class133.field1565, class133.field1566, class133.field1567, class133.field1563, class133.field1573, class133.field1570, class133.field1571, class133.field1572, class133.field1561, class133.field1569}; // L: 104
			class133 var13 = (class133)class12.findEnumerated(var12, var11); // L: 106
			if (var13 == null) { // L: 107
				var13 = class133.field1575;
			}

			class131 var20 = new class131(); // L: 111
			var20.method3128(var1, var2); // L: 112
			var4[var5] = new class130(this, var20, var16, var13, var9); // L: 113
			int var14 = var16.method3136(); // L: 114
			class131[][] var15;
			if (var16 == class132.field1550) { // L: 116
				var15 = this.field1597; // L: 117
			} else {
				var15 = this.field1596; // L: 120
			}

			if (var15[var9] == null) { // L: 122
				var15[var9] = new class131[var14]; // L: 123
			}

			if (var16 == class132.field1557) { // L: 125
				this.field1606 = true; // L: 126
			}
		}

		var5 = var3 / GroundObject.field2713; // L: 129
		int var6 = var3 % GroundObject.field2713; // L: 130
		int var8 = 0; // L: 132

		for (var9 = 0; var9 < GroundObject.field2713; ++var9) { // L: 133
			var7 = var8; // L: 134
			var8 += var5; // L: 135
			if (var6 > 0) { // L: 136
				++var8; // L: 137
				--var6; // L: 138
			}

			if (var8 == var7) { // L: 140
				break;
			}

			this.field1603.add(field1595.submit(new class134(this, var7, var8, var4))); // L: 145
		}

	} // L: 155

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "136"
	)
	public boolean method3164() {
		if (this.field1602 == null && this.field1603 == null) { // L: 158
			return true; // L: 159
		} else {
			if (this.field1602 != null) { // L: 161
				if (!this.field1602.isDone()) { // L: 162
					return false; // L: 163
				}

				this.field1602 = null; // L: 165
			}

			boolean var1 = true; // L: 167

			for (int var2 = 0; var2 < this.field1603.size(); ++var2) { // L: 168
				if (!((Future)this.field1603.get(var2)).isDone()) { // L: 169
					var1 = false; // L: 170
				} else {
					this.field1603.remove(var2); // L: 173
					--var2; // L: 174
				}
			}

			if (!var1) { // L: 177
				return false; // L: 178
			} else {
				this.field1603 = null; // L: 180
				return true; // L: 181
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "53"
	)
	public int method3190() {
		return this.field1598; // L: 185
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-99"
	)
	public boolean method3187() {
		return this.field1606; // L: 189
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILej;III)V",
		garbageValue = "-685417553"
	)
	public void method3167(int var1, class128 var2, int var3, int var4) {
		class462 var5 = WorldMapDecoration.method4928(); // L: 193
		this.method3166(var5, var3, var2, var1); // L: 194
		this.method3192(var5, var3, var2, var1); // L: 195
		this.method3169(var5, var3, var2, var1); // L: 196
		var2.method3044(var5); // L: 197
		var5.method8459(); // L: 198
	} // L: 199

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lrz;ILej;II)V",
		garbageValue = "2098789523"
	)
	void method3166(class462 var1, int var2, class128 var3, int var4) {
		float[] var5 = var3.method3047(this.field1598); // L: 202
		float var6 = var5[0]; // L: 203
		float var7 = var5[1]; // L: 204
		float var8 = var5[2]; // L: 205
		if (this.field1597[var2] != null) { // L: 206
			class131 var9 = this.field1597[var2][0]; // L: 207
			class131 var10 = this.field1597[var2][1]; // L: 208
			class131 var11 = this.field1597[var2][2]; // L: 209
			if (var9 != null) { // L: 210
				var6 = var9.method3100(var4);
			}

			if (var10 != null) { // L: 211
				var7 = var10.method3100(var4);
			}

			if (var11 != null) { // L: 212
				var8 = var11.method3100(var4);
			}
		}

		class461 var16 = class214.method4228(); // L: 214
		var16.method8408(1.0F, 0.0F, 0.0F, var6); // L: 215
		class461 var14 = class214.method4228(); // L: 216
		var14.method8408(0.0F, 1.0F, 0.0F, var7); // L: 217
		class461 var15 = class214.method4228(); // L: 218
		var15.method8408(0.0F, 0.0F, 1.0F, var8); // L: 219
		class461 var12 = class214.method4228(); // L: 220
		var12.method8410(var15); // L: 221
		var12.method8410(var16); // L: 222
		var12.method8410(var14); // L: 223
		class462 var13 = WorldMapDecoration.method4928(); // L: 224
		var13.method8446(var12); // L: 225
		var1.method8445(var13); // L: 226
		var16.method8424(); // L: 227
		var14.method8424(); // L: 228
		var15.method8424(); // L: 229
		var12.method8424(); // L: 230
		var13.method8459(); // L: 231
	} // L: 232

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lrz;ILej;II)V",
		garbageValue = "1029943917"
	)
	void method3169(class462 var1, int var2, class128 var3, int var4) {
		float[] var5 = var3.method3049(this.field1598); // L: 235
		float var6 = var5[0]; // L: 236
		float var7 = var5[1]; // L: 237
		float var8 = var5[2]; // L: 238
		if (this.field1597[var2] != null) { // L: 239
			class131 var9 = this.field1597[var2][3]; // L: 240
			class131 var10 = this.field1597[var2][4]; // L: 241
			class131 var11 = this.field1597[var2][5]; // L: 242
			if (var9 != null) { // L: 243
				var6 = var9.method3100(var4);
			}

			if (var10 != null) { // L: 244
				var7 = var10.method3100(var4);
			}

			if (var11 != null) { // L: 245
				var8 = var11.method3100(var4);
			}
		}

		var1.field4772[12] = var6; // L: 247
		var1.field4772[13] = var7; // L: 248
		var1.field4772[14] = var8; // L: 249
	} // L: 250

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lrz;ILej;IB)V",
		garbageValue = "-43"
	)
	void method3192(class462 var1, int var2, class128 var3, int var4) {
		float[] var5 = var3.method3050(this.field1598); // L: 253
		float var6 = var5[0]; // L: 254
		float var7 = var5[1]; // L: 255
		float var8 = var5[2]; // L: 256
		if (this.field1597[var2] != null) { // L: 257
			class131 var9 = this.field1597[var2][6]; // L: 258
			class131 var10 = this.field1597[var2][7]; // L: 259
			class131 var11 = this.field1597[var2][8]; // L: 260
			if (var9 != null) { // L: 261
				var6 = var9.method3100(var4);
			}

			if (var10 != null) { // L: 262
				var7 = var10.method3100(var4);
			}

			if (var11 != null) { // L: 263
				var8 = var11.method3100(var4);
			}
		}

		class462 var12 = WorldMapDecoration.method4928(); // L: 265
		var12.method8443(var6, var7, var8); // L: 266
		var1.method8445(var12); // L: 267
		var12.method8459(); // L: 268
	} // L: 269

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-1858381549"
	)
	public static byte[] method3193() {
		byte[] var0 = new byte[24]; // L: 325

		try {
			JagexCache.JagexCache_randomDat.seek(0L); // L: 327
			JagexCache.JagexCache_randomDat.readFully(var0); // L: 328

			int var1;
			for (var1 = 0; var1 < 24 && var0[var1] == 0; ++var1) { // L: 329 330 331
			}

			if (var1 >= 24) { // L: 333
				throw new IOException();
			}
		} catch (Exception var4) {
			for (int var2 = 0; var2 < 24; ++var2) { // L: 336
				var0[var2] = -1;
			}
		}

		return var0; // L: 338
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-1700881747"
	)
	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login.Login_response1 = var0; // L: 2057
		Login.Login_response2 = var1; // L: 2058
		Login.Login_response3 = var2; // L: 2059
	} // L: 2060
}
