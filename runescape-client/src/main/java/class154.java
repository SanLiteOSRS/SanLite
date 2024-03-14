import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fp")
public class class154 extends class145 {
	@ObfuscatedName("aw")
	@Export("FileSystem_cacheDir")
	static File FileSystem_cacheDir;
	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	static Archive field1724;
	@ObfuscatedName("aq")
	String field1726;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	final class148 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfg;)V"
	)
	class154(class148 var1) {
		this.this$0 = var1; // L: 229
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "584073694"
	)
	void vmethod3512(Buffer var1) {
		this.field1726 = var1.readStringCp1252NullTerminated(); // L: 232
		var1.readInt(); // L: 233
	} // L: 234

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgt;I)V",
		garbageValue = "406847376"
	)
	void vmethod3513(ClanSettings var1) {
		var1.name = this.field1726; // L: 237
	} // L: 238

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-915452269"
	)
	@Export("isCharAlphabetic")
	public static boolean isCharAlphabetic(char var0) {
		return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z'; // L: 151
	}

	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		descriptor = "(Lng;IIB)V",
		garbageValue = "0"
	)
	@Export("alignWidgetPosition")
	static void alignWidgetPosition(Widget var0, int var1, int var2) {
		if (var0.xAlignment == 0) { // L: 11217
			var0.x = var0.rawX;
		} else if (var0.xAlignment == 1) { // L: 11218
			var0.x = var0.rawX + (var1 - var0.width) / 2;
		} else if (var0.xAlignment == 2) { // L: 11219
			var0.x = var1 - var0.width - var0.rawX;
		} else if (var0.xAlignment == 3) { // L: 11220
			var0.x = var0.rawX * var1 >> 14;
		} else if (var0.xAlignment == 4) { // L: 11221
			var0.x = (var0.rawX * var1 >> 14) + (var1 - var0.width) / 2;
		} else {
			var0.x = var1 - var0.width - (var0.rawX * var1 >> 14); // L: 11222
		}

		if (var0.yAlignment == 0) { // L: 11223
			var0.y = var0.rawY;
		} else if (var0.yAlignment == 1) { // L: 11224
			var0.y = (var2 - var0.height) / 2 + var0.rawY;
		} else if (var0.yAlignment == 2) { // L: 11225
			var0.y = var2 - var0.height - var0.rawY;
		} else if (var0.yAlignment == 3) {
			var0.y = var2 * var0.rawY >> 14; // L: 11226
		} else if (var0.yAlignment == 4) { // L: 11227
			var0.y = (var2 * var0.rawY >> 14) + (var2 - var0.height) / 2;
		} else {
			var0.y = var2 - var0.height - (var2 * var0.rawY >> 14); // L: 11228
		}

	} // L: 11229
}
