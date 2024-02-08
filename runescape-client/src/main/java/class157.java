import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gn")
public class class157 extends class143 {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1726996979
	)
	int field1734;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfm;)V"
	)
	class157(class146 var1) {
		this.this$0 = var1;
		this.field1734 = -1; // L: 213
	} // L: 215

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "-411371469"
	)
	void vmethod3531(Buffer var1) {
		this.field1734 = var1.readUnsignedShort(); // L: 218
	} // L: 219

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lfn;I)V",
		garbageValue = "1048713263"
	)
	void vmethod3529(ClanSettings var1) {
		var1.method3375(this.field1734); // L: 222
	} // L: 223

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1244416884"
	)
	static int method3437(int var0, int var1) {
		int var2 = var1 - 334; // L: 5780
		if (var2 < 0) { // L: 5781
			var2 = 0;
		} else if (var2 > 100) { // L: 5782
			var2 = 100;
		}

		int var3 = (Client.zoomWidth - Client.zoomHeight) * var2 / 100 + Client.zoomHeight; // L: 5783
		return var0 * var3 / 256; // L: 5784
	}
}
