import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sr")
@Implements("Fonts")
public class Fonts {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("spritesArchive")
	AbstractArchive spritesArchive;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("fontsArchive")
	AbstractArchive fontsArchive;
	@ObfuscatedName("av")
	@Export("map")
	HashMap map;

	@ObfuscatedSignature(
		descriptor = "(Lnq;Lnq;)V"
	)
	public Fonts(AbstractArchive var1, AbstractArchive var2) {
		this.spritesArchive = var1; // L: 14
		this.fontsArchive = var2; // L: 15
		this.map = new HashMap(); // L: 16
	} // L: 17

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([Lsb;B)Ljava/util/HashMap;",
		garbageValue = "46"
	)
	@Export("createMap")
	public HashMap createMap(FontName[] var1) {
		HashMap var2 = new HashMap(); // L: 20
		FontName[] var3 = var1; // L: 22

		for (int var4 = 0; var4 < var3.length; ++var4) { // L: 23
			FontName var5 = var3[var4]; // L: 24
			if (this.map.containsKey(var5)) { // L: 26
				var2.put(var5, this.map.get(var5)); // L: 27
			} else {
				Font var6 = class478.method8649(this.spritesArchive, this.fontsArchive, var5.name, ""); // L: 30
				if (var6 != null) { // L: 31
					this.map.put(var5, var6); // L: 32
					var2.put(var5, var6); // L: 33
				}
			}
		}

		return var2; // L: 39
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lny;II)V",
		garbageValue = "-1908099645"
	)
	public static void method8576(Archive var0, int var1) {
		class411.field4561.offset = var1 * 8 + 5; // L: 135
		if (class411.field4561.offset >= class411.field4561.array.length) { // L: 136
			if (var0.field4242) { // L: 137
				var0.method6648(); // L: 138
			} else {
				throw new RuntimeException(""); // L: 141
			}
		} else {
			int var2 = class411.field4561.readInt(); // L: 143
			int var3 = class411.field4561.readInt(); // L: 144
			var0.loadIndex(var2, var3); // L: 145
		}
	} // L: 139 146
}
