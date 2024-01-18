import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sz")
public class class479 implements class477 {
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 129743027
	)
	static int field4854;
	@ObfuscatedName("am")
	final Map field4855;

	public class479(Map var1) {
		this.field4855 = var1; // L: 11
	} // L: 12

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Lsy;",
		garbageValue = "2086749416"
	)
	public class476 vmethod8709() {
		return null; // L: 16
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "529214667"
	)
	public byte[] vmethod8715() throws UnsupportedEncodingException {
		return this.method8716().getBytes("UTF-8"); // L: 21
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1426539146"
	)
	public String method8716() throws UnsupportedEncodingException {
		StringBuilder var1 = new StringBuilder(); // L: 25
		Iterator var2 = this.field4855.entrySet().iterator(); // L: 26

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
