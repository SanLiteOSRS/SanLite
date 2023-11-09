import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("am")
class class17 implements SSLSession {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lal;"
	)
	final class12 this$1;

	@ObfuscatedSignature(
		descriptor = "(Lal;)V"
	)
	class17(class12 var1) {
		this.this$1 = var1; // L: 141
	}

	public void removeValue(String var1) {
		throw new UnsupportedOperationException(); // L: 244
	}

	public String getCipherSuite() {
		throw new UnsupportedOperationException(); // L: 149
	}

	public byte[] getId() {
		throw new UnsupportedOperationException(); // L: 159
	}

	public long getLastAccessedTime() {
		throw new UnsupportedOperationException(); // L: 164
	}

	public Certificate[] getLocalCertificates() {
		throw new UnsupportedOperationException(); // L: 169
	}

	public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
		return this.this$1.field63; // L: 189
	}

	public int getPacketBufferSize() {
		throw new UnsupportedOperationException(); // L: 179
	}

	public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
		return null; // L: 184
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

	public String[] getValueNames() {
		throw new UnsupportedOperationException(); // L: 224
	}

	public void invalidate() {
		throw new UnsupportedOperationException(); // L: 229
	}

	public void putValue(String var1, Object var2) {
		throw new UnsupportedOperationException(); // L: 239
	}

	public boolean isValid() {
		throw new UnsupportedOperationException(); // L: 234
	}

	public long getCreationTime() {
		throw new UnsupportedOperationException(); // L: 154
	}

	public Principal getLocalPrincipal() {
		throw new UnsupportedOperationException(); // L: 174
	}

	public Object getValue(String var1) {
		throw new UnsupportedOperationException(); // L: 219
	}

	public int getApplicationBufferSize() {
		return 0; // L: 144
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1226855140"
	)
	static final void method265(int var0, int var1, int var2, int var3) {
		for (int var4 = var1; var4 <= var3 + var1; ++var4) { // L: 76
			for (int var5 = var0; var5 <= var0 + var2; ++var5) { // L: 77
				if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) { // L: 78
					class217.field2409[0][var5][var4] = 127; // L: 79
					if (var0 == var5 && var5 > 0) { // L: 80
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 - 1][var4];
					}

					if (var0 + var2 == var5 && var5 < 103) { // L: 81
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 + 1][var4];
					}

					if (var4 == var1 && var4 > 0) { // L: 82
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 - 1];
					}

					if (var3 + var1 == var4 && var4 < 103) { // L: 83
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 + 1];
					}
				}
			}
		}

	} // L: 87

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1087980755"
	)
	static final void method262(int var0) {
		int[] var1 = AbstractUserComparator.sceneMinimapSprite.pixels; // L: 6113
		int var2 = var1.length; // L: 6114

		int var3;
		for (var3 = 0; var3 < var2; ++var3) { // L: 6115
			var1[var3] = 0;
		}

		int var4;
		int var5;
		for (var3 = 1; var3 < 103; ++var3) { // L: 6116
			var4 = (103 - var3) * 2048 + 24628; // L: 6117

			for (var5 = 1; var5 < 103; ++var5) { // L: 6118
				if ((Tiles.Tiles_renderFlags[var0][var5][var3] & 24) == 0) { // L: 6119
					class130.scene.drawTileMinimap(var1, var4, 512, var0, var5, var3);
				}

				if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var5][var3] & 8) != 0) { // L: 6120
					class130.scene.drawTileMinimap(var1, var4, 512, var0 + 1, var5, var3);
				}

				var4 += 4; // L: 6121
			}
		}

		var3 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10); // L: 6124
		var4 = 238 + (int)(Math.random() * 20.0D) - 10 << 16; // L: 6125
		AbstractUserComparator.sceneMinimapSprite.setRaster(); // L: 6126

		int var6;
		for (var5 = 1; var5 < 103; ++var5) { // L: 6127
			for (var6 = 1; var6 < 103; ++var6) { // L: 6128
				if ((Tiles.Tiles_renderFlags[var0][var6][var5] & 24) == 0) { // L: 6129
					class102.drawObject(var0, var6, var5, var3, var4);
				}

				if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var6][var5] & 8) != 0) { // L: 6130
					class102.drawObject(var0 + 1, var6, var5, var3, var4);
				}
			}
		}

		Client.mapIconCount = 0; // L: 6133

		for (var5 = 0; var5 < 104; ++var5) { // L: 6134
			for (var6 = 0; var6 < 104; ++var6) { // L: 6135
				long var7 = class130.scene.getGroundObjectTag(HealthBar.Client_plane, var5, var6); // L: 6136
				if (0L != var7) { // L: 6137
					int var9 = InvDefinition.Entity_unpackID(var7); // L: 6138
					int var10 = WorldMapElement.getObjectDefinition(var9).mapIconId; // L: 6139
					if (var10 >= 0 && class138.WorldMapElement_get(var10).field1950) { // L: 6140 6141
						Client.mapIcons[Client.mapIconCount] = class138.WorldMapElement_get(var10).getSpriteBool(false); // L: 6144
						Client.mapIconXs[Client.mapIconCount] = var5; // L: 6145
						Client.mapIconYs[Client.mapIconCount] = var6; // L: 6146
						++Client.mapIconCount; // L: 6147
					}
				}
			}
		}

		AttackOption.rasterProvider.apply(); // L: 6152
	} // L: 6153
}
