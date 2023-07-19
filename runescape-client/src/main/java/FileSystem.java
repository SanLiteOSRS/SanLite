import java.io.File;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gu")
@Implements("FileSystem")
public class FileSystem {
	@ObfuscatedName("ai")
	@Export("FileSystem_hasPermissions")
	static boolean FileSystem_hasPermissions;
	@ObfuscatedName("aj")
	@Export("FileSystem_cacheDir")
	static File FileSystem_cacheDir;
	@ObfuscatedName("ac")
	@Export("FileSystem_cacheFiles")
	public static Hashtable FileSystem_cacheFiles;
	@ObfuscatedName("mp")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	static TextureProvider field1853;

	static {
		FileSystem_hasPermissions = false; // L: 7
		FileSystem_cacheFiles = new Hashtable(16);
	} // L: 9
}
