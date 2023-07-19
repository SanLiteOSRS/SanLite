import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rn")
public class class463 implements class461 {
	@ObfuscatedName("ai")
	final Map field4776;

	public class463(Map var1) {
		this.field4776 = var1; // L: 11
	} // L: 12

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Lra;",
		garbageValue = "1996622656"
	)
	public class460 vmethod8369() {
		return null; // L: 16
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "10"
	)
	public byte[] vmethod8370() throws UnsupportedEncodingException {
		return this.method8371().getBytes("UTF-8"); // L: 21
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "256"
	)
	public String method8371() throws UnsupportedEncodingException {
		StringBuilder var1 = new StringBuilder(); // L: 25
		Iterator var2 = this.field4776.entrySet().iterator(); // L: 26

		while (var2.hasNext()) {
			Entry var3 = (Entry)var2.next(); // L: 27
			String var4 = URLEncoder.encode((String)var3.getKey(), "UTF-8"); // L: 29
			String var5 = URLEncoder.encode((String)var3.getValue(), "UTF-8"); // L: 30
			var1.append(var4).append("=").append(var5).append("&"); // L: 31
		}

		if (var1.length() == 0) { // L: 34
			return "";
		} else {
			var1.deleteCharAt(var1.length() - 1); // L: 35
			var1.insert(0, "?"); // L: 36
			return var1.toString(); // L: 37
		}
	}
}
