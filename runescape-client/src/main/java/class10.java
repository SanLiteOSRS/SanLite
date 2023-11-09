import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ad")
public class class10 {
	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	static Archive field46;
	@ObfuscatedName("au")
	final HttpsURLConnection field51;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lqf;"
	)
	final class419 field47;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Laf;"
	)
	final class9 field53;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lrf;"
	)
	class461 field49;
	@ObfuscatedName("ac")
	boolean field50;
	@ObfuscatedName("ai")
	boolean field48;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1934831509
	)
	int field52;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Laf;Lqf;Z)V"
	)
	public class10(URL var1, class9 var2, class419 var3, boolean var4) throws IOException {
		this.field50 = false; // L: 17
		this.field48 = false; // L: 18
		this.field52 = 300000; // L: 19
		if (!var2.method65()) { // L: 26
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.method62()); // L: 27
		} else {
			this.field51 = (HttpsURLConnection)var1.openConnection(); // L: 29
			if (!var4) { // L: 30
				this.field51.setSSLSocketFactory(class15.method179()); // L: 31
			}

			this.field53 = var2; // L: 33
			this.field47 = var3 != null ? var3 : new class419(); // L: 34
		}
	} // L: 35

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Laf;Z)V"
	)
	public class10(URL var1, class9 var2, boolean var3) throws IOException {
		this(var1, var2, new class419(), var3); // L: 22
	} // L: 23

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Lqf;",
		garbageValue = "106"
	)
	public class419 method85() {
		return this.field47; // L: 38
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lrf;B)V",
		garbageValue = "2"
	)
	public void method78(class461 var1) {
		if (!this.field50) { // L: 42
			if (var1 == null) { // L: 43
				this.field47.method7752("Content-Type"); // L: 44
				this.field49 = null; // L: 45
			} else {
				this.field49 = var1; // L: 48
				if (this.field49.vmethod8346() != null) { // L: 49
					this.field47.method7726(this.field49.vmethod8346()); // L: 50
				} else {
					this.field47.method7723(); // L: 53
				}

			}
		}
	} // L: 46 55

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2080187114"
	)
	void method79() throws ProtocolException {
		if (!this.field50) { // L: 58
			this.field51.setRequestMethod(this.field53.method62()); // L: 59
			this.field47.method7715(this.field51); // L: 60
			if (this.field53.method63() && this.field49 != null) { // L: 61
				this.field51.setDoOutput(true); // L: 62
				ByteArrayOutputStream var1 = new ByteArrayOutputStream(); // L: 63

				try {
					var1.write(this.field49.vmethod8344()); // L: 65
					var1.writeTo(this.field51.getOutputStream()); // L: 66
				} catch (IOException var11) { // L: 68
					var11.printStackTrace(); // L: 69
				} finally {
					try {
						var1.close(); // L: 73
					} catch (IOException var10) { // L: 75
						var10.printStackTrace(); // L: 76
					}

				}
			}

			this.field51.setConnectTimeout(this.field52); // L: 80
			this.field51.setInstanceFollowRedirects(this.field48); // L: 81
			this.field50 = true; // L: 82
		}
	} // L: 83

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-170543381"
	)
	boolean method81() throws IOException {
		if (!this.field50) { // L: 86
			this.method79();
		}

		this.field51.connect(); // L: 87
		return this.field51.getResponseCode() == -1; // L: 88
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Las;",
		garbageValue = "-1418069243"
	)
	class20 method80() {
		try {
			if (!this.field50 || this.field51.getResponseCode() == -1) { // L: 93
				return new class20("No REST response has been received yet.");
			}
		} catch (IOException var10) { // L: 95
			this.field51.disconnect(); // L: 96
			return new class20("Error decoding REST response code: " + var10.getMessage()); // L: 97
		}

		class20 var3;
		try {
			class20 var1 = new class20(this.field51); // L: 101
			return var1; // L: 109
		} catch (IOException var8) { // L: 103
			var3 = new class20("Error decoding REST response: " + var8.getMessage());
		} finally {
			this.field51.disconnect(); // L: 107
		}

		return var3; // L: 104
	}
}
