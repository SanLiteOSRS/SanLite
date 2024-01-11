import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bx")
public class class36 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	@Export("reflectionChecks")
	public static IterableNodeDeque reflectionChecks;
	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	@Export("archive2")
	static Archive archive2;

	static {
		reflectionChecks = new IterableNodeDeque(); // L: 17
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(ILmu;ZI)V",
		garbageValue = "-1965967218"
	)
	static void method731(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = class132.getWorldMap().getMapArea(var0); // L: 5369
		int var4 = class25.localPlayer.plane; // L: 5370
		int var5 = HealthBarDefinition.baseX * 64 + (class25.localPlayer.x >> 7); // L: 5371
		int var6 = WorldMapScaleHandler.baseY * 64 + (class25.localPlayer.y >> 7); // L: 5372
		Coord var7 = new Coord(var4, var5, var6); // L: 5373
		class132.getWorldMap().method8867(var3, var7, var1, var2); // L: 5374
	} // L: 5375

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1920272827"
	)
	static final int method729(int var0) {
		return Math.abs(var0 - HealthBarUpdate.cameraYaw) > 1024 ? var0 + 2048 * (var0 < HealthBarUpdate.cameraYaw ? 1 : -1) : var0; // L: 4026 4027
	}

	@ObfuscatedName("pj")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "100"
	)
	public static boolean method733() {
		return Client.staffModLevel >= 2; // L: 12687
	}
}
