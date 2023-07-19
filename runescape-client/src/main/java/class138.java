import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fw")
public class class138 extends DualNode {
	@ObfuscatedName("cd")
	static String field1604;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 265623035
	)
	int field1611;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[[Lfp;"
	)
	public class130[][] field1603;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[[Lfp;"
	)
	class130[][] field1605;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	public Skeleton field1602;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1323275139
	)
	int field1606;
	@ObfuscatedName("ap")
	boolean field1607;
	@ObfuscatedName("au")
	Future field1608;
	@ObfuscatedName("az")
	List field1609;

	@ObfuscatedSignature(
		descriptor = "(Lnr;Lnr;IZ)V"
	)
	class138(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		this.field1603 = null; // L: 21
		this.field1605 = null; // L: 22
		this.field1606 = 0; // L: 24
		this.field1611 = var3; // L: 62
		byte[] var5 = var1.takeFile(this.field1611 >> 16 & 65535, this.field1611 & 65535); // L: 63
		Buffer var6 = new Buffer(var5); // L: 64
		int var7 = var6.readUnsignedByte(); // L: 65
		int var8 = var6.readUnsignedShort(); // L: 66
		byte[] var9;
		if (var4) { // L: 68
			var9 = var2.getFile(0, var8);
		} else {
			var9 = var2.getFile(var8, 0); // L: 69
		}

		this.field1602 = new Skeleton(var8, var9); // L: 70
		this.field1609 = new ArrayList(); // L: 71
		this.field1608 = class421.field4590.submit(new class137(this, var6, var7)); // L: 72
	} // L: 79

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ltl;II)V",
		garbageValue = "-249589436"
	)
	void method3139(Buffer var1, int var2) {
		var1.readUnsignedShort(); // L: 82
		var1.readUnsignedShort(); // L: 83
		this.field1606 = var1.readUnsignedByte(); // L: 84
		int var3 = var1.readUnsignedShort(); // L: 85
		this.field1605 = new class130[this.field1602.method4608().method4566()][]; // L: 86
		this.field1603 = new class130[this.field1602.method4609()][]; // L: 87
		class129[] var4 = new class129[var3]; // L: 88

		int var5;
		int var7;
		int var9;
		for (var5 = 0; var5 < var3; ++var5) { // L: 89
			var7 = var1.readUnsignedByte(); // L: 91
			class131 var14 = (class131)class93.findEnumerated(class200.method3927(), var7); // L: 93
			if (var14 == null) { // L: 94
				var14 = class131.field1556;
			}

			var9 = var1.readShortSmart(); // L: 98
			class132 var16 = ClanSettings.method3329(var1.readUnsignedByte()); // L: 99
			class130 var17 = new class130(); // L: 100
			var17.method3076(var1, var2); // L: 101
			var4[var5] = new class129(this, var17, var14, var16, var9); // L: 102
			int var12 = var14.method3096(); // L: 103
			class130[][] var13;
			if (var14 == class131.field1554) { // L: 105
				var13 = this.field1605; // L: 106
			} else {
				var13 = this.field1603; // L: 109
			}

			if (var13[var9] == null) { // L: 111
				var13[var9] = new class130[var12]; // L: 112
			}

			if (var14 == class131.field1555) { // L: 114
				this.field1607 = true; // L: 115
			}
		}

		var5 = var3 / class499.field5027; // L: 118
		int var6 = var3 % class499.field5027; // L: 119
		int var8 = 0; // L: 121

		for (var9 = 0; var9 < class499.field5027; ++var9) { // L: 122
			var7 = var8; // L: 123
			var8 += var5; // L: 124
			if (var6 > 0) { // L: 125
				++var8; // L: 126
				--var6; // L: 127
			}

			if (var8 == var7) { // L: 129
				break;
			}

			this.field1609.add(class421.field4590.submit(new class133(this, var7, var8, var4))); // L: 134
		}

	} // L: 144

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2011901808"
	)
	public boolean method3154() {
		if (this.field1608 == null && this.field1609 == null) { // L: 147
			return true; // L: 148
		} else {
			if (this.field1608 != null) { // L: 150
				if (!this.field1608.isDone()) { // L: 151
					return false; // L: 152
				}

				this.field1608 = null; // L: 154
			}

			boolean var1 = true; // L: 156

			for (int var2 = 0; var2 < this.field1609.size(); ++var2) { // L: 157
				if (!((Future)this.field1609.get(var2)).isDone()) { // L: 158
					var1 = false; // L: 159
				} else {
					this.field1609.remove(var2); // L: 162
					--var2; // L: 163
				}
			}

			if (!var1) { // L: 166
				return false; // L: 167
			} else {
				this.field1609 = null; // L: 169
				return true; // L: 170
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "16776960"
	)
	public int method3140() {
		return this.field1606; // L: 174
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	public boolean method3141() {
		return this.field1607; // L: 178
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILeb;III)V",
		garbageValue = "811682719"
	)
	public void method3138(int var1, class127 var2, int var3, int var4) {
		class450 var5;
		synchronized(class450.field4733) { // L: 184
			if (class383.field4405 == 0) { // L: 185
				var5 = new class450();
			} else {
				class450.field4733[--class383.field4405].method8202(); // L: 187
				var5 = class450.field4733[class383.field4405]; // L: 188
			}
		}

		this.method3156(var5, var3, var2, var1); // L: 193
		this.method3152(var5, var3, var2, var1); // L: 194
		this.method3153(var5, var3, var2, var1); // L: 195
		var2.method3012(var5); // L: 196
		var5.method8246(); // L: 197
	} // L: 198

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lrp;ILeb;IB)V",
		garbageValue = "20"
	)
	void method3156(class450 var1, int var2, class127 var3, int var4) {
		float[] var5 = var3.method3015(this.field1606); // L: 201
		float var6 = var5[0]; // L: 202
		float var7 = var5[1]; // L: 203
		float var8 = var5[2]; // L: 204
		if (this.field1605[var2] != null) { // L: 205
			class130 var9 = this.field1605[var2][0]; // L: 206
			class130 var10 = this.field1605[var2][1]; // L: 207
			class130 var11 = this.field1605[var2][2]; // L: 208
			if (var9 != null) { // L: 209
				var6 = var9.method3060(var4);
			}

			if (var10 != null) { // L: 210
				var7 = var10.method3060(var4);
			}

			if (var11 != null) { // L: 211
				var8 = var11.method3060(var4);
			}
		}

		class449 var17 = KeyHandler.method458(); // L: 213
		var17.method8197(1.0F, 0.0F, 0.0F, var6); // L: 214
		class449 var18 = KeyHandler.method458(); // L: 215
		var18.method8197(0.0F, 1.0F, 0.0F, var7); // L: 216
		class449 var19 = KeyHandler.method458(); // L: 217
		var19.method8197(0.0F, 0.0F, 1.0F, var8); // L: 218
		class449 var12 = KeyHandler.method458(); // L: 219
		var12.method8176(var19); // L: 220
		var12.method8176(var17); // L: 221
		var12.method8176(var18); // L: 222
		class450 var13;
		synchronized(class450.field4733) { // L: 225
			if (class383.field4405 == 0) { // L: 226
				var13 = new class450();
			} else {
				class450.field4733[--class383.field4405].method8202(); // L: 228
				var13 = class450.field4733[class383.field4405]; // L: 229
			}
		}

		var13.method8247(var12); // L: 234
		var1.method8257(var13); // L: 235
		var17.method8198(); // L: 236
		var18.method8198(); // L: 237
		var19.method8198(); // L: 238
		var12.method8198(); // L: 239
		var13.method8246(); // L: 240
	} // L: 241

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lrp;ILeb;II)V",
		garbageValue = "-1449146933"
	)
	void method3153(class450 var1, int var2, class127 var3, int var4) {
		float[] var5 = var3.method3016(this.field1606); // L: 244
		float var6 = var5[0]; // L: 245
		float var7 = var5[1]; // L: 246
		float var8 = var5[2]; // L: 247
		if (this.field1605[var2] != null) { // L: 248
			class130 var9 = this.field1605[var2][3]; // L: 249
			class130 var10 = this.field1605[var2][4]; // L: 250
			class130 var11 = this.field1605[var2][5]; // L: 251
			if (var9 != null) { // L: 252
				var6 = var9.method3060(var4);
			}

			if (var10 != null) { // L: 253
				var7 = var10.method3060(var4);
			}

			if (var11 != null) { // L: 254
				var8 = var11.method3060(var4);
			}
		}

		var1.field4734[12] = var6; // L: 256
		var1.field4734[13] = var7; // L: 257
		var1.field4734[14] = var8; // L: 258
	} // L: 259

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lrp;ILeb;IS)V",
		garbageValue = "20928"
	)
	void method3152(class450 var1, int var2, class127 var3, int var4) {
		float[] var5 = var3.method3017(this.field1606); // L: 262
		float var6 = var5[0]; // L: 263
		float var7 = var5[1]; // L: 264
		float var8 = var5[2]; // L: 265
		if (this.field1605[var2] != null) { // L: 266
			class130 var9 = this.field1605[var2][6]; // L: 267
			class130 var10 = this.field1605[var2][7]; // L: 268
			class130 var11 = this.field1605[var2][8]; // L: 269
			if (var9 != null) { // L: 270
				var6 = var9.method3060(var4);
			}

			if (var10 != null) { // L: 271
				var7 = var10.method3060(var4);
			}

			if (var11 != null) { // L: 272
				var8 = var11.method3060(var4);
			}
		}

		class450 var14;
		synchronized(class450.field4733) { // L: 276
			if (class383.field4405 == 0) { // L: 277
				var14 = new class450();
			} else {
				class450.field4733[--class383.field4405].method8202(); // L: 279
				var14 = class450.field4733[class383.field4405]; // L: 280
			}
		}

		var14.method8220(var6, var7, var8); // L: 285
		var1.method8257(var14); // L: 286
		var14.method8246(); // L: 287
	} // L: 288

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIII)Ldr;",
		garbageValue = "-1643114092"
	)
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = SoundSystem.method858(var1, var0); // L: 38
		Script var4 = class18.method300(var3, var0); // L: 39
		if (var4 != null) { // L: 40
			return var4; // L: 41
		} else {
			int var5 = (-3 - var2 << 8) + var0; // L: 45
			var4 = class18.method300(var5, var0); // L: 48
			if (var4 != null) { // L: 49
				return var4; // L: 50
			} else {
				int var6 = var0 + -512; // L: 54
				var4 = class18.method300(var6, var0); // L: 57
				return var4 != null ? var4 : null; // L: 58 61
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)[Lia;",
		garbageValue = "38"
	)
	public static class217[] method3165() {
		return new class217[]{class217.field2391, class217.field2393, class217.field2392, class217.field2395}; // L: 14
	}

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1303711757"
	)
	static final void method3158() {
		for (GraphicsObject var0 = (GraphicsObject)Client.graphicsObjects.last(); var0 != null; var0 = (GraphicsObject)Client.graphicsObjects.previous()) { // L: 5183 5184 5191
			if (var0.plane == BuddyRankComparator.Client_plane && !var0.isFinished) { // L: 5185
				if (Client.cycle >= var0.cycleStart) { // L: 5186
					var0.advance(Client.field578); // L: 5187
					if (var0.isFinished) {
						var0.remove(); // L: 5188
					} else {
						class173.scene.drawEntity(var0.plane, var0.x, var0.y, var0.z, 60, var0, 0, -1L, false); // L: 5189
					}
				}
			} else {
				var0.remove();
			}
		}

	} // L: 5193
}
