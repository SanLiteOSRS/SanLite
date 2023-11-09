import java.io.File;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ft")
@Implements("FileSystem")
public class FileSystem {
	@ObfuscatedName("h")
	@Export("FileSystem_hasPermissions")
	static boolean FileSystem_hasPermissions;
	@ObfuscatedName("e")
	@Export("FileSystem_cacheDir")
	static File FileSystem_cacheDir;
	@ObfuscatedName("v")
	@Export("FileSystem_cacheFiles")
	static Hashtable FileSystem_cacheFiles;
	@ObfuscatedName("ea")
	@ObfuscatedGetter(
		longValue = 5026500752660730289L
	)
	static long field1866;

	static {
		FileSystem_hasPermissions = false; // L: 7
		FileSystem_cacheFiles = new Hashtable(16);
	} // L: 9

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILbm;ZI)I",
		garbageValue = "-996868680"
	)
	static int method3479(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) { // L: 2702
			var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 2703
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.field747.method4106(var3) ? 1 : 0; // L: 2704
			return 1; // L: 2705
		} else if (var0 == 3501) { // L: 2707
			var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 2708
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.field747.method4136(var3) ? 1 : 0; // L: 2709
			return 1; // L: 2710
		} else if (var0 == 3502) { // L: 2712
			var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 2713
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.field747.method4104(var3) ? 1 : 0; // L: 2714
			return 1; // L: 2715
		} else {
			return 2; // L: 2717
		}
	}

	@ObfuscatedName("lf")
	static final void method3480(double var0) {
		Rasterizer3D.Rasterizer3D_setBrightness(var0); // L: 12166
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(var0); // L: 12167
		ItemComposition.ItemComposition_cachedSprites.clear(); // L: 12169
		StructComposition.clientPreferences.method2475(var0); // L: 12171
	} // L: 12172
}
