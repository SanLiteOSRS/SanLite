import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qt")
public final class class421 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Lqt;"
	)
	public static class421[] field4611;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -2064076709
	)
	static int field4609;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1816281437
	)
	public static int field4610;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lqt;"
	)
	public static final class421 field4612;
	@ObfuscatedName("an")
	public float[] field4608;

	static {
		field4611 = new class421[0]; // L: 9
		field4609 = 100; // L: 15
		field4611 = new class421[100]; // L: 16
		field4610 = 0; // L: 17
		field4612 = new class421();
	} // L: 22

	public class421() {
		this.field4608 = new float[16];
		this.method7856(); // L: 31
	} // L: 32

	@ObfuscatedSignature(
		descriptor = "(Lqt;)V"
	)
	public class421(class421 var1) {
		this.field4608 = new float[16];
		this.method7850(var1); // L: 35
	} // L: 36

	@ObfuscatedSignature(
		descriptor = "(Lsy;Z)V"
	)
	public class421(Buffer var1, boolean var2) {
		this.field4608 = new float[16]; // L: 21
		this.method7882(var1, var2); // L: 39
	} // L: 40

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1774903306"
	)
	public void method7888() {
		synchronized(field4611) { // L: 25
			if (field4610 < field4609 - 1) { // L: 26
				field4611[++field4610 - 1] = this;
			}

		}
	} // L: 28

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lsy;ZI)V",
		garbageValue = "-1704033205"
	)
	void method7882(Buffer var1, boolean var2) {
		if (var2) { // L: 43
			class422 var13 = new class422(); // L: 44
			int var6 = var1.readShort(); // L: 47
			var6 &= 16383; // L: 49
			float var5 = (float)((double)((float)var6 / 16384.0F) * 6.283185307179586D); // L: 50
			var13.method7904(var5); // L: 52
			int var9 = var1.readShort(); // L: 55
			var9 &= 16383; // L: 57
			float var8 = (float)(6.283185307179586D * (double)((float)var9 / 16384.0F)); // L: 58
			var13.method7905(var8); // L: 60
			int var12 = var1.readShort(); // L: 63
			var12 &= 16383; // L: 65
			float var11 = (float)(6.283185307179586D * (double)((float)var12 / 16384.0F)); // L: 66
			var13.method7908(var11); // L: 68
			var13.method7913((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort()); // L: 69
			this.method7899(var13); // L: 70
		} else {
			for (int var3 = 0; var3 < 16; ++var3) { // L: 73
				this.field4608[var3] = var1.method8626(); // L: 74
			}
		}

	} // L: 77

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "-101"
	)
	float[] method7844() {
		float[] var1 = new float[3]; // L: 80
		if ((double)this.field4608[2] < 0.999D && (double)this.field4608[2] > -0.999D) { // L: 81
			var1[1] = (float)(-Math.asin((double)this.field4608[2])); // L: 82
			double var2 = Math.cos((double)var1[1]); // L: 83
			var1[0] = (float)Math.atan2((double)this.field4608[6] / var2, (double)this.field4608[10] / var2); // L: 84
			var1[2] = (float)Math.atan2((double)this.field4608[1] / var2, (double)this.field4608[0] / var2); // L: 85
		} else {
			var1[0] = 0.0F; // L: 88
			var1[1] = (float)Math.atan2((double)this.field4608[2], 0.0D); // L: 89
			var1[2] = (float)Math.atan2((double)(-this.field4608[9]), (double)this.field4608[5]); // L: 90
		}

		return var1; // L: 92
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "1868274554"
	)
	public float[] method7858() {
		float[] var1 = new float[]{(float)(-Math.asin((double)this.field4608[6])), 0.0F, 0.0F}; // L: 96 97
		double var2 = Math.cos((double)var1[0]); // L: 98
		double var4;
		double var6;
		if (Math.abs(var2) > 0.005D) { // L: 99
			var4 = (double)this.field4608[2]; // L: 100
			var6 = (double)this.field4608[10]; // L: 101
			double var8 = (double)this.field4608[4]; // L: 102
			double var10 = (double)this.field4608[5]; // L: 103
			var1[1] = (float)Math.atan2(var4, var6); // L: 104
			var1[2] = (float)Math.atan2(var8, var10); // L: 105
		} else {
			var4 = (double)this.field4608[1]; // L: 108
			var6 = (double)this.field4608[0]; // L: 109
			if (this.field4608[6] < 0.0F) { // L: 110
				var1[1] = (float)Math.atan2(var4, var6); // L: 111
			} else {
				var1[1] = (float)(-Math.atan2(var4, var6)); // L: 114
			}

			var1[2] = 0.0F; // L: 116
		}

		return var1; // L: 118
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1579547508"
	)
	public void method7856() {
		this.field4608[0] = 1.0F; // L: 122
		this.field4608[1] = 0.0F; // L: 123
		this.field4608[2] = 0.0F; // L: 124
		this.field4608[3] = 0.0F; // L: 125
		this.field4608[4] = 0.0F; // L: 126
		this.field4608[5] = 1.0F; // L: 127
		this.field4608[6] = 0.0F; // L: 128
		this.field4608[7] = 0.0F; // L: 129
		this.field4608[8] = 0.0F; // L: 130
		this.field4608[9] = 0.0F; // L: 131
		this.field4608[10] = 1.0F; // L: 132
		this.field4608[11] = 0.0F; // L: 133
		this.field4608[12] = 0.0F; // L: 134
		this.field4608[13] = 0.0F; // L: 135
		this.field4608[14] = 0.0F; // L: 136
		this.field4608[15] = 1.0F; // L: 137
	} // L: 138

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "100"
	)
	public void method7877() {
		this.field4608[0] = 0.0F; // L: 141
		this.field4608[1] = 0.0F; // L: 142
		this.field4608[2] = 0.0F; // L: 143
		this.field4608[3] = 0.0F; // L: 144
		this.field4608[4] = 0.0F; // L: 145
		this.field4608[5] = 0.0F; // L: 146
		this.field4608[6] = 0.0F; // L: 147
		this.field4608[7] = 0.0F; // L: 148
		this.field4608[8] = 0.0F; // L: 149
		this.field4608[9] = 0.0F; // L: 150
		this.field4608[10] = 0.0F; // L: 151
		this.field4608[11] = 0.0F; // L: 152
		this.field4608[12] = 0.0F; // L: 153
		this.field4608[13] = 0.0F; // L: 154
		this.field4608[14] = 0.0F; // L: 155
		this.field4608[15] = 0.0F; // L: 156
	} // L: 157

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lqt;I)V",
		garbageValue = "-1594891298"
	)
	public void method7850(class421 var1) {
		System.arraycopy(var1.field4608, 0, this.field4608, 0, 16); // L: 160
	} // L: 161

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-963333532"
	)
	public void method7849(float var1) {
		this.method7847(var1, var1, var1); // L: 164
	} // L: 165

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "-1492163658"
	)
	public void method7847(float var1, float var2, float var3) {
		this.method7856(); // L: 168
		this.field4608[0] = var1; // L: 169
		this.field4608[5] = var2; // L: 170
		this.field4608[10] = var3; // L: 171
	} // L: 172

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lqt;I)V",
		garbageValue = "1265956468"
	)
	public void method7885(class421 var1) {
		for (int var2 = 0; var2 < this.field4608.length; ++var2) { // L: 175
			float[] var10000 = this.field4608; // L: 176
			var10000[var2] += var1.field4608[var2];
		}

	} // L: 178

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lqt;B)V",
		garbageValue = "27"
	)
	public void method7851(class421 var1) {
		float var2 = this.field4608[1] * var1.field4608[4] + this.field4608[0] * var1.field4608[0] + this.field4608[2] * var1.field4608[8] + this.field4608[3] * var1.field4608[12]; // L: 181
		float var3 = this.field4608[3] * var1.field4608[13] + this.field4608[2] * var1.field4608[9] + this.field4608[1] * var1.field4608[5] + var1.field4608[1] * this.field4608[0]; // L: 182
		float var4 = var1.field4608[10] * this.field4608[2] + var1.field4608[2] * this.field4608[0] + var1.field4608[6] * this.field4608[1] + this.field4608[3] * var1.field4608[14]; // L: 183
		float var5 = var1.field4608[7] * this.field4608[1] + var1.field4608[3] * this.field4608[0] + this.field4608[2] * var1.field4608[11] + var1.field4608[15] * this.field4608[3]; // L: 184
		float var6 = this.field4608[7] * var1.field4608[12] + this.field4608[6] * var1.field4608[8] + this.field4608[4] * var1.field4608[0] + this.field4608[5] * var1.field4608[4]; // L: 185
		float var7 = this.field4608[7] * var1.field4608[13] + var1.field4608[9] * this.field4608[6] + this.field4608[5] * var1.field4608[5] + var1.field4608[1] * this.field4608[4]; // L: 186
		float var8 = this.field4608[6] * var1.field4608[10] + this.field4608[5] * var1.field4608[6] + this.field4608[4] * var1.field4608[2] + var1.field4608[14] * this.field4608[7]; // L: 187
		float var9 = var1.field4608[15] * this.field4608[7] + this.field4608[4] * var1.field4608[3] + var1.field4608[7] * this.field4608[5] + this.field4608[6] * var1.field4608[11]; // L: 188
		float var10 = var1.field4608[12] * this.field4608[11] + var1.field4608[0] * this.field4608[8] + this.field4608[9] * var1.field4608[4] + this.field4608[10] * var1.field4608[8]; // L: 189
		float var11 = var1.field4608[13] * this.field4608[11] + var1.field4608[9] * this.field4608[10] + var1.field4608[5] * this.field4608[9] + var1.field4608[1] * this.field4608[8]; // L: 190
		float var12 = this.field4608[11] * var1.field4608[14] + var1.field4608[10] * this.field4608[10] + this.field4608[8] * var1.field4608[2] + var1.field4608[6] * this.field4608[9]; // L: 191
		float var13 = var1.field4608[11] * this.field4608[10] + var1.field4608[7] * this.field4608[9] + this.field4608[8] * var1.field4608[3] + var1.field4608[15] * this.field4608[11]; // L: 192
		float var14 = this.field4608[15] * var1.field4608[12] + this.field4608[13] * var1.field4608[4] + var1.field4608[0] * this.field4608[12] + this.field4608[14] * var1.field4608[8]; // L: 193
		float var15 = this.field4608[14] * var1.field4608[9] + this.field4608[12] * var1.field4608[1] + var1.field4608[5] * this.field4608[13] + var1.field4608[13] * this.field4608[15]; // L: 194
		float var16 = this.field4608[14] * var1.field4608[10] + var1.field4608[6] * this.field4608[13] + this.field4608[12] * var1.field4608[2] + this.field4608[15] * var1.field4608[14]; // L: 195
		float var17 = var1.field4608[15] * this.field4608[15] + this.field4608[14] * var1.field4608[11] + this.field4608[13] * var1.field4608[7] + this.field4608[12] * var1.field4608[3]; // L: 196
		this.field4608[0] = var2; // L: 197
		this.field4608[1] = var3; // L: 198
		this.field4608[2] = var4; // L: 199
		this.field4608[3] = var5; // L: 200
		this.field4608[4] = var6; // L: 201
		this.field4608[5] = var7; // L: 202
		this.field4608[6] = var8; // L: 203
		this.field4608[7] = var9; // L: 204
		this.field4608[8] = var10; // L: 205
		this.field4608[9] = var11; // L: 206
		this.field4608[10] = var12; // L: 207
		this.field4608[11] = var13; // L: 208
		this.field4608[12] = var14; // L: 209
		this.field4608[13] = var15; // L: 210
		this.field4608[14] = var16; // L: 211
		this.field4608[15] = var17; // L: 212
	} // L: 213

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lqh;B)V",
		garbageValue = "-50"
	)
	public void method7852(class420 var1) {
		float var2 = var1.field4603 * var1.field4603; // L: 216
		float var3 = var1.field4603 * var1.field4602; // L: 217
		float var4 = var1.field4604 * var1.field4603; // L: 218
		float var5 = var1.field4605 * var1.field4603; // L: 219
		float var6 = var1.field4602 * var1.field4602; // L: 220
		float var7 = var1.field4604 * var1.field4602; // L: 221
		float var8 = var1.field4602 * var1.field4605; // L: 222
		float var9 = var1.field4604 * var1.field4604; // L: 223
		float var10 = var1.field4605 * var1.field4604; // L: 224
		float var11 = var1.field4605 * var1.field4605; // L: 225
		this.field4608[0] = var6 + var2 - var11 - var9; // L: 226
		this.field4608[1] = var7 + var7 + var5 + var5; // L: 227
		this.field4608[2] = var8 - var4 - var4 + var8; // L: 228
		this.field4608[4] = var7 + (var7 - var5 - var5); // L: 229
		this.field4608[5] = var9 + var2 - var6 - var11; // L: 230
		this.field4608[6] = var3 + var3 + var10 + var10; // L: 231
		this.field4608[8] = var8 + var8 + var4 + var4; // L: 232
		this.field4608[9] = var10 + (var10 - var3 - var3); // L: 233
		this.field4608[10] = var11 + var2 - var9 - var6; // L: 234
	} // L: 235

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lqx;B)V",
		garbageValue = "56"
	)
	void method7899(class422 var1) {
		this.field4608[0] = var1.field4619; // L: 238
		this.field4608[1] = var1.field4624; // L: 239
		this.field4608[2] = var1.field4615; // L: 240
		this.field4608[3] = 0.0F; // L: 241
		this.field4608[4] = var1.field4616; // L: 242
		this.field4608[5] = var1.field4617; // L: 243
		this.field4608[6] = var1.field4618; // L: 244
		this.field4608[7] = 0.0F; // L: 245
		this.field4608[8] = var1.field4613; // L: 246
		this.field4608[9] = var1.field4620; // L: 247
		this.field4608[10] = var1.field4621; // L: 248
		this.field4608[11] = 0.0F; // L: 249
		this.field4608[12] = var1.field4622; // L: 250
		this.field4608[13] = var1.field4614; // L: 251
		this.field4608[14] = var1.field4623; // L: 252
		this.field4608[15] = 1.0F; // L: 253
	} // L: 254

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)F",
		garbageValue = "1"
	)
	float method7854() {
		return this.field4608[12] * this.field4608[3] * this.field4608[6] * this.field4608[9] + (this.field4608[10] * this.field4608[3] * this.field4608[4] * this.field4608[13] + (this.field4608[1] * this.field4608[6] * this.field4608[8] * this.field4608[15] + this.field4608[5] * this.field4608[0] * this.field4608[10] * this.field4608[15] - this.field4608[5] * this.field4608[0] * this.field4608[11] * this.field4608[14] - this.field4608[0] * this.field4608[6] * this.field4608[9] * this.field4608[15] + this.field4608[6] * this.field4608[0] * this.field4608[11] * this.field4608[13] + this.field4608[14] * this.field4608[9] * this.field4608[7] * this.field4608[0] - this.field4608[10] * this.field4608[7] * this.field4608[0] * this.field4608[13] - this.field4608[10] * this.field4608[1] * this.field4608[4] * this.field4608[15] + this.field4608[14] * this.field4608[4] * this.field4608[1] * this.field4608[11] - this.field4608[12] * this.field4608[11] * this.field4608[6] * this.field4608[1] - this.field4608[7] * this.field4608[1] * this.field4608[8] * this.field4608[14] + this.field4608[12] * this.field4608[7] * this.field4608[1] * this.field4608[10] + this.field4608[9] * this.field4608[4] * this.field4608[2] * this.field4608[15] - this.field4608[13] * this.field4608[4] * this.field4608[2] * this.field4608[11] - this.field4608[15] * this.field4608[5] * this.field4608[2] * this.field4608[8] + this.field4608[2] * this.field4608[5] * this.field4608[11] * this.field4608[12] + this.field4608[13] * this.field4608[8] * this.field4608[7] * this.field4608[2] - this.field4608[9] * this.field4608[7] * this.field4608[2] * this.field4608[12] - this.field4608[14] * this.field4608[3] * this.field4608[4] * this.field4608[9]) + this.field4608[14] * this.field4608[8] * this.field4608[5] * this.field4608[3] - this.field4608[5] * this.field4608[3] * this.field4608[10] * this.field4608[12] - this.field4608[3] * this.field4608[6] * this.field4608[8] * this.field4608[13]); // L: 257
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2129943862"
	)
	public void method7855() {
		float var1 = 1.0F / this.method7854(); // L: 261
		float var2 = var1 * (this.field4608[14] * this.field4608[9] * this.field4608[7] + this.field4608[13] * this.field4608[6] * this.field4608[11] + (this.field4608[10] * this.field4608[5] * this.field4608[15] - this.field4608[11] * this.field4608[5] * this.field4608[14] - this.field4608[15] * this.field4608[9] * this.field4608[6]) - this.field4608[13] * this.field4608[7] * this.field4608[10]); // L: 262
		float var3 = var1 * (this.field4608[3] * this.field4608[10] * this.field4608[13] + (this.field4608[15] * -this.field4608[1] * this.field4608[10] + this.field4608[14] * this.field4608[11] * this.field4608[1] + this.field4608[15] * this.field4608[9] * this.field4608[2] - this.field4608[13] * this.field4608[2] * this.field4608[11] - this.field4608[3] * this.field4608[9] * this.field4608[14])); // L: 263
		float var4 = var1 * (this.field4608[2] * this.field4608[7] * this.field4608[13] + (this.field4608[15] * this.field4608[6] * this.field4608[1] - this.field4608[1] * this.field4608[7] * this.field4608[14] - this.field4608[5] * this.field4608[2] * this.field4608[15]) + this.field4608[3] * this.field4608[5] * this.field4608[14] - this.field4608[13] * this.field4608[3] * this.field4608[6]); // L: 264
		float var5 = (this.field4608[6] * -this.field4608[1] * this.field4608[11] + this.field4608[10] * this.field4608[1] * this.field4608[7] + this.field4608[11] * this.field4608[2] * this.field4608[5] - this.field4608[2] * this.field4608[7] * this.field4608[9] - this.field4608[10] * this.field4608[3] * this.field4608[5] + this.field4608[9] * this.field4608[3] * this.field4608[6]) * var1; // L: 265
		float var6 = var1 * (this.field4608[12] * this.field4608[7] * this.field4608[10] + (this.field4608[14] * this.field4608[4] * this.field4608[11] + -this.field4608[4] * this.field4608[10] * this.field4608[15] + this.field4608[8] * this.field4608[6] * this.field4608[15] - this.field4608[12] * this.field4608[11] * this.field4608[6] - this.field4608[7] * this.field4608[8] * this.field4608[14])); // L: 266
		float var7 = (this.field4608[12] * this.field4608[2] * this.field4608[11] + (this.field4608[15] * this.field4608[0] * this.field4608[10] - this.field4608[14] * this.field4608[11] * this.field4608[0] - this.field4608[8] * this.field4608[2] * this.field4608[15]) + this.field4608[14] * this.field4608[3] * this.field4608[8] - this.field4608[12] * this.field4608[10] * this.field4608[3]) * var1; // L: 267
		float var8 = (this.field4608[4] * this.field4608[2] * this.field4608[15] + this.field4608[15] * this.field4608[6] * -this.field4608[0] + this.field4608[14] * this.field4608[0] * this.field4608[7] - this.field4608[2] * this.field4608[7] * this.field4608[12] - this.field4608[14] * this.field4608[4] * this.field4608[3] + this.field4608[6] * this.field4608[3] * this.field4608[12]) * var1; // L: 268
		float var9 = var1 * (this.field4608[11] * this.field4608[0] * this.field4608[6] - this.field4608[10] * this.field4608[0] * this.field4608[7] - this.field4608[11] * this.field4608[4] * this.field4608[2] + this.field4608[7] * this.field4608[2] * this.field4608[8] + this.field4608[3] * this.field4608[4] * this.field4608[10] - this.field4608[8] * this.field4608[3] * this.field4608[6]); // L: 269
		float var10 = (this.field4608[13] * this.field4608[8] * this.field4608[7] + this.field4608[15] * this.field4608[9] * this.field4608[4] - this.field4608[4] * this.field4608[11] * this.field4608[13] - this.field4608[5] * this.field4608[8] * this.field4608[15] + this.field4608[12] * this.field4608[11] * this.field4608[5] - this.field4608[7] * this.field4608[9] * this.field4608[12]) * var1; // L: 270
		float var11 = (-this.field4608[0] * this.field4608[9] * this.field4608[15] + this.field4608[13] * this.field4608[11] * this.field4608[0] + this.field4608[8] * this.field4608[1] * this.field4608[15] - this.field4608[11] * this.field4608[1] * this.field4608[12] - this.field4608[8] * this.field4608[3] * this.field4608[13] + this.field4608[12] * this.field4608[9] * this.field4608[3]) * var1; // L: 271
		float var12 = (this.field4608[3] * this.field4608[4] * this.field4608[13] + this.field4608[1] * this.field4608[7] * this.field4608[12] + (this.field4608[0] * this.field4608[5] * this.field4608[15] - this.field4608[13] * this.field4608[0] * this.field4608[7] - this.field4608[4] * this.field4608[1] * this.field4608[15]) - this.field4608[3] * this.field4608[5] * this.field4608[12]) * var1; // L: 272
		float var13 = var1 * (this.field4608[0] * this.field4608[7] * this.field4608[9] + -this.field4608[0] * this.field4608[5] * this.field4608[11] + this.field4608[11] * this.field4608[1] * this.field4608[4] - this.field4608[8] * this.field4608[7] * this.field4608[1] - this.field4608[9] * this.field4608[3] * this.field4608[4] + this.field4608[8] * this.field4608[3] * this.field4608[5]); // L: 273
		float var14 = var1 * (this.field4608[12] * this.field4608[9] * this.field4608[6] + (this.field4608[14] * this.field4608[9] * -this.field4608[4] + this.field4608[4] * this.field4608[10] * this.field4608[13] + this.field4608[14] * this.field4608[8] * this.field4608[5] - this.field4608[5] * this.field4608[10] * this.field4608[12] - this.field4608[6] * this.field4608[8] * this.field4608[13])); // L: 274
		float var15 = var1 * (this.field4608[2] * this.field4608[8] * this.field4608[13] + this.field4608[12] * this.field4608[1] * this.field4608[10] + (this.field4608[14] * this.field4608[9] * this.field4608[0] - this.field4608[10] * this.field4608[0] * this.field4608[13] - this.field4608[1] * this.field4608[8] * this.field4608[14]) - this.field4608[2] * this.field4608[9] * this.field4608[12]); // L: 275
		float var16 = (this.field4608[5] * this.field4608[2] * this.field4608[12] + (this.field4608[4] * this.field4608[1] * this.field4608[14] + -this.field4608[0] * this.field4608[5] * this.field4608[14] + this.field4608[13] * this.field4608[6] * this.field4608[0] - this.field4608[12] * this.field4608[1] * this.field4608[6] - this.field4608[4] * this.field4608[2] * this.field4608[13])) * var1; // L: 276
		float var17 = var1 * (this.field4608[9] * this.field4608[4] * this.field4608[2] + this.field4608[8] * this.field4608[1] * this.field4608[6] + (this.field4608[5] * this.field4608[0] * this.field4608[10] - this.field4608[9] * this.field4608[0] * this.field4608[6] - this.field4608[10] * this.field4608[1] * this.field4608[4]) - this.field4608[5] * this.field4608[2] * this.field4608[8]); // L: 277
		this.field4608[0] = var2; // L: 278
		this.field4608[1] = var3; // L: 279
		this.field4608[2] = var4; // L: 280
		this.field4608[3] = var5; // L: 281
		this.field4608[4] = var6; // L: 282
		this.field4608[5] = var7; // L: 283
		this.field4608[6] = var8; // L: 284
		this.field4608[7] = var9; // L: 285
		this.field4608[8] = var10; // L: 286
		this.field4608[9] = var11; // L: 287
		this.field4608[10] = var12; // L: 288
		this.field4608[11] = var13; // L: 289
		this.field4608[12] = var14; // L: 290
		this.field4608[13] = var15; // L: 291
		this.field4608[14] = var16; // L: 292
		this.field4608[15] = var17; // L: 293
	} // L: 294

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "1849517045"
	)
	public float[] method7857() {
		float[] var1 = new float[3]; // L: 331
		class419 var2 = new class419(this.field4608[0], this.field4608[1], this.field4608[2]); // L: 332
		class419 var3 = new class419(this.field4608[4], this.field4608[5], this.field4608[6]); // L: 333
		class419 var4 = new class419(this.field4608[8], this.field4608[9], this.field4608[10]); // L: 334
		var1[0] = var2.method7815(); // L: 335
		var1[1] = var3.method7815(); // L: 336
		var1[2] = var4.method7815(); // L: 337
		return var1; // L: 338
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder(); // L: 299
		this.method7858(); // L: 300
		this.method7844(); // L: 301

		for (int var2 = 0; var2 < 4; ++var2) { // L: 302
			for (int var3 = 0; var3 < 4; ++var3) { // L: 303
				if (var3 > 0) {
					var1.append("\t"); // L: 304
				}

				float var4 = this.field4608[var3 + var2 * 4]; // L: 305
				if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5D) { // L: 306
					var4 = 0.0F;
				}

				var1.append(var4); // L: 307
			}

			var1.append("\n"); // L: 309
		}

		return var1.toString(); // L: 311
	}

	public int hashCode() {
		boolean var1 = true; // L: 316
		byte var2 = 1; // L: 317
		int var3 = 31 * var2 + Arrays.hashCode(this.field4608); // L: 318
		return var3; // L: 319
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class421)) { // L: 324
			return false;
		} else {
			class421 var2 = (class421)var1; // L: 325

			for (int var3 = 0; var3 < 16; ++var3) { // L: 326
				if (this.field4608[var3] != var2.field4608[var3]) {
					return false;
				}
			}

			return true; // L: 327
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lgj;",
		garbageValue = "-1046185305"
	)
	public static Clock method7879() {
		try {
			return new NanoClock(); // L: 8
		} catch (Throwable var1) { // L: 10
			return new MilliClock(); // L: 11
		}
	}
}
