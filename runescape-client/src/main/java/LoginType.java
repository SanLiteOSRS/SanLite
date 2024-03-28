import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tr")
@Implements("LoginType")
public class LoginType {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ltr;"
	)
	@Export("oldscape")
	public static final LoginType oldscape;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ltr;"
	)
	static final LoginType field5111;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ltr;"
	)
	static final LoginType field5112;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ltr;"
	)
	static final LoginType field5113;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ltr;"
	)
	static final LoginType field5119;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ltr;"
	)
	static final LoginType field5115;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ltr;"
	)
	static final LoginType field5121;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ltr;"
	)
	static final LoginType field5117;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Ltr;"
	)
	public static final LoginType field5118;
	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("scene")
	static Scene scene;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1389160821
	)
	public final int field5114;
	@ObfuscatedName("as")
	final String field5120;

	static {
		oldscape = new LoginType(7, 0, "", ""); // L: 5
		field5111 = new LoginType(6, 1, "", ""); // L: 6
		field5112 = new LoginType(0, 2, "", ""); // L: 7
		field5113 = new LoginType(3, 3, "", ""); // L: 8
		field5119 = new LoginType(5, 4, "", ""); // L: 9
		field5115 = new LoginType(4, 5, "", ""); // L: 10
		field5121 = new LoginType(8, 6, "", ""); // L: 11
		field5117 = new LoginType(2, 7, "", ""); // L: 12
		field5118 = new LoginType(1, -1, "", "", true, new LoginType[]{oldscape, field5111, field5112, field5119, field5113}); // L: 13
	}

	LoginType(int var1, int var2, String var3, String var4) {
		this.field5114 = var1; // L: 18
		this.field5120 = var4; // L: 19
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Ltr;)V"
	)
	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		this.field5114 = var1;
		this.field5120 = var4; // L: 24
	} // L: 25

	public String toString() {
		return this.field5120; // L: 29
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(CI)C",
		garbageValue = "649028774"
	)
	public static char method8998(char var0) {
		switch(var0) { // L: 20
		case ' ':
		case '-':
		case '_':
		case ' ':
			return '_'; // L: 65
		case '#':
		case '[':
		case ']':
			return var0; // L: 78
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
			return 'a'; // L: 89
		case 'Ç':
		case 'ç':
			return 'c'; // L: 47
		case 'È':
		case 'É':
		case 'Ê':
		case 'Ë':
		case 'è':
		case 'é':
		case 'ê':
		case 'ë':
			return 'e'; // L: 74
		case 'Í':
		case 'Î':
		case 'Ï':
		case 'í':
		case 'î':
		case 'ï':
			return 'i'; // L: 33
		case 'Ñ':
		case 'ñ':
			return 'n'; // L: 23
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
			return 'o'; // L: 58
		case 'Ù':
		case 'Ú':
		case 'Û':
		case 'Ü':
		case 'ù':
		case 'ú':
		case 'û':
		case 'ü':
			return 'u'; // L: 42
		case 'ß':
			return 'b'; // L: 44
		case 'ÿ':
		case 'Ÿ':
			return 'y'; // L: 26
		default:
			return Character.toLowerCase(var0); // L: 60
		}
	}
}
