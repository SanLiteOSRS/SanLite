import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rx")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -527805095
	)
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -102290081
	)
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1823233217
	)
	@Export("highX")
	public int highX;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -61485673
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "950647486"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1; // L: 19
		this.lowY = var2; // L: 20
	} // L: 21

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-260511510"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1; // L: 24
		this.highY = var2; // L: 25
	} // L: 26

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-8"
	)
	public boolean method8284(int var1, int var2) {
		return var1 >= this.lowX && var1 < this.lowX + this.highX && var2 >= this.lowY && var2 < this.lowY + this.highY; // L: 29
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lrx;Lrx;I)V",
		garbageValue = "1323786426"
	)
	public void method8306(Bounds var1, Bounds var2) {
		this.method8276(var1, var2); // L: 37
		this.method8277(var1, var2); // L: 38
	} // L: 39

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lrx;Lrx;B)V",
		garbageValue = "-1"
	)
	void method8276(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX; // L: 42
		var2.highX = this.highX; // L: 43
		if (this.lowX < var1.lowX) { // L: 44
			var2.highX -= var1.lowX - this.lowX; // L: 45
			var2.lowX = var1.lowX; // L: 46
		}

		if (var2.method8297() > var1.method8297()) { // L: 48
			var2.highX -= var2.method8297() - var1.method8297(); // L: 49
		}

		if (var2.highX < 0) { // L: 51
			var2.highX = 0;
		}

	} // L: 52

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lrx;Lrx;I)V",
		garbageValue = "1489153236"
	)
	void method8277(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY; // L: 55
		var2.highY = this.highY; // L: 56
		if (this.lowY < var1.lowY) { // L: 57
			var2.highY -= var1.lowY - this.lowY; // L: 58
			var2.lowY = var1.lowY; // L: 59
		}

		if (var2.method8279() > var1.method8279()) { // L: 61
			var2.highY -= var2.method8279() - var1.method8279(); // L: 62
		}

		if (var2.highY < 0) { // L: 64
			var2.highY = 0;
		}

	} // L: 65

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2139192788"
	)
	int method8297() {
		return this.highX + this.lowX; // L: 68
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-49"
	)
	int method8279() {
		return this.highY + this.lowY; // L: 72
	}

	public String toString() {
		return null; // L: 33
	}
}
