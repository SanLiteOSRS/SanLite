import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oq")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1038179223
	)
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -661578305
	)
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 18445063
	)
	@Export("highX")
	public int highX;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1563645865
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

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1402614574"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1; // L: 19
		this.lowY = var2; // L: 20
	} // L: 21

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1628621523"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1; // L: 24
		this.highY = var2; // L: 25
	} // L: 26

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "2135303946"
	)
	public boolean method7574(int var1, int var2) {
		return var1 >= this.lowX && var1 < this.highX + this.lowX && var2 >= this.lowY && var2 < this.highY + this.lowY; // L: 29
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Loq;Loq;I)V",
		garbageValue = "-2044792962"
	)
	public void method7575(Bounds var1, Bounds var2) {
		this.method7576(var1, var2); // L: 37
		this.method7571(var1, var2); // L: 38
	} // L: 39

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Loq;Loq;B)V",
		garbageValue = "18"
	)
	void method7576(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX; // L: 42
		var2.highX = this.highX; // L: 43
		if (this.lowX < var1.lowX) { // L: 44
			var2.highX -= var1.lowX - this.lowX; // L: 45
			var2.lowX = var1.lowX; // L: 46
		}

		if (var2.method7578() > var1.method7578()) { // L: 48
			var2.highX -= var2.method7578() - var1.method7578(); // L: 49
		}

		if (var2.highX < 0) { // L: 51
			var2.highX = 0;
		}

	} // L: 52

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Loq;Loq;I)V",
		garbageValue = "506825970"
	)
	void method7571(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY; // L: 55
		var2.highY = this.highY; // L: 56
		if (this.lowY < var1.lowY) { // L: 57
			var2.highY -= var1.lowY - this.lowY; // L: 58
			var2.lowY = var1.lowY; // L: 59
		}

		if (var2.method7584() > var1.method7584()) { // L: 61
			var2.highY -= var2.method7584() - var1.method7584(); // L: 62
		}

		if (var2.highY < 0) { // L: 64
			var2.highY = 0;
		}

	} // L: 65

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-42"
	)
	int method7578() {
		return this.highX + this.lowX; // L: 68
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "57"
	)
	int method7584() {
		return this.highY + this.lowY; // L: 72
	}

	public String toString() {
		return null; // L: 33
	}
}
