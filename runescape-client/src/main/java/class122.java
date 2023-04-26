import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ew")
public class class122 {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 875758789
	)
	public final int field1481;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lew;"
	)
	public class122 field1478;
	@ObfuscatedName("aw")
	float[][] field1474;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[Lqj;"
	)
	final class425[] field1475;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Lqj;"
	)
	class425[] field1476;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lqj;"
	)
	class425[] field1477;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	class425 field1485;
	@ObfuscatedName("al")
	boolean field1479;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	class425 field1480;
	@ObfuscatedName("aa")
	boolean field1472;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	class425 field1482;
	@ObfuscatedName("ao")
	float[][] field1483;
	@ObfuscatedName("ax")
	float[][] field1473;
	@ObfuscatedName("ai")
	float[][] field1484;

	@ObfuscatedSignature(
		descriptor = "(ILsg;Z)V"
	)
	public class122(int var1, Buffer var2, boolean var3) {
		this.field1485 = new class425(); // L: 13
		this.field1479 = true; // L: 14
		this.field1480 = new class425(); // L: 15
		this.field1472 = true; // L: 16
		this.field1482 = new class425(); // L: 17
		this.field1481 = var2.readShort(); // L: 23
		this.field1475 = new class425[var1]; // L: 24
		this.field1476 = new class425[this.field1475.length]; // L: 25
		this.field1477 = new class425[this.field1475.length]; // L: 26
		this.field1474 = new float[this.field1475.length][3]; // L: 27

		for (int var4 = 0; var4 < this.field1475.length; ++var4) { // L: 28
			this.field1475[var4] = new class425(var2, var3); // L: 29
			this.field1474[var4][0] = var2.method9064(); // L: 30
			this.field1474[var4][1] = var2.method9064(); // L: 31
			this.field1474[var4][2] = var2.method9064(); // L: 32
		}

		this.method2995(); // L: 34
	} // L: 35

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "685443179"
	)
	void method2995() {
		this.field1483 = new float[this.field1475.length][3]; // L: 38
		this.field1473 = new float[this.field1475.length][3]; // L: 39
		this.field1484 = new float[this.field1475.length][3]; // L: 40
		class425 var1;
		synchronized(class425.field4665) { // L: 43
			if (class425.field4667 == 0) { // L: 44
				var1 = new class425();
			} else {
				class425.field4665[--class425.field4667].method8177();
				var1 = class425.field4665[class425.field4667];
			}
		}

		class425 var2 = var1;

		for (int var5 = 0; var5 < this.field1475.length; ++var5) {
			class425 var4 = this.method2996(var5); // L: 53
			var2.method8179(var4); // L: 54
			var2.method8197(); // L: 55
			this.field1483[var5] = var2.method8173(); // L: 56
			this.field1473[var5][0] = var4.field4670[12]; // L: 57
			this.field1473[var5][1] = var4.field4670[13]; // L: 58
			this.field1473[var5][2] = var4.field4670[14]; // L: 59
			this.field1484[var5] = var4.method8224(); // L: 60
		}

		var2.method8176(); // L: 62
	} // L: 63

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)Lqj;",
		garbageValue = "0"
	)
	class425 method2996(int var1) {
		return this.field1475[var1]; // L: 66
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)Lqj;",
		garbageValue = "8"
	)
	class425 method2997(int var1) {
		if (this.field1476[var1] == null) { // L: 70
			this.field1476[var1] = new class425(this.method2996(var1)); // L: 71
			if (this.field1478 != null) { // L: 72
				this.field1476[var1].method8183(this.field1478.method2997(var1)); // L: 73
			} else {
				this.field1476[var1].method8183(class425.field4664);
			}
		}

		return this.field1476[var1];
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Lqj;",
		garbageValue = "2116559151"
	)
	class425 method3009(int var1) {
		if (this.field1477[var1] == null) {
			this.field1477[var1] = new class425(this.method2997(var1)); // L: 84
			this.field1477[var1].method8197(); // L: 85
		}

		return this.field1477[var1];
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lqj;I)V",
		garbageValue = "-2093338496"
	)
	void method3011(class425 var1) {
		this.field1485.method8179(var1); // L: 91
		this.field1479 = true; // L: 92
		this.field1472 = true; // L: 93
	} // L: 94

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Lqj;",
		garbageValue = "535482001"
	)
	class425 method3000() {
		return this.field1485; // L: 97
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Lqj;",
		garbageValue = "2"
	)
	class425 method3021() {
		if (this.field1479) { // L: 101
			this.field1480.method8179(this.method3000()); // L: 102
			if (this.field1478 != null) { // L: 103
				this.field1480.method8183(this.field1478.method3021()); // L: 104
			}

			this.field1479 = false; // L: 106
		}

		return this.field1480; // L: 108
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Lqj;",
		garbageValue = "250554518"
	)
	public class425 method2999(int var1) {
		if (this.field1472) {
			this.field1482.method8179(this.method3009(var1));
			this.field1482.method8183(this.method3021());
			this.field1472 = false;
		}

		return this.field1482;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "689701217"
	)
	float[] method3017(int var1) {
		return this.field1483[var1];
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "2097133235"
	)
	float[] method3003(int var1) {
		return this.field1473[var1]; // L: 125
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "-2141341986"
	)
	float[] method3004(int var1) {
		return this.field1484[var1]; // L: 129
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhb;",
		garbageValue = "4"
	)
	public static HitSplatDefinition method3046(int var0) {
		HitSplatDefinition var1 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var0); // L: 46
		if (var1 != null) { // L: 47
			return var1;
		} else {
			byte[] var2 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var0); // L: 48
			var1 = new HitSplatDefinition(); // L: 49
			if (var2 != null) { // L: 50
				var1.decode(new Buffer(var2));
			}

			HitSplatDefinition.HitSplatDefinition_cached.put(var1, (long)var0); // L: 51
			return var1; // L: 52
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1549240794"
	)
	static final void method3044(int var0, int var1, int var2, int var3) {
		for (int var4 = var1; var4 <= var3 + var1; ++var4) { // L: 76
			for (int var5 = var0; var5 <= var0 + var2; ++var5) { // L: 77
				if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) { // L: 78
					Tiles.field994[0][var5][var4] = 127; // L: 79
					if (var0 == var5 && var5 > 0) { // L: 80
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 - 1][var4];
					}

					if (var5 == var0 + var2 && var5 < 103) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 + 1][var4]; // L: 81
					}

					if (var4 == var1 && var4 > 0) { // L: 82
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 - 1];
					}

					if (var4 == var3 + var1 && var4 < 103) { // L: 83
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 + 1];
					}
				}
			}
		}

	} // L: 87

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-702557639"
	)
	static final void method3045() {
		if (!ViewportMouse.ViewportMouse_false0) { // L: 112
			int var0 = Scene.Scene_cameraPitchSine; // L: 113
			int var1 = Scene.Scene_cameraPitchCosine; // L: 114
			int var2 = Scene.Scene_cameraYawSine; // L: 115
			int var3 = Scene.Scene_cameraYawCosine; // L: 116
			byte var4 = 50; // L: 117
			short var5 = 3500; // L: 118
			int var6 = (ViewportMouse.ViewportMouse_x - TaskHandler.method3563()) * var4 / UserComparator7.method2904(); // L: 119
			int var7 = (ViewportMouse.ViewportMouse_y - class12.method164()) * var4 / UserComparator7.method2904(); // L: 120
			int var8 = (ViewportMouse.ViewportMouse_x - TaskHandler.method3563()) * var5 / UserComparator7.method2904(); // L: 121
			int var9 = (ViewportMouse.ViewportMouse_y - class12.method164()) * var5 / UserComparator7.method2904(); // L: 122
			int var11 = var1 * var7 + var0 * var4 >> 16; // L: 126
			int var12 = var1 * var4 - var0 * var7 >> 16; // L: 131
			int var13 = var5 * var0 + var1 * var9 >> 16; // L: 137
			int var14 = var1 * var5 - var9 * var0 >> 16; // L: 142
			int var10 = class387.method7599(var6, var12, var3, var2); // L: 146
			int var15 = class437.method8344(var6, var12, var3, var2); // L: 147
			var6 = var10; // L: 148
			var10 = class387.method7599(var8, var14, var3, var2); // L: 149
			int var16 = class437.method8344(var8, var14, var3, var2); // L: 150
			ViewportMouse.field2767 = (var6 + var10) / 2; // L: 152
			class294.field3366 = (var11 + var13) / 2; // L: 153
			ViewportMouse.field2768 = (var16 + var15) / 2; // L: 154
			ViewportMouse.field2769 = (var10 - var6) / 2; // L: 155
			UserComparator8.field1418 = (var13 - var11) / 2; // L: 156
			ReflectionCheck.field268 = (var16 - var15) / 2; // L: 157
			EnumComposition.field1979 = Math.abs(ViewportMouse.field2769); // L: 158
			ViewportMouse.field2771 = Math.abs(UserComparator8.field1418); // L: 159
			class9.field44 = Math.abs(ReflectionCheck.field268); // L: 160
		}
	} // L: 161
}
