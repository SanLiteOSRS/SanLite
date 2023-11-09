import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fx")
public class class137 extends DualNode {
	@ObfuscatedName("gn")
	@ObfuscatedGetter(
		intValue = -1963620911
	)
	static int field1585;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -487238367
	)
	int field1583;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[[Ler;"
	)
	public class129[][] field1576;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[[Ler;"
	)
	class129[][] field1577;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	public Skeleton field1579;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1172329849
	)
	int field1578;
	@ObfuscatedName("ax")
	boolean field1580;
	@ObfuscatedName("ac")
	Future field1581;
	@ObfuscatedName("ag")
	List field1582;

	@ObfuscatedSignature(
		descriptor = "(Lni;Lni;IZ)V"
	)
	class137(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		this.field1576 = null; // L: 21
		this.field1577 = null;
		this.field1578 = 0; // L: 24
		this.field1583 = var3; // L: 62
		byte[] var5 = var1.takeFile(this.field1583 >> 16 & 65535, this.field1583 & 65535); // L: 63
		Buffer var6 = new Buffer(var5); // L: 64
		int var7 = var6.readUnsignedByte(); // L: 65
		int var8 = var6.readUnsignedShort(); // L: 66
		byte[] var9;
		if (var4) { // L: 68
			var9 = var2.getFile(0, var8);
		} else {
			var9 = var2.getFile(var8, 0); // L: 69
		}

		this.field1579 = new Skeleton(var8, var9); // L: 70
		this.field1582 = new ArrayList(); // L: 71
		this.field1581 = IgnoreList.field4582.submit(new class136(this, var6, var7)); // L: 72
	} // L: 79

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ltc;II)V",
		garbageValue = "1695620506"
	)
	void method3036(Buffer var1, int var2) {
		var1.readUnsignedShort(); // L: 82
		var1.readUnsignedShort(); // L: 83
		this.field1578 = var1.readUnsignedByte(); // L: 84
		int var3 = var1.readUnsignedShort(); // L: 85
		this.field1577 = new class129[this.field1579.method4471().method4411()][]; // L: 86
		this.field1576 = new class129[this.field1579.method4467()][]; // L: 87
		class128[] var4 = new class128[var3]; // L: 88

		int var5;
		int var7;
		int var9;
		for (var5 = 0; var5 < var3; ++var5) { // L: 89
			var7 = var1.readUnsignedByte(); // L: 91
			class130 var16 = (class130)class217.findEnumerated(Coord.method6086(), var7); // L: 93
			if (var16 == null) { // L: 94
				var16 = class130.field1538;
			}

			var9 = var1.readShortSmart(); // L: 98
			int var11 = var1.readUnsignedByte(); // L: 100
			class131 var12 = (class131)class217.findEnumerated(ClientPreferences.method2537(), var11); // L: 102
			if (var12 == null) {
				var12 = class131.field1544; // L: 103
			}

			class129 var13 = new class129(); // L: 107
			var13.method2997(var1, var2); // L: 108
			var4[var5] = new class128(this, var13, var16, var12, var9); // L: 109
			int var14 = var16.method2998(); // L: 110
			class129[][] var15;
			if (var16 == class130.field1529) { // L: 112
				var15 = this.field1577; // L: 113
			} else {
				var15 = this.field1576; // L: 116
			}

			if (var15[var9] == null) { // L: 118
				var15[var9] = new class129[var14]; // L: 119
			}

			if (var16 == class130.field1530) { // L: 121
				this.field1580 = true; // L: 122
			}
		}

		var5 = var3 / AbstractSocket.field4629; // L: 125
		int var6 = var3 % AbstractSocket.field4629; // L: 126
		int var8 = 0; // L: 128

		for (var9 = 0; var9 < AbstractSocket.field4629; ++var9) { // L: 129
			var7 = var8; // L: 130
			var8 += var5; // L: 131
			if (var6 > 0) { // L: 132
				++var8; // L: 133
				--var6; // L: 134
			}

			if (var7 == var8) { // L: 136
				break;
			}

			this.field1582.add(IgnoreList.field4582.submit(new class132(this, var7, var8, var4))); // L: 141
		}

	} // L: 151

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-128"
	)
	public boolean method3068() {
		if (this.field1581 == null && this.field1582 == null) { // L: 154
			return true; // L: 155
		} else {
			if (this.field1581 != null) { // L: 157
				if (!this.field1581.isDone()) { // L: 158
					return false; // L: 159
				}

				this.field1581 = null; // L: 161
			}

			boolean var1 = true; // L: 163

			for (int var2 = 0; var2 < this.field1582.size(); ++var2) { // L: 164
				if (!((Future)this.field1582.get(var2)).isDone()) { // L: 165
					var1 = false; // L: 166
				} else {
					this.field1582.remove(var2); // L: 169
					--var2; // L: 170
				}
			}

			if (!var1) { // L: 173
				return false; // L: 174
			} else {
				this.field1582 = null; // L: 176
				return true; // L: 177
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1672638287"
	)
	public int method3038() {
		return this.field1578; // L: 181
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "32"
	)
	public boolean method3046() {
		return this.field1580; // L: 185
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILec;IIB)V",
		garbageValue = "-52"
	)
	public void method3040(int var1, class126 var2, int var3, int var4) {
		class438 var5 = Buddy.method7950(); // L: 189
		this.method3041(var5, var3, var2, var1); // L: 190
		this.method3043(var5, var3, var2, var1); // L: 191
		this.method3042(var5, var3, var2, var1); // L: 192
		var2.method2926(var5); // L: 193
		var5.method8197(); // L: 194
	} // L: 195

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lqn;ILec;II)V",
		garbageValue = "-1021851368"
	)
	void method3041(class438 var1, int var2, class126 var3, int var4) {
		float[] var5 = var3.method2922(this.field1578); // L: 198
		float var6 = var5[0]; // L: 199
		float var7 = var5[1]; // L: 200
		float var8 = var5[2]; // L: 201
		if (this.field1577[var2] != null) { // L: 202
			class129 var9 = this.field1577[var2][0]; // L: 203
			class129 var10 = this.field1577[var2][1]; // L: 204
			class129 var11 = this.field1577[var2][2]; // L: 205
			if (var9 != null) { // L: 206
				var6 = var9.method2964(var4);
			}

			if (var10 != null) { // L: 207
				var7 = var10.method2964(var4);
			}

			if (var11 != null) { // L: 208
				var8 = var11.method2964(var4);
			}
		}

		class437 var16 = class132.method3023(); // L: 210
		var16.method8137(1.0F, 0.0F, 0.0F, var6); // L: 211
		class437 var14 = class132.method3023(); // L: 212
		var14.method8137(0.0F, 1.0F, 0.0F, var7); // L: 213
		class437 var15 = class132.method3023(); // L: 214
		var15.method8137(0.0F, 0.0F, 1.0F, var8); // L: 215
		class437 var12 = class132.method3023(); // L: 216
		var12.method8116(var15); // L: 217
		var12.method8116(var16); // L: 218
		var12.method8116(var14); // L: 219
		class438 var13 = Buddy.method7950(); // L: 220
		var13.method8158(var12); // L: 221
		var1.method8157(var13); // L: 222
		var16.method8118(); // L: 223
		var14.method8118(); // L: 224
		var15.method8118(); // L: 225
		var12.method8118(); // L: 226
		var13.method8197(); // L: 227
	} // L: 228

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lqn;ILec;IB)V",
		garbageValue = "94"
	)
	void method3042(class438 var1, int var2, class126 var3, int var4) {
		float[] var5 = var3.method2931(this.field1578); // L: 231
		float var6 = var5[0]; // L: 232
		float var7 = var5[1]; // L: 233
		float var8 = var5[2]; // L: 234
		if (this.field1577[var2] != null) { // L: 235
			class129 var9 = this.field1577[var2][3]; // L: 236
			class129 var10 = this.field1577[var2][4]; // L: 237
			class129 var11 = this.field1577[var2][5]; // L: 238
			if (var9 != null) { // L: 239
				var6 = var9.method2964(var4);
			}

			if (var10 != null) { // L: 240
				var7 = var10.method2964(var4);
			}

			if (var11 != null) { // L: 241
				var8 = var11.method2964(var4);
			}
		}

		var1.field4695[12] = var6; // L: 243
		var1.field4695[13] = var7; // L: 244
		var1.field4695[14] = var8; // L: 245
	} // L: 246

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lqn;ILec;II)V",
		garbageValue = "-310087462"
	)
	void method3043(class438 var1, int var2, class126 var3, int var4) {
		float[] var5 = var3.method2944(this.field1578); // L: 249
		float var6 = var5[0]; // L: 250
		float var7 = var5[1]; // L: 251
		float var8 = var5[2]; // L: 252
		if (this.field1577[var2] != null) { // L: 253
			class129 var9 = this.field1577[var2][6]; // L: 254
			class129 var10 = this.field1577[var2][7]; // L: 255
			class129 var11 = this.field1577[var2][8]; // L: 256
			if (var9 != null) { // L: 257
				var6 = var9.method2964(var4);
			}

			if (var10 != null) { // L: 258
				var7 = var10.method2964(var4);
			}

			if (var11 != null) { // L: 259
				var8 = var11.method2964(var4);
			}
		}

		class438 var12 = Buddy.method7950(); // L: 261
		var12.method8156(var6, var7, var8); // L: 262
		var1.method8157(var12); // L: 263
		var12.method8197(); // L: 264
	} // L: 265

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Llt;",
		garbageValue = "-754384955"
	)
	public static PacketBufferNode method3066() {
		return PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0 ? new PacketBufferNode() : PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount]; // L: 22 23
	}

	@ObfuscatedName("ou")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "24"
	)
	static void method3067() {
		WorldMapManager.clientPreferences.method2447(Client.field485); // L: 12631
	} // L: 12632

	@ObfuscatedName("oz")
	@ObfuscatedSignature(
		descriptor = "(IS)Ltk;",
		garbageValue = "-18487"
	)
	static class494 method3039(int var0) {
		class494 var1 = (class494)Client.Widget_cachedFonts.get((long)var0); // L: 12657
		if (var1 == null) { // L: 12658
			var1 = new class494(class328.field3591, var0); // L: 12659
		}

		return var1; // L: 12661
	}
}
