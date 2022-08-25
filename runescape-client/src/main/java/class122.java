import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dk")
public class class122 extends DualNode {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 47124249
	)
	int field1500;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "[[Ldj;"
	)
	public class117[][] field1499;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "[[Ldj;"
	)
	class117[][] field1501;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lge;"
	)
	public Skeleton field1498;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1241117003
	)
	int field1502;
	@ObfuscatedName("q")
	boolean field1503;

	@ObfuscatedSignature(
		descriptor = "(Lls;Lls;IZ)V"
	)
	class122(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		this.field1499 = null; // L: 14
		this.field1501 = null; // L: 15
		this.field1502 = 0; // L: 17
		this.field1500 = var3; // L: 42
		byte[] var5 = var1.takeFile(this.field1500 >> 16 & 65535, this.field1500 & 65535); // L: 43
		Buffer var6 = new Buffer(var5); // L: 44
		int var7 = var6.readUnsignedByte(); // L: 45
		int var8 = var6.readUnsignedShort(); // L: 46
		byte[] var9;
		if (var4) { // L: 48
			var9 = var2.getFile(0, var8);
		} else {
			var9 = var2.getFile(var8, 0); // L: 49
		}

		this.field1498 = new Skeleton(var8, var9); // L: 50
		this.method2738(var6, var7); // L: 51
	} // L: 52

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lqr;II)V",
		garbageValue = "1821026276"
	)
	void method2738(Buffer var1, int var2) {
		var1.readUnsignedShort(); // L: 55
		var1.readUnsignedShort(); // L: 56
		this.field1502 = var1.readUnsignedByte(); // L: 57
		int var3 = var1.readUnsignedShort(); // L: 58
		this.field1501 = new class117[this.field1498.method4044().method4035()][]; // L: 59
		this.field1499 = new class117[this.field1498.method4042()][]; // L: 60

		for (int var4 = 0; var4 < var3; ++var4) { // L: 61
			int var6 = var1.readUnsignedByte(); // L: 63
			class118[] var7 = new class118[]{class118.field1464, class118.field1457, class118.field1458, class118.field1459, class118.field1465, class118.field1461}; // L: 67
			class118 var8 = (class118)GameEngine.findEnumerated(var7, var6); // L: 69
			if (var8 == null) { // L: 70
				var8 = class118.field1464;
			}

			int var15 = var1.readShortSmart(); // L: 74
			int var10 = var1.readUnsignedByte(); // L: 76
			class119 var11 = (class119)GameEngine.findEnumerated(AttackOption.method2359(), var10); // L: 78
			if (var11 == null) { // L: 79
				var11 = class119.field1488;
			}

			class117 var12 = new class117(); // L: 83
			var12.method2685(var1, var2); // L: 84
			int var13 = var8.method2714(); // L: 85
			class117[][] var14;
			if (var8 == class118.field1457) { // L: 87
				var14 = this.field1501; // L: 88
			} else {
				var14 = this.field1499; // L: 91
			}

			if (var14[var15] == null) { // L: 93
				var14[var15] = new class117[var13]; // L: 94
			}

			var14[var15][var11.method2723()] = var12; // L: 96
			if (var8 == class118.field1465) { // L: 97
				this.field1503 = true; // L: 98
			}
		}

	} // L: 101

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-331412620"
	)
	public int method2753() {
		return this.field1502; // L: 104
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "965641583"
	)
	public boolean method2743() {
		return this.field1503; // L: 108
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILdp;III)V",
		garbageValue = "-1989117578"
	)
	public void method2740(int var1, class115 var2, int var3, int var4) {
		class388 var5 = Language.method5989(); // L: 112
		this.method2741(var5, var3, var2, var1); // L: 113
		this.method2737(var5, var3, var2, var1); // L: 114
		this.method2742(var5, var3, var2, var1); // L: 115
		var2.method2664(var5); // L: 116
		var5.method6946(); // L: 117
	} // L: 118

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lny;ILdp;IB)V",
		garbageValue = "-13"
	)
	void method2741(class388 var1, int var2, class115 var3, int var4) {
		float[] var5 = var3.method2648(this.field1502); // L: 121
		float var6 = var5[0]; // L: 122
		float var7 = var5[1]; // L: 123
		float var8 = var5[2]; // L: 124
		if (this.field1501[var2] != null) { // L: 125
			class117 var9 = this.field1501[var2][0]; // L: 126
			class117 var10 = this.field1501[var2][1]; // L: 127
			class117 var11 = this.field1501[var2][2]; // L: 128
			if (var9 != null) { // L: 129
				var6 = var9.method2705(var4);
			}

			if (var10 != null) { // L: 130
				var7 = var10.method2705(var4);
			}

			if (var11 != null) { // L: 131
				var8 = var11.method2705(var4);
			}
		}

		class387 var16 = SpriteMask.method5460(); // L: 133
		var16.method6883(1.0F, 0.0F, 0.0F, var6); // L: 134
		class387 var14 = SpriteMask.method5460(); // L: 135
		var14.method6883(0.0F, 1.0F, 0.0F, var7); // L: 136
		class387 var15 = SpriteMask.method5460(); // L: 137
		var15.method6883(0.0F, 0.0F, 1.0F, var8); // L: 138
		class387 var12 = SpriteMask.method5460(); // L: 139
		var12.method6885(var15); // L: 140
		var12.method6885(var16); // L: 141
		var12.method6885(var14); // L: 142
		class388 var13 = Language.method5989(); // L: 143
		var13.method6918(var12); // L: 144
		var1.method6954(var13); // L: 145
		var16.method6881(); // L: 146
		var14.method6881(); // L: 147
		var15.method6881(); // L: 148
		var12.method6881(); // L: 149
		var13.method6946(); // L: 150
	} // L: 151

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lny;ILdp;II)V",
		garbageValue = "-1790393470"
	)
	void method2742(class388 var1, int var2, class115 var3, int var4) {
		float[] var5 = var3.method2649(this.field1502); // L: 154
		float var6 = var5[0]; // L: 155
		float var7 = var5[1]; // L: 156
		float var8 = var5[2]; // L: 157
		if (this.field1501[var2] != null) { // L: 158
			class117 var9 = this.field1501[var2][3]; // L: 159
			class117 var10 = this.field1501[var2][4]; // L: 160
			class117 var11 = this.field1501[var2][5]; // L: 161
			if (var9 != null) { // L: 162
				var6 = var9.method2705(var4);
			}

			if (var10 != null) { // L: 163
				var7 = var10.method2705(var4);
			}

			if (var11 != null) { // L: 164
				var8 = var11.method2705(var4);
			}
		}

		var1.field4398[12] = var6; // L: 166
		var1.field4398[13] = var7; // L: 167
		var1.field4398[14] = var8; // L: 168
	} // L: 169

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lny;ILdp;II)V",
		garbageValue = "-1739320011"
	)
	void method2737(class388 var1, int var2, class115 var3, int var4) {
		float[] var5 = var3.method2647(this.field1502); // L: 172
		float var6 = var5[0]; // L: 173
		float var7 = var5[1]; // L: 174
		float var8 = var5[2]; // L: 175
		if (this.field1501[var2] != null) { // L: 176
			class117 var9 = this.field1501[var2][6]; // L: 177
			class117 var10 = this.field1501[var2][7]; // L: 178
			class117 var11 = this.field1501[var2][8]; // L: 179
			if (var9 != null) { // L: 180
				var6 = var9.method2705(var4);
			}

			if (var10 != null) { // L: 181
				var7 = var10.method2705(var4);
			}

			if (var11 != null) { // L: 182
				var8 = var11.method2705(var4);
			}
		}

		class388 var12 = Language.method5989(); // L: 184
		var12.method6928(var6, var7, var8); // L: 185
		var1.method6954(var12); // L: 186
		var12.method6946(); // L: 187
	} // L: 188

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(Lkn;IIII)V",
		garbageValue = "-1486048779"
	)
	@Export("drawCompass")
	static final void drawCompass(Widget var0, int var1, int var2, int var3) {
		SpriteMask var4 = var0.getSpriteMask(false); // L: 11918
		if (var4 != null) { // L: 11919
			if (Client.minimapState < 3) { // L: 11920
				class16.compass.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var4.xStarts, var4.xWidths);
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 11921
			}

		}
	} // L: 11922
}
