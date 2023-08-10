import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rm")
public final class class451 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[Lrm;"
	)
	static class451[] field4744;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1398857623
	)
	static int field4740;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -511681771
	)
	static int field4742;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lrm;"
	)
	public static final class451 field4739;
	@ObfuscatedName("as")
	public float[] field4743;

	static {
		field4744 = new class451[0]; // L: 9
		field4740 = 100; // L: 15
		field4744 = new class451[100]; // L: 16
		field4742 = 0; // L: 17
		field4739 = new class451();
	} // L: 22

	public class451() {
		this.field4743 = new float[16];
		this.method8249(); // L: 41
	} // L: 42

	@ObfuscatedSignature(
		descriptor = "(Lrm;)V"
	)
	public class451(class451 var1) {
		this.field4743 = new float[16];
		this.method8289(var1); // L: 45
	} // L: 46

	@ObfuscatedSignature(
		descriptor = "(Lty;Z)V"
	)
	public class451(Buffer var1, boolean var2) {
		this.field4743 = new float[16]; // L: 21
		this.method8246(var1, var2); // L: 49
	} // L: 50

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1298935751"
	)
	public void method8279() {
		synchronized(field4744) { // L: 35
			if (field4742 < field4740 - 1) { // L: 36
				field4744[++field4742 - 1] = this;
			}

		}
	} // L: 38

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lty;ZI)V",
		garbageValue = "-1389814144"
	)
	void method8246(Buffer var1, boolean var2) {
		if (var2) { // L: 53
			class452 var13 = new class452(); // L: 54
			int var6 = var1.readShort(); // L: 57
			var6 &= 16383; // L: 59
			float var5 = (float)(6.283185307179586D * (double)((float)var6 / 16384.0F)); // L: 60
			var13.method8315(var5); // L: 62
			int var9 = var1.readShort(); // L: 65
			var9 &= 16383; // L: 67
			float var8 = (float)((double)((float)var9 / 16384.0F) * 6.283185307179586D); // L: 68
			var13.method8316(var8); // L: 70
			int var12 = var1.readShort(); // L: 73
			var12 &= 16383; // L: 75
			float var11 = (float)((double)((float)var12 / 16384.0F) * 6.283185307179586D); // L: 76
			var13.method8329(var11); // L: 78
			var13.method8318((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort()); // L: 79
			this.method8248(var13); // L: 80
		} else {
			for (int var3 = 0; var3 < 16; ++var3) { // L: 83
				this.field4743[var3] = var1.method9094(); // L: 84
			}
		}

	} // L: 87

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "737121810"
	)
	float[] method8247() {
		float[] var1 = new float[3]; // L: 90
		if ((double)this.field4743[2] < 0.999D && (double)this.field4743[2] > -0.999D) { // L: 91
			var1[1] = (float)(-Math.asin((double)this.field4743[2])); // L: 92
			double var2 = Math.cos((double)var1[1]); // L: 93
			var1[0] = (float)Math.atan2((double)this.field4743[6] / var2, (double)this.field4743[10] / var2); // L: 94
			var1[2] = (float)Math.atan2((double)this.field4743[1] / var2, (double)this.field4743[0] / var2); // L: 95
		} else {
			var1[0] = 0.0F; // L: 98
			var1[1] = (float)Math.atan2((double)this.field4743[2], 0.0D); // L: 99
			var1[2] = (float)Math.atan2((double)(-this.field4743[9]), (double)this.field4743[5]); // L: 100
		}

		return var1; // L: 102
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "1036092257"
	)
	public float[] method8257() {
		float[] var1 = new float[]{(float)(-Math.asin((double)this.field4743[6])), 0.0F, 0.0F}; // L: 106 107
		double var2 = Math.cos((double)var1[0]); // L: 108
		double var4;
		double var6;
		if (Math.abs(var2) > 0.005D) { // L: 109
			var4 = (double)this.field4743[2]; // L: 110
			var6 = (double)this.field4743[10]; // L: 111
			double var8 = (double)this.field4743[4]; // L: 112
			double var10 = (double)this.field4743[5]; // L: 113
			var1[1] = (float)Math.atan2(var4, var6); // L: 114
			var1[2] = (float)Math.atan2(var8, var10); // L: 115
		} else {
			var4 = (double)this.field4743[1]; // L: 118
			var6 = (double)this.field4743[0]; // L: 119
			if (this.field4743[6] < 0.0F) { // L: 120
				var1[1] = (float)Math.atan2(var4, var6); // L: 121
			} else {
				var1[1] = (float)(-Math.atan2(var4, var6)); // L: 124
			}

			var1[2] = 0.0F; // L: 126
		}

		return var1; // L: 128
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-85"
	)
	void method8249() {
		this.field4743[0] = 1.0F; // L: 132
		this.field4743[1] = 0.0F; // L: 133
		this.field4743[2] = 0.0F; // L: 134
		this.field4743[3] = 0.0F; // L: 135
		this.field4743[4] = 0.0F; // L: 136
		this.field4743[5] = 1.0F; // L: 137
		this.field4743[6] = 0.0F; // L: 138
		this.field4743[7] = 0.0F; // L: 139
		this.field4743[8] = 0.0F; // L: 140
		this.field4743[9] = 0.0F; // L: 141
		this.field4743[10] = 1.0F; // L: 142
		this.field4743[11] = 0.0F; // L: 143
		this.field4743[12] = 0.0F; // L: 144
		this.field4743[13] = 0.0F; // L: 145
		this.field4743[14] = 0.0F; // L: 146
		this.field4743[15] = 1.0F; // L: 147
	} // L: 148

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1783640512"
	)
	public void method8250() {
		this.field4743[0] = 0.0F; // L: 151
		this.field4743[1] = 0.0F; // L: 152
		this.field4743[2] = 0.0F; // L: 153
		this.field4743[3] = 0.0F; // L: 154
		this.field4743[4] = 0.0F;
		this.field4743[5] = 0.0F;
		this.field4743[6] = 0.0F;
		this.field4743[7] = 0.0F;
		this.field4743[8] = 0.0F; // L: 159
		this.field4743[9] = 0.0F; // L: 160
		this.field4743[10] = 0.0F; // L: 161
		this.field4743[11] = 0.0F; // L: 162
		this.field4743[12] = 0.0F; // L: 163
		this.field4743[13] = 0.0F; // L: 164
		this.field4743[14] = 0.0F; // L: 165
		this.field4743[15] = 0.0F; // L: 166
	} // L: 167

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lrm;B)V",
		garbageValue = "2"
	)
	public void method8289(class451 var1) {
		System.arraycopy(var1.field4743, 0, this.field4743, 0, 16); // L: 170
	} // L: 171

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-1994849424"
	)
	public void method8252(float var1) {
		this.method8266(var1, var1, var1); // L: 174
	} // L: 175

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "1837928270"
	)
	public void method8266(float var1, float var2, float var3) {
		this.method8249(); // L: 178
		this.field4743[0] = var1; // L: 179
		this.field4743[5] = var2; // L: 180
		this.field4743[10] = var3; // L: 181
	} // L: 182

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lrm;S)V",
		garbageValue = "28816"
	)
	public void method8254(class451 var1) {
		for (int var2 = 0; var2 < this.field4743.length; ++var2) { // L: 185
			float[] var10000 = this.field4743; // L: 186
			var10000[var2] += var1.field4743[var2];
		}

	} // L: 188

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lrm;S)V",
		garbageValue = "255"
	)
	public void method8285(class451 var1) {
		float var2 = var1.field4743[12] * this.field4743[3] + this.field4743[0] * var1.field4743[0] + this.field4743[1] * var1.field4743[4] + this.field4743[2] * var1.field4743[8]; // L: 191
		float var3 = var1.field4743[13] * this.field4743[3] + this.field4743[2] * var1.field4743[9] + var1.field4743[5] * this.field4743[1] + var1.field4743[1] * this.field4743[0]; // L: 192
		float var4 = this.field4743[2] * var1.field4743[10] + this.field4743[0] * var1.field4743[2] + var1.field4743[6] * this.field4743[1] + var1.field4743[14] * this.field4743[3]; // L: 193
		float var5 = this.field4743[0] * var1.field4743[3] + var1.field4743[7] * this.field4743[1] + this.field4743[2] * var1.field4743[11] + this.field4743[3] * var1.field4743[15]; // L: 194
		float var6 = this.field4743[7] * var1.field4743[12] + var1.field4743[8] * this.field4743[6] + this.field4743[4] * var1.field4743[0] + var1.field4743[4] * this.field4743[5]; // L: 195
		float var7 = var1.field4743[1] * this.field4743[4] + this.field4743[5] * var1.field4743[5] + this.field4743[6] * var1.field4743[9] + this.field4743[7] * var1.field4743[13]; // L: 196
		float var8 = this.field4743[7] * var1.field4743[14] + this.field4743[4] * var1.field4743[2] + this.field4743[5] * var1.field4743[6] + this.field4743[6] * var1.field4743[10]; // L: 197
		float var9 = this.field4743[7] * var1.field4743[15] + this.field4743[6] * var1.field4743[11] + var1.field4743[7] * this.field4743[5] + var1.field4743[3] * this.field4743[4]; // L: 198
		float var10 = var1.field4743[12] * this.field4743[11] + this.field4743[10] * var1.field4743[8] + var1.field4743[4] * this.field4743[9] + this.field4743[8] * var1.field4743[0]; // L: 199
		float var11 = this.field4743[8] * var1.field4743[1] + var1.field4743[5] * this.field4743[9] + var1.field4743[9] * this.field4743[10] + var1.field4743[13] * this.field4743[11]; // L: 200
		float var12 = this.field4743[8] * var1.field4743[2] + var1.field4743[6] * this.field4743[9] + this.field4743[10] * var1.field4743[10] + this.field4743[11] * var1.field4743[14]; // L: 201
		float var13 = this.field4743[10] * var1.field4743[11] + var1.field4743[3] * this.field4743[8] + this.field4743[9] * var1.field4743[7] + this.field4743[11] * var1.field4743[15]; // L: 202
		float var14 = this.field4743[15] * var1.field4743[12] + this.field4743[13] * var1.field4743[4] + this.field4743[12] * var1.field4743[0] + this.field4743[14] * var1.field4743[8]; // L: 203
		float var15 = var1.field4743[13] * this.field4743[15] + var1.field4743[9] * this.field4743[14] + this.field4743[13] * var1.field4743[5] + this.field4743[12] * var1.field4743[1]; // L: 204
		float var16 = this.field4743[12] * var1.field4743[2] + var1.field4743[6] * this.field4743[13] + var1.field4743[10] * this.field4743[14] + var1.field4743[14] * this.field4743[15]; // L: 205
		float var17 = var1.field4743[11] * this.field4743[14] + this.field4743[13] * var1.field4743[7] + var1.field4743[3] * this.field4743[12] + var1.field4743[15] * this.field4743[15]; // L: 206
		this.field4743[0] = var2; // L: 207
		this.field4743[1] = var3; // L: 208
		this.field4743[2] = var4; // L: 209
		this.field4743[3] = var5; // L: 210
		this.field4743[4] = var6; // L: 211
		this.field4743[5] = var7; // L: 212
		this.field4743[6] = var8; // L: 213
		this.field4743[7] = var9; // L: 214
		this.field4743[8] = var10; // L: 215
		this.field4743[9] = var11; // L: 216
		this.field4743[10] = var12; // L: 217
		this.field4743[11] = var13; // L: 218
		this.field4743[12] = var14; // L: 219
		this.field4743[13] = var15; // L: 220
		this.field4743[14] = var16; // L: 221
		this.field4743[15] = var17; // L: 222
	} // L: 223

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lrj;I)V",
		garbageValue = "-2118656993"
	)
	public void method8255(class450 var1) {
		float var2 = var1.field4735 * var1.field4735; // L: 226
		float var3 = var1.field4736 * var1.field4735; // L: 227
		float var4 = var1.field4733 * var1.field4735; // L: 228
		float var5 = var1.field4735 * var1.field4737; // L: 229
		float var6 = var1.field4736 * var1.field4736; // L: 230
		float var7 = var1.field4736 * var1.field4733; // L: 231
		float var8 = var1.field4737 * var1.field4736; // L: 232
		float var9 = var1.field4733 * var1.field4733; // L: 233
		float var10 = var1.field4733 * var1.field4737; // L: 234
		float var11 = var1.field4737 * var1.field4737; // L: 235
		this.field4743[0] = var2 + var6 - var11 - var9; // L: 236
		this.field4743[1] = var5 + var5 + var7 + var7; // L: 237
		this.field4743[2] = var8 + (var8 - var4 - var4); // L: 238
		this.field4743[4] = var7 + (var7 - var5 - var5); // L: 239
		this.field4743[5] = var9 + var2 - var6 - var11; // L: 240
		this.field4743[6] = var3 + var10 + var10 + var3; // L: 241
		this.field4743[8] = var8 + var8 + var4 + var4; // L: 242
		this.field4743[9] = var10 - var3 - var3 + var10; // L: 243
		this.field4743[10] = var2 + var11 - var9 - var6; // L: 244
	} // L: 245

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lrv;I)V",
		garbageValue = "275615452"
	)
	void method8248(class452 var1) {
		this.field4743[0] = var1.field4750; // L: 248
		this.field4743[1] = var1.field4746; // L: 249
		this.field4743[2] = var1.field4747; // L: 250
		this.field4743[3] = 0.0F; // L: 251
		this.field4743[4] = var1.field4754; // L: 252
		this.field4743[5] = var1.field4748; // L: 253
		this.field4743[6] = var1.field4749; // L: 254
		this.field4743[7] = 0.0F; // L: 255
		this.field4743[8] = var1.field4752; // L: 256
		this.field4743[9] = var1.field4745; // L: 257
		this.field4743[10] = var1.field4753; // L: 258
		this.field4743[11] = 0.0F; // L: 259
		this.field4743[12] = var1.field4751; // L: 260
		this.field4743[13] = var1.field4755; // L: 261
		this.field4743[14] = var1.field4756; // L: 262
		this.field4743[15] = 1.0F; // L: 263
	} // L: 264

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)F",
		garbageValue = "-6"
	)
	float method8258() {
		return this.field4743[12] * this.field4743[3] * this.field4743[6] * this.field4743[9] + (this.field4743[14] * this.field4743[5] * this.field4743[3] * this.field4743[8] + this.field4743[13] * this.field4743[10] * this.field4743[4] * this.field4743[3] + (this.field4743[8] * this.field4743[2] * this.field4743[7] * this.field4743[13] + this.field4743[2] * this.field4743[5] * this.field4743[11] * this.field4743[12] + (this.field4743[4] * this.field4743[2] * this.field4743[9] * this.field4743[15] + this.field4743[14] * this.field4743[9] * this.field4743[7] * this.field4743[0] + this.field4743[15] * this.field4743[10] * this.field4743[5] * this.field4743[0] - this.field4743[11] * this.field4743[0] * this.field4743[5] * this.field4743[14] - this.field4743[15] * this.field4743[9] * this.field4743[0] * this.field4743[6] + this.field4743[13] * this.field4743[0] * this.field4743[6] * this.field4743[11] - this.field4743[13] * this.field4743[0] * this.field4743[7] * this.field4743[10] - this.field4743[15] * this.field4743[10] * this.field4743[1] * this.field4743[4] + this.field4743[14] * this.field4743[11] * this.field4743[1] * this.field4743[4] + this.field4743[8] * this.field4743[1] * this.field4743[6] * this.field4743[15] - this.field4743[1] * this.field4743[6] * this.field4743[11] * this.field4743[12] - this.field4743[8] * this.field4743[1] * this.field4743[7] * this.field4743[14] + this.field4743[12] * this.field4743[10] * this.field4743[7] * this.field4743[1] - this.field4743[11] * this.field4743[2] * this.field4743[4] * this.field4743[13] - this.field4743[15] * this.field4743[8] * this.field4743[2] * this.field4743[5]) - this.field4743[12] * this.field4743[9] * this.field4743[7] * this.field4743[2] - this.field4743[9] * this.field4743[4] * this.field4743[3] * this.field4743[14]) - this.field4743[12] * this.field4743[10] * this.field4743[3] * this.field4743[5] - this.field4743[13] * this.field4743[3] * this.field4743[6] * this.field4743[8]); // L: 267
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-882996558"
	)
	public void method8259() {
		float var1 = 1.0F / this.method8258(); // L: 271
		float var2 = (this.field4743[7] * this.field4743[9] * this.field4743[14] + this.field4743[15] * this.field4743[5] * this.field4743[10] - this.field4743[11] * this.field4743[5] * this.field4743[14] - this.field4743[9] * this.field4743[6] * this.field4743[15] + this.field4743[13] * this.field4743[6] * this.field4743[11] - this.field4743[7] * this.field4743[10] * this.field4743[13]) * var1; // L: 272
		float var3 = var1 * (this.field4743[9] * this.field4743[2] * this.field4743[15] + this.field4743[14] * this.field4743[11] * this.field4743[1] + this.field4743[15] * -this.field4743[1] * this.field4743[10] - this.field4743[11] * this.field4743[2] * this.field4743[13] - this.field4743[3] * this.field4743[9] * this.field4743[14] + this.field4743[13] * this.field4743[10] * this.field4743[3]); // L: 273
		float var4 = var1 * (this.field4743[3] * this.field4743[5] * this.field4743[14] + this.field4743[13] * this.field4743[2] * this.field4743[7] + (this.field4743[1] * this.field4743[6] * this.field4743[15] - this.field4743[7] * this.field4743[1] * this.field4743[14] - this.field4743[2] * this.field4743[5] * this.field4743[15]) - this.field4743[13] * this.field4743[3] * this.field4743[6]); // L: 274
		float var5 = (this.field4743[9] * this.field4743[6] * this.field4743[3] + (this.field4743[10] * this.field4743[1] * this.field4743[7] + this.field4743[11] * this.field4743[6] * -this.field4743[1] + this.field4743[5] * this.field4743[2] * this.field4743[11] - this.field4743[2] * this.field4743[7] * this.field4743[9] - this.field4743[10] * this.field4743[5] * this.field4743[3])) * var1; // L: 275
		float var6 = var1 * (this.field4743[10] * this.field4743[7] * this.field4743[12] + (this.field4743[6] * this.field4743[8] * this.field4743[15] + this.field4743[15] * this.field4743[10] * -this.field4743[4] + this.field4743[11] * this.field4743[4] * this.field4743[14] - this.field4743[6] * this.field4743[11] * this.field4743[12] - this.field4743[14] * this.field4743[8] * this.field4743[7])); // L: 276
		float var7 = (this.field4743[3] * this.field4743[8] * this.field4743[14] + this.field4743[15] * this.field4743[10] * this.field4743[0] - this.field4743[14] * this.field4743[0] * this.field4743[11] - this.field4743[15] * this.field4743[8] * this.field4743[2] + this.field4743[2] * this.field4743[11] * this.field4743[12] - this.field4743[3] * this.field4743[10] * this.field4743[12]) * var1; // L: 277
		float var8 = (this.field4743[12] * this.field4743[3] * this.field4743[6] + (this.field4743[6] * -this.field4743[0] * this.field4743[15] + this.field4743[14] * this.field4743[0] * this.field4743[7] + this.field4743[15] * this.field4743[2] * this.field4743[4] - this.field4743[12] * this.field4743[7] * this.field4743[2] - this.field4743[14] * this.field4743[4] * this.field4743[3])) * var1; // L: 278
		float var9 = var1 * (this.field4743[0] * this.field4743[6] * this.field4743[11] - this.field4743[10] * this.field4743[7] * this.field4743[0] - this.field4743[11] * this.field4743[4] * this.field4743[2] + this.field4743[7] * this.field4743[2] * this.field4743[8] + this.field4743[4] * this.field4743[3] * this.field4743[10] - this.field4743[3] * this.field4743[6] * this.field4743[8]); // L: 279
		float var10 = var1 * (this.field4743[13] * this.field4743[7] * this.field4743[8] + this.field4743[15] * this.field4743[4] * this.field4743[9] - this.field4743[13] * this.field4743[11] * this.field4743[4] - this.field4743[15] * this.field4743[8] * this.field4743[5] + this.field4743[12] * this.field4743[11] * this.field4743[5] - this.field4743[7] * this.field4743[9] * this.field4743[12]); // L: 280
		float var11 = var1 * (this.field4743[9] * this.field4743[3] * this.field4743[12] + (this.field4743[15] * this.field4743[8] * this.field4743[1] + this.field4743[11] * this.field4743[0] * this.field4743[13] + this.field4743[15] * this.field4743[9] * -this.field4743[0] - this.field4743[12] * this.field4743[1] * this.field4743[11] - this.field4743[3] * this.field4743[8] * this.field4743[13])); // L: 281
		float var12 = (this.field4743[4] * this.field4743[3] * this.field4743[13] + this.field4743[7] * this.field4743[1] * this.field4743[12] + (this.field4743[15] * this.field4743[5] * this.field4743[0] - this.field4743[0] * this.field4743[7] * this.field4743[13] - this.field4743[15] * this.field4743[1] * this.field4743[4]) - this.field4743[12] * this.field4743[5] * this.field4743[3]) * var1; // L: 282
		float var13 = (this.field4743[8] * this.field4743[3] * this.field4743[5] + (this.field4743[4] * this.field4743[1] * this.field4743[11] + this.field4743[5] * -this.field4743[0] * this.field4743[11] + this.field4743[7] * this.field4743[0] * this.field4743[9] - this.field4743[7] * this.field4743[1] * this.field4743[8] - this.field4743[4] * this.field4743[3] * this.field4743[9])) * var1; // L: 283
		float var14 = (this.field4743[9] * this.field4743[6] * this.field4743[12] + (this.field4743[14] * this.field4743[8] * this.field4743[5] + this.field4743[13] * this.field4743[10] * this.field4743[4] + this.field4743[14] * -this.field4743[4] * this.field4743[9] - this.field4743[12] * this.field4743[10] * this.field4743[5] - this.field4743[6] * this.field4743[8] * this.field4743[13])) * var1; // L: 284
		float var15 = var1 * (this.field4743[1] * this.field4743[10] * this.field4743[12] + (this.field4743[14] * this.field4743[9] * this.field4743[0] - this.field4743[0] * this.field4743[10] * this.field4743[13] - this.field4743[14] * this.field4743[1] * this.field4743[8]) + this.field4743[13] * this.field4743[8] * this.field4743[2] - this.field4743[9] * this.field4743[2] * this.field4743[12]); // L: 285
		float var16 = var1 * (this.field4743[12] * this.field4743[2] * this.field4743[5] + (this.field4743[13] * this.field4743[6] * this.field4743[0] + -this.field4743[0] * this.field4743[5] * this.field4743[14] + this.field4743[4] * this.field4743[1] * this.field4743[14] - this.field4743[12] * this.field4743[1] * this.field4743[6] - this.field4743[13] * this.field4743[4] * this.field4743[2])); // L: 286
		float var17 = (this.field4743[9] * this.field4743[2] * this.field4743[4] + this.field4743[5] * this.field4743[0] * this.field4743[10] - this.field4743[9] * this.field4743[6] * this.field4743[0] - this.field4743[1] * this.field4743[4] * this.field4743[10] + this.field4743[6] * this.field4743[1] * this.field4743[8] - this.field4743[8] * this.field4743[2] * this.field4743[5]) * var1; // L: 287
		this.field4743[0] = var2; // L: 288
		this.field4743[1] = var3; // L: 289
		this.field4743[2] = var4; // L: 290
		this.field4743[3] = var5; // L: 291
		this.field4743[4] = var6; // L: 292
		this.field4743[5] = var7; // L: 293
		this.field4743[6] = var8; // L: 294
		this.field4743[7] = var9; // L: 295
		this.field4743[8] = var10; // L: 296
		this.field4743[9] = var11; // L: 297
		this.field4743[10] = var12; // L: 298
		this.field4743[11] = var13; // L: 299
		this.field4743[12] = var14; // L: 300
		this.field4743[13] = var15; // L: 301
		this.field4743[14] = var16; // L: 302
		this.field4743[15] = var17; // L: 303
	} // L: 304

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "24"
	)
	public float[] method8253() {
		float[] var1 = new float[3]; // L: 341
		class449 var2 = new class449(this.field4743[0], this.field4743[1], this.field4743[2]); // L: 342
		class449 var3 = new class449(this.field4743[4], this.field4743[5], this.field4743[6]); // L: 343
		class449 var4 = new class449(this.field4743[8], this.field4743[9], this.field4743[10]); // L: 344
		var1[0] = var2.method8214(); // L: 345
		var1[1] = var3.method8214(); // L: 346
		var1[2] = var4.method8214(); // L: 347
		return var1; // L: 348
	}

	public int hashCode() {
		boolean var1 = true; // L: 326
		byte var2 = 1; // L: 327
		int var3 = 31 * var2 + Arrays.hashCode(this.field4743); // L: 328
		return var3; // L: 329
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class451)) { // L: 334
			return false;
		} else {
			class451 var2 = (class451)var1; // L: 335

			for (int var3 = 0; var3 < 16; ++var3) { // L: 336
				if (this.field4743[var3] != var2.field4743[var3]) {
					return false;
				}
			}

			return true; // L: 337
		}
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder(); // L: 309
		this.method8257(); // L: 310
		this.method8247(); // L: 311

		for (int var2 = 0; var2 < 4; ++var2) { // L: 312
			for (int var3 = 0; var3 < 4; ++var3) { // L: 313
				if (var3 > 0) {
					var1.append("\t"); // L: 314
				}

				float var4 = this.field4743[var3 + var2 * 4]; // L: 315
				if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5D) { // L: 316
					var4 = 0.0F;
				}

				var1.append(var4); // L: 317
			}

			var1.append("\n"); // L: 319
		}

		return var1.toString(); // L: 321
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lnd;Ljava/lang/String;Ljava/lang/String;I)Luu;",
		garbageValue = "1008669226"
	)
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) { // L: 155
			return null;
		} else {
			int var3 = var0.getGroupId(var1); // L: 156
			int var4 = var0.getFileId(var3, var2); // L: 157
			return MouseRecorder.method2298(var0, var3, var4); // L: 158
		}
	}
}
