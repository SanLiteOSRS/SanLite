import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ov")
public final class class407 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	public static final class407 field4567;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "[Lov;"
	)
	static class407[] field4563;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 372979687
	)
	static int field4564;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -61693019
	)
	static int field4565;
	@ObfuscatedName("j")
	public float[] field4566;

	static {
		field4563 = new class407[0]; // L: 9
		field4564 = 100; // L: 15
		field4563 = new class407[100]; // L: 16
		field4565 = 0; // L: 17
		field4567 = new class407();
	} // L: 22

	public class407() {
		this.field4566 = new float[16];
		this.method7646(); // L: 41
	} // L: 42

	@ObfuscatedSignature(
		descriptor = "(Lov;)V"
	)
	public class407(class407 var1) {
		this.field4566 = new float[16];
		this.method7648(var1); // L: 45
	} // L: 46

	@ObfuscatedSignature(
		descriptor = "(Lqr;Z)V"
	)
	public class407(Buffer var1, boolean var2) {
		this.field4566 = new float[16]; // L: 21
		this.method7689(var1, var2); // L: 49
	} // L: 50

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1357090508"
	)
	public void method7695() {
		synchronized(field4563) { // L: 35
			if (field4565 < field4564 - 1) { // L: 36
				field4563[++field4565 - 1] = this;
			}

		}
	} // L: 38

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqr;ZI)V",
		garbageValue = "164819171"
	)
	void method7689(Buffer var1, boolean var2) {
		if (var2) { // L: 53
			class408 var10 = new class408(); // L: 54
			int var6 = var1.readShort(); // L: 57
			var6 &= 16383; // L: 59
			float var5 = (float)((double)((float)var6 / 16384.0F) * 6.283185307179586D); // L: 60
			var10.method7712(var5); // L: 62
			var10.method7730(StructComposition.method3677(var1.readShort())); // L: 63
			int var9 = var1.readShort(); // L: 66
			var9 &= 16383; // L: 68
			float var8 = (float)((double)((float)var9 / 16384.0F) * 6.283185307179586D); // L: 69
			var10.method7731(var8); // L: 71
			var10.method7714((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort()); // L: 72
			this.method7654(var10); // L: 73
		} else {
			for (int var3 = 0; var3 < 16; ++var3) { // L: 76
				this.field4566[var3] = var1.method8410(); // L: 77
			}
		}

	} // L: 80

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "531737565"
	)
	float[] method7644() {
		float[] var1 = new float[3]; // L: 83
		if ((double)this.field4566[2] < 0.999D && (double)this.field4566[2] > -0.999D) { // L: 84
			var1[1] = (float)(-Math.asin((double)this.field4566[2])); // L: 85
			double var2 = Math.cos((double)var1[1]); // L: 86
			var1[0] = (float)Math.atan2((double)this.field4566[6] / var2, (double)this.field4566[10] / var2); // L: 87
			var1[2] = (float)Math.atan2((double)this.field4566[1] / var2, (double)this.field4566[0] / var2); // L: 88
		} else {
			var1[0] = 0.0F; // L: 91
			var1[1] = (float)Math.atan2((double)this.field4566[2], 0.0D); // L: 92
			var1[2] = (float)Math.atan2((double)(-this.field4566[9]), (double)this.field4566[5]); // L: 93
		}

		return var1; // L: 95
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "1571625008"
	)
	public float[] method7645() {
		float[] var1 = new float[]{(float)(-Math.asin((double)this.field4566[6])), 0.0F, 0.0F}; // L: 99 100
		double var2 = Math.cos((double)var1[0]); // L: 101
		double var4;
		double var6;
		if (Math.abs(var2) > 0.005D) { // L: 102
			var4 = (double)this.field4566[2]; // L: 103
			var6 = (double)this.field4566[10]; // L: 104
			double var8 = (double)this.field4566[4]; // L: 105
			double var10 = (double)this.field4566[5]; // L: 106
			var1[1] = (float)Math.atan2(var4, var6); // L: 107
			var1[2] = (float)Math.atan2(var8, var10); // L: 108
		} else {
			var4 = (double)this.field4566[1]; // L: 111
			var6 = (double)this.field4566[0]; // L: 112
			if (this.field4566[6] < 0.0F) { // L: 113
				var1[1] = (float)Math.atan2(var4, var6); // L: 114
			} else {
				var1[1] = (float)(-Math.atan2(var4, var6)); // L: 117
			}

			var1[2] = 0.0F; // L: 119
		}

		return var1; // L: 121
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1311074651"
	)
	void method7646() {
		this.field4566[0] = 1.0F; // L: 125
		this.field4566[1] = 0.0F; // L: 126
		this.field4566[2] = 0.0F; // L: 127
		this.field4566[3] = 0.0F; // L: 128
		this.field4566[4] = 0.0F; // L: 129
		this.field4566[5] = 1.0F; // L: 130
		this.field4566[6] = 0.0F; // L: 131
		this.field4566[7] = 0.0F; // L: 132
		this.field4566[8] = 0.0F; // L: 133
		this.field4566[9] = 0.0F; // L: 134
		this.field4566[10] = 1.0F; // L: 135
		this.field4566[11] = 0.0F; // L: 136
		this.field4566[12] = 0.0F; // L: 137
		this.field4566[13] = 0.0F; // L: 138
		this.field4566[14] = 0.0F; // L: 139
		this.field4566[15] = 1.0F; // L: 140
	} // L: 141

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "37"
	)
	public void method7647() {
		this.field4566[0] = 0.0F; // L: 144
		this.field4566[1] = 0.0F; // L: 145
		this.field4566[2] = 0.0F; // L: 146
		this.field4566[3] = 0.0F; // L: 147
		this.field4566[4] = 0.0F; // L: 148
		this.field4566[5] = 0.0F; // L: 149
		this.field4566[6] = 0.0F; // L: 150
		this.field4566[7] = 0.0F; // L: 151
		this.field4566[8] = 0.0F; // L: 152
		this.field4566[9] = 0.0F; // L: 153
		this.field4566[10] = 0.0F; // L: 154
		this.field4566[11] = 0.0F; // L: 155
		this.field4566[12] = 0.0F; // L: 156
		this.field4566[13] = 0.0F; // L: 157
		this.field4566[14] = 0.0F; // L: 158
		this.field4566[15] = 0.0F; // L: 159
	} // L: 160

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lov;I)V",
		garbageValue = "1357245429"
	)
	public void method7648(class407 var1) {
		System.arraycopy(var1.field4566, 0, this.field4566, 0, 16); // L: 163
	} // L: 164

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "8"
	)
	public void method7680(float var1) {
		this.method7650(var1, var1, var1); // L: 167
	} // L: 168

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(FFFB)V",
		garbageValue = "1"
	)
	public void method7650(float var1, float var2, float var3) {
		this.method7646(); // L: 171
		this.field4566[0] = var1; // L: 172
		this.field4566[5] = var2; // L: 173
		this.field4566[10] = var3; // L: 174
	} // L: 175

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lov;I)V",
		garbageValue = "1212207341"
	)
	public void method7673(class407 var1) {
		for (int var2 = 0; var2 < this.field4566.length; ++var2) { // L: 178
			float[] var10000 = this.field4566; // L: 179
			var10000[var2] += var1.field4566[var2];
		}

	} // L: 181

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lov;I)V",
		garbageValue = "-803446408"
	)
	public void method7652(class407 var1) {
		float var2 = var1.field4566[12] * this.field4566[3] + this.field4566[0] * var1.field4566[0] + this.field4566[1] * var1.field4566[4] + this.field4566[2] * var1.field4566[8]; // L: 184
		float var3 = var1.field4566[13] * this.field4566[3] + this.field4566[2] * var1.field4566[9] + this.field4566[0] * var1.field4566[1] + var1.field4566[5] * this.field4566[1]; // L: 185
		float var4 = this.field4566[3] * var1.field4566[14] + this.field4566[0] * var1.field4566[2] + var1.field4566[6] * this.field4566[1] + var1.field4566[10] * this.field4566[2]; // L: 186
		float var5 = this.field4566[2] * var1.field4566[11] + this.field4566[0] * var1.field4566[3] + var1.field4566[7] * this.field4566[1] + var1.field4566[15] * this.field4566[3]; // L: 187
		float var6 = this.field4566[7] * var1.field4566[12] + var1.field4566[8] * this.field4566[6] + var1.field4566[0] * this.field4566[4] + var1.field4566[4] * this.field4566[5]; // L: 188
		float var7 = this.field4566[6] * var1.field4566[9] + var1.field4566[5] * this.field4566[5] + this.field4566[4] * var1.field4566[1] + this.field4566[7] * var1.field4566[13]; // L: 189
		float var8 = var1.field4566[14] * this.field4566[7] + this.field4566[4] * var1.field4566[2] + var1.field4566[6] * this.field4566[5] + this.field4566[6] * var1.field4566[10]; // L: 190
		float var9 = var1.field4566[15] * this.field4566[7] + var1.field4566[3] * this.field4566[4] + this.field4566[5] * var1.field4566[7] + this.field4566[6] * var1.field4566[11]; // L: 191
		float var10 = var1.field4566[12] * this.field4566[11] + this.field4566[9] * var1.field4566[4] + var1.field4566[0] * this.field4566[8] + var1.field4566[8] * this.field4566[10]; // L: 192
		float var11 = this.field4566[9] * var1.field4566[5] + this.field4566[8] * var1.field4566[1] + this.field4566[10] * var1.field4566[9] + this.field4566[11] * var1.field4566[13]; // L: 193
		float var12 = this.field4566[9] * var1.field4566[6] + var1.field4566[2] * this.field4566[8] + this.field4566[10] * var1.field4566[10] + this.field4566[11] * var1.field4566[14]; // L: 194
		float var13 = this.field4566[11] * var1.field4566[15] + this.field4566[10] * var1.field4566[11] + this.field4566[9] * var1.field4566[7] + this.field4566[8] * var1.field4566[3]; // L: 195
		float var14 = var1.field4566[12] * this.field4566[15] + var1.field4566[4] * this.field4566[13] + var1.field4566[0] * this.field4566[12] + this.field4566[14] * var1.field4566[8]; // L: 196
		float var15 = var1.field4566[13] * this.field4566[15] + this.field4566[12] * var1.field4566[1] + this.field4566[13] * var1.field4566[5] + var1.field4566[9] * this.field4566[14]; // L: 197
		float var16 = var1.field4566[2] * this.field4566[12] + var1.field4566[6] * this.field4566[13] + var1.field4566[10] * this.field4566[14] + var1.field4566[14] * this.field4566[15]; // L: 198
		float var17 = var1.field4566[15] * this.field4566[15] + var1.field4566[11] * this.field4566[14] + this.field4566[13] * var1.field4566[7] + var1.field4566[3] * this.field4566[12]; // L: 199
		this.field4566[0] = var2; // L: 200
		this.field4566[1] = var3; // L: 201
		this.field4566[2] = var4; // L: 202
		this.field4566[3] = var5; // L: 203
		this.field4566[4] = var6; // L: 204
		this.field4566[5] = var7; // L: 205
		this.field4566[6] = var8; // L: 206
		this.field4566[7] = var9; // L: 207
		this.field4566[8] = var10;
		this.field4566[9] = var11; // L: 209
		this.field4566[10] = var12; // L: 210
		this.field4566[11] = var13;
		this.field4566[12] = var14;
		this.field4566[13] = var15;
		this.field4566[14] = var16;
		this.field4566[15] = var17;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Loy;B)V",
		garbageValue = "2"
	)
	public void method7653(class406 var1) {
		float var2 = var1.field4557 * var1.field4557;
		float var3 = var1.field4557 * var1.field4558; // L: 220
		float var4 = var1.field4555 * var1.field4557;
		float var5 = var1.field4559 * var1.field4557;
		float var6 = var1.field4558 * var1.field4558;
		float var7 = var1.field4555 * var1.field4558;
		float var8 = var1.field4559 * var1.field4558;
		float var9 = var1.field4555 * var1.field4555;
		float var10 = var1.field4559 * var1.field4555; // L: 227
		float var11 = var1.field4559 * var1.field4559; // L: 228
		this.field4566[0] = var6 + var2 - var11 - var9; // L: 229
		this.field4566[1] = var5 + var7 + var5 + var7;
		this.field4566[2] = var8 - var4 - var4 + var8; // L: 231
		this.field4566[4] = var7 - var5 - var5 + var7; // L: 232
		this.field4566[5] = var2 + var9 - var6 - var11; // L: 233
		this.field4566[6] = var3 + var10 + var3 + var10; // L: 234
		this.field4566[8] = var4 + var8 + var8 + var4; // L: 235
		this.field4566[9] = var10 - var3 - var3 + var10; // L: 236
		this.field4566[10] = var11 + var2 - var9 - var6; // L: 237
	} // L: 238

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lox;B)V",
		garbageValue = "-17"
	)
	void method7654(class408 var1) {
		this.field4566[0] = var1.field4576; // L: 241
		this.field4566[1] = var1.field4570; // L: 242
		this.field4566[2] = var1.field4571; // L: 243
		this.field4566[3] = 0.0F; // L: 244
		this.field4566[4] = var1.field4569; // L: 245
		this.field4566[5] = var1.field4573; // L: 246
		this.field4566[6] = var1.field4574; // L: 247
		this.field4566[7] = 0.0F; // L: 248
		this.field4566[8] = var1.field4575; // L: 249
		this.field4566[9] = var1.field4572; // L: 250
		this.field4566[10] = var1.field4577; // L: 251
		this.field4566[11] = 0.0F; // L: 252
		this.field4566[12] = var1.field4578; // L: 253
		this.field4566[13] = var1.field4579; // L: 254
		this.field4566[14] = var1.field4580; // L: 255
		this.field4566[15] = 1.0F; // L: 256
	} // L: 257

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "1717166501"
	)
	float method7672() {
		return this.field4566[12] * this.field4566[6] * this.field4566[3] * this.field4566[9] + (this.field4566[5] * this.field4566[2] * this.field4566[11] * this.field4566[12] + (this.field4566[15] * this.field4566[9] * this.field4566[2] * this.field4566[4] + this.field4566[8] * this.field4566[6] * this.field4566[1] * this.field4566[15] + this.field4566[15] * this.field4566[10] * this.field4566[5] * this.field4566[0] - this.field4566[11] * this.field4566[5] * this.field4566[0] * this.field4566[14] - this.field4566[15] * this.field4566[6] * this.field4566[0] * this.field4566[9] + this.field4566[13] * this.field4566[11] * this.field4566[6] * this.field4566[0] + this.field4566[14] * this.field4566[9] * this.field4566[7] * this.field4566[0] - this.field4566[10] * this.field4566[0] * this.field4566[7] * this.field4566[13] - this.field4566[15] * this.field4566[1] * this.field4566[4] * this.field4566[10] + this.field4566[11] * this.field4566[1] * this.field4566[4] * this.field4566[14] - this.field4566[6] * this.field4566[1] * this.field4566[11] * this.field4566[12] - this.field4566[14] * this.field4566[7] * this.field4566[1] * this.field4566[8] + this.field4566[12] * this.field4566[10] * this.field4566[1] * this.field4566[7] - this.field4566[13] * this.field4566[4] * this.field4566[2] * this.field4566[11] - this.field4566[15] * this.field4566[8] * this.field4566[5] * this.field4566[2]) + this.field4566[2] * this.field4566[7] * this.field4566[8] * this.field4566[13] - this.field4566[12] * this.field4566[9] * this.field4566[7] * this.field4566[2] - this.field4566[14] * this.field4566[4] * this.field4566[3] * this.field4566[9] + this.field4566[13] * this.field4566[10] * this.field4566[4] * this.field4566[3] + this.field4566[14] * this.field4566[8] * this.field4566[5] * this.field4566[3] - this.field4566[12] * this.field4566[3] * this.field4566[5] * this.field4566[10] - this.field4566[13] * this.field4566[6] * this.field4566[3] * this.field4566[8]); // L: 260
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1335065580"
	)
	public void method7678() {
		float var1 = 1.0F / this.method7672(); // L: 264
		float var2 = (this.field4566[10] * this.field4566[5] * this.field4566[15] - this.field4566[14] * this.field4566[11] * this.field4566[5] - this.field4566[9] * this.field4566[6] * this.field4566[15] + this.field4566[13] * this.field4566[11] * this.field4566[6] + this.field4566[7] * this.field4566[9] * this.field4566[14] - this.field4566[10] * this.field4566[7] * this.field4566[13]) * var1; // L: 265
		float var3 = var1 * (this.field4566[15] * this.field4566[10] * -this.field4566[1] + this.field4566[14] * this.field4566[11] * this.field4566[1] + this.field4566[15] * this.field4566[2] * this.field4566[9] - this.field4566[13] * this.field4566[2] * this.field4566[11] - this.field4566[9] * this.field4566[3] * this.field4566[14] + this.field4566[10] * this.field4566[3] * this.field4566[13]); // L: 266
		float var4 = var1 * (this.field4566[3] * this.field4566[5] * this.field4566[14] + this.field4566[15] * this.field4566[6] * this.field4566[1] - this.field4566[7] * this.field4566[1] * this.field4566[14] - this.field4566[15] * this.field4566[2] * this.field4566[5] + this.field4566[2] * this.field4566[7] * this.field4566[13] - this.field4566[6] * this.field4566[3] * this.field4566[13]); // L: 267
		float var5 = (this.field4566[5] * this.field4566[2] * this.field4566[11] + this.field4566[11] * this.field4566[6] * -this.field4566[1] + this.field4566[10] * this.field4566[1] * this.field4566[7] - this.field4566[7] * this.field4566[2] * this.field4566[9] - this.field4566[10] * this.field4566[3] * this.field4566[5] + this.field4566[6] * this.field4566[3] * this.field4566[9]) * var1; // L: 268
		float var6 = (this.field4566[15] * this.field4566[6] * this.field4566[8] + this.field4566[11] * this.field4566[4] * this.field4566[14] + -this.field4566[4] * this.field4566[10] * this.field4566[15] - this.field4566[6] * this.field4566[11] * this.field4566[12] - this.field4566[14] * this.field4566[7] * this.field4566[8] + this.field4566[10] * this.field4566[7] * this.field4566[12]) * var1; // L: 269
		float var7 = var1 * (this.field4566[15] * this.field4566[0] * this.field4566[10] - this.field4566[0] * this.field4566[11] * this.field4566[14] - this.field4566[15] * this.field4566[2] * this.field4566[8] + this.field4566[2] * this.field4566[11] * this.field4566[12] + this.field4566[14] * this.field4566[8] * this.field4566[3] - this.field4566[12] * this.field4566[10] * this.field4566[3]); // L: 270
		float var8 = var1 * (this.field4566[15] * -this.field4566[0] * this.field4566[6] + this.field4566[14] * this.field4566[0] * this.field4566[7] + this.field4566[4] * this.field4566[2] * this.field4566[15] - this.field4566[2] * this.field4566[7] * this.field4566[12] - this.field4566[14] * this.field4566[3] * this.field4566[4] + this.field4566[3] * this.field4566[6] * this.field4566[12]); // L: 271
		float var9 = var1 * (this.field4566[3] * this.field4566[4] * this.field4566[10] + this.field4566[6] * this.field4566[0] * this.field4566[11] - this.field4566[0] * this.field4566[7] * this.field4566[10] - this.field4566[11] * this.field4566[4] * this.field4566[2] + this.field4566[2] * this.field4566[7] * this.field4566[8] - this.field4566[3] * this.field4566[6] * this.field4566[8]); // L: 272
		float var10 = var1 * (this.field4566[13] * this.field4566[8] * this.field4566[7] + this.field4566[12] * this.field4566[5] * this.field4566[11] + (this.field4566[4] * this.field4566[9] * this.field4566[15] - this.field4566[11] * this.field4566[4] * this.field4566[13] - this.field4566[8] * this.field4566[5] * this.field4566[15]) - this.field4566[12] * this.field4566[9] * this.field4566[7]); // L: 273
		float var11 = (this.field4566[12] * this.field4566[3] * this.field4566[9] + (this.field4566[9] * -this.field4566[0] * this.field4566[15] + this.field4566[0] * this.field4566[11] * this.field4566[13] + this.field4566[15] * this.field4566[1] * this.field4566[8] - this.field4566[1] * this.field4566[11] * this.field4566[12] - this.field4566[13] * this.field4566[3] * this.field4566[8])) * var1; // L: 274
		float var12 = var1 * (this.field4566[4] * this.field4566[3] * this.field4566[13] + this.field4566[7] * this.field4566[1] * this.field4566[12] + (this.field4566[5] * this.field4566[0] * this.field4566[15] - this.field4566[13] * this.field4566[0] * this.field4566[7] - this.field4566[1] * this.field4566[4] * this.field4566[15]) - this.field4566[3] * this.field4566[5] * this.field4566[12]); // L: 275
		float var13 = var1 * (this.field4566[8] * this.field4566[5] * this.field4566[3] + (this.field4566[4] * this.field4566[1] * this.field4566[11] + this.field4566[11] * -this.field4566[0] * this.field4566[5] + this.field4566[9] * this.field4566[0] * this.field4566[7] - this.field4566[8] * this.field4566[7] * this.field4566[1] - this.field4566[9] * this.field4566[3] * this.field4566[4])); // L: 276
		float var14 = var1 * (this.field4566[5] * this.field4566[8] * this.field4566[14] + this.field4566[4] * this.field4566[10] * this.field4566[13] + this.field4566[14] * this.field4566[9] * -this.field4566[4] - this.field4566[12] * this.field4566[5] * this.field4566[10] - this.field4566[13] * this.field4566[8] * this.field4566[6] + this.field4566[12] * this.field4566[6] * this.field4566[9]); // L: 277
		float var15 = (this.field4566[2] * this.field4566[8] * this.field4566[13] + this.field4566[0] * this.field4566[9] * this.field4566[14] - this.field4566[10] * this.field4566[0] * this.field4566[13] - this.field4566[14] * this.field4566[1] * this.field4566[8] + this.field4566[12] * this.field4566[1] * this.field4566[10] - this.field4566[12] * this.field4566[2] * this.field4566[9]) * var1; // L: 278
		float var16 = (this.field4566[4] * this.field4566[1] * this.field4566[14] + this.field4566[6] * this.field4566[0] * this.field4566[13] + -this.field4566[0] * this.field4566[5] * this.field4566[14] - this.field4566[12] * this.field4566[1] * this.field4566[6] - this.field4566[2] * this.field4566[4] * this.field4566[13] + this.field4566[12] * this.field4566[5] * this.field4566[2]) * var1; // L: 279
		float var17 = var1 * (this.field4566[9] * this.field4566[2] * this.field4566[4] + this.field4566[10] * this.field4566[5] * this.field4566[0] - this.field4566[6] * this.field4566[0] * this.field4566[9] - this.field4566[1] * this.field4566[4] * this.field4566[10] + this.field4566[1] * this.field4566[6] * this.field4566[8] - this.field4566[8] * this.field4566[2] * this.field4566[5]); // L: 280
		this.field4566[0] = var2; // L: 281
		this.field4566[1] = var3; // L: 282
		this.field4566[2] = var4; // L: 283
		this.field4566[3] = var5; // L: 284
		this.field4566[4] = var6; // L: 285
		this.field4566[5] = var7; // L: 286
		this.field4566[6] = var8; // L: 287
		this.field4566[7] = var9; // L: 288
		this.field4566[8] = var10; // L: 289
		this.field4566[9] = var11; // L: 290
		this.field4566[10] = var12; // L: 291
		this.field4566[11] = var13; // L: 292
		this.field4566[12] = var14; // L: 293
		this.field4566[13] = var15; // L: 294
		this.field4566[14] = var16; // L: 295
		this.field4566[15] = var17; // L: 296
	} // L: 297

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "78283568"
	)
	public float[] method7658() {
		float[] var1 = new float[3]; // L: 334
		class405 var2 = new class405(this.field4566[0], this.field4566[1], this.field4566[2]); // L: 335
		class405 var3 = new class405(this.field4566[4], this.field4566[5], this.field4566[6]); // L: 336
		class405 var4 = new class405(this.field4566[8], this.field4566[9], this.field4566[10]); // L: 337
		var1[0] = var2.method7602(); // L: 338
		var1[1] = var3.method7602(); // L: 339
		var1[2] = var4.method7602(); // L: 340
		return var1; // L: 341
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder(); // L: 302
		this.method7645(); // L: 303
		this.method7644(); // L: 304

		for (int var2 = 0; var2 < 4; ++var2) { // L: 305
			for (int var3 = 0; var3 < 4; ++var3) { // L: 306
				if (var3 > 0) {
					var1.append("\t"); // L: 307
				}

				float var4 = this.field4566[var3 + var2 * 4]; // L: 308
				if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5D) { // L: 309
					var4 = 0.0F;
				}

				var1.append(var4); // L: 310
			}

			var1.append("\n"); // L: 312
		}

		return var1.toString(); // L: 314
	}

	public int hashCode() {
		boolean var1 = true; // L: 319
		byte var2 = 1; // L: 320
		int var3 = var2 * 31 + Arrays.hashCode(this.field4566); // L: 321
		return var3; // L: 322
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class407)) { // L: 327
			return false;
		} else {
			class407 var2 = (class407)var1; // L: 328

			for (int var3 = 0; var3 < 16; ++var3) { // L: 329
				if (var2.field4566[var3] != this.field4566[var3]) {
					return false;
				}
			}

			return true; // L: 330
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Llg;IB)Lry;",
		garbageValue = "2"
	)
	public static IndexedSprite method7641(AbstractArchive var0, int var1) {
		if (!class169.method3362(var0, var1)) { // L: 208
			return null;
		} else {
			IndexedSprite var3 = new IndexedSprite(); // L: 211
			var3.width = class477.SpriteBuffer_spriteWidth; // L: 212
			var3.height = class477.SpriteBuffer_spriteHeight; // L: 213
			var3.xOffset = class451.SpriteBuffer_xOffsets[0]; // L: 214
			var3.yOffset = class319.SpriteBuffer_yOffsets[0]; // L: 215
			var3.subWidth = class450.SpriteBuffer_spriteWidths[0]; // L: 216
			var3.subHeight = class477.SpriteBuffer_spriteHeights[0] * 934214685; // L: 217
			var3.palette = class477.SpriteBuffer_spritePalette; // L: 218
			var3.pixels = class453.SpriteBuffer_pixels[0]; // L: 219
			class451.SpriteBuffer_xOffsets = null; // L: 221
			class319.SpriteBuffer_yOffsets = null; // L: 222
			class450.SpriteBuffer_spriteWidths = null; // L: 223
			class477.SpriteBuffer_spriteHeights = null; // L: 224
			class477.SpriteBuffer_spritePalette = null; // L: 225
			class453.SpriteBuffer_pixels = null; // L: 226
			return var3; // L: 230
		}
	}
}
