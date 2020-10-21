import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lw")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1707768055
	)
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -797109491
	)
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1403597143
	)
	@Export("highX")
	public int highX;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 959443313
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "-124623897"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1;
		this.lowY = var2;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "2099079060"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1;
		this.highY = var2;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(Llw;Llw;I)V",
		garbageValue = "-1801427398"
	)
	public void method6129(Bounds var1, Bounds var2) {
		this.method6120(var1, var2);
		this.method6117(var1, var2);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Llw;Llw;I)V",
		garbageValue = "-1914930384"
	)
	void method6120(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX;
		var2.highX = this.highX;
		if (this.lowX < var1.lowX) {
			var2.highX -= var1.lowX - this.lowX;
			var2.lowX = var1.lowX;
		}

		if (var2.method6130() > var1.method6130()) {
			var2.highX -= var2.method6130() - var1.method6130();
		}

		if (var2.highX < 0) {
			var2.highX = 0;
		}

	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(Llw;Llw;I)V",
		garbageValue = "1895842322"
	)
	void method6117(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY;
		var2.highY = this.highY;
		if (this.lowY < var1.lowY) {
			var2.highY -= var1.lowY - this.lowY;
			var2.lowY = var1.lowY;
		}

		if (var2.method6122() > var1.method6122()) {
			var2.highY -= var2.method6122() - var1.method6122();
		}

		if (var2.highY < 0) {
			var2.highY = 0;
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "226030210"
	)
	int method6130() {
		return this.lowX + this.highX;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1174684154"
	)
	int method6122() {
		return this.lowY + this.highY;
	}

	public String toString() {
		return null;
	}
}
