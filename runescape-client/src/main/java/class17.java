import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ao")
class class17 implements SSLSession {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lae;"
	)
	final class12 this$1;

	@ObfuscatedSignature(
		descriptor = "(Lae;)V"
	)
	class17(class12 var1) {
		this.this$1 = var1; // L: 134
	}

	public int getApplicationBufferSize() {
		return 0; // L: 137
	}

	public String getCipherSuite() {
		throw new UnsupportedOperationException(); // L: 142
	}

	public long getLastAccessedTime() {
		throw new UnsupportedOperationException(); // L: 157
	}

	public Certificate[] getLocalCertificates() {
		throw new UnsupportedOperationException(); // L: 162
	}

	public void invalidate() {
		throw new UnsupportedOperationException(); // L: 222
	}

	public int getPacketBufferSize() {
		throw new UnsupportedOperationException(); // L: 172
	}

	public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
		return null; // L: 177
	}

	public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
		return this.this$1.field50; // L: 182
	}

	public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
		return null; // L: 197
	}

	public String getProtocol() {
		throw new UnsupportedOperationException(); // L: 202
	}

	public String[] getValueNames() {
		throw new UnsupportedOperationException(); // L: 217
	}

	public Object getValue(String var1) {
		throw new UnsupportedOperationException(); // L: 212
	}

	public boolean isValid() {
		throw new UnsupportedOperationException(); // L: 227
	}

	public Principal getLocalPrincipal() {
		throw new UnsupportedOperationException(); // L: 167
	}

	public void removeValue(String var1) {
		throw new UnsupportedOperationException(); // L: 237
	}

	public int getPeerPort() {
		return 0; // L: 192
	}

	public long getCreationTime() {
		throw new UnsupportedOperationException(); // L: 147
	}

	public void putValue(String var1, Object var2) {
		throw new UnsupportedOperationException(); // L: 232
	}

	public byte[] getId() {
		throw new UnsupportedOperationException(); // L: 152
	}

	public SSLSessionContext getSessionContext() {
		throw new UnsupportedOperationException(); // L: 207
	}

	public String getPeerHost() {
		throw new UnsupportedOperationException(); // L: 187
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(CLor;I)I",
		garbageValue = "-663816816"
	)
	@Export("lowercaseChar")
	static int lowercaseChar(char var0, Language var1) {
		int var2 = var0 << 4; // L: 104
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) { // L: 105
			var0 = Character.toLowerCase(var0); // L: 106
			var2 = (var0 << 4) + 1; // L: 107
		}

		if (var0 == 241 && var1 == Language.Language_ES) { // L: 109
			var2 = 1762;
		}

		return var2; // L: 110
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Lmo;III)V",
		garbageValue = "-335969905"
	)
	public static void method250(Widget var0, int var1, int var2) {
		var0.field3666.bodyColors[var1] = var2; // L: 1035
		var0.field3666.method6140(); // L: 1036
	} // L: 1037

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-29"
	)
	static final void method249() {
		for (PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 8286 8287 8293
			if (var0.hitpoints == -1) { // L: 8288
				var0.delay = 0; // L: 8289
				class6.method46(var0); // L: 8290
			} else {
				var0.remove(); // L: 8292
			}
		}

	} // L: 8295
}
