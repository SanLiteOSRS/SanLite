import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ew")
public class class138 extends class128 {
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -788758719
	)
	public static int field1608;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1493052171
	)
	int field1609;
	@ObfuscatedName("q")
	String field1605;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lec;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lec;)V"
	)
	class138(class131 var1) {
		this.this$0 = var1; // L: 323
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lqw;I)V",
		garbageValue = "-423569520"
	)
	void vmethod3155(Buffer var1) {
		this.field1609 = var1.readInt(); // L: 326
		this.field1605 = var1.readStringCp1252NullTerminated(); // L: 327
	} // L: 328

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lez;I)V",
		garbageValue = "-1755436064"
	)
	void vmethod3154(ClanSettings var1) {
		var1.method2990(this.field1609, this.field1605); // L: 331
	} // L: 332
}
