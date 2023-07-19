import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rc")
public class class452 {
	@ObfuscatedName("ai")
	float[] field4750;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 198051063
	)
	int field4751;

	class452(float[] var1, int var2) {
		this.field4750 = var1; // L: 10
		this.field4751 = var2; // L: 11
	} // L: 12

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(CI)C",
		garbageValue = "-2032403945"
	)
	static char method8285(char var0) {
		switch(var0) { // L: 103
		case ' ':
		case '-':
		case '_':
		case ' ':
			return '_'; // L: 129
		case '#':
		case '[':
		case ']':
			return var0; // L: 158
		case 'À':
		case 'Á':
		case 'Â':
		case 'Ã':
		case 'Ä':
		case 'à':
		case 'á':
		case 'â':
		case 'ã':
		case 'ä':
			return 'a'; // L: 117
		case 'Ç':
		case 'ç':
			return 'c'; // L: 172
		case 'È':
		case 'É':
		case 'Ê':
		case 'Ë':
		case 'è':
		case 'é':
		case 'ê':
		case 'ë':
			return 'e'; // L: 152
		case 'Í':
		case 'Î':
		case 'Ï':
		case 'í':
		case 'î':
		case 'ï':
			return 'i'; // L: 124
		case 'Ñ':
		case 'ñ':
			return 'n'; // L: 132
		case 'Ò':
		case 'Ó':
		case 'Ô':
		case 'Õ':
		case 'Ö':
		case 'ò':
		case 'ó':
		case 'ô':
		case 'õ':
		case 'ö':
			return 'o'; // L: 143
		case 'Ù':
		case 'Ú':
		case 'Û':
		case 'Ü':
		case 'ù':
		case 'ú':
		case 'û':
		case 'ü':
			return 'u'; // L: 167
		case 'ß':
			return 'b'; // L: 169
		case 'ÿ':
		case 'Ÿ':
			return 'y'; // L: 106
		default:
			return Character.toLowerCase(var0); // L: 154
		}
	}
}
