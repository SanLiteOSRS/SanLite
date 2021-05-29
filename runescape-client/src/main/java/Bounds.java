import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("li")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1774637825
	)
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 47432047
	)
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -250215195
	)
	@Export("highX")
	public int highX;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1839374135
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1379140744"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1;
		this.lowY = var2;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1063534704"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1;
		this.highY = var2;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lli;Lli;B)V",
		garbageValue = "-80"
	)
	public void method5977(Bounds var1, Bounds var2) {
		this.method5981(var1, var2);
		this.method5982(var1, var2);
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lli;Lli;I)V",
		garbageValue = "-1616583168"
	)
	void method5981(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX;
		var2.highX = this.highX;
		if (this.lowX < var1.lowX) {
			var2.highX -= var1.lowX - this.lowX;
			var2.lowX = var1.lowX;
		}

		if (var2.method5983() > var1.method5983()) {
			var2.highX -= var2.method5983() - var1.method5983();
		}

		if (var2.highX < 0) {
			var2.highX = 0;
		}

	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lli;Lli;S)V",
		garbageValue = "11660"
	)
	void method5982(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY;
		var2.highY = this.highY;
		if (this.lowY < var1.lowY) {
			var2.highY -= var1.lowY - this.lowY;
			var2.lowY = var1.lowY;
		}

		if (var2.method5984() > var1.method5984()) {
			var2.highY -= var2.method5984() - var1.method5984();
		}

		if (var2.highY < 0) {
			var2.highY = 0;
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-67"
	)
	int method5983() {
		return this.highX + this.lowX;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "8"
	)
	int method5984() {
		return this.highY + this.lowY;
	}

	public String toString() {
		return null;
	}
}
