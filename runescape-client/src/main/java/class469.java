import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sr")
public final class class469 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Lsr;"
	)
	static class469[] field4845;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1870351339
	)
	static int field4841;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1730714885
	)
	static int field4842;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lsr;"
	)
	public static final class469 field4844;
	@ObfuscatedName("ar")
	public float[] field4843;

	static {
		field4845 = new class469[0]; // L: 9
		field4841 = 100; // L: 15
		field4845 = new class469[100]; // L: 16
		field4842 = 0; // L: 17
		field4844 = new class469();
	} // L: 22

	public class469() {
		this.field4843 = new float[16];
		this.method8627(); // L: 41
	} // L: 42

	@ObfuscatedSignature(
		descriptor = "(Lsr;)V"
	)
	public class469(class469 var1) {
		this.field4843 = new float[16];
		this.method8629(var1); // L: 45
	} // L: 46

	@ObfuscatedSignature(
		descriptor = "(Luq;Z)V"
	)
	public class469(Buffer var1, boolean var2) {
		this.field4843 = new float[16]; // L: 21
		this.method8624(var1, var2); // L: 49
	} // L: 50

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "412828198"
	)
	public void method8648() {
		synchronized(field4845) { // L: 35
			if (field4842 < field4841 - 1) { // L: 36
				field4845[++field4842 - 1] = this;
			}

		}
	} // L: 38

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Luq;ZI)V",
		garbageValue = "-984331291"
	)
	void method8624(Buffer var1, boolean var2) {
		if (var2) { // L: 53
			class470 var13 = new class470(); // L: 54
			int var6 = var1.readShort(); // L: 57
			var6 &= 16383; // L: 59
			float var5 = (float)(6.283185307179586D * (double)((float)var6 / 16384.0F)); // L: 60
			var13.method8687(var5); // L: 62
			int var9 = var1.readShort(); // L: 65
			var9 &= 16383; // L: 67
			float var8 = (float)((double)((float)var9 / 16384.0F) * 6.283185307179586D); // L: 68
			var13.method8692(var8); // L: 70
			int var12 = var1.readShort(); // L: 73
			var12 &= 16383; // L: 75
			float var11 = (float)((double)((float)var12 / 16384.0F) * 6.283185307179586D); // L: 76
			var13.method8689(var11); // L: 78
			var13.method8688((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort()); // L: 79
			this.method8659(var13); // L: 80
		} else {
			for (int var3 = 0; var3 < 16; ++var3) { // L: 83
				this.field4843[var3] = var1.method9481(); // L: 84
			}
		}

	} // L: 87

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "1978256666"
	)
	float[] method8625() {
		float[] var1 = new float[3]; // L: 90
		if ((double)this.field4843[2] < 0.999D && (double)this.field4843[2] > -0.999D) { // L: 91
			var1[1] = (float)(-Math.asin((double)this.field4843[2])); // L: 92
			double var2 = Math.cos((double)var1[1]); // L: 93
			var1[0] = (float)Math.atan2((double)this.field4843[6] / var2, (double)this.field4843[10] / var2); // L: 94
			var1[2] = (float)Math.atan2((double)this.field4843[1] / var2, (double)this.field4843[0] / var2); // L: 95
		} else {
			var1[0] = 0.0F; // L: 98
			var1[1] = (float)Math.atan2((double)this.field4843[2], 0.0D); // L: 99
			var1[2] = (float)Math.atan2((double)(-this.field4843[9]), (double)this.field4843[5]); // L: 100
		}

		return var1; // L: 102
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "232663535"
	)
	public float[] method8634() {
		float[] var1 = new float[]{(float)(-Math.asin((double)this.field4843[6])), 0.0F, 0.0F}; // L: 106 107
		double var2 = Math.cos((double)var1[0]); // L: 108
		double var4;
		double var6;
		if (Math.abs(var2) > 0.005D) { // L: 109
			var4 = (double)this.field4843[2]; // L: 110
			var6 = (double)this.field4843[10]; // L: 111
			double var8 = (double)this.field4843[4]; // L: 112
			double var10 = (double)this.field4843[5]; // L: 113
			var1[1] = (float)Math.atan2(var4, var6); // L: 114
			var1[2] = (float)Math.atan2(var8, var10); // L: 115
		} else {
			var4 = (double)this.field4843[1]; // L: 118
			var6 = (double)this.field4843[0]; // L: 119
			if (this.field4843[6] < 0.0F) { // L: 120
				var1[1] = (float)Math.atan2(var4, var6); // L: 121
			} else {
				var1[1] = (float)(-Math.atan2(var4, var6)); // L: 124
			}

			var1[2] = 0.0F; // L: 126
		}

		return var1; // L: 128
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1212896580"
	)
	void method8627() {
		this.field4843[0] = 1.0F; // L: 132
		this.field4843[1] = 0.0F; // L: 133
		this.field4843[2] = 0.0F; // L: 134
		this.field4843[3] = 0.0F; // L: 135
		this.field4843[4] = 0.0F; // L: 136
		this.field4843[5] = 1.0F; // L: 137
		this.field4843[6] = 0.0F; // L: 138
		this.field4843[7] = 0.0F; // L: 139
		this.field4843[8] = 0.0F; // L: 140
		this.field4843[9] = 0.0F; // L: 141
		this.field4843[10] = 1.0F; // L: 142
		this.field4843[11] = 0.0F; // L: 143
		this.field4843[12] = 0.0F; // L: 144
		this.field4843[13] = 0.0F; // L: 145
		this.field4843[14] = 0.0F; // L: 146
		this.field4843[15] = 1.0F; // L: 147
	} // L: 148

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-67"
	)
	public void method8656() {
		this.field4843[0] = 0.0F; // L: 151
		this.field4843[1] = 0.0F; // L: 152
		this.field4843[2] = 0.0F; // L: 153
		this.field4843[3] = 0.0F; // L: 154
		this.field4843[4] = 0.0F; // L: 155
		this.field4843[5] = 0.0F; // L: 156
		this.field4843[6] = 0.0F; // L: 157
		this.field4843[7] = 0.0F; // L: 158
		this.field4843[8] = 0.0F; // L: 159
		this.field4843[9] = 0.0F; // L: 160
		this.field4843[10] = 0.0F; // L: 161
		this.field4843[11] = 0.0F; // L: 162
		this.field4843[12] = 0.0F; // L: 163
		this.field4843[13] = 0.0F; // L: 164
		this.field4843[14] = 0.0F; // L: 165
		this.field4843[15] = 0.0F; // L: 166
	} // L: 167

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lsr;S)V",
		garbageValue = "-26778"
	)
	public void method8629(class469 var1) {
		System.arraycopy(var1.field4843, 0, this.field4843, 0, 16); // L: 170
	} // L: 171

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "543049726"
	)
	public void method8630(float var1) {
		this.method8631(var1, var1, var1); // L: 174
	} // L: 175

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(FFFB)V",
		garbageValue = "43"
	)
	public void method8631(float var1, float var2, float var3) {
		this.method8627(); // L: 178
		this.field4843[0] = var1; // L: 179
		this.field4843[5] = var2; // L: 180
		this.field4843[10] = var3; // L: 181
	} // L: 182

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lsr;B)V",
		garbageValue = "-93"
	)
	public void method8657(class469 var1) {
		for (int var2 = 0; var2 < this.field4843.length; ++var2) { // L: 185
			float[] var10000 = this.field4843; // L: 186
			var10000[var2] += var1.field4843[var2];
		}

	} // L: 188

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lsr;I)V",
		garbageValue = "1817605058"
	)
	public void method8633(class469 var1) {
		float var2 = var1.field4843[0] * this.field4843[0] + var1.field4843[4] * this.field4843[1] + this.field4843[2] * var1.field4843[8] + this.field4843[3] * var1.field4843[12]; // L: 191
		float var3 = var1.field4843[13] * this.field4843[3] + var1.field4843[5] * this.field4843[1] + this.field4843[0] * var1.field4843[1] + var1.field4843[9] * this.field4843[2]; // L: 192
		float var4 = var1.field4843[10] * this.field4843[2] + this.field4843[1] * var1.field4843[6] + this.field4843[0] * var1.field4843[2] + this.field4843[3] * var1.field4843[14]; // L: 193
		float var5 = var1.field4843[7] * this.field4843[1] + var1.field4843[3] * this.field4843[0] + var1.field4843[11] * this.field4843[2] + var1.field4843[15] * this.field4843[3]; // L: 194
		float var6 = var1.field4843[12] * this.field4843[7] + var1.field4843[8] * this.field4843[6] + var1.field4843[0] * this.field4843[4] + this.field4843[5] * var1.field4843[4]; // L: 195
		float var7 = this.field4843[6] * var1.field4843[9] + this.field4843[4] * var1.field4843[1] + var1.field4843[5] * this.field4843[5] + this.field4843[7] * var1.field4843[13]; // L: 196
		float var8 = this.field4843[7] * var1.field4843[14] + var1.field4843[6] * this.field4843[5] + this.field4843[4] * var1.field4843[2] + var1.field4843[10] * this.field4843[6]; // L: 197
		float var9 = var1.field4843[15] * this.field4843[7] + this.field4843[4] * var1.field4843[3] + this.field4843[5] * var1.field4843[7] + this.field4843[6] * var1.field4843[11]; // L: 198
		float var10 = this.field4843[11] * var1.field4843[12] + this.field4843[9] * var1.field4843[4] + this.field4843[8] * var1.field4843[0] + var1.field4843[8] * this.field4843[10]; // L: 199
		float var11 = var1.field4843[9] * this.field4843[10] + var1.field4843[5] * this.field4843[9] + var1.field4843[1] * this.field4843[8] + this.field4843[11] * var1.field4843[13]; // L: 200
		float var12 = var1.field4843[14] * this.field4843[11] + this.field4843[10] * var1.field4843[10] + var1.field4843[6] * this.field4843[9] + this.field4843[8] * var1.field4843[2]; // L: 201
		float var13 = this.field4843[11] * var1.field4843[15] + var1.field4843[7] * this.field4843[9] + var1.field4843[3] * this.field4843[8] + this.field4843[10] * var1.field4843[11]; // L: 202
		float var14 = var1.field4843[12] * this.field4843[15] + var1.field4843[8] * this.field4843[14] + this.field4843[12] * var1.field4843[0] + var1.field4843[4] * this.field4843[13]; // L: 203
		float var15 = this.field4843[14] * var1.field4843[9] + var1.field4843[1] * this.field4843[12] + var1.field4843[5] * this.field4843[13] + var1.field4843[13] * this.field4843[15]; // L: 204
		float var16 = this.field4843[15] * var1.field4843[14] + var1.field4843[10] * this.field4843[14] + var1.field4843[6] * this.field4843[13] + this.field4843[12] * var1.field4843[2]; // L: 205
		float var17 = this.field4843[15] * var1.field4843[15] + var1.field4843[3] * this.field4843[12] + var1.field4843[7] * this.field4843[13] + var1.field4843[11] * this.field4843[14]; // L: 206
		this.field4843[0] = var2; // L: 207
		this.field4843[1] = var3; // L: 208
		this.field4843[2] = var4; // L: 209
		this.field4843[3] = var5; // L: 210
		this.field4843[4] = var6; // L: 211
		this.field4843[5] = var7; // L: 212
		this.field4843[6] = var8; // L: 213
		this.field4843[7] = var9; // L: 214
		this.field4843[8] = var10; // L: 215
		this.field4843[9] = var11; // L: 216
		this.field4843[10] = var12; // L: 217
		this.field4843[11] = var13; // L: 218
		this.field4843[12] = var14; // L: 219
		this.field4843[13] = var15; // L: 220
		this.field4843[14] = var16; // L: 221
		this.field4843[15] = var17; // L: 222
	} // L: 223

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lsf;I)V",
		garbageValue = "395557333"
	)
	public void method8660(class468 var1) {
		float var2 = var1.field4832 * var1.field4832; // L: 226
		float var3 = var1.field4832 * var1.field4835; // L: 227
		float var4 = var1.field4832 * var1.field4836; // L: 228
		float var5 = var1.field4837 * var1.field4832; // L: 229
		float var6 = var1.field4835 * var1.field4835; // L: 230
		float var7 = var1.field4836 * var1.field4835; // L: 231
		float var8 = var1.field4837 * var1.field4835; // L: 232
		float var9 = var1.field4836 * var1.field4836; // L: 233
		float var10 = var1.field4836 * var1.field4837; // L: 234
		float var11 = var1.field4837 * var1.field4837; // L: 235
		this.field4843[0] = var6 + var2 - var11 - var9; // L: 236
		this.field4843[1] = var7 + var7 + var5 + var5; // L: 237
		this.field4843[2] = var8 - var4 - var4 + var8; // L: 238
		this.field4843[4] = var7 + (var7 - var5 - var5); // L: 239
		this.field4843[5] = var9 + var2 - var6 - var11; // L: 240
		this.field4843[6] = var10 + var3 + var10 + var3; // L: 241
		this.field4843[8] = var8 + var4 + var8 + var4; // L: 242
		this.field4843[9] = var10 + (var10 - var3 - var3); // L: 243
		this.field4843[10] = var11 + var2 - var9 - var6; // L: 244
	} // L: 245

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lss;B)V",
		garbageValue = "0"
	)
	void method8659(class470 var1) {
		this.field4843[0] = var1.field4849; // L: 248
		this.field4843[1] = var1.field4848; // L: 249
		this.field4843[2] = var1.field4856; // L: 250
		this.field4843[3] = 0.0F; // L: 251
		this.field4843[4] = var1.field4850; // L: 252
		this.field4843[5] = var1.field4851; // L: 253
		this.field4843[6] = var1.field4847; // L: 254
		this.field4843[7] = 0.0F; // L: 255
		this.field4843[8] = var1.field4853; // L: 256
		this.field4843[9] = var1.field4854; // L: 257
		this.field4843[10] = var1.field4859; // L: 258
		this.field4843[11] = 0.0F; // L: 259
		this.field4843[12] = var1.field4855; // L: 260
		this.field4843[13] = var1.field4857; // L: 261
		this.field4843[14] = var1.field4858; // L: 262
		this.field4843[15] = 1.0F; // L: 263
	} // L: 264

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "1728145044"
	)
	float method8635() {
		return this.field4843[12] * this.field4843[9] * this.field4843[3] * this.field4843[6] + (this.field4843[3] * this.field4843[5] * this.field4843[8] * this.field4843[14] + this.field4843[7] * this.field4843[2] * this.field4843[8] * this.field4843[13] + this.field4843[9] * this.field4843[2] * this.field4843[4] * this.field4843[15] + this.field4843[13] * this.field4843[11] * this.field4843[0] * this.field4843[6] + (this.field4843[15] * this.field4843[5] * this.field4843[0] * this.field4843[10] - this.field4843[11] * this.field4843[5] * this.field4843[0] * this.field4843[14] - this.field4843[15] * this.field4843[0] * this.field4843[6] * this.field4843[9]) + this.field4843[0] * this.field4843[7] * this.field4843[9] * this.field4843[14] - this.field4843[13] * this.field4843[10] * this.field4843[0] * this.field4843[7] - this.field4843[15] * this.field4843[10] * this.field4843[1] * this.field4843[4] + this.field4843[14] * this.field4843[4] * this.field4843[1] * this.field4843[11] + this.field4843[8] * this.field4843[1] * this.field4843[6] * this.field4843[15] - this.field4843[12] * this.field4843[11] * this.field4843[6] * this.field4843[1] - this.field4843[8] * this.field4843[7] * this.field4843[1] * this.field4843[14] + this.field4843[10] * this.field4843[7] * this.field4843[1] * this.field4843[12] - this.field4843[2] * this.field4843[4] * this.field4843[11] * this.field4843[13] - this.field4843[8] * this.field4843[5] * this.field4843[2] * this.field4843[15] + this.field4843[11] * this.field4843[5] * this.field4843[2] * this.field4843[12] - this.field4843[12] * this.field4843[9] * this.field4843[7] * this.field4843[2] - this.field4843[14] * this.field4843[3] * this.field4843[4] * this.field4843[9] + this.field4843[13] * this.field4843[4] * this.field4843[3] * this.field4843[10] - this.field4843[3] * this.field4843[5] * this.field4843[10] * this.field4843[12] - this.field4843[13] * this.field4843[8] * this.field4843[6] * this.field4843[3]); // L: 267
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-648106395"
	)
	public void method8685() {
		float var1 = 1.0F / this.method8635(); // L: 271
		float var2 = (this.field4843[9] * this.field4843[7] * this.field4843[14] + this.field4843[15] * this.field4843[5] * this.field4843[10] - this.field4843[14] * this.field4843[11] * this.field4843[5] - this.field4843[6] * this.field4843[9] * this.field4843[15] + this.field4843[11] * this.field4843[6] * this.field4843[13] - this.field4843[13] * this.field4843[7] * this.field4843[10]) * var1; // L: 272
		float var3 = (this.field4843[3] * this.field4843[10] * this.field4843[13] + (this.field4843[11] * this.field4843[1] * this.field4843[14] + this.field4843[15] * -this.field4843[1] * this.field4843[10] + this.field4843[15] * this.field4843[2] * this.field4843[9] - this.field4843[13] * this.field4843[2] * this.field4843[11] - this.field4843[3] * this.field4843[9] * this.field4843[14])) * var1; // L: 273
		float var4 = (this.field4843[5] * this.field4843[3] * this.field4843[14] + this.field4843[7] * this.field4843[2] * this.field4843[13] + (this.field4843[15] * this.field4843[6] * this.field4843[1] - this.field4843[14] * this.field4843[1] * this.field4843[7] - this.field4843[5] * this.field4843[2] * this.field4843[15]) - this.field4843[13] * this.field4843[3] * this.field4843[6]) * var1; // L: 274
		float var5 = var1 * (this.field4843[11] * this.field4843[2] * this.field4843[5] + this.field4843[1] * this.field4843[7] * this.field4843[10] + -this.field4843[1] * this.field4843[6] * this.field4843[11] - this.field4843[9] * this.field4843[2] * this.field4843[7] - this.field4843[3] * this.field4843[5] * this.field4843[10] + this.field4843[6] * this.field4843[3] * this.field4843[9]); // L: 275
		float var6 = var1 * (this.field4843[12] * this.field4843[7] * this.field4843[10] + (this.field4843[10] * -this.field4843[4] * this.field4843[15] + this.field4843[14] * this.field4843[11] * this.field4843[4] + this.field4843[15] * this.field4843[6] * this.field4843[8] - this.field4843[12] * this.field4843[11] * this.field4843[6] - this.field4843[14] * this.field4843[8] * this.field4843[7])); // L: 276
		float var7 = var1 * (this.field4843[8] * this.field4843[3] * this.field4843[14] + this.field4843[10] * this.field4843[0] * this.field4843[15] - this.field4843[14] * this.field4843[11] * this.field4843[0] - this.field4843[15] * this.field4843[2] * this.field4843[8] + this.field4843[12] * this.field4843[2] * this.field4843[11] - this.field4843[3] * this.field4843[10] * this.field4843[12]); // L: 277
		float var8 = (this.field4843[12] * this.field4843[6] * this.field4843[3] + (this.field4843[2] * this.field4843[4] * this.field4843[15] + this.field4843[15] * -this.field4843[0] * this.field4843[6] + this.field4843[0] * this.field4843[7] * this.field4843[14] - this.field4843[12] * this.field4843[7] * this.field4843[2] - this.field4843[3] * this.field4843[4] * this.field4843[14])) * var1; // L: 278
		float var9 = (this.field4843[10] * this.field4843[4] * this.field4843[3] + this.field4843[2] * this.field4843[7] * this.field4843[8] + (this.field4843[6] * this.field4843[0] * this.field4843[11] - this.field4843[10] * this.field4843[0] * this.field4843[7] - this.field4843[4] * this.field4843[2] * this.field4843[11]) - this.field4843[6] * this.field4843[3] * this.field4843[8]) * var1; // L: 279
		float var10 = (this.field4843[8] * this.field4843[7] * this.field4843[13] + this.field4843[9] * this.field4843[4] * this.field4843[15] - this.field4843[13] * this.field4843[11] * this.field4843[4] - this.field4843[8] * this.field4843[5] * this.field4843[15] + this.field4843[12] * this.field4843[5] * this.field4843[11] - this.field4843[9] * this.field4843[7] * this.field4843[12]) * var1; // L: 280
		float var11 = (this.field4843[9] * this.field4843[3] * this.field4843[12] + (this.field4843[9] * -this.field4843[0] * this.field4843[15] + this.field4843[13] * this.field4843[0] * this.field4843[11] + this.field4843[8] * this.field4843[1] * this.field4843[15] - this.field4843[12] * this.field4843[11] * this.field4843[1] - this.field4843[3] * this.field4843[8] * this.field4843[13])) * var1; // L: 281
		float var12 = var1 * (this.field4843[13] * this.field4843[3] * this.field4843[4] + this.field4843[12] * this.field4843[1] * this.field4843[7] + (this.field4843[15] * this.field4843[0] * this.field4843[5] - this.field4843[13] * this.field4843[7] * this.field4843[0] - this.field4843[15] * this.field4843[4] * this.field4843[1]) - this.field4843[5] * this.field4843[3] * this.field4843[12]); // L: 282
		float var13 = (this.field4843[11] * this.field4843[5] * -this.field4843[0] + this.field4843[0] * this.field4843[7] * this.field4843[9] + this.field4843[11] * this.field4843[4] * this.field4843[1] - this.field4843[1] * this.field4843[7] * this.field4843[8] - this.field4843[9] * this.field4843[3] * this.field4843[4] + this.field4843[5] * this.field4843[3] * this.field4843[8]) * var1; // L: 283
		float var14 = var1 * (this.field4843[5] * this.field4843[8] * this.field4843[14] + this.field4843[14] * -this.field4843[4] * this.field4843[9] + this.field4843[4] * this.field4843[10] * this.field4843[13] - this.field4843[12] * this.field4843[10] * this.field4843[5] - this.field4843[13] * this.field4843[6] * this.field4843[8] + this.field4843[12] * this.field4843[6] * this.field4843[9]); // L: 284
		float var15 = (this.field4843[2] * this.field4843[8] * this.field4843[13] + this.field4843[12] * this.field4843[10] * this.field4843[1] + (this.field4843[9] * this.field4843[0] * this.field4843[14] - this.field4843[0] * this.field4843[10] * this.field4843[13] - this.field4843[14] * this.field4843[1] * this.field4843[8]) - this.field4843[12] * this.field4843[2] * this.field4843[9]) * var1; // L: 285
		float var16 = var1 * (this.field4843[5] * this.field4843[2] * this.field4843[12] + (this.field4843[4] * this.field4843[1] * this.field4843[14] + this.field4843[14] * this.field4843[5] * -this.field4843[0] + this.field4843[0] * this.field4843[6] * this.field4843[13] - this.field4843[12] * this.field4843[6] * this.field4843[1] - this.field4843[13] * this.field4843[4] * this.field4843[2])); // L: 286
		float var17 = var1 * (this.field4843[6] * this.field4843[1] * this.field4843[8] + (this.field4843[10] * this.field4843[5] * this.field4843[0] - this.field4843[9] * this.field4843[0] * this.field4843[6] - this.field4843[4] * this.field4843[1] * this.field4843[10]) + this.field4843[4] * this.field4843[2] * this.field4843[9] - this.field4843[8] * this.field4843[2] * this.field4843[5]); // L: 287
		this.field4843[0] = var2; // L: 288
		this.field4843[1] = var3; // L: 289
		this.field4843[2] = var4; // L: 290
		this.field4843[3] = var5; // L: 291
		this.field4843[4] = var6; // L: 292
		this.field4843[5] = var7; // L: 293
		this.field4843[6] = var8; // L: 294
		this.field4843[7] = var9; // L: 295
		this.field4843[8] = var10; // L: 296
		this.field4843[9] = var11; // L: 297
		this.field4843[10] = var12; // L: 298
		this.field4843[11] = var13; // L: 299
		this.field4843[12] = var14; // L: 300
		this.field4843[13] = var15; // L: 301
		this.field4843[14] = var16; // L: 302
		this.field4843[15] = var17; // L: 303
	} // L: 304

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "2002528794"
	)
	public float[] method8623() {
		float[] var1 = new float[3]; // L: 341
		class467 var2 = new class467(this.field4843[0], this.field4843[1], this.field4843[2]); // L: 342
		class467 var3 = new class467(this.field4843[4], this.field4843[5], this.field4843[6]); // L: 343
		class467 var4 = new class467(this.field4843[8], this.field4843[9], this.field4843[10]); // L: 344
		var1[0] = var2.method8586(); // L: 345
		var1[1] = var3.method8586(); // L: 346
		var1[2] = var4.method8586(); // L: 347
		return var1; // L: 348
	}

	public int hashCode() {
		boolean var1 = true; // L: 326
		byte var2 = 1; // L: 327
		int var3 = var2 * 31 + Arrays.hashCode(this.field4843); // L: 328
		return var3; // L: 329
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class469)) { // L: 334
			return false;
		} else {
			class469 var2 = (class469)var1; // L: 335

			for (int var3 = 0; var3 < 16; ++var3) { // L: 336
				if (this.field4843[var3] != var2.field4843[var3]) {
					return false;
				}
			}

			return true; // L: 337
		}
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder(); // L: 309
		this.method8634(); // L: 310
		this.method8625(); // L: 311

		for (int var2 = 0; var2 < 4; ++var2) { // L: 312
			for (int var3 = 0; var3 < 4; ++var3) { // L: 313
				if (var3 > 0) {
					var1.append("\t"); // L: 314
				}

				float var4 = this.field4843[var3 + var2 * 4]; // L: 315
				if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5D) { // L: 316
					var4 = 0.0F;
				}

				var1.append(var4); // L: 317
			}

			var1.append("\n"); // L: 319
		}

		return var1.toString(); // L: 321
	}
}
