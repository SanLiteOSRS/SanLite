import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ny")
public final class class388 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "[Lny;"
	)
	static class388[] field4399;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -381772935
	)
	static int field4401;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1878154693
	)
	static int field4400;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	public static final class388 field4402;
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "[Lqn;"
	)
	@Export("worldSelectBackSprites")
	static SpritePixels[] worldSelectBackSprites;
	@ObfuscatedName("c")
	public float[] field4398;

	static {
		field4399 = new class388[0]; // L: 9
		field4401 = 100; // L: 15
		field4399 = new class388[100]; // L: 16
		field4400 = 0; // L: 17
		field4402 = new class388();
	}

	public class388() {
		this.field4398 = new float[16];
		this.method6940(); // L: 41
	} // L: 42

	@ObfuscatedSignature(
		descriptor = "(Lny;)V"
	)
	public class388(class388 var1) {
		this.field4398 = new float[16];
		this.method6915(var1); // L: 45
	} // L: 46

	@ObfuscatedSignature(
		descriptor = "(Lqr;Z)V"
	)
	public class388(Buffer var1, boolean var2) {
		this.field4398 = new float[16];
		this.method6931(var1, var2); // L: 49
	} // L: 50

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1881731419"
	)
	public void method6946() {
		synchronized(field4399) { // L: 35
			if (field4400 < field4401 - 1) { // L: 36
				field4399[++field4400 - 1] = this;
			}

		}
	} // L: 38

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lqr;ZI)V",
		garbageValue = "-1325032638"
	)
	void method6931(Buffer var1, boolean var2) {
		if (var2) { // L: 53
			class389 var4 = new class389(); // L: 54
			var4.method6989(class29.method388(var1.readShort())); // L: 55
			var4.method6982(class29.method388(var1.readShort())); // L: 56
			var4.method6983(class29.method388(var1.readShort())); // L: 57
			var4.method6998((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort()); // L: 58
			this.method6932(var4); // L: 59
		} else {
			for (int var3 = 0; var3 < 16; ++var3) { // L: 62
				this.field4398[var3] = var1.method7824(); // L: 63
			}
		}

	} // L: 66

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "850593940"
	)
	float[] method6912() {
		float[] var1 = new float[3]; // L: 69
		if ((double)this.field4398[2] < 0.999D && (double)this.field4398[2] > -0.999D) { // L: 70
			var1[1] = (float)(-Math.asin((double)this.field4398[2])); // L: 71
			double var2 = Math.cos((double)var1[1]); // L: 72
			var1[0] = (float)Math.atan2((double)this.field4398[6] / var2, (double)this.field4398[10] / var2); // L: 73
			var1[2] = (float)Math.atan2((double)this.field4398[1] / var2, (double)this.field4398[0] / var2); // L: 74
		} else {
			var1[0] = 0.0F; // L: 77
			var1[1] = (float)Math.atan2((double)this.field4398[2], 0.0D); // L: 78
			var1[2] = (float)Math.atan2((double)(-this.field4398[9]), (double)this.field4398[5]); // L: 79
		}

		return var1; // L: 81
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "955225970"
	)
	public float[] method6913() {
		float[] var1 = new float[]{(float)(-Math.asin((double)this.field4398[6])), 0.0F, 0.0F}; // L: 85 86
		double var2 = Math.cos((double)var1[0]); // L: 87
		double var4;
		double var6;
		if (Math.abs(var2) > 0.005D) { // L: 88
			var4 = (double)this.field4398[2]; // L: 89
			var6 = (double)this.field4398[10]; // L: 90
			double var8 = (double)this.field4398[4]; // L: 91
			double var10 = (double)this.field4398[5]; // L: 92
			var1[1] = (float)Math.atan2(var4, var6); // L: 93
			var1[2] = (float)Math.atan2(var8, var10); // L: 94
		} else {
			var4 = (double)this.field4398[1]; // L: 97
			var6 = (double)this.field4398[0]; // L: 98
			if (this.field4398[6] < 0.0F) { // L: 99
				var1[1] = (float)Math.atan2(var4, var6); // L: 100
			} else {
				var1[1] = (float)(-Math.atan2(var4, var6)); // L: 103
			}

			var1[2] = 0.0F; // L: 105
		}

		return var1; // L: 107
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-16"
	)
	void method6940() {
		this.field4398[0] = 1.0F; // L: 111
		this.field4398[1] = 0.0F; // L: 112
		this.field4398[2] = 0.0F; // L: 113
		this.field4398[3] = 0.0F; // L: 114
		this.field4398[4] = 0.0F; // L: 115
		this.field4398[5] = 1.0F; // L: 116
		this.field4398[6] = 0.0F; // L: 117
		this.field4398[7] = 0.0F; // L: 118
		this.field4398[8] = 0.0F; // L: 119
		this.field4398[9] = 0.0F; // L: 120
		this.field4398[10] = 1.0F; // L: 121
		this.field4398[11] = 0.0F; // L: 122
		this.field4398[12] = 0.0F; // L: 123
		this.field4398[13] = 0.0F; // L: 124
		this.field4398[14] = 0.0F; // L: 125
		this.field4398[15] = 1.0F; // L: 126
	} // L: 127

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1053530913"
	)
	public void method6914() {
		this.field4398[0] = 0.0F; // L: 130
		this.field4398[1] = 0.0F; // L: 131
		this.field4398[2] = 0.0F; // L: 132
		this.field4398[3] = 0.0F; // L: 133
		this.field4398[4] = 0.0F; // L: 134
		this.field4398[5] = 0.0F; // L: 135
		this.field4398[6] = 0.0F; // L: 136
		this.field4398[7] = 0.0F; // L: 137
		this.field4398[8] = 0.0F; // L: 138
		this.field4398[9] = 0.0F; // L: 139
		this.field4398[10] = 0.0F; // L: 140
		this.field4398[11] = 0.0F; // L: 141
		this.field4398[12] = 0.0F; // L: 142
		this.field4398[13] = 0.0F; // L: 143
		this.field4398[14] = 0.0F; // L: 144
		this.field4398[15] = 0.0F; // L: 145
	} // L: 146

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lny;I)V",
		garbageValue = "-750256420"
	)
	public void method6915(class388 var1) {
		System.arraycopy(var1.field4398, 0, this.field4398, 0, 16); // L: 149
	} // L: 150

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-325907396"
	)
	public void method6916(float var1) {
		this.method6928(var1, var1, var1); // L: 153
	} // L: 154

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(FFFB)V",
		garbageValue = "1"
	)
	public void method6928(float var1, float var2, float var3) {
		this.method6940(); // L: 157
		this.field4398[0] = var1; // L: 158
		this.field4398[5] = var2; // L: 159
		this.field4398[10] = var3; // L: 160
	} // L: 161

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lny;I)V",
		garbageValue = "1481080073"
	)
	public void method6935(class388 var1) {
		for (int var2 = 0; var2 < this.field4398.length; ++var2) { // L: 164
			float[] var10000 = this.field4398; // L: 165
			var10000[var2] += var1.field4398[var2];
		}

	} // L: 167

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lny;I)V",
		garbageValue = "274062094"
	)
	public void method6954(class388 var1) {
		float var2 = this.field4398[3] * var1.field4398[12] + var1.field4398[4] * this.field4398[1] + var1.field4398[0] * this.field4398[0] + this.field4398[2] * var1.field4398[8]; // L: 170
		float var3 = var1.field4398[13] * this.field4398[3] + var1.field4398[5] * this.field4398[1] + this.field4398[0] * var1.field4398[1] + var1.field4398[9] * this.field4398[2]; // L: 171
		float var4 = var1.field4398[14] * this.field4398[3] + var1.field4398[2] * this.field4398[0] + var1.field4398[6] * this.field4398[1] + this.field4398[2] * var1.field4398[10]; // L: 172
		float var5 = this.field4398[1] * var1.field4398[7] + var1.field4398[3] * this.field4398[0] + this.field4398[2] * var1.field4398[11] + this.field4398[3] * var1.field4398[15]; // L: 173
		float var6 = var1.field4398[8] * this.field4398[6] + var1.field4398[0] * this.field4398[4] + var1.field4398[4] * this.field4398[5] + var1.field4398[12] * this.field4398[7]; // L: 174
		float var7 = var1.field4398[13] * this.field4398[7] + this.field4398[5] * var1.field4398[5] + this.field4398[4] * var1.field4398[1] + this.field4398[6] * var1.field4398[9]; // L: 175
		float var8 = var1.field4398[14] * this.field4398[7] + this.field4398[6] * var1.field4398[10] + this.field4398[4] * var1.field4398[2] + this.field4398[5] * var1.field4398[6]; // L: 176
		float var9 = this.field4398[7] * var1.field4398[15] + this.field4398[5] * var1.field4398[7] + this.field4398[4] * var1.field4398[3] + var1.field4398[11] * this.field4398[6]; // L: 177
		float var10 = var1.field4398[12] * this.field4398[11] + this.field4398[8] * var1.field4398[0] + this.field4398[9] * var1.field4398[4] + this.field4398[10] * var1.field4398[8]; // L: 178
		float var11 = var1.field4398[9] * this.field4398[10] + var1.field4398[1] * this.field4398[8] + this.field4398[9] * var1.field4398[5] + var1.field4398[13] * this.field4398[11]; // L: 179
		float var12 = this.field4398[8] * var1.field4398[2] + this.field4398[9] * var1.field4398[6] + this.field4398[10] * var1.field4398[10] + var1.field4398[14] * this.field4398[11]; // L: 180
		float var13 = this.field4398[9] * var1.field4398[7] + var1.field4398[3] * this.field4398[8] + var1.field4398[11] * this.field4398[10] + this.field4398[11] * var1.field4398[15]; // L: 181
		float var14 = this.field4398[15] * var1.field4398[12] + var1.field4398[4] * this.field4398[13] + var1.field4398[0] * this.field4398[12] + var1.field4398[8] * this.field4398[14]; // L: 182
		float var15 = var1.field4398[13] * this.field4398[15] + var1.field4398[5] * this.field4398[13] + var1.field4398[1] * this.field4398[12] + this.field4398[14] * var1.field4398[9]; // L: 183
		float var16 = var1.field4398[10] * this.field4398[14] + this.field4398[12] * var1.field4398[2] + var1.field4398[6] * this.field4398[13] + this.field4398[15] * var1.field4398[14]; // L: 184
		float var17 = this.field4398[13] * var1.field4398[7] + this.field4398[12] * var1.field4398[3] + this.field4398[14] * var1.field4398[11] + this.field4398[15] * var1.field4398[15]; // L: 185
		this.field4398[0] = var2; // L: 186
		this.field4398[1] = var3; // L: 187
		this.field4398[2] = var4; // L: 188
		this.field4398[3] = var5; // L: 189
		this.field4398[4] = var6; // L: 190
		this.field4398[5] = var7; // L: 191
		this.field4398[6] = var8; // L: 192
		this.field4398[7] = var9; // L: 193
		this.field4398[8] = var10; // L: 194
		this.field4398[9] = var11; // L: 195
		this.field4398[10] = var12; // L: 196
		this.field4398[11] = var13; // L: 197
		this.field4398[12] = var14; // L: 198
		this.field4398[13] = var15; // L: 199
		this.field4398[14] = var16; // L: 200
		this.field4398[15] = var17; // L: 201
	} // L: 202

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lni;I)V",
		garbageValue = "1375035939"
	)
	public void method6918(class387 var1) {
		float var2 = var1.field4396 * var1.field4396; // L: 205
		float var3 = var1.field4393 * var1.field4396; // L: 206
		float var4 = var1.field4396 * var1.field4395; // L: 207
		float var5 = var1.field4394 * var1.field4396; // L: 208
		float var6 = var1.field4393 * var1.field4393; // L: 209
		float var7 = var1.field4395 * var1.field4393; // L: 210
		float var8 = var1.field4394 * var1.field4393; // L: 211
		float var9 = var1.field4395 * var1.field4395; // L: 212
		float var10 = var1.field4394 * var1.field4395; // L: 213
		float var11 = var1.field4394 * var1.field4394; // L: 214
		this.field4398[0] = var6 + var2 - var11 - var9; // L: 215
		this.field4398[1] = var5 + var7 + var7 + var5; // L: 216
		this.field4398[2] = var8 - var4 - var4 + var8; // L: 217
		this.field4398[4] = var7 - var5 - var5 + var7; // L: 218
		this.field4398[5] = var2 + var9 - var6 - var11; // L: 219
		this.field4398[6] = var3 + var10 + var10 + var3; // L: 220
		this.field4398[8] = var8 + var4 + var8 + var4; // L: 221
		this.field4398[9] = var10 + (var10 - var3 - var3); // L: 222
		this.field4398[10] = var11 + var2 - var9 - var6; // L: 223
	} // L: 224

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lnq;B)V",
		garbageValue = "0"
	)
	void method6932(class389 var1) {
		this.field4398[0] = var1.field4404; // L: 227
		this.field4398[1] = var1.field4405; // L: 228
		this.field4398[2] = var1.field4406; // L: 229
		this.field4398[3] = 0.0F; // L: 230
		this.field4398[4] = var1.field4407; // L: 231
		this.field4398[5] = var1.field4413; // L: 232
		this.field4398[6] = var1.field4409; // L: 233
		this.field4398[7] = 0.0F; // L: 234
		this.field4398[8] = var1.field4410; // L: 235
		this.field4398[9] = var1.field4411; // L: 236
		this.field4398[10] = var1.field4416; // L: 237
		this.field4398[11] = 0.0F; // L: 238
		this.field4398[12] = var1.field4412; // L: 239
		this.field4398[13] = var1.field4414; // L: 240
		this.field4398[14] = var1.field4415; // L: 241
		this.field4398[15] = 1.0F; // L: 242
	} // L: 243

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "979401559"
	)
	float method6921() {
		return this.field4398[9] * this.field4398[3] * this.field4398[6] * this.field4398[12] + (this.field4398[13] * this.field4398[10] * this.field4398[4] * this.field4398[3] + (this.field4398[12] * this.field4398[11] * this.field4398[5] * this.field4398[2] + (this.field4398[15] * this.field4398[4] * this.field4398[2] * this.field4398[9] + this.field4398[12] * this.field4398[1] * this.field4398[7] * this.field4398[10] + (this.field4398[8] * this.field4398[1] * this.field4398[6] * this.field4398[15] + this.field4398[14] * this.field4398[9] * this.field4398[7] * this.field4398[0] + this.field4398[10] * this.field4398[5] * this.field4398[0] * this.field4398[15] - this.field4398[5] * this.field4398[0] * this.field4398[11] * this.field4398[14] - this.field4398[6] * this.field4398[0] * this.field4398[9] * this.field4398[15] + this.field4398[13] * this.field4398[11] * this.field4398[0] * this.field4398[6] - this.field4398[13] * this.field4398[7] * this.field4398[0] * this.field4398[10] - this.field4398[10] * this.field4398[4] * this.field4398[1] * this.field4398[15] + this.field4398[4] * this.field4398[1] * this.field4398[11] * this.field4398[14] - this.field4398[1] * this.field4398[6] * this.field4398[11] * this.field4398[12] - this.field4398[14] * this.field4398[8] * this.field4398[7] * this.field4398[1]) - this.field4398[4] * this.field4398[2] * this.field4398[11] * this.field4398[13] - this.field4398[15] * this.field4398[8] * this.field4398[5] * this.field4398[2]) + this.field4398[2] * this.field4398[7] * this.field4398[8] * this.field4398[13] - this.field4398[9] * this.field4398[7] * this.field4398[2] * this.field4398[12] - this.field4398[14] * this.field4398[3] * this.field4398[4] * this.field4398[9]) + this.field4398[14] * this.field4398[5] * this.field4398[3] * this.field4398[8] - this.field4398[12] * this.field4398[5] * this.field4398[3] * this.field4398[10] - this.field4398[13] * this.field4398[6] * this.field4398[3] * this.field4398[8]); // L: 246
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-43"
	)
	public void method6922() {
		float var1 = 1.0F / this.method6921(); // L: 250
		float var2 = var1 * (this.field4398[15] * this.field4398[5] * this.field4398[10] - this.field4398[5] * this.field4398[11] * this.field4398[14] - this.field4398[6] * this.field4398[9] * this.field4398[15] + this.field4398[6] * this.field4398[11] * this.field4398[13] + this.field4398[14] * this.field4398[7] * this.field4398[9] - this.field4398[13] * this.field4398[10] * this.field4398[7]); // L: 251
		float var3 = var1 * (this.field4398[10] * this.field4398[3] * this.field4398[13] + (this.field4398[9] * this.field4398[2] * this.field4398[15] + this.field4398[15] * -this.field4398[1] * this.field4398[10] + this.field4398[14] * this.field4398[1] * this.field4398[11] - this.field4398[11] * this.field4398[2] * this.field4398[13] - this.field4398[14] * this.field4398[9] * this.field4398[3])); // L: 252
		float var4 = (this.field4398[6] * this.field4398[1] * this.field4398[15] - this.field4398[7] * this.field4398[1] * this.field4398[14] - this.field4398[2] * this.field4398[5] * this.field4398[15] + this.field4398[13] * this.field4398[2] * this.field4398[7] + this.field4398[14] * this.field4398[5] * this.field4398[3] - this.field4398[13] * this.field4398[6] * this.field4398[3]) * var1; // L: 253
		float var5 = var1 * (this.field4398[9] * this.field4398[3] * this.field4398[6] + (this.field4398[11] * this.field4398[2] * this.field4398[5] + this.field4398[11] * -this.field4398[1] * this.field4398[6] + this.field4398[7] * this.field4398[1] * this.field4398[10] - this.field4398[2] * this.field4398[7] * this.field4398[9] - this.field4398[5] * this.field4398[3] * this.field4398[10])); // L: 254
		float var6 = var1 * (this.field4398[15] * this.field4398[6] * this.field4398[8] + this.field4398[14] * this.field4398[11] * this.field4398[4] + this.field4398[15] * this.field4398[10] * -this.field4398[4] - this.field4398[12] * this.field4398[6] * this.field4398[11] - this.field4398[14] * this.field4398[7] * this.field4398[8] + this.field4398[7] * this.field4398[10] * this.field4398[12]); // L: 255
		float var7 = var1 * (this.field4398[14] * this.field4398[3] * this.field4398[8] + this.field4398[15] * this.field4398[10] * this.field4398[0] - this.field4398[14] * this.field4398[0] * this.field4398[11] - this.field4398[15] * this.field4398[2] * this.field4398[8] + this.field4398[11] * this.field4398[2] * this.field4398[12] - this.field4398[3] * this.field4398[10] * this.field4398[12]); // L: 256
		float var8 = var1 * (this.field4398[4] * this.field4398[2] * this.field4398[15] + this.field4398[15] * -this.field4398[0] * this.field4398[6] + this.field4398[7] * this.field4398[0] * this.field4398[14] - this.field4398[7] * this.field4398[2] * this.field4398[12] - this.field4398[3] * this.field4398[4] * this.field4398[14] + this.field4398[12] * this.field4398[3] * this.field4398[6]); // L: 257
		float var9 = (this.field4398[7] * this.field4398[2] * this.field4398[8] + (this.field4398[11] * this.field4398[0] * this.field4398[6] - this.field4398[10] * this.field4398[0] * this.field4398[7] - this.field4398[4] * this.field4398[2] * this.field4398[11]) + this.field4398[10] * this.field4398[4] * this.field4398[3] - this.field4398[8] * this.field4398[3] * this.field4398[6]) * var1; // L: 258
		float var10 = var1 * (this.field4398[5] * this.field4398[11] * this.field4398[12] + (this.field4398[15] * this.field4398[9] * this.field4398[4] - this.field4398[4] * this.field4398[11] * this.field4398[13] - this.field4398[15] * this.field4398[8] * this.field4398[5]) + this.field4398[13] * this.field4398[8] * this.field4398[7] - this.field4398[9] * this.field4398[7] * this.field4398[12]); // L: 259
		float var11 = var1 * (this.field4398[15] * -this.field4398[0] * this.field4398[9] + this.field4398[0] * this.field4398[11] * this.field4398[13] + this.field4398[8] * this.field4398[1] * this.field4398[15] - this.field4398[1] * this.field4398[11] * this.field4398[12] - this.field4398[3] * this.field4398[8] * this.field4398[13] + this.field4398[9] * this.field4398[3] * this.field4398[12]); // L: 260
		float var12 = (this.field4398[0] * this.field4398[5] * this.field4398[15] - this.field4398[13] * this.field4398[0] * this.field4398[7] - this.field4398[15] * this.field4398[4] * this.field4398[1] + this.field4398[12] * this.field4398[1] * this.field4398[7] + this.field4398[3] * this.field4398[4] * this.field4398[13] - this.field4398[12] * this.field4398[5] * this.field4398[3]) * var1; // L: 261
		float var13 = (this.field4398[8] * this.field4398[5] * this.field4398[3] + (this.field4398[4] * this.field4398[1] * this.field4398[11] + this.field4398[5] * -this.field4398[0] * this.field4398[11] + this.field4398[9] * this.field4398[0] * this.field4398[7] - this.field4398[8] * this.field4398[1] * this.field4398[7] - this.field4398[3] * this.field4398[4] * this.field4398[9])) * var1; // L: 262
		float var14 = (this.field4398[9] * this.field4398[6] * this.field4398[12] + (this.field4398[4] * this.field4398[10] * this.field4398[13] + this.field4398[9] * -this.field4398[4] * this.field4398[14] + this.field4398[14] * this.field4398[5] * this.field4398[8] - this.field4398[12] * this.field4398[10] * this.field4398[5] - this.field4398[6] * this.field4398[8] * this.field4398[13])) * var1; // L: 263
		float var15 = (this.field4398[2] * this.field4398[8] * this.field4398[13] + this.field4398[12] * this.field4398[10] * this.field4398[1] + (this.field4398[9] * this.field4398[0] * this.field4398[14] - this.field4398[13] * this.field4398[10] * this.field4398[0] - this.field4398[8] * this.field4398[1] * this.field4398[14]) - this.field4398[12] * this.field4398[9] * this.field4398[2]) * var1; // L: 264
		float var16 = (this.field4398[13] * this.field4398[6] * this.field4398[0] + this.field4398[14] * -this.field4398[0] * this.field4398[5] + this.field4398[4] * this.field4398[1] * this.field4398[14] - this.field4398[12] * this.field4398[6] * this.field4398[1] - this.field4398[13] * this.field4398[4] * this.field4398[2] + this.field4398[12] * this.field4398[5] * this.field4398[2]) * var1; // L: 265
		float var17 = (this.field4398[9] * this.field4398[2] * this.field4398[4] + this.field4398[1] * this.field4398[6] * this.field4398[8] + (this.field4398[10] * this.field4398[5] * this.field4398[0] - this.field4398[9] * this.field4398[0] * this.field4398[6] - this.field4398[1] * this.field4398[4] * this.field4398[10]) - this.field4398[8] * this.field4398[2] * this.field4398[5]) * var1; // L: 266
		this.field4398[0] = var2; // L: 267
		this.field4398[1] = var3; // L: 268
		this.field4398[2] = var4; // L: 269
		this.field4398[3] = var5; // L: 270
		this.field4398[4] = var6; // L: 271
		this.field4398[5] = var7; // L: 272
		this.field4398[6] = var8; // L: 273
		this.field4398[7] = var9; // L: 274
		this.field4398[8] = var10; // L: 275
		this.field4398[9] = var11; // L: 276
		this.field4398[10] = var12; // L: 277
		this.field4398[11] = var13; // L: 278
		this.field4398[12] = var14; // L: 279
		this.field4398[13] = var15; // L: 280
		this.field4398[14] = var16; // L: 281
		this.field4398[15] = var17; // L: 282
	} // L: 283

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "-413026526"
	)
	public float[] method6924() {
		float[] var1 = new float[3]; // L: 320
		class386 var2 = new class386(this.field4398[0], this.field4398[1], this.field4398[2]); // L: 321
		class386 var3 = new class386(this.field4398[4], this.field4398[5], this.field4398[6]); // L: 322
		class386 var4 = new class386(this.field4398[8], this.field4398[9], this.field4398[10]); // L: 323
		var1[0] = var2.method6874(); // L: 324
		var1[1] = var3.method6874(); // L: 325
		var1[2] = var4.method6874(); // L: 326
		return var1; // L: 327
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class388)) { // L: 313
			return false;
		} else {
			class388 var2 = (class388)var1; // L: 314

			for (int var3 = 0; var3 < 16; ++var3) { // L: 315
				if (this.field4398[var3] != var2.field4398[var3]) {
					return false;
				}
			}

			return true; // L: 316
		}
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder(); // L: 288
		this.method6913(); // L: 289
		this.method6912(); // L: 290

		for (int var2 = 0; var2 < 4; ++var2) { // L: 291
			for (int var3 = 0; var3 < 4; ++var3) { // L: 292
				if (var3 > 0) {
					var1.append("\t"); // L: 293
				}

				float var4 = this.field4398[var3 + var2 * 4]; // L: 294
				if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5D) { // L: 295
					var4 = 0.0F;
				}

				var1.append(var4); // L: 296
			}

			var1.append("\n"); // L: 298
		}

		return var1.toString(); // L: 300
	}

	public int hashCode() {
		boolean var1 = true; // L: 305
		byte var2 = 1; // L: 306
		int var3 = var2 * 31 + Arrays.hashCode(this.field4398); // L: 307
		return var3; // L: 308
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgm;",
		garbageValue = "-22"
	)
	@Export("StructDefinition_getStructDefinition")
	public static StructComposition StructDefinition_getStructDefinition(int var0) {
		StructComposition var1 = (StructComposition)StructComposition.StructDefinition_cached.get((long)var0); // L: 19
		if (var1 != null) { // L: 20
			return var1;
		} else {
			byte[] var2 = StructComposition.StructDefinition_archive.takeFile(34, var0); // L: 21
			var1 = new StructComposition(); // L: 22
			if (var2 != null) { // L: 23
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 24
			StructComposition.StructDefinition_cached.put(var1, (long)var0); // L: 25
			return var1; // L: 26
		}
	}
}
