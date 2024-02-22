import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rc")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 925427607
	)
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1599578727
	)
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1406589711
	)
	@Export("highX")
	public int highX;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 2012726795
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1608314712"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1; // L: 19
		this.lowY = var2; // L: 20
	} // L: 21

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "593577613"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1; // L: 24
		this.highY = var2; // L: 25
	} // L: 26

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1999653892"
	)
	public boolean method8552(int var1, int var2) {
		return var1 >= this.lowX && var1 < this.highX + this.lowX && var2 >= this.lowY && var2 < this.lowY + this.highY; // L: 29
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lrc;Lrc;I)V",
		garbageValue = "1052007605"
	)
	public void method8550(Bounds var1, Bounds var2) {
		this.method8555(var1, var2); // L: 37
		this.method8556(var1, var2); // L: 38
	} // L: 39

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lrc;Lrc;I)V",
		garbageValue = "201826679"
	)
	void method8555(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX; // L: 42
		var2.highX = this.highX; // L: 43
		if (this.lowX < var1.lowX) { // L: 44
			var2.highX -= var1.lowX - this.lowX; // L: 45
			var2.lowX = var1.lowX; // L: 46
		}

		if (var2.method8557() > var1.method8557()) { // L: 48
			var2.highX -= var2.method8557() - var1.method8557(); // L: 49
		}

		if (var2.highX < 0) { // L: 51
			var2.highX = 0;
		}

	} // L: 52

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lrc;Lrc;I)V",
		garbageValue = "1545253933"
	)
	void method8556(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY; // L: 55
		var2.highY = this.highY; // L: 56
		if (this.lowY < var1.lowY) { // L: 57
			var2.highY -= var1.lowY - this.lowY; // L: 58
			var2.lowY = var1.lowY; // L: 59
		}

		if (var2.method8558() > var1.method8558()) { // L: 61
			var2.highY -= var2.method8558() - var1.method8558(); // L: 62
		}

		if (var2.highY < 0) { // L: 64
			var2.highY = 0;
		}

	} // L: 65

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2031947970"
	)
	int method8557() {
		return this.highX + this.lowX; // L: 68
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1810092175"
	)
	int method8558() {
		return this.lowY + this.highY; // L: 72
	}

	public String toString() {
		return null; // L: 33
	}
}
