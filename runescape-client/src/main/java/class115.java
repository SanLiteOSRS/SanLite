import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("do")
public class class115 {
	@ObfuscatedName("tq")
	@ObfuscatedGetter(
		intValue = -224609185
	)
	static int field1419;
	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("dragInventoryWidget")
	static Widget dragInventoryWidget;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -2126008347
	)
	public final int field1406;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	public class115 field1405;
	@ObfuscatedName("f")
	float[][] field1404;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "[Lnb;"
	)
	final class388[] field1407;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "[Lnb;"
	)
	class388[] field1408;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "[Lnb;"
	)
	class388[] field1409;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	class388 field1411;
	@ObfuscatedName("j")
	boolean field1414;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	class388 field1412;
	@ObfuscatedName("a")
	boolean field1413;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	class388 field1416;
	@ObfuscatedName("n")
	float[][] field1415;
	@ObfuscatedName("x")
	float[][] field1410;
	@ObfuscatedName("g")
	float[][] field1417;

	@ObfuscatedSignature(
		descriptor = "(ILqw;Z)V"
	)
	public class115(int var1, Buffer var2, boolean var3) {
		this.field1411 = new class388(); // L: 13
		this.field1414 = true; // L: 14
		this.field1412 = new class388(); // L: 15
		this.field1413 = true; // L: 16
		this.field1416 = new class388(); // L: 17
		this.field1406 = var2.readShort(); // L: 23
		this.field1407 = new class388[var1]; // L: 24
		this.field1408 = new class388[this.field1407.length]; // L: 25
		this.field1409 = new class388[this.field1407.length]; // L: 26
		this.field1404 = new float[this.field1407.length][3]; // L: 27

		for (int var4 = 0; var4 < this.field1407.length; ++var4) { // L: 28
			this.field1407[var4] = new class388(var2, var3); // L: 29
			this.field1404[var4][0] = var2.method7740(); // L: 30
			this.field1404[var4][1] = var2.method7740(); // L: 31
			this.field1404[var4][2] = var2.method7740(); // L: 32
		}

		this.method2726(); // L: 34
	} // L: 35

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "55"
	)
	void method2726() {
		this.field1415 = new float[this.field1407.length][3]; // L: 38
		this.field1410 = new float[this.field1407.length][3]; // L: 39
		this.field1417 = new float[this.field1407.length][3]; // L: 40
		class388 var1 = MouseHandler.method574(); // L: 41

		for (int var2 = 0; var2 < this.field1407.length; ++var2) { // L: 42
			class388 var3 = this.method2727(var2); // L: 43
			var1.method7005(var3); // L: 44
			var1.method6999(); // L: 45
			this.field1415[var2] = var1.method7003(); // L: 46
			this.field1410[var2][0] = var3.field4410[12]; // L: 47
			this.field1410[var2][1] = var3.field4410[13]; // L: 48
			this.field1410[var2][2] = var3.field4410[14]; // L: 49
			this.field1417[var2] = var3.method7015(); // L: 50
		}

		var1.method7027(); // L: 52
	} // L: 53

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IB)Lnb;",
		garbageValue = "10"
	)
	class388 method2727(int var1) {
		return this.field1407[var1]; // L: 56
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)Lnb;",
		garbageValue = "67"
	)
	class388 method2728(int var1) {
		if (this.field1408[var1] == null) { // L: 60
			this.field1408[var1] = new class388(this.method2727(var1)); // L: 61
			if (this.field1405 != null) { // L: 62
				this.field1408[var1].method7009(this.field1405.method2728(var1)); // L: 63
			} else {
				this.field1408[var1].method7009(class388.field4407); // L: 66
			}
		}

		return this.field1408[var1]; // L: 69
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IB)Lnb;",
		garbageValue = "4"
	)
	class388 method2753(int var1) {
		if (this.field1409[var1] == null) { // L: 73
			this.field1409[var1] = new class388(this.method2728(var1)); // L: 74
			this.field1409[var1].method6999(); // L: 75
		}

		return this.field1409[var1]; // L: 77
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lnb;I)V",
		garbageValue = "2125757376"
	)
	void method2749(class388 var1) {
		this.field1411.method7005(var1); // L: 81
		this.field1414 = true; // L: 82
		this.field1413 = true; // L: 83
	} // L: 84

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Lnb;",
		garbageValue = "2122027554"
	)
	class388 method2731() {
		return this.field1411; // L: 87
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)Lnb;",
		garbageValue = "1964110211"
	)
	class388 method2737() {
		if (this.field1414) { // L: 91
			this.field1412.method7005(this.method2731()); // L: 92
			if (this.field1405 != null) { // L: 93
				this.field1412.method7009(this.field1405.method2737()); // L: 94
			}

			this.field1414 = false; // L: 96
		}

		return this.field1412; // L: 98
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IB)Lnb;",
		garbageValue = "14"
	)
	public class388 method2733(int var1) {
		if (this.field1413) { // L: 102
			this.field1416.method7005(this.method2753(var1)); // L: 103
			this.field1416.method7009(this.method2737()); // L: 104
			this.field1413 = false; // L: 105
		}

		return this.field1416; // L: 107
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "10044670"
	)
	float[] method2734(int var1) {
		return this.field1415[var1]; // L: 111
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "-2104420634"
	)
	float[] method2739(int var1) {
		return this.field1410[var1]; // L: 115
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IB)[F",
		garbageValue = "33"
	)
	float[] method2736(int var1) {
		return this.field1417[var1]; // L: 119
	}

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "(IIIIZB)V",
		garbageValue = "95"
	)
	@Export("setViewportShape")
	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) { // L: 4957
			var2 = 1;
		}

		if (var3 < 1) { // L: 4958
			var3 = 1;
		}

		int var5 = var3 - 334; // L: 4959
		int var6;
		if (var5 < 0) { // L: 4961
			var6 = Client.field644;
		} else if (var5 >= 100) { // L: 4962
			var6 = Client.field695;
		} else {
			var6 = (Client.field695 - Client.field644) * var5 / 100 + Client.field644; // L: 4963
		}

		int var7 = var3 * var6 * 512 / (var2 * 334); // L: 4964
		int var8;
		int var9;
		short var10;
		if (var7 < Client.field757) { // L: 4965
			var10 = Client.field757; // L: 4966
			var6 = var10 * var2 * 334 / (var3 * 512); // L: 4967
			if (var6 > Client.field756) { // L: 4968
				var6 = Client.field756; // L: 4969
				var8 = var3 * var6 * 512 / (var10 * 334); // L: 4970
				var9 = (var2 - var8) / 2; // L: 4971
				if (var4) { // L: 4972
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 4973
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216); // L: 4974
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216); // L: 4975
				}

				var0 += var9; // L: 4977
				var2 -= var9 * 2; // L: 4978
			}
		} else if (var7 > Client.field567) { // L: 4981
			var10 = Client.field567; // L: 4982
			var6 = var10 * var2 * 334 / (var3 * 512); // L: 4983
			if (var6 < Client.field677) { // L: 4984
				var6 = Client.field677; // L: 4985
				var8 = var10 * var2 * 334 / (var6 * 512); // L: 4986
				var9 = (var3 - var8) / 2; // L: 4987
				if (var4) { // L: 4988
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 4989
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216); // L: 4990
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216); // L: 4991
				}

				var1 += var9; // L: 4993
				var3 -= var9 * 2; // L: 4994
			}
		}

		Client.viewportZoom = var3 * var6 / 334; // L: 4997
		if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) { // L: 4998
			ArchiveDiskActionHandler.method5800(var2, var3); // L: 4999
		}

		Client.viewportOffsetX = var0; // L: 5001
		Client.viewportOffsetY = var1; // L: 5002
		Client.viewportWidth = var2; // L: 5003
		Client.viewportHeight = var3; // L: 5004
	} // L: 5005
}
