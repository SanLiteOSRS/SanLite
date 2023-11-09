import java.lang.management.GarbageCollectorMXBean;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sb")
public class class478 extends class480 {
	@ObfuscatedName("bx")
	@Export("garbageCollector")
	static GarbageCollectorMXBean garbageCollector;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1258147581
	)
	int field4861;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 395110197
	)
	int field4860;

	public class478(int var1, int var2, int var3, int var4) {
		super(var3, var4); // L: 8
		this.field4861 = 0; // L: 4
		this.field4860 = 0; // L: 5
		this.field4861 = var1; // L: 9
		this.field4860 = var2; // L: 10
	} // L: 11

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-44"
	)
	public int method8464() {
		double var1 = this.method8488(); // L: 14
		return (int)Math.round((double)(this.field4860 - this.field4861) * var1 + (double)this.field4861); // L: 15
	}
}
