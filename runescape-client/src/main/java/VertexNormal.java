import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jk")
@Implements("VertexNormal")
public class VertexNormal {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -929686261
	)
	@Export("x")
	int x;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1772790621
	)
	@Export("y")
	int y;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1782288159
	)
	@Export("z")
	int z;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1353901163
	)
	@Export("magnitude")
	int magnitude;

	VertexNormal() {
	} // L: 9

	@ObfuscatedSignature(
		descriptor = "(Ljk;)V"
	)
	VertexNormal(VertexNormal var1) {
		this.x = var1.x; // L: 12
		this.y = var1.y; // L: 13
		this.z = var1.z; // L: 14
		this.magnitude = var1.magnitude; // L: 15
	} // L: 16

	@ObfuscatedName("ng")
	@ObfuscatedSignature(
		descriptor = "(Lty;I)V",
		garbageValue = "1893711820"
	)
	static void method4951(Buffer var0) {
		if (Client.randomDatData != null) { // L: 12829
			var0.writeBytes(Client.randomDatData, 0, Client.randomDatData.length); // L: 12830
		} else {
			byte[] var1 = class215.method4223(); // L: 12833
			var0.writeBytes(var1, 0, var1.length); // L: 12834
		}
	} // L: 12831 12835
}
