import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fx")
public class class160 {
	@ObfuscatedName("v")
	@Export("directions")
	public static int[][] directions;
	@ObfuscatedName("y")
	@Export("distances")
	public static int[][] distances;
	@ObfuscatedName("r")
	@Export("bufferX")
	public static int[] bufferX;
	@ObfuscatedName("h")
	@Export("bufferY")
	public static int[] bufferY;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Len;"
	)
	@Export("clock")
	static Clock clock;
	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("archive11")
	static Archive archive11;
	@ObfuscatedName("fa")
	@ObfuscatedGetter(
		longValue = 3427195158311582499L
	)
	static long field1929;
	@ObfuscatedName("hz")
	@ObfuscatedGetter(
		intValue = 1662594795
	)
	@Export("cameraY")
	static int cameraY;

	static {
		directions = new int[128][128];
		distances = new int[128][128];
		bufferX = new int[4096];
		bufferY = new int[4096];
	}

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "(Lcj;ZI)V",
		garbageValue = "-868096923"
	)
	@Export("addPlayerToScene")
	static void addPlayerToScene(Player var0, boolean var1) {
		if (var0 != null && var0.isVisible() && !var0.isHidden) {
			var0.isUnanimated = false;
			if ((Client.isLowDetail && Players.Players_count > 50 || Players.Players_count > 200) && var1 && var0.movementSequence == var0.idleSequence) {
				var0.isUnanimated = true;
			}

			int var2 = var0.x >> 7;
			int var3 = var0.y >> 7;
			if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
				long var4 = UserComparator3.calculateTag(0, 0, 0, false, var0.index);
				if (var0.model0 != null && Client.cycle >= var0.animationCycleStart && Client.cycle < var0.animationCycleEnd) {
					var0.isUnanimated = false;
					var0.tileHeight = ItemContainer.getTileHeight(var0.x, var0.y, SoundSystem.Client_plane);
					var0.playerCycle = Client.cycle;
					DevicePcmPlayerProvider.scene.addNullableObject(SoundSystem.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.minX, var0.minY, var0.maxX, var0.maxY);
				} else {
					if ((var0.x & 127) == 64 && (var0.y & 127) == 64) {
						if (Client.tileLastDrawnActor[var2][var3] == Client.viewportDrawCount) {
							return;
						}

						Client.tileLastDrawnActor[var2][var3] = Client.viewportDrawCount;
					}

					var0.tileHeight = ItemContainer.getTileHeight(var0.x, var0.y, SoundSystem.Client_plane);
					var0.playerCycle = Client.cycle;
					DevicePcmPlayerProvider.scene.drawEntity(SoundSystem.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.isWalking);
				}
			}
		}

	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-18748902"
	)
	static boolean method3253(int var0) {
		return var0 == 57 || var0 == 58 || var0 == 1007 || var0 == 25 || var0 == 30;
	}
}
