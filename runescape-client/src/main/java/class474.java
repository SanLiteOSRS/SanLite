import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("so")
public class class474 implements class479 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ltu;"
	)
	public final class509 field4900;

	@ObfuscatedSignature(
		descriptor = "(Ltm;)V"
	)
	class474(class510 var1) {
		this.field4900 = var1; // L: 14
	} // L: 15

	@ObfuscatedSignature(
		descriptor = "(Lsz;)V"
	)
	public class474(class475 var1) {
		this(new class510(var1)); // L: 10
	} // L: 11

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "563046583"
	)
	public int method8494(int var1) {
		return this.field4900.vmethod8996(var1); // L: 18
	}

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "(Ldi;I)Z",
		garbageValue = "953022005"
	)
	static boolean method8495(Player var0) {
		if (Client.drawPlayerNames == 0) { // L: 5245
			return false;
		} else if (class133.localPlayer == var0) { // L: 5246
			return Tiles.method2268(); // L: 5249
		} else {
			return Language.method7199() || class4.method18() && var0.method2331() || Tiles.method2219() && var0.method2366(); // L: 5247
		}
	}
}
