import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qa")
public class class438 implements class436 {
	@ObfuscatedName("af")
	final Map field4712;

	public class438(Map var1) {
		this.field4712 = var1; // L: 11
	} // L: 12

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Lqz;",
		garbageValue = "-1368831969"
	)
	public class435 vmethod8346() {
		return null; // L: 16
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "888549065"
	)
	public byte[] vmethod8347() throws UnsupportedEncodingException {
		return this.method8348().getBytes("UTF-8"); // L: 21
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-759167743"
	)
	public String method8348() throws UnsupportedEncodingException {
		StringBuilder var1 = new StringBuilder(); // L: 25
		Iterator var2 = this.field4712.entrySet().iterator(); // L: 26

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
