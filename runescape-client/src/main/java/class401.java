import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oj")
public class class401 implements class399 {
	@ObfuscatedName("h")
	final Map field4440;

	public class401(Map var1) {
		this.field4440 = var1;
	} // L: 12

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "57"
	)
	public byte[] vmethod7057() throws UnsupportedEncodingException {
		return this.method7058().getBytes("UTF-8");
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "8"
	)
	public String method7058() throws UnsupportedEncodingException {
		StringBuilder var1 = new StringBuilder(); // L: 20
		Iterator var2 = this.field4440.entrySet().iterator();

		while (var2.hasNext()) {
			Entry var3 = (Entry)var2.next(); // L: 22
			String var4 = URLEncoder.encode((String)var3.getKey(), "UTF-8");
			String var5 = URLEncoder.encode((String)var3.getValue(), "UTF-8");
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

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;ZI)[B",
		garbageValue = "-906139153"
	)
	public static byte[] method7060(Object var0, boolean var1) {
		if (var0 == null) { // L: 8
			return null;
		} else if (var0 instanceof byte[]) { // L: 9
			byte[] var6 = (byte[])((byte[])var0); // L: 10
			if (var1) { // L: 11
				int var4 = var6.length; // L: 14
				byte[] var5 = new byte[var4]; // L: 15
				System.arraycopy(var6, 0, var5, 0, var4); // L: 16
				return var5; // L: 19
			} else {
				return var6; // L: 21
			}
		} else if (var0 instanceof AbstractByteArrayCopier) { // L: 23
			AbstractByteArrayCopier var2 = (AbstractByteArrayCopier)var0; // L: 24
			return var2.get(); // L: 25
		} else {
			throw new IllegalArgumentException(); // L: 27
		}
	}
}
