import java.io.File;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("gy")
@Implements("FileSystem")
public class FileSystem {
	@ObfuscatedName("at")
	@Export("FileSystem_hasPermissions")
	static boolean FileSystem_hasPermissions;
	@ObfuscatedName("an")
	@Export("FileSystem_cacheDir")
	static File FileSystem_cacheDir;
	@ObfuscatedName("av")
	@Export("FileSystem_cacheFiles")
	static Hashtable FileSystem_cacheFiles;

	static {
		FileSystem_hasPermissions = false; // L: 7
		FileSystem_cacheFiles = new Hashtable(16);
	} // L: 9
}
