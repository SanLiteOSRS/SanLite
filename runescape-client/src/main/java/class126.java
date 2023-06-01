import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ec")
public class class126 {
	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	@Export("fontBold12")
	static Font fontBold12;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1200350973
	)
	public final int field1481;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lec;"
	)
	public class126 field1488;
	@ObfuscatedName("ar")
	float[][] field1476;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lqn;"
	)
	final class438[] field1477;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Lqn;"
	)
	class438[] field1478;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[Lqn;"
	)
	class438[] field1479;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	class438 field1480;
	@ObfuscatedName("aj")
	boolean field1485;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	class438 field1475;
	@ObfuscatedName("ag")
	boolean field1483;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	class438 field1484;
	@ObfuscatedName("aw")
	float[][] field1482;
	@ObfuscatedName("ae")
	float[][] field1486;
	@ObfuscatedName("ah")
	float[][] field1487;

	@ObfuscatedSignature(
		descriptor = "(ILtc;Z)V"
	)
	public class126(int var1, Buffer var2, boolean var3) {
		this.field1480 = new class438(); // L: 13
		this.field1485 = true;
		this.field1475 = new class438();
		this.field1483 = true;
		this.field1484 = new class438();
		this.field1481 = var2.readShort();
		this.field1477 = new class438[var1];
		this.field1478 = new class438[this.field1477.length];
		this.field1479 = new class438[this.field1477.length];
		this.field1476 = new float[this.field1477.length][3];

		for (int var4 = 0; var4 < this.field1477.length; ++var4) {
			this.field1477[var4] = new class438(var2, var3);
			this.field1476[var4][0] = var2.method8971();
			this.field1476[var4][1] = var2.method8971();
			this.field1476[var4][2] = var2.method8971();
		}

		this.method2925(); // L: 34
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "14"
	)
	void method2925() {
		this.field1482 = new float[this.field1477.length][3];
		this.field1486 = new float[this.field1477.length][3];
		this.field1487 = new float[this.field1477.length][3]; // L: 40
		class438 var1 = Buddy.method7950(); // L: 41

		for (int var2 = 0; var2 < this.field1477.length; ++var2) { // L: 42
			class438 var3 = this.method2923(var2); // L: 43
			var1.method8154(var3); // L: 44
			var1.method8161(); // L: 45
			this.field1482[var2] = var1.method8151(); // L: 46
			this.field1486[var2][0] = var3.field4695[12]; // L: 47
			this.field1486[var2][1] = var3.field4695[13]; // L: 48
			this.field1486[var2][2] = var3.field4695[14]; // L: 49
			this.field1487[var2] = var3.method8164(); // L: 50
		}

		var1.method8197(); // L: 52
	} // L: 53

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Lqn;",
		garbageValue = "267357987"
	)
	class438 method2923(int var1) {
		return this.field1477[var1]; // L: 56
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Lqn;",
		garbageValue = "466346404"
	)
	class438 method2932(int var1) {
		if (this.field1478[var1] == null) { // L: 60
			this.field1478[var1] = new class438(this.method2923(var1)); // L: 61
			if (this.field1488 != null) { // L: 62
				this.field1478[var1].method8157(this.field1488.method2932(var1)); // L: 63
			} else {
				this.field1478[var1].method8157(class438.field4692); // L: 66
			}
		}

		return this.field1478[var1]; // L: 69
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)Lqn;",
		garbageValue = "-80"
	)
	class438 method2951(int var1) {
		if (this.field1479[var1] == null) { // L: 73
			this.field1479[var1] = new class438(this.method2932(var1)); // L: 74
			this.field1479[var1].method8161(); // L: 75
		}

		return this.field1479[var1]; // L: 77
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lqn;I)V",
		garbageValue = "-154330859"
	)
	void method2926(class438 var1) {
		this.field1480.method8154(var1); // L: 81
		this.field1485 = true; // L: 82
		this.field1483 = true; // L: 83
	} // L: 84

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)Lqn;",
		garbageValue = "103"
	)
	class438 method2927() {
		return this.field1480; // L: 87
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Lqn;",
		garbageValue = "36"
	)
	class438 method2924() {
		if (this.field1485) { // L: 91
			this.field1475.method8154(this.method2927()); // L: 92
			if (this.field1488 != null) { // L: 93
				this.field1475.method8157(this.field1488.method2924()); // L: 94
			}

			this.field1485 = false; // L: 96
		}

		return this.field1475; // L: 98
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)Lqn;",
		garbageValue = "-26"
	)
	public class438 method2929(int var1) {
		if (this.field1483) { // L: 102
			this.field1484.method8154(this.method2951(var1)); // L: 103
			this.field1484.method8157(this.method2924()); // L: 104
			this.field1483 = false; // L: 105
		}

		return this.field1484; // L: 107
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)[F",
		garbageValue = "-14"
	)
	float[] method2922(int var1) {
		return this.field1482[var1]; // L: 111
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)[F",
		garbageValue = "48"
	)
	float[] method2931(int var1) {
		return this.field1486[var1]; // L: 115
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "-1691046827"
	)
	float[] method2944(int var1) {
		return this.field1487[var1]; // L: 119
	}

	@ObfuscatedName("ay")
	public static final int method2952(double var0, double var2, double var4) {
		double var6 = var4; // L: 9
		double var8 = var4; // L: 10
		double var10 = var4; // L: 11
		if (var2 != 0.0D) { // L: 12
			double var12;
			if (var4 < 0.5D) { // L: 14
				var12 = var4 * (1.0D + var2);
			} else {
				var12 = var2 + var4 - var4 * var2; // L: 15
			}

			double var14 = var4 * 2.0D - var12; // L: 16
			double var16 = var0 + 0.3333333333333333D; // L: 17
			if (var16 > 1.0D) { // L: 18
				--var16;
			}

			double var20 = var0 - 0.3333333333333333D; // L: 20
			if (var20 < 0.0D) { // L: 21
				++var20;
			}

			if (var16 * 6.0D < 1.0D) { // L: 22
				var6 = var16 * (var12 - var14) * 6.0D + var14;
			} else if (2.0D * var16 < 1.0D) { // L: 23
				var6 = var12;
			} else if (var16 * 3.0D < 2.0D) { // L: 24
				var6 = (0.6666666666666666D - var16) * (var12 - var14) * 6.0D + var14;
			} else {
				var6 = var14; // L: 25
			}

			if (var0 * 6.0D < 1.0D) { // L: 26
				var8 = 6.0D * (var12 - var14) * var0 + var14;
			} else if (var0 * 2.0D < 1.0D) { // L: 27
				var8 = var12;
			} else if (3.0D * var0 < 2.0D) { // L: 28
				var8 = (0.6666666666666666D - var0) * (var12 - var14) * 6.0D + var14;
			} else {
				var8 = var14; // L: 29
			}

			if (6.0D * var20 < 1.0D) { // L: 30
				var10 = (var12 - var14) * 6.0D * var20 + var14;
			} else if (2.0D * var20 < 1.0D) { // L: 31
				var10 = var12;
			} else if (3.0D * var20 < 2.0D) { // L: 32
				var10 = (0.6666666666666666D - var20) * (var12 - var14) * 6.0D + var14;
			} else {
				var10 = var14; // L: 33
			}
		}

		int var22 = (int)(var6 * 256.0D); // L: 35
		int var13 = (int)(256.0D * var8); // L: 36
		int var23 = (int)(256.0D * var10); // L: 37
		int var15 = var23 + (var13 << 8) + (var22 << 16); // L: 38
		return var15; // L: 39
	}

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-167199804"
	)
	static final void method2953(int var0, int var1) {
		if (var0 < 128) { // L: 3908
			var0 = 128; // L: 3909
		} else if (var0 > 383) { // L: 3911
			var0 = 383; // L: 3912
		}

		if (ObjectComposition.cameraPitch < var0) { // L: 3914
			ObjectComposition.cameraPitch = (var0 - ObjectComposition.cameraPitch) * class280.field3075 / 1000 + ObjectComposition.cameraPitch + class141.field1619; // L: 3915
			if (ObjectComposition.cameraPitch > var0) { // L: 3916
				ObjectComposition.cameraPitch = var0; // L: 3917
			}
		} else if (ObjectComposition.cameraPitch > var0) { // L: 3920
			ObjectComposition.cameraPitch -= (ObjectComposition.cameraPitch - var0) * class280.field3075 / 1000 + class141.field1619; // L: 3921
			if (ObjectComposition.cameraPitch < var0) { // L: 3922
				ObjectComposition.cameraPitch = var0; // L: 3923
			}
		}

		var1 &= 2047; // L: 3926
		int var2 = var1 - Coord.cameraYaw; // L: 3927
		if (var2 > 1024) { // L: 3928
			var2 -= 2048; // L: 3929
		} else if (var2 < -1024) { // L: 3931
			var2 += 2048; // L: 3932
		}

		if (var2 > 0) { // L: 3934
			Coord.cameraYaw = var2 * class280.field3075 / 1000 + Coord.cameraYaw + class141.field1619; // L: 3935
			Coord.cameraYaw &= 2047; // L: 3936
		} else if (var2 < 0) { // L: 3938
			Coord.cameraYaw -= class141.field1619 + -var2 * class280.field3075 / 1000; // L: 3939
			Coord.cameraYaw &= 2047; // L: 3940
		}

		int var3 = var1 - Coord.cameraYaw; // L: 3942
		if (var3 > 1024) { // L: 3943
			var3 -= 2048; // L: 3944
		} else if (var3 < -1024) { // L: 3946
			var3 += 2048; // L: 3947
		}

		if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) { // L: 3949
			Coord.cameraYaw = var1; // L: 3950
		}

	} // L: 3952
}
