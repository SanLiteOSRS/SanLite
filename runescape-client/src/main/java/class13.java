import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.DefaultTlsClient;
import org.bouncycastle.crypto.tls.TlsAuthentication;

@ObfuscatedName("ax")
class class13 extends DefaultTlsClient {
	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("archive11")
	static Archive archive11;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lah;"
	)
	final class12 this$1;

	@ObfuscatedSignature(
		descriptor = "(Lah;)V"
	)
	class13(class12 var1) {
		this.this$1 = var1; // L: 285
	}

	public Hashtable getClientExtensions() throws IOException {
		Hashtable var1 = super.getClientExtensions(); // L: 288
		if (var1 == null) { // L: 289
			var1 = new Hashtable(); // L: 290
		}

		byte[] var2 = this.this$1.val$host.getBytes(); // L: 292
		ByteArrayOutputStream var3 = new ByteArrayOutputStream(); // L: 293
		DataOutputStream var4 = new DataOutputStream(var3); // L: 294
		var4.writeShort(var2.length + 3); // L: 295
		var4.writeByte(0); // L: 296
		var4.writeShort(var2.length); // L: 297
		var4.write(var2); // L: 298
		var4.close(); // L: 299
		var1.put(0, var3.toByteArray()); // L: 300
		return var1; // L: 301
	}

	public TlsAuthentication getAuthentication() throws IOException {
		return new class11(this); // L: 306
	}

	@ObfuscatedName("aw")
	public static final void method180(long var0) {
		if (var0 > 0L) { // L: 9
			if (var0 % 10L == 0L) { // L: 10
				long var2 = var0 - 1L; // L: 11

				try {
					Thread.sleep(var2); // L: 14
				} catch (InterruptedException var8) { // L: 16
				}

				try {
					Thread.sleep(1L); // L: 20
				} catch (InterruptedException var7) { // L: 22
				}
			} else {
				try {
					Thread.sleep(var0); // L: 27
				} catch (InterruptedException var6) { // L: 29
				}
			}

		}
	} // L: 31

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1527587473"
	)
	public static String method173(String var0) {
		StringBuilder var1 = new StringBuilder(var0.length()); // L: 154
		int var2 = 0; // L: 155
		int var3 = -1; // L: 156

		for (int var4 = 0; var4 < var0.length(); ++var4) { // L: 157
			char var5 = var0.charAt(var4); // L: 158
			if (var5 == '<') { // L: 159
				var1.append(var0.substring(var2, var4)); // L: 160
				var3 = var4; // L: 161
			} else if (var5 == '>' && var3 != -1) { // L: 164
				String var6 = var0.substring(var3 + 1, var4); // L: 165
				var3 = -1; // L: 166
				if (var6.equals("lt")) { // L: 167
					var1.append("<"); // L: 168
				} else if (var6.equals("gt")) { // L: 170
					var1.append(">"); // L: 171
				} else if (var6.equals("br")) { // L: 173
					var1.append("\n"); // L: 174
				}

				var2 = var4 + 1; // L: 176
			}
		}

		if (var2 < var0.length()) { // L: 179
			var1.append(var0.substring(var2, var0.length())); // L: 180
		}

		return var1.toString(); // L: 182
	}

	@ObfuscatedName("nn")
	@ObfuscatedSignature(
		descriptor = "(Lmt;I)Ljava/lang/String;",
		garbageValue = "169549382"
	)
	@Export("Widget_getSpellActionName")
	static String Widget_getSpellActionName(Widget var0) {
		if (class273.Widget_unpackTargetMask(UserComparator8.getWidgetFlags(var0)) == 0) { // L: 12740
			return null;
		} else {
			return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null; // L: 12741 12742 12744
		}
	}
}
