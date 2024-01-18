import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hr")
public class class185 extends DualNode {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static EvictingDualNodeHashTable field1930;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	static Widget field1932;

	static {
		field1930 = new EvictingDualNodeHashTable(64); // L: 7
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "292894640"
	)
	static long method3710() {
		try {
			URL var0 = new URL(MouseRecorder.method2371("services", false) + "m=accountappeal/login.ws"); // L: 36
			URLConnection var1 = var0.openConnection(); // L: 37
			var1.setRequestProperty("connection", "close"); // L: 38
			var1.setDoInput(true); // L: 39
			var1.setDoOutput(true); // L: 40
			var1.setConnectTimeout(5000); // L: 41
			OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream()); // L: 42
			var2.write("data1=req"); // L: 43
			var2.flush(); // L: 44
			InputStream var3 = var1.getInputStream(); // L: 45
			Buffer var4 = new Buffer(new byte[1000]); // L: 46

			do {
				int var5 = var3.read(var4.array, var4.offset, 1000 - var4.offset); // L: 48
				if (var5 == -1) { // L: 49
					var4.offset = 0; // L: 55
					long var7 = var4.readLong(); // L: 56
					return var7; // L: 57
				}

				var4.offset += var5; // L: 50
			} while(var4.offset < 1000); // L: 51

			return 0L; // L: 52
		} catch (Exception var9) { // L: 59
			return 0L; // L: 60
		}
	}
}
