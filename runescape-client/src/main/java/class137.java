import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fz")
public class class137 extends DualNode {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1073701221
	)
	int field1607;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[[Lfm;"
	)
	public class130[][] field1608;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[[Lfm;"
	)
	class130[][] field1610;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	public Skeleton field1609;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 225489079
	)
	int field1611;
	@ObfuscatedName("aj")
	boolean field1612;
	@ObfuscatedName("av")
	Future field1613;
	@ObfuscatedName("ap")
	List field1614;

	@ObfuscatedSignature(
		descriptor = "(Lnd;Lnd;IZ)V",
		garbageValue = "0"
	)
	public class137(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		this.field1608 = null; // L: 21
		this.field1610 = null; // L: 22
		this.field1611 = 0; // L: 24
		this.field1607 = var3; // L: 32
		byte[] var5 = var1.takeFile(this.field1607 >> 16 & 65535, this.field1607 & 65535); // L: 33
		Buffer var6 = new Buffer(var5); // L: 34
		int var7 = var6.readUnsignedByte(); // L: 35
		int var8 = var6.readUnsignedShort(); // L: 36
		byte[] var9 = var2.getFile(var8, 0); // L: 39
		this.field1609 = new Skeleton(var8, var9); // L: 40
		this.field1614 = new ArrayList(); // L: 41
		this.field1613 = SoundCache.field344.submit(new class134(this, var6, var7)); // L: 42
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lty;IB)V",
		garbageValue = "-79"
	)
	void method3055(Buffer var1, int var2) {
		var1.readUnsignedShort(); // L: 52
		var1.readUnsignedShort(); // L: 53
		this.field1611 = var1.readUnsignedByte(); // L: 54
		int var3 = var1.readUnsignedShort(); // L: 55
		this.field1610 = new class130[this.field1609.method4549().method4493()][]; // L: 56
		this.field1608 = new class130[this.field1609.method4554()][]; // L: 57
		class129[] var4 = new class129[var3]; // L: 58

		int var5;
		int var7;
		int var9;
		for (var5 = 0; var5 < var3; ++var5) { // L: 59
			var7 = var1.readUnsignedByte(); // L: 61
			class131[] var16 = new class131[]{class131.field1556, class131.field1557, class131.field1560, class131.field1559, class131.field1562, class131.field1561}; // L: 65
			class131 var17 = (class131)ClientPreferences.findEnumerated(var16, var7); // L: 67
			if (var17 == null) {
				var17 = class131.field1556; // L: 68
			}

			var9 = var1.readShortSmart(); // L: 72
			int var11 = var1.readUnsignedByte(); // L: 74
			class132 var12 = (class132)ClientPreferences.findEnumerated(MenuAction.method2085(), var11); // L: 76
			if (var12 == null) { // L: 77
				var12 = class132.field1575;
			}

			class130 var13 = new class130(); // L: 81
			var13.method2991(var1, var2); // L: 82
			var4[var5] = new class129(this, var13, var17, var12, var9); // L: 83
			int var14 = var17.method3018(); // L: 84
			class130[][] var15;
			if (var17 == class131.field1557) { // L: 86
				var15 = this.field1610; // L: 87
			} else {
				var15 = this.field1608; // L: 90
			}

			if (var15[var9] == null) { // L: 92
				var15[var9] = new class130[var14]; // L: 93
			}

			if (var17 == class131.field1562) { // L: 95
				this.field1612 = true; // L: 96
			}
		}

		var5 = var3 / UserComparator4.field1444; // L: 99
		int var6 = var3 % UserComparator4.field1444; // L: 100
		int var8 = 0; // L: 102

		for (var9 = 0; var9 < UserComparator4.field1444; ++var9) { // L: 103
			var7 = var8; // L: 104
			var8 += var5; // L: 105
			if (var6 > 0) { // L: 106
				++var8; // L: 107
				--var6; // L: 108
			}

			if (var7 == var8) { // L: 110
				break;
			}

			this.field1614.add(SoundCache.field344.submit(new class136(this, var7, var8, var4))); // L: 115
		}

	} // L: 125

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	public boolean method3056() {
		if (this.field1613 == null && this.field1614 == null) { // L: 128
			return true; // L: 129
		} else {
			if (this.field1613 != null) { // L: 131
				if (!this.field1613.isDone()) { // L: 132
					return false; // L: 133
				}

				this.field1613 = null; // L: 135
			}

			boolean var1 = true; // L: 137

			for (int var2 = 0; var2 < this.field1614.size(); ++var2) { // L: 138
				if (!((Future)this.field1614.get(var2)).isDone()) { // L: 139
					var1 = false; // L: 140
				} else {
					this.field1614.remove(var2); // L: 143
					--var2; // L: 144
				}
			}

			if (!var1) { // L: 147
				return false; // L: 148
			} else {
				this.field1614 = null; // L: 150
				return true; // L: 151
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-316980325"
	)
	public int method3082() {
		return this.field1611; // L: 155
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-96"
	)
	public boolean method3073() {
		return this.field1612; // L: 159
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILek;III)V",
		garbageValue = "519510056"
	)
	public void method3059(int var1, class127 var2, int var3, int var4) {
		class451 var5 = class138.method3097(); // L: 163
		this.method3060(var5, var3, var2, var1); // L: 164
		this.method3075(var5, var3, var2, var1); // L: 165
		this.method3061(var5, var3, var2, var1); // L: 166
		var2.method2974(var5); // L: 167
		var5.method8279(); // L: 168
	} // L: 169

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lrm;ILek;IB)V",
		garbageValue = "2"
	)
	void method3060(class451 var1, int var2, class127 var3, int var4) {
		float[] var5 = var3.method2951(this.field1611); // L: 172
		float var6 = var5[0]; // L: 173
		float var7 = var5[1]; // L: 174
		float var8 = var5[2]; // L: 175
		if (this.field1610[var2] != null) { // L: 176
			class130 var9 = this.field1610[var2][0]; // L: 177
			class130 var10 = this.field1610[var2][1]; // L: 178
			class130 var11 = this.field1610[var2][2]; // L: 179
			if (var9 != null) { // L: 180
				var6 = var9.method2993(var4);
			}

			if (var10 != null) { // L: 181
				var7 = var10.method2993(var4);
			}

			if (var11 != null) { // L: 182
				var8 = var11.method2993(var4);
			}
		}

		class450 var16 = ViewportMouse.method4940(); // L: 184
		var16.method8222(1.0F, 0.0F, 0.0F, var6); // L: 185
		class450 var14 = ViewportMouse.method4940(); // L: 186
		var14.method8222(0.0F, 1.0F, 0.0F, var7); // L: 187
		class450 var15 = ViewportMouse.method4940(); // L: 188
		var15.method8222(0.0F, 0.0F, 1.0F, var8); // L: 189
		class450 var12 = ViewportMouse.method4940(); // L: 190
		var12.method8228(var15); // L: 191
		var12.method8228(var16); // L: 192
		var12.method8228(var14); // L: 193
		class451 var13 = class138.method3097(); // L: 194
		var13.method8255(var12); // L: 195
		var1.method8285(var13); // L: 196
		var16.method8224(); // L: 197
		var14.method8224(); // L: 198
		var15.method8224(); // L: 199
		var12.method8224(); // L: 200
		var13.method8279(); // L: 201
	} // L: 202

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lrm;ILek;II)V",
		garbageValue = "-502012777"
	)
	void method3061(class451 var1, int var2, class127 var3, int var4) {
		float[] var5 = var3.method2952(this.field1611); // L: 205
		float var6 = var5[0]; // L: 206
		float var7 = var5[1]; // L: 207
		float var8 = var5[2]; // L: 208
		if (this.field1610[var2] != null) { // L: 209
			class130 var9 = this.field1610[var2][3]; // L: 210
			class130 var10 = this.field1610[var2][4]; // L: 211
			class130 var11 = this.field1610[var2][5]; // L: 212
			if (var9 != null) { // L: 213
				var6 = var9.method2993(var4);
			}

			if (var10 != null) { // L: 214
				var7 = var10.method2993(var4);
			}

			if (var11 != null) { // L: 215
				var8 = var11.method2993(var4);
			}
		}

		var1.field4743[12] = var6; // L: 217
		var1.field4743[13] = var7; // L: 218
		var1.field4743[14] = var8; // L: 219
	} // L: 220

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lrm;ILek;II)V",
		garbageValue = "1367616310"
	)
	void method3075(class451 var1, int var2, class127 var3, int var4) {
		float[] var5 = var3.method2953(this.field1611); // L: 223
		float var6 = var5[0]; // L: 224
		float var7 = var5[1]; // L: 225
		float var8 = var5[2]; // L: 226
		if (this.field1610[var2] != null) { // L: 227
			class130 var9 = this.field1610[var2][6]; // L: 228
			class130 var10 = this.field1610[var2][7]; // L: 229
			class130 var11 = this.field1610[var2][8]; // L: 230
			if (var9 != null) { // L: 231
				var6 = var9.method2993(var4);
			}

			if (var10 != null) { // L: 232
				var7 = var10.method2993(var4);
			}

			if (var11 != null) { // L: 233
				var8 = var11.method2993(var4);
			}
		}

		class451 var12 = class138.method3097(); // L: 235
		var12.method8266(var6, var7, var8); // L: 236
		var1.method8285(var12); // L: 237
		var12.method8279(); // L: 238
	} // L: 239

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lcr;I)V",
		garbageValue = "1214318405"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) { // L: 2140
			Client.isMembersWorld = var0.isMembersOnly(); // L: 2141
			PendingSpawn.method2378(var0.isMembersOnly()); // L: 2142
		}

		if (var0.properties != Client.worldProperties) { // L: 2144
			class425.method7865(class386.field4436, var0.properties); // L: 2145
		}

		VarbitComposition.worldHost = var0.host; // L: 2147
		Client.worldId = var0.id; // L: 2148
		Client.worldProperties = var0.properties; // L: 2149
		VarpDefinition.field1910 = var0.field823; // L: 2150
		Login.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000; // L: 2151
		class11.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000; // L: 2152
		Varps.currentPort = Login.worldPort; // L: 2153
	} // L: 2154
}
