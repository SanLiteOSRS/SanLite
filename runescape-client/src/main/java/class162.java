import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gl")
public class class162 extends class143 {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 449818999
	)
	int field1755;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfm;)V"
	)
	class162(class146 var1) {
		this.this$0 = var1;
		this.field1755 = -1; // L: 144
	} // L: 146

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "-411371469"
	)
	void vmethod3531(Buffer var1) {
		this.field1755 = var1.readUnsignedShort(); // L: 149
	} // L: 150

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lfn;I)V",
		garbageValue = "1048713263"
	)
	void vmethod3529(ClanSettings var1) {
		var1.method3408(this.field1755); // L: 153
	} // L: 154

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "48"
	)
	public static boolean method3477(int var0) {
		return var0 >= WorldMapDecorationType.field3894.id && var0 <= WorldMapDecorationType.field3887.id || var0 == WorldMapDecorationType.field3884.id; // L: 43
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "704972905"
	)
	static void method3486() {
		for (ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 44
			if (var0.obj != null) { // L: 45
				var0.set();
			}
		}

	} // L: 47
}
