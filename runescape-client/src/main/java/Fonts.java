import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pe")
@Implements("Fonts")
public class Fonts {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("spritesArchive")
	AbstractArchive spritesArchive;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("fontsArchive")
	AbstractArchive fontsArchive;
	@ObfuscatedName("f")
	@Export("map")
	HashMap map;

	@ObfuscatedSignature(
		descriptor = "(Llv;Llv;)V"
	)
	public Fonts(AbstractArchive var1, AbstractArchive var2) {
		this.spritesArchive = var1; // L: 14
		this.fontsArchive = var2; // L: 15
		this.map = new HashMap(); // L: 16
	} // L: 17

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([Lpc;I)Ljava/util/HashMap;",
		garbageValue = "1047301485"
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
				Font var6 = class360.method6731(this.spritesArchive, this.fontsArchive, var5.name, ""); // L: 30
				if (var6 != null) { // L: 31
					this.map.put(var5, var6); // L: 32
					var2.put(var5, var6); // L: 33
				}
			}
		}

		return var2; // L: 39
	}
}
