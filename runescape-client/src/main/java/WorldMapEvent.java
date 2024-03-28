import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("la")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 2032352393
	)
	@Export("mapElement")
	public int mapElement;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("coord1")
	public Coord coord1;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(
		descriptor = "(ILnn;Lnn;)V"
	)
	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1; // L: 11
		this.coord1 = var2; // L: 12
		this.coord2 = var3; // L: 13
	} // L: 14

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "27188790"
	)
	static void method5834() {
		Iterator var0 = class321.field3495.iterator(); // L: 175

		while (true) {
			class333 var1;
			do {
				if (!var0.hasNext()) {
					class321.field3495.clear(); // L: 197
					return; // L: 198
				}

				var1 = (class333)var0.next(); // L: 176
			} while(var1 == null); // L: 178

			var1.field3613.clear(); // L: 181
			var1.field3613.method6004(); // L: 182
			var1.field3613.setPcmStreamVolume(0); // L: 183
			var1.field3613.field3534 = 0; // L: 184
			int var2 = var1.field3605; // L: 185
			int var3 = var1.field3606; // L: 186
			Iterator var4 = class321.field3499.iterator(); // L: 188

			while (var4.hasNext()) {
				class327 var5 = (class327)var4.next(); // L: 189
				var5.vmethod6187(var2, var3); // L: 191
			}
		}
	}
}
