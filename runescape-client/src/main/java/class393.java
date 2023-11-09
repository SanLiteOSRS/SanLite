import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pu")
public class class393 {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1498559755
	)
	int field4447;

	@ObfuscatedSignature(
		descriptor = "(IZ)V",
		garbageValue = "1"
	)
	class393(int var1, boolean var2) {
		this.field4447 = var1; // L: 7
	} // L: 8

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1867956020"
	)
	public int method7394() {
		return this.field4447; // L: 11
	}
}
