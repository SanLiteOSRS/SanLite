import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.cert.Certificate;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.TlsClientProtocol;

@ObfuscatedName("p")
class class12 extends SSLSocket {
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -13790963
	)
	static int field66;
	@ObfuscatedName("a")
	Certificate[] field67;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lu;"
	)
	final class15 this$0;
	// $FF: synthetic field
	final TlsClientProtocol val$tlsClientProtocol;
	// $FF: synthetic field
	final String val$host;

	@ObfuscatedSignature(
		descriptor = "(Lu;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;Ljava/lang/String;)V"
	)
	class12(class15 var1, TlsClientProtocol var2, String var3) {
		this.this$0 = var1; // L: 91
		this.val$tlsClientProtocol = var2;
		this.val$host = var3;
	}

	public InputStream getInputStream() throws IOException {
		return this.val$tlsClientProtocol.getInputStream(); // L: 96
	}

	public OutputStream getOutputStream() throws IOException {
		return this.val$tlsClientProtocol.getOutputStream(); // L: 101
	}

	public synchronized void close() throws IOException {
		this.val$tlsClientProtocol.close(); // L: 106
	} // L: 107

	public void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
	} // L: 110

	public boolean getEnableSessionCreation() {
		return false; // L: 114
	}

	public void setEnabledProtocols(String[] var1) {
	} // L: 272

	public boolean getNeedClientAuth() {
		return false; // L: 129
	}

	public SSLSession getSession() {
		return new class17(this); // L: 134
	}

	public String[] getSupportedCipherSuites() {
		return null; // L: 249
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

	public void setNeedClientAuth(boolean var1) {
	} // L: 275

	public void setUseClientMode(boolean var1) {
	} // L: 278

	public void setWantClientAuth(boolean var1) {
	} // L: 281

	public String[] getEnabledCipherSuites() {
		return null; // L: 119
	}

	public void setEnabledCipherSuites(String[] var1) {
	} // L: 269

	public String[] getEnabledProtocols() {
		return null; // L: 124
	}

	public String[] getSupportedProtocols() {
		return null; // L: 244
	}

	public void startHandshake() throws IOException {
		this.val$tlsClientProtocol.connect(new class13(this)); // L: 285
	} // L: 335

	@ObfuscatedName("mm")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "1"
	)
	static void method164(boolean var0) {
		Client.field719 = var0; // L: 12818
	} // L: 12819
}
