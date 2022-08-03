import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nz")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1730052269
	)
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1449954509
	)
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1503799883
	)
	@Export("highX")
	public int highX;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 173238267
	)
	@Export("highY")
	public int highY;

	public Bounds(int var1, int var2, int var3, int var4) {
		this.setLow(var1, var2); // L: 14
		this.setHigh(var3, var4); // L: 15
	} // L: 16

	public Bounds(int var1, int var2) {
		this(0, 0, var1, var2); // L: 10
	} // L: 11

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1352377690"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1; // L: 19
		this.lowY = var2; // L: 20
	} // L: 21

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "64"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1; // L: 24
		this.highY = var2; // L: 25
	} // L: 26

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-69"
	)
	public boolean method6950(int var1, int var2) {
		return var1 >= this.lowX && var1 < this.highX + this.lowX && var2 >= this.lowY && var2 < this.lowY + this.highY; // L: 29
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lnz;Lnz;B)V",
		garbageValue = "-1"
	)
	public void method6937(Bounds var1, Bounds var2) {
		this.method6936(var1, var2); // L: 37
		this.method6934(var1, var2); // L: 38
	} // L: 39

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lnz;Lnz;I)V",
		garbageValue = "1197506262"
	)
	void method6936(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX; // L: 42
		var2.highX = this.highX; // L: 43
		if (this.lowX < var1.lowX) { // L: 44
			var2.highX -= var1.lowX - this.lowX; // L: 45
			var2.lowX = var1.lowX; // L: 46
		}

		if (var2.method6938() > var1.method6938()) { // L: 48
			var2.highX -= var2.method6938() - var1.method6938(); // L: 49
		}

		if (var2.highX < 0) { // L: 51
			var2.highX = 0;
		}

	} // L: 52

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lnz;Lnz;I)V",
		garbageValue = "-1765864758"
	)
	void method6934(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY; // L: 55
		var2.highY = this.highY; // L: 56
		if (this.lowY < var1.lowY) { // L: 57
			var2.highY -= var1.lowY - this.lowY; // L: 58
			var2.lowY = var1.lowY; // L: 59
		}

		if (var2.method6939() > var1.method6939()) { // L: 61
			var2.highY -= var2.method6939() - var1.method6939(); // L: 62
		}

		if (var2.highY < 0) { // L: 64
			var2.highY = 0;
		}

	} // L: 65

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1976104485"
	)
	int method6938() {
		return this.lowX + this.highX; // L: 68
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1849066584"
	)
	int method6939() {
		return this.highY + this.lowY; // L: 72
	}

	public String toString() {
		return null; // L: 33
	}
}
