import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ag")
public class class10 {
	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	@Export("scene")
	static Scene scene;
	@ObfuscatedName("qq")
	@ObfuscatedGetter(
		intValue = 91869067
	)
	static int field48;
	@ObfuscatedName("ac")
	final HttpsURLConnection field54;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lqv;"
	)
	final class434 field50;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lav;"
	)
	final class9 field47;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lsd;"
	)
	class476 field46;
	@ObfuscatedName("ao")
	boolean field49;
	@ObfuscatedName("ah")
	boolean field45;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 188434511
	)
	int field51;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Lav;Lqv;Z)V"
	)
	public class10(URL var1, class9 var2, class434 var3, boolean var4) throws IOException {
		this.field49 = false; // L: 17
		this.field45 = false; // L: 18
		this.field51 = 300000; // L: 19
		if (!var2.method69()) { // L: 26
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.method70()); // L: 27
		} else {
			this.field54 = (HttpsURLConnection)var1.openConnection(); // L: 29
			if (!var4) { // L: 30
				HttpsURLConnection var5 = this.field54; // L: 31
				if (class15.field82 == null) { // L: 34
					class15.field82 = new class15(); // L: 35
				}

				class15 var6 = class15.field82; // L: 37
				var5.setSSLSocketFactory(var6); // L: 39
			}

			this.field47 = var2; // L: 41
			this.field50 = var3 != null ? var3 : new class434(); // L: 42
		}
	} // L: 43

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Lav;Z)V"
	)
	public class10(URL var1, class9 var2, boolean var3) throws IOException {
		this(var1, var2, new class434(), var3); // L: 22
	} // L: 23

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Lqv;",
		garbageValue = "1852518909"
	)
	public class434 method102() {
		return this.field50; // L: 46
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lsd;I)V",
		garbageValue = "-1455589333"
	)
	public void method86(class476 var1) {
		if (!this.field49) { // L: 50
			if (var1 == null) { // L: 51
				this.field50.method7864("Content-Type"); // L: 52
				this.field46 = null; // L: 53
			} else {
				this.field46 = var1; // L: 56
				if (this.field46.vmethod8518() != null) { // L: 57
					this.field50.method7868(this.field46.vmethod8518()); // L: 58
				} else {
					this.field50.method7869(); // L: 61
				}

			}
		}
	} // L: 54 63

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "937101739"
	)
	void method87() throws ProtocolException {
		if (!this.field49) { // L: 66
			this.field54.setRequestMethod(this.field47.method70()); // L: 67
			this.field50.method7861(this.field54); // L: 68
			if (this.field47.method68() && this.field46 != null) { // L: 69
				this.field54.setDoOutput(true); // L: 70
				ByteArrayOutputStream var1 = new ByteArrayOutputStream(); // L: 71

				try {
					var1.write(this.field46.vmethod8509()); // L: 73
					var1.writeTo(this.field54.getOutputStream()); // L: 74
				} catch (IOException var11) { // L: 76
					var11.printStackTrace(); // L: 77
				} finally {
					try {
						var1.close(); // L: 81
					} catch (IOException var10) { // L: 83
						var10.printStackTrace(); // L: 84
					}

				}
			}

			this.field54.setConnectTimeout(this.field51); // L: 88
			this.field54.setInstanceFollowRedirects(this.field45); // L: 89
			this.field49 = true; // L: 90
		}
	} // L: 91

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2097496739"
	)
	boolean method88() throws IOException {
		if (!this.field49) { // L: 94
			this.method87();
		}

		this.field54.connect(); // L: 95
		return this.field54.getResponseCode() == -1; // L: 96
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Law;",
		garbageValue = "1182023619"
	)
	class20 method89() {
		try {
			if (!this.field49 || this.field54.getResponseCode() == -1) { // L: 101
				return new class20("No REST response has been received yet.");
			}
		} catch (IOException var10) { // L: 103
			this.field54.disconnect(); // L: 104
			return new class20("Error decoding REST response code: " + var10.getMessage()); // L: 105
		}

		class20 var3;
		try {
			class20 var1 = new class20(this.field54); // L: 109
			return var1; // L: 117
		} catch (IOException var8) { // L: 111
			var3 = new class20("Error decoding REST response: " + var8.getMessage());
		} finally {
			this.field54.disconnect(); // L: 115
		}

		return var3; // L: 112
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "-1751398414"
	)
	static final int method83(int var0, int var1, int var2, int var3) {
		return var0 * var2 + var3 * var1 >> 16; // L: 21
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "([FI)V",
		garbageValue = "-1762235426"
	)
	static void method104(float[] var0) {
		if (class128.field1501 + var0[0] < 1.3333334F) { // L: 321
			float var1 = var0[0] - 2.0F; // L: 322
			float var2 = var0[0] - 1.0F; // L: 323
			float var3 = (float)Math.sqrt((double)(var1 * var1 - var2 * var2 * 4.0F)); // L: 324
			float var4 = (var3 + -var1) * 0.5F; // L: 325
			if (var0[1] + class128.field1501 > var4) { // L: 326
				var0[1] = var4 - class128.field1501; // L: 327
			} else {
				var4 = (-var1 - var3) * 0.5F; // L: 330
				if (var0[1] < class128.field1501 + var4) { // L: 331
					var0[1] = var4 + class128.field1501; // L: 332
				}
			}
		} else {
			var0[0] = 1.3333334F - class128.field1501; // L: 337
			var0[1] = 0.33333334F - class128.field1501; // L: 338
		}

	} // L: 340
}
