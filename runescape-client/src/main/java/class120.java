import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("do")
public class class120 {
	@ObfuscatedName("gw")
	static int[] field1445;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 871894433
	)
	int field1441;
	@ObfuscatedName("f")
	float field1438;
	@ObfuscatedName("c")
	float field1440;
	@ObfuscatedName("x")
	float field1439;
	@ObfuscatedName("h")
	float field1442;
	@ObfuscatedName("j")
	float field1443;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	class120 field1444;

	class120() {
		this.field1440 = Float.MAX_VALUE; // L: 8
		this.field1439 = Float.MAX_VALUE; // L: 9
		this.field1442 = Float.MAX_VALUE; // L: 10
		this.field1443 = Float.MAX_VALUE; // L: 11
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lqr;II)V",
		garbageValue = "-1596469809"
	)
	void method2811(Buffer var1, int var2) {
		this.field1441 = var1.readShort(); // L: 17
		this.field1438 = var1.method8410(); // L: 18
		this.field1440 = var1.method8410(); // L: 19
		this.field1439 = var1.method8410(); // L: 20
		this.field1442 = var1.method8410(); // L: 21
		this.field1443 = var1.method8410(); // L: 22
	} // L: 23

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)[Lga;",
		garbageValue = "-2004612714"
	)
	static VerticalAlignment[] method2813() {
		return new VerticalAlignment[]{VerticalAlignment.field2004, VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field2002}; // L: 14
	}
}
