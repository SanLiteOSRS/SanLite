import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fe")
public class class135 implements class126 {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = 3778451496536123825L
	)
	static long field1592;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("ag")
	@Export("Tiles_saturation")
	static int[] Tiles_saturation;

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;ZI)[B",
		garbageValue = "-338736773"
	)
	public static byte[] method3073(Object var0, boolean var1) {
		if (var0 == null) { // L: 8
			return null;
		} else if (var0 instanceof byte[]) { // L: 9
			byte[] var6 = (byte[])((byte[])var0); // L: 10
			if (var1) { // L: 11
				int var4 = var6.length; // L: 14
				byte[] var5 = new byte[var4]; // L: 15
				System.arraycopy(var6, 0, var5, 0, var4); // L: 16
				return var5; // L: 19
			} else {
				return var6; // L: 21
			}
		} else if (var0 instanceof AbstractByteArrayCopier) { // L: 23
			AbstractByteArrayCopier var2 = (AbstractByteArrayCopier)var0; // L: 24
			return var2.get(); // L: 25
		} else {
			throw new IllegalArgumentException(); // L: 27
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lom;I)V",
		garbageValue = "-1763952071"
	)
	public static void method3075(AbstractArchive var0) {
		VarcInt.VarcInt_archive = var0; // L: 17
	} // L: 18

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZB)Z",
		garbageValue = "-89"
	)
	static boolean method3074(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 44
			boolean var3 = false; // L: 45
			boolean var4 = false; // L: 46
			int var5 = 0; // L: 47
			int var6 = var0.length(); // L: 48

			for (int var7 = 0; var7 < var6; ++var7) { // L: 49
				char var8 = var0.charAt(var7); // L: 50
				if (var7 == 0) { // L: 51
					if (var8 == '-') { // L: 52
						var3 = true; // L: 53
						continue;
					}

					if (var8 == '+') { // L: 56
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') { // L: 58
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') { // L: 59
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') { // L: 60
						return false; // L: 61
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) { // L: 62
					return false;
				}

				if (var3) { // L: 63
					var10 = -var10;
				}

				int var9 = var10 + var5 * var1; // L: 64
				if (var9 / var1 != var5) { // L: 65
					return false;
				}

				var5 = var9; // L: 66
				var4 = true; // L: 67
			}

			return var4; // L: 69
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-9"
	)
	@Export("isCharAlphabetic")
	public static boolean isCharAlphabetic(char var0) {
		return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z'; // L: 147
	}

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "30"
	)
	static final void method3072(int var0, int var1) {
		if (Client.menuOptionsCount >= 2 || Client.isItemSelected != 0 || Client.isSpellSelected) { // L: 9294
			if (Client.showMouseOverText) { // L: 9295
				int var2 = AttackOption.method2714(); // L: 9296
				String var3;
				if (Client.isItemSelected == 1 && Client.menuOptionsCount < 2) { // L: 9298
					var3 = "Use" + " " + Client.field772 + " " + "->";
				} else if (Client.isSpellSelected && Client.menuOptionsCount < 2) { // L: 9299
					var3 = Client.field751 + " " + Client.field688 + " " + "->";
				} else {
					var3 = class169.method3418(var2); // L: 9300
				}

				if (Client.menuOptionsCount > 2) { // L: 9301
					var3 = var3 + Client.colorStartTag(16777215) + " " + '/' + " " + (Client.menuOptionsCount - 2) + " more options";
				}

				SoundCache.fontBold12.drawRandomAlphaAndSpacing(var3, var0 + 4, var1 + 15, 16777215, 0, Client.cycle / 1000); // L: 9302
			}
		}
	} // L: 9303
}
