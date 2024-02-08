import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ie")
public class class216 extends class222 {
	@ObfuscatedName("am")
	String field2325;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lih;"
	)
	final class219 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lih;Ljava/lang/String;Ljava/lang/String;)V"
	)
	class216(class219 var1, String var2, String var3) {
		super(var1, var2); // L: 360
		this.this$0 = var1; // L: 359
		this.field2325 = var3; // L: 361
	} // L: 362

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "945435280"
	)
	public int vmethod4368() {
		return 1; // L: 365
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1875884586"
	)
	public String vmethod4369() {
		return this.field2325; // L: 370
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "880024876"
	)
	static void method4273() {
		WorldMapRegion.WorldMapRegion_cachedSprites.clear(); // L: 46
	} // L: 47
}
