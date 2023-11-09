import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("as")
public class class20 {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1053019723
	)
	final int field104;
	@ObfuscatedName("ae")
	final Map field102;
	@ObfuscatedName("ao")
	final String field103;

	class20(String var1) {
		this.field104 = 400; // L: 35
		this.field102 = null; // L: 36
		this.field103 = ""; // L: 37
	} // L: 38

	class20(HttpURLConnection var1) throws IOException {
		this.field104 = var1.getResponseCode(); // L: 17
		var1.getResponseMessage(); // L: 18
		this.field102 = var1.getHeaderFields(); // L: 19
		StringBuilder var2 = new StringBuilder(); // L: 20
		InputStream var3 = this.field104 >= 300 ? var1.getErrorStream() : var1.getInputStream(); // L: 21
		if (var3 != null) { // L: 22
			InputStreamReader var4 = new InputStreamReader(var3); // L: 23
			BufferedReader var5 = new BufferedReader(var4); // L: 24

			String var6;
			while ((var6 = var5.readLine()) != null) { // L: 26
				var2.append(var6); // L: 27
			}

			var3.close(); // L: 29
		}

		this.field103 = var2.toString(); // L: 31
	} // L: 32

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "20873"
	)
	public int method296() {
		return this.field104;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/Map;",
		garbageValue = "105"
	)
	public Map method298() {
		return this.field102; // L: 45
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1529858789"
	)
	public String method299() {
		return this.field103; // L: 49
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	public static void method301(int var0) {
		MouseHandler.MouseHandler_idleCycles = var0; // L: 41
	} // L: 42

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lto;B)I",
		garbageValue = "103"
	)
	static int method305(PacketBuffer var0) {
		int var1 = var0.readBits(2); // L: 180
		int var2;
		if (var1 == 0) { // L: 182
			var2 = 0;
		} else if (var1 == 1) { // L: 183
			var2 = var0.readBits(5);
		} else if (var1 == 2) { // L: 184
			var2 = var0.readBits(8);
		} else {
			var2 = var0.readBits(11); // L: 185
		}

		return var2; // L: 186
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lnu;Ljava/lang/String;Ljava/lang/String;I)[Lui;",
		garbageValue = "-1440236039"
	)
	public static SpritePixels[] method303(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) { // L: 65
			return null;
		} else {
			int var3 = var0.getGroupId(var1); // L: 66
			int var4 = var0.getFileId(var3, var2); // L: 67
			return WorldMapArchiveLoader.method8495(var0, var3, var4); // L: 68
		}
	}

	@ObfuscatedName("ms")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-911724199"
	)
	static final void method304(int var0) {
		var0 = Math.max(Math.min(var0, 100), 0); // L: 12211
		var0 = 100 - var0; // L: 12212
		float var1 = 0.5F + (float)var0 / 200.0F; // L: 12213
		HealthBarUpdate.method2410((double)var1); // L: 12214
	} // L: 12215
}
