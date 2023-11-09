import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("qn")
public final class class438 {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[Lqn;"
	)
	static class438[] field4693;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -540638549
	)
	static int field4697;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	public static final class438 field4692;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 19362819
	)
	@Export("musicTrackFileId")
	public static int musicTrackFileId;
	@ObfuscatedName("at")
	public float[] field4695;

	static {
		field4693 = new class438[0]; // L: 9
		WorldMapElement.method3586(100); // L: 14
		field4692 = new class438(); // L: 18
	}

	public class438() {
		this.field4695 = new float[16];
		this.method8207(); // L: 43
	} // L: 44

	@ObfuscatedSignature(
		descriptor = "(Lqn;)V"
	)
	public class438(class438 var1) {
		this.field4695 = new float[16];
		this.method8154(var1); // L: 47
	} // L: 48

	@ObfuscatedSignature(
		descriptor = "(Ltc;Z)V"
	)
	public class438(Buffer var1, boolean var2) {
		this.field4695 = new float[16]; // L: 17
		this.method8162(var1, var2); // L: 51
	} // L: 52

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1875898360"
	)
	public void method8197() {
		synchronized(field4693) { // L: 37
			if (field4697 < class386.field4414 - 1) { // L: 38
				field4693[++field4697 - 1] = this;
			}

		}
	} // L: 40

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ltc;ZB)V",
		garbageValue = "-18"
	)
	void method8162(Buffer var1, boolean var2) {
		if (var2) { // L: 55
			class439 var4 = new class439(); // L: 56
			var4.method8216(Ignored.method7936(var1.readShort())); // L: 57
			var4.method8217(Ignored.method7936(var1.readShort())); // L: 58
			var4.method8218(Ignored.method7936(var1.readShort())); // L: 59
			var4.method8219((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort()); // L: 60
			this.method8159(var4); // L: 61
		} else {
			for (int var3 = 0; var3 < 16; ++var3) { // L: 64
				this.field4695[var3] = var1.method8971(); // L: 65
			}
		}

	} // L: 68

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "63"
	)
	float[] method8150() {
		float[] var1 = new float[3]; // L: 71
		if ((double)this.field4695[2] < 0.999D && (double)this.field4695[2] > -0.999D) { // L: 72
			var1[1] = (float)(-Math.asin((double)this.field4695[2])); // L: 73
			double var2 = Math.cos((double)var1[1]); // L: 74
			var1[0] = (float)Math.atan2((double)this.field4695[6] / var2, (double)this.field4695[10] / var2); // L: 75
			var1[2] = (float)Math.atan2((double)this.field4695[1] / var2, (double)this.field4695[0] / var2); // L: 76
		} else {
			var1[0] = 0.0F; // L: 79
			var1[1] = (float)Math.atan2((double)this.field4695[2], 0.0D); // L: 80
			var1[2] = (float)Math.atan2((double)(-this.field4695[9]), (double)this.field4695[5]); // L: 81
		}

		return var1; // L: 83
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "111"
	)
	public float[] method8151() {
		float[] var1 = new float[]{(float)(-Math.asin((double)this.field4695[6])), 0.0F, 0.0F}; // L: 87 88
		double var2 = Math.cos((double)var1[0]); // L: 89
		double var4;
		double var6;
		if (Math.abs(var2) > 0.005D) { // L: 90
			var4 = (double)this.field4695[2]; // L: 91
			var6 = (double)this.field4695[10]; // L: 92
			double var8 = (double)this.field4695[4]; // L: 93
			double var10 = (double)this.field4695[5]; // L: 94
			var1[1] = (float)Math.atan2(var4, var6); // L: 95
			var1[2] = (float)Math.atan2(var8, var10); // L: 96
		} else {
			var4 = (double)this.field4695[1]; // L: 99
			var6 = (double)this.field4695[0]; // L: 100
			if (this.field4695[6] < 0.0F) { // L: 101
				var1[1] = (float)Math.atan2(var4, var6); // L: 102
			} else {
				var1[1] = (float)(-Math.atan2(var4, var6)); // L: 105
			}

			var1[2] = 0.0F; // L: 107
		}

		return var1; // L: 109
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "59"
	)
	void method8207() {
		this.field4695[0] = 1.0F; // L: 113
		this.field4695[1] = 0.0F; // L: 114
		this.field4695[2] = 0.0F; // L: 115
		this.field4695[3] = 0.0F; // L: 116
		this.field4695[4] = 0.0F; // L: 117
		this.field4695[5] = 1.0F; // L: 118
		this.field4695[6] = 0.0F; // L: 119
		this.field4695[7] = 0.0F; // L: 120
		this.field4695[8] = 0.0F; // L: 121
		this.field4695[9] = 0.0F; // L: 122
		this.field4695[10] = 1.0F; // L: 123
		this.field4695[11] = 0.0F; // L: 124
		this.field4695[12] = 0.0F; // L: 125
		this.field4695[13] = 0.0F; // L: 126
		this.field4695[14] = 0.0F; // L: 127
		this.field4695[15] = 1.0F; // L: 128
	} // L: 129

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2082359865"
	)
	public void method8187() {
		this.field4695[0] = 0.0F; // L: 132
		this.field4695[1] = 0.0F; // L: 133
		this.field4695[2] = 0.0F; // L: 134
		this.field4695[3] = 0.0F; // L: 135
		this.field4695[4] = 0.0F; // L: 136
		this.field4695[5] = 0.0F; // L: 137
		this.field4695[6] = 0.0F; // L: 138
		this.field4695[7] = 0.0F; // L: 139
		this.field4695[8] = 0.0F; // L: 140
		this.field4695[9] = 0.0F; // L: 141
		this.field4695[10] = 0.0F; // L: 142
		this.field4695[11] = 0.0F; // L: 143
		this.field4695[12] = 0.0F; // L: 144
		this.field4695[13] = 0.0F; // L: 145
		this.field4695[14] = 0.0F; // L: 146
		this.field4695[15] = 0.0F; // L: 147
	} // L: 148

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lqn;I)V",
		garbageValue = "1595646222"
	)
	public void method8154(class438 var1) {
		System.arraycopy(var1.field4695, 0, this.field4695, 0, 16); // L: 151
	} // L: 152

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "873346604"
	)
	public void method8155(float var1) {
		this.method8156(var1, var1, var1); // L: 155
	} // L: 156

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(FFFB)V",
		garbageValue = "7"
	)
	public void method8156(float var1, float var2, float var3) {
		this.method8207(); // L: 159
		this.field4695[0] = var1; // L: 160
		this.field4695[5] = var2; // L: 161
		this.field4695[10] = var3; // L: 162
	} // L: 163

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lqn;I)V",
		garbageValue = "-1501678163"
	)
	public void method8153(class438 var1) {
		for (int var2 = 0; var2 < this.field4695.length; ++var2) { // L: 166
			float[] var10000 = this.field4695; // L: 167
			var10000[var2] += var1.field4695[var2];
		}

	} // L: 169

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lqn;I)V",
		garbageValue = "930273576"
	)
	public void method8157(class438 var1) {
		float var2 = var1.field4695[12] * this.field4695[3] + var1.field4695[0] * this.field4695[0] + var1.field4695[4] * this.field4695[1] + this.field4695[2] * var1.field4695[8]; // L: 172
		float var3 = var1.field4695[9] * this.field4695[2] + this.field4695[0] * var1.field4695[1] + var1.field4695[5] * this.field4695[1] + var1.field4695[13] * this.field4695[3]; // L: 173
		float var4 = this.field4695[3] * var1.field4695[14] + var1.field4695[10] * this.field4695[2] + this.field4695[0] * var1.field4695[2] + this.field4695[1] * var1.field4695[6]; // L: 174
		float var5 = var1.field4695[15] * this.field4695[3] + var1.field4695[11] * this.field4695[2] + this.field4695[1] * var1.field4695[7] + var1.field4695[3] * this.field4695[0]; // L: 175
		float var6 = this.field4695[5] * var1.field4695[4] + this.field4695[4] * var1.field4695[0] + this.field4695[6] * var1.field4695[8] + this.field4695[7] * var1.field4695[12]; // L: 176
		float var7 = var1.field4695[13] * this.field4695[7] + var1.field4695[9] * this.field4695[6] + var1.field4695[1] * this.field4695[4] + this.field4695[5] * var1.field4695[5]; // L: 177
		float var8 = var1.field4695[14] * this.field4695[7] + var1.field4695[10] * this.field4695[6] + this.field4695[5] * var1.field4695[6] + this.field4695[4] * var1.field4695[2]; // L: 178
		float var9 = this.field4695[6] * var1.field4695[11] + var1.field4695[3] * this.field4695[4] + var1.field4695[7] * this.field4695[5] + var1.field4695[15] * this.field4695[7]; // L: 179
		float var10 = var1.field4695[12] * this.field4695[11] + var1.field4695[8] * this.field4695[10] + var1.field4695[0] * this.field4695[8] + this.field4695[9] * var1.field4695[4]; // L: 180
		float var11 = this.field4695[9] * var1.field4695[5] + this.field4695[8] * var1.field4695[1] + this.field4695[10] * var1.field4695[9] + var1.field4695[13] * this.field4695[11]; // L: 181
		float var12 = var1.field4695[10] * this.field4695[10] + var1.field4695[6] * this.field4695[9] + this.field4695[8] * var1.field4695[2] + var1.field4695[14] * this.field4695[11]; // L: 182
		float var13 = this.field4695[8] * var1.field4695[3] + var1.field4695[7] * this.field4695[9] + this.field4695[10] * var1.field4695[11] + this.field4695[11] * var1.field4695[15]; // L: 183
		float var14 = this.field4695[13] * var1.field4695[4] + var1.field4695[0] * this.field4695[12] + this.field4695[14] * var1.field4695[8] + var1.field4695[12] * this.field4695[15]; // L: 184
		float var15 = this.field4695[14] * var1.field4695[9] + this.field4695[12] * var1.field4695[1] + this.field4695[13] * var1.field4695[5] + var1.field4695[13] * this.field4695[15]; // L: 185
		float var16 = var1.field4695[14] * this.field4695[15] + var1.field4695[10] * this.field4695[14] + this.field4695[13] * var1.field4695[6] + var1.field4695[2] * this.field4695[12]; // L: 186
		float var17 = this.field4695[15] * var1.field4695[15] + this.field4695[12] * var1.field4695[3] + var1.field4695[7] * this.field4695[13] + this.field4695[14] * var1.field4695[11]; // L: 187
		this.field4695[0] = var2; // L: 188
		this.field4695[1] = var3; // L: 189
		this.field4695[2] = var4; // L: 190
		this.field4695[3] = var5; // L: 191
		this.field4695[4] = var6; // L: 192
		this.field4695[5] = var7; // L: 193
		this.field4695[6] = var8; // L: 194
		this.field4695[7] = var9; // L: 195
		this.field4695[8] = var10; // L: 196
		this.field4695[9] = var11; // L: 197
		this.field4695[10] = var12; // L: 198
		this.field4695[11] = var13; // L: 199
		this.field4695[12] = var14; // L: 200
		this.field4695[13] = var15; // L: 201
		this.field4695[14] = var16; // L: 202
		this.field4695[15] = var17; // L: 203
	} // L: 204

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lqa;B)V",
		garbageValue = "99"
	)
	public void method8158(class437 var1) {
		float var2 = var1.field4691 * var1.field4691; // L: 207
		float var3 = var1.field4686 * var1.field4691; // L: 208
		float var4 = var1.field4691 * var1.field4687; // L: 209
		float var5 = var1.field4688 * var1.field4691; // L: 210
		float var6 = var1.field4686 * var1.field4686; // L: 211
		float var7 = var1.field4686 * var1.field4687; // L: 212
		float var8 = var1.field4686 * var1.field4688; // L: 213
		float var9 = var1.field4687 * var1.field4687; // L: 214
		float var10 = var1.field4688 * var1.field4687; // L: 215
		float var11 = var1.field4688 * var1.field4688; // L: 216
		this.field4695[0] = var6 + var2 - var11 - var9; // L: 217
		this.field4695[1] = var7 + var7 + var5 + var5; // L: 218
		this.field4695[2] = var8 - var4 - var4 + var8; // L: 219
		this.field4695[4] = var7 + (var7 - var5 - var5); // L: 220
		this.field4695[5] = var2 + var9 - var6 - var11; // L: 221
		this.field4695[6] = var3 + var10 + var3 + var10; // L: 222
		this.field4695[8] = var4 + var4 + var8 + var8; // L: 223
		this.field4695[9] = var10 - var3 - var3 + var10; // L: 224
		this.field4695[10] = var2 + var11 - var9 - var6; // L: 225
	} // L: 226

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lqi;B)V",
		garbageValue = "60"
	)
	void method8159(class439 var1) {
		this.field4695[0] = var1.field4704; // L: 229
		this.field4695[1] = var1.field4701; // L: 230
		this.field4695[2] = var1.field4700; // L: 231
		this.field4695[3] = 0.0F; // L: 232
		this.field4695[4] = var1.field4703; // L: 233
		this.field4695[5] = var1.field4702; // L: 234
		this.field4695[6] = var1.field4699; // L: 235
		this.field4695[7] = 0.0F; // L: 236
		this.field4695[8] = var1.field4698; // L: 237
		this.field4695[9] = var1.field4705; // L: 238
		this.field4695[10] = var1.field4706; // L: 239
		this.field4695[11] = 0.0F; // L: 240
		this.field4695[12] = var1.field4707; // L: 241
		this.field4695[13] = var1.field4708; // L: 242
		this.field4695[14] = var1.field4709; // L: 243
		this.field4695[15] = 1.0F; // L: 244
	} // L: 245

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)F",
		garbageValue = "-45"
	)
	float method8160() {
		return this.field4695[12] * this.field4695[6] * this.field4695[3] * this.field4695[9] + (this.field4695[5] * this.field4695[3] * this.field4695[8] * this.field4695[14] + this.field4695[12] * this.field4695[5] * this.field4695[2] * this.field4695[11] + (this.field4695[9] * this.field4695[4] * this.field4695[2] * this.field4695[15] + this.field4695[12] * this.field4695[10] * this.field4695[7] * this.field4695[1] + (this.field4695[9] * this.field4695[0] * this.field4695[7] * this.field4695[14] + this.field4695[11] * this.field4695[6] * this.field4695[0] * this.field4695[13] + (this.field4695[15] * this.field4695[10] * this.field4695[5] * this.field4695[0] - this.field4695[14] * this.field4695[11] * this.field4695[0] * this.field4695[5] - this.field4695[15] * this.field4695[9] * this.field4695[0] * this.field4695[6]) - this.field4695[13] * this.field4695[10] * this.field4695[7] * this.field4695[0] - this.field4695[15] * this.field4695[4] * this.field4695[1] * this.field4695[10] + this.field4695[11] * this.field4695[4] * this.field4695[1] * this.field4695[14] + this.field4695[15] * this.field4695[6] * this.field4695[1] * this.field4695[8] - this.field4695[12] * this.field4695[1] * this.field4695[6] * this.field4695[11] - this.field4695[7] * this.field4695[1] * this.field4695[8] * this.field4695[14]) - this.field4695[13] * this.field4695[4] * this.field4695[2] * this.field4695[11] - this.field4695[15] * this.field4695[8] * this.field4695[5] * this.field4695[2]) + this.field4695[13] * this.field4695[8] * this.field4695[7] * this.field4695[2] - this.field4695[12] * this.field4695[9] * this.field4695[2] * this.field4695[7] - this.field4695[14] * this.field4695[9] * this.field4695[3] * this.field4695[4] + this.field4695[13] * this.field4695[4] * this.field4695[3] * this.field4695[10] - this.field4695[12] * this.field4695[5] * this.field4695[3] * this.field4695[10] - this.field4695[3] * this.field4695[6] * this.field4695[8] * this.field4695[13]); // L: 248
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-474123736"
	)
	public void method8161() {
		float var1 = 1.0F / this.method8160(); // L: 252
		float var2 = var1 * (this.field4695[14] * this.field4695[7] * this.field4695[9] + this.field4695[13] * this.field4695[11] * this.field4695[6] + (this.field4695[5] * this.field4695[10] * this.field4695[15] - this.field4695[11] * this.field4695[5] * this.field4695[14] - this.field4695[15] * this.field4695[6] * this.field4695[9]) - this.field4695[13] * this.field4695[10] * this.field4695[7]); // L: 253
		float var3 = var1 * (this.field4695[10] * -this.field4695[1] * this.field4695[15] + this.field4695[14] * this.field4695[11] * this.field4695[1] + this.field4695[9] * this.field4695[2] * this.field4695[15] - this.field4695[13] * this.field4695[11] * this.field4695[2] - this.field4695[14] * this.field4695[9] * this.field4695[3] + this.field4695[10] * this.field4695[3] * this.field4695[13]); // L: 254
		float var4 = var1 * (this.field4695[3] * this.field4695[5] * this.field4695[14] + this.field4695[2] * this.field4695[7] * this.field4695[13] + (this.field4695[1] * this.field4695[6] * this.field4695[15] - this.field4695[14] * this.field4695[7] * this.field4695[1] - this.field4695[15] * this.field4695[2] * this.field4695[5]) - this.field4695[6] * this.field4695[3] * this.field4695[13]); // L: 255
		float var5 = (this.field4695[3] * this.field4695[6] * this.field4695[9] + (this.field4695[2] * this.field4695[5] * this.field4695[11] + this.field4695[10] * this.field4695[7] * this.field4695[1] + this.field4695[6] * -this.field4695[1] * this.field4695[11] - this.field4695[2] * this.field4695[7] * this.field4695[9] - this.field4695[10] * this.field4695[3] * this.field4695[5])) * var1; // L: 256
		float var6 = var1 * (this.field4695[15] * this.field4695[8] * this.field4695[6] + this.field4695[4] * this.field4695[11] * this.field4695[14] + this.field4695[15] * this.field4695[10] * -this.field4695[4] - this.field4695[12] * this.field4695[6] * this.field4695[11] - this.field4695[14] * this.field4695[8] * this.field4695[7] + this.field4695[7] * this.field4695[10] * this.field4695[12]); // L: 257
		float var7 = (this.field4695[10] * this.field4695[0] * this.field4695[15] - this.field4695[0] * this.field4695[11] * this.field4695[14] - this.field4695[2] * this.field4695[8] * this.field4695[15] + this.field4695[11] * this.field4695[2] * this.field4695[12] + this.field4695[14] * this.field4695[3] * this.field4695[8] - this.field4695[3] * this.field4695[10] * this.field4695[12]) * var1; // L: 258
		float var8 = (-this.field4695[0] * this.field4695[6] * this.field4695[15] + this.field4695[0] * this.field4695[7] * this.field4695[14] + this.field4695[15] * this.field4695[4] * this.field4695[2] - this.field4695[2] * this.field4695[7] * this.field4695[12] - this.field4695[4] * this.field4695[3] * this.field4695[14] + this.field4695[3] * this.field4695[6] * this.field4695[12]) * var1; // L: 259
		float var9 = var1 * (this.field4695[10] * this.field4695[4] * this.field4695[3] + this.field4695[8] * this.field4695[2] * this.field4695[7] + (this.field4695[11] * this.field4695[6] * this.field4695[0] - this.field4695[7] * this.field4695[0] * this.field4695[10] - this.field4695[11] * this.field4695[4] * this.field4695[2]) - this.field4695[3] * this.field4695[6] * this.field4695[8]); // L: 260
		float var10 = (this.field4695[13] * this.field4695[7] * this.field4695[8] + this.field4695[4] * this.field4695[9] * this.field4695[15] - this.field4695[4] * this.field4695[11] * this.field4695[13] - this.field4695[15] * this.field4695[5] * this.field4695[8] + this.field4695[12] * this.field4695[11] * this.field4695[5] - this.field4695[9] * this.field4695[7] * this.field4695[12]) * var1; // L: 261
		float var11 = (this.field4695[9] * -this.field4695[0] * this.field4695[15] + this.field4695[13] * this.field4695[0] * this.field4695[11] + this.field4695[15] * this.field4695[1] * this.field4695[8] - this.field4695[12] * this.field4695[11] * this.field4695[1] - this.field4695[13] * this.field4695[8] * this.field4695[3] + this.field4695[12] * this.field4695[9] * this.field4695[3]) * var1; // L: 262
		float var12 = var1 * (this.field4695[0] * this.field4695[5] * this.field4695[15] - this.field4695[7] * this.field4695[0] * this.field4695[13] - this.field4695[15] * this.field4695[4] * this.field4695[1] + this.field4695[12] * this.field4695[7] * this.field4695[1] + this.field4695[4] * this.field4695[3] * this.field4695[13] - this.field4695[3] * this.field4695[5] * this.field4695[12]); // L: 263
		float var13 = var1 * (this.field4695[8] * this.field4695[3] * this.field4695[5] + (this.field4695[11] * this.field4695[1] * this.field4695[4] + this.field4695[11] * -this.field4695[0] * this.field4695[5] + this.field4695[0] * this.field4695[7] * this.field4695[9] - this.field4695[7] * this.field4695[1] * this.field4695[8] - this.field4695[9] * this.field4695[3] * this.field4695[4])); // L: 264
		float var14 = var1 * (this.field4695[14] * this.field4695[5] * this.field4695[8] + this.field4695[14] * this.field4695[9] * -this.field4695[4] + this.field4695[4] * this.field4695[10] * this.field4695[13] - this.field4695[12] * this.field4695[5] * this.field4695[10] - this.field4695[13] * this.field4695[6] * this.field4695[8] + this.field4695[6] * this.field4695[9] * this.field4695[12]); // L: 265
		float var15 = var1 * (this.field4695[12] * this.field4695[10] * this.field4695[1] + (this.field4695[0] * this.field4695[9] * this.field4695[14] - this.field4695[13] * this.field4695[10] * this.field4695[0] - this.field4695[14] * this.field4695[1] * this.field4695[8]) + this.field4695[2] * this.field4695[8] * this.field4695[13] - this.field4695[9] * this.field4695[2] * this.field4695[12]); // L: 266
		float var16 = var1 * (this.field4695[13] * this.field4695[0] * this.field4695[6] + -this.field4695[0] * this.field4695[5] * this.field4695[14] + this.field4695[14] * this.field4695[1] * this.field4695[4] - this.field4695[6] * this.field4695[1] * this.field4695[12] - this.field4695[13] * this.field4695[2] * this.field4695[4] + this.field4695[5] * this.field4695[2] * this.field4695[12]); // L: 267
		float var17 = var1 * (this.field4695[2] * this.field4695[4] * this.field4695[9] + this.field4695[0] * this.field4695[5] * this.field4695[10] - this.field4695[6] * this.field4695[0] * this.field4695[9] - this.field4695[10] * this.field4695[4] * this.field4695[1] + this.field4695[8] * this.field4695[1] * this.field4695[6] - this.field4695[2] * this.field4695[5] * this.field4695[8]); // L: 268
		this.field4695[0] = var2; // L: 269
		this.field4695[1] = var3; // L: 270
		this.field4695[2] = var4; // L: 271
		this.field4695[3] = var5; // L: 272
		this.field4695[4] = var6; // L: 273
		this.field4695[5] = var7; // L: 274
		this.field4695[6] = var8; // L: 275
		this.field4695[7] = var9; // L: 276
		this.field4695[8] = var10; // L: 277
		this.field4695[9] = var11; // L: 278
		this.field4695[10] = var12; // L: 279
		this.field4695[11] = var13; // L: 280
		this.field4695[12] = var14; // L: 281
		this.field4695[13] = var15; // L: 282
		this.field4695[14] = var16; // L: 283
		this.field4695[15] = var17; // L: 284
	} // L: 285

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "-2"
	)
	public float[] method8164() {
		float[] var1 = new float[3]; // L: 322
		class436 var2 = new class436(this.field4695[0], this.field4695[1], this.field4695[2]); // L: 323
		class436 var3 = new class436(this.field4695[4], this.field4695[5], this.field4695[6]); // L: 324
		class436 var4 = new class436(this.field4695[8], this.field4695[9], this.field4695[10]); // L: 325
		var1[0] = var2.method8104(); // L: 326
		var1[1] = var3.method8104(); // L: 327
		var1[2] = var4.method8104(); // L: 328
		return var1; // L: 329
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder(); // L: 290
		this.method8151(); // L: 291
		this.method8150(); // L: 292

		for (int var2 = 0; var2 < 4; ++var2) { // L: 293
			for (int var3 = 0; var3 < 4; ++var3) { // L: 294
				if (var3 > 0) {
					var1.append("\t"); // L: 295
				}

				float var4 = this.field4695[var3 + var2 * 4]; // L: 296
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
		int var3 = var2 * 31 + Arrays.hashCode(this.field4695); // L: 309
		return var3; // L: 310
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class438)) { // L: 315
			return false;
		} else {
			class438 var2 = (class438)var1; // L: 316

			for (int var3 = 0; var3 < 16; ++var3) { // L: 317
				if (var2.field4695[var3] != this.field4695[var3]) {
					return false;
				}
			}

			return true; // L: 318
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILdk;ZB)I",
		garbageValue = "127"
	)
	static int method8213(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 1244
			var0 -= 1000; // L: 1245
			var3 = ArchiveDiskActionHandler.getWidget(Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]); // L: 1246
		} else {
			var3 = var2 ? Interpreter.scriptDotWidget : HealthBarUpdate.field1223; // L: 1248
		}

		String var4 = Interpreter.Interpreter_stringStack[--class156.Interpreter_stringStackSize]; // L: 1249
		int[] var5 = null; // L: 1250
		if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') { // L: 1251
			int var6 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 1252
			if (var6 > 0) { // L: 1253
				for (var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]) { // L: 1254 1255
				}
			}

			var4 = var4.substring(0, var4.length() - 1); // L: 1257
		}

		Object[] var9 = new Object[var4.length() + 1]; // L: 1259

		int var7;
		for (var7 = var9.length - 1; var7 >= 1; --var7) { // L: 1260
			if (var4.charAt(var7 - 1) == 's') {
				var9[var7] = Interpreter.Interpreter_stringStack[--class156.Interpreter_stringStackSize]; // L: 1261
			} else {
				var9[var7] = new Integer(Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]); // L: 1262
			}
		}

		var7 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 1264
		if (var7 != -1) { // L: 1265
			var9[0] = new Integer(var7);
		} else {
			var9 = null; // L: 1266
		}

		if (var0 == ScriptOpcodes.CC_SETONCLICK) { // L: 1267
			var3.onClick = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONHOLD) { // L: 1268
			var3.onHold = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONRELEASE) { // L: 1269
			var3.onRelease = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEOVER) { // L: 1270
			var3.onMouseOver = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSELEAVE) { // L: 1271
			var3.onMouseLeave = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAG) { // L: 1272
			var3.onDrag = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETLEAVE) { // L: 1273
			var3.onTargetLeave = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONVARTRANSMIT) { // L: 1274
			var3.onVarTransmit = var9; // L: 1275
			var3.varTransmitTriggers = var5; // L: 1276
		} else if (var0 == ScriptOpcodes.CC_SETONTIMER) { // L: 1278
			var3.onTimer = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONOP) { // L: 1279
			var3.onOp = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAGCOMPLETE) { // L: 1280
			var3.onDragComplete = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLICKREPEAT) { // L: 1281
			var3.onClickRepeat = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEREPEAT) { // L: 1282
			var3.onMouseRepeat = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONINVTRANSMIT) { // L: 1283
			var3.onInvTransmit = var9; // L: 1284
			var3.invTransmitTriggers = var5; // L: 1285
		} else if (var0 == ScriptOpcodes.CC_SETONSTATTRANSMIT) { // L: 1287
			var3.onStatTransmit = var9; // L: 1288
			var3.statTransmitTriggers = var5; // L: 1289
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETENTER) { // L: 1291
			var3.onTargetEnter = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONSCROLLWHEEL) { // L: 1292
			var3.onScroll = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCHATTRANSMIT) { // L: 1293
			var3.onChatTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONKEY) { // L: 1294
			var3.onKey = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONFRIENDTRANSMIT) { // L: 1295
			var3.onFriendTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANTRANSMIT) { // L: 1296
			var3.onClanTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMISCTRANSMIT) { // L: 1297
			var3.onMiscTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDIALOGABORT) { // L: 1298
			var3.onDialogAbort = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONSUBCHANGE) { // L: 1299
			var3.onSubChange = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONSTOCKTRANSMIT) { // L: 1300
			var3.onStockTransmit = var9;
		} else if (var0 == 1426) { // L: 1301
			var3.field3731 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONRESIZE) { // L: 1302
			var3.onResize = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANSETTINGSTRANSMIT) { // L: 1303
			var3.field3611 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANCHANNELTRANSMIT) { // L: 1304
			var3.field3725 = var9;
		} else if (var0 == 1430) { // L: 1305
			var3.field3597 = var9;
		} else if (var0 == 1431) { // L: 1306
			var3.field3721 = var9;
		} else if (var0 == 1434) { // L: 1307
			var3.field3732 = var9;
		} else if (var0 == 1435) { // L: 1308
			var3.field3716 = var9;
		} else {
			if (var0 < 1436 || var0 > 1439) { // L: 1309
				return 2; // L: 1319
			}

			class325 var8 = var3.method6490(); // L: 1310
			if (var8 != null) { // L: 1311
				if (var0 == 1436) { // L: 1312
					var8.field3532 = var9;
				} else if (var0 == 1437) { // L: 1313
					var8.field3536 = var9;
				} else if (var0 == 1438) { // L: 1314
					var8.field3537 = var9;
				} else if (var0 == 1439) { // L: 1315
					var8.field3531 = var9;
				}
			}
		}

		var3.hasListener = true; // L: 1321
		return 1; // L: 1322
	}
}
