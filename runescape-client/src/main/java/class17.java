import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("t")
class class17 implements SSLSession {
	@ObfuscatedName("q")
	@Export("formattedOperatingSystemName")
	public static String formattedOperatingSystemName;
	@ObfuscatedName("ar")
	static String field95;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lp;"
	)
	final class12 this$1;

	@ObfuscatedSignature(
		descriptor = "(Lp;)V"
	)
	class17(class12 var1) {
		this.this$1 = var1; // L: 134
	}

	public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
		return null; // L: 197
	}

	public byte[] getId() {
		throw new UnsupportedOperationException(); // L: 152
	}

	public Certificate[] getLocalCertificates() {
		throw new UnsupportedOperationException(); // L: 162
	}

	public void putValue(String var1, Object var2) {
		throw new UnsupportedOperationException(); // L: 232
	}

	public int getPacketBufferSize() {
		throw new UnsupportedOperationException(); // L: 172
	}

	public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
		return this.this$1.field67; // L: 182
	}

	public String getPeerHost() {
		throw new UnsupportedOperationException(); // L: 187
	}

	public int getPeerPort() {
		return 0; // L: 192
	}

	public String getProtocol() {
		throw new UnsupportedOperationException(); // L: 202
	}

	public SSLSessionContext getSessionContext() {
		throw new UnsupportedOperationException(); // L: 207
	}

	public Object getValue(String var1) {
		throw new UnsupportedOperationException(); // L: 212
	}

	public String[] getValueNames() {
		throw new UnsupportedOperationException(); // L: 217
	}

	public void invalidate() {
		throw new UnsupportedOperationException(); // L: 222
	}

	public boolean isValid() {
		throw new UnsupportedOperationException(); // L: 227
	}

	public void removeValue(String var1) {
		throw new UnsupportedOperationException(); // L: 237
	}

	public long getLastAccessedTime() {
		throw new UnsupportedOperationException(); // L: 157
	}

	public long getCreationTime() {
		throw new UnsupportedOperationException(); // L: 147
	}

	public String getCipherSuite() {
		throw new UnsupportedOperationException(); // L: 142
	}

	public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
		return null; // L: 177
	}

	public int getApplicationBufferSize() {
		return 0; // L: 137
	}

	public Principal getLocalPrincipal() {
		throw new UnsupportedOperationException(); // L: 167
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Llg;I)V",
		garbageValue = "2002142302"
	)
	public static void method228(AbstractArchive var0) {
		VarcInt.VarcInt_archive = var0; // L: 15
	} // L: 16
}
