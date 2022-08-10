import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pb")
@Implements("Fonts")
public class Fonts {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("spritesArchive")
	AbstractArchive spritesArchive;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("fontsArchive")
	AbstractArchive fontsArchive;
	@ObfuscatedName("f")
	@Export("map")
	HashMap map;

	@ObfuscatedSignature(
		descriptor = "(Llc;Llc;)V"
	)
	public Fonts(AbstractArchive var1, AbstractArchive var2) {
		this.spritesArchive = var1; // L: 14
		this.fontsArchive = var2; // L: 15
		this.map = new HashMap(); // L: 16
	} // L: 17

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "([Lpz;I)Ljava/util/HashMap;",
		garbageValue = "1790173917"
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
				byte[] var14 = var7.takeFile(var10, var11); // L: 41
				boolean var13;
				if (var14 == null) { // L: 42
					var13 = false; // L: 43
				} else {
					class83.SpriteBuffer_decode(var14); // L: 46
					var13 = true; // L: 47
				}

				Font var12;
				if (!var13) { // L: 49
					var12 = null; // L: 50
				} else {
					var12 = class14.method182(var8.takeFile(var10, var11)); // L: 53
				}

				if (var12 != null) { // L: 58
					this.map.put(var5, var12); // L: 59
					var2.put(var5, var12); // L: 60
				}
			}
		}

		return var2; // L: 66
	}
}
