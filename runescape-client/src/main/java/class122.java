import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("di")
public class class122 {
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1842803755
	)
	public final int field1456;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	public class122 field1457;
	@ObfuscatedName("c")
	float[][] field1469;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "[Lov;"
	)
	final class407[] field1458;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "[Lov;"
	)
	class407[] field1459;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "[Lov;"
	)
	class407[] field1460;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	class407 field1467;
	@ObfuscatedName("d")
	boolean field1462;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	class407 field1463;
	@ObfuscatedName("r")
	boolean field1461;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	class407 field1464;
	@ObfuscatedName("s")
	float[][] field1466;
	@ObfuscatedName("p")
	float[][] field1465;
	@ObfuscatedName("b")
	float[][] field1468;

	@ObfuscatedSignature(
		descriptor = "(ILqr;Z)V"
	)
	public class122(int var1, Buffer var2, boolean var3) {
		this.field1467 = new class407(); // L: 13
		this.field1462 = true; // L: 14
		this.field1463 = new class407(); // L: 15
		this.field1461 = true; // L: 16
		this.field1464 = new class407(); // L: 17
		this.field1456 = var2.readShort(); // L: 23
		this.field1458 = new class407[var1]; // L: 24
		this.field1459 = new class407[this.field1458.length]; // L: 25
		this.field1460 = new class407[this.field1458.length]; // L: 26
		this.field1469 = new float[this.field1458.length][3]; // L: 27

		for (int var4 = 0; var4 < this.field1458.length; ++var4) { // L: 28
			this.field1458[var4] = new class407(var2, var3); // L: 29
			this.field1469[var4][0] = var2.method8410(); // L: 30
			this.field1469[var4][1] = var2.method8410(); // L: 31
			this.field1469[var4][2] = var2.method8410(); // L: 32
		}

		this.method2825(); // L: 34
	} // L: 35

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-79"
	)
	void method2825() {
		this.field1466 = new float[this.field1458.length][3]; // L: 38
		this.field1465 = new float[this.field1458.length][3]; // L: 39
		this.field1468 = new float[this.field1458.length][3]; // L: 40
		class407 var1 = Coord.method5706(); // L: 41

		for (int var2 = 0; var2 < this.field1458.length; ++var2) { // L: 42
			class407 var3 = this.method2863(var2); // L: 43
			var1.method7648(var3); // L: 44
			var1.method7678(); // L: 45
			this.field1466[var2] = var1.method7645(); // L: 46
			this.field1465[var2][0] = var3.field4566[12]; // L: 47
			this.field1465[var2][1] = var3.field4566[13]; // L: 48
			this.field1465[var2][2] = var3.field4566[14]; // L: 49
			this.field1468[var2] = var3.method7658(); // L: 50
		}

		var1.method7695(); // L: 52
	} // L: 53

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Lov;",
		garbageValue = "1957990882"
	)
	class407 method2863(int var1) {
		return this.field1458[var1]; // L: 56
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Lov;",
		garbageValue = "-1684001429"
	)
	class407 method2843(int var1) {
		if (this.field1459[var1] == null) { // L: 60
			this.field1459[var1] = new class407(this.method2863(var1)); // L: 61
			if (this.field1457 != null) { // L: 62
				this.field1459[var1].method7652(this.field1457.method2843(var1)); // L: 63
			} else {
				this.field1459[var1].method7652(class407.field4567); // L: 66
			}
		}

		return this.field1459[var1]; // L: 69
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(II)Lov;",
		garbageValue = "2008765713"
	)
	class407 method2828(int var1) {
		if (this.field1460[var1] == null) { // L: 73
			this.field1460[var1] = new class407(this.method2843(var1)); // L: 74
			this.field1460[var1].method7678(); // L: 75
		}

		return this.field1460[var1]; // L: 77
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lov;B)V",
		garbageValue = "-124"
	)
	void method2847(class407 var1) {
		this.field1467.method7648(var1); // L: 81
		this.field1462 = true; // L: 82
		this.field1461 = true; // L: 83
	} // L: 84

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)Lov;",
		garbageValue = "723790579"
	)
	class407 method2830() {
		return this.field1467; // L: 87
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)Lov;",
		garbageValue = "-1868205322"
	)
	class407 method2831() {
		if (this.field1462) { // L: 91
			this.field1463.method7648(this.method2830()); // L: 92
			if (this.field1457 != null) { // L: 93
				this.field1463.method7652(this.field1457.method2831()); // L: 94
			}

			this.field1462 = false; // L: 96
		}

		return this.field1463;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(II)Lov;",
		garbageValue = "2047938676"
	)
	public class407 method2832(int var1) {
		if (this.field1461) {
			this.field1464.method7648(this.method2828(var1));
			this.field1464.method7652(this.method2831());
			this.field1461 = false;
		}

		return this.field1464;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IB)[F",
		garbageValue = "-77"
	)
	float[] method2845(int var1) {
		return this.field1466[var1];
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IB)[F",
		garbageValue = "43"
	)
	float[] method2834(int var1) {
		return this.field1465[var1];
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IB)[F",
		garbageValue = "1"
	)
	float[] method2835(int var1) {
		return this.field1468[var1];
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-60194862"
	)
	static final boolean method2865() {
		return ViewportMouse.ViewportMouse_isInViewport; // L: 90
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1460045562"
	)
	static final void method2864() {
		if (!ViewportMouse.ViewportMouse_false0) { // L: 98
			int var0 = Scene.Scene_cameraPitchSine; // L: 99
			int var1 = Scene.Scene_cameraPitchCosine; // L: 100
			int var2 = Scene.Scene_cameraYawSine; // L: 101
			int var3 = Scene.Scene_cameraYawCosine; // L: 102
			byte var4 = 50; // L: 103
			short var5 = 3500; // L: 104
			int var6 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var4 / Rasterizer3D.Rasterizer3D_zoom; // L: 105
			int var7 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var4 / Rasterizer3D.Rasterizer3D_zoom; // L: 106
			int var8 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var5 / Rasterizer3D.Rasterizer3D_zoom; // L: 107
			int var9 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var5 / Rasterizer3D.Rasterizer3D_zoom; // L: 108
			int var10 = Rasterizer3D.method4189(var7, var4, var1, var0); // L: 110
			int var11 = Rasterizer3D.method4199(var7, var4, var1, var0); // L: 111
			var7 = var10; // L: 112
			var10 = Rasterizer3D.method4189(var9, var5, var1, var0); // L: 113
			int var12 = Rasterizer3D.method4199(var9, var5, var1, var0); // L: 114
			var9 = var10; // L: 115
			var10 = Rasterizer3D.method4214(var6, var11, var3, var2); // L: 116
			var11 = Rasterizer3D.method4172(var6, var11, var3, var2); // L: 117
			var6 = var10; // L: 118
			var10 = Rasterizer3D.method4214(var8, var12, var3, var2); // L: 119
			var12 = Rasterizer3D.method4172(var8, var12, var3, var2); // L: 120
			ViewportMouse.field2672 = (var10 + var6) / 2; // L: 122
			ViewportMouse.field2677 = (var7 + var9) / 2; // L: 123
			ViewportMouse.field2674 = (var11 + var12) / 2; // L: 124
			class309.field3657 = (var10 - var6) / 2; // L: 125
			UserComparator6.field1435 = (var9 - var7) / 2; // L: 126
			MenuAction.field887 = (var12 - var11) / 2; // L: 127
			ViewportMouse.field2675 = Math.abs(class309.field3657); // L: 128
			WorldMapArchiveLoader.field4685 = Math.abs(UserComparator6.field1435); // L: 129
			class6.field17 = Math.abs(MenuAction.field887); // L: 130
		}
	} // L: 131
}
