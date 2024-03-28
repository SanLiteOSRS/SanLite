import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sq")
public final class class470 {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lsq;"
	)
	static class470[] field4870;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1954864157
	)
	static int field4875;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lsq;"
	)
	public static final class470 field4873;
	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	static Archive field4874;
	@ObfuscatedName("an")
	public float[] field4872;

	static {
		field4870 = new class470[0]; // L: 9
		class225.method4274(100); // L: 14
		field4873 = new class470(); // L: 18
	}

	public class470() {
		this.field4872 = new float[16];
		this.method8418(); // L: 43
	} // L: 44

	@ObfuscatedSignature(
		descriptor = "(Lsq;)V"
	)
	public class470(class470 var1) {
		this.field4872 = new float[16];
		this.method8411(var1); // L: 47
	} // L: 48

	@ObfuscatedSignature(
		descriptor = "(Lur;Z)V"
	)
	public class470(Buffer var1, boolean var2) {
		this.field4872 = new float[16]; // L: 17
		this.method8407(var1, var2); // L: 51
	} // L: 52

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "22"
	)
	public void method8460() {
		synchronized(field4870) { // L: 37
			if (ByteArrayPool.field4688 < field4875 - 1) { // L: 38
				field4870[++ByteArrayPool.field4688 - 1] = this;
			}

		}
	} // L: 40

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lur;ZI)V",
		garbageValue = "-625842354"
	)
	void method8407(Buffer var1, boolean var2) {
		if (var2) { // L: 55
			class471 var13 = new class471(); // L: 56
			int var6 = var1.readShort(); // L: 59
			var6 &= 16383; // L: 61
			float var5 = (float)((double)((float)var6 / 16384.0F) * 6.283185307179586D); // L: 62
			var13.method8469(var5); // L: 64
			int var9 = var1.readShort(); // L: 67
			var9 &= 16383; // L: 69
			float var8 = (float)((double)((float)var9 / 16384.0F) * 6.283185307179586D); // L: 70
			var13.method8479(var8); // L: 72
			int var12 = var1.readShort(); // L: 75
			var12 &= 16383; // L: 77
			float var11 = (float)(6.283185307179586D * (double)((float)var12 / 16384.0F)); // L: 78
			var13.method8471(var11); // L: 80
			var13.method8472((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort()); // L: 81
			this.method8446(var13); // L: 82
		} else {
			for (int var3 = 0; var3 < 16; ++var3) { // L: 85
				this.field4872[var3] = var1.method9273(); // L: 86
			}
		}

	} // L: 89

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "-41"
	)
	float[] method8447() {
		float[] var1 = new float[3]; // L: 92
		if ((double)this.field4872[2] < 0.999D && (double)this.field4872[2] > -0.999D) { // L: 93
			var1[1] = (float)(-Math.asin((double)this.field4872[2])); // L: 94
			double var2 = Math.cos((double)var1[1]); // L: 95
			var1[0] = (float)Math.atan2((double)this.field4872[6] / var2, (double)this.field4872[10] / var2); // L: 96
			var1[2] = (float)Math.atan2((double)this.field4872[1] / var2, (double)this.field4872[0] / var2); // L: 97
		} else {
			var1[0] = 0.0F; // L: 100
			var1[1] = (float)Math.atan2((double)this.field4872[2], 0.0D); // L: 101
			var1[2] = (float)Math.atan2((double)(-this.field4872[9]), (double)this.field4872[5]); // L: 102
		}

		return var1; // L: 104
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "2"
	)
	public float[] method8409() {
		float[] var1 = new float[]{(float)(-Math.asin((double)this.field4872[6])), 0.0F, 0.0F}; // L: 108 109
		double var2 = Math.cos((double)var1[0]); // L: 110
		double var4;
		double var6;
		if (Math.abs(var2) > 0.005D) { // L: 111
			var4 = (double)this.field4872[2]; // L: 112
			var6 = (double)this.field4872[10]; // L: 113
			double var8 = (double)this.field4872[4]; // L: 114
			double var10 = (double)this.field4872[5]; // L: 115
			var1[1] = (float)Math.atan2(var4, var6); // L: 116
			var1[2] = (float)Math.atan2(var8, var10); // L: 117
		} else {
			var4 = (double)this.field4872[1]; // L: 120
			var6 = (double)this.field4872[0]; // L: 121
			if (this.field4872[6] < 0.0F) { // L: 122
				var1[1] = (float)Math.atan2(var4, var6); // L: 123
			} else {
				var1[1] = (float)(-Math.atan2(var4, var6)); // L: 126
			}

			var1[2] = 0.0F; // L: 128
		}

		return var1; // L: 130
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-510350437"
	)
	void method8418() {
		this.field4872[0] = 1.0F; // L: 134
		this.field4872[1] = 0.0F; // L: 135
		this.field4872[2] = 0.0F; // L: 136
		this.field4872[3] = 0.0F; // L: 137
		this.field4872[4] = 0.0F; // L: 138
		this.field4872[5] = 1.0F; // L: 139
		this.field4872[6] = 0.0F; // L: 140
		this.field4872[7] = 0.0F; // L: 141
		this.field4872[8] = 0.0F; // L: 142
		this.field4872[9] = 0.0F;
		this.field4872[10] = 1.0F;
		this.field4872[11] = 0.0F;
		this.field4872[12] = 0.0F;
		this.field4872[13] = 0.0F; // L: 147
		this.field4872[14] = 0.0F;
		this.field4872[15] = 1.0F;
	} // L: 150

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1776603414"
	)
	public void method8435() {
		this.field4872[0] = 0.0F; // L: 153
		this.field4872[1] = 0.0F; // L: 154
		this.field4872[2] = 0.0F; // L: 155
		this.field4872[3] = 0.0F; // L: 156
		this.field4872[4] = 0.0F; // L: 157
		this.field4872[5] = 0.0F; // L: 158
		this.field4872[6] = 0.0F; // L: 159
		this.field4872[7] = 0.0F; // L: 160
		this.field4872[8] = 0.0F; // L: 161
		this.field4872[9] = 0.0F; // L: 162
		this.field4872[10] = 0.0F; // L: 163
		this.field4872[11] = 0.0F; // L: 164
		this.field4872[12] = 0.0F; // L: 165
		this.field4872[13] = 0.0F; // L: 166
		this.field4872[14] = 0.0F; // L: 167
		this.field4872[15] = 0.0F; // L: 168
	} // L: 169

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lsq;B)V",
		garbageValue = "-34"
	)
	public void method8411(class470 var1) {
		System.arraycopy(var1.field4872, 0, this.field4872, 0, 16); // L: 172
	} // L: 173

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "10"
	)
	public void method8406(float var1) {
		this.method8410(var1, var1, var1); // L: 176
	} // L: 177

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "-1913355271"
	)
	public void method8410(float var1, float var2, float var3) {
		this.method8418(); // L: 180
		this.field4872[0] = var1; // L: 181
		this.field4872[5] = var2; // L: 182
		this.field4872[10] = var3; // L: 183
	} // L: 184

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lsq;B)V",
		garbageValue = "-114"
	)
	public void method8413(class470 var1) {
		for (int var2 = 0; var2 < this.field4872.length; ++var2) { // L: 187
			float[] var10000 = this.field4872; // L: 188
			var10000[var2] += var1.field4872[var2];
		}

	} // L: 190

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lsq;B)V",
		garbageValue = "-127"
	)
	public void method8414(class470 var1) {
		float var2 = this.field4872[2] * var1.field4872[8] + this.field4872[1] * var1.field4872[4] + this.field4872[0] * var1.field4872[0] + this.field4872[3] * var1.field4872[12]; // L: 193
		float var3 = var1.field4872[5] * this.field4872[1] + this.field4872[0] * var1.field4872[1] + this.field4872[2] * var1.field4872[9] + this.field4872[3] * var1.field4872[13]; // L: 194
		float var4 = var1.field4872[6] * this.field4872[1] + this.field4872[0] * var1.field4872[2] + this.field4872[2] * var1.field4872[10] + this.field4872[3] * var1.field4872[14]; // L: 195
		float var5 = var1.field4872[11] * this.field4872[2] + var1.field4872[3] * this.field4872[0] + var1.field4872[7] * this.field4872[1] + var1.field4872[15] * this.field4872[3]; // L: 196
		float var6 = this.field4872[6] * var1.field4872[8] + this.field4872[4] * var1.field4872[0] + var1.field4872[4] * this.field4872[5] + var1.field4872[12] * this.field4872[7]; // L: 197
		float var7 = this.field4872[7] * var1.field4872[13] + this.field4872[6] * var1.field4872[9] + this.field4872[5] * var1.field4872[5] + var1.field4872[1] * this.field4872[4]; // L: 198
		float var8 = this.field4872[6] * var1.field4872[10] + this.field4872[5] * var1.field4872[6] + var1.field4872[2] * this.field4872[4] + this.field4872[7] * var1.field4872[14]; // L: 199
		float var9 = this.field4872[5] * var1.field4872[7] + var1.field4872[3] * this.field4872[4] + this.field4872[6] * var1.field4872[11] + this.field4872[7] * var1.field4872[15]; // L: 200
		float var10 = var1.field4872[4] * this.field4872[9] + this.field4872[8] * var1.field4872[0] + this.field4872[10] * var1.field4872[8] + this.field4872[11] * var1.field4872[12]; // L: 201
		float var11 = this.field4872[9] * var1.field4872[5] + this.field4872[8] * var1.field4872[1] + var1.field4872[9] * this.field4872[10] + var1.field4872[13] * this.field4872[11]; // L: 202
		float var12 = var1.field4872[14] * this.field4872[11] + this.field4872[9] * var1.field4872[6] + this.field4872[8] * var1.field4872[2] + this.field4872[10] * var1.field4872[10]; // L: 203
		float var13 = this.field4872[11] * var1.field4872[15] + this.field4872[9] * var1.field4872[7] + var1.field4872[3] * this.field4872[8] + var1.field4872[11] * this.field4872[10]; // L: 204
		float var14 = this.field4872[15] * var1.field4872[12] + var1.field4872[4] * this.field4872[13] + this.field4872[12] * var1.field4872[0] + this.field4872[14] * var1.field4872[8]; // L: 205
		float var15 = this.field4872[14] * var1.field4872[9] + this.field4872[12] * var1.field4872[1] + this.field4872[13] * var1.field4872[5] + var1.field4872[13] * this.field4872[15]; // L: 206
		float var16 = this.field4872[12] * var1.field4872[2] + var1.field4872[6] * this.field4872[13] + this.field4872[14] * var1.field4872[10] + this.field4872[15] * var1.field4872[14]; // L: 207
		float var17 = this.field4872[12] * var1.field4872[3] + var1.field4872[7] * this.field4872[13] + var1.field4872[11] * this.field4872[14] + this.field4872[15] * var1.field4872[15]; // L: 208
		this.field4872[0] = var2; // L: 209
		this.field4872[1] = var3; // L: 210
		this.field4872[2] = var4; // L: 211
		this.field4872[3] = var5; // L: 212
		this.field4872[4] = var6; // L: 213
		this.field4872[5] = var7; // L: 214
		this.field4872[6] = var8; // L: 215
		this.field4872[7] = var9; // L: 216
		this.field4872[8] = var10; // L: 217
		this.field4872[9] = var11; // L: 218
		this.field4872[10] = var12; // L: 219
		this.field4872[11] = var13; // L: 220
		this.field4872[12] = var14; // L: 221
		this.field4872[13] = var15; // L: 222
		this.field4872[14] = var16; // L: 223
		this.field4872[15] = var17; // L: 224
	} // L: 225

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lsh;I)V",
		garbageValue = "-774219799"
	)
	public void method8432(class469 var1) {
		float var2 = var1.field4867 * var1.field4867; // L: 228
		float var3 = var1.field4863 * var1.field4867; // L: 229
		float var4 = var1.field4865 * var1.field4867; // L: 230
		float var5 = var1.field4864 * var1.field4867; // L: 231
		float var6 = var1.field4863 * var1.field4863; // L: 232
		float var7 = var1.field4863 * var1.field4865; // L: 233
		float var8 = var1.field4863 * var1.field4864; // L: 234
		float var9 = var1.field4865 * var1.field4865; // L: 235
		float var10 = var1.field4864 * var1.field4865; // L: 236
		float var11 = var1.field4864 * var1.field4864; // L: 237
		this.field4872[0] = var2 + var6 - var11 - var9; // L: 238
		this.field4872[1] = var5 + var7 + var7 + var5; // L: 239
		this.field4872[2] = var8 + (var8 - var4 - var4); // L: 240
		this.field4872[4] = var7 - var5 - var5 + var7; // L: 241
		this.field4872[5] = var9 + var2 - var6 - var11; // L: 242
		this.field4872[6] = var3 + var3 + var10 + var10; // L: 243
		this.field4872[8] = var4 + var8 + var4 + var8; // L: 244
		this.field4872[9] = var10 + (var10 - var3 - var3); // L: 245
		this.field4872[10] = var2 + var11 - var9 - var6; // L: 246
	} // L: 247

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lsy;B)V",
		garbageValue = "82"
	)
	void method8446(class471 var1) {
		this.field4872[0] = var1.field4884; // L: 250
		this.field4872[1] = var1.field4879; // L: 251
		this.field4872[2] = var1.field4878; // L: 252
		this.field4872[3] = 0.0F; // L: 253
		this.field4872[4] = var1.field4883; // L: 254
		this.field4872[5] = var1.field4880; // L: 255
		this.field4872[6] = var1.field4881; // L: 256
		this.field4872[7] = 0.0F; // L: 257
		this.field4872[8] = var1.field4882; // L: 258
		this.field4872[9] = var1.field4876; // L: 259
		this.field4872[10] = var1.field4877; // L: 260
		this.field4872[11] = 0.0F; // L: 261
		this.field4872[12] = var1.field4885; // L: 262
		this.field4872[13] = var1.field4886; // L: 263
		this.field4872[14] = var1.field4887; // L: 264
		this.field4872[15] = 1.0F; // L: 265
	} // L: 266

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "-987223281"
	)
	float method8417() {
		return this.field4872[9] * this.field4872[6] * this.field4872[3] * this.field4872[12] + (this.field4872[10] * this.field4872[4] * this.field4872[3] * this.field4872[13] + (this.field4872[13] * this.field4872[8] * this.field4872[7] * this.field4872[2] + this.field4872[9] * this.field4872[4] * this.field4872[2] * this.field4872[15] + this.field4872[7] * this.field4872[1] * this.field4872[10] * this.field4872[12] + (this.field4872[8] * this.field4872[6] * this.field4872[1] * this.field4872[15] + this.field4872[11] * this.field4872[4] * this.field4872[1] * this.field4872[14] + (this.field4872[9] * this.field4872[7] * this.field4872[0] * this.field4872[14] + this.field4872[13] * this.field4872[6] * this.field4872[0] * this.field4872[11] + (this.field4872[15] * this.field4872[0] * this.field4872[5] * this.field4872[10] - this.field4872[5] * this.field4872[0] * this.field4872[11] * this.field4872[14] - this.field4872[9] * this.field4872[0] * this.field4872[6] * this.field4872[15]) - this.field4872[7] * this.field4872[0] * this.field4872[10] * this.field4872[13] - this.field4872[10] * this.field4872[4] * this.field4872[1] * this.field4872[15]) - this.field4872[1] * this.field4872[6] * this.field4872[11] * this.field4872[12] - this.field4872[14] * this.field4872[8] * this.field4872[7] * this.field4872[1]) - this.field4872[13] * this.field4872[11] * this.field4872[4] * this.field4872[2] - this.field4872[15] * this.field4872[8] * this.field4872[2] * this.field4872[5] + this.field4872[5] * this.field4872[2] * this.field4872[11] * this.field4872[12] - this.field4872[12] * this.field4872[9] * this.field4872[2] * this.field4872[7] - this.field4872[14] * this.field4872[9] * this.field4872[4] * this.field4872[3]) + this.field4872[14] * this.field4872[8] * this.field4872[5] * this.field4872[3] - this.field4872[10] * this.field4872[5] * this.field4872[3] * this.field4872[12] - this.field4872[13] * this.field4872[3] * this.field4872[6] * this.field4872[8]); // L: 269
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "66"
	)
	public void method8445() {
		float var1 = 1.0F / this.method8417(); // L: 273
		float var2 = (this.field4872[6] * this.field4872[11] * this.field4872[13] + (this.field4872[5] * this.field4872[10] * this.field4872[15] - this.field4872[11] * this.field4872[5] * this.field4872[14] - this.field4872[15] * this.field4872[6] * this.field4872[9]) + this.field4872[14] * this.field4872[7] * this.field4872[9] - this.field4872[7] * this.field4872[10] * this.field4872[13]) * var1; // L: 274
		float var3 = (this.field4872[2] * this.field4872[9] * this.field4872[15] + this.field4872[10] * -this.field4872[1] * this.field4872[15] + this.field4872[14] * this.field4872[11] * this.field4872[1] - this.field4872[2] * this.field4872[11] * this.field4872[13] - this.field4872[3] * this.field4872[9] * this.field4872[14] + this.field4872[10] * this.field4872[3] * this.field4872[13]) * var1; // L: 275
		float var4 = (this.field4872[6] * this.field4872[1] * this.field4872[15] - this.field4872[14] * this.field4872[7] * this.field4872[1] - this.field4872[15] * this.field4872[5] * this.field4872[2] + this.field4872[13] * this.field4872[7] * this.field4872[2] + this.field4872[3] * this.field4872[5] * this.field4872[14] - this.field4872[3] * this.field4872[6] * this.field4872[13]) * var1; // L: 276
		float var5 = (this.field4872[9] * this.field4872[6] * this.field4872[3] + (this.field4872[11] * this.field4872[2] * this.field4872[5] + -this.field4872[1] * this.field4872[6] * this.field4872[11] + this.field4872[10] * this.field4872[7] * this.field4872[1] - this.field4872[9] * this.field4872[7] * this.field4872[2] - this.field4872[10] * this.field4872[5] * this.field4872[3])) * var1; // L: 277
		float var6 = var1 * (this.field4872[12] * this.field4872[7] * this.field4872[10] + (this.field4872[15] * this.field4872[6] * this.field4872[8] + this.field4872[14] * this.field4872[11] * this.field4872[4] + this.field4872[10] * -this.field4872[4] * this.field4872[15] - this.field4872[12] * this.field4872[6] * this.field4872[11] - this.field4872[14] * this.field4872[7] * this.field4872[8])); // L: 278
		float var7 = var1 * (this.field4872[15] * this.field4872[0] * this.field4872[10] - this.field4872[14] * this.field4872[0] * this.field4872[11] - this.field4872[8] * this.field4872[2] * this.field4872[15] + this.field4872[12] * this.field4872[2] * this.field4872[11] + this.field4872[3] * this.field4872[8] * this.field4872[14] - this.field4872[12] * this.field4872[3] * this.field4872[10]); // L: 279
		float var8 = var1 * (this.field4872[12] * this.field4872[3] * this.field4872[6] + (this.field4872[15] * this.field4872[2] * this.field4872[4] + this.field4872[14] * this.field4872[0] * this.field4872[7] + this.field4872[15] * -this.field4872[0] * this.field4872[6] - this.field4872[2] * this.field4872[7] * this.field4872[12] - this.field4872[4] * this.field4872[3] * this.field4872[14])); // L: 280
		float var9 = var1 * (this.field4872[4] * this.field4872[3] * this.field4872[10] + this.field4872[8] * this.field4872[7] * this.field4872[2] + (this.field4872[0] * this.field4872[6] * this.field4872[11] - this.field4872[10] * this.field4872[7] * this.field4872[0] - this.field4872[11] * this.field4872[4] * this.field4872[2]) - this.field4872[8] * this.field4872[3] * this.field4872[6]); // L: 281
		float var10 = var1 * (this.field4872[9] * this.field4872[4] * this.field4872[15] - this.field4872[4] * this.field4872[11] * this.field4872[13] - this.field4872[8] * this.field4872[5] * this.field4872[15] + this.field4872[12] * this.field4872[11] * this.field4872[5] + this.field4872[13] * this.field4872[7] * this.field4872[8] - this.field4872[12] * this.field4872[7] * this.field4872[9]); // L: 282
		float var11 = var1 * (this.field4872[11] * this.field4872[0] * this.field4872[13] + this.field4872[15] * this.field4872[9] * -this.field4872[0] + this.field4872[1] * this.field4872[8] * this.field4872[15] - this.field4872[12] * this.field4872[11] * this.field4872[1] - this.field4872[3] * this.field4872[8] * this.field4872[13] + this.field4872[9] * this.field4872[3] * this.field4872[12]); // L: 283
		float var12 = (this.field4872[0] * this.field4872[5] * this.field4872[15] - this.field4872[13] * this.field4872[7] * this.field4872[0] - this.field4872[15] * this.field4872[4] * this.field4872[1] + this.field4872[7] * this.field4872[1] * this.field4872[12] + this.field4872[13] * this.field4872[4] * this.field4872[3] - this.field4872[5] * this.field4872[3] * this.field4872[12]) * var1; // L: 284
		float var13 = var1 * (this.field4872[0] * this.field4872[7] * this.field4872[9] + this.field4872[11] * -this.field4872[0] * this.field4872[5] + this.field4872[11] * this.field4872[4] * this.field4872[1] - this.field4872[1] * this.field4872[7] * this.field4872[8] - this.field4872[3] * this.field4872[4] * this.field4872[9] + this.field4872[5] * this.field4872[3] * this.field4872[8]); // L: 285
		float var14 = (this.field4872[12] * this.field4872[6] * this.field4872[9] + (this.field4872[14] * this.field4872[5] * this.field4872[8] + this.field4872[4] * this.field4872[10] * this.field4872[13] + this.field4872[14] * -this.field4872[4] * this.field4872[9] - this.field4872[12] * this.field4872[10] * this.field4872[5] - this.field4872[8] * this.field4872[6] * this.field4872[13])) * var1; // L: 286
		float var15 = var1 * (this.field4872[2] * this.field4872[8] * this.field4872[13] + this.field4872[10] * this.field4872[1] * this.field4872[12] + (this.field4872[14] * this.field4872[0] * this.field4872[9] - this.field4872[10] * this.field4872[0] * this.field4872[13] - this.field4872[14] * this.field4872[8] * this.field4872[1]) - this.field4872[2] * this.field4872[9] * this.field4872[12]); // L: 287
		float var16 = var1 * (this.field4872[14] * this.field4872[4] * this.field4872[1] + this.field4872[13] * this.field4872[6] * this.field4872[0] + -this.field4872[0] * this.field4872[5] * this.field4872[14] - this.field4872[12] * this.field4872[1] * this.field4872[6] - this.field4872[4] * this.field4872[2] * this.field4872[13] + this.field4872[5] * this.field4872[2] * this.field4872[12]); // L: 288
		float var17 = (this.field4872[4] * this.field4872[2] * this.field4872[9] + this.field4872[10] * this.field4872[5] * this.field4872[0] - this.field4872[0] * this.field4872[6] * this.field4872[9] - this.field4872[4] * this.field4872[1] * this.field4872[10] + this.field4872[6] * this.field4872[1] * this.field4872[8] - this.field4872[8] * this.field4872[2] * this.field4872[5]) * var1; // L: 289
		this.field4872[0] = var2; // L: 290
		this.field4872[1] = var3; // L: 291
		this.field4872[2] = var4; // L: 292
		this.field4872[3] = var5; // L: 293
		this.field4872[4] = var6; // L: 294
		this.field4872[5] = var7; // L: 295
		this.field4872[6] = var8; // L: 296
		this.field4872[7] = var9; // L: 297
		this.field4872[8] = var10; // L: 298
		this.field4872[9] = var11; // L: 299
		this.field4872[10] = var12; // L: 300
		this.field4872[11] = var13; // L: 301
		this.field4872[12] = var14; // L: 302
		this.field4872[13] = var15; // L: 303
		this.field4872[14] = var16; // L: 304
		this.field4872[15] = var17; // L: 305
	} // L: 306

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "-1357026188"
	)
	public float[] method8420() {
		float[] var1 = new float[3]; // L: 343
		class468 var2 = new class468(this.field4872[0], this.field4872[1], this.field4872[2]); // L: 344
		class468 var3 = new class468(this.field4872[4], this.field4872[5], this.field4872[6]); // L: 345
		class468 var4 = new class468(this.field4872[8], this.field4872[9], this.field4872[10]); // L: 346
		var1[0] = var2.method8372(); // L: 347
		var1[1] = var3.method8372(); // L: 348
		var1[2] = var4.method8372(); // L: 349
		return var1; // L: 350
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder(); // L: 311
		this.method8409(); // L: 312
		this.method8447(); // L: 313

		for (int var2 = 0; var2 < 4; ++var2) { // L: 314
			for (int var3 = 0; var3 < 4; ++var3) { // L: 315
				if (var3 > 0) {
					var1.append("\t"); // L: 316
				}

				float var4 = this.field4872[var3 + var2 * 4]; // L: 317
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
		int var3 = var2 * 31 + Arrays.hashCode(this.field4872); // L: 330
		return var3; // L: 331
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class470)) { // L: 336
			return false;
		} else {
			class470 var2 = (class470)var1; // L: 337

			for (int var3 = 0; var3 < 16; ++var3) { // L: 338
				if (var2.field4872[var3] != this.field4872[var3]) {
					return false;
				}
			}

			return true; // L: 339
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(CLpv;I)I",
		garbageValue = "-267393614"
	)
	@Export("lowercaseChar")
	static int lowercaseChar(char var0, Language var1) {
		int var2 = var0 << 4; // L: 143
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) { // L: 144
			var0 = Character.toLowerCase(var0); // L: 145
			var2 = (var0 << 4) + 1; // L: 146
		}

		if (var0 == 241 && var1 == Language.Language_ES) { // L: 148
			var2 = 1762;
		}

		return var2; // L: 149
	}
}
