import java.io.File;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("el")
@Implements("FileSystem")
public class FileSystem {
	@ObfuscatedName("h")
	@Export("FileSystem_hasPermissions")
	static boolean FileSystem_hasPermissions;
	@ObfuscatedName("c")
	@Export("FileSystem_cacheDir")
	static File FileSystem_cacheDir;
	@ObfuscatedName("o")
	@Export("FileSystem_cacheFiles")
	static Hashtable FileSystem_cacheFiles;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("Widget_fontsArchive")
	static AbstractArchive Widget_fontsArchive;
	@ObfuscatedName("fm")
	@ObfuscatedGetter(
		longValue = -9193432977542192121L
	)
	static long field1486;

	static {
		FileSystem_hasPermissions = false;
		FileSystem_cacheFiles = new Hashtable(16);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1134946214"
	)
	static final void method2542(int var0, int var1, int var2, int var3) {
		for (int var4 = var1; var4 <= var3 + var1; ++var4) {
			for (int var5 = var0; var5 <= var0 + var2; ++var5) {
				if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
					Tiles.field1090[0][var5][var4] = 127;
					if (var0 == var5 && var5 > 0) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 - 1][var4];
					}

					if (var0 + var2 == var5 && var5 < 103) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 + 1][var4];
					}

					if (var4 == var1 && var4 > 0) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 - 1];
					}

					if (var3 + var1 == var4 && var4 < 103) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 + 1];
					}
				}
			}
		}

	}

	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1955007405"
	)
	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close();
		PrivateChatMode.method5815();
		class44.method494();
		KitDefinition.KitDefinition_cached.clear();
		class32.method365();
		JagexCache.method2538();
		ItemComposition.ItemDefinition_cached.clear();
		ItemComposition.ItemDefinition_cachedModels.clear();
		ItemComposition.ItemDefinition_cachedSprites.clear();
		SequenceDefinition.SequenceDefinition_cached.clear();
		SequenceDefinition.SequenceDefinition_cachedFrames.clear();
		UserComparator8.method2447();
		VarbitComposition.VarbitDefinition_cached.clear();
		class169.method3493();
		class7.field60.method6309();
		ModeWhere.HitSplatDefinition_cachedSprites.method6309();
		ScriptFrame.method1162();
		HealthBarDefinition.field1596.clear();
		HealthBarDefinition.WorldMapElement_cachedSprites.clear();
		StructComposition.StructDefinition_cached.clear();
		UrlRequester.method2422();
		class12.method202();
		PlayerComposition.Widget_cachedModels.clear();
		HealthBarUpdate.method2200();
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).clear();
		Script.Script_cached.clear();
		MilliClock.archive3.clearFiles();
		class0.archive4.clearFiles();
		EnumComposition.archive5.clearFiles();
		class14.field129.clearFiles();
		WorldMapSection0.archive7.clearFiles();
		class29.archive6.clearFiles();
		class260.archive9.clearFiles();
		class43.archive8.clearFiles();
		GameBuild.field3213.clearFiles();
		PendingSpawn.archive10.clearFiles();
		KeyHandler.archive11.clearFiles();
		class22.archive12.clearFiles();
		class5.scene.clear();

		for (int var0 = 0; var0 < 4; ++var0) {
			Client.collisionMaps[var0].clear();
		}

		System.gc();
		class390.method6744(2);
		Client.currentTrackGroupId = -1;
		Client.field866 = false;

		for (ObjectSound var1 = (ObjectSound)ObjectSound.objectSounds.last(); var1 != null; var1 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var1.stream1 != null) {
				FloorOverlayDefinition.pcmStreamMixer.removeSubStream(var1.stream1);
				var1.stream1 = null;
			}

			if (var1.stream2 != null) {
				FloorOverlayDefinition.pcmStreamMixer.removeSubStream(var1.stream2);
				var1.stream2 = null;
			}
		}

		ObjectSound.objectSounds.clear();
		Client.updateGameState(10);
	}
}
