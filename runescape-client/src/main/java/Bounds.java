import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ry")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	@Export("js5SocketTask")
	static Task js5SocketTask;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 751042177
	)
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -179155079
	)
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1447879397
	)
	@Export("highX")
	public int highX;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 608074547
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-32180722"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1;
		this.lowY = var2; // L: 20
	} // L: 21

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1287052006"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1; // L: 24
		this.highY = var2; // L: 25
	} // L: 26

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1799051950"
	)
	public boolean method8481(int var1, int var2) {
		return var1 >= this.lowX && var1 < this.lowX + this.highX && var2 >= this.lowY && var2 < this.highY + this.lowY; // L: 29
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lry;Lry;B)V",
		garbageValue = "-31"
	)
	public void method8483(Bounds var1, Bounds var2) {
		this.method8484(var1, var2); // L: 37
		this.method8492(var1, var2); // L: 38
	} // L: 39

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lry;Lry;I)V",
		garbageValue = "-577391241"
	)
	void method8484(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX; // L: 42
		var2.highX = this.highX; // L: 43
		if (this.lowX < var1.lowX) { // L: 44
			var2.highX -= var1.lowX - this.lowX; // L: 45
			var2.lowX = var1.lowX; // L: 46
		}

		if (var2.method8480() > var1.method8480()) { // L: 48
			var2.highX -= var2.method8480() - var1.method8480(); // L: 49
		}

		if (var2.highX < 0) { // L: 51
			var2.highX = 0;
		}

	} // L: 52

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lry;Lry;I)V",
		garbageValue = "-1289892609"
	)
	void method8492(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY; // L: 55
		var2.highY = this.highY; // L: 56
		if (this.lowY < var1.lowY) { // L: 57
			var2.highY -= var1.lowY - this.lowY; // L: 58
			var2.lowY = var1.lowY; // L: 59
		}

		if (var2.method8486() > var1.method8486()) { // L: 61
			var2.highY -= var2.method8486() - var1.method8486(); // L: 62
		}

		if (var2.highY < 0) { // L: 64
			var2.highY = 0;
		}

	} // L: 65

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-148855677"
	)
	int method8480() {
		return this.highX + this.lowX; // L: 68
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1746593289"
	)
	int method8486() {
		return this.lowY + this.highY; // L: 72
	}

	public String toString() {
		return null; // L: 33
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Lix;",
		garbageValue = "1927497253"
	)
	static class221 method8500() {
		return class221.field2373; // L: 19
	}
}
