import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.DefaultTlsClient;
import org.bouncycastle.crypto.tls.TlsAuthentication;

@ObfuscatedName("af")
class class13 extends DefaultTlsClient {
	@ObfuscatedName("ih")
	static int[] field63;
	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "[Lvd;"
	)
	static SpritePixels[] field61;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Laj;"
	)
	final class12 this$1;

	@ObfuscatedSignature(
		descriptor = "(Laj;)V"
	)
	class13(class12 var1) {
		this.this$1 = var1; // L: 292
	}

	public Hashtable getClientExtensions() throws IOException {
		Hashtable var1 = super.getClientExtensions(); // L: 295
		if (var1 == null) { // L: 296
			var1 = new Hashtable(); // L: 297
		}

		byte[] var2 = this.this$1.val$host.getBytes(); // L: 299
		ByteArrayOutputStream var3 = new ByteArrayOutputStream(); // L: 300
		DataOutputStream var4 = new DataOutputStream(var3); // L: 301
		var4.writeShort(var2.length + 3); // L: 302
		var4.writeByte(0); // L: 303
		var4.writeShort(var2.length); // L: 304
		var4.write(var2); // L: 305
		var4.close(); // L: 306
		var1.put(0, var3.toByteArray()); // L: 307
		return var1; // L: 308
	}

	public TlsAuthentication getAuthentication() throws IOException {
		return new class11(this); // L: 313
	}

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lng;B)Ljava/lang/String;",
		garbageValue = "52"
	)
	static String method155(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) { // L: 11111
			for (int var2 = 1; var2 <= 5; ++var2) { // L: 11112
				while (true) {
					int var3 = var0.indexOf("%" + var2); // L: 11114
					if (var3 == -1) { // L: 11115
						break;
					}

					String var4 = var0.substring(0, var3); // L: 11116
					int var6 = Client.method1763(var1, var2 - 1); // L: 11118
					String var5;
					if (var6 < 999999999) { // L: 11120
						var5 = Integer.toString(var6); // L: 11121
					} else {
						var5 = "*"; // L: 11124
					}

					var0 = var4 + var5 + var0.substring(var3 + 2); // L: 11126
				}
			}
		}

		return var0; // L: 11130
	}
}
