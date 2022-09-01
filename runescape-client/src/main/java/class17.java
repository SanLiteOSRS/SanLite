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

@ObfuscatedName("y")
class class17 implements SSLSession {
	@ObfuscatedName("l")
	static int[][][] field92;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	@Export("worldSelectLeftSprite")
	static IndexedSprite worldSelectLeftSprite;
	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	static Archive field89;
	@ObfuscatedName("fx")
	@ObfuscatedGetter(
		intValue = -1132082091
	)
	static int field91;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lm;"
	)
	final class12 this$1;

	@ObfuscatedSignature(
		descriptor = "(Lm;)V"
	)
	class17(class12 var1) {
		this.this$1 = var1; // L: 141
	}

	public int getApplicationBufferSize() {
		return 0; // L: 144
	}

	public String getCipherSuite() {
		throw new UnsupportedOperationException(); // L: 149
	}

	public long getCreationTime() {
		throw new UnsupportedOperationException(); // L: 154
	}

	public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
		return this.this$1.field70; // L: 189
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

	public int getPeerPort() {
		return 0; // L: 199
	}

	public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
		return null; // L: 204
	}

	public Object getValue(String var1) {
		throw new UnsupportedOperationException(); // L: 219
	}

	public String[] getValueNames() {
		throw new UnsupportedOperationException(); // L: 224
	}

	public void invalidate() {
		throw new UnsupportedOperationException(); // L: 229
	}

	public String getPeerHost() {
		throw new UnsupportedOperationException(); // L: 194
	}

	public String getProtocol() {
		throw new UnsupportedOperationException(); // L: 209
	}

	public void removeValue(String var1) {
		throw new UnsupportedOperationException(); // L: 244
	}

	public Certificate[] getLocalCertificates() {
		throw new UnsupportedOperationException(); // L: 169
	}

	public void putValue(String var1, Object var2) {
		throw new UnsupportedOperationException(); // L: 239
	}

	public SSLSessionContext getSessionContext() {
		throw new UnsupportedOperationException(); // L: 214
	}

	public boolean isValid() {
		throw new UnsupportedOperationException(); // L: 234
	}

	public byte[] getId() {
		throw new UnsupportedOperationException(); // L: 159
	}

	public long getLastAccessedTime() {
		throw new UnsupportedOperationException(); // L: 164
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Lfv;",
		garbageValue = "2008817465"
	)
	@Export("KitDefinition_get")
	public static KitDefinition KitDefinition_get(int var0) {
		KitDefinition var1 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var0); // L: 33
		if (var1 != null) { // L: 34
			return var1;
		} else {
			byte[] var2 = KitDefinition.KitDefinition_archive.takeFile(3, var0); // L: 35
			var1 = new KitDefinition(); // L: 36
			if (var2 != null) { // L: 37
				var1.decode(new Buffer(var2));
			}

			KitDefinition.KitDefinition_cached.put(var1, (long)var0); // L: 38
			return var1; // L: 39
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "53"
	)
	@Export("hslToRgb")
	static final int hslToRgb(int var0, int var1, int var2) {
		if (var2 > 179) { // L: 1050
			var1 /= 2;
		}

		if (var2 > 192) { // L: 1051
			var1 /= 2;
		}

		if (var2 > 217) { // L: 1052
			var1 /= 2;
		}

		if (var2 > 243) { // L: 1053
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2; // L: 1054
		return var3; // L: 1055
	}
}
