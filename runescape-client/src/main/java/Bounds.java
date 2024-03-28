import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("rz")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -357322935
	)
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -962799113
	)
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 506836117
	)
	@Export("highX")
	public int highX;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -2028302005
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "60"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1; // L: 19
		this.lowY = var2; // L: 20
	} // L: 21

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "0"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1; // L: 24
		this.highY = var2; // L: 25
	} // L: 26

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-777041401"
	)
	public boolean method8344(int var1, int var2) {
		return var1 >= this.lowX && var1 < this.highX + this.lowX && var2 >= this.lowY && var2 < this.lowY + this.highY; // L: 29
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lrz;Lrz;I)V",
		garbageValue = "479003546"
	)
	public void method8356(Bounds var1, Bounds var2) {
		this.method8342(var1, var2); // L: 37
		this.method8347(var1, var2); // L: 38
	} // L: 39

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lrz;Lrz;I)V",
		garbageValue = "-1429782335"
	)
	void method8342(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX; // L: 42
		var2.highX = this.highX; // L: 43
		if (this.lowX < var1.lowX) { // L: 44
			var2.highX -= var1.lowX - this.lowX; // L: 45
			var2.lowX = var1.lowX; // L: 46
		}

		if (var2.method8345() > var1.method8345()) { // L: 48
			var2.highX -= var2.method8345() - var1.method8345(); // L: 49
		}

		if (var2.highX < 0) { // L: 51
			var2.highX = 0;
		}

	} // L: 52

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lrz;Lrz;I)V",
		garbageValue = "-1778477706"
	)
	void method8347(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY; // L: 55
		var2.highY = this.highY; // L: 56
		if (this.lowY < var1.lowY) { // L: 57
			var2.highY -= var1.lowY - this.lowY; // L: 58
			var2.lowY = var1.lowY; // L: 59
		}

		if (var2.method8349() > var1.method8349()) { // L: 61
			var2.highY -= var2.method8349() - var1.method8349(); // L: 62
		}

		if (var2.highY < 0) { // L: 64
			var2.highY = 0;
		}

	} // L: 65

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1803377424"
	)
	int method8345() {
		return this.highX + this.lowX; // L: 68
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "3"
	)
	int method8349() {
		return this.highY + this.lowY; // L: 72
	}

	public String toString() {
		return null; // L: 33
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;",
		garbageValue = "1999638495"
	)
	@Export("loadClassFromDescriptor")
	static Class loadClassFromDescriptor(String var0) throws ClassNotFoundException {
		if (var0.equals("B")) { // L: 216
			return Byte.TYPE;
		} else if (var0.equals("I")) { // L: 217
			return Integer.TYPE;
		} else if (var0.equals("S")) { // L: 218
			return Short.TYPE;
		} else if (var0.equals("J")) { // L: 219
			return Long.TYPE;
		} else if (var0.equals("Z")) { // L: 220
			return Boolean.TYPE;
		} else if (var0.equals("F")) { // L: 221
			return Float.TYPE;
		} else if (var0.equals("D")) { // L: 222
			return Double.TYPE;
		} else if (var0.equals("C")) { // L: 223
			return Character.TYPE;
		} else {
			return var0.equals("void") ? Void.TYPE : Reflection.findClass(var0); // L: 224 225
		}
	}
}
