import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dp")
public class class115 {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "[Lpf;"
	)
	@Export("JagexCache_idxFiles")
	public static BufferedFile[] JagexCache_idxFiles;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1293518941
	)
	public final int field1421;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	public class115 field1413;
	@ObfuscatedName("w")
	float[][] field1414;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "[Lny;"
	)
	final class388[] field1415;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "[Lny;"
	)
	class388[] field1416;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "[Lny;"
	)
	class388[] field1417;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	class388 field1412;
	@ObfuscatedName("k")
	boolean field1423;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	class388 field1420;
	@ObfuscatedName("n")
	boolean field1424;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	class388 field1422;
	@ObfuscatedName("a")
	float[][] field1425;
	@ObfuscatedName("m")
	float[][] field1419;
	@ObfuscatedName("u")
	float[][] field1418;

	@ObfuscatedSignature(
		descriptor = "(ILqr;Z)V"
	)
	public class115(int var1, Buffer var2, boolean var3) {
		this.field1412 = new class388(); // L: 13
		this.field1423 = true; // L: 14
		this.field1420 = new class388(); // L: 15
		this.field1424 = true; // L: 16
		this.field1422 = new class388(); // L: 17
		this.field1421 = var2.readShort(); // L: 23
		this.field1415 = new class388[var1]; // L: 24
		this.field1416 = new class388[this.field1415.length]; // L: 25
		this.field1417 = new class388[this.field1415.length]; // L: 26
		this.field1414 = new float[this.field1415.length][3]; // L: 27

		for (int var4 = 0; var4 < this.field1415.length; ++var4) { // L: 28
			this.field1415[var4] = new class388(var2, var3); // L: 29
			this.field1414[var4][0] = var2.method7824(); // L: 30
			this.field1414[var4][1] = var2.method7824(); // L: 31
			this.field1414[var4][2] = var2.method7824(); // L: 32
		}

		this.method2640(); // L: 34
	} // L: 35

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2120202783"
	)
	void method2640() {
		this.field1425 = new float[this.field1415.length][3]; // L: 38
		this.field1419 = new float[this.field1415.length][3]; // L: 39
		this.field1418 = new float[this.field1415.length][3]; // L: 40
		class388 var1 = Language.method5989(); // L: 41

		for (int var2 = 0; var2 < this.field1415.length; ++var2) { // L: 42
			class388 var3 = this.method2641(var2); // L: 43
			var1.method6915(var3); // L: 44
			var1.method6922(); // L: 45
			this.field1425[var2] = var1.method6913(); // L: 46
			this.field1419[var2][0] = var3.field4398[12]; // L: 47
			this.field1419[var2][1] = var3.field4398[13]; // L: 48
			this.field1419[var2][2] = var3.field4398[14]; // L: 49
			this.field1418[var2] = var3.method6924(); // L: 50
		}

		var1.method6946(); // L: 52
	} // L: 53

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Lny;",
		garbageValue = "2027623451"
	)
	class388 method2641(int var1) {
		return this.field1415[var1]; // L: 56
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IB)Lny;",
		garbageValue = "50"
	)
	class388 method2642(int var1) {
		if (this.field1416[var1] == null) { // L: 60
			this.field1416[var1] = new class388(this.method2641(var1)); // L: 61
			if (this.field1413 != null) { // L: 62
				this.field1416[var1].method6954(this.field1413.method2642(var1)); // L: 63
			} else {
				this.field1416[var1].method6954(class388.field4402); // L: 66
			}
		}

		return this.field1416[var1]; // L: 69
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Lny;",
		garbageValue = "190115070"
	)
	class388 method2643(int var1) {
		if (this.field1417[var1] == null) { // L: 73
			this.field1417[var1] = new class388(this.method2642(var1)); // L: 74
			this.field1417[var1].method6922(); // L: 75
		}

		return this.field1417[var1]; // L: 77
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lny;I)V",
		garbageValue = "1296926186"
	)
	void method2664(class388 var1) {
		this.field1412.method6915(var1); // L: 81
		this.field1423 = true; // L: 82
		this.field1424 = true; // L: 83
	} // L: 84

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Lny;",
		garbageValue = "-531609518"
	)
	class388 method2645() {
		return this.field1412; // L: 87
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)Lny;",
		garbageValue = "-12"
	)
	class388 method2644() {
		if (this.field1423) { // L: 91
			this.field1420.method6915(this.method2645()); // L: 92
			if (this.field1413 != null) { // L: 93
				this.field1420.method6954(this.field1413.method2644()); // L: 94
			}

			this.field1423 = false; // L: 96
		}

		return this.field1420; // L: 98
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)Lny;",
		garbageValue = "785138004"
	)
	public class388 method2675(int var1) {
		if (this.field1424) { // L: 102
			this.field1422.method6915(this.method2643(var1)); // L: 103
			this.field1422.method6954(this.method2644()); // L: 104
			this.field1424 = false; // L: 105
		}

		return this.field1422; // L: 107
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "-1778236825"
	)
	float[] method2648(int var1) {
		return this.field1425[var1]; // L: 111
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "797986666"
	)
	float[] method2649(int var1) {
		return this.field1419[var1]; // L: 115
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "-2138178918"
	)
	float[] method2647(int var1) {
		return this.field1418[var1]; // L: 119
	}

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(II)Lpz;",
		garbageValue = "1795921631"
	)
	static class437 method2650(int var0) {
		class437 var1 = (class437)Client.Widget_cachedFonts.get((long)var0); // L: 12287
		if (var1 == null) { // L: 12288
			var1 = new class437(Timer.field4232, var0); // L: 12289
		}

		return var1; // L: 12291
	}
}
