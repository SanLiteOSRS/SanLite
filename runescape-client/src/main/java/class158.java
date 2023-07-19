import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gm")
public class class158 extends class144 {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1567212581
	)
	public static int field1757;
	@ObfuscatedName("as")
	public static short[] field1755;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -539516723
	)
	int field1754;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	final class147 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lft;)V"
	)
	class158(class147 var1) {
		this.this$0 = var1;
		this.field1754 = -1; // L: 213
	} // L: 215

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ltl;I)V",
		garbageValue = "-25252119"
	)
	void vmethod3458(Buffer var1) {
		this.field1754 = var1.readUnsignedShort(); // L: 218
	} // L: 219

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lfn;I)V",
		garbageValue = "-1582049647"
	)
	void vmethod3460(ClanSettings var1) {
		var1.method3297(this.field1754); // L: 222
	} // L: 223

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-871105116"
	)
	public static int method3377(int var0) {
		if (var0 > 0) { // L: 204
			return 1;
		} else {
			return var0 < 0 ? -1 : 0; // L: 205 206
		}
	}
}
