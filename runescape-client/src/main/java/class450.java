import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rp")
public final class class450 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Lrp;"
	)
	public static class450[] field4733;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1426074743
	)
	static int field4732;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lrp;"
	)
	public static final class450 field4735;
	@ObfuscatedName("ay")
	public float[] field4734;

	static {
		field4733 = new class450[0]; // L: 9
		class141.method3182(100); // L: 14
		field4735 = new class450(); // L: 18
	}

	public class450() {
		this.field4734 = new float[16];
		this.method8202(); // L: 33
	} // L: 34

	@ObfuscatedSignature(
		descriptor = "(Lrp;)V"
	)
	public class450(class450 var1) {
		this.field4734 = new float[16];
		this.method8209(var1); // L: 37
	} // L: 38

	@ObfuscatedSignature(
		descriptor = "(Ltl;Z)V"
	)
	public class450(Buffer var1, boolean var2) {
		this.field4734 = new float[16]; // L: 17
		this.method8204(var1, var2); // L: 41
	} // L: 42

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "902622117"
	)
	public void method8246() {
		synchronized(field4733) { // L: 27
			if (class383.field4405 < field4732 - 1) { // L: 28
				field4733[++class383.field4405 - 1] = this;
			}

		}
	} // L: 30

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ltl;ZI)V",
		garbageValue = "-1999441849"
	)
	void method8204(Buffer var1, boolean var2) {
		if (var2) { // L: 45
			class451 var13 = new class451(); // L: 46
			int var6 = var1.readShort(); // L: 49
			var6 &= 16383; // L: 51
			float var5 = (float)((double)((float)var6 / 16384.0F) * 6.283185307179586D); // L: 52
			var13.method8277(var5); // L: 54
			int var9 = var1.readShort(); // L: 57
			var9 &= 16383; // L: 59
			float var8 = (float)((double)((float)var9 / 16384.0F) * 6.283185307179586D); // L: 60
			var13.method8268(var8); // L: 62
			int var12 = var1.readShort(); // L: 65
			var12 &= 16383; // L: 67
			float var11 = (float)((double)((float)var12 / 16384.0F) * 6.283185307179586D); // L: 68
			var13.method8269(var11); // L: 70
			var13.method8271((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort()); // L: 71
			this.method8215(var13); // L: 72
		} else {
			for (int var3 = 0; var3 < 16; ++var3) { // L: 75
				this.field4734[var3] = var1.method9065(); // L: 76
			}
		}

	} // L: 79

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "2120948192"
	)
	float[] method8233() {
		float[] var1 = new float[3]; // L: 82
		if ((double)this.field4734[2] < 0.999D && (double)this.field4734[2] > -0.999D) { // L: 83
			var1[1] = (float)(-Math.asin((double)this.field4734[2])); // L: 84
			double var2 = Math.cos((double)var1[1]); // L: 85
			var1[0] = (float)Math.atan2((double)this.field4734[6] / var2, (double)this.field4734[10] / var2); // L: 86
			var1[2] = (float)Math.atan2((double)this.field4734[1] / var2, (double)this.field4734[0] / var2); // L: 87
		} else {
			var1[0] = 0.0F; // L: 90
			var1[1] = (float)Math.atan2((double)this.field4734[2], 0.0D); // L: 91
			var1[2] = (float)Math.atan2((double)(-this.field4734[9]), (double)this.field4734[5]); // L: 92
		}

		return var1; // L: 94
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "-783358231"
	)
	public float[] method8206() {
		float[] var1 = new float[]{(float)(-Math.asin((double)this.field4734[6])), 0.0F, 0.0F}; // L: 98 99
		double var2 = Math.cos((double)var1[0]); // L: 100
		double var4;
		double var6;
		if (Math.abs(var2) > 0.005D) { // L: 101
			var4 = (double)this.field4734[2]; // L: 102
			var6 = (double)this.field4734[10]; // L: 103
			double var8 = (double)this.field4734[4]; // L: 104
			double var10 = (double)this.field4734[5]; // L: 105
			var1[1] = (float)Math.atan2(var4, var6); // L: 106
			var1[2] = (float)Math.atan2(var8, var10); // L: 107
		} else {
			var4 = (double)this.field4734[1]; // L: 110
			var6 = (double)this.field4734[0]; // L: 111
			if (this.field4734[6] < 0.0F) { // L: 112
				var1[1] = (float)Math.atan2(var4, var6); // L: 113
			} else {
				var1[1] = (float)(-Math.atan2(var4, var6)); // L: 116
			}

			var1[2] = 0.0F; // L: 118
		}

		return var1; // L: 120
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1202704711"
	)
	public void method8202() {
		this.field4734[0] = 1.0F; // L: 124
		this.field4734[1] = 0.0F; // L: 125
		this.field4734[2] = 0.0F; // L: 126
		this.field4734[3] = 0.0F; // L: 127
		this.field4734[4] = 0.0F; // L: 128
		this.field4734[5] = 1.0F; // L: 129
		this.field4734[6] = 0.0F; // L: 130
		this.field4734[7] = 0.0F; // L: 131
		this.field4734[8] = 0.0F; // L: 132
		this.field4734[9] = 0.0F; // L: 133
		this.field4734[10] = 1.0F; // L: 134
		this.field4734[11] = 0.0F; // L: 135
		this.field4734[12] = 0.0F; // L: 136
		this.field4734[13] = 0.0F; // L: 137
		this.field4734[14] = 0.0F; // L: 138
		this.field4734[15] = 1.0F; // L: 139
	} // L: 140

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1518576091"
	)
	public void method8208() {
		this.field4734[0] = 0.0F; // L: 143
		this.field4734[1] = 0.0F; // L: 144
		this.field4734[2] = 0.0F; // L: 145
		this.field4734[3] = 0.0F; // L: 146
		this.field4734[4] = 0.0F; // L: 147
		this.field4734[5] = 0.0F; // L: 148
		this.field4734[6] = 0.0F; // L: 149
		this.field4734[7] = 0.0F; // L: 150
		this.field4734[8] = 0.0F; // L: 151
		this.field4734[9] = 0.0F; // L: 152
		this.field4734[10] = 0.0F; // L: 153
		this.field4734[11] = 0.0F; // L: 154
		this.field4734[12] = 0.0F; // L: 155
		this.field4734[13] = 0.0F; // L: 156
		this.field4734[14] = 0.0F; // L: 157
		this.field4734[15] = 0.0F; // L: 158
	} // L: 159

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lrp;I)V",
		garbageValue = "1690906036"
	)
	public void method8209(class450 var1) {
		System.arraycopy(var1.field4734, 0, this.field4734, 0, 16); // L: 162
	} // L: 163

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-1871103502"
	)
	public void method8263(float var1) {
		this.method8220(var1, var1, var1); // L: 166
	} // L: 167

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(FFFB)V",
		garbageValue = "67"
	)
	public void method8220(float var1, float var2, float var3) {
		this.method8202(); // L: 170
		this.field4734[0] = var1; // L: 171
		this.field4734[5] = var2; // L: 172
		this.field4734[10] = var3; // L: 173
	} // L: 174

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lrp;I)V",
		garbageValue = "-1245482898"
	)
	public void method8252(class450 var1) {
		for (int var2 = 0; var2 < this.field4734.length; ++var2) { // L: 177
			float[] var10000 = this.field4734; // L: 178
			var10000[var2] += var1.field4734[var2];
		}

	} // L: 180

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lrp;I)V",
		garbageValue = "-1768255838"
	)
	public void method8257(class450 var1) {
		float var2 = this.field4734[3] * var1.field4734[12] + this.field4734[2] * var1.field4734[8] + var1.field4734[0] * this.field4734[0] + var1.field4734[4] * this.field4734[1]; // L: 183
		float var3 = this.field4734[3] * var1.field4734[13] + var1.field4734[9] * this.field4734[2] + var1.field4734[1] * this.field4734[0] + this.field4734[1] * var1.field4734[5]; // L: 184
		float var4 = var1.field4734[6] * this.field4734[1] + this.field4734[0] * var1.field4734[2] + this.field4734[2] * var1.field4734[10] + var1.field4734[14] * this.field4734[3]; // L: 185
		float var5 = this.field4734[3] * var1.field4734[15] + this.field4734[1] * var1.field4734[7] + this.field4734[0] * var1.field4734[3] + var1.field4734[11] * this.field4734[2]; // L: 186
		float var6 = var1.field4734[8] * this.field4734[6] + this.field4734[5] * var1.field4734[4] + var1.field4734[0] * this.field4734[4] + var1.field4734[12] * this.field4734[7]; // L: 187
		float var7 = var1.field4734[9] * this.field4734[6] + this.field4734[5] * var1.field4734[5] + var1.field4734[1] * this.field4734[4] + var1.field4734[13] * this.field4734[7]; // L: 188
		float var8 = this.field4734[7] * var1.field4734[14] + var1.field4734[2] * this.field4734[4] + var1.field4734[6] * this.field4734[5] + this.field4734[6] * var1.field4734[10]; // L: 189
		float var9 = var1.field4734[3] * this.field4734[4] + this.field4734[5] * var1.field4734[7] + this.field4734[6] * var1.field4734[11] + var1.field4734[15] * this.field4734[7]; // L: 190
		float var10 = var1.field4734[12] * this.field4734[11] + var1.field4734[8] * this.field4734[10] + this.field4734[9] * var1.field4734[4] + var1.field4734[0] * this.field4734[8]; // L: 191
		float var11 = var1.field4734[13] * this.field4734[11] + this.field4734[10] * var1.field4734[9] + var1.field4734[1] * this.field4734[8] + var1.field4734[5] * this.field4734[9]; // L: 192
		float var12 = this.field4734[11] * var1.field4734[14] + var1.field4734[10] * this.field4734[10] + this.field4734[9] * var1.field4734[6] + this.field4734[8] * var1.field4734[2]; // L: 193
		float var13 = var1.field4734[15] * this.field4734[11] + var1.field4734[3] * this.field4734[8] + this.field4734[9] * var1.field4734[7] + this.field4734[10] * var1.field4734[11]; // L: 194
		float var14 = var1.field4734[12] * this.field4734[15] + this.field4734[14] * var1.field4734[8] + this.field4734[13] * var1.field4734[4] + this.field4734[12] * var1.field4734[0]; // L: 195
		float var15 = this.field4734[15] * var1.field4734[13] + this.field4734[12] * var1.field4734[1] + this.field4734[13] * var1.field4734[5] + this.field4734[14] * var1.field4734[9]; // L: 196
		float var16 = this.field4734[15] * var1.field4734[14] + var1.field4734[6] * this.field4734[13] + this.field4734[12] * var1.field4734[2] + var1.field4734[10] * this.field4734[14]; // L: 197
		float var17 = var1.field4734[15] * this.field4734[15] + this.field4734[14] * var1.field4734[11] + var1.field4734[7] * this.field4734[13] + this.field4734[12] * var1.field4734[3]; // L: 198
		this.field4734[0] = var2; // L: 199
		this.field4734[1] = var3; // L: 200
		this.field4734[2] = var4; // L: 201
		this.field4734[3] = var5; // L: 202
		this.field4734[4] = var6; // L: 203
		this.field4734[5] = var7; // L: 204
		this.field4734[6] = var8; // L: 205
		this.field4734[7] = var9; // L: 206
		this.field4734[8] = var10; // L: 207
		this.field4734[9] = var11; // L: 208
		this.field4734[10] = var12; // L: 209
		this.field4734[11] = var13; // L: 210
		this.field4734[12] = var14; // L: 211
		this.field4734[13] = var15; // L: 212
		this.field4734[14] = var16; // L: 213
		this.field4734[15] = var17; // L: 214
	} // L: 215

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lri;I)V",
		garbageValue = "-1719067692"
	)
	public void method8247(class449 var1) {
		float var2 = var1.field4729 * var1.field4729; // L: 218
		float var3 = var1.field4726 * var1.field4729; // L: 219
		float var4 = var1.field4729 * var1.field4727; // L: 220
		float var5 = var1.field4728 * var1.field4729; // L: 221
		float var6 = var1.field4726 * var1.field4726; // L: 222
		float var7 = var1.field4727 * var1.field4726; // L: 223
		float var8 = var1.field4726 * var1.field4728; // L: 224
		float var9 = var1.field4727 * var1.field4727; // L: 225
		float var10 = var1.field4727 * var1.field4728; // L: 226
		float var11 = var1.field4728 * var1.field4728; // L: 227
		this.field4734[0] = var6 + var2 - var11 - var9; // L: 228
		this.field4734[1] = var5 + var7 + var7 + var5; // L: 229
		this.field4734[2] = var8 + (var8 - var4 - var4); // L: 230
		this.field4734[4] = var7 - var5 - var5 + var7; // L: 231
		this.field4734[5] = var9 + var2 - var6 - var11; // L: 232
		this.field4734[6] = var3 + var3 + var10 + var10; // L: 233
		this.field4734[8] = var4 + var8 + var8 + var4; // L: 234
		this.field4734[9] = var10 + (var10 - var3 - var3); // L: 235
		this.field4734[10] = var11 + var2 - var9 - var6; // L: 236
	} // L: 237

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lrq;I)V",
		garbageValue = "1236146356"
	)
	void method8215(class451 var1) {
		this.field4734[0] = var1.field4739; // L: 240
		this.field4734[1] = var1.field4737; // L: 241
		this.field4734[2] = var1.field4738; // L: 242
		this.field4734[3] = 0.0F; // L: 243
		this.field4734[4] = var1.field4749; // L: 244
		this.field4734[5] = var1.field4736; // L: 245
		this.field4734[6] = var1.field4742; // L: 246
		this.field4734[7] = 0.0F; // L: 247
		this.field4734[8] = var1.field4744; // L: 248
		this.field4734[9] = var1.field4743; // L: 249
		this.field4734[10] = var1.field4740; // L: 250
		this.field4734[11] = 0.0F; // L: 251
		this.field4734[12] = var1.field4745; // L: 252
		this.field4734[13] = var1.field4746; // L: 253
		this.field4734[14] = var1.field4747; // L: 254
		this.field4734[15] = 1.0F; // L: 255
	} // L: 256

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "2108003574"
	)
	float method8216() {
		return this.field4734[2] * this.field4734[7] * this.field4734[8] * this.field4734[13] + this.field4734[11] * this.field4734[5] * this.field4734[2] * this.field4734[12] + (this.field4734[12] * this.field4734[10] * this.field4734[1] * this.field4734[7] + (this.field4734[11] * this.field4734[0] * this.field4734[6] * this.field4734[13] + (this.field4734[15] * this.field4734[10] * this.field4734[5] * this.field4734[0] - this.field4734[11] * this.field4734[5] * this.field4734[0] * this.field4734[14] - this.field4734[15] * this.field4734[9] * this.field4734[0] * this.field4734[6]) + this.field4734[9] * this.field4734[0] * this.field4734[7] * this.field4734[14] - this.field4734[13] * this.field4734[7] * this.field4734[0] * this.field4734[10] - this.field4734[1] * this.field4734[4] * this.field4734[10] * this.field4734[15] + this.field4734[4] * this.field4734[1] * this.field4734[11] * this.field4734[14] + this.field4734[8] * this.field4734[1] * this.field4734[6] * this.field4734[15] - this.field4734[12] * this.field4734[6] * this.field4734[1] * this.field4734[11] - this.field4734[14] * this.field4734[1] * this.field4734[7] * this.field4734[8]) + this.field4734[15] * this.field4734[2] * this.field4734[4] * this.field4734[9] - this.field4734[4] * this.field4734[2] * this.field4734[11] * this.field4734[13] - this.field4734[15] * this.field4734[8] * this.field4734[5] * this.field4734[2]) - this.field4734[9] * this.field4734[7] * this.field4734[2] * this.field4734[12] - this.field4734[9] * this.field4734[3] * this.field4734[4] * this.field4734[14] + this.field4734[10] * this.field4734[3] * this.field4734[4] * this.field4734[13] + this.field4734[14] * this.field4734[8] * this.field4734[3] * this.field4734[5] - this.field4734[5] * this.field4734[3] * this.field4734[10] * this.field4734[12] - this.field4734[3] * this.field4734[6] * this.field4734[8] * this.field4734[13] + this.field4734[9] * this.field4734[6] * this.field4734[3] * this.field4734[12]; // L: 259
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "476627305"
	)
	public void method8258() {
		float var1 = 1.0F / this.method8216(); // L: 263
		float var2 = (this.field4734[11] * this.field4734[6] * this.field4734[13] + (this.field4734[10] * this.field4734[5] * this.field4734[15] - this.field4734[14] * this.field4734[11] * this.field4734[5] - this.field4734[6] * this.field4734[9] * this.field4734[15]) + this.field4734[14] * this.field4734[7] * this.field4734[9] - this.field4734[13] * this.field4734[10] * this.field4734[7]) * var1; // L: 264
		float var3 = (this.field4734[10] * this.field4734[3] * this.field4734[13] + (this.field4734[14] * this.field4734[1] * this.field4734[11] + this.field4734[15] * this.field4734[10] * -this.field4734[1] + this.field4734[15] * this.field4734[2] * this.field4734[9] - this.field4734[2] * this.field4734[11] * this.field4734[13] - this.field4734[14] * this.field4734[3] * this.field4734[9])) * var1; // L: 265
		float var4 = (this.field4734[14] * this.field4734[3] * this.field4734[5] + this.field4734[2] * this.field4734[7] * this.field4734[13] + (this.field4734[15] * this.field4734[6] * this.field4734[1] - this.field4734[14] * this.field4734[1] * this.field4734[7] - this.field4734[5] * this.field4734[2] * this.field4734[15]) - this.field4734[3] * this.field4734[6] * this.field4734[13]) * var1; // L: 266
		float var5 = (this.field4734[3] * this.field4734[6] * this.field4734[9] + (this.field4734[1] * this.field4734[7] * this.field4734[10] + this.field4734[6] * -this.field4734[1] * this.field4734[11] + this.field4734[11] * this.field4734[2] * this.field4734[5] - this.field4734[2] * this.field4734[7] * this.field4734[9] - this.field4734[3] * this.field4734[5] * this.field4734[10])) * var1; // L: 267
		float var6 = (this.field4734[12] * this.field4734[10] * this.field4734[7] + (this.field4734[14] * this.field4734[4] * this.field4734[11] + this.field4734[15] * -this.field4734[4] * this.field4734[10] + this.field4734[15] * this.field4734[6] * this.field4734[8] - this.field4734[6] * this.field4734[11] * this.field4734[12] - this.field4734[8] * this.field4734[7] * this.field4734[14])) * var1; // L: 268
		float var7 = var1 * (this.field4734[12] * this.field4734[11] * this.field4734[2] + (this.field4734[0] * this.field4734[10] * this.field4734[15] - this.field4734[0] * this.field4734[11] * this.field4734[14] - this.field4734[2] * this.field4734[8] * this.field4734[15]) + this.field4734[8] * this.field4734[3] * this.field4734[14] - this.field4734[10] * this.field4734[3] * this.field4734[12]); // L: 269
		float var8 = (this.field4734[4] * this.field4734[2] * this.field4734[15] + this.field4734[14] * this.field4734[7] * this.field4734[0] + this.field4734[15] * this.field4734[6] * -this.field4734[0] - this.field4734[2] * this.field4734[7] * this.field4734[12] - this.field4734[3] * this.field4734[4] * this.field4734[14] + this.field4734[12] * this.field4734[3] * this.field4734[6]) * var1; // L: 270
		float var9 = (this.field4734[2] * this.field4734[7] * this.field4734[8] + (this.field4734[0] * this.field4734[6] * this.field4734[11] - this.field4734[0] * this.field4734[7] * this.field4734[10] - this.field4734[11] * this.field4734[4] * this.field4734[2]) + this.field4734[10] * this.field4734[4] * this.field4734[3] - this.field4734[8] * this.field4734[6] * this.field4734[3]) * var1; // L: 271
		float var10 = (this.field4734[8] * this.field4734[7] * this.field4734[13] + this.field4734[9] * this.field4734[4] * this.field4734[15] - this.field4734[13] * this.field4734[11] * this.field4734[4] - this.field4734[8] * this.field4734[5] * this.field4734[15] + this.field4734[11] * this.field4734[5] * this.field4734[12] - this.field4734[9] * this.field4734[7] * this.field4734[12]) * var1; // L: 272
		float var11 = var1 * (this.field4734[13] * this.field4734[11] * this.field4734[0] + this.field4734[9] * -this.field4734[0] * this.field4734[15] + this.field4734[15] * this.field4734[1] * this.field4734[8] - this.field4734[11] * this.field4734[1] * this.field4734[12] - this.field4734[13] * this.field4734[8] * this.field4734[3] + this.field4734[9] * this.field4734[3] * this.field4734[12]); // L: 273
		float var12 = (this.field4734[3] * this.field4734[4] * this.field4734[13] + this.field4734[12] * this.field4734[1] * this.field4734[7] + (this.field4734[5] * this.field4734[0] * this.field4734[15] - this.field4734[7] * this.field4734[0] * this.field4734[13] - this.field4734[15] * this.field4734[4] * this.field4734[1]) - this.field4734[12] * this.field4734[5] * this.field4734[3]) * var1; // L: 274
		float var13 = (this.field4734[5] * this.field4734[3] * this.field4734[8] + (this.field4734[5] * -this.field4734[0] * this.field4734[11] + this.field4734[7] * this.field4734[0] * this.field4734[9] + this.field4734[1] * this.field4734[4] * this.field4734[11] - this.field4734[1] * this.field4734[7] * this.field4734[8] - this.field4734[9] * this.field4734[4] * this.field4734[3])) * var1; // L: 275
		float var14 = (this.field4734[12] * this.field4734[6] * this.field4734[9] + (this.field4734[14] * this.field4734[5] * this.field4734[8] + this.field4734[4] * this.field4734[10] * this.field4734[13] + -this.field4734[4] * this.field4734[9] * this.field4734[14] - this.field4734[10] * this.field4734[5] * this.field4734[12] - this.field4734[6] * this.field4734[8] * this.field4734[13])) * var1; // L: 276
		float var15 = var1 * (this.field4734[10] * this.field4734[1] * this.field4734[12] + (this.field4734[9] * this.field4734[0] * this.field4734[14] - this.field4734[13] * this.field4734[10] * this.field4734[0] - this.field4734[14] * this.field4734[8] * this.field4734[1]) + this.field4734[8] * this.field4734[2] * this.field4734[13] - this.field4734[9] * this.field4734[2] * this.field4734[12]); // L: 277
		float var16 = var1 * (this.field4734[2] * this.field4734[5] * this.field4734[12] + (this.field4734[6] * this.field4734[0] * this.field4734[13] + this.field4734[5] * -this.field4734[0] * this.field4734[14] + this.field4734[14] * this.field4734[4] * this.field4734[1] - this.field4734[12] * this.field4734[6] * this.field4734[1] - this.field4734[4] * this.field4734[2] * this.field4734[13])); // L: 278
		float var17 = (this.field4734[9] * this.field4734[4] * this.field4734[2] + this.field4734[6] * this.field4734[1] * this.field4734[8] + (this.field4734[5] * this.field4734[0] * this.field4734[10] - this.field4734[6] * this.field4734[0] * this.field4734[9] - this.field4734[4] * this.field4734[1] * this.field4734[10]) - this.field4734[5] * this.field4734[2] * this.field4734[8]) * var1; // L: 279
		this.field4734[0] = var2; // L: 280
		this.field4734[1] = var3; // L: 281
		this.field4734[2] = var4; // L: 282
		this.field4734[3] = var5; // L: 283
		this.field4734[4] = var6; // L: 284
		this.field4734[5] = var7; // L: 285
		this.field4734[6] = var8; // L: 286
		this.field4734[7] = var9; // L: 287
		this.field4734[8] = var10; // L: 288
		this.field4734[9] = var11; // L: 289
		this.field4734[10] = var12; // L: 290
		this.field4734[11] = var13; // L: 291
		this.field4734[12] = var14; // L: 292
		this.field4734[13] = var15; // L: 293
		this.field4734[14] = var16; // L: 294
		this.field4734[15] = var17; // L: 295
	} // L: 296

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "108"
	)
	public float[] method8219() {
		float[] var1 = new float[3]; // L: 333
		class448 var2 = new class448(this.field4734[0], this.field4734[1], this.field4734[2]); // L: 334
		class448 var3 = new class448(this.field4734[4], this.field4734[5], this.field4734[6]); // L: 335
		class448 var4 = new class448(this.field4734[8], this.field4734[9], this.field4734[10]); // L: 336
		var1[0] = var2.method8168(); // L: 337
		var1[1] = var3.method8168(); // L: 338
		var1[2] = var4.method8168(); // L: 339
		return var1; // L: 340
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder(); // L: 301
		this.method8206(); // L: 302
		this.method8233(); // L: 303

		for (int var2 = 0; var2 < 4; ++var2) { // L: 304
			for (int var3 = 0; var3 < 4; ++var3) { // L: 305
				if (var3 > 0) {
					var1.append("\t"); // L: 306
				}

				float var4 = this.field4734[var3 + var2 * 4]; // L: 307
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
		int var3 = 31 * var2 + Arrays.hashCode(this.field4734); // L: 320
		return var3; // L: 321
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class450)) { // L: 326
			return false;
		} else {
			class450 var2 = (class450)var1; // L: 327

			for (int var3 = 0; var3 < 16; ++var3) { // L: 328
				if (this.field4734[var3] != var2.field4734[var3]) {
					return false;
				}
			}

			return true; // L: 329
		}
	}
}
