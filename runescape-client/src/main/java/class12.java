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

@ObfuscatedName("ax")
class class12 extends SSLSocket {
	@ObfuscatedName("an")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;
	@ObfuscatedName("af")
	Certificate[] field61;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lah;"
	)
	final class15 this$0;
	// $FF: synthetic field
	final TlsClientProtocol val$tlsClientProtocol;
	// $FF: synthetic field
	final String val$host;

	@ObfuscatedSignature(
		descriptor = "(Lah;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;Ljava/lang/String;)V"
	)
	class12(class15 var1, TlsClientProtocol var2, String var3) {
		this.this$0 = var1; // L: 91
		this.val$tlsClientProtocol = var2;
		this.val$host = var3;
	}

	public InputStream getInputStream() throws IOException {
		return this.val$tlsClientProtocol.getInputStream(); // L: 96
	}

	public synchronized void close() throws IOException {
		this.val$tlsClientProtocol.close(); // L: 106
	} // L: 107

	public void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
	}

	public String[] getEnabledCipherSuites() {
		return null; // L: 119
	}

	public String[] getEnabledProtocols() {
		return null; // L: 124
	}

	public boolean getNeedClientAuth() {
		return false; // L: 129
	}

	public boolean getUseClientMode() {
		return false; // L: 254
	}

	public boolean getWantClientAuth() {
		return false; // L: 259
	}

	public void removeHandshakeCompletedListener(HandshakeCompletedListener var1) {
	} // L: 263

	public void setEnableSessionCreation(boolean var1) {
	} // L: 266

	public void setEnabledCipherSuites(String[] var1) {
	} // L: 269

	public void setEnabledProtocols(String[] var1) {
	} // L: 272

	public void setNeedClientAuth(boolean var1) {
	} // L: 275

	public void startHandshake() throws IOException {
		this.val$tlsClientProtocol.connect(new class13(this)); // L: 285
	} // L: 335

	public void setWantClientAuth(boolean var1) {
	} // L: 281

	public boolean getEnableSessionCreation() {
		return false; // L: 114
	}

	public void setUseClientMode(boolean var1) {
	} // L: 278

	public SSLSession getSession() {
		return new class17(this); // L: 134
	}

	public String[] getSupportedCipherSuites() {
		return null; // L: 249
	}

	public OutputStream getOutputStream() throws IOException {
		return this.val$tlsClientProtocol.getOutputStream(); // L: 101
	}

	public String[] getSupportedProtocols() {
		return null; // L: 244
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1139847057"
	)
	static int method164() {
		return Rasterizer3D.field2514.field2793; // L: 110
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "120"
	)
	@Export("runWidgetOnLoadListener")
	static void runWidgetOnLoadListener(int var0) {
		if (var0 != -1) { // L: 5236
			if (SoundSystem.loadInterface(var0)) { // L: 5237
				Widget[] var1 = VerticalAlignment.Widget_interfaceComponents[var0]; // L: 5238

				for (int var2 = 0; var2 < var1.length; ++var2) { // L: 5239
					Widget var3 = var1[var2]; // L: 5240
					if (var3.onLoad != null) { // L: 5241
						ScriptEvent var4 = new ScriptEvent(); // L: 5242
						var4.widget = var3; // L: 5243
						var4.args = var3.onLoad; // L: 5244
						PlayerType.runScript(var4, 5000000, 0); // L: 5245
					}
				}

			}
		}
	} // L: 5248
}
