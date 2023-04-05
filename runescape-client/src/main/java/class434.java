import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qm")
public class class434 implements class432 {
	@ObfuscatedName("aj")
	final Map field4645;

	public class434(Map var1) {
		this.field4645 = var1; // L: 11
	} // L: 12

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Lqn;",
		garbageValue = "1"
	)
	public class431 vmethod7993() {
		return null; // L: 16
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "66"
	)
	public byte[] vmethod7994() throws UnsupportedEncodingException {
		return this.method7995().getBytes("UTF-8"); // L: 21
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "421465179"
	)
	public String method7995() throws UnsupportedEncodingException {
		StringBuilder var1 = new StringBuilder(); // L: 25
		Iterator var2 = this.field4645.entrySet().iterator(); // L: 26

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
