import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rz")
public final class class462 {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lrz;"
	)
	static class462[] field4770;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1548563589
	)
	static int field4771;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	public static final class462 field4769;
	@ObfuscatedName("ab")
	public float[] field4772;

	static {
		field4770 = new class462[0]; // L: 9
		ServerPacket.method5933(100); // L: 14
		field4769 = new class462(); // L: 18
	}

	public class462() {
		this.field4772 = new float[16];
		this.method8457(); // L: 43
	} // L: 44

	@ObfuscatedSignature(
		descriptor = "(Lrz;)V"
	)
	public class462(class462 var1) {
		this.field4772 = new float[16];
		this.method8435(var1); // L: 47
	} // L: 48

	@ObfuscatedSignature(
		descriptor = "(Luj;Z)V"
	)
	public class462(Buffer var1, boolean var2) {
		this.field4772 = new float[16]; // L: 17
		this.method8436(var1, var2); // L: 51
	} // L: 52

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2018425549"
	)
	public void method8459() {
		synchronized(field4770) { // L: 37
			if (DirectByteArrayCopier.field3822 < field4771 - 1) { // L: 38
				field4770[++DirectByteArrayCopier.field3822 - 1] = this;
			}

		}
	} // L: 40

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Luj;ZI)V",
		garbageValue = "-1679447945"
	)
	void method8436(Buffer var1, boolean var2) {
		if (var2) { // L: 55
			class463 var13 = new class463(); // L: 56
			int var6 = var1.readShort(); // L: 59
			var6 &= 16383; // L: 61
			float var5 = (float)(6.283185307179586D * (double)((float)var6 / 16384.0F)); // L: 62
			var13.method8498(var5); // L: 64
			int var9 = var1.readShort(); // L: 67
			var9 &= 16383; // L: 69
			float var8 = (float)(6.283185307179586D * (double)((float)var9 / 16384.0F)); // L: 70
			var13.method8514(var8); // L: 72
			int var12 = var1.readShort(); // L: 75
			var12 &= 16383; // L: 77
			float var11 = (float)(6.283185307179586D * (double)((float)var12 / 16384.0F)); // L: 78
			var13.method8499(var11); // L: 80
			var13.method8501((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort()); // L: 81
			this.method8451(var13); // L: 82
		} else {
			for (int var3 = 0; var3 < 16; ++var3) { // L: 85
				this.field4772[var3] = var1.method9268(); // L: 86
			}
		}

	} // L: 89

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "1"
	)
	float[] method8449() {
		float[] var1 = new float[3]; // L: 92
		if ((double)this.field4772[2] < 0.999D && (double)this.field4772[2] > -0.999D) { // L: 93
			var1[1] = (float)(-Math.asin((double)this.field4772[2])); // L: 94
			double var2 = Math.cos((double)var1[1]); // L: 95
			var1[0] = (float)Math.atan2((double)this.field4772[6] / var2, (double)this.field4772[10] / var2); // L: 96
			var1[2] = (float)Math.atan2((double)this.field4772[1] / var2, (double)this.field4772[0] / var2); // L: 97
		} else {
			var1[0] = 0.0F; // L: 100
			var1[1] = (float)Math.atan2((double)this.field4772[2], 0.0D); // L: 101
			var1[2] = (float)Math.atan2((double)(-this.field4772[9]), (double)this.field4772[5]); // L: 102
		}

		return var1; // L: 104
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "5"
	)
	public float[] method8438() {
		float[] var1 = new float[]{(float)(-Math.asin((double)this.field4772[6])), 0.0F, 0.0F}; // L: 108 109
		double var2 = Math.cos((double)var1[0]); // L: 110
		double var4;
		double var6;
		if (Math.abs(var2) > 0.005D) { // L: 111
			var4 = (double)this.field4772[2]; // L: 112
			var6 = (double)this.field4772[10]; // L: 113
			double var8 = (double)this.field4772[4]; // L: 114
			double var10 = (double)this.field4772[5]; // L: 115
			var1[1] = (float)Math.atan2(var4, var6); // L: 116
			var1[2] = (float)Math.atan2(var8, var10); // L: 117
		} else {
			var4 = (double)this.field4772[1]; // L: 120
			var6 = (double)this.field4772[0]; // L: 121
			if (this.field4772[6] < 0.0F) { // L: 122
				var1[1] = (float)Math.atan2(var4, var6); // L: 123
			} else {
				var1[1] = (float)(-Math.atan2(var4, var6)); // L: 126
			}

			var1[2] = 0.0F; // L: 128
		}

		return var1; // L: 130
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-60"
	)
	void method8457() {
		this.field4772[0] = 1.0F; // L: 134
		this.field4772[1] = 0.0F; // L: 135
		this.field4772[2] = 0.0F; // L: 136
		this.field4772[3] = 0.0F; // L: 137
		this.field4772[4] = 0.0F; // L: 138
		this.field4772[5] = 1.0F; // L: 139
		this.field4772[6] = 0.0F; // L: 140
		this.field4772[7] = 0.0F; // L: 141
		this.field4772[8] = 0.0F; // L: 142
		this.field4772[9] = 0.0F; // L: 143
		this.field4772[10] = 1.0F; // L: 144
		this.field4772[11] = 0.0F; // L: 145
		this.field4772[12] = 0.0F; // L: 146
		this.field4772[13] = 0.0F; // L: 147
		this.field4772[14] = 0.0F; // L: 148
		this.field4772[15] = 1.0F; // L: 149
	} // L: 150

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "77"
	)
	public void method8488() {
		this.field4772[0] = 0.0F; // L: 153
		this.field4772[1] = 0.0F; // L: 154
		this.field4772[2] = 0.0F; // L: 155
		this.field4772[3] = 0.0F; // L: 156
		this.field4772[4] = 0.0F; // L: 157
		this.field4772[5] = 0.0F; // L: 158
		this.field4772[6] = 0.0F; // L: 159
		this.field4772[7] = 0.0F; // L: 160
		this.field4772[8] = 0.0F; // L: 161
		this.field4772[9] = 0.0F; // L: 162
		this.field4772[10] = 0.0F; // L: 163
		this.field4772[11] = 0.0F; // L: 164
		this.field4772[12] = 0.0F; // L: 165
		this.field4772[13] = 0.0F; // L: 166
		this.field4772[14] = 0.0F; // L: 167
		this.field4772[15] = 0.0F; // L: 168
	} // L: 169

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lrz;I)V",
		garbageValue = "-1456016137"
	)
	public void method8435(class462 var1) {
		System.arraycopy(var1.field4772, 0, this.field4772, 0, 16); // L: 172
	} // L: 173

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "93"
	)
	public void method8462(float var1) {
		this.method8443(var1, var1, var1); // L: 176
	} // L: 177

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(FFFB)V",
		garbageValue = "111"
	)
	public void method8443(float var1, float var2, float var3) {
		this.method8457(); // L: 180
		this.field4772[0] = var1; // L: 181
		this.field4772[5] = var2; // L: 182
		this.field4772[10] = var3; // L: 183
	} // L: 184

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lrz;I)V",
		garbageValue = "-459748559"
	)
	public void method8442(class462 var1) {
		for (int var2 = 0; var2 < this.field4772.length; ++var2) { // L: 187
			float[] var10000 = this.field4772; // L: 188
			var10000[var2] += var1.field4772[var2];
		}

	} // L: 190

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lrz;I)V",
		garbageValue = "1005316731"
	)
	public void method8445(class462 var1) {
		float var2 = var1.field4772[12] * this.field4772[3] + var1.field4772[8] * this.field4772[2] + var1.field4772[0] * this.field4772[0] + this.field4772[1] * var1.field4772[4]; // L: 193
		float var3 = var1.field4772[9] * this.field4772[2] + var1.field4772[5] * this.field4772[1] + this.field4772[0] * var1.field4772[1] + var1.field4772[13] * this.field4772[3]; // L: 194
		float var4 = var1.field4772[14] * this.field4772[3] + var1.field4772[6] * this.field4772[1] + var1.field4772[2] * this.field4772[0] + var1.field4772[10] * this.field4772[2]; // L: 195
		float var5 = this.field4772[3] * var1.field4772[15] + var1.field4772[3] * this.field4772[0] + var1.field4772[7] * this.field4772[1] + this.field4772[2] * var1.field4772[11]; // L: 196
		float var6 = this.field4772[7] * var1.field4772[12] + this.field4772[4] * var1.field4772[0] + var1.field4772[4] * this.field4772[5] + this.field4772[6] * var1.field4772[8]; // L: 197
		float var7 = this.field4772[7] * var1.field4772[13] + this.field4772[5] * var1.field4772[5] + var1.field4772[1] * this.field4772[4] + var1.field4772[9] * this.field4772[6]; // L: 198
		float var8 = this.field4772[7] * var1.field4772[14] + this.field4772[4] * var1.field4772[2] + var1.field4772[6] * this.field4772[5] + this.field4772[6] * var1.field4772[10]; // L: 199
		float var9 = var1.field4772[11] * this.field4772[6] + var1.field4772[3] * this.field4772[4] + this.field4772[5] * var1.field4772[7] + this.field4772[7] * var1.field4772[15]; // L: 200
		float var10 = this.field4772[8] * var1.field4772[0] + this.field4772[9] * var1.field4772[4] + this.field4772[10] * var1.field4772[8] + this.field4772[11] * var1.field4772[12]; // L: 201
		float var11 = var1.field4772[1] * this.field4772[8] + var1.field4772[5] * this.field4772[9] + var1.field4772[9] * this.field4772[10] + this.field4772[11] * var1.field4772[13]; // L: 202
		float var12 = this.field4772[8] * var1.field4772[2] + this.field4772[9] * var1.field4772[6] + this.field4772[10] * var1.field4772[10] + this.field4772[11] * var1.field4772[14]; // L: 203
		float var13 = this.field4772[11] * var1.field4772[15] + var1.field4772[7] * this.field4772[9] + var1.field4772[3] * this.field4772[8] + var1.field4772[11] * this.field4772[10]; // L: 204
		float var14 = var1.field4772[8] * this.field4772[14] + var1.field4772[0] * this.field4772[12] + var1.field4772[4] * this.field4772[13] + this.field4772[15] * var1.field4772[12]; // L: 205
		float var15 = var1.field4772[9] * this.field4772[14] + this.field4772[12] * var1.field4772[1] + this.field4772[13] * var1.field4772[5] + var1.field4772[13] * this.field4772[15]; // L: 206
		float var16 = var1.field4772[14] * this.field4772[15] + this.field4772[12] * var1.field4772[2] + var1.field4772[6] * this.field4772[13] + var1.field4772[10] * this.field4772[14]; // L: 207
		float var17 = this.field4772[13] * var1.field4772[7] + var1.field4772[3] * this.field4772[12] + var1.field4772[11] * this.field4772[14] + this.field4772[15] * var1.field4772[15]; // L: 208
		this.field4772[0] = var2; // L: 209
		this.field4772[1] = var3; // L: 210
		this.field4772[2] = var4; // L: 211
		this.field4772[3] = var5; // L: 212
		this.field4772[4] = var6; // L: 213
		this.field4772[5] = var7; // L: 214
		this.field4772[6] = var8; // L: 215
		this.field4772[7] = var9; // L: 216
		this.field4772[8] = var10; // L: 217
		this.field4772[9] = var11; // L: 218
		this.field4772[10] = var12; // L: 219
		this.field4772[11] = var13; // L: 220
		this.field4772[12] = var14; // L: 221
		this.field4772[13] = var15; // L: 222
		this.field4772[14] = var16; // L: 223
		this.field4772[15] = var17; // L: 224
	} // L: 225

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lrq;I)V",
		garbageValue = "-2073322468"
	)
	public void method8446(class461 var1) {
		float var2 = var1.field4767 * var1.field4767; // L: 228
		float var3 = var1.field4767 * var1.field4768; // L: 229
		float var4 = var1.field4767 * var1.field4765; // L: 230
		float var5 = var1.field4767 * var1.field4766; // L: 231
		float var6 = var1.field4768 * var1.field4768; // L: 232
		float var7 = var1.field4768 * var1.field4765; // L: 233
		float var8 = var1.field4766 * var1.field4768; // L: 234
		float var9 = var1.field4765 * var1.field4765; // L: 235
		float var10 = var1.field4765 * var1.field4766; // L: 236
		float var11 = var1.field4766 * var1.field4766; // L: 237
		this.field4772[0] = var2 + var6 - var11 - var9; // L: 238
		this.field4772[1] = var5 + var7 + var5 + var7; // L: 239
		this.field4772[2] = var8 - var4 - var4 + var8; // L: 240
		this.field4772[4] = var7 - var5 - var5 + var7; // L: 241
		this.field4772[5] = var9 + var2 - var6 - var11; // L: 242
		this.field4772[6] = var3 + var3 + var10 + var10; // L: 243
		this.field4772[8] = var4 + var8 + var8 + var4; // L: 244
		this.field4772[9] = var10 + (var10 - var3 - var3); // L: 245
		this.field4772[10] = var2 + var11 - var9 - var6; // L: 246
	} // L: 247

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lrj;I)V",
		garbageValue = "-1749310376"
	)
	void method8451(class463 var1) {
		this.field4772[0] = var1.field4776; // L: 250
		this.field4772[1] = var1.field4775; // L: 251
		this.field4772[2] = var1.field4785; // L: 252
		this.field4772[3] = 0.0F; // L: 253
		this.field4772[4] = var1.field4777; // L: 254
		this.field4772[5] = var1.field4778; // L: 255
		this.field4772[6] = var1.field4779; // L: 256
		this.field4772[7] = 0.0F; // L: 257
		this.field4772[8] = var1.field4780; // L: 258
		this.field4772[9] = var1.field4781; // L: 259
		this.field4772[10] = var1.field4782; // L: 260
		this.field4772[11] = 0.0F; // L: 261
		this.field4772[12] = var1.field4783; // L: 262
		this.field4772[13] = var1.field4784; // L: 263
		this.field4772[14] = var1.field4774; // L: 264
		this.field4772[15] = 1.0F; // L: 265
	} // L: 266

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "868032907"
	)
	float method8448() {
		return this.field4772[5] * this.field4772[3] * this.field4772[8] * this.field4772[14] + this.field4772[4] * this.field4772[3] * this.field4772[10] * this.field4772[13] + (this.field4772[8] * this.field4772[7] * this.field4772[2] * this.field4772[13] + this.field4772[15] * this.field4772[6] * this.field4772[1] * this.field4772[8] + this.field4772[13] * this.field4772[11] * this.field4772[6] * this.field4772[0] + (this.field4772[15] * this.field4772[5] * this.field4772[0] * this.field4772[10] - this.field4772[5] * this.field4772[0] * this.field4772[11] * this.field4772[14] - this.field4772[6] * this.field4772[0] * this.field4772[9] * this.field4772[15]) + this.field4772[14] * this.field4772[9] * this.field4772[0] * this.field4772[7] - this.field4772[7] * this.field4772[0] * this.field4772[10] * this.field4772[13] - this.field4772[15] * this.field4772[10] * this.field4772[4] * this.field4772[1] + this.field4772[11] * this.field4772[4] * this.field4772[1] * this.field4772[14] - this.field4772[1] * this.field4772[6] * this.field4772[11] * this.field4772[12] - this.field4772[14] * this.field4772[1] * this.field4772[7] * this.field4772[8] + this.field4772[1] * this.field4772[7] * this.field4772[10] * this.field4772[12] + this.field4772[15] * this.field4772[2] * this.field4772[4] * this.field4772[9] - this.field4772[13] * this.field4772[11] * this.field4772[2] * this.field4772[4] - this.field4772[2] * this.field4772[5] * this.field4772[8] * this.field4772[15] + this.field4772[12] * this.field4772[2] * this.field4772[5] * this.field4772[11] - this.field4772[12] * this.field4772[9] * this.field4772[7] * this.field4772[2] - this.field4772[9] * this.field4772[3] * this.field4772[4] * this.field4772[14]) - this.field4772[10] * this.field4772[5] * this.field4772[3] * this.field4772[12] - this.field4772[6] * this.field4772[3] * this.field4772[8] * this.field4772[13] + this.field4772[12] * this.field4772[9] * this.field4772[3] * this.field4772[6]; // L: 269
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-536017222"
	)
	public void method8437() {
		float var1 = 1.0F / this.method8448(); // L: 273
		float var2 = (this.field4772[7] * this.field4772[9] * this.field4772[14] + this.field4772[15] * this.field4772[10] * this.field4772[5] - this.field4772[14] * this.field4772[5] * this.field4772[11] - this.field4772[15] * this.field4772[9] * this.field4772[6] + this.field4772[13] * this.field4772[6] * this.field4772[11] - this.field4772[10] * this.field4772[7] * this.field4772[13]) * var1; // L: 274
		float var3 = (this.field4772[13] * this.field4772[10] * this.field4772[3] + (this.field4772[15] * -this.field4772[1] * this.field4772[10] + this.field4772[11] * this.field4772[1] * this.field4772[14] + this.field4772[2] * this.field4772[9] * this.field4772[15] - this.field4772[13] * this.field4772[11] * this.field4772[2] - this.field4772[14] * this.field4772[9] * this.field4772[3])) * var1; // L: 275
		float var4 = var1 * (this.field4772[15] * this.field4772[6] * this.field4772[1] - this.field4772[14] * this.field4772[7] * this.field4772[1] - this.field4772[15] * this.field4772[2] * this.field4772[5] + this.field4772[2] * this.field4772[7] * this.field4772[13] + this.field4772[3] * this.field4772[5] * this.field4772[14] - this.field4772[13] * this.field4772[6] * this.field4772[3]); // L: 276
		float var5 = (this.field4772[5] * this.field4772[2] * this.field4772[11] + this.field4772[11] * this.field4772[6] * -this.field4772[1] + this.field4772[10] * this.field4772[1] * this.field4772[7] - this.field4772[7] * this.field4772[2] * this.field4772[9] - this.field4772[10] * this.field4772[5] * this.field4772[3] + this.field4772[6] * this.field4772[3] * this.field4772[9]) * var1; // L: 277
		float var6 = var1 * (this.field4772[12] * this.field4772[7] * this.field4772[10] + (this.field4772[14] * this.field4772[11] * this.field4772[4] + -this.field4772[4] * this.field4772[10] * this.field4772[15] + this.field4772[6] * this.field4772[8] * this.field4772[15] - this.field4772[12] * this.field4772[11] * this.field4772[6] - this.field4772[7] * this.field4772[8] * this.field4772[14])); // L: 278
		float var7 = var1 * (this.field4772[11] * this.field4772[2] * this.field4772[12] + (this.field4772[0] * this.field4772[10] * this.field4772[15] - this.field4772[0] * this.field4772[11] * this.field4772[14] - this.field4772[8] * this.field4772[2] * this.field4772[15]) + this.field4772[3] * this.field4772[8] * this.field4772[14] - this.field4772[12] * this.field4772[10] * this.field4772[3]); // L: 279
		float var8 = (this.field4772[3] * this.field4772[6] * this.field4772[12] + (this.field4772[14] * this.field4772[7] * this.field4772[0] + this.field4772[6] * -this.field4772[0] * this.field4772[15] + this.field4772[4] * this.field4772[2] * this.field4772[15] - this.field4772[2] * this.field4772[7] * this.field4772[12] - this.field4772[3] * this.field4772[4] * this.field4772[14])) * var1; // L: 280
		float var9 = var1 * (this.field4772[8] * this.field4772[2] * this.field4772[7] + (this.field4772[11] * this.field4772[6] * this.field4772[0] - this.field4772[10] * this.field4772[7] * this.field4772[0] - this.field4772[2] * this.field4772[4] * this.field4772[11]) + this.field4772[10] * this.field4772[3] * this.field4772[4] - this.field4772[6] * this.field4772[3] * this.field4772[8]); // L: 281
		float var10 = var1 * (this.field4772[13] * this.field4772[7] * this.field4772[8] + this.field4772[15] * this.field4772[4] * this.field4772[9] - this.field4772[4] * this.field4772[11] * this.field4772[13] - this.field4772[5] * this.field4772[8] * this.field4772[15] + this.field4772[11] * this.field4772[5] * this.field4772[12] - this.field4772[7] * this.field4772[9] * this.field4772[12]); // L: 282
		float var11 = var1 * (this.field4772[8] * this.field4772[1] * this.field4772[15] + this.field4772[15] * this.field4772[9] * -this.field4772[0] + this.field4772[0] * this.field4772[11] * this.field4772[13] - this.field4772[12] * this.field4772[1] * this.field4772[11] - this.field4772[8] * this.field4772[3] * this.field4772[13] + this.field4772[12] * this.field4772[9] * this.field4772[3]); // L: 283
		float var12 = (this.field4772[7] * this.field4772[1] * this.field4772[12] + (this.field4772[15] * this.field4772[5] * this.field4772[0] - this.field4772[13] * this.field4772[7] * this.field4772[0] - this.field4772[4] * this.field4772[1] * this.field4772[15]) + this.field4772[13] * this.field4772[3] * this.field4772[4] - this.field4772[12] * this.field4772[3] * this.field4772[5]) * var1; // L: 284
		float var13 = var1 * (this.field4772[8] * this.field4772[5] * this.field4772[3] + (this.field4772[11] * this.field4772[5] * -this.field4772[0] + this.field4772[0] * this.field4772[7] * this.field4772[9] + this.field4772[11] * this.field4772[1] * this.field4772[4] - this.field4772[8] * this.field4772[7] * this.field4772[1] - this.field4772[3] * this.field4772[4] * this.field4772[9])); // L: 285
		float var14 = var1 * (this.field4772[14] * this.field4772[9] * -this.field4772[4] + this.field4772[13] * this.field4772[4] * this.field4772[10] + this.field4772[14] * this.field4772[5] * this.field4772[8] - this.field4772[5] * this.field4772[10] * this.field4772[12] - this.field4772[13] * this.field4772[8] * this.field4772[6] + this.field4772[9] * this.field4772[6] * this.field4772[12]); // L: 286
		float var15 = (this.field4772[13] * this.field4772[2] * this.field4772[8] + this.field4772[10] * this.field4772[1] * this.field4772[12] + (this.field4772[9] * this.field4772[0] * this.field4772[14] - this.field4772[13] * this.field4772[0] * this.field4772[10] - this.field4772[1] * this.field4772[8] * this.field4772[14]) - this.field4772[12] * this.field4772[2] * this.field4772[9]) * var1; // L: 287
		float var16 = var1 * (this.field4772[12] * this.field4772[2] * this.field4772[5] + (this.field4772[14] * -this.field4772[0] * this.field4772[5] + this.field4772[0] * this.field4772[6] * this.field4772[13] + this.field4772[14] * this.field4772[1] * this.field4772[4] - this.field4772[6] * this.field4772[1] * this.field4772[12] - this.field4772[13] * this.field4772[4] * this.field4772[2])); // L: 288
		float var17 = var1 * (this.field4772[4] * this.field4772[2] * this.field4772[9] + this.field4772[5] * this.field4772[0] * this.field4772[10] - this.field4772[9] * this.field4772[6] * this.field4772[0] - this.field4772[10] * this.field4772[4] * this.field4772[1] + this.field4772[8] * this.field4772[1] * this.field4772[6] - this.field4772[2] * this.field4772[5] * this.field4772[8]); // L: 289
		this.field4772[0] = var2; // L: 290
		this.field4772[1] = var3; // L: 291
		this.field4772[2] = var4; // L: 292
		this.field4772[3] = var5; // L: 293
		this.field4772[4] = var6; // L: 294
		this.field4772[5] = var7; // L: 295
		this.field4772[6] = var8; // L: 296
		this.field4772[7] = var9; // L: 297
		this.field4772[8] = var10; // L: 298
		this.field4772[9] = var11; // L: 299
		this.field4772[10] = var12; // L: 300
		this.field4772[11] = var13; // L: 301
		this.field4772[12] = var14; // L: 302
		this.field4772[13] = var15; // L: 303
		this.field4772[14] = var16; // L: 304
		this.field4772[15] = var17; // L: 305
	} // L: 306

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "-616853758"
	)
	public float[] method8450() {
		float[] var1 = new float[3]; // L: 343
		class460 var2 = new class460(this.field4772[0], this.field4772[1], this.field4772[2]); // L: 344
		class460 var3 = new class460(this.field4772[4], this.field4772[5], this.field4772[6]); // L: 345
		class460 var4 = new class460(this.field4772[8], this.field4772[9], this.field4772[10]); // L: 346
		var1[0] = var2.method8402(); // L: 347
		var1[1] = var3.method8402(); // L: 348
		var1[2] = var4.method8402(); // L: 349
		return var1; // L: 350
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder(); // L: 311
		this.method8438(); // L: 312
		this.method8449(); // L: 313

		for (int var2 = 0; var2 < 4; ++var2) { // L: 314
			for (int var3 = 0; var3 < 4; ++var3) { // L: 315
				if (var3 > 0) {
					var1.append("\t"); // L: 316
				}

				float var4 = this.field4772[var3 + var2 * 4]; // L: 317
				if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5D) { // L: 318
					var4 = 0.0F;
				}

				var1.append(var4); // L: 319
			}

			var1.append("\n"); // L: 321
		}

		return var1.toString(); // L: 323
	}

	public int hashCode() {
		boolean var1 = true; // L: 328
		byte var2 = 1; // L: 329
		int var3 = var2 * 31 + Arrays.hashCode(this.field4772); // L: 330
		return var3; // L: 331
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class462)) { // L: 336
			return false;
		} else {
			class462 var2 = (class462)var1; // L: 337

			for (int var3 = 0; var3 < 16; ++var3) { // L: 338
				if (var2.field4772[var3] != this.field4772[var3]) {
					return false;
				}
			}

			return true; // L: 339
		}
	}
}
