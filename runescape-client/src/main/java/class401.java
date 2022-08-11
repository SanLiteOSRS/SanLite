import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ov")
public class class401 implements class399 {
	@ObfuscatedName("q")
	final Map field4452;

	public class401(Map var1) {
		this.field4452 = var1; // L: 11
	} // L: 12

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "-59"
	)
	public byte[] vmethod7142() throws UnsupportedEncodingException {
		return this.method7141().getBytes("UTF-8"); // L: 16
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1945880427"
	)
	public String method7141() throws UnsupportedEncodingException {
		StringBuilder var1 = new StringBuilder(); // L: 20
		Iterator var2 = this.field4452.entrySet().iterator(); // L: 21

		while (var2.hasNext()) {
			Entry var3 = (Entry)var2.next(); // L: 22
			String var4 = URLEncoder.encode((String)var3.getKey(), "UTF-8"); // L: 24
			String var5 = URLEncoder.encode((String)var3.getValue(), "UTF-8"); // L: 25
			var1.append(var4).append("=").append(var5).append("&"); // L: 26
		}

		if (var1.length() == 0) { // L: 29
			return "";
		} else {
			var1.deleteCharAt(var1.length() - 1); // L: 30
			var1.insert(0, "?"); // L: 31
			return var1.toString(); // L: 32
		}
	}
}
