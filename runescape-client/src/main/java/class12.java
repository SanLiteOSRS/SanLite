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

@ObfuscatedName("ap")
class class12 extends SSLSocket {
	@ObfuscatedName("ac")
	Certificate[] field63;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Laj;"
	)
	final class15 this$0;
	// $FF: synthetic field
	final TlsClientProtocol val$tlsClientProtocol;
	// $FF: synthetic field
	final String val$host;

	@ObfuscatedSignature(
		descriptor = "(Laj;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;Ljava/lang/String;)V"
	)
	class12(class15 var1, TlsClientProtocol var2, String var3) {
		this.this$0 = var1; // L: 91
		this.val$tlsClientProtocol = var2;
		this.val$host = var3;
	}

	public OutputStream getOutputStream() throws IOException {
		return this.val$tlsClientProtocol.getOutputStream();
	}

	public void removeHandshakeCompletedListener(HandshakeCompletedListener var1) {
	} // L: 263

	public void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
	} // L: 110

	public String[] getEnabledCipherSuites() {
		return null; // L: 119
	}

	public void setNeedClientAuth(boolean var1) {
	} // L: 275

	public synchronized void close() throws IOException {
		this.val$tlsClientProtocol.close();
	}

	public boolean getNeedClientAuth() {
		return false; // L: 129
	}

	public SSLSession getSession() {
		return new class17(this); // L: 134
	}

	public boolean getEnableSessionCreation() {
		return false;
	}

	public void startHandshake() throws IOException {
		this.val$tlsClientProtocol.connect(new class13(this)); // L: 285
	} // L: 335

	public void setEnabledProtocols(String[] var1) {
	} // L: 272

	public void setEnableSessionCreation(boolean var1) {
	} // L: 266

	public void setEnabledCipherSuites(String[] var1) {
	} // L: 269

	public boolean getUseClientMode() {
		return false; // L: 254
	}

	public void setWantClientAuth(boolean var1) {
	} // L: 281

	public boolean getWantClientAuth() {
		return false; // L: 259
	}

	public void setUseClientMode(boolean var1) {
	} // L: 278

	public String[] getEnabledProtocols() {
		return null; // L: 124
	}

	public String[] getSupportedCipherSuites() {
		return null; // L: 249
	}

	public String[] getSupportedProtocols() {
		return null; // L: 244
	}

	public InputStream getInputStream() throws IOException {
		return this.val$tlsClientProtocol.getInputStream();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([Lcv;II[I[II)V",
		garbageValue = "-1654835319"
	)
	@Export("sortWorlds")
	static void sortWorlds(World[] var0, int var1, int var2, int[] var3, int[] var4) {
		if (var1 < var2) { // L: 82
			int var5 = var1 - 1; // L: 83
			int var6 = var2 + 1; // L: 84
			int var7 = (var2 + var1) / 2; // L: 85
			World var8 = var0[var7]; // L: 86
			var0[var7] = var0[var1]; // L: 87
			var0[var1] = var8; // L: 88

			while (var5 < var6) { // L: 89
				boolean var9 = true; // L: 90

				int var10;
				int var11;
				int var12;
				do {
					--var6; // L: 92

					for (var10 = 0; var10 < 4; ++var10) { // L: 93
						if (var3[var10] == 2) { // L: 96
							var11 = var0[var6].index; // L: 97
							var12 = var8.index; // L: 98
						} else if (var3[var10] == 1) { // L: 100
							var11 = var0[var6].population; // L: 101
							var12 = var8.population; // L: 102
							if (var11 == -1 && var4[var10] == 1) { // L: 103
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) { // L: 104
								var12 = 2001;
							}
						} else if (var3[var10] == 3) { // L: 106
							var11 = var0[var6].isMembersOnly() ? 1 : 0; // L: 107
							var12 = var8.isMembersOnly() ? 1 : 0; // L: 108
						} else {
							var11 = var0[var6].id; // L: 111
							var12 = var8.id; // L: 112
						}

						if (var11 != var12) { // L: 114
							if ((var4[var10] != 1 || var11 <= var12) && (var4[var10] != 0 || var11 >= var12)) { // L: 117 118
								var9 = false; // L: 120
							}
							break;
						}

						if (var10 == 3) { // L: 115
							var9 = false;
						}
					}
				} while(var9);

				var9 = true; // L: 125

				do {
					++var5; // L: 127

					for (var10 = 0; var10 < 4; ++var10) { // L: 128
						if (var3[var10] == 2) { // L: 131
							var11 = var0[var5].index; // L: 132
							var12 = var8.index; // L: 133
						} else if (var3[var10] == 1) { // L: 135
							var11 = var0[var5].population; // L: 136
							var12 = var8.population; // L: 137
							if (var11 == -1 && var4[var10] == 1) { // L: 138
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) { // L: 139
								var12 = 2001;
							}
						} else if (var3[var10] == 3) { // L: 141
							var11 = var0[var5].isMembersOnly() ? 1 : 0; // L: 142
							var12 = var8.isMembersOnly() ? 1 : 0; // L: 143
						} else {
							var11 = var0[var5].id; // L: 146
							var12 = var8.id; // L: 147
						}

						if (var11 != var12) { // L: 149
							if ((var4[var10] != 1 || var11 >= var12) && (var4[var10] != 0 || var11 <= var12)) { // L: 152 153
								var9 = false; // L: 155
							}
							break;
						}

						if (var10 == 3) { // L: 150
							var9 = false;
						}
					}
				} while(var9);

				if (var5 < var6) { // L: 160
					World var13 = var0[var5]; // L: 161
					var0[var5] = var0[var6]; // L: 162
					var0[var6] = var13; // L: 163
				}
			}

			sortWorlds(var0, var1, var6, var3, var4); // L: 166
			sortWorlds(var0, var6 + 1, var2, var3, var4); // L: 167
		}

	} // L: 169

	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "(Lcf;III)V",
		garbageValue = "-1330448420"
	)
	static final void method162(MenuAction var0, int var1, int var2) {
		if (var0 != null) { // L: 9448
			class33.method477(var0.param0, var0.param1, var0.opcode, var0.identifier, var0.field920, var0.field913, var0.field914, var1, var2); // L: 9449
		}

	} // L: 9451
}
