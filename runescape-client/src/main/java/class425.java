import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qj")
public final class class425 {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[Lqj;"
	)
	public static class425[] field4665;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -2095080743
	)
	static int field4669;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -910698341
	)
	public static int field4667;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	public static final class425 field4664;
	@ObfuscatedName("jg")
	@ObfuscatedGetter(
		intValue = 583188571
	)
	static int field4671;
	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "[Ltq;"
	)
	@Export("headIconPrayerSprites")
	static SpritePixels[] headIconPrayerSprites;
	@ObfuscatedName("au")
	public float[] field4670;

	static {
		field4665 = new class425[0]; // L: 9
		WorldMapSection1.method5509(100); // L: 14
		field4664 = new class425(); // L: 18
	}

	public class425() {
		this.field4670 = new float[16];
		this.method8177(); // L: 33
	} // L: 34

	@ObfuscatedSignature(
		descriptor = "(Lqj;)V"
	)
	public class425(class425 var1) {
		this.field4670 = new float[16];
		this.method8179(var1); // L: 37
	} // L: 38

	@ObfuscatedSignature(
		descriptor = "(Lsg;Z)V"
	)
	public class425(Buffer var1, boolean var2) {
		this.field4670 = new float[16]; // L: 17
		this.method8174(var1, var2); // L: 41
	} // L: 42

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1198141071"
	)
	public void method8176() {
		synchronized(field4665) { // L: 27
			if (field4667 < field4669 - 1) { // L: 28
				field4665[++field4667 - 1] = this;
			}

		}
	} // L: 30

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lsg;ZB)V",
		garbageValue = "39"
	)
	void method8174(Buffer var1, boolean var2) {
		if (var2) { // L: 45
			class426 var4 = new class426(); // L: 46
			var4.method8246(MusicPatchNode.method5985(var1.readShort())); // L: 47
			var4.method8247(MusicPatchNode.method5985(var1.readShort())); // L: 48
			var4.method8248(MusicPatchNode.method5985(var1.readShort())); // L: 49
			var4.method8245((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort()); // L: 50
			this.method8185(var4); // L: 51
		} else {
			for (int var3 = 0; var3 < 16; ++var3) { // L: 54
				this.field4670[var3] = var1.method9064(); // L: 55
			}
		}

	} // L: 58

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(S)[F",
		garbageValue = "18255"
	)
	float[] method8175() {
		float[] var1 = new float[3]; // L: 61
		if ((double)this.field4670[2] < 0.999D && (double)this.field4670[2] > -0.999D) { // L: 62
			var1[1] = (float)(-Math.asin((double)this.field4670[2])); // L: 63
			double var2 = Math.cos((double)var1[1]); // L: 64
			var1[0] = (float)Math.atan2((double)this.field4670[6] / var2, (double)this.field4670[10] / var2); // L: 65
			var1[2] = (float)Math.atan2((double)this.field4670[1] / var2, (double)this.field4670[0] / var2); // L: 66
		} else {
			var1[0] = 0.0F; // L: 69
			var1[1] = (float)Math.atan2((double)this.field4670[2], 0.0D); // L: 70
			var1[2] = (float)Math.atan2((double)(-this.field4670[9]), (double)this.field4670[5]); // L: 71
		}

		return var1; // L: 73
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "2011587647"
	)
	public float[] method8173() {
		float[] var1 = new float[]{(float)(-Math.asin((double)this.field4670[6])), 0.0F, 0.0F}; // L: 77 78
		double var2 = Math.cos((double)var1[0]); // L: 79
		double var4;
		double var6;
		if (Math.abs(var2) > 0.005D) { // L: 80
			var4 = (double)this.field4670[2]; // L: 81
			var6 = (double)this.field4670[10]; // L: 82
			double var8 = (double)this.field4670[4]; // L: 83
			double var10 = (double)this.field4670[5]; // L: 84
			var1[1] = (float)Math.atan2(var4, var6); // L: 85
			var1[2] = (float)Math.atan2(var8, var10); // L: 86
		} else {
			var4 = (double)this.field4670[1]; // L: 89
			var6 = (double)this.field4670[0]; // L: 90
			if (this.field4670[6] < 0.0F) { // L: 91
				var1[1] = (float)Math.atan2(var4, var6); // L: 92
			} else {
				var1[1] = (float)(-Math.atan2(var4, var6)); // L: 95
			}

			var1[2] = 0.0F; // L: 97
		}

		return var1; // L: 99
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-10"
	)
	public void method8177() {
		this.field4670[0] = 1.0F; // L: 103
		this.field4670[1] = 0.0F; // L: 104
		this.field4670[2] = 0.0F; // L: 105
		this.field4670[3] = 0.0F; // L: 106
		this.field4670[4] = 0.0F;
		this.field4670[5] = 1.0F; // L: 108
		this.field4670[6] = 0.0F; // L: 109
		this.field4670[7] = 0.0F; // L: 110
		this.field4670[8] = 0.0F; // L: 111
		this.field4670[9] = 0.0F; // L: 112
		this.field4670[10] = 1.0F; // L: 113
		this.field4670[11] = 0.0F; // L: 114
		this.field4670[12] = 0.0F; // L: 115
		this.field4670[13] = 0.0F; // L: 116
		this.field4670[14] = 0.0F; // L: 117
		this.field4670[15] = 1.0F; // L: 118
	} // L: 119

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1283851159"
	)
	public void method8178() {
		this.field4670[0] = 0.0F; // L: 122
		this.field4670[1] = 0.0F; // L: 123
		this.field4670[2] = 0.0F; // L: 124
		this.field4670[3] = 0.0F; // L: 125
		this.field4670[4] = 0.0F; // L: 126
		this.field4670[5] = 0.0F; // L: 127
		this.field4670[6] = 0.0F; // L: 128
		this.field4670[7] = 0.0F; // L: 129
		this.field4670[8] = 0.0F; // L: 130
		this.field4670[9] = 0.0F; // L: 131
		this.field4670[10] = 0.0F; // L: 132
		this.field4670[11] = 0.0F; // L: 133
		this.field4670[12] = 0.0F; // L: 134
		this.field4670[13] = 0.0F; // L: 135
		this.field4670[14] = 0.0F; // L: 136
		this.field4670[15] = 0.0F; // L: 137
	} // L: 138

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lqj;I)V",
		garbageValue = "1919850341"
	)
	public void method8179(class425 var1) {
		System.arraycopy(var1.field4670, 0, this.field4670, 0, 16); // L: 141
	} // L: 142

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-2059885087"
	)
	public void method8180(float var1) {
		this.method8223(var1, var1, var1); // L: 145
	} // L: 146

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "-814200416"
	)
	public void method8223(float var1, float var2, float var3) {
		this.method8177(); // L: 149
		this.field4670[0] = var1; // L: 150
		this.field4670[5] = var2; // L: 151
		this.field4670[10] = var3; // L: 152
	} // L: 153

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lqj;I)V",
		garbageValue = "-1643954745"
	)
	public void method8182(class425 var1) {
		for (int var2 = 0; var2 < this.field4670.length; ++var2) { // L: 156
			float[] var10000 = this.field4670; // L: 157
			var10000[var2] += var1.field4670[var2];
		}

	} // L: 159

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lqj;I)V",
		garbageValue = "2018256268"
	)
	public void method8183(class425 var1) {
		float var2 = this.field4670[3] * var1.field4670[12] + this.field4670[2] * var1.field4670[8] + var1.field4670[4] * this.field4670[1] + var1.field4670[0] * this.field4670[0]; // L: 162
		float var3 = var1.field4670[13] * this.field4670[3] + var1.field4670[1] * this.field4670[0] + this.field4670[1] * var1.field4670[5] + var1.field4670[9] * this.field4670[2]; // L: 163
		float var4 = this.field4670[0] * var1.field4670[2] + var1.field4670[6] * this.field4670[1] + this.field4670[2] * var1.field4670[10] + var1.field4670[14] * this.field4670[3]; // L: 164
		float var5 = this.field4670[2] * var1.field4670[11] + this.field4670[1] * var1.field4670[7] + this.field4670[0] * var1.field4670[3] + this.field4670[3] * var1.field4670[15]; // L: 165
		float var6 = this.field4670[5] * var1.field4670[4] + this.field4670[4] * var1.field4670[0] + var1.field4670[8] * this.field4670[6] + this.field4670[7] * var1.field4670[12]; // L: 166
		float var7 = var1.field4670[13] * this.field4670[7] + this.field4670[6] * var1.field4670[9] + this.field4670[5] * var1.field4670[5] + var1.field4670[1] * this.field4670[4]; // L: 167
		float var8 = var1.field4670[2] * this.field4670[4] + this.field4670[5] * var1.field4670[6] + var1.field4670[10] * this.field4670[6] + var1.field4670[14] * this.field4670[7]; // L: 168
		float var9 = this.field4670[6] * var1.field4670[11] + var1.field4670[3] * this.field4670[4] + var1.field4670[7] * this.field4670[5] + this.field4670[7] * var1.field4670[15]; // L: 169
		float var10 = var1.field4670[0] * this.field4670[8] + this.field4670[9] * var1.field4670[4] + var1.field4670[8] * this.field4670[10] + this.field4670[11] * var1.field4670[12]; // L: 170
		float var11 = var1.field4670[13] * this.field4670[11] + this.field4670[9] * var1.field4670[5] + var1.field4670[1] * this.field4670[8] + this.field4670[10] * var1.field4670[9]; // L: 171
		float var12 = this.field4670[11] * var1.field4670[14] + var1.field4670[6] * this.field4670[9] + var1.field4670[2] * this.field4670[8] + this.field4670[10] * var1.field4670[10]; // L: 172
		float var13 = var1.field4670[3] * this.field4670[8] + var1.field4670[7] * this.field4670[9] + this.field4670[10] * var1.field4670[11] + this.field4670[11] * var1.field4670[15]; // L: 173
		float var14 = this.field4670[14] * var1.field4670[8] + var1.field4670[4] * this.field4670[13] + this.field4670[12] * var1.field4670[0] + this.field4670[15] * var1.field4670[12]; // L: 174
		float var15 = this.field4670[12] * var1.field4670[1] + this.field4670[13] * var1.field4670[5] + this.field4670[14] * var1.field4670[9] + this.field4670[15] * var1.field4670[13]; // L: 175
		float var16 = var1.field4670[14] * this.field4670[15] + var1.field4670[2] * this.field4670[12] + this.field4670[13] * var1.field4670[6] + var1.field4670[10] * this.field4670[14]; // L: 176
		float var17 = var1.field4670[7] * this.field4670[13] + this.field4670[12] * var1.field4670[3] + this.field4670[14] * var1.field4670[11] + var1.field4670[15] * this.field4670[15]; // L: 177
		this.field4670[0] = var2; // L: 178
		this.field4670[1] = var3; // L: 179
		this.field4670[2] = var4; // L: 180
		this.field4670[3] = var5; // L: 181
		this.field4670[4] = var6; // L: 182
		this.field4670[5] = var7; // L: 183
		this.field4670[6] = var8; // L: 184
		this.field4670[7] = var9; // L: 185
		this.field4670[8] = var10; // L: 186
		this.field4670[9] = var11; // L: 187
		this.field4670[10] = var12; // L: 188
		this.field4670[11] = var13; // L: 189
		this.field4670[12] = var14; // L: 190
		this.field4670[13] = var15; // L: 191
		this.field4670[14] = var16; // L: 192
		this.field4670[15] = var17; // L: 193
	} // L: 194

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lqx;B)V",
		garbageValue = "-48"
	)
	public void method8184(class424 var1) {
		float var2 = var1.field4663 * var1.field4663; // L: 197
		float var3 = var1.field4663 * var1.field4660; // L: 198
		float var4 = var1.field4661 * var1.field4663; // L: 199
		float var5 = var1.field4663 * var1.field4662; // L: 200
		float var6 = var1.field4660 * var1.field4660; // L: 201
		float var7 = var1.field4660 * var1.field4661; // L: 202
		float var8 = var1.field4662 * var1.field4660; // L: 203
		float var9 = var1.field4661 * var1.field4661; // L: 204
		float var10 = var1.field4662 * var1.field4661; // L: 205
		float var11 = var1.field4662 * var1.field4662; // L: 206
		this.field4670[0] = var6 + var2 - var11 - var9; // L: 207
		this.field4670[1] = var5 + var7 + var5 + var7; // L: 208
		this.field4670[2] = var8 + (var8 - var4 - var4); // L: 209
		this.field4670[4] = var7 + (var7 - var5 - var5); // L: 210
		this.field4670[5] = var9 + var2 - var6 - var11; // L: 211
		this.field4670[6] = var10 + var3 + var10 + var3; // L: 212
		this.field4670[8] = var4 + var8 + var4 + var8; // L: 213
		this.field4670[9] = var10 - var3 - var3 + var10; // L: 214
		this.field4670[10] = var2 + var11 - var9 - var6; // L: 215
	} // L: 216

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lqc;B)V",
		garbageValue = "87"
	)
	void method8185(class426 var1) {
		this.field4670[0] = var1.field4686; // L: 219
		this.field4670[1] = var1.field4675; // L: 220
		this.field4670[2] = var1.field4676; // L: 221
		this.field4670[3] = 0.0F; // L: 222
		this.field4670[4] = var1.field4677; // L: 223
		this.field4670[5] = var1.field4678; // L: 224
		this.field4670[6] = var1.field4679; // L: 225
		this.field4670[7] = 0.0F; // L: 226
		this.field4670[8] = var1.field4680; // L: 227
		this.field4670[9] = var1.field4681; // L: 228
		this.field4670[10] = var1.field4682; // L: 229
		this.field4670[11] = 0.0F; // L: 230
		this.field4670[12] = var1.field4683; // L: 231
		this.field4670[13] = var1.field4684; // L: 232
		this.field4670[14] = var1.field4685; // L: 233
		this.field4670[15] = 1.0F; // L: 234
	} // L: 235

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "-671681757"
	)
	float method8186() {
		return this.field4670[8] * this.field4670[7] * this.field4670[2] * this.field4670[13] + this.field4670[2] * this.field4670[5] * this.field4670[11] * this.field4670[12] + (this.field4670[4] * this.field4670[2] * this.field4670[9] * this.field4670[15] + this.field4670[12] * this.field4670[1] * this.field4670[7] * this.field4670[10] + (this.field4670[8] * this.field4670[6] * this.field4670[1] * this.field4670[15] + this.field4670[14] * this.field4670[1] * this.field4670[4] * this.field4670[11] + (this.field4670[0] * this.field4670[7] * this.field4670[9] * this.field4670[14] + this.field4670[0] * this.field4670[6] * this.field4670[11] * this.field4670[13] + (this.field4670[5] * this.field4670[0] * this.field4670[10] * this.field4670[15] - this.field4670[14] * this.field4670[5] * this.field4670[0] * this.field4670[11] - this.field4670[15] * this.field4670[0] * this.field4670[6] * this.field4670[9]) - this.field4670[10] * this.field4670[0] * this.field4670[7] * this.field4670[13] - this.field4670[1] * this.field4670[4] * this.field4670[10] * this.field4670[15]) - this.field4670[12] * this.field4670[11] * this.field4670[1] * this.field4670[6] - this.field4670[14] * this.field4670[1] * this.field4670[7] * this.field4670[8]) - this.field4670[2] * this.field4670[4] * this.field4670[11] * this.field4670[13] - this.field4670[15] * this.field4670[2] * this.field4670[5] * this.field4670[8]) - this.field4670[12] * this.field4670[9] * this.field4670[2] * this.field4670[7] - this.field4670[9] * this.field4670[3] * this.field4670[4] * this.field4670[14] + this.field4670[13] * this.field4670[10] * this.field4670[4] * this.field4670[3] + this.field4670[3] * this.field4670[5] * this.field4670[8] * this.field4670[14] - this.field4670[12] * this.field4670[5] * this.field4670[3] * this.field4670[10] - this.field4670[8] * this.field4670[6] * this.field4670[3] * this.field4670[13] + this.field4670[12] * this.field4670[3] * this.field4670[6] * this.field4670[9]; // L: 238
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-49766360"
	)
	public void method8197() {
		float var1 = 1.0F / this.method8186(); // L: 242
		float var2 = var1 * (this.field4670[7] * this.field4670[9] * this.field4670[14] + this.field4670[11] * this.field4670[6] * this.field4670[13] + (this.field4670[5] * this.field4670[10] * this.field4670[15] - this.field4670[14] * this.field4670[5] * this.field4670[11] - this.field4670[6] * this.field4670[9] * this.field4670[15]) - this.field4670[13] * this.field4670[7] * this.field4670[10]); // L: 243
		float var3 = (-this.field4670[1] * this.field4670[10] * this.field4670[15] + this.field4670[1] * this.field4670[11] * this.field4670[14] + this.field4670[15] * this.field4670[2] * this.field4670[9] - this.field4670[11] * this.field4670[2] * this.field4670[13] - this.field4670[14] * this.field4670[3] * this.field4670[9] + this.field4670[3] * this.field4670[10] * this.field4670[13]) * var1; // L: 244
		float var4 = var1 * (this.field4670[7] * this.field4670[2] * this.field4670[13] + (this.field4670[15] * this.field4670[6] * this.field4670[1] - this.field4670[1] * this.field4670[7] * this.field4670[14] - this.field4670[15] * this.field4670[5] * this.field4670[2]) + this.field4670[14] * this.field4670[3] * this.field4670[5] - this.field4670[6] * this.field4670[3] * this.field4670[13]); // L: 245
		float var5 = var1 * (this.field4670[9] * this.field4670[3] * this.field4670[6] + (this.field4670[5] * this.field4670[2] * this.field4670[11] + this.field4670[1] * this.field4670[7] * this.field4670[10] + this.field4670[11] * this.field4670[6] * -this.field4670[1] - this.field4670[9] * this.field4670[2] * this.field4670[7] - this.field4670[10] * this.field4670[3] * this.field4670[5])); // L: 246
		float var6 = var1 * (this.field4670[12] * this.field4670[10] * this.field4670[7] + (this.field4670[15] * this.field4670[8] * this.field4670[6] + this.field4670[11] * this.field4670[4] * this.field4670[14] + this.field4670[15] * -this.field4670[4] * this.field4670[10] - this.field4670[6] * this.field4670[11] * this.field4670[12] - this.field4670[7] * this.field4670[8] * this.field4670[14])); // L: 247
		float var7 = (this.field4670[12] * this.field4670[2] * this.field4670[11] + (this.field4670[15] * this.field4670[10] * this.field4670[0] - this.field4670[14] * this.field4670[11] * this.field4670[0] - this.field4670[8] * this.field4670[2] * this.field4670[15]) + this.field4670[14] * this.field4670[3] * this.field4670[8] - this.field4670[12] * this.field4670[3] * this.field4670[10]) * var1; // L: 248
		float var8 = var1 * (this.field4670[12] * this.field4670[6] * this.field4670[3] + (this.field4670[15] * -this.field4670[0] * this.field4670[6] + this.field4670[14] * this.field4670[7] * this.field4670[0] + this.field4670[2] * this.field4670[4] * this.field4670[15] - this.field4670[2] * this.field4670[7] * this.field4670[12] - this.field4670[14] * this.field4670[4] * this.field4670[3])); // L: 249
		float var9 = var1 * (this.field4670[4] * this.field4670[3] * this.field4670[10] + this.field4670[8] * this.field4670[7] * this.field4670[2] + (this.field4670[0] * this.field4670[6] * this.field4670[11] - this.field4670[10] * this.field4670[7] * this.field4670[0] - this.field4670[11] * this.field4670[2] * this.field4670[4]) - this.field4670[6] * this.field4670[3] * this.field4670[8]); // L: 250
		float var10 = var1 * (this.field4670[13] * this.field4670[7] * this.field4670[8] + this.field4670[5] * this.field4670[11] * this.field4670[12] + (this.field4670[15] * this.field4670[9] * this.field4670[4] - this.field4670[4] * this.field4670[11] * this.field4670[13] - this.field4670[8] * this.field4670[5] * this.field4670[15]) - this.field4670[12] * this.field4670[7] * this.field4670[9]); // L: 251
		float var11 = var1 * (this.field4670[9] * -this.field4670[0] * this.field4670[15] + this.field4670[0] * this.field4670[11] * this.field4670[13] + this.field4670[1] * this.field4670[8] * this.field4670[15] - this.field4670[1] * this.field4670[11] * this.field4670[12] - this.field4670[8] * this.field4670[3] * this.field4670[13] + this.field4670[12] * this.field4670[9] * this.field4670[3]); // L: 252
		float var12 = var1 * (this.field4670[5] * this.field4670[0] * this.field4670[15] - this.field4670[13] * this.field4670[0] * this.field4670[7] - this.field4670[1] * this.field4670[4] * this.field4670[15] + this.field4670[12] * this.field4670[7] * this.field4670[1] + this.field4670[3] * this.field4670[4] * this.field4670[13] - this.field4670[3] * this.field4670[5] * this.field4670[12]); // L: 253
		float var13 = (this.field4670[4] * this.field4670[1] * this.field4670[11] + this.field4670[9] * this.field4670[0] * this.field4670[7] + -this.field4670[0] * this.field4670[5] * this.field4670[11] - this.field4670[1] * this.field4670[7] * this.field4670[8] - this.field4670[3] * this.field4670[4] * this.field4670[9] + this.field4670[3] * this.field4670[5] * this.field4670[8]) * var1; // L: 254
		float var14 = (this.field4670[12] * this.field4670[9] * this.field4670[6] + (this.field4670[9] * -this.field4670[4] * this.field4670[14] + this.field4670[4] * this.field4670[10] * this.field4670[13] + this.field4670[8] * this.field4670[5] * this.field4670[14] - this.field4670[12] * this.field4670[10] * this.field4670[5] - this.field4670[8] * this.field4670[6] * this.field4670[13])) * var1; // L: 255
		float var15 = (this.field4670[12] * this.field4670[1] * this.field4670[10] + (this.field4670[9] * this.field4670[0] * this.field4670[14] - this.field4670[10] * this.field4670[0] * this.field4670[13] - this.field4670[14] * this.field4670[1] * this.field4670[8]) + this.field4670[8] * this.field4670[2] * this.field4670[13] - this.field4670[2] * this.field4670[9] * this.field4670[12]) * var1; // L: 256
		float var16 = var1 * (this.field4670[14] * this.field4670[1] * this.field4670[4] + this.field4670[5] * -this.field4670[0] * this.field4670[14] + this.field4670[6] * this.field4670[0] * this.field4670[13] - this.field4670[12] * this.field4670[1] * this.field4670[6] - this.field4670[4] * this.field4670[2] * this.field4670[13] + this.field4670[5] * this.field4670[2] * this.field4670[12]); // L: 257
		float var17 = var1 * (this.field4670[10] * this.field4670[5] * this.field4670[0] - this.field4670[9] * this.field4670[6] * this.field4670[0] - this.field4670[10] * this.field4670[1] * this.field4670[4] + this.field4670[8] * this.field4670[1] * this.field4670[6] + this.field4670[4] * this.field4670[2] * this.field4670[9] - this.field4670[8] * this.field4670[5] * this.field4670[2]); // L: 258
		this.field4670[0] = var2; // L: 259
		this.field4670[1] = var3; // L: 260
		this.field4670[2] = var4; // L: 261
		this.field4670[3] = var5; // L: 262
		this.field4670[4] = var6; // L: 263
		this.field4670[5] = var7; // L: 264
		this.field4670[6] = var8; // L: 265
		this.field4670[7] = var9; // L: 266
		this.field4670[8] = var10; // L: 267
		this.field4670[9] = var11; // L: 268
		this.field4670[10] = var12; // L: 269
		this.field4670[11] = var13; // L: 270
		this.field4670[12] = var14; // L: 271
		this.field4670[13] = var15; // L: 272
		this.field4670[14] = var16; // L: 273
		this.field4670[15] = var17; // L: 274
	} // L: 275

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "-1193193638"
	)
	public float[] method8224() {
		float[] var1 = new float[3]; // L: 312
		class423 var2 = new class423(this.field4670[0], this.field4670[1], this.field4670[2]); // L: 313
		class423 var3 = new class423(this.field4670[4], this.field4670[5], this.field4670[6]); // L: 314
		class423 var4 = new class423(this.field4670[8], this.field4670[9], this.field4670[10]); // L: 315
		var1[0] = var2.method8131(); // L: 316
		var1[1] = var3.method8131(); // L: 317
		var1[2] = var4.method8131(); // L: 318
		return var1; // L: 319
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder(); // L: 280
		this.method8173(); // L: 281
		this.method8175(); // L: 282

		for (int var2 = 0; var2 < 4; ++var2) { // L: 283
			for (int var3 = 0; var3 < 4; ++var3) { // L: 284
				if (var3 > 0) {
					var1.append("\t"); // L: 285
				}

				float var4 = this.field4670[var3 + var2 * 4]; // L: 286
				if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5D) { // L: 287
					var4 = 0.0F;
				}

				var1.append(var4); // L: 288
			}

			var1.append("\n"); // L: 290
		}

		return var1.toString(); // L: 292
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class425)) { // L: 305
			return false;
		} else {
			class425 var2 = (class425)var1; // L: 306

			for (int var3 = 0; var3 < 16; ++var3) { // L: 307
				if (var2.field4670[var3] != this.field4670[var3]) {
					return false;
				}
			}

			return true; // L: 308
		}
	}

	public int hashCode() {
		boolean var1 = true; // L: 297
		byte var2 = 1; // L: 298
		int var3 = var2 * 31 + Arrays.hashCode(this.field4670); // L: 299
		return var3; // L: 300
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfl;",
		garbageValue = "1631895479"
	)
	static class134[] method8243() {
		return new class134[]{class134.field1603, class134.field1610, class134.field1602, class134.field1605, class134.field1599, class134.field1604, class134.field1600, class134.field1606, class134.field1607}; // L: 107
	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1975852814"
	)
	static final int method8242(int var0) {
		return Math.abs(var0 - class125.cameraYaw) > 1024 ? (var0 < class125.cameraYaw ? 1 : -1) * 2048 + var0 : var0; // L: 3689 3690
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "32"
	)
	static final void method8244() {
		boolean var0 = false; // L: 9607

		while (!var0) { // L: 9608
			var0 = true; // L: 9609

			for (int var1 = 0; var1 < Client.menuOptionsCount - 1; ++var1) { // L: 9610
				if (Client.menuOpcodes[var1] < 1000 && Client.menuOpcodes[var1 + 1] > 1000) { // L: 9611
					String var2 = Client.menuTargets[var1]; // L: 9612
					Client.menuTargets[var1] = Client.menuTargets[var1 + 1]; // L: 9613
					Client.menuTargets[var1 + 1] = var2; // L: 9614
					String var3 = Client.menuActions[var1]; // L: 9615
					Client.menuActions[var1] = Client.menuActions[var1 + 1]; // L: 9616
					Client.menuActions[var1 + 1] = var3; // L: 9617
					int var4 = Client.menuOpcodes[var1]; // L: 9618
					Client.menuOpcodes[var1] = Client.menuOpcodes[var1 + 1]; // L: 9619
					Client.menuOpcodes[var1 + 1] = var4; // L: 9620
					var4 = Client.menuArguments1[var1]; // L: 9621
					Client.menuArguments1[var1] = Client.menuArguments1[var1 + 1]; // L: 9622
					Client.menuArguments1[var1 + 1] = var4; // L: 9623
					var4 = Client.menuArguments2[var1]; // L: 9624
					Client.menuArguments2[var1] = Client.menuArguments2[var1 + 1]; // L: 9625
					Client.menuArguments2[var1 + 1] = var4; // L: 9626
					var4 = Client.menuIdentifiers[var1]; // L: 9627
					Client.menuIdentifiers[var1] = Client.menuIdentifiers[var1 + 1]; // L: 9628
					Client.menuIdentifiers[var1 + 1] = var4; // L: 9629
					var4 = Client.field637[var1]; // L: 9630
					Client.field637[var1] = Client.field637[var1 + 1]; // L: 9631
					Client.field637[var1 + 1] = var4; // L: 9632
					boolean var5 = Client.menuShiftClick[var1]; // L: 9633
					Client.menuShiftClick[var1] = Client.menuShiftClick[var1 + 1]; // L: 9634
					Client.menuShiftClick[var1 + 1] = var5; // L: 9635
					var0 = false; // L: 9636
				}
			}
		}

	} // L: 9640
}
