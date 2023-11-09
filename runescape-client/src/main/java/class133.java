import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fh")
public class class133 extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1609019153
	)
	static int field1593;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	static ClanSettings field1597;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1156919267
	)
	int field1587;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[[Lek;"
	)
	public class125[][] field1592;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[[Lek;"
	)
	class125[][] field1589;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public Skeleton field1590;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -744553313
	)
	int field1591;
	@ObfuscatedName("ab")
	boolean field1598;
	@ObfuscatedName("at")
	Future field1594;
	@ObfuscatedName("aa")
	List field1595;

	@ObfuscatedSignature(
		descriptor = "(Lnm;Lnm;IZ)V"
	)
	class133(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		this.field1592 = null; // L: 21
		this.field1589 = null; // L: 22
		this.field1591 = 0; // L: 24
		this.field1587 = var3; // L: 62
		byte[] var5 = var1.takeFile(this.field1587 >> 16 & 65535, this.field1587 & 65535); // L: 63
		Buffer var6 = new Buffer(var5); // L: 64
		int var7 = var6.readUnsignedByte(); // L: 65
		int var8 = var6.readUnsignedShort(); // L: 66
		byte[] var9;
		if (var4) { // L: 68
			var9 = var2.getFile(0, var8);
		} else {
			var9 = var2.getFile(var8, 0); // L: 69
		}

		this.field1590 = new Skeleton(var8, var9); // L: 70
		this.field1595 = new ArrayList(); // L: 71
		this.field1594 = class374.field4387.submit(new class132(this, var6, var7)); // L: 72
	} // L: 79

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lsg;IB)V",
		garbageValue = "-87"
	)
	void method3135(Buffer var1, int var2) {
		var1.readUnsignedShort(); // L: 82
		var1.readUnsignedShort(); // L: 83
		this.field1591 = var1.readUnsignedByte(); // L: 84
		int var3 = var1.readUnsignedShort(); // L: 85
		this.field1589 = new class125[this.field1590.method4517().method4452()][]; // L: 86
		this.field1592 = new class125[this.field1590.method4516()][]; // L: 87
		class124[] var4 = new class124[var3]; // L: 88

		int var5;
		int var7;
		int var9;
		for (var5 = 0; var5 < var3; ++var5) { // L: 89
			var7 = var1.readUnsignedByte(); // L: 91
			class126 var14 = (class126)StructComposition.findEnumerated(VarpDefinition.method3655(), var7); // L: 93
			if (var14 == null) { // L: 94
				var14 = class126.field1535;
			}

			var9 = var1.readShortSmart(); // L: 98
			class127 var16 = UserComparator9.method2940(var1.readUnsignedByte()); // L: 99
			class125 var17 = new class125(); // L: 100
			var17.method3060(var1, var2); // L: 101
			var4[var5] = new class124(this, var17, var14, var16, var9); // L: 102
			int var12 = var14.method3101(); // L: 103
			class125[][] var13;
			if (var14 == class126.field1532) { // L: 105
				var13 = this.field1589; // L: 106
			} else {
				var13 = this.field1592; // L: 109
			}

			if (var13[var9] == null) { // L: 111
				var13[var9] = new class125[var12]; // L: 112
			}

			if (var14 == class126.field1539) { // L: 114
				this.field1598 = true; // L: 115
			}
		}

		var5 = var3 / field1593; // L: 118
		int var6 = var3 % field1593; // L: 119
		int var8 = 0; // L: 121

		for (var9 = 0; var9 < field1593; ++var9) { // L: 122
			var7 = var8; // L: 123
			var8 += var5; // L: 124
			if (var6 > 0) { // L: 125
				++var8; // L: 126
				--var6; // L: 127
			}

			if (var8 == var7) { // L: 129
				break;
			}

			this.field1595.add(class374.field4387.submit(new class128(this, var7, var8, var4))); // L: 134
		}

	} // L: 144

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-63286081"
	)
	public boolean method3156() {
		if (this.field1594 == null && this.field1595 == null) { // L: 147
			return true; // L: 148
		} else {
			if (this.field1594 != null) { // L: 150
				if (!this.field1594.isDone()) { // L: 151
					return false; // L: 152
				}

				this.field1594 = null; // L: 154
			}

			boolean var1 = true; // L: 156

			for (int var2 = 0; var2 < this.field1595.size(); ++var2) { // L: 157
				if (!((Future)this.field1595.get(var2)).isDone()) { // L: 158
					var1 = false; // L: 159
				} else {
					this.field1595.remove(var2); // L: 162
					--var2; // L: 163
				}
			}

			if (!var1) { // L: 166
				return false; // L: 167
			} else {
				this.field1595 = null; // L: 169
				return true; // L: 170
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2042558319"
	)
	public int method3141() {
		return this.field1591; // L: 174
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1713081171"
	)
	public boolean method3136() {
		return this.field1598; // L: 178
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILew;III)V",
		garbageValue = "-434592312"
	)
	public void method3139(int var1, class122 var2, int var3, int var4) {
		class425 var5;
		synchronized(class425.field4665) { // L: 184
			if (class425.field4667 == 0) { // L: 185
				var5 = new class425();
			} else {
				class425.field4665[--class425.field4667].method8177(); // L: 187
				var5 = class425.field4665[class425.field4667]; // L: 188
			}
		}

		this.method3160(var5, var3, var2, var1); // L: 193
		this.method3164(var5, var3, var2, var1); // L: 194
		this.method3140(var5, var3, var2, var1); // L: 195
		var2.method3011(var5); // L: 196
		var5.method8176(); // L: 197
	} // L: 198

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lqj;ILew;II)V",
		garbageValue = "-2042507237"
	)
	void method3160(class425 var1, int var2, class122 var3, int var4) {
		float[] var5 = var3.method3017(this.field1591); // L: 201
		float var6 = var5[0]; // L: 202
		float var7 = var5[1]; // L: 203
		float var8 = var5[2]; // L: 204
		if (this.field1589[var2] != null) { // L: 205
			class125 var9 = this.field1589[var2][0]; // L: 206
			class125 var10 = this.field1589[var2][1]; // L: 207
			class125 var11 = this.field1589[var2][2]; // L: 208
			if (var9 != null) { // L: 209
				var6 = var9.method3062(var4);
			}

			if (var10 != null) { // L: 210
				var7 = var10.method3062(var4);
			}

			if (var11 != null) { // L: 211
				var8 = var11.method3062(var4);
			}
		}

		class424 var17 = class131.method3130(); // L: 213
		var17.method8139(1.0F, 0.0F, 0.0F, var6); // L: 214
		class424 var18 = class131.method3130(); // L: 215
		var18.method8139(0.0F, 1.0F, 0.0F, var7); // L: 216
		class424 var19 = class131.method3130(); // L: 217
		var19.method8139(0.0F, 0.0F, 1.0F, var8); // L: 218
		class424 var12 = class131.method3130(); // L: 219
		var12.method8141(var19); // L: 220
		var12.method8141(var17); // L: 221
		var12.method8141(var18); // L: 222
		class425 var13;
		synchronized(class425.field4665) { // L: 225
			if (class425.field4667 == 0) { // L: 226
				var13 = new class425();
			} else {
				class425.field4665[--class425.field4667].method8177(); // L: 228
				var13 = class425.field4665[class425.field4667]; // L: 229
			}
		}

		var13.method8184(var12); // L: 234
		var1.method8183(var13); // L: 235
		var17.method8144(); // L: 236
		var18.method8144(); // L: 237
		var19.method8144(); // L: 238
		var12.method8144(); // L: 239
		var13.method8176(); // L: 240
	} // L: 241

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lqj;ILew;II)V",
		garbageValue = "2146059803"
	)
	void method3140(class425 var1, int var2, class122 var3, int var4) {
		float[] var5 = var3.method3003(this.field1591); // L: 244
		float var6 = var5[0]; // L: 245
		float var7 = var5[1]; // L: 246
		float var8 = var5[2]; // L: 247
		if (this.field1589[var2] != null) { // L: 248
			class125 var9 = this.field1589[var2][3]; // L: 249
			class125 var10 = this.field1589[var2][4]; // L: 250
			class125 var11 = this.field1589[var2][5]; // L: 251
			if (var9 != null) { // L: 252
				var6 = var9.method3062(var4);
			}

			if (var10 != null) { // L: 253
				var7 = var10.method3062(var4);
			}

			if (var11 != null) { // L: 254
				var8 = var11.method3062(var4);
			}
		}

		var1.field4670[12] = var6; // L: 256
		var1.field4670[13] = var7; // L: 257
		var1.field4670[14] = var8; // L: 258
	} // L: 259

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lqj;ILew;II)V",
		garbageValue = "-1686943935"
	)
	void method3164(class425 var1, int var2, class122 var3, int var4) {
		float[] var5 = var3.method3004(this.field1591); // L: 262
		float var6 = var5[0]; // L: 263
		float var7 = var5[1]; // L: 264
		float var8 = var5[2]; // L: 265
		if (this.field1589[var2] != null) { // L: 266
			class125 var9 = this.field1589[var2][6]; // L: 267
			class125 var10 = this.field1589[var2][7]; // L: 268
			class125 var11 = this.field1589[var2][8]; // L: 269
			if (var9 != null) { // L: 270
				var6 = var9.method3062(var4);
			}

			if (var10 != null) { // L: 271
				var7 = var10.method3062(var4);
			}

			if (var11 != null) { // L: 272
				var8 = var11.method3062(var4);
			}
		}

		class425 var14;
		synchronized(class425.field4665) { // L: 276
			if (class425.field4667 == 0) { // L: 277
				var14 = new class425();
			} else {
				class425.field4665[--class425.field4667].method8177(); // L: 279
				var14 = class425.field4665[class425.field4667]; // L: 280
			}
		}

		var14.method8223(var6, var7, var8); // L: 285
		var1.method8183(var14); // L: 286
		var14.method8176(); // L: 287
	} // L: 288

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-121"
	)
	@Export("queueSoundEffect")
	static void queueSoundEffect(int var0, int var1, int var2) {
		if (class20.clientPreferences.method2463() != 0 && var1 != 0 && Client.soundEffectCount < 50) { // L: 3507
			Client.soundEffectIds[Client.soundEffectCount] = var0; // L: 3508
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1; // L: 3509
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2; // L: 3510
			Client.soundEffects[Client.soundEffectCount] = null; // L: 3511
			Client.soundLocations[Client.soundEffectCount] = 0; // L: 3512
			++Client.soundEffectCount; // L: 3513
		}

	} // L: 3515

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1741543163"
	)
	static final void method3165(int var0, int var1, int var2) {
		if (class36.cameraX < var0) { // L: 3720
			class36.cameraX = (var0 - class36.cameraX) * class138.field1637 / 1000 + class36.cameraX + class25.field137; // L: 3721
			if (class36.cameraX > var0) { // L: 3722
				class36.cameraX = var0;
			}
		}

		if (class36.cameraX > var0) { // L: 3724
			class36.cameraX -= (class36.cameraX - var0) * class138.field1637 / 1000 + class25.field137; // L: 3725
			if (class36.cameraX < var0) { // L: 3726
				class36.cameraX = var0;
			}
		}

		if (class174.cameraY < var1) { // L: 3728
			class174.cameraY = (var1 - class174.cameraY) * class138.field1637 / 1000 + class174.cameraY + class25.field137; // L: 3729
			if (class174.cameraY > var1) { // L: 3730
				class174.cameraY = var1;
			}
		}

		if (class174.cameraY > var1) { // L: 3732
			class174.cameraY -= (class174.cameraY - var1) * class138.field1637 / 1000 + class25.field137; // L: 3733
			if (class174.cameraY < var1) { // L: 3734
				class174.cameraY = var1;
			}
		}

		if (class297.cameraZ < var2) { // L: 3736
			class297.cameraZ = (var2 - class297.cameraZ) * class138.field1637 / 1000 + class297.cameraZ + class25.field137; // L: 3737
			if (class297.cameraZ > var2) { // L: 3738
				class297.cameraZ = var2;
			}
		}

		if (class297.cameraZ > var2) { // L: 3740
			class297.cameraZ -= (class297.cameraZ - var2) * class138.field1637 / 1000 + class25.field137; // L: 3741
			if (class297.cameraZ < var2) { // L: 3742
				class297.cameraZ = var2;
			}
		}

	} // L: 3744
}
