import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jm")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "[Lut;"
	)
	@Export("mapSceneSprites")
	static IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("vy")
	@ObfuscatedGetter(
		intValue = -732756041
	)
	static int field2487;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1903807447
	)
	final int field2484;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 174702113
	)
	final int field2480;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 478381797
	)
	final int field2485;

	static {
		WorldMapLabelSize_small = new WorldMapLabelSize(2, 0, 4); // L: 7
		WorldMapLabelSize_medium = new WorldMapLabelSize(1, 1, 2); // L: 8
		WorldMapLabelSize_large = new WorldMapLabelSize(0, 2, 0); // L: 9
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field2484 = var1; // L: 15
		this.field2480 = var2; // L: 16
		this.field2485 = var3; // L: 17
	} // L: 18

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(FS)Z",
		garbageValue = "12895"
	)
	boolean method4606(float var1) {
		return var1 >= (float)this.field2485; // L: 21
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Ljm;",
		garbageValue = "-1666064874"
	)
	static WorldMapLabelSize method4607(int var0) {
		WorldMapLabelSize[] var1 = new WorldMapLabelSize[]{WorldMapLabelSize_large, WorldMapLabelSize_medium, WorldMapLabelSize_small}; // L: 28
		WorldMapLabelSize[] var2 = var1; // L: 30

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 31
			WorldMapLabelSize var4 = var2[var3]; // L: 32
			if (var0 == var4.field2480) { // L: 34
				return var4; // L: 35
			}
		}

		return null; // L: 40
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1888960513"
	)
	protected static final void method4610() {
		class344.clock.mark(); // L: 477

		int var0;
		for (var0 = 0; var0 < 32; ++var0) { // L: 478
			GameEngine.graphicsTickTimes[var0] = 0L;
		}

		for (var0 = 0; var0 < 32; ++var0) { // L: 479
			GameEngine.clientTickTimes[var0] = 0L;
		}

		class195.gameCyclesToDo = 0; // L: 480
	} // L: 481
}
