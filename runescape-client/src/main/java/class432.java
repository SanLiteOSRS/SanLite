import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pv")
final class class432 implements class429 {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 2061570999
	)
	@Export("WorldMapElement_count")
	public static int WorldMapElement_count;

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lqw;B)V",
		garbageValue = "-1"
	)
	public void vmethod7609(Object var1, Buffer var2) {
		this.method7580((Long)var1, var2); // L: 35
	} // L: 36

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lqw;I)Ljava/lang/Object;",
		garbageValue = "-1579434609"
	)
	public Object vmethod7608(Buffer var1) {
		return var1.readLong(); // L: 31
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Long;Lqw;I)V",
		garbageValue = "565316443"
	)
	void method7580(Long var1, Buffer var2) {
		var2.writeLong(var1); // L: 26
	} // L: 27
}
