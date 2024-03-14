import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("am")
class class17 implements SSLSession {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	public static AbstractArchive field81;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Laj;"
	)
	final class12 this$1;

	@ObfuscatedSignature(
		descriptor = "(Laj;)V"
	)
	class17(class12 var1) {
		this.this$1 = var1; // L: 141
	}

	public void removeValue(String var1) {
		throw new UnsupportedOperationException(); // L: 244
	}

	public int getApplicationBufferSize() {
		return 0; // L: 144
	}

	public long getCreationTime() {
		throw new UnsupportedOperationException(); // L: 154
	}

	public byte[] getId() {
		throw new UnsupportedOperationException(); // L: 159
	}

	public Principal getLocalPrincipal() {
		throw new UnsupportedOperationException(); // L: 174
	}

	public int getPacketBufferSize() {
		throw new UnsupportedOperationException(); // L: 179
	}

	public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
		return this.this$1.field55; // L: 189
	}

	public int getPeerPort() {
		return 0; // L: 199
	}

	public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
		return null; // L: 204
	}

	public String getProtocol() {
		throw new UnsupportedOperationException(); // L: 209
	}

	public SSLSessionContext getSessionContext() {
		throw new UnsupportedOperationException(); // L: 214
	}

	public void invalidate() {
		throw new UnsupportedOperationException(); // L: 229
	}

	public boolean isValid() {
		throw new UnsupportedOperationException(); // L: 234
	}

	public void putValue(String var1, Object var2) {
		throw new UnsupportedOperationException(); // L: 239
	}

	public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
		return null; // L: 184
	}

	public Certificate[] getLocalCertificates() {
		throw new UnsupportedOperationException(); // L: 169
	}

	public long getLastAccessedTime() {
		throw new UnsupportedOperationException(); // L: 164
	}

	public String getPeerHost() {
		throw new UnsupportedOperationException(); // L: 194
	}

	public Object getValue(String var1) {
		throw new UnsupportedOperationException(); // L: 219
	}

	public String[] getValueNames() {
		throw new UnsupportedOperationException(); // L: 224
	}

	public String getCipherSuite() {
		throw new UnsupportedOperationException(); // L: 149
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "-1909408545"
	)
	static final int method210(int var0, int var1, int var2, int var3) {
		return var3 * var0 + var2 * var1 >> 16; // L: 13
	}
}
