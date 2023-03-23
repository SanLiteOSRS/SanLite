import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("on")
public class class379 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	class375 field4407;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -2085574053
	)
	int field4404;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 2017953793
	)
	int field4406;

	@ObfuscatedSignature(
		descriptor = "(Low;II)V"
	)
	class379(class375 var1, int var2, int var3) {
		this.field4404 = 0; // L: 7
		this.field4406 = 0; // L: 8
		this.field4407 = var1; // L: 11
		this.field4404 = var2; // L: 12
		this.field4406 = var3; // L: 13
	} // L: 14

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "416543852"
	)
	public String method7244() {
		if (this.method7246()) { // L: 17
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method7247()); // L: 18

			for (int var2 = this.field4404; var2 < this.field4406; ++var2) { // L: 19
				class377 var3 = this.field4407.method7118(var2); // L: 20
				var1.append(var3.field4380); // L: 21
			}

			return var1.toString(); // L: 23
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1204217006"
	)
	boolean method7245(int var1) {
		return this.field4407.method7106() == 2 || this.field4407.method7106() == 1 && (!this.field4407.field4371 || this.field4406 - 1 != var1); // L: 27
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1264391217"
	)
	public boolean method7246() {
		return this.field4406 == this.field4404; // L: 31
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-53"
	)
	public int method7247() {
		return this.field4406 - this.field4404; // L: 35
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lod;I)Z",
		garbageValue = "728286722"
	)
	boolean method7248(class377 var1) {
		if (this.field4407.field4375 == 2) { // L: 39
			return true;
		} else if (this.field4407.field4375 == 0) { // L: 40
			return false;
		} else {
			return this.field4407.method6995() != var1; // L: 41
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1415953893"
	)
	int method7262() {
		if (this.method7246()) { // L: 46
			return 0;
		} else {
			class377 var1 = this.field4407.method7118(this.field4406 - 1); // L: 47
			if (var1.field4380 == '\n') { // L: 48
				return 0;
			} else if (this.method7248(var1)) { // L: 49
				return this.field4407.field4372.advances[42];
			} else {
				int var2 = this.field4407.field4372.advances[var1.field4380]; // L: 50
				if (var2 == 0) { // L: 51
					return var1.field4380 == '\t' ? this.field4407.field4372.advances[32] * 3 : this.field4407.field4372.advances[32]; // L: 52 53 56
				} else {
					return var2; // L: 60
				}
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Lrv;",
		garbageValue = "93"
	)
	public class451 method7268() {
		if (this.method7246()) { // L: 65
			return new class451(0, 0); // L: 66
		} else {
			class377 var1 = this.field4407.method7118(this.field4406 - 1); // L: 68
			return new class451(var1.field4379 + this.method7262(), var1.field4378); // L: 69
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)Lod;",
		garbageValue = "-99"
	)
	public class377 method7251(int var1) {
		return var1 >= 0 && var1 < this.method7247() ? this.field4407.method7118(this.field4404 + var1) : null; // L: 73 74
	}
}
