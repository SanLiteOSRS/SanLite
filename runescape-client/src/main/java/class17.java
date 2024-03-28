import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ay")
class class17 implements SSLSession {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("EnumDefinition_archive")
	static AbstractArchive EnumDefinition_archive;
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	static Archive field75;
	@ObfuscatedName("kj")
	@ObfuscatedGetter(
		intValue = 1993161155
	)
	@Export("cameraYaw")
	static int cameraYaw;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lai;"
	)
	final class12 this$1;

	@ObfuscatedSignature(
		descriptor = "(Lai;)V"
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

	public long getCreationTime() {
		throw new UnsupportedOperationException(); // L: 147
	}

	public byte[] getId() {
		throw new UnsupportedOperationException(); // L: 152
	}

	public Certificate[] getLocalCertificates() {
		throw new UnsupportedOperationException(); // L: 162
	}

	public Principal getLocalPrincipal() {
		throw new UnsupportedOperationException(); // L: 167
	}

	public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
		return null;
	}

	public int getPeerPort() {
		return 0;
	}

	public String getPeerHost() {
		throw new UnsupportedOperationException(); // L: 187
	}

	public String getProtocol() {
		throw new UnsupportedOperationException();
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

	public int getPacketBufferSize() {
		throw new UnsupportedOperationException(); // L: 172
	}

	public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
		return null; // L: 197
	}

	public void putValue(String var1, Object var2) {
		throw new UnsupportedOperationException(); // L: 232
	}

	public long getLastAccessedTime() {
		throw new UnsupportedOperationException(); // L: 157
	}

	public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
		return this.this$1.field57; // L: 182
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Loc;Loc;I)I",
		garbageValue = "-831676334"
	)
	static int method254(AbstractArchive var0, AbstractArchive var1) {
		int var2 = 0; // L: 177
		String[] var3 = Login.field961; // L: 179

		int var4;
		String var5;
		for (var4 = 0; var4 < var3.length; ++var4) { // L: 180
			var5 = var3[var4]; // L: 181
			if (var0.tryLoadFileByNames(var5, "")) { // L: 183
				++var2; // L: 184
			}
		}

		var3 = Login.field962; // L: 190

		for (var4 = 0; var4 < var3.length; ++var4) { // L: 191
			var5 = var3[var4]; // L: 192
			if (var1.tryLoadFileByNames(var5, "")) { // L: 194
				++var2; // L: 195
			}
		}

		var3 = Login.field963; // L: 201

		for (var4 = 0; var4 < var3.length; ++var4) { // L: 202
			var5 = var3[var4]; // L: 203
			if (var1.getGroupId(var5) != -1 && var1.tryLoadFileByNames(var5, "")) { // L: 205
				++var2; // L: 206
			}
		}

		return var2; // L: 211
	}
}
