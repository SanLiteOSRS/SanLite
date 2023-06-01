import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
public class class153 extends class143 {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1094561075
	)
	@Export("loginBoxCenter")
	static int loginBoxCenter;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -956627925
	)
	int field1689;
	@ObfuscatedName("an")
	String field1686;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class153(class146 var1) {
		this.this$0 = var1; // L: 323
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ltc;B)V",
		garbageValue = "1"
	)
	void vmethod3345(Buffer var1) {
		this.field1689 = var1.readInt(); // L: 326
		this.field1686 = var1.readStringCp1252NullTerminated(); // L: 327
	} // L: 328

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfb;I)V",
		garbageValue = "-621392079"
	)
	void vmethod3346(ClanSettings var1) {
		var1.method3222(this.field1689, this.field1686); // L: 331
	} // L: 332

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(S)[Ldo;",
		garbageValue = "6873"
	)
	static class89[] method3183() {
		return new class89[]{class89.field1069, class89.field1066, class89.field1068, class89.field1067, class89.field1074}; // L: 16
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lma;I)V",
		garbageValue = "-1512829118"
	)
	public static void method3187(class312 var0) {
		if (!class304.field3393.contains(var0)) { // L: 48
			class304.field3393.add(var0); // L: 49
		}

	} // L: 51
}
