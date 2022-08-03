import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ig")
public class class238 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	static final class238 field2836;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	static final class238 field2831;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	@Export("clock")
	static Clock clock;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1678125619
	)
	@Export("value")
	final int value;

	static {
		field2836 = new class238(0); // L: 4
		field2831 = new class238(1); // L: 5
	}

	class238(int var1) {
		this.value = var1; // L: 9
	} // L: 10

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Llj;I)I",
		garbageValue = "-829304695"
	)
	@Export("compareStrings")
	public static int compareStrings(CharSequence var0, CharSequence var1, Language var2) {
		int var3 = var0.length(); // L: 11
		int var4 = var1.length(); // L: 12
		int var5 = 0; // L: 13
		int var6 = 0; // L: 14
		char var7 = 0; // L: 15
		char var8 = 0; // L: 16

		while (var5 - var7 < var3 || var6 - var8 < var4) { // L: 18
			if (var5 - var7 >= var3) { // L: 19
				return -1;
			}

			if (var6 - var8 >= var4) { // L: 20
				return 1;
			}

			char var9;
			if (var7 != 0) { // L: 23
				var9 = var7; // L: 24
				boolean var14 = false;
			} else {
				var9 = var0.charAt(var5++);
			}

			char var10;
			if (var8 != 0) {
				var10 = var8;
				boolean var15 = false;
			} else {
				var10 = var1.charAt(var6++);
			}

			var7 = ClanSettings.method2993(var9); // L: 33
			var8 = ClanSettings.method2993(var10);
			var9 = GrandExchangeEvents.standardizeChar(var9, var2); // L: 35
			var10 = GrandExchangeEvents.standardizeChar(var10, var2);
			if (var9 != var10 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) { // L: 37
				var9 = Character.toLowerCase(var9); // L: 38
				var10 = Character.toLowerCase(var10);
				if (var10 != var9) { // L: 40
					return class167.lowercaseChar(var9, var2) - class167.lowercaseChar(var10, var2);
				}
			}
		}

		int var16 = Math.min(var3, var4); // L: 43

		char var12;
		int var17;
		for (var17 = 0; var17 < var16; ++var17) {
			if (var2 == Language.Language_FR) {
				var5 = var3 - 1 - var17; // L: 46
				var6 = var4 - 1 - var17; // L: 47
			} else {
				var6 = var17;
				var5 = var17;
			}

			char var11 = var0.charAt(var5); // L: 50
			var12 = var1.charAt(var6); // L: 51
			if (var12 != var11 && Character.toUpperCase(var11) != Character.toUpperCase(var12)) { // L: 52
				var11 = Character.toLowerCase(var11); // L: 53
				var12 = Character.toLowerCase(var12);
				if (var11 != var12) {
					return class167.lowercaseChar(var11, var2) - class167.lowercaseChar(var12, var2); // L: 55
				}
			}
		}

		var17 = var3 - var4;
		if (var17 != 0) { // L: 59
			return var17;
		} else {
			for (int var18 = 0; var18 < var16; ++var18) { // L: 60
				var12 = var0.charAt(var18); // L: 61
				char var13 = var1.charAt(var18); // L: 62
				if (var12 != var13) { // L: 63
					return class167.lowercaseChar(var12, var2) - class167.lowercaseChar(var13, var2);
				}
			}

			return 0; // L: 65
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)Lgp;",
		garbageValue = "-1043159088"
	)
	@Export("getParamDefinition")
	public static ParamComposition getParamDefinition(int var0) {
		ParamComposition var1 = (ParamComposition)ParamComposition.ParamComposition_cached.get((long)var0); // L: 25
		if (var1 != null) { // L: 26
			return var1;
		} else {
			byte[] var2 = ParamComposition.ParamDefinition_archive.takeFile(11, var0); // L: 27
			var1 = new ParamComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 30
			ParamComposition.ParamComposition_cached.put(var1, (long)var0);
			return var1; // L: 32
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZZB)V",
		garbageValue = "-31"
	)
	@Export("openURL")
	public static void openURL(String var0, boolean var1, boolean var2) {
		if (var1) { // L: 28
			if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) { // L: 29
				try {
					Desktop.getDesktop().browse(new URI(var0)); // L: 31
					return; // L: 58
				} catch (Exception var4) { // L: 34
				}
			}

			if (class29.field182.startsWith("win")) { // L: 36
				FriendSystem.method1696(var0, 0, "openjs"); // L: 39
			} else if (class29.field182.startsWith("mac")) { // L: 44
				FriendSystem.method1696(var0, 1, "openjs"); // L: 45
			} else {
				FriendSystem.method1696(var0, 2, "openjs"); // L: 49
			}
		} else {
			FriendSystem.method1696(var0, 3, "openjs"); // L: 54
		}

	}
}
