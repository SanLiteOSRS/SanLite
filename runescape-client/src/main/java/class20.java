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

@ObfuscatedName("aq")
public class class20 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Lct;"
	)
	@Export("World_worlds")
	static World[] World_worlds;
	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "[Ltt;"
	)
	@Export("mapMarkerSprites")
	static SpritePixels[] mapMarkerSprites;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1104114741
	)
	final int field87;
	@ObfuscatedName("an")
	final Map field90;
	@ObfuscatedName("ar")
	final String field89;

	class20(String var1) {
		this.field87 = 400; // L: 35
		this.field90 = null; // L: 36
		this.field89 = ""; // L: 37
	} // L: 38

	class20(HttpURLConnection var1) throws IOException {
		this.field87 = var1.getResponseCode(); // L: 17
		var1.getResponseMessage(); // L: 18
		this.field90 = var1.getHeaderFields(); // L: 19
		StringBuilder var2 = new StringBuilder(); // L: 20
		InputStream var3 = this.field87 >= 300 ? var1.getErrorStream() : var1.getInputStream(); // L: 21
		if (var3 != null) { // L: 22
			InputStreamReader var4 = new InputStreamReader(var3); // L: 23
			BufferedReader var5 = new BufferedReader(var4); // L: 24

			String var6;
			while ((var6 = var5.readLine()) != null) { // L: 26
				var2.append(var6); // L: 27
			}

			var3.close(); // L: 29
		}

		this.field89 = var2.toString(); // L: 31
	} // L: 32

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-276230051"
	)
	public int method275() {
		return this.field87; // L: 41
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Map;",
		garbageValue = "-454012305"
	)
	public Map method276() {
		return this.field90; // L: 45
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "121"
	)
	public String method273() {
		return this.field89; // L: 49
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(Lnv;Ljava/lang/String;I)V",
		garbageValue = "491052897"
	)
	static void method284(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1); // L: 1669
		Client.archiveLoaders.add(var2); // L: 1670
		Client.field780 += var2.groupCount; // L: 1671
	} // L: 1672
}
