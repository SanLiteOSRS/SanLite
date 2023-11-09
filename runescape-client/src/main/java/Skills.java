import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mm")
@Implements("Skills")
public class Skills {
	@ObfuscatedName("al")
	@Export("Skills_enabled")
	public static final boolean[] Skills_enabled;
	@ObfuscatedName("ac")
	@Export("Skills_experienceTable")
	public static int[] Skills_experienceTable;

	static {
		Skills_enabled = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false}; // L: 5
		Skills_experienceTable = new int[99]; // L: 6
		int var0 = 0; // L: 9

		for (int var1 = 0; var1 < 99; ++var1) { // L: 10
			int var2 = var1 + 1; // L: 11
			int var3 = (int)((double)var2 + 300.0D * Math.pow(2.0D, (double)var2 / 7.0D)); // L: 12
			var0 += var3; // L: 13
			Skills_experienceTable[var1] = var0 / 4; // L: 14
		}

	} // L: 16

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1787424605"
	)
	@Export("isWorldMapEvent")
	public static boolean isWorldMapEvent(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17; // L: 19
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1955316820"
	)
	static void method6322() {
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 53
			if (ArchiveDiskActionHandler.field4162 == 0) { // L: 54
				class145.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler()); // L: 55
				class145.ArchiveDiskActionHandler_thread.setDaemon(true); // L: 56
				class145.ArchiveDiskActionHandler_thread.start(); // L: 57
				class145.ArchiveDiskActionHandler_thread.setPriority(5); // L: 58
			}

			ArchiveDiskActionHandler.field4162 = 600; // L: 60
		}
	} // L: 62

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-2090734700"
	)
	@Export("queueSoundEffect")
	static void queueSoundEffect(int var0, int var1, int var2) {
		if (WorldMapSectionType.clientPreferences.method2442() != 0 && var1 != 0 && Client.soundEffectCount < 50) { // L: 3681
			Client.soundEffectIds[Client.soundEffectCount] = var0; // L: 3682
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1; // L: 3683
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2; // L: 3684
			Client.soundEffects[Client.soundEffectCount] = null; // L: 3685
			Client.soundLocations[Client.soundEffectCount] = 0; // L: 3686
			++Client.soundEffectCount; // L: 3687
		}

	} // L: 3689
}
