import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lr")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("w")
	@Export("Widget_loadedInterfaces")
	public static boolean[] Widget_loadedInterfaces;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -942038373
	)
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -38208119
	)
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -468327151
	)
	@Export("highX")
	public int highX;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 85471293
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

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "1517519205"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1;
		this.lowY = var2;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "1357233631"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1;
		this.highY = var2;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(Llr;Llr;S)V",
		garbageValue = "172"
	)
	public void method6089(Bounds var1, Bounds var2) {
		this.method6090(var1, var2);
		this.method6087(var1, var2);
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(Llr;Llr;I)V",
		garbageValue = "-805505027"
	)
	void method6090(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX;
		var2.highX = this.highX;
		if (this.lowX < var1.lowX) {
			var2.highX -= var1.lowX - this.lowX;
			var2.lowX = var1.lowX;
		}

		if (var2.method6091() > var1.method6091()) {
			var2.highX -= var2.method6091() - var1.method6091();
		}

		if (var2.highX < 0) {
			var2.highX = 0;
		}

	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(Llr;Llr;I)V",
		garbageValue = "1845749630"
	)
	void method6087(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY;
		var2.highY = this.highY;
		if (this.lowY < var1.lowY) {
			var2.highY -= var1.lowY - this.lowY;
			var2.lowY = var1.lowY;
		}

		if (var2.method6092() > var1.method6092()) {
			var2.highY -= var2.method6092() - var1.method6092();
		}

		if (var2.highY < 0) {
			var2.highY = 0;
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1918003577"
	)
	int method6091() {
		return this.highX + this.lowX;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "97"
	)
	int method6092() {
		return this.highY + this.lowY;
	}

	public String toString() {
		return null;
	}
}
