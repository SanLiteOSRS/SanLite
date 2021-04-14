import java.util.LinkedHashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ls")
@Implements("TriBool")
public class TriBool {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lls;"
	)
	@Export("TriBool_unknown")
	public static final TriBool TriBool_unknown;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lls;"
	)
	@Export("TriBool_true")
	public static final TriBool TriBool_true;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Lls;"
	)
	@Export("TriBool_false")
	public static final TriBool TriBool_false;
	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		signature = "Lig;"
	)
	@Export("archive0")
	static Archive archive0;

	static {
		TriBool_unknown = new TriBool();
		TriBool_true = new TriBool();
		TriBool_false = new TriBool();
	}

	TriBool() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(IIB)Z",
		garbageValue = "-45"
	)
	static boolean method5817(int var0, int var1) {
		return var0 != 4 || var1 < 8;
	}

	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		signature = "(ZB)V",
		garbageValue = "-17"
	)
	static final void method5818(boolean var0) {
		if (var0) {
			Client.field636 = Login.field1005 ? class125.field1456 : class125.field1457;
		} else {
			LinkedHashMap var1 = Login.clientPreferences.parameters;
			String var3 = Login.Login_username;
			int var4 = var3.length();
			int var5 = 0;

			for (int var6 = 0; var6 < var4; ++var6) {
				var5 = (var5 << 5) - var5 + var3.charAt(var6);
			}

			Client.field636 = var1.containsKey(var5) ? class125.field1459 : class125.field1458;
		}

	}
}
