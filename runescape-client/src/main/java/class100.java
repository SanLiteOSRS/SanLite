import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("du")
public class class100 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "405828754"
	)
	static String method2624(int var0) {
		return "<img=" + var0 + ">";
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lhn;",
		garbageValue = "451118805"
	)
	@Export("VarpDefinition_get")
	public static VarpDefinition VarpDefinition_get(int var0) {
		VarpDefinition var1 = (VarpDefinition)VarpDefinition.VarpDefinition_cached.get((long)var0); // L: 18
		if (var1 != null) { // L: 19
			return var1;
		} else {
			byte[] var2 = class305.VarpDefinition_archive.takeFile(16, var0); // L: 20
			var1 = new VarpDefinition(); // L: 21
			if (var2 != null) { // L: 22
				var1.decode(new Buffer(var2));
			}

			VarpDefinition.VarpDefinition_cached.put(var1, (long)var0); // L: 23
			return var1; // L: 24
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "80451609"
	)
	@Export("savePreferences")
	static void savePreferences() {
		AccessFile var0 = null; // L: 117

		try {
			var0 = FontName.getPreferencesFile("", GameBuild.field3841.name, true); // L: 119
			Buffer var1 = class10.clientPreferences.toBuffer(); // L: 120
			var0.write(var1.array, 0, var1.offset); // L: 121
		} catch (Exception var3) { // L: 123
		}

		try {
			if (var0 != null) { // L: 125
				var0.closeSync(true); // L: 126
			}
		} catch (Exception var2) { // L: 129
		}

	} // L: 130

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZLjava/lang/String;ZI)V",
		garbageValue = "-486098991"
	)
	static void method2626(String var0, boolean var1, String var2, boolean var3) {
		if (var1) { // L: 31
			if (!var3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) { // L: 32
				try {
					Desktop.getDesktop().browse(new URI(var0)); // L: 34
					return; // L: 35
				} catch (Exception var5) { // L: 37
				}
			}

			if (class31.field160.startsWith("win") && !var3) { // L: 39 40
				class14.method183(var0, 0, "openjs"); // L: 42
				return; // L: 44
			}

			if (class31.field160.startsWith("mac")) { // L: 47
				class14.method183(var0, 1, var2); // L: 48
				return; // L: 49
			}

			class14.method183(var0, 2, "openjs"); // L: 52
		} else {
			class14.method183(var0, 3, "openjs"); // L: 57
		}

	} // L: 60
}
