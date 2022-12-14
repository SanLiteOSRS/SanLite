import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pn")
public class class423 implements class421 {
	@ObfuscatedName("e")
	final Map field4660;

	public class423(Map var1) {
		this.field4660 = var1; // L: 11
	} // L: 12

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "0"
	)
	public byte[] vmethod7924() throws UnsupportedEncodingException {
		return this.method7925().getBytes("UTF-8"); // L: 16
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1995090155"
	)
	public String method7925() throws UnsupportedEncodingException {
		StringBuilder var1 = new StringBuilder(); // L: 20
		Iterator var2 = this.field4660.entrySet().iterator(); // L: 21

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
