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

@ObfuscatedName("aj")
class class12 extends SSLSocket {
	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "[Ltm;"
	)
	@Export("crossSprites")
	static SpritePixels[] crossSprites;
	@ObfuscatedName("at")
	Certificate[] field59;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lag;"
	)
	final class15 this$0;
	// $FF: synthetic field
	final TlsClientProtocol val$tlsClientProtocol;
	// $FF: synthetic field
	final String val$host;

	@ObfuscatedSignature(
		descriptor = "(Lag;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;Ljava/lang/String;)V"
	)
	class12(class15 var1, TlsClientProtocol var2, String var3) {
		this.this$0 = var1; // L: 98
		this.val$tlsClientProtocol = var2;
		this.val$host = var3;
	}

	public void setNeedClientAuth(boolean var1) {
	} // L: 282

	public OutputStream getOutputStream() throws IOException {
		return this.val$tlsClientProtocol.getOutputStream(); // L: 108
	}

	public void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
	} // L: 117

	public String[] getEnabledCipherSuites() {
		return null; // L: 126
	}

	public void removeHandshakeCompletedListener(HandshakeCompletedListener var1) {
	} // L: 270

	public boolean getNeedClientAuth() {
		return false; // L: 136
	}

	public SSLSession getSession() {
		return new class17(this); // L: 141
	}

	public String[] getSupportedProtocols() {
		return null; // L: 251
	}

	public String[] getSupportedCipherSuites() {
		return null; // L: 256
	}

	public boolean getUseClientMode() {
		return false; // L: 261
	}

	public void setEnableSessionCreation(boolean var1) {
	} // L: 273

	public void setEnabledCipherSuites(String[] var1) {
	} // L: 276

	public void setEnabledProtocols(String[] var1) {
	} // L: 279

	public void setUseClientMode(boolean var1) {
	} // L: 285

	public void setWantClientAuth(boolean var1) {
	} // L: 288

	public boolean getEnableSessionCreation() {
		return false; // L: 121
	}

	public void startHandshake() throws IOException {
		this.val$tlsClientProtocol.connect(new class13(this)); // L: 292
	} // L: 342

	public InputStream getInputStream() throws IOException {
		return this.val$tlsClientProtocol.getInputStream(); // L: 103
	}

	public String[] getEnabledProtocols() {
		return null; // L: 131
	}

	public synchronized void close() throws IOException {
		this.val$tlsClientProtocol.close(); // L: 113
	} // L: 114

	public boolean getWantClientAuth() {
		return false; // L: 266
	}

	@ObfuscatedName("ak")
	static final void method163(long var0) {
		ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var0; // L: 92
	} // L: 93
}
