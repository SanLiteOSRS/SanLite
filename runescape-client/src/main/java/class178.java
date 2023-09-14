import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gt")
public class class178 extends class181 {
	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "[Lui;"
	)
	static SpritePixels[] field1894;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -207822203
	)
	int field1893;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	final class170 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgf;Ljava/lang/String;I)V"
	)
	class178(class170 var1, String var2, int var3) {
		super(var1, var2); // L: 394
		this.this$0 = var1; // L: 393
		this.field1893 = var3; // L: 395
	} // L: 396

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "38"
	)
	public int vmethod3528() {
		return 0; // L: 399
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1630105394"
	)
	public int vmethod3527() {
		return this.field1893; // L: 404
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZI)I",
		garbageValue = "65280"
	)
	static int method3504(int var0, Script var1, boolean var2) {
		return 2; // L: 5283
	}
}
