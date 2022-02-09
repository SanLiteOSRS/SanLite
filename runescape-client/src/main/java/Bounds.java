import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("na")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	static IndexedSprite field4220;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 134357295
	)
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1700768065
	)
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1258350879
	)
	@Export("highX")
	public int highX;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1496551937
	)
	@Export("highY")
	public int highY;

	public Bounds(int var1, int var2, int var3, int var4) {
		this.setLow(var1, var2);
		this.setHigh(var3, var4);
	}

	public Bounds(int var1, int var2) {
		this(0, 0, var1, var2);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "115"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1;
		this.lowY = var2;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "6"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1;
		this.highY = var2;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1655191906"
	)
	public boolean method6599(int var1, int var2) {
		return var1 >= this.lowX && var1 < this.lowX + this.highX && var2 >= this.lowY && var2 < this.lowY + this.highY;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lna;Lna;B)V",
		garbageValue = "-63"
	)
	public void method6600(Bounds var1, Bounds var2) {
		this.method6613(var1, var2);
		this.method6602(var1, var2);
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lna;Lna;B)V",
		garbageValue = "53"
	)
	void method6613(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX;
		var2.highX = this.highX;
		if (this.lowX < var1.lowX) {
			var2.highX -= var1.lowX - this.lowX;
			var2.lowX = var1.lowX;
		}

		if (var2.method6603() > var1.method6603()) {
			var2.highX -= var2.method6603() - var1.method6603();
		}

		if (var2.highX < 0) {
			var2.highX = 0;
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lna;Lna;I)V",
		garbageValue = "2050658212"
	)
	void method6602(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY;
		var2.highY = this.highY;
		if (this.lowY < var1.lowY) {
			var2.highY -= var1.lowY - this.lowY;
			var2.lowY = var1.lowY;
		}

		if (var2.method6604() > var1.method6604()) {
			var2.highY -= var2.method6604() - var1.method6604();
		}

		if (var2.highY < 0) {
			var2.highY = 0;
		}

	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1461378032"
	)
	int method6603() {
		return this.lowX + this.highX;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2137637262"
	)
	int method6604() {
		return this.lowY + this.highY;
	}

	public String toString() {
		return null;
	}
}
