import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rt")
public class class463 implements class461 {
	@ObfuscatedName("au")
	final Map field4779;

	public class463(Map var1) {
		this.field4779 = var1; // L: 11
	} // L: 12

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Lre;",
		garbageValue = "1843960357"
	)
	public class460 vmethod8346() {
		return null; // L: 16
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-2012768243"
	)
	public byte[] vmethod8344() throws UnsupportedEncodingException {
		return this.method8343().getBytes("UTF-8"); // L: 21
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-920677238"
	)
	public String method8343() throws UnsupportedEncodingException {
		StringBuilder var1 = new StringBuilder(); // L: 25
		Iterator var2 = this.field4779.entrySet().iterator(); // L: 26

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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "67"
	)
	static void method8342() {
		PcmPlayer.method838(24); // L: 1929
		class318.setLoginResponseString("", "You were disconnected from the server.", ""); // L: 1930
	} // L: 1931
}
