import java.util.Arrays;
import java.util.Date;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nb")
public final class class388 {
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "[Lnb;"
	)
	static class388[] field4409;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	public static final class388 field4407;
	@ObfuscatedName("w")
	public float[] field4410;

	static {
		field4409 = new class388[0]; // L: 9
		EnumComposition.method3461(100); // L: 14
		field4407 = new class388(); // L: 18
	}

	public class388() {
		this.field4410 = new float[16];
		this.method7004(); // L: 43
	} // L: 44

	@ObfuscatedSignature(
		descriptor = "(Lnb;)V"
	)
	public class388(class388 var1) {
		this.field4410 = new float[16];
		this.method7005(var1); // L: 47
	} // L: 48

	@ObfuscatedSignature(
		descriptor = "(Lqw;Z)V"
	)
	public class388(Buffer var1, boolean var2) {
		this.field4410 = new float[16]; // L: 17
		this.method7001(var1, var2); // L: 51
	} // L: 52

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2102182031"
	)
	public void method7027() {
		synchronized(field4409) { // L: 37
			if (class259.field2903 < IgnoreList.field4293 - 1) { // L: 38
				field4409[++class259.field2903 - 1] = this;
			}

		}
	} // L: 40

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lqw;ZB)V",
		garbageValue = "97"
	)
	void method7001(Buffer var1, boolean var2) {
		if (var2) { // L: 55
			class389 var7 = new class389(); // L: 56
			var7.method7061(WorldMapManager.method4818(var1.readShort())); // L: 57
			var7.method7062(WorldMapManager.method4818(var1.readShort())); // L: 58
			int var6 = var1.readShort(); // L: 61
			var6 &= 16383; // L: 63
			float var5 = (float)((double)((float)var6 / 16384.0F) * 6.283185307179586D); // L: 64
			var7.method7063(var5); // L: 66
			var7.method7064((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort()); // L: 67
			this.method7011(var7); // L: 68
		} else {
			for (int var3 = 0; var3 < 16; ++var3) { // L: 71
				this.field4410[var3] = var1.method7740(); // L: 72
			}
		}

	} // L: 75

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "1489460418"
	)
	float[] method7023() {
		float[] var1 = new float[3]; // L: 78
		if ((double)this.field4410[2] < 0.999D && (double)this.field4410[2] > -0.999D) { // L: 79
			var1[1] = (float)(-Math.asin((double)this.field4410[2])); // L: 80
			double var2 = Math.cos((double)var1[1]); // L: 81
			var1[0] = (float)Math.atan2((double)this.field4410[6] / var2, (double)this.field4410[10] / var2); // L: 82
			var1[2] = (float)Math.atan2((double)this.field4410[1] / var2, (double)this.field4410[0] / var2); // L: 83
		} else {
			var1[0] = 0.0F; // L: 86
			var1[1] = (float)Math.atan2((double)this.field4410[2], 0.0D); // L: 87
			var1[2] = (float)Math.atan2((double)(-this.field4410[9]), (double)this.field4410[5]); // L: 88
		}

		return var1; // L: 90
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "82"
	)
	public float[] method7003() {
		float[] var1 = new float[]{(float)(-Math.asin((double)this.field4410[6])), 0.0F, 0.0F}; // L: 94 95
		double var2 = Math.cos((double)var1[0]); // L: 96
		double var4;
		double var6;
		if (Math.abs(var2) > 0.005D) { // L: 97
			var4 = (double)this.field4410[2]; // L: 98
			var6 = (double)this.field4410[10]; // L: 99
			double var8 = (double)this.field4410[4]; // L: 100
			double var10 = (double)this.field4410[5]; // L: 101
			var1[1] = (float)Math.atan2(var4, var6); // L: 102
			var1[2] = (float)Math.atan2(var8, var10); // L: 103
		} else {
			var4 = (double)this.field4410[1]; // L: 106
			var6 = (double)this.field4410[0]; // L: 107
			if (this.field4410[6] < 0.0F) { // L: 108
				var1[1] = (float)Math.atan2(var4, var6); // L: 109
			} else {
				var1[1] = (float)(-Math.atan2(var4, var6)); // L: 112
			}

			var1[2] = 0.0F; // L: 114
		}

		return var1; // L: 116
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "3"
	)
	void method7004() {
		this.field4410[0] = 1.0F; // L: 120
		this.field4410[1] = 0.0F; // L: 121
		this.field4410[2] = 0.0F; // L: 122
		this.field4410[3] = 0.0F; // L: 123
		this.field4410[4] = 0.0F; // L: 124
		this.field4410[5] = 1.0F; // L: 125
		this.field4410[6] = 0.0F; // L: 126
		this.field4410[7] = 0.0F; // L: 127
		this.field4410[8] = 0.0F; // L: 128
		this.field4410[9] = 0.0F; // L: 129
		this.field4410[10] = 1.0F; // L: 130
		this.field4410[11] = 0.0F; // L: 131
		this.field4410[12] = 0.0F; // L: 132
		this.field4410[13] = 0.0F; // L: 133
		this.field4410[14] = 0.0F; // L: 134
		this.field4410[15] = 1.0F; // L: 135
	} // L: 136

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1645302970"
	)
	public void method7045() {
		this.field4410[0] = 0.0F; // L: 139
		this.field4410[1] = 0.0F; // L: 140
		this.field4410[2] = 0.0F; // L: 141
		this.field4410[3] = 0.0F; // L: 142
		this.field4410[4] = 0.0F; // L: 143
		this.field4410[5] = 0.0F; // L: 144
		this.field4410[6] = 0.0F; // L: 145
		this.field4410[7] = 0.0F; // L: 146
		this.field4410[8] = 0.0F; // L: 147
		this.field4410[9] = 0.0F; // L: 148
		this.field4410[10] = 0.0F; // L: 149
		this.field4410[11] = 0.0F; // L: 150
		this.field4410[12] = 0.0F; // L: 151
		this.field4410[13] = 0.0F; // L: 152
		this.field4410[14] = 0.0F; // L: 153
		this.field4410[15] = 0.0F; // L: 154
	} // L: 155

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnb;I)V",
		garbageValue = "-2073948325"
	)
	public void method7005(class388 var1) {
		System.arraycopy(var1.field4410, 0, this.field4410, 0, 16); // L: 158
	} // L: 159

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "1147825847"
	)
	public void method7006(float var1) {
		this.method7007(var1, var1, var1); // L: 162
	} // L: 163

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(FFFB)V",
		garbageValue = "-27"
	)
	public void method7007(float var1, float var2, float var3) {
		this.method7004(); // L: 166
		this.field4410[0] = var1; // L: 167
		this.field4410[5] = var2; // L: 168
		this.field4410[10] = var3; // L: 169
	} // L: 170

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lnb;I)V",
		garbageValue = "1561270174"
	)
	public void method7008(class388 var1) {
		for (int var2 = 0; var2 < this.field4410.length; ++var2) { // L: 173
			float[] var10000 = this.field4410; // L: 174
			var10000[var2] += var1.field4410[var2];
		}

	} // L: 176

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lnb;I)V",
		garbageValue = "333295335"
	)
	public void method7009(class388 var1) {
		float var2 = this.field4410[2] * var1.field4410[8] + this.field4410[1] * var1.field4410[4] + this.field4410[0] * var1.field4410[0] + var1.field4410[12] * this.field4410[3]; // L: 179
		float var3 = this.field4410[3] * var1.field4410[13] + var1.field4410[9] * this.field4410[2] + this.field4410[0] * var1.field4410[1] + var1.field4410[5] * this.field4410[1]; // L: 180
		float var4 = this.field4410[2] * var1.field4410[10] + this.field4410[1] * var1.field4410[6] + var1.field4410[2] * this.field4410[0] + var1.field4410[14] * this.field4410[3]; // L: 181
		float var5 = this.field4410[3] * var1.field4410[15] + var1.field4410[11] * this.field4410[2] + this.field4410[0] * var1.field4410[3] + this.field4410[1] * var1.field4410[7]; // L: 182
		float var6 = this.field4410[7] * var1.field4410[12] + var1.field4410[0] * this.field4410[4] + var1.field4410[4] * this.field4410[5] + var1.field4410[8] * this.field4410[6]; // L: 183
		float var7 = this.field4410[7] * var1.field4410[13] + var1.field4410[1] * this.field4410[4] + this.field4410[5] * var1.field4410[5] + var1.field4410[9] * this.field4410[6]; // L: 184
		float var8 = this.field4410[7] * var1.field4410[14] + var1.field4410[6] * this.field4410[5] + this.field4410[4] * var1.field4410[2] + this.field4410[6] * var1.field4410[10]; // L: 185
		float var9 = var1.field4410[15] * this.field4410[7] + this.field4410[6] * var1.field4410[11] + this.field4410[5] * var1.field4410[7] + var1.field4410[3] * this.field4410[4]; // L: 186
		float var10 = this.field4410[9] * var1.field4410[4] + this.field4410[8] * var1.field4410[0] + this.field4410[10] * var1.field4410[8] + this.field4410[11] * var1.field4410[12]; // L: 187
		float var11 = var1.field4410[9] * this.field4410[10] + this.field4410[8] * var1.field4410[1] + var1.field4410[5] * this.field4410[9] + this.field4410[11] * var1.field4410[13]; // L: 188
		float var12 = var1.field4410[2] * this.field4410[8] + this.field4410[9] * var1.field4410[6] + var1.field4410[10] * this.field4410[10] + this.field4410[11] * var1.field4410[14]; // L: 189
		float var13 = var1.field4410[15] * this.field4410[11] + var1.field4410[11] * this.field4410[10] + var1.field4410[7] * this.field4410[9] + this.field4410[8] * var1.field4410[3]; // L: 190
		float var14 = this.field4410[15] * var1.field4410[12] + var1.field4410[4] * this.field4410[13] + var1.field4410[0] * this.field4410[12] + this.field4410[14] * var1.field4410[8]; // L: 191
		float var15 = this.field4410[12] * var1.field4410[1] + var1.field4410[5] * this.field4410[13] + this.field4410[14] * var1.field4410[9] + var1.field4410[13] * this.field4410[15]; // L: 192
		float var16 = var1.field4410[10] * this.field4410[14] + this.field4410[13] * var1.field4410[6] + var1.field4410[2] * this.field4410[12] + var1.field4410[14] * this.field4410[15]; // L: 193
		float var17 = var1.field4410[15] * this.field4410[15] + var1.field4410[3] * this.field4410[12] + this.field4410[13] * var1.field4410[7] + var1.field4410[11] * this.field4410[14]; // L: 194
		this.field4410[0] = var2; // L: 195
		this.field4410[1] = var3; // L: 196
		this.field4410[2] = var4; // L: 197
		this.field4410[3] = var5; // L: 198
		this.field4410[4] = var6; // L: 199
		this.field4410[5] = var7; // L: 200
		this.field4410[6] = var8; // L: 201
		this.field4410[7] = var9; // L: 202
		this.field4410[8] = var10; // L: 203
		this.field4410[9] = var11; // L: 204
		this.field4410[10] = var12; // L: 205
		this.field4410[11] = var13; // L: 206
		this.field4410[12] = var14; // L: 207
		this.field4410[13] = var15; // L: 208
		this.field4410[14] = var16; // L: 209
		this.field4410[15] = var17; // L: 210
	} // L: 211

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lno;I)V",
		garbageValue = "-403429597"
	)
	public void method7051(class387 var1) {
		float var2 = var1.field4406 * var1.field4406; // L: 214
		float var3 = var1.field4406 * var1.field4405; // L: 215
		float var4 = var1.field4404 * var1.field4406; // L: 216
		float var5 = var1.field4406 * var1.field4401; // L: 217
		float var6 = var1.field4405 * var1.field4405; // L: 218
		float var7 = var1.field4405 * var1.field4404; // L: 219
		float var8 = var1.field4401 * var1.field4405; // L: 220
		float var9 = var1.field4404 * var1.field4404; // L: 221
		float var10 = var1.field4401 * var1.field4404; // L: 222
		float var11 = var1.field4401 * var1.field4401; // L: 223
		this.field4410[0] = var2 + var6 - var11 - var9; // L: 224
		this.field4410[1] = var5 + var7 + var7 + var5; // L: 225
		this.field4410[2] = var8 - var4 - var4 + var8; // L: 226
		this.field4410[4] = var7 + (var7 - var5 - var5); // L: 227
		this.field4410[5] = var2 + var9 - var6 - var11; // L: 228
		this.field4410[6] = var3 + var3 + var10 + var10; // L: 229
		this.field4410[8] = var8 + var4 + var8 + var4; // L: 230
		this.field4410[9] = var10 + (var10 - var3 - var3); // L: 231
		this.field4410[10] = var11 + var2 - var9 - var6; // L: 232
	} // L: 233

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lnn;B)V",
		garbageValue = "44"
	)
	void method7011(class389 var1) {
		this.field4410[0] = var1.field4422; // L: 236
		this.field4410[1] = var1.field4423; // L: 237
		this.field4410[2] = var1.field4414; // L: 238
		this.field4410[3] = 0.0F; // L: 239
		this.field4410[4] = var1.field4418; // L: 240
		this.field4410[5] = var1.field4416; // L: 241
		this.field4410[6] = var1.field4417; // L: 242
		this.field4410[7] = 0.0F; // L: 243
		this.field4410[8] = var1.field4412; // L: 244
		this.field4410[9] = var1.field4419; // L: 245
		this.field4410[10] = var1.field4420; // L: 246
		this.field4410[11] = 0.0F; // L: 247
		this.field4410[12] = var1.field4421; // L: 248
		this.field4410[13] = var1.field4413; // L: 249
		this.field4410[14] = var1.field4415; // L: 250
		this.field4410[15] = 1.0F; // L: 251
	} // L: 252

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)F",
		garbageValue = "0"
	)
	float method7012() {
		return this.field4410[10] * this.field4410[4] * this.field4410[3] * this.field4410[13] + (this.field4410[13] * this.field4410[8] * this.field4410[7] * this.field4410[2] + this.field4410[12] * this.field4410[5] * this.field4410[2] * this.field4410[11] + (this.field4410[15] * this.field4410[4] * this.field4410[2] * this.field4410[9] + this.field4410[12] * this.field4410[1] * this.field4410[7] * this.field4410[10] + (this.field4410[14] * this.field4410[1] * this.field4410[4] * this.field4410[11] + (this.field4410[13] * this.field4410[6] * this.field4410[0] * this.field4410[11] + (this.field4410[10] * this.field4410[0] * this.field4410[5] * this.field4410[15] - this.field4410[5] * this.field4410[0] * this.field4410[11] * this.field4410[14] - this.field4410[15] * this.field4410[9] * this.field4410[0] * this.field4410[6]) + this.field4410[14] * this.field4410[0] * this.field4410[7] * this.field4410[9] - this.field4410[13] * this.field4410[7] * this.field4410[0] * this.field4410[10] - this.field4410[15] * this.field4410[4] * this.field4410[1] * this.field4410[10]) + this.field4410[1] * this.field4410[6] * this.field4410[8] * this.field4410[15] - this.field4410[12] * this.field4410[11] * this.field4410[1] * this.field4410[6] - this.field4410[14] * this.field4410[8] * this.field4410[1] * this.field4410[7]) - this.field4410[13] * this.field4410[11] * this.field4410[2] * this.field4410[4] - this.field4410[15] * this.field4410[5] * this.field4410[2] * this.field4410[8]) - this.field4410[7] * this.field4410[2] * this.field4410[9] * this.field4410[12] - this.field4410[14] * this.field4410[9] * this.field4410[4] * this.field4410[3]) + this.field4410[14] * this.field4410[3] * this.field4410[5] * this.field4410[8] - this.field4410[12] * this.field4410[3] * this.field4410[5] * this.field4410[10] - this.field4410[8] * this.field4410[6] * this.field4410[3] * this.field4410[13] + this.field4410[12] * this.field4410[3] * this.field4410[6] * this.field4410[9]; // L: 255
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "226481954"
	)
	public void method6999() {
		float var1 = 1.0F / this.method7012(); // L: 259
		float var2 = var1 * (this.field4410[15] * this.field4410[10] * this.field4410[5] - this.field4410[11] * this.field4410[5] * this.field4410[14] - this.field4410[9] * this.field4410[6] * this.field4410[15] + this.field4410[13] * this.field4410[11] * this.field4410[6] + this.field4410[14] * this.field4410[9] * this.field4410[7] - this.field4410[13] * this.field4410[7] * this.field4410[10]); // L: 260
		float var3 = (this.field4410[13] * this.field4410[3] * this.field4410[10] + (this.field4410[14] * this.field4410[1] * this.field4410[11] + -this.field4410[1] * this.field4410[10] * this.field4410[15] + this.field4410[2] * this.field4410[9] * this.field4410[15] - this.field4410[13] * this.field4410[2] * this.field4410[11] - this.field4410[14] * this.field4410[9] * this.field4410[3])) * var1; // L: 261
		float var4 = (this.field4410[13] * this.field4410[2] * this.field4410[7] + (this.field4410[1] * this.field4410[6] * this.field4410[15] - this.field4410[14] * this.field4410[7] * this.field4410[1] - this.field4410[5] * this.field4410[2] * this.field4410[15]) + this.field4410[3] * this.field4410[5] * this.field4410[14] - this.field4410[13] * this.field4410[6] * this.field4410[3]) * var1; // L: 262
		float var5 = var1 * (this.field4410[11] * this.field4410[2] * this.field4410[5] + this.field4410[7] * this.field4410[1] * this.field4410[10] + -this.field4410[1] * this.field4410[6] * this.field4410[11] - this.field4410[9] * this.field4410[7] * this.field4410[2] - this.field4410[10] * this.field4410[3] * this.field4410[5] + this.field4410[3] * this.field4410[6] * this.field4410[9]); // L: 263
		float var6 = var1 * (this.field4410[15] * this.field4410[6] * this.field4410[8] + -this.field4410[4] * this.field4410[10] * this.field4410[15] + this.field4410[11] * this.field4410[4] * this.field4410[14] - this.field4410[11] * this.field4410[6] * this.field4410[12] - this.field4410[14] * this.field4410[8] * this.field4410[7] + this.field4410[12] * this.field4410[10] * this.field4410[7]); // L: 264
		float var7 = var1 * (this.field4410[14] * this.field4410[3] * this.field4410[8] + this.field4410[15] * this.field4410[0] * this.field4410[10] - this.field4410[14] * this.field4410[11] * this.field4410[0] - this.field4410[8] * this.field4410[2] * this.field4410[15] + this.field4410[2] * this.field4410[11] * this.field4410[12] - this.field4410[10] * this.field4410[3] * this.field4410[12]); // L: 265
		float var8 = (this.field4410[6] * this.field4410[3] * this.field4410[12] + (this.field4410[15] * this.field4410[2] * this.field4410[4] + this.field4410[14] * this.field4410[7] * this.field4410[0] + this.field4410[15] * -this.field4410[0] * this.field4410[6] - this.field4410[2] * this.field4410[7] * this.field4410[12] - this.field4410[3] * this.field4410[4] * this.field4410[14])) * var1; // L: 266
		float var9 = (this.field4410[4] * this.field4410[3] * this.field4410[10] + this.field4410[0] * this.field4410[6] * this.field4410[11] - this.field4410[0] * this.field4410[7] * this.field4410[10] - this.field4410[4] * this.field4410[2] * this.field4410[11] + this.field4410[8] * this.field4410[7] * this.field4410[2] - this.field4410[3] * this.field4410[6] * this.field4410[8]) * var1; // L: 267
		float var10 = var1 * (this.field4410[15] * this.field4410[9] * this.field4410[4] - this.field4410[4] * this.field4410[11] * this.field4410[13] - this.field4410[15] * this.field4410[5] * this.field4410[8] + this.field4410[5] * this.field4410[11] * this.field4410[12] + this.field4410[13] * this.field4410[8] * this.field4410[7] - this.field4410[12] * this.field4410[7] * this.field4410[9]); // L: 268
		float var11 = var1 * (this.field4410[9] * this.field4410[3] * this.field4410[12] + (this.field4410[9] * -this.field4410[0] * this.field4410[15] + this.field4410[13] * this.field4410[11] * this.field4410[0] + this.field4410[1] * this.field4410[8] * this.field4410[15] - this.field4410[11] * this.field4410[1] * this.field4410[12] - this.field4410[13] * this.field4410[3] * this.field4410[8])); // L: 269
		float var12 = var1 * (this.field4410[5] * this.field4410[0] * this.field4410[15] - this.field4410[7] * this.field4410[0] * this.field4410[13] - this.field4410[15] * this.field4410[4] * this.field4410[1] + this.field4410[12] * this.field4410[1] * this.field4410[7] + this.field4410[3] * this.field4410[4] * this.field4410[13] - this.field4410[12] * this.field4410[5] * this.field4410[3]); // L: 270
		float var13 = (this.field4410[8] * this.field4410[5] * this.field4410[3] + (this.field4410[9] * this.field4410[7] * this.field4410[0] + this.field4410[11] * -this.field4410[0] * this.field4410[5] + this.field4410[11] * this.field4410[1] * this.field4410[4] - this.field4410[7] * this.field4410[1] * this.field4410[8] - this.field4410[9] * this.field4410[4] * this.field4410[3])) * var1; // L: 271
		float var14 = (this.field4410[6] * this.field4410[9] * this.field4410[12] + (this.field4410[14] * this.field4410[8] * this.field4410[5] + this.field4410[14] * -this.field4410[4] * this.field4410[9] + this.field4410[13] * this.field4410[10] * this.field4410[4] - this.field4410[10] * this.field4410[5] * this.field4410[12] - this.field4410[13] * this.field4410[8] * this.field4410[6])) * var1; // L: 272
		float var15 = (this.field4410[2] * this.field4410[8] * this.field4410[13] + this.field4410[12] * this.field4410[10] * this.field4410[1] + (this.field4410[9] * this.field4410[0] * this.field4410[14] - this.field4410[13] * this.field4410[0] * this.field4410[10] - this.field4410[8] * this.field4410[1] * this.field4410[14]) - this.field4410[9] * this.field4410[2] * this.field4410[12]) * var1; // L: 273
		float var16 = (this.field4410[13] * this.field4410[0] * this.field4410[6] + -this.field4410[0] * this.field4410[5] * this.field4410[14] + this.field4410[14] * this.field4410[4] * this.field4410[1] - this.field4410[12] * this.field4410[6] * this.field4410[1] - this.field4410[13] * this.field4410[4] * this.field4410[2] + this.field4410[2] * this.field4410[5] * this.field4410[12]) * var1; // L: 274
		float var17 = (this.field4410[5] * this.field4410[0] * this.field4410[10] - this.field4410[6] * this.field4410[0] * this.field4410[9] - this.field4410[4] * this.field4410[1] * this.field4410[10] + this.field4410[8] * this.field4410[1] * this.field4410[6] + this.field4410[2] * this.field4410[4] * this.field4410[9] - this.field4410[5] * this.field4410[2] * this.field4410[8]) * var1; // L: 275
		this.field4410[0] = var2; // L: 276
		this.field4410[1] = var3; // L: 277
		this.field4410[2] = var4; // L: 278
		this.field4410[3] = var5; // L: 279
		this.field4410[4] = var6; // L: 280
		this.field4410[5] = var7; // L: 281
		this.field4410[6] = var8; // L: 282
		this.field4410[7] = var9; // L: 283
		this.field4410[8] = var10; // L: 284
		this.field4410[9] = var11; // L: 285
		this.field4410[10] = var12; // L: 286
		this.field4410[11] = var13; // L: 287
		this.field4410[12] = var14; // L: 288
		this.field4410[13] = var15; // L: 289
		this.field4410[14] = var16; // L: 290
		this.field4410[15] = var17; // L: 291
	} // L: 292

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(S)[F",
		garbageValue = "10880"
	)
	public float[] method7015() {
		float[] var1 = new float[3]; // L: 329
		class386 var2 = new class386(this.field4410[0], this.field4410[1], this.field4410[2]); // L: 330
		class386 var3 = new class386(this.field4410[4], this.field4410[5], this.field4410[6]); // L: 331
		class386 var4 = new class386(this.field4410[8], this.field4410[9], this.field4410[10]); // L: 332
		var1[0] = var2.method6962(); // L: 333
		var1[1] = var3.method6962(); // L: 334
		var1[2] = var4.method6962(); // L: 335
		return var1; // L: 336
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class388)) { // L: 322
			return false;
		} else {
			class388 var2 = (class388)var1; // L: 323

			for (int var3 = 0; var3 < 16; ++var3) { // L: 324
				if (var2.field4410[var3] != this.field4410[var3]) {
					return false;
				}
			}

			return true; // L: 325
		}
	}

	public int hashCode() {
		boolean var1 = true; // L: 314
		byte var2 = 1; // L: 315
		int var3 = var2 * 31 + Arrays.hashCode(this.field4410); // L: 316
		return var3; // L: 317
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder(); // L: 297
		this.method7003(); // L: 298
		this.method7023(); // L: 299

		for (int var2 = 0; var2 < 4; ++var2) { // L: 300
			for (int var3 = 0; var3 < 4; ++var3) { // L: 301
				if (var3 > 0) {
					var1.append("\t"); // L: 302
				}

				float var4 = this.field4410[var3 + var2 * 4]; // L: 303
				if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5D) { // L: 304
					var4 = 0.0F;
				}

				var1.append(var4); // L: 305
			}

			var1.append("\n"); // L: 307
		}

		return var1.toString(); // L: 309
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Date;B)Z",
		garbageValue = "-31"
	)
	static boolean method7052(Date var0) {
		Date var1 = FriendsChatMember.method6695(); // L: 1113
		return var0.after(var1); // L: 1114
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lmx;Lmx;B)V",
		garbageValue = "36"
	)
	static void method7058(Font var0, Font var1) {
		int var4;
		int var5;
		if (class12.worldSelectBackSprites == null) { // L: 1804
			Archive var3 = AbstractWorldMapData.archive8; // L: 1806
			var4 = var3.getGroupId("sl_back"); // L: 1808
			var5 = var3.getFileId(var4, ""); // L: 1809
			SpritePixels[] var2 = NPC.method2434(var3, var4, var5); // L: 1810
			class12.worldSelectBackSprites = var2; // L: 1812
		}

		if (VerticalAlignment.worldSelectFlagSprites == null) { // L: 1814
			VerticalAlignment.worldSelectFlagSprites = class342.method6304(AbstractWorldMapData.archive8, "sl_flags", "");
		}

		if (Login.worldSelectArrows == null) { // L: 1815
			Login.worldSelectArrows = class342.method6304(AbstractWorldMapData.archive8, "sl_arrows", "");
		}

		if (class12.worldSelectStars == null) { // L: 1816
			class12.worldSelectStars = class342.method6304(AbstractWorldMapData.archive8, "sl_stars", "");
		}

		if (class118.worldSelectLeftSprite == null) { // L: 1817
			class118.worldSelectLeftSprite = BufferedNetSocket.SpriteBuffer_getIndexedSpriteByName(AbstractWorldMapData.archive8, "leftarrow", "");
		}

		if (class33.worldSelectRightSprite == null) { // L: 1818
			class33.worldSelectRightSprite = BufferedNetSocket.SpriteBuffer_getIndexedSpriteByName(AbstractWorldMapData.archive8, "rightarrow", "");
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0); // L: 1819
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624); // L: 1820
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513); // L: 1821
		var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1); // L: 1822
		if (class12.worldSelectStars != null) { // L: 1823
			class12.worldSelectStars[1].drawAt(Login.xPadding + 140, 1); // L: 1824
			var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1); // L: 1825
			class12.worldSelectStars[0].drawAt(Login.xPadding + 140, 12); // L: 1826
			var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1); // L: 1827
		}

		if (Login.worldSelectArrows != null) { // L: 1829
			int var22 = Login.xPadding + 280; // L: 1830
			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) { // L: 1831
				Login.worldSelectArrows[2].drawAt(var22, 4);
			} else {
				Login.worldSelectArrows[0].drawAt(var22, 4); // L: 1832
			}

			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) { // L: 1833
				Login.worldSelectArrows[3].drawAt(var22 + 15, 4);
			} else {
				Login.worldSelectArrows[1].drawAt(var22 + 15, 4); // L: 1834
			}

			var0.draw("World", var22 + 32, 17, 16777215, -1); // L: 1835
			int var23 = Login.xPadding + 390; // L: 1836
			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) { // L: 1837
				Login.worldSelectArrows[2].drawAt(var23, 4);
			} else {
				Login.worldSelectArrows[0].drawAt(var23, 4); // L: 1838
			}

			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) { // L: 1839
				Login.worldSelectArrows[3].drawAt(var23 + 15, 4);
			} else {
				Login.worldSelectArrows[1].drawAt(var23 + 15, 4); // L: 1840
			}

			var0.draw("Players", var23 + 32, 17, 16777215, -1); // L: 1841
			var4 = Login.xPadding + 500; // L: 1842
			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) { // L: 1843
				Login.worldSelectArrows[2].drawAt(var4, 4);
			} else {
				Login.worldSelectArrows[0].drawAt(var4, 4); // L: 1844
			}

			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) { // L: 1845
				Login.worldSelectArrows[3].drawAt(var4 + 15, 4);
			} else {
				Login.worldSelectArrows[1].drawAt(var4 + 15, 4); // L: 1846
			}

			var0.draw("Location", var4 + 32, 17, 16777215, -1); // L: 1847
			var5 = Login.xPadding + 610; // L: 1848
			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) { // L: 1849
				Login.worldSelectArrows[2].drawAt(var5, 4);
			} else {
				Login.worldSelectArrows[0].drawAt(var5, 4); // L: 1850
			}

			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) { // L: 1851
				Login.worldSelectArrows[3].drawAt(var5 + 15, 4);
			} else {
				Login.worldSelectArrows[1].drawAt(var5 + 15, 4); // L: 1852
			}

			var0.draw("Type", var5 + 32, 17, 16777215, -1); // L: 1853
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0); // L: 1855
		var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1); // L: 1856
		Login.hoveredWorldIndex = -1; // L: 1857
		if (class12.worldSelectBackSprites != null) { // L: 1858
			byte var26 = 88; // L: 1859
			byte var27 = 19; // L: 1860
			var4 = 765 / (var26 + 1) - 1; // L: 1861
			var5 = 480 / (var27 + 1); // L: 1862

			int var6;
			int var7;
			do {
				var6 = var5; // L: 1864
				var7 = var4; // L: 1865
				if (var5 * (var4 - 1) >= World.World_count) { // L: 1866
					--var4;
				}

				if (var4 * (var5 - 1) >= World.World_count) { // L: 1867
					--var5;
				}

				if (var4 * (var5 - 1) >= World.World_count) { // L: 1868
					--var5;
				}
			} while(var5 != var6 || var4 != var7); // L: 1869

			var6 = (765 - var4 * var26) / (var4 + 1); // L: 1871
			if (var6 > 5) {
				var6 = 5; // L: 1872
			}

			var7 = (480 - var27 * var5) / (var5 + 1); // L: 1873
			if (var7 > 5) { // L: 1874
				var7 = 5;
			}

			int var8 = (765 - var4 * var26 - var6 * (var4 - 1)) / 2; // L: 1875
			int var9 = (480 - var5 * var27 - var7 * (var5 - 1)) / 2; // L: 1876
			int var10 = (var5 + World.World_count - 1) / var5; // L: 1877
			Login.worldSelectPagesCount = var10 - var4; // L: 1878
			if (class118.worldSelectLeftSprite != null && Login.worldSelectPage > 0) { // L: 1879
				class118.worldSelectLeftSprite.drawAt(8, class228.canvasHeight / 2 - class118.worldSelectLeftSprite.subHeight / 2); // L: 1880
			}

			if (class33.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) { // L: 1882
				class33.worldSelectRightSprite.drawAt(class352.canvasWidth - class33.worldSelectRightSprite.subWidth - 8, class228.canvasHeight / 2 - class33.worldSelectRightSprite.subHeight / 2); // L: 1883
			}

			int var11 = var9 + 23; // L: 1885
			int var12 = var8 + Login.xPadding; // L: 1886
			int var13 = 0; // L: 1887
			boolean var14 = false; // L: 1888
			int var15 = Login.worldSelectPage; // L: 1889

			int var16;
			for (var16 = var15 * var5; var16 < World.World_count && var15 - Login.worldSelectPage < var4; ++var16) { // L: 1890 1891
				World var17 = class93.World_worlds[var16]; // L: 1894
				boolean var18 = true; // L: 1895
				String var19 = Integer.toString(var17.population); // L: 1896
				if (var17.population == -1) { // L: 1897
					var19 = "OFF"; // L: 1898
					var18 = false; // L: 1899
				} else if (var17.population > 1980) { // L: 1901
					var19 = "FULL"; // L: 1902
					var18 = false; // L: 1903
				}

				int var21 = 0; // L: 1906
				byte var20;
				if (var17.isBeta()) { // L: 1907
					if (var17.isMembersOnly()) { // L: 1908
						var20 = 7;
					} else {
						var20 = 6; // L: 1909
					}
				} else if (var17.isDeadman()) { // L: 1911
					var21 = 16711680; // L: 1912
					if (var17.isMembersOnly()) { // L: 1913
						var20 = 5;
					} else {
						var20 = 4; // L: 1914
					}
				} else if (var17.method1647()) { // L: 1916
					if (var17.isMembersOnly()) { // L: 1917
						var20 = 9;
					} else {
						var20 = 8; // L: 1918
					}
				} else if (var17.isPvp()) { // L: 1920
					if (var17.isMembersOnly()) { // L: 1921
						var20 = 3;
					} else {
						var20 = 2; // L: 1922
					}
				} else if (var17.isMembersOnly()) { // L: 1925
					var20 = 1;
				} else {
					var20 = 0; // L: 1926
				}

				if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var11 && MouseHandler.MouseHandler_x < var26 + var12 && MouseHandler.MouseHandler_y < var27 + var11 && var18) { // L: 1928
					Login.hoveredWorldIndex = var16; // L: 1929
					class12.worldSelectBackSprites[var20].drawTransOverlayAt(var12, var11, 128, 16777215); // L: 1930
					var14 = true; // L: 1931
				} else {
					class12.worldSelectBackSprites[var20].drawAt(var12, var11); // L: 1933
				}

				if (VerticalAlignment.worldSelectFlagSprites != null) { // L: 1934
					VerticalAlignment.worldSelectFlagSprites[(var17.isMembersOnly() ? 8 : 0) + var17.location].drawAt(var12 + 29, var11);
				}

				var0.drawCentered(Integer.toString(var17.id), var12 + 15, var27 / 2 + var11 + 5, var21, -1); // L: 1935
				var1.drawCentered(var19, var12 + 60, var27 / 2 + var11 + 5, 268435455, -1); // L: 1936
				var11 = var11 + var7 + var27; // L: 1937
				++var13; // L: 1938
				if (var13 >= var5) {
					var11 = var9 + 23; // L: 1939
					var12 = var12 + var26 + var6; // L: 1940
					var13 = 0; // L: 1941
					++var15; // L: 1942
				}
			}

			if (var14) { // L: 1945
				var16 = var1.stringWidth(class93.World_worlds[Login.hoveredWorldIndex].activity) + 6; // L: 1946
				int var24 = var1.ascent + 8; // L: 1947
				int var25 = MouseHandler.MouseHandler_y + 25; // L: 1948
				if (var24 + var25 > 480) { // L: 1949
					var25 = MouseHandler.MouseHandler_y - 25 - var24; // L: 1950
				}

				Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var16 / 2, var25, var16, var24, 16777120); // L: 1952
				Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var16 / 2, var25, var16, var24, 0); // L: 1953
				var1.drawCentered(class93.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var25 + var1.ascent + 4, 0, -1); // L: 1954
			}
		}

		class268.rasterProvider.drawFull(0, 0); // L: 1957
	} // L: 1958
}
