import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qu")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -844906645
	)
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1864020389
	)
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 944313703
	)
	@Export("highX")
	public int highX;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1376251093
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "26"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1; // L: 19
		this.lowY = var2; // L: 20
	} // L: 21

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-6"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1; // L: 24
		this.highY = var2; // L: 25
	} // L: 26

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "917820097"
	)
	public boolean method8089(int var1, int var2) {
		return var1 >= this.lowX && var1 < this.highX + this.lowX && var2 >= this.lowY && var2 < this.lowY + this.highY; // L: 29
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lqu;Lqu;I)V",
		garbageValue = "-1323788808"
	)
	public void method8105(Bounds var1, Bounds var2) {
		this.method8091(var1, var2); // L: 37
		this.method8092(var1, var2); // L: 38
	} // L: 39

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lqu;Lqu;B)V",
		garbageValue = "0"
	)
	void method8091(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX; // L: 42
		var2.highX = this.highX; // L: 43
		if (this.lowX < var1.lowX) { // L: 44
			var2.highX -= var1.lowX - this.lowX; // L: 45
			var2.lowX = var1.lowX; // L: 46
		}

		if (var2.method8095() > var1.method8095()) { // L: 48
			var2.highX -= var2.method8095() - var1.method8095(); // L: 49
		}

		if (var2.highX < 0) { // L: 51
			var2.highX = 0;
		}

	} // L: 52

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lqu;Lqu;I)V",
		garbageValue = "924152232"
	)
	void method8092(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY; // L: 55
		var2.highY = this.highY; // L: 56
		if (this.lowY < var1.lowY) { // L: 57
			var2.highY -= var1.lowY - this.lowY; // L: 58
			var2.lowY = var1.lowY; // L: 59
		}

		if (var2.method8116() > var1.method8116()) { // L: 61
			var2.highY -= var2.method8116() - var1.method8116(); // L: 62
		}

		if (var2.highY < 0) { // L: 64
			var2.highY = 0;
		}

	} // L: 65

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1027665402"
	)
	int method8095() {
		return this.highX + this.lowX; // L: 68
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1021516763"
	)
	int method8116() {
		return this.highY + this.lowY; // L: 72
	}

	public String toString() {
		return null; // L: 33
	}
}
