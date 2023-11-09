import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("os")
public final class class388 {
	@ObfuscatedName("ay")
	final Object field4419;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 265596807
	)
	int field4418;

	class388(Object var1, int var2) {
		this.field4419 = var1; // L: 170
		this.field4418 = var2; // L: 171
	} // L: 172

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIII)V",
		garbageValue = "-1997347174"
	)
	@Export("insertMenuItemNoShift")
	public static final void insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		TileItem.method2645(var0, var1, var2, var3, var4, var5, -1, false); // L: 9907
	} // L: 9908
}
