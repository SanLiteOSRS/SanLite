import java.io.File;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ga")
@Implements("FileSystem")
public class FileSystem {
	@ObfuscatedName("ac")
	@Export("FileSystem_hasPermissions")
	static boolean FileSystem_hasPermissions;
	@ObfuscatedName("al")
	@Export("FileSystem_cacheDir")
	static File FileSystem_cacheDir;
	@ObfuscatedName("ak")
	@Export("FileSystem_cacheFiles")
	static Hashtable FileSystem_cacheFiles;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 396849549
	)
	@Export("cacheGamebuild")
	static int cacheGamebuild;

	static {
		FileSystem_hasPermissions = false; // L: 7
		FileSystem_cacheFiles = new Hashtable(16);
	} // L: 9

	@ObfuscatedName("oe")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "1782754354"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase(); // L: 12780
		short[] var2 = new short[16]; // L: 12781
		int var3 = 0; // L: 12782

		for (int var4 = 0; var4 < class284.ItemComposition_fileCount; ++var4) { // L: 12783
			ItemComposition var9 = class214.ItemComposition_get(var4); // L: 12784
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) { // L: 12785 12786 12787
				if (var3 >= 250) { // L: 12788
					SoundSystem.foundItemIdCount = -1; // L: 12789
					class138.foundItemIds = null; // L: 12790
					return; // L: 12791
				}

				if (var3 >= var2.length) { // L: 12793
					short[] var6 = new short[var2.length * 2]; // L: 12794

					for (int var7 = 0; var7 < var3; ++var7) { // L: 12795
						var6[var7] = var2[var7];
					}

					var2 = var6; // L: 12796
				}

				var2[var3++] = (short)var4; // L: 12798
			}
		}

		class138.foundItemIds = var2; // L: 12800
		class317.foundItemIndex = 0; // L: 12801
		SoundSystem.foundItemIdCount = var3; // L: 12802
		String[] var8 = new String[SoundSystem.foundItemIdCount]; // L: 12803

		for (int var5 = 0; var5 < SoundSystem.foundItemIdCount; ++var5) { // L: 12804
			var8[var5] = class214.ItemComposition_get(var2[var5]).name;
		}

		GameObject.method5196(var8, class138.foundItemIds); // L: 12805
	} // L: 12806
}
