import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.cert.Certificate;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.TlsClientProtocol;

@ObfuscatedName("ah")
class class12 extends SSLSocket {
	@ObfuscatedName("aw")
	Certificate[] field67;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lau;"
	)
	final class15 this$0;
	// $FF: synthetic field
	final TlsClientProtocol val$tlsClientProtocol;
	// $FF: synthetic field
	final String val$host;

	@ObfuscatedSignature(
		descriptor = "(Lau;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;Ljava/lang/String;)V"
	)
	class12(class15 var1, TlsClientProtocol var2, String var3) {
		this.this$0 = var1; // L: 91
		this.val$tlsClientProtocol = var2;
		this.val$host = var3;
	}

	public InputStream getInputStream() throws IOException {
		return this.val$tlsClientProtocol.getInputStream(); // L: 96
	}

	public OutputStream getOutputStream() throws IOException {
		return this.val$tlsClientProtocol.getOutputStream(); // L: 101
	}

	public synchronized void close() throws IOException {
		this.val$tlsClientProtocol.close(); // L: 106
	} // L: 107

	public SSLSession getSession() {
		return new class17(this); // L: 134
	}

	public void setEnabledProtocols(String[] var1) {
	} // L: 272

	public boolean getNeedClientAuth() {
		return false; // L: 129
	}

	public String[] getSupportedCipherSuites() {
		return null; // L: 249
	}

	public boolean getUseClientMode() {
		return false; // L: 254
	}

	public boolean getWantClientAuth() {
		return false; // L: 259
	}

	public void setEnableSessionCreation(boolean var1) {
	} // L: 266

	public void setEnabledCipherSuites(String[] var1) {
	} // L: 269

	public boolean getEnableSessionCreation() {
		return false; // L: 114
	}

	public void setNeedClientAuth(boolean var1) {
	} // L: 275

	public void setUseClientMode(boolean var1) {
	} // L: 278

	public void setWantClientAuth(boolean var1) {
	} // L: 281

	public void startHandshake() throws IOException {
		this.val$tlsClientProtocol.connect(new class13(this)); // L: 285
	} // L: 335

	public String[] getEnabledCipherSuites() {
		return null; // L: 119
	}

	public void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
	} // L: 110

	public String[] getSupportedProtocols() {
		return null; // L: 244
	}

	public void removeHandshakeCompletedListener(HandshakeCompletedListener var1) {
	} // L: 263

	public String[] getEnabledProtocols() {
		return null; // L: 124
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "-1021477297"
	)
	static int method167(int var0, Script var1, boolean var2) {
		if (var0 == 6809) { // L: 5082
			int var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5083
			ObjectComposition var4 = class90.getObjectDefinition(var3); // L: 5084
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4 != null ? var4.name : ""; // L: 5085
			return 1; // L: 5086
		} else {
			return 2; // L: 5088
		}
	}

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1183286606"
	)
	static final void method172(int var0) {
		int[] var1 = Frames.field2621.pixels; // L: 6206
		int var2 = var1.length; // L: 6207

		int var3;
		for (var3 = 0; var3 < var2; ++var3) { // L: 6208
			var1[var3] = 0;
		}

		int var4;
		int var5;
		for (var3 = 1; var3 < 103; ++var3) { // L: 6209
			var4 = (103 - var3) * 2048 + 24628; // L: 6210

			for (var5 = 1; var5 < 103; ++var5) { // L: 6211
				if ((Tiles.Tiles_renderFlags[var0][var5][var3] & 24) == 0) { // L: 6212
					UserComparator5.scene.drawTileMinimap(var1, var4, 512, var0, var5, var3);
				}

				if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var5][var3] & 8) != 0) { // L: 6213
					UserComparator5.scene.drawTileMinimap(var1, var4, 512, var0 + 1, var5, var3);
				}

				var4 += 4; // L: 6214
			}
		}

		var3 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10); // L: 6217
		var4 = 238 + (int)(Math.random() * 20.0D) - 10 << 16; // L: 6218
		Frames.field2621.setRaster(); // L: 6219

		int var6;
		for (var5 = 1; var5 < 103; ++var5) { // L: 6220
			for (var6 = 1; var6 < 103; ++var6) { // L: 6221
				if ((Tiles.Tiles_renderFlags[var0][var6][var5] & 24) == 0) { // L: 6222
					MusicPatchNode2.drawObject(var0, var6, var5, var3, var4);
				}

				if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var6][var5] & 8) != 0) { // L: 6223
					MusicPatchNode2.drawObject(var0 + 1, var6, var5, var3, var4);
				}
			}
		}

		Client.field620 = 0; // L: 6226

		for (var5 = 0; var5 < 104; ++var5) { // L: 6227
			for (var6 = 0; var6 < 104; ++var6) { // L: 6228
				long var7 = UserComparator5.scene.getGroundObjectTag(class36.Client_plane, var5, var6); // L: 6229
				if (var7 != 0L) { // L: 6230
					int var9 = class458.Entity_unpackID(var7); // L: 6231
					int var10 = class90.getObjectDefinition(var9).mapIconId; // L: 6232
					if (var10 >= 0 && SequenceDefinition.WorldMapElement_get(var10).field1933) { // L: 6233 6234
						Client.field762[Client.field620] = SequenceDefinition.WorldMapElement_get(var10).getSpriteBool(false); // L: 6237
						Client.field760[Client.field620] = var5; // L: 6238
						Client.field576[Client.field620] = var6; // L: 6239
						++Client.field620; // L: 6240
					}
				}
			}
		}

		class156.rasterProvider.apply(); // L: 6245
	} // L: 6246
}
