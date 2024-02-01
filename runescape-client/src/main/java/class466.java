import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rh")
public final class class466 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Lrh;"
	)
	static class466[] field4811;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -692792871
	)
	static int field4808;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lrh;"
	)
	public static final class466 field4807;
	@ObfuscatedName("aq")
	public float[] field4809;

	static {
		field4811 = new class466[0]; // L: 9
		class319.method6068(100); // L: 14
		field4807 = new class466(); // L: 18
	}

	public class466() {
		this.field4809 = new float[16];
		this.method8546(); // L: 43
	} // L: 44

	@ObfuscatedSignature(
		descriptor = "(Lrh;)V"
	)
	public class466(class466 var1) {
		this.field4809 = new float[16];
		this.method8548(var1); // L: 47
	} // L: 48

	@ObfuscatedSignature(
		descriptor = "(Luk;Z)V"
	)
	public class466(Buffer var1, boolean var2) {
		this.field4809 = new float[16]; // L: 17
		this.method8543(var1, var2); // L: 51
	} // L: 52

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1815141661"
	)
	public void method8559() {
		synchronized(field4811) { // L: 37
			if (class431.field4647 < field4808 - 1) { // L: 38
				field4811[++class431.field4647 - 1] = this;
			}

		}
	} // L: 40

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Luk;ZI)V",
		garbageValue = "1014844409"
	)
	void method8543(Buffer var1, boolean var2) {
		if (var2) { // L: 55
			class467 var4 = new class467(); // L: 56
			var4.method8615(class360.method6933(var1.readShort())); // L: 57
			var4.method8627(class360.method6933(var1.readShort())); // L: 58
			var4.method8619(class360.method6933(var1.readShort())); // L: 59
			var4.method8618((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort()); // L: 60
			this.method8558(var4); // L: 61
		} else {
			for (int var3 = 0; var3 < 16; ++var3) { // L: 64
				this.field4809[var3] = var1.method9394(); // L: 65
			}
		}

	} // L: 68

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "-1574409963"
	)
	float[] method8544() {
		float[] var1 = new float[3]; // L: 71
		if ((double)this.field4809[2] < 0.999D && (double)this.field4809[2] > -0.999D) { // L: 72
			var1[1] = (float)(-Math.asin((double)this.field4809[2])); // L: 73
			double var2 = Math.cos((double)var1[1]); // L: 74
			var1[0] = (float)Math.atan2((double)this.field4809[6] / var2, (double)this.field4809[10] / var2); // L: 75
			var1[2] = (float)Math.atan2((double)this.field4809[1] / var2, (double)this.field4809[0] / var2); // L: 76
		} else {
			var1[0] = 0.0F; // L: 79
			var1[1] = (float)Math.atan2((double)this.field4809[2], 0.0D); // L: 80
			var1[2] = (float)Math.atan2((double)(-this.field4809[9]), (double)this.field4809[5]); // L: 81
		}

		return var1; // L: 83
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "-1633958144"
	)
	public float[] method8542() {
		float[] var1 = new float[]{(float)(-Math.asin((double)this.field4809[6])), 0.0F, 0.0F}; // L: 87 88
		double var2 = Math.cos((double)var1[0]); // L: 89
		double var4;
		double var6;
		if (Math.abs(var2) > 0.005D) { // L: 90
			var4 = (double)this.field4809[2]; // L: 91
			var6 = (double)this.field4809[10]; // L: 92
			double var8 = (double)this.field4809[4]; // L: 93
			double var10 = (double)this.field4809[5]; // L: 94
			var1[1] = (float)Math.atan2(var4, var6); // L: 95
			var1[2] = (float)Math.atan2(var8, var10); // L: 96
		} else {
			var4 = (double)this.field4809[1]; // L: 99
			var6 = (double)this.field4809[0]; // L: 100
			if (this.field4809[6] < 0.0F) { // L: 101
				var1[1] = (float)Math.atan2(var4, var6); // L: 102
			} else {
				var1[1] = (float)(-Math.atan2(var4, var6)); // L: 105
			}

			var1[2] = 0.0F; // L: 107
		}

		return var1; // L: 109
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1984279029"
	)
	void method8546() {
		this.field4809[0] = 1.0F; // L: 113
		this.field4809[1] = 0.0F; // L: 114
		this.field4809[2] = 0.0F; // L: 115
		this.field4809[3] = 0.0F; // L: 116
		this.field4809[4] = 0.0F; // L: 117
		this.field4809[5] = 1.0F; // L: 118
		this.field4809[6] = 0.0F; // L: 119
		this.field4809[7] = 0.0F; // L: 120
		this.field4809[8] = 0.0F; // L: 121
		this.field4809[9] = 0.0F; // L: 122
		this.field4809[10] = 1.0F; // L: 123
		this.field4809[11] = 0.0F; // L: 124
		this.field4809[12] = 0.0F; // L: 125
		this.field4809[13] = 0.0F; // L: 126
		this.field4809[14] = 0.0F; // L: 127
		this.field4809[15] = 1.0F; // L: 128
	} // L: 129

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1865275779"
	)
	public void method8547() {
		this.field4809[0] = 0.0F; // L: 132
		this.field4809[1] = 0.0F; // L: 133
		this.field4809[2] = 0.0F; // L: 134
		this.field4809[3] = 0.0F; // L: 135
		this.field4809[4] = 0.0F; // L: 136
		this.field4809[5] = 0.0F; // L: 137
		this.field4809[6] = 0.0F; // L: 138
		this.field4809[7] = 0.0F; // L: 139
		this.field4809[8] = 0.0F; // L: 140
		this.field4809[9] = 0.0F; // L: 141
		this.field4809[10] = 0.0F; // L: 142
		this.field4809[11] = 0.0F; // L: 143
		this.field4809[12] = 0.0F; // L: 144
		this.field4809[13] = 0.0F; // L: 145
		this.field4809[14] = 0.0F; // L: 146
		this.field4809[15] = 0.0F; // L: 147
	} // L: 148

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lrh;I)V",
		garbageValue = "237221980"
	)
	public void method8548(class466 var1) {
		System.arraycopy(var1.field4809, 0, this.field4809, 0, 16); // L: 151
	} // L: 152

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-1219288981"
	)
	public void method8549(float var1) {
		this.method8579(var1, var1, var1); // L: 155
	} // L: 156

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "1136615889"
	)
	public void method8579(float var1, float var2, float var3) {
		this.method8546(); // L: 159
		this.field4809[0] = var1; // L: 160
		this.field4809[5] = var2; // L: 161
		this.field4809[10] = var3; // L: 162
	} // L: 163

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lrh;B)V",
		garbageValue = "-44"
	)
	public void method8551(class466 var1) {
		for (int var2 = 0; var2 < this.field4809.length; ++var2) { // L: 166
			float[] var10000 = this.field4809; // L: 167
			var10000[var2] += var1.field4809[var2];
		}

	} // L: 169

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lrh;I)V",
		garbageValue = "198310472"
	)
	public void method8552(class466 var1) {
		float var2 = var1.field4809[4] * this.field4809[1] + var1.field4809[0] * this.field4809[0] + var1.field4809[8] * this.field4809[2] + var1.field4809[12] * this.field4809[3]; // L: 172
		float var3 = var1.field4809[13] * this.field4809[3] + this.field4809[0] * var1.field4809[1] + var1.field4809[5] * this.field4809[1] + var1.field4809[9] * this.field4809[2]; // L: 173
		float var4 = this.field4809[3] * var1.field4809[14] + var1.field4809[6] * this.field4809[1] + var1.field4809[2] * this.field4809[0] + var1.field4809[10] * this.field4809[2]; // L: 174
		float var5 = var1.field4809[15] * this.field4809[3] + this.field4809[0] * var1.field4809[3] + var1.field4809[7] * this.field4809[1] + var1.field4809[11] * this.field4809[2]; // L: 175
		float var6 = var1.field4809[12] * this.field4809[7] + this.field4809[5] * var1.field4809[4] + var1.field4809[0] * this.field4809[4] + this.field4809[6] * var1.field4809[8]; // L: 176
		float var7 = var1.field4809[13] * this.field4809[7] + this.field4809[4] * var1.field4809[1] + this.field4809[5] * var1.field4809[5] + this.field4809[6] * var1.field4809[9]; // L: 177
		float var8 = var1.field4809[2] * this.field4809[4] + this.field4809[5] * var1.field4809[6] + var1.field4809[10] * this.field4809[6] + this.field4809[7] * var1.field4809[14]; // L: 178
		float var9 = this.field4809[6] * var1.field4809[11] + var1.field4809[7] * this.field4809[5] + this.field4809[4] * var1.field4809[3] + var1.field4809[15] * this.field4809[7]; // L: 179
		float var10 = var1.field4809[12] * this.field4809[11] + var1.field4809[8] * this.field4809[10] + var1.field4809[4] * this.field4809[9] + var1.field4809[0] * this.field4809[8]; // L: 180
		float var11 = var1.field4809[5] * this.field4809[9] + this.field4809[8] * var1.field4809[1] + this.field4809[10] * var1.field4809[9] + var1.field4809[13] * this.field4809[11]; // L: 181
		float var12 = var1.field4809[14] * this.field4809[11] + var1.field4809[10] * this.field4809[10] + var1.field4809[2] * this.field4809[8] + this.field4809[9] * var1.field4809[6]; // L: 182
		float var13 = this.field4809[11] * var1.field4809[15] + this.field4809[9] * var1.field4809[7] + var1.field4809[3] * this.field4809[8] + var1.field4809[11] * this.field4809[10]; // L: 183
		float var14 = var1.field4809[12] * this.field4809[15] + var1.field4809[8] * this.field4809[14] + this.field4809[13] * var1.field4809[4] + this.field4809[12] * var1.field4809[0]; // L: 184
		float var15 = this.field4809[13] * var1.field4809[5] + this.field4809[12] * var1.field4809[1] + var1.field4809[9] * this.field4809[14] + var1.field4809[13] * this.field4809[15]; // L: 185
		float var16 = this.field4809[14] * var1.field4809[10] + this.field4809[12] * var1.field4809[2] + this.field4809[13] * var1.field4809[6] + var1.field4809[14] * this.field4809[15]; // L: 186
		float var17 = this.field4809[15] * var1.field4809[15] + this.field4809[13] * var1.field4809[7] + var1.field4809[3] * this.field4809[12] + this.field4809[14] * var1.field4809[11]; // L: 187
		this.field4809[0] = var2; // L: 188
		this.field4809[1] = var3; // L: 189
		this.field4809[2] = var4; // L: 190
		this.field4809[3] = var5; // L: 191
		this.field4809[4] = var6; // L: 192
		this.field4809[5] = var7; // L: 193
		this.field4809[6] = var8; // L: 194
		this.field4809[7] = var9; // L: 195
		this.field4809[8] = var10; // L: 196
		this.field4809[9] = var11; // L: 197
		this.field4809[10] = var12; // L: 198
		this.field4809[11] = var13; // L: 199
		this.field4809[12] = var14; // L: 200
		this.field4809[13] = var15; // L: 201
		this.field4809[14] = var16; // L: 202
		this.field4809[15] = var17; // L: 203
	} // L: 204

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lro;S)V",
		garbageValue = "929"
	)
	public void method8590(class465 var1) {
		float var2 = var1.field4799 * var1.field4799; // L: 207
		float var3 = var1.field4799 * var1.field4802; // L: 208
		float var4 = var1.field4803 * var1.field4799; // L: 209
		float var5 = var1.field4799 * var1.field4804; // L: 210
		float var6 = var1.field4802 * var1.field4802; // L: 211
		float var7 = var1.field4803 * var1.field4802; // L: 212
		float var8 = var1.field4802 * var1.field4804; // L: 213
		float var9 = var1.field4803 * var1.field4803; // L: 214
		float var10 = var1.field4803 * var1.field4804; // L: 215
		float var11 = var1.field4804 * var1.field4804; // L: 216
		this.field4809[0] = var6 + var2 - var11 - var9; // L: 217
		this.field4809[1] = var5 + var7 + var7 + var5; // L: 218
		this.field4809[2] = var8 + (var8 - var4 - var4); // L: 219
		this.field4809[4] = var7 - var5 - var5 + var7; // L: 220
		this.field4809[5] = var2 + var9 - var6 - var11; // L: 221
		this.field4809[6] = var10 + var3 + var10 + var3; // L: 222
		this.field4809[8] = var8 + var4 + var8 + var4; // L: 223
		this.field4809[9] = var10 - var3 - var3 + var10; // L: 224
		this.field4809[10] = var11 + var2 - var9 - var6; // L: 225
	} // L: 226

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lrg;I)V",
		garbageValue = "1152944347"
	)
	void method8558(class467 var1) {
		this.field4809[0] = var1.field4822; // L: 229
		this.field4809[1] = var1.field4813; // L: 230
		this.field4809[2] = var1.field4816; // L: 231
		this.field4809[3] = 0.0F; // L: 232
		this.field4809[4] = var1.field4821; // L: 233
		this.field4809[5] = var1.field4815; // L: 234
		this.field4809[6] = var1.field4817; // L: 235
		this.field4809[7] = 0.0F; // L: 236
		this.field4809[8] = var1.field4818; // L: 237
		this.field4809[9] = var1.field4819; // L: 238
		this.field4809[10] = var1.field4820; // L: 239
		this.field4809[11] = 0.0F; // L: 240
		this.field4809[12] = var1.field4812; // L: 241
		this.field4809[13] = var1.field4814; // L: 242
		this.field4809[14] = var1.field4823; // L: 243
		this.field4809[15] = 1.0F; // L: 244
	} // L: 245

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)F",
		garbageValue = "97"
	)
	float method8555() {
		return this.field4809[12] * this.field4809[3] * this.field4809[6] * this.field4809[9] + (this.field4809[3] * this.field4809[5] * this.field4809[8] * this.field4809[14] + this.field4809[3] * this.field4809[4] * this.field4809[10] * this.field4809[13] + (this.field4809[5] * this.field4809[2] * this.field4809[11] * this.field4809[12] + (this.field4809[15] * this.field4809[2] * this.field4809[4] * this.field4809[9] + this.field4809[0] * this.field4809[5] * this.field4809[10] * this.field4809[15] - this.field4809[14] * this.field4809[0] * this.field4809[5] * this.field4809[11] - this.field4809[15] * this.field4809[9] * this.field4809[0] * this.field4809[6] + this.field4809[11] * this.field4809[0] * this.field4809[6] * this.field4809[13] + this.field4809[9] * this.field4809[0] * this.field4809[7] * this.field4809[14] - this.field4809[13] * this.field4809[7] * this.field4809[0] * this.field4809[10] - this.field4809[4] * this.field4809[1] * this.field4809[10] * this.field4809[15] + this.field4809[11] * this.field4809[1] * this.field4809[4] * this.field4809[14] + this.field4809[15] * this.field4809[8] * this.field4809[6] * this.field4809[1] - this.field4809[6] * this.field4809[1] * this.field4809[11] * this.field4809[12] - this.field4809[8] * this.field4809[7] * this.field4809[1] * this.field4809[14] + this.field4809[10] * this.field4809[7] * this.field4809[1] * this.field4809[12] - this.field4809[13] * this.field4809[2] * this.field4809[4] * this.field4809[11] - this.field4809[8] * this.field4809[5] * this.field4809[2] * this.field4809[15]) + this.field4809[7] * this.field4809[2] * this.field4809[8] * this.field4809[13] - this.field4809[12] * this.field4809[2] * this.field4809[7] * this.field4809[9] - this.field4809[14] * this.field4809[9] * this.field4809[4] * this.field4809[3]) - this.field4809[10] * this.field4809[5] * this.field4809[3] * this.field4809[12] - this.field4809[13] * this.field4809[3] * this.field4809[6] * this.field4809[8]); // L: 248
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2130575828"
	)
	public void method8556() {
		float var1 = 1.0F / this.method8555(); // L: 252
		float var2 = (this.field4809[7] * this.field4809[9] * this.field4809[14] + this.field4809[13] * this.field4809[11] * this.field4809[6] + (this.field4809[15] * this.field4809[10] * this.field4809[5] - this.field4809[14] * this.field4809[11] * this.field4809[5] - this.field4809[15] * this.field4809[9] * this.field4809[6]) - this.field4809[10] * this.field4809[7] * this.field4809[13]) * var1; // L: 253
		float var3 = (this.field4809[10] * this.field4809[3] * this.field4809[13] + (this.field4809[14] * this.field4809[11] * this.field4809[1] + this.field4809[10] * -this.field4809[1] * this.field4809[15] + this.field4809[15] * this.field4809[9] * this.field4809[2] - this.field4809[13] * this.field4809[2] * this.field4809[11] - this.field4809[9] * this.field4809[3] * this.field4809[14])) * var1; // L: 254
		float var4 = (this.field4809[14] * this.field4809[3] * this.field4809[5] + this.field4809[2] * this.field4809[7] * this.field4809[13] + (this.field4809[15] * this.field4809[1] * this.field4809[6] - this.field4809[7] * this.field4809[1] * this.field4809[14] - this.field4809[15] * this.field4809[5] * this.field4809[2]) - this.field4809[13] * this.field4809[6] * this.field4809[3]) * var1; // L: 255
		float var5 = (this.field4809[3] * this.field4809[6] * this.field4809[9] + (-this.field4809[1] * this.field4809[6] * this.field4809[11] + this.field4809[7] * this.field4809[1] * this.field4809[10] + this.field4809[2] * this.field4809[5] * this.field4809[11] - this.field4809[2] * this.field4809[7] * this.field4809[9] - this.field4809[10] * this.field4809[5] * this.field4809[3])) * var1; // L: 256
		float var6 = (this.field4809[15] * this.field4809[6] * this.field4809[8] + -this.field4809[4] * this.field4809[10] * this.field4809[15] + this.field4809[4] * this.field4809[11] * this.field4809[14] - this.field4809[6] * this.field4809[11] * this.field4809[12] - this.field4809[7] * this.field4809[8] * this.field4809[14] + this.field4809[10] * this.field4809[7] * this.field4809[12]) * var1; // L: 257
		float var7 = (this.field4809[11] * this.field4809[2] * this.field4809[12] + (this.field4809[10] * this.field4809[0] * this.field4809[15] - this.field4809[0] * this.field4809[11] * this.field4809[14] - this.field4809[15] * this.field4809[2] * this.field4809[8]) + this.field4809[14] * this.field4809[3] * this.field4809[8] - this.field4809[12] * this.field4809[10] * this.field4809[3]) * var1; // L: 258
		float var8 = (this.field4809[12] * this.field4809[3] * this.field4809[6] + (this.field4809[14] * this.field4809[0] * this.field4809[7] + this.field4809[15] * -this.field4809[0] * this.field4809[6] + this.field4809[4] * this.field4809[2] * this.field4809[15] - this.field4809[2] * this.field4809[7] * this.field4809[12] - this.field4809[14] * this.field4809[3] * this.field4809[4])) * var1; // L: 259
		float var9 = var1 * (this.field4809[7] * this.field4809[2] * this.field4809[8] + (this.field4809[11] * this.field4809[0] * this.field4809[6] - this.field4809[10] * this.field4809[7] * this.field4809[0] - this.field4809[11] * this.field4809[4] * this.field4809[2]) + this.field4809[4] * this.field4809[3] * this.field4809[10] - this.field4809[6] * this.field4809[3] * this.field4809[8]); // L: 260
		float var10 = (this.field4809[15] * this.field4809[9] * this.field4809[4] - this.field4809[11] * this.field4809[4] * this.field4809[13] - this.field4809[15] * this.field4809[8] * this.field4809[5] + this.field4809[5] * this.field4809[11] * this.field4809[12] + this.field4809[13] * this.field4809[7] * this.field4809[8] - this.field4809[12] * this.field4809[9] * this.field4809[7]) * var1; // L: 261
		float var11 = var1 * (this.field4809[8] * this.field4809[1] * this.field4809[15] + -this.field4809[0] * this.field4809[9] * this.field4809[15] + this.field4809[13] * this.field4809[0] * this.field4809[11] - this.field4809[1] * this.field4809[11] * this.field4809[12] - this.field4809[8] * this.field4809[3] * this.field4809[13] + this.field4809[9] * this.field4809[3] * this.field4809[12]); // L: 262
		float var12 = var1 * (this.field4809[13] * this.field4809[4] * this.field4809[3] + this.field4809[12] * this.field4809[7] * this.field4809[1] + (this.field4809[0] * this.field4809[5] * this.field4809[15] - this.field4809[0] * this.field4809[7] * this.field4809[13] - this.field4809[1] * this.field4809[4] * this.field4809[15]) - this.field4809[12] * this.field4809[5] * this.field4809[3]); // L: 263
		float var13 = var1 * (this.field4809[8] * this.field4809[5] * this.field4809[3] + (this.field4809[11] * this.field4809[1] * this.field4809[4] + this.field4809[5] * -this.field4809[0] * this.field4809[11] + this.field4809[9] * this.field4809[7] * this.field4809[0] - this.field4809[8] * this.field4809[1] * this.field4809[7] - this.field4809[3] * this.field4809[4] * this.field4809[9])); // L: 264
		float var14 = (this.field4809[9] * this.field4809[6] * this.field4809[12] + (-this.field4809[4] * this.field4809[9] * this.field4809[14] + this.field4809[13] * this.field4809[4] * this.field4809[10] + this.field4809[14] * this.field4809[5] * this.field4809[8] - this.field4809[12] * this.field4809[5] * this.field4809[10] - this.field4809[8] * this.field4809[6] * this.field4809[13])) * var1; // L: 265
		float var15 = (this.field4809[13] * this.field4809[8] * this.field4809[2] + this.field4809[1] * this.field4809[10] * this.field4809[12] + (this.field4809[9] * this.field4809[0] * this.field4809[14] - this.field4809[13] * this.field4809[0] * this.field4809[10] - this.field4809[14] * this.field4809[8] * this.field4809[1]) - this.field4809[12] * this.field4809[2] * this.field4809[9]) * var1; // L: 266
		float var16 = var1 * (this.field4809[5] * this.field4809[2] * this.field4809[12] + (this.field4809[14] * this.field4809[4] * this.field4809[1] + this.field4809[13] * this.field4809[6] * this.field4809[0] + -this.field4809[0] * this.field4809[5] * this.field4809[14] - this.field4809[1] * this.field4809[6] * this.field4809[12] - this.field4809[2] * this.field4809[4] * this.field4809[13])); // L: 267
		float var17 = var1 * (this.field4809[9] * this.field4809[2] * this.field4809[4] + this.field4809[10] * this.field4809[5] * this.field4809[0] - this.field4809[0] * this.field4809[6] * this.field4809[9] - this.field4809[10] * this.field4809[4] * this.field4809[1] + this.field4809[1] * this.field4809[6] * this.field4809[8] - this.field4809[2] * this.field4809[5] * this.field4809[8]); // L: 268
		this.field4809[0] = var2; // L: 269
		this.field4809[1] = var3; // L: 270
		this.field4809[2] = var4; // L: 271
		this.field4809[3] = var5; // L: 272
		this.field4809[4] = var6; // L: 273
		this.field4809[5] = var7; // L: 274
		this.field4809[6] = var8; // L: 275
		this.field4809[7] = var9; // L: 276
		this.field4809[8] = var10; // L: 277
		this.field4809[9] = var11; // L: 278
		this.field4809[10] = var12; // L: 279
		this.field4809[11] = var13; // L: 280
		this.field4809[12] = var14; // L: 281
		this.field4809[13] = var15; // L: 282
		this.field4809[14] = var16; // L: 283
		this.field4809[15] = var17; // L: 284
	} // L: 285

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "71"
	)
	public float[] method8560() {
		float[] var1 = new float[3]; // L: 322
		class464 var2 = new class464(this.field4809[0], this.field4809[1], this.field4809[2]); // L: 323
		class464 var3 = new class464(this.field4809[4], this.field4809[5], this.field4809[6]); // L: 324
		class464 var4 = new class464(this.field4809[8], this.field4809[9], this.field4809[10]); // L: 325
		var1[0] = var2.method8504(); // L: 326
		var1[1] = var3.method8504(); // L: 327
		var1[2] = var4.method8504(); // L: 328
		return var1; // L: 329
	}

	public int hashCode() {
		boolean var1 = true; // L: 307
		byte var2 = 1; // L: 308
		int var3 = 31 * var2 + Arrays.hashCode(this.field4809); // L: 309
		return var3; // L: 310
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder(); // L: 290
		this.method8542(); // L: 291
		this.method8544(); // L: 292

		for (int var2 = 0; var2 < 4; ++var2) { // L: 293
			for (int var3 = 0; var3 < 4; ++var3) { // L: 294
				if (var3 > 0) {
					var1.append("\t"); // L: 295
				}

				float var4 = this.field4809[var3 + var2 * 4]; // L: 296
				if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5D) { // L: 297
					var4 = 0.0F;
				}

				var1.append(var4); // L: 298
			}

			var1.append("\n"); // L: 300
		}

		return var1.toString(); // L: 302
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class466)) { // L: 315
			return false;
		} else {
			class466 var2 = (class466)var1; // L: 316

			for (int var3 = 0; var3 < 16; ++var3) { // L: 317
				if (this.field4809[var3] != var2.field4809[var3]) {
					return false;
				}
			}

			return true; // L: 318
		}
	}

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1190086448"
	)
	static final void method8613() {
		World.method1896(false); // L: 5983
		Client.field566 = 0; // L: 5984
		boolean var0 = true; // L: 5985

		int var1;
		for (var1 = 0; var1 < class319.regionLandArchives.length; ++var1) { // L: 5986
			if (WorldMapData_0.regionMapArchiveIds[var1] != -1 && class319.regionLandArchives[var1] == null) { // L: 5987 5988
				class319.regionLandArchives[var1] = class30.archive9.takeFile(WorldMapData_0.regionMapArchiveIds[var1], 0); // L: 5989
				if (class319.regionLandArchives[var1] == null) { // L: 5990
					var0 = false; // L: 5991
					++Client.field566; // L: 5992
				}
			}

			if (class364.regionLandArchiveIds[var1] != -1 && class341.regionMapArchives[var1] == null) { // L: 5996 5997
				class341.regionMapArchives[var1] = class30.archive9.takeFileEncrypted(class364.regionLandArchiveIds[var1], 0, class166.xteaKeys[var1]); // L: 5998
				if (class341.regionMapArchives[var1] == null) { // L: 5999
					var0 = false; // L: 6000
					++Client.field566; // L: 6001
				}
			}
		}

		if (!var0) { // L: 6006
			Client.field568 = 1; // L: 6007
		} else {
			Client.field555 = 0; // L: 6010
			var0 = true; // L: 6011

			int var3;
			int var4;
			for (var1 = 0; var1 < class319.regionLandArchives.length; ++var1) { // L: 6012
				byte[] var17 = class341.regionMapArchives[var1]; // L: 6013
				if (var17 != null) { // L: 6014
					var3 = (class33.regions[var1] >> 8) * 64 - HealthBarDefinition.baseX * 64; // L: 6015
					var4 = (class33.regions[var1] & 255) * 64 - WorldMapScaleHandler.baseY * 64; // L: 6016
					if (Client.isInInstance) { // L: 6017
						var3 = 10; // L: 6018
						var4 = 10; // L: 6019
					}

					var0 &= class342.method6370(var17, var3, var4); // L: 6021
				}
			}

			if (!var0) { // L: 6024
				Client.field568 = 2; // L: 6025
			} else {
				if (Client.field568 != 0) { // L: 6028
					StructComposition.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				WorldMapRectangle.method5020(); // L: 6029
				GrandExchangeOfferOwnWorldComparator.scene.clear(); // L: 6030

				for (var1 = 0; var1 < 4; ++var1) { // L: 6031
					Client.collisionMaps[var1].clear();
				}

				int var2;
				for (var1 = 0; var1 < 4; ++var1) { // L: 6032
					for (var2 = 0; var2 < 104; ++var2) { // L: 6033
						for (var3 = 0; var3 < 104; ++var3) { // L: 6034
							Tiles.Tiles_renderFlags[var1][var2][var3] = 0; // L: 6035
						}
					}
				}

				WorldMapRectangle.method5020(); // L: 6039
				class482.method8743(); // L: 6040
				var1 = class319.regionLandArchives.length; // L: 6041
				WorldMapSection1.method5058(); // L: 6042
				World.method1896(true); // L: 6043
				int var5;
				if (!Client.isInInstance) { // L: 6044
					byte[] var16;
					for (var2 = 0; var2 < var1; ++var2) { // L: 6045
						var3 = (class33.regions[var2] >> 8) * 64 - HealthBarDefinition.baseX * 64; // L: 6046
						var4 = (class33.regions[var2] & 255) * 64 - WorldMapScaleHandler.baseY * 64; // L: 6047
						var16 = class319.regionLandArchives[var2]; // L: 6048
						if (var16 != null) { // L: 6049
							WorldMapRectangle.method5020(); // L: 6050
							class30.method456(var16, var3, var4, class25.field134 * 8 - 48, class184.field1925 * 8 - 48, Client.collisionMaps); // L: 6051
						}
					}

					for (var2 = 0; var2 < var1; ++var2) { // L: 6054
						var3 = (class33.regions[var2] >> 8) * 64 - HealthBarDefinition.baseX * 64; // L: 6055
						var4 = (class33.regions[var2] & 255) * 64 - WorldMapScaleHandler.baseY * 64; // L: 6056
						var16 = class319.regionLandArchives[var2]; // L: 6057
						if (var16 == null && class184.field1925 < 800) { // L: 6058
							WorldMapRectangle.method5020(); // L: 6059
							GrandExchangeOfferOwnWorldComparator.method1245(var3, var4, 64, 64); // L: 6060
						}
					}

					World.method1896(true); // L: 6063

					for (var2 = 0; var2 < var1; ++var2) { // L: 6064
						byte[] var15 = class341.regionMapArchives[var2]; // L: 6065
						if (var15 != null) { // L: 6066
							var4 = (class33.regions[var2] >> 8) * 64 - HealthBarDefinition.baseX * 64; // L: 6067
							var5 = (class33.regions[var2] & 255) * 64 - WorldMapScaleHandler.baseY * 64; // L: 6068
							WorldMapRectangle.method5020(); // L: 6069
							JagexCache.method4247(var15, var4, var5, GrandExchangeOfferOwnWorldComparator.scene, Client.collisionMaps); // L: 6070
						}
					}
				}

				int var6;
				int var7;
				int var8;
				if (Client.isInInstance) { // L: 6074
					int var9;
					int var10;
					int var11;
					for (var2 = 0; var2 < 4; ++var2) { // L: 6075
						WorldMapRectangle.method5020(); // L: 6076

						for (var3 = 0; var3 < 13; ++var3) { // L: 6077
							for (var4 = 0; var4 < 13; ++var4) { // L: 6078
								boolean var18 = false; // L: 6079
								var6 = Client.instanceChunkTemplates[var2][var3][var4]; // L: 6080
								if (var6 != -1) { // L: 6081
									var7 = var6 >> 24 & 3; // L: 6082
									var8 = var6 >> 1 & 3; // L: 6083
									var9 = var6 >> 14 & 1023; // L: 6084
									var10 = var6 >> 3 & 2047; // L: 6085
									var11 = (var9 / 8 << 8) + var10 / 8; // L: 6086

									for (int var12 = 0; var12 < class33.regions.length; ++var12) { // L: 6087
										if (class33.regions[var12] == var11 && class319.regionLandArchives[var12] != null) { // L: 6088
											int var13 = (var9 - var3) * 8; // L: 6089
											int var14 = (var10 - var4) * 8; // L: 6090
											class142.method3226(class319.regionLandArchives[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, var13, var14, Client.collisionMaps); // L: 6091
											var18 = true; // L: 6092
											break;
										}
									}
								}

								if (!var18) { // L: 6097
									class59.method1167(var2, var3 * 8, var4 * 8); // L: 6098
								}
							}
						}
					}

					for (var2 = 0; var2 < 13; ++var2) { // L: 6103
						for (var3 = 0; var3 < 13; ++var3) { // L: 6104
							var4 = Client.instanceChunkTemplates[0][var2][var3]; // L: 6105
							if (var4 == -1) { // L: 6106
								GrandExchangeOfferOwnWorldComparator.method1245(var2 * 8, var3 * 8, 8, 8); // L: 6107
							}
						}
					}

					World.method1896(true); // L: 6111

					for (var2 = 0; var2 < 4; ++var2) { // L: 6112
						WorldMapRectangle.method5020(); // L: 6113

						for (var3 = 0; var3 < 13; ++var3) { // L: 6114
							for (var4 = 0; var4 < 13; ++var4) { // L: 6115
								var5 = Client.instanceChunkTemplates[var2][var3][var4]; // L: 6116
								if (var5 != -1) { // L: 6117
									var6 = var5 >> 24 & 3; // L: 6118
									var7 = var5 >> 1 & 3; // L: 6119
									var8 = var5 >> 14 & 1023; // L: 6120
									var9 = var5 >> 3 & 2047; // L: 6121
									var10 = (var8 / 8 << 8) + var9 / 8; // L: 6122

									for (var11 = 0; var11 < class33.regions.length; ++var11) { // L: 6123
										if (class33.regions[var11] == var10 && class341.regionMapArchives[var11] != null) { // L: 6124
											Tiles.method2274(class341.regionMapArchives[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7, GrandExchangeOfferOwnWorldComparator.scene, Client.collisionMaps); // L: 6125
											break; // L: 6126
										}
									}
								}
							}
						}
					}
				}

				World.method1896(true); // L: 6134
				WorldMapRectangle.method5020(); // L: 6135
				UserComparator9.method2979(GrandExchangeOfferOwnWorldComparator.scene, Client.collisionMaps); // L: 6136
				World.method1896(true); // L: 6137
				var2 = Tiles.Tiles_minPlane; // L: 6138
				if (var2 > class113.Client_plane) { // L: 6139
					var2 = class113.Client_plane;
				}

				if (var2 < class113.Client_plane - 1) { // L: 6140
					var2 = class113.Client_plane - 1;
				}

				if (Client.isLowDetail) { // L: 6141
					GrandExchangeOfferOwnWorldComparator.scene.init(Tiles.Tiles_minPlane);
				} else {
					GrandExchangeOfferOwnWorldComparator.scene.init(0); // L: 6142
				}

				for (var3 = 0; var3 < 104; ++var3) { // L: 6143
					for (var4 = 0; var4 < 104; ++var4) { // L: 6144
						class134.method3141(class113.Client_plane, var3, var4); // L: 6145
					}
				}

				WorldMapRectangle.method5020(); // L: 6148
				BuddyRankComparator.method2990(); // L: 6149
				ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 6150
				PacketBufferNode var19;
				if (VertexNormal.client.hasFrame()) { // L: 6151
					var19 = class482.getPacketBufferNode(ClientPacket.field3234, Client.packetWriter.isaacCipher); // L: 6153
					var19.packetBuffer.method9373(1057001181); // L: 6154
					Client.packetWriter.addNode(var19); // L: 6155
				}

				if (!Client.isInInstance) { // L: 6157
					var3 = (class25.field134 - 6) / 8; // L: 6158
					var4 = (class25.field134 + 6) / 8; // L: 6159
					var5 = (class184.field1925 - 6) / 8; // L: 6160
					var6 = (class184.field1925 + 6) / 8; // L: 6161

					for (var7 = var3 - 1; var7 <= var4 + 1; ++var7) { // L: 6162
						for (var8 = var5 - 1; var8 <= var6 + 1; ++var8) { // L: 6163
							if (var7 < var3 || var7 > var4 || var8 < var5 || var8 > var6) { // L: 6164
								class30.archive9.loadRegionFromName("m" + var7 + "_" + var8); // L: 6165
								class30.archive9.loadRegionFromName("l" + var7 + "_" + var8); // L: 6166
							}
						}
					}
				}

				class131.method3087(30); // L: 6170
				WorldMapRectangle.method5020(); // L: 6171
				class148.method3273(); // L: 6172
				var19 = class482.getPacketBufferNode(ClientPacket.field3230, Client.packetWriter.isaacCipher); // L: 6173
				Client.packetWriter.addNode(var19); // L: 6174
				WorldMapLabelSize.method4610(); // L: 6175
			}
		}
	} // L: 6008 6026 6176
}
