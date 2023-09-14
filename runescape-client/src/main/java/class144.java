import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fz")
public class class144 extends class143 {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -974781301
	)
	int field1672;
	@ObfuscatedName("ae")
	boolean field1670;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	class144(class146 var1) {
		this.this$0 = var1;
		this.field1672 = -1; // L: 178
	} // L: 181

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ltm;I)V",
		garbageValue = "209179459"
	)
	void vmethod3337(Buffer var1) {
		this.field1672 = var1.readUnsignedShort(); // L: 184
		this.field1670 = var1.readUnsignedByte() == 1; // L: 185
	} // L: 186

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lfi;B)V",
		garbageValue = "73"
	)
	void vmethod3339(ClanSettings var1) {
		var1.method3232(this.field1672, this.field1670); // L: 189
	} // L: 190

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-2136715015"
	)
	public static int method3118(int var0, int var1, int var2) {
		var2 &= 3; // L: 17
		if (var2 == 0) { // L: 18
			return var1;
		} else if (var2 == 1) { // L: 19
			return 7 - var0;
		} else {
			return var2 == 2 ? 7 - var1 : var0; // L: 20
		}
	}
}
