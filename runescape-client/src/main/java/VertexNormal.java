import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ji")
@Implements("VertexNormal")
public class VertexNormal {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1895811385
	)
	@Export("gameCyclesToDo")
	static int gameCyclesToDo;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1599042677
	)
	@Export("x")
	int x;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -684966753
	)
	@Export("y")
	int y;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 531859923
	)
	@Export("z")
	int z;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1798581129
	)
	@Export("magnitude")
	int magnitude;

	VertexNormal() {
	} // L: 9

	@ObfuscatedSignature(
		descriptor = "(Lji;)V"
	)
	VertexNormal(VertexNormal var1) {
		this.x = var1.x; // L: 12
		this.y = var1.y; // L: 13
		this.z = var1.z; // L: 14
		this.magnitude = var1.magnitude; // L: 15
	} // L: 16

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "0"
	)
	public static String method5102(String var0) {
		int var1 = var0.length(); // L: 161
		char[] var2 = new char[var1]; // L: 162
		byte var3 = 2; // L: 163

		for (int var4 = 0; var4 < var1; ++var4) { // L: 164
			char var5 = var0.charAt(var4); // L: 165
			if (var3 == 0) { // L: 166
				var5 = Character.toLowerCase(var5);
			} else if (var3 == 2 || Character.isUpperCase(var5)) { // L: 167
				var5 = class356.method6844(var5);
			}

			if (Character.isLetter(var5)) { // L: 168
				var3 = 0;
			} else if (var5 != '.' && var5 != '?' && var5 != '!') { // L: 169
				if (Character.isSpaceChar(var5)) { // L: 170
					if (var3 != 2) { // L: 171
						var3 = 1;
					}
				} else {
					var3 = 1; // L: 173
				}
			} else {
				var3 = 2;
			}

			var2[var4] = var5; // L: 174
		}

		return new String(var2); // L: 176
	}
}
