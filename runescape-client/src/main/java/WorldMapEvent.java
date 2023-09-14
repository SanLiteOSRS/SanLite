import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kl")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 397416983
	)
	@Export("mapElement")
	public int mapElement;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("coord1")
	public Coord coord1;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(
		descriptor = "(ILmc;Lmc;)V"
	)
	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1; // L: 11
		this.coord1 = var2; // L: 12
		this.coord2 = var3; // L: 13
	} // L: 14

	@ObfuscatedName("nm")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "307364041"
	)
	static final void method5628(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255); // L: 12230
		if (var0 != class449.clientPreferences.method2451()) { // L: 12231
			label42: {
				if (class449.clientPreferences.method2451() == 0) { // L: 12233
					boolean var1 = !class305.field3405.isEmpty(); // L: 12236
					if (var1) { // L: 12238
						Archive var2 = class385.archive11; // L: 12239
						if (!class305.field3405.isEmpty()) { // L: 12241
							ArrayList var3 = new ArrayList(); // L: 12244
							Iterator var4 = class305.field3405.iterator(); // L: 12245

							while (var4.hasNext()) {
								class317 var5 = (class317)var4.next(); // L: 12246
								var5.field3518 = false; // L: 12248
								var5.field3516 = false; // L: 12249
								var5.field3524 = false; // L: 12250
								var5.field3519 = false; // L: 12251
								var5.field3514 = var2; // L: 12252
								var5.field3513 = var0; // L: 12253
								var5.field3510 = 0.0F; // L: 12254
								var3.add(var5); // L: 12255
							}

							class53.method1097(var3, class305.field3408, class305.field3409, class305.field3410, class305.field3401, false); // L: 12258
						}

						Client.playingJingle = false; // L: 12260
						break label42;
					}
				}

				if (var0 == 0) { // L: 12264
					Script.method2180(0, 0); // L: 12265
					Client.playingJingle = false; // L: 12266
				} else {
					class300.method5718(var0); // L: 12268
				}
			}

			class449.clientPreferences.method2458(var0); // L: 12270
		}

	} // L: 12272
}
