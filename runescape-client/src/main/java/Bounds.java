import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ls")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1735724601
	)
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -701395687
	)
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -825003219
	)
	@Export("highX")
	public int highX;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1589322753
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

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "(IIB)V",
		garbageValue = "0"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1;
		this.lowY = var2;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(IIB)V",
		garbageValue = "-111"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1;
		this.highY = var2;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(Lls;Lls;I)V",
		garbageValue = "478225673"
	)
	public void method6020(Bounds var1, Bounds var2) {
		this.method6035(var1, var2);
		this.method6024(var1, var2);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(Lls;Lls;I)V",
		garbageValue = "-1348909503"
	)
	void method6035(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX;
		var2.highX = this.highX;
		if (this.lowX < var1.lowX) {
			var2.highX -= var1.lowX - this.lowX;
			var2.lowX = var1.lowX;
		}

		if (var2.method6025() > var1.method6025()) {
			var2.highX -= var2.method6025() - var1.method6025();
		}

		if (var2.highX < 0) {
			var2.highX = 0;
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "(Lls;Lls;B)V",
		garbageValue = "1"
	)
	void method6024(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY;
		var2.highY = this.highY;
		if (this.lowY < var1.lowY) {
			var2.highY -= var1.lowY - this.lowY;
			var2.lowY = var1.lowY;
		}

		if (var2.method6026() > var1.method6026()) {
			var2.highY -= var2.method6026() - var1.method6026();
		}

		if (var2.highY < 0) {
			var2.highY = 0;
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "-20"
	)
	int method6025() {
		return this.highX + this.lowX;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "-30"
	)
	int method6026() {
		return this.lowY + this.highY;
	}

	public String toString() {
		return null;
	}

	public String abf() {
		return null;
	}
}
