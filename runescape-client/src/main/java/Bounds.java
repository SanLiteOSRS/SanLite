import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ok")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 600302737
	)
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 979622241
	)
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1664174563
	)
	@Export("highX")
	public int highX;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1804459671
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "0"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1; // L: 19
		this.lowY = var2; // L: 20
	} // L: 21

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "6"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1; // L: 24
		this.highY = var2; // L: 25
	} // L: 26

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "829301461"
	)
	public boolean method7724(int var1, int var2) {
		return var1 >= this.lowX && var1 < this.highX + this.lowX && var2 >= this.lowY && var2 < this.lowY + this.highY; // L: 29
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lok;Lok;I)V",
		garbageValue = "114731737"
	)
	public void method7736(Bounds var1, Bounds var2) {
		this.method7726(var1, var2); // L: 37
		this.method7727(var1, var2); // L: 38
	} // L: 39

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lok;Lok;I)V",
		garbageValue = "-451265312"
	)
	void method7726(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX; // L: 42
		var2.highX = this.highX; // L: 43
		if (this.lowX < var1.lowX) { // L: 44
			var2.highX -= var1.lowX - this.lowX; // L: 45
			var2.lowX = var1.lowX; // L: 46
		}

		if (var2.method7728() > var1.method7728()) { // L: 48
			var2.highX -= var2.method7728() - var1.method7728(); // L: 49
		}

		if (var2.highX < 0) { // L: 51
			var2.highX = 0;
		}

	} // L: 52

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lok;Lok;I)V",
		garbageValue = "-1783178271"
	)
	void method7727(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY; // L: 55
		var2.highY = this.highY; // L: 56
		if (this.lowY < var1.lowY) { // L: 57
			var2.highY -= var1.lowY - this.lowY; // L: 58
			var2.lowY = var1.lowY; // L: 59
		}

		if (var2.method7729() > var1.method7729()) { // L: 61
			var2.highY -= var2.method7729() - var1.method7729(); // L: 62
		}

		if (var2.highY < 0) { // L: 64
			var2.highY = 0;
		}

	} // L: 65

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "75"
	)
	int method7728() {
		return this.lowX + this.highX; // L: 68
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	int method7729() {
		return this.highY + this.lowY; // L: 72
	}

	public String toString() {
		return null; // L: 33
	}
}
