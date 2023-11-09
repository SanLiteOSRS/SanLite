import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.cert.Certificate;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.TlsClientProtocol;

@ObfuscatedName("i")
class class12 extends SSLSocket {
	@ObfuscatedName("h")
	Certificate[] field69;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lk;"
	)
	final class15 this$0;
	// $FF: synthetic field
	final TlsClientProtocol val$tlsClientProtocol;
	// $FF: synthetic field
	final String val$host;

	@ObfuscatedSignature(
		descriptor = "(Lk;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;Ljava/lang/String;)V"
	)
	class12(class15 var1, TlsClientProtocol var2, String var3) {
		this.this$0 = var1; // L: 91
		this.val$tlsClientProtocol = var2;
		this.val$host = var3;
	}

	public void setUseClientMode(boolean var1) {
	} // L: 278

	public InputStream getInputStream() throws IOException {
		return this.val$tlsClientProtocol.getInputStream(); // L: 96
	}

	public OutputStream getOutputStream() throws IOException {
		return this.val$tlsClientProtocol.getOutputStream(); // L: 101
	}

	public synchronized void close() throws IOException {
		this.val$tlsClientProtocol.close(); // L: 106
	} // L: 107

	public boolean getEnableSessionCreation() {
		return false; // L: 114
	}

	public boolean getWantClientAuth() {
		return false; // L: 259
	}

	public String[] getEnabledProtocols() {
		return null; // L: 124
	}

	public SSLSession getSession() {
		return new class17(this); // L: 134
	}

	public String[] getSupportedProtocols() {
		return null; // L: 244
	}

	public String[] getSupportedCipherSuites() {
		return null; // L: 249
	}

	public boolean getUseClientMode() {
		return false; // L: 254
	}

	public void setEnableSessionCreation(boolean var1) {
	} // L: 266

	public void setEnabledCipherSuites(String[] var1) {
	} // L: 269

	public void startHandshake() throws IOException {
		this.val$tlsClientProtocol.connect(new class13(this)); // L: 285
	} // L: 335

	public void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
	} // L: 110

	public void setWantClientAuth(boolean var1) {
	} // L: 281

	public boolean getNeedClientAuth() {
		return false; // L: 129
	}

	public String[] getEnabledCipherSuites() {
		return null; // L: 119
	}

	public void setEnabledProtocols(String[] var1) {
	} // L: 272

	public void setNeedClientAuth(boolean var1) {
	} // L: 275

	public void removeHandshakeCompletedListener(HandshakeCompletedListener var1) {
	} // L: 263

	@ObfuscatedName("h")
	public static final void method157(long var0) {
		if (var0 > 0L) { // L: 9
			if (var0 % 10L == 0L) { // L: 10
				StructComposition.method3820(var0 - 1L); // L: 11
				StructComposition.method3820(1L); // L: 12
			} else {
				StructComposition.method3820(var0); // L: 14
			}

		}
	} // L: 15

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)Z",
		garbageValue = "-56"
	)
	static boolean method115(String var0, int var1) {
		return HealthBarUpdate.method2363(var0, var1, "openjs"); // L: 50
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "90"
	)
	@Export("itemContainerSetItem")
	static void itemContainerSetItem(int var0, int var1, int var2, int var3) {
		ItemContainer var4 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 39
		if (var4 == null) { // L: 40
			var4 = new ItemContainer(); // L: 41
			ItemContainer.itemContainers.put(var4, (long)var0); // L: 42
		}

		if (var4.ids.length <= var1) { // L: 44
			int[] var5 = new int[var1 + 1]; // L: 45
			int[] var6 = new int[var1 + 1]; // L: 46

			int var7;
			for (var7 = 0; var7 < var4.ids.length; ++var7) { // L: 47
				var5[var7] = var4.ids[var7]; // L: 48
				var6[var7] = var4.quantities[var7]; // L: 49
			}

			for (var7 = var4.ids.length; var7 < var1; ++var7) { // L: 51
				var5[var7] = -1; // L: 52
				var6[var7] = 0; // L: 53
			}

			var4.ids = var5; // L: 55
			var4.quantities = var6; // L: 56
		}

		var4.ids[var1] = var2; // L: 58
		var4.quantities[var1] = var3; // L: 59
	} // L: 60

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "760477426"
	)
	static void method155(int var0) {
		if (var0 != Login.loginIndex) { // L: 2376
			Login.loginIndex = var0; // L: 2377
		}
	} // L: 2378
}
