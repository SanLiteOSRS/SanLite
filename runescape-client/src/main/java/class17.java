import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("au")
class class17 implements SSLSession {
	@ObfuscatedName("am")
	static int[][][] field88;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Las;"
	)
	final class12 this$1;

	@ObfuscatedSignature(
		descriptor = "(Las;)V"
	)
	class17(class12 var1) {
		this.this$1 = var1; // L: 134
	}

	public Object getValue(String var1) {
		throw new UnsupportedOperationException(); // L: 212
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

	public int getPacketBufferSize() {
		throw new UnsupportedOperationException(); // L: 172
	}

	public Principal getLocalPrincipal() {
		throw new UnsupportedOperationException(); // L: 167
	}

	public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
		return this.this$1.field61; // L: 182
	}

	public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
		return null; // L: 177
	}

	public int getPeerPort() {
		return 0; // L: 192
	}

	public SSLSessionContext getSessionContext() {
		throw new UnsupportedOperationException(); // L: 207
	}

	public String getProtocol() {
		throw new UnsupportedOperationException(); // L: 202
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

	public void removeValue(String var1) {
		throw new UnsupportedOperationException(); // L: 237
	}

	public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
		return null; // L: 197
	}

	public int getApplicationBufferSize() {
		return 0; // L: 137
	}

	public String getPeerHost() {
		throw new UnsupportedOperationException(); // L: 187
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-956668575"
	)
	@Export("getVarbit")
	public static int getVarbit(int var0) {
		VarbitComposition var2 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0); // L: 26
		VarbitComposition var1;
		if (var2 != null) { // L: 27
			var1 = var2; // L: 28
		} else {
			byte[] var3 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0); // L: 31
			var2 = new VarbitComposition(); // L: 32
			if (var3 != null) { // L: 33
				var2.decode(new Buffer(var3));
			}

			VarbitComposition.VarbitDefinition_cached.put(var2, (long)var0); // L: 34
			var1 = var2; // L: 35
		}

		int var7 = var1.baseVar; // L: 38
		int var4 = var1.startBit; // L: 39
		int var5 = var1.endBit; // L: 40
		int var6 = Varps.Varps_masks[var5 - var4]; // L: 41
		return Varps.Varps_main[var7] >> var4 & var6; // L: 42
	}

	@ObfuscatedName("mh")
	@ObfuscatedSignature(
		descriptor = "(Lde;ZB)V",
		garbageValue = "-59"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group; // L: 11805
		int var3 = (int)var0.key; // L: 11806
		var0.remove(); // L: 11807
		if (var1) { // L: 11808
			class289.method5486(var2);
		}

		class211.method4147(var2); // L: 11809
		Widget var4 = WorldMapSection1.getWidget(var3); // L: 11810
		if (var4 != null) { // L: 11811
			class69.invalidateWidget(var4);
		}

		if (Client.rootInterface != -1) { // L: 11812
			NPCComposition.runIntfCloseListeners(Client.rootInterface, 1);
		}

	} // L: 11813

	@ObfuscatedName("ng")
	@ObfuscatedSignature(
		descriptor = "(Lsy;II)V",
		garbageValue = "1277645659"
	)
	static void method255(Buffer var0, int var1) {
		byte[] var2 = var0.array; // L: 12169
		if (Client.randomDatData == null) { // L: 12171
			Client.randomDatData = new byte[24];
		}

		class380.writeRandomDat(var2, var1, Client.randomDatData, 0, 24); // L: 12172
		class70.method2049(var0, var1); // L: 12174
	} // L: 12175
}
