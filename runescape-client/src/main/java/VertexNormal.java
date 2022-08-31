import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ho")
@Implements("VertexNormal")
public class VertexNormal {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1709363353
	)
	@Export("x")
	int x;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -333188113
	)
	@Export("y")
	int y;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -810751955
	)
	@Export("z")
	int z;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -773180697
	)
	@Export("magnitude")
	int magnitude;

	VertexNormal() {
	} // L: 9

	@ObfuscatedSignature(
		descriptor = "(Lho;)V"
	)
	VertexNormal(VertexNormal var1) {
		this.x = var1.x; // L: 12
		this.y = var1.y; // L: 13
		this.z = var1.z; // L: 14
		this.magnitude = var1.magnitude; // L: 15
	} // L: 16

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1152311367"
	)
	static final void method4415() {
		Client.field477 = Client.cycleCntr; // L: 11997
		class4.field13 = true; // L: 11998
	} // L: 11999
}
