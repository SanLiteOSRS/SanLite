import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("au")
public final class class4 {
	@ObfuscatedName("gq")
	@ObfuscatedGetter(
		intValue = -1182573109
	)
	static int field12;
	@ObfuscatedName("jf")
	@Export("regionLandArchives")
	static byte[][] regionLandArchives;

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)[Lmi;",
		garbageValue = "-574756815"
	)
	static class330[] method17() {
		return new class330[]{class330.field3794, class330.field3795}; // L: 35
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lnm;Lnm;Lnm;Lnm;I)V",
		garbageValue = "220568265"
	)
	public static void method21(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, AbstractArchive var3) {
		int var4 = 0; // L: 225
		if (var0 != null) { // L: 226
			UserComparator3.Widget_archive = var0; // L: 227
			DynamicObject.field985 = var1; // L: 228
			ScriptEvent.Widget_spritesArchive = var2; // L: 229
			class146.Widget_fontsArchive = var3; // L: 230
			var4 = UserComparator3.Widget_archive.getGroupCount(); // L: 231
		}

		VerticalAlignment.Widget_interfaceComponents = new Widget[var4][]; // L: 233
		class264.Widget_loadedInterfaces = new boolean[var4]; // L: 234
	} // L: 235

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1773808953"
	)
	public static boolean method18() {
		return class297.musicPlayerStatus != 0 ? true : class475.midiPcmStream.isReady(); // L: 81 82
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-518646489"
	)
	public static void method19() {
		KitDefinition.KitDefinition_cached.clear(); // L: 138
	} // L: 139

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lmq;I)I",
		garbageValue = "-935305362"
	)
	static int method22(Widget var0) {
		if (var0.type != 11) { // L: 1554
			Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize - 1] = ""; // L: 1555
			return 1; // L: 1556
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize]; // L: 1558
			Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var0.method6384(var1); // L: 1559
			return 1; // L: 1560
		}
	}
}
