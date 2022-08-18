import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("y")
class class17 implements SSLSession {
	@ObfuscatedName("rj")
	@ObfuscatedSignature(
		descriptor = "Ley;"
	)
	@Export("guestClanChannel")
	static ClanChannel guestClanChannel;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lx;"
	)
	final class12 this$1;

	@ObfuscatedSignature(
		descriptor = "(Lx;)V"
	)
	class17(class12 var1) {
		this.this$1 = var1; // L: 141
	}

	public long getCreationTime() {
		throw new UnsupportedOperationException(); // L: 154
	}

	public int getApplicationBufferSize() {
		return 0; // L: 144
	}

	public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
		return null; // L: 204
	}

	public long getLastAccessedTime() {
		throw new UnsupportedOperationException(); // L: 164
	}

	public Certificate[] getLocalCertificates() {
		throw new UnsupportedOperationException(); // L: 169
	}

	public Principal getLocalPrincipal() {
		throw new UnsupportedOperationException(); // L: 174
	}

	public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
		return this.this$1.field64; // L: 189
	}

	public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
		return null; // L: 184
	}

	public String getCipherSuite() {
		throw new UnsupportedOperationException(); // L: 149
	}

	public String getPeerHost() {
		throw new UnsupportedOperationException(); // L: 194
	}

	public String getProtocol() {
		throw new UnsupportedOperationException(); // L: 209
	}

	public byte[] getId() {
		throw new UnsupportedOperationException(); // L: 159
	}

	public SSLSessionContext getSessionContext() {
		throw new UnsupportedOperationException(); // L: 214
	}

	public Object getValue(String var1) {
		throw new UnsupportedOperationException(); // L: 219
	}

	public String[] getValueNames() {
		throw new UnsupportedOperationException(); // L: 224
	}

	public boolean isValid() {
		throw new UnsupportedOperationException(); // L: 234
	}

	public void putValue(String var1, Object var2) {
		throw new UnsupportedOperationException(); // L: 239
	}

	public void removeValue(String var1) {
		throw new UnsupportedOperationException(); // L: 244
	}

	public int getPacketBufferSize() {
		throw new UnsupportedOperationException(); // L: 179
	}

	public void invalidate() {
		throw new UnsupportedOperationException(); // L: 229
	}

	public int getPeerPort() {
		return 0; // L: 199
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lci;I)V",
		garbageValue = "193482070"
	)
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		class228.runScript(var0, 500000, 475000);
	} // L: 117

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "-462685190"
	)
	@Export("ByteArrayPool_getArray")
	public static synchronized byte[] ByteArrayPool_getArray(int var0) {
		return ByteArrayPool.ByteArrayPool_getArrayBool(var0, false); // L: 116
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-314282579"
	)
	static void method262() {
		Messages.Messages_channels.clear(); // L: 50
		Messages.Messages_hashTable.clear(); // L: 51
		Messages.Messages_queue.clear(); // L: 52
		Messages.Messages_count = 0; // L: 53
	} // L: 54

	@ObfuscatedName("w")
	public static int method263(long var0) {
		return (int)(var0 >>> 7 & 127L); // L: 77
	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(Lku;IIIIIII)V",
		garbageValue = "-1374373276"
	)
	static final void method261(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field562) { // L: 10580
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0; // L: 10581
		}

		Client.field562 = false; // L: 10582
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !ObjectSound.mouseCam && MouseHandler.MouseHandler_currentButton == 4) { // L: 10583
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) { // L: 10584
				var0.scrollY -= 4; // L: 10585
				class220.invalidateWidget(var0); // L: 10586
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) { // L: 10588
				var0.scrollY += 4; // L: 10589
				class220.invalidateWidget(var0); // L: 10590
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) { // L: 10592
				var7 = var3 * (var3 - 32) / var4; // L: 10593
				if (var7 < 8) { // L: 10594
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2; // L: 10595
				int var9 = var3 - 32 - var7; // L: 10596
				var0.scrollY = var8 * (var4 - var3) / var9; // L: 10597
				class220.invalidateWidget(var0); // L: 10598
				Client.field562 = true; // L: 10599
			}
		}

		if (Client.mouseWheelRotation != 0) { // L: 10602
			var7 = var0.width; // L: 10603
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) { // L: 10604
				var0.scrollY += Client.mouseWheelRotation * 45; // L: 10605
				class220.invalidateWidget(var0); // L: 10606
			}
		}

	} // L: 10609
}
