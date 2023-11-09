import java.util.Arrays;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oj")
public final class class410 {
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "[Loj;"
	)
	static class410[] field4609;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1296378791
	)
	static int field4615;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 161940069
	)
	static int field4608;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	public static final class410 field4613;
	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "[Lrx;"
	)
	@Export("headIconPrayerSprites")
	static SpritePixels[] headIconPrayerSprites;
	@ObfuscatedName("m")
	public float[] field4612;

	static {
		field4609 = new class410[0]; // L: 9
		field4615 = 100; // L: 15
		field4609 = new class410[100]; // L: 16
		field4608 = 0; // L: 17
		field4613 = new class410();
	} // L: 22

	public class410() {
		this.field4612 = new float[16];
		this.method7782(); // L: 41
	} // L: 42

	@ObfuscatedSignature(
		descriptor = "(Loj;)V"
	)
	public class410(class410 var1) {
		this.field4612 = new float[16];
		this.method7784(var1); // L: 45
	} // L: 46

	@ObfuscatedSignature(
		descriptor = "(Lqy;Z)V"
	)
	public class410(Buffer var1, boolean var2) {
		this.field4612 = new float[16]; // L: 21
		this.method7779(var1, var2); // L: 49
	} // L: 50

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1020610059"
	)
	public void method7795() {
		synchronized(field4609) { // L: 35
			if (field4608 < field4615 - 1) { // L: 36
				field4609[++field4608 - 1] = this;
			}

		}
	} // L: 38

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lqy;ZI)V",
		garbageValue = "271698512"
	)
	void method7779(Buffer var1, boolean var2) {
		if (var2) { // L: 53
			class411 var13 = new class411(); // L: 54
			int var6 = var1.readShort(); // L: 57
			var6 &= 16383; // L: 59
			float var5 = (float)((double)((float)var6 / 16384.0F) * 6.283185307179586D); // L: 60
			var13.method7835(var5); // L: 62
			int var9 = var1.readShort(); // L: 65
			var9 &= 16383; // L: 67
			float var8 = (float)((double)((float)var9 / 16384.0F) * 6.283185307179586D); // L: 68
			var13.method7836(var8); // L: 70
			int var12 = var1.readShort(); // L: 73
			var12 &= 16383; // L: 75
			float var11 = (float)(6.283185307179586D * (double)((float)var12 / 16384.0F)); // L: 76
			var13.method7840(var11); // L: 78
			var13.method7838((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort()); // L: 79
			this.method7790(var13); // L: 80
		} else {
			for (int var3 = 0; var3 < 16; ++var3) { // L: 83
				this.field4612[var3] = var1.method8556(); // L: 84
			}
		}

	} // L: 87

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "22"
	)
	float[] method7780() {
		float[] var1 = new float[3]; // L: 90
		if ((double)this.field4612[2] < 0.999D && (double)this.field4612[2] > -0.999D) { // L: 91
			var1[1] = (float)(-Math.asin((double)this.field4612[2])); // L: 92
			double var2 = Math.cos((double)var1[1]); // L: 93
			var1[0] = (float)Math.atan2((double)this.field4612[6] / var2, (double)this.field4612[10] / var2); // L: 94
			var1[2] = (float)Math.atan2((double)this.field4612[1] / var2, (double)this.field4612[0] / var2); // L: 95
		} else {
			var1[0] = 0.0F; // L: 98
			var1[1] = (float)Math.atan2((double)this.field4612[2], 0.0D); // L: 99
			var1[2] = (float)Math.atan2((double)(-this.field4612[9]), (double)this.field4612[5]); // L: 100
		}

		return var1; // L: 102
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "-999012260"
	)
	public float[] method7781() {
		float[] var1 = new float[]{(float)(-Math.asin((double)this.field4612[6])), 0.0F, 0.0F}; // L: 106 107
		double var2 = Math.cos((double)var1[0]); // L: 108
		double var4;
		double var6;
		if (Math.abs(var2) > 0.005D) { // L: 109
			var4 = (double)this.field4612[2]; // L: 110
			var6 = (double)this.field4612[10]; // L: 111
			double var8 = (double)this.field4612[4]; // L: 112
			double var10 = (double)this.field4612[5]; // L: 113
			var1[1] = (float)Math.atan2(var4, var6); // L: 114
			var1[2] = (float)Math.atan2(var8, var10); // L: 115
		} else {
			var4 = (double)this.field4612[1]; // L: 118
			var6 = (double)this.field4612[0]; // L: 119
			if (this.field4612[6] < 0.0F) { // L: 120
				var1[1] = (float)Math.atan2(var4, var6); // L: 121
			} else {
				var1[1] = (float)(-Math.atan2(var4, var6)); // L: 124
			}

			var1[2] = 0.0F; // L: 126
		}

		return var1; // L: 128
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-51"
	)
	void method7782() {
		this.field4612[0] = 1.0F; // L: 132
		this.field4612[1] = 0.0F; // L: 133
		this.field4612[2] = 0.0F; // L: 134
		this.field4612[3] = 0.0F; // L: 135
		this.field4612[4] = 0.0F; // L: 136
		this.field4612[5] = 1.0F; // L: 137
		this.field4612[6] = 0.0F; // L: 138
		this.field4612[7] = 0.0F; // L: 139
		this.field4612[8] = 0.0F; // L: 140
		this.field4612[9] = 0.0F; // L: 141
		this.field4612[10] = 1.0F; // L: 142
		this.field4612[11] = 0.0F; // L: 143
		this.field4612[12] = 0.0F; // L: 144
		this.field4612[13] = 0.0F; // L: 145
		this.field4612[14] = 0.0F; // L: 146
		this.field4612[15] = 1.0F; // L: 147
	} // L: 148

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "395260364"
	)
	public void method7783() {
		this.field4612[0] = 0.0F; // L: 151
		this.field4612[1] = 0.0F; // L: 152
		this.field4612[2] = 0.0F; // L: 153
		this.field4612[3] = 0.0F; // L: 154
		this.field4612[4] = 0.0F; // L: 155
		this.field4612[5] = 0.0F; // L: 156
		this.field4612[6] = 0.0F; // L: 157
		this.field4612[7] = 0.0F; // L: 158
		this.field4612[8] = 0.0F; // L: 159
		this.field4612[9] = 0.0F; // L: 160
		this.field4612[10] = 0.0F; // L: 161
		this.field4612[11] = 0.0F; // L: 162
		this.field4612[12] = 0.0F; // L: 163
		this.field4612[13] = 0.0F; // L: 164
		this.field4612[14] = 0.0F; // L: 165
		this.field4612[15] = 0.0F; // L: 166
	} // L: 167

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Loj;I)V",
		garbageValue = "-584495645"
	)
	public void method7784(class410 var1) {
		System.arraycopy(var1.field4612, 0, this.field4612, 0, 16); // L: 170
	} // L: 171

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(FS)V",
		garbageValue = "-2109"
	)
	public void method7785(float var1) {
		this.method7786(var1, var1, var1); // L: 174
	} // L: 175

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "-504827889"
	)
	public void method7786(float var1, float var2, float var3) {
		this.method7782(); // L: 178
		this.field4612[0] = var1; // L: 179
		this.field4612[5] = var2; // L: 180
		this.field4612[10] = var3; // L: 181
	} // L: 182

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Loj;I)V",
		garbageValue = "-496202053"
	)
	public void method7830(class410 var1) {
		for (int var2 = 0; var2 < this.field4612.length; ++var2) { // L: 185
			float[] var10000 = this.field4612; // L: 186
			var10000[var2] += var1.field4612[var2];
		}

	} // L: 188

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Loj;I)V",
		garbageValue = "1995782349"
	)
	public void method7788(class410 var1) {
		float var2 = this.field4612[3] * var1.field4612[12] + this.field4612[2] * var1.field4612[8] + var1.field4612[4] * this.field4612[1] + var1.field4612[0] * this.field4612[0]; // L: 191
		float var3 = this.field4612[1] * var1.field4612[5] + var1.field4612[1] * this.field4612[0] + var1.field4612[9] * this.field4612[2] + var1.field4612[13] * this.field4612[3]; // L: 192
		float var4 = this.field4612[1] * var1.field4612[6] + var1.field4612[2] * this.field4612[0] + var1.field4612[10] * this.field4612[2] + this.field4612[3] * var1.field4612[14]; // L: 193
		float var5 = this.field4612[3] * var1.field4612[15] + this.field4612[2] * var1.field4612[11] + var1.field4612[3] * this.field4612[0] + var1.field4612[7] * this.field4612[1]; // L: 194
		float var6 = var1.field4612[0] * this.field4612[4] + var1.field4612[4] * this.field4612[5] + var1.field4612[8] * this.field4612[6] + this.field4612[7] * var1.field4612[12]; // L: 195
		float var7 = var1.field4612[13] * this.field4612[7] + var1.field4612[1] * this.field4612[4] + this.field4612[5] * var1.field4612[5] + this.field4612[6] * var1.field4612[9]; // L: 196
		float var8 = var1.field4612[14] * this.field4612[7] + var1.field4612[10] * this.field4612[6] + var1.field4612[6] * this.field4612[5] + var1.field4612[2] * this.field4612[4]; // L: 197
		float var9 = this.field4612[5] * var1.field4612[7] + var1.field4612[3] * this.field4612[4] + this.field4612[6] * var1.field4612[11] + var1.field4612[15] * this.field4612[7]; // L: 198
		float var10 = var1.field4612[12] * this.field4612[11] + this.field4612[10] * var1.field4612[8] + var1.field4612[0] * this.field4612[8] + this.field4612[9] * var1.field4612[4]; // L: 199
		float var11 = this.field4612[11] * var1.field4612[13] + this.field4612[9] * var1.field4612[5] + var1.field4612[1] * this.field4612[8] + var1.field4612[9] * this.field4612[10]; // L: 200
		float var12 = this.field4612[9] * var1.field4612[6] + var1.field4612[2] * this.field4612[8] + var1.field4612[10] * this.field4612[10] + this.field4612[11] * var1.field4612[14]; // L: 201
		float var13 = var1.field4612[11] * this.field4612[10] + this.field4612[9] * var1.field4612[7] + this.field4612[8] * var1.field4612[3] + var1.field4612[15] * this.field4612[11]; // L: 202
		float var14 = this.field4612[15] * var1.field4612[12] + var1.field4612[8] * this.field4612[14] + var1.field4612[4] * this.field4612[13] + var1.field4612[0] * this.field4612[12]; // L: 203
		float var15 = this.field4612[12] * var1.field4612[1] + this.field4612[13] * var1.field4612[5] + this.field4612[14] * var1.field4612[9] + var1.field4612[13] * this.field4612[15]; // L: 204
		float var16 = var1.field4612[14] * this.field4612[15] + var1.field4612[10] * this.field4612[14] + var1.field4612[6] * this.field4612[13] + var1.field4612[2] * this.field4612[12]; // L: 205
		float var17 = var1.field4612[15] * this.field4612[15] + this.field4612[13] * var1.field4612[7] + var1.field4612[3] * this.field4612[12] + var1.field4612[11] * this.field4612[14]; // L: 206
		this.field4612[0] = var2; // L: 207
		this.field4612[1] = var3; // L: 208
		this.field4612[2] = var4; // L: 209
		this.field4612[3] = var5; // L: 210
		this.field4612[4] = var6; // L: 211
		this.field4612[5] = var7; // L: 212
		this.field4612[6] = var8; // L: 213
		this.field4612[7] = var9; // L: 214
		this.field4612[8] = var10; // L: 215
		this.field4612[9] = var11; // L: 216
		this.field4612[10] = var12; // L: 217
		this.field4612[11] = var13; // L: 218
		this.field4612[12] = var14; // L: 219
		this.field4612[13] = var15; // L: 220
		this.field4612[14] = var16; // L: 221
		this.field4612[15] = var17; // L: 222
	} // L: 223

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lop;B)V",
		garbageValue = "8"
	)
	public void method7789(class409 var1) {
		float var2 = var1.field4606 * var1.field4606; // L: 226
		float var3 = var1.field4603 * var1.field4606; // L: 227
		float var4 = var1.field4600 * var1.field4606; // L: 228
		float var5 = var1.field4605 * var1.field4606; // L: 229
		float var6 = var1.field4603 * var1.field4603; // L: 230
		float var7 = var1.field4603 * var1.field4600; // L: 231
		float var8 = var1.field4603 * var1.field4605; // L: 232
		float var9 = var1.field4600 * var1.field4600; // L: 233
		float var10 = var1.field4600 * var1.field4605; // L: 234
		float var11 = var1.field4605 * var1.field4605; // L: 235
		this.field4612[0] = var6 + var2 - var11 - var9; // L: 236
		this.field4612[1] = var7 + var7 + var5 + var5; // L: 237
		this.field4612[2] = var8 + (var8 - var4 - var4); // L: 238
		this.field4612[4] = var7 + (var7 - var5 - var5); // L: 239
		this.field4612[5] = var9 + var2 - var6 - var11; // L: 240
		this.field4612[6] = var3 + var10 + var3 + var10; // L: 241
		this.field4612[8] = var4 + var8 + var8 + var4; // L: 242
		this.field4612[9] = var10 - var3 - var3 + var10; // L: 243
		this.field4612[10] = var2 + var11 - var9 - var6; // L: 244
	} // L: 245

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Loc;I)V",
		garbageValue = "1326296862"
	)
	void method7790(class411 var1) {
		this.field4612[0] = var1.field4624; // L: 248
		this.field4612[1] = var1.field4617; // L: 249
		this.field4612[2] = var1.field4618; // L: 250
		this.field4612[3] = 0.0F; // L: 251
		this.field4612[4] = var1.field4625; // L: 252
		this.field4612[5] = var1.field4620; // L: 253
		this.field4612[6] = var1.field4621; // L: 254
		this.field4612[7] = 0.0F; // L: 255
		this.field4612[8] = var1.field4622; // L: 256
		this.field4612[9] = var1.field4623; // L: 257
		this.field4612[10] = var1.field4616; // L: 258
		this.field4612[11] = 0.0F; // L: 259
		this.field4612[12] = var1.field4627; // L: 260
		this.field4612[13] = var1.field4626; // L: 261
		this.field4612[14] = var1.field4619; // L: 262
		this.field4612[15] = 1.0F; // L: 263
	} // L: 264

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)F",
		garbageValue = "-72"
	)
	float method7803() {
		return this.field4612[12] * this.field4612[6] * this.field4612[3] * this.field4612[9] + (this.field4612[13] * this.field4612[3] * this.field4612[4] * this.field4612[10] + (this.field4612[11] * this.field4612[2] * this.field4612[5] * this.field4612[12] + (this.field4612[15] * this.field4612[2] * this.field4612[4] * this.field4612[9] + this.field4612[15] * this.field4612[10] * this.field4612[5] * this.field4612[0] - this.field4612[11] * this.field4612[5] * this.field4612[0] * this.field4612[14] - this.field4612[15] * this.field4612[9] * this.field4612[0] * this.field4612[6] + this.field4612[13] * this.field4612[0] * this.field4612[6] * this.field4612[11] + this.field4612[0] * this.field4612[7] * this.field4612[9] * this.field4612[14] - this.field4612[13] * this.field4612[10] * this.field4612[0] * this.field4612[7] - this.field4612[15] * this.field4612[4] * this.field4612[1] * this.field4612[10] + this.field4612[14] * this.field4612[4] * this.field4612[1] * this.field4612[11] + this.field4612[15] * this.field4612[8] * this.field4612[1] * this.field4612[6] - this.field4612[12] * this.field4612[11] * this.field4612[1] * this.field4612[6] - this.field4612[8] * this.field4612[1] * this.field4612[7] * this.field4612[14] + this.field4612[12] * this.field4612[7] * this.field4612[1] * this.field4612[10] - this.field4612[13] * this.field4612[11] * this.field4612[4] * this.field4612[2] - this.field4612[8] * this.field4612[5] * this.field4612[2] * this.field4612[15]) + this.field4612[7] * this.field4612[2] * this.field4612[8] * this.field4612[13] - this.field4612[7] * this.field4612[2] * this.field4612[9] * this.field4612[12] - this.field4612[3] * this.field4612[4] * this.field4612[9] * this.field4612[14]) + this.field4612[3] * this.field4612[5] * this.field4612[8] * this.field4612[14] - this.field4612[10] * this.field4612[5] * this.field4612[3] * this.field4612[12] - this.field4612[8] * this.field4612[3] * this.field4612[6] * this.field4612[13]); // L: 267
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-6"
	)
	public void method7792() {
		float var1 = 1.0F / this.method7803(); // L: 271
		float var2 = (this.field4612[14] * this.field4612[7] * this.field4612[9] + this.field4612[11] * this.field4612[6] * this.field4612[13] + (this.field4612[15] * this.field4612[10] * this.field4612[5] - this.field4612[14] * this.field4612[5] * this.field4612[11] - this.field4612[9] * this.field4612[6] * this.field4612[15]) - this.field4612[10] * this.field4612[7] * this.field4612[13]) * var1; // L: 272
		float var3 = var1 * (this.field4612[10] * this.field4612[3] * this.field4612[13] + (this.field4612[15] * this.field4612[9] * this.field4612[2] + this.field4612[14] * this.field4612[1] * this.field4612[11] + this.field4612[15] * -this.field4612[1] * this.field4612[10] - this.field4612[13] * this.field4612[2] * this.field4612[11] - this.field4612[3] * this.field4612[9] * this.field4612[14])); // L: 273
		float var4 = var1 * (this.field4612[13] * this.field4612[7] * this.field4612[2] + (this.field4612[6] * this.field4612[1] * this.field4612[15] - this.field4612[14] * this.field4612[1] * this.field4612[7] - this.field4612[2] * this.field4612[5] * this.field4612[15]) + this.field4612[5] * this.field4612[3] * this.field4612[14] - this.field4612[6] * this.field4612[3] * this.field4612[13]); // L: 274
		float var5 = (this.field4612[6] * this.field4612[3] * this.field4612[9] + (this.field4612[11] * this.field4612[2] * this.field4612[5] + this.field4612[1] * this.field4612[7] * this.field4612[10] + -this.field4612[1] * this.field4612[6] * this.field4612[11] - this.field4612[9] * this.field4612[7] * this.field4612[2] - this.field4612[10] * this.field4612[5] * this.field4612[3])) * var1; // L: 275
		float var6 = var1 * (this.field4612[7] * this.field4612[10] * this.field4612[12] + (-this.field4612[4] * this.field4612[10] * this.field4612[15] + this.field4612[4] * this.field4612[11] * this.field4612[14] + this.field4612[6] * this.field4612[8] * this.field4612[15] - this.field4612[6] * this.field4612[11] * this.field4612[12] - this.field4612[14] * this.field4612[7] * this.field4612[8])); // L: 276
		float var7 = (this.field4612[10] * this.field4612[0] * this.field4612[15] - this.field4612[14] * this.field4612[0] * this.field4612[11] - this.field4612[15] * this.field4612[8] * this.field4612[2] + this.field4612[2] * this.field4612[11] * this.field4612[12] + this.field4612[14] * this.field4612[8] * this.field4612[3] - this.field4612[10] * this.field4612[3] * this.field4612[12]) * var1; // L: 277
		float var8 = var1 * (this.field4612[12] * this.field4612[6] * this.field4612[3] + (this.field4612[14] * this.field4612[0] * this.field4612[7] + this.field4612[15] * -this.field4612[0] * this.field4612[6] + this.field4612[15] * this.field4612[2] * this.field4612[4] - this.field4612[7] * this.field4612[2] * this.field4612[12] - this.field4612[4] * this.field4612[3] * this.field4612[14])); // L: 278
		float var9 = (this.field4612[4] * this.field4612[3] * this.field4612[10] + this.field4612[2] * this.field4612[7] * this.field4612[8] + (this.field4612[6] * this.field4612[0] * this.field4612[11] - this.field4612[0] * this.field4612[7] * this.field4612[10] - this.field4612[11] * this.field4612[4] * this.field4612[2]) - this.field4612[6] * this.field4612[3] * this.field4612[8]) * var1; // L: 279
		float var10 = var1 * (this.field4612[11] * this.field4612[5] * this.field4612[12] + (this.field4612[15] * this.field4612[4] * this.field4612[9] - this.field4612[4] * this.field4612[11] * this.field4612[13] - this.field4612[15] * this.field4612[5] * this.field4612[8]) + this.field4612[7] * this.field4612[8] * this.field4612[13] - this.field4612[9] * this.field4612[7] * this.field4612[12]); // L: 280
		float var11 = var1 * (this.field4612[9] * this.field4612[3] * this.field4612[12] + (this.field4612[9] * -this.field4612[0] * this.field4612[15] + this.field4612[0] * this.field4612[11] * this.field4612[13] + this.field4612[1] * this.field4612[8] * this.field4612[15] - this.field4612[12] * this.field4612[11] * this.field4612[1] - this.field4612[13] * this.field4612[8] * this.field4612[3])); // L: 281
		float var12 = (this.field4612[13] * this.field4612[4] * this.field4612[3] + this.field4612[12] * this.field4612[7] * this.field4612[1] + (this.field4612[0] * this.field4612[5] * this.field4612[15] - this.field4612[7] * this.field4612[0] * this.field4612[13] - this.field4612[15] * this.field4612[1] * this.field4612[4]) - this.field4612[12] * this.field4612[5] * this.field4612[3]) * var1; // L: 282
		float var13 = (this.field4612[5] * this.field4612[3] * this.field4612[8] + (this.field4612[4] * this.field4612[1] * this.field4612[11] + this.field4612[9] * this.field4612[0] * this.field4612[7] + this.field4612[5] * -this.field4612[0] * this.field4612[11] - this.field4612[8] * this.field4612[7] * this.field4612[1] - this.field4612[4] * this.field4612[3] * this.field4612[9])) * var1; // L: 283
		float var14 = (this.field4612[12] * this.field4612[6] * this.field4612[9] + (this.field4612[14] * this.field4612[5] * this.field4612[8] + this.field4612[13] * this.field4612[10] * this.field4612[4] + -this.field4612[4] * this.field4612[9] * this.field4612[14] - this.field4612[12] * this.field4612[5] * this.field4612[10] - this.field4612[13] * this.field4612[6] * this.field4612[8])) * var1; // L: 284
		float var15 = (this.field4612[14] * this.field4612[9] * this.field4612[0] - this.field4612[10] * this.field4612[0] * this.field4612[13] - this.field4612[1] * this.field4612[8] * this.field4612[14] + this.field4612[10] * this.field4612[1] * this.field4612[12] + this.field4612[13] * this.field4612[8] * this.field4612[2] - this.field4612[12] * this.field4612[2] * this.field4612[9]) * var1; // L: 285
		float var16 = var1 * (this.field4612[14] * this.field4612[1] * this.field4612[4] + this.field4612[14] * -this.field4612[0] * this.field4612[5] + this.field4612[13] * this.field4612[0] * this.field4612[6] - this.field4612[12] * this.field4612[6] * this.field4612[1] - this.field4612[13] * this.field4612[2] * this.field4612[4] + this.field4612[5] * this.field4612[2] * this.field4612[12]); // L: 286
		float var17 = (this.field4612[8] * this.field4612[1] * this.field4612[6] + (this.field4612[10] * this.field4612[5] * this.field4612[0] - this.field4612[0] * this.field4612[6] * this.field4612[9] - this.field4612[4] * this.field4612[1] * this.field4612[10]) + this.field4612[4] * this.field4612[2] * this.field4612[9] - this.field4612[2] * this.field4612[5] * this.field4612[8]) * var1; // L: 287
		this.field4612[0] = var2; // L: 288
		this.field4612[1] = var3; // L: 289
		this.field4612[2] = var4; // L: 290
		this.field4612[3] = var5; // L: 291
		this.field4612[4] = var6; // L: 292
		this.field4612[5] = var7; // L: 293
		this.field4612[6] = var8; // L: 294
		this.field4612[7] = var9; // L: 295
		this.field4612[8] = var10; // L: 296
		this.field4612[9] = var11; // L: 297
		this.field4612[10] = var12; // L: 298
		this.field4612[11] = var13; // L: 299
		this.field4612[12] = var14; // L: 300
		this.field4612[13] = var15; // L: 301
		this.field4612[14] = var16; // L: 302
		this.field4612[15] = var17; // L: 303
	} // L: 304

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "1949764600"
	)
	public float[] method7794() {
		float[] var1 = new float[3]; // L: 341
		class408 var2 = new class408(this.field4612[0], this.field4612[1], this.field4612[2]); // L: 342
		class408 var3 = new class408(this.field4612[4], this.field4612[5], this.field4612[6]); // L: 343
		class408 var4 = new class408(this.field4612[8], this.field4612[9], this.field4612[10]); // L: 344
		var1[0] = var2.method7751(); // L: 345
		var1[1] = var3.method7751(); // L: 346
		var1[2] = var4.method7751(); // L: 347
		return var1; // L: 348
	}

	public int hashCode() {
		boolean var1 = true; // L: 326
		byte var2 = 1; // L: 327
		int var3 = 31 * var2 + Arrays.hashCode(this.field4612); // L: 328
		return var3; // L: 329
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class410)) { // L: 334
			return false;
		} else {
			class410 var2 = (class410)var1; // L: 335

			for (int var3 = 0; var3 < 16; ++var3) { // L: 336
				if (var2.field4612[var3] != this.field4612[var3]) {
					return false;
				}
			}

			return true; // L: 337
		}
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder(); // L: 309
		this.method7781(); // L: 310
		this.method7780(); // L: 311

		for (int var2 = 0; var2 < 4; ++var2) { // L: 312
			for (int var3 = 0; var3 < 4; ++var3) { // L: 313
				if (var3 > 0) {
					var1.append("\t"); // L: 314
				}

				float var4 = this.field4612[var3 + var2 * 4]; // L: 315
				if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5D) { // L: 316
					var4 = 0.0F;
				}

				var1.append(var4); // L: 317
			}

			var1.append("\n"); // L: 319
		}

		return var1.toString(); // L: 321
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Date;B)Z",
		garbageValue = "-34"
	)
	static boolean method7833(Date var0) {
		Date var1 = class200.method4093(); // L: 1596
		return var0.after(var1); // L: 1597
	}
}
