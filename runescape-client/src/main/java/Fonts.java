import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sy")
@Implements("Fonts")
public class Fonts {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("spritesArchive")
	AbstractArchive spritesArchive;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("fontsArchive")
	AbstractArchive fontsArchive;
	@ObfuscatedName("ar")
	@Export("map")
	HashMap map;

	@ObfuscatedSignature(
		descriptor = "(Lni;Lni;)V"
	)
	public Fonts(AbstractArchive var1, AbstractArchive var2) {
		this.spritesArchive = var1; // L: 14
		this.fontsArchive = var2;
		this.map = new HashMap(); // L: 16
	} // L: 17

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([Lss;B)Ljava/util/HashMap;",
		garbageValue = "2"
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
				Font var6 = Login.method2093(this.spritesArchive, this.fontsArchive, var5.name, ""); // L: 30
				if (var6 != null) { // L: 31
					this.map.put(var5, var6); // L: 32
					var2.put(var5, var6); // L: 33
				}
			}
		}

		return var2; // L: 39
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-338556750"
	)
	public static int method8638(int var0) {
		return var0 != 0 && var0 != 1 ? -1 : 0; // L: 12 13 15
	}
}
