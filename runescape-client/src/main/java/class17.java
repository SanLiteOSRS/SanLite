import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ak")
class class17 implements SSLSession {
	@ObfuscatedName("wy")
	@ObfuscatedGetter(
		longValue = -7716076035296640299L
	)
	static long field74;
	@ObfuscatedName("ij")
	static int[] field75;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lad;"
	)
	final class12 this$1;

	@ObfuscatedSignature(
		descriptor = "(Lad;)V"
	)
	class17(class12 var1) {
		this.this$1 = var1; // L: 141
	}

	public String getCipherSuite() {
		throw new UnsupportedOperationException(); // L: 149
	}

	public long getCreationTime() {
		throw new UnsupportedOperationException(); // L: 154
	}

	public byte[] getId() {
		throw new UnsupportedOperationException(); // L: 159
	}

	public void invalidate() {
		throw new UnsupportedOperationException(); // L: 229
	}

	public Principal getLocalPrincipal() {
		throw new UnsupportedOperationException(); // L: 174
	}

	public int getPacketBufferSize() {
		throw new UnsupportedOperationException(); // L: 179
	}

	public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
		return null; // L: 184
	}

	public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
		return this.this$1.field48; // L: 189
	}

	public String getPeerHost() {
		throw new UnsupportedOperationException(); // L: 194
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

	public long getLastAccessedTime() {
		throw new UnsupportedOperationException(); // L: 164
	}

	public String[] getValueNames() {
		throw new UnsupportedOperationException(); // L: 224
	}

	public boolean isValid() {
		throw new UnsupportedOperationException();
	}

	public void putValue(String var1, Object var2) {
		throw new UnsupportedOperationException(); // L: 239
	}

	public void removeValue(String var1) {
		throw new UnsupportedOperationException(); // L: 244
	}

	public Object getValue(String var1) {
		throw new UnsupportedOperationException(); // L: 219
	}

	public int getApplicationBufferSize() {
		return 0; // L: 144
	}

	public Certificate[] getLocalCertificates() {
		throw new UnsupportedOperationException(); // L: 169
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-834149665"
	)
	public static int method271(int var0) {
		if (var0 > 0) { // L: 234
			return 1;
		} else {
			return var0 < 0 ? -1 : 0; // L: 235 236
		}
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;",
		garbageValue = "1282914490"
	)
	static Object method268(int var0) {
		return ModeWhere.method7299((class518)GrandExchangeEvents.findEnumerated(class518.method9256(), var0)); // L: 5392
	}
}
