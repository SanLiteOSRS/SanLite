import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fc")
public class class140 extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -2048217997
	)
	int field1639;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[[Lfr;"
	)
	public class132[][] field1632;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[[Lfr;"
	)
	class132[][] field1634;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	public Skeleton field1635;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 955178619
	)
	int field1636;
	@ObfuscatedName("as")
	boolean field1633;
	@ObfuscatedName("ao")
	Future field1638;
	@ObfuscatedName("au")
	List field1637;

	@ObfuscatedSignature(
		descriptor = "(Lof;Lof;IZ)V"
	)
	class140(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		this.field1632 = null; // L: 21
		this.field1634 = null; // L: 22
		this.field1636 = 0; // L: 24
		this.field1639 = var3; // L: 62
		byte[] var5 = var1.takeFile(this.field1639 >> 16 & 65535, this.field1639 & 65535); // L: 63
		Buffer var6 = new Buffer(var5); // L: 64
		int var7 = var6.readUnsignedByte(); // L: 65
		int var8 = var6.readUnsignedShort(); // L: 66
		byte[] var9;
		if (var4) { // L: 68
			var9 = var2.getFile(0, var8);
		} else {
			var9 = var2.getFile(var8, 0); // L: 69
		}

		this.field1635 = new Skeleton(var8, var9); // L: 70
		this.field1637 = new ArrayList(); // L: 71
		this.field1638 = GrandExchangeOfferUnitPriceComparator.field4467.submit(new class139(this, var6, var7)); // L: 72
	} // L: 79

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Luq;II)V",
		garbageValue = "-883395869"
	)
	void method3153(Buffer var1, int var2) {
		var1.readUnsignedShort(); // L: 82
		var1.readUnsignedShort(); // L: 83
		this.field1636 = var1.readUnsignedByte(); // L: 84
		int var3 = var1.readUnsignedShort(); // L: 85
		this.field1634 = new class132[this.field1635.method5414().method5345()][]; // L: 86
		this.field1632 = new class132[this.field1635.method5411()][]; // L: 87
		class131[] var4 = new class131[var3]; // L: 88

		int var5;
		int var7;
		int var9;
		for (var5 = 0; var5 < var3; ++var5) { // L: 89
			var7 = var1.readUnsignedByte(); // L: 91
			class133[] var16 = new class133[]{class133.field1590, class133.field1580, class133.field1586, class133.field1591, class133.field1583, class133.field1584}; // L: 95
			class133 var17 = (class133)class356.findEnumerated(var16, var7); // L: 97
			if (var17 == null) {
				var17 = class133.field1590; // L: 98
			}

			var9 = var1.readShortSmart(); // L: 102
			int var11 = var1.readUnsignedByte(); // L: 104
			class134 var12 = (class134)class356.findEnumerated(class136.method3142(), var11); // L: 106
			if (var12 == null) { // L: 107
				var12 = class134.field1595;
			}

			class132 var13 = new class132(); // L: 111
			var13.method3099(var1, var2); // L: 112
			var4[var5] = new class131(this, var13, var17, var12, var9); // L: 113
			int var14 = var17.method3111(); // L: 114
			class132[][] var15;
			if (var17 == class133.field1580) { // L: 116
				var15 = this.field1634; // L: 117
			} else {
				var15 = this.field1632; // L: 120
			}

			if (var15[var9] == null) { // L: 122
				var15[var9] = new class132[var14]; // L: 123
			}

			if (var17 == class133.field1583) { // L: 125
				this.field1633 = true; // L: 126
			}
		}

		var5 = var3 / class520.field5121; // L: 129
		int var6 = var3 % class520.field5121; // L: 130
		int var8 = 0; // L: 132

		for (var9 = 0; var9 < class520.field5121; ++var9) { // L: 133
			var7 = var8; // L: 134
			var8 += var5; // L: 135
			if (var6 > 0) { // L: 136
				++var8; // L: 137
				--var6; // L: 138
			}

			if (var7 == var8) { // L: 140
				break;
			}

			this.field1637.add(GrandExchangeOfferUnitPriceComparator.field4467.submit(new class135(this, var7, var8, var4))); // L: 145
		}

	} // L: 155

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1351092140"
	)
	public boolean method3160() {
		if (this.field1638 == null && this.field1637 == null) { // L: 158
			return true; // L: 159
		} else {
			if (this.field1638 != null) { // L: 161
				if (!this.field1638.isDone()) { // L: 162
					return false; // L: 163
				}

				this.field1638 = null; // L: 165
			}

			boolean var1 = true; // L: 167

			for (int var2 = 0; var2 < this.field1637.size(); ++var2) { // L: 168
				if (!((Future)this.field1637.get(var2)).isDone()) { // L: 169
					var1 = false; // L: 170
				} else {
					this.field1637.remove(var2); // L: 173
					--var2; // L: 174
				}
			}

			if (!var1) { // L: 177
				return false; // L: 178
			} else {
				this.field1637 = null; // L: 180
				return true; // L: 181
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "23"
	)
	public int method3155() {
		return this.field1636; // L: 185
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "2"
	)
	public boolean method3156() {
		return this.field1633; // L: 189
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILez;IIB)V",
		garbageValue = "0"
	)
	public void method3159(int var1, class129 var2, int var3, int var4) {
		class469 var5 = UserComparator9.method2965(); // L: 193
		this.method3172(var5, var3, var2, var1); // L: 194
		this.method3165(var5, var3, var2, var1); // L: 195
		this.method3158(var5, var3, var2, var1); // L: 196
		var2.method3027(var5); // L: 197
		var5.method8648(); // L: 198
	} // L: 199

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lsr;ILez;II)V",
		garbageValue = "1394144447"
	)
	void method3172(class469 var1, int var2, class129 var3, int var4) {
		float[] var5 = var3.method3061(this.field1636); // L: 202
		float var6 = var5[0]; // L: 203
		float var7 = var5[1]; // L: 204
		float var8 = var5[2]; // L: 205
		if (this.field1634[var2] != null) { // L: 206
			class132 var9 = this.field1634[var2][0]; // L: 207
			class132 var10 = this.field1634[var2][1]; // L: 208
			class132 var11 = this.field1634[var2][2]; // L: 209
			if (var9 != null) { // L: 210
				var6 = var9.method3085(var4);
			}

			if (var10 != null) { // L: 211
				var7 = var10.method3085(var4);
			}

			if (var11 != null) { // L: 212
				var8 = var11.method3085(var4);
			}
		}

		class468 var16 = class350.method6940(); // L: 214
		var16.method8592(1.0F, 0.0F, 0.0F, var6); // L: 215
		class468 var14 = class350.method6940(); // L: 216
		var14.method8592(0.0F, 1.0F, 0.0F, var7); // L: 217
		class468 var15 = class350.method6940(); // L: 218
		var15.method8592(0.0F, 0.0F, 1.0F, var8); // L: 219
		class468 var12 = class350.method6940(); // L: 220
		var12.method8594(var15); // L: 221
		var12.method8594(var16); // L: 222
		var12.method8594(var14); // L: 223
		class469 var13 = UserComparator9.method2965(); // L: 224
		var13.method8660(var12); // L: 225
		var1.method8633(var13); // L: 226
		var16.method8597(); // L: 227
		var14.method8597(); // L: 228
		var15.method8597(); // L: 229
		var12.method8597(); // L: 230
		var13.method8648(); // L: 231
	} // L: 232

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lsr;ILez;IB)V",
		garbageValue = "52"
	)
	void method3158(class469 var1, int var2, class129 var3, int var4) {
		float[] var5 = var3.method3031(this.field1636); // L: 235
		float var6 = var5[0]; // L: 236
		float var7 = var5[1]; // L: 237
		float var8 = var5[2]; // L: 238
		if (this.field1634[var2] != null) { // L: 239
			class132 var9 = this.field1634[var2][3]; // L: 240
			class132 var10 = this.field1634[var2][4]; // L: 241
			class132 var11 = this.field1634[var2][5]; // L: 242
			if (var9 != null) { // L: 243
				var6 = var9.method3085(var4);
			}

			if (var10 != null) { // L: 244
				var7 = var10.method3085(var4);
			}

			if (var11 != null) { // L: 245
				var8 = var11.method3085(var4);
			}
		}

		var1.field4843[12] = var6; // L: 247
		var1.field4843[13] = var7; // L: 248
		var1.field4843[14] = var8; // L: 249
	} // L: 250

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lsr;ILez;II)V",
		garbageValue = "492204297"
	)
	void method3165(class469 var1, int var2, class129 var3, int var4) {
		float[] var5 = var3.method3063(this.field1636); // L: 253
		float var6 = var5[0]; // L: 254
		float var7 = var5[1]; // L: 255
		float var8 = var5[2]; // L: 256
		if (this.field1634[var2] != null) { // L: 257
			class132 var9 = this.field1634[var2][6]; // L: 258
			class132 var10 = this.field1634[var2][7]; // L: 259
			class132 var11 = this.field1634[var2][8]; // L: 260
			if (var9 != null) { // L: 261
				var6 = var9.method3085(var4);
			}

			if (var10 != null) { // L: 262
				var7 = var10.method3085(var4);
			}

			if (var11 != null) { // L: 263
				var8 = var11.method3085(var4);
			}
		}

		class469 var12 = UserComparator9.method2965(); // L: 265
		var12.method8631(var6, var7, var8); // L: 266
		var1.method8633(var12); // L: 267
		var12.method8648(); // L: 268
	} // L: 269

	@ObfuscatedName("aq")
	static double method3167(double var0) {
		return Math.exp(var0 * -var0 / 2.0D) / Math.sqrt(6.283185307179586D); // L: 9
	}
}
