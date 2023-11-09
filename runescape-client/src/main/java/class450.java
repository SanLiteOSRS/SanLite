import java.util.Arrays;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rz")
public final class class450 {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lrz;"
	)
	public static class450[] field4737;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	public static final class450 field4740;
	@ObfuscatedName("ac")
	public float[] field4739;

	static {
		field4737 = new class450[0]; // L: 9
		class272.method5502(100); // L: 14
		field4740 = new class450(); // L: 18
	}

	public class450() {
		this.field4739 = new float[16];
		this.method8194(); // L: 33
	} // L: 34

	@ObfuscatedSignature(
		descriptor = "(Lrz;)V"
	)
	public class450(class450 var1) {
		this.field4739 = new float[16];
		this.method8221(var1); // L: 37
	} // L: 38

	@ObfuscatedSignature(
		descriptor = "(Ltm;Z)V"
	)
	public class450(Buffer var1, boolean var2) {
		this.field4739 = new float[16]; // L: 17
		this.method8232(var1, var2); // L: 41
	} // L: 42

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1723077119"
	)
	public void method8235() {
		synchronized(field4737) { // L: 27
			if (class462.field4778 < GrandExchangeOfferOwnWorldComparator.field518 - 1) { // L: 28
				field4737[++class462.field4778 - 1] = this;
			}

		}
	} // L: 30

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ltm;ZI)V",
		garbageValue = "1560038466"
	)
	void method8232(Buffer var1, boolean var2) {
		if (var2) { // L: 45
			class451 var13 = new class451(); // L: 46
			int var6 = var1.readShort(); // L: 49
			var6 &= 16383; // L: 51
			float var5 = (float)(6.283185307179586D * (double)((float)var6 / 16384.0F)); // L: 52
			var13.method8257(var5); // L: 54
			int var9 = var1.readShort(); // L: 57
			var9 &= 16383; // L: 59
			float var8 = (float)((double)((float)var9 / 16384.0F) * 6.283185307179586D); // L: 60
			var13.method8261(var8); // L: 62
			int var12 = var1.readShort(); // L: 65
			var12 &= 16383; // L: 67
			float var11 = (float)((double)((float)var12 / 16384.0F) * 6.283185307179586D); // L: 68
			var13.method8258(var11); // L: 70
			var13.method8259((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort()); // L: 71
			this.method8189(var13); // L: 72
		} else {
			for (int var3 = 0; var3 < 16; ++var3) { // L: 75
				this.field4739[var3] = var1.method9066(); // L: 76
			}
		}

	} // L: 79

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "-57"
	)
	float[] method8192() {
		float[] var1 = new float[3]; // L: 82
		if ((double)this.field4739[2] < 0.999D && (double)this.field4739[2] > -0.999D) { // L: 83
			var1[1] = (float)(-Math.asin((double)this.field4739[2])); // L: 84
			double var2 = Math.cos((double)var1[1]); // L: 85
			var1[0] = (float)Math.atan2((double)this.field4739[6] / var2, (double)this.field4739[10] / var2); // L: 86
			var1[2] = (float)Math.atan2((double)this.field4739[1] / var2, (double)this.field4739[0] / var2); // L: 87
		} else {
			var1[0] = 0.0F; // L: 90
			var1[1] = (float)Math.atan2((double)this.field4739[2], 0.0D); // L: 91
			var1[2] = (float)Math.atan2((double)(-this.field4739[9]), (double)this.field4739[5]); // L: 92
		}

		return var1; // L: 94
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "1952444493"
	)
	public float[] method8193() {
		float[] var1 = new float[]{(float)(-Math.asin((double)this.field4739[6])), 0.0F, 0.0F}; // L: 98 99
		double var2 = Math.cos((double)var1[0]); // L: 100
		double var4;
		double var6;
		if (Math.abs(var2) > 0.005D) { // L: 101
			var4 = (double)this.field4739[2]; // L: 102
			var6 = (double)this.field4739[10]; // L: 103
			double var8 = (double)this.field4739[4]; // L: 104
			double var10 = (double)this.field4739[5]; // L: 105
			var1[1] = (float)Math.atan2(var4, var6); // L: 106
			var1[2] = (float)Math.atan2(var8, var10); // L: 107
		} else {
			var4 = (double)this.field4739[1]; // L: 110
			var6 = (double)this.field4739[0]; // L: 111
			if (this.field4739[6] < 0.0F) { // L: 112
				var1[1] = (float)Math.atan2(var4, var6); // L: 113
			} else {
				var1[1] = (float)(-Math.atan2(var4, var6)); // L: 116
			}

			var1[2] = 0.0F; // L: 118
		}

		return var1; // L: 120
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1131918254"
	)
	public void method8194() {
		this.field4739[0] = 1.0F; // L: 124
		this.field4739[1] = 0.0F; // L: 125
		this.field4739[2] = 0.0F; // L: 126
		this.field4739[3] = 0.0F; // L: 127
		this.field4739[4] = 0.0F; // L: 128
		this.field4739[5] = 1.0F; // L: 129
		this.field4739[6] = 0.0F; // L: 130
		this.field4739[7] = 0.0F; // L: 131
		this.field4739[8] = 0.0F; // L: 132
		this.field4739[9] = 0.0F; // L: 133
		this.field4739[10] = 1.0F; // L: 134
		this.field4739[11] = 0.0F; // L: 135
		this.field4739[12] = 0.0F; // L: 136
		this.field4739[13] = 0.0F; // L: 137
		this.field4739[14] = 0.0F; // L: 138
		this.field4739[15] = 1.0F; // L: 139
	} // L: 140

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "109"
	)
	public void method8195() {
		this.field4739[0] = 0.0F; // L: 143
		this.field4739[1] = 0.0F; // L: 144
		this.field4739[2] = 0.0F; // L: 145
		this.field4739[3] = 0.0F; // L: 146
		this.field4739[4] = 0.0F; // L: 147
		this.field4739[5] = 0.0F; // L: 148
		this.field4739[6] = 0.0F; // L: 149
		this.field4739[7] = 0.0F; // L: 150
		this.field4739[8] = 0.0F; // L: 151
		this.field4739[9] = 0.0F; // L: 152
		this.field4739[10] = 0.0F; // L: 153
		this.field4739[11] = 0.0F; // L: 154
		this.field4739[12] = 0.0F; // L: 155
		this.field4739[13] = 0.0F; // L: 156
		this.field4739[14] = 0.0F; // L: 157
		this.field4739[15] = 0.0F; // L: 158
	} // L: 159

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lrz;I)V",
		garbageValue = "1658923125"
	)
	public void method8221(class450 var1) {
		System.arraycopy(var1.field4739, 0, this.field4739, 0, 16); // L: 162
	} // L: 163

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "54"
	)
	public void method8197(float var1) {
		this.method8198(var1, var1, var1); // L: 166
	} // L: 167

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(FFFB)V",
		garbageValue = "0"
	)
	public void method8198(float var1, float var2, float var3) {
		this.method8194(); // L: 170
		this.field4739[0] = var1; // L: 171
		this.field4739[5] = var2; // L: 172
		this.field4739[10] = var3; // L: 173
	} // L: 174

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lrz;I)V",
		garbageValue = "1420506541"
	)
	public void method8199(class450 var1) {
		for (int var2 = 0; var2 < this.field4739.length; ++var2) { // L: 177
			float[] var10000 = this.field4739; // L: 178
			var10000[var2] += var1.field4739[var2];
		}

	} // L: 180

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lrz;I)V",
		garbageValue = "2026698221"
	)
	public void method8237(class450 var1) {
		float var2 = this.field4739[2] * var1.field4739[8] + var1.field4739[0] * this.field4739[0] + var1.field4739[4] * this.field4739[1] + var1.field4739[12] * this.field4739[3]; // L: 183
		float var3 = this.field4739[0] * var1.field4739[1] + var1.field4739[5] * this.field4739[1] + var1.field4739[9] * this.field4739[2] + this.field4739[3] * var1.field4739[13]; // L: 184
		float var4 = var1.field4739[14] * this.field4739[3] + this.field4739[2] * var1.field4739[10] + var1.field4739[6] * this.field4739[1] + var1.field4739[2] * this.field4739[0]; // L: 185
		float var5 = this.field4739[0] * var1.field4739[3] + var1.field4739[7] * this.field4739[1] + this.field4739[2] * var1.field4739[11] + this.field4739[3] * var1.field4739[15]; // L: 186
		float var6 = this.field4739[7] * var1.field4739[12] + this.field4739[4] * var1.field4739[0] + this.field4739[5] * var1.field4739[4] + var1.field4739[8] * this.field4739[6]; // L: 187
		float var7 = this.field4739[6] * var1.field4739[9] + var1.field4739[1] * this.field4739[4] + var1.field4739[5] * this.field4739[5] + this.field4739[7] * var1.field4739[13]; // L: 188
		float var8 = this.field4739[7] * var1.field4739[14] + this.field4739[5] * var1.field4739[6] + this.field4739[4] * var1.field4739[2] + var1.field4739[10] * this.field4739[6]; // L: 189
		float var9 = var1.field4739[15] * this.field4739[7] + this.field4739[6] * var1.field4739[11] + this.field4739[4] * var1.field4739[3] + this.field4739[5] * var1.field4739[7]; // L: 190
		float var10 = var1.field4739[12] * this.field4739[11] + this.field4739[10] * var1.field4739[8] + var1.field4739[4] * this.field4739[9] + this.field4739[8] * var1.field4739[0]; // L: 191
		float var11 = this.field4739[11] * var1.field4739[13] + this.field4739[9] * var1.field4739[5] + var1.field4739[1] * this.field4739[8] + var1.field4739[9] * this.field4739[10]; // L: 192
		float var12 = var1.field4739[14] * this.field4739[11] + this.field4739[9] * var1.field4739[6] + var1.field4739[2] * this.field4739[8] + this.field4739[10] * var1.field4739[10]; // L: 193
		float var13 = var1.field4739[15] * this.field4739[11] + var1.field4739[11] * this.field4739[10] + var1.field4739[7] * this.field4739[9] + this.field4739[8] * var1.field4739[3]; // L: 194
		float var14 = this.field4739[14] * var1.field4739[8] + var1.field4739[0] * this.field4739[12] + this.field4739[13] * var1.field4739[4] + this.field4739[15] * var1.field4739[12]; // L: 195
		float var15 = var1.field4739[13] * this.field4739[15] + var1.field4739[5] * this.field4739[13] + this.field4739[12] * var1.field4739[1] + var1.field4739[9] * this.field4739[14]; // L: 196
		float var16 = this.field4739[14] * var1.field4739[10] + var1.field4739[6] * this.field4739[13] + this.field4739[12] * var1.field4739[2] + var1.field4739[14] * this.field4739[15]; // L: 197
		float var17 = var1.field4739[15] * this.field4739[15] + var1.field4739[3] * this.field4739[12] + this.field4739[13] * var1.field4739[7] + var1.field4739[11] * this.field4739[14]; // L: 198
		this.field4739[0] = var2; // L: 199
		this.field4739[1] = var3; // L: 200
		this.field4739[2] = var4; // L: 201
		this.field4739[3] = var5; // L: 202
		this.field4739[4] = var6; // L: 203
		this.field4739[5] = var7; // L: 204
		this.field4739[6] = var8; // L: 205
		this.field4739[7] = var9; // L: 206
		this.field4739[8] = var10; // L: 207
		this.field4739[9] = var11; // L: 208
		this.field4739[10] = var12; // L: 209
		this.field4739[11] = var13; // L: 210
		this.field4739[12] = var14; // L: 211
		this.field4739[13] = var15; // L: 212
		this.field4739[14] = var16; // L: 213
		this.field4739[15] = var17; // L: 214
	} // L: 215

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lro;I)V",
		garbageValue = "1037679755"
	)
	public void method8240(class449 var1) {
		float var2 = var1.field4729 * var1.field4729; // L: 218
		float var3 = var1.field4733 * var1.field4729; // L: 219
		float var4 = var1.field4729 * var1.field4732; // L: 220
		float var5 = var1.field4734 * var1.field4729; // L: 221
		float var6 = var1.field4733 * var1.field4733; // L: 222
		float var7 = var1.field4733 * var1.field4732; // L: 223
		float var8 = var1.field4734 * var1.field4733; // L: 224
		float var9 = var1.field4732 * var1.field4732; // L: 225
		float var10 = var1.field4732 * var1.field4734; // L: 226
		float var11 = var1.field4734 * var1.field4734; // L: 227
		this.field4739[0] = var6 + var2 - var11 - var9; // L: 228
		this.field4739[1] = var7 + var5 + var7 + var5; // L: 229
		this.field4739[2] = var8 - var4 - var4 + var8; // L: 230
		this.field4739[4] = var7 - var5 - var5 + var7; // L: 231
		this.field4739[5] = var2 + var9 - var6 - var11; // L: 232
		this.field4739[6] = var3 + var10 + var3 + var10; // L: 233
		this.field4739[8] = var8 + var4 + var8 + var4; // L: 234
		this.field4739[9] = var10 - var3 - var3 + var10; // L: 235
		this.field4739[10] = var11 + var2 - var9 - var6; // L: 236
	} // L: 237

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lrm;I)V",
		garbageValue = "-552331483"
	)
	void method8189(class451 var1) {
		this.field4739[0] = var1.field4749; // L: 240
		this.field4739[1] = var1.field4744; // L: 241
		this.field4739[2] = var1.field4745; // L: 242
		this.field4739[3] = 0.0F; // L: 243
		this.field4739[4] = var1.field4746; // L: 244
		this.field4739[5] = var1.field4748; // L: 245
		this.field4739[6] = var1.field4743; // L: 246
		this.field4739[7] = 0.0F; // L: 247
		this.field4739[8] = var1.field4753; // L: 248
		this.field4739[9] = var1.field4750; // L: 249
		this.field4739[10] = var1.field4747; // L: 250
		this.field4739[11] = 0.0F; // L: 251
		this.field4739[12] = var1.field4752; // L: 252
		this.field4739[13] = var1.field4751; // L: 253
		this.field4739[14] = var1.field4754; // L: 254
		this.field4739[15] = 1.0F; // L: 255
	} // L: 256

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "-1874677140"
	)
	float method8203() {
		return this.field4739[12] * this.field4739[9] * this.field4739[6] * this.field4739[3] + (this.field4739[8] * this.field4739[7] * this.field4739[2] * this.field4739[13] + this.field4739[8] * this.field4739[1] * this.field4739[6] * this.field4739[15] + this.field4739[14] * this.field4739[11] * this.field4739[4] * this.field4739[1] + (this.field4739[0] * this.field4739[7] * this.field4739[9] * this.field4739[14] + this.field4739[15] * this.field4739[5] * this.field4739[0] * this.field4739[10] - this.field4739[0] * this.field4739[5] * this.field4739[11] * this.field4739[14] - this.field4739[15] * this.field4739[0] * this.field4739[6] * this.field4739[9] + this.field4739[13] * this.field4739[0] * this.field4739[6] * this.field4739[11] - this.field4739[10] * this.field4739[0] * this.field4739[7] * this.field4739[13] - this.field4739[15] * this.field4739[4] * this.field4739[1] * this.field4739[10]) - this.field4739[12] * this.field4739[1] * this.field4739[6] * this.field4739[11] - this.field4739[7] * this.field4739[1] * this.field4739[8] * this.field4739[14] + this.field4739[12] * this.field4739[10] * this.field4739[7] * this.field4739[1] + this.field4739[15] * this.field4739[4] * this.field4739[2] * this.field4739[9] - this.field4739[13] * this.field4739[11] * this.field4739[4] * this.field4739[2] - this.field4739[15] * this.field4739[8] * this.field4739[2] * this.field4739[5] + this.field4739[11] * this.field4739[2] * this.field4739[5] * this.field4739[12] - this.field4739[9] * this.field4739[7] * this.field4739[2] * this.field4739[12] - this.field4739[14] * this.field4739[3] * this.field4739[4] * this.field4739[9] + this.field4739[13] * this.field4739[10] * this.field4739[4] * this.field4739[3] + this.field4739[14] * this.field4739[8] * this.field4739[5] * this.field4739[3] - this.field4739[12] * this.field4739[3] * this.field4739[5] * this.field4739[10] - this.field4739[6] * this.field4739[3] * this.field4739[8] * this.field4739[13]); // L: 259
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-93"
	)
	public void method8254() {
		float var1 = 1.0F / this.method8203(); // L: 263
		float var2 = (this.field4739[11] * this.field4739[6] * this.field4739[13] + (this.field4739[15] * this.field4739[5] * this.field4739[10] - this.field4739[14] * this.field4739[11] * this.field4739[5] - this.field4739[9] * this.field4739[6] * this.field4739[15]) + this.field4739[14] * this.field4739[7] * this.field4739[9] - this.field4739[7] * this.field4739[10] * this.field4739[13]) * var1; // L: 264
		float var3 = (this.field4739[13] * this.field4739[3] * this.field4739[10] + (this.field4739[15] * -this.field4739[1] * this.field4739[10] + this.field4739[14] * this.field4739[11] * this.field4739[1] + this.field4739[9] * this.field4739[2] * this.field4739[15] - this.field4739[11] * this.field4739[2] * this.field4739[13] - this.field4739[14] * this.field4739[9] * this.field4739[3])) * var1; // L: 265
		float var4 = (this.field4739[15] * this.field4739[6] * this.field4739[1] - this.field4739[1] * this.field4739[7] * this.field4739[14] - this.field4739[15] * this.field4739[2] * this.field4739[5] + this.field4739[2] * this.field4739[7] * this.field4739[13] + this.field4739[3] * this.field4739[5] * this.field4739[14] - this.field4739[13] * this.field4739[6] * this.field4739[3]) * var1; // L: 266
		float var5 = (this.field4739[9] * this.field4739[3] * this.field4739[6] + (this.field4739[7] * this.field4739[1] * this.field4739[10] + this.field4739[11] * -this.field4739[1] * this.field4739[6] + this.field4739[11] * this.field4739[2] * this.field4739[5] - this.field4739[7] * this.field4739[2] * this.field4739[9] - this.field4739[5] * this.field4739[3] * this.field4739[10])) * var1; // L: 267
		float var6 = (this.field4739[12] * this.field4739[10] * this.field4739[7] + (this.field4739[6] * this.field4739[8] * this.field4739[15] + this.field4739[15] * this.field4739[10] * -this.field4739[4] + this.field4739[4] * this.field4739[11] * this.field4739[14] - this.field4739[11] * this.field4739[6] * this.field4739[12] - this.field4739[14] * this.field4739[8] * this.field4739[7])) * var1; // L: 268
		float var7 = (this.field4739[2] * this.field4739[11] * this.field4739[12] + (this.field4739[0] * this.field4739[10] * this.field4739[15] - this.field4739[14] * this.field4739[0] * this.field4739[11] - this.field4739[15] * this.field4739[2] * this.field4739[8]) + this.field4739[14] * this.field4739[8] * this.field4739[3] - this.field4739[3] * this.field4739[10] * this.field4739[12]) * var1; // L: 269
		float var8 = (this.field4739[15] * this.field4739[2] * this.field4739[4] + this.field4739[15] * this.field4739[6] * -this.field4739[0] + this.field4739[0] * this.field4739[7] * this.field4739[14] - this.field4739[7] * this.field4739[2] * this.field4739[12] - this.field4739[3] * this.field4739[4] * this.field4739[14] + this.field4739[12] * this.field4739[3] * this.field4739[6]) * var1; // L: 270
		float var9 = (this.field4739[10] * this.field4739[4] * this.field4739[3] + this.field4739[0] * this.field4739[6] * this.field4739[11] - this.field4739[10] * this.field4739[0] * this.field4739[7] - this.field4739[2] * this.field4739[4] * this.field4739[11] + this.field4739[7] * this.field4739[2] * this.field4739[8] - this.field4739[8] * this.field4739[6] * this.field4739[3]) * var1; // L: 271
		float var10 = (this.field4739[15] * this.field4739[4] * this.field4739[9] - this.field4739[13] * this.field4739[4] * this.field4739[11] - this.field4739[15] * this.field4739[5] * this.field4739[8] + this.field4739[11] * this.field4739[5] * this.field4739[12] + this.field4739[13] * this.field4739[8] * this.field4739[7] - this.field4739[12] * this.field4739[9] * this.field4739[7]) * var1; // L: 272
		float var11 = var1 * (this.field4739[15] * this.field4739[9] * -this.field4739[0] + this.field4739[13] * this.field4739[0] * this.field4739[11] + this.field4739[1] * this.field4739[8] * this.field4739[15] - this.field4739[11] * this.field4739[1] * this.field4739[12] - this.field4739[8] * this.field4739[3] * this.field4739[13] + this.field4739[9] * this.field4739[3] * this.field4739[12]); // L: 273
		float var12 = (this.field4739[4] * this.field4739[3] * this.field4739[13] + this.field4739[12] * this.field4739[1] * this.field4739[7] + (this.field4739[15] * this.field4739[5] * this.field4739[0] - this.field4739[13] * this.field4739[0] * this.field4739[7] - this.field4739[1] * this.field4739[4] * this.field4739[15]) - this.field4739[12] * this.field4739[3] * this.field4739[5]) * var1; // L: 274
		float var13 = var1 * (this.field4739[8] * this.field4739[3] * this.field4739[5] + (-this.field4739[0] * this.field4739[5] * this.field4739[11] + this.field4739[9] * this.field4739[7] * this.field4739[0] + this.field4739[4] * this.field4739[1] * this.field4739[11] - this.field4739[8] * this.field4739[1] * this.field4739[7] - this.field4739[3] * this.field4739[4] * this.field4739[9])); // L: 275
		float var14 = (this.field4739[12] * this.field4739[6] * this.field4739[9] + (this.field4739[14] * this.field4739[9] * -this.field4739[4] + this.field4739[13] * this.field4739[10] * this.field4739[4] + this.field4739[8] * this.field4739[5] * this.field4739[14] - this.field4739[12] * this.field4739[10] * this.field4739[5] - this.field4739[8] * this.field4739[6] * this.field4739[13])) * var1; // L: 276
		float var15 = (this.field4739[13] * this.field4739[8] * this.field4739[2] + this.field4739[0] * this.field4739[9] * this.field4739[14] - this.field4739[13] * this.field4739[0] * this.field4739[10] - this.field4739[1] * this.field4739[8] * this.field4739[14] + this.field4739[1] * this.field4739[10] * this.field4739[12] - this.field4739[12] * this.field4739[2] * this.field4739[9]) * var1; // L: 277
		float var16 = var1 * (-this.field4739[0] * this.field4739[5] * this.field4739[14] + this.field4739[6] * this.field4739[0] * this.field4739[13] + this.field4739[14] * this.field4739[1] * this.field4739[4] - this.field4739[6] * this.field4739[1] * this.field4739[12] - this.field4739[4] * this.field4739[2] * this.field4739[13] + this.field4739[2] * this.field4739[5] * this.field4739[12]); // L: 278
		float var17 = (this.field4739[5] * this.field4739[0] * this.field4739[10] - this.field4739[0] * this.field4739[6] * this.field4739[9] - this.field4739[1] * this.field4739[4] * this.field4739[10] + this.field4739[1] * this.field4739[6] * this.field4739[8] + this.field4739[2] * this.field4739[4] * this.field4739[9] - this.field4739[8] * this.field4739[2] * this.field4739[5]) * var1; // L: 279
		this.field4739[0] = var2; // L: 280
		this.field4739[1] = var3; // L: 281
		this.field4739[2] = var4; // L: 282
		this.field4739[3] = var5; // L: 283
		this.field4739[4] = var6; // L: 284
		this.field4739[5] = var7; // L: 285
		this.field4739[6] = var8; // L: 286
		this.field4739[7] = var9; // L: 287
		this.field4739[8] = var10; // L: 288
		this.field4739[9] = var11; // L: 289
		this.field4739[10] = var12; // L: 290
		this.field4739[11] = var13; // L: 291
		this.field4739[12] = var14; // L: 292
		this.field4739[13] = var15; // L: 293
		this.field4739[14] = var16; // L: 294
		this.field4739[15] = var17; // L: 295
	} // L: 296

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "6"
	)
	public float[] method8205() {
		float[] var1 = new float[3]; // L: 333
		class448 var2 = new class448(this.field4739[0], this.field4739[1], this.field4739[2]); // L: 334
		class448 var3 = new class448(this.field4739[4], this.field4739[5], this.field4739[6]); // L: 335
		class448 var4 = new class448(this.field4739[8], this.field4739[9], this.field4739[10]); // L: 336
		var1[0] = var2.method8152(); // L: 337
		var1[1] = var3.method8152(); // L: 338
		var1[2] = var4.method8152(); // L: 339
		return var1; // L: 340
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder(); // L: 301
		this.method8193(); // L: 302
		this.method8192(); // L: 303

		for (int var2 = 0; var2 < 4; ++var2) { // L: 304
			for (int var3 = 0; var3 < 4; ++var3) { // L: 305
				if (var3 > 0) {
					var1.append("\t"); // L: 306
				}

				float var4 = this.field4739[var3 + var2 * 4]; // L: 307
				if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5D) { // L: 308
					var4 = 0.0F;
				}

				var1.append(var4); // L: 309
			}

			var1.append("\n"); // L: 311
		}

		return var1.toString(); // L: 313
	}

	public int hashCode() {
		boolean var1 = true; // L: 318
		byte var2 = 1; // L: 319
		int var3 = var2 * 31 + Arrays.hashCode(this.field4739); // L: 320
		return var3; // L: 321
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class450)) { // L: 326
			return false;
		} else {
			class450 var2 = (class450)var1; // L: 327

			for (int var3 = 0; var3 < 16; ++var3) { // L: 328
				if (this.field4739[var3] != var2.field4739[var3]) {
					return false;
				}
			}

			return true; // L: 329
		}
	}
}
