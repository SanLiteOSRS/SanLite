import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fs")
public class class168 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	public UrlRequest field1867;
	@ObfuscatedName("e")
	public float[] field1868;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	final class163 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfk;)V"
	)
	class168(class163 var1) {
		this.this$0 = var1;
		this.field1868 = new float[4]; // L: 318
	} // L: 320

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(CLmb;I)C",
		garbageValue = "2057420121"
	)
	@Export("standardizeChar")
	static char standardizeChar(char var0, Language var1) {
		if (var0 >= 192 && var0 <= 255) { // L: 69
			if (var0 >= 192 && var0 <= 198) { // L: 70
				return 'A';
			}

			if (var0 == 199) { // L: 71
				return 'C';
			}

			if (var0 >= 200 && var0 <= 203) { // L: 72
				return 'E';
			}

			if (var0 >= 204 && var0 <= 207) { // L: 73
				return 'I';
			}

			if (var0 == 209 && var1 != Language.Language_ES) { // L: 74
				return 'N';
			}

			if (var0 >= 210 && var0 <= 214) { // L: 75
				return 'O';
			}

			if (var0 >= 217 && var0 <= 220) { // L: 76
				return 'U';
			}

			if (var0 == 221) { // L: 77
				return 'Y';
			}

			if (var0 == 223) { // L: 78
				return 's';
			}

			if (var0 >= 224 && var0 <= 230) { // L: 79
				return 'a';
			}

			if (var0 == 231) { // L: 80
				return 'c';
			}

			if (var0 >= 232 && var0 <= 235) { // L: 81
				return 'e';
			}

			if (var0 >= 236 && var0 <= 239) { // L: 82
				return 'i';
			}

			if (var0 == 241 && var1 != Language.Language_ES) { // L: 83
				return 'n';
			}

			if (var0 >= 242 && var0 <= 246) { // L: 84
				return 'o';
			}

			if (var0 >= 249 && var0 <= 252) { // L: 85
				return 'u';
			}

			if (var0 == 253 || var0 == 255) { // L: 86
				return 'y';
			}
		}

		if (var0 == 338) { // L: 88
			return 'O';
		} else if (var0 == 339) { // L: 89
			return 'o';
		} else if (var0 == 376) { // L: 90
			return 'Y';
		} else {
			return var0; // L: 91
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-2191"
	)
	protected static final int method3482() {
		return GameEngine.field228.method354(); // L: 169
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILbm;ZI)I",
		garbageValue = "-601866686"
	)
	static int method3481(int var0, Script var1, boolean var2) {
		return 2; // L: 4902
	}
}
