import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rb")
public final class class465 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Lrb;"
	)
	static class465[] field4783;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 948805899
	)
	static int field4784;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1039080813
	)
	static int field4781;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lrb;"
	)
	public static final class465 field4782;
	@ObfuscatedName("ui")
	@ObfuscatedGetter(
		intValue = 2136812353
	)
	static int field4788;
	@ObfuscatedName("ao")
	public float[] field4785;

	static {
		field4783 = new class465[0];
		class76.method2123(100);
		field4782 = new class465();
	}

	public class465() {
		this.field4785 = new float[16];
		this.method8354(); // L: 43
	} // L: 44

	@ObfuscatedSignature(
		descriptor = "(Lrb;)V"
	)
	public class465(class465 var1) {
		this.field4785 = new float[16];
		this.method8356(var1); // L: 47
	} // L: 48

	@ObfuscatedSignature(
		descriptor = "(Lul;Z)V"
	)
	public class465(Buffer var1, boolean var2) {
		this.field4785 = new float[16];
		this.method8350(var1, var2); // L: 51
	} // L: 52

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-695246876"
	)
	public void method8399() {
		synchronized(field4783) { // L: 37
			if (field4781 < field4784 - 1) { // L: 38
				field4783[++field4781 - 1] = this;
			}

		}
	} // L: 40

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lul;ZI)V",
		garbageValue = "332749023"
	)
	void method8350(Buffer var1, boolean var2) {
		if (var2) { // L: 55
			class466 var4 = new class466(); // L: 56
			var4.method8418(class143.method3138(var1.readShort())); // L: 57
			var4.method8413(class143.method3138(var1.readShort())); // L: 58
			var4.method8414(class143.method3138(var1.readShort())); // L: 59
			var4.method8415((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort()); // L: 60
			this.method8361(var4); // L: 61
		} else {
			for (int var3 = 0; var3 < 16; ++var3) { // L: 64
				this.field4785[var3] = var1.method9211(); // L: 65
			}
		}

	} // L: 68

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "-1165307425"
	)
	float[] method8402() {
		float[] var1 = new float[3]; // L: 71
		if ((double)this.field4785[2] < 0.999D && (double)this.field4785[2] > -0.999D) { // L: 72
			var1[1] = (float)(-Math.asin((double)this.field4785[2])); // L: 73
			double var2 = Math.cos((double)var1[1]); // L: 74
			var1[0] = (float)Math.atan2((double)this.field4785[6] / var2, (double)this.field4785[10] / var2); // L: 75
			var1[2] = (float)Math.atan2((double)this.field4785[1] / var2, (double)this.field4785[0] / var2); // L: 76
		} else {
			var1[0] = 0.0F; // L: 79
			var1[1] = (float)Math.atan2((double)this.field4785[2], 0.0D); // L: 80
			var1[2] = (float)Math.atan2((double)(-this.field4785[9]), (double)this.field4785[5]); // L: 81
		}

		return var1; // L: 83
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "83"
	)
	public float[] method8353() {
		float[] var1 = new float[]{(float)(-Math.asin((double)this.field4785[6])), 0.0F, 0.0F}; // L: 87 88
		double var2 = Math.cos((double)var1[0]); // L: 89
		double var4;
		double var6;
		if (Math.abs(var2) > 0.005D) { // L: 90
			var4 = (double)this.field4785[2]; // L: 91
			var6 = (double)this.field4785[10]; // L: 92
			double var8 = (double)this.field4785[4]; // L: 93
			double var10 = (double)this.field4785[5]; // L: 94
			var1[1] = (float)Math.atan2(var4, var6); // L: 95
			var1[2] = (float)Math.atan2(var8, var10); // L: 96
		} else {
			var4 = (double)this.field4785[1]; // L: 99
			var6 = (double)this.field4785[0]; // L: 100
			if (this.field4785[6] < 0.0F) { // L: 101
				var1[1] = (float)Math.atan2(var4, var6); // L: 102
			} else {
				var1[1] = (float)(-Math.atan2(var4, var6)); // L: 105
			}

			var1[2] = 0.0F; // L: 107
		}

		return var1; // L: 109
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "624646995"
	)
	void method8354() {
		this.field4785[0] = 1.0F; // L: 113
		this.field4785[1] = 0.0F; // L: 114
		this.field4785[2] = 0.0F; // L: 115
		this.field4785[3] = 0.0F; // L: 116
		this.field4785[4] = 0.0F; // L: 117
		this.field4785[5] = 1.0F; // L: 118
		this.field4785[6] = 0.0F; // L: 119
		this.field4785[7] = 0.0F; // L: 120
		this.field4785[8] = 0.0F; // L: 121
		this.field4785[9] = 0.0F; // L: 122
		this.field4785[10] = 1.0F; // L: 123
		this.field4785[11] = 0.0F; // L: 124
		this.field4785[12] = 0.0F; // L: 125
		this.field4785[13] = 0.0F; // L: 126
		this.field4785[14] = 0.0F; // L: 127
		this.field4785[15] = 1.0F; // L: 128
	} // L: 129

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1094416342"
	)
	public void method8355() {
		this.field4785[0] = 0.0F; // L: 132
		this.field4785[1] = 0.0F; // L: 133
		this.field4785[2] = 0.0F; // L: 134
		this.field4785[3] = 0.0F; // L: 135
		this.field4785[4] = 0.0F; // L: 136
		this.field4785[5] = 0.0F; // L: 137
		this.field4785[6] = 0.0F; // L: 138
		this.field4785[7] = 0.0F; // L: 139
		this.field4785[8] = 0.0F; // L: 140
		this.field4785[9] = 0.0F; // L: 141
		this.field4785[10] = 0.0F; // L: 142
		this.field4785[11] = 0.0F; // L: 143
		this.field4785[12] = 0.0F; // L: 144
		this.field4785[13] = 0.0F; // L: 145
		this.field4785[14] = 0.0F; // L: 146
		this.field4785[15] = 0.0F; // L: 147
	} // L: 148

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lrb;I)V",
		garbageValue = "-1754099381"
	)
	public void method8356(class465 var1) {
		System.arraycopy(var1.field4785, 0, this.field4785, 0, 16); // L: 151
	} // L: 152

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-184544595"
	)
	public void method8357(float var1) {
		this.method8380(var1, var1, var1); // L: 155
	} // L: 156

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "-1816436529"
	)
	public void method8380(float var1, float var2, float var3) {
		this.method8354(); // L: 159
		this.field4785[0] = var1; // L: 160
		this.field4785[5] = var2; // L: 161
		this.field4785[10] = var3; // L: 162
	} // L: 163

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lrb;B)V",
		garbageValue = "6"
	)
	public void method8381(class465 var1) {
		for (int var2 = 0; var2 < this.field4785.length; ++var2) { // L: 166
			float[] var10000 = this.field4785; // L: 167
			var10000[var2] += var1.field4785[var2];
		}

	} // L: 169

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lrb;B)V",
		garbageValue = "-104"
	)
	public void method8359(class465 var1) {
		float var2 = var1.field4785[0] * this.field4785[0] + var1.field4785[4] * this.field4785[1] + this.field4785[2] * var1.field4785[8] + var1.field4785[12] * this.field4785[3]; // L: 172
		float var3 = this.field4785[2] * var1.field4785[9] + this.field4785[1] * var1.field4785[5] + var1.field4785[1] * this.field4785[0] + this.field4785[3] * var1.field4785[13]; // L: 173
		float var4 = var1.field4785[14] * this.field4785[3] + var1.field4785[10] * this.field4785[2] + var1.field4785[6] * this.field4785[1] + var1.field4785[2] * this.field4785[0]; // L: 174
		float var5 = var1.field4785[15] * this.field4785[3] + var1.field4785[11] * this.field4785[2] + this.field4785[0] * var1.field4785[3] + this.field4785[1] * var1.field4785[7]; // L: 175
		float var6 = var1.field4785[12] * this.field4785[7] + var1.field4785[0] * this.field4785[4] + var1.field4785[4] * this.field4785[5] + this.field4785[6] * var1.field4785[8]; // L: 176
		float var7 = this.field4785[4] * var1.field4785[1] + var1.field4785[5] * this.field4785[5] + this.field4785[6] * var1.field4785[9] + var1.field4785[13] * this.field4785[7]; // L: 177
		float var8 = var1.field4785[10] * this.field4785[6] + var1.field4785[2] * this.field4785[4] + var1.field4785[6] * this.field4785[5] + this.field4785[7] * var1.field4785[14]; // L: 178
		float var9 = var1.field4785[11] * this.field4785[6] + this.field4785[5] * var1.field4785[7] + this.field4785[4] * var1.field4785[3] + this.field4785[7] * var1.field4785[15]; // L: 179
		float var10 = var1.field4785[0] * this.field4785[8] + this.field4785[9] * var1.field4785[4] + var1.field4785[8] * this.field4785[10] + var1.field4785[12] * this.field4785[11]; // L: 180
		float var11 = this.field4785[11] * var1.field4785[13] + this.field4785[10] * var1.field4785[9] + this.field4785[8] * var1.field4785[1] + var1.field4785[5] * this.field4785[9]; // L: 181
		float var12 = this.field4785[10] * var1.field4785[10] + this.field4785[9] * var1.field4785[6] + this.field4785[8] * var1.field4785[2] + var1.field4785[14] * this.field4785[11]; // L: 182
		float var13 = var1.field4785[3] * this.field4785[8] + var1.field4785[7] * this.field4785[9] + var1.field4785[11] * this.field4785[10] + var1.field4785[15] * this.field4785[11]; // L: 183
		float var14 = this.field4785[15] * var1.field4785[12] + this.field4785[14] * var1.field4785[8] + this.field4785[13] * var1.field4785[4] + this.field4785[12] * var1.field4785[0]; // L: 184
		float var15 = var1.field4785[13] * this.field4785[15] + var1.field4785[9] * this.field4785[14] + this.field4785[13] * var1.field4785[5] + var1.field4785[1] * this.field4785[12]; // L: 185
		float var16 = var1.field4785[14] * this.field4785[15] + var1.field4785[10] * this.field4785[14] + var1.field4785[6] * this.field4785[13] + var1.field4785[2] * this.field4785[12]; // L: 186
		float var17 = var1.field4785[11] * this.field4785[14] + this.field4785[12] * var1.field4785[3] + var1.field4785[7] * this.field4785[13] + this.field4785[15] * var1.field4785[15]; // L: 187
		this.field4785[0] = var2; // L: 188
		this.field4785[1] = var3; // L: 189
		this.field4785[2] = var4; // L: 190
		this.field4785[3] = var5; // L: 191
		this.field4785[4] = var6; // L: 192
		this.field4785[5] = var7; // L: 193
		this.field4785[6] = var8; // L: 194
		this.field4785[7] = var9; // L: 195
		this.field4785[8] = var10; // L: 196
		this.field4785[9] = var11; // L: 197
		this.field4785[10] = var12; // L: 198
		this.field4785[11] = var13; // L: 199
		this.field4785[12] = var14; // L: 200
		this.field4785[13] = var15; // L: 201
		this.field4785[14] = var16; // L: 202
		this.field4785[15] = var17; // L: 203
	} // L: 204

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lrd;I)V",
		garbageValue = "-2131255556"
	)
	public void method8368(class464 var1) {
		float var2 = var1.field4780 * var1.field4780; // L: 207
		float var3 = var1.field4780 * var1.field4777; // L: 208
		float var4 = var1.field4780 * var1.field4778; // L: 209
		float var5 = var1.field4780 * var1.field4779; // L: 210
		float var6 = var1.field4777 * var1.field4777; // L: 211
		float var7 = var1.field4778 * var1.field4777; // L: 212
		float var8 = var1.field4777 * var1.field4779; // L: 213
		float var9 = var1.field4778 * var1.field4778; // L: 214
		float var10 = var1.field4779 * var1.field4778; // L: 215
		float var11 = var1.field4779 * var1.field4779; // L: 216
		this.field4785[0] = var6 + var2 - var11 - var9; // L: 217
		this.field4785[1] = var7 + var7 + var5 + var5; // L: 218
		this.field4785[2] = var8 - var4 - var4 + var8; // L: 219
		this.field4785[4] = var7 - var5 - var5 + var7; // L: 220
		this.field4785[5] = var9 + var2 - var6 - var11; // L: 221
		this.field4785[6] = var10 + var3 + var10 + var3; // L: 222
		this.field4785[8] = var4 + var8 + var8 + var4; // L: 223
		this.field4785[9] = var10 + (var10 - var3 - var3); // L: 224
		this.field4785[10] = var11 + var2 - var9 - var6; // L: 225
	} // L: 226

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lrz;B)V",
		garbageValue = "76"
	)
	void method8361(class466 var1) {
		this.field4785[0] = var1.field4797; // L: 229
		this.field4785[1] = var1.field4790; // L: 230
		this.field4785[2] = var1.field4798; // L: 231
		this.field4785[3] = 0.0F; // L: 232
		this.field4785[4] = var1.field4792; // L: 233
		this.field4785[5] = var1.field4793; // L: 234
		this.field4785[6] = var1.field4789; // L: 235
		this.field4785[7] = 0.0F; // L: 236
		this.field4785[8] = var1.field4795; // L: 237
		this.field4785[9] = var1.field4796; // L: 238
		this.field4785[10] = var1.field4800; // L: 239
		this.field4785[11] = 0.0F; // L: 240
		this.field4785[12] = var1.field4794; // L: 241
		this.field4785[13] = var1.field4799; // L: 242
		this.field4785[14] = var1.field4791; // L: 243
		this.field4785[15] = 1.0F; // L: 244
	} // L: 245

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)F",
		garbageValue = "-125"
	)
	float method8362() {
		return this.field4785[6] * this.field4785[3] * this.field4785[9] * this.field4785[12] + (this.field4785[10] * this.field4785[7] * this.field4785[1] * this.field4785[12] + (this.field4785[11] * this.field4785[4] * this.field4785[1] * this.field4785[14] + (this.field4785[14] * this.field4785[0] * this.field4785[7] * this.field4785[9] + this.field4785[15] * this.field4785[0] * this.field4785[5] * this.field4785[10] - this.field4785[14] * this.field4785[11] * this.field4785[5] * this.field4785[0] - this.field4785[15] * this.field4785[9] * this.field4785[6] * this.field4785[0] + this.field4785[11] * this.field4785[0] * this.field4785[6] * this.field4785[13] - this.field4785[10] * this.field4785[7] * this.field4785[0] * this.field4785[13] - this.field4785[10] * this.field4785[4] * this.field4785[1] * this.field4785[15]) + this.field4785[8] * this.field4785[6] * this.field4785[1] * this.field4785[15] - this.field4785[11] * this.field4785[6] * this.field4785[1] * this.field4785[12] - this.field4785[8] * this.field4785[7] * this.field4785[1] * this.field4785[14]) + this.field4785[15] * this.field4785[2] * this.field4785[4] * this.field4785[9] - this.field4785[13] * this.field4785[11] * this.field4785[2] * this.field4785[4] - this.field4785[15] * this.field4785[8] * this.field4785[5] * this.field4785[2] + this.field4785[2] * this.field4785[5] * this.field4785[11] * this.field4785[12] + this.field4785[13] * this.field4785[8] * this.field4785[7] * this.field4785[2] - this.field4785[12] * this.field4785[7] * this.field4785[2] * this.field4785[9] - this.field4785[14] * this.field4785[9] * this.field4785[4] * this.field4785[3] + this.field4785[13] * this.field4785[4] * this.field4785[3] * this.field4785[10] + this.field4785[5] * this.field4785[3] * this.field4785[8] * this.field4785[14] - this.field4785[10] * this.field4785[3] * this.field4785[5] * this.field4785[12] - this.field4785[13] * this.field4785[3] * this.field4785[6] * this.field4785[8]); // L: 248
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1302965817"
	)
	public void method8363() {
		float var1 = 1.0F / this.method8362(); // L: 252
		float var2 = var1 * (this.field4785[13] * this.field4785[6] * this.field4785[11] + (this.field4785[10] * this.field4785[5] * this.field4785[15] - this.field4785[11] * this.field4785[5] * this.field4785[14] - this.field4785[15] * this.field4785[6] * this.field4785[9]) + this.field4785[7] * this.field4785[9] * this.field4785[14] - this.field4785[10] * this.field4785[7] * this.field4785[13]); // L: 253
		float var3 = (this.field4785[14] * this.field4785[1] * this.field4785[11] + this.field4785[15] * this.field4785[10] * -this.field4785[1] + this.field4785[15] * this.field4785[2] * this.field4785[9] - this.field4785[11] * this.field4785[2] * this.field4785[13] - this.field4785[14] * this.field4785[3] * this.field4785[9] + this.field4785[13] * this.field4785[10] * this.field4785[3]) * var1; // L: 254
		float var4 = (this.field4785[1] * this.field4785[6] * this.field4785[15] - this.field4785[14] * this.field4785[7] * this.field4785[1] - this.field4785[15] * this.field4785[2] * this.field4785[5] + this.field4785[13] * this.field4785[7] * this.field4785[2] + this.field4785[14] * this.field4785[3] * this.field4785[5] - this.field4785[13] * this.field4785[3] * this.field4785[6]) * var1; // L: 255
		float var5 = var1 * (this.field4785[9] * this.field4785[3] * this.field4785[6] + (this.field4785[11] * this.field4785[2] * this.field4785[5] + this.field4785[6] * -this.field4785[1] * this.field4785[11] + this.field4785[1] * this.field4785[7] * this.field4785[10] - this.field4785[7] * this.field4785[2] * this.field4785[9] - this.field4785[10] * this.field4785[3] * this.field4785[5])); // L: 256
		float var6 = var1 * (this.field4785[10] * this.field4785[7] * this.field4785[12] + (this.field4785[14] * this.field4785[11] * this.field4785[4] + this.field4785[15] * -this.field4785[4] * this.field4785[10] + this.field4785[15] * this.field4785[6] * this.field4785[8] - this.field4785[12] * this.field4785[6] * this.field4785[11] - this.field4785[14] * this.field4785[8] * this.field4785[7])); // L: 257
		float var7 = (this.field4785[10] * this.field4785[0] * this.field4785[15] - this.field4785[0] * this.field4785[11] * this.field4785[14] - this.field4785[15] * this.field4785[2] * this.field4785[8] + this.field4785[2] * this.field4785[11] * this.field4785[12] + this.field4785[14] * this.field4785[8] * this.field4785[3] - this.field4785[10] * this.field4785[3] * this.field4785[12]) * var1; // L: 258
		float var8 = var1 * (this.field4785[15] * this.field4785[6] * -this.field4785[0] + this.field4785[14] * this.field4785[7] * this.field4785[0] + this.field4785[2] * this.field4785[4] * this.field4785[15] - this.field4785[12] * this.field4785[7] * this.field4785[2] - this.field4785[14] * this.field4785[3] * this.field4785[4] + this.field4785[12] * this.field4785[3] * this.field4785[6]); // L: 259
		float var9 = (this.field4785[10] * this.field4785[3] * this.field4785[4] + this.field4785[7] * this.field4785[2] * this.field4785[8] + (this.field4785[11] * this.field4785[6] * this.field4785[0] - this.field4785[7] * this.field4785[0] * this.field4785[10] - this.field4785[2] * this.field4785[4] * this.field4785[11]) - this.field4785[8] * this.field4785[3] * this.field4785[6]) * var1; // L: 260
		float var10 = (this.field4785[15] * this.field4785[4] * this.field4785[9] - this.field4785[4] * this.field4785[11] * this.field4785[13] - this.field4785[5] * this.field4785[8] * this.field4785[15] + this.field4785[12] * this.field4785[5] * this.field4785[11] + this.field4785[13] * this.field4785[8] * this.field4785[7] - this.field4785[12] * this.field4785[7] * this.field4785[9]) * var1; // L: 261
		float var11 = var1 * (this.field4785[12] * this.field4785[9] * this.field4785[3] + (this.field4785[15] * this.field4785[1] * this.field4785[8] + this.field4785[15] * -this.field4785[0] * this.field4785[9] + this.field4785[0] * this.field4785[11] * this.field4785[13] - this.field4785[11] * this.field4785[1] * this.field4785[12] - this.field4785[3] * this.field4785[8] * this.field4785[13])); // L: 262
		float var12 = (this.field4785[13] * this.field4785[4] * this.field4785[3] + this.field4785[7] * this.field4785[1] * this.field4785[12] + (this.field4785[0] * this.field4785[5] * this.field4785[15] - this.field4785[0] * this.field4785[7] * this.field4785[13] - this.field4785[15] * this.field4785[4] * this.field4785[1]) - this.field4785[5] * this.field4785[3] * this.field4785[12]) * var1; // L: 263
		float var13 = (this.field4785[9] * this.field4785[7] * this.field4785[0] + this.field4785[5] * -this.field4785[0] * this.field4785[11] + this.field4785[11] * this.field4785[4] * this.field4785[1] - this.field4785[7] * this.field4785[1] * this.field4785[8] - this.field4785[4] * this.field4785[3] * this.field4785[9] + this.field4785[8] * this.field4785[5] * this.field4785[3]) * var1; // L: 264
		float var14 = (this.field4785[12] * this.field4785[6] * this.field4785[9] + (this.field4785[13] * this.field4785[4] * this.field4785[10] + -this.field4785[4] * this.field4785[9] * this.field4785[14] + this.field4785[8] * this.field4785[5] * this.field4785[14] - this.field4785[12] * this.field4785[10] * this.field4785[5] - this.field4785[13] * this.field4785[6] * this.field4785[8])) * var1; // L: 265
		float var15 = (this.field4785[9] * this.field4785[0] * this.field4785[14] - this.field4785[13] * this.field4785[0] * this.field4785[10] - this.field4785[14] * this.field4785[1] * this.field4785[8] + this.field4785[10] * this.field4785[1] * this.field4785[12] + this.field4785[13] * this.field4785[8] * this.field4785[2] - this.field4785[12] * this.field4785[2] * this.field4785[9]) * var1; // L: 266
		float var16 = var1 * (this.field4785[4] * this.field4785[1] * this.field4785[14] + this.field4785[14] * this.field4785[5] * -this.field4785[0] + this.field4785[0] * this.field4785[6] * this.field4785[13] - this.field4785[1] * this.field4785[6] * this.field4785[12] - this.field4785[2] * this.field4785[4] * this.field4785[13] + this.field4785[5] * this.field4785[2] * this.field4785[12]); // L: 267
		float var17 = var1 * (this.field4785[4] * this.field4785[2] * this.field4785[9] + this.field4785[5] * this.field4785[0] * this.field4785[10] - this.field4785[9] * this.field4785[0] * this.field4785[6] - this.field4785[10] * this.field4785[4] * this.field4785[1] + this.field4785[8] * this.field4785[1] * this.field4785[6] - this.field4785[5] * this.field4785[2] * this.field4785[8]); // L: 268
		this.field4785[0] = var2; // L: 269
		this.field4785[1] = var3; // L: 270
		this.field4785[2] = var4; // L: 271
		this.field4785[3] = var5; // L: 272
		this.field4785[4] = var6; // L: 273
		this.field4785[5] = var7; // L: 274
		this.field4785[6] = var8; // L: 275
		this.field4785[7] = var9; // L: 276
		this.field4785[8] = var10; // L: 277
		this.field4785[9] = var11; // L: 278
		this.field4785[10] = var12; // L: 279
		this.field4785[11] = var13; // L: 280
		this.field4785[12] = var14; // L: 281
		this.field4785[13] = var15; // L: 282
		this.field4785[14] = var16; // L: 283
		this.field4785[15] = var17; // L: 284
	} // L: 285

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "1974456847"
	)
	public float[] method8348() {
		float[] var1 = new float[3]; // L: 322
		class463 var2 = new class463(this.field4785[0], this.field4785[1], this.field4785[2]); // L: 323
		class463 var3 = new class463(this.field4785[4], this.field4785[5], this.field4785[6]); // L: 324
		class463 var4 = new class463(this.field4785[8], this.field4785[9], this.field4785[10]); // L: 325
		var1[0] = var2.method8309(); // L: 326
		var1[1] = var3.method8309(); // L: 327
		var1[2] = var4.method8309(); // L: 328
		return var1; // L: 329
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder(); // L: 290
		this.method8353(); // L: 291
		this.method8402(); // L: 292

		for (int var2 = 0; var2 < 4; ++var2) { // L: 293
			for (int var3 = 0; var3 < 4; ++var3) { // L: 294
				if (var3 > 0) {
					var1.append("\t"); // L: 295
				}

				float var4 = this.field4785[var3 + var2 * 4]; // L: 296
				if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5D) { // L: 297
					var4 = 0.0F;
				}

				var1.append(var4); // L: 298
			}

			var1.append("\n"); // L: 300
		}

		return var1.toString(); // L: 302
	}

	public int hashCode() {
		boolean var1 = true; // L: 307
		byte var2 = 1; // L: 308
		int var3 = var2 * 31 + Arrays.hashCode(this.field4785); // L: 309
		return var3; // L: 310
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class465)) { // L: 315
			return false;
		} else {
			class465 var2 = (class465)var1; // L: 316

			for (int var3 = 0; var3 < 16; ++var3) { // L: 317
				if (var2.field4785[var3] != this.field4785[var3]) {
					return false;
				}
			}

			return true; // L: 318
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([BILjava/lang/CharSequence;B)I",
		garbageValue = "-72"
	)
	public static int method8410(byte[] var0, int var1, CharSequence var2) {
		int var3 = var2.length(); // L: 9
		int var4 = var1; // L: 10

		for (int var5 = 0; var5 < var3; ++var5) { // L: 11
			char var6 = var2.charAt(var5); // L: 12
			if (var6 <= 127) { // L: 13
				var0[var4++] = (byte)var6; // L: 14
			} else if (var6 <= 2047) { // L: 16
				var0[var4++] = (byte)(192 | var6 >> 6); // L: 17
				var0[var4++] = (byte)(128 | var6 & '?'); // L: 18
			} else {
				var0[var4++] = (byte)(224 | var6 >> '\f'); // L: 21
				var0[var4++] = (byte)(128 | var6 >> 6 & 63); // L: 22
				var0[var4++] = (byte)(128 | var6 & '?'); // L: 23
			}
		}

		return var4 - var1; // L: 26
	}
}
