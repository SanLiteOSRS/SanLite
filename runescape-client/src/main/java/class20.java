import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aw")
public class class20 {
	@ObfuscatedName("tk")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	@Export("friendsChatManager")
	static FriendsChatManager friendsChatManager;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -303905233
	)
	final int field101;
	@ObfuscatedName("ah")
	final Map field97;
	@ObfuscatedName("ar")
	final String field99;

	class20(String var1) {
		this.field101 = 400; // L: 35
		this.field97 = null; // L: 36
		this.field99 = ""; // L: 37
	} // L: 38

	class20(HttpURLConnection var1) throws IOException {
		this.field101 = var1.getResponseCode(); // L: 17
		var1.getResponseMessage(); // L: 18
		this.field97 = var1.getHeaderFields(); // L: 19
		StringBuilder var2 = new StringBuilder(); // L: 20
		InputStream var3 = this.field101 >= 300 ? var1.getErrorStream() : var1.getInputStream(); // L: 21
		if (var3 != null) { // L: 22
			InputStreamReader var4 = new InputStreamReader(var3); // L: 23
			BufferedReader var5 = new BufferedReader(var4); // L: 24

			String var6;
			while ((var6 = var5.readLine()) != null) { // L: 26
				var2.append(var6); // L: 27
			}

			var3.close(); // L: 29
		}

		this.field99 = var2.toString(); // L: 31
	} // L: 32

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "3"
	)
	public int method297() {
		return this.field101; // L: 41
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Map;",
		garbageValue = "1360391754"
	)
	public Map method301() {
		return this.field97; // L: 45
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-541639855"
	)
	public String method299() {
		return this.field99; // L: 49
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "564353501"
	)
	public static String method303(String var0) {
		int var1 = var0.length(); // L: 159
		char[] var2 = new char[var1]; // L: 160
		byte var3 = 2; // L: 161

		for (int var4 = 0; var4 < var1; ++var4) { // L: 162
			char var5 = var0.charAt(var4); // L: 163
			if (var3 == 0) { // L: 164
				var5 = Character.toLowerCase(var5);
			} else if (var3 == 2 || Character.isUpperCase(var5)) { // L: 165
				char var6;
				if (var5 != 181 && var5 != 402) { // L: 168
					var6 = Character.toTitleCase(var5); // L: 172
				} else {
					var6 = var5; // L: 169
				}

				var5 = var6; // L: 174
			}

			if (Character.isLetter(var5)) { // L: 176
				var3 = 0;
			} else if (var5 != '.' && var5 != '?' && var5 != '!') { // L: 177
				if (Character.isSpaceChar(var5)) { // L: 178
					if (var3 != 2) { // L: 179
						var3 = 1;
					}
				} else {
					var3 = 1; // L: 181
				}
			} else {
				var3 = 2;
			}

			var2[var4] = var5; // L: 182
		}

		return new String(var2); // L: 184
	}
}
