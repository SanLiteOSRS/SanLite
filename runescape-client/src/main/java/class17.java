import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ab")
class class17 implements SSLSession {
	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "[Lud;"
	)
	static SpritePixels[] field92;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lah;"
	)
	final class12 this$1;

	@ObfuscatedSignature(
		descriptor = "(Lah;)V"
	)
	class17(class12 var1) {
		this.this$1 = var1; // L: 134
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

	public long getLastAccessedTime() {
		throw new UnsupportedOperationException(); // L: 157
	}

	public Certificate[] getLocalCertificates() {
		throw new UnsupportedOperationException(); // L: 162
	}

	public Principal getLocalPrincipal() {
		throw new UnsupportedOperationException(); // L: 167
	}

	public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
		return null; // L: 177
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

	public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
		return null; // L: 197
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

	public void putValue(String var1, Object var2) {
		throw new UnsupportedOperationException(); // L: 232
	}

	public SSLSessionContext getSessionContext() {
		throw new UnsupportedOperationException(); // L: 207
	}

	public int getPacketBufferSize() {
		throw new UnsupportedOperationException(); // L: 172
	}

	public int getApplicationBufferSize() {
		return 0; // L: 137
	}

	public Object getValue(String var1) {
		throw new UnsupportedOperationException(); // L: 212
	}

	public void removeValue(String var1) {
		throw new UnsupportedOperationException(); // L: 237
	}

	public String getProtocol() {
		throw new UnsupportedOperationException(); // L: 202
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(BI)C",
		garbageValue = "-1891531706"
	)
	public static char method258(byte var0) {
		int var1 = var0 & 255; // L: 63
		if (var1 == 0) { // L: 64
			throw new IllegalArgumentException("" + Integer.toString(var1, 16));
		} else {
			if (var1 >= 128 && var1 < 160) { // L: 65
				char var2 = class385.cp1252AsciiExtension[var1 - 128]; // L: 66
				if (var2 == 0) { // L: 67
					var2 = '?';
				}

				var1 = var2; // L: 68
			}

			return (char)var1; // L: 70
		}
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(IIIS)V",
		garbageValue = "-16459"
	)
	@Export("queueSoundEffect")
	static void queueSoundEffect(int var0, int var1, int var2) {
		if (class150.clientPreferences.method2480() != 0 && var1 != 0 && Client.soundEffectCount < 50) { // L: 3844
			Client.soundEffectIds[Client.soundEffectCount] = var0; // L: 3845
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1; // L: 3846
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2; // L: 3847
			Client.soundEffects[Client.soundEffectCount] = null; // L: 3848
			Client.soundLocations[Client.soundEffectCount] = 0; // L: 3849
			++Client.soundEffectCount; // L: 3850
		}

	} // L: 3852

	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "(Lmt;III)V",
		garbageValue = "232159402"
	)
	@Export("alignWidgetPosition")
	static void alignWidgetPosition(Widget var0, int var1, int var2) {
		if (var0.xAlignment == 0) { // L: 11192
			var0.x = var0.rawX;
		} else if (var0.xAlignment == 1) { // L: 11193
			var0.x = var0.rawX + (var1 - var0.width) / 2;
		} else if (var0.xAlignment == 2) { // L: 11194
			var0.x = var1 - var0.width - var0.rawX;
		} else if (var0.xAlignment == 3) { // L: 11195
			var0.x = var0.rawX * var1 >> 14;
		} else if (var0.xAlignment == 4) { // L: 11196
			var0.x = (var0.rawX * var1 >> 14) + (var1 - var0.width) / 2;
		} else {
			var0.x = var1 - var0.width - (var0.rawX * var1 >> 14); // L: 11197
		}

		if (var0.yAlignment == 0) { // L: 11198
			var0.y = var0.rawY;
		} else if (var0.yAlignment == 1) { // L: 11199
			var0.y = (var2 - var0.height) / 2 + var0.rawY;
		} else if (var0.yAlignment == 2) { // L: 11200
			var0.y = var2 - var0.height - var0.rawY;
		} else if (var0.yAlignment == 3) {
			var0.y = var2 * var0.rawY >> 14; // L: 11201
		} else if (var0.yAlignment == 4) { // L: 11202
			var0.y = (var2 * var0.rawY >> 14) + (var2 - var0.height) / 2;
		} else {
			var0.y = var2 - var0.height - (var2 * var0.rawY >> 14); // L: 11203
		}

	} // L: 11204
}
