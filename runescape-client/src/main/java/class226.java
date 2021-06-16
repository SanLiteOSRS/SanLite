import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hj")
public class class226 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	public static final class226 field2688;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	public static final class226 field2683;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	public static final class226 field2684;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	public static final class226 field2692;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	public static final class226 field2693;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	public static final class226 field2687;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	public static final class226 field2686;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	public static final class226 field2689;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	public static final class226 field2690;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	public static final class226 field2691;

	static {
		field2688 = new class226(5);
		field2683 = new class226(4);
		field2684 = new class226(3);
		field2692 = new class226(6);
		field2693 = new class226(7);
		field2687 = new class226(5);
		field2686 = new class226(4);
		field2689 = new class226(15);
		field2690 = new class226(2);
		field2691 = new class226(14);
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "5"
	)
	class226(int var1) {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lkn;I)I",
		garbageValue = "456849187"
	)
	@Export("compareStrings")
	public static int compareStrings(CharSequence var0, CharSequence var1, Language var2) {
		int var3 = var0.length();
		int var4 = var1.length();
		int var5 = 0;
		int var6 = 0;
		byte var7 = 0;
		byte var8 = 0;

		while (var5 - var7 < var3 || var6 - var8 < var4) {
			if (var5 - var7 >= var3) {
				return -1;
			}

			if (var6 - var8 >= var4) {
				return 1;
			}

			char var9;
			if (var7 != 0) {
				var9 = (char)var7;
				boolean var14 = false;
			} else {
				var9 = var0.charAt(var5++);
			}

			char var10;
			if (var8 != 0) {
				var10 = (char)var8;
				boolean var15 = false;
			} else {
				var10 = var1.charAt(var6++);
			}

			byte var11;
			if (var9 == 198) {
				var11 = 69;
			} else if (var9 == 230) {
				var11 = 101;
			} else if (var9 == 223) {
				var11 = 115;
			} else if (var9 == 338) {
				var11 = 69;
			} else if (var9 == 339) {
				var11 = 101;
			} else {
				var11 = 0;
			}

			var7 = var11;
			byte var12;
			if (var10 == 198) {
				var12 = 69;
			} else if (var10 == 230) {
				var12 = 101;
			} else if (var10 == 223) {
				var12 = 115;
			} else if (var10 == 338) {
				var12 = 69;
			} else if (var10 == 339) {
				var12 = 101;
			} else {
				var12 = 0;
			}

			var8 = var12;
			var9 = class244.standardizeChar(var9, var2);
			var10 = class244.standardizeChar(var10, var2);
			if (var10 != var9 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) {
				var9 = Character.toLowerCase(var9);
				var10 = Character.toLowerCase(var10);
				if (var10 != var9) {
					return SpotAnimationDefinition.lowercaseChar(var9, var2) - SpotAnimationDefinition.lowercaseChar(var10, var2);
				}
			}
		}

		int var16 = Math.min(var3, var4);

		int var17;
		char var20;
		for (var17 = 0; var17 < var16; ++var17) {
			if (var2 == Language.Language_FR) {
				var5 = var3 - 1 - var17;
				var6 = var4 - 1 - var17;
			} else {
				var6 = var17;
				var5 = var17;
			}

			char var18 = var0.charAt(var5);
			var20 = var1.charAt(var6);
			if (var20 != var18 && Character.toUpperCase(var18) != Character.toUpperCase(var20)) {
				var18 = Character.toLowerCase(var18);
				var20 = Character.toLowerCase(var20);
				if (var20 != var18) {
					return SpotAnimationDefinition.lowercaseChar(var18, var2) - SpotAnimationDefinition.lowercaseChar(var20, var2);
				}
			}
		}

		var17 = var3 - var4;
		if (var17 != 0) {
			return var17;
		} else {
			for (int var19 = 0; var19 < var16; ++var19) {
				var20 = var0.charAt(var19);
				char var13 = var1.charAt(var19);
				if (var20 != var13) {
					return SpotAnimationDefinition.lowercaseChar(var20, var2) - SpotAnimationDefinition.lowercaseChar(var13, var2);
				}
			}

			return 0;
		}
	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1374315028"
	)
	@Export("updateSoundEffectVolume")
	static final void updateSoundEffectVolume(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		class4.clientPreferences.soundEffectsVolume = var0;
		Actor.savePreferences();
	}
}
