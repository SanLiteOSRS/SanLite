import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tv")
@Implements("Fonts")
public class Fonts {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("spritesArchive")
	AbstractArchive spritesArchive;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("fontsArchive")
	AbstractArchive fontsArchive;
	@ObfuscatedName("al")
	@Export("map")
	HashMap map;

	@ObfuscatedSignature(
		descriptor = "(Lof;Lof;)V"
	)
	public Fonts(AbstractArchive var1, AbstractArchive var2) {
		this.spritesArchive = var1; // L: 14
		this.fontsArchive = var2; // L: 15
		this.map = new HashMap(); // L: 16
	} // L: 17

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([Ltu;I)Ljava/util/HashMap;",
		garbageValue = "-963615002"
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
				Font var6;
				if (!var7.isValidFileName(var9, "")) { // L: 35
					var6 = null; // L: 36
				} else {
					int var10 = var7.getGroupId(var9); // L: 39
					int var11 = var7.getFileId(var10, ""); // L: 40
					Font var12;
					if (!class130.method3074(var7, var10, var11)) { // L: 43
						var12 = null; // L: 44
					} else {
						var12 = class529.method9417(var8.takeFile(var10, var11)); // L: 47
					}

					var6 = var12; // L: 49
				}

				if (var6 != null) { // L: 52
					this.map.put(var5, var6); // L: 53
					var2.put(var5, var6); // L: 54
				}
			}
		}

		return var2; // L: 60
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)Z",
		garbageValue = "-2107938255"
	)
	static final boolean method9105(int var0, int var1, int var2, int var3, int var4) {
		PendingSpawn var5 = null; // L: 8600

		for (PendingSpawn var6 = (PendingSpawn)Client.pendingSpawns.last(); var6 != null; var6 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 8601 8602 8607
			if (var0 == var6.plane && var6.x == var1 && var2 == var6.y && var3 == var6.type) { // L: 8603
				var5 = var6; // L: 8604
				break;
			}
		}

		if (var5 != null) { // L: 8609
			var5.field1203 = var4; // L: 8610
			return true; // L: 8611
		} else {
			return false; // L: 8613
		}
	}

	@ObfuscatedName("ot")
	@ObfuscatedSignature(
		descriptor = "(I)Lot;",
		garbageValue = "-2108213446"
	)
	static class378 method9109() {
		return class356.field3897; // L: 13029
	}
}
