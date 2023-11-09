import java.util.Collections;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("de")
public class class120 implements class112 {
	@ObfuscatedName("pn")
	@ObfuscatedSignature(
		descriptor = "[Lku;"
	)
	static Widget[] field1486;

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "([I[IS)V",
		garbageValue = "11506"
	)
	public static void method2823(int[] var0, int[] var1) {
		if (var0 != null && var1 != null) {
			WorldMapSectionType.ByteArrayPool_alternativeSizes = var0; // L: 62
			Frames.ByteArrayPool_altSizeArrayCounts = new int[var0.length]; // L: 63
			ModeWhere.ByteArrayPool_arrays = new byte[var0.length][][]; // L: 64

			for (int var2 = 0; var2 < WorldMapSectionType.ByteArrayPool_alternativeSizes.length; ++var2) { // L: 65
				ModeWhere.ByteArrayPool_arrays[var2] = new byte[var1[var2]][]; // L: 66
				ByteArrayPool.field4239.add(var0[var2]); // L: 67
			}

			Collections.sort(ByteArrayPool.field4239); // L: 69
		} else {
			WorldMapSectionType.ByteArrayPool_alternativeSizes = null;
			Frames.ByteArrayPool_altSizeArrayCounts = null; // L: 51
			ModeWhere.ByteArrayPool_arrays = null;
			ByteArrayPool.field4239.clear(); // L: 54
			ByteArrayPool.field4239.add(100); // L: 55
			ByteArrayPool.field4239.add(5000); // L: 56
			ByteArrayPool.field4239.add(10000);
			ByteArrayPool.field4239.add(30000); // L: 58
		}
	} // L: 60 70

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Llc;B)V",
		garbageValue = "119"
	)
	public static void method2822(AbstractArchive var0) {
		EnumComposition.EnumDefinition_archive = var0; // L: 25
	} // L: 26

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1519818324"
	)
	public static boolean method2821(char var0) {
		if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) { // L: 45
			if (var0 != 0) { // L: 46
				char[] var1 = class341.cp1252AsciiExtension; // L: 48

				for (int var2 = 0; var2 < var1.length; ++var2) { // L: 49
					char var3 = var1[var2]; // L: 50
					if (var0 == var3) { // L: 52
						return true;
					}
				}
			}

			return false; // L: 57
		} else {
			return true;
		}
	}
}
