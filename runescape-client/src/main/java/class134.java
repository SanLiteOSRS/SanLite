import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fl")
public class class134 extends DualNode {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1863398797
	)
	public static int field1573;
	@ObfuscatedName("ak")
	@Export("Tiles_saturation")
	static int[] Tiles_saturation;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1849285827
	)
	int field1574;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[[Lew;"
	)
	public class127[][] field1568;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[[Lew;"
	)
	class127[][] field1575;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lin;"
	)
	public Skeleton field1570;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1417348875
	)
	int field1567;
	@ObfuscatedName("ao")
	boolean field1569;
	@ObfuscatedName("ap")
	Future field1572;
	@ObfuscatedName("ar")
	List field1571;

	@ObfuscatedSignature(
		descriptor = "(Lne;Lne;IZ)V",
		garbageValue = "0"
	)
	public class134(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		this.field1568 = null; // L: 21
		this.field1575 = null; // L: 22
		this.field1567 = 0; // L: 24
		this.field1574 = var3;
		byte[] var5 = var1.takeFile(this.field1574 >> 16 & 65535, this.field1574 & 65535); // L: 33
		Buffer var6 = new Buffer(var5); // L: 34
		int var7 = var6.readUnsignedByte(); // L: 35
		int var8 = var6.readUnsignedShort(); // L: 36
		byte[] var9 = var2.getFile(var8, 0); // L: 39
		this.field1570 = new Skeleton(var8, var9); // L: 40
		this.field1571 = new ArrayList(); // L: 41
		this.field1572 = UserComparator7.field1413.submit(new class131(this, var6, var7)); // L: 42
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lsy;IB)V",
		garbageValue = "15"
	)
	void method3049(Buffer var1, int var2) {
		var1.readUnsignedShort(); // L: 52
		var1.readUnsignedShort(); // L: 53
		this.field1567 = var1.readUnsignedByte(); // L: 54
		int var3 = var1.readUnsignedShort(); // L: 55
		this.field1575 = new class127[this.field1570.method4377().method4357()][]; // L: 56
		this.field1568 = new class127[this.field1570.method4380()][]; // L: 57
		class126[] var4 = new class126[var3]; // L: 58

		int var5;
		int var7;
		for (var5 = 0; var5 < var3; ++var5) { // L: 59
			class128 var12 = UserComparator9.method2874(var1.readUnsignedByte()); // L: 60
			var7 = var1.readShortSmart(); // L: 61
			class129 var13 = WorldMapSectionType.method5191(var1.readUnsignedByte()); // L: 62
			class127 var14 = new class127(); // L: 63
			var14.method2972(var1, var2); // L: 64
			var4[var5] = new class126(this, var14, var12, var13, var7); // L: 65
			int var10 = var12.method3006(); // L: 66
			class127[][] var15;
			if (var12 == class128.field1534) { // L: 68
				var15 = this.field1575; // L: 69
			} else {
				var15 = this.field1568; // L: 72
			}

			if (var15[var7] == null) { // L: 74
				var15[var7] = new class127[var10]; // L: 75
			}

			if (var12 == class128.field1526) { // L: 77
				this.field1569 = true; // L: 78
			}
		}

		var5 = var3 / field1573; // L: 81
		int var6 = var3 % field1573; // L: 82
		int var8 = 0; // L: 84

		for (int var9 = 0; var9 < field1573; ++var9) { // L: 85
			var7 = var8; // L: 86
			var8 += var5; // L: 87
			if (var6 > 0) { // L: 88
				++var8; // L: 89
				--var6; // L: 90
			}

			if (var8 == var7) { // L: 92
				break;
			}

			this.field1571.add(UserComparator7.field1413.submit(new class133(this, var7, var8, var4))); // L: 97
		}

	} // L: 107

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "204129598"
	)
	public boolean method3044() {
		if (this.field1572 == null && this.field1571 == null) { // L: 110
			return true; // L: 111
		} else {
			if (this.field1572 != null) { // L: 113
				if (!this.field1572.isDone()) { // L: 114
					return false; // L: 115
				}

				this.field1572 = null; // L: 117
			}

			boolean var1 = true; // L: 119

			for (int var2 = 0; var2 < this.field1571.size(); ++var2) { // L: 120
				if (!((Future)this.field1571.get(var2)).isDone()) { // L: 121
					var1 = false; // L: 122
				} else {
					this.field1571.remove(var2); // L: 125
					--var2; // L: 126
				}
			}

			if (!var1) { // L: 129
				return false; // L: 130
			} else {
				this.field1571 = null; // L: 132
				return true; // L: 133
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "44"
	)
	public int method3058() {
		return this.field1567; // L: 137
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-213201648"
	)
	public boolean method3043() {
		return this.field1569; // L: 141
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILek;III)V",
		garbageValue = "-1829799905"
	)
	public void method3047(int var1, class124 var2, int var3, int var4) {
		class421 var5;
		synchronized(class421.field4611) { // L: 147
			if (class421.field4610 == 0) { // L: 148
				var5 = new class421();
			} else {
				class421.field4611[--class421.field4610].method7856(); // L: 150
				var5 = class421.field4611[class421.field4610]; // L: 151
			}
		}

		this.method3048(var5, var3, var2, var1); // L: 156
		this.method3045(var5, var3, var2, var1); // L: 157
		this.method3054(var5, var3, var2, var1); // L: 158
		var2.method2944(var5); // L: 159
		var5.method7888(); // L: 160
	} // L: 161

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lqt;ILek;IB)V",
		garbageValue = "-67"
	)
	void method3048(class421 var1, int var2, class124 var3, int var4) {
		float[] var5 = var3.method2935(this.field1567); // L: 164
		float var6 = var5[0]; // L: 165
		float var7 = var5[1]; // L: 166
		float var8 = var5[2]; // L: 167
		if (this.field1575[var2] != null) { // L: 168
			class127 var9 = this.field1575[var2][0]; // L: 169
			class127 var10 = this.field1575[var2][1]; // L: 170
			class127 var11 = this.field1575[var2][2]; // L: 171
			if (var9 != null) { // L: 172
				var6 = var9.method2974(var4);
			}

			if (var10 != null) { // L: 173
				var7 = var10.method2974(var4);
			}

			if (var11 != null) { // L: 174
				var8 = var11.method2974(var4);
			}
		}

		class420 var17 = class287.method5474(); // L: 176
		var17.method7820(1.0F, 0.0F, 0.0F, var6); // L: 177
		class420 var18 = class287.method5474(); // L: 178
		var18.method7820(0.0F, 1.0F, 0.0F, var7); // L: 179
		class420 var19 = class287.method5474(); // L: 180
		var19.method7820(0.0F, 0.0F, 1.0F, var8); // L: 181
		class420 var12 = class287.method5474(); // L: 182
		var12.method7819(var19); // L: 183
		var12.method7819(var17); // L: 184
		var12.method7819(var18); // L: 185
		class421 var13;
		synchronized(class421.field4611) { // L: 188
			if (class421.field4610 == 0) { // L: 189
				var13 = new class421();
			} else {
				class421.field4611[--class421.field4610].method7856(); // L: 191
				var13 = class421.field4611[class421.field4610]; // L: 192
			}
		}

		var13.method7852(var12); // L: 197
		var1.method7851(var13); // L: 198
		var17.method7824(); // L: 199
		var18.method7824(); // L: 200
		var19.method7824(); // L: 201
		var12.method7824(); // L: 202
		var13.method7888(); // L: 203
	} // L: 204

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lqt;ILek;IB)V",
		garbageValue = "21"
	)
	void method3054(class421 var1, int var2, class124 var3, int var4) {
		float[] var5 = var3.method2936(this.field1567); // L: 207
		float var6 = var5[0]; // L: 208
		float var7 = var5[1]; // L: 209
		float var8 = var5[2]; // L: 210
		if (this.field1575[var2] != null) { // L: 211
			class127 var9 = this.field1575[var2][3]; // L: 212
			class127 var10 = this.field1575[var2][4]; // L: 213
			class127 var11 = this.field1575[var2][5]; // L: 214
			if (var9 != null) { // L: 215
				var6 = var9.method2974(var4);
			}

			if (var10 != null) { // L: 216
				var7 = var10.method2974(var4);
			}

			if (var11 != null) { // L: 217
				var8 = var11.method2974(var4);
			}
		}

		var1.field4608[12] = var6; // L: 219
		var1.field4608[13] = var7; // L: 220
		var1.field4608[14] = var8; // L: 221
	} // L: 222

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lqt;ILek;IB)V",
		garbageValue = "-128"
	)
	void method3045(class421 var1, int var2, class124 var3, int var4) {
		float[] var5 = var3.method2937(this.field1567); // L: 225
		float var6 = var5[0]; // L: 226
		float var7 = var5[1]; // L: 227
		float var8 = var5[2]; // L: 228
		if (this.field1575[var2] != null) { // L: 229
			class127 var9 = this.field1575[var2][6]; // L: 230
			class127 var10 = this.field1575[var2][7]; // L: 231
			class127 var11 = this.field1575[var2][8]; // L: 232
			if (var9 != null) { // L: 233
				var6 = var9.method2974(var4);
			}

			if (var10 != null) { // L: 234
				var7 = var10.method2974(var4);
			}

			if (var11 != null) { // L: 235
				var8 = var11.method2974(var4);
			}
		}

		class421 var14;
		synchronized(class421.field4611) { // L: 239
			if (class421.field4610 == 0) { // L: 240
				var14 = new class421();
			} else {
				class421.field4611[--class421.field4610].method7856(); // L: 242
				var14 = class421.field4611[class421.field4610]; // L: 243
			}
		}

		var14.method7847(var6, var7, var8); // L: 248
		var1.method7851(var14); // L: 249
		var14.method7888(); // L: 250
	} // L: 251

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Lhk;",
		garbageValue = "-998339406"
	)
	public static FloorUnderlayDefinition method3068(int var0) {
		FloorUnderlayDefinition var1 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var0); // L: 25
		if (var1 != null) { // L: 26
			return var1;
		} else {
			byte[] var2 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var0); // L: 27
			var1 = new FloorUnderlayDefinition(); // L: 28
			if (var2 != null) { // L: 29
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode(); // L: 30
			FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var1, (long)var0); // L: 31
			return var1; // L: 32
		}
	}
}
