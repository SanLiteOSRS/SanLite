import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ah")
class class17 implements SSLSession {
	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("archive15")
	static Archive archive15;
	@ObfuscatedName("gm")
	@Export("worldHost")
	static String worldHost;
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

	public Certificate[] getLocalCertificates() {
		throw new UnsupportedOperationException(); // L: 169
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

	public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
		return null; // L: 184
	}

	public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
		return this.this$1.field59; // L: 189
	}

	public String getPeerHost() {
		throw new UnsupportedOperationException(); // L: 194
	}

	public String getCipherSuite() {
		throw new UnsupportedOperationException(); // L: 149
	}

	public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
		return null; // L: 204
	}

	public void removeValue(String var1) {
		throw new UnsupportedOperationException(); // L: 244
	}

	public SSLSessionContext getSessionContext() {
		throw new UnsupportedOperationException(); // L: 214
	}

	public String[] getValueNames() {
		throw new UnsupportedOperationException(); // L: 224
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

	public int getPeerPort() {
		return 0; // L: 199
	}

	public long getLastAccessedTime() {
		throw new UnsupportedOperationException(); // L: 164
	}

	public Object getValue(String var1) {
		throw new UnsupportedOperationException(); // L: 219
	}

	public String getProtocol() {
		throw new UnsupportedOperationException(); // L: 209
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lnq;S)V",
		garbageValue = "17225"
	)
	public static void method244(AbstractArchive var0) {
		StructComposition.StructDefinition_archive = var0; // L: 19
	} // L: 20

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Lcc;",
		garbageValue = "1813917490"
	)
	@Export("worldListStart")
	static World worldListStart() {
		World.World_listCount = 0; // L: 247
		return class171.getNextWorldListWorld(); // L: 248
	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-1"
	)
	static final int method269() {
		if (class10.clientPreferences.method2434()) { // L: 5121
			return Clock.Client_plane;
		} else {
			int var0 = 3; // L: 5122
			if (MusicPatchNode.cameraPitch < 310) { // L: 5123
				int var1;
				int var2;
				if (Client.oculusOrbState == 1) { // L: 5126
					var1 = ModeWhere.oculusOrbFocalPointX >> 7; // L: 5127
					var2 = GrandExchangeEvents.oculusOrbFocalPointY >> 7; // L: 5128
				} else {
					var1 = Projectile.localPlayer.x >> 7; // L: 5131
					var2 = Projectile.localPlayer.y >> 7; // L: 5132
				}

				int var3 = class208.cameraX >> 7; // L: 5134
				int var4 = ByteArrayPool.cameraZ >> 7; // L: 5135
				if (var3 < 0 || var4 < 0 || var3 >= 104 || var4 >= 104) { // L: 5136
					return Clock.Client_plane;
				}

				if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) { // L: 5137
					return Clock.Client_plane;
				}

				if ((Tiles.Tiles_renderFlags[Clock.Client_plane][var3][var4] & 4) != 0) { // L: 5138
					var0 = Clock.Client_plane;
				}

				int var5;
				if (var1 > var3) { // L: 5140
					var5 = var1 - var3;
				} else {
					var5 = var3 - var1; // L: 5141
				}

				int var6;
				if (var2 > var4) { // L: 5143
					var6 = var2 - var4;
				} else {
					var6 = var4 - var2; // L: 5144
				}

				int var7;
				int var8;
				if (var5 > var6) { // L: 5145
					var7 = var6 * 65536 / var5; // L: 5146
					var8 = 32768; // L: 5147

					while (var3 != var1) { // L: 5148
						if (var3 < var1) { // L: 5149
							++var3;
						} else if (var3 > var1) { // L: 5150
							--var3;
						}

						if ((Tiles.Tiles_renderFlags[Clock.Client_plane][var3][var4] & 4) != 0) { // L: 5151
							var0 = Clock.Client_plane;
						}

						var8 += var7; // L: 5152
						if (var8 >= 65536) { // L: 5153
							var8 -= 65536; // L: 5154
							if (var4 < var2) { // L: 5155
								++var4;
							} else if (var4 > var2) { // L: 5156
								--var4;
							}

							if ((Tiles.Tiles_renderFlags[Clock.Client_plane][var3][var4] & 4) != 0) { // L: 5157
								var0 = Clock.Client_plane;
							}
						}
					}
				} else if (var6 > 0) { // L: 5161
					var7 = var5 * 65536 / var6; // L: 5162
					var8 = 32768; // L: 5163

					while (var4 != var2) { // L: 5164
						if (var4 < var2) { // L: 5165
							++var4;
						} else if (var4 > var2) { // L: 5166
							--var4;
						}

						if ((Tiles.Tiles_renderFlags[Clock.Client_plane][var3][var4] & 4) != 0) { // L: 5167
							var0 = Clock.Client_plane;
						}

						var8 += var7; // L: 5168
						if (var8 >= 65536) { // L: 5169
							var8 -= 65536; // L: 5170
							if (var3 < var1) { // L: 5171
								++var3;
							} else if (var3 > var1) { // L: 5172
								--var3;
							}

							if ((Tiles.Tiles_renderFlags[Clock.Client_plane][var3][var4] & 4) != 0) { // L: 5173
								var0 = Clock.Client_plane;
							}
						}
					}
				}
			}

			if (Projectile.localPlayer.x >= 0 && Projectile.localPlayer.y >= 0 && Projectile.localPlayer.x < 13312 && Projectile.localPlayer.y < 13312) { // L: 5178
				if ((Tiles.Tiles_renderFlags[Clock.Client_plane][Projectile.localPlayer.x >> 7][Projectile.localPlayer.y >> 7] & 4) != 0) { // L: 5179
					var0 = Clock.Client_plane;
				}

				return var0; // L: 5180
			} else {
				return Clock.Client_plane;
			}
		}
	}
}
