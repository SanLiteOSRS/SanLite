import java.awt.datatransfer.Clipboard;
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

@ObfuscatedName("b")
class class12 extends SSLSocket {
	@ObfuscatedName("vg")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	@Export("masterDisk")
	static ArchiveDisk masterDisk;
	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("archive12")
	static Archive archive12;
	@ObfuscatedName("f")
	Certificate[] field68;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lh;"
	)
	final class15 this$0;
	// $FF: synthetic field
	final TlsClientProtocol val$tlsClientProtocol;
	// $FF: synthetic field
	final String val$host;

	@ObfuscatedSignature(
		descriptor = "(Lh;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;Ljava/lang/String;)V"
	)
	class12(class15 var1, TlsClientProtocol var2, String var3) {
		this.this$0 = var1; // L: 98
		this.val$tlsClientProtocol = var2;
		this.val$host = var3;
	}

	public InputStream getInputStream() throws IOException {
		return this.val$tlsClientProtocol.getInputStream();
	}

	public synchronized void close() throws IOException {
		this.val$tlsClientProtocol.close(); // L: 113
	} // L: 114

	public OutputStream getOutputStream() throws IOException {
		return this.val$tlsClientProtocol.getOutputStream();
	}

	public String[] getEnabledCipherSuites() {
		return null; // L: 126
	}

	public String[] getEnabledProtocols() {
		return null; // L: 131
	}

	public boolean getNeedClientAuth() {
		return false; // L: 136
	}

	public void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
	}

	public String[] getSupportedProtocols() {
		return null; // L: 251
	}

	public boolean getEnableSessionCreation() {
		return false; // L: 121
	}

	public boolean getWantClientAuth() {
		return false; // L: 266
	}

	public void removeHandshakeCompletedListener(HandshakeCompletedListener var1) {
	} // L: 270

	public void setEnableSessionCreation(boolean var1) {
	} // L: 273

	public void setEnabledCipherSuites(String[] var1) {
	} // L: 276

	public void setEnabledProtocols(String[] var1) {
	} // L: 279

	public void setNeedClientAuth(boolean var1) {
	} // L: 282

	public void setUseClientMode(boolean var1) {
	} // L: 285

	public void startHandshake() throws IOException {
		this.val$tlsClientProtocol.connect(new class13(this)); // L: 292
	} // L: 342

	public String[] getSupportedCipherSuites() {
		return null; // L: 256
	}

	public boolean getUseClientMode() {
		return false; // L: 261
	}

	public void setWantClientAuth(boolean var1) {
	} // L: 288

	public SSLSession getSession() {
		return new class17(this); // L: 141
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "89"
	)
	static void method172(int var0, int var1, int var2, int var3) {
		for (ObjectSound var4 = (ObjectSound)ObjectSound.objectSounds.last(); var4 != null; var4 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 67
			if (var4.soundEffectId != -1 || var4.soundEffectIds != null) { // L: 68
				int var5 = 0; // L: 69
				if (var1 > var4.maxX * 128) { // L: 70
					var5 += var1 - var4.maxX * 128;
				} else if (var1 < var4.x * 128) { // L: 71
					var5 += var4.x * 128 - var1;
				}

				if (var2 > var4.maxY * 16384) { // L: 72
					var5 += var2 - var4.maxY * 16384;
				} else if (var2 < var4.y * 16384) { // L: 73
					var5 += var4.y * 16384 - var2;
				}

				if (var5 - 64 <= var4.field837 && PacketWriter.clientPreferences.method2499() != 0 && var0 == var4.plane) { // L: 74
					var5 -= 64; // L: 85
					if (var5 < 0) { // L: 86
						var5 = 0;
					}

					int var6 = (var4.field837 - var5) * PacketWriter.clientPreferences.method2499() / var4.field837; // L: 87
					if (var4.stream1 == null) { // L: 88
						if (var4.soundEffectId >= 0) { // L: 89
							SoundEffect var7 = SoundEffect.readSoundEffect(DynamicObject.archive9, var4.soundEffectId, 0); // L: 90
							if (var7 != null) { // L: 91
								RawSound var8 = var7.toRawSound().resample(class257.decimator); // L: 92
								RawPcmStream var9 = RawPcmStream.createRawPcmStream(var8, 100, var6); // L: 93
								var9.setNumLoops(-1); // L: 94
								class209.pcmStreamMixer.addSubStream(var9); // L: 95
								var4.stream1 = var9; // L: 96
							}
						}
					} else {
						var4.stream1.method885(var6); // L: 100
					}

					if (var4.stream2 == null) { // L: 101
						if (var4.soundEffectIds != null && (var4.field843 -= var3) <= 0) { // L: 102
							int var11 = (int)(Math.random() * (double)var4.soundEffectIds.length); // L: 103
							SoundEffect var12 = SoundEffect.readSoundEffect(DynamicObject.archive9, var4.soundEffectIds[var11], 0); // L: 104
							if (var12 != null) { // L: 105
								RawSound var13 = var12.toRawSound().resample(class257.decimator); // L: 106
								RawPcmStream var10 = RawPcmStream.createRawPcmStream(var13, 100, var6); // L: 107
								var10.setNumLoops(0); // L: 108
								class209.pcmStreamMixer.addSubStream(var10); // L: 109
								var4.stream2 = var10; // L: 110
								var4.field843 = var4.field845 + (int)(Math.random() * (double)(var4.field841 - var4.field845)); // L: 111
							}
						}
					} else {
						var4.stream2.method885(var6); // L: 116
						if (!var4.stream2.hasNext()) { // L: 117
							var4.stream2 = null; // L: 118
						}
					}
				} else {
					if (var4.stream1 != null) { // L: 75
						class209.pcmStreamMixer.removeSubStream(var4.stream1); // L: 76
						var4.stream1 = null; // L: 77
					}

					if (var4.stream2 != null) { // L: 79
						class209.pcmStreamMixer.removeSubStream(var4.stream2); // L: 80
						var4.stream2 = null; // L: 81
					}
				}
			}
		}

	} // L: 122

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1608124150"
	)
	static void method169() {
		Client.packetWriter.clearBuffer(); // L: 2979
		Client.packetWriter.packetBuffer.offset = 0; // L: 2980
		Client.packetWriter.serverPacket = null; // L: 2981
		Client.packetWriter.field1405 = null; // L: 2982
		Client.packetWriter.field1401 = null; // L: 2983
		Client.packetWriter.field1402 = null; // L: 2984
		Client.packetWriter.serverPacketLength = 0; // L: 2985
		Client.packetWriter.field1398 = 0; // L: 2986
		Client.rebootTimer = 0; // L: 2987
		ScriptFrame.method1156(); // L: 2988
		Client.minimapState = 0; // L: 2989
		Client.destinationX = 0; // L: 2990

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) { // L: 2991
			Client.players[var0] = null;
		}

		class387.localPlayer = null; // L: 2992

		for (var0 = 0; var0 < Client.npcs.length; ++var0) { // L: 2993
			NPC var1 = Client.npcs[var0]; // L: 2994
			if (var1 != null) { // L: 2995
				var1.targetIndex = -1; // L: 2996
				var1.false0 = false; // L: 2997
			}
		}

		class320.method6429(); // L: 3000
		class246.method5251(30); // L: 3001

		for (var0 = 0; var0 < 100; ++var0) { // L: 3002
			Client.field725[var0] = true;
		}

		PacketBufferNode var2 = Renderable.getPacketBufferNode(ClientPacket.field3126, Client.packetWriter.isaacCipher); // L: 3005
		var2.packetBuffer.writeByte(Message.getWindowedMode()); // L: 3006
		var2.packetBuffer.writeShort(GameEngine.canvasWidth); // L: 3007
		var2.packetBuffer.writeShort(class127.canvasHeight); // L: 3008
		Client.packetWriter.addNode(var2); // L: 3009
	} // L: 3011

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(I)Lmo;",
		garbageValue = "1067755495"
	)
	public static NodeDeque method171() {
		return Client.scriptEvents; // L: 5158
	}

	@ObfuscatedName("my")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/awt/datatransfer/Clipboard;",
		garbageValue = "17"
	)
	public static Clipboard method170() {
		return Decimator.client.method502(); // L: 13409
	}
}
