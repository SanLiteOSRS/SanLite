import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fa")
public class class138 extends DualNode {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -855552635
	)
	int field1637;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[[Lfm;"
	)
	public class131[][] field1633;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[[Lfm;"
	)
	class131[][] field1634;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	public Skeleton field1635;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1978354313
	)
	int field1636;
	@ObfuscatedName("ao")
	boolean field1643;
	@ObfuscatedName("ad")
	Future field1638;
	@ObfuscatedName("al")
	List field1639;

	@ObfuscatedSignature(
		descriptor = "(Loc;Loc;IZ)V",
		garbageValue = "0"
	)
	public class138(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		this.field1633 = null; // L: 21
		this.field1634 = null; // L: 22
		this.field1636 = 0; // L: 24
		this.field1637 = var3; // L: 32
		byte[] var5 = var1.takeFile(this.field1637 >> 16 & 65535, this.field1637 & 65535); // L: 33
		Buffer var6 = new Buffer(var5); // L: 34
		int var7 = var6.readUnsignedByte(); // L: 35
		int var8 = var6.readUnsignedShort(); // L: 36
		byte[] var9 = var2.getFile(var8, 0); // L: 39
		this.field1635 = new Skeleton(var8, var9); // L: 40
		this.field1639 = new ArrayList(); // L: 41
		this.field1638 = class328.field3567.submit(new class135(this, var6, var7)); // L: 42
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lur;IB)V",
		garbageValue = "26"
	)
	void method3086(Buffer var1, int var2) {
		var1.readUnsignedShort(); // L: 52
		var1.readUnsignedShort(); // L: 53
		this.field1636 = var1.readUnsignedByte(); // L: 54
		int var3 = var1.readUnsignedShort(); // L: 55
		this.field1634 = new class131[this.field1635.method4697().method4642()][]; // L: 56
		this.field1633 = new class131[this.field1635.method4695()][]; // L: 57
		class130[] var4 = new class130[var3]; // L: 58

		int var5;
		int var7;
		for (var5 = 0; var5 < var3; ++var5) { // L: 59
			class132 var12 = Language.method7195(var1.readUnsignedByte()); // L: 60
			var7 = var1.readShortSmart(); // L: 61
			class133 var13 = AbstractWorldMapData.method5682(var1.readUnsignedByte()); // L: 62
			class131 var14 = new class131(); // L: 63
			var14.method3017(var1, var2); // L: 64
			var4[var5] = new class130(this, var14, var12, var13, var7); // L: 65
			int var10 = var12.method3049(); // L: 66
			class131[][] var15;
			if (var12 == class132.field1583) { // L: 68
				var15 = this.field1634; // L: 69
			} else {
				var15 = this.field1633; // L: 72
			}

			if (var15[var7] == null) { // L: 74
				var15[var7] = new class131[var10]; // L: 75
			}

			if (var12 == class132.field1586) { // L: 77
				this.field1643 = true; // L: 78
			}
		}

		var5 = var3 / class154.field1730; // L: 81
		int var6 = var3 % class154.field1730; // L: 82
		int var8 = 0; // L: 84

		for (int var9 = 0; var9 < class154.field1730; ++var9) { // L: 85
			var7 = var8; // L: 86
			var8 += var5; // L: 87
			if (var6 > 0) { // L: 88
				++var8; // L: 89
				--var6; // L: 90
			}

			if (var7 == var8) { // L: 92
				break;
			}

			this.field1639.add(class328.field3567.submit(new class137(this, var7, var8, var4))); // L: 97
		}

	} // L: 107

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "13"
	)
	public boolean method3087() {
		if (this.field1638 == null && this.field1639 == null) { // L: 110
			return true; // L: 111
		} else {
			if (this.field1638 != null) { // L: 113
				if (!this.field1638.isDone()) { // L: 114
					return false; // L: 115
				}

				this.field1638 = null; // L: 117
			}

			boolean var1 = true; // L: 119

			for (int var2 = 0; var2 < this.field1639.size(); ++var2) { // L: 120
				if (!((Future)this.field1639.get(var2)).isDone()) { // L: 121
					var1 = false; // L: 122
				} else {
					this.field1639.remove(var2); // L: 125
					--var2; // L: 126
				}
			}

			if (!var1) { // L: 129
				return false; // L: 130
			} else {
				this.field1639 = null; // L: 132
				return true; // L: 133
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-18"
	)
	public int method3091() {
		return this.field1636; // L: 137
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2042733866"
	)
	public boolean method3089() {
		return this.field1643; // L: 141
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILei;IIS)V",
		garbageValue = "-17614"
	)
	public void method3090(int var1, class128 var2, int var3, int var4) {
		class470 var5 = HealthBar.method2579(); // L: 145
		this.method3106(var5, var3, var2, var1); // L: 146
		this.method3093(var5, var3, var2, var1); // L: 147
		this.method3092(var5, var3, var2, var1); // L: 148
		var2.method2964(var5); // L: 149
		var5.method8460(); // L: 150
	} // L: 151

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lsq;ILei;IS)V",
		garbageValue = "-6583"
	)
	void method3106(class470 var1, int var2, class128 var3, int var4) {
		float[] var5 = var3.method2983(this.field1636); // L: 154
		float var6 = var5[0]; // L: 155
		float var7 = var5[1]; // L: 156
		float var8 = var5[2]; // L: 157
		if (this.field1634[var2] != null) { // L: 158
			class131 var9 = this.field1634[var2][0]; // L: 159
			class131 var10 = this.field1634[var2][1]; // L: 160
			class131 var11 = this.field1634[var2][2]; // L: 161
			if (var9 != null) { // L: 162
				var6 = var9.method3025(var4);
			}

			if (var10 != null) { // L: 163
				var7 = var10.method3025(var4);
			}

			if (var11 != null) { // L: 164
				var8 = var11.method3025(var4);
			}
		}

		class469 var16 = WorldMapData_0.method5232(); // L: 166
		var16.method8383(1.0F, 0.0F, 0.0F, var6); // L: 167
		class469 var14 = WorldMapData_0.method5232(); // L: 168
		var14.method8383(0.0F, 1.0F, 0.0F, var7); // L: 169
		class469 var15 = WorldMapData_0.method5232(); // L: 170
		var15.method8383(0.0F, 0.0F, 1.0F, var8); // L: 171
		class469 var12 = WorldMapData_0.method5232(); // L: 172
		var12.method8382(var15); // L: 173
		var12.method8382(var16); // L: 174
		var12.method8382(var14); // L: 175
		class470 var13 = HealthBar.method2579(); // L: 176
		var13.method8432(var12); // L: 177
		var1.method8414(var13); // L: 178
		var16.method8386(); // L: 179
		var14.method8386(); // L: 180
		var15.method8386(); // L: 181
		var12.method8386(); // L: 182
		var13.method8460(); // L: 183
	} // L: 184

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lsq;ILei;IS)V",
		garbageValue = "16165"
	)
	void method3092(class470 var1, int var2, class128 var3, int var4) {
		float[] var5 = var3.method2969(this.field1636); // L: 187
		float var6 = var5[0]; // L: 188
		float var7 = var5[1]; // L: 189
		float var8 = var5[2]; // L: 190
		if (this.field1634[var2] != null) { // L: 191
			class131 var9 = this.field1634[var2][3]; // L: 192
			class131 var10 = this.field1634[var2][4]; // L: 193
			class131 var11 = this.field1634[var2][5]; // L: 194
			if (var9 != null) { // L: 195
				var6 = var9.method3025(var4);
			}

			if (var10 != null) { // L: 196
				var7 = var10.method3025(var4);
			}

			if (var11 != null) { // L: 197
				var8 = var11.method3025(var4);
			}
		}

		var1.field4872[12] = var6; // L: 199
		var1.field4872[13] = var7; // L: 200
		var1.field4872[14] = var8; // L: 201
	} // L: 202

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lsq;ILei;IB)V",
		garbageValue = "-33"
	)
	void method3093(class470 var1, int var2, class128 var3, int var4) {
		float[] var5 = var3.method2959(this.field1636); // L: 205
		float var6 = var5[0]; // L: 206
		float var7 = var5[1]; // L: 207
		float var8 = var5[2]; // L: 208
		if (this.field1634[var2] != null) { // L: 209
			class131 var9 = this.field1634[var2][6]; // L: 210
			class131 var10 = this.field1634[var2][7]; // L: 211
			class131 var11 = this.field1634[var2][8]; // L: 212
			if (var9 != null) { // L: 213
				var6 = var9.method3025(var4);
			}

			if (var10 != null) { // L: 214
				var7 = var10.method3025(var4);
			}

			if (var11 != null) { // L: 215
				var8 = var11.method3025(var4);
			}
		}

		class470 var12 = HealthBar.method2579(); // L: 217
		var12.method8410(var6, var7, var8); // L: 218
		var1.method8414(var12); // L: 219
		var12.method8460(); // L: 220
	} // L: 221

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lhf;",
		garbageValue = "1476190089"
	)
	public static Clock method3101() {
		try {
			return new NanoClock(); // L: 8
		} catch (Throwable var1) { // L: 10
			return new MilliClock(); // L: 11
		}
	}
}
