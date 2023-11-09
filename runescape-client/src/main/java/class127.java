import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ek")
public class class127 {
	@ObfuscatedName("wn")
	@ObfuscatedSignature(
		descriptor = "Lsq;"
	)
	@Export("worldMap")
	static WorldMap worldMap;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 310242103
	)
	public final int field1505;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lek;"
	)
	public class127 field1500;
	@ObfuscatedName("ar")
	float[][] field1501;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "[Lrm;"
	)
	final class451[] field1502;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[Lrm;"
	)
	class451[] field1503;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Lrm;"
	)
	class451[] field1513;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lrm;"
	)
	class451 field1508;
	@ObfuscatedName("az")
	boolean field1506;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lrm;"
	)
	class451 field1507;
	@ObfuscatedName("ap")
	boolean field1504;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lrm;"
	)
	class451 field1510;
	@ObfuscatedName("at")
	float[][] field1509;
	@ObfuscatedName("ah")
	float[][] field1511;
	@ObfuscatedName("ax")
	float[][] field1512;

	@ObfuscatedSignature(
		descriptor = "(ILty;Z)V"
	)
	public class127(int var1, Buffer var2, boolean var3) {
		this.field1508 = new class451(); // L: 13
		this.field1506 = true; // L: 14
		this.field1507 = new class451(); // L: 15
		this.field1504 = true; // L: 16
		this.field1510 = new class451(); // L: 17
		this.field1505 = var2.readShort(); // L: 23
		this.field1502 = new class451[var1]; // L: 24
		this.field1503 = new class451[this.field1502.length]; // L: 25
		this.field1513 = new class451[this.field1502.length]; // L: 26
		this.field1501 = new float[this.field1502.length][3]; // L: 27

		for (int var4 = 0; var4 < this.field1502.length; ++var4) { // L: 28
			this.field1502[var4] = new class451(var2, var3); // L: 29
			this.field1501[var4][0] = var2.method9094(); // L: 30
			this.field1501[var4][1] = var2.method9094(); // L: 31
			this.field1501[var4][2] = var2.method9094(); // L: 32
		}

		this.method2943(); // L: 34
	} // L: 35

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1463837860"
	)
	void method2943() {
		this.field1509 = new float[this.field1502.length][3]; // L: 38
		this.field1511 = new float[this.field1502.length][3]; // L: 39
		this.field1512 = new float[this.field1502.length][3]; // L: 40
		class451 var1 = class138.method3097(); // L: 41

		for (int var2 = 0; var2 < this.field1502.length; ++var2) { // L: 42
			class451 var3 = this.method2965(var2); // L: 43
			var1.method8289(var3); // L: 44
			var1.method8259(); // L: 45
			this.field1509[var2] = var1.method8257(); // L: 46
			this.field1511[var2][0] = var3.field4743[12]; // L: 47
			this.field1511[var2][1] = var3.field4743[13]; // L: 48
			this.field1511[var2][2] = var3.field4743[14]; // L: 49
			this.field1512[var2] = var3.method8253(); // L: 50
		}

		var1.method8279(); // L: 52
	} // L: 53

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Lrm;",
		garbageValue = "-961715639"
	)
	class451 method2965(int var1) {
		return this.field1502[var1]; // L: 56
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Lrm;",
		garbageValue = "-318230111"
	)
	class451 method2945(int var1) {
		if (this.field1503[var1] == null) { // L: 60
			this.field1503[var1] = new class451(this.method2965(var1)); // L: 61
			if (this.field1500 != null) { // L: 62
				this.field1503[var1].method8285(this.field1500.method2945(var1)); // L: 63
			} else {
				this.field1503[var1].method8285(class451.field4739); // L: 66
			}
		}

		return this.field1503[var1]; // L: 69
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IB)Lrm;",
		garbageValue = "81"
	)
	class451 method2942(int var1) {
		if (this.field1513[var1] == null) { // L: 73
			this.field1513[var1] = new class451(this.method2945(var1)); // L: 74
			this.field1513[var1].method8259(); // L: 75
		}

		return this.field1513[var1]; // L: 77
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lrm;I)V",
		garbageValue = "1524637069"
	)
	void method2974(class451 var1) {
		this.field1508.method8289(var1); // L: 81
		this.field1506 = true; // L: 82
		this.field1504 = true; // L: 83
	} // L: 84

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Lrm;",
		garbageValue = "144980279"
	)
	class451 method2948() {
		return this.field1508; // L: 87
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Lrm;",
		garbageValue = "0"
	)
	class451 method2949() {
		if (this.field1506) { // L: 91
			this.field1507.method8289(this.method2948()); // L: 92
			if (this.field1500 != null) { // L: 93
				this.field1507.method8285(this.field1500.method2949()); // L: 94
			}

			this.field1506 = false; // L: 96
		}

		return this.field1507; // L: 98
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)Lrm;",
		garbageValue = "2"
	)
	public class451 method2963(int var1) {
		if (this.field1504) { // L: 102
			this.field1510.method8289(this.method2942(var1)); // L: 103
			this.field1510.method8285(this.method2949()); // L: 104
			this.field1504 = false; // L: 105
		}

		return this.field1510; // L: 107
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "-1038210043"
	)
	float[] method2951(int var1) {
		return this.field1509[var1]; // L: 111
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "-2141591558"
	)
	float[] method2952(int var1) {
		return this.field1511[var1]; // L: 115
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)[F",
		garbageValue = "0"
	)
	float[] method2953(int var1) {
		return this.field1512[var1]; // L: 119
	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "552746163"
	)
	static final boolean method2959(int var0) {
		if (var0 < 0) { // L: 9333
			return false;
		} else {
			int var1 = Client.menuOpcodes[var0]; // L: 9334
			if (var1 >= 2000) { // L: 9335
				var1 -= 2000;
			}

			return var1 == 1007; // L: 9336
		}
	}
}
