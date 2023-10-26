import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
public class class154 extends class145 {
	@ObfuscatedName("ac")
	String field1694;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lff;"
	)
	final class148 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lff;)V"
	)
	class154(class148 var1) {
		this.this$0 = var1; // L: 229
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lul;I)V",
		garbageValue = "-11659242"
	)
	void vmethod3414(Buffer var1) {
		this.field1694 = var1.readStringCp1252NullTerminated(); // L: 232
		var1.readInt(); // L: 233
	} // L: 234

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgi;I)V",
		garbageValue = "21847466"
	)
	void vmethod3415(ClanSettings var1) {
		var1.name = this.field1694; // L: 237
	} // L: 238

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "21538"
	)
	public static void method3223() {
		VarcInt.VarcInt_cached.clear(); // L: 46
	} // L: 47

	@ObfuscatedName("mr")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "354037944"
	)
	@Export("setTapToDrop")
	static void setTapToDrop(boolean var0) {
		Client.tapToDrop = var0; // L: 11453
	} // L: 11454
}
