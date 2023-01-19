import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pz")
@Implements("Fonts")
public class Fonts {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	@Export("spritesArchive")
	AbstractArchive spritesArchive;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	@Export("fontsArchive")
	AbstractArchive fontsArchive;
	@ObfuscatedName("v")
	@Export("map")
	HashMap map;

	@ObfuscatedSignature(
		descriptor = "(Lly;Lly;)V"
	)
	public Fonts(AbstractArchive var1, AbstractArchive var2) {
		this.spritesArchive = var1; // L: 14
		this.fontsArchive = var2; // L: 15
		this.map = new HashMap(); // L: 16
	} // L: 17

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "([Lpt;I)Ljava/util/HashMap;",
		garbageValue = "-1014513679"
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
				AbstractArchive var7 = this.spritesArchive; // L: 31
				AbstractArchive var8 = this.fontsArchive; // L: 32
				String var9 = var5.name; // L: 33
				int var10 = var7.getGroupId(var9); // L: 35
				int var11 = var7.getFileId(var10, ""); // L: 36
				Font var6 = Timer.method7358(var7, var8, var10, var11); // L: 37
				if (var6 != null) { // L: 40
					this.map.put(var5, var6); // L: 41
					var2.put(var5, var6); // L: 42
				}
			}
		}

		return var2; // L: 48
	}
}
